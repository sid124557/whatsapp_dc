package X;

import android.graphics.BitmapFactory;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9iJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200429iJ implements Runnable {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;

    public final void run() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        AnonymousClass39Q r3 = this.A00;
        C624034w A05 = AnonymousClass36F.A05(indiaUpiSendPaymentActivity.A07, (String) null, indiaUpiSendPaymentActivity.A0o);
        C52622lm r7 = new C52622lm("upi_p2p_accept_collect", (String) null, (Map) null);
        HashMap A0t = AnonymousClass001.A0t();
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.put("credential_id", indiaUpiSendPaymentActivity.A0B.A0A);
        A0t.put("selected_account", A0t2);
        C85204Fi r6 = AnonymousClass1S3.A05;
        A0t.put("display_amount", r6.B3V(indiaUpiSendPaymentActivity.A01, r3));
        Object obj = indiaUpiSendPaymentActivity.A0M.A04().A00;
        C626936e.A06(obj);
        A0t.put("sender_vpa", obj);
        String A0C = indiaUpiSendPaymentActivity.A0M.A0C();
        if (A0C == null) {
            A0C = "";
        }
        A0t.put("sender_vpa_id", A0C);
        A0t.put("receiver_vpa", indiaUpiSendPaymentActivity.A0I.A00);
        A0t.put("receiver_name", indiaUpiSendPaymentActivity.A0G.A00);
        A0t.put("amount_value", Long.valueOf((long) (r3.A00.doubleValue() * 100.0d)));
        A0t.put("amount_offset", 100);
        A0t.put("amount_currency", ((AnonymousClass3H6) r6).A04);
        A0t.put("is_merchant_payment", Boolean.valueOf(indiaUpiSendPaymentActivity.A0t));
        A0t.put("transaction_id", A05.A0K);
        A0t.put("cl_transaction_id", indiaUpiSendPaymentActivity.A0X);
        A0t.put("receiver_icon", C107245ax.A07(BitmapFactory.decodeResource(indiaUpiSendPaymentActivity.getResources(), R.drawable.avatar_contact)));
        ((AnonymousClass2YZ) indiaUpiSendPaymentActivity.A0j.get()).A00(new C205149qV(indiaUpiSendPaymentActivity, 7), new AnonymousClass9UK(indiaUpiSendPaymentActivity, 3), r7, "new_payment", A0t);
    }

    public /* synthetic */ C200429iJ(AnonymousClass39Q r1, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A01 = indiaUpiSendPaymentActivity;
        this.A00 = r1;
    }
}
