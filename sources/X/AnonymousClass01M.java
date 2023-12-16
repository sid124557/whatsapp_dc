package X;

import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.01M  reason: invalid class name */
public class AnonymousClass01M extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ AnonymousClass0Q3 A00;

    public AnonymousClass01M(AnonymousClass0Q3 r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        this.A00.A02(i, charSequence);
    }

    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.A00.A03(new AnonymousClass0KL(AnonymousClass0XP.A03(C06460Xu.A01(authenticationResult))));
    }
}
