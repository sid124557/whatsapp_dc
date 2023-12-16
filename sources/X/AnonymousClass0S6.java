package X;

/* renamed from: X.0S6  reason: invalid class name */
public final class AnonymousClass0S6 {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011 A[SYNTHETIC, Splitter:B:8:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, long r7) {
        /*
            java.lang.String r2 = "DatetimeTextProviderUtils"
            if (r4 == 0) goto L_0x000e
            int r1 = X.C162407s0.A06(r4)     // Catch:{ 6u2 -> 0x0009 }
            goto L_0x000f
        L_0x0009:
            java.lang.String r0 = "Error while parsing DateTime format"
            X.C159737mN.A01(r2, r0)
        L_0x000e:
            r1 = 2
        L_0x000f:
            if (r5 == 0) goto L_0x001b
            int r0 = X.C162407s0.A06(r5)     // Catch:{ 6u2 -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r0 = "Error while parsing Time format"
            X.C159737mN.A01(r2, r0)
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r4 != 0) goto L_0x0020
            java.lang.String r4 = "medium"
        L_0x0020:
            java.text.DateFormat r2 = A01(r3, r4, r1, r0)
            if (r6 != 0) goto L_0x0032
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.TimeZone r0 = r0.getTimeZone()
            java.lang.String r6 = r0.getID()
        L_0x0032:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r6)
            r2.setTimeZone(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.String r0 = r2.format(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S6.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r4.equals("full") != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.text.DateFormat A01(java.lang.String r3, java.lang.String r4, int r5, int r6) {
        /*
            int r0 = r3.hashCode()
            r2 = 2
            r1 = -1
            switch(r0) {
                case 3076014: goto L_0x002e;
                case 3560141: goto L_0x0024;
                case 1793702779: goto L_0x001a;
                default: goto L_0x0009;
            }
        L_0x0009:
            switch(r1) {
                case 0: goto L_0x0042;
                case 1: goto L_0x003d;
                case 2: goto L_0x0038;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown dateformat type: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r3, r1)
            throw r0
        L_0x001a:
            java.lang.String r0 = "datetime"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1 = 2
            goto L_0x0009
        L_0x0024:
            java.lang.String r0 = "time"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1 = 1
            goto L_0x0009
        L_0x002e:
            java.lang.String r0 = "date"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            r1 = 0
            goto L_0x0009
        L_0x0038:
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r5, r6)
            return r1
        L_0x003d:
            java.text.DateFormat r1 = java.text.DateFormat.getTimeInstance(r6)
            return r1
        L_0x0042:
            java.lang.String r0 = "short"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "medium"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "long"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "full"
            boolean r1 = r4.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0064
        L_0x0063:
            r0 = 1
        L_0x0064:
            if (r0 == 0) goto L_0x0074
            int r0 = X.C162407s0.A06(r4)     // Catch:{ 6u2 -> 0x006f }
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance(r0)     // Catch:{ 6u2 -> 0x006f }
            return r1
        L_0x006f:
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r2)
            return r0
        L_0x0074:
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S6.A01(java.lang.String, java.lang.String, int, int):java.text.DateFormat");
    }
}
