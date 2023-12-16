package X;

/* renamed from: X.2Vg  reason: invalid class name and case insensitive filesystem */
public final class C44252Vg {
    public final C72303dV A00;

    public C44252Vg(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(X.C30401mO r7) {
        /*
            r6 = this;
            r5 = 0
            X.3dV r0 = r6.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004e }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "SELECT call_log_row_id FROM message_call_log WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x004e }
            X.C624134x.A0Y(r7, r1, r5)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "GET_CALL_LOG_MESSAGE_BY_ROW_ID"
            android.database.Cursor r5 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x004e }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0047 }
            r2 = -1
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "call_log_row_id"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0047 }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "MessageCallLogStore/getCallLogRowId callLogRowId is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0040
        L_0x0035:
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x0047 }
            r5.close()     // Catch:{ all -> 0x004e }
            r4.close()
            return r0
        L_0x0040:
            r5.close()     // Catch:{ all -> 0x004e }
            r4.close()
            return r2
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44252Vg.A00(X.1mO):long");
    }
}
