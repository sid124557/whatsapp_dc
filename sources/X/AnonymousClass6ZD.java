package X;

import android.graphics.RectF;

/* renamed from: X.6ZD  reason: invalid class name */
public class AnonymousClass6ZD extends AnonymousClass6D7 {
    public final RectF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6ZD(C161877ql r2) {
        super(r2 == null ? new C161877ql() : r2);
        this.A00 = AnonymousClass002.A07();
    }

    public void A0E(float f, float f2, float f3, float f4) {
        RectF rectF = this.A00;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
