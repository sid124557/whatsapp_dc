package X;

import android.content.Context;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9d1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197379d1 implements C182858p6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass9Bs A01;
    public final /* synthetic */ PaymentBottomSheet A02;

    public final void BQ6(boolean z) {
        AnonymousClass9Bs r3 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A02;
        Context context = this.A00;
        paymentBottomSheet.A1K();
        r3.A7x(context, "CREDIT", true);
    }

    public /* synthetic */ C197379d1(Context context, AnonymousClass9Bs r2, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = r2;
        this.A02 = paymentBottomSheet;
        this.A00 = context;
    }
}
