package X;

import androidx.biometric.BiometricFragment;

/* renamed from: X.0lh  reason: invalid class name and case insensitive filesystem */
public class C12530lh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BiometricFragment A01;
    public final /* synthetic */ CharSequence A02;

    public C12530lh(BiometricFragment biometricFragment, CharSequence charSequence, int i) {
        this.A01 = biometricFragment;
        this.A00 = i;
        this.A02 = charSequence;
    }

    public void run() {
        BiometricFragment biometricFragment = this.A01;
        biometricFragment.A1O(this.A00, this.A02);
        biometricFragment.A1H();
    }
}
