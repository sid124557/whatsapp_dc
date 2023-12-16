package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.7Oz  reason: invalid class name and case insensitive filesystem */
public class C150057Oz {
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public final Surface A03;
    public final C152827aC A04;
    public final C151367Um A05;
    public final /* synthetic */ AnonymousClass7BA A06;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0262  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C150057Oz(android.content.Context r36, android.view.Surface r37, X.C151307Uf r38, X.C158247jf r39, X.C153537bV r40, X.AnonymousClass7BA r41, X.C151367Um r42) {
        /*
            r35 = this;
            r4 = 0
            r13 = r35
            r3 = r41
            r13.A06 = r3
            r13.<init>()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r13.A01 = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r13.A00 = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r13.A02 = r0
            r12 = r42
            r13.A05 = r12
            r26 = r36
            android.content.res.Resources r1 = r26.getResources()
            X.7aC r0 = new X.7aC
            r0.<init>(r1)
            r13.A04 = r0
            r0 = r37
            r13.A03 = r0
            X.7QP r0 = r3.A00
            if (r0 != 0) goto L_0x025c
            r9 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r9)
            r13.A01 = r1
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r1 == r0) goto L_0x0236
            r7 = 2
            int[] r0 = new int[r7]
            r5 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r1, r0, r9, r0, r5)
            if (r0 == 0) goto L_0x022d
            android.view.Surface r11 = r13.A03
            r25 = 4
            r24 = 4
            if (r11 != 0) goto L_0x004e
            r24 = 1
        L_0x004e:
            r23 = 12325(0x3025, float:1.7271E-41)
            r22 = 9
            r21 = 12321(0x3021, float:1.7265E-41)
            r8 = 7
            r20 = 12322(0x3022, float:1.7267E-41)
            r6 = 6
            r19 = 12323(0x3023, float:1.7268E-41)
            r18 = 12324(0x3024, float:1.727E-41)
            r17 = 12352(0x3040, float:1.7309E-41)
            r10 = 17
            r1 = 5
            r14 = 3
            r16 = 12344(0x3038, float:1.7298E-41)
            r2 = 10
            r0 = 8
            int[] r15 = new int[r10]
            r15[r9] = r17
            r15[r5] = r25
            r15[r7] = r18
            r15[r14] = r0
            r15[r25] = r19
            r15[r1] = r0
            r15[r6] = r20
            r15[r8] = r0
            r15[r0] = r21
            r15[r22] = r0
            r15[r2] = r23
            r0 = 11
            r15[r0] = r9
            r2 = 12327(0x3027, float:1.7274E-41)
            r0 = 12
            r15[r0] = r2
            r0 = 13
            r15[r0] = r16
            r2 = 14
            r0 = 12339(0x3033, float:1.729E-41)
            r15[r2] = r0
            r0 = 15
            r15[r0] = r24
            r0 = 16
            r15[r0] = r16
            android.opengl.EGLConfig[] r10 = new android.opengl.EGLConfig[r5]
            int[] r2 = new int[r5]
            android.opengl.EGLDisplay r0 = r13.A01
            r7 = 0
            r21 = r9
            r24 = r9
            r17 = r0
            r18 = r15
            r19 = r9
            r20 = r10
            r22 = r5
            r23 = r2
            boolean r0 = android.opengl.EGL14.eglChooseConfig(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r0 == 0) goto L_0x0226
            int[] r15 = new int[r14]
            r15 = {12440, 2, 12344} // fill-array
            android.opengl.EGLDisplay r14 = r13.A01
            r2 = r10[r9]
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglCreateContext(r14, r2, r0, r15, r9)
            r13.A00 = r0
            java.lang.String r0 = "eglCreateContext"
            X.C159217lP.A01(r0)
            android.opengl.EGLContext r0 = r13.A00
            if (r0 == 0) goto L_0x021f
            int[] r2 = new int[r5]
            r2[r9] = r16
            if (r11 == 0) goto L_0x00ff
            android.opengl.EGLDisplay r1 = r13.A01
            r0 = r10[r9]
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreateWindowSurface(r1, r0, r11, r2, r9)
        L_0x00e1:
            r13.A02 = r0
            java.lang.String r0 = "eglCreateWindowSurface"
            X.C159217lP.A01(r0)
            android.opengl.EGLSurface r2 = r13.A02
            if (r2 == 0) goto L_0x0218
            android.opengl.EGLContext r1 = r13.A00
            if (r1 == 0) goto L_0x010d
            android.opengl.EGLDisplay r0 = r13.A01
            boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r2, r2, r1)
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "eglMakeCurrent failed"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x00ff:
            int[] r2 = new int[r1]
            r2 = {12375, 8, 12374, 8, 12344} // fill-array
            android.opengl.EGLDisplay r1 = r13.A01
            r0 = r10[r9]
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r0, r2, r9)
            goto L_0x00e1
        L_0x010d:
            X.7BA r11 = r13.A06
            X.7aC r10 = r13.A04
            android.opengl.EGLContext r9 = r13.A00
            r9.getClass()
            android.opengl.EGLDisplay r1 = r13.A01
            r1.getClass()
            android.opengl.EGLSurface r0 = r13.A02
            r0.getClass()
            X.7QP r2 = new X.7QP
            r31 = r38
            r32 = r39
            r33 = r40
            r25 = r2
            r27 = r9
            r28 = r1
            r29 = r0
            r30 = r10
            r34 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r11.A00 = r2
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r1, r1, r1, r0)
            X.7Uf r0 = r2.A05
            if (r0 == 0) goto L_0x0151
            int r1 = r0.A02
            if (r1 == r6) goto L_0x0149
            if (r1 != r8) goto L_0x0151
        L_0x0149:
            X.7Um r0 = r2.A07
            boolean r0 = r0 instanceof X.AnonymousClass6O6
            if (r0 == 0) goto L_0x0151
            r2.A00 = r1
        L_0x0151:
            int r0 = r2.A00
            if (r0 != r6) goto L_0x0162
            X.7aC r9 = r2.A0D     // Catch:{ Exception -> 0x0182 }
            r1 = 2132017205(0x7f140035, float:1.9672682E38)
            r0 = 2132017202(0x7f140032, float:1.9672676E38)
            X.7nf r0 = X.C152827aC.A00(r9, r1, r0)     // Catch:{ Exception -> 0x0182 }
            goto L_0x0170
        L_0x0162:
            if (r0 != r8) goto L_0x0173
            X.7aC r9 = r2.A0D     // Catch:{ Exception -> 0x0182 }
            r1 = 2132017205(0x7f140035, float:1.9672682E38)
            r0 = 2132017200(0x7f140030, float:1.9672672E38)
            X.7nf r0 = X.C152827aC.A00(r9, r1, r0)     // Catch:{ Exception -> 0x0182 }
        L_0x0170:
            r2.A03 = r0     // Catch:{ Exception -> 0x0182 }
            goto L_0x0190
        L_0x0173:
            X.7aC r9 = r2.A0D
            r1 = 2132017204(0x7f140034, float:1.967268E38)
            r0 = 2132017201(0x7f140031, float:1.9672674E38)
            X.7nf r0 = X.C152827aC.A00(r9, r1, r0)
            r2.A03 = r0
            goto L_0x0190
        L_0x0182:
            X.7aC r9 = r2.A0D
            r1 = 2132017204(0x7f140034, float:1.967268E38)
            r0 = 2132017201(0x7f140031, float:1.9672674E38)
            X.7nf r0 = X.C152827aC.A00(r9, r1, r0)
            r2.A03 = r0
        L_0x0190:
            java.util.List r6 = r2.A0F
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01de
            java.lang.String r0 = "SimpleFrameRenderer"
            X.7Ov r5 = new X.7Ov
            r5.<init>(r0)
            android.util.SparseIntArray r0 = r5.A06
            X.AnonymousClass6C8.A0x(r0)
            boolean r1 = r2.A08
            r0 = 36197(0x8d65, float:5.0723E-41)
            if (r1 == 0) goto L_0x01ad
            r0 = 3553(0xde1, float:4.979E-42)
        L_0x01ad:
            r5.A01 = r0
            X.7Wm r0 = new X.7Wm
            r0.<init>(r5)
            r2.A04 = r0
            java.util.Iterator r8 = r6.iterator()
        L_0x01ba:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x023d
            java.lang.Object r5 = r8.next()
            X.8uH r5 = (X.C185808uH) r5
            boolean r0 = r5 instanceof X.AnonymousClass85R
            if (r0 == 0) goto L_0x01d1
            r1 = r5
            X.85R r1 = (X.AnonymousClass85R) r1
            int r0 = r2.A00
            r1.A00 = r0
        L_0x01d1:
            r5.Bdk(r9)
            X.7jf r0 = r2.A06
            int r1 = r0.A0A
            int r0 = r0.A08
            r5.Bdj(r1, r0)
            goto L_0x01ba
        L_0x01de:
            int[] r0 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r0, r7)
            r0 = r0[r7]
            r2.A01 = r0
            r5 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r5, r0)
            java.lang.String r1 = "glBindTexture mTextureID"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C159217lP.A02(r1, r0)
            r1 = 10241(0x2801, float:1.435E-41)
            r0 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r5, r1, r0)
            r1 = 10240(0x2800, float:1.4349E-41)
            r0 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r5, r1, r0)
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r1)
            r0 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r5, r0, r1)
            java.lang.String r1 = "glTexParameter"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            X.C159217lP.A02(r1, r0)
            goto L_0x0244
        L_0x0218:
            java.lang.String r0 = "surface was null"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x021f:
            java.lang.String r0 = "null context"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0226:
            java.lang.String r0 = "unable to find RGB888+recordable ES2 EGL config"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x022d:
            r13.A01 = r4
            java.lang.String r0 = "unable to initialize EGL14"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0236:
            java.lang.String r0 = "unable to get EGL14 display"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x023d:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = "video texture"
            X.C159217lP.A02(r0, r1)
        L_0x0244:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0262
            X.7Wm r1 = r2.A04
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C159297la.A02(r0, r4)
            int r1 = r1.A00
        L_0x0255:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r2.A02 = r0
        L_0x025c:
            X.7QP r0 = r3.A00
            r0.getClass()
            return
        L_0x0262:
            int r1 = r2.A01
            goto L_0x0255
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150057Oz.<init>(android.content.Context, android.view.Surface, X.7Uf, X.7jf, X.7bV, X.7BA, X.7Um):void");
    }
}
