package X;

/* renamed from: X.0PN  reason: invalid class name */
public class AnonymousClass0PN {
    public Object A00;
    public Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0PJ)) {
            return false;
        }
        AnonymousClass0PJ r4 = (AnonymousClass0PJ) obj;
        Object obj2 = r4.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = r4.A01;
        Object obj5 = this.A01;
        if (obj4 == obj5 || (obj4 != null && obj4.equals(obj5))) {
            return true;
        }
        return false;
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

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Pair{");
        A0o.append(String.valueOf(this.A00));
        AnonymousClass001.A1L(A0o);
        A0o.append(String.valueOf(this.A01));
        return AnonymousClass000.A0g(A0o);
    }
}
