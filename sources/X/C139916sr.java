package X;

import com.whatsapp.R;

/* renamed from: X.6sr  reason: invalid class name and case insensitive filesystem */
public final class C139916sr extends C150647Rq {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C139916sr) && Float.compare(this.A00, ((C139916sr) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C139916sr(float f) {
        super(R.dimen.f6nameremoved);
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Medium(strokeWidth=");
        A0o.append(this.A00);
        return AnonymousClass000.A0c(A0o);
    }
}
