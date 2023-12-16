package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0y0  reason: invalid class name and case insensitive filesystem */
public abstract class C18630y0 extends SQLiteOpenHelper implements AnonymousClass4C1, AnonymousClass4E9 {
    public static volatile AnonymousClass2KQ A06;
    public C56862sg A00;
    public final Context A01;
    public final C55682qk A02;
    public final AnonymousClass2KQ A03;
    public final AnonymousClass37P A04;
    public final ReentrantReadWriteLock A05;

    public C18630y0(Context context, C55682qk r10, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i, new AnonymousClass37N(r10, str));
        this.A01 = context;
        this.A02 = r10;
        if (A06 == null) {
            synchronized (C18630y0.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass2KQ(r10);
                }
            }
        }
        this.A03 = A06;
        this.A05 = new ReentrantReadWriteLock();
        this.A04 = new AnonymousClass37P(str);
        setWriteAheadLoggingEnabled(true);
    }

    public abstract C56862sg A0F();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized X.C56862sg BEc() {
        /*
            r11 = this;
            r10 = r11
            boolean r0 = r11 instanceof X.AnonymousClass1RI
            if (r0 == 0) goto L_0x012a
            r4 = r11
            X.1RI r4 = (X.AnonymousClass1RI) r4
            monitor-enter(r10)
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0019
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0141 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0019
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0141 }
            goto L_0x013f
        L_0x0019:
            X.C615631i.A02()     // Catch:{ all -> 0x0141 }
            X.2sg r0 = r4.A0F()     // Catch:{ all -> 0x0125 }
            r4.A00 = r0     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = "WaDatabaseHelper"
            java.lang.String r0 = "creating contacts database version 95"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0125 }
            X.2sg r8 = r4.A00     // Catch:{ all -> 0x0125 }
            boolean r1 = X.AnonymousClass000.A1W(r8)
            java.lang.String r0 = "WaDatabaseHelperprepareWritableDatabase/database is not initialized"
            X.C626936e.A0F(r1, r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "wa_db_schema_version"
            X.2og r0 = r4.A01     // Catch:{ all -> 0x0125 }
            android.content.SharedPreferences r6 = r0.A01     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "force_wadb_check"
            boolean r0 = X.C18280x3.A1W(r6, r5)     // Catch:{ all -> 0x0125 }
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "wa_props"
            boolean r0 = X.C626235v.A04(r8, r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x0079
            java.lang.String[] r2 = X.C18270x1.A1b(r1)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "WADB_SELECT_PROPS_VALUE_BY_NAME"
            java.lang.String r0 = "SELECT prop_value FROM wa_props WHERE prop_name = ?"
            android.database.Cursor r2 = r8.A0E(r0, r1, r2)     // Catch:{ all -> 0x0125 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "prop_value"
            java.lang.String r3 = X.AnonymousClass0x2.A0Z(r2, r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0076
        L_0x0068:
            r1 = move-exception
            if (r2 == 0) goto L_0x0124
            r2.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0124
        L_0x0070:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0125 }
            goto L_0x0124
        L_0x0076:
            r2.close()     // Catch:{ all -> 0x0125 }
        L_0x0079:
            java.lang.String r0 = "ConsumerBeta-af761063d31f045868212e4fddfee072"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0125 }
            if (r0 == 0) goto L_0x0083
            goto L_0x0116
        L_0x0083:
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0125 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0125 }
            r0.beginTransaction()     // Catch:{ all -> 0x0125 }
            X.2Kk r0 = new X.2Kk     // Catch:{ all -> 0x011c }
            r0.<init>()     // Catch:{ all -> 0x011c }
            X.2Kl r8 = new X.2Kl     // Catch:{ all -> 0x011c }
            r8.<init>(r0)     // Catch:{ all -> 0x011c }
            X.2sI r3 = new X.2sI     // Catch:{ all -> 0x011c }
            r3.<init>()     // Catch:{ all -> 0x011c }
            X.2G4 r0 = r4.A04     // Catch:{ all -> 0x011c }
            X.8qC r0 = r0.A00     // Catch:{ all -> 0x011c }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x011c }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x011c }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x011c }
        L_0x00a7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x011c }
            X.4ED r0 = (X.AnonymousClass4ED) r0     // Catch:{ all -> 0x011c }
            r0.B3j(r8, r3)     // Catch:{ all -> 0x011c }
            goto L_0x00a7
        L_0x00b7:
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            r3.A06(r0, r8)     // Catch:{ all -> 0x011c }
            X.2sg r1 = r4.A00     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "bot_message_info"
            X.C626235v.A03(r1, r7, r0)     // Catch:{ all -> 0x011c }
            X.2sg r1 = r4.A00     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "member_suggested_groups"
            X.C626235v.A03(r1, r7, r0)     // Catch:{ all -> 0x011c }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x011c }
        L_0x00ce:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x011c }
            X.4ED r1 = (X.AnonymousClass4ED) r1     // Catch:{ all -> 0x011c }
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            r1.B3g(r0, r8, r3)     // Catch:{ all -> 0x011c }
            goto L_0x00ce
        L_0x00e0:
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            r3.A07(r0, r7)     // Catch:{ all -> 0x011c }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x011c }
        L_0x00e9:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x011c }
            X.4ED r1 = (X.AnonymousClass4ED) r1     // Catch:{ all -> 0x011c }
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            r1.B3l(r0, r8, r3)     // Catch:{ all -> 0x011c }
            goto L_0x00e9
        L_0x00fb:
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            r3.A08(r0, r7)     // Catch:{ all -> 0x011c }
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            X.C66123Kd.A00(r0)     // Catch:{ all -> 0x011c }
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x011c }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x011c }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x011c }
            X.C18270x1.A0n(r6, r5)     // Catch:{ all -> 0x011c }
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0125 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0125 }
            r0.endTransaction()     // Catch:{ all -> 0x0125 }
        L_0x0116:
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0125 }
            X.C615631i.A02()     // Catch:{ all -> 0x0141 }
            goto L_0x013f
        L_0x011c:
            r1 = move-exception
            X.2sg r0 = r4.A00     // Catch:{ all -> 0x0125 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0125 }
            r0.endTransaction()     // Catch:{ all -> 0x0125 }
        L_0x0124:
            throw r1     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            X.C615631i.A02()     // Catch:{ all -> 0x0141 }
            throw r0     // Catch:{ all -> 0x0141 }
        L_0x012a:
            monitor-enter(r10)
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0137
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0141 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x013d
        L_0x0137:
            X.2sg r0 = r11.A0F()     // Catch:{ all -> 0x0141 }
            r11.A00 = r0     // Catch:{ all -> 0x0141 }
        L_0x013d:
            X.2sg r0 = r11.A00     // Catch:{ all -> 0x0141 }
        L_0x013f:
            monitor-exit(r10)
            return r0
        L_0x0141:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18630y0.BEc():X.2sg");
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C626936e.A0D(false, "Use getReadableLoggableDatabase instead");
        return BEc().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C626936e.A0D(false, "Use getWritableLoggableDatabase instead");
        return BEc().A00;
    }

    public static AnonymousClass4GK A00(C47822ds r0) {
        return ((AnonymousClass1R4) r0.A00.get()).get();
    }

    public static AnonymousClass4GK A01(C623934v r0) {
        return r0.A01.get();
    }

    public static AnonymousClass4GK A03(AnonymousClass361 r0) {
        return r0.A00.get();
    }

    public static C85284Fq A05(C47822ds r0) {
        return ((AnonymousClass1R4) r0.A00.get()).A0C();
    }

    public static C85284Fq A07(AnonymousClass361 r0) {
        return r0.A00.A0C();
    }

    /* renamed from: A0B */
    public AnonymousClass4GK get() {
        return new AnonymousClass3H0((C10550i7) null, this, this.A05.readLock(), false);
    }

    public C85284Fq A0C() {
        return new AnonymousClass3H0((C10550i7) null, this, this.A05.readLock(), true);
    }

    public void A0D() {
        ReentrantReadWriteLock.WriteLock writeLock = this.A05.writeLock();
        try {
            writeLock.lock();
            close();
            String databaseName = getDatabaseName();
            C18260x0.A0s("BaseSQLiteOpenHelper/deleteDatabaseFiles for ", databaseName, AnonymousClass001.A0o());
            if (databaseName != null) {
                File databasePath = this.A01.getDatabasePath(databaseName);
                if (!databasePath.delete()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("BaseSQLiteOpenHelper/failed to delete ");
                    A0o.append(databaseName);
                    C18260x0.A1M(A0o, " db");
                }
                C626135u.A06(databasePath, "BaseSQLiteOpenHelper");
            }
        } finally {
            writeLock.unlock();
        }
    }

    public boolean A0E() {
        Cursor rawQuery;
        C85284Fq A0C = A0C();
        try {
            SQLiteDatabase sQLiteDatabase = ((AnonymousClass3H0) A0C).A03.A00;
            boolean z = true;
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                rawQuery = sQLiteDatabase.rawQuery("PRAGMA wal_checkpoint(FULL);", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        int i = rawQuery.getInt(0);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18270x1.A19("BaseSQLiteOpenHelper/wal_checkpoint: ", " ", A0o, i);
                        A0o.append(rawQuery.getInt(1));
                        A0o.append(" ");
                        C18260x0.A1G(A0o, rawQuery.getInt(2));
                        if (i != 0) {
                            z = false;
                        }
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                    }
                }
                A0C.close();
                return false;
            }
            A0C.close();
            return z;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static AnonymousClass4GK A02(AnonymousClass1R1 r0) {
        return r0.A0G().get();
    }

    public static AnonymousClass4GK A04(C183538qC r0) {
        return ((C18630y0) r0.get()).get();
    }

    public static C85284Fq A06(AnonymousClass1R1 r0) {
        return r0.A0G().A0C();
    }

    public static C85284Fq A08(C183538qC r0) {
        return ((C18630y0) r0.get()).A0C();
    }

    public SQLiteDatabase A0A() {
        return super.getWritableDatabase();
    }

    public AnonymousClass37P BAE() {
        return this.A04;
    }

    public C56862sg BBw() {
        return BEc();
    }

    public void close() {
        super.close();
        AnonymousClass2KQ r0 = this.A03;
        r0.A01.remove(getDatabaseName());
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        AnonymousClass2KQ r1 = this.A03;
        String databaseName = getDatabaseName();
        if (!r1.A01.add(databaseName)) {
            r1.A00.A09("db-already-created", databaseName, new Throwable());
        }
    }
}
