package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9Vb  reason: invalid class name and case insensitive filesystem */
public class C194919Vb {
    public static int A03 = -1;
    public static volatile boolean A04;
    public static volatile boolean A05;
    public static volatile boolean A06;
    public static volatile Camera.CameraInfo[] A07;
    public final PackageManager A00;
    public final AnonymousClass9TX A01;
    public final C194959Vh A02;

    public static final void A00() {
        if (A07 == null) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                cameraInfoArr[i] = cameraInfo;
                int i2 = cameraInfo.facing;
                if (i2 == 0) {
                    z2 = true;
                } else if (i2 == 1) {
                    z = true;
                }
            }
            A07 = cameraInfoArr;
            A05 = z;
            A04 = z2;
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A06 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r3 == -1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 == -1) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(int r8) {
        /*
            r7 = this;
            android.hardware.Camera$CameraInfo[] r0 = A07
            r4 = -1
            if (r0 == 0) goto L_0x0028
            android.hardware.Camera$CameraInfo[] r2 = A07
            if (r2 == 0) goto L_0x0026
            boolean r1 = X.AnonymousClass001.A1T(r8)
            r3 = 0
        L_0x000e:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0026
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x0023
            if (r3 != r4) goto L_0x001f
        L_0x0019:
            if (r8 == 0) goto L_0x0020
            boolean r0 = A05
        L_0x001d:
            if (r0 != 0) goto L_0x0028
        L_0x001f:
            return r3
        L_0x0020:
            boolean r0 = A04
            goto L_0x001d
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0026:
            r3 = -1
            goto L_0x0019
        L_0x0028:
            r6 = 0
            A07 = r6
            r7.A04()
            android.hardware.Camera$CameraInfo[] r2 = A07
            if (r2 == 0) goto L_0x00c4
            boolean r1 = X.AnonymousClass001.A1T(r8)
            r3 = 0
        L_0x0037:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x00c4
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x00c0
            if (r3 != r4) goto L_0x001f
        L_0x0042:
            if (r8 == 0) goto L_0x00bd
            boolean r0 = A05
        L_0x0046:
            if (r0 == 0) goto L_0x001f
            android.content.pm.PackageManager r3 = r7.A00
            if (r3 == 0) goto L_0x00ba
            java.lang.String r0 = "android.hardware.camera.any"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x006a:
            java.lang.String r0 = "Camera 1 API - Could not get CameraInfo for CameraFacing id: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r8)
            java.lang.String r0 = " Number Of Cameras: "
            r5.append(r0)
            int r0 = A03
            r5.append(r0)
            java.lang.String r0 = " ANY: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " BACK: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " FRONT: "
            r5.append(r0)
            r5.append(r6)
            android.hardware.Camera$CameraInfo[] r3 = A07
            if (r3 == 0) goto L_0x00c7
            java.lang.String r0 = " Camera Info size: "
            r5.append(r0)
            int r2 = r3.length
            r5.append(r2)
            java.lang.String r0 = " Camera ids: "
            r5.append(r0)
            r1 = 0
        L_0x00a9:
            if (r1 >= r2) goto L_0x00cc
            r0 = r3[r1]
            int r0 = r0.facing
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            int r1 = r1 + 1
            goto L_0x00a9
        L_0x00ba:
            r2 = r6
            r1 = r6
            goto L_0x006a
        L_0x00bd:
            boolean r0 = A04
            goto L_0x0046
        L_0x00c0:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x00c4:
            r3 = -1
            goto L_0x0042
        L_0x00c7:
            java.lang.String r0 = " Camera Info NULL"
            r5.append(r0)
        L_0x00cc:
            java.lang.String r1 = "CameraInventory"
            java.lang.String r0 = r5.toString()
            X.AnonymousClass9WT.A01(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194919Vb.A02(int):int");
    }

    public int A03(int i, int i2) {
        int i3;
        if (A07 == null) {
            if (!AnonymousClass9WU.A02()) {
                AnonymousClass9WT.A01("CameraInventory", "Loading camera info on the UI thread");
            }
            A04();
        }
        if (i2 != -1) {
            int A022 = A02(i);
            Camera.CameraInfo[] cameraInfoArr = A07;
            cameraInfoArr.getClass();
            if (A022 >= cameraInfoArr.length) {
                AnonymousClass9WT.A01("CameraInventory", AnonymousClass000.A0Y("No CameraInfo found for camera id: ", AnonymousClass001.A0o(), A022));
            } else {
                Camera.CameraInfo cameraInfo = A07[A022];
                int i4 = ((i2 + 45) / 90) * 90;
                int i5 = cameraInfo.facing;
                int i6 = cameraInfo.orientation;
                if (i5 == 1) {
                    i3 = (i6 - i4) + 360;
                } else {
                    i3 = i6 + i4;
                }
                return i3 % 360;
            }
        }
        return 0;
    }

    public final void A04() {
        if (A07 == null) {
            C194959Vh r2 = this.A02;
            if (r2.A09()) {
                A00();
                return;
            }
            try {
                r2.A01(new AnonymousClass96k(), new C204469pP((Object) this, 3)).get();
            } catch (InterruptedException | ExecutionException e) {
                AnonymousClass9WT.A01("CameraInventory", AnonymousClass000.A0a("failed to load camera infos: ", AnonymousClass001.A0o(), e));
            }
        }
    }

    public final boolean A05() {
        if (!A06) {
            PackageManager packageManager = this.A00;
            if (packageManager == null) {
                AnonymousClass9WT.A01("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A04 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A05 = true;
            }
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A06 = true;
        }
        return true;
    }

    public C194919Vb(PackageManager packageManager, AnonymousClass9TX r2, C194959Vh r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = packageManager;
    }

    public int A01(int i) {
        int A022 = A02(i);
        if (A022 != -1) {
            Camera.CameraInfo[] cameraInfoArr = A07;
            cameraInfoArr.getClass();
            Camera.CameraInfo cameraInfo = cameraInfoArr[A022];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw C1899593h.A0Y("Could not load CameraInfo for CameraFacing: ", AnonymousClass001.A0o(), i);
    }

    public boolean A06(int i) {
        if (A05()) {
            if (i != 0) {
                return A05;
            }
            return A04;
        } else if (A02(i) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
