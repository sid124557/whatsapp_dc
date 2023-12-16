package X;

/* renamed from: X.98g  reason: invalid class name */
public class AnonymousClass98g extends AnonymousClass3CG {
    public final C196139aM A00;

    public AnonymousClass98g(C196139aM r11) {
        super("wa.action.novi.EncryptLogEventV2", "bk.action.waffle.HasPaymentAccount", "bk.action.waffle.StartPaymentOnboarding", "bk.action.waffle.DeletePaymentAccount", "bk.action.waffle.EligibleToShowPaymentsRow", "bk.action.waffle.ShowPaymentSettings", "wa.action.CheckCpfCnpj", "wa.action.GetProcessedData", "wa.action.CheckCardNumber", "wa.action.CheckPinr");
        this.A00 = r11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a3, code lost:
        if (r4.equals("wa.action.CheckCardNumber") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
        r0 = X.AnonymousClass9WD.A01(X.C157967jD.A01(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b8, code lost:
        if (r4.equals("wa.action.CheckCpfCnpj") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r0 = X.AnonymousClass9WD.A00(X.C157967jD.A01(r1, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cd, code lost:
        if (r4.equals("wa.action.GetProcessedData") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
        r2 = r1.A00;
        r1 = X.AnonymousClass6C9.A0k(r2, 0);
        r3 = X.AnonymousClass001.A0n(r2, 1);
        r2 = X.C195899Zy.A01(r1);
        r1 = (java.lang.String) r2.remove("case");
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ef, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f7, code lost:
        if ("get_card_network".equals(r1) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fd, code lost:
        return X.AnonymousClass9Bw.A0b(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        if (r4.equals("bk.action.waffle.HasPaymentAccount") == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0108, code lost:
        r1 = r2.A00;
        com.whatsapp.util.Log.i("WaBkPaymentsInterpreterExtImpl/hasPaymentAccount");
        r0 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0111, code lost:
        if (r0 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0113, code lost:
        r1 = r0.A0G().BFO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0153, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0154, code lost:
        if (r1 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0156, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015b, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007e, code lost:
        r1.startActivityForResult(r2, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2m(X.C157967jD r19, X.C146787Bp r20, X.C151147Tp r21) {
        /*
            r18 = this;
            r11 = r21
            X.6dJ r11 = (X.C131266dJ) r11
            r0 = r20
            java.lang.String r4 = r0.A00
            int r0 = r4.hashCode()
            r3 = -1
            r2 = r18
            r1 = r19
            switch(r0) {
                case -1123270799: goto L_0x0082;
                case -854340780: goto L_0x0095;
                case 51260781: goto L_0x009d;
                case 268909162: goto L_0x00b2;
                case 764653078: goto L_0x00c7;
                case 1643238473: goto L_0x00fe;
                case 1711378359: goto L_0x011c;
                case 1819198730: goto L_0x0127;
                case 1970461926: goto L_0x0132;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = 0
            switch(r3) {
                case 1: goto L_0x0019;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00d1;
                case 5: goto L_0x0108;
                case 6: goto L_0x004e;
                case 7: goto L_0x015c;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r6
        L_0x0019:
            r3 = 0
            java.util.List r0 = r1.A00
            X.8DF r1 = X.C155787fV.A02(r0, r3)
            X.9aM r10 = r2.A00
            r0 = 3
            X.9po r9 = new X.9po
            r9.<init>(r1, r0)
            android.app.Activity r1 = X.AnonymousClass8DJ.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/showPaymentSettings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9U4 r0 = r10.A07
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BAq()
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r1, r0)
            r8 = r1
            X.4eZ r8 = (X.C89644eZ) r8
            r12 = 1
            X.9pl r7 = new X.9pl
            r7.<init>(r8, r9, r10, r11, r12)
            r8.A6w(r7)
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x007e
        L_0x004e:
            r12 = 0
            java.util.List r0 = r1.A00
            X.8DF r0 = X.C155787fV.A02(r0, r12)
            X.9aM r10 = r2.A00
            X.9po r9 = new X.9po
            r9.<init>(r0, r12)
            android.app.Activity r1 = X.AnonymousClass8DJ.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/startPaymentOnboarding"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9U4 r0 = r10.A07
            X.9oC r0 = r0.A0G()
            android.content.Intent r2 = r0.B45(r1)
            if (r2 == 0) goto L_0x0018
            r8 = r1
            X.4eZ r8 = (X.C89644eZ) r8
            X.9pl r7 = new X.9pl
            r7.<init>(r8, r9, r10, r11, r12)
            r8.A6w(r7)
            r0 = 1001(0x3e9, float:1.403E-42)
        L_0x007e:
            r1.startActivityForResult(r2, r0)
            return r6
        L_0x0082:
            java.lang.String r0 = "wa.action.CheckPinr"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            java.lang.String r0 = X.C157967jD.A01(r1, r0)
            boolean r0 = X.AnonymousClass9WD.A02(r0)
            goto L_0x0157
        L_0x0095:
            java.lang.String r0 = "bk.action.waffle.ShowPaymentSettings"
            short r3 = X.C1899693i.A0h(r0, r4)
            goto L_0x0014
        L_0x009d:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a7
            goto L_0x0014
        L_0x00a7:
            r0 = 0
            java.lang.String r0 = X.C157967jD.A01(r1, r0)
            boolean r0 = X.AnonymousClass9WD.A01(r0)
            goto L_0x0157
        L_0x00b2:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00bc
            goto L_0x0014
        L_0x00bc:
            r0 = 0
            java.lang.String r0 = X.C157967jD.A01(r1, r0)
            boolean r0 = X.AnonymousClass9WD.A00(r0)
            goto L_0x0157
        L_0x00c7:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d1
            goto L_0x0014
        L_0x00d1:
            r0 = 0
            java.util.List r2 = r1.A00
            java.util.Map r1 = X.AnonymousClass6C9.A0k(r2, r0)
            r0 = 1
            java.lang.String r3 = X.AnonymousClass001.A0n(r2, r0)
            java.util.HashMap r2 = X.C195899Zy.A01(r1)
            java.lang.String r0 = "case"
            java.lang.Object r1 = r2.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "get_card_network"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r6 = X.AnonymousClass9Bw.A0b(r3, r2)
            return r6
        L_0x00fe:
            java.lang.String r0 = "bk.action.waffle.HasPaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0108
            goto L_0x0014
        L_0x0108:
            X.9aM r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/hasPaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9U4 r0 = r1.A07
            if (r0 == 0) goto L_0x0156
            X.9oC r0 = r0.A0G()
            boolean r1 = r0.BFO()
            goto L_0x0153
        L_0x011c:
            java.lang.String r0 = "bk.action.waffle.StartPaymentOnboarding"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r3 = 6
            goto L_0x0014
        L_0x0127:
            java.lang.String r0 = "bk.action.waffle.DeletePaymentAccount"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            r3 = 7
            goto L_0x0014
        L_0x0132:
            java.lang.String r0 = "bk.action.waffle.EligibleToShowPaymentsRow"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0014
            X.9aM r1 = r2.A00
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/isEligibleToShowPaymentsRow"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.99n r0 = r1.A05
            if (r0 == 0) goto L_0x0156
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0156
            X.5Zy r1 = r1.A09
            java.lang.String r0 = "BR"
            boolean r1 = r1.A05(r0)
        L_0x0153:
            r0 = 1
            if (r1 != 0) goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x015c:
            r0 = 0
            java.util.List r3 = r1.A00
            X.8DF r1 = X.C155787fV.A02(r3, r0)
            r0 = 1
            X.8DF r5 = X.C155787fV.A02(r3, r0)
            X.9aM r4 = r2.A00
            X.9po r3 = new X.9po
            r3.<init>(r1, r0)
            r0 = 2
            X.9po r1 = new X.9po
            r1.<init>(r5, r0)
            android.app.Activity r8 = X.AnonymousClass8DJ.A01(r11)
            java.lang.String r0 = "WaBkPaymentsInterpreterExtImpl/deletePaymentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9bL r2 = new X.9bL
            r2.<init>(r1, r3, r4, r11)
            X.3Wi r9 = r4.A00
            X.4FS r1 = r4.A0A
            X.9Se r0 = r4.A08
            X.9U4 r15 = r4.A07
            X.3Lv r10 = r4.A01
            X.33l r12 = r4.A03
            X.9U5 r13 = r4.A04
            X.9dq r14 = r4.A06
            X.2Ha r11 = r4.A02
            X.9Sl r7 = new X.9Sl
            r16 = r0
            r17 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A00(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass98g.B2m(X.7jD, X.7Bp, X.7Tp):java.lang.Object");
    }
}
