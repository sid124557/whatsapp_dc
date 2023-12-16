package X;

import android.content.DialogInterface;

/* renamed from: X.4K6  reason: invalid class name */
public class AnonymousClass4K6 implements C15930sC {
    public final int A00;

    public AnonymousClass4K6(int i) {
        this.A00 = i;
    }

    public final void BOf(Object obj) {
        DialogInterface dialogInterface;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 4:
                dialogInterface = (DialogInterface) obj;
                break;
            case 3:
                dialogInterface = (DialogInterface) obj;
                C162457s7.A0J(dialogInterface, 0);
                break;
            default:
                return;
        }
        dialogInterface.dismiss();
    }
}
