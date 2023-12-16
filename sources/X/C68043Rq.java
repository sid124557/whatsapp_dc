package X;

import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3Rq  reason: invalid class name and case insensitive filesystem */
public final class C68043Rq implements AnonymousClass4DN {
    public final /* synthetic */ P2mLiteConfirmLegalNameBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ C30791n7 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public void BQ2(PaymentBottomSheet paymentBottomSheet, String str) {
        String str2 = str;
        C162457s7.A0J(str2, 1);
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Integer A0c = C18290x4.A0c();
        String str3 = this.A05;
        C30791n7 r6 = this.A03;
        p2mLiteOrderDetailsActivity.A76(C57062t0.A00(), r6, A0c, "enter_name", str3, 1);
        p2mLiteOrderDetailsActivity.A04.BkM(new C70883bD(this.A00, p2mLiteOrderDetailsActivity, this.A02, paymentBottomSheet, r6, str2, this.A04));
    }

    public C68043Rq(P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, C30791n7 r4, String str, String str2) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = str;
        this.A03 = r4;
        this.A04 = str2;
        this.A00 = p2mLiteConfirmLegalNameBottomSheetFragment;
        this.A02 = paymentBottomSheet;
    }

    public void BOO() {
    }
}
