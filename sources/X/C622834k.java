package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.34k  reason: invalid class name and case insensitive filesystem */
public class C622834k {
    public final C72303dV A00;
    public final C66243Kp A01;

    public static final boolean A02(ContentValues contentValues, Object obj, String str) {
        if (obj == null) {
            contentValues.putNull(str);
            return true;
        } else if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return true;
        } else if (obj instanceof Byte) {
            contentValues.put(str, (Byte) obj);
            return true;
        } else if (obj instanceof Short) {
            contentValues.put(str, (Short) obj);
            return true;
        } else if (obj instanceof Integer) {
            contentValues.put(str, (Integer) obj);
            return true;
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
            return true;
        } else if (obj instanceof Float) {
            contentValues.put(str, (Float) obj);
            return true;
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
            return true;
        } else if (obj instanceof Boolean) {
            contentValues.put(str, (Boolean) obj);
            return true;
        } else if (!(obj instanceof byte[])) {
            return false;
        } else {
            contentValues.put(str, (byte[]) obj);
            return true;
        }
    }

    public long A03() {
        Cursor A012;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A03).A03, "SELECT COUNT(*) as count FROM available_message_view", "GET_MESSAGES_COUNT_EXCLUDE_DELETED_SQL");
            A012.moveToNext();
            long A0C = AnonymousClass0x2.A0C(A012, "count");
            A012.close();
            A03.close();
            return A0C;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A04(String str, String str2) {
        Cursor A012;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r2 = ((AnonymousClass3H0) A03).A03;
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(str2, str, A0M);
            A012 = C56862sg.A01(r2, String.format("SELECT COUNT(%s) AS count FROM %s", A0M), "GET_NUMBER_OF_ROWS");
            A012.moveToNext();
            long A0C = AnonymousClass0x2.A0C(A012, "count");
            A012.close();
            A03.close();
            return A0C;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass2JQ A05(String str, long j, long j2) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1a = C18300x5.A1a(str, 3);
            C18270x1.A1R(A1a, j);
            AnonymousClass0x2.A1T(A1a, j2);
            A0E = r3.A0E("SELECT DISTINCT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?", "BackupChangesStore/SELECT_DELETED_IDS", A1a);
            AnonymousClass2JQ A002 = A00(A0E, j);
            if (A0E != null) {
                A0E.close();
            }
            A03.close();
            return A002;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass2JQ A06(String str, long j, long j2) {
        Cursor A0E;
        AnonymousClass4GK A03 = this.A00.get();
        try {
            C56862sg r3 = ((AnonymousClass3H0) A03).A03;
            String[] A1a = C18300x5.A1a(str, 3);
            C18270x1.A1R(A1a, j);
            AnonymousClass0x2.A1T(A1a, j2);
            A0E = r3.A0E("SELECT DISTINCT table_row_id FROM backup_changes WHERE ((operation = 'INSERT') OR (operation = 'UPDATE')) AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?", "BackupChangesStore/SELECT_UPDATED_IDS", A1a);
            AnonymousClass2JQ A002 = A00(A0E, j);
            if (A0E != null) {
                A0E.close();
            }
            A03.close();
            return A002;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        C85284Fq A04 = this.A00.A04();
        try {
            ((AnonymousClass3H0) A04).A03.A07("backup_changes", (String) null, "BackupChangesStore/DELETE_BACKUP_CHANGES", (String[]) null);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A08(String str, long j) {
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            A06.put("operation", "DELETE");
            A06.put("table_name", str);
            AnonymousClass3H0.A02(A06, A04, "table_row_id", j).A08("backup_changes", "BackupChangesStore/INSERT_DELETED_ENTITY_ID", A06);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C622834k(C72303dV r1, C66243Kp r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final AnonymousClass2JQ A00(Cursor cursor, long j) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("table_row_id");
        ArrayList A0o = AnonymousClass000.A0o(cursor);
        while (cursor.moveToNext()) {
            AnonymousClass0x2.A1Q(A0o, (long) cursor.getInt(columnIndexOrThrow));
        }
        if (!A0o.isEmpty()) {
            j = C18310x6.A0B(A0o.get(A0o.size() - 1));
        }
        return new AnonymousClass2JQ(A0o, j);
    }

    public static Map A01(Cursor cursor, String[] strArr) {
        Object A0T;
        HashMap A0t = AnonymousClass001.A0t();
        for (int i = 0; i < strArr.length; i++) {
            if (!cursor.isNull(i)) {
                int type = cursor.getType(i);
                if (type == 1) {
                    A0T = C18280x3.A0T(cursor, i);
                } else if (type == 2) {
                    A0T = Double.valueOf(cursor.getDouble(i));
                } else if (type == 3) {
                    A0T = cursor.getString(i);
                } else if (type == 4) {
                    A0T = cursor.getBlob(i);
                }
                A0t.put(strArr[i], A0T);
            }
        }
        return A0t;
    }
}
