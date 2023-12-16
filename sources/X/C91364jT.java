package X;

import com.whatsapp.R;

/* renamed from: X.4jT  reason: invalid class name and case insensitive filesystem */
public final class C91364jT extends C151657Vt {
    public final boolean A00;

    public C91364jT(boolean z) {
        super(z, false);
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91364jT) && this.A00 == ((C91364jT) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public Integer A01() {
        return Integer.valueOf(R.string.f11nameremoved);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Start(canStartCall=");
        return C18260x0.A0A(A0o, this.A00);
    }

    public int A00() {
        return R.string.f11nameremoved;
    }
}
