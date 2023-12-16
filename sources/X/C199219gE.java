package X;

import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* renamed from: X.9gE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199219gE implements Runnable {
    public final /* synthetic */ IndiaUpiCheckBalanceActivity A00;

    public final void run() {
        IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = this.A00;
        C621433s.A00(indiaUpiCheckBalanceActivity, 10);
        String A0B = indiaUpiCheckBalanceActivity.A0M.A0B();
        if (!TextUtils.isEmpty(A0B)) {
            indiaUpiCheckBalanceActivity.A03 = C1899693i.A0G(AnonymousClass3QD.A00(), AnonymousClass97T.A0c(indiaUpiCheckBalanceActivity), "upiSequenceNumber");
            indiaUpiCheckBalanceActivity.A7j(A0B);
            indiaUpiCheckBalanceActivity.A04.A00 = indiaUpiCheckBalanceActivity.A03;
            return;
        }
        indiaUpiCheckBalanceActivity.A6f(indiaUpiCheckBalanceActivity.getString(R.string.f11nameremoved));
        AnonymousClass97T.A10(indiaUpiCheckBalanceActivity);
    }

    public /* synthetic */ C199219gE(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity) {
        this.A00 = indiaUpiCheckBalanceActivity;
    }
}
