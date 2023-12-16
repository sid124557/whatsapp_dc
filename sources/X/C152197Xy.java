package X;

/* renamed from: X.7Xy  reason: invalid class name and case insensitive filesystem */
public final class C152197Xy {
    public final int A00;
    public final Class A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C152197Xy)) {
            return false;
        }
        C152197Xy r4 = (C152197Xy) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public String toString() {
        String str;
        StringBuilder A0A = C18330xA.A0A("Dependency{anInterface=");
        A0A.append(this.A01);
        A0A.append(", type=");
        if (this.A00 == 1) {
            str = "required";
        } else {
            str = "set";
        }
        A0A.append(str);
        A0A.append(", direct=");
        A0A.append(true);
        return AnonymousClass000.A0g(A0A);
    }

    public C152197Xy(Class cls, int i) {
        this.A01 = cls;
        this.A00 = i;
    }
}
