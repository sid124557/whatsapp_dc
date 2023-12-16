package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.5sq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C118005sq implements AnonymousClass4C1 {
    public final /* synthetic */ C149467Mo A00;
    public final /* synthetic */ AnonymousClass4C1 A01;

    public final Object get() {
        C149467Mo r0 = this.A00;
        AnonymousClass4C1 r1 = this.A01;
        List list = (List) r0.A03.get();
        Set set = (Set) r1.get();
        ArrayList A0p = AnonymousClass000.A0p(list);
        for (Object next : list) {
            if (!set.contains(next)) {
                A0p.add(next);
            }
        }
        return A0p;
    }

    public /* synthetic */ C118005sq(C149467Mo r1, AnonymousClass4C1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
