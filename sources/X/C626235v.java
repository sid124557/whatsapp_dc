package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.35v  reason: invalid class name and case insensitive filesystem */
public class C626235v {
    public static String A00(C56862sg r4, String str, String str2) {
        Cursor A0E;
        String str3 = "";
        String[] A1Z = AnonymousClass0x9.A1Z();
        AnonymousClass000.A16(str, str2, A1Z);
        try {
            A0E = r4.A0E("SELECT sql FROM sqlite_master WHERE type = ? AND name = ?", "SELECT_SQL_FROM_SQLITE_MASTER_BY_TYPE_AND_NAME", A1Z);
            if (A0E.moveToNext()) {
                str3 = A0E.getString(A0E.getColumnIndexOrThrow("sql"));
            }
            A0E.close();
            return str3;
        } catch (Exception e) {
            C18260x0.A0u("BaseDatabaseTable/getSqlFor view = ", str2, AnonymousClass001.A0o(), e);
            return str3;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(AnonymousClass000.A0V("DROP TABLE IF EXISTS ", str, AnonymousClass001.A0o()));
    }

    public static void A02(C56862sg r4, String str, String str2) {
        C18260x0.A0s("SharedDBQueryExecutor/dropIndex/attempting to drop index: ", str2, AnonymousClass001.A0o());
        r4.A0H(AnonymousClass000.A0V("DROP INDEX IF EXISTS ", str2, AnonymousClass001.A0o()), C57242tK.A00(str, "dropIndexIfExistsWithoutStatement", AnonymousClass000.A0V("DROP_", str2, AnonymousClass001.A0o())));
    }

    public static void A03(C56862sg r4, String str, String str2) {
        r4.A0H(AnonymousClass000.A0V("DROP TABLE IF EXISTS ", str2, AnonymousClass001.A0o()), C57242tK.A00(str, "dropLoggableDatabaseTables", AnonymousClass000.A0V("DROP_", str2, AnonymousClass001.A0o())));
    }

    public static boolean A04(C56862sg r1, String str) {
        return TextUtils.isEmpty(A00(r1, "table", str));
    }

    public static boolean A05(C56862sg r6, String str, String str2, String str3, String str4, String str5) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (A07(str, trim, trim2)) {
            return false;
        }
        if (trim2.contains(" NOT NULL") && !trim2.contains(" DEFAULT ")) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Cannot add not null without default value ");
            A0o.append(str2);
            C626936e.A0D(false, AnonymousClass000.A0V(".", trim, A0o));
            trim2 = trim2.replace(" NOT NULL", "");
        }
        try {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("ALTER TABLE ");
            A0o2.append(str2);
            A0o2.append(" ADD ");
            A0o2.append(trim);
            r6.A0H(AnonymousClass000.A0V(" ", trim2, A0o2), AnonymousClass000.A0X("/addColumnIfNotExists/ALTER_TABLE", AnonymousClass000.A0l(str5)));
            return true;
        } catch (SQLiteException e) {
            C18260x0.A0v("databasehelper/addColumnIfNotExists/alter_table ", trim, AnonymousClass001.A0o(), e);
            return false;
        }
    }

    public static boolean A06(C56862sg r10, String str, List list, List list2) {
        C56862sg r8 = r10;
        String str2 = str;
        String A00 = A00(r8, "table", str);
        if (TextUtils.isEmpty(A00)) {
            ArrayList A0I = AnonymousClass002.A0I(list.size() + list2.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C59422wt r1 = (C59422wt) it.next();
                String str3 = r1.A02;
                String str4 = r1.A00.value;
                String str5 = r1.A01;
                if (!C107575bX.A0F(str5)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    AnonymousClass0x2.A1N(A0o, str4);
                    str4 = AnonymousClass000.A0X(str5.trim(), A0o);
                }
                if (!C107575bX.A0F(str4)) {
                    str3 = AnonymousClass000.A0V(" ", str4, AnonymousClass000.A0l(str3));
                }
                A0I.add(str3);
            }
            A0I.addAll(list2);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("CREATE TABLE IF NOT EXISTS ");
            C18310x6.A1O(A0o2, str);
            C18310x6.A1G(",", A0I, A0o2);
            r8.A0H(AnonymousClass000.A0e(A0o2), AnonymousClass000.A0V("CREATE_", str, AnonymousClass001.A0o()));
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C59422wt r12 = (C59422wt) it2.next();
            String str6 = r12.A02;
            String str7 = r12.A00.value;
            String str8 = r12.A01;
            if (!C107575bX.A0F(str8)) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                AnonymousClass0x2.A1N(A0o3, str7);
                str7 = AnonymousClass000.A0X(str8.trim(), A0o3);
            }
            A05(r8, A00, str2, str6, str7, "SharedDBQueryExecutor/createOrAlterTable");
        }
        return false;
    }

    public static boolean A07(String str, String str2, String str3) {
        String trim = str2.trim();
        String upperCase = str3.trim().toUpperCase(Locale.ROOT);
        String replaceAll = str.replaceAll("\\s+", " ");
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A0p(",", trim, " ", upperCase, A0o);
        if (replaceAll.contains(A0o.toString()) || (upperCase.isEmpty() && str.replaceAll("\\s+", " ").contains(AnonymousClass000.A0T(trim, ",")))) {
            return true;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("[(,]\\s*(`*)");
        A0o2.append(trim);
        A0o2.append("(`*)(\\s+)");
        return Pattern.compile(AnonymousClass000.A0X(upperCase.replaceAll("\\s+", "(\\\\s+)"), A0o2), 2).matcher(str).find();
    }
}
