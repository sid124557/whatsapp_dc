package X;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

/* renamed from: X.0X4  reason: invalid class name */
public final class AnonymousClass0X4 {
    public static final int A03(String str, String[] strArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('.');
        String A0X = AnonymousClass000.A0X(str, A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append('.');
        A0o2.append(str);
        String A0j = AnonymousClass001.A0j(A0o2, '`');
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = strArr[i];
            int i3 = i2 + 1;
            if (str2.length() >= str.length() + 2 && (C162457s7.A0J(A0X, 1) || (str2.charAt(0) == '`' && C162457s7.A0J(A0j, 1)))) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    public static final int A00(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        C162457s7.A0D(columnNames);
        return A03(str, columnNames);
    }

    public static final int A01(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('`');
        A0o.append(str);
        int columnIndex2 = cursor.getColumnIndex(AnonymousClass001.A0j(A0o, '`'));
        if (columnIndex2 < 0) {
            return A00(cursor, str);
        }
        return columnIndex2;
    }

    public static final int A02(Cursor cursor, String str) {
        String str2;
        int A01 = A01(cursor, str);
        if (A01 >= 0) {
            return A01;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C162457s7.A0D(columnNames);
            str2 = C73703fw.A01(", ", columnNames);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("column '");
        A0o.append(str);
        A0o.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0F(str2, A0o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor A04(android.database.Cursor r7) {
        /*
            java.lang.String[] r1 = r7.getColumnNames()     // Catch:{ all -> 0x0067 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x0067 }
            android.database.MatrixCursor r6 = new android.database.MatrixCursor     // Catch:{ all -> 0x0067 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0067 }
        L_0x000d:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0067 }
            r5 = 0
            if (r0 == 0) goto L_0x0063
            int r0 = r7.getColumnCount()     // Catch:{ all -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0067 }
            int r3 = r7.getColumnCount()     // Catch:{ all -> 0x0067 }
            r2 = 0
        L_0x001f:
            if (r2 >= r3) goto L_0x0059
            int r1 = r7.getType(r2)     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0054
            r0 = 1
            if (r1 == r0) goto L_0x004c
            r0 = 2
            if (r1 == r0) goto L_0x0041
            r0 = 3
            if (r1 == r0) goto L_0x003a
            r0 = 4
            if (r1 != r0) goto L_0x005d
            byte[] r0 = r7.getBlob(r2)     // Catch:{ all -> 0x0067 }
            r4[r2] = r0     // Catch:{ all -> 0x0067 }
            goto L_0x0056
        L_0x003a:
            java.lang.String r0 = r7.getString(r2)     // Catch:{ all -> 0x0067 }
            r4[r2] = r0     // Catch:{ all -> 0x0067 }
            goto L_0x0056
        L_0x0041:
            double r0 = r7.getDouble(r2)     // Catch:{ all -> 0x0067 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0067 }
            r4[r2] = r0     // Catch:{ all -> 0x0067 }
            goto L_0x0056
        L_0x004c:
            long r0 = r7.getLong(r2)     // Catch:{ all -> 0x0067 }
            X.AnonymousClass000.A1Q(r4, r2, r0)     // Catch:{ all -> 0x0067 }
            goto L_0x0056
        L_0x0054:
            r4[r2] = r5     // Catch:{ all -> 0x0067 }
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0059:
            r6.addRow(r4)     // Catch:{ all -> 0x0067 }
            goto L_0x000d
        L_0x005d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0067 }
            r0.<init>()     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0063:
            X.AnonymousClass2A8.A00(r7, r5)
            return r6
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X4.A04(android.database.Cursor):android.database.Cursor");
    }
}
