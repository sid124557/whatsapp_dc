package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.9gd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199469gd implements Runnable {
    public final /* synthetic */ IndiaUpiStepUpActivity A00;

    public final void run() {
        IndiaUpiStepUpActivity indiaUpiStepUpActivity = this.A00;
        C621433s.A00(indiaUpiStepUpActivity, 10);
        String A0B = indiaUpiStepUpActivity.A0M.A0B();
        if (!TextUtils.isEmpty(A0B)) {
            String A0c = AnonymousClass97T.A0c(indiaUpiStepUpActivity);
            indiaUpiStepUpActivity.A05 = A0c;
            C133686hm r0 = indiaUpiStepUpActivity.A01;
            indiaUpiStepUpActivity.A7g((AnonymousClass99H) r0.A08, A0B, r0.A0B, A0c, (String) C1899593h.A0X(r0.A09), 3);
            indiaUpiStepUpActivity.A04.A03 = indiaUpiStepUpActivity.A05;
            return;
        }
        indiaUpiStepUpActivity.A03.A00();
    }

    public /* synthetic */ C199469gd(IndiaUpiStepUpActivity indiaUpiStepUpActivity) {
        this.A00 = indiaUpiStepUpActivity;
    }
}
