package X;

/* renamed from: X.2ez  reason: invalid class name and case insensitive filesystem */
public class C48492ez {
    public String A00;
    public String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C48492ez r5 = (C48492ez) obj;
            if (!this.A00.equals(r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C48492ez(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A00;
        return C18310x6.A08(this.A01, A0M, 1);
    }
}
