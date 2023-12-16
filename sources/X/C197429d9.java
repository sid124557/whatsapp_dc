package X;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.9d9  reason: invalid class name and case insensitive filesystem */
public class C197429d9 implements C203509nr {
    public final /* synthetic */ C197339cx A00;
    public final /* synthetic */ String A01;

    public C197429d9(C197339cx r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String B9i(C166587yw r2) {
        return this.A00.A03.A0U.A01(r2);
    }

    public void BM8() {
        BrazilPaymentActivity brazilPaymentActivity = this.A00.A03;
        String A03 = brazilPaymentActivity.A0S.A03("p2p_context", false);
        Intent A032 = C1899693i.A03(brazilPaymentActivity);
        if (A03 == null) {
            A03 = "brpay_p_add_card";
        }
        A032.putExtra("screen_name", A03);
        AnonymousClass98s.A0a(A032, "referral_screen", "payment_method_picker");
        AnonymousClass98s.A0a(A032, "onboarding_context", this.A01);
        brazilPaymentActivity.startActivity(A032);
    }

    public void Boj(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        if (C195169Wk.A08(r2)) {
            this.A00.A03.A0R.A02(r2, paymentMethodRow);
        }
    }

    public /* synthetic */ View B4C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public /* synthetic */ View B7m(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }

    public /* synthetic */ View BB1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public /* synthetic */ void BMC() {
    }

    public /* synthetic */ void BNF() {
    }

    public /* synthetic */ boolean BoP() {
        return true;
    }

    public boolean BoR() {
        return true;
    }

    public /* synthetic */ boolean BoY() {
        return true;
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public /* synthetic */ String B9j(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }
}
