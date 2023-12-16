package X;

import java.util.Iterator;

/* renamed from: X.7mw  reason: invalid class name and case insensitive filesystem */
public final class C160047mw {
    public final C126266Ne A00;
    public final C180598lK A01;

    public static void A00(C186098uk r3, C157277i2 r4) {
        Iterator it = C18300x5.A0v(r4.A01).iterator();
        while (it.hasNext()) {
            C150297Qb r1 = (C150297Qb) it.next();
            if (r1 instanceof C126326Nk) {
                ((C126326Nk) r1).A00 = AnonymousClass0x9.A14(r3);
            }
        }
    }

    public C160047mw(C126266Ne r1, AnonymousClass857 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
