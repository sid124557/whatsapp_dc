package X;

import java.util.Set;

/* renamed from: X.2nm  reason: invalid class name and case insensitive filesystem */
public final class C53852nm {
    public final C49712gy A00;
    public final C56982ss A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass5UP A03;
    public final C55632qf A04;
    public final AnonymousClass2YX A05;
    public final C45402Zx A06;
    public final Set A07 = AnonymousClass0x9.A17();

    public final synchronized void A00(C95804uY r13, C83994Ap r14, Long l, Long l2, long j, boolean z) {
        C95804uY r4 = r13;
        StringBuilder A0X = C18270x1.A0X(r13);
        C18280x3.A0u(r13, A0X);
        long j2 = j;
        A0X.append(j2);
        Long l3 = l;
        A0X.append(l);
        Long l4 = l2;
        String A0R = AnonymousClass000.A0R(l4, A0X);
        Set set = this.A07;
        if (!set.contains(A0R) && C106855aH.A04(this.A01, r13, this.A03)) {
            this.A00.A02(new C28471gv(r4, new AnonymousClass4JX(r14, 1, this), l3, l4, A0R, j2, z));
            set.add(A0R);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r13.isEmpty() != false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C95804uY r35, X.C138666qn r36, long r37, boolean r39) {
        /*
            r34 = this;
            r0 = 0
            r1 = r36
            X.C162457s7.A0J(r1, r0)
            java.lang.Object r5 = r1.A00
            X.1vv r5 = (X.C34851vv) r5
            java.lang.Object r3 = r5.A00
            X.1w0 r3 = (X.C34901w0) r3
            java.lang.String r12 = r3.A05
            if (r12 != 0) goto L_0x0014
            java.lang.String r12 = ""
        L_0x0014:
            java.lang.Long r0 = r3.A03
            long r1 = X.C18320x8.A03(r0)
            java.lang.Long r0 = r3.A04
            r8 = 0
            if (r0 != 0) goto L_0x0024
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
        L_0x0024:
            long r17 = r0.longValue()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 * r6
            java.lang.String r4 = r3.A06
            java.lang.String r0 = "true"
            boolean r23 = r0.equals(r4)
            java.lang.Object r0 = r5.A02
            X.6qn r0 = (X.C138666qn) r0
            r11 = 0
            if (r0 == 0) goto L_0x00de
            java.lang.Object r13 = r0.A00
            java.util.List r13 = (java.util.List) r13
        L_0x0040:
            java.lang.Object r0 = r5.A01
            X.6qn r0 = (X.C138666qn) r0
            if (r0 == 0) goto L_0x00db
            java.lang.Object r14 = r0.A00
            java.util.List r14 = (java.util.List) r14
        L_0x004a:
            java.lang.Object r0 = r5.A03
            X.1vs r0 = (X.C34821vs) r0
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 != 0) goto L_0x005a
        L_0x0056:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
        L_0x005a:
            long r21 = r0.longValue()
            X.6qn r0 = r3.A01
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00d9
            long r4 = r0.longValue()
            long r4 = r4 * r6
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
        L_0x0071:
            X.6qn r0 = r3.A00
            if (r0 == 0) goto L_0x0079
            java.lang.Object r11 = r0.A00
            java.lang.Long r11 = (java.lang.Long) r11
        L_0x0079:
            r30 = r37
            int r0 = (r37 > r8 ? 1 : (r37 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
            r19 = r17
        L_0x0081:
            X.4Bu r0 = r3.A02
            r9 = r34
            r8 = r35
            r24 = r39
            if (r0 != 0) goto L_0x00e1
            X.2qf r5 = r9.A04
            X.2rZ r4 = r5.A09
            X.34x r3 = r4.A00(r8, r1)
            r2 = 0
            if (r3 == 0) goto L_0x00a2
            X.2SV r0 = r3.A12()
            if (r0 == 0) goto L_0x00ac
            long r0 = r0.A02
            int r6 = (r0 > r37 ? 1 : (r0 == r37 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ac
        L_0x00a2:
            if (r39 == 0) goto L_0x00ab
            if (r2 == 0) goto L_0x00ab
            X.2Zx r0 = r9.A06
            r0.A00(r2)
        L_0x00ab:
            return
        L_0x00ac:
            if (r13 == 0) goto L_0x00b5
            boolean r1 = r13.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00b6
        L_0x00b5:
            r0 = 1
        L_0x00b6:
            r32 = r0 ^ 1
            java.lang.Long r27 = java.lang.Long.valueOf(r21)
            r33 = 0
            r29 = r2
            r25 = r5
            r26 = r3
            r28 = r2
            r25.A02(r26, r27, r28, r29, r30, r32, r33)
            r10 = r5
            r11 = r8
            r12 = r3
            r15 = r30
            r10.A00(r11, r12, r13, r14, r15)
            r4.A04(r3)
            r2 = r3
            goto L_0x00a2
        L_0x00d6:
            r19 = r30
            goto L_0x0081
        L_0x00d9:
            r10 = r11
            goto L_0x0071
        L_0x00db:
            r14 = r11
            goto L_0x004a
        L_0x00de:
            r13 = r11
            goto L_0x0040
        L_0x00e1:
            X.7QC r7 = new X.7QC
            r15 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r24)
            r0.Aw9(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53852nm.A01(X.4uY, X.6qn, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (r14.isEmpty() != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C95804uY r19, java.lang.Integer r20, java.lang.Long r21, java.lang.Long r22, java.lang.String r23, java.util.List r24, java.util.List r25, byte[] r26, long r27, long r29, long r31, long r33, boolean r35, boolean r36) {
        /*
            r18 = this;
            X.2cl r1 = new X.2cl
            r1.<init>()
            r12 = r19
            r1.A02 = r12
            r0 = r23
            r1.A07 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r29)
            r1.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r35)
            r1.A04 = r0
            X.3ST r5 = r1.A00()
            if (r21 == 0) goto L_0x0038
            if (r22 == 0) goto L_0x0038
            if (r20 == 0) goto L_0x0038
            int r0 = r20.intValue()
            r5.A01 = r0
            long r0 = r21.longValue()
            long r2 = r22.longValue()
            X.2k6 r4 = new X.2k6
            r4.<init>(r0, r2)
            r5.A0B = r4
        L_0x0038:
            if (r26 == 0) goto L_0x0040
            X.1EU r0 = X.AnonymousClass1EU.A00(r26)     // Catch:{ 6u5 -> 0x0089, 24W -> 0x008d }
            r5.A0M = r0     // Catch:{ 6u5 -> 0x0089, 24W -> 0x008d }
        L_0x0040:
            r2 = r18
            X.2YX r0 = r2.A05     // Catch:{ 6u5 -> 0x0089, 24W -> 0x008d }
            r3 = r27
            X.34x r4 = r0.A00(r5, r3)     // Catch:{ 6u5 -> 0x0089, 24W -> 0x008d }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r4.A1B(r0)
            X.2qf r3 = r2.A04
            r14 = r24
            if (r24 == 0) goto L_0x005c
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x005d
        L_0x005c:
            r0 = 1
        L_0x005d:
            r10 = r0 ^ 1
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r6 = 0
            r11 = 0
            r8 = r31
            r7 = r6
            r3.A02(r4, r5, r6, r7, r8, r10, r11)
            r15 = r25
            r11 = r3
            r13 = r4
            r16 = r8
            r11.A00(r12, r13, r14, r15, r16)
            boolean r0 = r3.A03(r12, r4)
            if (r0 == 0) goto L_0x0093
            X.2Zx r2 = r2.A06
            X.3Wh r1 = r2.A02
            r0 = 14
            X.C69253Wh.A00(r1, r2, r4, r0)
            if (r36 == 0) goto L_0x0093
            r2.A00(r4)
            return
        L_0x0089:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/invalid historical message"
            goto L_0x0090
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/BadE2eMessageException historical message "
        L_0x0090:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53852nm.A02(X.4uY, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String, java.util.List, java.util.List, byte[], long, long, long, long, boolean, boolean):void");
    }

    public C53852nm(C49712gy r2, C56982ss r3, AnonymousClass1VX r4, AnonymousClass5UP r5, C55632qf r6, AnonymousClass2YX r7, C45402Zx r8) {
        C18260x0.A0c(r4, r3, r2, r5);
        C18260x0.A0U(r6, r7);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = r7;
    }
}
