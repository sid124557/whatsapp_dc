package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import java.util.HashMap;

/* renamed from: X.9jI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200959jI implements Runnable {
    public final /* synthetic */ BrazilOrderDetailsActivity A00;
    public final /* synthetic */ C30791n7 A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        String str;
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = this.A00;
        C30791n7 r6 = this.A01;
        boolean z = this.A02;
        C133676hl A05 = brazilOrderDetailsActivity.A06.A05(r6.A0o());
        if (z) {
            str = "active";
        } else {
            str = "inactive";
        }
        if (A05 != null) {
            String str2 = A05.A06;
            if (str2 == null || !TextUtils.equals(str2, str)) {
                A05.A06 = str;
                brazilOrderDetailsActivity.A06.A0I(r6.A0o(), Boolean.valueOf(A05.A07), A05.A06, (HashMap) null);
                brazilOrderDetailsActivity.A0V.A00(r6.A00.A01, r6);
            }
        }
    }

    public /* synthetic */ C200959jI(BrazilOrderDetailsActivity brazilOrderDetailsActivity, C30791n7 r2, boolean z) {
        this.A00 = brazilOrderDetailsActivity;
        this.A01 = r2;
        this.A02 = z;
    }
}
