package X;

import android.graphics.RectF;

/* renamed from: X.8Bv  reason: invalid class name and case insensitive filesystem */
public final class C170088Bv implements C181228mP {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C170088Bv) && this.A00 == ((C170088Bv) obj).A00;
        }
        return true;
    }

    public float B60(RectF rectF) {
        return this.A00;
    }

    public C170088Bv(float f) {
        this.A00 = f;
    }

    public int hashCode() {
        return C18310x6.A08(Float.valueOf(this.A00), AnonymousClass002.A0L(), 0);
    }
}
