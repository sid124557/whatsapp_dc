package X;

/* renamed from: X.3DR  reason: invalid class name */
public final class AnonymousClass3DR implements AnonymousClass66U, AnonymousClass664 {
    public final AnonymousClass314 A00;
    public final C56612sH A01;
    public final C56982ss A02;
    public final C28891hw A03;
    public final AnonymousClass1VX A04;
    public final C44482Wf A05;
    public final C42432Ob A06;
    public final AnonymousClass1R1 A07;
    public final AnonymousClass4FS A08;

    public void BMe() {
        this.A03.A06(new AnonymousClass4IC(this, 12));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        r13 = r10.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r17 = this;
            r10 = r17
            X.1VX r9 = r10.A04
            r0 = 4447(0x115f, float:6.232E-42)
            X.2vE r14 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r14, r0)
            if (r0 == 0) goto L_0x0112
            X.314 r0 = r10.A00
            java.util.List r0 = r0.A05()
            java.util.Iterator r16 = r0.iterator()
        L_0x0018:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0112
            X.4uZ r8 = X.C18300x5.A0P(r16)
            X.C162457s7.A0H(r8)
            r4 = 0
            X.C162457s7.A0J(r8, r4)
            boolean r0 = r8 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0053
            X.2ss r1 = r10.A02
            r0 = r8
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r3 = r1.A06(r0)
            r0 = 3
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2[r4] = r0
            r1 = 2
            X.AnonymousClass000.A1M(r2, r1)
            r0 = 6
            X.AnonymousClass000.A1P(r2, r0, r1)
            java.util.List r0 = X.AnonymousClass8UF.A0o(r2)
            boolean r0 = X.AnonymousClass0x7.A1U(r0, r3)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0018
        L_0x0053:
            X.1R1 r11 = r10.A07
            X.2sa r5 = X.AnonymousClass1R1.A00(r8, r11)
            long r3 = r5.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            if (r0 != 0) goto L_0x0018
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x0018
            if (r2 == r0) goto L_0x0018
            r0 = 4332(0x10ec, float:6.07E-42)
            int r12 = r9.A0O(r14, r0)
            r0 = 0
            if (r12 < 0) goto L_0x0018
            X.2ss r13 = r10.A02
            X.31A r2 = r13.A0A(r8, r0)
            if (r2 == 0) goto L_0x0018
            int r0 = r2.A08
            long r6 = (long) r0
            X.2sH r15 = r10.A01
            long r0 = r15.A0H()
            double r4 = (double) r0
            long r2 = r2.A0Y
            double r0 = (double) r2
            double r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            double r0 = (double) r2
            double r4 = r4 / r0
            double r3 = java.lang.Math.ceil(r4)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            double r0 = (double) r6
            double r0 = r0 / r3
            double r2 = (double) r12
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0018
            X.31A r3 = X.C56982ss.A00(r13, r8)
            if (r3 == 0) goto L_0x0018
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 4333(0x10ed, float:6.072E-42)
            long r0 = X.C56952sp.A06(r9, r0)
            long r0 = r2.toMillis(r0)
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0018
            long r2 = r3.A0Y
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0018
            long r4 = X.C56612sH.A03(r15, r0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0018
            r0 = 4334(0x10ee, float:6.073E-42)
            boolean r0 = r9.A0Y(r14, r0)
            if (r0 == 0) goto L_0x0018
            X.2Ob r6 = r10.A06
            r2 = -1
            java.lang.Integer r0 = X.AnonymousClass0x7.A0f()
            X.3Gp r5 = r6.A00
            r4 = 1
            long r0 = r0.longValue()
            java.util.Set r1 = r5.A04(r8, r0, r4)
            X.C162457s7.A0D(r1)
            X.1R1 r0 = r6.A02
            boolean r0 = r0.A0k(r8, r2)
            if (r0 == 0) goto L_0x010d
            r5.A0O(r1)
            X.2sa r1 = X.AnonymousClass1R1.A00(r8, r11)
            int r0 = r1.A00
            if (r4 == r0) goto L_0x0106
            r1.A00 = r4
            r11.A0a(r1)
        L_0x0106:
            X.2Wf r0 = r10.A05
            r0.A00(r4)
            goto L_0x0018
        L_0x010d:
            r5.A0N(r1)
            goto L_0x0018
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DR.BQV():void");
    }

    public AnonymousClass3DR(AnonymousClass314 r2, C56612sH r3, C56982ss r4, C28891hw r5, AnonymousClass1VX r6, C44482Wf r7, C42432Ob r8, AnonymousClass1R1 r9, AnonymousClass4FS r10) {
        C18260x0.A0d(r6, r9, r10, r5);
        C18260x0.A0U(r4, r3);
        C162457s7.A0J(r2, 9);
        this.A04 = r6;
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
    }

    public String BDW() {
        return "AutoMuteManager";
    }

    public /* synthetic */ void BMd() {
    }
}
