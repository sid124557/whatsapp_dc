package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9bw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C196909bw implements C202539mB {
    public final /* synthetic */ C133736hr A00;
    public final /* synthetic */ C203009my A01;
    public final /* synthetic */ AnonymousClass9S9 A02;

    public final void BQz(C133736hr r6, AnonymousClass34V r7, ArrayList arrayList, boolean z) {
        AnonymousClass9WS r1;
        AnonymousClass9S9 r0 = this.A02;
        C203009my r4 = this.A01;
        C133736hr r3 = this.A00;
        if (r7 == null) {
            C194569Tl A002 = AnonymousClass9U4.A00(r0.A09);
            if (z) {
                r1 = new AnonymousClass9WS(r3, 5, r4);
            } else {
                r1 = new AnonymousClass9WS(arrayList, 6, r4);
            }
            A002.A03(r1, r6);
            return;
        }
        r4.BaU(r7, (List) null);
    }

    public /* synthetic */ C196909bw(C133736hr r1, C203009my r2, AnonymousClass9S9 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
