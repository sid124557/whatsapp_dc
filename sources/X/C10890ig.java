package X;

import android.content.Context;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;
import com.whatsapp.R;

/* renamed from: X.0ig  reason: invalid class name and case insensitive filesystem */
public class C10890ig implements Runnable {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public C10890ig(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public void run() {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        Context A1D = fingerprintDialogFragment.A1D();
        if (A1D == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        fingerprintDialogFragment.A04.A0E(1);
        fingerprintDialogFragment.A04.A0F(A1D.getString(R.string.f11nameremoved));
    }
}
