package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.83x  reason: invalid class name and case insensitive filesystem */
public class C1680483x implements C185288tO, C186198uu, C180428l3 {
    public int A00;
    public int A01;
    public C185558ts A02;
    public C185568tt A03;
    public boolean A04;
    public final C157207hv A05;
    public final C162017r3 A06;
    public final C194949Ve A07;
    public final AnonymousClass9Qu A08;
    public volatile C151087Tj A09;

    public void B1c() {
        synchronized (this.A07) {
            C151087Tj r2 = this.A09;
            this.A09 = null;
            this.A02 = null;
            if (r2 != null) {
                EGLSurface eGLSurface = r2.A00;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(r2.A01.A04, eGLSurface);
                }
                r2.A00 = EGL14.EGL_NO_SURFACE;
            }
        }
        C185568tt r0 = this.A03;
        if (r0 != null) {
            r0.BC4().Ayf(this);
        }
    }

    public void AxN(C185558ts r5) {
        C194949Ve r3 = this.A07;
        synchronized (r3) {
            this.A02 = r5;
            if (this.A09 == null) {
                C180438l4 BDQ = r5.BDQ();
                Surface A032 = r3.A03();
                A032.getClass();
                this.A09 = BDQ.B0h(A032, r5.B7E().A00 & -33);
            }
        }
    }

    public String B7H() {
        return "GlSurfaceOutput";
    }

    public Object B9B() {
        return this.A07;
    }

    public int BAH() {
        C185558ts r0 = this.A02;
        if (r0 == null || (r0.B7E().A00 & 32) == 0) {
            return 3;
        }
        return 0;
    }

    public int BAK() {
        int A012 = this.A07.A01();
        if (A012 == 1) {
            return 1;
        }
        if (A012 == 3) {
            return 3;
        }
        if (A012 != 4) {
            return 0;
        }
        return 4;
    }

    public void BFr(C185568tt r1) {
        this.A03 = r1;
    }

    public boolean BHV(AnonymousClass7Ow r7) {
        boolean z;
        C194949Ve r5 = this.A07;
        synchronized (r5) {
            if (this.A09 != null && r5.A07()) {
                long j = r7.A03;
                if (j >= 0 && ((j >= -1 && j <= -1) || j >= -1)) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public Exception BKR() {
        synchronized (this.A07) {
            C151087Tj r0 = this.A09;
            if (r0 == null) {
                this.A05.A00(C142216wp.A0Q);
                e = AnonymousClass001.A0e("Gl surface is null");
            } else {
                try {
                    r0.A00();
                    return null;
                } catch (AnonymousClass8RP e) {
                    e = e;
                    this.A05.A00(C142216wp.A0L);
                    return e;
                }
            }
        }
    }

    public void BqU() {
        synchronized (this.A07) {
            C151087Tj r1 = this.A09;
            if (r1 != null) {
                C159067l3 r0 = r1.A01;
                EGLSurface eGLSurface = r1.A00;
                synchronized (r0.A07) {
                    EGL14.eglSwapBuffers(r0.A04, eGLSurface);
                }
            } else {
                this.A05.A00(C142216wp.A0R);
            }
        }
        C185568tt r02 = this.A03;
        if (r02 != null) {
            r02.BC4().BlX(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        if (r2.A06() == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass7TK Brr(X.AnonymousClass7Ow r20) {
        /*
            r19 = this;
            r5 = r19
            X.7r3 r11 = r5.A06
            X.9Ve r2 = r5.A07
            monitor-enter(r2)
            r6 = r20
            X.7TK r7 = r6.A05     // Catch:{ all -> 0x009c }
            r3 = 0
            if (r7 == 0) goto L_0x0093
            boolean r0 = r7.A00()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x001d
            X.7hv r1 = r5.A05     // Catch:{ all -> 0x009c }
            X.6wp r0 = X.C142216wp.A0T     // Catch:{ all -> 0x009c }
            r1.A00(r0)     // Catch:{ all -> 0x009c }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            goto L_0x009b
        L_0x001d:
            X.7Tj r9 = r5.A09     // Catch:{ all -> 0x009c }
            if (r9 != 0) goto L_0x0029
            X.7hv r1 = r5.A05     // Catch:{ all -> 0x009c }
            X.6wp r0 = X.C142216wp.A0S     // Catch:{ all -> 0x009c }
            r1.A00(r0)     // Catch:{ all -> 0x009c }
            goto L_0x001b
        L_0x0029:
            X.7l3 r8 = r9.A01     // Catch:{ all -> 0x009c }
            android.opengl.EGLSurface r4 = r9.A00     // Catch:{ all -> 0x009c }
            int[] r3 = r9.A04     // Catch:{ all -> 0x009c }
            r1 = 12375(0x3057, float:1.7341E-41)
            android.opengl.EGLDisplay r0 = r8.A04     // Catch:{ all -> 0x009c }
            r10 = 0
            android.opengl.EGL14.eglQuerySurface(r0, r4, r1, r3, r10)     // Catch:{ all -> 0x009c }
            r0 = r3[r10]     // Catch:{ all -> 0x009c }
            r5.A01 = r0     // Catch:{ all -> 0x009c }
            android.opengl.EGLSurface r4 = r9.A00     // Catch:{ all -> 0x009c }
            int[] r3 = r9.A03     // Catch:{ all -> 0x009c }
            r1 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGLDisplay r0 = r8.A04     // Catch:{ all -> 0x009c }
            android.opengl.EGL14.eglQuerySurface(r0, r4, r1, r3, r10)     // Catch:{ all -> 0x009c }
            r0 = r3[r10]     // Catch:{ all -> 0x009c }
            r5.A00 = r0     // Catch:{ all -> 0x009c }
            int r1 = r2.A02()     // Catch:{ all -> 0x009c }
            r0 = 1
            if (r1 == 0) goto L_0x0054
            if (r1 != r0) goto L_0x006d
            goto L_0x005e
        L_0x0054:
            long r3 = r6.A03     // Catch:{ all -> 0x009c }
            android.opengl.EGLSurface r1 = r9.A00     // Catch:{ all -> 0x009c }
            android.opengl.EGLDisplay r0 = r8.A04     // Catch:{ all -> 0x009c }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r3)     // Catch:{ all -> 0x009c }
            goto L_0x006d
        L_0x005e:
            X.9Qu r3 = r5.A08     // Catch:{ all -> 0x009c }
            long r0 = r6.A03     // Catch:{ all -> 0x009c }
            long r3 = r3.A00(r0)     // Catch:{ all -> 0x009c }
            android.opengl.EGLSurface r1 = r9.A00     // Catch:{ all -> 0x009c }
            android.opengl.EGLDisplay r0 = r8.A04     // Catch:{ all -> 0x009c }
            android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r3)     // Catch:{ all -> 0x009c }
        L_0x006d:
            int r12 = r7.A01     // Catch:{ all -> 0x009c }
            int r13 = r7.A00     // Catch:{ all -> 0x009c }
            int r14 = r5.A01     // Catch:{ all -> 0x009c }
            int r15 = r5.A00     // Catch:{ all -> 0x009c }
            int r16 = r2.A00()     // Catch:{ all -> 0x009c }
            boolean r0 = r6.A06     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0085
            boolean r0 = r2.A06()     // Catch:{ all -> 0x009c }
            r17 = 1
            if (r0 != 0) goto L_0x0087
        L_0x0085:
            r17 = 0
        L_0x0087:
            boolean r0 = r5.A04     // Catch:{ all -> 0x009c }
            r18 = r0
            r11.A03(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x009c }
            X.7TK r3 = r11.A02()     // Catch:{ all -> 0x009c }
            goto L_0x001b
        L_0x0093:
            X.7hv r1 = r5.A05     // Catch:{ all -> 0x009c }
            X.6wp r0 = X.C142216wp.A0U     // Catch:{ all -> 0x009c }
            r1.A00(r0)     // Catch:{ all -> 0x009c }
            goto L_0x001b
        L_0x009b:
            return r3
        L_0x009c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680483x.Brr(X.7Ow):X.7TK");
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1Y(this.A07, obj);
    }

    public void release() {
        C194949Ve r1 = this.A07;
        synchronized (r1) {
            r1.A04();
        }
        C185568tt r0 = this.A03;
        if (r0 != null) {
            r0.BC4().Ayf(this);
        }
    }

    public C1680483x(C157207hv r3, C194949Ve r4) {
        this.A05 = r3;
        this.A07 = r4;
        C126176Mt r1 = new C126176Mt();
        this.A06 = r1;
        r1.A05 = "glSurfaceOutput";
        this.A08 = new AnonymousClass9Qu();
    }

    public C1680483x() {
    }
}
