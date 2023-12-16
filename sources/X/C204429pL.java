package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.9pL  reason: invalid class name and case insensitive filesystem */
public class C204429pL implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C204429pL(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A02;
        Object obj = this.A01;
        switch (i2) {
            case 0:
            case 1:
                AnonymousClass9DA r1 = (AnonymousClass9DA) obj;
                C621433s.A00(r1, this.A00);
                r1.A7H();
                r1.finish();
                return;
            default:
                C621433s.A00((Activity) obj, this.A00);
                return;
        }
    }
}
