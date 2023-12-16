package X;

/* renamed from: X.3UZ  reason: invalid class name */
public class AnonymousClass3UZ implements AnonymousClass65Y {
    public final C56612sH A00;
    public final C56922sm A01;
    public final C49472ga A02;
    public final C66533Lu A03;
    public final C72303dV A04;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0066=Splitter:B:14:0x0066, B:31:0x00de=Splitter:B:31:0x00de} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor B9f(X.AnonymousClass0QU r15, X.C95814uZ r16, X.C56532s8 r17) {
        /*
            r14 = this;
            r10 = r17
            r7 = r16
            if (r16 != 0) goto L_0x0070
            java.lang.String r6 = "StarredMessageStore/getStarredMessages"
            long r2 = android.os.SystemClock.uptimeMillis()
            X.3Lu r11 = r14.A03
            long r12 = r11.A03()
            X.3dV r0 = r14.A04     // Catch:{ all -> 0x00f1 }
            X.4GK r9 = r0.get()     // Catch:{ all -> 0x00f1 }
            r7 = 0
            if (r17 == 0) goto L_0x0059
            boolean r0 = X.C56532s8.A00(r10)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0059
            r4 = 1
            r8 = 0
            r1 = 1
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r10.A02()     // Catch:{ all -> 0x006a }
            java.lang.String r7 = r11.A0F(r0)     // Catch:{ all -> 0x006a }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r4 = X.AnonymousClass2CD.A0B     // Catch:{ all -> 0x006a }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x006a }
            r1[r8] = r7     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "SEARCH_STARRED_MESSAGES_FTS_DEPRECATED_SQL"
            android.database.Cursor r1 = r5.A0D(r15, r4, r0, r1)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0043:
            java.lang.String r7 = r11.A0A(r15, r10, r7)     // Catch:{ all -> 0x006a }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r4 = X.AnonymousClass2CD.A0C     // Catch:{ all -> 0x006a }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x006a }
            r1[r8] = r7     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "SEARCH_STARRED_MESSAGES_FTS_SQL"
            android.database.Cursor r1 = r5.A0D(r15, r4, r0, r1)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0059:
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006a }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x006a }
            java.lang.String r1 = X.C58162uo.A03     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "GET_ALL_STARRED_MESSAGES_START_SQL"
            android.database.Cursor r1 = r4.A0D(r15, r1, r0, r7)     // Catch:{ all -> 0x006a }
        L_0x0066:
            r9.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00e1
        L_0x006a:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x0070:
            java.lang.String r6 = "StarredMessageStore/getStarredMessagesForJid"
            long r2 = android.os.SystemClock.uptimeMillis()
            X.3Lu r9 = r14.A03
            long r12 = r9.A03()
            X.3dV r0 = r14.A04     // Catch:{ all -> 0x00f1 }
            X.4GK r11 = r0.get()     // Catch:{ all -> 0x00f1 }
            r8 = 0
            r1 = 1
            if (r17 == 0) goto L_0x00ca
            boolean r0 = X.C56532s8.A00(r10)     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00ca
            r4 = 1
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r10.A02()     // Catch:{ all -> 0x00e7 }
            java.lang.String r10 = r9.A0F(r0)     // Catch:{ all -> 0x00e7 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e7 }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x00e7 }
            java.lang.String r5 = X.AnonymousClass2CD.A09     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r4 = X.AnonymousClass0x9.A1Z()     // Catch:{ all -> 0x00e7 }
            X.2sm r0 = r14.A01     // Catch:{ all -> 0x00e7 }
            X.C56922sm.A02(r0, r7, r4, r8)     // Catch:{ all -> 0x00e7 }
            r4[r1] = r10     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_DEPRECATED_SQL"
            android.database.Cursor r1 = r9.A0D(r15, r5, r0, r4)     // Catch:{ all -> 0x00e7 }
            goto L_0x00de
        L_0x00b3:
            r0 = 0
            java.lang.String r7 = r9.A0A(r15, r10, r0)     // Catch:{ all -> 0x00e7 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e7 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00e7 }
            java.lang.String r4 = X.AnonymousClass2CD.A0A     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00e7 }
            r1[r8] = r7     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_SQL"
            android.database.Cursor r1 = r5.A0D(r15, r4, r0, r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x00de
        L_0x00ca:
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00e7 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00e7 }
            java.lang.String r4 = X.C58162uo.A02     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00e7 }
            X.2sm r0 = r14.A01     // Catch:{ all -> 0x00e7 }
            X.C56922sm.A02(r0, r7, r1, r8)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "GET_ALL_STARRED_MESSAGES_FOR_JID_START_SQL"
            android.database.Cursor r1 = r5.A0D(r15, r4, r0, r1)     // Catch:{ all -> 0x00e7 }
        L_0x00de:
            r11.close()     // Catch:{ all -> 0x00f1 }
        L_0x00e1:
            X.2ga r0 = r14.A02
            X.C49472ga.A00(r0, r6, r2)
            return r1
        L_0x00e7:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ec:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r1 = move-exception
            X.2ga r0 = r14.A02
            X.C49472ga.A00(r0, r6, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UZ.B9f(X.0QU, X.4uZ, X.2s8):android.database.Cursor");
    }

    public AnonymousClass3UZ(C56612sH r1, C56922sm r2, C49472ga r3, C66533Lu r4, C72303dV r5) {
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
