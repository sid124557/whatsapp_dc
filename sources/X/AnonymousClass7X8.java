package X;

/* renamed from: X.7X8  reason: invalid class name */
public class AnonymousClass7X8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A05;
        String str2 = ((AnonymousClass7X8) obj).A05;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        return C18310x6.A08(this.A05, AnonymousClass002.A0L(), 0);
    }
}
