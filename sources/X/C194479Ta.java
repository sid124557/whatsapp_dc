package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9Ta  reason: invalid class name and case insensitive filesystem */
public class C194479Ta {
    public final C54292oU A00;
    public final AnonymousClass33T A01;
    public final AnonymousClass8EA A02;
    public final AnonymousClass30K A03;
    public final C620933l A04;
    public final C1907099n A05;
    public final AnonymousClass9U4 A06;
    public final AnonymousClass1R1 A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[Catch:{ JSONException -> 0x0074 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[Catch:{ JSONException -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            X.99n r0 = r10.A05
            boolean r0 = X.C1899693i.A0x(r0)
            if (r0 == 0) goto L_0x00cb
            X.33l r6 = r10.A04
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_kyc_info"
            r3 = 0
            java.lang.String r1 = r1.getString(r0, r3)
            if (r1 == 0) goto L_0x0072
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x0079
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "state"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "rejection-code"
            r9 = -1
            int r8 = r1.optInt(r0, r9)     // Catch:{ JSONException -> 0x0074 }
            java.lang.String r0 = "actions-requested"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0074 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "obligation"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r0 = "actions"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x005d }
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()     // Catch:{ JSONException -> 0x005d }
            r1 = 0
        L_0x0047:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x005d }
            if (r1 >= r0) goto L_0x0057
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x005d }
            r2.add(r0)     // Catch:{ JSONException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0057:
            X.9Xd r1 = new X.9Xd     // Catch:{ JSONException -> 0x005d }
            r1.<init>(r5, r2)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0063
        L_0x005d:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0074 }
        L_0x0062:
            r1 = 0
        L_0x0063:
            if (r8 == r9) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r0 = r3
            goto L_0x006c
        L_0x0068:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0074 }
        L_0x006c:
            X.9Xi r4 = new X.9Xi     // Catch:{ JSONException -> 0x0074 }
            r4.<init>(r1, r0, r7)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x007a
        L_0x0072:
            r4 = r3
            goto L_0x007a
        L_0x0074:
            java.lang.String r0 = "PAY: PaymentKycInfo fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0079:
            r4 = r3
        L_0x007a:
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r1 = "payment_kyc_update_ack"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r4 == 0) goto L_0x00c2
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "PENDING"
            java.lang.String r1 = r4.A02
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ab
            X.2oU r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891308(0x7f12146c, float:1.9417332E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131891307(0x7f12146b, float:1.941733E38)
        L_0x00a1:
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "KYC"
            r10.A03(r2, r1, r0, r3)
            return
        L_0x00ab:
            java.lang.String r0 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cb
            X.2oU r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131891305(0x7f121469, float:1.9417326E38)
            goto L_0x00a1
        L_0x00c2:
            X.33T r2 = r10.A01
            r1 = 26
            java.lang.String r0 = "PAYMENTS_KYC_UPDATE"
            r2.A05(r1, r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194479Ta.A00():void");
    }

    public void A01(String str) {
        this.A08.BkM(new C199949hX(this, str));
    }

    public final void A02(String str) {
        if (C1899693i.A0x(this.A05)) {
            ArrayList A0s = AnonymousClass001.A0s();
            AnonymousClass30K r0 = this.A03;
            if (str != null) {
                AnonymousClass3ZO A012 = r0.A01(str);
                if (A012 != null) {
                    A0s.add(A012);
                } else {
                    this.A01.A06(28, str, "PAYMENTS_STEP_UP_UPDATE");
                }
            } else {
                A0s.addAll(r0.A02());
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass3ZO r6 = (AnonymousClass3ZO) it.next();
                C165897xo r3 = r6.A03;
                boolean z = this.A04.A03().getBoolean("payment_step_up_update_ack", true);
                if (r3 == null || z) {
                    this.A01.A06(28, str, "PAYMENTS_STEP_UP_UPDATE");
                    return;
                }
                A03(r6.A08, r6.A05, "STEP_UP", r6.A06);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        r2 = X.AnonymousClass0x9.A08(r5, r0);
        r2.addFlags(335544320);
        r2.putExtra("notification-type", "ALIAS_DEREGISTER");
        r1 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0078, code lost:
        if (r1.A06() == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0080, code lost:
        if (r1.A06().A08 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        r2.putExtra("extra_payment_name", r1.A06().A08.A08());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0091, code lost:
        r4.A09 = X.C624735e.A00(r5, 0, r2, 134217728);
        r14.A01.A04(47, r4.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        r0 = r14.A06.A0G().BBA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        r1 = X.AnonymousClass0x9.A08(r5, r0);
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "STEP_UP");
        r7 = r18;
        r1.putExtra("step-up-id", r7);
        r4.A09 = X.C624735e.A00(r5, 0, r1, 134217728);
        r14.A01.A0A(r7, 28, r4.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r0 = r14.A06.A0G().BBA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dc, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00de, code lost:
        r0 = X.AnonymousClass0x9.A08(r5, r0);
        r0.addFlags(335544320);
        r0.putExtra("notification-type", "DOC_VERIF_SUCCESS");
        r0 = X.C624735e.A00(r5, 0, r0, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010b, code lost:
        if (r0 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010f, code lost:
        r0 = X.AnonymousClass0x9.A08(r5, r14.A06.A0G().BBA());
        r0.addFlags(335544320);
        r4.A09 = X.C624735e.A00(r5, 0, r0, 0);
        r14.A01.A04(26, r4.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0130, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW");
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "DOC_VERIF_FAILURE");
        r1.setData(android.net.Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"));
        r0 = X.C624735e.A00(r5, 0, r1, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014a, code lost:
        r4.A09 = r0;
        r14.A01.A04(37, r4.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        switch(r13) {
            case 0: goto L_0x005c;
            case 1: goto L_0x00a3;
            case 2: goto L_0x00d2;
            case 3: goto L_0x0130;
            case 4: goto L_0x010f;
            default: goto L_0x005b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005c, code lost:
        r0 = r14.A06.A0G().BB5();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (r0 == null) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r14 = this;
            X.2oU r0 = r14.A00
            android.content.Context r5 = r0.A00
            X.0Ue r4 = X.C66553Lw.A01(r5)
            java.lang.String r0 = "status"
            r4.A0J = r0
            r13 = 1
            r4.A03 = r13
            r4.A0E(r13)
            r0 = 4
            r4.A02(r0)
            r3 = 0
            r4.A06 = r3
            r0 = 2131233341(0x7f080a3d, float:1.8082817E38)
            X.AnonymousClass33T.A02(r4, r0)
            r4.A0B(r15)
            r0 = r16
            r4.A0A(r0)
            X.C18270x1.A0r(r4, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r0 < r12) goto L_0x003e
            X.1R1 r0 = r14.A07
            X.2sa r0 = r0.A0I()
            X.1qy r0 = (X.C32501qy) r0
            java.lang.String r0 = r0.A0C()
            r4.A0K = r0
        L_0x003e:
            r2 = r17
            int r0 = r2.hashCode()
            java.lang.String r11 = "DOC_VERIF_FAILURE"
            java.lang.String r10 = "DOC_VERIF_SUCCESS"
            java.lang.String r9 = "STEP_UP"
            java.lang.String r1 = "ALIAS_DEREGISTER"
            switch(r0) {
                case -1986195565: goto L_0x00ed;
                case -1175556882: goto L_0x00f3;
                case -1094966371: goto L_0x00f8;
                case -314370780: goto L_0x00fe;
                case 74901: goto L_0x0104;
                default: goto L_0x004f;
            }
        L_0x004f:
            r13 = -1
        L_0x0050:
            r2 = 37
            r6 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r8 = "notification-type"
            r7 = 335544320(0x14000000, float:6.4623485E-27)
            switch(r13) {
                case 0: goto L_0x005c;
                case 1: goto L_0x00a3;
                case 2: goto L_0x00d2;
                case 3: goto L_0x0130;
                case 4: goto L_0x010f;
                default: goto L_0x005b;
            }
        L_0x005b:
            return
        L_0x005c:
            X.9U4 r0 = r14.A06
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BB5()
            if (r0 == 0) goto L_0x005b
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r5, r0)
            r2.addFlags(r7)
            r2.putExtra(r8, r1)
            X.8EA r1 = r14.A02
            X.7yw r0 = r1.A06()
            if (r0 == 0) goto L_0x0091
            X.7yw r0 = r1.A06()
            X.6hx r0 = r0.A08
            if (r0 == 0) goto L_0x0091
            X.7yw r0 = r1.A06()
            X.6hx r0 = r0.A08
            X.7yt r1 = r0.A08()
            java.lang.String r0 = "extra_payment_name"
            r2.putExtra(r0, r1)
        L_0x0091:
            android.app.PendingIntent r0 = X.C624735e.A00(r5, r3, r2, r6)
            r4.A09 = r0
            android.app.Notification r2 = r4.A01()
            X.33T r1 = r14.A01
            r0 = 47
            r1.A04(r0, r2)
            return
        L_0x00a3:
            X.9U4 r0 = r14.A06
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBA()
            if (r0 == 0) goto L_0x005b
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            r1.addFlags(r7)
            r1.putExtra(r8, r9)
            java.lang.String r0 = "step-up-id"
            r7 = r18
            r1.putExtra(r0, r7)
            android.app.PendingIntent r0 = X.C624735e.A00(r5, r3, r1, r6)
            r4.A09 = r0
            android.app.Notification r2 = r4.A01()
            X.33T r1 = r14.A01
            r0 = 28
            r1.A0A(r7, r0, r2)
            return
        L_0x00d2:
            X.9U4 r0 = r14.A06
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBA()
            if (r0 == 0) goto L_0x005b
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r5, r0)
            r0.addFlags(r7)
            r0.putExtra(r8, r10)
            android.app.PendingIntent r0 = X.C624735e.A00(r5, r3, r0, r6)
            goto L_0x014a
        L_0x00ed:
            boolean r0 = r2.equals(r1)
            r13 = 0
            goto L_0x010b
        L_0x00f3:
            boolean r0 = r2.equals(r9)
            goto L_0x010b
        L_0x00f8:
            boolean r0 = r2.equals(r10)
            r13 = 2
            goto L_0x010b
        L_0x00fe:
            boolean r0 = r2.equals(r11)
            r13 = 3
            goto L_0x010b
        L_0x0104:
            java.lang.String r0 = "KYC"
            boolean r0 = r2.equals(r0)
            r13 = 4
        L_0x010b:
            if (r0 != 0) goto L_0x0050
            goto L_0x004f
        L_0x010f:
            X.9U4 r0 = r14.A06
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBA()
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r5, r0)
            r0.addFlags(r7)
            android.app.PendingIntent r0 = X.C624735e.A00(r5, r3, r0, r3)
            r4.A09 = r0
            android.app.Notification r1 = r4.A01()
            X.33T r0 = r14.A01
            r0.A04(r12, r1)
            return
        L_0x0130:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.addFlags(r7)
            r1.putExtra(r8, r11)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.PendingIntent r0 = X.C624735e.A00(r5, r3, r1, r6)
        L_0x014a:
            r4.A09 = r0
            android.app.Notification r1 = r4.A01()
            X.33T r0 = r14.A01
            r0.A04(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194479Ta.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C194479Ta(C54292oU r1, AnonymousClass33T r2, AnonymousClass8EA r3, AnonymousClass30K r4, C620933l r5, C1907099n r6, AnonymousClass9U4 r7, AnonymousClass1R1 r8, AnonymousClass4FS r9) {
        this.A00 = r1;
        this.A08 = r9;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }
}
