package X;

/* renamed from: X.2ZY  reason: invalid class name */
public final class AnonymousClass2ZY {
    public final C56922sm A00;
    public final C56982ss A01;
    public final C72303dV A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(X.C95814uZ r7) {
        /*
            r6 = this;
            r2 = 0
            X.2sm r0 = r6.A00
            long r0 = r0.A07(r7)
            java.lang.String[] r5 = X.AnonymousClass0x9.A1a()
            X.AnonymousClass0x2.A1S(r5, r2, r0)
            r1 = 1
            java.lang.String r0 = "147"
            r5[r1] = r0
            java.lang.String r0 = "155"
            r4 = 2
            r5[r4] = r0
            X.3dV r0 = r6.A02
            X.4GK r3 = r0.get()
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0063 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id WHERE chat_row_id = ? AND message_type = 7 AND "
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "action_type IN "
            X.C57212tH.A02(r0, r1, r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = " LIMIT 1"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "GET_LAST_SYSTEM_MESSAGE_ID_FOR_WABAI_EDUCATION_MESSAGE"
            android.database.Cursor r2 = r2.A0E(r1, r0, r5)     // Catch:{ all -> 0x0063 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0053
            long r0 = X.C18270x1.A01(r2)     // Catch:{ all -> 0x005c }
            r2.close()     // Catch:{ all -> 0x0063 }
            r3.close()
            return r0
        L_0x0053:
            r2.close()     // Catch:{ all -> 0x0063 }
            r3.close()
            r0 = -1
            return r0
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2ZY.A00(X.4uZ):long");
    }

    public AnonymousClass2ZY(C56922sm r1, C56982ss r2, C72303dV r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
