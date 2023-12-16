package X;

import android.content.Context;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;

/* renamed from: X.6nZ  reason: invalid class name and case insensitive filesystem */
public final class C136976nZ extends C197739dn {
    public final /* synthetic */ AnonymousClass8s3 A00;
    public final /* synthetic */ BrazilIncomeCollectionViewModel A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136976nZ(Context context, C69263Wi r2, C40602Ha r3, AnonymousClass8s3 r4, BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel) {
        super(context, r3, r2);
        this.A00 = r4;
        this.A01 = brazilIncomeCollectionViewModel;
    }

    public void A05(AnonymousClass36K r3) {
        this.A01.A03.A0L("collected");
        this.A00.BUW();
    }

    public void A03(AnonymousClass34V r3) {
        C18260x0.A1R(C18270x1.A0X(r3), "PAY: BrazilSaveIncomeInformationAction onRequestError: ", r3);
        this.A00.BRy();
    }

    public void A04(AnonymousClass34V r3) {
        C18260x0.A1R(C18270x1.A0X(r3), "PAY: BrazilSaveIncomeInformationAction onResponseError: ", r3);
        this.A00.BRy();
    }
}
