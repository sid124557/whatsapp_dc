package X;

import java.util.Set;

/* renamed from: X.4u5  reason: invalid class name and case insensitive filesystem */
public class C95664u5 extends C55702qm {
    public final /* synthetic */ C87234On A00;
    public final /* synthetic */ C113245l7 A01;
    public final /* synthetic */ C27991fJ A02;

    public C95664u5(C87234On r1, C113245l7 r2, C27991fJ r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A05(Set set) {
        C113245l7 r2 = this.A01;
        if (!r2.A2z.getGroupParticipantsManager().A0C(this.A02)) {
            this.A00.A0I.clear();
            r2.A3B.A0H();
            r2.A2f.A03();
        }
    }
}
