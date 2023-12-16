package X;

/* renamed from: X.46f  reason: invalid class name and case insensitive filesystem */
public class C831246f extends C72753eE implements C85474Gj {
    public final boolean A00 = A0y();

    public C831246f(C85474Gj r2) {
        super(true);
        A0g(r2);
    }

    public boolean A0k() {
        return this.A00;
    }

    public boolean A0l() {
        return true;
    }

    public final boolean A0y() {
        C830946c r3;
        C85454Gh A0R = A0R();
        if (A0R instanceof AnonymousClass46T) {
            r3 = (C830946c) A0R;
        } else {
            r3 = null;
        }
        while (r3 != null) {
            C72753eE A06 = r3.A06();
            if (!A06.A0k()) {
                C85454Gh A0R2 = A06.A0R();
                if (!(A0R2 instanceof AnonymousClass46T)) {
                    break;
                }
                r3 = (C830946c) A0R2;
            } else {
                return true;
            }
        }
        return false;
    }
}
