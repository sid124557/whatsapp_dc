package X;

import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.3Cg  reason: invalid class name and case insensitive filesystem */
public class C64143Cg implements AnonymousClass4F2 {
    public boolean A00;
    public final /* synthetic */ SpamWarningActivity A01;

    public C64143Cg(SpamWarningActivity spamWarningActivity) {
        this.A01 = spamWarningActivity;
    }

    public void BUC() {
        if (!this.A00) {
            SpamWarningActivity spamWarningActivity = this.A01;
            spamWarningActivity.startActivity(C627736r.A02(spamWarningActivity));
            spamWarningActivity.finish();
        }
        this.A00 = true;
    }

    public /* synthetic */ void BUB() {
    }

    public /* synthetic */ void BUD() {
    }

    public /* synthetic */ void BUE() {
    }

    public /* synthetic */ void BUF() {
    }
}
