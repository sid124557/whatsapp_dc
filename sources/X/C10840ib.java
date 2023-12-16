package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0ib  reason: invalid class name and case insensitive filesystem */
public class C10840ib implements Runnable {
    public final /* synthetic */ BiometricFragment A00;

    public C10840ib(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public void run() {
        AnonymousClass08S r1 = this.A00.A01;
        C04550Os r0 = r1.A04;
        if (r0 == null) {
            r0 = new C004504m(r1);
            r1.A04 = r0;
        }
        r0.A00();
    }
}
