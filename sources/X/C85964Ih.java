package X;

import android.os.Handler;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.whatsapp.twofactor.SetCodeFragment;

/* renamed from: X.4Ih  reason: invalid class name and case insensitive filesystem */
public class C85964Ih implements AnonymousClass8r2 {
    public Object A00;
    public final int A01;

    public C85964Ih(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BPJ(String str) {
        if (this.A01 != 0) {
            SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
            if (setCodeFragment.A04 >= 7) {
                setCodeFragment.A1J();
                int i = setCodeFragment.A00;
                if (i == 1) {
                    setCodeFragment.A08.A02 = str;
                } else if (i == 2) {
                    setCodeFragment.A08.A03 = str;
                }
                if (!setCodeFragment.A1K(str)) {
                    return;
                }
                if (setCodeFragment.A00 != 2 || !setCodeFragment.A08.A77(setCodeFragment)) {
                    SetCodeFragment.A00(setCodeFragment);
                    return;
                }
                return;
            }
            return;
        }
        VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
        verifyTwoFactorAuthCodeDialogFragment.A03.setEnabled(false);
        verifyTwoFactorAuthCodeDialogFragment.A01.setProgress(0);
        Handler handler = verifyTwoFactorAuthCodeDialogFragment.A08;
        handler.removeMessages(0);
        handler.sendMessageDelayed(handler.obtainMessage(0, str), 400);
    }

    public void BXA(String str) {
        if (this.A01 != 0) {
            SetCodeFragment setCodeFragment = (SetCodeFragment) this.A00;
            if (setCodeFragment.A04 >= 7) {
                int i = setCodeFragment.A00;
                if (i == 1) {
                    setCodeFragment.A08.A02 = str;
                } else if (i == 2) {
                    setCodeFragment.A08.A03 = str;
                }
                setCodeFragment.A02.setText("");
                setCodeFragment.A1J();
                return;
            }
            return;
        }
        ((VerifyTwoFactorAuthCodeDialogFragment) this.A00).A02.setText("");
    }
}
