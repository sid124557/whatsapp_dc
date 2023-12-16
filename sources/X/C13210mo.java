package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.0mo  reason: invalid class name and case insensitive filesystem */
public final class C13210mo implements Runnable {
    public final /* synthetic */ C05490Tn A00;

    public C13210mo(C05490Tn r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.0Tn r3 = r6.A00
            java.util.Set r5 = X.C154537dK.A07()
            X.0R5 r4 = r3.A03
            java.lang.String r0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            X.0ev r2 = new X.0ev
            r2.<init>(r0)
            r1 = 0
            r4.A08()
            r4.A09()
            X.0vW r0 = X.C001000s.A00(r4)
            android.database.Cursor r2 = r0.Bi0(r2)
        L_0x001e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0031
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x005c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005c }
            r5.add(r0)     // Catch:{ all -> 0x005c }
            goto L_0x001e
        L_0x0031:
            X.AnonymousClass2A8.A00(r2, r1)
            java.util.Set r2 = X.C154537dK.A08(r5)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0051
            X.0vK r0 = r3.A0C
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0057
            X.0vK r0 = r3.A0C
            if (r0 == 0) goto L_0x0052
            X.0A6 r0 = (X.AnonymousClass0A6) r0
            android.database.sqlite.SQLiteStatement r0 = r0.A00
            r0.executeUpdateDelete()
        L_0x0051:
            return r2
        L_0x0052:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r1)
            throw r0
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r1)
            throw r0
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13210mo.A00():java.util.Set");
    }

    public void run() {
        Set set;
        SQLiteDatabase sQLiteDatabase;
        C05490Tn r3 = this.A00;
        AnonymousClass0R5 r5 = r3.A03;
        Lock A07 = r5.A07();
        A07.lock();
        try {
            if (r5.A0D()) {
                if (!r3.A0D) {
                    ((C08660eq) r5.A00()).A00().A05();
                }
                if (!r3.A0D) {
                    Log.e("ROOM", "database is not initialized even though it is open");
                } else if (r3.A0A.compareAndSet(true, false) && !((C08630en) C001000s.A00(r5)).A00.inTransaction()) {
                    sQLiteDatabase = ((C08630en) C001000s.A00(r5)).A00;
                    sQLiteDatabase.beginTransactionNonExclusive();
                    set = A00();
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    A07.unlock();
                    if (!set.isEmpty()) {
                        C10610iE r2 = r3.A00;
                        synchronized (r2) {
                            Iterator it = r2.iterator();
                            if (it.hasNext()) {
                                AnonymousClass001.A0w(it).getValue();
                                throw AnonymousClass001.A0g("notifyByTableInvalidStatus$room_runtime_release");
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            A07.unlock();
        } catch (IllegalStateException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            set = C73833g9.A04();
        } catch (SQLiteException e2) {
            try {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                set = C73833g9.A04();
            } catch (Throwable th) {
                A07.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabase.endTransaction();
            throw th2;
        }
    }
}
