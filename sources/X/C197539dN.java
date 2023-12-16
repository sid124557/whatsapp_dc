package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.9dN  reason: invalid class name and case insensitive filesystem */
public class C197539dN implements AnonymousClass8s3 {
    public final /* synthetic */ AnonymousClass39Q A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ AnonymousClass9XZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C197539dN(AnonymousClass39Q r1, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass9XZ r3, String str, String str2) {
        this.A01 = brazilPaymentActivity;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = r3;
    }

    public void BRy() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        brazilPaymentActivity.A05.A0X(brazilPaymentActivity.getString(R.string.f11nameremoved), brazilPaymentActivity.getString(R.string.f11nameremoved), 1);
    }

    public void BUW() {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        AnonymousClass39Q r1 = this.A00;
        boolean z = brazilPaymentActivity.A0g;
        brazilPaymentActivity.A7N(r1, this.A02, this.A03, this.A04, z);
    }
}
