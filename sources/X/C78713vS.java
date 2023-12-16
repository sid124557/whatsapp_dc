package X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.3vS  reason: invalid class name and case insensitive filesystem */
public final class C78713vS extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C183538qC $handlers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78713vS(C183538qC r2) {
        super(0);
        this.$handlers = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set<C56822sc> set = (Set) C18300x5.A0b(this.$handlers);
        C162457s7.A0J(set, 0);
        HashMap A0t = AnonymousClass001.A0t();
        for (C56822sc r1 : set) {
            String A04 = r1.A04();
            C162457s7.A0D(A04);
            A0t.put(A04, r1);
        }
        return A0t;
    }
}
