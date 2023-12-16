package X;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3QO  reason: invalid class name */
public final class AnonymousClass3QO implements AnonymousClass65N {
    public int A00;
    public int A01 = 1;
    public AnonymousClass3QN A02;
    public boolean A03;
    public byte[] A04;
    public final AnonymousClass3XB A05;
    public final AnonymousClass3XB A06;
    public final AnonymousClass3XB A07;
    public final AnonymousClass3XB A08 = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A09 = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0A = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0B = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0C;
    public final AnonymousClass3XB A0D;
    public final AnonymousClass3XB A0E;
    public final AnonymousClass3XB A0F = AnonymousClass3XB.A00();
    public final AnonymousClass3XB A0G;
    public final AnonymousClass3XB A0H;
    public final AnonymousClass3XB A0I;
    public final AnonymousClass3XB A0J;
    public final C184298rZ A0K;
    public final AnonymousClass5LM A0L;
    public final C619833a A0M;
    public final AnonymousClass32J A0N;
    public final C84134Bd A0O;
    public final C84134Bd A0P;
    public final C84134Bd A0Q;
    public final C84134Bd A0R;
    public final C84134Bd A0S;
    public final Object A0T = AnonymousClass002.A0D();
    public final AtomicBoolean A0U = new AtomicBoolean();
    public final AtomicBoolean A0V = new AtomicBoolean();
    public volatile String A0W;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3QO(X.C184298rZ r9, X.AnonymousClass1VX r10, X.AnonymousClass5LM r11, X.C619833a r12, X.AnonymousClass32J r13) {
        /*
            r8 = this;
            r2 = 1
            r0 = 5
            X.C162457s7.A0J(r10, r0)
            r8.<init>()
            r8.A0L = r11
            r8.A0N = r13
            r8.A0M = r12
            r8.A0K = r9
            java.lang.Object r0 = X.AnonymousClass002.A0D()
            r8.A0T = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0U = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.A0V = r0
            r8.A01 = r2
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0A = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A08 = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A09 = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0B = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0F = r0
            X.3XB r6 = X.AnonymousClass3XB.A00()
            r8.A0E = r6
            X.3XB r5 = X.AnonymousClass3XB.A00()
            r8.A07 = r5
            X.3XB r4 = X.AnonymousClass3XB.A00()
            r8.A0D = r4
            X.3XB r3 = X.AnonymousClass3XB.A00()
            r8.A0H = r3
            X.3XB r1 = X.AnonymousClass3XB.A00()
            r8.A0I = r1
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0J = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0G = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A05 = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A06 = r0
            X.3XB r0 = X.AnonymousClass3XB.A00()
            r8.A0C = r0
            r8.A0P = r4
            r8.A0Q = r6
            r8.A0O = r5
            r8.A0R = r3
            r8.A0S = r1
            X.2dV r3 = r13.A02
            int r7 = r3.A01
            X.38t r0 = r3.A05
            byte r6 = r0.A00
            r1 = 0
            int r4 = X.C106495Zf.A00(r6, r7, r1)
            monitor-enter(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x011a }
            r12.A09 = r0     // Catch:{ all -> 0x011a }
            r12.A0F = r1     // Catch:{ all -> 0x011a }
            monitor-exit(r12)
            monitor-enter(r12)
            r5 = 3
            r1 = 2
            if (r7 == r2) goto L_0x00b5
            if (r7 == r1) goto L_0x00b2
            r0 = 4
            if (r7 == r0) goto L_0x00bd
            switch(r7) {
                case 8: goto L_0x00af;
                case 9: goto L_0x00af;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00b2;
                case 12: goto L_0x00af;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x00ba
        L_0x00af:
            r12.A01 = r0     // Catch:{ all -> 0x011a }
            goto L_0x00bf
        L_0x00b2:
            r12.A01 = r5     // Catch:{ all -> 0x011a }
            goto L_0x00bf
        L_0x00b5:
            if (r4 == r5) goto L_0x00bd
            if (r4 != r1) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r12.A01 = r2     // Catch:{ all -> 0x011a }
            goto L_0x00bf
        L_0x00bd:
            r12.A01 = r1     // Catch:{ all -> 0x011a }
        L_0x00bf:
            monitor-exit(r12)
            X.2UD r0 = r13.A01
            boolean r0 = r0.A0F
            monitor-enter(r12)
            r12.A0D = r0     // Catch:{ all -> 0x011a }
            monitor-exit(r12)
            boolean r0 = X.C627636p.A0I(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r12.A0C(r0)
            X.7Td r4 = r3.A04
            monitor-enter(r12)
            if (r4 == 0) goto L_0x00fe
            r1 = 3349(0xd15, float:4.693E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x011a }
            boolean r0 = r10.A0Y(r0, r1)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r4 instanceof X.C135646l0     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00ed
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x011a }
            r12.A0A = r0     // Catch:{ all -> 0x011a }
            goto L_0x00fe
        L_0x00ed:
            boolean r0 = r4 instanceof X.C135616kx     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00f8
            java.lang.Integer r0 = X.C18280x3.A0S()     // Catch:{ all -> 0x011a }
            r12.A0A = r0     // Catch:{ all -> 0x011a }
            goto L_0x00fe
        L_0x00f8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x011a }
            r12.A0A = r0     // Catch:{ all -> 0x011a }
        L_0x00fe:
            monitor-exit(r12)
            boolean r0 = r3.A0F
            monitor-enter(r12)
            r12.A0E = r0     // Catch:{ all -> 0x011a }
            monitor-exit(r12)
            int r0 = r13.A00
            monitor-enter(r12)
            r12.A00 = r0     // Catch:{ all -> 0x011a }
            monitor-exit(r12)
            java.io.File r0 = r3.A07
            if (r0 == 0) goto L_0x0119
            X.2QG r1 = new X.2QG
            r1.<init>(r0, r2)
            X.3XB r0 = r8.A09
            r0.A05(r1)
        L_0x0119:
            return
        L_0x011a:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.<init>(X.8rZ, X.1VX, X.5LM, X.33a, X.32J):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2UD A00() {
        /*
            r33 = this;
            r3 = r33
            X.32J r0 = r3.A0N
            X.2UD r0 = r0.A01
            X.C162457s7.A0D(r0)
            java.lang.String r14 = r3.A0W
            if (r14 != 0) goto L_0x0010
            java.lang.String r14 = "optimistic"
        L_0x0010:
            X.3XB r1 = r3.A09
            java.lang.Object r15 = r1.A01()
            X.2QG r15 = (X.AnonymousClass2QG) r15
            X.3XB r1 = r3.A0F
            java.lang.Object r8 = r1.A01()
            X.7N0 r8 = (X.AnonymousClass7N0) r8
            X.3XB r1 = r3.A0C
            java.lang.Object r2 = r1.A01()
            X.7Nw r2 = (X.C149787Nw) r2
            int r13 = r3.A01
            java.io.File r1 = r0.A07
            java.lang.String r12 = r0.A09
            r18 = r12
            java.lang.String r11 = r0.A08
            r17 = r11
            long r4 = r0.A03
            int[] r10 = r0.A0H
            java.lang.String r6 = r0.A0A
            int r3 = r0.A02
            int r7 = r0.A00
            if (r15 == 0) goto L_0x00c5
            java.io.File r9 = r15.A01
            boolean r16 = X.C162457s7.A0P(r9, r1)
            if (r16 != 0) goto L_0x00c5
            long r4 = r15.A00
            r12 = 0
            r11 = r12
            r15 = 1
        L_0x004d:
            if (r18 != 0) goto L_0x005c
            if (r17 != 0) goto L_0x005c
            if (r2 == 0) goto L_0x005c
            X.7SM r1 = r2.A02
            java.lang.String r12 = r1.A00
            X.7SM r1 = r2.A01
            java.lang.String r11 = r1.A00
            r15 = 1
        L_0x005c:
            boolean r1 = r8 instanceof X.C135546kq
            if (r1 == 0) goto L_0x006d
            r1 = r8
            X.6kq r1 = (X.C135546kq) r1
            int[] r2 = r1.A05
            boolean r1 = java.util.Arrays.equals(r2, r10)
            if (r1 != 0) goto L_0x006d
            r10 = r2
            r15 = 1
        L_0x006d:
            boolean r1 = r8 instanceof X.C135536kp
            if (r1 == 0) goto L_0x00c3
            X.6kp r8 = (X.C135536kp) r8
            int r8 = r8.A00
            if (r8 == r7) goto L_0x00c3
            r15 = 1
        L_0x0078:
            boolean r1 = r14.equals(r6)
            if (r1 != 0) goto L_0x00c1
            r15 = 1
        L_0x007f:
            if (r13 != r3) goto L_0x0084
            r13 = r3
            if (r15 == 0) goto L_0x00c0
        L_0x0084:
            X.38t r1 = r0.A06
            r18 = r1
            X.32B r1 = r0.A04
            r17 = r1
            int r15 = r0.A01
            boolean r7 = r0.A0E
            boolean r6 = r0.A0C
            boolean r3 = r0.A0D
            boolean r2 = r0.A0F
            java.util.List r1 = r0.A0B
            r16 = 0
            X.2UD r0 = new X.2UD
            r20 = r11
            r21 = r14
            r22 = r1
            r23 = r10
            r24 = r15
            r25 = r8
            r26 = r13
            r27 = r4
            r29 = r7
            r30 = r6
            r31 = r3
            r32 = r2
            r14 = r0
            r15 = r17
            r17 = r18
            r18 = r9
            r19 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32)
        L_0x00c0:
            return r0
        L_0x00c1:
            r14 = r6
            goto L_0x007f
        L_0x00c3:
            r8 = r7
            goto L_0x0078
        L_0x00c5:
            r15 = 0
            r9 = r1
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QO.A00():X.2UD");
    }

    public final C47592dV A01() {
        C47592dV r0 = this.A0N.A02;
        C162457s7.A0D(r0);
        AnonymousClass2QG r2 = (AnonymousClass2QG) this.A09.A01();
        if (r2 == null) {
            return r0;
        }
        String str = r0.A08;
        File file = r2.A01;
        String str2 = r0.A0B;
        String str3 = r0.A09;
        String str4 = r0.A0A;
        C633138t r29 = r0.A05;
        int i = r0.A00;
        int i2 = r0.A01;
        long j = r0.A02;
        long j2 = r0.A03;
        boolean z = r0.A0E;
        boolean z2 = r0.A0D;
        boolean z3 = r0.A0J;
        boolean z4 = r0.A0C;
        AnonymousClass330 r9 = r0.A06;
        C151027Td r8 = r0.A04;
        int i3 = i2;
        return new C47592dV(r8, r29, r9, file, str, str2, str3, str4, i, i3, j, j2, z, z2, z3, z4, false, r0.A0I, r0.A0F, r0.A0G);
    }

    public final C149897Oi A02() {
        return (C149897Oi) this.A0J.A01();
    }

    public final void A03() {
        this.A0A.A02();
        this.A09.A02();
        this.A08.A02();
        this.A0B.A02();
        this.A0E.A02();
        this.A0D.A02();
        this.A0F.A02();
        this.A0H.A02();
        this.A0I.A02();
        this.A0J.A02();
        this.A0G.A02();
        this.A07.A02();
        this.A0C.A02();
    }

    public final void A04(C84134Bd r2, Executor executor) {
        this.A0B.A04(r2, executor);
    }

    public final boolean A05() {
        if ("express".equalsIgnoreCase(this.A0W) || "express-optimistic".equalsIgnoreCase(this.A0W)) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (this.A0W == null || C162457s7.A0P(this.A0W, "optimistic") || C162457s7.A0P(this.A0W, "express-optimistic")) {
            return true;
        }
        return false;
    }

    public String B8u() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("mediajob/ ");
        return AnonymousClass000.A0X(this.A0L.A0D, A0o);
    }
}
