package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9eF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198019eF implements C84134Bd {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ String A02;

    public final void AwB(Object obj) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass39Q r5 = this.A00;
        String str = this.A02;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C133776hv r0 = (C133776hv) C1899693i.A0C(it).A08;
                if (r0 != null && (r0.A01 & 1) > 0) {
                    brazilPaymentActivity.A7L(r5);
                    return;
                }
            }
        }
        if (str == null) {
            brazilPaymentActivity.A04.A03(new C205009qH(r5, 5, brazilPaymentActivity));
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(str)) {
            brazilPaymentActivity.A0X.A02(brazilPaymentActivity, "p2p_context", "request_flow");
        } else {
            brazilPaymentActivity.A7Q(str, "p2p_context", true, brazilPaymentActivity.A0d);
        }
    }

    public /* synthetic */ C198019eF(AnonymousClass39Q r1, BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A02 = str;
    }
}
