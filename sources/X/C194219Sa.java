package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9Sa  reason: invalid class name and case insensitive filesystem */
public class C194219Sa {
    public final AnonymousClass8EA A00;
    public final AnonymousClass2YZ A01;
    public final C194259Se A02;

    public C194219Sa(AnonymousClass8EA r1, AnonymousClass2YZ r2, C194259Se r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public AnonymousClass3XA A00(C202839mf r12, AnonymousClass4B3 r13, C182908pB r14, String str) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("action", "start");
        A0t.put("presentation_style_type", "modal");
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("device_id", this.A02.A01());
        AnonymousClass2YZ r5 = this.A01;
        C161447pg r3 = r5.A01;
        r3.A0E(A0t2);
        C52622lm r8 = new C52622lm("br_p2m_checkout_add_card", (String) null, A0t);
        AnonymousClass3XA r1 = new AnonymousClass3XA();
        r3.A0P.put("PaymentData", r14);
        r5.A00(r13, new C197579dX(r1, r12, this), r8, str, (Map) null);
        return r1;
    }

    public AnonymousClass3XA A01(C202839mf r10, AnonymousClass4B3 r11, C182908pB r12, String str, String str2) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("action", "start");
        A0t.put("credential_id", str);
        C133736hr r0 = (C133736hr) this.A00.A08(str);
        if (r0 != null) {
            A0t.put("network", C133736hr.A02(r0.A01));
        }
        A0t.put("device_id", this.A02.A01());
        C52622lm r6 = new C52622lm("br_p2p_verify_card", "CardAddedScreen", A0t);
        AnonymousClass3XA r1 = new AnonymousClass3XA();
        AnonymousClass2YZ r3 = this.A01;
        r3.A01.A0P.put("PaymentData", r12);
        r3.A00(r11, new C197579dX(r1, r10, this), r6, str2, (Map) null);
        return r1;
    }
}
