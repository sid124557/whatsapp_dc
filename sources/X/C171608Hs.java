package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;

/* renamed from: X.8Hs  reason: invalid class name and case insensitive filesystem */
public final class C171608Hs implements AnonymousClass4EY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C141946wO A01;
    public final /* synthetic */ HybridPaymentMethodPickerFragment A02;

    public C171608Hs(C141946wO r1, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, int i) {
        this.A02 = hybridPaymentMethodPickerFragment;
        this.A01 = r1;
        this.A00 = i;
    }

    public void Ba4(AnonymousClass34V r6) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        Context A1D = hybridPaymentMethodPickerFragment.A1D();
        if (A1D != null) {
            AnonymousClass9U4 r0 = hybridPaymentMethodPickerFragment.A09;
            if (r0 != null) {
                C195219Wq.A09(A1D, C08310eF.A09(hybridPaymentMethodPickerFragment).getString(R.string.f11nameremoved), r0.A0G().B72());
                return;
            }
            throw C18270x1.A0S("paymentsManager");
        }
    }

    public void BaB(AnonymousClass34V r6) {
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        Context A1D = hybridPaymentMethodPickerFragment.A1D();
        if (A1D != null) {
            AnonymousClass9U4 r0 = hybridPaymentMethodPickerFragment.A09;
            if (r0 != null) {
                C195219Wq.A09(A1D, C08310eF.A09(hybridPaymentMethodPickerFragment).getString(R.string.f11nameremoved), r0.A0G().B72());
                return;
            }
            throw C18270x1.A0S("paymentsManager");
        }
    }

    public void BaC(AnonymousClass2Oi r6) {
        int ordinal = this.A01.ordinal();
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment = this.A02;
        C620933l r0 = hybridPaymentMethodPickerFragment.A07;
        if (ordinal != 0) {
            if (r0 != null) {
                if (ordinal != 1) {
                    r0.A0C();
                    r0 = hybridPaymentMethodPickerFragment.A07;
                    if (r0 == null) {
                        throw C18270x1.A0S("paymentSharedPrefs");
                    }
                }
                C18270x1.A0l(r0.A03().edit(), "pref_p2m_hybrid_v2_tos_accepted", true);
            } else {
                throw C18270x1.A0S("paymentSharedPrefs");
            }
        } else if (r0 != null) {
            r0.A0C();
        } else {
            throw C18270x1.A0S("paymentSharedPrefs");
        }
        hybridPaymentMethodPickerFragment.A1J(this.A00);
    }
}
