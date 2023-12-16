package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.6EU  reason: invalid class name */
public final class AnonymousClass6EU extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final AnonymousClass6E5 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A01(r5) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6EU A00(android.content.Context r5, boolean r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L_0x000a
            boolean r1 = A01(r5)
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C161487pm.A04(r0)
            X.6E5 r3 = new X.6E5
            r3.<init>()
            if (r6 == 0) goto L_0x0017
            int r4 = A02
        L_0x0017:
            android.os.Looper r0 = X.AnonymousClass6C9.A0S(r3)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.8Mm r0 = new X.8Mm
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x005b }
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch:{ all -> 0x005b }
            r0.sendToTarget()     // Catch:{ all -> 0x005b }
        L_0x0035:
            X.6EU r0 = r3.A02     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0047
            java.lang.RuntimeException r0 = r3.A04     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0047
            java.lang.Error r0 = r3.A03     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0047
            r3.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x0035
        L_0x0045:
            r1 = 1
            goto L_0x0035
        L_0x0047:
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x004d
            X.C18300x5.A11()
        L_0x004d:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L_0x005d
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L_0x005d
            X.6EU r0 = r3.A02
            r0.getClass()
            return r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EU.A00(android.content.Context, boolean):X.6EU");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r1.contains("EGL_KHR_surfaceless_context") == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A01(android.content.Context r5) {
        /*
            java.lang.Class<X.6EU> r4 = X.AnonymousClass6EU.class
            monitor-enter(r4)
            boolean r0 = A03     // Catch:{ all -> 0x006b }
            r3 = 1
            if (r0 != 0) goto L_0x0064
            int r1 = X.C162387ry.A01     // Catch:{ all -> 0x006b }
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L_0x005f
            r0 = 26
            if (r1 >= r0) goto L_0x0034
            java.lang.String r1 = "samsung"
            java.lang.String r0 = X.C162387ry.A04     // Catch:{ all -> 0x006b }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005f
            java.lang.String r1 = "XT1650"
            java.lang.String r0 = X.C162387ry.A05     // Catch:{ all -> 0x006b }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005f
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0034
            goto L_0x005f
        L_0x0034:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x006b }
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r0)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005f
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x006b }
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r0)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x006b }
            r0 = 1
            if (r1 != 0) goto L_0x0060
        L_0x005d:
            r0 = 2
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            A02 = r0     // Catch:{ all -> 0x006b }
            A03 = r3     // Catch:{ all -> 0x006b }
        L_0x0064:
            int r0 = A02     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0069
            r3 = 0
        L_0x0069:
            monitor-exit(r4)
            return r3
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EU.A01(android.content.Context):boolean");
    }

    public AnonymousClass6EU(SurfaceTexture surfaceTexture, AnonymousClass6E5 r2) {
        super(surfaceTexture);
        this.A01 = r2;
    }

    public void release() {
        super.release();
        AnonymousClass6E5 r2 = this.A01;
        synchronized (r2) {
            if (!this.A00) {
                r2.A00.getClass();
                r2.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
