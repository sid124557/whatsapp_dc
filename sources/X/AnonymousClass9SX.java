package X;

/* renamed from: X.9SX  reason: invalid class name */
public class AnonymousClass9SX {
    public String A00;
    public String A01;
    public String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9SX r5 = (AnonymousClass9SX) obj;
            if (!this.A02.equals(r5.A02) || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = r5.A00;
            String str2 = this.A00;
            return str == null ? str2 == null : str.equals(str2);
        }
    }

    public AnonymousClass9SX(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public int hashCode() {
        return -1;
    }
}
