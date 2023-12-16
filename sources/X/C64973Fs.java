package X;

/* renamed from: X.3Fs  reason: invalid class name and case insensitive filesystem */
public class C64973Fs implements AnonymousClass664 {
    public final C56642sK A00;
    public final C56612sH A01;
    public final AnonymousClass33p A02;
    public final C54812pK A03;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r17 < r9) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r21 = this;
            r8 = r21
            X.33p r7 = r8.A02
            X.8qC r1 = r7.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            java.lang.String r6 = "privacy_token_last_batch_time_sec"
            long r19 = X.AnonymousClass0x2.A0A(r0, r6)
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            java.lang.String r2 = "privacy_token_batch_offset_sec"
            int r11 = X.C18310x6.A03(r0, r2)
            r1 = 604800(0x93a80, float:8.47505E-40)
            if (r11 < 0) goto L_0x0023
            if (r11 < r1) goto L_0x002e
        L_0x0023:
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            int r11 = r0.nextInt(r1)
            X.C18260x0.A0L(r7, r2, r11)
        L_0x002e:
            X.2sH r0 = r8.A01
            long r3 = X.C56612sH.A00(r0)
            r17 = 86400(0x15180, double:4.26873E-319)
            long r17 = r17 + r3
            r0 = 7200(0x1c20, double:3.5573E-320)
            long r9 = r17 - r0
            r15 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r19 + r15
            r5 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass001.A1W(r0)
            long r0 = (long) r11
            long r13 = r19 - r0
            long r13 = r13 / r15
            long r11 = r3 - r0
            long r11 = r11 / r15
            long r9 = r11 * r15
            long r9 = r9 + r0
            r0 = 129600(0x1fa40, double:6.4031E-319)
            long r9 = r9 + r0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            long r15 = r15 + r3
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            r5 = 0
        L_0x006b:
            if (r2 != 0) goto L_0x0072
            if (r1 != 0) goto L_0x0072
            if (r5 != 0) goto L_0x0072
            return
        L_0x0072:
            X.2sK r0 = r8.A00
            X.1vB r0 = r0.A03
            java.util.HashSet r9 = X.AnonymousClass002.A0K()
            X.4GK r10 = X.C18630y0.A03(r0)
            r0 = r10
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00cc }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = "SELECT jid FROM wa_trusted_contacts_send WHERE real_issue_timestamp >= 0"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "GET_DEFERRED_TOKEN_JIDS"
            android.database.Cursor r5 = r5.A0E(r2, r0, r1)     // Catch:{ all -> 0x00cc }
            int r2 = X.AnonymousClass0x9.A01(r5)     // Catch:{ all -> 0x00c0 }
        L_0x0092:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = r5.getString(r2)     // Catch:{ all -> 0x00c0 }
            X.32Y r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00c0 }
            X.AnonymousClass32Y.A0C(r0, r1, r9)     // Catch:{ all -> 0x00c0 }
            goto L_0x0092
        L_0x00a2:
            r5.close()     // Catch:{ all -> 0x00cc }
            r10.close()
            java.util.Iterator r2 = r9.iterator()
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bc
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.2pK r0 = r8.A03
            r0.A00(r1)
            goto L_0x00ac
        L_0x00bc:
            X.C18260x0.A0M(r7, r6, r3)
            return
        L_0x00c0:
            r1 = move-exception
            if (r5 == 0) goto L_0x00cb
            r5.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00cc }
        L_0x00cb:
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00d1 }
            throw r1
        L_0x00d1:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64973Fs.BQV():void");
    }

    public C64973Fs(C56642sK r1, C56612sH r2, AnonymousClass33p r3, C54812pK r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public String BDW() {
        return "PrivacyToken";
    }
}
