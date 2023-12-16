package X;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9dC  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197459dC implements C182878p8 {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void BYt(BottomSheetDialogFragment bottomSheetDialogFragment) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        boolean z = this.A04;
        bottomSheetDialogFragment.A1K();
        if (!brazilPaymentActivity.A0O.A02.A0X(2928) || !"p2m_context".equals(str) || (!"brpay_p_add_card".equals(str2) && !"brpay_p_compliance_kyc_next_screen_router".equals(str2))) {
            Intent A032 = C1899693i.A03(brazilPaymentActivity);
            A032.putExtra("screen_name", str2);
            A032.putExtra("hide_send_payment_cta", true);
            AnonymousClass98s.A0a(A032, "referral_screen", str3);
            AnonymousClass98s.A0a(A032, "onboarding_context", str);
            AnonymousClass98s.A0a(A032, "request_flow", C1899693i.A0Z(z ? 1 : 0));
            brazilPaymentActivity.startActivity(A032);
            return;
        }
        brazilPaymentActivity.Bp9(R.string.f11nameremoved);
        C194219Sa r5 = brazilPaymentActivity.A0Y;
        if (TextUtils.isEmpty(str3)) {
            str3 = "get_started";
        }
        r5.A00(new AnonymousClass9UJ(brazilPaymentActivity, 1), new C205149qV(brazilPaymentActivity, 2), new C197589dY(brazilPaymentActivity, str), str3);
    }

    public /* synthetic */ C197459dC(BrazilPaymentActivity brazilPaymentActivity, String str, String str2, String str3, boolean z) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = z;
    }
}
