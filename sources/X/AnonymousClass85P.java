package X;

import android.net.Uri;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

/* renamed from: X.85P  reason: invalid class name */
public class AnonymousClass85P implements C185808uH {
    public C149307Ly A00;
    public boolean A01 = false;
    public final AnonymousClass85Q A02;

    public boolean BRf(C157607ia r12, long j) {
        float f;
        Uri A012;
        if (!this.A01) {
            C149307Ly r2 = this.A00;
            float f2 = 0.0f;
            if (r2.A03) {
                float[] fArr = new float[4];
                Matrix.multiplyMV(fArr, 0, r12.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f3 = fArr[1];
                float[] fArr2 = new float[4];
                Matrix.multiplyMV(fArr2, 0, r12.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f4 = fArr2[1];
                f2 = ((1.0f - f3) / AnonymousClass002.A00(1.0f, -1.0f)) + (0.0f * f4);
                f = (r2.A00 * f4) + f2;
            } else {
                f = 0.0f + r2.A00;
            }
            float A002 = AnonymousClass002.A00(1.0f, -1.0f);
            float f5 = ((0.0f * A002) - 4.0f) + 0.0f;
            float f6 = ((1.0f - f2) * A002) - 4.0f;
            float f7 = (((0.0f + r2.A01) * A002) - 4.0f) + 0.0f;
            float f8 = ((1.0f - f) * A002) - 4.0f;
            AnonymousClass85Q r3 = this.A02;
            String str = r2.A02;
            if (str == null) {
                A012 = null;
            } else {
                A012 = C624635d.A01(str);
            }
            Uri uri = r3.A03;
            if (uri == null || !uri.equals(A012)) {
                r3.A00(AnonymousClass000.A1X(A012));
                r3.A0A.A00 = A012;
                r3.A03 = A012;
            }
            float[] fArr3 = C1455376g.A00;
            AnonymousClass6C9.A1J(fArr3, f5, f8);
            fArr3[2] = f7;
            fArr3[3] = f8;
            fArr3[4] = f5;
            fArr3[5] = f6;
            fArr3[6] = f7;
            fArr3[7] = f6;
            if (fArr3.length == 8) {
                r3.A0A.A01 = fArr3;
                FloatBuffer floatBuffer = r3.A0F.A01;
                floatBuffer.put(fArr3);
                floatBuffer.position(0);
                this.A01 = true;
            } else {
                throw AnonymousClass001.A0c("Positional data must contain 8 elements");
            }
        }
        return this.A02.BRf(r12, j);
    }

    public void Bdk(C152827aC r2) {
        this.A02.Bdk(r2);
    }

    public void Bdl() {
        this.A02.Bdl();
    }

    public void Blh(AnonymousClass7B5 r1) {
    }

    public boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public AnonymousClass85P(C154787dk r3, C149307Ly r4) {
        Uri A012;
        String str = r4.A02;
        if (str == null) {
            A012 = null;
        } else {
            A012 = C624635d.A01(str);
        }
        this.A02 = new AnonymousClass85Q(A012, r3);
        this.A00 = r4;
    }

    public void Bdj(int i, int i2) {
    }
}
