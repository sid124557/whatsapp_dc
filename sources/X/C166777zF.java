package X;

import android.view.View;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

/* renamed from: X.7zF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C166777zF implements View.OnClickListener {
    public final /* synthetic */ PaymentsWarmWelcomeBottomSheet A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(View view) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C182878p8 r0 = paymentsWarmWelcomeBottomSheet.A01;
        if (r0 != null) {
            r0.BYt(paymentsWarmWelcomeBottomSheet);
        }
        C203499no r2 = paymentsWarmWelcomeBottomSheet.A00;
        if (r2 != null) {
            Integer A0f = AnonymousClass001.A0f();
            if (str == null) {
                str = "";
            }
            r2.BKB(A0f, 36, str, str2);
            return;
        }
        throw C18270x1.A0S("paymentUIEventLogger");
    }

    public /* synthetic */ C166777zF(PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet, String str, String str2) {
        this.A00 = paymentsWarmWelcomeBottomSheet;
        this.A01 = str;
        this.A02 = str2;
    }
}
