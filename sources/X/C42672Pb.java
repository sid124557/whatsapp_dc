package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Pb  reason: invalid class name and case insensitive filesystem */
public final class C42672Pb {
    public final AnonymousClass2S1 A00;
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();
    public final List A03 = AnonymousClass001.A0s();

    public C42672Pb(AnonymousClass2S1 r8, List list) {
        List list2;
        this.A00 = r8;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZF r5 = (AnonymousClass3ZF) it.next();
            if (!r5.A0Q() && r5.A0B >= this.A00.A01 && r5.A08().size() <= 32) {
                if (!r5.A0L()) {
                    list2 = this.A03;
                } else if (r5.A05 == null && r5.A0L()) {
                    list2 = this.A01;
                } else if (r5.A05 != null) {
                    list2 = this.A02;
                }
                list2.add(r5);
            }
        }
    }
}
