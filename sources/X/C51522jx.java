package X;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public class C51522jx {
    public byte A00;
    public C95814uZ A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C51522jx r5 = (C51522jx) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public C51522jx(C95814uZ r1, byte b) {
        this.A01 = r1;
        this.A00 = b;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A01);
        AnonymousClass001.A1L(A0o);
        return AnonymousClass000.A0h(A0o, this.A00);
    }
}
