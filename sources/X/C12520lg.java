package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0lg  reason: invalid class name and case insensitive filesystem */
public class C12520lg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public C12520lg(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public void run() {
        AnonymousClass08S r0 = this.A01.A01;
        C04550Os r2 = r0.A04;
        if (r2 == null) {
            r2 = new C004504m(r0);
            r0.A04 = r2;
        }
        r2.A01(this.A00, this.A02);
    }
}
