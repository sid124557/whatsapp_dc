package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.01L  reason: invalid class name */
public class AnonymousClass01L extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ C04540Or A00;

    public AnonymousClass01L(C04540Or r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C06190Wp r3;
        IdentityCredential A01;
        if (authenticationResult != null) {
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            r3 = null;
            if (cryptoObject != null) {
                Cipher cipher = cryptoObject.getCipher();
                if (cipher != null) {
                    r3 = new C06190Wp(cipher);
                } else {
                    Signature signature = cryptoObject.getSignature();
                    if (signature != null) {
                        r3 = new C06190Wp(signature);
                    } else {
                        Mac mac = cryptoObject.getMac();
                        if (mac != null) {
                            r3 = new C06190Wp(mac);
                        } else if (Build.VERSION.SDK_INT >= 30 && (A01 = AnonymousClass0RB.A01(cryptoObject)) != null) {
                            r3 = new C06190Wp(A01);
                        }
                    }
                }
            }
        } else {
            r3 = null;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = C02570Gt.A00(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.A00.A02(new AnonymousClass0L0(r3, i2));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
