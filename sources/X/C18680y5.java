package X;

import android.os.CountDownTimer;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.spamwarning.SpamWarningActivity;

/* renamed from: X.0y5  reason: invalid class name and case insensitive filesystem */
public class C18680y5 extends CountDownTimer {
    public final /* synthetic */ CircularProgressBar A00;
    public final /* synthetic */ SpamWarningActivity A01;

    public void onTick(long j) {
        int i = (int) j;
        int i2 = i / 1000;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("expiryInSeconds:");
        SpamWarningActivity spamWarningActivity = this.A01;
        A0o.append(spamWarningActivity.A00);
        C18260x0.A0w(" secondsPassed:", A0o, i2);
        CircularProgressBar circularProgressBar = this.A00;
        circularProgressBar.setCenterText(C107565bW.A0A(spamWarningActivity.A00, (long) i2));
        circularProgressBar.setProgress(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18680y5(CircularProgressBar circularProgressBar, SpamWarningActivity spamWarningActivity, long j) {
        super(j, 10);
        this.A01 = spamWarningActivity;
        this.A00 = circularProgressBar;
    }

    public void onFinish() {
        this.A01.finish();
    }
}
