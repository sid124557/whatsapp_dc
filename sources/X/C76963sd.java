package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3sd  reason: invalid class name and case insensitive filesystem */
public final class C76963sd extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C614130p this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76963sd(C614130p r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0G = this.this$0.A04.A0G();
        C614130p r4 = this.this$0;
        ArrayList A0c = C73783g4.A0c(A0G);
        Iterator it = A0G.iterator();
        while (it.hasNext()) {
            A0c.add(r4.A07.A07((C28011fL) AnonymousClass3ZH.A04(C18310x6.A0R(it))));
        }
        return A0c;
    }
}
