package X;

import java.util.List;

/* renamed from: X.9jG  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200939jG implements Runnable {
    public final /* synthetic */ C196419ao A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public final void run() {
        C196419ao r4 = this.A00;
        List list = this.A01;
        List<AnonymousClass0PJ> list2 = this.A02;
        r4.A07(list);
        for (AnonymousClass0PJ r2 : list2) {
            Object obj = r2.A00;
            if (obj != null) {
                r4.A06((AnonymousClass2z0) r2.A01, ((C624034w) obj).A0K);
            }
        }
    }

    public /* synthetic */ C200939jG(C196419ao r1, List list, List list2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }
}
