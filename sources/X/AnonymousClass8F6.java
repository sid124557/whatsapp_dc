package X;

import java.util.List;

/* renamed from: X.8F6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8F6 implements C181948nc {
    public final /* synthetic */ AnonymousClass5TI A00;
    public final /* synthetic */ C112305jW A01;
    public final /* synthetic */ List A02;

    public final void BZM() {
        C112305jW r3 = this.A01;
        AnonymousClass5TI r2 = this.A00;
        List list = this.A02;
        List list2 = r2.A09;
        list2.clear();
        list2.addAll(list);
        AnonymousClass5LW r1 = r3.A0B;
        r1.A05 = r2;
        if (!list2.isEmpty() || !r2.A06.isEmpty()) {
            r1.A03 = 1;
            r3.A06();
            r3.A08();
            r3.A0D(r2);
            return;
        }
        r1.A03 = 6;
        r3.A06();
    }

    public /* synthetic */ AnonymousClass8F6(AnonymousClass5TI r1, C112305jW r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }
}
