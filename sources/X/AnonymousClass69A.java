package X;

import android.content.DialogInterface;

/* renamed from: X.69A  reason: invalid class name */
public class AnonymousClass69A implements DialogInterface.OnClickListener {
    public final int A00;

    public AnonymousClass69A(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 8:
            case 11:
            case 16:
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }
}
