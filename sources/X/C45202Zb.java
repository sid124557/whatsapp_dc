package X;

/* renamed from: X.2Zb  reason: invalid class name and case insensitive filesystem */
public final class C45202Zb {
    public final C116985rC A00;
    public final C54292oU A01;
    public final C52412lR A02;

    public C45202Zb(C116985rC r2, C54292oU r3, C52412lR r4) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (X.AnonymousClass2AB.A05(r1, "OPD") != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009c, code lost:
        if (X.AnonymousClass2AB.A05(r1, "SM-A320") == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0139, code lost:
        if (r1 >= 1801) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r0 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass21O A00() {
        /*
            r6 = this;
            X.2lR r3 = r6.A02
            X.33p r4 = r3.A02
            X.8qC r1 = r4.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            java.lang.String r2 = "is_chrome_device_cached"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0020
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r1)
            boolean r1 = X.C18280x3.A1W(r0, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0039
        L_0x0020:
            android.content.pm.PackageManager r1 = r3.A01     // Catch:{ RuntimeException -> 0x003e }
            java.lang.String r0 = "org.chromium.arc"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ RuntimeException -> 0x003e }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "org.chromium.arc.device_management"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ RuntimeException -> 0x003e }
            r1 = 0
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            X.C18270x1.A0v(r4, r2, r1)     // Catch:{ RuntimeException -> 0x003e }
        L_0x0039:
            if (r1 == 0) goto L_0x004c
            X.21O r0 = X.AnonymousClass21O.DESKTOP
            return r0
        L_0x003e:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "DeviceUtils/isChromeDevice/DeadObjectException"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004c:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0055
            X.21O r0 = X.AnonymousClass21O.FOLDABLE
            return r0
        L_0x0055:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "oneplus"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0070
            java.lang.String r1 = android.os.Build.MODEL
            X.C162457s7.A0F(r1)
            java.lang.String r0 = "OPD"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 == 0) goto L_0x009e
        L_0x006d:
            X.21O r0 = X.AnonymousClass21O.TABLET
            return r0
        L_0x0070:
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = android.os.Build.MODEL
            X.C162457s7.A0F(r1)
            java.lang.String r0 = "GT-I920"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "SM-G965"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "SM-G988"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "SM-A320"
            boolean r0 = X.AnonymousClass2AB.A05(r1, r0)
            if (r0 == 0) goto L_0x00a1
        L_0x009e:
            X.21O r0 = X.AnonymousClass21O.MOBILE
            return r0
        L_0x00a1:
            java.lang.String r0 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "lya-al00"
            if (r1 == 0) goto L_0x00b5
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x009e
        L_0x00b5:
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "mar-al00"
            if (r1 == 0) goto L_0x00c1
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x009e
        L_0x00c1:
            java.lang.String r0 = "vog-tl00"
            if (r1 == 0) goto L_0x00cc
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x009e
        L_0x00cc:
            java.lang.String r0 = "vog-al00"
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x009e
        L_0x00d7:
            java.lang.String r0 = "jsn-al00a"
            if (r1 == 0) goto L_0x00e2
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00e2
            goto L_0x009e
        L_0x00e2:
            java.lang.String r0 = "moto g(100)"
            if (r1 == 0) goto L_0x00ee
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00ee
            goto L_0x009e
        L_0x00ee:
            java.lang.String r0 = "asus_z01qd"
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00f9
            goto L_0x009e
        L_0x00f9:
            X.2oU r0 = r6.A01
            android.content.Context r5 = r0.A00
            X.C162457s7.A0D(r5)
            X.7Ym r4 = X.AnonymousClass5YQ.A02(r5)
            if (r4 == 0) goto L_0x013d
            android.content.Context r0 = X.AnonymousClass74U.A00(r5)
            android.content.res.Configuration r3 = X.AnonymousClass001.A0M(r0)
            int r0 = r3.screenLayout
            r2 = r0 & 15
            r0 = 2
            if (r2 > r0) goto L_0x011c
            int r1 = r4.A00
            r0 = 700(0x2bc, float:9.81E-43)
            if (r1 > r0) goto L_0x011c
            goto L_0x009e
        L_0x011c:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r0 = "android.hardware.telephony"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x006d
            int r1 = r3.smallestScreenWidthDp
            r0 = 600(0x258, float:8.41E-43)
            if (r1 >= r0) goto L_0x006d
            r0 = 3
            if (r2 < r0) goto L_0x013d
            int r1 = r4.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r0 > r1) goto L_0x013d
            r0 = 1801(0x709, float:2.524E-42)
            if (r1 >= r0) goto L_0x013d
            goto L_0x006d
        L_0x013d:
            X.21O r0 = X.AnonymousClass21O.AMBIGUOUS
            return r0
        L_0x0140:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45202Zb.A00():X.21O");
    }
}
