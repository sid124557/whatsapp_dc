package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: X.0U2  reason: invalid class name */
public abstract class AnonymousClass0U2 {
    public abstract void A04(C17430vW r1, int i, int i2);

    public static final void A02(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                int A00 = C162457s7.A00(str.charAt(i2), 32);
                boolean z2 = false;
                if (A00 <= 0) {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", AnonymousClass000.A0V("deleting the database file: ", str, AnonymousClass001.A0o()));
                try {
                    SQLiteDatabase.deleteDatabase(AnonymousClass002.A0B(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r1.hasNext() != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r0 = ((android.util.Pair) r1.next()).second;
        X.C162457s7.A0C(r0);
        A02((java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        r0 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[ExcHandler: all (r2v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v6 java.util.List) = (r0v5 java.util.List), (r0v13 java.util.List), (r0v13 java.util.List) binds: [B:3:0x0023, B:5:0x0025, B:6:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C17430vW r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".path"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r1)
            r2 = r4
            X.0en r2 = (X.C08630en) r2
            android.database.sqlite.SQLiteDatabase r1 = r2.A00
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x006d
            r0 = 0
            java.util.List r0 = r2.A01     // Catch:{ SQLiteException -> 0x0025, all -> 0x0045 }
        L_0x0025:
            r4.close()     // Catch:{ IOException -> 0x0028, all -> 0x0045 }
        L_0x0028:
            if (r0 == 0) goto L_0x006d
            java.util.Iterator r1 = r0.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C162457s7.A0C(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r0)
            goto L_0x002e
        L_0x0045:
            r2 = move-exception
            if (r0 == 0) goto L_0x0063
            java.util.Iterator r1 = r0.iterator()
        L_0x004c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C162457s7.A0C(r0)
            java.lang.String r0 = (java.lang.String) r0
            A02(r0)
            goto L_0x004c
        L_0x0063:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x006c
            A02(r0)
        L_0x006c:
            throw r2
        L_0x006d:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0076
            A02(r0)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0U2.A03(X.0vW):void");
    }
}
