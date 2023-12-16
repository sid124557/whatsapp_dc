package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9AW  reason: invalid class name */
public class AnonymousClass9AW extends C1908099x {
    public final /* synthetic */ C166557yt A00;
    public final /* synthetic */ C202499m7 A01;
    public final /* synthetic */ AnonymousClass9AI A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AW(Context context, C69263Wi r8, C166557yt r9, C202499m7 r10, C40602Ha r11, C153607bd r12, AnonymousClass9AI r13, Integer num, boolean z) {
        super(context, r8, r11, r12, "upi-get-vpa-name");
        this.A02 = r13;
        this.A01 = r10;
        this.A04 = z;
        this.A03 = num;
        this.A00 = r9;
    }

    public void A03(AnonymousClass34V r15) {
        this.A02.A07.A05(r15, this.A03, "upi-get-vpa-name");
        this.A01.BaS((UserJid) null, (C166557yt) null, (C166557yt) null, (C166557yt) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    public void A04(AnonymousClass34V r15) {
        this.A02.A07.A05(r15, this.A03, "upi-get-vpa-name");
        this.A01.BaS((UserJid) null, (C166557yt) null, (C166557yt) null, (C166557yt) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (X.C1899693i.A0y(r1.getString("blocked")) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (X.C1899693i.A0y(r1.getString("vpaValid")) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (X.C1899693i.A0y(r1.getString("verifiedMerchant")) == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (X.C1899693i.A0y(r1.getString("blocked")) == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        if (X.C1899693i.A0y(r1.getString("merchant")) == false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r21) {
        /*
            r20 = this;
            X.36K r2 = X.C1899693i.A0T(r21)
            r3 = r20
            if (r2 == 0) goto L_0x0106
            X.99E r4 = new X.99E
            r4.<init>()
            X.9AI r6 = r3.A02
            X.32a r1 = r6.A02
            r0 = 7
            r4.A04(r1, r2, r0)
            X.3QD r2 = X.AnonymousClass3QD.A00()
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x0103
            java.lang.String r0 = "vpa"
            java.lang.String r1 = r1.getString(r0)
        L_0x0023:
            java.lang.String r0 = "upiHandle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            X.7yt r9 = X.C1899693i.A0F(r2, r5, r1, r0)
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0052
            X.9Tt r2 = r6.A04
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = "blocked"
            java.lang.String r0 = r1.getString(r0)
            boolean r1 = X.C1899693i.A0y(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r2.A03(r9, r0)
        L_0x0052:
            X.9B3 r2 = r6.A07
            java.lang.Integer r1 = r3.A03
            java.lang.String r0 = "upi-get-vpa-name"
            r2.A07(r1, r0)
            X.9m7 r6 = r3.A01
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "vpaValid"
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = X.C1899693i.A0y(r0)
            r15 = 1
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r15 = 0
        L_0x006f:
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "verifiedMerchant"
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = X.C1899693i.A0y(r0)
            r16 = 1
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r16 = 0
        L_0x0083:
            X.3QD r2 = X.AnonymousClass3QD.A00()
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "vpaName"
            java.lang.String r1 = r1.getString(r0)
        L_0x0091:
            java.lang.String r0 = "accountHolderName"
            X.7yt r8 = X.C1899693i.A0F(r2, r5, r1, r0)
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00fc
            java.lang.String r0 = "vpaId"
            java.lang.String r12 = r1.getString(r0)
        L_0x00a1:
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00fa
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
        L_0x00ab:
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A08(r0)
            X.7yt r10 = r3.A00
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = "blocked"
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = X.C1899693i.A0y(r0)
            r17 = 1
            if (r0 != 0) goto L_0x00c5
        L_0x00c3:
            r17 = 0
        L_0x00c5:
            boolean r2 = r3.A04
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "merchant"
            java.lang.String r0 = r1.getString(r0)
            boolean r0 = X.C1899693i.A0y(r0)
            r19 = 1
            if (r0 != 0) goto L_0x00db
        L_0x00d9:
            r19 = 0
        L_0x00db:
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00f8
            java.lang.String r0 = "token"
            java.lang.String r13 = r1.getString(r0)
        L_0x00e5:
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x00f6
            java.lang.String r0 = "mcc"
            java.lang.String r14 = r1.getString(r0)
        L_0x00ef:
            r11 = 0
            r18 = r2
            r6.BaS(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00f6:
            r14 = 0
            goto L_0x00ef
        L_0x00f8:
            r13 = 0
            goto L_0x00e5
        L_0x00fa:
            r0 = 0
            goto L_0x00ab
        L_0x00fc:
            r12 = 0
            goto L_0x00a1
        L_0x00fe:
            r1 = 0
            goto L_0x0091
        L_0x0100:
            r0 = 0
            goto L_0x0035
        L_0x0103:
            r1 = 0
            goto L_0x0023
        L_0x0106:
            java.lang.String r0 = "PAY: IndiaUpiPayNonWaVpaAction verifyPaymentVpa: missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
            X.9AI r0 = r3.A02
            X.9B3 r2 = r0.A07
            java.lang.Integer r1 = r3.A03
            java.lang.String r0 = "upi-get-vpa-name"
            r2.A05(r5, r1, r0)
            X.9m7 r4 = r3.A01
            r13 = 0
            boolean r0 = r3.A04
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r15 = r13
            r17 = r13
            r6 = r5
            r14 = r13
            r16 = r0
            r4.BaS(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AW.A05(X.36K):void");
    }
}
