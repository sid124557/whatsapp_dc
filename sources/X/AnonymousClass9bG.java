package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9bG  reason: invalid class name */
public class AnonymousClass9bG implements C203309nU {
    public final /* synthetic */ AnonymousClass9D8 A00;

    public AnonymousClass9bG(AnonymousClass9D8 r1) {
        this.A00 = r1;
    }

    public void BTy() {
        AnonymousClass9D8 r3 = this.A00;
        r3.A0J.A0A("onGetChallengeFailure got; showErrorAndFinish", (Throwable) null);
        r3.A7b();
    }

    public void BU4(AnonymousClass34V r7, boolean z) {
        AnonymousClass9D8 r2 = this.A00;
        r2.BjL();
        if (!z) {
            C160757oG r5 = r2.A0J;
            r5.A0A("onGetToken got; failure", (Throwable) null);
            if (r2.A05.A06("upi-get-token")) {
                r5.A0A("retry get token", (Throwable) null);
                C196629bS r4 = r2.A0M;
                synchronized (r4) {
                    try {
                        C620933l r3 = r4.A03;
                        JSONObject A0g = C1899593h.A0g(r3);
                        A0g.remove("token");
                        A0g.remove("tokenTs");
                        C1899593h.A1D(r3, A0g);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
                    }
                }
                r2.A7d();
                r2.A7Y();
                return;
            }
            if (r7 != null) {
                r5.A0A(AnonymousClass000.A0P(r7, "onGetToken showErrorAndFinish error: ", AnonymousClass001.A0o()), (Throwable) null);
                if (C196719bd.A02(r2, "upi-get-token", r7.A00, true)) {
                    return;
                }
            } else {
                r5.A0A("onGetToken showErrorAndFinish", (Throwable) null);
            }
            r2.A7b();
            return;
        }
        return;
    }

    public void BZe(boolean z) {
        AnonymousClass9D8 r3 = this.A00;
        if (r3.BHW()) {
            return;
        }
        if (z) {
            r3.A05.A02("upi-register-app");
            boolean z2 = r3.A0I;
            C160757oG r1 = r3.A0J;
            if (z2) {
                r1.A0A("internal error ShowPinError", (Throwable) null);
                r3.A7e();
                return;
            }
            r1.A06("onRegisterApp registered ShowMainPane");
            r3.A7c();
            return;
        }
        r3.A0J.A0A("onRegisterApp not registered; showErrorAndFinish", (Throwable) null);
        r3.A7b();
    }
}
