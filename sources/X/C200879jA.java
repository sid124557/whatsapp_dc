package X;

import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.9jA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200879jA implements Runnable {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C624034w A01;
    public final /* synthetic */ C193989Rd A02;

    public final void run() {
        C193989Rd r0 = this.A02;
        TextView textView = this.A00;
        C624034w r1 = this.A01;
        C194599Tr r02 = r0.A03;
        r02.A05(textView, r1, false);
        r02.A00.A0H(R.string.f11nameremoved, 0);
    }

    public /* synthetic */ C200879jA(TextView textView, C624034w r2, C193989Rd r3) {
        this.A02 = r3;
        this.A00 = textView;
        this.A01 = r2;
    }
}
