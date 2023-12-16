package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.7aY  reason: invalid class name and case insensitive filesystem */
public class C153027aY {
    @Deprecated
    public float A00;
    @Deprecated
    public float A01;
    @Deprecated
    public float A02;
    @Deprecated
    public float A03;
    @Deprecated
    public float A04;
    public final List A05 = AnonymousClass001.A0s();
    public final List A06 = AnonymousClass001.A0s();

    public final void A00(float f) {
        float f2 = this.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.A02;
                float f5 = this.A03;
                AnonymousClass6ZF r2 = new AnonymousClass6ZF(f4, f5, f4, f5);
                r2.A03 = this.A00;
                r2.A04 = f3;
                this.A06.add(new AnonymousClass6ZG(r2));
                this.A00 = f;
            }
        }
    }

    public void A01(float f, float f2) {
        AnonymousClass6ZE r2 = new AnonymousClass6ZE();
        r2.A00 = f;
        r2.A01 = f2;
        this.A05.add(r2);
        AnonymousClass6ZI r4 = new AnonymousClass6ZI(r2, this.A02, this.A03);
        AnonymousClass6ZE r1 = r4.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((double) ((r1.A01 - r4.A01) / (r1.A00 - r4.A00))))) + 270.0f;
        A00(degrees);
        this.A06.add(r4);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    public void A02(float f, float f2, float f3) {
        this.A04 = f;
        this.A02 = 0.0f;
        this.A03 = f;
        this.A00 = f2;
        this.A01 = (f2 + f3) % 360.0f;
        this.A05.clear();
        this.A06.clear();
    }

    public void A03(Matrix matrix, Path path) {
        List list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass7RR r8 = (AnonymousClass7RR) list.get(i);
            if (r8 instanceof AnonymousClass6ZE) {
                AnonymousClass6ZE r82 = (AnonymousClass6ZE) r8;
                Matrix matrix2 = r82.A00;
                matrix.invert(matrix2);
                path.transform(matrix2);
                path.lineTo(r82.A00, r82.A01);
            } else {
                AnonymousClass6ZF r83 = (AnonymousClass6ZF) r8;
                Matrix matrix3 = r83.A00;
                matrix.invert(matrix3);
                path.transform(matrix3);
                RectF rectF = AnonymousClass6ZF.A06;
                rectF.set(r83.A01, r83.A05, r83.A02, r83.A00);
                path.arcTo(rectF, r83.A03, r83.A04, false);
            }
            path.transform(matrix);
        }
    }

    public C153027aY() {
        A02(0.0f, 270.0f, 0.0f);
    }
}
