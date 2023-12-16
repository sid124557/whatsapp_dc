package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: X.35u  reason: invalid class name and case insensitive filesystem */
public class C626135u {
    public static void A02(Cursor cursor, HashMap hashMap, String[] strArr) {
        for (String str : strArr) {
            C626936e.A0D(!hashMap.containsKey(str), "Column is already in the map, make sure there are no columns with same name in the same query.");
            AnonymousClass0x2.A1I(str, hashMap, cursor.getColumnIndexOrThrow(str));
        }
    }

    public static boolean A03(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return false;
        }
        return AnonymousClass001.A1T(cursor.getInt(i));
    }

    public static C56862sg A00(SQLiteDatabase sQLiteDatabase, C60972zT r2, C45932ao r3, String str) {
        Log.i("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase");
        if (TextUtils.isEmpty(str)) {
            str = "unspecified";
        }
        return new C56862sg(sQLiteDatabase, r2, r3, str);
    }

    public static String A01(Cursor cursor, int i) {
        try {
            return cursor.getString(i);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e);
            throw e;
        } catch (SQLiteException e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("Unable to convert BLOB to string")) {
                Log.e("DatabaseUtils/tryGetStringOrGetBlob/error reading string or blob", e2);
                throw e2;
            }
            byte[] blob = cursor.getBlob(i);
            if (blob == null) {
                return null;
            }
            try {
                String A0h = C18320x8.A0h(blob);
                C18260x0.A0s("DatabaseUtils/tryGetStringOrGetBlob/converting from blob; string=", A0h, AnonymousClass001.A0o());
                return A0h;
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
    }

    public static boolean A04(Cursor cursor, int i) {
        return AnonymousClass000.A1T((cursor.getLong(i) > 1 ? 1 : (cursor.getLong(i) == 1 ? 0 : -1)));
    }

    public static boolean A05(Cursor cursor, String str) {
        return A04(cursor, cursor.getColumnIndexOrThrow(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        if (r1.delete() != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
        if (r3.delete() != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r2.delete() != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-wal"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r3 = X.AnonymousClass002.A0B(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-journal"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r2 = X.AnonymousClass002.A0B(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-shm"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r1 = X.AnonymousClass002.A0B(r0)
            boolean r0 = r3.exists()
            r5 = 0
            if (r0 == 0) goto L_0x004d
            boolean r0 = r3.delete()
            r4 = 0
            if (r0 == 0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x005b
            boolean r0 = r2.delete()
            r3 = 0
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0069
            boolean r0 = r1.delete()
            r2 = 0
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r2 = 1
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)
            java.lang.String r0 = "deleteTemporaryFiles/journalDeleted="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; writeAheadLogDeleted="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; sharedDeleted="
            X.C18260x0.A1E(r0, r1, r2)
            if (r4 == 0) goto L_0x008a
            if (r3 == 0) goto L_0x008a
            if (r2 == 0) goto L_0x008a
            r5 = 1
        L_0x008a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C626135u.A06(java.io.File, java.lang.String):boolean");
    }
}
