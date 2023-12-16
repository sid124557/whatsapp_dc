package X;

/* renamed from: X.3Y5  reason: invalid class name */
public final class AnonymousClass3Y5 implements C84804Dt {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r3.A01(r5, r4) >= r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r3.A01(r5, r4) >= r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if ((r12.A00 - r8) <= ((long) r10)) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2TE AxG(X.AnonymousClass2U3 r12, X.C833748d r13) {
        /*
            r11 = this;
            X.C18260x0.A0O(r13, r12)
            X.3YL r13 = (X.AnonymousClass3YL) r13
            java.lang.String r4 = r13.A0F
            X.2zq r3 = r12.A0C
            int r1 = r13.A01
            if (r1 <= 0) goto L_0x0033
            X.21s r5 = X.C373021s.IMPRESSION
            int r0 = r3.A01(r5, r4)
            if (r0 < r1) goto L_0x0033
            int r10 = r13.A00
            if (r10 <= 0) goto L_0x0047
            java.lang.String r0 = "eligibilityDurationAfterFirstImpression"
            java.lang.String r6 = X.C61182zq.A00(r4, r0)
            android.content.SharedPreferences r2 = r3.A00
            r0 = 0
            long r8 = r2.getLong(r6, r0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0047
            long r6 = r12.A00
            long r6 = r6 - r8
            long r0 = (long) r10
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0047
        L_0x0033:
            X.2TD r2 = r13.A07
            if (r2 == 0) goto L_0x00a1
            X.2Ru r0 = r2.A01
            if (r0 == 0) goto L_0x0063
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0063
            X.21s r5 = X.C373021s.PRIMARY_ACTION
            int r0 = r3.A01(r5, r4)
            if (r0 < r1) goto L_0x0063
        L_0x0047:
            r2 = 0
            r0 = 1
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r5, r0)
            java.lang.String r0 = "Limit reached for counter: "
            r1.append(r0)
            java.lang.String r0 = r5.readableName
            java.lang.String r4 = X.AnonymousClass000.A0X(r0, r1)
            r6 = 0
            X.2TE r1 = new X.2TE
            r5 = r2
            r8 = r6
            r3 = r2
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0063:
            X.2Ru r0 = r2.A02
            if (r0 == 0) goto L_0x0074
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0074
            X.21s r5 = X.C373021s.SECONDARY_ACTION
            int r0 = r3.A01(r5, r4)
            if (r0 < r1) goto L_0x0074
            goto L_0x0047
        L_0x0074:
            X.2Ru r0 = r2.A00
            if (r0 == 0) goto L_0x00a1
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x00a1
            X.21s r2 = X.C373021s.DISMISS_ACTION
            int r0 = r3.A01(r2, r4)
            if (r0 < r1) goto L_0x00a1
            r3 = 0
            r0 = 1
            java.lang.StringBuilder r1 = X.C18280x3.A0g(r2, r0)
            java.lang.String r0 = "Limit reached for counter: "
            r1.append(r0)
            java.lang.String r0 = r2.readableName
            java.lang.String r5 = X.AnonymousClass000.A0X(r0, r1)
            r7 = 0
            X.2TE r1 = new X.2TE
            r6 = r3
            r9 = r7
            r2 = r1
            r4 = r3
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L_0x00a1:
            X.2TE r1 = X.C615831k.A01()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y5.AxG(X.2U3, X.48d):X.2TE");
    }

    public String BsV() {
        return "client_action_limit";
    }
}
