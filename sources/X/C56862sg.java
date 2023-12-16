package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;

/* renamed from: X.2sg  reason: invalid class name and case insensitive filesystem */
public class C56862sg {
    public final SQLiteDatabase A00;
    public final C60972zT A01;
    public final C45932ao A02;
    public final String A03;

    public static Cursor A01(C56862sg r1, String str, String str2) {
        return r1.A0E(str, str2, (String[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A08(java.lang.String r16, java.lang.String r17, android.content.ContentValues r18) {
        /*
            r15 = this;
            r8 = 0
            long r3 = android.os.SystemClock.uptimeMillis()
            r7 = r16
            r2 = r18
            android.database.sqlite.SQLiteDatabase r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x0010 }
            long r11 = r0.insert(r7, r8, r2)     // Catch:{ SQLiteConstraintException -> 0x0012 }
            goto L_0x001a
        L_0x0010:
            r1 = move-exception
            goto L_0x0013
        L_0x0012:
            r1 = move-exception
        L_0x0013:
            java.lang.String r0 = "insert/Record insertion raised an unexpected exception."
            com.whatsapp.util.Log.e(r0, r1)
            r11 = -1
        L_0x001a:
            X.2zT r1 = r15.A01
            java.lang.String r0 = r15.A03
            r10 = 2
            r6 = r17
            boolean r0 = A04(r1, r15, r0, r6, r10)
            if (r0 == 0) goto L_0x003b
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>(r2)
            long r13 = X.C18310x6.A0A(r3)
            X.1S9 r4 = new X.1S9
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            X.2ao r0 = r15.A02
            r0.A00(r4)
        L_0x003b:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56862sg.A08(java.lang.String, java.lang.String, android.content.ContentValues):long");
    }

    public long A09(String str, String str2, ContentValues contentValues) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        ContentValues contentValues2 = contentValues;
        long insertOrThrow = this.A00.insertOrThrow(str3, (String) null, contentValues2);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str4, 2)) {
            this.A02.A00(new AnonymousClass1S9(new ContentValues(contentValues2), str4, str3, (String) null, (String[]) null, 2, insertOrThrow, C18310x6.A0A(uptimeMillis)));
        }
        return insertOrThrow;
    }

    public long A0A(String str, String str2, ContentValues contentValues) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        ContentValues contentValues2 = contentValues;
        long replace = this.A00.replace(str3, (String) null, contentValues2);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str4, 5)) {
            this.A02.A00(new AnonymousClass1S9(new ContentValues(contentValues2), str4, str3, (String) null, (String[]) null, 5, replace, C18310x6.A0A(uptimeMillis)));
        }
        return replace;
    }

    public long A0B(String str, String str2, ContentValues contentValues) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        ContentValues contentValues2 = contentValues;
        long replaceOrThrow = this.A00.replaceOrThrow(str3, (String) null, contentValues2);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str4, 5)) {
            this.A02.A00(new AnonymousClass1S9(new ContentValues(contentValues2), str4, str3, (String) null, (String[]) null, 5, replaceOrThrow, C18310x6.A0A(uptimeMillis)));
        }
        return replaceOrThrow;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0C(java.lang.String r16, java.lang.String r17, android.content.ContentValues r18, int r19) {
        /*
            r15 = this;
            r8 = 0
            long r3 = android.os.SystemClock.uptimeMillis()
            r7 = r16
            r2 = r18
            android.database.sqlite.SQLiteDatabase r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x0012 }
            r1 = r19
            long r11 = r0.insertWithOnConflict(r7, r8, r2, r1)     // Catch:{ SQLiteConstraintException -> 0x0014 }
            goto L_0x001c
        L_0x0012:
            r1 = move-exception
            goto L_0x0015
        L_0x0014:
            r1 = move-exception
        L_0x0015:
            java.lang.String r0 = "insertWithOnConflict/Record insertion raised an unexpected exception."
            com.whatsapp.util.Log.e(r0, r1)
            r11 = -1
        L_0x001c:
            X.2zT r1 = r15.A01
            java.lang.String r0 = r15.A03
            r10 = 2
            r6 = r17
            boolean r0 = A04(r1, r15, r0, r6, r10)
            if (r0 == 0) goto L_0x003d
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>(r2)
            long r13 = X.C18310x6.A0A(r3)
            X.1S9 r4 = new X.1S9
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            X.2ao r0 = r15.A02
            r0.A00(r4)
        L_0x003d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56862sg.A0C(java.lang.String, java.lang.String, android.content.ContentValues, int):long");
    }

    @Deprecated
    public Cursor A0F(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        String[] strArr3 = strArr2;
        A0J(strArr3);
        long uptimeMillis = SystemClock.uptimeMillis();
        String str7 = str;
        String[] strArr4 = strArr;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Cursor query = this.A00.query(false, str7, strArr4, str8, strArr3, str9, (String) null, str10, str5);
        String str11 = str6;
        if (A04(this.A01, this, this.A03, str11, 1)) {
            this.A02.A00(new AnonymousClass1S7(str11, str7, str8, str9, str10, strArr4, strArr3, (long) query.getCount(), C18310x6.A0A(uptimeMillis)));
        }
        return query;
    }

    public void A0I(String str, String str2, Object[] objArr) {
        String[] strArr;
        Object[] objArr2 = objArr;
        A0J(objArr);
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        this.A00.execSQL(str, objArr);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str2, 7)) {
            if (objArr instanceof String[]) {
                strArr = (String[]) objArr2;
            } else {
                strArr = new String[0];
            }
            this.A02.A00(new AnonymousClass1S6(str4, str3, strArr, -1, C18310x6.A0A(uptimeMillis)));
        }
    }

    public static Cursor A03(Object obj, String str, String str2, String[] strArr) {
        return ((AnonymousClass3H0) obj).A03.A0E(str, str2, strArr);
    }

    public int A05(ContentValues contentValues, String str, String str2, String str3, String[] strArr) {
        String[] strArr2 = strArr;
        A0J(strArr2);
        long uptimeMillis = SystemClock.uptimeMillis();
        ContentValues contentValues2 = contentValues;
        String str4 = str;
        String str5 = str2;
        int update = this.A00.update(str4, contentValues2, str5, strArr2);
        String str6 = str3;
        if (A04(this.A01, this, this.A03, str6, 3)) {
            this.A02.A00(new AnonymousClass1S9(new ContentValues(contentValues2), str6, str4, str5, strArr2, 3, (long) update, C18310x6.A0A(uptimeMillis)));
        }
        return update;
    }

    public int A06(ContentValues contentValues, String str, String str2, String str3, String[] strArr, int i) {
        String[] strArr2 = strArr;
        A0J(strArr2);
        long uptimeMillis = SystemClock.uptimeMillis();
        ContentValues contentValues2 = contentValues;
        String str4 = str;
        String str5 = str2;
        int updateWithOnConflict = this.A00.updateWithOnConflict(str4, contentValues2, str5, strArr2, i);
        String str6 = str3;
        if (A04(this.A01, this, this.A03, str6, 3)) {
            this.A02.A00(new AnonymousClass1S9(new ContentValues(contentValues2), str6, str4, str5, strArr2, 3, (long) updateWithOnConflict, C18310x6.A0A(uptimeMillis)));
        }
        return updateWithOnConflict;
    }

    public int A07(String str, String str2, String str3, String[] strArr) {
        String[] strArr2 = strArr;
        A0J(strArr2);
        long uptimeMillis = SystemClock.uptimeMillis();
        String str4 = str;
        String str5 = str2;
        int delete = this.A00.delete(str4, str5, strArr2);
        String str6 = str3;
        if (A04(this.A01, this, this.A03, str6, 4)) {
            this.A02.A00(new AnonymousClass1S9((ContentValues) null, str6, str4, str5, strArr2, 4, (long) delete, C18310x6.A0A(uptimeMillis)));
        }
        return delete;
    }

    public Cursor A0D(AnonymousClass0QU r14, String str, String str2, String[] strArr) {
        CancellationSignal cancellationSignal;
        String[] strArr2 = strArr;
        A0J(strArr2);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (r14 != null) {
            try {
                cancellationSignal = (CancellationSignal) r14.A00();
            } catch (Exception e) {
                e = e;
                if (e instanceof OperationCanceledException) {
                    e = new C13860nr();
                }
                throw e;
            }
        } else {
            cancellationSignal = null;
        }
        String str3 = str;
        C18610xy r3 = new C18610xy(this.A00.rawQuery(str, strArr2, cancellationSignal));
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str4, 0)) {
            this.A02.A00(new AnonymousClass1S6(str4, str3, strArr2, (long) r3.getCount(), C18310x6.A0A(uptimeMillis)));
        }
        return r3;
    }

    public Cursor A0E(String str, String str2, String[] strArr) {
        String[] strArr2 = strArr;
        A0J(strArr2);
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        Cursor rawQuery = this.A00.rawQuery(str, strArr2);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str2, 0)) {
            this.A02.A00(new AnonymousClass1S6(str4, str3, strArr2, (long) rawQuery.getCount(), C18310x6.A0A(uptimeMillis)));
        }
        return rawQuery;
    }

    public C56702sQ A0G(String str, String str2) {
        C60972zT r4 = this.A01;
        String str3 = this.A03;
        String str4 = str2;
        r4.A03(str3, 6, str2);
        long uptimeMillis = SystemClock.uptimeMillis();
        String str5 = str;
        SQLiteStatement compileStatement = this.A00.compileStatement(str);
        boolean A0K = A0K();
        if (A0K) {
            this.A02.A00(new AnonymousClass1S5(C18310x6.A0A(uptimeMillis), str2, str));
        }
        return new AnonymousClass1RN(compileStatement, r4, this.A02, str5, str4, str3, A0K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4.length <= 999) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(java.lang.Object[] r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0008
            int r2 = r4.length
            r0 = 999(0x3e7, float:1.4E-42)
            r1 = 0
            if (r2 > r0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "Too many sql arguments"
            X.C626936e.A0D(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56862sg.A0J(java.lang.Object[]):void");
    }

    public final boolean A0K() {
        AnonymousClass32D r0;
        C41452Kh r1 = this.A02.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        return AnonymousClass000.A1S(r0.A01.A00() ? 1 : 0);
    }

    public C56862sg(SQLiteDatabase sQLiteDatabase, C60972zT r2, C45932ao r3, String str) {
        this.A03 = str;
        this.A00 = sQLiteDatabase;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static Cursor A00(AnonymousClass4GK r1, C56862sg r2, String str, String str2, String[] strArr) {
        Cursor A0E = r2.A0E(str, str2, strArr);
        r1.close();
        return A0E;
    }

    public static Cursor A02(C56862sg r0, String str, String str2, String[] strArr) {
        Cursor A0E = r0.A0E(str, str2, strArr);
        C162457s7.A0D(A0E);
        return A0E;
    }

    public static boolean A04(C60972zT r0, C56862sg r1, String str, String str2, int i) {
        r0.A03(str, i, str2);
        return r1.A0K();
    }

    public void A0H(String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = str;
        this.A00.execSQL(str);
        String str4 = str2;
        if (A04(this.A01, this, this.A03, str2, 7)) {
            this.A02.A00(new AnonymousClass1S6(str4, str3, (String[]) null, -1, C18310x6.A0A(uptimeMillis)));
        }
    }
}
