package X;

/* renamed from: X.2ey  reason: invalid class name and case insensitive filesystem */
public class C48482ey {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C48482ey r4 = (C48482ey) obj;
            if (this.A00.equals(r4.A00)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A01, C18310x6.A09(this.A00));
    }

    public C48482ey(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
