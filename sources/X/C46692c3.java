package X;

/* renamed from: X.2c3  reason: invalid class name and case insensitive filesystem */
public class C46692c3 {
    public final C55682qk A00;
    public final C56612sH A01;
    public final C56922sm A02;
    public final C49472ga A03;
    public final C55272q5 A04;
    public final C72303dV A05;

    public C46692c3(C55682qk r1, C56612sH r2, C56922sm r3, C49472ga r4, C55272q5 r5, C72303dV r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r22 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2W3 A00(X.AnonymousClass2z0 r21, boolean r22) {
        /*
            r20 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r9 = r21
            X.4uZ r7 = r9.A00
            boolean r2 = X.C627336j.A0K(r7)
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0017
            boolean r2 = r7 instanceof X.C135166kE
            if (r2 != 0) goto L_0x0017
            r4 = 0
            if (r22 == 0) goto L_0x0018
        L_0x0017:
            r4 = 1
        L_0x0018:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "jid="
            X.C18260x0.A0l(r7, r2, r3, r4)
            java.lang.String r2 = X.C18300x5.A0i(r7)
            X.2W3 r8 = new X.2W3
            r8.<init>()
            java.lang.String[] r5 = X.AnonymousClass0x7.A1a(r2, r5)
            java.lang.String r2 = r9.A01
            r5[r6] = r2
            r7 = r20
            X.3dV r2 = r7.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
            X.4GK r12 = r2.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
            r2 = r12
            X.3H0 r2 = (X.AnonymousClass3H0) r2     // Catch:{ all -> 0x00b3 }
            X.2sg r4 = r2.A03     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = "SELECT remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM receipts WHERE key_remote_jid = ? AND key_id = ?"
            java.lang.String r2 = "GET_GROUP_MESSAGE_RECEIPTS_SQL"
            android.database.Cursor r6 = r4.A0E(r3, r2, r5)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "remote_resource"
            int r9 = r6.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "receipt_device_timestamp"
            int r5 = r6.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "read_device_timestamp"
            int r4 = r6.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "played_device_timestamp"
            int r3 = r6.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00a7 }
        L_0x0063:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = r6.getString(r9)     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x0072
            X.1fY r2 = X.AnonymousClass1fY.A00     // Catch:{ all -> 0x00a7 }
            goto L_0x0076
        L_0x0072:
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A08(r2)     // Catch:{ all -> 0x00a7 }
        L_0x0076:
            boolean r11 = X.AnonymousClass000.A1W(r2)
            java.lang.String r10 = "receiptsmsgstore/invalid participant jid when getting receipts for group or status message"
            X.C626936e.A0D(r11, r10)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0063
            long r14 = r6.getLong(r5)     // Catch:{ all -> 0x00a7 }
            long r16 = r6.getLong(r4)     // Catch:{ all -> 0x00a7 }
            long r18 = r6.getLong(r3)     // Catch:{ all -> 0x00a7 }
            X.2z3 r13 = new X.2z3     // Catch:{ all -> 0x00a7 }
            r13.<init>(r14, r16, r18)     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.ConcurrentHashMap r10 = r8.A00     // Catch:{ all -> 0x00a7 }
            r10.put(r2, r13)     // Catch:{ all -> 0x00a7 }
            goto L_0x0063
        L_0x0099:
            X.2ga r3 = r7.A03     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "ReceiptsMessageStore/getMessageReceiptsForGroupOrStatusMessage"
            X.C49472ga.A00(r3, r2, r0)     // Catch:{ all -> 0x00a7 }
            r6.close()     // Catch:{ all -> 0x00b3 }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
            return r8
        L_0x00a7:
            r1 = move-exception
            if (r6 == 0) goto L_0x00b2
            r6.close()     // Catch:{ all -> 0x00ae }
            goto L_0x00b2
        L_0x00ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b3 }
        L_0x00b2:
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        L_0x00bc:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r7.A04
            r0.A04()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46692c3.A00(X.2z0, boolean):X.2W3");
    }
}
