package X;

import android.opengl.Matrix;
import java.util.Map;

/* renamed from: X.85R  reason: invalid class name */
public class AnonymousClass85R implements C185808uH {
    public int A00;
    public AnonymousClass7J7 A01;
    public C152827aC A02;
    public boolean A03;
    public final AnonymousClass7FV A04;
    public final AnonymousClass8LL A05;
    public final Map A06;
    public final float[] A07;

    public void Bdl() {
        this.A02 = null;
        this.A06.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 != 36197) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2 != 36197) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BRf(X.C157607ia r7, long r8) {
        /*
            r6 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            X.8LL r5 = r6.A05
            boolean r3 = r5.A01
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x0015
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r3 == r0) goto L_0x002c
            java.util.Map r0 = r6.A06
            r0.clear()
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x0029
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r5.A01 = r0
        L_0x002c:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.7aC r0 = r6.A02
            if (r0 == 0) goto L_0x00d5
            java.util.Map r4 = r6.A06
            java.lang.Object r1 = r4.get(r5)
            X.7nf r1 = (X.C160457nf) r1
            if (r1 != 0) goto L_0x0066
            int r1 = r6.A00
            r0 = 6
            if (r1 == r0) goto L_0x00b0
            r0 = 7
            if (r1 == r0) goto L_0x00a1
            X.7aC r3 = r6.A02
            r2 = 2132017176(0x7f140018, float:1.9672623E38)
            r1 = 2132017175(0x7f140017, float:1.967262E38)
            boolean r0 = r6.A03
            X.7nf r1 = r3.A01(r2, r1, r0)
        L_0x005f:
            X.8LL r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0066:
            X.7Xd r2 = r1.A02()
            java.lang.String r1 = "uSTMatrix"
            float[] r0 = r7.A04
            r2.A02(r1, r0)
            java.lang.String r1 = "uConstMatrix"
            float[] r0 = r7.A05
            r2.A02(r1, r0)
            java.lang.String r1 = "uSceneMatrix"
            float[] r0 = r7.A03
            r2.A02(r1, r0)
            java.lang.String r1 = "uContentTransform"
            float[] r0 = r7.A02
            r2.A02(r1, r0)
            java.lang.String r1 = "sTexture"
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x00ce
            r2.A01(r0, r1)
            X.7J7 r1 = r6.A01
            X.7nf r0 = r2.A00
            X.C160457nf.A01(r1, r0)
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0U()
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C159217lP.A02(r0, r1)
            r0 = 1
            return r0
        L_0x00a1:
            X.7aC r3 = r6.A02     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017205(0x7f140035, float:1.9672682E38)
            r1 = 2132017200(0x7f140030, float:1.9672672E38)
            boolean r0 = r6.A03     // Catch:{ Exception -> 0x00bf }
            X.7nf r1 = r3.A01(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00b0:
            X.7aC r3 = r6.A02     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017205(0x7f140035, float:1.9672682E38)
            r1 = 2132017202(0x7f140032, float:1.9672676E38)
            boolean r0 = r6.A03     // Catch:{ Exception -> 0x00bf }
            X.7nf r1 = r3.A01(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00bf:
            X.7aC r3 = r6.A02
            r2 = 2132017176(0x7f140018, float:1.9672623E38)
            r1 = 2132017175(0x7f140017, float:1.967262E38)
            boolean r0 = r6.A03
            X.7nf r1 = r3.A01(r2, r1, r0)
            goto L_0x005f
        L_0x00ce:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00d5:
            java.lang.String r0 = "cannot be null"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass85R.BRf(X.7ia, long):boolean");
    }

    public void Bdk(C152827aC r1) {
        this.A02 = r1;
    }

    public void Blh(AnonymousClass7B5 r1) {
    }

    public boolean isEnabled() {
        return false;
    }

    public AnonymousClass85R(boolean z) {
        this.A03 = false;
        AnonymousClass7FV r3 = new AnonymousClass7FV(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A04 = r3;
        this.A00 = 0;
        this.A06 = AnonymousClass001.A0t();
        this.A05 = new AnonymousClass8LL(C141196vB.DEFAULT);
        float[] fArr = new float[16];
        this.A07 = fArr;
        Matrix.setIdentityM(fArr, 0);
        C150817Si r2 = new C150817Si();
        r2.A00 = 5;
        r2.A00(r3, "aPosition");
        r2.A00(new AnonymousClass7FV(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}), "aTextureCoord");
        this.A01 = new AnonymousClass7J7(r2);
        this.A03 = z;
    }

    public void Bdj(int i, int i2) {
    }

    public AnonymousClass85R() {
        this(true);
    }
}
