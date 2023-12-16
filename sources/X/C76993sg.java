package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3sg  reason: invalid class name and case insensitive filesystem */
public final class C76993sg extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C614130p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76993sg(C614130p r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Iterable iterable = (Iterable) this.this$0.A09.getValue();
        C162457s7.A0J(iterable, 0);
        AnonymousClass3ZW r1 = new AnonymousClass3ZW(new C79903xN(iterable));
        LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(r1));
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            C55232q1 r0 = (C55232q1) it.next();
            AnonymousClass0x2.A1I(r0.A01, A0C, r0.A00);
        }
        return A0C;
    }
}
