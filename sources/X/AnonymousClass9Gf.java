package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gf  reason: invalid class name */
public abstract class AnonymousClass9Gf extends AnonymousClass5ZM {
    public final C202439m1 A00;
    public final AnonymousClass8EA A01;
    public final PaymentConfiguration A02;
    public final AnonymousClass4FS A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass9O5 r3 = (AnonymousClass9O5) obj;
        C202439m1 r1 = this.A00;
        if (r1 != null && r3.A01) {
            r1.BMJ(r3.A00);
        }
    }

    public AnonymousClass9Gf(C202439m1 r1, AnonymousClass8EA r2, PaymentConfiguration paymentConfiguration, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = r1;
    }

    public AnonymousClass9O5 A0G(String str, List list) {
        C203719oC A002;
        ArrayList A0p = AnonymousClass000.A0p(list);
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw A0C = C1899693i.A0C(it);
            C202929mq r1 = null;
            AnonymousClass9SU A003 = this.A02.A00(A0C.A07.A03);
            if (!(A003 == null || (A002 = A003.A00()) == null || (r1 = A002.B67()) == null)) {
                r1.Axj(A0C);
            }
            A0p.add(A0C);
            if (r1 != null && !A0t.containsKey(A0C.A07.A03)) {
                A0t.put(A0C.A07.A03, r1);
            }
        }
        AnonymousClass8EA r7 = this.A01;
        boolean A0M = r7.A0M(A0p);
        ArrayList A0y = C18290x4.A0y(A0p);
        if (A0M && A0p.size() > 0) {
            Iterator A10 = C18290x4.A10(A0t);
            while (A10.hasNext()) {
                ((C202929mq) A10.next()).Awv(str, A0p);
            }
            Iterator it2 = A0p.iterator();
            while (it2.hasNext()) {
                C166587yw A0C2 = C1899693i.A0C(it2);
                C166587yw A08 = r7.A08(A0C2.A0A);
                C626936e.A06(A08);
                A0y.add(A08);
                byte[] bArr = A08.A0D;
                if (bArr == null || bArr.length <= 0) {
                    this.A03.BkM(new C201229jj(this, A0C2, A08, A0t));
                }
            }
        }
        return new AnonymousClass9O5(A0y, A0M);
    }
}
