package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9by  reason: invalid class name and case insensitive filesystem */
public class C196929by implements C203009my {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public C196929by(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public void BOZ(C133736hr r4) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        AnonymousClass9U4.A00(this.A00.A0P).A03(new C195189Wm(this, 5), r4);
    }

    public void BaU(AnonymousClass34V r12, List list) {
        int i;
        AnonymousClass1VX r7;
        C196709bc r5;
        C198179eV r8;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.BjL();
        if (r12 == null) {
            if (list == null || list.isEmpty()) {
                brazilPaymentActivity.A0O.A03(brazilPaymentActivity.A00, "error_code", (long) 0);
                r5 = brazilPaymentActivity.A0A;
                r7 = brazilPaymentActivity.A0D;
                i = R.string.f11nameremoved;
                r5.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0K, 0, i).show();
            }
            int A02 = C1899593h.A02(brazilPaymentActivity, list);
            JSONArray A022 = brazilPaymentActivity.A09.A02(list);
            if (A022 != null && !C195089Vv.A01(list)) {
                int A0d = BrazilPayBloksActivity.A0d(list);
                if (!brazilPaymentActivity.A0D.A0X(A02) || A0d == -1) {
                    r8 = null;
                } else {
                    r8 = (C198179eV) list.get(A0d);
                }
                String str = this.A01;
                String obj = A022.toString();
                C133736hr r72 = (C133736hr) AnonymousClass9U4.A02(brazilPaymentActivity.A0P, str);
                if (r72 != null) {
                    Intent A012 = brazilPaymentActivity.A0S.A01(brazilPaymentActivity, r72, r8, obj, A0d);
                    AnonymousClass98s.A0a(A012, "referral_screen", "verify_to_pay");
                    brazilPaymentActivity.BpY(A012, 1);
                    return;
                }
                return;
            }
        }
        C18260x0.A0y("PAY: BrazilGetVerificationMethods Error: ", AnonymousClass001.A0o(), 0);
        brazilPaymentActivity.A0O.A03(brazilPaymentActivity.A00, "error_code", (long) 0);
        r5 = brazilPaymentActivity.A0A;
        r7 = brazilPaymentActivity.A0D;
        i = R.string.f11nameremoved;
        r5.A01(brazilPaymentActivity, r7, brazilPaymentActivity.A0K, 0, i).show();
    }
}
