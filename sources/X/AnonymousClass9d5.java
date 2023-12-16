package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.9d5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9d5 implements C202779mZ {
    public final /* synthetic */ AnonymousClass9ES A00;
    public final /* synthetic */ String A01;

    public final void BTC(C166587yw r5) {
        AnonymousClass9ES r0 = this.A00;
        String str = this.A01;
        if (r5 != null) {
            C89644eZ r2 = r0.A06;
            Intent A06 = C1899593h.A06(r2, r5, IndiaUpiStepUpActivity.class);
            A06.putExtra("extra_step_up_id", str);
            r2.startActivity(A06);
            return;
        }
        r0.A02();
    }

    public /* synthetic */ AnonymousClass9d5(AnonymousClass9ES r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
