package X;

/* renamed from: X.05N  reason: invalid class name */
public class AnonymousClass05N extends AnonymousClass05O {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r19.A06() != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r18.A06() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009c, code lost:
        if (r1 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0111, code lost:
        if (r2 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0118, code lost:
        if (r1 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011a, code lost:
        r16 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C05620Uf r21) {
        /*
            r20 = this;
            r8 = r20
            X.0Qs[] r2 = r8.A0n
            X.0Qs r10 = r8.A0W
            r7 = 0
            r2[r7] = r10
            X.0Qs r6 = r8.A0Y
            r12 = 2
            r2[r12] = r6
            X.0Qs r0 = r8.A0X
            r19 = r0
            r11 = 1
            r2[r11] = r0
            X.0Qs r0 = r8.A0S
            r18 = r0
            r13 = 3
            r2[r13] = r0
            r3 = 0
        L_0x001d:
            int r0 = r2.length
            r9 = r21
            if (r3 >= r0) goto L_0x002d
            r1 = r2[r3]
            X.0Qh r0 = r9.A06(r1)
            r1.A02 = r0
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002d:
            int r4 = r8.A00
            if (r4 < 0) goto L_0x0142
            r5 = 4
            if (r4 >= r5) goto L_0x0142
            r17 = r2[r4]
            r3 = 0
        L_0x0037:
            int r0 = r8.A00
            if (r3 >= r0) goto L_0x0077
            X.0R7[] r0 = r8.A01
            r2 = r0[r3]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x004c
            boolean r0 = r2.A0K()
            if (r0 != 0) goto L_0x004c
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x004c:
            if (r4 == 0) goto L_0x0066
            if (r4 == r11) goto L_0x0066
            X.0Fr[] r0 = r2.A0o
            r1 = r0[r11]
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x0049
            X.0Qs r0 = r2.A0Y
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            X.0Qs r0 = r2.A0S
        L_0x0060:
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            r3 = 1
            goto L_0x0078
        L_0x0066:
            X.0Fr[] r0 = r2.A0o
            r1 = r0[r7]
            X.0Fr r0 = X.C02310Fr.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x0049
            X.0Qs r0 = r2.A0W
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            X.0Qs r0 = r2.A0X
            goto L_0x0060
        L_0x0077:
            r3 = 0
        L_0x0078:
            boolean r0 = r10.A06()
            if (r0 != 0) goto L_0x0085
            boolean r0 = r19.A06()
            r2 = 0
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            r2 = 1
        L_0x0086:
            boolean r0 = r6.A06()
            if (r0 != 0) goto L_0x0093
            boolean r0 = r18.A06()
            r1 = 0
            if (r0 == 0) goto L_0x0094
        L_0x0093:
            r1 = 1
        L_0x0094:
            if (r3 != 0) goto L_0x009e
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0111
            if (r0 != r12) goto L_0x0114
            if (r1 != 0) goto L_0x011a
        L_0x009e:
            r16 = 4
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            int r0 = r8.A00
            if (r4 >= r0) goto L_0x011d
            X.0R7[] r0 = r8.A01
            r1 = r0[r4]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r1.A0K()
            if (r0 != 0) goto L_0x00b6
        L_0x00b3:
            int r4 = r4 + 1
            goto L_0x00a1
        L_0x00b6:
            X.0Qs[] r1 = r1.A0n
            int r0 = r8.A00
            r0 = r1[r0]
            X.0Qh r3 = r9.A06(r0)
            int r14 = r8.A00
            r1 = r1[r14]
            r1.A02 = r3
            X.0Qs r0 = r1.A03
            if (r0 == 0) goto L_0x010f
            X.0R7 r0 = r0.A06
            if (r0 != r8) goto L_0x010f
            int r2 = r1.A01
        L_0x00d0:
            if (r14 == 0) goto L_0x00f9
            if (r14 == r12) goto L_0x00f9
            r0 = r17
            X.0Qh r0 = r0.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 + r2
            X.0cp r1 = r9.A02()
            X.0Qh r0 = r9.A03()
            r0.A04 = r7
            r1.A05(r15, r3, r0, r14)
        L_0x00e9:
            r9.A0A(r1)
            r0 = r17
            X.0Qh r14 = r0.A02
            int r1 = r8.A01
            int r1 = r1 + r2
            r0 = r16
            r9.A0E(r14, r3, r1, r0)
            goto L_0x00b3
        L_0x00f9:
            r0 = r17
            X.0Qh r0 = r0.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 - r2
            X.0cp r1 = r9.A02()
            X.0Qh r0 = r9.A03()
            r0.A04 = r7
            r1.A06(r15, r3, r0, r14)
            goto L_0x00e9
        L_0x010f:
            r2 = 0
            goto L_0x00d0
        L_0x0111:
            if (r2 != 0) goto L_0x011a
            goto L_0x009e
        L_0x0114:
            if (r0 == r11) goto L_0x0111
            if (r0 != r13) goto L_0x009e
            if (r1 == 0) goto L_0x009e
        L_0x011a:
            r16 = 5
            goto L_0x00a0
        L_0x011d:
            int r0 = r8.A00
            r2 = 8
            if (r0 != 0) goto L_0x0143
            r0 = r19
            X.0Qh r1 = r0.A02
            X.0Qh r0 = r10.A02
            r9.A0E(r1, r0, r7, r2)
            X.0Qh r1 = r10.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0X
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r5)
            X.0Qh r1 = r10.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0W
        L_0x013d:
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r7)
        L_0x0142:
            return
        L_0x0143:
            if (r0 != r11) goto L_0x0160
            X.0Qh r1 = r10.A02
            r0 = r19
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r2)
            X.0Qh r1 = r10.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0W
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r5)
            X.0Qh r1 = r10.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0X
            goto L_0x013d
        L_0x0160:
            if (r0 != r12) goto L_0x017d
            r0 = r18
            X.0Qh r1 = r0.A02
            X.0Qh r0 = r6.A02
            r9.A0E(r1, r0, r7, r2)
            X.0Qh r1 = r6.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0S
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r5)
            X.0Qh r1 = r6.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0Y
            goto L_0x013d
        L_0x017d:
            if (r0 != r13) goto L_0x0142
            X.0Qh r1 = r6.A02
            r0 = r18
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r2)
            X.0Qh r1 = r6.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0Y
            X.0Qh r0 = r0.A02
            r9.A0E(r1, r0, r7, r5)
            X.0Qh r1 = r6.A02
            X.0R7 r0 = r8.A0Z
            X.0Qs r0 = r0.A0S
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05N.A0D(X.0Uf):void");
    }

    public boolean A0K() {
        return true;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[Barrier] ");
        A0o.append(this.A0f);
        String A0X = AnonymousClass000.A0X(" {", A0o);
        for (int i = 0; i < this.A00; i++) {
            AnonymousClass0R7 r2 = this.A01[i];
            if (i > 0) {
                A0X = AnonymousClass000.A0X(", ", AnonymousClass000.A0l(A0X));
            }
            A0X = AnonymousClass000.A0X(r2.A0f, AnonymousClass000.A0l(A0X));
        }
        return AnonymousClass000.A0g(AnonymousClass000.A0l(A0X));
    }
}
