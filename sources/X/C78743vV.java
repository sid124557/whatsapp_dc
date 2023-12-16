package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3vV  reason: invalid class name and case insensitive filesystem */
public final class C78743vV extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass33H this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78743vV(AnonymousClass33H r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Map A03 = ((C53662nS) this.this$0.A0E.getValue()).A03();
        LinkedHashMap A0r = C18320x8.A0r();
        Iterator A0q = AnonymousClass000.A0q(A03);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (((AnonymousClass4G3) A0w.getValue()).B88() == AnonymousClass21E.STUB_MESSAGE) {
                C18270x1.A1N(A0r, A0w);
            }
        }
        LinkedHashMap A0r2 = C18320x8.A0r();
        Iterator A0q2 = AnonymousClass000.A0q(A0r);
        while (A0q2.hasNext()) {
            Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
            if (A0w2.getValue() instanceof AnonymousClass4D3) {
                C18270x1.A1N(A0r2, A0w2);
            }
        }
        ArrayList A0I = AnonymousClass002.A0I(A0r2.size());
        Iterator A0q3 = AnonymousClass000.A0q(A0r2);
        while (A0q3.hasNext()) {
            Map.Entry A0w3 = AnonymousClass001.A0w(A0q3);
            Object value = A0w3.getValue();
            C162457s7.A0K(value, "null cannot be cast to non-null type com.whatsapp.historysync.integration.deserialization.HistorySyncStubMessageParser");
            AnonymousClass4D3 r3 = (AnonymousClass4D3) value;
            A0I.add(new C52492lZ(r3, r3.B80(), C18280x3.A06(A0w3)));
        }
        List<C52492lZ> A0H = C73723fy.A0H(A0I, 22);
        LinkedHashMap A0r3 = C18320x8.A0r();
        for (C52492lZ r2 : A0H) {
            for (Object A0h : r2.A02) {
                ((List) C18310x6.A0h(A0h, A0r3)).add(r2);
            }
        }
        return A0r3;
    }
}
