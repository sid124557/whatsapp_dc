package X;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;

/* renamed from: X.67Q  reason: invalid class name */
public class AnonymousClass67Q extends CountDownTimer {
    public long A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass67Q(Object obj, int i, long j, long j2) {
        super(j, 1000);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = j2;
    }

    public void onFinish() {
        int i = this.A02;
        Object obj = this.A01;
        switch (i) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) obj;
                fingerprintBottomSheet.A01 = null;
                if (this.A00 <= fingerprintBottomSheet.A07.A0H() && !fingerprintBottomSheet.A09) {
                    FingerprintView fingerprintView = fingerprintBottomSheet.A06;
                    if (fingerprintView != null) {
                        fingerprintView.A01(fingerprintView.A06);
                    }
                    fingerprintBottomSheet.A1S();
                    return;
                }
                return;
            case 1:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) obj;
                verifyPhoneNumber.A0F = null;
                if (verifyPhoneNumber.A0q.A04()) {
                    verifyPhoneNumber.A0q.A03(true);
                } else {
                    verifyPhoneNumber.A0Q.setEnabled(true);
                }
                verifyPhoneNumber.A0K.setProgress(100);
                if (verifyPhoneNumber.A0q.A04()) {
                    verifyPhoneNumber.A0K.setVisibility(8);
                }
                TextView textView = verifyPhoneNumber.A0M;
                Object[] objArr = new Object[1];
                boolean A1Y = C18300x5.A1Y(objArr, VerifyPhoneNumber.A1b);
                AnonymousClass001.A0y(verifyPhoneNumber, textView, objArr, R.string.f11nameremoved);
                verifyPhoneNumber.A1H = A1Y;
                verifyPhoneNumber.A10.A02();
                String A012 = verifyPhoneNumber.A10.A01(verifyPhoneNumber.A1B, verifyPhoneNumber.A1E);
                if (A012 != null) {
                    Log.i("VerifyPhoneNumber/countdowntimer/done/try-savedcode");
                    verifyPhoneNumber.A01 = 0;
                    String str = verifyPhoneNumber.A1B;
                    String str2 = verifyPhoneNumber.A1E;
                    C626936e.A06(str2);
                    AnonymousClass5VK.A00(verifyPhoneNumber.A0O);
                    verifyPhoneNumber.A7t(verifyPhoneNumber.A12, A012, str, str2, "sms", (String) null, 3);
                    return;
                }
                return;
            default:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) obj;
                CountDownTimer countDownTimer = verifyTwoFactorAuth.A06;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    verifyTwoFactorAuth.A06 = null;
                }
                verifyTwoFactorAuth.A0C.setEnabled(true);
                verifyTwoFactorAuth.A07.setProgress(100);
                verifyTwoFactorAuth.A08.setVisibility(4);
                TextView textView2 = verifyTwoFactorAuth.A08;
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1L(objArr2, 6);
                AnonymousClass001.A0y(verifyTwoFactorAuth, textView2, objArr2, R.string.f11nameremoved);
                C18270x1.A0g(verifyTwoFactorAuth.getPreferences(0).edit(), "code_retry_time");
                return;
        }
    }

    public void onTick(long j) {
        ProgressBar progressBar;
        switch (this.A02) {
            case 0:
                FingerprintBottomSheet fingerprintBottomSheet = (FingerprintBottomSheet) this.A01;
                FingerprintView fingerprintView = fingerprintBottomSheet.A06;
                if (fingerprintView != null) {
                    fingerprintView.A02(AnonymousClass0x7.A0n(fingerprintBottomSheet, C107565bW.A0A(fingerprintBottomSheet.A08, C18290x4.A0B(j)), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                    return;
                }
                return;
            case 1:
                progressBar = ((VerifyPhoneNumber) this.A01).A0K;
                break;
            default:
                progressBar = ((VerifyTwoFactorAuth) this.A01).A07;
                break;
        }
        long j2 = this.A00;
        progressBar.setProgress((int) ((((double) (j2 - j)) * 100.0d) / ((double) j2)));
    }
}
