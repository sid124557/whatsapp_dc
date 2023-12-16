package X;

import android.content.DialogInterface;

/* renamed from: X.92n  reason: invalid class name and case insensitive filesystem */
public class C1897592n implements C15930sC {
    public final int A00;

    public C1897592n(int i) {
        this.A00 = i;
    }

    public final void BOf(Object obj) {
        DialogInterface dialogInterface = (DialogInterface) obj;
        switch (this.A00) {
            case 1:
            case 2:
                C162457s7.A0J(dialogInterface, 0);
                break;
        }
        dialogInterface.dismiss();
    }
}
