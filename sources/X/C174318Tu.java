package X;

import java.util.Map;
import java.util.TimerTask;

/* renamed from: X.8Tu  reason: invalid class name and case insensitive filesystem */
public final class C174318Tu extends TimerTask {
    public final /* synthetic */ C159147lC A00;
    public final /* synthetic */ Map A01;

    public C174318Tu(C159147lC r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public void run() {
        C159147lC r4 = this.A00;
        AnonymousClass7H4 r0 = r4.A08;
        C154237cq.A00(r0.A00, r0.A01, this.A01, 40);
        C203699oA r02 = r4.A03;
        if (r02 != null) {
            r02.pause();
        }
        C159147lC.A00(r4);
    }
}
