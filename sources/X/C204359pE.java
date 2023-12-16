package X;

import android.content.DialogInterface;

/* renamed from: X.9pE  reason: invalid class name and case insensitive filesystem */
public class C204359pE implements DialogInterface.OnClickListener {
    public final int A00;

    public C204359pE(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 3:
            case 6:
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}
