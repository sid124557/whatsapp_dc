package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2iU  reason: invalid class name and case insensitive filesystem */
public final class C50622iU {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C116985rC A01;
    public final C55682qk A02;
    public final C56972sr A03;
    public final AnonymousClass36E A04;
    public final C29021i9 A05;
    public final C56492s4 A06;
    public final C49712gy A07;
    public final C65203Gp A08;
    public final C28951i2 A09;
    public final C55262q4 A0A;
    public final C56612sH A0B;
    public final C621133n A0C;
    public final C52852m9 A0D;
    public final C56982ss A0E;
    public final C66473Lo A0F;
    public final C66543Lv A0G;
    public final AnonymousClass30G A0H;
    public final C56892sj A0I;
    public final C29431io A0J;
    public final C620233e A0K;
    public final C620333f A0L;
    public final AnonymousClass36Y A0M;
    public final AnonymousClass1VX A0N;
    public final AnonymousClass4FV A0O;
    public final C66493Lq A0P;
    public final C54932pW A0Q;
    public final AnonymousClass33K A0R;
    public final C47532dP A0S;
    public final C43662Sz A0T;
    public final C67813Qt A0U;
    public final C46472bg A0V;
    public final AnonymousClass33Y A0W;
    public final AnonymousClass33S A0X;
    public final C55892r5 A0Y;
    public final C50222hp A0Z;
    public final C45042Yl A0a;
    public final C152427Yv A0b;
    public final C55832qz A0c;
    public final AnonymousClass4FS A0d;
    public final AtomicInteger A0e = new AtomicInteger();
    public final AtomicInteger A0f = new AtomicInteger();

    public final boolean A01(AnonymousClass4FY r6) {
        C56612sH r2 = this.A0B;
        if (!(r6.BC2() instanceof C135166kE) || r6.BDj() + 86400000 >= r2.A0H() || !this.A0N.A0Y(C58422vE.A02, 5547)) {
            return false;
        }
        return true;
    }

    public C50622iU(C116985rC r2, C55682qk r3, C56972sr r4, AnonymousClass36E r5, C29021i9 r6, C56492s4 r7, C49712gy r8, C65203Gp r9, C28951i2 r10, C55262q4 r11, C56612sH r12, C621133n r13, C52852m9 r14, C56982ss r15, C66473Lo r16, C66543Lv r17, AnonymousClass30G r18, C56892sj r19, C29431io r20, C620233e r21, C620333f r22, AnonymousClass36Y r23, AnonymousClass1VX r24, AnonymousClass4FV r25, C66493Lq r26, C54932pW r27, AnonymousClass33K r28, C47532dP r29, C43662Sz r30, C67813Qt r31, C46472bg r32, AnonymousClass33Y r33, AnonymousClass33S r34, C55892r5 r35, C50222hp r36, C45042Yl r37, C152427Yv r38, C55832qz r39, AnonymousClass4FS r40) {
        this.A0B = r12;
        this.A0N = r24;
        this.A02 = r3;
        this.A03 = r4;
        this.A0d = r40;
        this.A0E = r15;
        this.A06 = r7;
        this.A0O = r25;
        this.A0X = r34;
        this.A0K = r21;
        this.A08 = r9;
        this.A0W = r33;
        this.A07 = r8;
        this.A0R = r28;
        this.A0Q = r27;
        this.A0M = r23;
        this.A04 = r5;
        this.A0G = r17;
        this.A0H = r18;
        this.A0c = r39;
        this.A0P = r26;
        this.A0J = r20;
        this.A05 = r6;
        this.A0C = r13;
        this.A0D = r14;
        this.A0Y = r35;
        this.A0L = r22;
        this.A09 = r10;
        this.A0S = r29;
        this.A0I = r19;
        this.A0V = r32;
        this.A0T = r30;
        this.A0b = r38;
        this.A01 = r2;
        this.A0F = r16;
        this.A0U = r31;
        this.A0A = r11;
        this.A0Z = r36;
        this.A0a = r37;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r5 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.C48472ex r7, X.C25811b7 r8, X.AnonymousClass1gS r9, X.AnonymousClass4FY r10, boolean r11) {
        /*
            r6 = this;
            boolean r5 = r6.A01(r10)
            if (r7 == 0) goto L_0x00d2
            int r4 = r7.A00
            if (r4 == 0) goto L_0x00d2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptMessageRunnable/handleDecryptionResult axolotl status="
            X.C18260x0.A0z(r0, r1, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.A00 = r0
            r3 = 0
            if (r9 == 0) goto L_0x001c
            r9.A02 = r3
        L_0x001c:
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            if (r4 == r1) goto L_0x0026
            java.lang.Integer r0 = X.AnonymousClass36E.A03(r4)
            r8.A07 = r0
        L_0x0026:
            boolean r0 = r7.A01()
            r2 = 1
            if (r0 == 0) goto L_0x005b
            r10.BnM(r2)
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            r1 = 1
            if (r4 == r0) goto L_0x0047
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            r1 = 4
            if (r4 == r0) goto L_0x0047
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            r1 = 3
            if (r4 == r0) goto L_0x0047
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r4 == r0) goto L_0x0059
            switch(r4) {
                case -1206: goto L_0x0059;
                case -1205: goto L_0x0056;
                case -1204: goto L_0x0053;
                case -1203: goto L_0x0050;
                case -1202: goto L_0x004d;
                default: goto L_0x0046;
            }
        L_0x0046:
            r1 = 0
        L_0x0047:
            r10.Bmv(r1)
        L_0x004a:
            if (r11 == 0) goto L_0x00d1
            return r2
        L_0x004d:
            r1 = 10
            goto L_0x0047
        L_0x0050:
            r1 = 11
            goto L_0x0047
        L_0x0053:
            r1 = 12
            goto L_0x0047
        L_0x0056:
            r1 = 13
            goto L_0x0047
        L_0x0059:
            r1 = 2
            goto L_0x0047
        L_0x005b:
            r0 = -1006(0xfffffffffffffc12, float:NaN)
            if (r4 == r0) goto L_0x009c
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r4 == r0) goto L_0x009c
            if (r4 != r1) goto L_0x0099
            if (r11 != 0) goto L_0x00d2
            boolean r0 = r10.BIs()
            if (r0 != 0) goto L_0x0099
            X.2a1 r0 = r10.B8J()
            if (r0 != 0) goto L_0x007f
            X.1VX r2 = r6.A0N
            r1 = 5546(0x15aa, float:7.772E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00c2
        L_0x007f:
            X.2r5 r2 = r6.A0Y
            long r0 = r10.B9D()
            X.2rb r0 = r2.A01(r3, r0)
            if (r0 == 0) goto L_0x00c9
            java.lang.Integer r1 = r0.A0B
            if (r1 == 0) goto L_0x00c9
            X.3Qt r0 = r6.A0U
            int r1 = r1.intValue()
            android.util.SparseArray r2 = r0.A00
            monitor-enter(r2)
            goto L_0x00a2
        L_0x0099:
            if (r5 == 0) goto L_0x00d1
            goto L_0x004a
        L_0x009c:
            X.33Y r0 = r6.A0W
            r0.A07(r10)
            goto L_0x004a
        L_0x00a2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r0 = r2.get(r1, r0)     // Catch:{ all -> 0x00b2 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x00b2 }
            int r1 = X.AnonymousClass001.A0K(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00b5:
            monitor-exit(r2)
            r0 = 1
            if (r1 <= r0) goto L_0x00c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "DecryptMessageRunnable/maybeLogMessageDropEventAndSendAck/not logging duplicate message for "
            X.C18260x0.A1P(r1, r0, r10)
        L_0x00c2:
            X.33Y r0 = r6.A0W
            r0.A07(r10)
        L_0x00c7:
            r0 = 2
            return r0
        L_0x00c9:
            X.4FS r1 = r6.A0d
            r0 = 21
            X.C70133a0.A01(r1, r6, r10, r0)
            goto L_0x00c7
        L_0x00d1:
            return r3
        L_0x00d2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50622iU.A00(X.2ex, X.1b7, X.1gS, X.4FY, boolean):int");
    }
}
