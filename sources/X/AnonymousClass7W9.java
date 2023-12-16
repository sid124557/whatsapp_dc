package X;

/* renamed from: X.7W9  reason: invalid class name */
public class AnonymousClass7W9 {
    public C153247av A00;
    public String A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((AnonymousClass7W9) obj).A01);
    }

    public AnonymousClass7W9(C153247av r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public int hashCode() {
        return C18310x6.A08(this.A01, AnonymousClass002.A0L(), 0);
    }
}
