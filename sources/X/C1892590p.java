package X;

import android.content.DialogInterface;

/* renamed from: X.90p  reason: invalid class name and case insensitive filesystem */
public class C1892590p implements DialogInterface.OnClickListener {
    public final int A00;

    public C1892590p(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 3:
                dialogInterface.cancel();
                return;
            case 4:
            case 6:
            case 11:
            case 12:
                return;
            case 5:
                if (dialogInterface == null) {
                    return;
                }
                break;
        }
        dialogInterface.dismiss();
    }
}
