package com.whatsapp.voipcalling.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass49P;
import X.AnonymousClass4FS;
import X.AnonymousClass646;
import X.AnonymousClass6CA;
import X.AnonymousClass75J;
import X.AnonymousClass7PU;
import X.AnonymousClass7UJ;
import X.AnonymousClass7YA;
import X.AnonymousClass8KG;
import X.AnonymousClass8KH;
import X.C106005Xg;
import X.C106155Xv;
import X.C107385bE;
import X.C117665sI;
import X.C1223063w;
import X.C138516qV;
import X.C147507Eo;
import X.C149957Oo;
import X.C158497k4;
import X.C160297nO;
import X.C162457s7;
import X.C179838jn;
import X.C179848jo;
import X.C179858jp;
import X.C179868jq;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C185758uC;
import X.C187958y5;
import X.C54292oU;
import X.C620633i;
import X.C626936e;
import X.C97174xk;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class VoipCameraManager {
    public final AnonymousClass1VX abProps;
    public Integer cachedCameraCount = null;
    public final C185758uC cameraEventsListener = new AnonymousClass8KH(this);
    public final AnonymousClass7UJ cameraProcessorFactory;
    public C179838jn captureDeviceFactory;
    public C179848jo captureDeviceRefreshListener = null;
    public Integer currentApiVersion;
    public volatile VoipPhysicalCamera currentCamera;
    public Integer hammerHeadIdx;
    public final AtomicBoolean hasBeenQueriedByDriver = C18280x3.A0l();
    public volatile Point lastAdjustedCameraPreviewSize;
    public C1223063w mediaProjectionProvider;
    public C179868jq onCameraClosedListener = null;
    public final SparseArray rawCameraInfoCache = AnonymousClass6CA.A0I();
    public final AnonymousClass7PU screenShareDisplayManager;
    public Integer screenShareIdx;
    public final C187958y5 systemFeatures;
    public final C620633i systemServices;
    public final C106155Xv voipSharedPreferences;
    public final C54292oU waContext;
    public final AnonymousClass4FS waWorkers;

    /* access modifiers changed from: private */
    public synchronized void closeCurrentCamera(VoipPhysicalCamera voipPhysicalCamera) {
        VoipPhysicalCamera voipPhysicalCamera2 = this.currentCamera;
        boolean z = false;
        C626936e.A0D(AnonymousClass000.A1Y(voipPhysicalCamera2, voipPhysicalCamera), "attempted to close orphaned camera");
        if (voipPhysicalCamera2 != null) {
            C179868jq r4 = this.onCameraClosedListener;
            if (r4 != null) {
                C149957Oo lastCachedFrame = voipPhysicalCamera2.getLastCachedFrame();
                if (voipPhysicalCamera2.cameraProcessor != null && voipPhysicalCamera2.cameraProcessorEnabled) {
                    z = true;
                }
                AnonymousClass8KG r42 = (AnonymousClass8KG) r4;
                if (lastCachedFrame != null) {
                    r42.A00.A02.post(new C117665sI(r42, C97174xk.A01(lastCachedFrame), 8, z));
                }
            }
            if (voipPhysicalCamera2 != voipPhysicalCamera) {
                voipPhysicalCamera2.removeCameraEventsListener(this.cameraEventsListener);
                voipPhysicalCamera2.close(true);
            }
        }
        voipPhysicalCamera.removeCameraEventsListener(this.cameraEventsListener);
        unregisterDisplayListener();
        this.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
        this.currentCamera = null;
    }

    private synchronized int getCameraCountInternal() {
        int i;
        int currentApiVersion2 = getCurrentApiVersion();
        i = 0;
        if (currentApiVersion2 != 0) {
            if (currentApiVersion2 == 1) {
                i = Camera.getNumberOfCameras();
            } else if (currentApiVersion2 == 2) {
                CameraManager A0E = this.systemServices.A0E();
                if (A0E == null) {
                    Log.w("voip/VoipCameraManager/getCameraCount, unable to acquire camera manager");
                } else {
                    try {
                        i = A0E.getCameraIdList().length;
                    } catch (Exception unused) {
                        Log.w("voip/VoipCameraManager/getCameraCount, unable to connect to cameras!");
                    }
                }
            }
            if (this.systemFeatures.BIC()) {
                this.screenShareIdx = Integer.valueOf(i);
                i++;
            } else {
                this.screenShareIdx = null;
            }
            this.hammerHeadIdx = null;
        }
        return i;
    }

    private int getCameraInfoCacheKey(int i, int i2) {
        int i3 = i + i2;
        return ((i3 * (i3 + 1)) / 2) + i2;
    }

    public synchronized int getCameraCount(boolean z) {
        Integer num;
        num = this.cachedCameraCount;
        if (num == null || z) {
            num = Integer.valueOf(getCameraCountInternal());
            this.cachedCameraCount = num;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.pjsip.PjCameraInfo getCameraInfo(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r5 < 0) goto L_0x0058
            r2 = 0
            int r0 = r4.getCameraCount(r2)     // Catch:{ all -> 0x0063 }
            if (r5 >= r0) goto L_0x0058
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.hasBeenQueriedByDriver     // Catch:{ all -> 0x0063 }
            r0 = 1
            r1.compareAndSet(r2, r0)     // Catch:{ all -> 0x0063 }
            boolean r0 = r4.isScreenShareDevice(r5)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x002c
            X.1VX r1 = r4.abProps     // Catch:{ all -> 0x0063 }
            r0 = 4773(0x12a5, float:6.688E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0027
            X.7PU r0 = r4.screenShareDisplayManager     // Catch:{ all -> 0x0063 }
            int r0 = r0.A00     // Catch:{ all -> 0x0063 }
            int r2 = r0 * 90
        L_0x0027:
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createScreenSharingInfo(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0036
        L_0x002c:
            boolean r0 = r4.isHammerheadDevice(r5)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0038
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createHammerheadCameraInfo()     // Catch:{ all -> 0x0063 }
        L_0x0036:
            monitor-exit(r4)
            return r0
        L_0x0038:
            X.7nO r2 = r4.getRawCameraInfo(r5)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0061
            X.1VX r1 = r4.abProps     // Catch:{ all -> 0x0063 }
            X.5Xv r0 = r4.voipSharedPreferences     // Catch:{ all -> 0x0063 }
            org.pjsip.PjCameraInfo r3 = org.pjsip.PjCameraInfo.createFromRawInfo(r2, r1, r0)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo camera "
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            r1.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = " info: "
            X.C18260x0.A1R(r1, r0, r3)     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo bad idx: "
            X.C18260x0.A0x(r0, r1, r5)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return r3
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.getCameraInfo(int):org.pjsip.PjCameraInfo");
    }

    public synchronized int getCurrentApiVersion() {
        Integer num;
        if (this.currentApiVersion == null) {
            this.currentApiVersion = AnonymousClass001.A0f();
            String A04 = this.voipSharedPreferences.A04();
            if (!TextUtils.isEmpty(A04) && C138516qV.A01(A04, getCachedCam2HardwareLevel())) {
                this.currentApiVersion = C18280x3.A0S();
            }
        }
        num = this.currentApiVersion;
        C626936e.A06(num);
        return num.intValue();
    }

    public synchronized void setCaptureDeviceFactory(C179838jn r2) {
        this.captureDeviceFactory = r2;
    }

    public synchronized void setCaptureDeviceRefreshListener(C179848jo r2) {
        this.captureDeviceRefreshListener = r2;
    }

    public synchronized void setCurrentApiVersion(int i) {
        this.currentApiVersion = Integer.valueOf(i);
    }

    public synchronized void setMediaProjectionProvider(C1223063w r2) {
        this.mediaProjectionProvider = r2;
    }

    /* access modifiers changed from: private */
    public void clearStoredRawCameraInfo(int i, int i2) {
        String A0Y;
        SharedPreferences.Editor edit = this.voipSharedPreferences.A03().edit();
        if (i2 == 1) {
            A0Y = C18260x0.A05("voip_camera_info_", i);
        } else {
            A0Y = AnonymousClass000.A0Y("_api_", C18270x1.A0W(i, "voip_camera_info_"), i2);
        }
        edit.remove(A0Y).apply();
    }

    private boolean isRawCameraInfoValid(int i, C160297nO r7) {
        int i2;
        boolean z;
        int i3 = r7.A00;
        if (i3 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.orientation != r7.A01) {
                    return false;
                }
                i2 = cameraInfo.facing;
                z = r7.A05;
            } catch (RuntimeException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else if (i3 != 2) {
            return false;
        } else {
            try {
                CameraManager A0E = this.systemServices.A0E();
                if (A0E == null) {
                    return false;
                }
                CameraCharacteristics cameraCharacteristics = A0E.getCameraCharacteristics(Integer.toString(i));
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num2 == null) {
                    Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                    return false;
                } else if (r7.A01 != num.intValue()) {
                    return false;
                } else {
                    i2 = r7.A05;
                    z = AnonymousClass000.A1T(num2.intValue());
                }
            } catch (Exception e2) {
                Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e2);
                return false;
            }
        }
        if (i2 == z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$registerDisplayListener$0() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            if (this.captureDeviceRefreshListener != null && !this.abProps.A0X(4773)) {
                Voip.refreshCaptureDevice();
            }
            voipPhysicalCamera.onScreenShareInfoChanged(C158497k4.A03.A00(this.waContext.A00, this.systemServices.A0O()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        if (r6 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0100, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r6 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C160297nO loadFromCameraService(int r24) {
        /*
            r23 = this;
            r1 = r23
            int r2 = r1.getCurrentApiVersion()
            if (r2 == 0) goto L_0x0120
            r11 = 1
            r4 = r24
            if (r2 == r11) goto L_0x0017
            r0 = 2
            if (r2 != r0) goto L_0x0115
            X.33i r0 = r1.systemServices
            X.7nO r15 = X.C160297nO.A00(r0, r4)
        L_0x0016:
            return r15
        L_0x0017:
            r15 = 0
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            r3.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera.getCameraInfo(r4, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera r6 = android.hardware.Camera.open(r4)     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera$Parameters r5 = r6.getParameters()     // Catch:{ Exception -> 0x00f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "voip/RawCameraInfo camera "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = " params, supported preview formats: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-format-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}, preview format values: "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.List r0 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-size-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}, preferred preview size: "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = ", supported fps ranges: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}"
            X.C18260x0.A1L(r1, r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.List r1 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x00f7 }
            if (r1 != 0) goto L_0x0089
            java.lang.String r0 = "voip/RawCameraInfo getSupportedPreviewFormats return null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0104
        L_0x0089:
            int r0 = r1.size()     // Catch:{ Exception -> 0x00f7 }
            int[] r10 = new int[r0]     // Catch:{ Exception -> 0x00f7 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x00f7 }
            r2 = 0
        L_0x0094:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x00f7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00f7 }
            int r1 = r2 + 1
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00f7 }
            r10[r2] = r0     // Catch:{ Exception -> 0x00f7 }
            r2 = r1
            goto L_0x0094
        L_0x00aa:
            java.util.List r0 = r5.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d5
            java.util.ArrayList r9 = X.AnonymousClass000.A0p(r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x00f7 }
        L_0x00b8:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x00f7 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d3
            int r2 = r0.width     // Catch:{ Exception -> 0x00f7 }
            int r1 = r0.height     // Catch:{ Exception -> 0x00f7 }
            X.7YA r0 = new X.7YA     // Catch:{ Exception -> 0x00f7 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00f7 }
        L_0x00cf:
            r9.add(r0)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00b8
        L_0x00d3:
            r0 = r15
            goto L_0x00cf
        L_0x00d5:
            r9 = r15
        L_0x00d6:
            android.hardware.Camera$Size r0 = r5.getPreferredPreviewSizeForVideo()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00e8
            int r1 = r0.width     // Catch:{ Exception -> 0x00f7 }
            int r0 = r0.height     // Catch:{ Exception -> 0x00f7 }
            X.7YA r8 = new X.7YA     // Catch:{ Exception -> 0x00f7 }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x00f7 }
        L_0x00e5:
            int r0 = r3.facing     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00ea
        L_0x00e8:
            r8 = r15
            goto L_0x00e5
        L_0x00ea:
            boolean r13 = X.AnonymousClass6C9.A1M(r0)
            int r12 = r3.orientation     // Catch:{ Exception -> 0x00f7 }
            r14 = 0
            X.7nO r7 = new X.7nO     // Catch:{ Exception -> 0x00f7 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0108
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f9:
            r0 = move-exception
            r6 = r15
        L_0x00fb:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x010e }
            if (r6 == 0) goto L_0x0016
            r6.release()
            return r15
        L_0x0104:
            r6.release()
            return r15
        L_0x0108:
            r6.release()
            return r7
        L_0x010c:
            r0 = move-exception
            throw r0
        L_0x010e:
            r0 = move-exception
            if (r6 == 0) goto L_0x011f
            r6.release()
            throw r0
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unsupported camera api version "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r2)
        L_0x011f:
            throw r0
        L_0x0120:
            r19 = 0
            r21 = 1
            int[] r18 = X.C86664Kz.A1Z()
            r18 = {480, 640} // fill-array
            r16 = 0
            X.7nO r15 = new X.7nO
            r22 = r19
            r17 = r16
            r20 = r19
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.loadFromCameraService(int):X.7nO");
    }

    private void registerDisplayListener() {
        AnonymousClass7PU r3 = this.screenShareDisplayManager;
        Context context = this.waContext.A00;
        C162457s7.A0J(context, 0);
        if (!r3.A04) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            r3.A02 = displayManager;
            if (displayManager != null) {
                displayManager.registerDisplayListener(r3.A05, AnonymousClass000.A0A());
                r3.A04 = true;
            }
        }
        if (!C107385bE.A0B()) {
            this.screenShareDisplayManager.A03 = new C147507Eo(this);
        }
    }

    private void unregisterDisplayListener() {
        AnonymousClass7PU r2 = this.screenShareDisplayManager;
        r2.A03 = null;
        if (r2.A04) {
            DisplayManager displayManager = r2.A02;
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(r2.A05);
            }
            r2.A04 = false;
        }
    }

    public void addCameraErrorListener(C185758uC r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b6, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.voipcalling.camera.VoipCamera createCamera(int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r27 = this;
            r5 = r27
            monitor-enter(r5)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r4 = r5.currentCamera     // Catch:{ all -> 0x01cb }
            r13 = 0
            r8 = r28
            r11 = r29
            r10 = r30
            r7 = r31
            r0 = r33
            if (r4 == 0) goto L_0x0071
            boolean r2 = r4.useOutputFormatForSecondaryStream()     // Catch:{ all -> 0x01cb }
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "voip/VoipCameraManager/createCamera ignoring input parameters. Caller should query getCameraInfo directly."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x01cb }
        L_0x001d:
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x01cb }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x01cb }
            goto L_0x01b5
        L_0x0024:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r6 = r4.getCameraInfo()     // Catch:{ all -> 0x01cb }
            int r3 = r6.width     // Catch:{ all -> 0x01cb }
            if (r3 != r11) goto L_0x0038
            int r2 = r6.height     // Catch:{ all -> 0x01cb }
            if (r2 != r10) goto L_0x0038
            int r2 = r6.format     // Catch:{ all -> 0x01cb }
            if (r2 != r7) goto L_0x0038
            int r2 = r6.idx     // Catch:{ all -> 0x01cb }
            if (r2 == r8) goto L_0x001d
        L_0x0038:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera camera info doesn't match. Current cam: w/h: "
            r4.append(r0)     // Catch:{ all -> 0x01cb }
            r4.append(r3)     // Catch:{ all -> 0x01cb }
            java.lang.String r3 = "/"
            r4.append(r3)     // Catch:{ all -> 0x01cb }
            int r0 = r6.height     // Catch:{ all -> 0x01cb }
            r4.append(r0)     // Catch:{ all -> 0x01cb }
            java.lang.String r2 = ", format: "
            r4.append(r2)     // Catch:{ all -> 0x01cb }
            int r0 = r6.format     // Catch:{ all -> 0x01cb }
            r4.append(r0)     // Catch:{ all -> 0x01cb }
            java.lang.String r1 = ", idx: "
            r4.append(r1)     // Catch:{ all -> 0x01cb }
            int r0 = r6.idx     // Catch:{ all -> 0x01cb }
            r4.append(r0)     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = ". New cam: w/h: "
            X.AnonymousClass6C7.A1J(r0, r3, r4, r11, r10)     // Catch:{ all -> 0x01cb }
            r4.append(r2)     // Catch:{ all -> 0x01cb }
            r4.append(r7)     // Catch:{ all -> 0x01cb }
            X.C18260x0.A0x(r1, r4, r8)     // Catch:{ all -> 0x01cb }
            goto L_0x00a8
        L_0x0071:
            boolean r2 = r5.isScreenShareDevice(r8)     // Catch:{ all -> 0x01cb }
            r26 = r32
            if (r2 == 0) goto L_0x00aa
            X.8jn r2 = r5.captureDeviceFactory     // Catch:{ all -> 0x01cb }
            if (r2 != 0) goto L_0x0084
            java.lang.String r1 = "CaptureDeviceFactory must be set to enable screen share device"
        L_0x007f:
            r0 = 0
            X.C626936e.A0D(r0, r1)     // Catch:{ all -> 0x01cb }
            goto L_0x00a8
        L_0x0084:
            X.63w r2 = r5.mediaProjectionProvider     // Catch:{ all -> 0x01cb }
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = "MediaProjectionProvider must be set to enable screen share device"
            goto L_0x007f
        L_0x008b:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r2 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r2     // Catch:{ all -> 0x01cb }
            android.media.projection.MediaProjection r15 = r2.A01     // Catch:{ all -> 0x01cb }
            r2.A01 = r13     // Catch:{ all -> 0x01cb }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cb }
            java.lang.String r2 = "ScreenShareViewModel Transferring ownership ? "
            r3.append(r2)     // Catch:{ all -> 0x01cb }
            boolean r2 = X.AnonymousClass000.A1W(r15)
            X.C18260x0.A1U(r3, r2)     // Catch:{ all -> 0x01cb }
            if (r15 != 0) goto L_0x016e
            java.lang.String r0 = "MediaProjection is null, can't start screen share capture"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01cb }
        L_0x00a8:
            monitor-exit(r5)
            return r13
        L_0x00aa:
            boolean r2 = r5.isHammerheadDevice(r8)     // Catch:{ all -> 0x01cb }
            if (r2 == 0) goto L_0x00dd
            X.1VX r9 = r5.abProps     // Catch:{ Exception -> 0x00da }
            X.8y5 r6 = r5.systemFeatures     // Catch:{ Exception -> 0x00da }
            X.33i r4 = r5.systemServices     // Catch:{ Exception -> 0x00da }
            X.7UJ r3 = r5.cameraProcessorFactory     // Catch:{ Exception -> 0x00da }
            X.2oU r2 = r5.waContext     // Catch:{ Exception -> 0x00da }
            android.content.Context r2 = r2.A00     // Catch:{ Exception -> 0x00da }
            r24 = 1
            com.whatsapp.voipcalling.camera.VoipLiteCamera r13 = new com.whatsapp.voipcalling.camera.VoipLiteCamera     // Catch:{ Exception -> 0x00da }
            r14 = r9
            r15 = r6
            r16 = r4
            r17 = r3
            r18 = r8
            r19 = r11
            r20 = r10
            r21 = r7
            r22 = r26
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x00da }
            r2 = 0
            r13.passiveMode = r2     // Catch:{ Exception -> 0x00da }
            goto L_0x01a7
        L_0x00da:
            r2 = move-exception
            goto L_0x01bb
        L_0x00dd:
            X.7nO r2 = r5.getRawCameraInfo(r8)     // Catch:{ RuntimeException -> 0x01b7 }
            if (r2 == 0) goto L_0x0168
            int r3 = r2.A00     // Catch:{ RuntimeException -> 0x01b7 }
            if (r3 != 0) goto L_0x0108
            X.2oU r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b7 }
            android.content.Context r6 = r2.A00     // Catch:{ RuntimeException -> 0x01b7 }
            X.1VX r4 = r5.abProps     // Catch:{ RuntimeException -> 0x01b7 }
            X.8y5 r3 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b7 }
            X.7UJ r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b7 }
            X.6qT r13 = new X.6qT     // Catch:{ RuntimeException -> 0x01b7 }
            r14 = r6
            r15 = r4
            r16 = r2
            r17 = r3
            r18 = r8
            r19 = r11
            r20 = r10
            r21 = r7
            r22 = r26
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x01a7
        L_0x0108:
            r2 = 1
            if (r3 != r2) goto L_0x010c
            goto L_0x0135
        L_0x010c:
            X.2oU r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b7 }
            android.content.Context r12 = r2.A00     // Catch:{ RuntimeException -> 0x01b7 }
            X.1VX r9 = r5.abProps     // Catch:{ RuntimeException -> 0x01b7 }
            X.4FS r6 = r5.waWorkers     // Catch:{ RuntimeException -> 0x01b7 }
            X.8y5 r4 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b7 }
            X.33i r3 = r5.systemServices     // Catch:{ RuntimeException -> 0x01b7 }
            X.7UJ r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b7 }
            X.6qV r13 = new X.6qV     // Catch:{ RuntimeException -> 0x01b7 }
            r14 = r12
            r15 = r3
            r16 = r9
            r17 = r2
            r18 = r4
            r19 = r6
            r20 = r8
            r21 = r11
            r22 = r10
            r23 = r7
            r24 = r26
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RuntimeException -> 0x01b7 }
            r2 = 0
            goto L_0x0165
        L_0x0135:
            X.2oU r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b7 }
            android.content.Context r9 = r2.A00     // Catch:{ RuntimeException -> 0x01b7 }
            X.1VX r6 = r5.abProps     // Catch:{ RuntimeException -> 0x01b7 }
            X.8y5 r4 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b7 }
            X.33i r3 = r5.systemServices     // Catch:{ RuntimeException -> 0x01b7 }
            X.7UJ r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b7 }
            org.pjsip.PjCamera r13 = new org.pjsip.PjCamera     // Catch:{ RuntimeException -> 0x01b7 }
            r14 = r9
            r15 = r6
            r16 = r4
            r17 = r3
            r18 = r2
            r19 = r8
            r20 = r11
            r21 = r10
            r22 = r7
            r23 = r26
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ RuntimeException -> 0x01b7 }
            X.5Xv r2 = r5.voipSharedPreferences     // Catch:{ RuntimeException -> 0x01b7 }
            android.content.SharedPreferences r4 = r2.A03()     // Catch:{ RuntimeException -> 0x01b7 }
            java.lang.String r3 = "force_passive_capture_dev_stream_role"
            r2 = 0
            boolean r2 = r4.getBoolean(r3, r2)     // Catch:{ RuntimeException -> 0x01b7 }
        L_0x0165:
            r13.passiveMode = r2     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x01a7
        L_0x0168:
            java.lang.String r2 = "voip/VoipCameraManager/createCamera couldn't get camera info"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x01b7 }
            goto L_0x01ac
        L_0x016e:
            r5.registerDisplayListener()     // Catch:{ all -> 0x01cb }
            X.8jn r10 = r5.captureDeviceFactory     // Catch:{ all -> 0x01cb }
            X.8KD r10 = (X.AnonymousClass8KD) r10     // Catch:{ all -> 0x01cb }
            X.33i r2 = r10.A04     // Catch:{ all -> 0x01cb }
            android.view.WindowManager r3 = r2.A0O()     // Catch:{ all -> 0x01cb }
            X.C162457s7.A0D(r3)     // Catch:{ all -> 0x01cb }
            X.5Ll r2 = X.C158497k4.A03     // Catch:{ all -> 0x01cb }
            android.content.Context r14 = r10.A00     // Catch:{ all -> 0x01cb }
            X.7k4 r17 = r2.A00(r14, r3)     // Catch:{ all -> 0x01cb }
            X.1VX r9 = r10.A05     // Catch:{ all -> 0x01cb }
            X.8y5 r6 = r10.A06     // Catch:{ all -> 0x01cb }
            X.49P r4 = r10.A01     // Catch:{ all -> 0x01cb }
            X.5TU r3 = r10.A02     // Catch:{ all -> 0x01cb }
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r2 = r10.A03     // Catch:{ all -> 0x01cb }
            X.46Q r22 = X.AnonymousClass2C4.A00     // Catch:{ all -> 0x01cb }
            X.46A r23 = X.AnonymousClass2C4.A03     // Catch:{ all -> 0x01cb }
            X.6qU r13 = new X.6qU     // Catch:{ all -> 0x01cb }
            r24 = r8
            r25 = r7
            r16 = r4
            r18 = r3
            r19 = r2
            r20 = r9
            r21 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01cb }
        L_0x01a7:
            X.8uC r2 = r5.cameraEventsListener     // Catch:{ all -> 0x01cb }
            r13.addCameraEventsListener(r2)     // Catch:{ all -> 0x01cb }
        L_0x01ac:
            r5.currentCamera = r13     // Catch:{ all -> 0x01cb }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r5.currentCamera     // Catch:{ all -> 0x01cb }
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x01cb }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x01cb }
        L_0x01b5:
            monitor-exit(r5)
            return r3
        L_0x01b7:
            r2 = move-exception
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting camera"
            goto L_0x01c5
        L_0x01bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01cb }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting Lite Camera. Idx: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)     // Catch:{ all -> 0x01cb }
        L_0x01c5:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01cb }
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.createCamera(int, int, int, int, int, long):com.whatsapp.voipcalling.camera.VoipCamera");
    }

    public boolean disableAREffect() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || voipPhysicalCamera.disableAREffect() != 0) {
            return false;
        }
        return true;
    }

    public boolean enableAREffect(C106005Xg r3, AnonymousClass646 r4) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || voipPhysicalCamera.enableAREffect(r3, r4) != 0) {
            return false;
        }
        return true;
    }

    public Point getAdjustedCameraPreviewSize(C179858jp r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i = this.voipSharedPreferences.A03().getInt("lowest_camera_hardware_support_level", -1);
        if (i == -1) {
            CameraManager A0E = this.systemServices.A0E();
            if (A0E == null) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
            } else {
                int[] iArr = C138516qV.A0K;
                int length = iArr.length;
                int i2 = length;
                try {
                    if (A0E.getCameraIdList().length > 0) {
                        for (String cameraCharacteristics : A0E.getCameraIdList()) {
                            Integer num = (Integer) A0E.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    } else if (num.intValue() == iArr[i3]) {
                                        length = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (length < i2) {
                        i = iArr[length];
                        C18270x1.A0h(this.voipSharedPreferences.A03().edit(), "lowest_camera_hardware_support_level", i);
                    }
                } catch (AssertionError | Exception e) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e);
                }
            }
            i = -1;
            C18270x1.A0h(this.voipSharedPreferences.A03().edit(), "lowest_camera_hardware_support_level", i);
        }
        C18260x0.A0y("voip/VoipCameraManager/getCachedCam2HardwareLevel got:", AnonymousClass001.A0o(), i);
        return i;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public int getHammerheadIndex() {
        Integer num = this.hammerHeadIdx;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public C149957Oo getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized C160297nO getRawCameraInfo(int i) {
        C160297nO r2;
        String A0Y;
        String A0Y2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        AnonymousClass7YA r16;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        synchronized (this) {
            int currentApiVersion2 = getCurrentApiVersion();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
            int i2 = i;
            A0o.append(i2);
            C18260x0.A0y(" enabled camera version: ", A0o, currentApiVersion2);
            int i3 = i + currentApiVersion2;
            int i4 = ((i3 * (i3 + 1)) / 2) + currentApiVersion2;
            r2 = (C160297nO) this.rawCameraInfoCache.get(i4);
            if (r2 == null || (r2.A04 && !isRawCameraInfoValid(i2, r2))) {
                SharedPreferences A03 = this.voipSharedPreferences.A03();
                if (currentApiVersion2 == 1) {
                    A0Y = C18260x0.A05("voip_camera_info_", i2);
                } else {
                    A0Y = AnonymousClass000.A0Y("_api_", C18270x1.A0W(i2, "voip_camera_info_"), currentApiVersion2);
                }
                String A0Z = C18280x3.A0Z(A03, A0Y);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
                A0o2.append(i2);
                C18260x0.A0s(": ", A0Z, A0o2);
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(A0Z)) {
                    try {
                        JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                        int i5 = A1H.getInt("version");
                        boolean z = true;
                        if (i5 != 1) {
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                            A0o3.append(i5);
                            C18260x0.A0y(", required ", A0o3, 1);
                        } else {
                            int i6 = A1H.getInt("apiVersion");
                            if (i6 == 1 || i6 == 2) {
                                boolean z2 = A1H.getBoolean("isFrontCamera");
                                int i7 = A1H.getInt("orientation");
                                if (!A1H.has("has_unstable_orientation") || !A1H.getBoolean("has_unstable_orientation")) {
                                    z = false;
                                }
                                JSONArray jSONArray5 = A1H.getJSONArray("supportFormats");
                                if (jSONArray5 == null) {
                                    Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                                } else {
                                    int[] iArr = new int[jSONArray5.length()];
                                    for (int i8 = 0; i8 < jSONArray5.length(); i8++) {
                                        iArr[i8] = jSONArray5.getInt(i8);
                                    }
                                    if (!A1H.has("preferredSize") || (jSONArray4 = A1H.getJSONArray("preferredSize")) == null) {
                                        r16 = null;
                                    } else if (jSONArray4.length() != 2) {
                                        C18260x0.A1Q(AnonymousClass001.A0o(), "voip/RawCameraInfo createFromJson bad preferred size ", jSONArray4);
                                    } else {
                                        r16 = new AnonymousClass7YA(jSONArray4.getInt(0), jSONArray4.getInt(1));
                                    }
                                    if (A1H.has("previewSizes") && (jSONArray3 = A1H.getJSONArray("previewSizes")) != null) {
                                        int length = jSONArray3.length();
                                        if (length % 2 == 0) {
                                            arrayList = AnonymousClass002.A0I(length / 2);
                                            for (int i9 = 0; i9 < length; i9 += 2) {
                                                arrayList.add(new AnonymousClass7YA(jSONArray3.getInt(i9), jSONArray3.getInt(i9 + 1)));
                                            }
                                        } else {
                                            throw new JSONException("length is not even");
                                        }
                                    }
                                    r2 = new C160297nO(r16, arrayList, iArr, i6, i7, z2, z);
                                    if (!isRawCameraInfoValid(i2, r2)) {
                                        C18260x0.A1S(AnonymousClass001.A0o(), "voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ", r2);
                                        clearStoredRawCameraInfo(i2, r2.A00);
                                    }
                                    this.rawCameraInfoCache.put(i4, r2);
                                }
                            } else {
                                C18260x0.A0y("voip/RawCameraInfo/createFromJson, skip unsupported api version ", AnonymousClass001.A0o(), i6);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e((Throwable) e);
                    }
                }
                r2 = loadFromCameraService(i2);
                if (r2 != null) {
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    String str = null;
                    try {
                        A1G.put("version", 1);
                        A1G.put("apiVersion", r2.A00);
                        A1G.put("isFrontCamera", r2.A05);
                        A1G.put("orientation", r2.A01);
                        A1G.put("has_unstable_orientation", r2.A04);
                        JSONArray A1F = AnonymousClass0x9.A1F();
                        for (int put : r2.A06) {
                            A1F.put(put);
                        }
                        A1G.put("supportFormats", A1F);
                        AnonymousClass7YA r3 = r2.A02;
                        if (r3 != null) {
                            jSONArray = AnonymousClass0x9.A1F();
                            jSONArray.put(r3.A01);
                            jSONArray.put(r3.A00);
                        } else {
                            jSONArray = null;
                        }
                        A1G.put("preferredSize", jSONArray);
                        List<AnonymousClass7YA> list = r2.A03;
                        if (list != null) {
                            jSONArray2 = AnonymousClass0x9.A1F();
                            for (AnonymousClass7YA r1 : list) {
                                jSONArray2.put(r1.A01);
                                jSONArray2.put(r1.A00);
                            }
                        } else {
                            jSONArray2 = null;
                        }
                        A1G.put("previewSizes", jSONArray2);
                        str = A1G.toString();
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C106155Xv r0 = this.voipSharedPreferences;
                        int i10 = r2.A00;
                        SharedPreferences.Editor edit = r0.A03().edit();
                        if (i10 == 1) {
                            A0Y2 = C18260x0.A05("voip_camera_info_", i2);
                        } else {
                            A0Y2 = AnonymousClass000.A0Y("_api_", C18270x1.A0W(i2, "voip_camera_info_"), i10);
                        }
                        C18270x1.A0j(edit, A0Y2, str);
                    }
                    this.rawCameraInfoCache.put(i4, r2);
                } else {
                    clearStoredRawCameraInfo(i2, currentApiVersion2);
                    this.rawCameraInfoCache.put(i4, r2);
                }
            }
        }
        return r2;
    }

    public boolean hasBeenQueriedByDriver() {
        return this.hasBeenQueriedByDriver.get();
    }

    public boolean isCameraOpen() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.isCameraOpen()) {
            return false;
        }
        return true;
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.textureApiFailed) {
            return false;
        }
        return true;
    }

    public boolean isFrontCamera() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.getCameraInfo().isFrontCamera) {
            return false;
        }
        return true;
    }

    public void maybeUpdateCameraProcessorOrientation(int i) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.maybeUpdateCameraProcessorOrientation(i);
        }
    }

    public void removeCameraErrorListener(C185758uC r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(r2);
        }
    }

    public void setCameraClosedListener(C179868jq r1) {
        this.onCameraClosedListener = r1;
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }

    public VoipCameraManager(C54292oU r3, AnonymousClass1VX r4, AnonymousClass4FS r5, C620633i r6, C187958y5 r7, C106155Xv r8, AnonymousClass7UJ r9, AnonymousClass7PU r10) {
        this.waContext = r3;
        this.abProps = r4;
        this.waWorkers = r5;
        this.systemServices = r6;
        this.systemFeatures = r7;
        this.voipSharedPreferences = r8;
        this.cameraProcessorFactory = r9;
        this.screenShareDisplayManager = r10;
    }

    private boolean isHammerheadDevice(int i) {
        return AnonymousClass75J.A00(Integer.valueOf(i), this.hammerHeadIdx);
    }

    private boolean isScreenShareDevice(int i) {
        return AnonymousClass75J.A00(Integer.valueOf(i), this.screenShareIdx);
    }

    public void setRequestedCamera2SupportLevel(String str, AnonymousClass49P r5) {
        int currentApiVersion2 = getCurrentApiVersion();
        int i = 1;
        if (str != null && C138516qV.A01(str, getCachedCam2HardwareLevel())) {
            i = 2;
        }
        setCurrentApiVersion(i);
        if (currentApiVersion2 != getCurrentApiVersion()) {
            Voip.refreshVideoDevice();
        }
    }

    @Deprecated
    public synchronized int getCameraCount() {
        return getCameraCount(true);
    }
}
