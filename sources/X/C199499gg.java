package X;

import java.util.Iterator;

/* renamed from: X.9gg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199499gg implements Runnable {
    public final /* synthetic */ C203969ob A00;

    public final void run() {
        C166587yw r2;
        C203969ob r5 = this.A00;
        AnonymousClass9BI r4 = (AnonymousClass9BI) r5.A00;
        Iterator it = AnonymousClass9U4.A08(r4.A04.A0D).iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = null;
                break;
            }
            r2 = C1899693i.A0C(it);
            if (r2.A03 == 2) {
                break;
            }
        }
        r4.A0A.A0S(new C200449iL(r2, r5));
    }

    public /* synthetic */ C199499gg(C203969ob r1) {
        this.A00 = r1;
    }
}
