package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9pB  reason: invalid class name and case insensitive filesystem */
public class C204329pB implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public C204329pB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.A01) {
            case 0:
                AnonymousClass9BY r1 = (AnonymousClass9BY) this.A00;
                r1.BXr(C1899693i.A0D(r1.A0F.A00, i));
                return;
            case 1:
                IndiaUpiPaymentMethodSelectionActivity indiaUpiPaymentMethodSelectionActivity = (IndiaUpiPaymentMethodSelectionActivity) this.A00;
                C166587yw A0D = C1899693i.A0D(indiaUpiPaymentMethodSelectionActivity.A01.A00, i);
                AnonymousClass99H r0 = (AnonymousClass99H) A0D.A08;
                if (r0 == null || AnonymousClass99H.A00(r0)) {
                    C52622lm r7 = new C52622lm("upi_p2p_check_balance", (String) null, (Map) null);
                    HashMap A0t = AnonymousClass001.A0t();
                    A0t.put("credential_id", A0D.A0A);
                    indiaUpiPaymentMethodSelectionActivity.A05.A0G(0, R.string.f11nameremoved);
                    ((AnonymousClass2YZ) indiaUpiPaymentMethodSelectionActivity.A02.get()).A00(new C205149qV(indiaUpiPaymentMethodSelectionActivity, 6), new AnonymousClass9UK(indiaUpiPaymentMethodSelectionActivity, 2), r7, "payment_method_picker", A0t);
                    return;
                }
                C621433s.A01(indiaUpiPaymentMethodSelectionActivity, 29);
                return;
            default:
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this.A00;
                paymentSettingsFragment.BXr(C1899693i.A0D(paymentSettingsFragment.A0s.A00, i));
                C203499no r12 = paymentSettingsFragment.A0x.A0B;
                C626936e.A06(r12);
                r12.BKB(1, 181, "payment_home", "payment_home");
                return;
        }
    }
}
