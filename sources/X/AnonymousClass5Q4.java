package X;

/* renamed from: X.5Q4  reason: invalid class name */
public class AnonymousClass5Q4 {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5Q4)) {
            return false;
        }
        AnonymousClass5Q4 r4 = (AnonymousClass5Q4) obj;
        return this.A02 == r4.A02 && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public AnonymousClass5Q4(String str, boolean z, String str2) {
        this.A02 = z;
        this.A01 = str == null ? "" : str;
        this.A00 = str2 == null ? "" : str2;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = Boolean.valueOf(this.A02);
        A1X[1] = this.A01;
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
