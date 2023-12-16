package X;

/* renamed from: X.5my  reason: invalid class name and case insensitive filesystem */
public class C114395my implements C184408rk {
    public final /* synthetic */ C112275jT A00;

    public C114395my(C112275jT r1) {
        this.A00 = r1;
    }

    public void BSO(AnonymousClass7T4 r3, int i) {
        C112315jX r1 = this.A00.A0D;
        if (r1 != null) {
            r1.A09(r3, i, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        throw new java.lang.RuntimeException(X.AnonymousClass000.A0V("HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: ", r2, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        r2 = new X.AnonymousClass7HB(r1.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r2.A00 != 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        r2.A01 = r1;
        r3.A0E.put(java.lang.Integer.valueOf(r4), r2);
        r3.A08(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            X.5jT r0 = r7.A00
            X.5jX r3 = r0.A0D
            if (r3 == 0) goto L_0x002a
            boolean r0 = r8.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "HomeWidgetsDelegate/onFetchUnifiedHomeSuccess widgets list cannot be empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.7Ph r2 = r3.A09
            r0 = 4
            r2.A02 = r0
            r0 = 3
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            r1 = 7
            X.7T4 r0 = new X.7T4
            r0.<init>(r4, r4, r1)
            r2.A07 = r0
            r3.A06()
        L_0x002a:
            return
        L_0x002b:
            java.util.Iterator r6 = r8.iterator()
            r5 = 0
        L_0x0030:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r6.next()
            X.7H7 r1 = (X.AnonymousClass7H7) r1
            java.lang.String r2 = r1.A01
            int r0 = r2.hashCode()
            switch(r0) {
                case -1425004772: goto L_0x0055;
                case -1049482625: goto L_0x005f;
                case -805635793: goto L_0x0069;
                case 1594529602: goto L_0x0073;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "HomeWidgetsDelegate/getWidgetTypeById: Widget not supported: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0055:
            java.lang.String r0 = "verified_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r4 = 2
            goto L_0x007c
        L_0x005f:
            java.lang.String r0 = "nearby"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r4 = 0
            goto L_0x007c
        L_0x0069:
            java.lang.String r0 = "frequently_contacted_biz"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r4 = 3
            goto L_0x007c
        L_0x0073:
            java.lang.String r0 = "popular_categories"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0045
            r4 = 1
        L_0x007c:
            int r0 = r1.A00
            X.7HB r2 = new X.7HB
            r2.<init>(r0)
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0088
            r5 = 1
        L_0x0088:
            r2.A01 = r1
            java.util.Map r1 = r3.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.put(r0, r2)
            r3.A08(r4)
            goto L_0x0030
        L_0x0097:
            if (r5 == 0) goto L_0x00d0
            java.util.Map r2 = r3.A0E
            java.lang.Integer r1 = X.C18290x4.A0Z()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r2.get(r1)
            X.7HB r0 = (X.AnonymousClass7HB) r0
            java.lang.Object r0 = r0.A01
            X.6fV r0 = (X.C132536fV) r0
            X.5TI r0 = r0.A00
            r3.BNw(r0)
        L_0x00b4:
            java.lang.Integer r1 = X.C18290x4.A0a()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r2.get(r1)
            X.7HB r0 = (X.AnonymousClass7HB) r0
            java.lang.Object r0 = r0.A01
            X.6fU r0 = (X.C132526fU) r0
            int r1 = r0.A00
            X.5Om r0 = r3.A0D
            r0.A00(r3, r1)
            return
        L_0x00d0:
            r3.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114395my.onSuccess(java.lang.Object):void");
    }
}
