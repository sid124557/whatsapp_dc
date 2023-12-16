package X;

import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2oy  reason: invalid class name and case insensitive filesystem */
public final class C54592oy {
    public final C10550i7 A00 = new C10550i7();
    public final C183538qC A01;
    public volatile boolean A02;

    public C54592oy(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final Integer A00(long j) {
        Integer num;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/getNonBlocking cache not initialized");
            return null;
        }
        C10550i7 r1 = this.A00;
        synchronized (r1) {
            num = (Integer) r1.A05(j, (Object) null);
        }
        return num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.AnonymousClass2A8.A00(r7, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0096
            monitor-enter(r8)
            boolean r0 = r8.A02     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0095
            X.8qC r0 = r8.A01     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0092 }
            X.30J r0 = (X.AnonymousClass30J) r0     // Catch:{ all -> 0x0092 }
            X.0i7 r6 = new X.0i7     // Catch:{ all -> 0x0092 }
            r6.<init>()     // Catch:{ all -> 0x0092 }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x0092 }
            X.4GK r7 = r0.get()     // Catch:{ all -> 0x0092 }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0088 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "SELECT status_message_row_id, state FROM status_crossposting"
            java.lang.String r0 = "SELECT_STATE_LIST"
            android.database.Cursor r5 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "status_message_row_id"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "state"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0081 }
        L_0x0037:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0049
            long r1 = r5.getLong(r4)     // Catch:{ all -> 0x0081 }
            java.lang.Integer r0 = X.C18300x5.A0a(r5, r3)     // Catch:{ all -> 0x0081 }
            r6.A0A(r1, r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0037
        L_0x0049:
            r5.close()     // Catch:{ all -> 0x0088 }
            r7.close()     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[INIT] loading state from db, db value: "
            X.C18260x0.A1P(r1, r0, r6)     // Catch:{ all -> 0x0092 }
            X.0i7 r5 = r8.A00     // Catch:{ all -> 0x0092 }
            monitor-enter(r5)     // Catch:{ all -> 0x0092 }
            r5.A06()     // Catch:{ all -> 0x008f }
            int r4 = r6.A01()     // Catch:{ all -> 0x008f }
            r3 = 0
        L_0x0063:
            if (r3 >= r4) goto L_0x0073
            long r1 = r6.A02(r3)     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r6.A04(r3)     // Catch:{ all -> 0x008f }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x008f }
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0073:
            monitor-exit(r5)     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[INIT] cache initial value after loading: "
            X.C18260x0.A1P(r1, r0, r5)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r8.A02 = r0     // Catch:{ all -> 0x0092 }
            goto L_0x0095
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r7, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0091
        L_0x008f:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0092 }
        L_0x0091:
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0095:
            monitor-exit(r8)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54592oy.A01():void");
    }

    public final boolean A03(long j) {
        boolean A0B;
        if (!this.A02) {
            Log.e("[XFAM] XFamilyStatusCrosspostStateCache/containsKeyNonBlocking cache not initialized");
            return false;
        }
        C10550i7 r1 = this.A00;
        synchronized (r1) {
            A0B = r1.A0B(j);
        }
        return A0B;
    }

    public final void A02(Collection collection, int i) {
        A01();
        C10550i7 r5 = this.A00;
        synchronized (r5) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                long A022 = C18270x1.A02(it);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("[XFAM] XFamilyStatusCrosspostStateCache/[PUT ALL] messageRowId: ");
                A0o.append(A022);
                C18260x0.A0w(" added with state ", A0o, i);
                r5.A0A(A022, Integer.valueOf(i));
            }
        }
    }
}
