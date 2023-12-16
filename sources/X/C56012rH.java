package X;

import android.util.LongSparseArray;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2rH  reason: invalid class name and case insensitive filesystem */
public final class C56012rH {
    public final LongSparseArray A00 = new LongSparseArray();
    public final C183538qC A01;
    public volatile boolean A02;

    public C56012rH(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final Integer A00(AnonymousClass223 r3, long j) {
        Integer A012;
        C162457s7.A0J(r3, 1);
        A02();
        synchronized (this.A00) {
            A012 = A01(r3, j);
        }
        return A012;
    }

    public final Integer A01(AnonymousClass223 r5, long j) {
        C51622k7 r3 = (C51622k7) this.A00.get(j);
        int ordinal = r5.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw C73153f1.A00();
            } else if (r3 != null) {
                return r3.A01;
            } else {
                return null;
            }
        } else if (r3 != null) {
            return r3.A00;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.AnonymousClass2A8.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r12 = this;
            boolean r0 = r12.A02
            if (r0 != 0) goto L_0x00c5
            monitor-enter(r12)
            boolean r0 = r12.A02     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x00c4
            X.8qC r0 = r12.A01     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00c1 }
            X.2py r0 = (X.C55202py) r0     // Catch:{ all -> 0x00c1 }
            android.util.LongSparseArray r7 = new android.util.LongSparseArray     // Catch:{ all -> 0x00c1 }
            r7.<init>()     // Catch:{ all -> 0x00c1 }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x00c1 }
            X.4GK r4 = r0.get()     // Catch:{ all -> 0x00c1 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00b7 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "SELECT status_message_row_id, state, destination FROM status_crossposting_v3"
            java.lang.String r0 = "SELECT_STATE_LIST"
            android.database.Cursor r6 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "state"
            int r8 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "destination"
            int r5 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b0 }
        L_0x003d:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x007a
            long r1 = r6.getLong(r9)     // Catch:{ all -> 0x00b0 }
            int r11 = r6.getInt(r8)     // Catch:{ all -> 0x00b0 }
            int r10 = r6.getInt(r5)     // Catch:{ all -> 0x00b0 }
            X.2k7 r3 = new X.2k7     // Catch:{ all -> 0x00b0 }
            r3.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x005b
            r3 = r0
        L_0x005b:
            X.2k7 r3 = (X.C51622k7) r3     // Catch:{ all -> 0x00b0 }
            X.223 r0 = X.AnonymousClass223.FACEBOOK     // Catch:{ all -> 0x00b0 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x00b0 }
            if (r10 != r0) goto L_0x006d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00b0 }
            r3.A00 = r0     // Catch:{ all -> 0x00b0 }
        L_0x0069:
            r7.put(r1, r3)     // Catch:{ all -> 0x00b0 }
            goto L_0x003d
        L_0x006d:
            X.223 r0 = X.AnonymousClass223.INSTAGRAM     // Catch:{ all -> 0x00b0 }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x00b0 }
            if (r10 != r0) goto L_0x0069
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00b0 }
            r3.A01 = r0     // Catch:{ all -> 0x00b0 }
            goto L_0x0069
        L_0x007a:
            r6.close()     // Catch:{ all -> 0x00b7 }
            r4.close()     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c1 }
            java.lang.String r6 = "[WAFFLE] WaffleStatusCrosspostStateCache/[INIT] cache initial value after loading: "
            X.C18260x0.A1P(r0, r6, r7)     // Catch:{ all -> 0x00c1 }
            android.util.LongSparseArray r5 = r12.A00     // Catch:{ all -> 0x00c1 }
            monitor-enter(r5)     // Catch:{ all -> 0x00c1 }
            r5.clear()     // Catch:{ all -> 0x00be }
            int r4 = r7.size()     // Catch:{ all -> 0x00be }
            r3 = 0
        L_0x0094:
            if (r3 >= r4) goto L_0x00a4
            long r1 = r7.keyAt(r3)     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = r7.valueAt(r3)     // Catch:{ all -> 0x00be }
            r5.put(r1, r0)     // Catch:{ all -> 0x00be }
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00a4:
            monitor-exit(r5)     // Catch:{ all -> 0x00c1 }
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00c1 }
            X.C18260x0.A1P(r0, r6, r5)     // Catch:{ all -> 0x00c1 }
            r0 = 1
            r12.A02 = r0     // Catch:{ all -> 0x00c1 }
            goto L_0x00c4
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r4, r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x00c0
        L_0x00be:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c1 }
        L_0x00c0:
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x00c4:
            monitor-exit(r12)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56012rH.A02():void");
    }

    public final void A03(AnonymousClass223 r5, int i, long j) {
        LongSparseArray longSparseArray = this.A00;
        Object r2 = new C51622k7();
        Object obj = longSparseArray.get(j);
        if (obj != null) {
            r2 = obj;
        }
        C51622k7 r22 = (C51622k7) r2;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            r22.A00 = Integer.valueOf(i);
        } else if (ordinal == 1) {
            r22.A01 = Integer.valueOf(i);
        }
        longSparseArray.put(j, r22);
    }

    public final boolean A05(AnonymousClass223 r4, long j) {
        boolean z = false;
        if (!this.A02) {
            Log.e("[WAFFLE] WaffleStatusCrosspostStateCache/containsKeyNonBlocking cache not initialized");
            return false;
        }
        synchronized (this.A00) {
            if (A01(r4, j) != null) {
                z = true;
            }
        }
        return z;
    }

    public final void A04(AnonymousClass223 r5, Collection collection, int i) {
        A02();
        synchronized (this.A00) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A03(r5, i, C18270x1.A02(it));
            }
        }
    }
}
