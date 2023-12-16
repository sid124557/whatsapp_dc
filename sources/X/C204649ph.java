package X;

import android.content.DialogInterface;

/* renamed from: X.9ph  reason: invalid class name and case insensitive filesystem */
public class C204649ph implements DialogInterface.OnDismissListener {
    public final int A00;

    public C204649ph(int i) {
        this.A00 = i;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A00 == 0) {
            dialogInterface.dismiss();
        }
    }
}
