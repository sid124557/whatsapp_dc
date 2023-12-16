package X;

/* renamed from: X.2eD  reason: invalid class name and case insensitive filesystem */
public final class C48022eD {
    public final C72303dV A00;

    public C48022eD(C72303dV r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r8) {
        /*
            r7 = this;
            r6 = 0
            X.2z0 r1 = r8.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0063
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0063
            X.3dV r0 = r7.A00
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005c }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x005c }
            java.lang.String r2 = "SELECT status_distribution_mode FROM status_message_info WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x005c }
            X.C624134x.A0Y(r8, r1, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "GET_STATUS_DISTRIBUTION_MODE"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x005c }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "status_distribution_mode"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0055 }
            int r2 = r3.getInt(r1)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0048
            if (r2 == r5) goto L_0x0048
            r0 = 2
            if (r2 == r0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "StatusMessageDistributionModeStore/fillStatusDistributionMode unexpected db value="
            X.C18260x0.A0x(r0, r1, r2)     // Catch:{ all -> 0x0055 }
            goto L_0x004e
        L_0x0048:
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x0055 }
            r8.A0E = r0     // Catch:{ all -> 0x0055 }
        L_0x004e:
            r3.close()     // Catch:{ all -> 0x005c }
            r4.close()
            return
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48022eD.A00(X.34x):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C624134x r7) {
        /*
            r6 = this;
            X.2z0 r1 = r7.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x004a
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x004a
            X.3dV r0 = r6.A00
            X.4Fq r5 = r0.A04()
            android.content.ContentValues r4 = X.C18280x3.A09()     // Catch:{ all -> 0x0043 }
            X.C624134x.A0H(r4, r7)     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "status_distribution_mode"
            int r0 = r7.A0E     // Catch:{ all -> 0x0043 }
            X.2sg r3 = X.AnonymousClass3H0.A01(r4, r5, r1, r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "status_message_info"
            r1 = 5
            java.lang.String r0 = "StatusMessageDistributionModeStore/insertStatusDistributionModeData"
            long r3 = r3.A0C(r2, r0, r4, r1)     // Catch:{ all -> 0x0043 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "StatusMessageDistributionModeStore/insertStatusDistributionModeData/insert error, rowId="
            java.lang.String r0 = X.C624134x.A0C(r7, r0, r1)     // Catch:{ all -> 0x0043 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0043 }
        L_0x003f:
            r5.close()
            return
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48022eD.A01(X.34x):void");
    }
}
