package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.99A  reason: invalid class name */
public class AnonymousClass99A extends AnonymousClass9Gf {
    public final AnonymousClass8EA A00;
    public final AnonymousClass9NK A01;
    public final String A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0A = this.A00.A0A();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            C166587yw A0C = C1899693i.A0C(it);
            if (this.A02.equals(A0C.A0A)) {
                int i = this.A01.A00;
                C133786hw r0 = (C133786hw) A0C.A08;
                if (r0 != null) {
                    r0.A04 = i;
                }
            }
        }
        AnonymousClass9O5 A0G = A0G("p2p_context", A0A);
        ArrayList A0I = AnonymousClass002.A0I(1);
        if (!A0G.A01) {
            return A0G;
        }
        Iterator it2 = A0G.A00.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C166587yw A0C2 = C1899693i.A0C(it2);
            if (this.A02.equals(A0C2.A0A)) {
                A0I.add(A0C2);
                break;
            }
        }
        return new AnonymousClass9O5(A0I, true);
    }

    public AnonymousClass99A(C202439m1 r1, AnonymousClass8EA r2, PaymentConfiguration paymentConfiguration, AnonymousClass9NK r4, AnonymousClass4FS r5, String str) {
        super(r1, r2, paymentConfiguration, r5);
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r4;
    }
}
