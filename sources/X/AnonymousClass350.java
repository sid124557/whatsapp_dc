package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.350  reason: invalid class name */
public class AnonymousClass350 {
    public static AnonymousClass32M A00(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass32M r2;
        AnonymousClass32M r0;
        Pattern compile = Pattern.compile("index (\\w+)$");
        HashMap A0t = AnonymousClass001.A0t();
        ArrayList A0s = AnonymousClass001.A0s();
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA integrity_check", (String[]) null);
        if (rawQuery != null) {
            int i = 0;
            while (true) {
                try {
                    if (rawQuery.moveToNext()) {
                        i++;
                        String string = rawQuery.getString(0);
                        int i2 = 1;
                        if (i == 1 && "ok".equalsIgnoreCase(string)) {
                            r0 = new AnonymousClass32M(A0s, A0t, 0);
                            break;
                        }
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("BaseSQLiteOpenHelperUtils/integritycheck/c ");
                        A0o.append(i);
                        C18260x0.A0s(" ", string, A0o);
                        Matcher matcher = compile.matcher(string);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            Integer num = (Integer) A0t.get(group);
                            if (num != null) {
                                i2 = 1 + num.intValue();
                            }
                            AnonymousClass0x2.A1I(group, A0t, i2);
                        } else {
                            A0s.add(string);
                        }
                    } else {
                        Iterator A11 = C18290x4.A11(A0t);
                        while (A11.hasNext()) {
                            String A0m = AnonymousClass001.A0m(A11);
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("BaseSQLiteOpenHelperUtils/integritycheck/error-details/index/");
                            A0o2.append(A0m);
                            C18260x0.A1R(A0o2, " cnt=", (Integer) A0t.get(A0m));
                        }
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            C18260x0.A0s("BaseSQLiteOpenHelperUtils/integritycheck/error-details/other/", AnonymousClass001.A0m(it), AnonymousClass001.A0o());
                        }
                        r0 = new AnonymousClass32M(A0s, A0t, i);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e);
                    r2 = new AnonymousClass32M(-3, e.getMessage());
                    rawQuery.close();
                    return r2;
                } catch (Exception e2) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e2);
                    r2 = new AnonymousClass32M(-1, e2.getMessage());
                    rawQuery.close();
                    return r2;
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            rawQuery.close();
            return r0;
        }
        Log.w("BaseSQLiteOpenHelperUtils/integritycheck/query-failed");
        return AnonymousClass32M.A05;
    }

    public static String A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery;
        String str2 = "";
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("select sql from sqlite_master where type='table' and name='");
            A0o.append(str);
            rawQuery = sQLiteDatabase.rawQuery(AnonymousClass000.A0X("';", A0o), (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToNext()) {
                    str2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("sql"));
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
                return str2;
            }
        } catch (Exception e) {
            C18260x0.A0u("base-sqlite-open-helper-utils/schema ", str, AnonymousClass001.A0o(), e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return str2;
        throw th;
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        A03(sQLiteDatabase, A01(sQLiteDatabase, str), str, str2, str3);
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (!C626235v.A07(str, trim, trim2)) {
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("ALTER TABLE ");
                A0o.append(str2);
                A0o.append(" ADD ");
                A0o.append(trim);
                sQLiteDatabase.execSQL(AnonymousClass000.A0V(" ", trim2, A0o));
            } catch (SQLiteException e) {
                C18260x0.A0u("base-sqlite-open-helper-utils/add-column ", trim, AnonymousClass001.A0o(), e);
            }
        }
    }
}
