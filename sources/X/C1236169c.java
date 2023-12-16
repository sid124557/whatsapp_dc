package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.payments.ui.PaymentMerchantUpsellEducationBottomSheet;

/* renamed from: X.69c  reason: invalid class name and case insensitive filesystem */
public class C1236169c implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1236169c(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        if (this.A02 != 0) {
            PaymentMerchantUpsellEducationBottomSheet paymentMerchantUpsellEducationBottomSheet = (PaymentMerchantUpsellEducationBottomSheet) this.A00;
            Context context = (Context) this.A01;
            paymentMerchantUpsellEducationBottomSheet.A1K();
            AnonymousClass5NS r0 = paymentMerchantUpsellEducationBottomSheet.A00;
            if (r0 != null) {
                AnonymousClass33p r1 = r0.A01;
                C18270x1.A0i(C18270x1.A03(r1), "smb_merchant_payment_account_nag_last_seen", r0.A00.A0H());
                AnonymousClass9U4 r02 = paymentMerchantUpsellEducationBottomSheet.A01;
                if (r02 != null) {
                    C195069Vt B9W = r02.A0G().B9W();
                    if (B9W != null) {
                        B9W.A00(context, "merchant_payment_upsell_prompt");
                        return;
                    }
                    return;
                }
                throw C18270x1.A0S("paymentsManager");
            }
            throw C18270x1.A0S("merchantEducationManager");
        }
        C93314oJ r2 = (C93314oJ) this.A00;
        C624134x A0E = r2.A1I.A0E((C624034w) this.A01);
        AnonymousClass67A A0b = C86634Kw.A0b(r2);
        if (A0E != null && A0b != null) {
            A0b.Bkr(A0E);
        }
    }
}
