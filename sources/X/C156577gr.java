package X;

import android.view.View;

/* renamed from: X.7gr  reason: invalid class name and case insensitive filesystem */
public class C156577gr {
    public final C152987aU A00;
    public final C180488l9 A01;
    public final C162217rT A02;
    public final boolean A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = 1073741824;
        } else if (Float.isNaN(f2)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f2);
            i = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public C156577gr(C152987aU r1, C180488l9 r2, C162217rT r3, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z;
    }
}
