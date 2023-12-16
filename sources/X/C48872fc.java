package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;

@Deprecated
/* renamed from: X.2fc  reason: invalid class name and case insensitive filesystem */
public class C48872fc {
    public final AnonymousClass2ZK A00;
    public final C621133n A01;
    public final C48972fm A02;

    public C59142wQ A00(C48822fX r5) {
        this.A02.A03();
        C626936e.A06(r5);
        AnonymousClass2JM A002 = this.A00.A00(new C54422oh(AnonymousClass31S.A00(r5.A01), r5.A00));
        if (A002 != null) {
            return new C59142wQ(A002.A01);
        }
        try {
            return new C59142wQ();
        } catch (IOException e) {
            Log.w("axolotl ioexception while reading fast ratchet sender key record", e);
            return new C59142wQ();
        }
    }

    public void A01(C48822fX r9, C59142wQ r10) {
        C621133n r6 = this.A01;
        C54422oh r7 = new C54422oh(AnonymousClass31S.A00(r9.A01), r9.A00);
        C130546c9 A0G = AnonymousClass1AD.DEFAULT_INSTANCE.A0G();
        Iterator it = r10.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass1CY r3 = ((C59152wR) it.next()).A00;
            AnonymousClass1AD r2 = (AnonymousClass1AD) C18320x8.A0C(A0G);
            r3.getClass();
            C188248ya r1 = r2.senderKeyStates_;
            if (!((AnonymousClass8T6) r1).A00) {
                r1 = C130786cX.A07(r1);
                r2.senderKeyStates_ = r1;
            }
            r1.add(r3);
        }
        r6.A0T(r7, C18290x4.A1Z(A0G));
    }

    public C48872fc(AnonymousClass2ZK r1, C621133n r2, C48972fm r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
