package X;

/* renamed from: X.6dU  reason: invalid class name and case insensitive filesystem */
public class C131376dU extends AnonymousClass8DK {
    public final C142796xn A00;
    public final C159187lJ A01;
    public final C159187lJ A02;

    public boolean AxC(AnonymousClass7MS r5) {
        C159187lJ r3 = this.A01;
        C159187lJ r2 = this.A02;
        if (r3 instanceof C131436da) {
            r3 = ((C131436da) r3).A07(r5);
        }
        if (r2 instanceof C131436da) {
            r2 = ((C131436da) r2).A07(r5);
        }
        C181478mp r0 = (C181478mp) AnonymousClass77P.A00.get(this.A00);
        if (r0 != null) {
            return r0.B2l(r3, r2, r5);
        }
        return false;
    }

    public String toString() {
        Object obj;
        C142796xn r2 = this.A00;
        if (r2 == C142796xn.EXISTS) {
            obj = this.A01;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A1B(this.A01, A0o);
            C18270x1.A1H(A0o, " ", r2);
            A0o.append(" ");
            AnonymousClass000.A1B(this.A02, A0o);
            obj = A0o;
        }
        return obj.toString();
    }

    public C131376dU(C142796xn r1, C159187lJ r2, C159187lJ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        toString();
    }
}
