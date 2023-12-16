package X;

/* renamed from: X.3YF  reason: invalid class name */
public final class AnonymousClass3YF implements C84314Bw {
    public final C56612sH A00;
    public final C61182zq A01;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r3 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        switch(r3.hashCode()) {
            case -1806407742: goto L_0x00c8;
            case -526668609: goto L_0x00b6;
            case 851903629: goto L_0x00a2;
            case 1832379851: goto L_0x0088;
            default: goto L_0x0087;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        if (r3.equals("SECONDS_SINCE_GREATER_THAN") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        r0 = ((java.lang.System.currentTimeMillis() - r9.A01.A02(r1, r2)) > (r7 * ((long) 1000)) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A01.A02(r1, r2)) == (r7 * ((long) 1000)) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (r3.equals("COUNT_AT_LEAST") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r0 = (((long) r9.A01.A01(r1, r2)) > r7 ? 1 : (((long) r9.A01.A01(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        if (r0 < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (r3.equals("COUNT_AT_MOST") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r2 = (((long) r9.A01.A01(r1, r2)) > r7 ? 1 : (((long) r9.A01.A01(r1, r2)) == r7 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r3.equals("SECONDS_SINCE_LESS_THAN") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r2 = ((java.lang.System.currentTimeMillis() - r9.A01.A02(r1, r2)) > (r7 * ((long) 1000)) ? 1 : ((java.lang.System.currentTimeMillis() - r9.A01.A02(r1, r2)) == (r7 * ((long) 1000)) ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if (r2 > 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AxE(X.AnonymousClass2PJ r10, X.C833648c r11, X.C833748d r12) {
        /*
            r9 = this;
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            java.util.Map r5 = r10.A01
            java.lang.String r0 = "promo_id"
            java.lang.Object r2 = r5.get(r0)
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "event_count"
            java.lang.String r0 = X.C18310x6.A0o(r0, r5)
            if (r0 == 0) goto L_0x0050
            long r7 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "event"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            r3 = 0
            if (r1 == 0) goto L_0x00e5
            java.util.Locale r0 = java.util.Locale.US
            X.C162457s7.A0F(r0)
            java.lang.String r4 = r1.toUpperCase(r0)
            X.C162457s7.A0D(r4)
        L_0x0032:
            java.lang.String r0 = "metric"
            java.lang.String r1 = X.C18310x6.A0o(r0, r5)
            if (r1 == 0) goto L_0x0047
            java.util.Locale r0 = java.util.Locale.US
            X.C162457s7.A0F(r0)
            java.lang.String r3 = r1.toUpperCase(r0)
            X.C162457s7.A0D(r3)
        L_0x0047:
            if (r4 == 0) goto L_0x0050
            int r0 = r4.hashCode()
            switch(r0) {
                case -1413131469: goto L_0x0074;
                case -1395292287: goto L_0x0069;
                case -956430933: goto L_0x005e;
                case 605715977: goto L_0x0053;
                default: goto L_0x0050;
            }
        L_0x0050:
            boolean r0 = r10.A02
            return r0
        L_0x0053:
            java.lang.String r0 = "IMPRESSION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.21s r1 = X.C373021s.IMPRESSION
            goto L_0x007e
        L_0x005e:
            java.lang.String r0 = "DISMISS_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.21s r1 = X.C373021s.DISMISS_ACTION
            goto L_0x007e
        L_0x0069:
            java.lang.String r0 = "SECONDARY_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.21s r1 = X.C373021s.SECONDARY_ACTION
            goto L_0x007e
        L_0x0074:
            java.lang.String r0 = "PRIMARY_ACTION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.21s r1 = X.C373021s.PRIMARY_ACTION
        L_0x007e:
            if (r3 == 0) goto L_0x0050
            int r0 = r3.hashCode()
            switch(r0) {
                case -1806407742: goto L_0x00c8;
                case -526668609: goto L_0x00b6;
                case 851903629: goto L_0x00a2;
                case 1832379851: goto L_0x0088;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x0050
        L_0x0088:
            java.lang.String r0 = "SECONDS_SINCE_GREATER_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.2zq r0 = r9.A01
            long r4 = r0.A02(r1, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 * r0
            long r2 = r2 - r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            goto L_0x00b3
        L_0x00a2:
            java.lang.String r0 = "COUNT_AT_LEAST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.2zq r0 = r9.A01
            int r0 = r0.A01(r1, r2)
            long r1 = (long) r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
        L_0x00b3:
            if (r0 < 0) goto L_0x00e8
            goto L_0x00e3
        L_0x00b6:
            java.lang.String r0 = "COUNT_AT_MOST"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.2zq r0 = r9.A01
            int r0 = r0.A01(r1, r2)
            long r0 = (long) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            goto L_0x00e1
        L_0x00c8:
            java.lang.String r0 = "SECONDS_SINCE_LESS_THAN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.2zq r0 = r9.A01
            long r5 = r0.A02(r1, r2)
            long r3 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 * r0
            long r3 = r3 - r5
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
        L_0x00e1:
            if (r2 > 0) goto L_0x00e8
        L_0x00e3:
            r0 = 1
            return r0
        L_0x00e5:
            r4 = r3
            goto L_0x0032
        L_0x00e8:
            r0 = 0
            return r0
        L_0x00ea:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YF.AxE(X.2PJ, X.48c, X.48d):boolean");
    }

    public AnonymousClass3YF(C56612sH r1, C61182zq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
