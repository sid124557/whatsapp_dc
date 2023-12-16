package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.5Vo  reason: invalid class name */
public final class AnonymousClass5Vo {
    public final AnonymousClass7PH A00;

    public AnonymousClass5Vo(Context context, int i) {
        C150497Qy r0;
        AnonymousClass7PH r2 = new AnonymousClass7PH();
        this.A00 = r2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1462679k.A03);
        int i2 = obtainStyledAttributes.getInt(2, -1);
        if (i2 == 0) {
            r0 = C139786sc.A00;
        } else if (i2 != 1) {
            if (i2 == 2) {
                r0 = new C139816sf(C817640z.A00);
            }
            r2.A06 = obtainStyledAttributes.getBoolean(3, false);
            r2.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            r2.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        } else {
            r0 = C139796sd.A00;
        }
        r2.A04 = r0;
        r2.A06 = obtainStyledAttributes.getBoolean(3, false);
        r2.A02 = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        r2.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass5Vo() {
        this.A00 = new AnonymousClass7PH();
    }
}
