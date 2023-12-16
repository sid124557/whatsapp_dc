package X;

import java.util.Map;
import java.util.TimerTask;

/* renamed from: X.8Tv  reason: invalid class name and case insensitive filesystem */
public final class C174328Tv extends TimerTask {
    public final /* synthetic */ C159147lC A00;
    public final /* synthetic */ Map A01;

    public C174328Tv(C159147lC r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public void run() {
        C159147lC r4 = this.A00;
        AnonymousClass7H4 r1 = r4.A08;
        Map map = this.A01;
        C162457s7.A0J(map, 0);
        C154237cq.A00(r1.A00, r1.A01, map, 40);
        C203699oA r0 = r4.A03;
        if (r0 != null) {
            r0.pause();
        }
        C159147lC.A00(r4);
    }
}
