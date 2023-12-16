package X;

/* renamed from: X.75z  reason: invalid class name and case insensitive filesystem */
public class C1454675z implements C181318mZ {
    public Object A00;
    public final int A01;

    public C1454675z(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 2: goto L_0x00ff;
                case 3: goto L_0x0013;
                case 4: goto L_0x0005;
                case 5: goto L_0x0008;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r11.A00
            return r2
        L_0x0008:
            java.lang.Object r0 = r11.A00
            X.87l r0 = (X.C1689687l) r0
            boolean r0 = r0.A0F
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0013:
            java.lang.Object r1 = r11.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.81w> r10 = X.C1676381w.class
            monitor-enter(r10)
            X.81w r2 = X.C1676381w.A0A     // Catch:{ all -> 0x00fc }
            if (r2 != 0) goto L_0x00fa
            if (r1 == 0) goto L_0x0038
            r1.getApplicationContext()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x00fc }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x0038
            java.lang.String r2 = r0.getNetworkCountryIso()     // Catch:{ all -> 0x00fc }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00fc }
            if (r0 != 0) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = r0.getCountry()     // Catch:{ all -> 0x00fc }
        L_0x0040:
            int r4 = r2.length()     // Catch:{ all -> 0x00fc }
            r3 = 0
        L_0x0045:
            if (r3 >= r4) goto L_0x0072
            char r1 = r2.charAt(r3)     // Catch:{ all -> 0x00fc }
            r0 = 97
            if (r1 < r0) goto L_0x0054
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0057:
            char[] r2 = r2.toCharArray()     // Catch:{ all -> 0x00fc }
        L_0x005b:
            if (r3 >= r4) goto L_0x006f
            char r1 = r2[r3]     // Catch:{ all -> 0x00fc }
            r0 = 97
            if (r1 < r0) goto L_0x006c
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L_0x006c
            r0 = r1 ^ 32
            char r0 = (char) r0     // Catch:{ all -> 0x00fc }
            r2[r3] = r0     // Catch:{ all -> 0x00fc }
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005b
        L_0x006f:
            java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00fc }
        L_0x0072:
            r0 = 6
            int[] r5 = new int[r0]     // Catch:{ all -> 0x00fc }
            r5 = {2, 2, 2, 2, 2, 2} // fill-array     // Catch:{ all -> 0x00fc }
            r0 = 8
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x00fc }
            r3.<init>(r0)     // Catch:{ all -> 0x00fc }
            r9 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00fc }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fc }
            r3.put(r2, r0)     // Catch:{ all -> 0x00fc }
            r6 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00fc }
            X.6aY r4 = X.C1676381w.A0G     // Catch:{ all -> 0x00fc }
            r0 = r5[r9]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x00fc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00fc }
            r8 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00fc }
            X.6aY r1 = X.C1676381w.A0B     // Catch:{ all -> 0x00fc }
            r0 = 1
            r0 = r5[r0]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            r3.put(r2, r0)     // Catch:{ all -> 0x00fc }
            r7 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00fc }
            X.6aY r1 = X.C1676381w.A0C     // Catch:{ all -> 0x00fc }
            r0 = r5[r6]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            r3.put(r2, r0)     // Catch:{ all -> 0x00fc }
            r6 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00fc }
            X.6aY r1 = X.C1676381w.A0D     // Catch:{ all -> 0x00fc }
            r0 = r5[r8]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            java.lang.Integer r2 = X.C18270x1.A0M(r2, r0, r3)     // Catch:{ all -> 0x00fc }
            X.6aY r1 = X.C1676381w.A0E     // Catch:{ all -> 0x00fc }
            r0 = r5[r7]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            java.lang.Integer r2 = X.C18270x1.A0L(r2, r0, r3)     // Catch:{ all -> 0x00fc }
            X.6aY r1 = X.C1676381w.A0F     // Catch:{ all -> 0x00fc }
            r0 = r5[r6]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00fc }
            java.lang.Integer r1 = X.C18270x1.A0J(r2, r0, r3)     // Catch:{ all -> 0x00fc }
            r0 = r5[r9]     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x00fc }
            r3.put(r1, r0)     // Catch:{ all -> 0x00fc }
            X.8vc r0 = X.C186588vc.A00     // Catch:{ all -> 0x00fc }
            X.81w r2 = new X.81w     // Catch:{ all -> 0x00fc }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00fc }
            X.C1676381w.A0A = r2     // Catch:{ all -> 0x00fc }
        L_0x00fa:
            monitor-exit(r10)
            return r2
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x00ff:
            r0 = 0
            X.6KH r2 = new X.6KH
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454675z.get():java.lang.Object");
    }
}
