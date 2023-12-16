package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0kB  reason: invalid class name and case insensitive filesystem */
public class C11770kB implements Runnable {
    public final /* synthetic */ BiometricFragment A00;
    public final /* synthetic */ AnonymousClass0L0 A01;

    public C11770kB(BiometricFragment biometricFragment, AnonymousClass0L0 r2) {
        this.A00 = biometricFragment;
        this.A01 = r2;
    }

    public void run() {
        AnonymousClass08S r0 = this.A00.A01;
        C04550Os r1 = r0.A04;
        if (r1 == null) {
            r1 = new C004504m(r0);
            r0.A04 = r1;
        }
        r1.A02(this.A01);
    }
}
