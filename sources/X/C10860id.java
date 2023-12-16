package X;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.0id  reason: invalid class name and case insensitive filesystem */
public class C10860id implements Runnable {
    public final WeakReference A00;

    public void run() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((BiometricFragment) weakReference.get()).A1I();
        }
    }

    public C10860id(BiometricFragment biometricFragment) {
        this.A00 = new WeakReference(biometricFragment);
    }
}
