package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

@Deprecated
/* renamed from: X.0XP  reason: invalid class name */
public class AnonymousClass0XP {
    public final Context A00;

    public void A04(AnonymousClass0Q3 r8, C05860Vg r9, AnonymousClass0QU r10) {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT >= 23 && (A02 = A02(this.A00)) != null) {
            C06460Xu.A04((CancellationSignal) r10.A00(), (Handler) null, A02, A01(r9), A00(r8), 0);
        }
    }

    public static FingerprintManager.AuthenticationCallback A00(AnonymousClass0Q3 r1) {
        return new AnonymousClass01M(r1);
    }

    public boolean A05() {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT < 23 || (A02 = A02(this.A00)) == null || !C06460Xu.A05(A02)) {
            return false;
        }
        return true;
    }

    public boolean A06() {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT < 23 || (A02 = A02(this.A00)) == null || !C06460Xu.A06(A02)) {
            return false;
        }
        return true;
    }

    public AnonymousClass0XP(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager.CryptoObject A01(C05860Vg r0) {
        return C06460Xu.A00(r0);
    }

    public static FingerprintManager A02(Context context) {
        return C06460Xu.A02(context);
    }

    public static C05860Vg A03(FingerprintManager.CryptoObject cryptoObject) {
        return C06460Xu.A03(cryptoObject);
    }
}
