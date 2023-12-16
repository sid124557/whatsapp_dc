package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.40K  reason: invalid class name */
public final class AnonymousClass40K extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C60092xz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40K(C60092xz r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set A13 = C18290x4.A13("com.bloks.www.whatsapp.commerce.address_message");
        Collection<AnonymousClass9PF> A0w = C18300x5.A0w(this.this$0.A01);
        ArrayList A0c = C73783g4.A0c(A0w);
        for (AnonymousClass9PF r0 : A0w) {
            A0c.add(r0.A01);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!C162457s7.A0P(next, "com.bloks.www.whatsapp.commerce.galaxy_message") && !C162457s7.A0P(next, "com.bloks.www.whatsapp.commerce.extensions_message_v2")) {
                A0s.add(next);
            }
        }
        return C73823g8.A01(A0s, A13);
    }
}
