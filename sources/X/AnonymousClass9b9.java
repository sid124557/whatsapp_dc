package X;

import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;

/* renamed from: X.9b9  reason: invalid class name */
public class AnonymousClass9b9 implements C202939mr {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BrazilPaymentSettingsFragment A01;

    public AnonymousClass9b9(FrameLayout frameLayout, BrazilPaymentSettingsFragment brazilPaymentSettingsFragment) {
        this.A01 = brazilPaymentSettingsFragment;
        this.A00 = frameLayout;
    }

    public void BP2(AnonymousClass3ZO r2) {
        C194939Vd r0 = this.A01.A0v;
        if (r0 != null) {
            r0.A05(r2);
        }
    }

    public void BRL(AnonymousClass3ZO r8) {
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = this.A01;
        if (brazilPaymentSettingsFragment.A02.A0X(1724)) {
            C203499no r1 = brazilPaymentSettingsFragment.A0C;
            Integer A0f = AnonymousClass001.A0f();
            r1.BJy(r8, A0f, A0f, "payment_home", brazilPaymentSettingsFragment.A16);
        }
        this.A00.setVisibility(8);
    }
}
