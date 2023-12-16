package X;

import android.content.Intent;

/* renamed from: X.2i0  reason: invalid class name and case insensitive filesystem */
public final class C50332i0 {
    public final C64773Ex A00;
    public final C620633i A01;
    public final C54292oU A02;
    public final AnonymousClass33T A03;
    public final AnonymousClass1VX A04;
    public final C55042ph A05;
    public final C614030o A06;
    public final C183538qC A07;
    public final C183538qC A08;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        if (r8.A04.A0Y(X.C58422vE.A02, 4117) != false) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r20, X.C05610Ue r21, X.AnonymousClass3ZH r22, X.C624134x r23) {
        /*
            r19 = this;
            r4 = r20
            r12 = r23
            X.C18260x0.A0O(r4, r12)
            r8 = r19
            X.30o r2 = r8.A06
            X.2w3 r1 = X.C614030o.A00(r12)
            if (r1 == 0) goto L_0x005f
            boolean r0 = r2.A08(r1)
            r3 = r21
            r5 = r22
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "OTP: add OTP CopyCode notification action"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            A00(r2, r5, r12, r1, r0)
            r0 = 36
            android.app.PendingIntent r2 = X.C624735e.A03(r4, r2, r0)
            r1 = 2131231727(0x7f0803ef, float:1.8079543E38)
            r0 = 2131891288(0x7f121458, float:1.9417292E38)
            java.lang.String r0 = r4.getString(r0)
            r3.A04(r1, r0, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 0
            if (r2 < r1) goto L_0x0049
            r3.A0S = r0
        L_0x0049:
            X.2ph r11 = r8.A05
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r17 = 1
            r16 = r14
            r15 = r14
            r18 = r0
            r11.A02(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = "OTP: broadcast receiver intent registered for copy code"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x005f:
            return
        L_0x0060:
            boolean r0 = r2.A07(r1)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "OTP: add OTP Autofill notification action"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r17 = 1
            r6 = 0
            boolean r11 = X.C18280x3.A1U(r7, r0)
            android.content.Intent r2 = r2.A01(r4, r12)
            if (r11 == 0) goto L_0x0089
            X.1VX r9 = r8.A04
            r1 = 4117(0x1015, float:5.769E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            java.lang.String r0 = "OTP: activity intent registered for autofill"
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r9 = 45
            if (r1 == 0) goto L_0x00cb
            if (r2 == 0) goto L_0x00cb
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0097:
            android.app.PendingIntent r2 = X.C624735e.A00(r4, r9, r2, r10)
        L_0x009b:
            X.C162457s7.A0H(r2)
            X.2w3 r0 = X.C614030o.A00(r12)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "cta_display_name"
            java.lang.String r0 = r1.getQueryParameter(r0)
        L_0x00b0:
            r3.A04(r6, r0, r2)
            r0 = 29
            if (r7 < r0) goto L_0x00b9
            r3.A0S = r6
        L_0x00b9:
            X.2ph r11 = r8.A05
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r14 = 0
            r16 = r14
            r15 = r14
            r18 = r6
            r11.A02(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00c9:
            r0 = 0
            goto L_0x00b0
        L_0x00cb:
            if (r11 == 0) goto L_0x00de
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.OtpOneTapNotificationHandlerActivity"
            A00(r2, r5, r12, r1, r0)
            goto L_0x0097
        L_0x00de:
            java.lang.String r0 = "OTP: broadcast receiver intent registered for autofill"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver"
            A00(r2, r5, r12, r1, r0)
            android.app.PendingIntent r2 = X.C624735e.A01(r4, r9, r2, r10)
            goto L_0x009b
        L_0x00f5:
            boolean r0 = r2.A09(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "OTP: add otp mark as read notification action"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.OtpZeroTapMarkAsReadNotificationHandlerReceiver"
            A00(r2, r5, r12, r1, r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = 66
            android.app.PendingIntent r1 = X.C624735e.A01(r4, r0, r2, r1)
            r0 = 2131890611(0x7f1211b3, float:1.9415919E38)
            java.lang.String r0 = r4.getString(r0)
            r2 = 0
            r3.A04(r2, r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x005f
            r3.A0S = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50332i0.A01(android.content.Context, X.0Ue, X.3ZH, X.34x):void");
    }

    public C50332i0(C64773Ex r2, C620633i r3, C54292oU r4, AnonymousClass33T r5, AnonymousClass1VX r6, C55042ph r7, C614030o r8, C183538qC r9, C183538qC r10) {
        C18260x0.A0f(r6, r4, r2, r3, r7);
        C18260x0.A0W(r8, r5, r9);
        C162457s7.A0J(r10, 9);
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = r10;
    }

    public static void A00(Intent intent, AnonymousClass3ZH r3, C624134x r4, String str, String str2) {
        intent.setClassName(str, str2);
        intent.putExtra("extra_remote_jid", C627336j.A07(r3.A0H));
        intent.putExtra("extra_message_key_id", r4.A1J.A01);
    }
}
