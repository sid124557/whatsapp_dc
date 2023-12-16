package X;

/* renamed from: X.3Ft  reason: invalid class name and case insensitive filesystem */
public final class C64983Ft implements AnonymousClass664 {
    public final C64773Ex A00;
    public final C66543Lv A01;
    public final C56652sL A02;
    public final AnonymousClass1R1 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r7 = this;
            X.2sL r5 = r7.A02
            X.5UP r0 = r5.A06
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x0066
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x005a }
            X.21q r0 = X.C372821q.GUEST     // Catch:{ all -> 0x005a }
            int r0 = r0.value     // Catch:{ all -> 0x005a }
            X.C18270x1.A1O(r6, r0)     // Catch:{ all -> 0x005a }
            X.3dV r0 = r5.A04     // Catch:{ all -> 0x005a }
            X.4GK r4 = r0.get()     // Catch:{ all -> 0x005a }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0053 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0053 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "SELECT chat_row_id FROM newsletter WHERE membership IN ("
            r2.append(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0053 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C73723fy.A09(r0, r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = X.C18260x0.A07(r0, r2)     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "NewsletterStore/GET_NEWSLETTER_JID_WITH_MEMBERSHIP_SQL"
            android.database.Cursor r2 = X.C56862sg.A02(r3, r1, r0, r6)     // Catch:{ all -> 0x0053 }
            java.util.List r0 = r5.A06(r2)     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            r4.close()     // Catch:{ all -> 0x005a }
            goto L_0x0068
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass3Z0.A00(r0)
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "NewsletterStore/failed to read newsletter"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0066:
            X.3d3 r0 = X.C72023d3.A00
        L_0x0068:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r0.iterator()
        L_0x0070:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0095
            X.4uZ r3 = X.C18300x5.A0P(r4)
            X.3Lv r1 = r7.A01
            r0 = 1
            r1.A0R(r3, r0)
            X.3Ex r0 = r7.A00
            X.3ZH r2 = r0.A07(r3)
            if (r2 == 0) goto L_0x0070
            X.1R1 r1 = r7.A03
            boolean r0 = r2.A0U()
            r1.A0Y(r3, r0)
            r5.add(r2)
            goto L_0x0070
        L_0x0095:
            X.3Ex r0 = r7.A00
            r0.A0g(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64983Ft.BQV():void");
    }

    public C64983Ft(C64773Ex r1, C66543Lv r2, C56652sL r3, AnonymousClass1R1 r4) {
        C18260x0.A0c(r1, r3, r4, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String BDW() {
        return "NewsletterCleaningDailyCron";
    }
}
