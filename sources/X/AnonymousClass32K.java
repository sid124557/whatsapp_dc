package X;

/* renamed from: X.32K  reason: invalid class name */
public final class AnonymousClass32K {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1 != 22) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r4 == 4) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r10.A0Y(X.C58422vE.A02, 3522) != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e6, code lost:
        if (r1 != 22) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f1, code lost:
        if (r9 == 4) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fb, code lost:
        if (r10.A0Y(X.C58422vE.A02, 3522) != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fe, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ff, code lost:
        if (r2 != 1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0101, code lost:
        if (r3 != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010b, code lost:
        if (r10.A0Y(X.C58422vE.A02, 2060) == false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass32K A00(X.AnonymousClass1VX r10, X.C106685Zz r11, X.C624134x r12) {
        /*
            r5 = 0
            X.C18270x1.A14(r10, r11)
            r2 = 2
            r4 = r12
            X.C162457s7.A0J(r12, r2)
            X.2U8 r1 = r12.A0c
            if (r1 == 0) goto L_0x0099
            int r0 = r1.A01
            if (r0 != r2) goto L_0x0046
            java.lang.String r3 = r1.A04
            r0 = r3
            if (r3 != 0) goto L_0x0018
            java.lang.String r0 = ""
        L_0x0018:
            X.C162457s7.A0D(r0)
            int r4 = X.AnonymousClass35G.A01(r11, r0)
            java.lang.String r2 = r1.A08
            if (r4 == 0) goto L_0x0030
            r0 = 4
            if (r4 != r0) goto L_0x0037
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x0030
            r0 = 22
            if (r1 != r0) goto L_0x0039
        L_0x0030:
            r6 = 0
        L_0x0031:
            X.32K r1 = new X.32K
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L_0x0037:
            if (r4 != r0) goto L_0x0044
        L_0x0039:
            r1 = 3522(0xdc2, float:4.935E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0044
            goto L_0x0030
        L_0x0044:
            r6 = 1
            goto L_0x0031
        L_0x0046:
            java.lang.String r7 = r1.A08
            java.lang.String r8 = r1.A09
            r10 = 0
            if (r7 == 0) goto L_0x0072
            java.lang.String r0 = X.C106685Zz.A01(r7)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String[] r2 = X.C58172up.A0Y
            X.C162457s7.A0F(r2)
            if (r3 == 0) goto L_0x007b
            java.lang.String r1 = r3.getHost()
            if (r1 == 0) goto L_0x007b
            java.util.Locale r0 = java.util.Locale.ROOT
            X.C162457s7.A0F(r0)
            java.lang.String r0 = X.C18320x8.A0g(r0, r1)
            int r0 = X.C73703fw.A00(r0, r2)
            if (r0 < 0) goto L_0x007b
            r10 = 1
        L_0x0072:
            X.32K r1 = new X.32K
            r6 = r1
            r9 = r5
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x007b:
            java.lang.String[] r2 = X.C58172up.A0Z
            X.C162457s7.A0F(r2)
            if (r3 == 0) goto L_0x0072
            java.lang.String r1 = r3.getHost()
            if (r1 == 0) goto L_0x0072
            java.util.Locale r0 = java.util.Locale.ROOT
            X.C162457s7.A0F(r0)
            java.lang.String r0 = X.C18320x8.A0g(r0, r1)
            int r0 = X.C73703fw.A00(r0, r2)
            if (r0 < 0) goto L_0x0072
            r10 = 2
            goto L_0x0072
        L_0x0099:
            boolean r0 = r12 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0113
            r2 = r4
            X.1mW r2 = (X.C30481mW) r2
            java.lang.String r0 = r2.A06
            java.lang.String r1 = r2.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x010e
        L_0x00b0:
            r3 = 1
            java.lang.String r0 = r12.A13()
            java.lang.String r7 = r11.A03(r0)
            if (r7 == 0) goto L_0x010e
            java.lang.String r8 = r2.A07
            if (r8 == 0) goto L_0x00c5
            int r0 = r8.length()
            if (r0 != 0) goto L_0x00c6
        L_0x00c5:
            r8 = r7
        L_0x00c6:
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0110
            int r9 = X.AnonymousClass35G.A01(r11, r8)
            byte[] r0 = r2.A1z()
            if (r0 != 0) goto L_0x00d7
            r3 = 0
        L_0x00d7:
            int r2 = r2.A01
            if (r9 == 0) goto L_0x00e8
            r0 = 4
            if (r9 != r0) goto L_0x00f1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 == r0) goto L_0x00e8
            r0 = 22
            if (r1 != r0) goto L_0x00f3
        L_0x00e8:
            r11 = 0
        L_0x00e9:
            X.32K r1 = new X.32K
            r6 = r1
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x00f1:
            if (r9 != r0) goto L_0x00fe
        L_0x00f3:
            r1 = 3522(0xdc2, float:4.935E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00fe
            goto L_0x00e8
        L_0x00fe:
            r11 = 1
            if (r2 != r11) goto L_0x00e8
            if (r3 != 0) goto L_0x00e9
            r1 = 2060(0x80c, float:2.887E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x010e:
            r7 = 0
            r8 = r7
        L_0x0110:
            r11 = 0
            r9 = 0
            goto L_0x00e9
        L_0x0113:
            r2 = 0
            X.32K r1 = new X.32K
            r3 = r2
            r4 = r5
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass32K.A00(X.1VX, X.5Zz, X.34x):X.32K");
    }

    public AnonymousClass32K(String str, String str2, int i, int i2, boolean z) {
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
