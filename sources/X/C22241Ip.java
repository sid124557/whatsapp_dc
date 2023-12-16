package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ip  reason: invalid class name and case insensitive filesystem */
public class C22241Ip extends C47692df {
    public final /* synthetic */ AnonymousClass2EY A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C22241Ip(AnonymousClass2EY r1, String str, String str2, String str3) {
        this.A00 = r1;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public void A01(List list) {
        Cursor A0E;
        Cursor A0E2;
        boolean equals;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            C622834k r1 = this.A00.A00;
            String str = this.A03;
            String str2 = this.A01;
            String str3 = this.A02;
            Object obj = map.get(str2);
            if (obj != null) {
                String obj2 = obj.toString();
                C72303dV r5 = r1.A00;
                AnonymousClass4GK A032 = r5.get();
                try {
                    C56862sg r7 = ((AnonymousClass3H0) A032).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    boolean z = false;
                    C18280x3.A19(str, obj2, A1Z);
                    A0E = r7.A0E("SELECT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id = ?) LIMIT 1", "BackupChangesStore/SELECT_SINGLE_DELETED_ID", A1Z);
                    if (A0E.getCount() > 0) {
                        z = true;
                    }
                    A0E.close();
                    A032.close();
                    if (!z) {
                        if (str3 == null) {
                            str3 = str2;
                        }
                        Object obj3 = map.get(str3);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        if (obj3 != null) {
                            A0o.append("SELECT *  FROM ");
                            AnonymousClass0x2.A1P(A0o, str);
                            A0o.append(str3);
                            String A0X = AnonymousClass000.A0X(" = ?", A0o);
                            AnonymousClass4GK A033 = r5.get();
                            try {
                                C56862sg r72 = ((AnonymousClass3H0) A033).A03;
                                String[] A1Y = AnonymousClass0x9.A1Y();
                                A1Y[0] = obj3.toString();
                                A0E2 = r72.A0E(A0X, "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROW_BEFORE_UPDATE", A1Y);
                                String[] columnNames = A0E2.getColumnNames();
                                if (A0E2.moveToNext()) {
                                    Map A012 = C622834k.A01(A0E2, columnNames);
                                    A0E2.close();
                                    A033.close();
                                    ContentValues A07 = AnonymousClass0x9.A07(map.size());
                                    Iterator A0q = AnonymousClass000.A0q(map);
                                    while (A0q.hasNext()) {
                                        Map.Entry A0w = AnonymousClass001.A0w(A0q);
                                        String A0q2 = C18310x6.A0q(A0w);
                                        Object value = A0w.getValue();
                                        if (!A0q2.equalsIgnoreCase(str2) && !A0q2.equalsIgnoreCase(str3)) {
                                            Object obj4 = A012.get(A0q2);
                                            if (obj4 == null) {
                                                if (value == null) {
                                                    continue;
                                                }
                                            } else if (value != null) {
                                                if (!(obj4 instanceof byte[]) || !(value instanceof byte[])) {
                                                    equals = obj4.toString().equals(value.toString());
                                                } else {
                                                    equals = Arrays.equals((byte[]) obj4, (byte[]) value);
                                                }
                                                if (equals) {
                                                    continue;
                                                }
                                            }
                                            if (!C622834k.A02(A07, value, A0q2)) {
                                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                                A0o2.append("BackupChangesStore/Error while inserting values into table '");
                                                A0o2.append(str);
                                                A0o2.append(C18310x6.A0c(value, "'. Unsupported type '", A0o2));
                                                A0o2.append("' for field '");
                                                A0o2.append(A0q2);
                                                String A0X2 = AnonymousClass000.A0X("'", A0o2);
                                                Log.e(A0X2);
                                                throw AnonymousClass001.A0c(A0X2);
                                            }
                                        }
                                    }
                                    if (A07.size() != 0) {
                                        C85284Fq A04 = r5.A04();
                                        try {
                                            C56862sg r13 = ((AnonymousClass3H0) A04).A03;
                                            String A0T = AnonymousClass000.A0T(str3, " = ?");
                                            String[] strArr = new String[1];
                                            AnonymousClass0x7.A1E(obj3, strArr, 0);
                                            if (r13.A06(A07, str, A0T, "BackupChangesStore/INCREMENTAL_BACKUP_UPDATE_ROW", strArr, 5) > 0) {
                                                A04.close();
                                            }
                                        } catch (SQLiteConstraintException e) {
                                            StringBuilder A0o3 = AnonymousClass001.A0o();
                                            A0o3.append("BackupChangesStore/Partial update error, table = ");
                                            A0o3.append(str);
                                            A0o3.append(", pkField = ");
                                            A0o3.append(str3);
                                            C18260x0.A0k(obj3, ", pkValue = ", A0o3, e);
                                        } catch (Throwable th) {
                                            th = th;
                                            A04.close();
                                            throw th;
                                        }
                                        A04.close();
                                    } else {
                                        continue;
                                    }
                                } else {
                                    A0E2.close();
                                    A033.close();
                                }
                                C85284Fq A042 = r5.A04();
                                try {
                                    ContentValues A072 = AnonymousClass0x9.A07(map.size());
                                    Iterator A0q3 = AnonymousClass000.A0q(map);
                                    while (A0q3.hasNext()) {
                                        Map.Entry A0w2 = AnonymousClass001.A0w(A0q3);
                                        String A0q4 = C18310x6.A0q(A0w2);
                                        Object value2 = A0w2.getValue();
                                        if (!C622834k.A02(A072, value2, A0q4)) {
                                            StringBuilder A0o4 = AnonymousClass001.A0o();
                                            A0o4.append("BackupChangesStore/Error while inserting values into table '");
                                            A0o4.append(str);
                                            A0o4.append(C18310x6.A0c(value2, "'. Unsupported type '", A0o4));
                                            A0o4.append("' for field '");
                                            A0o4.append(A0q4);
                                            String A0X3 = AnonymousClass000.A0X("'", A0o4);
                                            Log.e(A0X3);
                                            throw AnonymousClass001.A0c(A0X3);
                                        }
                                    }
                                    ((AnonymousClass3H0) A042).A03.A08(str, "BackupChangesStore/INCREMENTAL_BACKUP_INSERT_ROW", A072);
                                    A042.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                A033.close();
                                throw th;
                            }
                        } else {
                            A0o.append("BackupChangesStore/Unspecified value for PK field '");
                            A0o.append(str3);
                            throw AnonymousClass000.A0F("'", A0o);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    A032.close();
                    throw th;
                }
            } else {
                StringBuilder A0o5 = AnonymousClass001.A0o();
                A0o5.append("BackupChangesStore/Unspecified value for Id field '");
                A0o5.append(str2);
                throw AnonymousClass000.A0F("'", A0o5);
            }
        }
        return;
        throw th;
        throw th;
    }
}
