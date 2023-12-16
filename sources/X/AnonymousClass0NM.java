package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.0NM  reason: invalid class name */
public class AnonymousClass0NM {
    public BiometricPrompt.AuthenticationCallback A00;
    public AnonymousClass0Q3 A01;
    public final C04540Or A02;

    public BiometricPrompt.AuthenticationCallback A00() {
        BiometricPrompt.AuthenticationCallback authenticationCallback = this.A00;
        if (authenticationCallback != null) {
            return authenticationCallback;
        }
        BiometricPrompt.AuthenticationCallback A002 = C02560Gs.A00(this.A02);
        this.A00 = A002;
        return A002;
    }

    public AnonymousClass0NM(C04540Or r1) {
        this.A02 = r1;
    }
}
