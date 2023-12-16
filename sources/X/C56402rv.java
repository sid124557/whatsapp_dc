package X;

/* renamed from: X.2rv  reason: invalid class name and case insensitive filesystem */
public final class C56402rv {
    public final C43412Sa A00;
    public final C45622aJ A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final C183538qC A08;
    public final C183538qC A09;

    public int A00(C95814uZ r3) {
        AnonymousClass3ZH A072;
        if (r3 == null || (A072 = ((C64773Ex) this.A05.get()).A07(r3)) == null) {
            return 0;
        }
        return A072.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C95814uZ r10) {
        /*
            r9 = this;
            r7 = 0
            X.C162457s7.A0J(r10, r7)
            boolean r0 = r10 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x011f
            X.8qC r1 = r9.A05
            java.lang.Object r0 = r1.get()
            X.3Ex r0 = (X.C64773Ex) r0
            X.3ZH r0 = r0.A07(r10)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x011f
            int r0 = r9.A00(r10)
            boolean r0 = r9.A03(r0)
            if (r0 != 0) goto L_0x011f
            r8 = r9
            monitor-enter(r8)
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x011b }
            X.3Ex r0 = (X.C64773Ex) r0     // Catch:{ all -> 0x011b }
            X.3ZH r3 = r0.A07(r10)     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x011e
            boolean r0 = r3.A0S()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0053
            X.8qC r0 = r9.A02     // Catch:{ all -> 0x011b }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x011b }
            X.1VX r2 = (X.AnonymousClass1VX) r2     // Catch:{ all -> 0x011b }
            r1 = 4873(0x1309, float:6.829E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x011b }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 1p, abprop disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            goto L_0x011e
        L_0x0053:
            boolean r0 = r3.A0T()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0072
            X.8qC r0 = r9.A02     // Catch:{ all -> 0x011b }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x011b }
            X.1VX r2 = (X.AnonymousClass1VX) r2     // Catch:{ all -> 0x011b }
            r1 = 5587(0x15d3, float:7.829E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x011b }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 3p, abprop disabled."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011b }
            goto L_0x011e
        L_0x0072:
            X.8qC r0 = r9.A03     // Catch:{ all -> 0x011b }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011b }
            X.2XZ r1 = (X.AnonymousClass2XZ) r1     // Catch:{ all -> 0x011b }
            X.8qC r0 = r9.A04     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x011b }
            X.2sm r0 = (X.C56922sm) r0     // Catch:{ all -> 0x011b }
            long r4 = r0.A07(r10)     // Catch:{ all -> 0x011b }
            X.3dV r0 = r1.A01     // Catch:{ all -> 0x011b }
            X.4GK r3 = r0.get()     // Catch:{ all -> 0x011b }
            r0 = r3
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0114 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = "SELECT welcome_request_message_sent FROM bot_chat_info WHERE chat_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0114 }
            X.AnonymousClass0x2.A1S(r1, r7, r4)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "BotChatInfoStore/GET_IS_WELCOME_REQUEST_MESSAGE_SENT"
            android.database.Cursor r2 = r6.A0E(r2, r0, r1)     // Catch:{ all -> 0x0114 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x00ad
            r2.close()     // Catch:{ all -> 0x0114 }
            r3.close()     // Catch:{ all -> 0x011b }
            goto L_0x00bf
        L_0x00ad:
            java.lang.String r0 = "welcome_request_message_sent"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            boolean r0 = X.C382426h.A00(r2, r0)     // Catch:{ all -> 0x010d }
            r2.close()     // Catch:{ all -> 0x0114 }
            r3.close()     // Catch:{ all -> 0x011b }
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            r5 = 1
            boolean r2 = X.AnonymousClass000.A1T(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested/needSendRequest="
            X.C18260x0.A1D(r0, r1, r2)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested/jid="
            X.C18260x0.A1P(r1, r0, r10)     // Catch:{ all -> 0x011b }
            X.8qC r2 = r9.A09     // Catch:{ all -> 0x011b }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x011b }
            X.2sH r1 = (X.C56612sH) r1     // Catch:{ all -> 0x011b }
            X.8qC r0 = r9.A07     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x011b }
            X.2sr r0 = (X.C56972sr) r0     // Catch:{ all -> 0x011b }
            java.lang.String r0 = X.AnonymousClass35J.A02(r0, r1)     // Catch:{ all -> 0x011b }
            X.2z0 r4 = X.AnonymousClass2z0.A05(r10, r0, r5)     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x011b }
            X.2sH r0 = (X.C56612sH) r0     // Catch:{ all -> 0x011b }
            long r2 = r0.A0H()     // Catch:{ all -> 0x011b }
            X.1m8 r1 = new X.1m8     // Catch:{ all -> 0x011b }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x011b }
            X.8qC r0 = r9.A06     // Catch:{ all -> 0x011b }
            X.3Lv r0 = X.AnonymousClass0x9.A0M(r0)     // Catch:{ all -> 0x011b }
            r0.A0V(r1)     // Catch:{ all -> 0x011b }
            r9.A02(r10, r5)     // Catch:{ all -> 0x011b }
            goto L_0x011e
        L_0x010d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x011b }
            throw r0     // Catch:{ all -> 0x011b }
        L_0x011b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x011e:
            monitor-exit(r8)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56402rv.A01(X.4uZ):void");
    }

    public final boolean A03(int i) {
        if (i == 1) {
            C58422vE r3 = C58422vE.A02;
            if (!((C56952sp) this.A02.get()).A0Y(r3, 4873)) {
                return false;
            }
            C45622aJ r2 = this.A01;
            if (!r2.A01.A0Y(r3, 5747) || C162457s7.A0P(r2.A00(), "yes")) {
                return false;
            }
            return true;
        } else if (i != 2 || C162457s7.A0P(this.A01.A00(), "yes") || !((C56952sp) this.A02.get()).A0Y(C58422vE.A02, 5587)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A05(C95814uZ r4) {
        AnonymousClass3ZH A072;
        if (r4 == null || (A072 = ((C64773Ex) this.A05.get()).A07(r4)) == null || !A072.A0S()) {
            return false;
        }
        return C56952sp.A0K((C56952sp) this.A02.get(), 4873, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = ((X.C64773Ex) r2.A05.get()).A07(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C95814uZ r3) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x0026
            X.8qC r0 = r2.A05
            java.lang.Object r0 = r0.get()
            X.3Ex r0 = (X.C64773Ex) r0
            X.3ZH r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0026
            X.8qC r0 = r2.A02
            java.lang.Object r0 = X.C18300x5.A0b(r0)
            X.1VX r0 = (X.AnonymousClass1VX) r0
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 == 0) goto L_0x0026
            r1 = 1
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56402rv.A06(X.4uZ):boolean");
    }

    public C56402rv(C43412Sa r1, C45622aJ r2, C183538qC r3, C183538qC r4, C183538qC r5, C183538qC r6, C183538qC r7, C183538qC r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r3, r4, r5, r6, r7);
        C18260x0.A0g(r8, r9, r2, r1, r10);
        this.A09 = r3;
        this.A02 = r4;
        this.A07 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A08 = r9;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r10;
    }

    public void A02(C95814uZ r5, boolean z) {
        StringBuilder A0X = C18270x1.A0X(r5);
        A0X.append("WabaiUtilsImpl/updateWelcomeRequestState/chatJid=");
        A0X.append(r5);
        C18260x0.A1D(", isSent=", A0X, z);
        ((AnonymousClass2XZ) this.A03.get()).A00(((C56922sm) this.A04.get()).A07(r5), z);
        ((C65203Gp) this.A08.get()).A0I(new C51452jq(Boolean.valueOf(z), r5.getRawString()), C373121t.BOT_WELCOME_REQUEST);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = r9.A01;
        r3 = r2.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.AnonymousClass3ZH r10) {
        /*
            r9 = this;
            boolean r0 = r10.A0R()
            r8 = 0
            if (r0 == 0) goto L_0x0062
            int r0 = r10.A00
            boolean r0 = r9.A03(r0)
            if (r0 == 0) goto L_0x0062
            X.2aJ r2 = r9.A01
            java.lang.String r3 = r2.A00()
            int r1 = r3.hashCode()
            r0 = 3507(0xdb3, float:4.914E-42)
            if (r1 == r0) goto L_0x0062
            r0 = 3521(0xdc1, float:4.934E-42)
            if (r1 == r0) goto L_0x0063
            r0 = 119527(0x1d2e7, float:1.67493E-40)
            if (r1 == r0) goto L_0x0062
            r0 = 111442729(0x6a47b29, float:6.187091E-35)
            if (r1 != r0) goto L_0x0062
            java.lang.String r0 = "unset"
        L_0x002e:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0062
            long r6 = java.lang.System.currentTimeMillis()
            X.2Sa r0 = r2.A02
            X.2Z3 r0 = r0.A04
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "consent_last_dismissed_timestamp"
            long r4 = X.AnonymousClass0x2.A0A(r1, r0)
            X.1VX r2 = r2.A01
            r1 = 5746(0x1672, float:8.052E-42)
            X.2vE r0 = X.C58422vE.A02
            int r3 = r2.A0O(r0, r1)
            r1 = 0
            r8 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0062
            if (r3 < 0) goto L_0x0067
            long r6 = r6 - r4
            long r1 = X.C18290x4.A0A(r3)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
        L_0x0062:
            return r8
        L_0x0063:
            java.lang.String r0 = "no"
            goto L_0x002e
        L_0x0067:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56402rv.A04(X.3ZH):boolean");
    }
}
