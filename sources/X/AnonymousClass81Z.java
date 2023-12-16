package X;

import java.io.IOException;

/* renamed from: X.81Z  reason: invalid class name */
public final class AnonymousClass81Z implements C185238tJ {
    public final int A00;
    public final /* synthetic */ AnonymousClass812 A01;

    public AnonymousClass81Z(AnonymousClass812 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public boolean BIe() {
        AnonymousClass812 r2 = this.A01;
        int i = this.A00;
        if (r2.A04()) {
            return false;
        }
        if (r2.A0B || r2.A0K[i].A09.A01()) {
            return true;
        }
        return false;
    }

    public void BL1() {
        IOException iOException;
        AnonymousClass812 r0 = this.A01;
        C157457iK r1 = r0.A0W;
        int i = r0.A00;
        IOException iOException2 = r1.A01;
        if (iOException2 == null) {
            AnonymousClass6E2 r02 = r1.A00;
            if (r02 != null && (iOException = r02.A03) != null && r02.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r8.A02(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        return -3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r5 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if ((r5 & 4) == 4) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r9.A00 >= r2) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        r0 = Integer.MIN_VALUE | r5;
        r9.A00 = r0;
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if ((r5 & 1073741824) != 1073741824) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        r4 = r6.A01;
        r2 = r7.A0C;
        r2.A0F(1);
        r7.A05(r2.A02, 1, r4);
        r4 = r4 + 1;
        r12 = 0;
        r1 = r2.A02[0];
        r3 = X.AnonymousClass000.A1S(r1 & 128);
        r1 = r1 & Byte.MAX_VALUE;
        r11 = r9.A03;
        r0 = r11.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r0 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        r0 = new byte[16];
        r11.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        r7.A05(r0, r1, r4);
        r4 = r4 + ((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r3 == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        r2.A0F(2);
        r7.A05(r2.A02, 2, r4);
        r4 = r4 + 2;
        r14 = r2.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        r13 = r11.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e0, code lost:
        if (r13 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        if (r13.length >= r14) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        r13 = new int[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r10 = r11.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r10 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        if (r10.length >= r14) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r10 = new int[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
        if (r3 == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        r1 = r14 * 6;
        r2.A0F(r1);
        r7.A05(r2.A02, r1, r4);
        r4 = r4 + ((long) r1);
        r2.A0H(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0101, code lost:
        if (r12 >= r14) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        r13[r12] = r2.A06();
        r10[r12] = r2.A05();
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        r13[0] = 0;
        r10[0] = r6.A00 - ((int) (r4 - r6.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        r0 = r6.A02;
        r15 = r0.A03;
        r12 = r11.A04;
        r1 = r0.A01;
        r3 = r0.A02;
        r2 = r0.A00;
        r11.A03 = r14;
        r11.A06 = r13;
        r11.A07 = r10;
        r11.A05 = r15;
        r11.A04 = r12;
        r11.A02 = r1;
        r11.A01 = r3;
        r11.A00 = r2;
        r0 = r11.A08;
        r0.numSubSamples = r14;
        r0.numBytesOfClearData = r13;
        r0.numBytesOfEncryptedData = r10;
        r0.key = r15;
        r0.iv = r12;
        r0.mode = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014e, code lost:
        if (com.facebook.android.exoplayer2.util.Util.A00 < 24) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0150, code lost:
        r0 = r11.A09;
        r0.getClass();
        X.C155987fq.A00(r0, r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0158, code lost:
        r0 = r6.A01;
        r10 = (int) (r4 - r0);
        r6.A01 = r0 + ((long) r10);
        r6.A00 -= r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r9.A01(r6.A00);
        r1 = r6.A01;
        r9 = r9.A01;
        r10 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0170, code lost:
        r5 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0176, code lost:
        if (r1 < r5.A00) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
        r7.A06 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        if (r10 <= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        r12 = java.lang.Math.min(r10, (int) (r5.A00 - r1));
        r9.put(r5.A03.A00, (int) (r1 - r5.A01), r12);
        r10 = r10 - r12;
        r1 = r1 + ((long) r12);
        r5 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019c, code lost:
        if (r1 != r5.A00) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        r5 = r5.A02;
        r7.A06 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a3, code lost:
        r2 = r8.A0K[r17].A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ad, code lost:
        if (r2.A01() != false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01af, code lost:
        r1 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b1, code lost:
        r8.A03(r1, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b6, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b7, code lost:
        r1 = r2.A04 + r2.A03;
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01be, code lost:
        if (r1 < r0) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c0, code lost:
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c1, code lost:
        r1 = r2.A0F[r1];
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0062=Splitter:B:28:0x0062, B:81:0x01c6=Splitter:B:81:0x01c6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiJ(X.C1463279v r19, X.AnonymousClass6Jl r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            X.812 r8 = r0.A01
            int r0 = r0.A00
            r17 = r0
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x0011
            r16 = -3
            return r16
        L_0x0011:
            X.818[] r0 = r8.A0K
            r7 = r0[r17]
            r10 = 2
            r0 = r21 & 2
            boolean r12 = X.AnonymousClass000.A1U(r0, r10)
            boolean r5 = r8.A0B
            long r2 = r8.A04
            X.7XN r4 = r7.A09
            X.7z1 r1 = r7.A02
            X.7Iw r6 = r7.A0A
            monitor-enter(r4)
            boolean r0 = r4.A01()     // Catch:{ all -> 0x01d6 }
            r9 = r20
            if (r0 != 0) goto L_0x003f
            if (r5 == 0) goto L_0x0035
            r0 = 4
            r9.A00 = r0     // Catch:{ all -> 0x01d6 }
            goto L_0x0084
        L_0x0035:
            X.7z1 r0 = r4.A07     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x0059
            if (r12 != 0) goto L_0x01ca
            if (r0 == r1) goto L_0x0059
            goto L_0x01ca
        L_0x003f:
            int r5 = r4.A03     // Catch:{ all -> 0x01d6 }
            int r11 = r4.A04     // Catch:{ all -> 0x01d6 }
            int r11 = r11 + r5
            int r0 = r4.A01     // Catch:{ all -> 0x01d6 }
            if (r11 < r0) goto L_0x0049
            int r11 = r11 - r0
        L_0x0049:
            if (r12 != 0) goto L_0x01c6
            X.7z1[] r0 = r4.A0F     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            if (r0 != r1) goto L_0x01c6
            java.nio.ByteBuffer r0 = r9.A01     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x0062
            int r0 = r9.A02     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x0062
        L_0x0059:
            monitor-exit(r4)
            r16 = -3
            r0 = r17
            r8.A02(r0)
            return r16
        L_0x0062:
            long[] r0 = r4.A0E     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            r9.A00 = r0     // Catch:{ all -> 0x01d6 }
            int[] r0 = r4.A0A     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            r9.A00 = r0     // Catch:{ all -> 0x01d6 }
            int[] r0 = r4.A0B     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            r6.A00 = r0     // Catch:{ all -> 0x01d6 }
            long[] r0 = r4.A0D     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            r6.A01 = r0     // Catch:{ all -> 0x01d6 }
            X.7WT[] r0 = r4.A0G     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
            r6.A02 = r0     // Catch:{ all -> 0x01d6 }
            int r0 = r5 + 1
            r4.A03 = r0     // Catch:{ all -> 0x01d6 }
        L_0x0084:
            monitor-exit(r4)
            r16 = -4
            r1 = 4
            int r5 = r9.A00
            r0 = r5 & 4
            if (r0 == r1) goto L_0x01a3
            long r0 = r9.A00
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x009a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r5
            r9.A00 = r0
            r5 = r0
        L_0x009a:
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = r5 & r0
            if (r5 != r0) goto L_0x0165
            long r4 = r6.A01
            X.7ph r2 = r7.A0C
            r1 = 1
            r2.A0F(r1)
            byte[] r0 = r2.A02
            r7.A05(r0, r1, r4)
            r0 = 1
            long r4 = r4 + r0
            byte[] r0 = r2.A02
            r12 = 0
            byte r1 = r0[r12]
            r0 = r1 & 128(0x80, float:1.794E-43)
            boolean r3 = X.AnonymousClass000.A1S(r0)
            r1 = r1 & 127(0x7f, float:1.78E-43)
            X.7Pk r11 = r9.A03
            byte[] r0 = r11.A04
            if (r0 != 0) goto L_0x00c8
            r0 = 16
            byte[] r0 = new byte[r0]
            r11.A04 = r0
        L_0x00c8:
            r7.A05(r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            if (r3 == 0) goto L_0x0112
            r2.A0F(r10)
            byte[] r0 = r2.A02
            r7.A05(r0, r10, r4)
            r0 = 2
            long r4 = r4 + r0
            int r14 = r2.A06()
        L_0x00de:
            int[] r13 = r11.A06
            if (r13 == 0) goto L_0x00e5
            int r0 = r13.length
            if (r0 >= r14) goto L_0x00e7
        L_0x00e5:
            int[] r13 = new int[r14]
        L_0x00e7:
            int[] r10 = r11.A07
            if (r10 == 0) goto L_0x00ee
            int r0 = r10.length
            if (r0 >= r14) goto L_0x00f0
        L_0x00ee:
            int[] r10 = new int[r14]
        L_0x00f0:
            if (r3 == 0) goto L_0x0114
            int r1 = r14 * 6
            r2.A0F(r1)
            byte[] r0 = r2.A02
            r7.A05(r0, r1, r4)
            long r0 = (long) r1
            long r4 = r4 + r0
            r2.A0H(r12)
        L_0x0101:
            if (r12 >= r14) goto L_0x0120
            int r0 = r2.A06()
            r13[r12] = r0
            int r0 = r2.A05()
            r10[r12] = r0
            int r12 = r12 + 1
            goto L_0x0101
        L_0x0112:
            r14 = 1
            goto L_0x00de
        L_0x0114:
            r13[r12] = r12
            int r15 = r6.A00
            long r2 = r6.A01
            long r0 = r4 - r2
            int r2 = (int) r0
            int r15 = r15 - r2
            r10[r12] = r15
        L_0x0120:
            X.7WT r0 = r6.A02
            byte[] r15 = r0.A03
            byte[] r12 = r11.A04
            int r1 = r0.A01
            int r3 = r0.A02
            int r2 = r0.A00
            r11.A03 = r14
            r11.A06 = r13
            r11.A07 = r10
            r11.A05 = r15
            r11.A04 = r12
            r11.A02 = r1
            r11.A01 = r3
            r11.A00 = r2
            android.media.MediaCodec$CryptoInfo r0 = r11.A08
            r0.numSubSamples = r14
            r0.numBytesOfClearData = r13
            r0.numBytesOfEncryptedData = r10
            r0.key = r15
            r0.iv = r12
            r0.mode = r1
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            r0 = 24
            if (r1 < r0) goto L_0x0158
            X.7fq r0 = r11.A09
            r0.getClass()
            X.C155987fq.A00(r0, r3, r2)
        L_0x0158:
            long r0 = r6.A01
            long r4 = r4 - r0
            int r10 = (int) r4
            long r2 = (long) r10
            long r0 = r0 + r2
            r6.A01 = r0
            int r0 = r6.A00
            int r0 = r0 - r10
            r6.A00 = r0
        L_0x0165:
            int r0 = r6.A00
            r9.A01(r0)
            long r1 = r6.A01
            java.nio.ByteBuffer r9 = r9.A01
            int r10 = r6.A00
        L_0x0170:
            X.7Lh r5 = r7.A06
            long r3 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x017d
            X.7Lh r0 = r5.A02
            r7.A06 = r0
            goto L_0x0170
        L_0x017d:
            if (r10 <= 0) goto L_0x01a3
            long r3 = r5.A00
            long r3 = r3 - r1
            int r0 = (int) r3
            int r12 = java.lang.Math.min(r10, r0)
            X.7A6 r0 = r5.A03
            byte[] r11 = r0.A00
            long r5 = r5.A01
            long r3 = r1 - r5
            int r0 = (int) r3
            r9.put(r11, r0, r12)
            int r10 = r10 - r12
            long r3 = (long) r12
            long r1 = r1 + r3
            X.7Lh r5 = r7.A06
            long r3 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x017d
            X.7Lh r5 = r5.A02
            r7.A06 = r5
            goto L_0x017d
        L_0x01a3:
            X.818[] r0 = r8.A0K
            r0 = r0[r17]
            X.7XN r2 = r0.A09
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x01b7
            X.7z1 r1 = r2.A07
        L_0x01b1:
            r0 = r17
            r8.A03(r1, r0)
            return r16
        L_0x01b7:
            int r0 = r2.A03
            int r1 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A01
            if (r1 < r0) goto L_0x01c1
            int r1 = r1 - r0
        L_0x01c1:
            X.7z1[] r0 = r2.A0F
            r1 = r0[r1]
            goto L_0x01b1
        L_0x01c6:
            X.7z1[] r0 = r4.A0F     // Catch:{ all -> 0x01d6 }
            r0 = r0[r11]     // Catch:{ all -> 0x01d6 }
        L_0x01ca:
            r1 = r19
            r1.A00 = r0     // Catch:{ all -> 0x01d6 }
            monitor-exit(r4)
            X.7z1 r0 = r1.A00
            r7.A02 = r0
            r16 = -5
            return r16
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Z.BiJ(X.79v, X.6Jl, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BpO(long r9) {
        /*
            r8 = this;
            X.812 r4 = r8.A01
            int r3 = r8.A00
            boolean r0 = r4.A04()
            r7 = 0
            if (r0 != 0) goto L_0x005c
            X.818[] r0 = r4.A0K
            r6 = r0[r3]
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x002f
            X.7XN r5 = r6.A09
            monitor-enter(r5)
            long r1 = r5.A06     // Catch:{ all -> 0x002c }
            monitor-exit(r5)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            X.7XN r2 = r6.A09
            monitor-enter(r2)
            int r1 = r2.A02     // Catch:{ all -> 0x0029 }
            int r0 = r2.A03     // Catch:{ all -> 0x0029 }
            int r7 = r1 - r0
            r2.A03 = r1     // Catch:{ all -> 0x0029 }
            goto L_0x0039
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x002f:
            r0 = 1
            int r1 = r6.A01(r9, r0)
            r0 = -1
            if (r1 == r0) goto L_0x0059
            r7 = r1
            goto L_0x003a
        L_0x0039:
            monitor-exit(r2)
        L_0x003a:
            if (r7 <= 0) goto L_0x0059
            X.7XN r2 = r6.A09
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x004a
            X.7z1 r0 = r2.A07
        L_0x0046:
            r4.A03(r0, r3)
            return r7
        L_0x004a:
            int r0 = r2.A03
            int r1 = r2.A04
            int r1 = r1 + r0
            int r0 = r2.A01
            if (r1 < r0) goto L_0x0054
            int r1 = r1 - r0
        L_0x0054:
            X.7z1[] r0 = r2.A0F
            r0 = r0[r1]
            goto L_0x0046
        L_0x0059:
            r4.A02(r3)
        L_0x005c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81Z.BpO(long):int");
    }
}
