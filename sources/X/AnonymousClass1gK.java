package X;

/* renamed from: X.1gK  reason: invalid class name */
public final class AnonymousClass1gK extends C67743Qm {
    public final C54292oU A00;
    public final AnonymousClass4FS A01;
    public final C183538qC A02;
    public final C183538qC A03;
    public final C183538qC A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1gK(X.C55682qk r17, X.C54292oU r18, X.AnonymousClass31C r19, X.C55892r5 r20, X.AnonymousClass4FS r21, X.C183538qC r22, X.C183538qC r23, X.C183538qC r24, X.C183538qC r25, X.C183538qC r26, X.C183538qC r27) {
        /*
            r16 = this;
            r15 = 1
            r10 = r17
            X.C162457s7.A0J(r10, r15)
            r11 = r19
            r12 = r20
            r13 = r21
            r8 = r18
            X.C18260x0.A0e(r8, r13, r11, r12)
            r5 = r24
            r4 = r25
            r3 = r26
            r7 = r22
            r6 = r23
            X.C18260x0.A0g(r7, r6, r5, r4, r3)
            r0 = 11
            r2 = r27
            X.C162457s7.A0J(r2, r0)
            int[] r14 = new int[r15]
            r1 = 0
            r0 = 246(0xf6, float:3.45E-43)
            r14[r1] = r0
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9.A00 = r8
            r9.A01 = r13
            r9.A04 = r7
            r9.A03 = r6
            r9.A06 = r5
            r9.A05 = r4
            r9.A02 = r3
            r9.A07 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gK.<init>(X.2qk, X.2oU, X.31C, X.2r5, X.4FS, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC, X.8qC):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011b, code lost:
        if (r2 >= r6) goto L_0x0163;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r9, int r10) {
        /*
            r8 = this;
            r0 = 1
            X.C162457s7.A0J(r9, r0)
            X.36K r4 = r9.A0j()
            X.C162457s7.A0D(r4)
            java.lang.String r2 = r4.A00
            java.lang.String r0 = "notification_metadata"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0183
            java.lang.String r5 = "event"
            int r2 = X.AnonymousClass36K.A02(r4, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountLinkingNotificationHandler/received event:"
            X.C18260x0.A0y(r0, r1, r2)
            java.lang.String r3 = "show_user_notif"
            switch(r2) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0123;
                case 3: goto L_0x0049;
                case 4: goto L_0x0089;
                case 5: goto L_0x0095;
                case 6: goto L_0x00ec;
                case 7: goto L_0x0042;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected value for event: "
            r1.append(r0)
            int r0 = X.AnonymousClass36K.A02(r4, r5)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            X.24Y r0 = X.AnonymousClass24Y.A01(r0)
            throw r0
        L_0x0042:
            java.lang.String r0 = "Failure notification handling is not supported"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass002.A0G(r0)
            throw r0
        L_0x0049:
            X.8qC r0 = r8.A03
            X.30P r1 = X.C18320x8.A0M(r0)
            X.2iy r0 = X.AnonymousClass2BX.A00
            X.2yH r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleChangeSettings/null user"
            goto L_0x011f
        L_0x005b:
            X.8qC r0 = r8.A04
            X.30u r0 = X.AnonymousClass0x9.A0c(r0)
            r0.A03()
            return
        L_0x0065:
            boolean r0 = A00(r4, r3)
            if (r0 == 0) goto L_0x0122
            X.2oU r0 = r8.A00
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131896483(0x7f1228a3, float:1.9427829E38)
            java.lang.String r4 = r1.getString(r0)
            X.C162457s7.A0D(r4)
            r3 = 43
            X.4FS r2 = r8.A01
            r1 = 6
            X.5rY r0 = new X.5rY
            r0.<init>(r8, r4, r3, r1)
            r2.BkM(r0)
            return
        L_0x0089:
            X.8qC r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.2fT r0 = (X.C48782fT) r0
            r0.A00()
            return
        L_0x0095:
            java.lang.String r0 = "ndc"
            boolean r3 = A00(r4, r0)
            java.lang.String r0 = "npr"
            boolean r2 = A00(r4, r0)
            X.8qC r0 = r8.A05
            X.30u r1 = X.AnonymousClass0x9.A0c(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05(r0)
            if (r3 != 0) goto L_0x00d1
            if (r2 != 0) goto L_0x00d1
            X.8qC r0 = r8.A03
            X.30P r1 = X.C18320x8.A0M(r0)
            X.2iy r0 = X.AnonymousClass2BX.A00
            X.2yH r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x00d1
            X.8qC r0 = r8.A02
            java.lang.Object r1 = r0.get()
            X.2X9 r1 = (X.AnonymousClass2X9) r1
            X.3MP r0 = new X.3MP
            r0.<init>()
            r1.A00(r0)
            return
        L_0x00d1:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleSuspendState/needs disclosure ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ") or needs password reset ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") or null user"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x011f
        L_0x00ec:
            java.lang.String r0 = "sync_delay"
            long r6 = X.AnonymousClass36K.A04(r4, r0)
            X.8qC r0 = r8.A04
            X.30u r5 = X.AnonymousClass0x9.A0c(r0)
            android.content.SharedPreferences r1 = r5.A00()
            java.lang.String r0 = "last_cache_update_time"
            r3 = 0
            long r1 = r1.getLong(r0, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
            X.2sH r0 = r5.A02
            long r2 = X.C56612sH.A03(r0, r1)
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x011d
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0163
        L_0x011d:
            java.lang.String r0 = "AccountLinkingNotificationHandler/handleResyncState/not valid for cache sync"
        L_0x011f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0122:
            return
        L_0x0123:
            java.lang.String r1 = "type"
            r0 = -1
            int r2 = r4.A0b(r1, r0)
            boolean r1 = A00(r4, r3)
            java.lang.String r0 = "client_resync"
            boolean r5 = A00(r4, r0)
            if (r2 != 0) goto L_0x0142
            X.8qC r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.2fT r0 = (X.C48782fT) r0
            r0.A00()
        L_0x0142:
            if (r1 == 0) goto L_0x0161
            X.2oU r0 = r8.A00
            android.content.res.Resources r1 = X.C54292oU.A00(r0)
            r0 = 2131896484(0x7f1228a4, float:1.942783E38)
            java.lang.String r4 = r1.getString(r0)
            X.C162457s7.A0D(r4)
            r3 = 44
            X.4FS r2 = r8.A01
            r1 = 6
            X.5rY r0 = new X.5rY
            r0.<init>(r8, r4, r3, r1)
            r2.BkM(r0)
        L_0x0161:
            if (r5 == 0) goto L_0x0122
        L_0x0163:
            X.8qC r2 = r8.A03
            X.30P r1 = X.C18320x8.A0M(r2)
            X.2iy r0 = X.AnonymousClass2BX.A00
            X.2yH r3 = r1.A01(r0)
            if (r3 != 0) goto L_0x0174
            java.lang.String r0 = "AccountLinkingNotificationHandler/syncState/null user"
            goto L_0x011f
        L_0x0174:
            X.30P r2 = X.C18320x8.A0M(r2)
            r0 = 4
            X.4Ii r1 = new X.4Ii
            r1.<init>(r8, r0)
            r0 = 0
            r2.A03(r3, r1, r0)
            return
        L_0x0183:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected tag: "
            X.24Y r0 = X.AnonymousClass24Y.A02(r0, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1gK.A05(X.36K, int):void");
    }

    public static boolean A00(AnonymousClass36K r0, String str) {
        Boolean valueOf = Boolean.valueOf(r0.A0q(str));
        C162457s7.A0D(valueOf);
        return valueOf.booleanValue();
    }
}
