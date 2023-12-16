package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.8Ab  reason: invalid class name and case insensitive filesystem */
public final class C169638Ab implements C186258v0 {
    public static final Unsafe A0F = C162337rj.A03();
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass72U A03;
    public final C157877j2 A04;
    public final C180998ly A05;
    public final C187818xr A06;
    public final C178558hj A07;
    public final AnonymousClass72V A08;
    public final boolean A09;
    public final int[] A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final Object[] A0E;

    public static int A02(C148847Jy r2, C186258v0 r3, byte[] bArr, int i, int i2, int i3) {
        C169638Ab r1 = (C169638Ab) r3;
        Object BLT = r1.BLT();
        int A092 = r1.A09(r2, BLT, bArr, i, i2, i3);
        r1.Btp(BLT);
        r2.A02 = BLT;
        return A092;
    }

    public static int A00(int i, int i2, int i3) {
        return i3 + (i2 * C128346Vs.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C148847Jy r6, X.C186258v0 r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = X.C161917qp.A04(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.BLT()
            int r5 = r5 + r4
            r0.BtQ(r1, r2, r3, r4, r5)
            r7.Btp(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.A01(X.7Jy, X.8v0, byte[], int, int):int");
    }

    public static int A04(Object obj) {
        return ((List) obj).size();
    }

    public static void A07(C181018m0 r1, Object obj, int i) {
        if (obj instanceof String) {
            ((C169658Ad) r1).A00.A08(i, (String) obj);
            return;
        }
        ((C169658Ad) r1).A00.A0B((C172528Lo) obj, i);
    }

    public final int A08(int i) {
        int i2;
        int i3 = this.A00;
        if (i >= i3) {
            int i4 = this.A02;
            if (i < i4) {
                i2 = (i - i3) << 2;
                if (this.A0A[i2] == i) {
                    return i2;
                }
            } else if (i <= this.A01) {
                int i5 = i4 - i3;
                int[] iArr = this.A0A;
                int length = (iArr.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    i2 = i6 << 2;
                    int i7 = iArr[i2];
                    if (i != i7) {
                        if (i < i7) {
                            length = i6 - 1;
                        } else {
                            i5 = i6 + 1;
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0296, code lost:
        r8.putObject(r4, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0299, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b3, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r3 = r5 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011b, code lost:
        r3 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b2, code lost:
        r8.putObject(r4, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b5, code lost:
        r12 = r12 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c1, code lost:
        r5 = r7.A02;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.C148847Jy r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r3 = r41
            sun.misc.Unsafe r8 = A0F
            r2 = -1
            r13 = 0
            r12 = 0
            r20 = -1
        L_0x0009:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r37
            r27 = r42
            r4 = r39
            r21 = r43
            r0 = r27
            if (r3 >= r0) goto L_0x02c5
            int r5 = r3 + 1
            r6 = r40
            byte r13 = r40[r3]
            r7 = r38
            if (r13 >= 0) goto L_0x0028
            int r5 = X.C161917qp.A04(r7, r6, r13, r5)
            int r13 = r7.A00
        L_0x0028:
            int r18 = r13 >>> 3
            r9 = r13 & 7
            r0 = r18
            int r11 = r10.A08(r0)
            if (r11 == r2) goto L_0x0069
            int[] r3 = r10.A0A
            int r0 = r11 + 1
            r17 = r3[r0]
            int r15 = X.AnonymousClass6C8.A07(r17)
            r0 = r17 & r19
            long r0 = (long) r0
            r2 = 17
            if (r15 > r2) goto L_0x01c4
            int r2 = r11 + 2
            r14 = r3[r2]
            int r2 = r14 >>> 20
            r16 = 1
            int r16 = r16 << r2
            r14 = r14 & r19
            r2 = r20
            if (r14 == r2) goto L_0x0065
            r2 = -1
            r3 = r20
            if (r3 == r2) goto L_0x005e
            long r2 = (long) r3
            r8.putInt(r4, r2, r12)
        L_0x005e:
            long r2 = (long) r14
            int r12 = r8.getInt(r4, r2)
            r20 = r14
        L_0x0065:
            r2 = 5
            switch(r15) {
                case 0: goto L_0x00b7;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00fe;
                case 6: goto L_0x0112;
                case 7: goto L_0x011f;
                case 8: goto L_0x029e;
                case 9: goto L_0x027b;
                case 10: goto L_0x01b9;
                case 11: goto L_0x00f1;
                case 12: goto L_0x0136;
                case 13: goto L_0x0112;
                case 14: goto L_0x00fe;
                case 15: goto L_0x0164;
                case 16: goto L_0x0175;
                case 17: goto L_0x018c;
                default: goto L_0x0069;
            }
        L_0x0069:
            r0 = r21
            if (r13 != r0) goto L_0x00a7
            if (r43 == 0) goto L_0x00a7
            r1 = -1
            r3 = r5
        L_0x0071:
            r0 = r20
            if (r0 == r1) goto L_0x0079
            long r0 = (long) r0
            r8.putInt(r4, r0, r12)
        L_0x0079:
            int[] r6 = r10.A0C
            if (r6 == 0) goto L_0x02c8
            int r5 = r6.length
            r2 = 0
        L_0x007f:
            if (r2 >= r5) goto L_0x02c8
            r7 = r6[r2]
            int[] r1 = r10.A0A
            int r0 = r7 + 1
            r0 = r1[r0]
            r0 = r0 & r19
            long r0 = (long) r0
            java.lang.Object r0 = X.C162337rj.A01(r4, r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.Object[] r1 = r10.A0E
            int r0 = r7 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00a4
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00a4:
            int r2 = r2 + 1
            goto L_0x007f
        L_0x00a7:
            X.7o3 r1 = X.C128166Va.A01(r4)
            r0 = r7
            r2 = r6
            r3 = r13
            r4 = r5
            r5 = r27
            int r3 = X.C161917qp.A00(r0, r1, r2, r3, r4, r5)
            goto L_0x029b
        L_0x00b7:
            r2 = 1
            if (r9 != r2) goto L_0x0069
            long r2 = X.AnonymousClass6C7.A0N(r6, r5)
            double r25 = java.lang.Double.longBitsToDouble(r2)
            X.7bt r21 = X.C162337rj.A02
            r22 = r4
            r23 = r0
            r21.A09(r22, r23, r25)
            goto L_0x010e
        L_0x00cc:
            if (r9 != r2) goto L_0x0069
            int r2 = X.AnonymousClass6C7.A0B(r6, r5)
            float r3 = java.lang.Float.intBitsToFloat(r2)
            X.7bt r2 = X.C162337rj.A02
            r2.A0A(r4, r0, r3)
            goto L_0x011b
        L_0x00dc:
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A02(r7, r6, r5)
            long r5 = r7.A01
            r22 = r4
            r21 = r8
            r23 = r0
            r25 = r5
            r21.putLong(r22, r23, r25)
            goto L_0x0299
        L_0x00f1:
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A01(r7, r6, r5)
            int r2 = r7.A00
            r8.putInt(r4, r0, r2)
            goto L_0x0299
        L_0x00fe:
            r2 = 1
            if (r9 != r2) goto L_0x0069
            long r25 = X.AnonymousClass6C7.A0N(r6, r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
        L_0x010e:
            int r3 = r5 + 8
            goto L_0x0299
        L_0x0112:
            if (r9 != r2) goto L_0x0069
            int r2 = X.AnonymousClass6C7.A0B(r6, r5)
            r8.putInt(r4, r0, r2)
        L_0x011b:
            int r3 = r5 + 4
            goto L_0x0299
        L_0x011f:
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A02(r7, r6, r5)
            long r5 = r7.A01
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1S(r2)
            X.7bt r2 = X.C162337rj.A02
            r2.A0D(r4, r0, r5)
            goto L_0x0299
        L_0x0136:
            r2 = -1
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A01(r7, r6, r5)
            int r6 = r7.A00
            java.lang.Object[] r7 = r10.A0E
            int r5 = r11 / 4
            int r5 = r5 << 1
            int r5 = r5 + 1
            r5 = r7[r5]
            X.8lx r5 = (X.C180988lx) r5
            if (r5 == 0) goto L_0x0160
            X.8hh r5 = r5.BtZ(r6)
            if (r5 != 0) goto L_0x0160
            X.7o3 r1 = X.C128166Va.A01(r4)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r6)
            r1.A01(r13, r0)
            goto L_0x0009
        L_0x0160:
            r8.putInt(r4, r0, r6)
            goto L_0x01b5
        L_0x0164:
            r2 = -1
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A01(r7, r6, r5)
            int r5 = r7.A00
            int r5 = X.AnonymousClass6C8.A08(r5)
            r8.putInt(r4, r0, r5)
            goto L_0x01b5
        L_0x0175:
            r2 = -1
            if (r9 != 0) goto L_0x0069
            int r3 = X.C161917qp.A02(r7, r6, r5)
            long r5 = r7.A01
            long r25 = X.AnonymousClass6C7.A0G(r5)
            r22 = r4
            r21 = r8
            r23 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x01b5
        L_0x018c:
            r2 = 3
            if (r9 != r2) goto L_0x0069
            int r2 = r18 << 3
            r26 = r2 | 4
            X.8v0 r22 = r10.A0C(r11)
            r2 = -1
            r21 = r7
            r23 = r6
            r24 = r5
            r25 = r27
            int r3 = A02(r21, r22, r23, r24, r25, r26)
            r5 = r12 & r16
            if (r5 == 0) goto L_0x01c1
            java.lang.Object r6 = r8.getObject(r4, r0)
            java.lang.Object r5 = r7.A02
            java.lang.Object r5 = X.C155587f9.A00(r6, r5)
        L_0x01b2:
            r8.putObject(r4, r0, r5)
        L_0x01b5:
            r12 = r12 | r16
            goto L_0x0009
        L_0x01b9:
            r3 = 2
            r2 = -1
            if (r9 != r3) goto L_0x0069
            int r3 = X.C161917qp.A03(r7, r6, r5)
        L_0x01c1:
            java.lang.Object r5 = r7.A02
            goto L_0x01b2
        L_0x01c4:
            r2 = 27
            if (r15 != r2) goto L_0x0205
            r2 = 2
            if (r9 != r2) goto L_0x0069
            java.lang.Object r2 = r8.getObject(r4, r0)
            X.8yY r2 = (X.C188228yY) r2
            r3 = r2
            X.8T2 r3 = (X.AnonymousClass8T2) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x01e3
            int r3 = X.AnonymousClass6C9.A0E(r2)
            X.8yY r2 = r2.BuC(r3)
            r8.putObject(r4, r0, r2)
        L_0x01e3:
            X.8v0 r4 = r10.A0C(r11)
            r0 = r27
            int r3 = A01(r7, r4, r6, r5, r0)
        L_0x01ed:
            java.lang.Object r0 = r7.A02
            r2.add(r0)
            r0 = r27
            if (r3 >= r0) goto L_0x029b
            int r1 = X.C161917qp.A01(r7, r6, r3)
            int r0 = r7.A00
            if (r13 != r0) goto L_0x029b
            r0 = r27
            int r3 = A01(r7, r4, r6, r1, r0)
            goto L_0x01ed
        L_0x0205:
            r2 = 49
            if (r15 > r2) goto L_0x022d
            r2 = r17
            long r2 = (long) r2
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r11
            r32 = r15
            r33 = r2
            r35 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r3 = r22.A0B(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x0228:
            if (r3 != r5) goto L_0x029b
            r5 = r3
            goto L_0x0069
        L_0x022d:
            r2 = 50
            if (r15 != r2) goto L_0x025e
            r2 = 2
            if (r9 != r2) goto L_0x0069
            java.lang.Object r7 = r8.getObject(r4, r0)
            X.8ly r6 = r10.A05
            r2 = r7
            X.8To r2 = (X.C174258To) r2
            boolean r2 = r2.zzfa
            if (r2 != 0) goto L_0x0254
            X.8To r5 = X.C174258To.A00
            boolean r3 = r5.isEmpty()
            X.8To r2 = new X.8To
            if (r3 == 0) goto L_0x025a
            r2.<init>()
        L_0x024e:
            r6.Btd(r2, r7)
            r8.putObject(r4, r0, r2)
        L_0x0254:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x025a:
            r2.<init>(r5)
            goto L_0x024e
        L_0x025e:
            r23 = r7
            r24 = r4
            r25 = r6
            r30 = r9
            r31 = r17
            r32 = r15
            r33 = r11
            r34 = r0
            r22 = r10
            r26 = r5
            r28 = r13
            r29 = r18
            int r3 = r22.A0A(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0228
        L_0x027b:
            r2 = 2
            if (r9 != r2) goto L_0x0069
            X.8v0 r3 = r10.A0C(r11)
            r2 = r27
            int r3 = A01(r7, r3, r6, r5, r2)
            r2 = r12 & r16
            if (r2 == 0) goto L_0x02b3
            java.lang.Object r5 = r8.getObject(r4, r0)
            java.lang.Object r2 = r7.A02
            java.lang.Object r2 = X.C155587f9.A00(r5, r2)
        L_0x0296:
            r8.putObject(r4, r0, r2)
        L_0x0299:
            r12 = r12 | r16
        L_0x029b:
            r2 = -1
            goto L_0x0009
        L_0x029e:
            r2 = 2
            if (r9 != r2) goto L_0x0069
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r17 = r17 & r2
            if (r17 != 0) goto L_0x02c0
            int r3 = X.C161917qp.A01(r7, r6, r5)
            int r5 = r7.A00
            if (r5 != 0) goto L_0x02b6
            java.lang.String r2 = ""
            r7.A02 = r2
        L_0x02b3:
            java.lang.Object r2 = r7.A02
            goto L_0x0296
        L_0x02b6:
            java.nio.charset.Charset r2 = X.C155587f9.A03
            java.lang.String r2 = X.AnonymousClass6CA.A0W(r2, r6, r3, r5)
            r7.A02 = r2
            int r3 = r3 + r5
            goto L_0x02b3
        L_0x02c0:
            int r3 = A03(r7, r6, r5)
            goto L_0x02b3
        L_0x02c5:
            r1 = -1
            goto L_0x0071
        L_0x02c8:
            r0 = r27
            if (r43 != 0) goto L_0x02cf
            if (r3 != r0) goto L_0x02d6
            return r3
        L_0x02cf:
            if (r3 > r0) goto L_0x02d6
            r0 = r21
            if (r13 != r0) goto L_0x02d6
            return r3
        L_0x02d6:
            java.lang.String r1 = "Failed to parse the message."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.A09(X.7Jy, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r7.putObject(r10, r0, r4);
        r8 = r26 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        r7.putObject(r10, r0, r5);
        r8 = r8 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        r5 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0136, code lost:
        r5 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        if (r7.getInt(r10, r2) != r15) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r4 = r7.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        r5 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015e, code lost:
        if (r4 == null) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0160, code lost:
        r5 = X.C155587f9.A00(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r7.putObject(r10, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        r7.putInt(r10, r2, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0A(X.C148847Jy r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, long r34) {
        /*
            r22 = this;
            r8 = r26
            sun.misc.Unsafe r7 = A0F
            r6 = r22
            int[] r0 = r6.A0A
            r12 = r33
            long r2 = X.AnonymousClass6C7.A0O(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r23
            r9 = r25
            r16 = r27
            r14 = r28
            r15 = r29
            r13 = r30
            r0 = r34
            r10 = r24
            switch(r32) {
                case 51: goto L_0x0024;
                case 52: goto L_0x0034;
                case 53: goto L_0x0043;
                case 54: goto L_0x0043;
                case 55: goto L_0x004d;
                case 56: goto L_0x0057;
                case 57: goto L_0x0069;
                case 58: goto L_0x007a;
                case 59: goto L_0x0090;
                case 60: goto L_0x00b6;
                case 61: goto L_0x00c4;
                case 62: goto L_0x004d;
                case 63: goto L_0x00e9;
                case 64: goto L_0x0069;
                case 65: goto L_0x0057;
                case 66: goto L_0x0119;
                case 67: goto L_0x012a;
                case 68: goto L_0x013b;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r8
        L_0x0024:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.AnonymousClass6C7.A0N(r9, r8)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x0062
        L_0x0034:
            if (r13 != r5) goto L_0x0023
            int r4 = X.AnonymousClass6C7.A0B(r9, r8)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0073
        L_0x0043:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A02(r11, r9, r8)
            long r4 = r11.A01
            goto L_0x0136
        L_0x004d:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A01(r11, r9, r8)
            int r4 = r11.A00
            goto L_0x0125
        L_0x0057:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.AnonymousClass6C7.A0N(r9, r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0062:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 8
            goto L_0x0167
        L_0x0069:
            if (r13 != r5) goto L_0x0023
            int r4 = X.AnonymousClass6C7.A0B(r9, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0073:
            r7.putObject(r10, r0, r4)
            int r8 = r26 + 4
            goto L_0x0167
        L_0x007a:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A02(r11, r9, r8)
            long r4 = r11.A01
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1S(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            goto L_0x0164
        L_0x0090:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C161917qp.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x009e
            java.lang.String r5 = ""
            goto L_0x0164
        L_0x009e:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r31 = r31 & r4
            if (r31 == 0) goto L_0x00de
            int r5 = r8 + r6
            X.7jg r4 = X.C161077ox.A00
            int r4 = r4.A01(r9, r8, r5)
            if (r4 == 0) goto L_0x00de
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            if (r13 != r4) goto L_0x0023
            X.8v0 r5 = r6.A0C(r12)
            r4 = r16
            int r8 = A01(r11, r5, r9, r8, r4)
            goto L_0x0152
        L_0x00c4:
            if (r13 != r4) goto L_0x0023
            int r8 = X.C161917qp.A01(r11, r9, r8)
            int r6 = r11.A00
            if (r6 != 0) goto L_0x00d2
            X.8Lo r5 = X.C172528Lo.A00
            goto L_0x0164
        L_0x00d2:
            X.8lw r4 = X.C172528Lo.A01
            byte[] r4 = r4.Bts(r9, r8, r6)
            X.6Vm r5 = new X.6Vm
            r5.<init>(r4)
            goto L_0x00e4
        L_0x00de:
            java.nio.charset.Charset r4 = X.C155587f9.A03
            java.lang.String r5 = X.AnonymousClass6CA.A0W(r4, r9, r8, r6)
        L_0x00e4:
            r7.putObject(r10, r0, r5)
            int r8 = r8 + r6
            goto L_0x0167
        L_0x00e9:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A01(r11, r9, r8)
            int r5 = r11.A00
            java.lang.Object[] r6 = r6.A0E
            int r4 = r33 / 4
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r6[r4]
            X.8lx r4 = (X.C180988lx) r4
            if (r4 == 0) goto L_0x0111
            X.8hh r4 = r4.BtZ(r5)
            if (r4 != 0) goto L_0x0111
            X.7o3 r1 = X.C128166Va.A01(r10)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r5)
            r1.A01(r14, r0)
            return r8
        L_0x0111:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7.putObject(r10, r0, r4)
            goto L_0x0167
        L_0x0119:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A01(r11, r9, r8)
            int r4 = r11.A00
            int r4 = X.AnonymousClass6C8.A08(r4)
        L_0x0125:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            goto L_0x0164
        L_0x012a:
            if (r30 != 0) goto L_0x0023
            int r8 = X.C161917qp.A02(r11, r9, r8)
            long r4 = r11.A01
            long r4 = X.AnonymousClass6C7.A0G(r4)
        L_0x0136:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)
            goto L_0x0164
        L_0x013b:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r28 & -8
            r21 = r4 | 4
            X.8v0 r17 = r6.A0C(r12)
            r20 = r16
            r18 = r9
            r19 = r8
            r16 = r11
            int r8 = A02(r16, r17, r18, r19, r20, r21)
        L_0x0152:
            int r4 = r7.getInt(r10, r2)
            if (r4 != r15) goto L_0x016b
            java.lang.Object r4 = r7.getObject(r10, r0)
        L_0x015c:
            java.lang.Object r5 = r11.A02
            if (r4 == 0) goto L_0x0164
            java.lang.Object r5 = X.C155587f9.A00(r4, r5)
        L_0x0164:
            r7.putObject(r10, r0, r5)
        L_0x0167:
            r7.putInt(r10, r2, r15)
            return r8
        L_0x016b:
            r4 = 0
            goto L_0x015c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.A0A(X.7Jy, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036a, code lost:
        if (r6 != r4) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036c, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0374, code lost:
        throw new X.C140566tx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e1, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03e2, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0B(X.C148847Jy r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r5 = r23
            sun.misc.Unsafe r8 = A0F
            r0 = r32
            java.lang.Object r2 = r8.getObject(r7, r0)
            X.8yY r2 = (X.C188228yY) r2
            r3 = r2
            X.8T2 r3 = (X.AnonymousClass8T2) r3
            boolean r3 = r3.A00
            r6 = 1
            if (r3 != 0) goto L_0x0027
            int r4 = r2.size()
            int r3 = r4 << r6
            if (r4 != 0) goto L_0x0020
            r3 = 10
        L_0x0020:
            X.8yY r2 = r2.BuC(r3)
            r8.putObject(r7, r0, r2)
        L_0x0027:
            r8 = 5
            r11 = 0
            r1 = 2
            r0 = r19
            r13 = r20
            r15 = r22
            r4 = r24
            r3 = r25
            r9 = r27
            r10 = r28
            switch(r29) {
                case 18: goto L_0x034d;
                case 19: goto L_0x0312;
                case 20: goto L_0x02df;
                case 21: goto L_0x02df;
                case 22: goto L_0x0393;
                case 23: goto L_0x003c;
                case 24: goto L_0x02ac;
                case 25: goto L_0x0266;
                case 26: goto L_0x0209;
                case 27: goto L_0x01eb;
                case 28: goto L_0x01bd;
                case 29: goto L_0x0393;
                case 30: goto L_0x006f;
                case 31: goto L_0x02ac;
                case 32: goto L_0x003c;
                case 33: goto L_0x0182;
                case 34: goto L_0x0147;
                case 35: goto L_0x034d;
                case 36: goto L_0x0312;
                case 37: goto L_0x02df;
                case 38: goto L_0x02df;
                case 39: goto L_0x0393;
                case 40: goto L_0x003c;
                case 41: goto L_0x02ac;
                case 42: goto L_0x0266;
                case 43: goto L_0x0393;
                case 44: goto L_0x006f;
                case 45: goto L_0x02ac;
                case 46: goto L_0x003c;
                case 47: goto L_0x0182;
                case 48: goto L_0x0147;
                case 49: goto L_0x0124;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x0055
            X.6Vi r2 = (X.C128246Vi) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x0047:
            if (r6 >= r4) goto L_0x036a
            long r0 = X.AnonymousClass6C7.A0N(r15, r6)
            int r3 = r2.A00
            r2.A04(r3, r0)
            int r6 = r6 + 8
            goto L_0x0047
        L_0x0055:
            if (r9 != r6) goto L_0x03e2
            X.6Vi r2 = (X.C128246Vi) r2
        L_0x0059:
            long r0 = X.AnonymousClass6C7.A0N(r15, r5)
            int r6 = r2.A00
            r2.A04(r6, r0)
            int r6 = r5 + 8
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x0059
        L_0x006f:
            if (r9 != r1) goto L_0x0093
            r8 = r2
            X.6Vh r8 = (X.C128236Vh) r8
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x007b:
            if (r6 >= r4) goto L_0x0089
            int r6 = X.C161917qp.A01(r13, r15, r6)
            int r3 = r13.A00
            int r1 = r8.A00
            r8.A04(r1, r3)
            goto L_0x007b
        L_0x0089:
            if (r6 == r4) goto L_0x00ae
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        L_0x0093:
            if (r27 != 0) goto L_0x03e2
            r8 = r2
            X.6Vh r8 = (X.C128236Vh) r8
        L_0x0098:
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r5 = r13.A00
            int r1 = r8.A00
            r8.A04(r1, r5)
            if (r6 >= r4) goto L_0x00ae
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r1 = r13.A00
            if (r3 != r1) goto L_0x00ae
            goto L_0x0098
        L_0x00ae:
            X.6Va r7 = (X.C128166Va) r7
            X.7o3 r5 = r7.zzjp
            X.7o3 r1 = X.C160647o3.A05
            if (r5 != r1) goto L_0x00b7
            r5 = 0
        L_0x00b7:
            java.lang.Object[] r1 = r0.A0E
            int r0 = r28 / 4
            int r0 = r0 << 1
            int r0 = r0 + 1
            r8 = r1[r0]
            X.8lx r8 = (X.C180988lx) r8
            if (r8 == 0) goto L_0x03dd
            boolean r0 = r2 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x00fb
            int r10 = r2.size()
            r9 = 0
            r4 = 0
        L_0x00cf:
            if (r9 >= r10) goto L_0x03d4
            int r1 = X.AnonymousClass000.A09(r2, r9)
            X.8hh r0 = r8.BtZ(r1)
            if (r0 == 0) goto L_0x00e9
            if (r9 == r4) goto L_0x00e4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.set(r4, r0)
        L_0x00e4:
            int r4 = r4 + 1
        L_0x00e6:
            int r9 = r9 + 1
            goto L_0x00cf
        L_0x00e9:
            if (r5 != 0) goto L_0x00f0
            X.7o3 r5 = new X.7o3
            r5.<init>()
        L_0x00f0:
            long r0 = (long) r1
            int r3 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01(r3, r0)
            goto L_0x00e6
        L_0x00fb:
            java.util.Iterator r4 = r2.iterator()
        L_0x00ff:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03dd
            int r1 = X.C18280x3.A05(r4)
            X.8hh r0 = r8.BtZ(r1)
            if (r0 != 0) goto L_0x00ff
            if (r5 != 0) goto L_0x0116
            X.7o3 r5 = new X.7o3
            r5.<init>()
        L_0x0116:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A01(r1, r0)
            r4.remove()
            goto L_0x00ff
        L_0x0124:
            r1 = 3
            if (r9 != r1) goto L_0x03e2
            X.8v0 r14 = r0.A0C(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r5
        L_0x0131:
            r17 = r4
            int r5 = A02(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r2.add(r0)
            if (r5 >= r4) goto L_0x03e2
            int r16 = X.C161917qp.A01(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            goto L_0x0131
        L_0x0147:
            if (r9 != r1) goto L_0x0164
            X.6Vi r2 = (X.C128246Vi) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x0152:
            if (r6 >= r4) goto L_0x036a
            int r6 = X.C161917qp.A02(r13, r15, r6)
            long r0 = r13.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            int r3 = r2.A00
            r2.A04(r3, r0)
            goto L_0x0152
        L_0x0164:
            if (r27 != 0) goto L_0x03e2
            X.6Vi r2 = (X.C128246Vi) r2
        L_0x0168:
            int r6 = X.C161917qp.A02(r13, r15, r5)
            long r0 = r13.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            int r5 = r2.A00
            r2.A04(r5, r0)
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x0168
        L_0x0182:
            if (r9 != r1) goto L_0x019f
            X.6Vh r2 = (X.C128236Vh) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x018d:
            if (r6 >= r4) goto L_0x036a
            int r6 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            int r1 = X.AnonymousClass6C8.A08(r0)
            int r0 = r2.A00
            r2.A04(r0, r1)
            goto L_0x018d
        L_0x019f:
            if (r27 != 0) goto L_0x03e2
            X.6Vh r2 = (X.C128236Vh) r2
        L_0x01a3:
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r0 = r13.A00
            int r1 = X.AnonymousClass6C8.A08(r0)
            int r0 = r2.A00
            r2.A04(r0, r1)
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x01a3
        L_0x01bd:
            if (r9 != r1) goto L_0x03e2
            int r6 = X.C161917qp.A01(r13, r15, r5)
        L_0x01c3:
            int r5 = r13.A00
            if (r5 != 0) goto L_0x01db
            X.8Lo r0 = X.C172528Lo.A00
            r2.add(r0)
        L_0x01cc:
            if (r6 >= r4) goto L_0x03e1
            int r1 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = X.C161917qp.A01(r13, r15, r1)
            goto L_0x01c3
        L_0x01db:
            X.8lw r0 = X.C172528Lo.A01
            byte[] r1 = r0.Bts(r15, r6, r5)
            X.6Vm r0 = new X.6Vm
            r0.<init>(r1)
            r2.add(r0)
            int r6 = r6 + r5
            goto L_0x01cc
        L_0x01eb:
            if (r9 != r1) goto L_0x03e2
            X.8v0 r7 = r0.A0C(r10)
            int r6 = A01(r13, r7, r15, r5, r4)
        L_0x01f5:
            java.lang.Object r0 = r13.A02
            r2.add(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A01(r13, r7, r15, r1, r4)
            goto L_0x01f5
        L_0x0209:
            if (r9 != r1) goto L_0x03e2
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r5 = X.C161917qp.A01(r13, r15, r5)
            if (r0 != 0) goto L_0x0237
        L_0x021a:
            int r1 = r13.A00
            if (r1 != 0) goto L_0x0230
            r2.add(r7)
        L_0x0221:
            if (r5 >= r4) goto L_0x03e2
            int r1 = X.C161917qp.A01(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = X.C161917qp.A01(r13, r15, r1)
            goto L_0x021a
        L_0x0230:
            java.nio.charset.Charset r0 = X.C155587f9.A03
            X.AnonymousClass6C9.A1E(r0, r2, r15, r5, r1)
            int r5 = r5 + r1
            goto L_0x0221
        L_0x0237:
            int r6 = r13.A00
            if (r6 != 0) goto L_0x024d
            r2.add(r7)
        L_0x023e:
            if (r5 >= r4) goto L_0x03e2
            int r1 = X.C161917qp.A01(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = X.C161917qp.A01(r13, r15, r1)
            goto L_0x0237
        L_0x024d:
            int r1 = r5 + r6
            X.7jg r0 = X.C161077ox.A00
            int r0 = r0.A01(r15, r5, r1)
            if (r0 != 0) goto L_0x025e
            java.nio.charset.Charset r0 = X.C155587f9.A03
            X.AnonymousClass6C9.A1E(r0, r2, r15, r5, r6)
            r5 = r1
            goto L_0x023e
        L_0x025e:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.6tx r1 = new X.6tx
            r1.<init>(r0)
            throw r1
        L_0x0266:
            if (r9 != r1) goto L_0x0288
            X.6Ve r2 = (X.C128206Ve) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r5 = r13.A00
            int r5 = r5 + r6
        L_0x0271:
            if (r6 >= r5) goto L_0x0285
            int r6 = X.C161917qp.A02(r13, r15, r6)
            long r3 = r13.A01
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r0)
            int r0 = r2.A00
            r2.A03(r0, r1)
            goto L_0x0271
        L_0x0285:
            if (r6 != r5) goto L_0x036d
            return r6
        L_0x0288:
            if (r27 != 0) goto L_0x03e2
            X.6Ve r2 = (X.C128206Ve) r2
            int r5 = X.C161917qp.A02(r13, r15, r5)
        L_0x0290:
            long r0 = r13.A01
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r6)
            int r0 = r2.A00
            r2.A03(r0, r1)
            if (r5 >= r4) goto L_0x03e2
            int r1 = X.C161917qp.A01(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = X.C161917qp.A02(r13, r15, r1)
            goto L_0x0290
        L_0x02ac:
            if (r9 != r1) goto L_0x02c5
            X.6Vh r2 = (X.C128236Vh) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x02b7:
            if (r6 >= r4) goto L_0x036a
            int r1 = X.AnonymousClass6C7.A0B(r15, r6)
            int r0 = r2.A00
            r2.A04(r0, r1)
            int r6 = r6 + 4
            goto L_0x02b7
        L_0x02c5:
            if (r9 != r8) goto L_0x03e2
            X.6Vh r2 = (X.C128236Vh) r2
        L_0x02c9:
            int r1 = X.AnonymousClass6C7.A0B(r15, r5)
            int r0 = r2.A00
            r2.A04(r0, r1)
            int r6 = r5 + 4
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x02c9
        L_0x02df:
            if (r9 != r1) goto L_0x02f8
            X.6Vi r2 = (X.C128246Vi) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x02ea:
            if (r6 >= r4) goto L_0x036a
            int r6 = X.C161917qp.A02(r13, r15, r6)
            long r0 = r13.A01
            int r3 = r2.A00
            r2.A04(r3, r0)
            goto L_0x02ea
        L_0x02f8:
            if (r27 != 0) goto L_0x03e2
            X.6Vi r2 = (X.C128246Vi) r2
        L_0x02fc:
            int r6 = X.C161917qp.A02(r13, r15, r5)
            long r0 = r13.A01
            int r5 = r2.A00
            r2.A04(r5, r0)
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x02fc
        L_0x0312:
            if (r9 != r1) goto L_0x032f
            X.6Vg r2 = (X.C128226Vg) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x031d:
            if (r6 >= r4) goto L_0x036a
            int r0 = X.AnonymousClass6C7.A0B(r15, r6)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r2.A00
            r2.A03(r0, r1)
            int r6 = r6 + 4
            goto L_0x031d
        L_0x032f:
            if (r9 != r8) goto L_0x03e2
            X.6Vg r2 = (X.C128226Vg) r2
        L_0x0333:
            int r0 = X.AnonymousClass6C7.A0B(r15, r5)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            int r0 = r2.A00
            r2.A03(r0, r1)
            int r6 = r5 + 4
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x0333
        L_0x034d:
            if (r9 != r1) goto L_0x0375
            X.6Vf r2 = (X.C128216Vf) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r4 = r13.A00
            int r4 = r4 + r6
        L_0x0358:
            if (r6 >= r4) goto L_0x036a
            long r0 = X.AnonymousClass6C7.A0N(r15, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            int r3 = r2.A00
            r2.A03(r3, r0)
            int r6 = r6 + 8
            goto L_0x0358
        L_0x036a:
            if (r6 != r4) goto L_0x036d
            return r6
        L_0x036d:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6tx r1 = new X.6tx
            r1.<init>(r0)
            throw r1
        L_0x0375:
            if (r9 != r6) goto L_0x03e2
            X.6Vf r2 = (X.C128216Vf) r2
        L_0x0379:
            long r0 = X.AnonymousClass6C7.A0N(r15, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            int r6 = r2.A00
            r2.A03(r6, r0)
            int r6 = r5 + 8
            if (r6 >= r4) goto L_0x03e1
            int r5 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x0379
        L_0x0393:
            if (r9 != r1) goto L_0x03b6
            X.6Vh r2 = (X.C128236Vh) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x039e:
            if (r6 >= r3) goto L_0x03ac
            int r6 = X.C161917qp.A01(r13, r15, r6)
            int r1 = r13.A00
            int r0 = r2.A00
            r2.A04(r0, r1)
            goto L_0x039e
        L_0x03ac:
            if (r6 == r3) goto L_0x03e1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        L_0x03b6:
            if (r27 != 0) goto L_0x03e2
            X.6Vh r2 = (X.C128236Vh) r2
            int r6 = X.C161917qp.A01(r13, r15, r5)
        L_0x03be:
            int r1 = r13.A00
            int r0 = r2.A00
            r2.A04(r0, r1)
            if (r6 >= r4) goto L_0x03e1
            int r1 = X.C161917qp.A01(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = X.C161917qp.A01(r13, r15, r1)
            goto L_0x03be
        L_0x03d4:
            if (r4 == r10) goto L_0x03dd
            java.util.List r0 = r2.subList(r4, r10)
            r0.clear()
        L_0x03dd:
            if (r5 == 0) goto L_0x03e1
            r7.zzjp = r5
        L_0x03e1:
            return r6
        L_0x03e2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.A0B(X.7Jy, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public final C186258v0 A0C(int i) {
        int i2 = (i / 4) << 1;
        Object[] objArr = this.A0E;
        C186258v0 r0 = (C186258v0) objArr[i2];
        if (r0 != null) {
            return r0;
        }
        C186258v0 A002 = C157367iB.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public final boolean A0D(int i, Object obj) {
        boolean z = this.A09;
        int[] iArr = this.A0A;
        if (z) {
            int i2 = iArr[i + 1];
            long j = (long) (i2 & 1048575);
            switch (AnonymousClass6C8.A07(i2)) {
                case 0:
                    if (C162337rj.A02.A02(obj, j) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C162337rj.A02.A03(obj, j) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C162337rj.A02.A05(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C162337rj.A02.A04(obj, j) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C162337rj.A02.A0F(obj, j);
                case 8:
                    Object A012 = C162337rj.A01(obj, j);
                    if (A012 instanceof String) {
                        if (!((String) A012).isEmpty()) {
                            return true;
                        }
                    } else if (!(A012 instanceof C172528Lo)) {
                        throw AnonymousClass6CA.A0N();
                    } else if (!C172528Lo.A00.equals(A012)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C162337rj.A01(obj, j) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!C172528Lo.A00.equals(C162337rj.A01(obj, j))) {
                        return true;
                    }
                    break;
                default:
                    throw AnonymousClass6CA.A0N();
            }
        } else {
            int i3 = iArr[i + 2];
            if ((C162337rj.A02.A04(obj, (long) (i3 & 1048575)) & (1 << (i3 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0E(Object obj, int i, int i2) {
        return AnonymousClass000.A1U(C162337rj.A02.A04(obj, AnonymousClass6C7.A0O(this.A0A, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        if (r3 == r0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B2c(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A0A
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x007a
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.AnonymousClass6C8.A07(r4)
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0089;
                case 2: goto L_0x0061;
                case 3: goto L_0x0061;
                case 4: goto L_0x0089;
                case 5: goto L_0x0061;
                case 6: goto L_0x0089;
                case 7: goto L_0x001c;
                case 8: goto L_0x0044;
                case 9: goto L_0x0044;
                case 10: goto L_0x0044;
                case 11: goto L_0x0089;
                case 12: goto L_0x0089;
                case 13: goto L_0x0089;
                case 14: goto L_0x0061;
                case 15: goto L_0x0089;
                case 16: goto L_0x0061;
                case 17: goto L_0x0044;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x004e;
                case 23: goto L_0x004e;
                case 24: goto L_0x004e;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x004e;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x004e;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x004e;
                case 38: goto L_0x004e;
                case 39: goto L_0x004e;
                case 40: goto L_0x004e;
                case 41: goto L_0x004e;
                case 42: goto L_0x004e;
                case 43: goto L_0x004e;
                case 44: goto L_0x004e;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x004e;
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x004e;
                case 51: goto L_0x0031;
                case 52: goto L_0x0031;
                case 53: goto L_0x0031;
                case 54: goto L_0x0031;
                case 55: goto L_0x0031;
                case 56: goto L_0x0031;
                case 57: goto L_0x0031;
                case 58: goto L_0x0031;
                case 59: goto L_0x0031;
                case 60: goto L_0x0031;
                case 61: goto L_0x0031;
                case 62: goto L_0x0031;
                case 63: goto L_0x0031;
                case 64: goto L_0x0031;
                case 65: goto L_0x0031;
                case 66: goto L_0x0031;
                case 67: goto L_0x0031;
                case 68: goto L_0x0031;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 4
            goto L_0x0005
        L_0x001c:
            boolean r3 = r10.A0D(r5, r11)
            boolean r0 = r10.A0D(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.7bt r0 = X.C162337rj.A02
            boolean r3 = r0.A0F(r11, r1)
            boolean r0 = r0.A0F(r12, r1)
            goto L_0x009d
        L_0x0031:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.7bt r0 = X.C162337rj.A02
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x009f
            goto L_0x004e
        L_0x0044:
            boolean r3 = r10.A0D(r5, r11)
            boolean r0 = r10.A0D(r5, r12)
            if (r3 != r0) goto L_0x009f
        L_0x004e:
            java.lang.Object r3 = X.C162337rj.A01(r11, r1)
            java.lang.Object r0 = X.C162337rj.A01(r12, r1)
            if (r3 == r0) goto L_0x0019
            if (r3 == 0) goto L_0x009f
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            goto L_0x0019
        L_0x0061:
            boolean r3 = r10.A0D(r5, r11)
            boolean r0 = r10.A0D(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.7bt r0 = X.C162337rj.A02
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            return r9
        L_0x007a:
            X.6Va r11 = (X.C128166Va) r11
            X.7o3 r1 = r11.zzjp
            X.6Va r12 = (X.C128166Va) r12
            X.7o3 r0 = r12.zzjp
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            return r2
        L_0x0089:
            boolean r3 = r10.A0D(r5, r11)
            boolean r0 = r10.A0D(r5, r12)
            if (r3 != r0) goto L_0x009f
            X.7bt r0 = X.C162337rj.A02
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
        L_0x009d:
            if (r3 == r0) goto L_0x0019
        L_0x009f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.B2c(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r6 = r6 * 53;
        r0 = X.C162337rj.A01(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C162337rj.A01(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass001.A0K(X.C162337rj.A01(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r6 = r6 * 53;
        r0 = A05(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r0 = X.AnonymousClass6C9.A05(r0 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011b, code lost:
        r0 = java.lang.Float.floatToIntBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r0 = java.lang.Double.doubleToLongBits(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012c, code lost:
        r0 = X.AnonymousClass6C8.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BFY(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A0A
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0133
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.AnonymousClass6C8.A07(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x0113;
                case 2: goto L_0x010a;
                case 3: goto L_0x010a;
                case 4: goto L_0x0101;
                case 5: goto L_0x010a;
                case 6: goto L_0x0101;
                case 7: goto L_0x00f4;
                case 8: goto L_0x0070;
                case 9: goto L_0x00e5;
                case 10: goto L_0x005e;
                case 11: goto L_0x0101;
                case 12: goto L_0x0101;
                case 13: goto L_0x0101;
                case 14: goto L_0x010a;
                case 15: goto L_0x0101;
                case 16: goto L_0x010a;
                case 17: goto L_0x00e5;
                case 18: goto L_0x005e;
                case 19: goto L_0x005e;
                case 20: goto L_0x005e;
                case 21: goto L_0x005e;
                case 22: goto L_0x005e;
                case 23: goto L_0x005e;
                case 24: goto L_0x005e;
                case 25: goto L_0x005e;
                case 26: goto L_0x005e;
                case 27: goto L_0x005e;
                case 28: goto L_0x005e;
                case 29: goto L_0x005e;
                case 30: goto L_0x005e;
                case 31: goto L_0x005e;
                case 32: goto L_0x005e;
                case 33: goto L_0x005e;
                case 34: goto L_0x005e;
                case 35: goto L_0x005e;
                case 36: goto L_0x005e;
                case 37: goto L_0x005e;
                case 38: goto L_0x005e;
                case 39: goto L_0x005e;
                case 40: goto L_0x005e;
                case 41: goto L_0x005e;
                case 42: goto L_0x005e;
                case 43: goto L_0x005e;
                case 44: goto L_0x005e;
                case 45: goto L_0x005e;
                case 46: goto L_0x005e;
                case 47: goto L_0x005e;
                case 48: goto L_0x005e;
                case 49: goto L_0x005e;
                case 50: goto L_0x005e;
                case 51: goto L_0x00d4;
                case 52: goto L_0x00c3;
                case 53: goto L_0x00b6;
                case 54: goto L_0x00af;
                case 55: goto L_0x009d;
                case 56: goto L_0x0096;
                case 57: goto L_0x008f;
                case 58: goto L_0x007e;
                case 59: goto L_0x006a;
                case 60: goto L_0x0058;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 4
            goto L_0x0005
        L_0x001e:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0025:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x002d:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0034:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x003c:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0043:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x004a:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0051:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0058:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x005e:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x0130
        L_0x006a:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0070:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0130
        L_0x007e:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            goto L_0x00fc
        L_0x008f:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0096:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x009d:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a3:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            goto L_0x0130
        L_0x00af:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x00b6:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00bc:
            int r6 = r6 * 53
            long r0 = A05(r10, r1)
            goto L_0x012c
        L_0x00c3:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            float r0 = X.AnonymousClass001.A05(r0)
            goto L_0x011b
        L_0x00d4:
            boolean r0 = r9.A0E(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            double r0 = X.AnonymousClass6C9.A02(r0)
            goto L_0x0128
        L_0x00e5:
            java.lang.Object r0 = X.C162337rj.A01(r10, r1)
            if (r0 == 0) goto L_0x00ef
            int r7 = r0.hashCode()
        L_0x00ef:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x00f4:
            int r6 = r6 * 53
            X.7bt r0 = X.C162337rj.A02
            boolean r0 = r0.A0F(r10, r1)
        L_0x00fc:
            int r0 = X.AnonymousClass6C9.A05(r0)
            goto L_0x0130
        L_0x0101:
            int r6 = r6 * 53
            X.7bt r0 = X.C162337rj.A02
            int r0 = r0.A04(r10, r1)
            goto L_0x0130
        L_0x010a:
            int r6 = r6 * 53
            X.7bt r0 = X.C162337rj.A02
            long r0 = r0.A05(r10, r1)
            goto L_0x012c
        L_0x0113:
            int r6 = r6 * 53
            X.7bt r0 = X.C162337rj.A02
            float r0 = r0.A03(r10, r1)
        L_0x011b:
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0130
        L_0x0120:
            int r6 = r6 * 53
            X.7bt r0 = X.C162337rj.A02
            double r0 = r0.A02(r10, r1)
        L_0x0128:
            long r0 = java.lang.Double.doubleToLongBits(r0)
        L_0x012c:
            int r0 = X.AnonymousClass6C8.A0B(r0)
        L_0x0130:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0133:
            int r1 = r6 * 53
            X.6Va r10 = (X.C128166Va) r10
            X.7o3 r0 = r10.zzjp
            int r0 = X.AnonymousClass002.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.BFY(java.lang.Object):int");
    }

    public final Object BLT() {
        return ((C128166Va) this.A06).A06(4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r10 = r0 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r10 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0102, code lost:
        r9.putObject(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0113, code lost:
        r9.putInt(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0124, code lost:
        r9.putLong(r7, r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtQ(X.C148847Jy r33, java.lang.Object r34, byte[] r35, int r36, int r37) {
        /*
            r32 = this;
            r10 = r36
            r4 = r32
            boolean r0 = r4.A09
            r8 = r33
            r7 = r34
            r6 = r35
            r5 = r37
            if (r0 == 0) goto L_0x01e5
            sun.misc.Unsafe r9 = A0F
        L_0x0012:
            if (r10 >= r5) goto L_0x01db
            int r0 = r10 + 1
            byte r12 = r35[r10]
            if (r12 >= 0) goto L_0x0020
            int r0 = X.C161917qp.A04(r8, r6, r12, r0)
            int r12 = r8.A00
        L_0x0020:
            int r16 = r12 >>> 3
            r13 = r12 & 7
            r1 = r16
            int r14 = r4.A08(r1)
            if (r14 < 0) goto L_0x0045
            int[] r2 = r4.A0A
            int r1 = r14 + 1
            r15 = r2[r1]
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r15
            int r1 = r1 >>> 20
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r15
            long r2 = (long) r2
            r11 = 17
            r10 = 2
            if (r1 > r11) goto L_0x012d
            r11 = 1
            switch(r1) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0068;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0083;
                case 5: goto L_0x008d;
                case 6: goto L_0x009c;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00e3;
                case 10: goto L_0x00fa;
                case 11: goto L_0x0083;
                case 12: goto L_0x0083;
                case 13: goto L_0x009c;
                case 14: goto L_0x008d;
                case 15: goto L_0x0107;
                case 16: goto L_0x0118;
                default: goto L_0x0045;
            }
        L_0x0045:
            X.7o3 r14 = X.C128166Va.A01(r7)
            r13 = r8
            r15 = r6
            r16 = r12
            r17 = r0
            r18 = r5
            int r10 = X.C161917qp.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x0012
        L_0x0056:
            if (r13 != r11) goto L_0x0045
            long r10 = X.AnonymousClass6C7.A0N(r6, r0)
            double r14 = java.lang.Double.longBitsToDouble(r10)
            X.7bt r10 = X.C162337rj.A02
            r11 = r7
            r12 = r2
            r10.A09(r11, r12, r14)
            goto L_0x0098
        L_0x0068:
            r1 = 5
            if (r13 != r1) goto L_0x0045
            int r1 = X.AnonymousClass6C7.A0B(r6, r0)
            float r10 = java.lang.Float.intBitsToFloat(r1)
            X.7bt r1 = X.C162337rj.A02
            r1.A0A(r7, r2, r10)
            goto L_0x00a6
        L_0x0079:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C161917qp.A02(r8, r6, r0)
            long r0 = r8.A01
            goto L_0x0124
        L_0x0083:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C161917qp.A01(r8, r6, r0)
            int r0 = r8.A00
            goto L_0x0113
        L_0x008d:
            if (r13 != r11) goto L_0x0045
            long r13 = X.AnonymousClass6C7.A0N(r6, r0)
            r10 = r7
            r11 = r2
            r9.putLong(r10, r11, r13)
        L_0x0098:
            int r10 = r0 + 8
            goto L_0x0012
        L_0x009c:
            r1 = 5
            if (r13 != r1) goto L_0x0045
            int r1 = X.AnonymousClass6C7.A0B(r6, r0)
            r9.putInt(r7, r2, r1)
        L_0x00a6:
            int r10 = r0 + 4
            goto L_0x0012
        L_0x00aa:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C161917qp.A02(r8, r6, r0)
            long r0 = r8.A01
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x00b9
            r11 = 0
        L_0x00b9:
            X.7bt r0 = X.C162337rj.A02
            r0.A0D(r7, r2, r11)
            goto L_0x0012
        L_0x00c0:
            if (r13 != r10) goto L_0x0045
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x00de
            int r10 = X.C161917qp.A01(r8, r6, r0)
            int r1 = r8.A00
            if (r1 != 0) goto L_0x00d4
            java.lang.String r0 = ""
            r8.A02 = r0
            goto L_0x0100
        L_0x00d4:
            java.nio.charset.Charset r0 = X.C155587f9.A03
            java.lang.String r0 = X.AnonymousClass6CA.A0W(r0, r6, r10, r1)
            r8.A02 = r0
            int r10 = r10 + r1
            goto L_0x0100
        L_0x00de:
            int r10 = A03(r8, r6, r0)
            goto L_0x0100
        L_0x00e3:
            if (r13 != r10) goto L_0x0045
            X.8v0 r1 = r4.A0C(r14)
            int r10 = A01(r8, r1, r6, r0, r5)
            java.lang.Object r1 = r9.getObject(r7, r2)
            if (r1 == 0) goto L_0x0100
            java.lang.Object r0 = r8.A02
            java.lang.Object r0 = X.C155587f9.A00(r1, r0)
            goto L_0x0102
        L_0x00fa:
            if (r13 != r10) goto L_0x0045
            int r10 = X.C161917qp.A03(r8, r6, r0)
        L_0x0100:
            java.lang.Object r0 = r8.A02
        L_0x0102:
            r9.putObject(r7, r2, r0)
            goto L_0x0012
        L_0x0107:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C161917qp.A01(r8, r6, r0)
            int r0 = r8.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
        L_0x0113:
            r9.putInt(r7, r2, r0)
            goto L_0x0012
        L_0x0118:
            if (r13 != 0) goto L_0x0045
            int r10 = X.C161917qp.A02(r8, r6, r0)
            long r0 = r8.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
        L_0x0124:
            r11 = r9
            r12 = r7
            r13 = r2
            r15 = r0
            r11.putLong(r12, r13, r15)
            goto L_0x0012
        L_0x012d:
            r11 = 27
            if (r1 != r11) goto L_0x0167
            if (r13 != r10) goto L_0x0045
            java.lang.Object r11 = r9.getObject(r7, r2)
            X.8yY r11 = (X.C188228yY) r11
            r1 = r11
            X.8T2 r1 = (X.AnonymousClass8T2) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x014b
            int r1 = X.AnonymousClass6C9.A0E(r11)
            X.8yY r11 = r11.BuC(r1)
            r9.putObject(r7, r2, r11)
        L_0x014b:
            X.8v0 r2 = r4.A0C(r14)
            int r10 = A01(r8, r2, r6, r0, r5)
        L_0x0153:
            java.lang.Object r0 = r8.A02
            r11.add(r0)
            if (r10 >= r5) goto L_0x0012
            int r1 = X.C161917qp.A01(r8, r6, r10)
            int r0 = r8.A00
            if (r12 != r0) goto L_0x0012
            int r10 = A01(r8, r2, r6, r1, r5)
            goto L_0x0153
        L_0x0167:
            r11 = 49
            if (r1 > r11) goto L_0x018f
            long r10 = (long) r15
            r17 = r4
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r0
            r22 = r5
            r23 = r12
            r24 = r16
            r25 = r13
            r26 = r14
            r27 = r1
            r28 = r10
            r30 = r2
            int r10 = r17.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30)
        L_0x018a:
            if (r10 != r0) goto L_0x0012
            r0 = r10
            goto L_0x0045
        L_0x018f:
            r11 = 50
            if (r1 != r11) goto L_0x01bf
            if (r13 != r10) goto L_0x0045
            java.lang.Object r6 = r9.getObject(r7, r2)
            X.8ly r5 = r4.A05
            r0 = r6
            X.8To r0 = (X.C174258To) r0
            boolean r0 = r0.zzfa
            if (r0 != 0) goto L_0x01b5
            X.8To r4 = X.C174258To.A00
            boolean r1 = r4.isEmpty()
            X.8To r0 = new X.8To
            if (r1 == 0) goto L_0x01bb
            r0.<init>()
        L_0x01af:
            r5.Btd(r0, r6)
            r9.putObject(r7, r2, r0)
        L_0x01b5:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x01bb:
            r0.<init>(r4)
            goto L_0x01af
        L_0x01bf:
            r23 = r1
            r24 = r14
            r25 = r2
            r19 = r12
            r20 = r16
            r21 = r13
            r22 = r15
            r18 = r5
            r17 = r0
            r16 = r6
            r15 = r7
            r14 = r8
            r13 = r4
            int r10 = r13.A0A(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x018a
        L_0x01db:
            if (r10 == r5) goto L_0x01f1
            java.lang.String r1 = "Failed to parse the message."
            X.6tx r0 = new X.6tx
            r0.<init>(r1)
            throw r0
        L_0x01e5:
            r17 = 0
            r11 = r4
            r12 = r8
            r13 = r7
            r14 = r6
            r15 = r10
            r16 = r5
            r11.A09(r12, r13, r14, r15, r16, r17)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.BtQ(X.7Jy, java.lang.Object, byte[], int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d4, code lost:
        ((X.C169658Ad) r6).A00.A07(r7, java.lang.Double.doubleToRawLongBits(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f3, code lost:
        ((X.C169658Ad) r6).A00.A06(r7, java.lang.Float.floatToRawIntBits(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x030e, code lost:
        X.C150347Qg.A07(((X.C169658Ad) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0325, code lost:
        X.C150347Qg.A07(((X.C169658Ad) r6).A00, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0340, code lost:
        ((X.C169658Ad) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0357, code lost:
        ((X.C169658Ad) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0372, code lost:
        ((X.C169658Ad) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x038d, code lost:
        r1 = ((X.C169658Ad) r6).A00;
        r1.A03(r7 << 3);
        r1.A02(r11 ? (byte) 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03a3, code lost:
        A07(r6, X.C162337rj.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b5, code lost:
        r11 = X.C162337rj.A01(r5, (long) (r1 & 1048575));
        ((X.C169658Ad) r6).A00.A0C((X.C187818xr) r11, A0C(r2), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d2, code lost:
        ((X.C169658Ad) r6).A00.A0B((X.C172528Lo) X.C162337rj.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03f6, code lost:
        r1 = ((X.C169658Ad) r6).A00;
        r1.A03(r7 << 3);
        r1.A03(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0416, code lost:
        ((X.C169658Ad) r6).A00.A05(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0431, code lost:
        ((X.C169658Ad) r6).A00.A06(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0448, code lost:
        ((X.C169658Ad) r6).A00.A07(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0463, code lost:
        X.C150347Qg.A06(((X.C169658Ad) r6).A00, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x047a, code lost:
        X.C150347Qg.A07(((X.C169658Ad) r6).A00, r7, (r0 >> 63) ^ (r0 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0490, code lost:
        r6.Bth(A0C(r2), X.C162337rj.A01(r5, (long) (r1 & 1048575)), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04d1, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05b9, code lost:
        ((X.C169658Ad) r6).A00.A06(r2, X.AnonymousClass001.A0K(X.C162337rj.A01(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05e5, code lost:
        ((X.C169658Ad) r6).A00.A05(r2, X.AnonymousClass001.A0K(X.C162337rj.A01(r5, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0604, code lost:
        X.C150347Qg.A07(((X.C169658Ad) r6).A00, r2, A05(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x06c7, code lost:
        X.C162487sD.A0H(r6, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06cd, code lost:
        X.C162487sD.A0M(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06db, code lost:
        X.C162487sD.A0J(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06e9, code lost:
        X.C162487sD.A0O(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06f7, code lost:
        X.C162487sD.A0P(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0705, code lost:
        X.C162487sD.A0L(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0758, code lost:
        X.C162487sD.A0I(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0766, code lost:
        X.C162487sD.A0K(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0774, code lost:
        X.C162487sD.A0G(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0782, code lost:
        X.C162487sD.A0F(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0790, code lost:
        X.C162487sD.A0E(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x079e, code lost:
        X.C162487sD.A0D(r6, (java.util.List) r7.getObject(r5, r0), r8[r3], r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtU(X.C181018m0 r21, java.lang.Object r22) {
        /*
            r20 = this;
            r5 = r22
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = 1
            r10 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r20
            boolean r0 = r4.A09
            r6 = r21
            if (r0 == 0) goto L_0x04a0
            int[] r3 = r4.A0A
            int r8 = r3.length
            r2 = 0
        L_0x0015:
            if (r2 >= r8) goto L_0x0913
            int r0 = r2 + 1
            r1 = r3[r0]
            r7 = r3[r2]
            r0 = r1 & r18
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0047;
                case 2: goto L_0x0058;
                case 3: goto L_0x0069;
                case 4: goto L_0x007a;
                case 5: goto L_0x008b;
                case 6: goto L_0x009c;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00be;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00ce;
                case 11: goto L_0x00d6;
                case 12: goto L_0x00e7;
                case 13: goto L_0x00f8;
                case 14: goto L_0x0109;
                case 15: goto L_0x011a;
                case 16: goto L_0x012b;
                case 17: goto L_0x013c;
                case 18: goto L_0x0144;
                case 19: goto L_0x014f;
                case 20: goto L_0x015a;
                case 21: goto L_0x0165;
                case 22: goto L_0x0170;
                case 23: goto L_0x017b;
                case 24: goto L_0x0186;
                case 25: goto L_0x0191;
                case 26: goto L_0x019c;
                case 27: goto L_0x01a7;
                case 28: goto L_0x01b6;
                case 29: goto L_0x01c1;
                case 30: goto L_0x01cc;
                case 31: goto L_0x01d7;
                case 32: goto L_0x01e2;
                case 33: goto L_0x01ed;
                case 34: goto L_0x01f8;
                case 35: goto L_0x0203;
                case 36: goto L_0x020e;
                case 37: goto L_0x0219;
                case 38: goto L_0x0224;
                case 39: goto L_0x022f;
                case 40: goto L_0x023a;
                case 41: goto L_0x0245;
                case 42: goto L_0x0250;
                case 43: goto L_0x025b;
                case 44: goto L_0x0266;
                case 45: goto L_0x0271;
                case 46: goto L_0x027c;
                case 47: goto L_0x0287;
                case 48: goto L_0x0292;
                case 49: goto L_0x029d;
                case 50: goto L_0x0027;
                case 51: goto L_0x02c3;
                case 52: goto L_0x02e2;
                case 53: goto L_0x0301;
                case 54: goto L_0x0318;
                case 55: goto L_0x032f;
                case 56: goto L_0x034a;
                case 57: goto L_0x0361;
                case 58: goto L_0x037c;
                case 59: goto L_0x039d;
                case 60: goto L_0x03af;
                case 61: goto L_0x03cc;
                case 62: goto L_0x03e5;
                case 63: goto L_0x0405;
                case 64: goto L_0x0420;
                case 65: goto L_0x043b;
                case 66: goto L_0x0452;
                case 67: goto L_0x046d;
                case 68: goto L_0x048a;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r2 = r2 + 4
            goto L_0x0015
        L_0x0027:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0036:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            double r12 = r11.A02(r5, r0)
            goto L_0x02d4
        L_0x0047:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            float r11 = r11.A03(r5, r0)
            goto L_0x02f3
        L_0x0058:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x030e
        L_0x0069:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0325
        L_0x007a:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0340
        L_0x008b:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0357
        L_0x009c:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0372
        L_0x00ad:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            boolean r11 = r11.A0F(r5, r0)
            goto L_0x038d
        L_0x00be:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x03a3
        L_0x00c6:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x03b5
        L_0x00ce:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x03d2
        L_0x00d6:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r11 = r11.A04(r5, r0)
            goto L_0x03f6
        L_0x00e7:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0416
        L_0x00f8:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0431
        L_0x0109:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x0448
        L_0x011a:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            int r1 = r11.A04(r5, r0)
            goto L_0x0463
        L_0x012b:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            X.7bt r11 = X.C162337rj.A02
            long r0 = r11.A05(r5, r0)
            goto L_0x047a
        L_0x013c:
            boolean r0 = r4.A0D(r2, r5)
            if (r0 == 0) goto L_0x0024
            goto L_0x0490
        L_0x0144:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0D(r6, r0, r7, r10)
            goto L_0x0024
        L_0x014f:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0E(r6, r0, r7, r10)
            goto L_0x0024
        L_0x015a:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0F(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0165:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0G(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0170:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0K(r6, r0, r7, r10)
            goto L_0x0024
        L_0x017b:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0I(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0186:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0N(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0191:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0Q(r6, r0, r7, r10)
            goto L_0x0024
        L_0x019c:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0B(r6, r0, r7)
            goto L_0x0024
        L_0x01a7:
            r7 = r3[r2]
            java.util.List r1 = A06(r1, r5)
            X.8v0 r0 = r4.A0C(r2)
            X.C162487sD.A0A(r0, r6, r1, r7)
            goto L_0x0024
        L_0x01b6:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0C(r6, r0, r7)
            goto L_0x0024
        L_0x01c1:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0L(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01cc:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0P(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01d7:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0O(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01e2:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0J(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01ed:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0M(r6, r0, r7, r10)
            goto L_0x0024
        L_0x01f8:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0H(r6, r0, r7, r10)
            goto L_0x0024
        L_0x0203:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0D(r6, r0, r7, r9)
            goto L_0x0024
        L_0x020e:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0E(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0219:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0F(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0224:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0G(r6, r0, r7, r9)
            goto L_0x0024
        L_0x022f:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0K(r6, r0, r7, r9)
            goto L_0x0024
        L_0x023a:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0I(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0245:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0N(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0250:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0Q(r6, r0, r7, r9)
            goto L_0x0024
        L_0x025b:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0L(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0266:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0P(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0271:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0O(r6, r0, r7, r9)
            goto L_0x0024
        L_0x027c:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0J(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0287:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0M(r6, r0, r7, r9)
            goto L_0x0024
        L_0x0292:
            r7 = r3[r2]
            java.util.List r0 = A06(r1, r5)
            X.C162487sD.A0H(r6, r0, r7, r9)
            goto L_0x0024
        L_0x029d:
            r12 = r3[r2]
            java.util.List r13 = A06(r1, r5)
            X.8v0 r11 = r4.A0C(r2)
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r7 = r6
            X.8Ad r7 = (X.C169658Ad) r7
            r1 = 0
        L_0x02b3:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r7.Bth(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x02b3
        L_0x02c3:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            double r12 = X.AnonymousClass6C9.A02(r0)
        L_0x02d4:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r11 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r12)
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x02e2:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            float r11 = X.AnonymousClass001.A05(r0)
        L_0x02f3:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r11)
            r1.A06(r7, r0)
            goto L_0x0024
        L_0x0301:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A05(r5, r0)
        L_0x030e:
            r11 = r6
            X.8Ad r11 = (X.C169658Ad) r11
            X.6Vs r11 = r11.A00
            X.C150347Qg.A07(r11, r7, r0)
            goto L_0x0024
        L_0x0318:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A05(r5, r0)
        L_0x0325:
            r11 = r6
            X.8Ad r11 = (X.C169658Ad) r11
            X.6Vs r11 = r11.A00
            X.C150347Qg.A07(r11, r7, r0)
            goto L_0x0024
        L_0x032f:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0340:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x034a:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A05(r5, r0)
        L_0x0357:
            r11 = r6
            X.8Ad r11 = (X.C169658Ad) r11
            X.6Vs r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0361:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0372:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x037c:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            boolean r11 = X.AnonymousClass001.A1Z(r0)
        L_0x038d:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            byte r0 = (byte) r11
            r1.A02(r0)
            goto L_0x0024
        L_0x039d:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03a3:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            A07(r6, r0, r7)
            goto L_0x0024
        L_0x03af:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03b5:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r11 = X.C162337rj.A01(r5, r0)
            X.8v0 r1 = r4.A0C(r2)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.8xr r11 = (X.C187818xr) r11
            r0.A0C(r11, r1, r7)
            goto L_0x0024
        L_0x03cc:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x03d2:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C162337rj.A01(r5, r0)
            X.8Lo r1 = (X.C172528Lo) r1
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A0B(r1, r7)
            goto L_0x0024
        L_0x03e5:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r11 = X.AnonymousClass001.A0K(r0)
        L_0x03f6:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r7 << 3
            r1.A03(r0)
            r1.A03(r11)
            goto L_0x0024
        L_0x0405:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0416:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A05(r7, r1)
            goto L_0x0024
        L_0x0420:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0431:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A06(r7, r1)
            goto L_0x0024
        L_0x043b:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A05(r5, r0)
        L_0x0448:
            r11 = r6
            X.8Ad r11 = (X.C169658Ad) r11
            X.6Vs r11 = r11.A00
            r11.A07(r7, r0)
            goto L_0x0024
        L_0x0452:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0463:
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.C150347Qg.A06(r0, r1, r7)
            goto L_0x0024
        L_0x046d:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r17
            long r0 = (long) r1
            long r0 = A05(r5, r0)
        L_0x047a:
            r11 = r6
            X.8Ad r11 = (X.C169658Ad) r11
            X.6Vs r12 = r11.A00
            long r13 = r0 << r9
            r11 = 63
            long r0 = r0 >> r11
            long r0 = r0 ^ r13
            X.C150347Qg.A07(r12, r7, r0)
            goto L_0x0024
        L_0x048a:
            boolean r0 = r4.A0E(r5, r7, r2)
            if (r0 == 0) goto L_0x0024
        L_0x0490:
            r1 = r1 & r17
            long r0 = (long) r1
            java.lang.Object r1 = X.C162337rj.A01(r5, r0)
            X.8v0 r0 = r4.A0C(r2)
            r6.Bth(r0, r1, r7)
            goto L_0x0024
        L_0x04a0:
            int[] r8 = r4.A0A
            int r12 = r8.length
            sun.misc.Unsafe r7 = A0F
            r11 = -1
            r3 = 0
            r19 = 0
        L_0x04a9:
            if (r3 >= r12) goto L_0x0913
            int r0 = r3 + 1
            r15 = r8[r0]
            r2 = r8[r3]
            r0 = r18 & r15
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x0910
            int r0 = r3 + 2
            r16 = r8[r0]
            r14 = r16 & r17
            if (r14 == r11) goto L_0x04c7
            long r0 = (long) r14
            int r19 = r7.getInt(r5, r0)
            r11 = r14
        L_0x04c7:
            int r0 = r16 >>> 20
            int r14 = r9 << r0
        L_0x04cb:
            r15 = r15 & r17
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x08f8;
                case 1: goto L_0x08e0;
                case 2: goto L_0x08ce;
                case 3: goto L_0x08bc;
                case 4: goto L_0x08aa;
                case 5: goto L_0x0898;
                case 6: goto L_0x0886;
                case 7: goto L_0x086c;
                case 8: goto L_0x085f;
                case 9: goto L_0x0847;
                case 10: goto L_0x0833;
                case 11: goto L_0x081c;
                case 12: goto L_0x080a;
                case 13: goto L_0x07f8;
                case 14: goto L_0x07e6;
                case 15: goto L_0x07d4;
                case 16: goto L_0x07bc;
                case 17: goto L_0x07ab;
                case 18: goto L_0x079d;
                case 19: goto L_0x078f;
                case 20: goto L_0x0781;
                case 21: goto L_0x0773;
                case 22: goto L_0x0765;
                case 23: goto L_0x0757;
                case 24: goto L_0x074a;
                case 25: goto L_0x073d;
                case 26: goto L_0x0730;
                case 27: goto L_0x071f;
                case 28: goto L_0x0712;
                case 29: goto L_0x0704;
                case 30: goto L_0x06f6;
                case 31: goto L_0x06e8;
                case 32: goto L_0x06da;
                case 33: goto L_0x06cc;
                case 34: goto L_0x06be;
                case 35: goto L_0x06bb;
                case 36: goto L_0x06b8;
                case 37: goto L_0x06b5;
                case 38: goto L_0x06b2;
                case 39: goto L_0x06af;
                case 40: goto L_0x06ac;
                case 41: goto L_0x069f;
                case 42: goto L_0x0692;
                case 43: goto L_0x0690;
                case 44: goto L_0x068e;
                case 45: goto L_0x068c;
                case 46: goto L_0x068a;
                case 47: goto L_0x0688;
                case 48: goto L_0x067e;
                case 49: goto L_0x0656;
                case 50: goto L_0x064a;
                case 51: goto L_0x062e;
                case 52: goto L_0x0612;
                case 53: goto L_0x05fe;
                case 54: goto L_0x05f7;
                case 55: goto L_0x05df;
                case 56: goto L_0x05cb;
                case 57: goto L_0x05b3;
                case 58: goto L_0x0595;
                case 59: goto L_0x0586;
                case 60: goto L_0x056c;
                case 61: goto L_0x0556;
                case 62: goto L_0x0539;
                case 63: goto L_0x0531;
                case 64: goto L_0x0529;
                case 65: goto L_0x0516;
                case 66: goto L_0x04ff;
                case 67: goto L_0x04e6;
                case 68: goto L_0x04d4;
                default: goto L_0x04d1;
            }
        L_0x04d1:
            int r3 = r3 + 4
            goto L_0x04a9
        L_0x04d4:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.8v0 r0 = r4.A0C(r3)
            r6.Bth(r0, r1, r2)
            goto L_0x04d1
        L_0x04e6:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            long r0 = A05(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r14 = r13.A00
            long r15 = r0 << r9
            r13 = 63
            long r0 = r0 >> r13
            long r0 = r0 ^ r15
            X.C150347Qg.A07(r14, r2, r0)
            goto L_0x04d1
        L_0x04ff:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.C150347Qg.A06(r0, r1, r2)
            goto L_0x04d1
        L_0x0516:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            long r0 = A05(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x0529:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            goto L_0x05b9
        L_0x0531:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            goto L_0x05e5
        L_0x0539:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r13 = X.AnonymousClass001.A0K(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d1
        L_0x0556:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.8Lo r1 = (X.C172528Lo) r1
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d1
        L_0x056c:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.8v0 r1 = r4.A0C(r3)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.8xr r13 = (X.C187818xr) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d1
        L_0x0586:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = r7.getObject(r5, r0)
            A07(r6, r0, r2)
            goto L_0x04d1
        L_0x0595:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            boolean r13 = X.AnonymousClass001.A1Z(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d1
        L_0x05b3:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
        L_0x05b9:
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d1
        L_0x05cb:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            long r0 = A05(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x05df:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
        L_0x05e5:
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d1
        L_0x05f7:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            goto L_0x0604
        L_0x05fe:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
        L_0x0604:
            long r0 = A05(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            X.C150347Qg.A07(r13, r2, r0)
            goto L_0x04d1
        L_0x0612:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            float r13 = X.AnonymousClass001.A05(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d1
        L_0x062e:
            boolean r13 = r4.A0E(r5, r2, r3)
            if (r13 == 0) goto L_0x04d1
            java.lang.Object r0 = X.C162337rj.A01(r5, r0)
            double r14 = X.AnonymousClass6C9.A02(r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x064a:
            java.lang.Object r0 = r7.getObject(r5, r0)
            if (r0 == 0) goto L_0x04d1
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0656:
            r13 = r8[r3]
            java.lang.Object r15 = r7.getObject(r5, r0)
            java.util.List r15 = (java.util.List) r15
            X.8v0 r14 = r4.A0C(r3)
            if (r15 == 0) goto L_0x04d1
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04d1
            r2 = r6
            X.8Ad r2 = (X.C169658Ad) r2
            r1 = 0
        L_0x066e:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04d1
            java.lang.Object r0 = r15.get(r1)
            r2.Bth(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x066e
        L_0x067e:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            goto L_0x06c7
        L_0x0688:
            r13 = 1
            goto L_0x06cd
        L_0x068a:
            r13 = 1
            goto L_0x06db
        L_0x068c:
            r13 = 1
            goto L_0x06e9
        L_0x068e:
            r13 = 1
            goto L_0x06f7
        L_0x0690:
            r13 = 1
            goto L_0x0705
        L_0x0692:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0Q(r6, r0, r2, r9)
            goto L_0x04d1
        L_0x069f:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0N(r6, r0, r2, r9)
            goto L_0x04d1
        L_0x06ac:
            r13 = 1
            goto L_0x0758
        L_0x06af:
            r13 = 1
            goto L_0x0766
        L_0x06b2:
            r13 = 1
            goto L_0x0774
        L_0x06b5:
            r13 = 1
            goto L_0x0782
        L_0x06b8:
            r13 = 1
            goto L_0x0790
        L_0x06bb:
            r13 = 1
            goto L_0x079e
        L_0x06be:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
        L_0x06c7:
            X.C162487sD.A0H(r6, r1, r2, r0)
            goto L_0x04d1
        L_0x06cc:
            r13 = 0
        L_0x06cd:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0M(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x06da:
            r13 = 0
        L_0x06db:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0J(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x06e8:
            r13 = 0
        L_0x06e9:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0O(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x06f6:
            r13 = 0
        L_0x06f7:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0P(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x0704:
            r13 = 0
        L_0x0705:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0L(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x0712:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0C(r6, r0, r2)
            goto L_0x04d1
        L_0x071f:
            r2 = r8[r3]
            java.lang.Object r1 = r7.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            X.8v0 r0 = r4.A0C(r3)
            X.C162487sD.A0A(r0, r6, r1, r2)
            goto L_0x04d1
        L_0x0730:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0B(r6, r0, r2)
            goto L_0x04d1
        L_0x073d:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0Q(r6, r0, r2, r10)
            goto L_0x04d1
        L_0x074a:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0N(r6, r0, r2, r10)
            goto L_0x04d1
        L_0x0757:
            r13 = 0
        L_0x0758:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0I(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x0765:
            r13 = 0
        L_0x0766:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0K(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x0773:
            r13 = 0
        L_0x0774:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0G(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x0781:
            r13 = 0
        L_0x0782:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0F(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x078f:
            r13 = 0
        L_0x0790:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0E(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x079d:
            r13 = 0
        L_0x079e:
            r2 = r8[r3]
            java.lang.Object r0 = r7.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162487sD.A0D(r6, r0, r2, r13)
            goto L_0x04d1
        L_0x07ab:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.8v0 r0 = r4.A0C(r3)
            r6.Bth(r0, r1, r2)
            goto L_0x04d1
        L_0x07bc:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            long r15 = r0 << r9
            r14 = 63
            long r0 = r0 >> r14
            long r0 = r0 ^ r15
            X.C150347Qg.A07(r13, r2, r0)
            goto L_0x04d1
        L_0x07d4:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.C150347Qg.A06(r0, r1, r2)
            goto L_0x04d1
        L_0x07e6:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x07f8:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d1
        L_0x080a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d1
        L_0x081c:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r13 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            r1.A03(r13)
            goto L_0x04d1
        L_0x0833:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            java.lang.Object r1 = r7.getObject(r5, r0)
            X.8Lo r1 = (X.C172528Lo) r1
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d1
        L_0x0847:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            java.lang.Object r13 = r7.getObject(r5, r0)
            X.8v0 r1 = r4.A0C(r3)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            X.8xr r13 = (X.C187818xr) r13
            r0.A0C(r13, r1, r2)
            goto L_0x04d1
        L_0x085f:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            java.lang.Object r0 = r7.getObject(r5, r0)
            A07(r6, r0, r2)
            goto L_0x04d1
        L_0x086c:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            X.7bt r13 = X.C162337rj.A02
            boolean r13 = r13.A0F(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = r2 << 3
            r1.A03(r0)
            byte r0 = (byte) r13
            r1.A02(r0)
            goto L_0x04d1
        L_0x0886:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A06(r2, r1)
            goto L_0x04d1
        L_0x0898:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x08aa:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            int r1 = r7.getInt(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r0 = r0.A00
            r0.A05(r2, r1)
            goto L_0x04d1
        L_0x08bc:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            X.C150347Qg.A07(r13, r2, r0)
            goto L_0x04d1
        L_0x08ce:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            long r0 = r7.getLong(r5, r0)
            r13 = r6
            X.8Ad r13 = (X.C169658Ad) r13
            X.6Vs r13 = r13.A00
            X.C150347Qg.A07(r13, r2, r0)
            goto L_0x04d1
        L_0x08e0:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            X.7bt r13 = X.C162337rj.A02
            float r13 = r13.A03(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r1 = r0.A00
            int r0 = java.lang.Float.floatToRawIntBits(r13)
            r1.A06(r2, r0)
            goto L_0x04d1
        L_0x08f8:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d1
            X.7bt r13 = X.C162337rj.A02
            double r14 = r13.A02(r5, r0)
            r0 = r6
            X.8Ad r0 = (X.C169658Ad) r0
            X.6Vs r13 = r0.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r14)
            r13.A07(r2, r0)
            goto L_0x04d1
        L_0x0910:
            r14 = 0
            goto L_0x04cb
        L_0x0913:
            X.6Va r5 = (X.C128166Va) r5
            X.7o3 r0 = r5.zzjp
            r0.A02(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.BtU(X.8m0, java.lang.Object):void");
    }

    public final void Btp(Object obj) {
        Object unmodifiableList;
        int[] iArr = this.A0C;
        if (iArr != null) {
            for (int A0T : iArr) {
                long A0T2 = AnonymousClass6C8.A0T(this.A0A, A0T);
                Object A012 = C162337rj.A01(obj, A0T2);
                if (A012 != null) {
                    ((C174258To) A012).zzfa = false;
                    C162337rj.A05(obj, A0T2, A012);
                }
            }
        }
        int[] iArr2 = this.A0D;
        if (iArr2 != null) {
            for (int i : iArr2) {
                long j = (long) i;
                if (this.A04 instanceof AnonymousClass6W2) {
                    ((AnonymousClass8T2) ((C188228yY) C162337rj.A01(obj, j))).A00 = false;
                } else {
                    List list = (List) C162337rj.A01(obj, j);
                    if (list instanceof C188188yU) {
                        unmodifiableList = ((C188188yU) list).Btm();
                    } else if (!AnonymousClass6C9.A1N(AnonymousClass6W3.A00, list)) {
                        unmodifiableList = Collections.unmodifiableList(list);
                    }
                    C162337rj.A05(obj, j, unmodifiableList);
                }
            }
        }
        ((C128166Va) obj).zzjp.A02 = false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0213, code lost:
        r8 = X.C150347Qg.A02(r7) + X.C128346Vs.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022c, code lost:
        r8 = X.C150347Qg.A02(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0230, code lost:
        if (r0 < 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023a, code lost:
        r8 = X.C150347Qg.A02(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0248, code lost:
        r8 = X.C150347Qg.A02(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0256, code lost:
        r8 = X.C150347Qg.A02(r7) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x026a, code lost:
        if ((r2 instanceof X.C172528Lo) != false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026d, code lost:
        r2 = (java.lang.String) r2;
        r1 = X.C150347Qg.A02(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r0 = X.C161077ox.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0278, code lost:
        r0 = r2.getBytes(X.C155587f9.A03).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x028b, code lost:
        r8 = X.C162487sD.A00(A0C(r3), X.C162337rj.A01(r6, r1), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029f, code lost:
        r2 = X.C162337rj.A01(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02a3, code lost:
        r8 = X.C150347Qg.A04(((X.C172528Lo) r2).A02(), X.C150347Qg.A02(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c1, code lost:
        r8 = X.C150347Qg.A02(r7) + X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02da, code lost:
        r8 = X.C150347Qg.A02(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02de, code lost:
        if (r0 < 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e0, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e4, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f0, code lost:
        r8 = X.C150347Qg.A02(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fe, code lost:
        r8 = X.C150347Qg.A02(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0314, code lost:
        r8 = X.C150347Qg.A03(r1, X.C150347Qg.A02(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0328, code lost:
        r8 = X.C150347Qg.A02(r7) + X.C128346Vs.A01((r9 >> 63) ^ (r9 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033f, code lost:
        r8 = (X.C150347Qg.A02(r7) << 1) + X.C128166Va.A00(A0C(r3), (X.C187818xr) X.C162337rj.A01(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0554, code lost:
        if ((r2 instanceof X.C172528Lo) != false) goto L_0x088c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if ((r2 instanceof X.C172528Lo) != false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0771, code lost:
        r2 = (X.C150347Qg.A02(r8) + X.AnonymousClass6C7.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x07f8, code lost:
        r9 = X.C150347Qg.A02(r8) + X.C128346Vs.A01(A05(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0819, code lost:
        if (r0 >= 0) goto L_0x08c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x083f, code lost:
        r9 = X.C150347Qg.A02(r8) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0853, code lost:
        if ((r2 instanceof X.C172528Lo) != false) goto L_0x088c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0856, code lost:
        r2 = (java.lang.String) r2;
        r1 = X.C150347Qg.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:?, code lost:
        r0 = X.C161077ox.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0861, code lost:
        r0 = r2.getBytes(X.C155587f9.A03).length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0874, code lost:
        r9 = X.C162487sD.A00(A0C(r3), r4.getObject(r6, r1), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0888, code lost:
        r2 = r4.getObject(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x088c, code lost:
        r9 = X.C150347Qg.A04(((X.C172528Lo) r2).A02(), X.C150347Qg.A02(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x08aa, code lost:
        r9 = X.C150347Qg.A02(r8) + X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x08c3, code lost:
        r9 = X.C150347Qg.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x08c7, code lost:
        if (r0 < 0) goto L_0x08cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x08c9, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x08cd, code lost:
        r9 = r9 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x08cf, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x08d8, code lost:
        r2 = X.C150347Qg.A02(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08de, code lost:
        r15 = r15 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x08e7, code lost:
        r9 = X.C150347Qg.A02(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x08fc, code lost:
        r9 = X.C150347Qg.A03(r1, X.C150347Qg.A02(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x090f, code lost:
        r9 = X.C150347Qg.A02(r8) + X.C128346Vs.A01((r10 >> 63) ^ (r10 << 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0925, code lost:
        r9 = (X.C150347Qg.A02(r8) << 1) + X.C128166Va.A00(A0C(r3), (X.C187818xr) r4.getObject(r6, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a6, code lost:
        r8 = (X.C150347Qg.A02(r7) + X.AnonymousClass6C7.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01de, code lost:
        r8 = X.C150347Qg.A02(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ec, code lost:
        r8 = X.C150347Qg.A02(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fe, code lost:
        r8 = X.C150347Qg.A02(r7) + X.C128346Vs.A01(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BuG(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            r5 = r18
            boolean r0 = r5.A09
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            sun.misc.Unsafe r4 = A0F
            if (r0 == 0) goto L_0x04a4
            r3 = 0
            r13 = 0
        L_0x0013:
            int[] r2 = r5.A0A
            int r0 = r2.length
            if (r3 >= r0) goto L_0x049a
            int r0 = r3 + 1
            r1 = r2[r0]
            r0 = r1 & r7
            int r0 = r0 >>> 20
            r7 = r2[r3]
            r1 = r1 & r16
            long r1 = (long) r1
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0035;
                case 2: goto L_0x003d;
                case 3: goto L_0x004b;
                case 4: goto L_0x0059;
                case 5: goto L_0x0067;
                case 6: goto L_0x006f;
                case 7: goto L_0x0077;
                case 8: goto L_0x007f;
                case 9: goto L_0x008f;
                case 10: goto L_0x0097;
                case 11: goto L_0x009f;
                case 12: goto L_0x00ad;
                case 13: goto L_0x00bb;
                case 14: goto L_0x00c3;
                case 15: goto L_0x00cb;
                case 16: goto L_0x00d9;
                case 17: goto L_0x00e7;
                case 18: goto L_0x0356;
                case 19: goto L_0x0369;
                case 20: goto L_0x037c;
                case 21: goto L_0x0396;
                case 22: goto L_0x03ac;
                case 23: goto L_0x0356;
                case 24: goto L_0x0369;
                case 25: goto L_0x03c2;
                case 26: goto L_0x03d5;
                case 27: goto L_0x03e1;
                case 28: goto L_0x03f0;
                case 29: goto L_0x0419;
                case 30: goto L_0x042e;
                case 31: goto L_0x0369;
                case 32: goto L_0x0356;
                case 33: goto L_0x0443;
                case 34: goto L_0x0458;
                case 35: goto L_0x00ef;
                case 36: goto L_0x00fd;
                case 37: goto L_0x010b;
                case 38: goto L_0x0119;
                case 39: goto L_0x0127;
                case 40: goto L_0x0134;
                case 41: goto L_0x0141;
                case 42: goto L_0x014e;
                case 43: goto L_0x0159;
                case 44: goto L_0x0166;
                case 45: goto L_0x0173;
                case 46: goto L_0x0180;
                case 47: goto L_0x018d;
                case 48: goto L_0x019a;
                case 49: goto L_0x046f;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01d8;
                case 52: goto L_0x01e6;
                case 53: goto L_0x01f4;
                case 54: goto L_0x0209;
                case 55: goto L_0x021e;
                case 56: goto L_0x0234;
                case 57: goto L_0x0242;
                case 58: goto L_0x0250;
                case 59: goto L_0x025e;
                case 60: goto L_0x0285;
                case 61: goto L_0x0299;
                case 62: goto L_0x02b3;
                case 63: goto L_0x02cc;
                case 64: goto L_0x02ea;
                case 65: goto L_0x02f8;
                case 66: goto L_0x0306;
                case 67: goto L_0x031e;
                case 68: goto L_0x0339;
                default: goto L_0x0028;
            }
        L_0x0028:
            int r3 = r3 + 4
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0013
        L_0x002d:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x01de
        L_0x0035:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x01ec
        L_0x003d:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            long r0 = r0.A05(r6, r1)
            goto L_0x01fe
        L_0x004b:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            long r0 = r0.A05(r6, r1)
            goto L_0x0213
        L_0x0059:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            int r0 = r0.A04(r6, r1)
            goto L_0x022c
        L_0x0067:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x023a
        L_0x006f:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x0248
        L_0x0077:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x0256
        L_0x007f:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
            boolean r0 = r2 instanceof X.C172528Lo
            if (r0 == 0) goto L_0x026d
            goto L_0x02a3
        L_0x008f:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x028b
        L_0x0097:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x029f
        L_0x009f:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            int r0 = r0.A04(r6, r1)
            goto L_0x02c1
        L_0x00ad:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            int r0 = r0.A04(r6, r1)
            goto L_0x02da
        L_0x00bb:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x02f0
        L_0x00c3:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x02fe
        L_0x00cb:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            int r1 = r0.A04(r6, r1)
            goto L_0x0314
        L_0x00d9:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            X.7bt r0 = X.C162337rj.A02
            long r9 = r0.A05(r6, r1)
            goto L_0x0328
        L_0x00e7:
            boolean r0 = r5.A0D(r3, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x033f
        L_0x00ef:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x00fd:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x010b:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A02(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0119:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A03(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0127:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A06(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0134:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0141:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x014e:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r1 = A04(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0159:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A07(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0166:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A05(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0173:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x0180:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x018d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A08(r0)
            if (r1 <= 0) goto L_0x0028
            goto L_0x01a6
        L_0x019a:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A04(r0)
            if (r1 <= 0) goto L_0x0028
        L_0x01a6:
            int r8 = X.C150347Qg.A02(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r8 = r8 + r0
            int r8 = r8 + r1
            goto L_0x046c
        L_0x01b2:
            java.lang.Object r1 = X.C162337rj.A01(r6, r1)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0481
            java.util.Iterator r1 = X.AnonymousClass001.A0u(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0481
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x01d8:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x01de:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 8
            goto L_0x046c
        L_0x01e6:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x01ec:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 4
            goto L_0x046c
        L_0x01f4:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            long r0 = A05(r6, r1)
        L_0x01fe:
            int r8 = X.C150347Qg.A02(r7)
            int r0 = X.C128346Vs.A01(r0)
            int r8 = r8 + r0
            goto L_0x046c
        L_0x0209:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            long r0 = A05(r6, r1)
        L_0x0213:
            int r8 = X.C150347Qg.A02(r7)
            int r0 = X.C128346Vs.A01(r0)
            int r8 = r8 + r0
            goto L_0x046c
        L_0x021e:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x022c:
            int r8 = X.C150347Qg.A02(r7)
            if (r0 < 0) goto L_0x02e7
            goto L_0x02e0
        L_0x0234:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x023a:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 8
            goto L_0x046c
        L_0x0242:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x0248:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 4
            goto L_0x046c
        L_0x0250:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x0256:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 1
            goto L_0x046c
        L_0x025e:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
            boolean r0 = r2 instanceof X.C172528Lo
            if (r0 == 0) goto L_0x026d
            goto L_0x02a3
        L_0x026d:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.C150347Qg.A02(r7)
            int r0 = X.C161077ox.A00(r2)     // Catch:{ 6zm -> 0x0278 }
            goto L_0x027f
        L_0x0278:
            java.nio.charset.Charset r0 = X.C155587f9.A03
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
        L_0x027f:
            int r8 = X.C150347Qg.A04(r0, r1)
            goto L_0x046c
        L_0x0285:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x028b:
            java.lang.Object r1 = X.C162337rj.A01(r6, r1)
            X.8v0 r0 = r5.A0C(r3)
            int r8 = X.C162487sD.A00(r0, r1, r7)
            goto L_0x046c
        L_0x0299:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x029f:
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
        L_0x02a3:
            X.8Lo r2 = (X.C172528Lo) r2
            int r1 = X.C150347Qg.A02(r7)
            int r0 = r2.A02()
            int r8 = X.C150347Qg.A04(r0, r1)
            goto L_0x046c
        L_0x02b3:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x02c1:
            int r8 = X.C150347Qg.A02(r7)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r8 = r8 + r0
            goto L_0x046c
        L_0x02cc:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x02da:
            int r8 = X.C150347Qg.A02(r7)
            if (r0 < 0) goto L_0x02e7
        L_0x02e0:
            int r0 = X.AnonymousClass6C7.A00(r0)
        L_0x02e4:
            int r8 = r8 + r0
            goto L_0x046c
        L_0x02e7:
            r0 = 10
            goto L_0x02e4
        L_0x02ea:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x02f0:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 4
            goto L_0x046c
        L_0x02f8:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x02fe:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 + 8
            goto L_0x046c
        L_0x0306:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x0314:
            int r0 = X.C150347Qg.A02(r7)
            int r8 = X.C150347Qg.A03(r1, r0)
            goto L_0x046c
        L_0x031e:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
            long r9 = A05(r6, r1)
        L_0x0328:
            int r8 = X.C150347Qg.A02(r7)
            long r1 = r9 << r17
            r0 = 63
            long r9 = r9 >> r0
            long r9 = r9 ^ r1
            int r0 = X.C128346Vs.A01(r9)
            int r8 = r8 + r0
            goto L_0x046c
        L_0x0339:
            boolean r0 = r5.A0E(r6, r7, r3)
            if (r0 == 0) goto L_0x0028
        L_0x033f:
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
            X.8xr r2 = (X.C187818xr) r2
            X.8v0 r1 = r5.A0C(r3)
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r0 << 1
            int r0 = X.C128166Va.A00(r1, r2)
            int r8 = r8 + r0
            goto L_0x046c
        L_0x0356:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r8 = A04(r0)
            if (r8 == 0) goto L_0x0481
            int r0 = X.C150347Qg.A02(r7)
            int r0 = r0 + 8
            int r8 = r8 * r0
            goto L_0x046c
        L_0x0369:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r8 = A04(r0)
            if (r8 == 0) goto L_0x0481
            int r0 = X.C150347Qg.A02(r7)
            int r0 = r0 + 4
            int r8 = r8 * r0
            goto L_0x046c
        L_0x037c:
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0481
            int r1 = X.C162487sD.A02(r2)
            int r0 = r2.size()
            int r8 = A00(r7, r0, r1)
            goto L_0x046c
        L_0x0396:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A03(r0)
            int r8 = A00(r7, r1, r0)
            goto L_0x046c
        L_0x03ac:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A06(r0)
            int r8 = A00(r7, r1, r0)
            goto L_0x046c
        L_0x03c2:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r8 = A04(r0)
            if (r8 == 0) goto L_0x0481
            int r0 = X.C150347Qg.A02(r7)
            int r0 = r0 + 1
            int r8 = r8 * r0
            goto L_0x046c
        L_0x03d5:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r8 = X.C162487sD.A09(r0, r7)
            goto L_0x046c
        L_0x03e1:
            java.lang.Object r1 = X.C162337rj.A01(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.8v0 r0 = r5.A0C(r3)
            int r8 = X.C162487sD.A01(r0, r1, r7)
            goto L_0x046c
        L_0x03f0:
            java.lang.Object r2 = X.C162337rj.A01(r6, r1)
            java.util.List r2 = (java.util.List) r2
            int r8 = r2.size()
            r1 = 0
            if (r8 == 0) goto L_0x0481
            int r0 = X.C150347Qg.A02(r7)
            int r8 = r8 * r0
        L_0x0402:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x046c
            java.lang.Object r0 = r2.get(r1)
            X.8Lo r0 = (X.C172528Lo) r0
            int r0 = r0.A02()
            int r8 = X.C150347Qg.A04(r0, r8)
            int r1 = r1 + 1
            goto L_0x0402
        L_0x0419:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A07(r0)
            int r8 = A00(r7, r1, r0)
            goto L_0x046c
        L_0x042e:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A05(r0)
            int r8 = A00(r7, r1, r0)
            goto L_0x046c
        L_0x0443:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A08(r0)
            int r8 = A00(r7, r1, r0)
            goto L_0x046c
        L_0x0458:
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0481
            int r0 = X.C162487sD.A04(r0)
            int r8 = A00(r7, r1, r0)
        L_0x046c:
            int r13 = r13 + r8
            goto L_0x0028
        L_0x046f:
            java.lang.Object r12 = X.C162337rj.A01(r6, r1)
            java.util.List r12 = (java.util.List) r12
            X.8v0 r11 = r5.A0C(r3)
            int r10 = r12.size()
            r9 = 0
            r8 = 0
            if (r10 != 0) goto L_0x0483
        L_0x0481:
            r8 = 0
            goto L_0x046c
        L_0x0483:
            if (r9 >= r10) goto L_0x046c
            java.lang.Object r2 = r12.get(r9)
            X.8xr r2 = (X.C187818xr) r2
            int r0 = X.C150347Qg.A02(r7)
            int r1 = r0 << 1
            int r0 = X.C128166Va.A00(r11, r2)
            int r1 = r1 + r0
            int r8 = r8 + r1
            int r9 = r9 + 1
            goto L_0x0483
        L_0x049a:
            X.6Va r6 = (X.C128166Va) r6
            X.7o3 r0 = r6.zzjp
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        L_0x04a4:
            r7 = -1
            r3 = 0
            r15 = 0
            r14 = 0
        L_0x04a8:
            int[] r1 = r5.A0A
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0940
            int r0 = r3 + 1
            r11 = r1[r0]
            r8 = r1[r3]
            int r10 = X.AnonymousClass6C8.A07(r11)
            r0 = 17
            if (r10 > r0) goto L_0x093d
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r16
            int r0 = r0 >>> 20
            int r9 = r17 << r0
            if (r2 == r7) goto L_0x04cd
            long r0 = (long) r2
            int r14 = r4.getInt(r6, r0)
            r7 = r2
        L_0x04cd:
            r11 = r11 & r16
            long r1 = (long) r11
            switch(r10) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04e9;
                case 2: goto L_0x04d6;
                case 3: goto L_0x0501;
                case 4: goto L_0x0514;
                case 5: goto L_0x052c;
                case 6: goto L_0x0538;
                case 7: goto L_0x0544;
                case 8: goto L_0x054a;
                case 9: goto L_0x0558;
                case 10: goto L_0x055e;
                case 11: goto L_0x0564;
                case 12: goto L_0x056e;
                case 13: goto L_0x0578;
                case 14: goto L_0x057e;
                case 15: goto L_0x0584;
                case 16: goto L_0x058e;
                case 17: goto L_0x0598;
                case 18: goto L_0x059e;
                case 19: goto L_0x05b1;
                case 20: goto L_0x05c4;
                case 21: goto L_0x05de;
                case 22: goto L_0x05f4;
                case 23: goto L_0x059e;
                case 24: goto L_0x05b1;
                case 25: goto L_0x060a;
                case 26: goto L_0x061d;
                case 27: goto L_0x0629;
                case 28: goto L_0x0639;
                case 29: goto L_0x0662;
                case 30: goto L_0x0678;
                case 31: goto L_0x05b1;
                case 32: goto L_0x059e;
                case 33: goto L_0x068e;
                case 34: goto L_0x06a4;
                case 35: goto L_0x06ba;
                case 36: goto L_0x06c8;
                case 37: goto L_0x06d6;
                case 38: goto L_0x06e4;
                case 39: goto L_0x06f2;
                case 40: goto L_0x06ff;
                case 41: goto L_0x070c;
                case 42: goto L_0x0719;
                case 43: goto L_0x0724;
                case 44: goto L_0x0731;
                case 45: goto L_0x073e;
                case 46: goto L_0x074b;
                case 47: goto L_0x0758;
                case 48: goto L_0x0765;
                case 49: goto L_0x07a3;
                case 50: goto L_0x077d;
                case 51: goto L_0x07cf;
                case 52: goto L_0x07dd;
                case 53: goto L_0x07eb;
                case 54: goto L_0x07f2;
                case 55: goto L_0x0807;
                case 56: goto L_0x081d;
                case 57: goto L_0x082b;
                case 58: goto L_0x0839;
                case 59: goto L_0x0847;
                case 60: goto L_0x086e;
                case 61: goto L_0x0882;
                case 62: goto L_0x089c;
                case 63: goto L_0x08b5;
                case 64: goto L_0x08d2;
                case 65: goto L_0x08e1;
                case 66: goto L_0x08ee;
                case 67: goto L_0x0905;
                case 68: goto L_0x091f;
                default: goto L_0x04d3;
            }
        L_0x04d3:
            int r3 = r3 + 4
            goto L_0x04a8
        L_0x04d6:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            long r0 = r4.getLong(r6, r1)
            int r2 = X.C150347Qg.A02(r8)
            int r0 = X.C128346Vs.A01(r0)
            int r2 = r2 + r0
            goto L_0x08de
        L_0x04e9:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 4
            goto L_0x093a
        L_0x04f5:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 8
            goto L_0x093a
        L_0x0501:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            long r0 = r4.getLong(r6, r1)
            int r2 = X.C150347Qg.A02(r8)
            int r0 = X.C128346Vs.A01(r0)
            int r2 = r2 + r0
            goto L_0x08de
        L_0x0514:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = r4.getInt(r6, r1)
            int r2 = X.C150347Qg.A02(r8)
            if (r0 < 0) goto L_0x0529
            int r0 = X.AnonymousClass6C7.A00(r0)
        L_0x0526:
            int r2 = r2 + r0
            goto L_0x08de
        L_0x0529:
            r0 = 10
            goto L_0x0526
        L_0x052c:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r2 = r0 + 8
            goto L_0x08de
        L_0x0538:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r2 = r0 + 4
            goto L_0x08de
        L_0x0544:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x083f
        L_0x054a:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r2 = r4.getObject(r6, r1)
            boolean r0 = r2 instanceof X.C172528Lo
            if (r0 == 0) goto L_0x0856
            goto L_0x088c
        L_0x0558:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x0874
        L_0x055e:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x0888
        L_0x0564:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = r4.getInt(r6, r1)
            goto L_0x08aa
        L_0x056e:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r0 = r4.getInt(r6, r1)
            goto L_0x08c3
        L_0x0578:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x08d8
        L_0x057e:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x08e7
        L_0x0584:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            int r1 = r4.getInt(r6, r1)
            goto L_0x08fc
        L_0x058e:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            long r10 = r4.getLong(r6, r1)
            goto L_0x090f
        L_0x0598:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x04d3
            goto L_0x0925
        L_0x059e:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A04(r0)
            if (r9 == 0) goto L_0x07b5
            int r0 = X.C150347Qg.A02(r8)
            int r0 = r0 + 8
            int r9 = r9 * r0
            goto L_0x093a
        L_0x05b1:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A04(r0)
            if (r9 == 0) goto L_0x07b5
            int r0 = X.C150347Qg.A02(r8)
            int r0 = r0 + 4
            int r9 = r9 * r0
            goto L_0x093a
        L_0x05c4:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            if (r0 == 0) goto L_0x07b5
            int r1 = X.C162487sD.A02(r2)
            int r0 = r2.size()
            int r9 = A00(r8, r0, r1)
            goto L_0x093a
        L_0x05de:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A03(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x05f4:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A06(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x060a:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r9 = A04(r0)
            if (r9 == 0) goto L_0x07b5
            int r0 = X.C150347Qg.A02(r8)
            int r0 = r0 + 1
            int r9 = r9 * r0
            goto L_0x093a
        L_0x061d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r9 = X.C162487sD.A09(r0, r8)
            goto L_0x093a
        L_0x0629:
            java.lang.Object r1 = r4.getObject(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.8v0 r0 = r5.A0C(r3)
            int r9 = X.C162487sD.A01(r0, r1, r8)
            goto L_0x093a
        L_0x0639:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            int r9 = r2.size()
            r1 = 0
            if (r9 == 0) goto L_0x07b5
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r9 * r0
        L_0x064b:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x093a
            java.lang.Object r0 = r2.get(r1)
            X.8Lo r0 = (X.C172528Lo) r0
            int r0 = r0.A02()
            int r9 = X.C150347Qg.A04(r0, r9)
            int r1 = r1 + 1
            goto L_0x064b
        L_0x0662:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A07(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x0678:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A05(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x068e:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A08(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x06a4:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x07b5
            int r0 = X.C162487sD.A04(r0)
            int r9 = A00(r8, r1, r0)
            goto L_0x093a
        L_0x06ba:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x06c8:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x06d6:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A02(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x06e4:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A03(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x06f2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A06(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x06ff:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x070c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x0719:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r1 = A04(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x0724:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A07(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x0731:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A05(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x073e:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x074b:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A04(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x0758:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A08(r0)
            if (r1 <= 0) goto L_0x04d3
            goto L_0x0771
        L_0x0765:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162487sD.A04(r0)
            if (r1 <= 0) goto L_0x04d3
        L_0x0771:
            int r2 = X.C150347Qg.A02(r8)
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r2 = r2 + r0
            int r2 = r2 + r1
            goto L_0x08de
        L_0x077d:
            java.lang.Object r1 = r4.getObject(r6, r1)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x07b5
            java.util.Iterator r1 = X.AnonymousClass001.A0u(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07b5
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x07a3:
            java.lang.Object r13 = r4.getObject(r6, r1)
            java.util.List r13 = (java.util.List) r13
            X.8v0 r12 = r5.A0C(r3)
            int r11 = r13.size()
            r10 = 0
            r9 = 0
            if (r11 != 0) goto L_0x07b8
        L_0x07b5:
            r9 = 0
            goto L_0x093a
        L_0x07b8:
            if (r10 >= r11) goto L_0x093a
            java.lang.Object r2 = r13.get(r10)
            X.8xr r2 = (X.C187818xr) r2
            int r0 = X.C150347Qg.A02(r8)
            int r1 = r0 << 1
            int r0 = X.C128166Va.A00(r12, r2)
            int r1 = r1 + r0
            int r9 = r9 + r1
            int r10 = r10 + 1
            goto L_0x07b8
        L_0x07cf:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 8
            goto L_0x093a
        L_0x07dd:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r2 = r0 + 4
            goto L_0x08de
        L_0x07eb:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            goto L_0x07f8
        L_0x07f2:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x07f8:
            long r0 = A05(r6, r1)
            int r9 = X.C150347Qg.A02(r8)
            int r0 = X.C128346Vs.A01(r0)
            int r9 = r9 + r0
            goto L_0x093a
        L_0x0807:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r9 = X.C150347Qg.A02(r8)
            if (r0 < 0) goto L_0x08cf
            goto L_0x08c9
        L_0x081d:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 8
            goto L_0x093a
        L_0x082b:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            int r0 = X.C150347Qg.A02(r8)
            int r2 = r0 + 4
            goto L_0x08de
        L_0x0839:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x083f:
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 1
            goto L_0x093a
        L_0x0847:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r2 = r4.getObject(r6, r1)
            boolean r0 = r2 instanceof X.C172528Lo
            if (r0 == 0) goto L_0x0856
            goto L_0x088c
        L_0x0856:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = X.C150347Qg.A02(r8)
            int r0 = X.C161077ox.A00(r2)     // Catch:{ 6zm -> 0x0861 }
            goto L_0x0868
        L_0x0861:
            java.nio.charset.Charset r0 = X.C155587f9.A03
            byte[] r0 = r2.getBytes(r0)
            int r0 = r0.length
        L_0x0868:
            int r9 = X.C150347Qg.A04(r0, r1)
            goto L_0x093a
        L_0x086e:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x0874:
            java.lang.Object r1 = r4.getObject(r6, r1)
            X.8v0 r0 = r5.A0C(r3)
            int r9 = X.C162487sD.A00(r0, r1, r8)
            goto L_0x093a
        L_0x0882:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x0888:
            java.lang.Object r2 = r4.getObject(r6, r1)
        L_0x088c:
            X.8Lo r2 = (X.C172528Lo) r2
            int r1 = X.C150347Qg.A02(r8)
            int r0 = r2.A02()
            int r9 = X.C150347Qg.A04(r0, r1)
            goto L_0x093a
        L_0x089c:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x08aa:
            int r9 = X.C150347Qg.A02(r8)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r9 = r9 + r0
            goto L_0x093a
        L_0x08b5:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
        L_0x08c3:
            int r9 = X.C150347Qg.A02(r8)
            if (r0 < 0) goto L_0x08cf
        L_0x08c9:
            int r0 = X.AnonymousClass6C7.A00(r0)
        L_0x08cd:
            int r9 = r9 + r0
            goto L_0x093a
        L_0x08cf:
            r0 = 10
            goto L_0x08cd
        L_0x08d2:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x08d8:
            int r0 = X.C150347Qg.A02(r8)
            int r2 = r0 + 4
        L_0x08de:
            int r15 = r15 + r2
            goto L_0x04d3
        L_0x08e1:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x08e7:
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 + 8
            goto L_0x093a
        L_0x08ee:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = X.C162337rj.A01(r6, r1)
            int r1 = X.AnonymousClass001.A0K(r0)
        L_0x08fc:
            int r0 = X.C150347Qg.A02(r8)
            int r9 = X.C150347Qg.A03(r1, r0)
            goto L_0x093a
        L_0x0905:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
            long r10 = A05(r6, r1)
        L_0x090f:
            int r9 = X.C150347Qg.A02(r8)
            long r1 = r10 << r17
            r0 = 63
            long r10 = r10 >> r0
            long r10 = r10 ^ r1
            int r0 = X.C128346Vs.A01(r10)
            int r9 = r9 + r0
            goto L_0x093a
        L_0x091f:
            boolean r0 = r5.A0E(r6, r8, r3)
            if (r0 == 0) goto L_0x04d3
        L_0x0925:
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.8xr r2 = (X.C187818xr) r2
            X.8v0 r1 = r5.A0C(r3)
            int r0 = X.C150347Qg.A02(r8)
            int r9 = r0 << 1
            int r0 = X.C128166Va.A00(r1, r2)
            int r9 = r9 + r0
        L_0x093a:
            int r15 = r15 + r9
            goto L_0x04d3
        L_0x093d:
            r9 = 0
            goto L_0x04cd
        L_0x0940:
            X.6Va r6 = (X.C128166Va) r6
            X.7o3 r0 = r6.zzjp
            int r0 = r0.A00()
            int r15 = r15 + r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.BuG(java.lang.Object):int");
    }

    public final boolean BuI(Object obj) {
        int length;
        int i;
        boolean z;
        int[] iArr = this.A0B;
        boolean z2 = true;
        if (iArr == null || (length = iArr.length) == 0) {
            return z2;
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = iArr[i3];
            int A082 = A08(i5);
            int[] iArr2 = this.A0A;
            int i6 = iArr2[A082 + 1];
            boolean z3 = this.A09;
            Object obj2 = obj;
            if (!z3) {
                int i7 = iArr2[A082 + 2];
                int i8 = i7 & 1048575;
                i = (z2 ? 1 : 0) << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = A0F.getInt(obj2, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & i6) != 0) {
                if (z3) {
                    if (!A0D(A082, obj2)) {
                        return false;
                    }
                } else if ((i4 & i) == 0) {
                    return false;
                }
            }
            int i9 = (267386880 & i6) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        z = A0E(obj2, i5, A082);
                    } else if (i9 != 49) {
                        if (i9 == 50 && !((AbstractMap) C162337rj.A01(obj2, (long) (i6 & 1048575))).isEmpty()) {
                            throw new NoSuchMethodError();
                        }
                        i3++;
                        z2 = true;
                    }
                }
                List A062 = A06(i6, obj2);
                if (!A062.isEmpty()) {
                    C186258v0 A0C2 = A0C(A082);
                    for (int i10 = 0; i10 < A062.size(); i10++) {
                        if (!A0C2.BuI(A062.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
                z2 = true;
            } else if (z3) {
                z = A0D(A082, obj2);
            } else {
                z = i4 & i;
            }
            if (z && !A0C(A082).BuI(C162337rj.A01(obj2, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            z2 = true;
        } while (i3 < length);
        return z2;
    }

    public C169638Ab(AnonymousClass72U r1, C157877j2 r2, C180998ly r3, C187818xr r4, C178558hj r5, AnonymousClass72V r6, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, Object[] objArr, int i, int i2, int i3, boolean z) {
        this.A0A = iArr;
        this.A0E = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A09 = z;
        this.A0B = iArr2;
        this.A0C = iArr3;
        this.A0D = iArr4;
        this.A07 = r5;
        this.A04 = r2;
        this.A08 = r6;
        this.A03 = r1;
        this.A06 = r4;
        this.A05 = r3;
    }

    public static int A03(C148847Jy r4, byte[] bArr, int i) {
        int A012 = C161917qp.A01(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 == 0) {
            r4.A02 = "";
            return A012;
        }
        int i3 = A012 + i2;
        if (C161077ox.A00.A01(bArr, A012, i3) == 0) {
            r4.A02 = AnonymousClass6CA.A0W(C155587f9.A03, bArr, A012, i2);
            return i3;
        }
        throw new C140566tx("Protocol message had invalid UTF-8.");
    }

    public static long A05(Object obj, long j) {
        return ((Number) C162337rj.A01(obj, j)).longValue();
    }

    public static List A06(int i, Object obj) {
        return (List) C162337rj.A01(obj, (long) (i & 1048575));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        if (r12.A09 != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r1 = r3[r2 + 2];
        r0 = X.AnonymousClass6C9.A0K(r1);
        r4 = X.C162337rj.A02;
        r4.A0B(r13, r0, r4.A04(r13, r0) | (1 << (r1 >>> 20)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019f, code lost:
        X.C162337rj.A05(r13, r8, X.C162337rj.A01(r14, r8));
        X.C162337rj.A02.A0B(r13, X.AnonymousClass6C7.A0O(r3, r2), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Btq(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r14.getClass()
            r2 = 0
        L_0x0004:
            int[] r3 = r12.A0A
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01b1
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.AnonymousClass6C8.A07(r1)
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0081;
                case 2: goto L_0x0091;
                case 3: goto L_0x0091;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0091;
                case 6: goto L_0x00a1;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00c1;
                case 9: goto L_0x001f;
                case 10: goto L_0x00c1;
                case 11: goto L_0x00a1;
                case 12: goto L_0x00a1;
                case 13: goto L_0x00a1;
                case 14: goto L_0x0091;
                case 15: goto L_0x00a1;
                case 16: goto L_0x0091;
                case 17: goto L_0x001f;
                case 18: goto L_0x00ea;
                case 19: goto L_0x00ea;
                case 20: goto L_0x00ea;
                case 21: goto L_0x00ea;
                case 22: goto L_0x00ea;
                case 23: goto L_0x00ea;
                case 24: goto L_0x00ea;
                case 25: goto L_0x00ea;
                case 26: goto L_0x00ea;
                case 27: goto L_0x00ea;
                case 28: goto L_0x00ea;
                case 29: goto L_0x00ea;
                case 30: goto L_0x00ea;
                case 31: goto L_0x00ea;
                case 32: goto L_0x00ea;
                case 33: goto L_0x00ea;
                case 34: goto L_0x00ea;
                case 35: goto L_0x00ea;
                case 36: goto L_0x00ea;
                case 37: goto L_0x00ea;
                case 38: goto L_0x00ea;
                case 39: goto L_0x00ea;
                case 40: goto L_0x00ea;
                case 41: goto L_0x00ea;
                case 42: goto L_0x00ea;
                case 43: goto L_0x00ea;
                case 44: goto L_0x00ea;
                case 45: goto L_0x00ea;
                case 46: goto L_0x00ea;
                case 47: goto L_0x00ea;
                case 48: goto L_0x00ea;
                case 49: goto L_0x00ea;
                case 50: goto L_0x017f;
                case 51: goto L_0x0192;
                case 52: goto L_0x0192;
                case 53: goto L_0x0192;
                case 54: goto L_0x0192;
                case 55: goto L_0x0192;
                case 56: goto L_0x0192;
                case 57: goto L_0x0192;
                case 58: goto L_0x0192;
                case 59: goto L_0x0192;
                case 60: goto L_0x0041;
                case 61: goto L_0x0199;
                case 62: goto L_0x0199;
                case 63: goto L_0x0199;
                case 64: goto L_0x0199;
                case 65: goto L_0x0199;
                case 66: goto L_0x0199;
                case 67: goto L_0x0199;
                case 68: goto L_0x0041;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r2 = r2 + 4
            goto L_0x0004
        L_0x001f:
            long r0 = X.AnonymousClass6C8.A0T(r3, r2)
            boolean r4 = r12.A0D(r2, r14)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C162337rj.A01(r13, r0)
            java.lang.Object r4 = X.C162337rj.A01(r14, r0)
            if (r5 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = X.C155587f9.A00(r5, r4)
        L_0x0039:
            X.C162337rj.A05(r13, r0, r4)
            goto L_0x00ce
        L_0x003e:
            if (r4 == 0) goto L_0x001c
            goto L_0x0039
        L_0x0041:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            boolean r4 = r12.A0E(r14, r6, r2)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C162337rj.A01(r13, r0)
            java.lang.Object r4 = X.C162337rj.A01(r14, r0)
            if (r5 == 0) goto L_0x006e
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = X.C155587f9.A00(r5, r4)
        L_0x0061:
            X.C162337rj.A05(r13, r0, r4)
            long r0 = X.AnonymousClass6C7.A0O(r3, r2)
            X.7bt r3 = X.C162337rj.A02
            r3.A0B(r13, r0, r6)
            goto L_0x001c
        L_0x006e:
            if (r4 == 0) goto L_0x001c
            goto L_0x0061
        L_0x0071:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bt r6 = X.C162337rj.A02
            double r10 = r6.A02(r14, r8)
            r6.A09(r7, r8, r10)
            goto L_0x00ce
        L_0x0081:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bt r1 = X.C162337rj.A02
            float r0 = r1.A03(r14, r8)
            r1.A0A(r13, r8, r0)
            goto L_0x00ce
        L_0x0091:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bt r6 = X.C162337rj.A02
            long r10 = r6.A05(r14, r8)
            r6.A0C(r7, r8, r10)
            goto L_0x00ce
        L_0x00a1:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bt r1 = X.C162337rj.A02
            int r0 = r1.A04(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x00ce
        L_0x00b1:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bt r1 = X.C162337rj.A02
            boolean r0 = r1.A0F(r14, r8)
            r1.A0D(r13, r8, r0)
            goto L_0x00ce
        L_0x00c1:
            boolean r0 = r12.A0D(r2, r14)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = X.C162337rj.A01(r14, r8)
            X.C162337rj.A05(r13, r8, r0)
        L_0x00ce:
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x001c
            int r0 = r2 + 2
            r1 = r3[r0]
            int r0 = r1 >>> 20
            r5 = 1
            int r5 = r5 << r0
            long r0 = X.AnonymousClass6C9.A0K(r1)
            X.7bt r4 = X.C162337rj.A02
            int r3 = r4.A04(r13, r0)
            r3 = r3 | r5
            r4.A0B(r13, r0, r3)
            goto L_0x001c
        L_0x00ea:
            X.7j2 r0 = r12.A04
            boolean r0 = r0 instanceof X.AnonymousClass6W2
            if (r0 == 0) goto L_0x011d
            java.lang.Object r5 = X.C162337rj.A01(r13, r8)
            X.8yY r5 = (X.C188228yY) r5
            java.lang.Object r4 = X.C162337rj.A01(r14, r8)
            java.util.List r4 = (java.util.List) r4
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x0118
            if (r1 <= 0) goto L_0x0117
            r0 = r5
            X.8T2 r0 = (X.AnonymousClass8T2) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0114
            int r1 = r1 + r3
            X.8yY r5 = r5.BuC(r1)
        L_0x0114:
            r5.addAll(r4)
        L_0x0117:
            r4 = r5
        L_0x0118:
            X.C162337rj.A05(r13, r8, r4)
            goto L_0x001c
        L_0x011d:
            java.lang.Object r3 = X.C162337rj.A01(r14, r8)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            java.lang.Object r4 = X.C162337rj.A01(r13, r8)
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x015d
            boolean r0 = r4 instanceof X.C188188yU
            if (r0 == 0) goto L_0x0158
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r1)
            X.6Vj r4 = new X.6Vj
            r4.<init>(r0)
        L_0x0140:
            X.C162337rj.A05(r13, r8, r4)
        L_0x0143:
            int r1 = r4.size()
            int r0 = r3.size()
            if (r1 <= 0) goto L_0x0153
            if (r0 <= 0) goto L_0x0152
            r4.addAll(r3)
        L_0x0152:
            r3 = r4
        L_0x0153:
            X.C162337rj.A05(r13, r8, r3)
            goto L_0x001c
        L_0x0158:
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r1)
            goto L_0x0140
        L_0x015d:
            java.lang.Class r0 = X.AnonymousClass6W3.A00
            boolean r0 = X.AnonymousClass6C9.A1N(r0, r4)
            if (r0 == 0) goto L_0x0171
            java.util.ArrayList r1 = X.AnonymousClass6C8.A0i(r4, r1)
        L_0x0169:
            r1.addAll(r4)
            X.C162337rj.A05(r13, r8, r1)
            r4 = r1
            goto L_0x0143
        L_0x0171:
            boolean r0 = r4 instanceof X.AnonymousClass8T3
            if (r0 == 0) goto L_0x0143
            java.util.ArrayList r0 = X.AnonymousClass6C8.A0i(r4, r1)
            X.6Vj r1 = new X.6Vj
            r1.<init>(r0)
            goto L_0x0169
        L_0x017f:
            X.8ly r3 = r12.A05
            java.lang.Object r1 = X.C162337rj.A01(r13, r8)
            java.lang.Object r0 = X.C162337rj.A01(r14, r8)
            java.lang.Object r0 = r3.Btd(r1, r0)
            X.C162337rj.A05(r13, r8, r0)
            goto L_0x001c
        L_0x0192:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
            goto L_0x019f
        L_0x0199:
            boolean r0 = r12.A0E(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
        L_0x019f:
            java.lang.Object r0 = X.C162337rj.A01(r14, r8)
            X.C162337rj.A05(r13, r8, r0)
            long r0 = X.AnonymousClass6C7.A0O(r3, r2)
            X.7bt r3 = X.C162337rj.A02
            r3.A0B(r13, r0, r4)
            goto L_0x001c
        L_0x01b1:
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x01b8
            X.C162487sD.A0R(r13, r14)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169638Ab.Btq(java.lang.Object, java.lang.Object):void");
    }
}
