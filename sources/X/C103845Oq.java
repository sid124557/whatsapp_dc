package X;

/* renamed from: X.5Oq  reason: invalid class name and case insensitive filesystem */
public final class C103845Oq {
    public C992955e A00;
    public final C106175Xx A01;
    public final C56972sr A02;
    public final C29441ip A03;
    public final C64773Ex A04;
    public final C66413Li A05;
    public final AnonymousClass1VX A06;
    public final AnonymousClass31C A07;
    public final AnonymousClass4FS A08;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r3 != null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C185688u5 r11, java.lang.String r12) {
        /*
            r10 = this;
            r4 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0018
            java.lang.String r0 = "[\\s()+.#-]"
            X.5rB r1 = new X.5rB
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = ""
            java.lang.String r9 = r1.A00(r12, r0)
            boolean r0 = android.text.TextUtils.isDigitsOnly(r9)
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            X.2sr r0 = r10.A02
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x0100
            X.4uZ r0 = r0.A0H
            if (r0 == 0) goto L_0x0100
            java.lang.String r1 = X.AnonymousClass36P.A05(r0)
            if (r1 == 0) goto L_0x0017
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0017
            java.lang.String r3 = X.C621333r.A02(r1)
            if (r3 == 0) goto L_0x003c
            int r0 = r3.length()
            if (r0 != 0) goto L_0x008c
        L_0x003c:
            if (r12 == 0) goto L_0x005d
            int r0 = r12.length()
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "\\D"
            X.5rB r1 = new X.5rB
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = ""
            java.lang.String r2 = r1.A00(r12, r0)
            int r1 = r2.length()
            r0 = 5
            if (r1 >= r0) goto L_0x0067
            java.lang.String r0 = "contactpicker/isvalidnumber/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x005d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "contactpicker/fetchContactUsingPhoneNumber/invalidnumber "
            X.C18260x0.A0s(r0, r12, r1)
            return
        L_0x0067:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x005d
            java.lang.String r5 = r1.group(r4)
            java.lang.String r1 = X.C18320x8.A0f(r5, r2)
            X.C162457s7.A0D(r1)
            X.5Xx r0 = r10.A01
            int r0 = X.C107195ar.A01(r0, r5, r1)
            if (r0 != r4) goto L_0x005d
            if (r3 == 0) goto L_0x0100
        L_0x008c:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0100
            int r8 = java.lang.Integer.parseInt(r3)
            X.7rN r5 = X.C162167rN.A00()
            java.lang.String r3 = "phonenumberutil/isValidNumber"
            java.lang.String r7 = "+"
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "\\D"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.replaceAll(r0, r2)
            java.lang.String r0 = "^0+(?!$)"
            java.lang.String r6 = r1.replaceFirst(r0, r2)
            int r1 = r6.length()
            r0 = 5
            if (r1 >= r0) goto L_0x00bf
            java.lang.String r0 = "phonenumberutil/formatEnteredNumber/too-short-number"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00bf:
            boolean r0 = r6.startsWith(r7)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            java.lang.String r2 = "ZZ"
            if (r0 == 0) goto L_0x00cc
            X.8LC r1 = r5.A0F(r6, r2)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            goto L_0x00f4
        L_0x00cc:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            X.C18270x1.A19(r7, r6, r0, r8)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            java.lang.String r1 = r0.toString()     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            java.lang.String r0 = r5.A0G(r8)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            X.8LC r1 = r5.A0F(r1, r0)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            boolean r0 = r5.A0M(r1)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            if (r0 == 0) goto L_0x00ec
            X.6uu r0 = X.C141026uu.E164     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            java.lang.String r9 = r5.A0H(r0, r1)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            goto L_0x0100
        L_0x00ec:
            java.lang.String r0 = X.AnonymousClass000.A0T(r7, r6)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            X.8LC r1 = r5.A0F(r0, r2)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
        L_0x00f4:
            boolean r0 = r5.A0M(r1)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            if (r0 == 0) goto L_0x0017
            X.6uu r0 = X.C141026uu.E164     // Catch:{ 6zC | RuntimeException -> 0x0128 }
            java.lang.String r9 = r5.A0H(r0, r1)     // Catch:{ 6zC | RuntimeException -> 0x0128 }
        L_0x0100:
            r2 = 0
            if (r9 == 0) goto L_0x0017
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0017
            X.55e r0 = r10.A00
            if (r0 == 0) goto L_0x0110
            r0.A0D(r4)
        L_0x0110:
            X.31C r8 = r10.A07
            X.3Li r7 = r10.A05
            X.3Ex r5 = r10.A04
            X.1ip r4 = r10.A03
            X.55e r3 = new X.55e
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.4FS r1 = r10.A08
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r1.BkO(r3, r0)
            r10.A00 = r3
            return
        L_0x0128:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103845Oq.A00(X.8u5, java.lang.String):void");
    }

    public C103845Oq(C106175Xx r1, C56972sr r2, C29441ip r3, C64773Ex r4, C66413Li r5, AnonymousClass1VX r6, AnonymousClass31C r7, AnonymousClass4FS r8) {
        C18260x0.A0f(r6, r2, r8, r7, r4);
        C18260x0.A0W(r1, r5, r3);
        this.A06 = r6;
        this.A02 = r2;
        this.A08 = r8;
        this.A07 = r7;
        this.A04 = r4;
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
    }
}
