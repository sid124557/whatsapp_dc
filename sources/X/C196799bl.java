package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.9bl  reason: invalid class name and case insensitive filesystem */
public class C196799bl implements C202979mv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C624034w A02;
    public final /* synthetic */ C1907299p A03;
    public final /* synthetic */ String A04;

    public C196799bl(Context context, C624034w r2, C1907299p r3, String str, int i) {
        this.A03 = r3;
        this.A01 = context;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = str;
    }

    public void BSk() {
        this.A03.A06.A00(this.A01, this.A02);
    }

    public void onSuccess() {
        Context context = this.A01;
        context.startActivity(IndiaUpiMandatePaymentActivity.A0C(context, this.A02, this.A04, this.A00));
    }
}
