package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9qD  reason: invalid class name and case insensitive filesystem */
public class C204969qD implements C84134Bd {
    public Object A00;
    public String A01;
    public final int A02;

    public C204969qD(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void AwB(Object obj) {
        C133736hr r1;
        if (this.A02 != 0) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
            String str = this.A01;
            if (AnonymousClass001.A1Z(obj)) {
                brazilPaymentActivity.A04.BkM(new C200249i1(brazilPaymentActivity, str));
                return;
            }
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
        String str2 = this.A01;
        if (AnonymousClass001.A1Z(obj) && (r1 = (C133736hr) brazilPayBloksActivity.A05.A08(str2)) != null) {
            brazilPayBloksActivity.startActivity(brazilPayBloksActivity.A0L.A00(brazilPayBloksActivity, r1));
        }
        brazilPayBloksActivity.finish();
    }
}
