package X;

/* renamed from: X.7nL  reason: invalid class name and case insensitive filesystem */
public class C160267nL {
    public static final C160267nL A04 = new C160267nL(2);
    public static final C160267nL A05 = new C160267nL(-1);
    public static final C160267nL A06 = new C160267nL(0);
    public C183588qH A00;
    public C183588qH A01;
    public C183598qI A02;
    public boolean A03;

    public void A00(Appendable appendable, String str) {
        if (!this.A01.BLM(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        if (str != null) {
            this.A02.B2i(appendable, str);
        }
        appendable.append('\"');
    }

    public C160267nL(int i) {
        C183588qH r1;
        C183598qI r0;
        boolean z = false;
        boolean A1T = AnonymousClass000.A1T(i & 1);
        boolean A1T2 = AnonymousClass000.A1T(i & 4);
        boolean A1T3 = AnonymousClass000.A1T(i & 2);
        this.A03 = (i & 16) > 0 ? true : z;
        if ((i & 8) > 0) {
            r1 = C161217pE.A02;
        } else {
            r1 = C161217pE.A03;
        }
        if (A1T2) {
            this.A01 = C161217pE.A04;
        } else {
            this.A01 = r1;
        }
        if (A1T) {
            this.A00 = C161217pE.A04;
        } else {
            this.A00 = r1;
        }
        if (A1T3) {
            r0 = C161217pE.A00;
        } else {
            r0 = C161217pE.A01;
        }
        this.A02 = r0;
    }

    public C160267nL() {
        this(0);
    }
}
