package X;

/* renamed from: X.7Ra  reason: invalid class name and case insensitive filesystem */
public final class C150507Ra {
    public C133966iE A00;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fc, code lost:
        if (r3 > Float.MAX_VALUE) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r10, X.AnonymousClass0P8 r11, X.AnonymousClass4FV r12) {
        /*
            r9 = this;
            r0 = 1
            X.C162457s7.A0J(r12, r0)
            r4 = 2
            X.C162457s7.A0J(r10, r4)
            X.6iE r2 = new X.6iE
            r2.<init>()
            X.0vM r8 = X.AnonymousClass74V.A00(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            if (r8 == 0) goto L_0x0058
            r5 = r8
            X.0fG r5 = (X.C08880fG) r5
            X.0TW r1 = r5.A01
            X.0TW r0 = X.AnonymousClass0TW.A01
            boolean r1 = X.C162457s7.A0P(r1, r0)
            r0 = r7
            if (r1 == 0) goto L_0x002a
            r0 = r3
        L_0x002a:
            r2.A04 = r0
            X.0Pg r6 = r5.A00
            int r5 = r6.A02
            int r0 = r6.A01
            int r5 = r5 - r0
            int r1 = r6.A00
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r5 <= r1) goto L_0x0100
            X.0TV r6 = X.AnonymousClass0TV.A01
        L_0x003c:
            X.0TV r5 = X.AnonymousClass0TV.A01
            boolean r1 = X.C162457s7.A0P(r6, r5)
            r0 = r7
            if (r1 == 0) goto L_0x0046
            r0 = r3
        L_0x0046:
            r2.A03 = r0
            boolean r0 = r8.BIu()
            if (r0 == 0) goto L_0x0058
            boolean r1 = X.C162457s7.A0P(r6, r5)
            r0 = r7
            if (r1 == 0) goto L_0x0056
            r0 = r3
        L_0x0056:
            r2.A02 = r0
        L_0x0058:
            boolean r0 = X.C107385bE.A03()
            if (r0 == 0) goto L_0x0068
            boolean r0 = r10.isInMultiWindowMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
        L_0x0068:
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r10)
            int r0 = r0.orientation
            if (r0 == r4) goto L_0x0071
            r3 = r7
        L_0x0071:
            r2.A05 = r3
            android.content.Context r0 = r10.getApplicationContext()
            X.C162457s7.A0D(r0)
            X.7Ym r0 = X.AnonymousClass5YQ.A02(r0)
            if (r0 == 0) goto L_0x0099
            int r1 = r0.A01
            int r0 = r0.A02
            float r3 = (float) r0
            float r0 = (float) r1
            float r3 = r3 / r0
            r0 = 0
            r1 = 1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00ef
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00ef
        L_0x0093:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A01 = r0
        L_0x0099:
            X.6iE r4 = r9.A00
            r3 = 0
            java.lang.Integer r1 = r2.A02
            if (r4 == 0) goto L_0x00ed
            java.lang.Integer r0 = r4.A02
        L_0x00a2:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r1 = r2.A05
            if (r4 == 0) goto L_0x00eb
            java.lang.Integer r0 = r4.A05
        L_0x00ae:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r1 = r2.A01
            if (r4 == 0) goto L_0x00e9
            java.lang.Integer r0 = r4.A01
        L_0x00ba:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r1 = r2.A03
            if (r4 == 0) goto L_0x00e7
            java.lang.Integer r0 = r4.A03
        L_0x00c6:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r1 = r2.A04
            if (r4 == 0) goto L_0x00e5
            java.lang.Integer r0 = r4.A04
        L_0x00d2:
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0104
            java.lang.Boolean r0 = r2.A00
            if (r4 == 0) goto L_0x00de
            java.lang.Boolean r3 = r4.A00
        L_0x00de:
            boolean r0 = X.C162457s7.A0P(r0, r3)
            if (r0 == 0) goto L_0x0104
            return
        L_0x00e5:
            r0 = r3
            goto L_0x00d2
        L_0x00e7:
            r0 = r3
            goto L_0x00c6
        L_0x00e9:
            r0 = r3
            goto L_0x00ba
        L_0x00eb:
            r0 = r3
            goto L_0x00ae
        L_0x00ed:
            r0 = r3
            goto L_0x00a2
        L_0x00ef:
            r0 = 1068121457(0x3faa3d71, float:1.33)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00fe
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 3
            if (r0 <= 0) goto L_0x0093
        L_0x00fe:
            r1 = 2
            goto L_0x0093
        L_0x0100:
            X.0TV r6 = X.AnonymousClass0TV.A02
            goto L_0x003c
        L_0x0104:
            r9.A00 = r2
            r12.BhD(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150507Ra.A00(android.app.Activity, X.0P8, X.4FV):void");
    }
}
