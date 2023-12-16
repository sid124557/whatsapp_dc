package X;

import android.content.DialogInterface;

/* renamed from: X.9X9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9X9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ boolean A01;

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z = this.A01;
        C89644eZ r0 = this.A00;
        if (z) {
            r0.finish();
        }
    }

    public /* synthetic */ AnonymousClass9X9(C89644eZ r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }
}
