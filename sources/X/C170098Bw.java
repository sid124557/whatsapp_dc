package X;

import android.graphics.RectF;

/* renamed from: X.8Bw  reason: invalid class name and case insensitive filesystem */
public final class C170098Bw implements C181228mP {
    public final float A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C170098Bw) && this.A00 == ((C170098Bw) obj).A00;
        }
        return true;
    }

    public float B60(RectF rectF) {
        return this.A00 * Math.min(rectF.width(), rectF.height());
    }

    public C170098Bw(float f) {
        this.A00 = f;
    }

    public int hashCode() {
        return C18310x6.A08(Float.valueOf(this.A00), AnonymousClass002.A0L(), 0);
    }
}
