package X;

/* renamed from: X.2cN  reason: invalid class name and case insensitive filesystem */
public final class C46892cN {
    public final C64773Ex A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final AnonymousClass33T A03;
    public final AnonymousClass36Y A04;
    public final C46222bH A05;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C833748d r20, int r21) {
        /*
            r19 = this;
            r14 = 1
            r17 = r20
            r13 = r17
            X.3YL r13 = (X.AnonymousClass3YL) r13
            X.2TD r12 = r13.A07
            if (r12 != 0) goto L_0x0011
            java.lang.String r0 = "PSANotificationComposer/null primary creative"
        L_0x000d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            r11 = r19
            X.2oU r0 = r11.A02
            android.content.Context r10 = r0.A00
            X.C162457s7.A0D(r10)
            X.6kJ r1 = X.C135216kJ.A00
            X.3Ex r0 = r11.A00
            X.3ZH r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "PushPSANotificationComposer/null server contact"
            goto L_0x000d
        L_0x0027:
            r0 = 0
            X.0Ue r9 = new X.0Ue
            r9.<init>(r10, r0)
            X.C18320x8.A0y(r10, r9)
            X.AnonymousClass0x7.A17(r9)
            r0 = 0
            r9.A03 = r0
            r9.A0E(r14)
            r9.A06 = r0
            java.lang.String r0 = "status"
            r9.A0J = r0
            java.lang.String r0 = r12.A06
            r9.A0B(r0)
            java.lang.String r0 = r12.A05
            r9.A0A(r0)
            java.lang.String r8 = r13.A0F
            int r7 = r13.A00
            android.content.Intent r6 = X.C18320x8.A07()
            java.lang.String r5 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity"
            r6.setClassName(r10, r5)
            java.lang.String r0 = r6.getAction()
            r6.setAction(r0)
            java.lang.String r4 = "is_dismiss_intent"
            r6.putExtra(r4, r14)
            java.lang.String r3 = "surface_id"
            r18 = r21
            r0 = r18
            r6.putExtra(r3, r0)
            java.lang.String r2 = "campaign_id"
            r6.putExtra(r2, r8)
            java.lang.String r1 = "eligibility_duration_after_impression_ms"
            r6.putExtra(r1, r7)
            java.lang.String r0 = "com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationAction"
            r6.setAction(r0)
            long r15 = java.lang.System.currentTimeMillis()
            int r0 = (int) r15
            android.app.PendingIntent r6 = X.C624735e.A04(r10, r6, r0)
            X.C162457s7.A0D(r6)
            android.app.Notification r0 = r9.A07
            r0.deleteIntent = r6
            X.2Ru r0 = r12.A01
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/no primary action"
        L_0x0092:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0095:
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r9, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00a5
            java.lang.String r0 = "failure_notifications@1"
            r9.A0K = r0
        L_0x00a5:
            X.2bH r5 = r11.A05
            X.1Xb r1 = new X.1Xb
            r1.<init>()
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00 = r0
            r1.A01 = r8
            X.4FV r0 = r5.A00
            r0.BhD(r1)
            X.4C6 r4 = r5.A03
            r3 = 0
            com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1 r2 = new com.whatsapp.waquickpromotionclient.psa.PushPsaNotificationLogger$logPushShow$1
            r1 = r17
            r0 = r18
            r2.<init>(r5, r1, r3, r0)
            r0 = 3
            X.C616131n.A02(r3, r2, r4, r3, r0)
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x00d1
            java.lang.String r8 = X.AnonymousClass000.A0T(r8, r0)
        L_0x00d1:
            X.33T r2 = r11.A03
            r1 = 71
            android.app.Notification r0 = r9.A01()
            r2.A0A(r8, r1, r0)
            return
        L_0x00dd:
            java.lang.String r12 = r0.A03
            if (r12 == 0) goto L_0x013d
            boolean r0 = X.C175738Zn.A0V(r12)
            if (r0 != 0) goto L_0x013d
            android.net.Uri r15 = android.net.Uri.parse(r12)
            if (r15 != 0) goto L_0x00f0
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/parsed uri is null"
            goto L_0x0092
        L_0x00f0:
            android.content.Intent r6 = X.C18320x8.A07()
            r6.setClassName(r10, r5)
            java.lang.String r0 = r6.getAction()
            r6.setAction(r0)
            X.36Y r5 = r11.A04
            r0 = 0
            int r0 = r5.A0B(r15, r0)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            if (r14 != r0) goto L_0x0135
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/external url:"
            X.C18260x0.A0q(r0, r12, r5)
            java.lang.String r0 = "universal_link"
        L_0x0113:
            r6.putExtra(r0, r12)
            r0 = 0
            r6.putExtra(r4, r0)
            r0 = r18
            r6.putExtra(r3, r0)
            r6.putExtra(r2, r8)
            r6.putExtra(r1, r7)
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = (int) r0
            android.app.PendingIntent r0 = X.C624735e.A04(r10, r6, r2)
            X.C162457s7.A0D(r0)
            r9.A09 = r0
            goto L_0x0095
        L_0x0135:
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/deep link url:"
            X.C18260x0.A0q(r0, r12, r5)
            java.lang.String r0 = "deep_link"
            goto L_0x0113
        L_0x013d:
            java.lang.String r0 = "PushPSANotificationComposer/handleCTA/No urls provided"
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46892cN.A00(X.48d, int):void");
    }

    public C46892cN(C64773Ex r2, C56612sH r3, C54292oU r4, AnonymousClass33T r5, AnonymousClass36Y r6, C46222bH r7) {
        C18260x0.A0f(r3, r4, r2, r6, r5);
        C162457s7.A0J(r7, 6);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
    }
}
