package X;

import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: X.0N5  reason: invalid class name */
public class AnonymousClass0N5 {
    public final C186588vc A00;

    public AnonymousClass0N5(C186588vc r1) {
        this.A00 = r1;
    }

    public void A00(C187478xH r8, long j) {
        Iterator it = r8.B8z().iterator();
        while (it.hasNext()) {
            NavigableSet<C172488Li> B55 = r8.B55(AnonymousClass001.A0m(it));
            if (B55 != null) {
                for (C172488Li r4 : B55) {
                    if (System.currentTimeMillis() - r4.A03 >= j) {
                        r8.BjP(r4, "ttl_eviction");
                    }
                }
            }
        }
    }
}
