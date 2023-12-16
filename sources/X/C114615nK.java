package X;

import com.whatsapp.util.Log;

/* renamed from: X.5nK  reason: invalid class name and case insensitive filesystem */
public class C114615nK implements AnonymousClass4ER {
    public final /* synthetic */ AnonymousClass5Y5 A00;

    public C114615nK(AnonymousClass5Y5 r1) {
        this.A00 = r1;
    }

    public void BOp() {
        AnonymousClass5Y5 r1 = this.A00;
        if (r1.A02 != null) {
            Log.e("ContactUsActivity/createTicketIq/onDeliveryFailure, falling back to email support.");
            r1.A02.BjL();
            r1.A00();
        }
    }

    public void BOq(int i) {
        AnonymousClass5Y5 r2 = this.A00;
        if (r2.A02 != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("ContactUsActivity/createTicketIq/onError/errorCode=");
            A0o.append(i);
            C18260x0.A1K(A0o, " falling back to email support.");
            r2.A02.BjL();
            r2.A00();
        }
    }

    public void BOr(C95814uZ r6) {
        AnonymousClass5Y5 r3 = this.A00;
        if (r3.A02 != null) {
            Log.i("ContactUsActivity/createTicketIq/onSuccess, removing spinner and finishing activity");
            boolean z = false;
            int max = Math.max(0, r3.A0A.A0N(974));
            r3.A03 = r6;
            r3.A04 = false;
            C28891hw r2 = r3.A09;
            AnonymousClass4FI r1 = r3.A08;
            r2.A06(r1);
            if (max <= 0) {
                z = true;
            }
            if (!r3.A06(z)) {
                r3.A06.A0T(new C70003Zm(this, 37), (long) max);
            } else {
                r2.A07(r1);
            }
        }
    }
}
