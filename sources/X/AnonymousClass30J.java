package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.List;

/* renamed from: X.30J  reason: invalid class name */
public final class AnonymousClass30J {
    public final C72303dV A00;
    public final C54592oy A01;

    public static final C53142mc A00(Cursor cursor) {
        C108895dj r1;
        String A0Z = AnonymousClass0x2.A0Z(cursor, "crossposting_status_unique_id");
        if (A0Z == null || A0Z.length() == 0) {
            r1 = null;
        } else {
            r1 = AnonymousClass0x7.A0a(AnonymousClass3QD.A00(), String.class, A0Z, "XfamilyStatusUniqueId");
        }
        long A0C = AnonymousClass0x2.A0C(cursor, "status_message_row_id");
        return new C53142mc(r1, AnonymousClass0x2.A0Z(cursor, "crossposting_session_id"), AnonymousClass0x2.A0Z(cursor, "media_path"), AnonymousClass0x2.A04(cursor, "state"), A0C);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.ContentValues r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.String r0 = "("
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)
            int r2 = r12.size()
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x001a
            if (r1 <= 0) goto L_0x0012
            X.C18320x8.A1K(r3)
        L_0x0012:
            java.lang.String r0 = "?"
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x000b
        L_0x001a:
            java.lang.String r2 = X.AnonymousClass000.A0e(r3)
            X.C162457s7.A0D(r2)
            X.3dV r0 = r10.A00
            X.4Fq r3 = r0.A04()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005a }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x005a }
            java.lang.String r6 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r7 = X.AnonymousClass000.A0V(r0, r2, r1)     // Catch:{ all -> 0x005a }
            java.util.ArrayList r2 = X.C73783g4.A0c(r12)     // Catch:{ all -> 0x005a }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x005a }
        L_0x0042:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x004c
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x005a }
            goto L_0x0042
        L_0x004c:
            java.lang.String[] r9 = X.C18280x3.A1b(r2)     // Catch:{ all -> 0x005a }
            java.lang.String r8 = "XFamilyStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r11
            r4.A05(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x005a }
            r3.close()
            return
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30J.A02(android.content.ContentValues, java.util.List):void");
    }

    public AnonymousClass30J(C72303dV r1, C54592oy r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A01(java.util.List r8) {
        /*
            r7 = this;
            java.util.HashMap r5 = X.AnonymousClass001.A0t()
            X.3dV r0 = r7.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005e }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x005e }
            int r2 = r8.size()     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            X.C18270x1.A1A(r0, r1, r2)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = X.AnonymousClass000.A0e(r1)     // Catch:{ all -> 0x005e }
            java.util.ArrayList r2 = X.C73783g4.A0c(r8)     // Catch:{ all -> 0x005e }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x005e }
        L_0x0028:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0032
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x005e }
            goto L_0x0028
        L_0x0032:
            java.lang.String[] r1 = X.C18300x5.A1b(r2)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r3 = r6.A0E(r3, r0, r1)     // Catch:{ all -> 0x005e }
        L_0x003c:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            X.2mc r2 = A00(r3)     // Catch:{ all -> 0x0057 }
            long r0 = r2.A01     // Catch:{ all -> 0x0057 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0057 }
            r5.put(r0, r2)     // Catch:{ all -> 0x0057 }
            goto L_0x003c
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x005e }
            r4.close()
            return r5
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30J.A01(java.util.List):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r7, int r8, long r9) {
        /*
            r6 = this;
            android.content.ContentValues r5 = X.AnonymousClass0x9.A06()
            int r0 = (int) r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r5.put(r0, r1)
            java.lang.String r0 = "state"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5.put(r0, r3)
            if (r7 == 0) goto L_0x0026
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0026
            java.lang.String r0 = "crossposting_session_id"
            r5.put(r0, r7)
        L_0x0026:
            X.2oy r0 = r6.A01
            r0.A01()
            r0.A01()
            X.0i7 r2 = r0.A00
            monitor-enter(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[PUT] messageRowId: "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r9)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " added with state "
            X.C18260x0.A0w(r0, r1, r8)     // Catch:{ all -> 0x0065 }
            r2.A0A(r9, r3)     // Catch:{ all -> 0x0065 }
            monitor-exit(r2)
            X.3dV r0 = r6.A00
            X.4Fq r4 = r0.A04()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005e }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "status_crossposting"
            r1 = 4
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r3.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x005e }
            r4.close()
            return
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0065:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30J.A03(java.lang.String, int, long):void");
    }

    public final void A04(List list, int i) {
        ContentValues A06 = AnonymousClass0x9.A06();
        C18270x1.A0b(A06, "state", i);
        C54592oy r0 = this.A01;
        r0.A01();
        r0.A02(list, i);
        A02(A06, list);
    }
}
