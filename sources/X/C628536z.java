package X;

import android.content.DialogInterface;

/* renamed from: X.36z  reason: invalid class name and case insensitive filesystem */
public class C628536z implements DialogInterface.OnClickListener {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();

    public void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass08M r0;
        if (i == -3) {
            r0 = this.A01;
        } else if (i == -2) {
            r0 = this.A00;
        } else if (i == -1) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.A0G(dialogInterface);
    }
}
