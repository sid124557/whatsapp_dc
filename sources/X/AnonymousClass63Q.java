package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.63Q  reason: invalid class name */
public final class AnonymousClass63Q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass66A $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ List $results;
    public final /* synthetic */ AnonymousClass5QK this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        this.$results.add(obj);
        if (this.$results.size() == this.$inviteeJids.size()) {
            AnonymousClass5QK r2 = this.this$0;
            C86624Kv.A1D(r2.A01, r2, 40);
            List list = this.$results;
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next : list) {
                if (next instanceof C96864x7) {
                    A0s.add(next);
                }
            }
            boolean A1S = AnonymousClass0x7.A1S(A0s);
            AnonymousClass66A r1 = this.$callback;
            if (A1S) {
                if (r1 != null) {
                    r1.BdG(this.$results);
                }
            } else if (r1 != null) {
                r1.BSL(this.$results);
            }
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63Q(AnonymousClass66A r2, AnonymousClass5QK r3, List list, List list2) {
        super(1);
        this.$results = list;
        this.$inviteeJids = list2;
        this.this$0 = r3;
        this.$callback = r2;
    }
}
