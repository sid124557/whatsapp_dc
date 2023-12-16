package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3vy  reason: invalid class name and case insensitive filesystem */
public final class C79033vy extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C55532qV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79033vy(C55532qV r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A0r = C18320x8.A0r();
        List A02 = this.this$0.A04.A02();
        LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(A02));
        for (Object next : A02) {
            AnonymousClass0x2.A1H(next, A0C, ((C60222yC) next).A05.A00);
        }
        A0r.putAll(new LinkedHashMap(A0C));
        return A0r;
    }
}
