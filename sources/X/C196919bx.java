package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9bx  reason: invalid class name and case insensitive filesystem */
public class C196919bx implements C203009my {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public C196919bx(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    public void BOZ(C133736hr r4) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.BjL();
        AnonymousClass9U4.A00(brazilPaymentCardDetailsActivity.A0D).A03(new AnonymousClass9WS(r4, 16, this), r4);
    }

    public void BaU(AnonymousClass34V r9, List list) {
        int i;
        C198179eV r5;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.BjL();
        if (r9 == null) {
            if (list != null && !list.isEmpty()) {
                int A02 = C1899593h.A02(brazilPaymentCardDetailsActivity, list);
                JSONArray A022 = brazilPaymentCardDetailsActivity.A03.A02(list);
                if (A022 != null && !C195089Vv.A01(list)) {
                    int A0d = BrazilPayBloksActivity.A0d(list);
                    if (!brazilPaymentCardDetailsActivity.A0D.A0X(A02) || A0d == -1) {
                        r5 = null;
                    } else {
                        r5 = (C198179eV) list.get(A0d);
                    }
                    Intent A01 = brazilPaymentCardDetailsActivity.A0C.A01(brazilPaymentCardDetailsActivity, (C133736hr) brazilPaymentCardDetailsActivity.A08, r5, A022.toString(), A0d);
                    AnonymousClass98s.A0a(A01, "referral_screen", "payment_method_details");
                    brazilPaymentCardDetailsActivity.BpY(A01, 1);
                    return;
                }
            }
            i = 0;
        } else {
            int i2 = r9.A00;
            if (i2 == 443 || i2 == 10229 || (list != null && !list.isEmpty())) {
                i = r9.A00;
            } else {
                i = -233;
            }
        }
        C18260x0.A0y("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass001.A0o(), i);
        brazilPaymentCardDetailsActivity.A04.A01(brazilPaymentCardDetailsActivity, brazilPaymentCardDetailsActivity.A0D, brazilPaymentCardDetailsActivity.A08, i, R.string.f11nameremoved).show();
    }
}
