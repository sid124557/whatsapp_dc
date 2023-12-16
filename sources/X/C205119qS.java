package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet;
import java.util.ArrayList;

/* renamed from: X.9qS  reason: invalid class name and case insensitive filesystem */
public class C205119qS implements C202739mV {
    public Object A00;
    public Object A01;
    public final int A02;

    public C205119qS(AnonymousClass39L r1, IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, int i) {
        this.A02 = i;
        this.A00 = indiaUpiCheckOrderDetailsActivity;
        this.A01 = r1;
    }

    public final void BXR(AnonymousClass39S r8, C30791n7 r9) {
        if (this.A02 != 0) {
            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A00;
            AnonymousClass39L r5 = (AnonymousClass39L) this.A01;
            C141946wO A0H = indiaUpiCheckOrderDetailsActivity.A0W.A0H(r8);
            if (A0H == C141946wO.TOS_NONE || C195219Wq.A0A(indiaUpiCheckOrderDetailsActivity.A0D, r8)) {
                indiaUpiCheckOrderDetailsActivity.A8a(r5);
                return;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            if (A0H == C141946wO.TOS_V1 || A0H == C141946wO.TOS_ALL) {
                A0s.add(new C139636sN("upi_pay_privacy_policy"));
            }
            if (A0H == C141946wO.TOS_V2 || A0H == C141946wO.TOS_ALL) {
                A0s.add(new C139636sN("pay_tos_v3"));
            }
            indiaUpiCheckOrderDetailsActivity.A0M.A0D(new C204549pX(A0H, r5, indiaUpiCheckOrderDetailsActivity, 1), new C35441ws(A0s));
            return;
        }
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity2 = (IndiaUpiCheckOrderDetailsActivity) this.A00;
        AnonymousClass39L r4 = (AnonymousClass39L) this.A01;
        if (r8.A05) {
            indiaUpiCheckOrderDetailsActivity2.A8R(false);
            String BBy = indiaUpiCheckOrderDetailsActivity2.BBy();
            C162457s7.A0J(BBy, 0);
            PaymentMayBeInProgressBottomSheet paymentMayBeInProgressBottomSheet = new PaymentMayBeInProgressBottomSheet();
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("arg_receiver_name", BBy);
            paymentMayBeInProgressBottomSheet.A0u(A08);
            paymentMayBeInProgressBottomSheet.A00 = new C197469dD(r4, indiaUpiCheckOrderDetailsActivity2, paymentMayBeInProgressBottomSheet);
            indiaUpiCheckOrderDetailsActivity2.Bon(paymentMayBeInProgressBottomSheet, "PaymentMayBeInProgressBottomSheet");
            return;
        }
        indiaUpiCheckOrderDetailsActivity2.A8Q(r4);
    }
}
