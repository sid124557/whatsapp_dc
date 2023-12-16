package X;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0O8  reason: invalid class name */
public class AnonymousClass0O8 {
    public C08270df A00;

    public void A00() {
        String str;
        C08270df r1 = this.A00;
        if (r1 == null) {
            str = "Unable to start authentication. Client fragment manager was null.";
        } else {
            BiometricFragment biometricFragment = (BiometricFragment) r1.A0D("androidx.biometric.BiometricFragment");
            if (biometricFragment == null) {
                str = "Unable to cancel authentication. BiometricFragment not found.";
            } else {
                biometricFragment.A1M(3);
                return;
            }
        }
        Log.e("BiometricPromptCompat", str);
    }

    public void A01(AnonymousClass0MY r5) {
        String str;
        if (r5 != null) {
            C08270df r3 = this.A00;
            if (r3 == null) {
                str = "Unable to start authentication. Client fragment manager was null.";
            } else if (r3.A0t()) {
                str = "Unable to start authentication. Called after onSaveInstanceState().";
            } else {
                BiometricFragment biometricFragment = (BiometricFragment) r3.A0D("androidx.biometric.BiometricFragment");
                if (biometricFragment == null) {
                    biometricFragment = new BiometricFragment();
                    C08240dc r1 = new C08240dc(r3);
                    r1.A0C(biometricFragment, "androidx.biometric.BiometricFragment");
                    r1.A00(true);
                    r3.A0K();
                }
                biometricFragment.A1Q(r5);
                return;
            }
            Log.e("BiometricPromptCompat", str);
            return;
        }
        throw AnonymousClass001.A0c("PromptInfo cannot be null.");
    }

    public AnonymousClass0O8(C04550Os r4, C003203q r5, Executor executor) {
        if (executor == null) {
            throw AnonymousClass001.A0c("Executor must not be null.");
        } else if (r4 != null) {
            C08270df A01 = AnonymousClass00M.A01(r5);
            AnonymousClass08S r0 = (AnonymousClass08S) new AnonymousClass0XL(r5).A01(AnonymousClass08S.class);
            this.A00 = A01;
            if (r0 != null) {
                r0.A0H = executor;
                r0.A04 = r4;
            }
        } else {
            throw AnonymousClass001.A0c("AuthenticationCallback must not be null.");
        }
    }
}
