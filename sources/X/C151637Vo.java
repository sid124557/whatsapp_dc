package X;

/* renamed from: X.7Vo  reason: invalid class name and case insensitive filesystem */
public class C151637Vo {
    public final C131616ds A00;
    public final boolean A01;

    public C158627kI A00(AnonymousClass7TV r5, Object obj, Object obj2) {
        C158627kI r3 = new C158627kI(r5, this, obj2, false);
        try {
            this.A00.A03(C172478Lh.A01, r3, obj, "");
        } catch (AnonymousClass8RU unused) {
        }
        return r3;
    }

    public String toString() {
        return this.A00.toString();
    }

    public C151637Vo(C131616ds r6, boolean z) {
        if ((r6.A01 instanceof C131606dr) && (r6.A01() instanceof C131636du)) {
            C153617bf r4 = r6;
            C153617bf r1 = null;
            while (true) {
                r4 = r4.A01();
                if (r4 instanceof C131606dr) {
                    break;
                }
                r1 = r4;
            }
            r1.A01 = null;
            r6.A01 = r1;
            C161297pO r3 = new C161297pO();
            r3.A02 = new C151637Vo(r6, true);
            r3.A00 = C141326vO.PATH;
            ((C131606dr) r4).A00 = AnonymousClass0x9.A1A(r3, new C161297pO[1], 0);
            r6 = new C131616ds('$');
            r6.A01 = r4;
            r6.A01 = r4;
        }
        this.A00 = r6;
        this.A01 = z;
    }
}
