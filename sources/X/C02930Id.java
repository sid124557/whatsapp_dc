package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;

/* renamed from: X.0Id  reason: invalid class name and case insensitive filesystem */
public final class C02930Id {
    public static final Cursor A00(AnonymousClass0R5 r3, C16680tn r4, boolean z) {
        int i;
        r3.A08();
        r3.A09();
        Cursor Bi0 = C001000s.A00(r3).Bi0(r4);
        if (!z || !(Bi0 instanceof AbstractWindowedCursor)) {
            return Bi0;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) Bi0;
        int count = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
            i = abstractWindowedCursor.getWindow().getNumRows();
        } else {
            i = count;
        }
        if (Build.VERSION.SDK_INT < 23 || i < count) {
            return AnonymousClass0X4.A04(Bi0);
        }
        return Bi0;
    }
}
