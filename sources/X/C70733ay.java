package X;

import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.Calendar;

/* renamed from: X.3ay  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70733ay implements Runnable {
    public final /* synthetic */ P2mLiteConfirmDateOfBirthBottomSheetFragment A00;
    public final /* synthetic */ P2mLiteOrderDetailsActivity A01;
    public final /* synthetic */ PaymentBottomSheet A02;
    public final /* synthetic */ C30791n7 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Calendar A05;

    public final void run() {
        P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity = this.A01;
        Calendar calendar = this.A05;
        String str = this.A04;
        P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = this.A00;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        C30791n7 r14 = this.A03;
        C162457s7.A0J(str, 2);
        C194309Sj r3 = p2mLiteOrderDetailsActivity.A0F;
        if (r3 != null) {
            r3.A00(new C67933Rf(p2mLiteConfirmDateOfBirthBottomSheetFragment, p2mLiteOrderDetailsActivity, paymentBottomSheet, r14, str), "p2m-lite-buyer-check", (String) null, calendar.get(1), calendar.get(2), calendar.get(5));
            return;
        }
        throw C18270x1.A0S("paymentsComplianceManager");
    }

    public /* synthetic */ C70733ay(P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment, P2mLiteOrderDetailsActivity p2mLiteOrderDetailsActivity, PaymentBottomSheet paymentBottomSheet, C30791n7 r4, String str, Calendar calendar) {
        this.A01 = p2mLiteOrderDetailsActivity;
        this.A05 = calendar;
        this.A04 = str;
        this.A00 = p2mLiteConfirmDateOfBirthBottomSheetFragment;
        this.A02 = paymentBottomSheet;
        this.A03 = r4;
    }
}
