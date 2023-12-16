package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0UE  reason: invalid class name */
public class AnonymousClass0UE {
    public final BiometricManager A00;
    public final C15640rh A01;
    public final AnonymousClass0XP A02;

    public final int A00() {
        int i;
        boolean A012 = AnonymousClass0RE.A01(((C07680bQ) this.A01).A00);
        AnonymousClass0XP r1 = this.A02;
        if (r1 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            i = 1;
        } else if (!r1.A06()) {
            i = 12;
        } else {
            boolean A05 = r1.A05();
            i = 0;
            if (!A05) {
                i = 11;
            }
        }
        if (!A012) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        return -1;
    }

    public final int A01() {
        BiometricPrompt.CryptoObject A002;
        Method A022 = C05660Uk.A02();
        if (!(A022 == null || (A002 = AnonymousClass0RC.A00(AnonymousClass0RC.A01())) == null)) {
            try {
                Object invoke = A022.invoke(this.A00, AnonymousClass000.A1b(A002));
                if (invoke instanceof Integer) {
                    return ((Number) invoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
            }
        }
        int A023 = A02();
        Context context = ((C07680bQ) this.A01).A00;
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String equals : context.getResources().getStringArray(R.array.f2nameremoved)) {
                if (str.equals(equals)) {
                    return A023;
                }
            }
        }
        if (A023 == 0) {
            return A00();
        }
        return A023;
    }

    public final int A02() {
        BiometricManager biometricManager = this.A00;
        if (biometricManager != null) {
            return C05660Uk.A00(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public int A03(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.A00;
            if (biometricManager != null) {
                return C02600Gw.A00(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        } else if (!C02580Gu.A00(i)) {
            return -2;
        } else {
            Context context = ((C07680bQ) this.A01).A00;
            if (AnonymousClass0RE.A00(context) == null) {
                return 12;
            }
            if ((32768 & i) != 0) {
                if (AnonymousClass0RE.A01(context)) {
                    return 0;
                }
                return 11;
            } else if (i2 == 29) {
                if ((i & 255) == 255) {
                    return A02();
                }
                return A01();
            } else if (i2 != 28) {
                AnonymousClass0XP r1 = this.A02;
                if (r1 == null) {
                    Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
                    return 1;
                } else if (!r1.A06()) {
                    return 12;
                } else {
                    if (!r1.A05()) {
                        return 11;
                    }
                    return 0;
                }
            } else if (C02630Gz.A00(context)) {
                return A00();
            } else {
                return 12;
            }
        }
    }

    public AnonymousClass0UE(C15640rh r5) {
        BiometricManager biometricManager;
        this.A01 = r5;
        int i = Build.VERSION.SDK_INT;
        AnonymousClass0XP r2 = null;
        if (i >= 29) {
            biometricManager = r5.B4d();
        } else {
            biometricManager = null;
        }
        this.A00 = biometricManager;
        this.A02 = i <= 29 ? new AnonymousClass0XP(((C07680bQ) r5).A00) : r2;
    }
}
