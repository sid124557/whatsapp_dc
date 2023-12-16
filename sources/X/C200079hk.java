package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9hk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200079hk implements Runnable {
    public final /* synthetic */ C194589Tn A00;
    public final /* synthetic */ Set A01;

    public final void run() {
        C194589Tn r5 = this.A00;
        Set set = this.A01;
        if (set != null) {
            AnonymousClass33p r3 = r5.A02;
            C18270x1.A0l(r3.A0U(), "payment_background_batch_require_fetch", false);
            r3.A1Y("payment_backgrounds_batch_last_fetch_timestamp");
            r5.A0A.A0A(set);
            return;
        }
        Iterator A03 = C61102zi.A03(r5.A0A);
        while (A03.hasNext()) {
            A03.next();
        }
    }

    public /* synthetic */ C200079hk(C194589Tn r1, Set set) {
        this.A00 = r1;
        this.A01 = set;
    }
}
