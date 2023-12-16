package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.00s  reason: invalid class name and case insensitive filesystem */
public final class C001000s extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass0U2 A03;
    public final C03410Ka A04;
    public final AnonymousClass0TB A05;
    public final boolean A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C001000s(android.content.Context r9, X.AnonymousClass0U2 r10, X.C03410Ka r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            r5 = 0
            r6 = 16
            X.0ZA r7 = new X.0ZA
            r7.<init>(r10, r11)
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A04 = r11
            r8.A03 = r10
            r8.A06 = r13
            if (r12 != 0) goto L_0x0023
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            X.C162457s7.A0D(r4)
        L_0x0023:
            java.io.File r1 = r9.getCacheDir()
            X.C162457s7.A0D(r1)
            X.0TB r0 = new X.0TB
            r0.<init>(r1, r4)
            r8.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000s.<init>(android.content.Context, X.0U2, X.0Ka, java.lang.String, boolean):void");
    }

    public static final C08630en A01(SQLiteDatabase sQLiteDatabase, C03410Ka r3) {
        C162457s7.A0J(r3, 0);
        C08630en r1 = r3.A00;
        if (r1 != null && r1.A02(sQLiteDatabase)) {
            return r1;
        }
        C08630en r12 = new C08630en(sQLiteDatabase);
        r3.A00 = r12;
        return r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C17430vW r4) {
        /*
            r3 = 0
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r4.Bi1(r0)
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x0015
            r1 = 1
        L_0x0015:
            r0 = 0
            X.AnonymousClass2A8.A00(r2, r0)
            return r1
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000s.A03(X.0vW):boolean");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C162457s7.A0J(sQLiteDatabase, 0);
        try {
            A01(sQLiteDatabase, this.A04);
        } catch (Throwable th) {
            throw new C13850nq(C02350Fv.ON_CONFIGURE, th);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C162457s7.A0J(sQLiteDatabase, 0);
        try {
            AnonymousClass0U2 r1 = this.A03;
            C08630en A012 = A01(sQLiteDatabase, this.A04);
            boolean A032 = A03(A012);
            AnonymousClass0Y4 r3 = ((AnonymousClass0A5) r1).A01;
            r3.A09(A012);
            if (!A032) {
                AnonymousClass0LE A08 = r3.A08(A012);
                if (!A08.A01) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Pre-packaged database has an invalid schema: ");
                    throw AnonymousClass000.A0I(A08.A00, A0o);
                }
            }
            A012.B2q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
            A0o2.append("5181942b9ebc31ce68dacb56c16fd79f");
            A012.B2q(AnonymousClass000.A0X("')", A0o2));
            WorkDatabase_Impl workDatabase_Impl = r3.A00;
            List list = workDatabase_Impl.A01;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    workDatabase_Impl.A01.get(i);
                }
            }
        } catch (Throwable th) {
            throw new C13850nq(C02350Fv.ON_CREATE, th);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C162457s7.A0J(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            ((AnonymousClass0A5) this.A03).A04(A01(sQLiteDatabase, this.A04), i, i2);
        } catch (Throwable th) {
            throw new C13850nq(C02350Fv.ON_DOWNGRADE, th);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        C162457s7.A0J(sQLiteDatabase, 0);
        if (!this.A00) {
            try {
                AnonymousClass0U2 r8 = this.A03;
                C08630en A012 = A01(sQLiteDatabase, this.A04);
                AnonymousClass0A5 r82 = (AnonymousClass0A5) r8;
                r82.A05(A012);
                WorkDatabase_Impl workDatabase_Impl = r82.A01.A00;
                workDatabase_Impl.A0B = A012;
                A012.B2q("PRAGMA foreign_keys = ON");
                C05490Tn r1 = workDatabase_Impl.A06;
                synchronized (r1.A05) {
                    try {
                        if (r1.A0D) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            A012.B2q("PRAGMA temp_store = MEMORY;");
                            A012.B2q("PRAGMA recursive_triggers='ON';");
                            A012.B2q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            r1.A00(A012);
                            r1.A0C = A012.AzF("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            r1.A0D = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                List list = workDatabase_Impl.A01;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        workDatabase_Impl.A01.get(i);
                        sQLiteDatabase2 = A012.A00;
                        sQLiteDatabase2.beginTransaction();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                        A0o.append(System.currentTimeMillis() - C03170Jc.A00);
                        A012.B2q(AnonymousClass000.A0X(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", A0o));
                        sQLiteDatabase2.setTransactionSuccessful();
                        sQLiteDatabase2.endTransaction();
                    }
                }
                r82.A00 = null;
            } catch (Throwable th2) {
                throw new C13850nq(C02350Fv.ON_OPEN, th2);
            }
        }
        this.A01 = true;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C162457s7.A0J(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            this.A03.A04(A01(sQLiteDatabase, this.A04), i, i2);
        } catch (Throwable th) {
            throw new C13850nq(C02350Fv.ON_UPGRADE, th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:(6:0|1|(1:3)|5|6|(4:8|9|(1:11)|12))|17|(2:21|(1:23))|24|25|26|27|28|29|30|31|56|57|(1:59)(1:60)|(3:61|62|(1:64))|65|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (getDatabaseName() == null) goto L_0x000e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0074 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17430vW A05() {
        /*
            r7 = this;
            X.0TB r4 = r7.A05     // Catch:{ all -> 0x00d1 }
            boolean r0 = r7.A01     // Catch:{ all -> 0x00d1 }
            r6 = 0
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = r7.getDatabaseName()     // Catch:{ all -> 0x00d1 }
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.concurrent.locks.Lock r3 = r4.A02     // Catch:{ all -> 0x00d1 }
            r3.lock()     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x003b
            java.io.File r1 = r4.A01     // Catch:{ IOException -> 0x0030 }
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x0030 }
            if (r0 == 0) goto L_0x0021
            r0.mkdirs()     // Catch:{ IOException -> 0x0030 }
        L_0x0021:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0030 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0030 }
            r0.lock()     // Catch:{ IOException -> 0x0030 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r2 = move-exception
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "SupportSQLiteLock"
            java.lang.String r0 = "Unable to grab file lock."
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x00d1 }
        L_0x003b:
            r7.A00 = r6     // Catch:{ all -> 0x00d1 }
            java.lang.String r5 = r7.getDatabaseName()     // Catch:{ all -> 0x00d1 }
            if (r5 == 0) goto L_0x0067
            android.content.Context r0 = r7.A02     // Catch:{ all -> 0x00d1 }
            java.io.File r0 = r0.getDatabasePath(r5)     // Catch:{ all -> 0x00d1 }
            java.io.File r2 = r0.getParentFile()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0067
            r2.mkdirs()     // Catch:{ all -> 0x00d1 }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r2, r0, r1)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d1 }
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r1 = r7.A04()     // Catch:{ all -> 0x006c }
            goto L_0x00af
        L_0x006c:
            super.close()     // Catch:{ all -> 0x00d1 }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0074 }
        L_0x0074:
            android.database.sqlite.SQLiteDatabase r1 = r7.A04()     // Catch:{ all -> 0x0079 }
            goto L_0x00af
        L_0x0079:
            r1 = move-exception
            super.close()     // Catch:{ all -> 0x00d1 }
            boolean r0 = r1 instanceof X.C13850nq     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x009c
            X.0nq r1 = (X.C13850nq) r1     // Catch:{ all -> 0x00d1 }
            java.lang.Throwable r2 = r1.cause     // Catch:{ all -> 0x00d1 }
            X.0Fv r0 = r1.callbackName     // Catch:{ all -> 0x00d1 }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x00d1 }
            if (r1 == r6) goto L_0x009b
            r0 = 1
            if (r1 == r0) goto L_0x009b
            r0 = 2
            if (r1 == r0) goto L_0x009b
            r0 = 3
            if (r1 == r0) goto L_0x009b
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x009b
            goto L_0x00a6
        L_0x009b:
            throw r2     // Catch:{ all -> 0x00d1 }
        L_0x009c:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00d0
            if (r5 == 0) goto L_0x00d0
            boolean r0 = r7.A06     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00d0
        L_0x00a6:
            android.content.Context r0 = r7.A02     // Catch:{ all -> 0x00d1 }
            r0.deleteDatabase(r5)     // Catch:{ all -> 0x00d1 }
            android.database.sqlite.SQLiteDatabase r1 = r7.A04()     // Catch:{ 0nq -> 0x00cc }
        L_0x00af:
            boolean r0 = r7.A00     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00bb
            r7.close()     // Catch:{ all -> 0x00d1 }
            X.0vW r1 = r7.A05()     // Catch:{ all -> 0x00d1 }
            goto L_0x00c1
        L_0x00bb:
            X.0Ka r0 = r7.A04     // Catch:{ all -> 0x00d1 }
            X.0en r1 = A01(r1, r0)     // Catch:{ all -> 0x00d1 }
        L_0x00c1:
            java.nio.channels.FileChannel r0 = r4.A00     // Catch:{ IOException -> 0x00c8 }
            if (r0 == 0) goto L_0x00c8
            r0.close()     // Catch:{ IOException -> 0x00c8 }
        L_0x00c8:
            r3.unlock()
            return r1
        L_0x00cc:
            r0 = move-exception
            java.lang.Throwable r0 = r0.cause     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d0:
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r2 = move-exception
            X.0TB r1 = r7.A05
            java.nio.channels.FileChannel r0 = r1.A00     // Catch:{ IOException -> 0x00db }
            if (r0 == 0) goto L_0x00db
            r0.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            java.util.concurrent.locks.Lock r0 = r1.A02
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001000s.A05():X.0vW");
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            AnonymousClass0TB r4 = this.A05;
            Lock lock = r4.A02;
            lock.lock();
            super.close();
            this.A04.A00 = null;
            this.A01 = false;
            try {
                FileChannel fileChannel = r4.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            AnonymousClass0TB r1 = this.A05;
            try {
                FileChannel fileChannel2 = r1.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            r1.A02.unlock();
            throw th;
        }
    }

    public static C17430vW A00(AnonymousClass0R5 r0) {
        return ((C08660eq) r0.A00()).A00().A05();
    }

    public static final void A02(SQLiteDatabase sQLiteDatabase, AnonymousClass0U2 r1, C03410Ka r2) {
        C162457s7.A0E(sQLiteDatabase);
        r1.A03(A01(sQLiteDatabase, r2));
    }

    public final SQLiteDatabase A04() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        C162457s7.A0D(writableDatabase);
        return writableDatabase;
    }
}
