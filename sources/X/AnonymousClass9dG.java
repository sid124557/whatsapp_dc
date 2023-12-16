package X;

import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

/* renamed from: X.9dG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9dG implements C202809mc {
    public final /* synthetic */ AnonymousClass39L A00;
    public final /* synthetic */ C95814uZ A01;
    public final /* synthetic */ BrazilOrderDetailsActivity A02;
    public final /* synthetic */ AnonymousClass9XZ A03;
    public final /* synthetic */ C194069Rl A04;
    public final /* synthetic */ C194069Rl A05;
    public final /* synthetic */ AnonymousClass4DV A06;
    public final /* synthetic */ String A07;

    public final void Avp(String str) {
        AnonymousClass394 r2;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A02;
        AnonymousClass39L r7 = this.A00;
        AnonymousClass4DV r5 = this.A06;
        AnonymousClass9XZ r4 = this.A03;
        C194069Rl r3 = this.A04;
        C95814uZ r8 = this.A01;
        C194069Rl r22 = this.A05;
        String str2 = this.A07;
        short s = -1;
        switch (str.hashCode()) {
            case -2032781930:
                s = C1899693i.A0g("WhatsappPay", str);
                break;
            case -611537030:
                s = C1899693i.A0h("CustomPaymentInstructions", str);
                break;
            case 111007:
                s = C1899693i.A0i("pix", str);
                break;
        }
        switch (s) {
            case 0:
                brazilOrderDetailsActivity.A7V(r7, r4, r5, "payment_options_prompt");
                return;
            case 1:
                for (C195339Xj r1 : r3.A04) {
                    if (r1.A0A.equals(str)) {
                        C626936e.A06(r8);
                        String str3 = r1.A06;
                        C626936e.A06(r8);
                        C626936e.A06(str3);
                        PaymentCustomInstructionsBottomSheet A002 = PaymentCustomInstructionsBottomSheet.A00(r8, str3, "payment_options_prompt", brazilOrderDetailsActivity.A0D.A0X(1345));
                        A002.A04.A00 = brazilOrderDetailsActivity;
                        C86644Kx.A1C(A002, brazilOrderDetailsActivity);
                    }
                }
                return;
            case 2:
                if (r22 != null && (r2 = r22.A03) != null) {
                    String str4 = r2.A01;
                    if ("pix_static_code".equals(str4) || "pix_dynamic_code".equals(str4)) {
                        C85184Fg r9 = r2.A00;
                        if (r9 instanceof AnonymousClass3SR) {
                            C626936e.A06(r8);
                            C626936e.A06(str2);
                            C626936e.A06(r7);
                            brazilOrderDetailsActivity.A7U(r7, r8, (AnonymousClass3SR) r9, str2, "payment_options_prompt");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C1899593h.A1Q("BrazilOrderDetailsActivity", "Bottom sheet click callback - This payment method is not supported");
                return;
        }
    }

    public /* synthetic */ AnonymousClass9dG(AnonymousClass39L r1, C95814uZ r2, BrazilOrderDetailsActivity brazilOrderDetailsActivity, AnonymousClass9XZ r4, C194069Rl r5, C194069Rl r6, AnonymousClass4DV r7, String str) {
        this.A02 = brazilOrderDetailsActivity;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = str;
    }
}
