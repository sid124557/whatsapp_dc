package X;

/* renamed from: X.2a3  reason: invalid class name and case insensitive filesystem */
public class C45462a3 {
    public final /* synthetic */ AnonymousClass1gP A00;
    public final /* synthetic */ AnonymousClass3Y7 A01;
    public final /* synthetic */ String A02;

    public C45462a3(AnonymousClass1gP r1, AnonymousClass3Y7 r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C833748d r19) {
        /*
            r18 = this;
            r1 = r18
            r9 = r19
            if (r19 != 0) goto L_0x0023
            X.1gP r0 = r1.A00
            X.2bH r3 = r0.A0J
            java.lang.String r2 = r1.A02
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.1Xa r1 = new X.1Xa
            r1.<init>()
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00 = r0
            r1.A01 = r2
            X.4FV r0 = r3.A00
            r0.BhD(r1)
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "PSANotificationHandler/chooseQuickPromotion rendering push"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1gP r3 = r1.A00
            X.3Y7 r7 = r1.A01
            r8 = r9
            X.3YL r8 = (X.AnonymousClass3YL) r8
            X.2Iu r0 = r8.A06
            if (r0 == 0) goto L_0x033b
            java.util.Map r11 = r0.A00
            java.lang.String r0 = "wa_push_psa_promotion_type"
            java.lang.Object r2 = r11.get(r0)
            X.8qC r0 = r3.A0K
            java.util.Iterator r1 = X.AnonymousClass0x2.A0j(r0)
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r6 = r1.next()
            X.2rJ r6 = (X.C56032rJ) r6
            boolean r5 = r6 instanceof X.C32191pi
            if (r5 == 0) goto L_0x00c7
            java.lang.String r4 = "story_post_push_notification"
        L_0x0055:
            boolean r0 = X.C162457s7.A0P(r4, r2)
            if (r0 == 0) goto L_0x0042
            boolean r0 = X.C162457s7.A0P(r4, r2)
            if (r0 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x00bf
            r0 = r6
            X.1pi r0 = (X.C32191pi) r0
            X.1VX r2 = r0.A02
            r1 = 6168(0x1818, float:8.643E-42)
        L_0x006a:
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PSAPushNotification: Handling Notification/"
            X.C18260x0.A0q(r0, r4, r1)
            X.2lr r1 = r7.A00
            if (r1 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x00b6
            java.util.Map r0 = r1.A01
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isEmpty()
        L_0x0089:
            if (r0 != 0) goto L_0x0022
            android.content.Context r3 = r1.A02
            if (r5 == 0) goto L_0x0199
            r0 = 2131894628(0x7f122164, float:1.9424066E38)
            java.lang.String r4 = X.C18290x4.A0l(r3, r0)
            r12 = r6
            X.1pi r12 = (X.C32191pi) r12
            r10 = 0
            java.util.Map r0 = r1.A01
            if (r0 == 0) goto L_0x031b
            java.util.Collection r1 = r0.values()
            X.C162457s7.A0J(r1, r10)
            java.util.Iterator r2 = r1.iterator()
            r9 = 0
        L_0x00aa:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x020c
            int r1 = X.C18280x3.A05(r2)
            int r9 = r9 + r1
            goto L_0x00aa
        L_0x00b6:
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isEmpty()
            goto L_0x0089
        L_0x00bf:
            r0 = r6
            X.1ph r0 = (X.C32181ph) r0
            X.1VX r2 = r0.A02
            r1 = 6169(0x1819, float:8.645E-42)
            goto L_0x006a
        L_0x00c7:
            java.lang.String r4 = "recently_joined_contact_push_notification"
            goto L_0x0055
        L_0x00cb:
            java.lang.String r0 = "message_reminder_push_notification"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x033b
            X.1VX r2 = r3.A09
            r1 = 5544(0x15a8, float:7.769E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0022
            X.2Iz r0 = r8.A08
            X.2ve r0 = r0.A00
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "empty clauses in reply reminder notification"
        L_0x00f1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x00f5:
            java.util.Iterator r15 = r1.iterator()
            r8 = 0
            r6 = 0
            r4 = 0
            r0 = 0
        L_0x0101:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0156
            java.lang.Object r2 = r15.next()
            X.2ve r2 = (X.C58682ve) r2
            java.util.ArrayList r2 = r2.A02
            java.util.Iterator r14 = r2.iterator()
        L_0x0113:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0101
            java.lang.Object r10 = r14.next()
            X.2PJ r10 = (X.AnonymousClass2PJ) r10
            X.2It r2 = r10.A00
            java.lang.String r12 = r2.A00
            java.util.Map r10 = r10.A01
            java.lang.String r2 = "first"
            java.lang.String r13 = X.C18310x6.A0o(r2, r10)
            java.lang.String r2 = "second"
            java.lang.String r10 = X.C18310x6.A0o(r2, r10)
            if (r13 == 0) goto L_0x0113
            if (r10 == 0) goto L_0x0113
            java.lang.String r2 = "whatsapp_user_rendered_notification"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0144
            long r0 = java.lang.Long.parseLong(r13)
            goto L_0x0113
        L_0x0144:
            java.lang.String r2 = "whatsapp_user_unread_message"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0113
            long r6 = java.lang.Long.parseLong(r13)
            long r4 = java.lang.Long.parseLong(r10)
            goto L_0x0113
        L_0x0156:
            java.util.Objects.requireNonNull(r11)
            java.lang.String r2 = "wa_push_psa_remove_old_message_notifications"
            java.lang.String r2 = X.C18310x6.A0o(r2, r11)
            boolean r10 = java.lang.Boolean.parseBoolean(r2)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0195
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0195
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0195
            X.2oM r3 = r3.A0D
            X.2sH r2 = r3.A08
            long r12 = r2.A0H()
            X.33p r2 = r3.A0B
            android.content.SharedPreferences r11 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r2 = "last_notif_posted_timestamp"
            long r8 = r11.getLong(r2, r8)
            long r12 = r12 - r8
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = r2.toMillis(r0)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x032d
            java.lang.String r0 = "Notification posted recently, returning"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0195:
            java.lang.String r0 = "Invalid values passed in filters"
            goto L_0x00f1
        L_0x0199:
            r0 = 2131892869(0x7f121a85, float:1.9420498E38)
            java.lang.String r4 = X.C18290x4.A0l(r3, r0)
            r10 = r6
            X.1ph r10 = (X.C32181ph) r10
            r8 = 0
            java.util.List r13 = r1.A00
            if (r13 == 0) goto L_0x0207
            int r12 = r13.size()
            r9 = 1
            if (r12 == r9) goto L_0x01e4
            java.lang.String r11 = " contact does not exist"
            r7 = 2
            X.3Ex r1 = r10.A00
            java.lang.Object r0 = r13.get(r8)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r2 = r1.A07(r0)
            java.lang.Object r0 = r13.get(r9)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A07(r0)
            if (r12 == r7) goto L_0x01dc
            if (r2 == 0) goto L_0x01fd
            if (r1 == 0) goto L_0x01fd
            r11 = 2131892866(0x7f121a82, float:1.9420492E38)
        L_0x01d1:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            X.5ZU r0 = r10.A01
            X.C18300x5.A1E(r0, r2, r7, r8)
            X.C18300x5.A1E(r0, r1, r7, r9)
            goto L_0x0255
        L_0x01dc:
            if (r2 == 0) goto L_0x01fd
            if (r1 == 0) goto L_0x01fd
            r11 = 2131892868(0x7f121a84, float:1.9420496E38)
            goto L_0x01d1
        L_0x01e4:
            X.3Ex r1 = r10.A00
            java.lang.Object r0 = r13.get(r8)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A07(r0)
            if (r1 == 0) goto L_0x0207
            r11 = 2131892867(0x7f121a83, float:1.9420494E38)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            X.5ZU r0 = r10.A01
            X.C18300x5.A1E(r0, r1, r7, r8)
            goto L_0x0255
        L_0x01fd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "recently_joined_contact_push_notification"
            X.C18260x0.A0r(r0, r11, r1)
        L_0x0207:
            java.lang.String r9 = X.C18320x8.A0a(r3)
            goto L_0x0259
        L_0x020c:
            int r1 = r0.size()
            r8 = 2
            r2 = 1
            if (r1 == r2) goto L_0x02f0
            r14 = 3
            java.lang.String r11 = " contact does not exist"
            X.3Ex r7 = r12.A00
            java.util.Set r13 = r0.keySet()
            java.lang.Object r13 = X.C57272tN.A00(r13)
            X.4uZ r13 = (X.C95814uZ) r13
            X.3ZH r13 = r7.A07(r13)
            java.util.Set r0 = r0.keySet()
            if (r1 == r8) goto L_0x02dd
            r15 = 0
            X.C162457s7.A0J(r0, r10)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x02c3
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
        L_0x023b:
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r7.A07(r0)
            if (r13 == 0) goto L_0x0311
            if (r1 == 0) goto L_0x0311
            r11 = 2131894629(0x7f122165, float:1.9424068E38)
        L_0x0248:
            java.lang.Object[] r7 = new java.lang.Object[r14]
            X.AnonymousClass000.A1P(r7, r9, r10)
            X.5ZU r0 = r12.A01
            X.C18300x5.A1E(r0, r13, r7, r2)
            X.C18300x5.A1E(r0, r1, r7, r8)
        L_0x0255:
            java.lang.String r9 = r3.getString(r11, r7)
        L_0x0259:
            X.C162457s7.A0D(r9)
            X.0Ue r7 = X.C66553Lw.A00(r3)
            r2 = 1
            r7.A03 = r2
            r0 = 2131895665(0x7f122571, float:1.942617E38)
            java.lang.String r0 = X.C18290x4.A0l(r3, r0)
            r7.A0C(r0)
            X.2sH r8 = r6.A00
            long r0 = java.lang.System.currentTimeMillis()
            r7.A05(r0)
            r0 = 2
            r7.A02(r0)
            X.C18320x8.A17(r7, r4, r9, r2)
            X.C18270x1.A0r(r7, r9)
            android.content.Intent r1 = X.C18300x5.A07(r3)
            if (r5 == 0) goto L_0x02b9
            java.lang.String r0 = "com.whatsapp.intent.action.STATUSES"
            android.content.Intent r2 = r1.setAction(r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 6
        L_0x028f:
            android.app.PendingIntent r0 = X.C624735e.A00(r3, r0, r2, r1)
            X.C162457s7.A0D(r0)
            X.AnonymousClass33T.A01(r0, r7)
            X.33p r0 = r6.A02
            long r2 = r8.A0H()
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "inorganic_notification_last_timestamp"
            X.C18270x1.A0i(r1, r0, r2)
            X.33T r2 = r6.A01
            if (r5 == 0) goto L_0x02b6
            r1 = 81
        L_0x02ae:
            android.app.Notification r0 = r7.A01()
            r2.A0A(r4, r1, r0)
            return
        L_0x02b6:
            r1 = 82
            goto L_0x02ae
        L_0x02b9:
            java.lang.String r0 = "com.whatsapp.intent.action.CHATS"
            android.content.Intent r2 = r1.setAction(r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 2
            goto L_0x028f
        L_0x02c3:
            X.43Q r1 = new X.43Q
            r1.<init>()
            java.util.Iterator r17 = r0.iterator()
        L_0x02cc:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0321
            java.lang.Object r0 = r17.next()
            int r16 = r15 + 1
            if (r2 == r15) goto L_0x023b
            r15 = r16
            goto L_0x02cc
        L_0x02dd:
            java.lang.Object r0 = X.C73723fy.A02(r0)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r7.A07(r0)
            if (r13 == 0) goto L_0x0311
            if (r1 == 0) goto L_0x0311
            r11 = 2131894631(0x7f122167, float:1.9424072E38)
            goto L_0x0248
        L_0x02f0:
            X.3Ex r1 = r12.A00
            java.util.Set r0 = r0.keySet()
            java.lang.Object r0 = X.C57272tN.A00(r0)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A07(r0)
            if (r1 == 0) goto L_0x031b
            r11 = 2131894630(0x7f122166, float:1.942407E38)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            X.AnonymousClass000.A1P(r7, r9, r10)
            X.5ZU r0 = r12.A01
            X.C18300x5.A1E(r0, r1, r7, r2)
            goto L_0x0255
        L_0x0311:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "story_post_push_notification"
            X.C18260x0.A0r(r0, r11, r1)
        L_0x031b:
            java.lang.String r9 = X.C18320x8.A0a(r3)
            goto L_0x0259
        L_0x0321:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.invoke(r0)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x032d:
            r3.A01 = r6
            r3.A00 = r4
            X.4FS r2 = r3.A0J
            r0 = 8
            X.3bz r1 = new X.3bz
            r1.<init>(r0, r3, r10)
            goto L_0x0342
        L_0x033b:
            X.4FS r2 = r3.A0F
            X.3cY r1 = new X.3cY
            r1.<init>((X.AnonymousClass1gP) r3, (X.C833748d) r9)
        L_0x0342:
            r2.BkM(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45462a3.A00(X.48d):void");
    }
}
