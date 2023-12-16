package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.9Wn  reason: invalid class name and case insensitive filesystem */
public class C195199Wn implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public C195199Wn(IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity, int i) {
        this.A01 = i;
        this.A00 = indiaUpiMandatePaymentActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            C204409pJ.A00(((AnonymousClass043) dialogInterface).A00.A0G, dialogInterface, obj, 13);
            return;
        }
        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) obj;
        C204409pJ.A00(((AnonymousClass043) dialogInterface).A00.A0G, dialogInterface, indiaUpiMandatePaymentActivity, 12);
        indiaUpiMandatePaymentActivity.A0S.BKC(C18290x4.A0Z(), (Integer) null, "decline_mandate_dialogue", indiaUpiMandatePaymentActivity.A04, true);
    }
}
