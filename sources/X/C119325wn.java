package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5wn  reason: invalid class name and case insensitive filesystem */
public final class C119325wn extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C116825qv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119325wn(C116825qv r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list = this.this$0.A02;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0c.add(new C35251wZ(C18310x6.A0T(it)));
        }
        C116825qv r0 = this.this$0;
        return new C35721xK(new C35381wm(r0.A00, new C35381wm(r0.A01, 8)), (List) A0c, 22, true);
    }
}
