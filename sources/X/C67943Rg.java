package X;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3Rg  reason: invalid class name and case insensitive filesystem */
public final class C67943Rg implements C203109n8 {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ C30791n7 A04;
    public final /* synthetic */ String A05;

    public void BS6(AnonymousClass34V r11) {
        C162457s7.A0J(r11, 0);
        P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = this.A00;
        LinearLayout linearLayout = p2mLiteConfirmLegalNameBottomSheetFragment.A01;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            ProgressBar progressBar = p2mLiteConfirmLegalNameBottomSheetFragment.A02;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                int i = r11.A00;
                P2mLiteOrderDetailsActivity.A0C(p2mLiteConfirmLegalNameBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A03, this.A02, this.A04, this.A05, "enter_name", i);
                return;
            }
            throw C18270x1.A0S("progressBar");
        }
        throw C18270x1.A0S("inputContainer");
    }

    public C67943Rg(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, PaymentBottomSheet paymentBottomSheet2, C30791n7 r5, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A03 = paymentBottomSheet;
        this.A02 = paymentBottomSheet2;
        this.A04 = r5;
    }

    public void BWr(boolean z) {
        this.A01.A7A(this.A05, "COMPLETED", "enter_name");
    }
}
