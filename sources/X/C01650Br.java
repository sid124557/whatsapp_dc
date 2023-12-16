package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Br  reason: invalid class name and case insensitive filesystem */
public class C01650Br extends C09320g0 {
    public final C09270fv A00;

    public void A07(Canvas canvas, Matrix matrix, int i) {
        this.A00.B2C(canvas, matrix, i);
    }

    public void A09(AnonymousClass0WB r2, AnonymousClass0WB r3, List list, int i) {
        this.A00.Bk4(r2, r3, list, i);
    }

    public C01650Br(AnonymousClass01G r5, C04510Oo r6) {
        super(r5, r6);
        C09270fv r2 = new C09270fv(r5, new C09460gE("__container", r6.A0K, false), this);
        this.A00 = r2;
        r2.Bm3(Collections.emptyList(), Collections.emptyList());
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        super.B4p(matrix, rectF, z);
        this.A00.B4p(this.A08, rectF, z);
    }
}
