package X;

import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.registration.VerifyCaptcha;
import com.whatsapp.registration.VerifyEmail;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.6AO  reason: invalid class name */
public class AnonymousClass6AO implements AnonymousClass8r2 {
    public Object A00;
    public final int A01;

    public AnonymousClass6AO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BPJ(String str) {
        WDSButton wDSButton;
        switch (this.A01) {
            case 0:
                if (str.length() == 6) {
                    VerifyEmailActivity verifyEmailActivity = (VerifyEmailActivity) this.A00;
                    if (verifyEmailActivity.A06.A0H() >= verifyEmailActivity.A01) {
                        wDSButton = verifyEmailActivity.A0A;
                        if (wDSButton == null) {
                            throw C18270x1.A0S("verifyBtn");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                wDSButton = ((VerifyCaptcha) this.A00).A0U;
                if (wDSButton == null) {
                    throw C18270x1.A0S("captchaSubmitButton");
                }
                break;
            case 2:
                if (str.length() == 6) {
                    VerifyEmail verifyEmail = (VerifyEmail) this.A00;
                    if (verifyEmail.A06.A0H() >= verifyEmail.A01) {
                        wDSButton = verifyEmail.A0D;
                        if (wDSButton == null) {
                            throw C18270x1.A0S("nextButton");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A00;
                Log.d("VerifyTwoFactorAuth/submit");
                verifyTwoFactorAuth.A76(0, verifyTwoFactorAuth.A0C.getCode(), false);
                return;
        }
        wDSButton.setEnabled(true);
    }

    public void BXA(String str) {
        WDSButton wDSButton;
        switch (this.A01) {
            case 0:
                wDSButton = ((VerifyEmailActivity) this.A00).A0A;
                if (wDSButton == null) {
                    throw C18270x1.A0S("verifyBtn");
                }
                break;
            case 1:
                VerifyCaptcha verifyCaptcha = (VerifyCaptcha) this.A00;
                WDSButton wDSButton2 = verifyCaptcha.A0U;
                if (wDSButton2 == null) {
                    throw C18270x1.A0S("captchaSubmitButton");
                } else if (wDSButton2.isEnabled()) {
                    wDSButton = verifyCaptcha.A0U;
                    if (wDSButton == null) {
                        throw C18270x1.A0S("captchaSubmitButton");
                    }
                } else {
                    return;
                }
                break;
            case 2:
                wDSButton = ((VerifyEmail) this.A00).A0D;
                if (wDSButton == null) {
                    throw C18270x1.A0S("nextButton");
                }
                break;
            default:
                return;
        }
        wDSButton.setEnabled(false);
    }
}
