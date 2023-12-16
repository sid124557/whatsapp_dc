package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.0y7  reason: invalid class name and case insensitive filesystem */
public class C18700y7 extends Handler {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18700y7(Looper looper, VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        super(looper);
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    public void handleMessage(Message message) {
        if (message.what == 0) {
            VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
            if (verifyTwoFactorAuthCodeDialogFragment.A00 == 0) {
                verifyTwoFactorAuthCodeDialogFragment.A07.BkP(new C71323bv(6, (String) message.obj, verifyTwoFactorAuthCodeDialogFragment));
            }
        }
    }
}
