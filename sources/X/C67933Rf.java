package X;

import android.widget.ProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3Rf  reason: invalid class name and case insensitive filesystem */
public final class C67933Rf implements C203099n7 {
    public final /* synthetic */ P2mLiteConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ C30791n7 A03;
    public final /* synthetic */ String A04;

    public void BS6(AnonymousClass34V r11) {
        C162457s7.A0J(r11, 0);
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = this.A00;
        p2mLiteConfirmDateOfBirthBottomSheetFragment.A1I().setVisibility(0);
        TextEmojiLabel textEmojiLabel = p2mLiteConfirmDateOfBirthBottomSheetFragment.A01;
        if (textEmojiLabel != null) {
            textEmojiLabel.setVisibility(0);
            ProgressBar progressBar = p2mLiteConfirmDateOfBirthBottomSheetFragment.A00;
            if (progressBar != null) {
                progressBar.setVisibility(4);
                P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
                int i = r11.A00;
                P2mLiteOrderDetailsActivity.A0C(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, this.A02, (PaymentBottomSheet) null, this.A03, this.A04, "enter_dob", i);
                return;
            }
            throw C18270x1.A0S("progressBar");
        }
        throw C18270x1.A0S("descText");
    }

    public C67933Rf(P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, C30791n7 r4, String str) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A04 = str;
        this.A00 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }

    public void BRQ(boolean z) {
        this.A01.A7A(this.A04, "COMPLETED", "enter_dob");
    }
}
