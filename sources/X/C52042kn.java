package X;

/* renamed from: X.2kn  reason: invalid class name and case insensitive filesystem */
public class C52042kn {
    public final C95814uZ A00;
    public final AnonymousClass2z0 A01;

    public static C52042kn A00(C624134x r3) {
        return new C52042kn(r3.A0o(), r3.A1J);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C52042kn) {
            C52042kn r4 = (C52042kn) obj;
            if (this.A01.equals(r4.A01)) {
                C95814uZ r1 = this.A00;
                C95814uZ r0 = r4.A00;
                if (r1 == null) {
                    if (r0 != null) {
                        return false;
                    }
                    return true;
                } else if (r1.equals(r0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.A01.hashCode() + 31) * 31) + AnonymousClass000.A07(this.A00);
    }

    public C52042kn(C95814uZ r1, AnonymousClass2z0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(this.A01, A0o);
        A0o.append(". [sender_jid=");
        return AnonymousClass000.A0S(this.A00, A0o);
    }
}
