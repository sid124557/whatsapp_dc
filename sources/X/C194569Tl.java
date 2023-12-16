package X;

import com.whatsapp.payments.PaymentConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Tl  reason: invalid class name and case insensitive filesystem */
public class C194569Tl {
    public final AnonymousClass36F A00;
    public final AnonymousClass8EA A01;
    public final PaymentConfiguration A02;
    public final AnonymousClass4FS A03;

    public void A03(C202439m1 r8, C166587yw r9) {
        ArrayList A0I = AnonymousClass002.A0I(1);
        A0I.add(r9);
        AnonymousClass4FS r4 = this.A03;
        C18270x1.A0w(new AnonymousClass999(r8, this.A01, this.A02, r4, "p2p_context", A0I), r4);
    }

    public void A04(C202439m1 r8, C166587yw r9, String str) {
        ArrayList A0I = AnonymousClass002.A0I(1);
        A0I.add(r9);
        AnonymousClass4FS r4 = this.A03;
        C18270x1.A0w(new AnonymousClass999(r8, this.A01, this.A02, r4, str, A0I), r4);
    }

    public static AnonymousClass3XA A00(C194569Tl r3, String str) {
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        r3.A03.BkM(new C200859j8(r2, r3, str));
        return r2;
    }

    public AnonymousClass3XA A01() {
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        this.A03.BkM(new C199899hS(r2, this));
        return r2;
    }

    public AnonymousClass3XA A02() {
        AnonymousClass3XA r2 = new AnonymousClass3XA();
        this.A03.BkM(new C199909hT(r2, this));
        return r2;
    }

    public void A05(C202439m1 r7, List list) {
        AnonymousClass4FS r4 = this.A03;
        C18270x1.A0w(new AnonymousClass998(r7, this.A01, this.A02, r4, list), r4);
    }

    public C194569Tl(AnonymousClass36F r1, AnonymousClass8EA r2, PaymentConfiguration paymentConfiguration, AnonymousClass4FS r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = paymentConfiguration;
        this.A00 = r1;
    }
}
