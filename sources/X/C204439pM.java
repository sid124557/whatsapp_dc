package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

/* renamed from: X.9pM  reason: invalid class name and case insensitive filesystem */
public class C204439pM implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public C204439pM(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = (AddPaymentMethodBottomSheet) this.A00;
                String str = this.A01;
                C182878p8 r0 = addPaymentMethodBottomSheet.A04;
                if (r0 != null) {
                    r0.BYt(addPaymentMethodBottomSheet);
                }
                addPaymentMethodBottomSheet.A02.BKE((AnonymousClass303) null, AnonymousClass001.A0f(), C18290x4.A0c(), "get_started", str);
                return;
            case 1:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                String str2 = this.A01;
                brazilPaymentCardDetailsActivity.Bp9(R.string.f11nameremoved);
                brazilPaymentCardDetailsActivity.A7B(str2);
                C56612sH r5 = brazilPaymentCardDetailsActivity.A06;
                C69263Wi r3 = brazilPaymentCardDetailsActivity.A04;
                C56972sr r4 = brazilPaymentCardDetailsActivity.A01;
                AnonymousClass31C r7 = brazilPaymentCardDetailsActivity.A01;
                C194259Se r13 = brazilPaymentCardDetailsActivity.A0C;
                AnonymousClass9U4 r11 = brazilPaymentCardDetailsActivity.A0D;
                new AnonymousClass9S9(brazilPaymentCardDetailsActivity, r3, r4, r5, brazilPaymentCardDetailsActivity.A00, r7, brazilPaymentCardDetailsActivity.A05, brazilPaymentCardDetailsActivity.A02, brazilPaymentCardDetailsActivity.A05, r11, brazilPaymentCardDetailsActivity.A09, r13, str2).A00(new C196919bx(brazilPaymentCardDetailsActivity));
                return;
            case 2:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity2 = (BrazilPaymentCardDetailsActivity) this.A00;
                String str3 = this.A01;
                brazilPaymentCardDetailsActivity2.Bp9(R.string.f11nameremoved);
                brazilPaymentCardDetailsActivity2.A7B(str3);
                brazilPaymentCardDetailsActivity2.A0E.A01(new AnonymousClass9UJ(brazilPaymentCardDetailsActivity2, 2), new C205149qV(brazilPaymentCardDetailsActivity2, 3), new C204609pd(brazilPaymentCardDetailsActivity2, 2), str3, "payment_method_details").A03(new C204989qF(brazilPaymentCardDetailsActivity2, 6));
                return;
            default:
                IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A00;
                String str4 = this.A01;
                indiaUpiPaymentSettingsFragment.A0M.BKB(AnonymousClass001.A0f(), 129, "payment_home", (String) null);
                C003203q A0R = indiaUpiPaymentSettingsFragment.A0R();
                C166557yt A0F = C1899693i.A0F(AnonymousClass3QD.A00(), String.class, str4, "accountHolderName");
                Intent A08 = AnonymousClass0x9.A08(A0R, IndiaUpiProfileDetailsActivity.class);
                A08.putExtra("extra_payment_name", A0F);
                A08.putExtra("extra_referral_screen", "payment_home");
                indiaUpiPaymentSettingsFragment.A0m(A08);
                return;
        }
    }
}
