package X;

import com.whatsapp.CodeInputField;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;

/* renamed from: X.5k9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112695k9 implements AnonymousClass49Y {
    public final /* synthetic */ VerifyTwoFactorAuth A00;

    public final void BPq(C59622xD r4) {
        CodeInputField codeInputField;
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerifyTwoFactorAuth/networkStateChanged isConnected: ");
        boolean z = r4.A01;
        C18260x0.A1U(A0o, z);
        if (z && (codeInputField = verifyTwoFactorAuth.A0C) != null && codeInputField.getCode().length() == 6) {
            Log.d("VerifyTwoFactorAuth/submit");
            verifyTwoFactorAuth.A76(0, verifyTwoFactorAuth.A0C.getCode(), false);
        }
    }

    public /* synthetic */ C112695k9(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A00 = verifyTwoFactorAuth;
    }
}
