package X;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.0Xt  reason: invalid class name and case insensitive filesystem */
public class C06450Xt {
    public static BiometricPrompt.Builder A00(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    public static BiometricPrompt A01(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    public static void A05(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void A06(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static void A02(DialogInterface.OnClickListener onClickListener, BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    public static void A04(BiometricPrompt.AuthenticationCallback authenticationCallback, BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    public static void A03(BiometricPrompt.AuthenticationCallback authenticationCallback, BiometricPrompt.CryptoObject cryptoObject, BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }
}
