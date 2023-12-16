package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.33z  reason: invalid class name and case insensitive filesystem */
public class C622033z {
    public static String A00(C56862sg r3, String str, String str2) {
        Cursor A0E = r3.A0E("SELECT value FROM props WHERE key = ?", "SELECT_PROPS_VALUE_BY_KEY", C18270x1.A1b(str));
        try {
            if (A0E.moveToNext()) {
                String A0Z = AnonymousClass0x2.A0Z(A0E, "value");
                A0E.close();
                return A0Z;
            }
            A0E.close();
            return str2;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public static void A01(C56862sg r3, String str) {
        r3.A0I("DELETE FROM props WHERE key = ?", "DELETE_PROPS", C18270x1.A1b(str));
    }

    public static void A02(C56862sg r3, String str, String str2, long j) {
        ContentValues A09 = C18280x3.A09();
        A09.put("key", str);
        C18270x1.A0c(A09, "value", j);
        r3.A0B("props", C57242tK.A00(str2, "setProp", "REPLACE_PROPS_LONG"), A09);
    }

    public static void A03(C56862sg r3, String str, String str2, String str3) {
        ContentValues A09 = C18280x3.A09();
        A09.put("key", str);
        A09.put("value", str2);
        r3.A0B("props", C57242tK.A00(str3, "setProp", "REPLACE_PROPS_STRING"), A09);
    }
}
