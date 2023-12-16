package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;

/* renamed from: X.9gA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199179gA implements Runnable {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public final void run() {
        IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
        indiaUpiChangePinActivity.A01.setVisibility(0);
        indiaUpiChangePinActivity.A00.setVisibility(0);
        String A0B = indiaUpiChangePinActivity.A0M.A0B();
        if (!TextUtils.isEmpty(A0B)) {
            String A0c = AnonymousClass97T.A0c(indiaUpiChangePinActivity);
            indiaUpiChangePinActivity.A03 = A0c;
            C133686hm r0 = indiaUpiChangePinActivity.A02;
            indiaUpiChangePinActivity.A7g((AnonymousClass99H) r0.A08, A0B, r0.A0B, A0c, C166557yt.A00(r0.A09), 2);
            return;
        }
        AnonymousClass97T.A10(indiaUpiChangePinActivity);
    }

    public /* synthetic */ C199179gA(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }
}
