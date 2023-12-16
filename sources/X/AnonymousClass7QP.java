package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.Matrix;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7QP  reason: invalid class name */
public class AnonymousClass7QP {
    public int A00 = 0;
    public int A01 = -12345;
    public SurfaceTexture A02;
    public C160457nf A03;
    public C151837Wm A04;
    public C151307Uf A05;
    public C158247jf A06;
    public C151367Um A07;
    public boolean A08;
    public final EGLContext A09;
    public final EGLDisplay A0A;
    public final EGLSurface A0B;
    public final AnonymousClass7J7 A0C;
    public final C152827aC A0D;
    public final C157607ia A0E = new C157607ia();
    public final List A0F;
    public final float[] A0G;
    public final float[] A0H;
    public final float[] A0I;
    public final float[] A0J;

    public AnonymousClass7QP(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C152827aC r17, C151307Uf r18, C158247jf r19, C153537bV r20, C151367Um r21) {
        int i;
        int i2;
        C150817Si r3 = new C150817Si();
        r3.A00 = 5;
        r3.A00(new AnonymousClass7FV(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}), "aPosition");
        r3.A00(new AnonymousClass7FV(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}), "aTextureCoord");
        this.A0C = new AnonymousClass7J7(r3);
        float[] fArr = new float[16];
        this.A0I = fArr;
        float[] fArr2 = new float[16];
        this.A0G = fArr2;
        float[] fArr3 = new float[16];
        this.A0J = fArr3;
        float[] fArr4 = new float[16];
        this.A0H = fArr4;
        this.A0D = r17;
        C158247jf r2 = r19;
        this.A06 = r2;
        this.A09 = eGLContext;
        this.A0A = eGLDisplay;
        this.A0B = eGLSurface;
        boolean z = r2.A0I;
        this.A08 = z;
        if (z) {
            List list = r2.A0G;
            if (list == null) {
                list = AnonymousClass001.A0s();
                r2.A0G = list;
            }
            if (list.isEmpty()) {
                r2.A0G.add(new AnonymousClass85R(false));
            }
        }
        List list2 = this.A06.A0G;
        this.A0F = list2 == null ? Collections.emptyList() : list2;
        this.A07 = r21;
        this.A05 = r18;
        if (r18 == null) {
            C153537bV r5 = r20;
            if (r20 != null) {
                HashMap A022 = r5.A02(C142366x5.VIDEO);
                A022.getClass();
                this.A05 = C159277lY.A01(context, Uri.fromFile(AnonymousClass6C9.A0T(((C153007aW) AnonymousClass0x2.A0W(AnonymousClass001.A0u(A022))).A02).A02).toString());
            }
        }
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr4, 0);
        RectF rectF = r2.A0C;
        Matrix.translateM(fArr2, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr2, 0, r2.A0C.width(), r2.A0C.height(), 1.0f);
        if (r2.A0J) {
            if (r2.A06 % 180 != 0) {
                i = r2.A05;
                i2 = r2.A07;
            } else {
                i = r2.A07;
                i2 = r2.A05;
            }
            float width = (((float) i) * r2.A0C.width()) / (((float) i2) * r2.A0C.height());
            Matrix.scaleM(fArr4, 0, 1.0f, (((float) r2.A0A) / (r2.A09 % 180 != 0 ? 1.0f / width : width)) / ((float) r2.A08), 1.0f);
        }
        Matrix.translateM(fArr2, 0, 0.5f, 0.5f, 0.0f);
        if (r2.A0D == C142296wy.MIRROR_HORIZONTALLY) {
            Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr2, 0, (float) r2.A09, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
    }
}
