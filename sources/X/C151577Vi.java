package X;

/* renamed from: X.7Vi  reason: invalid class name and case insensitive filesystem */
public class C151577Vi {
    public final Class A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C151577Vi)) {
            return false;
        }
        C151577Vi r4 = (C151577Vi) obj;
        if (!r4.A00.equals(this.A00) || r4.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A05(Boolean.valueOf(this.A01), (this.A00.hashCode() ^ 1000003) * 1000003);
    }

    public C151577Vi(Class cls, boolean z) {
        this.A00 = cls;
        this.A01 = z;
    }
}
