package X;

import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3bD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70883bD implements Runnable {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ C30791n7 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final void run() {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        String str = this.A05;
        String str2 = this.A06;
        P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        PaymentBottomSheet paymentBottomSheet2 = this.A03;
        C30791n7 r8 = this.A04;
        C162457s7.A0J(str2, 2);
        C194309Sj r1 = p2mLiteOrderDetailsActivity.A0F;
        if (r1 != null) {
            r1.A01(new C67943Rg(p2mLiteConfirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, paymentBottomSheet2, r8, str2), str, "p2m-lite-buyer-check");
            return;
        }
        throw C18270x1.A0S("paymentsComplianceManager");
    }

    public /* synthetic */ C70883bD(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C30791n7 r5, String str, String str2) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = paymentBottomSheet2;
        this.A04 = r5;
    }
}
