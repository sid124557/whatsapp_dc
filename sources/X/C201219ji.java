package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9ji  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201219ji implements Runnable {
    public final /* synthetic */ C205109qR A00;
    public final /* synthetic */ C52792m3 A01;
    public final /* synthetic */ AnonymousClass9OA A02;
    public final /* synthetic */ AnonymousClass36K A03;

    public final void run() {
        C205109qR r6 = this.A00;
        AnonymousClass9OA r4 = this.A02;
        AnonymousClass36K r3 = this.A03;
        C52792m3 r5 = this.A01;
        Iterator it = C197739dn.A02(r3).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AnonymousClass34V) it.next()).A00 == 453) {
                    r4.A00.A05(true);
                    break;
                }
            } else {
                break;
            }
        }
        if (r5 != null) {
            Map A012 = ((AnonymousClass9VP) r6.A00).A01(r3);
            if (r5.A00) {
                r5.A03.A00(new C117715sN(r5, A012, "on_failure", 17));
            }
        }
    }

    public /* synthetic */ C201219ji(C205109qR r1, C52792m3 r2, AnonymousClass9OA r3, AnonymousClass36K r4) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
