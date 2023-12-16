package X;

import com.whatsapp.util.Log;

/* renamed from: X.91P  reason: invalid class name */
public class AnonymousClass91P implements C16430tO {
    public final int A00;

    public AnonymousClass91P(int i) {
        this.A00 = i;
    }

    public void BPR(AnonymousClass0JP r2) {
        if (this.A00 == 0) {
            C162457s7.A0J(r2, 0);
            if (!(r2 instanceof AnonymousClass0F8)) {
                Log.w("CareCsatSurveyLauncherProxy - failed to launch Care CSAT survey via Bloks async action");
            }
        }
    }
}
