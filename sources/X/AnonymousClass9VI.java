package X;

import com.whatsapp.R;

/* renamed from: X.9VI  reason: invalid class name */
public final class AnonymousClass9VI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass9VI(int i) {
        this(-1, i, R.dimen.f6nameremoved, R.dimen.f6nameremoved);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass9VI)) {
            return false;
        }
        AnonymousClass9VI r4 = (AnonymousClass9VI) obj;
        return this.A02 == r4.A02 && this.A01 == r4.A01;
    }

    public int hashCode() {
        return ((this.A02 + 31) * 31) + this.A01;
    }

    public AnonymousClass9VI(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
    }
}
