package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.361  reason: invalid class name */
public abstract class AnonymousClass361 {
    public final AnonymousClass1RI A00;

    public static Cursor A09(AnonymousClass4GK r1, String str, String str2) {
        return A0A(r1, str, str2, (String[]) null);
    }

    public static long A06(ContentValues contentValues, C85284Fq r4, String str) {
        return ((AnonymousClass3H0) r4).A03.A09(str, AnonymousClass000.A0X(str.toUpperCase(Locale.ROOT), AnonymousClass000.A0l("ContactProvider/insertOrReplace/INSERT_")), contentValues);
    }

    public static long A07(ContentValues contentValues, C85284Fq r6, String str, String str2, String[] strArr) {
        return (long) ((AnonymousClass3H0) r6).A03.A05(contentValues, str, str2, AnonymousClass000.A0X(str.toUpperCase(Locale.ROOT), AnonymousClass000.A0l("ContactProvider/delete/UPDATE_")), strArr);
    }

    public static long A08(C85284Fq r2, String str, String str2, String[] strArr) {
        return (long) ((AnonymousClass3H0) r2).A03.A07(str, str2, AnonymousClass000.A0X(str.toUpperCase(Locale.ROOT), AnonymousClass000.A0l("ContactProvider/delete/DELETE_")), strArr);
    }

    public static Cursor A0A(AnonymousClass4GK r2, String str, String str2, String[] strArr) {
        return ((AnonymousClass3H0) r2).A03.A0E(str, AnonymousClass000.A0V("ContactProvider/query/QUERY_", str2, AnonymousClass001.A0o()), strArr);
    }

    public static void A0B(ContentValues contentValues, C85284Fq r4, String str) {
        ((AnonymousClass3H0) r4).A03.A0B(str, AnonymousClass000.A0X(str.toUpperCase(Locale.ROOT), AnonymousClass000.A0l("ContactProvider/insertOrReplace/REPLACE_")), contentValues);
    }

    public AnonymousClass361(AnonymousClass1RI r3) {
        this.A00 = r3;
        r3.A05.A06(new AnonymousClass2IT(this));
    }
}
