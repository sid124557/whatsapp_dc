package X;

/* renamed from: X.2ou  reason: invalid class name and case insensitive filesystem */
public final class C54552ou {
    public final C54292oU A00;
    public final C52412lR A01;
    public final C187958y5 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (X.AnonymousClass2AB.A05(r1, "SM-A320") == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00dd, code lost:
        if (r1 >= 1801) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C370420s A00() {
        /*
            r5 = this;
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x003c
            java.lang.String r1 = android.os.Build.MODEL
            X.C162457s7.A0F(r1)
            java.lang.String r0 = "GT-I920"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "SM-G965"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "SM-G988"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "SM-A320"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 == 0) goto L_0x003c
        L_0x0039:
            X.20s r0 = X.C370420s.PHONE
            return r0
        L_0x003c:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x0050
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
        L_0x0050:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
        L_0x005c:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
        L_0x0067:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
        L_0x0072:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x007d
            goto L_0x0039
        L_0x007d:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0089
            goto L_0x0039
        L_0x0089:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x0094
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0094
            goto L_0x0039
        L_0x0094:
            X.2lR r0 = r5.A01
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00e2
            X.2oU r0 = r5.A00
            android.content.Context r2 = r0.A00
            X.C162457s7.A0D(r2)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x00df
            X.7Ym r4 = X.AnonymousClass5YQ.A02(r2)
            if (r4 == 0) goto L_0x00e2
            android.content.Context r0 = X.AnonymousClass74U.A00(r2)
            android.content.res.Configuration r3 = X.AnonymousClass001.A0M(r0)
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x00cc
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x00cc
            goto L_0x0039
        L_0x00cc:
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x00df
            r0 = 3
            if (r2 < r0) goto L_0x00e2
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x00e2
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x00e2
        L_0x00df:
            X.20s r0 = X.C370420s.TABLET
            return r0
        L_0x00e2:
            X.20s r0 = X.C370420s.AMBIGUOUS
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54552ou.A00():X.20s");
    }

    public C54552ou(C54292oU r1, C52412lR r2, C187958y5 r3) {
        C18260x0.A0R(r1, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final boolean A01() {
        C370420s A002 = A00();
        if (A002 == C370420s.PHONE || A002 == C370420s.AMBIGUOUS) {
            return true;
        }
        return false;
    }
}
