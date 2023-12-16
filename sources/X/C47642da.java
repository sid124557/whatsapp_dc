package X;

import android.os.Handler;

/* renamed from: X.2da  reason: invalid class name and case insensitive filesystem */
public class C47642da {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C116985rC A01;
    public final C116985rC A02;
    public final C56972sr A03;
    public final AnonymousClass36E A04;
    public final C49712gy A05;
    public final C42112Mv A06;
    public final C64773Ex A07;
    public final C29231iU A08;
    public final C56612sH A09;
    public final C621133n A0A;
    public final C48972fm A0B;
    public final C614730x A0C;
    public final C56982ss A0D;
    public final C66543Lv A0E;
    public final C55672qj A0F;
    public final C56892sj A0G;
    public final C55332qB A0H;
    public final C54012o2 A0I;
    public final C620333f A0J;
    public final AnonymousClass33Z A0K;
    public final AnonymousClass318 A0L;
    public final AnonymousClass1VX A0M;
    public final C54602oz A0N;
    public final C66383Le A0O;
    public final AnonymousClass33S A0P;
    public final C55892r5 A0Q;
    public final C45002Yh A0R;
    public final C59882xe A0S;
    public final C55832qz A0T;
    public final AnonymousClass4FS A0U;
    public final C183538qC A0V;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e A[Catch:{ all -> 0x00ee, all -> 0x00f5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A00(com.whatsapp.jid.DeviceJid r16, X.AnonymousClass2z0 r17, X.C42612Ov r18, X.C42612Ov r19, byte[] r20, byte[] r21, int r22, int r23, boolean r24) {
        /*
            r15 = this;
            r14 = 5
            X.30x r1 = r15.A0C
            r6 = r16
            com.whatsapp.jid.UserJid r0 = r6.userJid
            X.2ov r0 = X.AnonymousClass36G.A03(r0)
            X.3fe r7 = X.C614730x.A00(r0, r1)
            X.2ov r3 = X.AnonymousClass36G.A02(r6)     // Catch:{ all -> 0x00ee }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/axolotl checking sessions for "
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r3)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = " due to retry receipt for "
            r2 = r17
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x00ee }
            r12 = r21
            r5 = r23
            if (r21 == 0) goto L_0x0082
            r11 = r18
            if (r18 == 0) goto L_0x0082
            if (r24 == 0) goto L_0x005b
            X.33n r1 = r15.A0A     // Catch:{ all -> 0x00ee }
            boolean r0 = r1.A0Z(r3)     // Catch:{ all -> 0x00ee }
            r4 = 1
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/axolotl Not processing keys from the receipt, missing session for "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x00ee }
            goto L_0x005c
        L_0x0045:
            X.2wr r0 = r1.A0A(r3)     // Catch:{ all -> 0x00ee }
            X.2uv r0 = r0.A01     // Catch:{ all -> 0x00ee }
            X.1E1 r0 = r0.A00     // Catch:{ all -> 0x00ee }
            int r0 = r0.remoteRegistrationId_     // Catch:{ all -> 0x00ee }
            if (r0 == r5) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/Not processing keys from the receipt, registrationId does not match for "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x00ee }
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 != 0) goto L_0x0082
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "axolotl processing keys from the receipt for jid:"
            X.C18260x0.A1R(r1, r0, r6)     // Catch:{ all -> 0x00ee }
            X.2ov r9 = X.AnonymousClass36G.A02(r6)     // Catch:{ all -> 0x00ee }
            X.33n r8 = r15.A0A     // Catch:{ all -> 0x00ee }
            r10 = r19
            r13 = r20
            int r4 = r8.A02(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00ee }
            if (r4 != 0) goto L_0x009b
            android.os.Handler r1 = r15.A00     // Catch:{ all -> 0x00ee }
            r0 = 31
            X.3a0 r0 = X.C70133a0.A00(r15, r6, r0)     // Catch:{ all -> 0x00ee }
            r1.post(r0)     // Catch:{ all -> 0x00ee }
        L_0x0082:
            X.33n r6 = r15.A0A     // Catch:{ all -> 0x00ee }
            boolean r0 = r6.A0Z(r3)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00e7
            X.2wr r0 = r6.A0A(r3)     // Catch:{ all -> 0x00ee }
            X.2uv r0 = r0.A01     // Catch:{ all -> 0x00ee }
            X.1E1 r1 = r0.A00     // Catch:{ all -> 0x00ee }
            X.8Lq r0 = r1.aliceBaseKey_     // Catch:{ all -> 0x00ee }
            byte[] r4 = r0.A07()     // Catch:{ all -> 0x00ee }
            int r0 = r1.remoteRegistrationId_     // Catch:{ all -> 0x00ee }
            goto L_0x00a5
        L_0x009b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/Error received from SignalCoordinator; status="
            X.C18260x0.A0x(r0, r1, r4)     // Catch:{ all -> 0x00ee }
            goto L_0x0082
        L_0x00a5:
            if (r0 == r5) goto L_0x00b7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/axolotl deleting session due to registration id change for "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x00ee }
            r6.A0B(r3)     // Catch:{ all -> 0x00ee }
            r6.A0O(r3)     // Catch:{ all -> 0x00ee }
            goto L_0x00d3
        L_0x00b7:
            r1 = 2
            r5 = r22
            if (r5 <= r1) goto L_0x00d9
            boolean r0 = r6.A0b(r3, r2)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x00d9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/axolotl will wait to send "
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r2)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = " until a new prekey has been fetched"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x00ee }
        L_0x00d3:
            if (r7 == 0) goto L_0x00d8
            r7.close()
        L_0x00d8:
            return r4
        L_0x00d9:
            if (r5 != r1) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "RetryReceiptHandler/axolotl will record the base key used to send "
            X.C18260x0.A1R(r1, r0, r2)     // Catch:{ all -> 0x00ee }
            r6.A0R(r3, r2, r4)     // Catch:{ all -> 0x00ee }
        L_0x00e7:
            if (r7 == 0) goto L_0x00ec
            r7.close()
        L_0x00ec:
            r0 = 0
            return r0
        L_0x00ee:
            r1 = move-exception
            if (r7 == 0) goto L_0x00f9
            r7.close()     // Catch:{ all -> 0x00f5 }
            throw r1
        L_0x00f5:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00f9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47642da.A00(com.whatsapp.jid.DeviceJid, X.2z0, X.2Ov, X.2Ov, byte[], byte[], int, int, boolean):byte[]");
    }

    public C47642da(C116985rC r2, C116985rC r3, C56972sr r4, AnonymousClass36E r5, C49712gy r6, C42112Mv r7, C64773Ex r8, C29231iU r9, C56612sH r10, C621133n r11, C48972fm r12, C614730x r13, C56982ss r14, C66543Lv r15, C55672qj r16, C56892sj r17, C55332qB r18, C54012o2 r19, C620333f r20, AnonymousClass33Z r21, AnonymousClass318 r22, AnonymousClass1VX r23, C54602oz r24, C66383Le r25, AnonymousClass33S r26, C55892r5 r27, C45002Yh r28, C59882xe r29, C55832qz r30, AnonymousClass4FS r31, C183538qC r32) {
        this.A09 = r10;
        this.A0M = r23;
        this.A03 = r4;
        this.A0U = r31;
        this.A0D = r14;
        this.A0P = r26;
        this.A0C = r13;
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A0I = r19;
        this.A0B = r12;
        this.A0E = r15;
        this.A0T = r30;
        this.A0A = r11;
        this.A0L = r22;
        this.A0V = r32;
        this.A06 = r7;
        this.A0Q = r27;
        this.A0J = r20;
        this.A01 = r2;
        this.A0K = r21;
        this.A0F = r16;
        this.A0H = r18;
        this.A0R = r28;
        this.A0S = r29;
        this.A02 = r3;
        this.A0N = r24;
        this.A0G = r17;
        this.A08 = r9;
        this.A0O = r25;
    }
}
