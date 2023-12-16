package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

/* renamed from: X.9XA  reason: invalid class name */
public class AnonymousClass9XA implements DialogInterface.OnDismissListener {
    public C202459m3 A00;

    public void A00() {
        this.A00 = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C202459m3 r2 = this.A00;
        if (r2 != null && (r2 instanceof BrazilOrderDetailsActivity)) {
            BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) r2;
            if (brazilOrderDetailsActivity.A0Q || C18300x5.A1X(brazilOrderDetailsActivity.A0S, brazilOrderDetailsActivity.A00)) {
                C86624Kv.A0f(brazilOrderDetailsActivity);
            }
        }
    }
}
