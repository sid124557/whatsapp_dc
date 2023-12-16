package X;

import android.content.Context;
import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

/* renamed from: X.977  reason: invalid class name */
public class AnonymousClass977 extends C86994Mr {
    public final /* synthetic */ URLSpan A00;
    public final /* synthetic */ PaymentCustomInstructionsBottomSheet A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass977(Context context, URLSpan uRLSpan, PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet, int i) {
        super(context, i);
        this.A01 = paymentCustomInstructionsBottomSheet;
        this.A00 = uRLSpan;
    }

    public void onClick(View view) {
        Intent A08 = C18300x5.A08(this.A00.getURL());
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = this.A01;
        C003203q A0Q = paymentCustomInstructionsBottomSheet.A0Q();
        if (A0Q != null && A0Q.getPackageManager().resolveActivity(A08, 0) != null) {
            paymentCustomInstructionsBottomSheet.A0Q().startActivity(A08);
        }
    }
}
