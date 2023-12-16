package X;

import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.9pX  reason: invalid class name and case insensitive filesystem */
public class C204549pX implements AnonymousClass4EY {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public void BaC(AnonymousClass2Oi r9) {
        C620933l r0;
        C620933l r5;
        int i;
        switch (this.A03) {
            case 0:
                ((AnonymousClass4EY) this.A01).BaC(r9);
                return;
            case 1:
                int ordinal = ((C141946wO) this.A01).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        r0 = ((AnonymousClass9DA) this.A00).A0P;
                    } else if (ordinal == 2) {
                        AnonymousClass9DA r1 = (AnonymousClass9DA) this.A00;
                        r1.A0P.A0C();
                        r0 = r1.A0P;
                    }
                    C18270x1.A0l(C620933l.A00(r0), "pref_p2m_hybrid_v2_tos_accepted", true);
                } else {
                    ((AnonymousClass9DA) this.A00).A0P.A0C();
                }
                ((IndiaUpiCheckOrderDetailsActivity) this.A00).A8a((AnonymousClass39L) this.A02);
                return;
            default:
                if (r9 instanceof C29491iu) {
                    IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A00;
                    indiaPaymentSettingsViewModel.A08.A04("accountRecovery/getTransactions/onResponseSuccess");
                    C29491iu r92 = (C29491iu) r9;
                    C166267yP r12 = r92.A00;
                    if (r12 == null) {
                        return;
                    }
                    if (r12.A01 || TextUtils.isEmpty(r12.A00)) {
                        r5 = indiaPaymentSettingsViewModel.A09;
                        C18270x1.A0i(C620933l.A00(r5), "payments_upi_last_transactions_sync_time", indiaPaymentSettingsViewModel.A05.A0H());
                        i = 2;
                    } else {
                        indiaPaymentSettingsViewModel.A07.A01(this, (Integer) this.A02, (Integer) this.A01, r92.A00.A00, (String) null);
                        return;
                    }
                } else {
                    IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = (IndiaPaymentSettingsViewModel) this.A00;
                    r5 = indiaPaymentSettingsViewModel2.A09;
                    C18270x1.A0i(C620933l.A00(r5), "payments_upi_last_transactions_sync_time", indiaPaymentSettingsViewModel2.A05.A0H());
                    indiaPaymentSettingsViewModel2.A08.A04("unexpected payment transaction result type.");
                    i = 0;
                }
                C18270x1.A0h(C620933l.A00(r5), "payments_upi_transactions_sync_status", i);
                return;
        }
    }

    public C204549pX(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void Ba4(AnonymousClass34V r7) {
        switch (this.A03) {
            case 0:
                ((AnonymousClass4EY) this.A01).Ba4(r7);
                return;
            case 1:
                AnonymousClass9Cu r1 = (AnonymousClass9Cu) this.A00;
                r1.A8R(false);
                r1.Bot(R.string.f11nameremoved);
                return;
            default:
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A00;
                C620933l r4 = indiaPaymentSettingsViewModel.A09;
                C18270x1.A0i(C620933l.A00(r4), "payments_upi_last_transactions_sync_time", indiaPaymentSettingsViewModel.A05.A0H());
                C18270x1.A0h(C620933l.A00(r4), "payments_upi_transactions_sync_status", 0);
                C1899593h.A1G(indiaPaymentSettingsViewModel.A08, r7, "accountRecovery/getPaymentTransactions/onRequestError. paymentNetworkError: ", AnonymousClass001.A0o());
                return;
        }
    }

    public void BaB(AnonymousClass34V r7) {
        switch (this.A03) {
            case 0:
                IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) this.A00;
                C1899593h.A1H(indiaUpiBankAccountDetailsActivity.A0L, r7, "removePayment/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o());
                C203499no r1 = (C203499no) this.A02;
                if (r1 != null) {
                    r1.BK0(r7, 13);
                }
                AnonymousClass9VW A04 = indiaUpiBankAccountDetailsActivity.A04.A04((C153607bd) null, r7.A00);
                if (A04.A00 != 0) {
                    indiaUpiBankAccountDetailsActivity.BjL();
                    AnonymousClass9VW.A00(indiaUpiBankAccountDetailsActivity, A04).A1O(indiaUpiBankAccountDetailsActivity.getSupportFragmentManager(), (String) null);
                    return;
                }
                ((AnonymousClass4EY) this.A01).BaB(r7);
                return;
            case 1:
                AnonymousClass9Cu r12 = (AnonymousClass9Cu) this.A00;
                r12.A8R(false);
                r12.Bot(R.string.f11nameremoved);
                return;
            default:
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A00;
                C620933l r4 = indiaPaymentSettingsViewModel.A09;
                C18270x1.A0i(C620933l.A00(r4), "payments_upi_last_transactions_sync_time", indiaPaymentSettingsViewModel.A05.A0H());
                C18270x1.A0h(C620933l.A00(r4), "payments_upi_transactions_sync_status", 0);
                C1899593h.A1G(indiaPaymentSettingsViewModel.A08, r7, "accountRecovery/getPaymentTransactions/onResponseError. paymentNetworkError: ", AnonymousClass001.A0o());
                return;
        }
    }
}
