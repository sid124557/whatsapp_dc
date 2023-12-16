package X;

/* renamed from: X.05P  reason: invalid class name */
public class AnonymousClass05P extends AnonymousClass05J {
    public int A00 = 0;
    public int A01 = 263;
    public int A02;
    public int A03;
    public int A04 = 0;
    public C05620Uf A05 = new C05620Uf();
    public C15700rn A06 = null;
    public AnonymousClass0NP A07 = new AnonymousClass0NP(this);
    public C04750Qm A08 = new C04750Qm(this);
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public C04060Mq[] A0C = new C04060Mq[4];
    public C04060Mq[] A0D = new C04060Mq[4];

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r26 == r6) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if ((r7 & 128) == 128) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02f1 A[LOOP:16: B:168:0x02ef->B:169:0x02f1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0391  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N() {
        /*
            r31 = this;
            r5 = 0
            r4 = r31
            r4.A0P = r5
            r4.A0Q = r5
            int r0 = r4.A05()
            int r28 = java.lang.Math.max(r5, r0)
            int r0 = r4.A04()
            int r27 = java.lang.Math.max(r5, r0)
            r4.A0B = r5
            r4.A09 = r5
            r1 = 64
            int r7 = r4.A01
            r0 = r7 & 64
            boolean r0 = X.AnonymousClass000.A1U(r0, r1)
            r6 = 1
            if (r0 != 0) goto L_0x002f
            r2 = 128(0x80, float:1.794E-43)
            r1 = r7 & r2
            r0 = 0
            if (r1 != r2) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            X.0Uf r3 = r4.A05
            r3.A09 = r5
            if (r7 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            r3.A09 = r6
        L_0x003a:
            X.0Fr[] r2 = r4.A0o
            r26 = r2[r6]
            r25 = r2[r5]
            java.util.ArrayList r0 = r4.A00
            r30 = r0
            X.0Fr r6 = X.C02310Fr.WRAP_CONTENT
            r0 = r25
            if (r0 == r6) goto L_0x0050
            r24 = 0
            r0 = r26
            if (r0 != r6) goto L_0x0052
        L_0x0050:
            r24 = 1
        L_0x0052:
            r4.A00 = r5
            r4.A04 = r5
            int r23 = r30.size()
            r7 = 0
        L_0x005b:
            r0 = r23
            if (r7 >= r0) goto L_0x0073
            java.util.ArrayList r0 = r4.A00
            java.lang.Object r1 = r0.get(r7)
            X.0R7 r1 = (X.AnonymousClass0R7) r1
            boolean r0 = r1 instanceof X.AnonymousClass05J
            if (r0 == 0) goto L_0x0070
            X.05J r1 = (X.AnonymousClass05J) r1
            r1.A0N()
        L_0x0070:
            int r7 = r7 + 1
            goto L_0x005b
        L_0x0073:
            r1 = 0
            r22 = 0
        L_0x0076:
            int r1 = r1 + 1
            r3.A07()     // Catch:{ Exception -> 0x02cd }
            r4.A00 = r5     // Catch:{ Exception -> 0x02cd }
            r4.A04 = r5     // Catch:{ Exception -> 0x02cd }
            r4.A0E(r3)     // Catch:{ Exception -> 0x02cd }
            r7 = 0
        L_0x0083:
            r0 = r23
            if (r7 >= r0) goto L_0x0095
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02cd }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x02cd }
            X.0R7 r0 = (X.AnonymousClass0R7) r0     // Catch:{ Exception -> 0x02cd }
            r0.A0E(r3)     // Catch:{ Exception -> 0x02cd }
            int r7 = r7 + 1
            goto L_0x0083
        L_0x0095:
            r4.A0D(r3)     // Catch:{ Exception -> 0x02cd }
            java.util.ArrayList r12 = r4.A00     // Catch:{ Exception -> 0x02cd }
            int r11 = r12.size()     // Catch:{ Exception -> 0x02cd }
            r10 = 0
            r8 = 0
        L_0x00a0:
            r9 = 1
            if (r10 >= r11) goto L_0x00b7
            java.lang.Object r7 = r12.get(r10)     // Catch:{ Exception -> 0x02cd }
            X.0R7 r7 = (X.AnonymousClass0R7) r7     // Catch:{ Exception -> 0x02cd }
            boolean[] r0 = r7.A0s     // Catch:{ Exception -> 0x02cd }
            r0[r5] = r5     // Catch:{ Exception -> 0x02cd }
            r0[r9] = r5     // Catch:{ Exception -> 0x02cd }
            boolean r0 = r7 instanceof X.AnonymousClass05N     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x00b4
            r8 = 1
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x00a0
        L_0x00b7:
            if (r8 == 0) goto L_0x00ec
            r10 = 0
        L_0x00ba:
            if (r10 >= r11) goto L_0x00ec
            java.lang.Object r8 = r12.get(r10)     // Catch:{ Exception -> 0x02cd }
            X.0R7 r8 = (X.AnonymousClass0R7) r8     // Catch:{ Exception -> 0x02cd }
            boolean r0 = r8 instanceof X.AnonymousClass05N     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x00e9
            X.05N r8 = (X.AnonymousClass05N) r8     // Catch:{ Exception -> 0x02cd }
            r7 = 0
        L_0x00c9:
            int r0 = r8.A00     // Catch:{ Exception -> 0x02cd }
            if (r7 >= r0) goto L_0x00e9
            X.0R7[] r0 = r8.A01     // Catch:{ Exception -> 0x02cd }
            r14 = r0[r7]     // Catch:{ Exception -> 0x02cd }
            int r13 = r8.A00     // Catch:{ Exception -> 0x02cd }
            if (r13 == 0) goto L_0x00e2
            if (r13 == r9) goto L_0x00e2
            r0 = 2
            if (r13 == r0) goto L_0x00dd
            r0 = 3
            if (r13 != r0) goto L_0x00e6
        L_0x00dd:
            boolean[] r0 = r14.A0s     // Catch:{ Exception -> 0x02cd }
            r0[r9] = r9     // Catch:{ Exception -> 0x02cd }
            goto L_0x00e6
        L_0x00e2:
            boolean[] r0 = r14.A0s     // Catch:{ Exception -> 0x02cd }
            r0[r5] = r9     // Catch:{ Exception -> 0x02cd }
        L_0x00e6:
            int r7 = r7 + 1
            goto L_0x00c9
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            if (r8 >= r11) goto L_0x0105
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02cd }
            java.lang.Object r7 = r0.get(r8)     // Catch:{ Exception -> 0x02cd }
            X.0R7 r7 = (X.AnonymousClass0R7) r7     // Catch:{ Exception -> 0x02cd }
            boolean r0 = r7 instanceof X.AnonymousClass05M     // Catch:{ Exception -> 0x02cd }
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r7 instanceof X.AnonymousClass05K     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0102
        L_0x00ff:
            r7.A0D(r3)     // Catch:{ Exception -> 0x02cd }
        L_0x0102:
            int r8 = r8 + 1
            goto L_0x00ed
        L_0x0105:
            r10 = 0
        L_0x0106:
            if (r10 >= r11) goto L_0x01d8
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02cd }
            java.lang.Object r8 = r0.get(r10)     // Catch:{ Exception -> 0x02cd }
            X.0R7 r8 = (X.AnonymousClass0R7) r8     // Catch:{ Exception -> 0x02cd }
            boolean r0 = r8 instanceof X.AnonymousClass05P     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0133
            X.0Fr[] r13 = r8.A0o     // Catch:{ Exception -> 0x02cd }
            r12 = r13[r5]     // Catch:{ Exception -> 0x02cd }
            r7 = r13[r9]     // Catch:{ Exception -> 0x02cd }
            if (r12 != r6) goto L_0x0120
            X.0Fr r0 = X.C02310Fr.FIXED     // Catch:{ Exception -> 0x02cd }
            r13[r5] = r0     // Catch:{ Exception -> 0x02cd }
        L_0x0120:
            if (r7 != r6) goto L_0x0126
            X.0Fr r0 = X.C02310Fr.FIXED     // Catch:{ Exception -> 0x02cd }
            r13[r9] = r0     // Catch:{ Exception -> 0x02cd }
        L_0x0126:
            r8.A0D(r3)     // Catch:{ Exception -> 0x02cd }
            if (r12 != r6) goto L_0x012d
            r13[r5] = r12     // Catch:{ Exception -> 0x02cd }
        L_0x012d:
            if (r7 != r6) goto L_0x01d4
            r13[r9] = r7     // Catch:{ Exception -> 0x02cd }
            goto L_0x01d4
        L_0x0133:
            r0 = -1
            r8.A0B = r0     // Catch:{ Exception -> 0x02cd }
            r8.A0M = r0     // Catch:{ Exception -> 0x02cd }
            r0 = r2[r5]     // Catch:{ Exception -> 0x02cd }
            r14 = 2
            if (r0 == r6) goto L_0x0175
            X.0Fr[] r0 = r8.A0o     // Catch:{ Exception -> 0x02cd }
            r7 = r0[r5]     // Catch:{ Exception -> 0x02cd }
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT     // Catch:{ Exception -> 0x02cd }
            if (r7 != r0) goto L_0x0175
            X.0Qs r15 = r8.A0W     // Catch:{ Exception -> 0x02cd }
            int r12 = r15.A01     // Catch:{ Exception -> 0x02cd }
            int r7 = r4.A05()     // Catch:{ Exception -> 0x02cd }
            X.0Qs r13 = r8.A0X     // Catch:{ Exception -> 0x02cd }
            int r0 = r13.A01     // Catch:{ Exception -> 0x02cd }
            int r7 = r7 - r0
            X.0Qh r0 = r3.A06(r15)     // Catch:{ Exception -> 0x02cd }
            r15.A02 = r0     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r3.A06(r13)     // Catch:{ Exception -> 0x02cd }
            r13.A02 = r0     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r15.A02     // Catch:{ Exception -> 0x02cd }
            r3.A0D(r0, r12)     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r13.A02     // Catch:{ Exception -> 0x02cd }
            r3.A0D(r0, r7)     // Catch:{ Exception -> 0x02cd }
            r8.A0B = r14     // Catch:{ Exception -> 0x02cd }
            r8.A0P = r12     // Catch:{ Exception -> 0x02cd }
            int r7 = r7 - r12
            r8.A0O = r7     // Catch:{ Exception -> 0x02cd }
            int r0 = r8.A0J     // Catch:{ Exception -> 0x02cd }
            if (r7 >= r0) goto L_0x0175
            r8.A0O = r0     // Catch:{ Exception -> 0x02cd }
        L_0x0175:
            r0 = r2[r9]     // Catch:{ Exception -> 0x02cd }
            if (r0 == r6) goto L_0x01c9
            X.0Fr[] r0 = r8.A0o     // Catch:{ Exception -> 0x02cd }
            r7 = r0[r9]     // Catch:{ Exception -> 0x02cd }
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT     // Catch:{ Exception -> 0x02cd }
            if (r7 != r0) goto L_0x01c9
            X.0Qs r15 = r8.A0Y     // Catch:{ Exception -> 0x02cd }
            int r13 = r15.A01     // Catch:{ Exception -> 0x02cd }
            int r12 = r4.A04()     // Catch:{ Exception -> 0x02cd }
            X.0Qs r7 = r8.A0S     // Catch:{ Exception -> 0x02cd }
            int r0 = r7.A01     // Catch:{ Exception -> 0x02cd }
            int r12 = r12 - r0
            X.0Qh r0 = r3.A06(r15)     // Catch:{ Exception -> 0x02cd }
            r15.A02 = r0     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r3.A06(r7)     // Catch:{ Exception -> 0x02cd }
            r7.A02 = r0     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r15.A02     // Catch:{ Exception -> 0x02cd }
            r3.A0D(r0, r13)     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r7.A02     // Catch:{ Exception -> 0x02cd }
            r3.A0D(r0, r12)     // Catch:{ Exception -> 0x02cd }
            int r0 = r8.A07     // Catch:{ Exception -> 0x02cd }
            if (r0 > 0) goto L_0x01ae
            int r7 = r8.A0N     // Catch:{ Exception -> 0x02cd }
            r0 = 8
            if (r7 != r0) goto L_0x01bc
        L_0x01ae:
            X.0Qs r0 = r8.A0R     // Catch:{ Exception -> 0x02cd }
            X.0Qh r7 = r3.A06(r0)     // Catch:{ Exception -> 0x02cd }
            r0.A02 = r7     // Catch:{ Exception -> 0x02cd }
            int r0 = r8.A07     // Catch:{ Exception -> 0x02cd }
            int r0 = r0 + r13
            r3.A0D(r7, r0)     // Catch:{ Exception -> 0x02cd }
        L_0x01bc:
            r8.A0M = r14     // Catch:{ Exception -> 0x02cd }
            r8.A0Q = r13     // Catch:{ Exception -> 0x02cd }
            int r12 = r12 - r13
            r8.A09 = r12     // Catch:{ Exception -> 0x02cd }
            int r0 = r8.A0I     // Catch:{ Exception -> 0x02cd }
            if (r12 >= r0) goto L_0x01c9
            r8.A09 = r0     // Catch:{ Exception -> 0x02cd }
        L_0x01c9:
            boolean r0 = r8 instanceof X.AnonymousClass05M     // Catch:{ Exception -> 0x02cd }
            if (r0 != 0) goto L_0x01d4
            boolean r0 = r8 instanceof X.AnonymousClass05K     // Catch:{ Exception -> 0x02cd }
            if (r0 != 0) goto L_0x01d4
            r8.A0D(r3)     // Catch:{ Exception -> 0x02cd }
        L_0x01d4:
            int r10 = r10 + 1
            goto L_0x0106
        L_0x01d8:
            int r0 = r4.A00     // Catch:{ Exception -> 0x02cd }
            if (r0 <= 0) goto L_0x01df
            A01(r3, r4, r5)     // Catch:{ Exception -> 0x02cd }
        L_0x01df:
            int r0 = r4.A04     // Catch:{ Exception -> 0x02cd }
            if (r0 <= 0) goto L_0x01e6
            A01(r3, r4, r9)     // Catch:{ Exception -> 0x02cd }
        L_0x01e6:
            boolean r0 = r3.A09     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x020a
            r7 = 0
        L_0x01eb:
            int r9 = r3.A04     // Catch:{ Exception -> 0x02cd }
            if (r7 >= r9) goto L_0x01fa
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r0 = r0[r7]     // Catch:{ Exception -> 0x02cd }
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x020a
            int r7 = r7 + 1
            goto L_0x01eb
        L_0x01fa:
            r8 = 0
        L_0x01fb:
            if (r8 >= r9) goto L_0x02e0
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r0 = r0[r8]     // Catch:{ Exception -> 0x02cd }
            X.0Qh r7 = r0.A02     // Catch:{ Exception -> 0x02cd }
            float r0 = r0.A00     // Catch:{ Exception -> 0x02cd }
            r7.A00 = r0     // Catch:{ Exception -> 0x02cd }
            int r8 = r8 + 1
            goto L_0x01fb
        L_0x020a:
            X.0rl r0 = r3.A07     // Catch:{ Exception -> 0x02cd }
            r29 = r0
            r9 = 0
        L_0x020f:
            int r0 = r3.A04     // Catch:{ Exception -> 0x02cd }
            r16 = 0
            if (r9 >= r0) goto L_0x02b6
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r8 = r0[r9]     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r8.A02     // Catch:{ Exception -> 0x02cd }
            X.0Fq r7 = r0.A06     // Catch:{ Exception -> 0x02cd }
            X.0Fq r21 = X.C02300Fq.UNRESTRICTED     // Catch:{ Exception -> 0x02cd }
            r0 = r21
            if (r7 == r0) goto L_0x022a
            float r0 = r8.A00     // Catch:{ Exception -> 0x02cd }
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x022a
            goto L_0x022d
        L_0x022a:
            int r9 = r9 + 1
            goto L_0x020f
        L_0x022d:
            r20 = 0
            r14 = 0
        L_0x0230:
            int r14 = r14 + 1
            r13 = -1
            r19 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 0
            r11 = -1
            r18 = -1
            r10 = 0
        L_0x023b:
            int r0 = r3.A04     // Catch:{ Exception -> 0x02cd }
            if (r12 >= r0) goto L_0x028e
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r9 = r0[r12]     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r9.A02     // Catch:{ Exception -> 0x02cd }
            X.0Fq r7 = r0.A06     // Catch:{ Exception -> 0x02cd }
            r0 = r21
            if (r7 == r0) goto L_0x028b
            boolean r0 = r9.A04     // Catch:{ Exception -> 0x02cd }
            if (r0 != 0) goto L_0x028b
            float r0 = r9.A00     // Catch:{ Exception -> 0x02cd }
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x028b
            r15 = 1
        L_0x0256:
            int r0 = r3.A03     // Catch:{ Exception -> 0x02cd }
            if (r15 >= r0) goto L_0x028b
            X.0M1 r0 = r3.A0D     // Catch:{ Exception -> 0x02cd }
            X.0Qh[] r0 = r0.A03     // Catch:{ Exception -> 0x02cd }
            r8 = r0[r15]     // Catch:{ Exception -> 0x02cd }
            X.0uW r0 = r9.A01     // Catch:{ Exception -> 0x02cd }
            float r17 = r0.B3n(r8)     // Catch:{ Exception -> 0x02cd }
            int r0 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0286
            r7 = 0
        L_0x026b:
            float[] r0 = r8.A0A     // Catch:{ Exception -> 0x02cd }
            r16 = r0[r7]     // Catch:{ Exception -> 0x02cd }
            float r16 = r16 / r17
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0277
            if (r7 == r10) goto L_0x0279
        L_0x0277:
            if (r7 <= r10) goto L_0x027f
        L_0x0279:
            r18 = r15
            r10 = r7
            r19 = r16
            r11 = r12
        L_0x027f:
            int r7 = r7 + 1
            r0 = 9
            if (r7 >= r0) goto L_0x0286
            goto L_0x026b
        L_0x0286:
            int r15 = r15 + 1
            r16 = 0
            goto L_0x0256
        L_0x028b:
            int r12 = r12 + 1
            goto L_0x023b
        L_0x028e:
            if (r11 == r13) goto L_0x0291
            goto L_0x0294
        L_0x0291:
            r20 = 1
            goto L_0x02ac
        L_0x0294:
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r7 = r0[r11]     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r7.A02     // Catch:{ Exception -> 0x02cd }
            r0.A01 = r13     // Catch:{ Exception -> 0x02cd }
            X.0M1 r0 = r3.A0D     // Catch:{ Exception -> 0x02cd }
            X.0Qh[] r0 = r0.A03     // Catch:{ Exception -> 0x02cd }
            r0 = r0[r18]     // Catch:{ Exception -> 0x02cd }
            r7.A04(r0)     // Catch:{ Exception -> 0x02cd }
            X.0Qh r0 = r7.A02     // Catch:{ Exception -> 0x02cd }
            r0.A01 = r11     // Catch:{ Exception -> 0x02cd }
            r0.A04(r7)     // Catch:{ Exception -> 0x02cd }
        L_0x02ac:
            int r0 = r3.A03     // Catch:{ Exception -> 0x02cd }
            int r0 = r0 / 2
            if (r14 > r0) goto L_0x02b6
            if (r20 != 0) goto L_0x02b6
            goto L_0x0230
        L_0x02b6:
            r0 = r29
            r3.A0C(r0)     // Catch:{ Exception -> 0x02cd }
            r8 = 0
        L_0x02bc:
            int r0 = r3.A04     // Catch:{ Exception -> 0x02cd }
            if (r8 >= r0) goto L_0x02e0
            X.0cp[] r0 = r3.A0A     // Catch:{ Exception -> 0x02cd }
            r0 = r0[r8]     // Catch:{ Exception -> 0x02cd }
            X.0Qh r7 = r0.A02     // Catch:{ Exception -> 0x02cd }
            float r0 = r0.A00     // Catch:{ Exception -> 0x02cd }
            r7.A00 = r0     // Catch:{ Exception -> 0x02cd }
            int r8 = r8 + 1
            goto L_0x02bc
        L_0x02cd:
            r9 = move-exception
            r9.printStackTrace()
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EXCEPTION : "
            java.lang.String r0 = X.AnonymousClass000.A0P(r9, r0, r7)
            r8.println(r0)
        L_0x02e0:
            boolean[] r10 = X.AnonymousClass0JT.A00
            r0 = 2
            r9 = 0
            r10[r0] = r5
            r4.A0F(r3)
            java.util.ArrayList r8 = r4.A00
            int r7 = r8.size()
        L_0x02ef:
            if (r9 >= r7) goto L_0x02fd
            java.lang.Object r0 = r8.get(r9)
            X.0R7 r0 = (X.AnonymousClass0R7) r0
            r0.A0F(r3)
            int r9 = r9 + 1
            goto L_0x02ef
        L_0x02fd:
            if (r24 == 0) goto L_0x0362
            r0 = 8
            if (r1 >= r0) goto L_0x0362
            r0 = 2
            boolean r0 = r10[r0]
            if (r0 == 0) goto L_0x0362
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x030b:
            r0 = r23
            if (r11 >= r0) goto L_0x032e
            java.util.ArrayList r0 = r4.A00
            java.lang.Object r8 = r0.get(r11)
            X.0R7 r8 = (X.AnonymousClass0R7) r8
            int r7 = r8.A0P
            int r0 = r8.A05()
            int r10 = X.AnonymousClass001.A0B(r7, r0, r10)
            int r7 = r8.A0Q
            int r0 = r8.A04()
            int r9 = X.AnonymousClass001.A0B(r7, r0, r9)
            int r11 = r11 + 1
            goto L_0x030b
        L_0x032e:
            int r0 = r4.A0J
            int r8 = java.lang.Math.max(r0, r10)
            int r0 = r4.A0I
            int r7 = java.lang.Math.max(r0, r9)
            r0 = r25
            if (r0 != r6) goto L_0x0360
            int r0 = r4.A05()
            if (r0 >= r8) goto L_0x0360
            r4.A0B(r8)
            r2[r5] = r6
            r10 = 1
            r22 = 1
        L_0x034c:
            r0 = r26
            if (r0 != r6) goto L_0x0363
            int r0 = r4.A04()
            if (r0 >= r7) goto L_0x0363
            r4.A0A(r7)
            r0 = 1
            r2[r0] = r6
            r10 = 1
            r22 = 1
            goto L_0x0363
        L_0x0360:
            r10 = 0
            goto L_0x034c
        L_0x0362:
            r10 = 0
        L_0x0363:
            int r0 = r4.A0J
            int r7 = r4.A05()
            int r0 = java.lang.Math.max(r0, r7)
            if (r0 <= r7) goto L_0x0379
            r4.A0B(r0)
            X.0Fr r0 = X.C02310Fr.FIXED
            r2[r5] = r0
            r10 = 1
            r22 = 1
        L_0x0379:
            int r0 = r4.A0I
            int r9 = r4.A04()
            int r0 = java.lang.Math.max(r0, r9)
            if (r0 <= r9) goto L_0x0391
            r4.A0A(r0)
            X.0Fr r7 = X.C02310Fr.FIXED
            r0 = 1
            r2[r0] = r7
        L_0x038d:
            r22 = 1
            goto L_0x0076
        L_0x0391:
            r8 = 1
            if (r22 != 0) goto L_0x03c6
            r0 = r2[r5]
            if (r0 != r6) goto L_0x03b0
            if (r28 <= 0) goto L_0x03b0
            int r7 = r4.A05()
            r0 = r28
            if (r7 <= r0) goto L_0x03b0
            r4.A0B = r8
            X.0Fr r0 = X.C02310Fr.FIXED
            r2[r5] = r0
            r0 = r28
            r4.A0B(r0)
            r10 = 1
            r22 = 1
        L_0x03b0:
            r0 = r2[r8]
            if (r0 != r6) goto L_0x03c6
            if (r27 <= 0) goto L_0x03c6
            r0 = r27
            if (r9 <= r0) goto L_0x03c6
            r4.A09 = r8
            X.0Fr r0 = X.C02310Fr.FIXED
            r2[r8] = r0
            r0 = r27
            r4.A0A(r0)
            goto L_0x038d
        L_0x03c6:
            if (r10 != 0) goto L_0x0076
            r0 = r30
            r4.A00 = r0
            if (r22 == 0) goto L_0x03d2
            r2[r5] = r25
            r2[r8] = r26
        L_0x03d2:
            X.0M1 r0 = r3.A0D
            r4.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05P.A0N():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0195, code lost:
        if (r7 == r38) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0197, code lost:
        r5 = r5 + r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x019c, code lost:
        if (r25 == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01a0, code lost:
        if (r7 == r38) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a2, code lost:
        if (r7 == r1) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a4, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a5, code lost:
        r3 = r8.A03;
        r2 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a9, code lost:
        if (r3 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ab, code lost:
        r10 = r8.A02;
        r9 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01af, code lost:
        if (r7 != r1) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b1, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b2, code lost:
        r2.A0F(r10, r9, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b5, code lost:
        if (r11 == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b7, code lost:
        if (r25 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b9, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ba, code lost:
        r2.A0E(r8.A02, r8.A03.A02, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c3, code lost:
        if (r15 == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c9, code lost:
        if (r7.A0N == 8) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01cf, code lost:
        if (r7.A0o[r43] != r4) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01d1, code lost:
        r5 = r7.A0n;
        r6 = 0;
        r2.A0F(r5[r22 + 1].A02, r5[r22].A02, 0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e2, code lost:
        r2.A0F(r7.A0n[r22].A02, r40.A0n[r22].A02, r6, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f5, code lost:
        r24 = r22 + 1;
        r3 = r7.A0n[r24].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01fd, code lost:
        if (r3 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ff, code lost:
        r5 = r3.A06;
        r3 = r5.A0n[r22].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0207, code lost:
        if (r3 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020b, code lost:
        if (r3.A06 != r7) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020d, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0210, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0212, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0220, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0222, code lost:
        if (r0 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0224, code lost:
        r7 = r37.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x022c, code lost:
        if (r7[r24].A03 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x022e, code lost:
        r6 = r0.A0n[r24];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0236, code lost:
        if (r0.A0o[r43] != r4) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x023c, code lost:
        if (r0.A0l[r43] != 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x023e, code lost:
        if (r25 != false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0240, code lost:
        r4 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0246, code lost:
        if (r4.A06 != r40) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0248, code lost:
        r8 = r6.A02;
        r5 = r4.A02;
        r4 = -r6.A00();
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0252, code lost:
        r2.A0E(r8, r5, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0255, code lost:
        r2.A0G(r6.A02, r7[r24].A03.A02, -r6.A00(), 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0266, code lost:
        if (r15 == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0268, code lost:
        r6 = r40.A0n[r24].A02;
        r3 = r37.A0n[r24];
        r2.A0F(r6, r3.A02, r3.A00(), 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0281, code lost:
        r3 = r14.A0E;
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0285, code lost:
        if (r3 == null) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0287, code lost:
        r19 = r20.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028e, code lost:
        if (r19 <= 1) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0292, code lost:
        if (r14.A0I == false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0296, code lost:
        if (r14.A0G != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0298, code lost:
        r13 = (float) r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x029b, code lost:
        r3 = 0.0f;
        r5 = null;
        r11 = 0;
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02a0, code lost:
        r9 = (X.AnonymousClass0R7) r20.get(r11);
        r18 = r9.A0j[r43];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02ae, code lost:
        if (r18 >= r3) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02b2, code lost:
        if (r14.A0G == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02b4, code lost:
        r4 = r9.A0n;
        r2.A0E(r4[r24].A02, r4[r22].A02, 0, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02c3, code lost:
        r11 = r11 + 1;
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02c8, code lost:
        if (r11 >= r19) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02cd, code lost:
        if (r18 != r3) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02cf, code lost:
        r4 = r9.A0n;
        r2.A0E(r4[r24].A02, r4[r22].A02, 0, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02e0, code lost:
        r18 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02e2, code lost:
        if (r5 == null) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02e4, code lost:
        r5 = r5.A0n;
        r28 = r5[r22].A02;
        r15 = r5[r24].A02;
        r5 = r9.A0n;
        r8 = r5[r22].A02;
        r7 = r5[r24].A02;
        r6 = r2.A02();
        r6.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0306, code lost:
        if (r13 == r3) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x030a, code lost:
        if (r10 == r18) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x030e, code lost:
        if (r10 != r3) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0310, code lost:
        X.C07790cp.A01(r6, r28, r15, 1.0f, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0315, code lost:
        r2.A0A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0318, code lost:
        r5 = r9;
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x031e, code lost:
        if (r18 != r3) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0320, code lost:
        X.C07790cp.A01(r6, r8, r7, 1.0f, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0324, code lost:
        r10 = (r10 / r13) / (r18 / r13);
        X.C07790cp.A01(r6, r28, r15, 1.0f, -1.0f);
        X.C07790cp.A00(r6, r7, r10);
        r6.A01.Bhm(r8, -r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0337, code lost:
        X.C07790cp.A01(r6, r28, r15, 1.0f, -1.0f);
        X.C07790cp.A01(r6, r7, r8, 1.0f, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0340, code lost:
        if (r25 == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0342, code lost:
        r5 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0348, code lost:
        if (r5.A06 != r40) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x034a, code lost:
        r8 = r6.A02;
        r5 = r5.A02;
        r4 = -r6.A00();
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0356, code lost:
        if (r1 == null) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0358, code lost:
        if (r1 == r0) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x035a, code lost:
        if (r25 == false) goto L_0x03f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x035c, code lost:
        r5 = r38.A0n[r22];
        r4 = r37.A0n[r24];
        r3 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x036a, code lost:
        if (r3 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x036c, code lost:
        r5 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x036e, code lost:
        r3 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0370, code lost:
        if (r3 == null) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0372, code lost:
        r6 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0374, code lost:
        r4 = r1.A0n[r22];
        r3 = r0.A0n[r24];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x037c, code lost:
        if (r5 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x037e, code lost:
        if (r6 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0380, code lost:
        if (r43 != 0) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0382, code lost:
        r8 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0384, code lost:
        r2.A0H(r4.A02, r5, r6, r3.A02, r8, r4.A00(), r3.A00(), 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0395, code lost:
        if (r27 != false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0397, code lost:
        if (r26 == false) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0399, code lost:
        if (r1 == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x039b, code lost:
        if (r1 == r0) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x039d, code lost:
        r6 = r1.A0n;
        r5 = r6[r22];
        r4 = r0.A0n[r24];
        r9 = r4;
        r3 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03a8, code lost:
        if (r3 == null) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03aa, code lost:
        r7 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03ac, code lost:
        r3 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03ae, code lost:
        if (r3 == null) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03b0, code lost:
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03b2, code lost:
        r3 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03b4, code lost:
        if (r3 == r0) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03b6, code lost:
        r3 = r3.A0n[r24].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03bc, code lost:
        if (r3 == null) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03be, code lost:
        r16 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03c2, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03c4, code lost:
        if (r1 != r0) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03c6, code lost:
        r4 = r6[r24];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03c8, code lost:
        if (r7 == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03ca, code lost:
        if (r8 == null) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03cc, code lost:
        r2.A0H(r5.A02, r7, r8, r4.A02, 0.5f, r5.A00(), r9.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03df, code lost:
        r21 = r21 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03e3, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03e6, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03e9, code lost:
        r8 = r12.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03ec, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03ef, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03f3, code lost:
        if (r27 == false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03f5, code lost:
        if (r1 == null) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x03f7, code lost:
        r4 = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03f9, code lost:
        if (r4 <= 0) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03fb, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03fe, code lost:
        if (r14.A05 == r4) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0400, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0401, code lost:
        r7 = r1;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0403, code lost:
        r5 = r7.A0q[r43];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0407, code lost:
        if (r5 == null) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x040d, code lost:
        if (r5.A0N != 8) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x040f, code lost:
        r5 = r5.A0q[r43];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0414, code lost:
        if (r7 != r0) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0416, code lost:
        r9 = r7.A0n[r22];
        r4 = r9.A02;
        r3 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x041e, code lost:
        if (r3 == null) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0420, code lost:
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0422, code lost:
        if (r6 == r7) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0424, code lost:
        r8 = r6.A0n[r24].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x042a, code lost:
        r31 = r9.A00();
        r32 = r7.A0n[r24].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0436, code lost:
        if (r5 == null) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0438, code lost:
        r11 = r5.A0n[r22];
        r9 = r11.A02;
        r10 = r7.A0n[r24].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0444, code lost:
        r32 = r32 + r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x044a, code lost:
        r31 = r31 + r6.A0n[r24].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0454, code lost:
        if (r4 == null) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0456, code lost:
        if (r8 == null) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0458, code lost:
        if (r9 == null) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x045a, code lost:
        if (r10 == null) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x045c, code lost:
        if (r7 != r1) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x045e, code lost:
        r31 = r1.A0n[r22].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0466, code lost:
        if (r7 != r0) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0468, code lost:
        r32 = r0.A0n[r24].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0470, code lost:
        r33 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0472, code lost:
        if (r12 == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0474, code lost:
        r33 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0476, code lost:
        r2.A0H(r4, r8, r9, r10, 0.5f, r31, r32, r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0489, code lost:
        if (r7.A0N == 8) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x048b, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x048c, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x048d, code lost:
        if (r5 == null) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0491, code lost:
        r11 = r37.A0n[r24].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0499, code lost:
        if (r11 == null) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x049b, code lost:
        r9 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x049d, code lost:
        r10 = r7.A0n[r24].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04a3, code lost:
        if (r11 == null) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04a6, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04a9, code lost:
        if (r7 != r1) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x04ab, code lost:
        if (r6 != r7) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x04ad, code lost:
        r3 = r38.A0n[r22].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04b5, code lost:
        if (r3 == null) goto L_0x04bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04b7, code lost:
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04bb, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04bf, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04c3, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04c5, code lost:
        if (r26 == false) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04c7, code lost:
        if (r1 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04c9, code lost:
        r4 = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04cb, code lost:
        if (r4 <= 0) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04cd, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04d0, code lost:
        if (r14.A05 == r4) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04d2, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04d3, code lost:
        r7 = r1;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04d5, code lost:
        r5 = r7.A0q[r43];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x04d9, code lost:
        if (r5 == null) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04dd, code lost:
        if (r5.A0N != r8) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x04df, code lost:
        r5 = r5.A0q[r43];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04e4, code lost:
        if (r7 == r1) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04e6, code lost:
        if (r7 == r0) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04e8, code lost:
        if (r5 == null) goto L_0x05c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x04ea, code lost:
        if (r5 != r0) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04ec, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x04ee, code lost:
        r10 = r7.A0n;
        r9 = r10[r22];
        r8 = r9.A02;
        r4 = r6.A0n[r24].A02;
        r11 = r9.A00();
        r35 = r10[r24].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0504, code lost:
        if (r5 == null) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0506, code lost:
        r10 = r5.A0n[r22];
        r9 = r10.A02;
        r3 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x050e, code lost:
        if (r3 == null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0510, code lost:
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0512, code lost:
        r35 = r35 + r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0518, code lost:
        r34 = r6.A0n[r24].A00() + r11;
        r36 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0524, code lost:
        if (r12 == false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0526, code lost:
        r36 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0528, code lost:
        if (r8 == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x052a, code lost:
        if (r4 == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x052c, code lost:
        if (r9 == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x052e, code lost:
        if (r3 == null) goto L_0x05ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0530, code lost:
        r10 = 8;
        r2.A0H(r8, r4, r9, r3, 0.5f, r34, r35, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0543, code lost:
        if (r7.A0N != r10) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0545, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0546, code lost:
        r6 = r7;
        r8 = 8;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x054a, code lost:
        if (r5 != null) goto L_0x04d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x054c, code lost:
        r10 = r1.A0n[r22];
        r4 = r38.A0n[r22].A03;
        r8 = r0.A0n[r24];
        r9 = r37.A0n[r24].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0564, code lost:
        if (r4 == null) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0566, code lost:
        if (r1 == r0) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0568, code lost:
        r7 = 5;
        r2.A0E(r10.A02, r4.A02, r10.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0574, code lost:
        if (r9 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0576, code lost:
        if (r1 == r0) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0578, code lost:
        r2.A0E(r8.A02, r9.A02, -r8.A00(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0586, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0587, code lost:
        if (r9 == null) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0589, code lost:
        r6 = r10.A02;
        r5 = r4.A02;
        r34 = r10.A00();
        r2.A0H(r6, r5, r8.A02, r9.A02, 0.5f, r34, r8.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05ab, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05ad, code lost:
        r10 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05b0, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05b4, code lost:
        r10 = r0.A0n[r22];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x05b8, code lost:
        if (r10 == null) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05ba, code lost:
        r9 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05bc, code lost:
        r3 = r7.A0n[r24].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05c2, code lost:
        if (r10 == null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05c6, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x05c9, code lost:
        r10 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0167, code lost:
        if (r2 != 1) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016d, code lost:
        if (r2 != 2) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016f, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0171, code lost:
        r7 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0173, code lost:
        r8 = r7.A0n[r22];
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0178, code lost:
        if (r25 == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017a, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017b, code lost:
        r5 = r8.A00();
        r2 = r7.A0o[r43];
        r4 = X.C02310Fr.MATCH_CONSTRAINT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0185, code lost:
        if (r2 != r4) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0187, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018c, code lost:
        if (r7.A0l[r43] == 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018f, code lost:
        r3 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0191, code lost:
        if (r3 == null) goto L_0x019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C05620Uf r41, X.AnonymousClass05P r42, int r43) {
        /*
            r21 = 0
            r40 = r42
            r0 = r40
            if (r43 != 0) goto L_0x05cd
            int r0 = r0.A00
            r39 = r0
            r0 = r40
            X.0Mq[] r0 = r0.A0C
            r23 = r0
            r22 = 0
        L_0x0014:
            r1 = r21
            r0 = r39
            if (r1 >= r0) goto L_0x05db
            r14 = r23[r21]
            boolean r0 = r14.A0F
            if (r0 != 0) goto L_0x013a
            int r5 = r14.A01
            r6 = 2
            int r11 = r5 * 2
            X.0R7 r4 = r14.A07
            r3 = r4
            r2 = 1
            r7 = r4
        L_0x002a:
            int r0 = r14.A05
            int r0 = r0 + 1
            r14.A05 = r0
            X.0R7[] r0 = r4.A0q
            r1 = 0
            r0[r5] = r1
            X.0R7[] r0 = r4.A0p
            r0[r5] = r1
            int r1 = r4.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00d6
            int r0 = r14.A04
            int r0 = r0 + 1
            r14.A04 = r0
            X.0Fr[] r1 = r4.A0o
            if (r5 != 0) goto L_0x0101
            r0 = 0
        L_0x004a:
            r0 = r1[r0]
            X.0Fr r1 = X.C02310Fr.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x005b
            int r8 = r14.A03
            if (r5 != 0) goto L_0x00fb
            int r0 = r4.A05()
        L_0x0058:
            int r8 = r8 + r0
            r14.A03 = r8
        L_0x005b:
            int r9 = r14.A03
            X.0Qs[] r8 = r4.A0n
            r0 = r8[r11]
            int r10 = r0.A00()
            int r9 = r9 + r10
            r14.A03 = r9
            int r0 = r11 + 1
            r0 = r8[r0]
            int r8 = r0.A00()
            int r9 = r9 + r8
            r14.A03 = r9
            int r0 = r14.A02
            int r0 = r0 + r10
            r14.A02 = r0
            int r0 = r0 + r8
            r14.A02 = r0
            X.0R7 r0 = r14.A09
            if (r0 != 0) goto L_0x0081
            r14.A09 = r4
        L_0x0081:
            r14.A0D = r4
            X.0Fr[] r0 = r4.A0o
            r0 = r0[r5]
            if (r0 != r1) goto L_0x00d6
            int[] r0 = r4.A0l
            r8 = r0[r5]
            r10 = 0
            if (r8 == 0) goto L_0x0095
            r0 = 3
            if (r8 == r0) goto L_0x0095
            if (r8 != r6) goto L_0x00d6
        L_0x0095:
            int r0 = r14.A06
            int r0 = r0 + 1
            r14.A06 = r0
            float[] r0 = r4.A0j
            r9 = r0[r5]
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            float r0 = r14.A00
            float r0 = r0 + r9
            r14.A00 = r0
        L_0x00a8:
            int r1 = r4.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00c6
            if (r8 == 0) goto L_0x00b3
            r0 = 3
            if (r8 != r0) goto L_0x00c6
        L_0x00b3:
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f8
            r14.A0I = r2
        L_0x00b9:
            java.util.ArrayList r0 = r14.A0E
            if (r0 != 0) goto L_0x00c3
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r14.A0E = r0
        L_0x00c3:
            r0.add(r4)
        L_0x00c6:
            X.0R7 r0 = r14.A08
            if (r0 != 0) goto L_0x00cc
            r14.A08 = r4
        L_0x00cc:
            X.0R7 r0 = r14.A0C
            if (r0 == 0) goto L_0x00d4
            X.0R7[] r0 = r0.A0p
            r0[r5] = r4
        L_0x00d4:
            r14.A0C = r4
        L_0x00d6:
            if (r7 == r4) goto L_0x00dc
            X.0R7[] r0 = r7.A0q
            r0[r5] = r4
        L_0x00dc:
            X.0Qs[] r0 = r4.A0n
            int r7 = r11 + 1
            r0 = r0[r7]
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x0104
            X.0R7 r1 = r0.A06
            X.0Qs[] r0 = r1.A0n
            r0 = r0[r11]
            X.0Qs r0 = r0.A03
            if (r0 == 0) goto L_0x0104
            X.0R7 r0 = r0.A06
            if (r0 != r4) goto L_0x0104
            r7 = r4
            r4 = r1
            goto L_0x002a
        L_0x00f8:
            r14.A0H = r2
            goto L_0x00b9
        L_0x00fb:
            int r0 = r4.A04()
            goto L_0x0058
        L_0x0101:
            r0 = 1
            goto L_0x004a
        L_0x0104:
            X.0R7 r0 = r14.A09
            if (r0 == 0) goto L_0x0115
            int r1 = r14.A03
            X.0Qs[] r0 = r0.A0n
            r0 = r0[r11]
            int r0 = r0.A00()
            int r1 = r1 - r0
            r14.A03 = r1
        L_0x0115:
            X.0R7 r0 = r14.A0D
            if (r0 == 0) goto L_0x0126
            int r1 = r14.A03
            X.0Qs[] r0 = r0.A0n
            r0 = r0[r7]
            int r0 = r0.A00()
            int r1 = r1 - r0
            r14.A03 = r1
        L_0x0126:
            r14.A0B = r4
            if (r5 != 0) goto L_0x021c
            boolean r0 = r14.A0J
            if (r0 == 0) goto L_0x021c
            r14.A0A = r4
        L_0x0130:
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x0219
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x0219
        L_0x0138:
            r14.A0G = r2
        L_0x013a:
            r0 = 1
            r14.A0F = r0
            X.0R7 r0 = r14.A07
            r38 = r0
            X.0R7 r0 = r14.A0B
            r37 = r0
            X.0R7 r1 = r14.A09
            X.0R7 r0 = r14.A0D
            X.0R7 r12 = r14.A0A
            float r13 = r14.A00
            r2 = r40
            X.0Fr[] r2 = r2.A0o
            r3 = r2[r43]
            X.0Fr r2 = X.C02310Fr.WRAP_CONTENT
            r4 = 1
            boolean r15 = X.AnonymousClass000.A1Y(r3, r2)
            r3 = 2
            if (r43 != 0) goto L_0x0215
            int r2 = r12.A0A
        L_0x015f:
            r27 = 1
            if (r2 == 0) goto L_0x0169
            r27 = 0
            r26 = 1
            if (r2 == r4) goto L_0x016f
        L_0x0169:
            r26 = 0
            r25 = 1
            if (r2 == r3) goto L_0x0171
        L_0x016f:
            r25 = 0
        L_0x0171:
            r7 = r38
        L_0x0173:
            X.0Qs[] r2 = r7.A0n
            r8 = r2[r22]
            r6 = 4
            if (r25 == 0) goto L_0x017b
            r6 = 1
        L_0x017b:
            int r5 = r8.A00()
            X.0Fr[] r2 = r7.A0o
            r2 = r2[r43]
            X.0Fr r4 = X.C02310Fr.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x018e
            int[] r2 = r7.A0l
            r2 = r2[r43]
            r11 = 1
            if (r2 == 0) goto L_0x018f
        L_0x018e:
            r11 = 0
        L_0x018f:
            X.0Qs r3 = r8.A03
            if (r3 == 0) goto L_0x019c
            r2 = r38
            if (r7 == r2) goto L_0x019c
            int r2 = r3.A00()
            int r5 = r5 + r2
        L_0x019c:
            if (r25 == 0) goto L_0x01a5
            r2 = r38
            if (r7 == r2) goto L_0x01a5
            if (r7 == r1) goto L_0x01a5
            r6 = 5
        L_0x01a5:
            X.0Qs r3 = r8.A03
            r2 = r41
            if (r3 == 0) goto L_0x01c3
            X.0Qh r10 = r8.A02
            X.0Qh r9 = r3.A02
            if (r7 != r1) goto L_0x0212
            r3 = 6
        L_0x01b2:
            r2.A0F(r10, r9, r5, r3)
            if (r11 == 0) goto L_0x01ba
            if (r25 != 0) goto L_0x01ba
            r6 = 5
        L_0x01ba:
            X.0Qh r3 = r8.A02
            X.0Qs r8 = r8.A03
            X.0Qh r8 = r8.A02
            r2.A0E(r3, r8, r5, r6)
        L_0x01c3:
            if (r15 == 0) goto L_0x01f5
            int r5 = r7.A0N
            r3 = 8
            if (r5 == r3) goto L_0x0210
            X.0Fr[] r3 = r7.A0o
            r3 = r3[r43]
            if (r3 != r4) goto L_0x0210
            X.0Qs[] r5 = r7.A0n
            int r3 = r22 + 1
            r3 = r5[r3]
            X.0Qh r8 = r3.A02
            r3 = r5[r22]
            X.0Qh r5 = r3.A02
            r3 = 5
            r6 = 0
            r2.A0F(r8, r5, r6, r3)
        L_0x01e2:
            X.0Qs[] r3 = r7.A0n
            r3 = r3[r22]
            X.0Qh r5 = r3.A02
            r3 = r40
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r22]
            X.0Qh r8 = r3.A02
            r3 = 8
            r2.A0F(r5, r8, r6, r3)
        L_0x01f5:
            X.0Qs[] r3 = r7.A0n
            int r24 = r22 + 1
            r3 = r3[r24]
            X.0Qs r3 = r3.A03
            if (r3 == 0) goto L_0x0220
            X.0R7 r5 = r3.A06
            X.0Qs[] r3 = r5.A0n
            r3 = r3[r22]
            X.0Qs r3 = r3.A03
            if (r3 == 0) goto L_0x0220
            X.0R7 r3 = r3.A06
            if (r3 != r7) goto L_0x0220
            r7 = r5
            goto L_0x0173
        L_0x0210:
            r6 = 0
            goto L_0x01e2
        L_0x0212:
            r3 = 8
            goto L_0x01b2
        L_0x0215:
            int r2 = r12.A0L
            goto L_0x015f
        L_0x0219:
            r2 = 0
            goto L_0x0138
        L_0x021c:
            r14.A0A = r3
            goto L_0x0130
        L_0x0220:
            r16 = 0
            if (r0 == 0) goto L_0x0266
            r3 = r37
            X.0Qs[] r7 = r3.A0n
            r3 = r7[r24]
            X.0Qs r3 = r3.A03
            if (r3 == 0) goto L_0x0266
            X.0Qs[] r3 = r0.A0n
            r6 = r3[r24]
            X.0Fr[] r3 = r0.A0o
            r3 = r3[r43]
            if (r3 != r4) goto L_0x0340
            int[] r3 = r0.A0l
            r3 = r3[r43]
            if (r3 != 0) goto L_0x0340
            if (r25 != 0) goto L_0x0342
            X.0Qs r4 = r6.A03
            X.0R7 r5 = r4.A06
            r3 = r40
            if (r5 != r3) goto L_0x0255
            X.0Qh r8 = r6.A02
            X.0Qh r5 = r4.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 5
        L_0x0252:
            r2.A0E(r8, r5, r4, r3)
        L_0x0255:
            X.0Qh r5 = r6.A02
            r3 = r7[r24]
            X.0Qs r3 = r3.A03
            X.0Qh r7 = r3.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 6
            r2.A0G(r5, r7, r4, r3)
        L_0x0266:
            if (r15 == 0) goto L_0x0281
            r3 = r40
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r24]
            X.0Qh r6 = r3.A02
            r3 = r37
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r24]
            X.0Qh r5 = r3.A02
            int r4 = r3.A00()
            r3 = 8
            r2.A0F(r6, r5, r4, r3)
        L_0x0281:
            java.util.ArrayList r3 = r14.A0E
            r20 = r3
            if (r3 == 0) goto L_0x0356
            int r19 = r20.size()
            r4 = 1
            r3 = r19
            if (r3 <= r4) goto L_0x0356
            boolean r3 = r14.A0I
            if (r3 == 0) goto L_0x029b
            boolean r3 = r14.A0G
            if (r3 != 0) goto L_0x029b
            int r3 = r14.A06
            float r13 = (float) r3
        L_0x029b:
            r3 = 0
            r5 = r16
            r11 = 0
            r10 = 0
        L_0x02a0:
            r4 = r20
            java.lang.Object r9 = r4.get(r11)
            X.0R7 r9 = (X.AnonymousClass0R7) r9
            float[] r4 = r9.A0j
            r18 = r4[r43]
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x02cb
            boolean r4 = r14.A0G
            if (r4 == 0) goto L_0x02e0
            X.0Qs[] r4 = r9.A0n
            r3 = r4[r24]
            X.0Qh r7 = r3.A02
            r3 = r4[r22]
            X.0Qh r6 = r3.A02
            r4 = 0
            r3 = 4
            r2.A0E(r7, r6, r4, r3)
        L_0x02c3:
            int r11 = r11 + 1
            r3 = 0
            r4 = r19
            if (r11 >= r4) goto L_0x0356
            goto L_0x02a0
        L_0x02cb:
            int r4 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x02e2
            X.0Qs[] r4 = r9.A0n
            r3 = r4[r24]
            X.0Qh r7 = r3.A02
            r3 = r4[r22]
            X.0Qh r6 = r3.A02
            r4 = 0
            r3 = 8
            r2.A0E(r7, r6, r4, r3)
            goto L_0x02c3
        L_0x02e0:
            r18 = 1065353216(0x3f800000, float:1.0)
        L_0x02e2:
            if (r5 == 0) goto L_0x0318
            X.0Qs[] r5 = r5.A0n
            r4 = r5[r22]
            X.0Qh r4 = r4.A02
            r28 = r4
            r4 = r5[r24]
            X.0Qh r15 = r4.A02
            X.0Qs[] r5 = r9.A0n
            r4 = r5[r22]
            X.0Qh r8 = r4.A02
            r4 = r5[r24]
            X.0Qh r7 = r4.A02
            X.0cp r6 = r2.A02()
            r6.A00 = r3
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x0337
            int r17 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r17 == 0) goto L_0x0337
            int r17 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r17 != 0) goto L_0x031c
            r3 = r28
            X.C07790cp.A01(r6, r3, r15, r4, r5)
        L_0x0315:
            r2.A0A(r6)
        L_0x0318:
            r5 = r9
            r10 = r18
            goto L_0x02c3
        L_0x031c:
            int r3 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0324
            X.C07790cp.A01(r6, r8, r7, r4, r5)
            goto L_0x0315
        L_0x0324:
            float r10 = r10 / r13
            float r3 = r18 / r13
            float r10 = r10 / r3
            r3 = r28
            X.C07790cp.A01(r6, r3, r15, r4, r5)
            X.C07790cp.A00(r6, r7, r10)
            X.0uW r4 = r6.A01
            float r3 = -r10
            r4.Bhm(r8, r3)
            goto L_0x0315
        L_0x0337:
            r3 = r28
            X.C07790cp.A01(r6, r3, r15, r4, r5)
            X.C07790cp.A01(r6, r7, r8, r4, r5)
            goto L_0x0315
        L_0x0340:
            if (r25 == 0) goto L_0x0255
        L_0x0342:
            X.0Qs r5 = r6.A03
            X.0R7 r4 = r5.A06
            r3 = r40
            if (r4 != r3) goto L_0x0255
            X.0Qh r8 = r6.A02
            X.0Qh r5 = r5.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 4
            goto L_0x0252
        L_0x0356:
            if (r1 == 0) goto L_0x03f3
            if (r1 == r0) goto L_0x035c
            if (r25 == 0) goto L_0x03f3
        L_0x035c:
            r3 = r38
            X.0Qs[] r3 = r3.A0n
            r5 = r3[r22]
            r3 = r37
            X.0Qs[] r3 = r3.A0n
            r4 = r3[r24]
            X.0Qs r3 = r5.A03
            if (r3 == 0) goto L_0x03ef
            X.0Qh r5 = r3.A02
        L_0x036e:
            X.0Qs r3 = r4.A03
            if (r3 == 0) goto L_0x03ec
            X.0Qh r6 = r3.A02
        L_0x0374:
            X.0Qs[] r3 = r1.A0n
            r4 = r3[r22]
            X.0Qs[] r3 = r0.A0n
            r3 = r3[r24]
            if (r5 == 0) goto L_0x0395
            if (r6 == 0) goto L_0x0395
            if (r43 != 0) goto L_0x03e9
            float r8 = r12.A02
        L_0x0384:
            int r9 = r4.A00()
            int r10 = r3.A00()
            X.0Qh r4 = r4.A02
            X.0Qh r7 = r3.A02
            r11 = 7
            r3 = r2
            r3.A0H(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0395:
            if (r27 != 0) goto L_0x0399
            if (r26 == 0) goto L_0x03df
        L_0x0399:
            if (r1 == 0) goto L_0x03df
        L_0x039b:
            if (r1 == r0) goto L_0x03df
            X.0Qs[] r6 = r1.A0n
            r5 = r6[r22]
            X.0Qs[] r3 = r0.A0n
            r4 = r3[r24]
            r9 = r4
            X.0Qs r3 = r5.A03
            if (r3 == 0) goto L_0x03e6
            X.0Qh r7 = r3.A02
        L_0x03ac:
            X.0Qs r3 = r4.A03
            if (r3 == 0) goto L_0x03e3
            X.0Qh r8 = r3.A02
        L_0x03b2:
            r3 = r37
            if (r3 == r0) goto L_0x03c4
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r24]
            X.0Qs r3 = r3.A03
            if (r3 == 0) goto L_0x03c2
            X.0Qh r3 = r3.A02
            r16 = r3
        L_0x03c2:
            r8 = r16
        L_0x03c4:
            if (r1 != r0) goto L_0x03c8
            r4 = r6[r24]
        L_0x03c8:
            if (r7 == 0) goto L_0x03df
            if (r8 == 0) goto L_0x03df
            int r11 = r5.A00()
            int r12 = r9.A00()
            X.0Qh r6 = r5.A02
            X.0Qh r9 = r4.A02
            r10 = 1056964608(0x3f000000, float:0.5)
            r13 = 5
            r5 = r2
            r5.A0H(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x03df:
            int r21 = r21 + 1
            goto L_0x0014
        L_0x03e3:
            r8 = r16
            goto L_0x03b2
        L_0x03e6:
            r7 = r16
            goto L_0x03ac
        L_0x03e9:
            float r8 = r12.A06
            goto L_0x0384
        L_0x03ec:
            r6 = r16
            goto L_0x0374
        L_0x03ef:
            r5 = r16
            goto L_0x036e
        L_0x03f3:
            if (r27 == 0) goto L_0x04c3
            if (r1 == 0) goto L_0x04c3
            int r4 = r14.A06
            if (r4 <= 0) goto L_0x0400
            int r3 = r14.A05
            r12 = 1
            if (r3 == r4) goto L_0x0401
        L_0x0400:
            r12 = 0
        L_0x0401:
            r7 = r1
            r6 = r1
        L_0x0403:
            X.0R7[] r3 = r7.A0q
            r5 = r3[r43]
        L_0x0407:
            if (r5 == 0) goto L_0x0414
            int r4 = r5.A0N
            r3 = 8
            if (r4 != r3) goto L_0x0416
            X.0R7[] r3 = r5.A0q
            r5 = r3[r43]
            goto L_0x0407
        L_0x0414:
            if (r7 != r0) goto L_0x0485
        L_0x0416:
            X.0Qs[] r3 = r7.A0n
            r9 = r3[r22]
            X.0Qh r4 = r9.A02
            X.0Qs r3 = r9.A03
            if (r3 == 0) goto L_0x04bf
            X.0Qh r8 = r3.A02
        L_0x0422:
            if (r6 == r7) goto L_0x04a9
            X.0Qs[] r3 = r6.A0n
            r3 = r3[r24]
            X.0Qh r8 = r3.A02
        L_0x042a:
            int r31 = r9.A00()
            X.0Qs[] r3 = r7.A0n
            r3 = r3[r24]
            int r32 = r3.A00()
            if (r5 == 0) goto L_0x0491
            X.0Qs[] r3 = r5.A0n
            r11 = r3[r22]
            X.0Qh r9 = r11.A02
            X.0Qs[] r3 = r7.A0n
            r3 = r3[r24]
            X.0Qh r10 = r3.A02
        L_0x0444:
            int r3 = r11.A00()
            int r32 = r32 + r3
        L_0x044a:
            X.0Qs[] r3 = r6.A0n
            r3 = r3[r24]
            int r3 = r3.A00()
            int r31 = r31 + r3
            if (r4 == 0) goto L_0x0485
            if (r8 == 0) goto L_0x0485
            if (r9 == 0) goto L_0x0485
            if (r10 == 0) goto L_0x0485
            if (r7 != r1) goto L_0x0466
            X.0Qs[] r3 = r1.A0n
            r3 = r3[r22]
            int r31 = r3.A00()
        L_0x0466:
            if (r7 != r0) goto L_0x0470
            X.0Qs[] r3 = r0.A0n
            r3 = r3[r24]
            int r32 = r3.A00()
        L_0x0470:
            r33 = 5
            if (r12 == 0) goto L_0x0476
            r33 = 8
        L_0x0476:
            r30 = 1056964608(0x3f000000, float:0.5)
            r25 = r2
            r26 = r4
            r27 = r8
            r28 = r9
            r29 = r10
            r25.A0H(r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0485:
            int r4 = r7.A0N
            r3 = 8
            if (r4 == r3) goto L_0x048c
            r6 = r7
        L_0x048c:
            r7 = r5
            if (r5 == 0) goto L_0x039b
            goto L_0x0403
        L_0x0491:
            r3 = r37
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r24]
            X.0Qs r11 = r3.A03
            if (r11 == 0) goto L_0x04a6
            X.0Qh r9 = r11.A02
        L_0x049d:
            X.0Qs[] r3 = r7.A0n
            r3 = r3[r24]
            X.0Qh r10 = r3.A02
            if (r11 == 0) goto L_0x044a
            goto L_0x0444
        L_0x04a6:
            r9 = r16
            goto L_0x049d
        L_0x04a9:
            if (r7 != r1) goto L_0x042a
            if (r6 != r7) goto L_0x042a
            r3 = r38
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r22]
            X.0Qs r3 = r3.A03
            if (r3 == 0) goto L_0x04bb
            X.0Qh r8 = r3.A02
            goto L_0x042a
        L_0x04bb:
            r8 = r16
            goto L_0x042a
        L_0x04bf:
            r8 = r16
            goto L_0x0422
        L_0x04c3:
            r8 = 8
            if (r26 == 0) goto L_0x0395
            if (r1 == 0) goto L_0x0395
            int r4 = r14.A06
            if (r4 <= 0) goto L_0x04d2
            int r3 = r14.A05
            r12 = 1
            if (r3 == r4) goto L_0x04d3
        L_0x04d2:
            r12 = 0
        L_0x04d3:
            r7 = r1
            r6 = r1
        L_0x04d5:
            X.0R7[] r3 = r7.A0q
            r5 = r3[r43]
        L_0x04d9:
            if (r5 == 0) goto L_0x04e4
            int r3 = r5.A0N
            if (r3 != r8) goto L_0x04e4
            X.0R7[] r3 = r5.A0q
            r5 = r3[r43]
            goto L_0x04d9
        L_0x04e4:
            if (r7 == r1) goto L_0x05c9
            if (r7 == r0) goto L_0x05c9
            if (r5 == 0) goto L_0x05c9
            if (r5 != r0) goto L_0x04ee
            r5 = r16
        L_0x04ee:
            X.0Qs[] r10 = r7.A0n
            r9 = r10[r22]
            X.0Qh r8 = r9.A02
            X.0Qs[] r3 = r6.A0n
            r3 = r3[r24]
            X.0Qh r4 = r3.A02
            int r11 = r9.A00()
            r3 = r10[r24]
            int r35 = r3.A00()
            if (r5 == 0) goto L_0x05b4
            X.0Qs[] r3 = r5.A0n
            r10 = r3[r22]
            X.0Qh r9 = r10.A02
            X.0Qs r3 = r10.A03
            if (r3 == 0) goto L_0x05b0
            X.0Qh r3 = r3.A02
        L_0x0512:
            int r10 = r10.A00()
            int r35 = r35 + r10
        L_0x0518:
            X.0Qs[] r10 = r6.A0n
            r10 = r10[r24]
            int r34 = r10.A00()
            int r34 = r34 + r11
            r36 = 4
            if (r12 == 0) goto L_0x0528
            r36 = 8
        L_0x0528:
            if (r8 == 0) goto L_0x05ad
            if (r4 == 0) goto L_0x05ad
            if (r9 == 0) goto L_0x05ad
            if (r3 == 0) goto L_0x05ad
            r33 = 1056964608(0x3f000000, float:0.5)
            r10 = 8
            r28 = r2
            r29 = r8
            r30 = r4
            r31 = r9
            r32 = r3
            r28.A0H(r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x0541:
            int r3 = r7.A0N
            if (r3 != r10) goto L_0x0546
            r7 = r6
        L_0x0546:
            r6 = r7
            r8 = 8
            r7 = r5
            if (r5 != 0) goto L_0x04d5
            X.0Qs[] r3 = r1.A0n
            r10 = r3[r22]
            r3 = r38
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r22]
            X.0Qs r4 = r3.A03
            X.0Qs[] r3 = r0.A0n
            r8 = r3[r24]
            r3 = r37
            X.0Qs[] r3 = r3.A0n
            r3 = r3[r24]
            X.0Qs r9 = r3.A03
            if (r4 == 0) goto L_0x05ab
            if (r1 == r0) goto L_0x0586
            X.0Qh r5 = r10.A02
            X.0Qh r4 = r4.A02
            int r3 = r10.A00()
            r7 = 5
            r2.A0E(r5, r4, r3, r7)
        L_0x0574:
            if (r9 == 0) goto L_0x0395
        L_0x0576:
            if (r1 == r0) goto L_0x0395
            X.0Qh r5 = r8.A02
            X.0Qh r4 = r9.A02
            int r3 = r8.A00()
            int r3 = -r3
            r2.A0E(r5, r4, r3, r7)
            goto L_0x0395
        L_0x0586:
            r7 = 5
            if (r9 == 0) goto L_0x0395
            X.0Qh r6 = r10.A02
            X.0Qh r5 = r4.A02
            int r34 = r10.A00()
            X.0Qh r4 = r8.A02
            X.0Qh r3 = r9.A02
            int r35 = r8.A00()
            r33 = 1056964608(0x3f000000, float:0.5)
            r28 = r2
            r29 = r6
            r30 = r5
            r31 = r4
            r32 = r3
            r36 = r7
            r28.A0H(r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0576
        L_0x05ab:
            r7 = 5
            goto L_0x0574
        L_0x05ad:
            r10 = 8
            goto L_0x0541
        L_0x05b0:
            r3 = r16
            goto L_0x0512
        L_0x05b4:
            X.0Qs[] r3 = r0.A0n
            r10 = r3[r22]
            if (r10 == 0) goto L_0x05c6
            X.0Qh r9 = r10.A02
        L_0x05bc:
            X.0Qs[] r3 = r7.A0n
            r3 = r3[r24]
            X.0Qh r3 = r3.A02
            if (r10 == 0) goto L_0x0518
            goto L_0x0512
        L_0x05c6:
            r9 = r16
            goto L_0x05bc
        L_0x05c9:
            r10 = 8
            goto L_0x0541
        L_0x05cd:
            int r0 = r0.A04
            r39 = r0
            r0 = r40
            X.0Mq[] r0 = r0.A0D
            r23 = r0
            r22 = 2
            goto L_0x0014
        L_0x05db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05P.A01(X.0Uf, X.05P, int):void");
    }

    public void A09() {
        this.A05.A07();
        this.A02 = 0;
        this.A03 = 0;
        super.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        if (r15 == 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0104, code lost:
        r4 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0105 A[EDGE_INSN: B:76:0x0105->B:60:0x0105 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(int r15, boolean r16) {
        /*
            r14 = this;
            X.0Qm r8 = r14.A08
            r4 = 1
            r13 = r16 & 1
            X.05P r5 = r8.A00
            r7 = 0
            X.0Fr[] r3 = r5.A0o
            r2 = r3[r7]
            r1 = r3[r4]
            int r12 = r5.A06()
            int r11 = r5.A07()
            if (r13 == 0) goto L_0x009a
            X.0Fr r10 = X.C02310Fr.WRAP_CONTENT
            if (r2 == r10) goto L_0x001e
            if (r1 != r10) goto L_0x009a
        L_0x001e:
            java.util.ArrayList r0 = r8.A05
            java.util.Iterator r9 = r0.iterator()
        L_0x0024:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r6 = r9.next()
            X.0ct r6 = (X.C07830ct) r6
            int r0 = r6.A01
            if (r0 != r15) goto L_0x0024
            boolean r0 = r6.A0F()
            if (r0 != 0) goto L_0x0024
            r13 = 0
        L_0x003b:
            if (r15 != 0) goto L_0x009d
            if (r13 == 0) goto L_0x0057
            if (r2 != r10) goto L_0x0057
            X.0Fr r0 = X.C02310Fr.FIXED
            r3[r7] = r0
            int r0 = r8.A00(r5, r7)
            r5.A0B(r0)
            X.05W r0 = r5.A0c
            X.05R r6 = r0.A06
            int r0 = r5.A05()
            r6.A02(r0)
        L_0x0057:
            r6 = r3[r7]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r6 == r0) goto L_0x0061
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r6 != r0) goto L_0x00d1
        L_0x0061:
            int r7 = r5.A05()
            int r7 = r7 + r12
            X.05W r6 = r5.A0c
            X.0cs r0 = r6.A04
            r0.A02(r7)
            X.05R r0 = r6.A06
            int r7 = r7 - r12
        L_0x0070:
            r0.A02(r7)
            r9 = 1
        L_0x0074:
            r8.A02()
            java.util.ArrayList r8 = r8.A05
            java.util.Iterator r7 = r8.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r6 = r7.next()
            X.0ct r6 = (X.C07830ct) r6
            int r0 = r6.A01
            if (r0 != r15) goto L_0x007d
            X.0R7 r0 = r6.A03
            if (r0 != r5) goto L_0x0096
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x0096
            goto L_0x007d
        L_0x0096:
            r6.A0B()
            goto L_0x007d
        L_0x009a:
            if (r15 != 0) goto L_0x00b7
            goto L_0x0057
        L_0x009d:
            if (r13 == 0) goto L_0x00b7
            if (r1 != r10) goto L_0x00b7
            X.0Fr r0 = X.C02310Fr.FIXED
            r3[r4] = r0
            int r0 = r8.A00(r5, r4)
            r5.A0A(r0)
            X.05V r0 = r5.A0d
            X.05R r6 = r0.A06
            int r0 = r5.A04()
            r6.A02(r0)
        L_0x00b7:
            r6 = r3[r4]
            X.0Fr r0 = X.C02310Fr.FIXED
            if (r6 == r0) goto L_0x00c1
            X.0Fr r0 = X.C02310Fr.MATCH_PARENT
            if (r6 != r0) goto L_0x00d1
        L_0x00c1:
            int r7 = r5.A04()
            int r7 = r7 + r11
            X.05V r6 = r5.A0d
            X.0cs r0 = r6.A04
            r0.A02(r7)
            X.05R r0 = r6.A06
            int r7 = r7 - r11
            goto L_0x0070
        L_0x00d1:
            r9 = 0
            goto L_0x0074
        L_0x00d3:
            java.util.Iterator r7 = r8.iterator()
        L_0x00d7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r6 = r7.next()
            X.0ct r6 = (X.C07830ct) r6
            int r0 = r6.A01
            if (r0 != r15) goto L_0x00d7
            if (r9 != 0) goto L_0x00ee
            X.0R7 r0 = r6.A03
            if (r0 != r5) goto L_0x00ee
            goto L_0x00d7
        L_0x00ee:
            X.0cs r0 = r6.A05
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0104
            X.0cs r0 = r6.A04
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0104
            boolean r0 = r6 instanceof X.AnonymousClass05U
            if (r0 != 0) goto L_0x00d7
            X.05R r0 = r6.A06
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00d7
        L_0x0104:
            r4 = 0
        L_0x0105:
            X.AnonymousClass000.A16(r2, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05P.A0O(int, boolean):boolean");
    }

    public void A0J(boolean z, boolean z2) {
        super.A0J(z, z2);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0R7) this.A00.get(i)).A0J(z, z2);
        }
    }
}
