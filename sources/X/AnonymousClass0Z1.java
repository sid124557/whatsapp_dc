package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0Z1  reason: invalid class name */
public class AnonymousClass0Z1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment A00;

    public AnonymousClass0Z1(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
