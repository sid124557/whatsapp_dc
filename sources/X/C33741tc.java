package X;

/* renamed from: X.1tc  reason: invalid class name and case insensitive filesystem */
public abstract class C33741tc extends AnonymousClass5ZM {
    public CharSequence A00;
    public String A01;
    public final /* synthetic */ C55922r8 A02;

    public C33741tc(C55922r8 r1, CharSequence charSequence, String str) {
        this.A02 = r1;
        this.A00 = charSequence;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r14) {
        /*
            r13 = this;
            X.2r8 r7 = r13.A02
            X.2lb r0 = r7.A08
            java.util.Locale r6 = r0.A00()
            java.lang.CharSequence r1 = r13.A00
            java.lang.String r5 = r13.A01
            r4 = r13
            X.4HE r4 = (X.AnonymousClass4HE) r4
            int r3 = r4.A02
            r2 = 1
            if (r3 == 0) goto L_0x0102
            X.C162457s7.A0J(r1, r2)
            r0 = 6
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r0 = "key"
            r12 = 0
            r9[r12] = r0
            java.lang.String r0 = X.C58172up.A0V
            r9[r2] = r0
            java.lang.String r0 = "tag"
            r8 = 2
            r9[r8] = r0
            r0 = 3
            X.AnonymousClass0x7.A1E(r1, r9, r0)
            r1 = 4
            java.lang.String r0 = "locale"
            r9[r1] = r0
            java.lang.Object r0 = r4.A01
            X.2r8 r0 = (X.C55922r8) r0
            X.33j r11 = r0.A04
            r10 = 95
            if (r6 == 0) goto L_0x00ea
            java.lang.String r0 = r6.getCountry()
            if (r0 == 0) goto L_0x00e4
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00e4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r6.getLanguage()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r6.getCountry()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
        L_0x005e:
            X.C162457s7.A0H(r1)
        L_0x0061:
            r0 = 5
            r9[r0] = r1
            java.lang.String r0 = "https://wa.tenor.co/v1/search"
            java.lang.String r9 = X.AnonymousClass5B3.A00(r0, r9)
            if (r5 == 0) goto L_0x007f
            int r0 = r5.length()
            if (r0 == 0) goto L_0x007f
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "pos"
            r1[r12] = r0
        L_0x0079:
            r1[r2] = r5
            java.lang.String r9 = X.AnonymousClass5B3.A00(r9, r1)
        L_0x007f:
            java.lang.Object r2 = r4.A01
            if (r3 == 0) goto L_0x00ce
            X.1ce r2 = (X.C26711ce) r2
            X.1ac r1 = new X.1ac
            r1.<init>()
            java.lang.String r0 = "Tenor"
            r1.A08 = r0
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A00 = r0
            X.0PJ r2 = r2.A03(r1, r9)
        L_0x0098:
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r0 = r2.A01
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00cb
        L_0x00a6:
            X.1YL r1 = new X.1YL
            r1.<init>()
            boolean r0 = r7 instanceof X.C26711ce
            if (r0 == 0) goto L_0x00cc
            r0 = 1
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            if (r6 == 0) goto L_0x00be
            java.lang.String r0 = r6.getLanguage()
            r1.A01 = r0
        L_0x00be:
            X.33j r0 = r7.A04
            java.lang.String r0 = r0.A07()
            r1.A02 = r0
            X.4FV r0 = r7.A06
            r0.BhB(r1)
        L_0x00cb:
            return r2
        L_0x00cc:
            r0 = 0
            goto L_0x00b0
        L_0x00ce:
            X.1cd r2 = (X.C26701cd) r2
            X.1ac r1 = new X.1ac
            r1.<init>()
            java.lang.String r0 = "Giphy"
            r1.A08 = r0
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A00 = r0
            X.0PJ r2 = r2.A03(r1, r9)
            goto L_0x0098
        L_0x00e4:
            java.lang.String r1 = r6.getLanguage()
            goto L_0x005e
        L_0x00ea:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r11.A07()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r11.A06()
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x0061
        L_0x0102:
            X.C162457s7.A0J(r1, r2)
            r0 = 8
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r0 = "api_key"
            r10 = 0
            r9[r10] = r0
            java.lang.String r0 = X.C58172up.A0H
            r9[r2] = r0
            java.lang.String r0 = "q"
            r8 = 2
            r9[r8] = r0
            r0 = 3
            X.AnonymousClass0x7.A1E(r1, r9, r0)
            r1 = 4
            java.lang.String r0 = "lang"
            r9[r1] = r0
            X.35I r1 = X.AnonymousClass35I.A00
            java.lang.Object r0 = r4.A01
            X.2r8 r0 = (X.C55922r8) r0
            X.33j r0 = r0.A04
            java.lang.String r1 = r1.A03(r0, r6)
            r0 = 5
            r9[r0] = r1
            r1 = 6
            java.lang.String r0 = "rating"
            r9[r1] = r0
            r1 = 7
            java.lang.String r0 = "pg-13"
            r9[r1] = r0
            java.lang.String r0 = "https://api.giphy.com/v1/gifs/search"
            java.lang.String r9 = X.AnonymousClass5B3.A00(r0, r9)
            if (r5 == 0) goto L_0x007f
            int r0 = r5.length()
            if (r0 == 0) goto L_0x007f
            java.lang.String[] r1 = new java.lang.String[r8]
            java.lang.String r0 = "offset"
            r1[r10] = r0
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33741tc.A08(java.lang.Object[]):java.lang.Object");
    }
}
