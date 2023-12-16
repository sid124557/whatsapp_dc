package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.68m  reason: invalid class name and case insensitive filesystem */
public class C1234568m implements AnonymousClass49C {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1234568m(C89654ea r1, C103755Oh r2, int i, int i2) {
        this.A03 = i2;
        this.A01 = r2;
        this.A02 = r1;
        this.A00 = i;
    }

    public final void BaR(boolean z) {
        Activity activity = (Activity) this.A02;
        int i = this.A00;
        if (z) {
            if (i == 2) {
                Intent A022 = C627736r.A02(activity);
                A022.setFlags(67108864);
                activity.startActivity(A022);
            } else if (i != 1) {
                return;
            }
            activity.finish();
        }
    }
}
