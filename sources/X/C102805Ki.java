package X;

import java.text.NumberFormat;

/* renamed from: X.5Ki  reason: invalid class name and case insensitive filesystem */
public final class C102805Ki {
    public boolean A00;
    public final AnonymousClass0XH A01;
    public final C106635Zt A02;
    public final C106375Ys A03;
    public final NumberFormat A04;
    public final NumberFormat A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (android.text.format.DateFormat.is24HourFormat(r6) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1.equals(r2) == false) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C102805Ki(android.content.Context r6, java.util.Locale r7) {
        /*
            r5 = this;
            r5.<init>()
            int r0 = X.AnonymousClass0I0.A00(r7)
            boolean r4 = X.AnonymousClass001.A1T(r0)
            r5.A06 = r4
            java.lang.String r1 = r7.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            java.lang.String r3 = r7.getCountry()
            java.lang.String r2 = "en-US"
            r1 = r2
            X.7nm r0 = X.AnonymousClass77Y.A00     // Catch:{ IllegalArgumentException -> 0x0029 }
            java.lang.Object r0 = r0.A01(r3)     // Catch:{ IllegalArgumentException -> 0x0029 }
            if (r0 == 0) goto L_0x0029
            r2 = r0
        L_0x0029:
            boolean r1 = r1.equals(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r5.A07 = r0
            int r0 = X.C162307rf.A00(r7)
            if (r0 == 0) goto L_0x0040
            boolean r0 = android.text.format.DateFormat.is24HourFormat(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            r5.A00 = r1
            X.0ru r1 = X.AnonymousClass0XH.A04
            if (r1 != r1) goto L_0x0077
            if (r4 == 0) goto L_0x0074
            X.0XH r0 = X.AnonymousClass0XH.A03
        L_0x004b:
            r5.A01 = r0
            java.text.NumberFormat r0 = java.text.NumberFormat.getPercentInstance(r7)
            r5.A05 = r0
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r7)
            r5.A04 = r0
            android.content.res.Resources r1 = r6.getResources()
            X.5Zt r0 = new X.5Zt
            r0.<init>(r6, r1, r7)
            r5.A02 = r0
            android.content.res.Resources r3 = r6.getResources()
            java.util.Locale r2 = r0.A02
            X.7nA r1 = r0.A01
            X.5Ys r0 = new X.5Ys
            r0.<init>(r6, r3, r1, r2)
            r5.A03 = r0
            return
        L_0x0074:
            X.0XH r0 = X.AnonymousClass0XH.A02
            goto L_0x004b
        L_0x0077:
            X.0XH r0 = new X.0XH
            r0.<init>(r1, r4)
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102805Ki.<init>(android.content.Context, java.util.Locale):void");
    }

    public static boolean A00(C620733j r0) {
        return r0.A05().A06;
    }
}
