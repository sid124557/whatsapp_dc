package X;

/* renamed from: X.2ti  reason: invalid class name and case insensitive filesystem */
public class C57482ti {
    public static int A00(AnonymousClass36K r3) {
        if (!AnonymousClass36J.A08(r3)) {
            return 0;
        }
        AnonymousClass36K A0l = r3.A0l("membership_approval_request");
        if (A0l == null) {
            return 1;
        }
        if (A0l.A0r("error", (String) null) == null) {
            return 2;
        }
        String A0r = A0l.A0r("error", (String) null);
        C626936e.A06(A0r);
        if (304 != Integer.parseInt(A0r)) {
            return 2;
        }
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004a, code lost:
        if (r6.equals("false") == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C55682qk r40, X.C66493Lq r41, X.AnonymousClass334 r42, X.AnonymousClass36K r43) {
        /*
            X.36K r0 = r43.A0j()
            com.whatsapp.jid.Jid r4 = X.AnonymousClass36K.A07(r43)
            X.C626936e.A06(r4)
            X.1fJ r4 = (X.C27991fJ) r4
            r7 = r41
            boolean r1 = r7.A0j(r4)
            if (r1 == 0) goto L_0x00ec
            com.whatsapp.jid.UserJid r11 = X.AnonymousClass36K.A09(r0)
            java.lang.String r1 = "creation"
            r3 = 0
            java.lang.String r5 = r0.A0r(r1, r3)
            r1 = 0
            long r22 = X.C615531h.A04(r5, r1)
            r24 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r24
            r7.A0Y(r11, r0)
            java.lang.String r5 = "subject"
            java.lang.String r15 = r0.A0r(r5, r3)
            long r5 = X.C615531h.A02(r0)
            long r24 = r24 * r5
            java.lang.String r5 = "ack"
            java.lang.String r6 = r0.A0r(r5, r3)
            if (r6 == 0) goto L_0x004c
            java.lang.String r5 = "false"
            boolean r5 = r6.equals(r5)
            r37 = 0
            if (r5 != 0) goto L_0x004e
        L_0x004c:
            r37 = 1
        L_0x004e:
            java.lang.String r5 = "type"
            r0.A0r(r5, r3)
            java.lang.String r5 = "p_v_id"
            long r26 = r0.A0e(r5, r1)
            java.lang.String r5 = "a_v_id"
            long r28 = r0.A0e(r5, r1)
            java.lang.String r1 = "locked"
            boolean r31 = X.AnonymousClass36K.A0V(r0, r1)
            java.lang.String r1 = "announcement"
            boolean r32 = X.AnonymousClass36K.A0V(r0, r1)
            java.lang.String r1 = "incognito"
            boolean r35 = X.AnonymousClass36K.A0V(r0, r1)
            java.lang.String r1 = "no_frequently_forwarded"
            boolean r33 = X.AnonymousClass36K.A0V(r0, r1)
            java.lang.String r1 = "suspended"
            boolean r34 = X.AnonymousClass36K.A0V(r0, r1)
            java.lang.String r1 = "support"
            boolean r30 = X.AnonymousClass36K.A0V(r0, r1)
            r1 = r40
            java.util.Map r5 = X.AnonymousClass36J.A06(r0, r1)
            X.36J r1 = X.AnonymousClass36J.A00
            int r18 = X.AnonymousClass36J.A00(r0)
            X.2fO r13 = r1.A0B(r0)
            java.lang.String r2 = "addressing_mode"
            java.lang.String r3 = r0.A0r(r2, r3)
            java.lang.String r2 = "allow_admin_reports"
            boolean r38 = X.AnonymousClass36K.A0V(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r39 = X.AnonymousClass36K.A0V(r0, r2)
            java.lang.String r2 = "group_history"
            boolean r40 = X.AnonymousClass36K.A0V(r0, r2)
            java.lang.String r2 = "auto_add_disabled"
            boolean r41 = X.AnonymousClass36K.A0V(r0, r2)
            int r2 = X.C615531h.A00(r0, r5)
            X.1fJ r9 = X.AnonymousClass34R.A01(r4)
            X.2zN r12 = X.AnonymousClass36J.A04(r0)
            int r19 = X.AnonymousClass36J.A02(r0)
            X.1fJ r10 = X.AnonymousClass36J.A03(r0)
            boolean r36 = X.AnonymousClass36J.A08(r0)
            int r20 = r1.A09(r0)
            java.lang.String r16 = X.C381125t.A00(r3)
            int r21 = X.AnonymousClass36J.A01(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r8 = r42
            r17 = r5
            r7.A0I(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.2aH r0 = r7.A1A
            X.2jH r0 = r0.A00
            r0.A01(r9)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57482ti.A01(X.2qk, X.3Lq, X.334, X.36K):void");
    }
}
