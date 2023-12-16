package X;

/* renamed from: X.3Lj  reason: invalid class name and case insensitive filesystem */
public class C66423Lj implements AnonymousClass485 {
    public final C116985rC A00;
    public final C55682qk A01;
    public final AnonymousClass32O A02;
    public final C56972sr A03;
    public final AnonymousClass36E A04;
    public final C49712gy A05;
    public final C29411im A06;
    public final C64773Ex A07;
    public final C56612sH A08;
    public final C621133n A09;
    public final C48972fm A0A;
    public final C56982ss A0B;
    public final AnonymousClass313 A0C;
    public final C56892sj A0D;
    public final C40432Fu A0E;
    public final C66483Lp A0F;
    public final AnonymousClass300 A0G;
    public final C55332qB A0H;
    public final C29041iB A0I;
    public final AnonymousClass1VX A0J;
    public final C54602oz A0K;
    public final C66383Le A0L;
    public final C52552lf A0M;
    public final AnonymousClass31C A0N;
    public final C50502iH A0O;
    public final C59882xe A0P;
    public final C55832qz A0Q;
    public final C72173dI A0R;
    public final C183538qC A0S;
    public final C183538qC A0T;

    public C66423Lj(C116985rC r4, C55682qk r5, AnonymousClass32O r6, C56972sr r7, AnonymousClass36E r8, C49712gy r9, C29411im r10, C64773Ex r11, C56612sH r12, C621133n r13, C48972fm r14, C56982ss r15, AnonymousClass313 r16, C56892sj r17, C40432Fu r18, C66483Lp r19, AnonymousClass300 r20, C55332qB r21, C29041iB r22, AnonymousClass1VX r23, C54602oz r24, C66383Le r25, C52552lf r26, AnonymousClass31C r27, C50502iH r28, C59882xe r29, C55832qz r30, AnonymousClass4FS r31, C183538qC r32, C183538qC r33) {
        C72173dI r0 = new C72173dI(r31, true);
        this.A08 = r12;
        this.A0J = r23;
        this.A01 = r5;
        this.A03 = r7;
        this.A0B = r15;
        this.A05 = r9;
        this.A0N = r27;
        this.A07 = r11;
        this.A04 = r8;
        this.A0A = r14;
        this.A0S = r32;
        this.A0Q = r30;
        this.A0M = r26;
        this.A06 = r10;
        this.A02 = r6;
        this.A09 = r13;
        this.A0G = r20;
        this.A0T = r33;
        this.A0H = r21;
        this.A0C = r16;
        this.A0I = r22;
        this.A0P = r29;
        this.A00 = r4;
        this.A0K = r24;
        this.A0D = r17;
        this.A0O = r28;
        this.A0L = r25;
        this.A0F = r19;
        this.A0E = r18;
        this.A0R = r0;
    }

    public void A01(C624134x r3) {
        A00(new C53932nu(new C43772Tk(this.A08, r3)), (C72183dJ) null, (Runnable) null);
    }

    public void A02(C624134x r4) {
        this.A0R.execute(new C70113Zy(this, 18, r4));
    }

    public void A03(boolean z) {
        AnonymousClass0x9.A0S(this.A0T).A0z = !z;
        this.A0N.A09(AnonymousClass36N.A06(z), (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: X.4uZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.whatsapp.jid.DeviceJid} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C53932nu r56, X.C72183dJ r57, java.lang.Runnable r58) {
        /*
            r55 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sending message: "
            r6 = r56
            X.C18260x0.A1R(r1, r0, r6)
            X.34x r5 = r6.A05
            X.2z0 r10 = r5.A1J
            X.4uZ r9 = r10.A00
            boolean r0 = r9 instanceof X.C95804uY
            r4 = r55
            if (r0 == 0) goto L_0x001c
            r4.A02(r5)
        L_0x001b:
            return
        L_0x001c:
            X.32O r0 = r4.A02
            android.os.Handler r1 = r0.A00
            r0 = 0
            r1.removeMessages(r0)
            r0 = 1
            r1.removeMessages(r0)
            r0 = 2
            r1.removeMessages(r0)
            com.whatsapp.jid.DeviceJid r3 = r6.A03
            r0 = r3
            X.2qk r11 = r4.A01
            X.2sr r8 = r4.A03
            X.2ss r7 = r4.A0B
            X.2sj r2 = r4.A0D
            boolean r1 = X.C627636p.A0L(r11, r8, r7, r2, r5)
            r13 = r57
            if (r1 == 0) goto L_0x0169
            boolean r1 = r5.A1q()
            if (r1 == 0) goto L_0x0169
            X.1im r14 = r4.A06
            boolean r1 = r14.A06
            if (r1 == 0) goto L_0x0169
            X.2lf r12 = r4.A0M
            java.util.Map r1 = r12.A01
            monitor-enter(r1)
            java.lang.Object r15 = r1.get(r10)     // Catch:{ all -> 0x0179 }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x0179 }
            r16 = 0
            if (r15 == 0) goto L_0x0075
            java.lang.Object r15 = r15.first     // Catch:{ all -> 0x0179 }
            java.util.Set r15 = (java.util.Set) r15     // Catch:{ all -> 0x0179 }
            if (r15 == 0) goto L_0x0075
            if (r3 != 0) goto L_0x006a
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0179 }
            if (r0 == 0) goto L_0x0071
            com.whatsapp.jid.DeviceJid r0 = X.C18320x8.A0O(r9)     // Catch:{ all -> 0x0179 }
        L_0x006a:
            boolean r0 = r15.contains(r0)     // Catch:{ all -> 0x0179 }
            if (r0 == 0) goto L_0x0075
            goto L_0x0073
        L_0x0071:
            r0 = 0
            goto L_0x006a
        L_0x0073:
            r16 = 1
        L_0x0075:
            monitor-exit(r1)     // Catch:{ all -> 0x0179 }
            if (r16 != 0) goto L_0x0169
            boolean r0 = r5.A1W
            if (r0 != 0) goto L_0x0169
            r12.A01(r3, r5)
            int r1 = r14.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x009e
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x009e
            X.8qC r0 = r4.A0T
            X.3Lt r14 = X.AnonymousClass0x9.A0S(r0)
            r15 = 1
            r17 = 0
            r19 = r17
            r16 = r15
            r18 = r17
            r14.A09(r15, r16, r17, r18, r19)
        L_0x009e:
            long r0 = r5.A1Q
            r14 = 0
            int r12 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00ac
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A1Q = r0
        L_0x00ac:
            boolean r12 = r6.A07
            if (r12 != 0) goto L_0x00b4
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00ca
        L_0x00b4:
            X.36E r1 = r4.A04
            int r15 = r5.A1d
            r14 = 5
            boolean r0 = r1.A0d
            if (r0 == 0) goto L_0x00ca
            X.30L r1 = r1.A0O
            java.lang.String r0 = r10.A01
            int r10 = r0.hashCode()
            byte r0 = r5.A1I
            r1.A05(r10, r14, r15, r0)
        L_0x00ca:
            X.3dI r10 = r4.A0R
            X.2sH r0 = r4.A08
            r54 = r0
            X.1VX r0 = r4.A0J
            r30 = r0
            X.2gy r0 = r4.A05
            r53 = r0
            X.3Ex r0 = r4.A07
            r52 = r0
            X.36E r0 = r4.A04
            r51 = r0
            X.2fm r0 = r4.A0A
            r21 = r0
            X.8qC r0 = r4.A0S
            r39 = r0
            X.2qz r0 = r4.A0Q
            r37 = r0
            X.33n r0 = r4.A09
            r20 = r0
            X.300 r0 = r4.A0G
            r27 = r0
            X.2qB r0 = r4.A0H
            r28 = r0
            X.313 r0 = r4.A0C
            r23 = r0
            X.1iB r0 = r4.A0I
            r29 = r0
            X.2xe r0 = r4.A0P
            r36 = r0
            X.5rC r0 = r4.A00
            r50 = r0
            X.2oz r0 = r4.A0K
            r31 = r0
            X.3Le r0 = r4.A0L
            r32 = r0
            X.3Lp r0 = r4.A0F
            r26 = r0
            X.2Fu r0 = r4.A0E
            r25 = r0
            if (r3 != 0) goto L_0x011e
            r3 = r9
            X.C626936e.A06(r9)
        L_0x011e:
            com.whatsapp.jid.UserJid r0 = r6.A04
            r34 = r0
            java.util.Set r0 = r6.A06
            java.util.HashSet r41 = X.AnonymousClass0x9.A15(r0)
            boolean r0 = r6.A08
            r48 = r0
            long r0 = r6.A00
            r18 = r0
            long r0 = r6.A01
            r16 = r0
            long r14 = r6.A02
            r9 = 12
            X.3aM r1 = new X.3aM
            r0 = r58
            r1.<init>(r4, r6, r0, r9)
            X.3bk r0 = new X.3bk
            r22 = r7
            r24 = r2
            r33 = r3
            r35 = r5
            r38 = r13
            r40 = r1
            r42 = r18
            r44 = r16
            r46 = r14
            r49 = r12
            r12 = r0
            r13 = r50
            r14 = r11
            r15 = r8
            r16 = r51
            r17 = r53
            r18 = r52
            r19 = r54
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r49)
            r10.execute(r0)
            return
        L_0x0169:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Dropping send message: "
            X.C18260x0.A1R(r1, r0, r6)
            if (r57 == 0) goto L_0x001b
            r0 = 0
            r13.BQt(r0)
            return
        L_0x0179:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0179 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66423Lj.A00(X.2nu, X.3dJ, java.lang.Runnable):void");
    }
}
