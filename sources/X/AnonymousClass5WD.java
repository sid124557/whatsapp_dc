package X;

/* renamed from: X.5WD  reason: invalid class name */
public class AnonymousClass5WD {
    public final AnonymousClass7LM A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r7 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass5WD A00(android.content.Context r10, X.C114635nM r11, X.C106685Zz r12, X.C624134x r13, int r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof X.C30441mS
            java.lang.String r7 = ""
            r1 = 0
            if (r0 == 0) goto L_0x0073
            X.2z0 r3 = r13.A1J
            X.4uZ r0 = r3.A00
            boolean r2 = r0 instanceof X.C95804uY
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x006a
            r0 = 2131893220(0x7f121be4, float:1.942121E38)
            if (r2 == 0) goto L_0x0019
            r0 = 2131893221(0x7f121be5, float:1.9421212E38)
        L_0x0019:
            java.lang.String r9 = r10.getString(r0)
            r5 = r1
            r8 = r1
            r4 = r1
            r3 = r1
        L_0x0021:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0034
            r7 = r1
        L_0x0034:
            boolean r0 = android.text.TextUtils.equals(r4, r5)
            r10 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0054
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0054
        L_0x0047:
            byte r0 = r13.A1I
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.C627636p.A0l(r13)
            if (r0 != 0) goto L_0x0068
        L_0x0051:
            r8 = r5
            r3 = r5
            r9 = r1
        L_0x0054:
            com.whatsapp.jid.UserJid r0 = r13.A0o()
            java.util.Set r2 = r11.BBH(r0, r13, r5)
            if (r2 == 0) goto L_0x0060
            r9 = r1
            r10 = 0
        L_0x0060:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x010e
            goto L_0x0105
        L_0x0068:
            r10 = 0
            goto L_0x0051
        L_0x006a:
            r0 = 2131893218(0x7f121be2, float:1.9421206E38)
            if (r2 == 0) goto L_0x0019
            r0 = 2131893219(0x7f121be3, float:1.9421208E38)
            goto L_0x0019
        L_0x0073:
            boolean r3 = r13 instanceof X.AnonymousClass4DV
            if (r3 != 0) goto L_0x00e3
            boolean r0 = X.AnonymousClass353.A04(r13)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = r13 instanceof X.C30481mW
            if (r0 == 0) goto L_0x00c5
            r5 = r13
            X.1mW r5 = (X.C30481mW) r5
            java.lang.String r8 = r5.A06
            java.lang.String r7 = r5.A13()
            java.lang.String r4 = r12.A03(r7)
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c2
            r3 = r4
        L_0x0097:
            boolean r0 = X.AnonymousClass5VE.A01(r3)
            if (r0 == 0) goto L_0x00bf
            int r0 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A04
            java.lang.String r9 = X.AnonymousClass5VR.A00(r10, r2, r0, r15)
        L_0x00a9:
            java.util.ArrayList r2 = r12.A04(r7)
            if (r2 == 0) goto L_0x00bd
            int r0 = r2.size()
            if (r0 <= r14) goto L_0x00bd
            java.lang.String r5 = X.C86664Kz.A1M(r2, r14)
        L_0x00b9:
            if (r7 == 0) goto L_0x0034
            goto L_0x0021
        L_0x00bd:
            r5 = r4
            goto L_0x00b9
        L_0x00bf:
            java.lang.String r9 = r5.A04
            goto L_0x00a9
        L_0x00c2:
            java.lang.String r3 = r5.A07
            goto L_0x0097
        L_0x00c5:
            boolean r0 = r13 instanceof X.C30471mV
            if (r0 == 0) goto L_0x00de
            r0 = r13
            X.1mV r0 = (X.C30471mV) r0
            java.lang.String r8 = r0.A1w()
            java.lang.String r9 = r0.A1x()
            java.lang.String r7 = r0.A1w()
            java.lang.String r4 = r12.A03(r7)
            r3 = r4
            goto L_0x00a9
        L_0x00de:
            r9 = r1
            r8 = r1
            r4 = r1
            r3 = r1
            goto L_0x00a9
        L_0x00e3:
            r2 = 0
            if (r3 == 0) goto L_0x00fa
            r0 = r13
            X.4DV r0 = (X.AnonymousClass4DV) r0
            X.39W r0 = r0.B5s()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r2 = r0.A08
        L_0x00f1:
            java.lang.String r9 = r12.A03(r2)
            r8 = r9
            r4 = r9
            r3 = r9
            r7 = r1
            goto L_0x00a9
        L_0x00fa:
            boolean r0 = X.AnonymousClass353.A04(r13)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r2 = X.AnonymousClass353.A01(r13)
            goto L_0x00f1
        L_0x0105:
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010e }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x010e }
            java.lang.String r1 = r0.getHost()     // Catch:{ MalformedURLException -> 0x010e }
        L_0x010e:
            X.7LM r6 = new X.7LM
            r6.<init>(r5, r1, r2)
            X.5WD r5 = new X.5WD
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5WD.A00(android.content.Context, X.5nM, X.5Zz, X.34x, int, boolean):X.5WD");
    }

    public AnonymousClass5WD(AnonymousClass7LM r2, String str, String str2, String str3, boolean z) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = Boolean.valueOf(z);
        this.A00 = r2;
    }
}
