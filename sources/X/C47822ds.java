package X;

/* renamed from: X.2ds  reason: invalid class name and case insensitive filesystem */
public final class C47822ds {
    public final C183538qC A00;

    public C47822ds(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r9, long r10) {
        /*
            r8 = this;
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/accountLid:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", lastActiveTsMs: "
            X.C18260x0.A12(r0, r1, r10)
            X.4Fq r6 = X.C18630y0.A05(r8)     // Catch:{ all -> 0x004a }
            X.3Yo r5 = r6.Axl()     // Catch:{ all -> 0x0043 }
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003c }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "notifications"
            java.lang.String r2 = "account_lid = ? AND timestamp < ?"
            java.lang.String[] r1 = X.AnonymousClass0x7.A1a(r9, r7)     // Catch:{ all -> 0x003c }
            X.C18270x1.A1R(r1, r10)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "DELETE_NOTIFICATIONS_BY_LID_AND_LAST_ACTIVE_TS"
            r4.A07(r3, r2, r0, r1)     // Catch:{ all -> 0x003c }
            r5.A00()     // Catch:{ all -> 0x003c }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x003c }
            r5.close()     // Catch:{ all -> 0x0043 }
            r6.close()     // Catch:{ all -> 0x004a }
            goto L_0x004f
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x004f:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47822ds.A00(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r2 = 0
            r4 = 0
            r1 = 1
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0066
            int r0 = r14.length()
            if (r0 == 0) goto L_0x0066
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()
            java.lang.String r0 = "call_status"
            X.C18270x1.A0b(r6, r0, r2)
            X.4Fq r2 = X.C18630y0.A05(r12)     // Catch:{ all -> 0x0055 }
            X.3Yo r3 = r2.Axl()     // Catch:{ all -> 0x004e }
            r0 = r2
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0047 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0047 }
            java.lang.String r7 = "notifications"
            java.lang.String r8 = "account_lid = ? AND call_id = ?"
            java.lang.String[] r10 = X.AnonymousClass0x7.A1a(r13, r4)     // Catch:{ all -> 0x0047 }
            r10[r1] = r14     // Catch:{ all -> 0x0047 }
            r11 = 5
            java.lang.String r9 = "UPDATE_CALL_NOTIFICATION"
            r5.A06(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0047 }
            r3.A00()     // Catch:{ all -> 0x0047 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0047 }
            r3.close()     // Catch:{ all -> 0x004e }
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x005a
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x005a:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r0)
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0066:
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47822ds.A01(java.lang.String, java.lang.String):void");
    }
}
