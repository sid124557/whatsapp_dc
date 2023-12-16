package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3v8  reason: invalid class name and case insensitive filesystem */
public final class C78513v8 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C66383Le this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78513v8(C66383Le r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A0H = C73723fy.A0H(C73793g5.A06(((C53662nS) this.this$0.A0B.getValue()).A03()), 19);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A0H) {
            Object obj = ((AnonymousClass3Z6) next).second;
            C162457s7.A0J(obj, 0);
            if ((obj instanceof AnonymousClass4AG) && !(obj instanceof AnonymousClass3NW)) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            C162457s7.A0K(next2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, com.whatsapp.fmessage.protobuf.deserialization.FMessageProtobufDeserializer>");
            A0c.add(next2);
        }
        return A0c;
    }
}
