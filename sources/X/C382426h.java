package X;

import android.database.Cursor;

/* renamed from: X.26h  reason: invalid class name and case insensitive filesystem */
public final class C382426h {
    public static final boolean A00(Cursor cursor, int i) {
        if (i == -1 || cursor.isNull(i) || cursor.getInt(i) != 1) {
            return false;
        }
        return true;
    }
}
