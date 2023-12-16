package X;

import android.content.Context;
import android.hardware.Camera;
import android.view.Display;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;

/* renamed from: X.98Y  reason: invalid class name */
public class AnonymousClass98Y extends AnonymousClass98v implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public final SurfaceHolder A03;

    public void Bk6() {
        A0A(this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r4.contains(r1) != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bc A[Catch:{ RuntimeException -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7 A[Catch:{ RuntimeException -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            java.lang.String r0 = "bloks_camera/surface_changed"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r3 = r21
            android.view.SurfaceHolder r8 = r3.A03
            android.view.Surface r0 = r8.getSurface()
            if (r0 == 0) goto L_0x0165
            android.hardware.Camera r0 = r3.A02
            if (r0 == 0) goto L_0x0165
            r0.stopPreview()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.A02     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0160
            int r4 = r3.getDisplayOrientation()     // Catch:{ all -> 0x0162 }
            android.hardware.Camera r0 = r3.A02     // Catch:{ RuntimeException -> 0x0025 }
            r0.setDisplayOrientation(r4)     // Catch:{ RuntimeException -> 0x0025 }
            goto L_0x002b
        L_0x0025:
            r1 = move-exception
            java.lang.String r0 = "bloks_camera/startpreview/setdisplayorientation "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0162 }
        L_0x002b:
            android.hardware.Camera r0 = r3.A02     // Catch:{ all -> 0x0162 }
            android.hardware.Camera$Parameters r2 = r0.getParameters()     // Catch:{ all -> 0x0162 }
            r2.setRotation(r4)     // Catch:{ all -> 0x0162 }
            java.util.List r4 = r2.getSupportedFocusModes()     // Catch:{ all -> 0x0162 }
            if (r4 == 0) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "bloks_camera/startpreview supported focus:"
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.Object[] r0 = r4.toArray()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ all -> 0x0162 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r1 = "continuous-picture"
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "auto"
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "macro"
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = "edof"
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0071
        L_0x006e:
            r2.setFocusMode(r1)     // Catch:{ all -> 0x0162 }
        L_0x0071:
            int r4 = r3.A01     // Catch:{ all -> 0x0162 }
            if (r4 <= 0) goto L_0x0142
            int r11 = r3.A00     // Catch:{ all -> 0x0162 }
            if (r11 <= 0) goto L_0x0142
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ all -> 0x0162 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0162 }
            int r1 = r0.orientation     // Catch:{ all -> 0x0162 }
            r0 = 1
            if (r1 != r0) goto L_0x008d
            goto L_0x009d
        L_0x0087:
            java.lang.String r0 = "bloks_camera/startpreview supported focus:null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            goto L_0x0071
        L_0x008d:
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ all -> 0x0162 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0162 }
            int r1 = r0.orientation     // Catch:{ all -> 0x0162 }
            r0 = 2
            if (r1 != r0) goto L_0x00a1
            double r6 = (double) r4     // Catch:{ all -> 0x0162 }
            double r0 = (double) r11     // Catch:{ all -> 0x0162 }
            goto L_0x009f
        L_0x009d:
            double r6 = (double) r11     // Catch:{ all -> 0x0162 }
            double r0 = (double) r4     // Catch:{ all -> 0x0162 }
        L_0x009f:
            double r6 = r6 / r0
            goto L_0x00a3
        L_0x00a1:
            r6 = 0
        L_0x00a3:
            java.util.List r20 = r2.getSupportedPreviewSizes()     // Catch:{ all -> 0x0162 }
            java.util.Iterator r19 = r20.iterator()     // Catch:{ all -> 0x0162 }
            r17 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r9 = 0
            r15 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x00b6:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x0162 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x0162 }
            int r0 = r10.width     // Catch:{ all -> 0x0162 }
            double r4 = (double) r0     // Catch:{ all -> 0x0162 }
            int r12 = r10.height     // Catch:{ all -> 0x0162 }
            double r0 = (double) r12     // Catch:{ all -> 0x0162 }
            double r4 = r4 / r0
            double r4 = r4 - r6
            double r13 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x0162 }
            r4 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00b6
            int r0 = r11 - r12
            int r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0162 }
            double r0 = (double) r0     // Catch:{ all -> 0x0162 }
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b6
            r15 = r0
            r9 = r10
            goto L_0x00b6
        L_0x00e5:
            if (r9 != 0) goto L_0x0113
            java.lang.String r0 = "bloks_camera/getOptimalSize optimalSize under tolerance not found"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
            java.util.Iterator r11 = r20.iterator()     // Catch:{ all -> 0x0162 }
        L_0x00f0:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x0110
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0162 }
            android.hardware.Camera$Size r10 = (android.hardware.Camera.Size) r10     // Catch:{ all -> 0x0162 }
            int r0 = r10.width     // Catch:{ all -> 0x0162 }
            double r4 = (double) r0     // Catch:{ all -> 0x0162 }
            int r0 = r10.height     // Catch:{ all -> 0x0162 }
            double r0 = (double) r0     // Catch:{ all -> 0x0162 }
            double r4 = r4 / r0
            double r4 = r4 - r6
            double r4 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x0162 }
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f0
            r9 = r10
            r17 = r4
            goto L_0x00f0
        L_0x0110:
            if (r9 != 0) goto L_0x0113
            goto L_0x013d
        L_0x0113:
            int r1 = r9.width     // Catch:{ all -> 0x0162 }
            int r0 = r9.height     // Catch:{ all -> 0x0162 }
            r2.setPreviewSize(r1, r0)     // Catch:{ all -> 0x0162 }
            int r1 = r9.width     // Catch:{ all -> 0x0162 }
            int r0 = r9.height     // Catch:{ all -> 0x0162 }
            r2.setPictureSize(r1, r0)     // Catch:{ all -> 0x0162 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "bloks_camera/preview and picture size width : "
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            int r0 = r9.width     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "height :"
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            int r0 = r9.height     // Catch:{ all -> 0x0162 }
            r1.append(r0)     // Catch:{ all -> 0x0162 }
            X.C18280x3.A14(r1)     // Catch:{ all -> 0x0162 }
            goto L_0x0142
        L_0x013d:
            java.lang.String r0 = "bloks_camera/startpreview optimal size not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
        L_0x0142:
            android.hardware.Camera r0 = r3.A02     // Catch:{ all -> 0x0162 }
            r0.setParameters(r2)     // Catch:{ all -> 0x0162 }
            android.hardware.Camera r0 = r3.A02     // Catch:{ Exception -> 0x0152 }
            r0.setPreviewDisplay(r8)     // Catch:{ Exception -> 0x0152 }
            android.hardware.Camera r0 = r3.A02     // Catch:{ Exception -> 0x0152 }
            r0.startPreview()     // Catch:{ Exception -> 0x0152 }
            goto L_0x0160
        L_0x0152:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "Error starting camera preview: "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)     // Catch:{ all -> 0x0162 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x0162 }
        L_0x0160:
            monitor-exit(r3)
            return
        L_0x0162:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass98Y.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d("bloks_camera/surface_created");
    }

    public AnonymousClass98Y(Context context) {
        super(context);
        SurfaceHolder holder = getHolder();
        this.A03 = holder;
        holder.addCallback(this);
    }

    public int getDisplayOrientation() {
        Display defaultDisplay = C620633i.A01(getContext()).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i = 0;
        boolean A1U = AnonymousClass000.A1U(cameraInfo.facing, 1);
        int i2 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i3 = (i2 - i) + 360;
        if (A1U) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("bloks_camera/startpreview display:");
        A0o.append(i);
        A0o.append(" camera:");
        A0o.append(i2);
        A0o.append(" preview:");
        A0o.append(i4);
        C18260x0.A1E(" front:", A0o, A1U);
        return i4;
    }
}
