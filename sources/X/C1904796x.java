package X;

import android.opengl.Matrix;
import java.util.Map;

/* renamed from: X.96x  reason: invalid class name and case insensitive filesystem */
public class C1904796x extends C195749Zj implements C203709oB {
    public AnonymousClass7J7 A00;
    public C152827aC A01;
    public final AnonymousClass7FV A02;
    public final C198159eT A03;
    public final Map A04;
    public final boolean A05;
    public final float[] A06;

    public void Bdl() {
        this.A01 = null;
        Map map = this.A04;
        for (C160457nf A032 : map.values()) {
            A032.A03();
        }
        map.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r2 != 36197) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r2 != 36197) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BRf(X.C157607ia r7, long r8) {
        /*
            r6 = this;
            X.9eT r5 = r6.A03
            boolean r3 = r5.A01
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x0010
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r3 == r0) goto L_0x0043
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0034
            java.util.Map r2 = r6.A04
            java.util.Collection r0 = r2.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r1.next()
            X.7nf r0 = (X.C160457nf) r0
            r0.A03()
            goto L_0x0021
        L_0x0031:
            r2.clear()
        L_0x0034:
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x0040
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r5.A01 = r0
        L_0x0043:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.7aC r1 = r6.A01
            java.lang.String r0 = "Called without a program factory"
            if (r1 == 0) goto L_0x00af
            java.util.Map r4 = r6.A04
            java.lang.Object r1 = r4.get(r5)
            X.7nf r1 = (X.C160457nf) r1
            if (r1 != 0) goto L_0x0075
            int r3 = X.C02440Ge.copy_vs
            int r2 = X.C02440Ge.copy_fs
            X.7aC r1 = r6.A01
            boolean r0 = r5.A01
            X.7nf r1 = r1.A01(r3, r2, r0)
            X.9eT r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0075:
            X.7Xd r2 = r1.A02()
            java.lang.String r1 = "uSurfaceTransformMatrix"
            float[] r0 = r7.A04
            r2.A02(r1, r0)
            java.lang.String r1 = "uVideoTransformMatrix"
            float[] r0 = r7.A05
            r2.A02(r1, r0)
            java.lang.String r1 = "uSceneTransformMatrix"
            float[] r0 = r7.A03
            r2.A02(r1, r0)
            java.lang.String r1 = "sTexture"
            X.7Wm r0 = r7.A01
            if (r0 == 0) goto L_0x00a8
            r2.A01(r0, r1)
            X.7J7 r1 = r6.A00
            X.7nf r0 = r2.A00
            X.C160457nf.A01(r1, r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C159217lP.A02(r0, r1)
            r0 = 1
            return r0
        L_0x00a8:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x00af:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904796x.BRf(X.7ia, long):boolean");
    }

    public C1904796x(boolean z) {
        AnonymousClass7FV r3 = new AnonymousClass7FV(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = r3;
        this.A05 = z;
        this.A04 = AnonymousClass001.A0t();
        this.A03 = new C198159eT(AnonymousClass9JX.DEFAULT);
        float[] fArr = new float[16];
        this.A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
        C150817Si r2 = new C150817Si();
        r2.A00 = 5;
        r2.A00(r3, "aPosition");
        r2.A00(new AnonymousClass7FV(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}), "aTextureCoord");
        this.A00 = new AnonymousClass7J7(r2);
    }

    public boolean isEnabled() {
        return true;
    }

    public void Bdk(C152827aC r1) {
        this.A01 = r1;
    }

    public void Blh(AnonymousClass7B5 r1) {
    }

    public C1904796x() {
        this(false);
    }
}
