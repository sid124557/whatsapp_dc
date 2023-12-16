package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.9Zz  reason: invalid class name and case insensitive filesystem */
public class C195909Zz implements C184988ss {
    public final C111095hX A00;
    public final C69263Wi A01;
    public final C85244Fm A02;
    public final C56422rx A03;
    public final C620633i A04;
    public final C56612sH A05;
    public final C620733j A06;
    public final AnonymousClass36Y A07;
    public final AnonymousClass1VX A08;
    public final C1906899l A09;
    public final C153087ae A0A;
    public final AnonymousClass9U4 A0B;
    public final AnonymousClass9Th A0C;
    public final C160757oG A0D = C160757oG.A00("PaymentActivityLauncher", "infra", "COMMON");
    public final AnonymousClass4FS A0E;

    public Intent A00(Context context) {
        return A01(context, true, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4.A0B.A0B.A00.A08(X.C66663Mh.A0h) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A01(android.content.Context r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r2 = 1
            if (r7 != 0) goto L_0x0015
            if (r6 != 0) goto L_0x0014
            X.9U4 r0 = r4.A0B
            X.99n r0 = r0.A0B
            X.3Mh r1 = r0.A00
            X.1Ei r0 = X.C66663Mh.A0h
            boolean r0 = r1.A08(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 1
        L_0x0015:
            java.lang.String r3 = "extra_setup_mode"
            X.99l r1 = r4.A09
            boolean r0 = r1.A0B()
            if (r6 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x006d
            X.9U4 r1 = r4.A0B
            X.9oC r0 = r1.A0G()
            boolean r0 = r0.AyU()
            if (r0 != 0) goto L_0x006d
            X.9oC r0 = r1.A0G()
            java.lang.Class r0 = r0.B44()
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            r0 = 2
            r1.putExtra(r3, r0)
        L_0x0043:
            java.lang.String r0 = "extra_is_pay_money_only"
            r1.putExtra(r0, r6)
            return r1
        L_0x0049:
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x006d
            X.9U4 r1 = r4.A0B
            X.9oC r0 = r1.A0G()
            boolean r0 = r0.AyU()
            if (r0 != 0) goto L_0x006d
            X.9oC r0 = r1.A0G()
            java.lang.Class r0 = r0.B44()
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            r1.putExtra(r3, r2)
            goto L_0x0043
        L_0x006d:
            X.9U4 r0 = r4.A0B
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BCl()
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195909Zz.A01(android.content.Context, boolean, boolean):android.content.Intent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BkW(android.content.Context r11, android.net.Uri r12, X.C624134x r13) {
        /*
            r10 = this;
            r5 = r10
            if (r12 != 0) goto L_0x000b
            X.7oG r1 = r10.A0D
            java.lang.String r0 = "start-activity/uri-is-null"
            r1.A05(r0)
        L_0x000a:
            return
        L_0x000b:
            X.3QD r3 = X.AnonymousClass3QD.A00()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = r12.getLastPathSegment()
            java.lang.String r0 = "paymentHandle"
            X.7yt r3 = X.C1899693i.A0F(r3, r2, r1, r0)
            java.lang.String r1 = "wapay"
            java.lang.String r0 = r12.getScheme()
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00ae
            boolean r0 = X.C161527pr.A02(r3)
            if (r0 != 0) goto L_0x00ae
            if (r13 == 0) goto L_0x00ac
            X.2z0 r1 = r13.A1J
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00ac
            X.4uZ r0 = r1.A00
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass32Y.A03(r0)
        L_0x003c:
            r1 = 1
            android.content.Intent r2 = r10.A01(r11, r2, r1)
            java.lang.String r0 = "extra_payment_handle"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "verify-vpa-in-background"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "vpa_handle_chat"
            r2.putExtra(r1, r0)
            if (r4 == 0) goto L_0x00a9
            java.lang.String r1 = r4.getRawString()
        L_0x0058:
            java.lang.String r0 = "extra_chat_jid"
            r2.putExtra(r0, r1)
            X.5hX r0 = r10.A00
            r0.A0A(r11, r2)
            if (r13 == 0) goto L_0x000a
            X.2sH r0 = r10.A05
            long r8 = r0.A0H()
            java.lang.Object r7 = r3.A00
            java.lang.String r7 = (java.lang.String) r7
            X.2z0 r6 = r13.A1J
            X.2rx r1 = r10.A03
            X.4uZ r0 = r6.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            X.2qS r4 = r1.A00(r0)
            X.1VX r1 = r10.A08
            r0 = 4288(0x10c0, float:6.009E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x000a
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x000a
            if (r4 == 0) goto L_0x000a
            boolean r0 = r4.A02()
            if (r0 != 0) goto L_0x0098
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x000a
        L_0x0098:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x000a
            X.4FS r0 = r10.A0E
            X.9jx r3 = new X.9jx
            r3.<init>(r4, r5, r6, r7, r8)
            r0.BkM(r3)
            return
        L_0x00a9:
            java.lang.String r1 = ""
            goto L_0x0058
        L_0x00ac:
            r4 = 0
            goto L_0x003c
        L_0x00ae:
            java.lang.String r1 = "upi"
            java.lang.String r0 = r12.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c0
            X.4Fm r0 = r10.A02
            r0.BkW(r11, r12, r13)
            return
        L_0x00c0:
            X.36Y r1 = r10.A07
            r0 = 0
            int r1 = r1.A0B(r12, r0)
            r0 = 21
            if (r1 != r0) goto L_0x00ef
            X.9U4 r0 = r10.A0B
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BBD()
            if (r0 == 0) goto L_0x000a
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = r0.getName()
            r2.setClassName(r1, r0)
            r2.setData(r12)
            X.5hX r0 = r10.A00
            r0.A0A(r11, r2)
            return
        L_0x00ef:
            X.7oG r1 = r10.A0D
            java.lang.String r0 = "start-activity/uri-is-not-wapay-compatible"
            r1.A05(r0)
            X.3Wi r1 = r10.A01
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
            r1.A0H(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195909Zz.BkW(android.content.Context, android.net.Uri, X.34x):void");
    }

    public C88944b3 A02(Context context, C624134x r11, String str) {
        String str2 = str;
        Context context2 = context;
        if (str.startsWith("wapay") || str.startsWith("upi")) {
            return new C88944b3(context2, (C184988ss) this, this.A01, this.A04, r11, str2);
        }
        Uri parse = Uri.parse(str);
        if (parse == null || this.A07.A0B(parse, (Uri) null) != 21) {
            return null;
        }
        return new C88944b3(context2, this.A02, this.A01, this.A04, str);
    }

    public C195909Zz(C111095hX r4, C69263Wi r5, C85244Fm r6, C56422rx r7, C620633i r8, C56612sH r9, C620733j r10, AnonymousClass36Y r11, AnonymousClass1VX r12, C1906899l r13, C153087ae r14, AnonymousClass9U4 r15, AnonymousClass9Th r16, AnonymousClass4FS r17) {
        this.A05 = r9;
        this.A08 = r12;
        this.A01 = r5;
        this.A0E = r17;
        this.A02 = r6;
        this.A00 = r4;
        this.A06 = r10;
        this.A07 = r11;
        this.A04 = r8;
        this.A0B = r15;
        this.A09 = r13;
        this.A03 = r7;
        this.A0A = r14;
        this.A0C = r16;
    }

    public void BkX(Context context, Uri uri, C624134x r3, int i) {
    }

    public void BkY(Context context, Uri uri, C624134x r3, int i, int i2) {
    }
}
