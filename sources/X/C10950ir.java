package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.0ir  reason: invalid class name and case insensitive filesystem */
public class C10950ir implements Runnable {
    public final /* synthetic */ DialogFragment A00;

    public C10950ir(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void run() {
        DialogFragment dialogFragment = this.A00;
        dialogFragment.A05.onDismiss(dialogFragment.A03);
    }
}
