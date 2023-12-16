package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;

/* renamed from: X.4MF  reason: invalid class name */
public class AnonymousClass4MF extends CountDownTimer {
    public boolean A00 = false;
    public final /* synthetic */ long A01;
    public final /* synthetic */ VerifyPhoneNumber A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MF(VerifyPhoneNumber verifyPhoneNumber, long j, long j2) {
        super(j, 1000);
        this.A02 = verifyPhoneNumber;
        this.A01 = j2;
    }

    public void onFinish() {
        int i;
        Log.i("VerifyPhoneNumber/primary-flash-call-timer-finish");
        VerifyPhoneNumber verifyPhoneNumber = this.A02;
        verifyPhoneNumber.A0G = null;
        verifyPhoneNumber.A7J();
        if (!verifyPhoneNumber.A8D()) {
            return;
        }
        if (verifyPhoneNumber.A1K || !((i = verifyPhoneNumber.A04) == 2 || i == 5)) {
            verifyPhoneNumber.A7c(verifyPhoneNumber.A10.A00("sms"), verifyPhoneNumber.A10.A00("voice"));
        } else {
            C621433s.A01(verifyPhoneNumber, 47);
        }
    }

    public void onTick(long j) {
        if (!this.A00 && j - this.A01 <= 500) {
            VerifyPhoneNumber verifyPhoneNumber = this.A02;
            verifyPhoneNumber.A7J();
            verifyPhoneNumber.A7Y(R.string.f11nameremoved);
            this.A00 = true;
        }
    }
}
