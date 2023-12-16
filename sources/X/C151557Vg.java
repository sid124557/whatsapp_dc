package X;

/* renamed from: X.7Vg  reason: invalid class name and case insensitive filesystem */
public final class C151557Vg {
    public final Object A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C151557Vg) {
                C151557Vg r5 = (C151557Vg) obj;
                if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, System.identityHashCode(this.A00) * 31);
    }

    public C151557Vg(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }
}
