package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.6EV  reason: invalid class name */
public final class AnonymousClass6EV extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final AnonymousClass6E4 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A02(r5) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass6EV A01(android.content.Context r5, boolean r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L_0x000a
            boolean r1 = A02(r5)
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C159197lM.A02(r0)
            X.6E4 r3 = new X.6E4
            r3.<init>()
            if (r6 == 0) goto L_0x0017
            int r4 = A02
        L_0x0017:
            android.os.Looper r0 = X.AnonymousClass6C9.A0S(r3)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.8Ml r0 = new X.8Ml
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x005b }
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch:{ all -> 0x005b }
            r0.sendToTarget()     // Catch:{ all -> 0x005b }
        L_0x0035:
            X.6EV r0 = r3.A02     // Catch:{ all -> 0x005b }
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
            X.6EV r0 = r3.A02
            r0.getClass()
            return r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005b }
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EV.A01(android.content.Context, boolean):X.6EV");
    }

    public static int A00(Context context) {
        String eglQueryString;
        if ((Util.A00 >= 26 || (!"samsung".equals(Util.A03) && !"XT1650".equals(Util.A04) && context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return C18280x3.A01(eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 0);
        }
        return 0;
    }

    public static synchronized boolean A02(Context context) {
        boolean z;
        int i;
        synchronized (AnonymousClass6EV.class) {
            z = true;
            if (!A03) {
                if (Util.A00 < 24) {
                    i = 0;
                } else {
                    i = A00(context);
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    public AnonymousClass6EV(SurfaceTexture surfaceTexture, AnonymousClass6E4 r2) {
        super(surfaceTexture);
        this.A01 = r2;
    }

    public void release() {
        super.release();
        AnonymousClass6E4 r2 = this.A01;
        synchronized (r2) {
            if (!this.A00) {
                r2.A00.getClass();
                r2.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
