package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0en  reason: invalid class name and case insensitive filesystem */
public final class C08630en implements C17430vW {
    public static final String[] A02 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A03 = new String[0];
    public final SQLiteDatabase A00;
    public final List A01;

    public C17320vK AzF(String str) {
        C162457s7.A0J(str, 0);
        SQLiteStatement compileStatement = this.A00.compileStatement(str);
        C162457s7.A0D(compileStatement);
        return new AnonymousClass0A6(compileStatement);
    }

    public void B2q(String str) {
        C162457s7.A0J(str, 0);
        this.A00.execSQL(str);
    }

    public Cursor Bi1(String str) {
        C162457s7.A0J(str, 0);
        return Bi0(new C08710ev(str));
    }

    public final boolean A02(SQLiteDatabase sQLiteDatabase) {
        return C162457s7.A0P(this.A00, sQLiteDatabase);
    }

    public Cursor Bi0(C16680tn r6) {
        Cursor rawQueryWithFactory = this.A00.rawQueryWithFactory(new AnonymousClass0ZB(new C14430pg(r6)), r6.BDC(), A03, (String) null);
        C162457s7.A0D(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public int BrW(ContentValues contentValues, String str, String str2, Object[] objArr, int i) {
        long j;
        int byteValue;
        double doubleValue;
        String str3;
        int i2 = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("UPDATE ");
            A0o.append(A02[3]);
            A0o.append("WorkSpec");
            A0o.append(" SET ");
            Iterator<String> it = contentValues.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (i2 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                A0o.append(str3);
                A0o.append(A0m);
                objArr2[i2] = contentValues.get(A0m);
                A0o.append("=?");
                i2++;
            }
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                A0o.append(" WHERE ");
                A0o.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            String obj = A0o.toString();
            C162457s7.A0D(obj);
            C17320vK AzF = AzF(obj);
            int i4 = 0;
            while (i4 < length) {
                Object obj2 = objArr2[i4];
                i4++;
                if (obj2 == null) {
                    AzF.Axt(i4);
                } else if (obj2 instanceof byte[]) {
                    AzF.Axp(i4, (byte[]) obj2);
                } else {
                    if (obj2 instanceof Float) {
                        doubleValue = (double) AnonymousClass001.A05(obj2);
                    } else if (obj2 instanceof Double) {
                        doubleValue = ((Number) obj2).doubleValue();
                    } else {
                        if (obj2 instanceof Long) {
                            j = ((Number) obj2).longValue();
                        } else {
                            if (obj2 instanceof Integer) {
                                byteValue = AnonymousClass001.A0K(obj2);
                            } else if (obj2 instanceof Short) {
                                byteValue = ((Number) obj2).shortValue();
                            } else if (obj2 instanceof Byte) {
                                byteValue = ((Number) obj2).byteValue();
                            } else if (obj2 instanceof String) {
                                AzF.Axu(i4, (String) obj2);
                            } else if (!(obj2 instanceof Boolean)) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append("Cannot bind ");
                                A0o2.append(obj2);
                                A0o2.append(" at index ");
                                A0o2.append(i4);
                                throw AnonymousClass000.A0F(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", A0o2);
                            } else if (AnonymousClass001.A1Z(obj2)) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            j = (long) byteValue;
                        }
                        AzF.Axs(i4, j);
                    }
                    AzF.Axr(i4, doubleValue);
                }
            }
            return ((AnonymousClass0A6) AzF).A00.executeUpdateDelete();
        }
        throw AnonymousClass001.A0c("Empty values");
    }

    public void close() {
        this.A00.close();
    }

    public C08630en(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        this.A01 = sQLiteDatabase.getAttachedDbs();
    }

    public static final Cursor A00(SQLiteCursorDriver sQLiteCursorDriver, SQLiteDatabase sQLiteDatabase, SQLiteQuery sQLiteQuery, String str, AnonymousClass4GT r4) {
        return (Cursor) r4.BGk(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
