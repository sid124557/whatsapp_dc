package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2xn  reason: invalid class name and case insensitive filesystem */
public final class C59972xn {
    public static final long A02 = TimeUnit.DAYS.toSeconds(7);
    public final C56612sH A00;
    public final AnonymousClass1RI A01;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0046
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Y()
            X.C18280x3.A0w(r9, r3, r7)
            X.1RI r0 = r8.A01
            X.4GK r6 = r0.get()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003c }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM recently_accepted_deeplink_invites WHERE user_jid = ?) AS user_exists"
            java.lang.String r0 = "invite_accepted_exists"
            android.database.Cursor r5 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x003c }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "user_exists"
            long r3 = X.AnonymousClass0x2.A0C(r5, r0)     // Catch:{ all -> 0x0035 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            r7 = 1
        L_0x0031:
            r5.close()     // Catch:{ all -> 0x003c }
            goto L_0x0043
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        L_0x0043:
            r6.close()
        L_0x0046:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972xn.A01(com.whatsapp.jid.UserJid):boolean");
    }

    public C59972xn(C56612sH r1, AnonymousClass1RI r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00() {
        /*
            r7 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            long r1 = X.C18290x4.A08()
            long r3 = A02
            long r1 = r1 - r3
            java.lang.String[] r6 = X.AnonymousClass0x9.A1a()
            r3 = 0
            java.lang.String r0 = "clicked_invite_link"
            r6[r3] = r0
            r0 = 1
            X.AnonymousClass0x2.A1S(r6, r0, r1)
            r1 = 2
            java.lang.String r0 = "5"
            r6[r1] = r0
            X.1RI r0 = r7.A01
            X.4GK r4 = r0.get()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x005e }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "SELECT user_jid FROM recently_accepted_deeplink_invites WHERE invite_receiver_reason = ? AND invite_accepted_time>? ORDER BY invite_accepted_time DESC LIMIT ?;"
            java.lang.String r0 = "GET_RECENTLY_ACCEPTED_INVITES_CLICKED_LINK"
            android.database.Cursor r3 = r2.A0E(r1, r0, r6)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "user_jid"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0057 }
        L_0x0037:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r3.getString(r2)     // Catch:{ 24P -> 0x0049 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A0A(r0)     // Catch:{ 24P -> 0x0049 }
            r5.add(r0)     // Catch:{ 24P -> 0x0049 }
            goto L_0x0037
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "RecentlyAcceptedInvitesStore/invalid user jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0037
        L_0x0050:
            r3.close()     // Catch:{ all -> 0x005e }
            r4.close()
            return r5
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59972xn.A00():java.util.ArrayList");
    }
}
