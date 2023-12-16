package X;

import android.graphics.RectF;

/* renamed from: X.8Bx  reason: invalid class name and case insensitive filesystem */
public final class C170108Bx implements C181228mP {
    public final float A00;
    public final C181228mP A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C170108Bx)) {
            return false;
        }
        C170108Bx r4 = (C170108Bx) obj;
        return this.A01.equals(r4.A01) && this.A00 == r4.A00;
    }

    public float B60(RectF rectF) {
        return Math.max(0.0f, this.A01.B60(rectF) + this.A00);
    }

    public C170108Bx(C181228mP r2, float f) {
        if (r2 instanceof C170108Bx) {
            throw AnonymousClass001.A0g("adjustment");
        }
        this.A01 = r2;
        this.A00 = f;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(Float.valueOf(this.A00), A0M, 1);
    }
}
