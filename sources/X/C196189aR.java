package X;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bloks.BloksCameraOverlay;

/* renamed from: X.9aR  reason: invalid class name and case insensitive filesystem */
public class C196189aR implements C185868uN {
    public boolean A00;
    public final C69263Wi A01;
    public final AnonymousClass7OZ A02;
    public final C44232Ve A03;
    public final AnonymousClass4FS A04;

    public C203699oA AxZ(Context context) {
        C194559Tk r6 = new C194559Tk(false);
        Context applicationContext = context.getApplicationContext();
        C195579Yl r2 = new C195579Yl(applicationContext.getApplicationContext(), (TextureView) null, new AnonymousClass9XR(), r6, AnonymousClass9LJ.A00(context, AnonymousClass9JW.CAMERA1), false);
        r2.A0F = false;
        try {
            r2.Bnm(921600);
            r2.Bmu(1048576);
            r2.Bn5(921600);
            r2.Bmm(true);
        } catch (Exception unused) {
        }
        return r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.SurfaceView r4, X.AnonymousClass7H5 r5, X.C196179aQ r6, X.C44232Ve r7) {
        /*
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0035
            android.media.MediaRecorder r0 = r6.A04
            X.C626936e.A06(r0)
            r0.stop()
            A02(r6)
            android.hardware.Camera r0 = r6.A03
            X.C626936e.A06(r0)
            r0.lock()
            r0 = 0
        L_0x0018:
            r6.A0B = r0
        L_0x001a:
            X.84O r1 = r5.A01
            r0 = 48
            java.lang.String r0 = r1.A0O(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            X.9j7 r2 = new X.9j7
            r2.<init>(r5, r6, r7)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x0035:
            android.media.MediaRecorder r0 = new android.media.MediaRecorder
            r0.<init>()
            r6.A04 = r0
            android.hardware.Camera r0 = r6.A03
            X.C626936e.A06(r0)
            r0.unlock()
            android.media.MediaRecorder r1 = r6.A04
            android.hardware.Camera r0 = r6.A03
            r1.setCamera(r0)
            android.media.MediaRecorder r0 = r6.A04
            r2 = 1
            r0.setVideoSource(r2)
            int r0 = r6.A00
            r1 = 4
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ed
            int r0 = r6.A00
            r1 = 5
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0, r1)
            if (r0 != 0) goto L_0x00ed
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r2)
        L_0x0069:
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.fileFormat
            r1.setOutputFormat(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoFrameRate
            r1.setVideoFrameRate(r0)
            android.media.MediaRecorder r2 = r6.A04
            int r1 = r3.videoFrameWidth
            int r0 = r3.videoFrameHeight
            r2.setVideoSize(r1, r0)
            android.media.MediaRecorder r1 = r6.A04
            r0 = 256000(0x3e800, float:3.58732E-40)
            r1.setVideoEncodingBitRate(r0)
            android.media.MediaRecorder r1 = r6.A04
            int r0 = r3.videoCodec
            r1.setVideoEncoder(r0)
            X.84O r1 = r5.A01
            r0 = 46
            java.lang.String r1 = r1.A0O(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "yyyyMMdd_HHmmss"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r2 = r1.format(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VID_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".mp4"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
        L_0x00bf:
            java.io.File r0 = r7.A00(r1)
            X.C626936e.A06(r0)
            java.lang.String r1 = r0.getPath()
            android.media.MediaRecorder r0 = r6.A04
            r0.setOutputFile(r1)
            android.media.MediaRecorder r1 = r6.A04
            X.98Y r0 = r6.A06
            X.C626936e.A04(r0)
            int r0 = r0.getDisplayOrientation()
            int r0 = 360 - r0
            r1.setOrientationHint(r0)
            android.media.MediaRecorder r1 = r6.A04
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r0 = r0.getSurface()
            r1.setPreviewDisplay(r0)
            goto L_0x00f5
        L_0x00ed:
            int r0 = r6.A00
            android.media.CamcorderProfile r3 = android.media.CamcorderProfile.get(r0, r1)
            goto L_0x0069
        L_0x00f5:
            android.media.MediaRecorder r0 = r6.A04     // Catch:{ IllegalStateException -> 0x010d, IOException -> 0x0105 }
            r0.prepare()     // Catch:{ IllegalStateException -> 0x010d, IOException -> 0x0105 }
            android.media.MediaRecorder r0 = r6.A04
            X.C626936e.A06(r0)
            r0.start()
            r0 = 1
            goto L_0x0018
        L_0x0105:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IOException preparing MediaRecorder: "
            goto L_0x0114
        L_0x010d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "IllegalStateException preparing MediaRecorder: "
        L_0x0114:
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            A02(r6)
            A02(r6)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196189aR.A00(android.view.SurfaceView, X.7H5, X.9aQ, X.2Ve):void");
    }

    public static void A02(C196179aQ r1) {
        MediaRecorder mediaRecorder = r1.A04;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            r1.A04.release();
            r1.A04 = null;
            Camera camera = r1.A03;
            if (camera != null) {
                camera.lock();
            }
        }
    }

    public void Axy(Context context, View view, C15810ry r14, AnonymousClass7H5 r15, String str, String str2, String str3, String str4, String str5) {
        int i;
        Camera camera;
        String str6 = str5;
        this.A00 = false;
        AnonymousClass7H5 r7 = r15;
        Object A05 = C162377rs.A05(r15.A00, r15.A01);
        A05.getClass();
        C179088ia r8 = (C179088ia) A05;
        C626936e.A06(r8);
        C196179aQ r82 = (C196179aQ) r8;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        r82.A01 = displayMetrics.heightPixels;
        r82.A02 = displayMetrics.widthPixels;
        ViewGroup A0I = C86644Kx.A0I(view, R.id.bloks_camera_preview);
        if (TextUtils.equals(str, "front")) {
            i = 1;
            r82.A00 = 1;
        } else {
            i = 0;
            r82.A00 = 0;
        }
        if (Camera.getNumberOfCameras() < i + 1) {
            i = 0;
        }
        try {
            camera = Camera.open(i);
        } catch (Exception e) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "CAMERA EXPECTION", e);
            camera = null;
        }
        r82.A03 = camera;
        String str7 = str2;
        r82.A08 = str7;
        r82.A07 = str3;
        r82.A09 = str4;
        r82.A0C = false;
        r82.A0A = false;
        r82.A05 = (BloksCameraOverlay) view.findViewById(R.id.camera_overlay);
        Camera camera2 = r82.A03;
        int i2 = r82.A00;
        int i3 = r82.A02;
        int i4 = r82.A01;
        AnonymousClass98Y r0 = new AnonymousClass98Y(context);
        r0.A02 = camera2;
        r0.A01 = i3;
        r0.A00 = i4;
        r0.A00 = i2;
        r82.A06 = r0;
        BloksCameraOverlay bloksCameraOverlay = r82.A05;
        C626936e.A04(bloksCameraOverlay);
        if (str5 == null) {
            str6 = "original";
        }
        bloksCameraOverlay.A00(str6);
        A0I.removeAllViews();
        A0I.addView(r82.A06);
        AnonymousClass98Y r02 = r82.A06;
        C626936e.A04(r02);
        r02.getDisplayOrientation();
        C06560Yg.A02(view, R.id.shutter).setOnClickListener(new C195459Xw(new AnonymousClass9XF(r14, r82, this), r7, r82, this, str7));
    }

    public C179088ia B0S() {
        return new C196179aQ();
    }

    public C16280sl BJj() {
        return new AnonymousClass9YH();
    }

    public void BrH(C179088ia r2) {
        C196179aQ r22 = (C196179aQ) r2;
        A02(r22);
        Camera camera = r22.A03;
        if (camera != null) {
            camera.release();
            r22.A03 = null;
        }
    }

    public C196189aR(C69263Wi r1, AnonymousClass7OZ r2, C44232Ve r3, AnonymousClass4FS r4) {
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass7H5 r6, X.C196179aQ r7, X.C44232Ve r8) {
        /*
            java.util.HashMap r1 = X.AnonymousClass001.A0t()
            java.lang.String r3 = r7.A08
            int r2 = r3.hashCode()
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            r5 = 1
            if (r2 == r0) goto L_0x0081
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r2 == r0) goto L_0x0079
            r0 = 124969519(0x772e22f, float:1.8272526E-34)
            if (r2 != r0) goto L_0x0023
            java.lang.String r0 = "image_and_video"
            boolean r0 = r3.equals(r0)
            r4 = 1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r4 = -1
        L_0x0024:
            java.lang.String r3 = "video_file_name"
            if (r4 == 0) goto L_0x0073
            java.lang.String r2 = "image_file_name"
            if (r4 == r5) goto L_0x0052
            java.lang.String r0 = r7.A07
            r1.put(r2, r0)
        L_0x0031:
            X.84O r4 = r6.A01
            r0 = 44
            X.48t r3 = r4.A0L(r0)
            if (r3 == 0) goto L_0x0051
            X.7Xj r2 = new X.7Xj
            r2.<init>()
            java.util.Map r1 = X.C57102t5.A01(r1)
            r0 = 0
            r2.A05(r1, r0)
            X.7jD r1 = r2.A03()
            X.7bI r0 = r6.A00
            X.C159377lj.A01(r0, r4, r1, r3)
        L_0x0051:
            return
        L_0x0052:
            boolean r0 = r7.A0C
            if (r0 != 0) goto L_0x0063
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0063
            X.98Y r0 = r7.A06
            X.C626936e.A04(r0)
            A00(r0, r6, r7, r8)
            return
        L_0x0063:
            java.lang.String r0 = r7.A07
            r1.put(r2, r0)
            java.lang.String r0 = r7.A09
            r1.put(r3, r0)
            r0 = 0
            r7.A0C = r0
            r7.A0A = r0
            goto L_0x0031
        L_0x0073:
            java.lang.String r0 = r7.A09
            r1.put(r3, r0)
            goto L_0x0031
        L_0x0079:
            java.lang.String r0 = "video"
            boolean r0 = r3.equals(r0)
            r4 = 0
            goto L_0x0021
        L_0x0081:
            java.lang.String r0 = "image"
            boolean r0 = r3.equals(r0)
            r4 = 2
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196189aR.A01(X.7H5, X.9aQ, X.2Ve):void");
    }

    public AnonymousClass7OZ AxY(Context context) {
        return this.A02;
    }
}
