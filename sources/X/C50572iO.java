package X;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.2iO  reason: invalid class name and case insensitive filesystem */
public final class C50572iO {
    public final AnonymousClass2VS A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56982ss A03;
    public final C66543Lv A04;
    public final C56892sj A05;
    public final C29431io A06;
    public final AnonymousClass2S9 A07;
    public final AnonymousClass1VX A08;
    public final C45982at A09;
    public final C28191fq A0A;
    public final C28091fg A0B;
    public final AnonymousClass5UP A0C;
    public final C55832qz A0D;
    public final C33141sV A0E;
    public final AnonymousClass4FS A0F;
    public final Executor A0G;
    public final AnonymousClass66R A0H = C154517dI.A01(C816940s.A00);

    public final void A01(C624134x r4, int i) {
        C162457s7.A0J(r4, 0);
        C55592qb r1 = r4.A0l;
        if (r1 != null && !r1.A09 && r1.A04 != null && r1.A08 != null) {
            if ((r1.A05 != null && r1.A0A != null) || AnonymousClass2z0.A0C(r4)) {
                if (!this.A08.A0Y(C58422vE.A02, 6079) || !C615631i.A02()) {
                    A00(r4, i);
                } else {
                    C71713cY.A00(this.A0F, this, r4, i, 3);
                }
            }
        }
    }

    public C50572iO(AnonymousClass2VS r17, C64393Dh r18, C69263Wi r19, C56982ss r20, C66543Lv r21, C56892sj r22, C29431io r23, AnonymousClass2S9 r24, AnonymousClass1VX r25, C45982at r26, C28191fq r27, C28091fg r28, AnonymousClass5UP r29, C55832qz r30, C33141sV r31, AnonymousClass4FS r32) {
        AnonymousClass4FS r3 = r32;
        AnonymousClass1VX r7 = r25;
        C56982ss r12 = r20;
        C69263Wi r13 = r19;
        C64393Dh r14 = r18;
        C18260x0.A0f(r7, r13, r3, r12, r14);
        AnonymousClass5UP r4 = r29;
        C55832qz r1 = r30;
        C33141sV r0 = r31;
        C29431io r9 = r23;
        C66543Lv r11 = r21;
        C18260x0.A0g(r4, r11, r1, r9, r0);
        C28091fg r5 = r28;
        C56892sj r10 = r22;
        AnonymousClass2VS r15 = r17;
        C18260x0.A0Y(r15, r5, r10);
        C28191fq r6 = r27;
        C162457s7.A0J(r6, 15);
        AnonymousClass2S9 r8 = r24;
        C162457s7.A0J(r8, 16);
        this.A08 = r7;
        this.A02 = r13;
        this.A0F = r3;
        this.A03 = r12;
        this.A01 = r14;
        this.A0C = r4;
        this.A04 = r11;
        this.A0D = r1;
        this.A06 = r9;
        this.A0E = r0;
        this.A00 = r15;
        this.A0B = r5;
        this.A05 = r10;
        this.A09 = r26;
        this.A0A = r6;
        this.A07 = r8;
        Objects.requireNonNull(r3);
        this.A0G = new C86044Ip(r3, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if (r7 == X.C633138t.A0U) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C624134x r58, int r59) {
        /*
            r57 = this;
            r5 = r58
            X.2qb r4 = r5.A0l
            r11 = 0
            if (r4 == 0) goto L_0x011d
            X.2z0 r6 = r5.A1J
            X.4uZ r3 = r6.A00
            boolean r0 = r3 instanceof X.C135166kE
            r45 = r0
            boolean r1 = r5 instanceof X.C30471mV
            if (r1 == 0) goto L_0x001e
            r0 = r5
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = X.C30471mV.A00(r0)
            java.lang.String r8 = r0.A0I
            if (r8 != 0) goto L_0x0027
        L_0x001e:
            java.lang.String r8 = X.C18280x3.A0Y()
            X.C162457s7.A0D(r8)
            if (r1 == 0) goto L_0x0030
        L_0x0027:
            r0 = r5
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = X.C30471mV.A00(r0)
            r0.A0I = r8
        L_0x0030:
            r2 = r57
            X.3Dh r9 = r2.A01
            byte r10 = r5.A1I
            boolean r1 = r3 instanceof X.C95804uY
            java.lang.String r0 = r4.A05
            r28 = r0
            X.38t r7 = X.AnonymousClass36O.A00(r10, r1)
            java.lang.String r13 = r4.A08
            r0 = 0
            r19 = r11
            r14 = r9
            r15 = r7
            r16 = r11
            r17 = r28
            r18 = r13
            r20 = r0
            java.io.File r23 = r14.A0L(r15, r16, r17, r18, r19, r20)
            r14 = 1
            java.io.File r22 = r9.A0O(r11, r0)
            if (r22 != 0) goto L_0x0064
            java.io.File r12 = r9.A0D()
            java.lang.String r9 = ".thumb.tmp"
            java.io.File r22 = X.C64393Dh.A04(r12, r13, r11, r9)
        L_0x0064:
            r41 = 0
            java.lang.String r15 = r4.A04
            r37 = 2
            X.38t r9 = X.C633138t.A0I
            if (r7 == r9) goto L_0x0073
            X.38t r12 = X.C633138t.A0U
            r9 = 0
            if (r7 != r12) goto L_0x0074
        L_0x0073:
            r9 = 1
        L_0x0074:
            int r38 = X.C106495Zf.A00(r10, r0, r9)
            byte[] r9 = r4.A0A
            X.2dc r16 = new X.2dc
            r20 = r11
            r21 = r11
            r24 = r11
            r26 = r11
            r29 = r11
            r31 = r11
            r32 = r11
            r33 = r11
            r36 = r0
            r40 = r0
            r46 = r0
            r47 = r0
            r48 = r0
            r49 = r0
            r50 = r0
            r51 = r0
            r52 = r0
            r53 = r14
            r54 = r0
            r55 = r0
            r56 = r0
            r17 = r11
            r25 = r13
            r27 = r8
            r30 = r15
            r34 = r9
            r35 = r0
            r39 = r14
            r43 = r41
            r18 = r11
            r19 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            X.2VS r7 = r2.A00
            r22 = 1
            if (r3 == 0) goto L_0x011d
            int r21 = X.AnonymousClass368.A00(r3)
            r20 = r59
            r17 = r7
            r19 = r16
            r24 = r0
            X.1I7 r9 = r17.A00(r18, r19, r20, r21, r22, r24)
            X.2sj r0 = r2.A05
            X.C626936e.A06(r3)
            java.util.Set r0 = r0.A04(r3)
            int r0 = r0.size()
            X.2sf r3 = r9.A0h
            r3.A01 = r0
            long r7 = r5.A0I
            r3.A0E = r7
            java.lang.String r0 = r6.A01
            r3.A0W = r0
            r0 = 11
            X.4Jh r6 = new X.4Jh
            r6.<init>(r5, r2, r4, r0)
            java.util.concurrent.Executor r3 = r2.A0G
            X.3XB r0 = r9.A0G
            r0.A04(r6, r3)
            if (r1 == 0) goto L_0x0128
            X.5UP r1 = r2.A0C
            boolean r0 = r1.A03(r14)
            if (r0 != 0) goto L_0x011e
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x011e
            r3 = 0
        L_0x010d:
            X.66R r0 = r2.A0H
            android.os.Handler r6 = X.AnonymousClass0x9.A0A(r0)
            r1 = 47
            X.3aL r0 = new X.3aL
            r0.<init>(r2, r5, r9, r1)
            r6.postDelayed(r0, r3)
        L_0x011d:
            return
        L_0x011e:
            X.2ss r1 = r2.A03
            X.1VX r0 = r2.A08
            int r0 = X.C383427e.A00(r1, r0, r5)
            long r3 = (long) r0
            goto L_0x010d
        L_0x0128:
            X.1fg r0 = r2.A0B
            r0.A02(r5, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50572iO.A00(X.34x, int):void");
    }
}
