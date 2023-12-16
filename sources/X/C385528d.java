package X;

/* renamed from: X.28d  reason: invalid class name and case insensitive filesystem */
public final class C385528d {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (X.C106585Zo.A01(r1) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60962zS A01(java.lang.String r10, int r11, int r12, boolean r13) {
        /*
            r6 = r12
            r7 = r13
            r5 = r11
            if (r10 != 0) goto L_0x000d
            r3 = 0
            X.2zS r2 = new X.2zS
            r4 = r3
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x000d:
            java.lang.String r0 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 0
            r4 = 0
            java.util.List r3 = X.C175728Zm.A0P(r10, r1, r0)
            java.lang.Object r9 = r3.get(r0)
            r1 = r9
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C106585Zo.A00(r1)
            r2 = 1
            if (r0 != 0) goto L_0x002e
            boolean r1 = X.C106585Zo.A01(r1)
            r0 = 0
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            r10 = 0
            if (r0 == 0) goto L_0x0033
            r9 = r10
        L_0x0033:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r3.get(r4)
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C106585Zo.A00(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0045
            r10 = r1
        L_0x0045:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = X.C73723fy.A06(r3, r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = X.C829745q.A06(r0)
            if (r0 == 0) goto L_0x0059
            int r5 = r0.intValue()
        L_0x0059:
            X.2zS r8 = new X.2zS
            r11 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385528d.A01(java.lang.String, int, int, boolean):X.2zS");
    }

    public static C60962zS A00(C56312rm r5, String str) {
        C60152y5 r52 = r5.A01;
        return A01(str, 443, r52.A03("user_proxy_setting_pref").getInt("proxy_media_port", 587), r52.A03("user_proxy_setting_pref").getBoolean("proxy_use_tls", true));
    }
}
