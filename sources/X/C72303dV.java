package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.3dV  reason: invalid class name and case insensitive filesystem */
public class C72303dV implements AnonymousClass4C1 {
    public final C10550i7 A00 = new C10550i7();
    public final C56972sr A01;
    public final C55992rF A02;
    public final C381225u A03;
    public final C18620xz A04;
    public final File A05;
    public final ReentrantReadWriteLock.WriteLock A06;
    public final ReentrantReadWriteLock A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public void A05() {
        boolean A1T;
        C55992rF r2 = this.A02;
        if (r2.A05()) {
            r2.A04(new AnonymousClass4IH(this, 5));
            synchronized (r2) {
                A1T = AnonymousClass001.A1T(r2.A00);
            }
            if (A1T) {
                A0A((C84474Cm) null, true);
            }
            r2.A00();
        }
    }

    public final void A06() {
        C18620xz r0 = this.A04;
        r0.close();
        File file = r0.A0A;
        C18260x0.A1E("msgstore-manager/deletedb/result/", AnonymousClass001.A0o(), file.delete() & C626135u.A06(file, "databasehelper"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0045, code lost:
        if (r6.A0Y(r5, 3101) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72303dV(X.C56972sr r21, X.C54292oU r22, X.C54412og r23, X.C381225u r24, X.C28761hj r25, X.C60972zT r26, X.C45932ao r27, X.AnonymousClass2G4 r28, X.AnonymousClass1VX r29, X.C51072jE r30, X.C183538qC r31) {
        /*
            r20 = this;
            java.lang.String r3 = "msgstore.db"
            r2 = r20
            r2.<init>()
            X.0i7 r0 = new X.0i7
            r0.<init>()
            r2.A00 = r0
            r0 = r22
            android.content.Context r7 = r0.A00
            java.io.File r13 = r7.getDatabasePath(r3)     // Catch:{ all -> 0x0097 }
            r2.A05 = r13     // Catch:{ all -> 0x0097 }
            r0 = 1350(0x546, float:1.892E-42)
            X.2vE r5 = X.C58422vE.A02
            r6 = r29
            boolean r0 = r6.A0Y(r5, r0)
            X.2Q0 r4 = new X.2Q0
            r4.<init>()
            r4.A03 = r0
            r15 = r23
            android.content.SharedPreferences r1 = r15.A01
            java.lang.String r0 = "force_db_check"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            r4.A00 = r0
            r0 = 2997(0xbb5, float:4.2E-42)
            boolean r0 = r6.A0Y(r5, r0)
            if (r0 != 0) goto L_0x0047
            r0 = 3101(0xc1d, float:4.345E-42)
            boolean r1 = r6.A0Y(r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            r4.A01 = r0
            r0 = 6482(0x1952, float:9.083E-42)
            boolean r0 = r6.A0Y(r5, r0)
            r4.A02 = r0
            X.2am r9 = new X.2am
            r9.<init>(r4)
            X.2R6 r14 = new X.2R6
            r16 = r25
            r18 = r30
            r19 = r31
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            X.37P r8 = new X.37P
            r8.<init>(r3)
            java.util.Set r14 = java.util.Collections.singleton(r14)
            X.0xz r6 = new X.0xz
            r10 = r26
            r11 = r27
            r12 = r28
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.A04 = r6
            r0 = r21
            r2.A01 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.A07 = r0
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r2.A06 = r0
            r0 = r24
            r2.A03 = r0
            X.2rF r0 = new X.2rF
            r0.<init>()
            r2.A02 = r0
            return
        L_0x0097:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72303dV.<init>(X.2sr, X.2oU, X.2og, X.25u, X.1hj, X.2zT, X.2ao, X.2G4, X.1VX, X.2jE, X.8qC):void");
    }

    public static boolean A00(C72303dV r0) {
        r0.A05();
        return r0.A09;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a7 A[Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r9 = this;
            boolean r0 = A00(r9)
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            r9.A05()
            X.0xz r3 = r9.A04
            X.4GK r8 = r9.get()
            java.lang.Object r2 = r3.A0B     // Catch:{ all -> 0x00ba }
            monitor-enter(r2)     // Catch:{ all -> 0x00ba }
            java.lang.Integer r1 = r3.A02     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x00ae
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b7 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = "file is encrypted"
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.33M r5 = X.AnonymousClass33M.A01(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM message"
            java.lang.String r0 = "GET_MESSAGES_COUNT"
            android.database.Cursor r7 = X.C56862sg.A01(r6, r1, r0)     // Catch:{ SQLiteFullException -> 0x0080, SQLiteException -> 0x0066 }
            java.lang.String r0 = "count"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005a }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0056
            int r6 = r7.getInt(r1)     // Catch:{ all -> 0x005a }
            if (r6 <= 0) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "databasehelper/getInitialMessageCount "
            r1.append(r0)     // Catch:{ all -> 0x005a }
            r1.append(r6)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = " | time spent:"
            X.AnonymousClass33M.A05(r5, r0, r1)     // Catch:{ all -> 0x005a }
            r7.close()     // Catch:{ SQLiteFullException -> 0x0080, SQLiteException -> 0x0066 }
            goto L_0x009e
        L_0x0056:
            r7.close()     // Catch:{ SQLiteFullException -> 0x0080, SQLiteException -> 0x0066 }
            goto L_0x0076
        L_0x005a:
            r1 = move-exception
            if (r7 == 0) goto L_0x0065
            r7.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteFullException -> 0x0080, SQLiteException -> 0x0066 }
        L_0x0065:
            throw r1     // Catch:{ SQLiteFullException -> 0x0080, SQLiteException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
            boolean r0 = r0.contains(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
        L_0x0076:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount/nocursor | time spent:"
            X.AnonymousClass33M.A05(r5, r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
            goto L_0x009d
        L_0x0080:
            r1 = move-exception
            r3.A02(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
        L_0x0084:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0097, SQLiteException -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x009d
        L_0x0096:
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x0097:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x009d:
            r6 = 0
        L_0x009e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b7 }
            r3.A02 = r1     // Catch:{ all -> 0x00b7 }
            r0 = 1
            if (r6 > r0) goto L_0x00a8
            r0 = 0
        L_0x00a8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            r3.A01 = r0     // Catch:{ all -> 0x00b7 }
        L_0x00ae:
            int r0 = r1.intValue()     // Catch:{ all -> 0x00b7 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            r8.close()
            return r0
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00bf }
            throw r1
        L_0x00bf:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72303dV.A01():int");
    }

    @Deprecated
    public int A02() {
        return A01();
    }

    /* renamed from: A03 */
    public AnonymousClass4GK get() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A07.readLock();
        A05();
        return new AnonymousClass3H0(this.A00, this.A04, readLock, false);
    }

    public C85284Fq A04() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A07.readLock();
        A05();
        return new AnonymousClass3H0(this.A00, this.A04, readLock, true);
    }

    public final void A07() {
        Log.i("msgstore-manager/setup");
        C626936e.A0C(this.A06.isHeldByCurrentThread());
        synchronized (this) {
            C18620xz r5 = this.A04;
            try {
                File file = r5.A0A;
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.delete();
                C626135u.A06(file, "databasehelper");
                C627536m.A0F(file, "msgstore/create-db/list ");
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 805306384);
                C626936e.A06(openDatabase);
                r5.onCreate(openDatabase);
                C627536m.A0F(file, "msgstore/create-db/done/list ");
                r5.BEc();
                this.A09 = true;
            } catch (Throwable th) {
                C627536m.A0F(r5.A0A, "msgstore/create-db/done/list ");
                throw th;
            }
        }
    }

    public boolean A08() {
        return this.A08;
    }

    public boolean A09() {
        boolean z;
        Cursor A012;
        if (!A00(this)) {
            return false;
        }
        A05();
        C18620xz r3 = this.A04;
        AnonymousClass4GK A032 = get();
        try {
            synchronized (r3.A0B) {
                Boolean bool = r3.A01;
                if (bool == null) {
                    C56862sg r4 = ((AnonymousClass3H0) A032).A03;
                    AnonymousClass33M A013 = AnonymousClass33M.A01("databasehelper/getInitialMessageCount");
                    try {
                        A012 = C56862sg.A01(r4, "SELECT _id FROM message LIMIT 2", "GET_HAS_MESSAGES");
                        z = true;
                        if (A012.getCount() <= 1) {
                            z = false;
                        }
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("databasehelper/checkHasMessagesInDB: hasMessages = ");
                        A0o.append(z);
                        AnonymousClass33M.A05(A013, " | time spent:", A0o);
                        A012.close();
                    } catch (SQLiteFullException e) {
                        e = e;
                        r3.A02(e);
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            if (e.toString().contains("file is encrypted")) {
                                Log.w("databasehelper/getInitialMessageCount/cursor/encrypted-file-error");
                                z = false;
                                bool = Boolean.valueOf(z);
                                r3.A01 = bool;
                                boolean booleanValue = bool.booleanValue();
                                A032.close();
                                return booleanValue;
                            }
                        } catch (SQLiteDatabaseCorruptException e3) {
                            Log.w("databasehelper/getInitialMessageCount/dbcorrupt", e3);
                        } catch (SQLiteException e4) {
                            if (e4.toString().contains("file is encrypted")) {
                                Log.w("databasehelper/getInitialMessageCount/encrypted-file-error", e4);
                            } else {
                                throw e4;
                            }
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    bool = Boolean.valueOf(z);
                    r3.A01 = bool;
                }
                boolean booleanValue2 = bool.booleanValue();
            }
            A032.close();
            return booleanValue2;
        } catch (Throwable th2) {
            try {
                A032.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
        throw e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        return A00(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(X.C84474Cm r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "msgstore-manager/checkhealth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r5.A06
            r3.lock()
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0031
            X.2rF r4 = r5.A02     // Catch:{ all -> 0x00b0 }
            monitor-enter(r4)     // Catch:{ all -> 0x00b0 }
            int r2 = r4.A00     // Catch:{ all -> 0x002e }
            r1 = 3
            r0 = 0
            if (r2 <= r1) goto L_0x0018
            r0 = 1
        L_0x0018:
            monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0031
            boolean r1 = r5.A09     // Catch:{ all -> 0x00b0 }
            r3.unlock()     // Catch:{ all -> 0x00c3 }
            r4.A01()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r5.A09     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x002c
            if (r6 == 0) goto L_0x002c
            r6.Bhd()     // Catch:{ all -> 0x00c3 }
        L_0x002c:
            monitor-exit(r5)     // Catch:{ all -> 0x00c3 }
            return r1
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x0031:
            boolean r0 = r5.A09     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0099
            X.2rF r0 = r5.A02     // Catch:{ all -> 0x00b0 }
            r0.A03()     // Catch:{ all -> 0x00b0 }
            java.io.File r4 = r5.A05     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.C18320x8.A0l(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "-journal"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00b0 }
            java.io.File r0 = X.C18330xA.A04(r2, r0)     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "msgstore-manager/checkhealth/journal/delete "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.C18320x8.A0l(r4)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ".back"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x00b0 }
            java.io.File r0 = X.C18330xA.A04(r2, r0)     // Catch:{ all -> 0x00b0 }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "msgstore-manager/checkhealth/back/delete "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ all -> 0x00b0 }
            X.0xz r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x008f, SQLiteException -> 0x0087 }
            r0.BEc()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008f, SQLiteException -> 0x0087 }
            r0 = 1
            r5.A09 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x008f, SQLiteException -> 0x0087 }
            r5.A08 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x008f, SQLiteException -> 0x0087 }
            goto L_0x0099
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth no db"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x0099
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00b0 }
            r5.A06()     // Catch:{ all -> 0x00b0 }
        L_0x0099:
            r3.unlock()     // Catch:{ all -> 0x00c3 }
            X.2rF r0 = r5.A02     // Catch:{ all -> 0x00c3 }
            r0.A01()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r5.A09     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00aa
            r6.Bhd()     // Catch:{ all -> 0x00c3 }
        L_0x00aa:
            monitor-exit(r5)     // Catch:{ all -> 0x00c3 }
            boolean r1 = A00(r5)
            return r1
        L_0x00b0:
            r1 = move-exception
            r3.unlock()     // Catch:{ all -> 0x00c3 }
            X.2rF r0 = r5.A02     // Catch:{ all -> 0x00c3 }
            r0.A01()     // Catch:{ all -> 0x00c3 }
            boolean r0 = r5.A09     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00c2
            if (r6 == 0) goto L_0x00c2
            r6.Bhd()     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72303dV.A0A(X.4Cm, boolean):boolean");
    }
}
