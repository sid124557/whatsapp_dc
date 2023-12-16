package X;

/* renamed from: X.0PJ  reason: invalid class name */
public class AnonymousClass0PJ {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0PJ)) {
            return false;
        }
        AnonymousClass0PJ r4 = (AnonymousClass0PJ) obj;
        if (!C04880Ra.A01(r4.A00, this.A00) || !C04880Ra.A01(r4.A01, this.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A07 = AnonymousClass000.A07(this.A00);
        Object obj = this.A01;
        if (obj != null) {
            i = obj.hashCode();
        }
        return A07 ^ i;
    }

    public AnonymousClass0PJ(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Pair{");
        A0o.append(this.A00);
        AnonymousClass001.A1L(A0o);
        A0o.append(this.A01);
        return AnonymousClass000.A0g(A0o);
    }
}
