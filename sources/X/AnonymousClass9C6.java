package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.9C6  reason: invalid class name */
public abstract class AnonymousClass9C6 extends AnonymousClass97Y {
    public C1907099n A00;
    public PaymentSettingsFragment A01;
    public final C160757oG A02 = C160757oG.A00("PaymentSettingsActivity", "payment-settings", "COMMON");

    public PaymentSettingsFragment A74() {
        if (this instanceof IndiaUpiPaymentSettingsActivity) {
            return new IndiaUpiPaymentSettingsFragment();
        }
        return new BrazilPaymentSettingsFragment();
    }

    public void onBackPressed() {
        C1902394t r8;
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (!(paymentSettingsFragment == null || (r8 = paymentSettingsFragment.A0x) == null)) {
            AnonymousClass9VG r7 = paymentSettingsFragment.A0q;
            if (r8 instanceof IndiaPaymentSettingsViewModel) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) r8;
                C203499no r6 = indiaPaymentSettingsViewModel.A0B;
                if (r6 instanceof C197109ca) {
                    C197109ca r62 = (C197109ca) r6;
                    Integer A0f = AnonymousClass001.A0f();
                    boolean A0P = indiaPaymentSettingsViewModel.A0P();
                    C197109ca.A02(r62.A05(A0f, A0f, "payment_home", (String) null), AnonymousClass9Wg.A00(indiaPaymentSettingsViewModel.A05, (AnonymousClass39Q) null, r7, (String) null, false), r62, A0P);
                }
            } else {
                AnonymousClass9Wg.A02(AnonymousClass9Wg.A00(r8.A05, (AnonymousClass39Q) null, r7, (String) null, false), r8.A0B, 1, "payment_home", (String) null, 1);
            }
        }
        if (isTaskRoot()) {
            Intent A022 = C627736r.A02(this);
            finishAndRemoveTask();
            startActivity(A022);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (this.A00.A02() || this.A00.A01()) {
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                if (this instanceof BrazilPaymentSettingsActivity) {
                    C162457s7.A0J(this.A0D, 0);
                }
                C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
            }
            Intent intent = getIntent();
            this.A01 = A74();
            if (bundle == null) {
                if (!(intent == null || intent.getExtras() == null)) {
                    Bundle bundle2 = new Bundle(intent.getExtras());
                    Bundle bundle3 = this.A01.A06;
                    if (bundle3 != null) {
                        bundle2.putAll(bundle3);
                    }
                    this.A01.A0u(bundle2);
                }
                C08240dc r3 = new C08240dc(getSupportFragmentManager());
                r3.A0D(this.A01, (String) null, R.id.payment_settings_fragment_container);
                r3.A01();
                return;
            }
            return;
        }
        this.A02.A06("onCreate payment is not enabled; finish");
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PaymentSettingsFragment paymentSettingsFragment = this.A01;
        if (paymentSettingsFragment != null) {
            paymentSettingsFragment.A1d(intent);
        }
    }
}
