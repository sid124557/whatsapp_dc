package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;

/* renamed from: X.8J0  reason: invalid class name */
public final class AnonymousClass8J0 implements AnonymousClass8s3 {
    public final /* synthetic */ WaButtonWithLoader A00;
    public final /* synthetic */ BrazilPaymentIncomeCollectionBottomSheet A01;

    public AnonymousClass8J0(WaButtonWithLoader waButtonWithLoader, BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet) {
        this.A00 = waButtonWithLoader;
        this.A01 = brazilPaymentIncomeCollectionBottomSheet;
    }

    public void BRy() {
        WaButtonWithLoader waButtonWithLoader = this.A00;
        waButtonWithLoader.A06 = false;
        waButtonWithLoader.A00();
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = this.A01;
        AnonymousClass8s3 r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
        if (r0 == null) {
            throw C18270x1.A0S("incomeCollectionCallback");
        }
        r0.BRy();
        brazilPaymentIncomeCollectionBottomSheet.A1K();
    }

    public void BUW() {
        WaButtonWithLoader waButtonWithLoader = this.A00;
        waButtonWithLoader.A06 = false;
        waButtonWithLoader.A00();
        BrazilPaymentIncomeCollectionBottomSheet brazilPaymentIncomeCollectionBottomSheet = this.A01;
        AnonymousClass8s3 r0 = brazilPaymentIncomeCollectionBottomSheet.A01;
        if (r0 == null) {
            throw C18270x1.A0S("incomeCollectionCallback");
        }
        r0.BUW();
        brazilPaymentIncomeCollectionBottomSheet.A1K();
    }
}
