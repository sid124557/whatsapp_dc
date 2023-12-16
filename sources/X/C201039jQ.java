package X;

import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.9jQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201039jQ implements Runnable {
    public final /* synthetic */ IndiaPaymentSettingsViewModel A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ Integer A02;

    public final void run() {
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A00;
        Integer num = this.A01;
        Integer num2 = this.A02;
        C620933l r4 = indiaPaymentSettingsViewModel.A09;
        C18270x1.A0i(C620933l.A00(r4), "payments_upi_last_transactions_sync_time", indiaPaymentSettingsViewModel.A05.A0H());
        C18270x1.A0h(C620933l.A00(r4), "payments_upi_transactions_sync_status", 1);
        indiaPaymentSettingsViewModel.A07.A01(new C204549pX(num2, num, indiaPaymentSettingsViewModel, 2), num, num2, (String) null, (String) null);
    }

    public /* synthetic */ C201039jQ(IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel, Integer num, Integer num2) {
        this.A00 = indiaPaymentSettingsViewModel;
        this.A01 = num;
        this.A02 = num2;
    }
}
