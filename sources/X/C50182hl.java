package X;

/* renamed from: X.2hl  reason: invalid class name and case insensitive filesystem */
public final class C50182hl {
    public final C64393Dh A00;
    public final C56972sr A01;
    public final C52802m4 A02;
    public final C51232jU A03;
    public final C56612sH A04;
    public final C56982ss A05;
    public final C66543Lv A06;
    public final C55832qz A07;

    public void A01(C624134x r6) {
        String str;
        C162457s7.A0J(r6, 0);
        C53532nF A0r = r6.A0r();
        String str2 = null;
        if (A0r != null) {
            str = A0r.A03;
        } else {
            str = null;
        }
        C53532nF A0r2 = r6.A0r();
        if (A0r2 != null) {
            str2 = A0r2.A05;
        }
        if (str != null) {
            C64393Dh r2 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            String A042 = C627236i.A04(str);
            C626936e.A06(A042);
            A0o.append(A042);
            C627536m.A0O(C64393Dh.A00(r2, AnonymousClass000.A0X("-profilephoto", A0o)));
        }
        if (str2 != null) {
            C64393Dh r22 = this.A00;
            StringBuilder A0o2 = AnonymousClass001.A0o();
            String A043 = C627236i.A04(str2);
            C626936e.A06(A043);
            A0o2.append(A043);
            C627536m.A0O(C64393Dh.A00(r22, AnonymousClass000.A0X("-hqthumb", A0o2)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(java.lang.String r8) {
        /*
            r7 = this;
            X.2jU r0 = r7.A03
            r6 = 0
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.3dV r0 = r0.A01
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x006e }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "SELECT message_row_id FROM bot_message_info WHERE target_id= ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x006e }
            r1[r6] = r8     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "SQL_GET_BOT_MESSAGE_ROW_ID_BY_TARGET_ID"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x006e }
        L_0x0020:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0067 }
            X.C18260x0.A0H(r2, r5, r0)     // Catch:{ all -> 0x0067 }
            goto L_0x0020
        L_0x0031:
            r2.close()     // Catch:{ all -> 0x006e }
            r4.close()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BonsaiWelcomeMessageHelperImpl/getBotResponseMessagesByTargetId targetId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "; rowIds="
            X.C18260x0.A1P(r1, r0, r5)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r5.iterator()
        L_0x0050:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0066
            long r1 = X.C18270x1.A02(r3)
            X.2qz r0 = r7.A07
            X.34x r0 = X.C55122pp.A00(r0, r1)
            if (r0 == 0) goto L_0x0050
            r4.add(r0)
            goto L_0x0050
        L_0x0066:
            return r4
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50182hl.A00(java.lang.String):java.util.List");
    }

    public C50182hl(C64393Dh r2, C56972sr r3, C52802m4 r4, C51232jU r5, C56612sH r6, C56982ss r7, C66543Lv r8, C55832qz r9) {
        C18260x0.A0f(r6, r4, r3, r7, r2);
        C162457s7.A0J(r9, 6);
        C162457s7.A0J(r8, 8);
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
        this.A07 = r9;
        this.A03 = r5;
        this.A06 = r8;
    }
}
