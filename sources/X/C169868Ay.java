package X;

import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.8Ay  reason: invalid class name and case insensitive filesystem */
public final class C169868Ay implements C186268v1 {
    public static final Unsafe A0E = C162367ro.A05();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1445572a A04;
    public final C157887j3 A05;
    public final C181048m3 A06;
    public final C187848xu A07;
    public final C178628hq A08;
    public final C1445772c A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final Object[] A0D;

    public static int A02(C156607gu r2, C186268v1 r3, byte[] bArr, int i, int i2, int i3) {
        C169868Ay r1 = (C169868Ay) r3;
        Object BtG = r1.BtG();
        int A0M = r1.A0M(r2, BtG, bArr, i, i2, i3);
        r1.Btp(BtG);
        r2.A02 = BtG;
        return A0M;
    }

    public static int A03(C156607gu r8, C160657o4 r9, byte[] bArr, int i, int i2, int i3) {
        Object r1;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C156607gu r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A052 = A05(r8, bArr, i2);
                r9.A01(i, Long.valueOf(r8.A01));
                return A052;
            } else if (i5 == 1) {
                r9.A01(i, Long.valueOf(AnonymousClass6C7.A0N(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A042 = A04(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A042) {
                        if (i6 == 0) {
                            r1 = C172538Lp.A00;
                        } else {
                            C172538Lp.A00(A042, A042 + i6, length);
                            r1 = new C128876Xu(C172538Lp.A01.BtP(bArr, A042, i6));
                        }
                        r9.A01(i, r1);
                        return A042 + i6;
                    }
                    throw new C140576ty("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C140576ty("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                C160657o4 r4 = new C160657o4();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A04(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A03(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C140576ty("Failed to parse the message.");
                }
                r9.A01(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A01(i, Integer.valueOf(AnonymousClass6C7.A0B(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C140576ty("Protocol message contained an invalid tag (zero).");
    }

    public static int A00(int i, int i2, int i3) {
        return i3 + (i2 * C128856Xs.A00(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C156607gu r6, X.C186268v1 r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A09(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.BtG()
            int r5 = r5 + r4
            r0.BtT(r1, r2, r3, r4, r5)
            r7.Btp(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.A01(X.7gu, X.8v1, byte[], int, int):int");
    }

    public static int A04(C156607gu r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A09(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A05(C156607gu r8, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r8.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        r8.A01 = j2;
        return i3;
    }

    public static int A07(C156607gu r16, byte[] bArr, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2 = bArr;
        C156607gu r9 = r16;
        int A042 = A04(r9, bArr2, i);
        int i8 = r9.A00;
        if (i8 < 0) {
            throw new C140576ty("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i8 == 0) {
            r9.A02 = "";
            return A042;
        } else {
            int i9 = A042;
            if (C154937dz.A00 instanceof AnonymousClass6YI) {
                int length = bArr2.length;
                if ((A042 | i8 | ((length - A042) - i8)) >= 0) {
                    int i10 = A042 + i8;
                    char[] cArr = new char[i8];
                    int i11 = 0;
                    while (i6 < i10) {
                        byte A002 = C162367ro.A00(bArr2, (long) i6);
                        if (A002 < 0) {
                            break;
                        }
                        i9 = i6 + 1;
                        cArr[i5] = (char) A002;
                        i11 = i5 + 1;
                    }
                    while (i6 < i10) {
                        int i12 = i6 + 1;
                        byte A003 = C162367ro.A00(bArr2, (long) i6);
                        if (A003 >= 0) {
                            i7 = i5 + 1;
                            cArr[i5] = (char) A003;
                            while (i12 < i10) {
                                byte A004 = C162367ro.A00(bArr2, (long) i12);
                                if (A004 < 0) {
                                    break;
                                }
                                i12++;
                                cArr[i7] = (char) A004;
                                i7++;
                            }
                            i6 = i12;
                        } else {
                            if (A003 < -32) {
                                if (i12 < i10) {
                                    i6 = i12 + 1;
                                    byte A005 = C162367ro.A00(bArr2, (long) i12);
                                    i7 = i5 + 1;
                                    if (A003 < -62 || A005 > -65) {
                                        throw new C140576ty("Protocol message had invalid UTF-8.");
                                    }
                                    cArr[i5] = (char) (((A003 & 31) << 6) | (A005 & 63));
                                }
                            } else if (A003 < -16) {
                                if (i12 < i10 - 1) {
                                    int i13 = i12 + 1;
                                    i6 = i13 + 1;
                                    i7 = i5 + 1;
                                    C154037cT.A01(cArr, A003, C162367ro.A00(bArr2, (long) i12), C162367ro.A00(bArr2, (long) i13), i5);
                                }
                            } else if (i12 < i10 - 2) {
                                int i14 = i12 + 1;
                                byte A006 = C162367ro.A00(bArr2, (long) i12);
                                int i15 = i14 + 1;
                                i6 = i15 + 1;
                                C154037cT.A00(cArr, A003, A006, C162367ro.A00(bArr2, (long) i14), C162367ro.A00(bArr2, (long) i15), i5);
                                i5 = i5 + 1 + 1;
                            }
                            throw new C140576ty("Protocol message had invalid UTF-8.");
                        }
                        i5 = i7;
                    }
                    str = new String(cArr, 0, i5);
                } else {
                    Object[] A1X = AnonymousClass0x9.A1X();
                    C86604Kt.A1X(A1X, length, 0, A042, 1);
                    AnonymousClass000.A1N(A1X, i8);
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", A1X));
                }
            } else {
                int length2 = bArr2.length;
                if ((A042 | i8 | ((length2 - A042) - i8)) >= 0) {
                    int i16 = A042 + i8;
                    char[] cArr2 = new char[i8];
                    int i17 = 0;
                    while (i3 < i16) {
                        byte b = bArr[i3];
                        if (b < 0) {
                            break;
                        }
                        i9 = i3 + 1;
                        cArr2[i2] = (char) b;
                        i17 = i2 + 1;
                    }
                    while (i3 < i16) {
                        int i18 = i3 + 1;
                        byte b2 = bArr2[i3];
                        if (b2 >= 0) {
                            i4 = i2 + 1;
                            cArr2[i2] = (char) b2;
                            while (i18 < i16) {
                                byte b3 = bArr2[i18];
                                if (b3 < 0) {
                                    break;
                                }
                                i18++;
                                cArr2[i4] = (char) b3;
                                i4++;
                            }
                            i3 = i18;
                        } else {
                            if (b2 < -32) {
                                if (i18 < i16) {
                                    i3 = i18 + 1;
                                    byte b4 = bArr2[i18];
                                    i4 = i2 + 1;
                                    if (b2 < -62 || b4 > -65) {
                                        throw new C140576ty("Protocol message had invalid UTF-8.");
                                    }
                                    cArr2[i2] = (char) (((b2 & 31) << 6) | (b4 & 63));
                                }
                            } else if (b2 < -16) {
                                if (i18 < i16 - 1) {
                                    int i19 = i18 + 1;
                                    i3 = i19 + 1;
                                    i4 = i2 + 1;
                                    C154037cT.A01(cArr2, b2, bArr2[i18], bArr2[i19], i2);
                                }
                            } else if (i18 < i16 - 2) {
                                int i20 = i18 + 1;
                                byte b5 = bArr2[i18];
                                int i21 = i20 + 1;
                                byte b6 = bArr2[i20];
                                i3 = i21 + 1;
                                C154037cT.A00(cArr2, b2, b5, b6, bArr2[i21], i2);
                                i2 = i2 + 1 + 1;
                            }
                            throw new C140576ty("Protocol message had invalid UTF-8.");
                        }
                        i2 = i4;
                    }
                    str = new String(cArr2, 0, i2);
                } else {
                    Object[] A1X2 = AnonymousClass0x9.A1X();
                    C86604Kt.A1X(A1X2, length2, 0, A042, 1);
                    AnonymousClass000.A1N(A1X2, i8);
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", A1X2));
                }
            }
            r9.A02 = str;
            return A042 + i8;
        }
    }

    public static int A09(C156607gu r4, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        r4.A00 = i3;
                        return i7;
                    }
                }
            }
            r4.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        r4.A00 = i3;
        return i7;
    }

    public static int A0A(Object obj) {
        return ((List) obj).size();
    }

    public static int A0B(Object obj, int i) {
        if (obj instanceof C172538Lp) {
            return C128856Xs.A03((C172538Lp) obj, i);
        }
        return C128856Xs.A01(i, (String) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01da, code lost:
        if (r31 == false) goto L_0x01dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C169868Ay A0D(X.C1445572a r32, X.C157887j3 r33, X.C181048m3 r34, X.C178618hp r35, X.C178628hq r36, X.C1445772c r37) {
        /*
            r8 = r35
            boolean r0 = r8 instanceof X.C169788Aq
            if (r0 == 0) goto L_0x037d
            X.8Aq r8 = (X.C169788Aq) r8
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 == r1) goto L_0x0010
            r1 = 2
        L_0x0010:
            r0 = 2
            r5 = 0
            r17 = 1
            boolean r31 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.String r13 = r8.A02
            int r27 = r13.length()
            char r0 = r13.charAt(r5)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r12) goto L_0x0032
            r0 = 1
        L_0x0028:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0033
            r0 = r1
            goto L_0x0028
        L_0x0032:
            r1 = 1
        L_0x0033:
            int r0 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r12) goto L_0x0052
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003f:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x004f
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x003f
        L_0x004f:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x0052:
            if (r3 != 0) goto L_0x025b
            int[] r16 = A0F
            r14 = 0
            r4 = 0
            r3 = 0
            r7 = 0
            r6 = 0
            r2 = 0
        L_0x005c:
            sun.misc.Unsafe r26 = A0E
            java.lang.Object[] r12 = r8.A03
            X.8xu r1 = r8.A01
            r28 = r1
            java.lang.Class r15 = r28.getClass()
            int r1 = r7 * 3
            int[] r1 = new int[r1]
            r25 = r1
            int r7 = r7 << r17
            java.lang.Object[] r11 = new java.lang.Object[r7]
            int r30 = r2 + r6
            r24 = r2
            r23 = r30
            r22 = 0
            r21 = 0
        L_0x007c:
            r1 = r27
            if (r0 >= r1) goto L_0x035f
            int r1 = r0 + 1
            char r10 = r13.charAt(r0)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r6) goto L_0x00a2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x008f:
            int r7 = r1 + 1
            char r1 = r13.charAt(r1)
            if (r1 < r6) goto L_0x009f
            int r10 = X.AnonymousClass6C9.A09(r1, r0, r10)
            int r0 = r0 + 13
            r1 = r7
            goto L_0x008f
        L_0x009f:
            int r1 = r1 << r0
            r10 = r10 | r1
            r1 = r7
        L_0x00a2:
            int r0 = r1 + 1
            char r9 = r13.charAt(r1)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r6) goto L_0x00c4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00b1:
            int r7 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r1) goto L_0x00c1
            int r9 = X.AnonymousClass6C9.A09(r0, r6, r9)
            int r6 = r6 + 13
            r0 = r7
            goto L_0x00b1
        L_0x00c1:
            int r0 = r0 << r6
            r9 = r9 | r0
            r0 = r7
        L_0x00c4:
            r8 = r9 & 255(0xff, float:3.57E-43)
            r6 = r9 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x00d0
            int r6 = r22 + 1
            r16[r22] = r21
            r22 = r6
        L_0x00d0:
            r6 = 51
            if (r8 < r6) goto L_0x0161
            int r18 = r0 + 1
            char r6 = r13.charAt(r0)
            if (r6 < r1) goto L_0x00f7
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x00e0:
            int r17 = r18 + 1
            r0 = r18
            char r0 = r13.charAt(r0)
            if (r0 < r1) goto L_0x00f3
            int r6 = X.AnonymousClass6C9.A09(r0, r7, r6)
            int r7 = r7 + 13
            r18 = r17
            goto L_0x00e0
        L_0x00f3:
            int r0 = r0 << r7
            r6 = r6 | r0
            r18 = r17
        L_0x00f7:
            int r1 = r8 + -51
            r0 = 9
            if (r1 == r0) goto L_0x0151
            r0 = 17
            if (r1 == r0) goto L_0x0151
            r0 = 12
            if (r1 != r0) goto L_0x0114
            if (r31 != 0) goto L_0x0114
            int r0 = r21 / 3
            r1 = 1
            int r0 = r0 << r1
            int r7 = r0 + 1
            int r1 = r14 + 1
            r0 = r12[r14]
            r11[r7] = r0
            r14 = r1
        L_0x0114:
            r17 = 1
        L_0x0116:
            int r6 = r6 << r17
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0148
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0120:
            r0 = r26
            long r0 = r0.objectFieldOffset(r1)
            int r7 = (int) r0
            r19 = r7
            int r6 = r6 + 1
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x013f
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x0133:
            r0 = r26
            long r0 = r0.objectFieldOffset(r1)
            int r6 = (int) r0
            r0 = r18
            r1 = 0
            goto L_0x0236
        L_0x013f:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0G(r15, r1)
            r12[r6] = r1
            goto L_0x0133
        L_0x0148:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0G(r15, r1)
            r12[r6] = r1
            goto L_0x0120
        L_0x0151:
            int r0 = r21 / 3
            r17 = 1
            int r0 = r0 << r17
            int r7 = r0 + 1
            int r1 = r14 + 1
            r0 = r12[r14]
            r11[r7] = r0
            r14 = r1
            goto L_0x0116
        L_0x0161:
            int r20 = r14 + 1
            r1 = r12[r14]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r6 = A0G(r15, r1)
            r1 = 9
            if (r8 == r1) goto L_0x01ee
            r1 = 17
            if (r8 == r1) goto L_0x01ee
            r1 = 27
            if (r8 == r1) goto L_0x01dc
            r1 = 49
            if (r8 == r1) goto L_0x01dc
            r1 = 12
            if (r8 == r1) goto L_0x01da
            r1 = 30
            if (r8 == r1) goto L_0x01da
            r1 = 44
            if (r8 == r1) goto L_0x01da
            r1 = 50
            if (r8 != r1) goto L_0x01a7
            int r14 = r24 + 1
            r16[r24] = r21
            int r1 = r21 / 3
            int r7 = r1 << 1
            int r17 = r20 + 1
            r1 = r12[r20]
            r11[r7] = r1
            r1 = r9 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x01e9
            int r7 = r7 + 1
            int r20 = r17 + 1
            r1 = r12[r17]
            r11[r7] = r1
            r24 = r14
        L_0x01a7:
            r1 = r26
            long r6 = r1.objectFieldOffset(r6)
            int r1 = (int) r6
            r19 = r1
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            r1 = 4096(0x1000, float:5.74E-42)
            if (r6 != r1) goto L_0x0222
            r1 = 17
            if (r8 > r1) goto L_0x0222
            int r14 = r0 + 1
            char r7 = r13.charAt(r0)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ff
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
        L_0x01c9:
            int r17 = r14 + 1
            char r6 = r13.charAt(r14)
            if (r6 < r1) goto L_0x01fb
            int r7 = X.AnonymousClass6C9.A09(r6, r0, r7)
            int r0 = r0 + 13
            r14 = r17
            goto L_0x01c9
        L_0x01da:
            if (r31 != 0) goto L_0x01a7
        L_0x01dc:
            int r1 = r21 / 3
            int r1 = r1 << 1
            int r7 = r1 + 1
            int r17 = r20 + 1
            r1 = r12[r20]
            r11[r7] = r1
            goto L_0x01eb
        L_0x01e9:
            r24 = r14
        L_0x01eb:
            r20 = r17
            goto L_0x01a7
        L_0x01ee:
            int r1 = r21 / 3
            int r1 = r1 << 1
            int r7 = r1 + 1
            java.lang.Class r1 = r6.getType()
            r11[r7] = r1
            goto L_0x01a7
        L_0x01fb:
            int r6 = r6 << r0
            r7 = r7 | r6
            r14 = r17
        L_0x01ff:
            int r6 = r5 << 1
            int r0 = r7 / 32
            int r6 = r6 + r0
            r1 = r12[r6]
            boolean r0 = r1 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0219
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x020c:
            r0 = r26
            long r17 = r0.objectFieldOffset(r1)
            r0 = r17
            int r6 = (int) r0
            int r1 = r7 % 32
            r0 = r14
            goto L_0x0234
        L_0x0219:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = A0G(r15, r1)
            r12[r6] = r1
            goto L_0x020c
        L_0x0222:
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r7 = 18
            if (r8 < r7) goto L_0x0234
            r7 = 49
            if (r8 > r7) goto L_0x0234
            int r7 = r23 + 1
            r16[r23] = r19
            r23 = r7
        L_0x0234:
            r14 = r20
        L_0x0236:
            int r18 = r21 + 1
            r25[r21] = r10
            int r17 = r18 + 1
            r7 = r9 & 512(0x200, float:7.175E-43)
            r10 = 0
            if (r7 == 0) goto L_0x0243
            r10 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0243:
            r7 = r9 & 256(0x100, float:3.59E-43)
            r9 = 0
            if (r7 == 0) goto L_0x024a
            r9 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x024a:
            r9 = r9 | r10
            int r7 = r8 << 20
            r9 = r9 | r7
            r9 = r9 | r19
            r25[r18] = r9
            int r21 = r17 + 1
            int r1 = r1 << 20
            r1 = r1 | r6
            r25[r17] = r1
            goto L_0x007c
        L_0x025b:
            int r3 = r0 + 1
            char r5 = r13.charAt(r0)
            if (r5 < r12) goto L_0x027a
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0267:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x0277
            int r5 = X.AnonymousClass6C9.A09(r0, r2, r5)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0267
        L_0x0277:
            int r0 = r0 << r2
            r5 = r5 | r0
            r3 = r1
        L_0x027a:
            int r0 = r3 + 1
            char r9 = r13.charAt(r3)
            if (r9 < r12) goto L_0x0299
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0286:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0296
            int r9 = X.AnonymousClass6C9.A09(r0, r2, r9)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0286
        L_0x0296:
            int r0 = r0 << r2
            r9 = r9 | r0
            r0 = r1
        L_0x0299:
            int r3 = r0 + 1
            char r4 = r13.charAt(r0)
            if (r4 < r12) goto L_0x02b8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02a5:
            int r1 = r3 + 1
            char r0 = r13.charAt(r3)
            if (r0 < r12) goto L_0x02b5
            int r4 = X.AnonymousClass6C9.A09(r0, r2, r4)
            int r2 = r2 + 13
            r3 = r1
            goto L_0x02a5
        L_0x02b5:
            int r0 = r0 << r2
            r4 = r4 | r0
            r3 = r1
        L_0x02b8:
            int r0 = r3 + 1
            char r3 = r13.charAt(r3)
            if (r3 < r12) goto L_0x02d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02c4:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x02d4
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x02c4
        L_0x02d4:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x02d7:
            int r6 = r0 + 1
            char r7 = r13.charAt(r0)
            if (r7 < r12) goto L_0x02f6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x02e3:
            int r1 = r6 + 1
            char r0 = r13.charAt(r6)
            if (r0 < r12) goto L_0x02f3
            int r7 = X.AnonymousClass6C9.A09(r0, r2, r7)
            int r2 = r2 + 13
            r6 = r1
            goto L_0x02e3
        L_0x02f3:
            int r0 = r0 << r2
            r7 = r7 | r0
            r6 = r1
        L_0x02f6:
            int r0 = r6 + 1
            char r6 = r13.charAt(r6)
            if (r6 < r12) goto L_0x0315
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0302:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0312
            int r6 = X.AnonymousClass6C9.A09(r0, r2, r6)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0302
        L_0x0312:
            int r0 = r0 << r2
            r6 = r6 | r0
            r0 = r1
        L_0x0315:
            int r10 = r0 + 1
            char r11 = r13.charAt(r0)
            if (r11 < r12) goto L_0x0334
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0321:
            int r1 = r10 + 1
            char r0 = r13.charAt(r10)
            if (r0 < r12) goto L_0x0331
            int r11 = X.AnonymousClass6C9.A09(r0, r2, r11)
            int r2 = r2 + 13
            r10 = r1
            goto L_0x0321
        L_0x0331:
            int r0 = r0 << r2
            r11 = r11 | r0
            r10 = r1
        L_0x0334:
            int r0 = r10 + 1
            char r2 = r13.charAt(r10)
            if (r2 < r12) goto L_0x0353
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0340:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r12) goto L_0x0350
            int r2 = X.AnonymousClass6C9.A09(r0, r10, r2)
            int r10 = r10 + 13
            r0 = r1
            goto L_0x0340
        L_0x0350:
            int r0 = r0 << r10
            r2 = r2 | r0
            r0 = r1
        L_0x0353:
            int r1 = r2 + r6
            int r1 = r1 + r11
            int[] r1 = new int[r1]
            r16 = r1
            int r14 = r5 << 1
            int r14 = r14 + r9
            goto L_0x005c
        L_0x035f:
            X.8Ay r17 = new X.8Ay
            r18 = r32
            r19 = r33
            r20 = r34
            r22 = r36
            r23 = r37
            r21 = r28
            r24 = r25
            r25 = r16
            r26 = r11
            r27 = r4
            r28 = r3
            r29 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r17
        L_0x037d:
            java.lang.String r0 = "zza"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.A0D(X.72a, X.7j3, X.8m3, X.8hp, X.8hq, X.72c):X.8Ay");
    }

    public static C160657o4 A0E(Object obj) {
        C128766Xj r2 = (C128766Xj) obj;
        C160657o4 r1 = r2.zzb;
        if (r1 != C160657o4.A05) {
            return r1;
        }
        C160657o4 r0 = new C160657o4();
        r2.zzb = r0;
        return r0;
    }

    public static void A0I(C186138uo r1, Object obj, int i) {
        if (obj instanceof String) {
            ((AnonymousClass8B0) r1).A00.A08(i, (String) obj);
            return;
        }
        ((AnonymousClass8B0) r1).A00.A0B((C172538Lp) obj, i);
    }

    public static void A0J(Object obj, int i, int i2) {
        C128856Xs r2 = ((AnonymousClass8B0) obj).A00;
        r2.A05(i2 << 3);
        r2.A05((i >> 31) ^ (i << 1));
    }

    public static void A0K(Object obj, int i, int i2) {
        C128856Xs r1 = ((AnonymousClass8B0) obj).A00;
        r1.A05(i << 3);
        r1.A04((byte) i2);
    }

    public final int A0L(int i) {
        if (i >= this.A00 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A0B;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0296, code lost:
        if ((r22 & r16) == 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0298, code lost:
        r0 = X.C155597fA.A00(r11.getObject(r10, r7), r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a2, code lost:
        r11.putObject(r10, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a5, code lost:
        r22 = r22 | r16;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b3, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0127, code lost:
        r5 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0135, code lost:
        r5 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01aa, code lost:
        r11.putInt(r10, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bb, code lost:
        r11.putLong(r10, r7, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0M(X.C156607gu r40, java.lang.Object r41, byte[] r42, int r43, int r44, int r45) {
        /*
            r39 = this;
            r5 = r43
            sun.misc.Unsafe r11 = A0E
            r1 = -1
            r9 = 0
            r12 = 0
            r22 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            r6 = r39
            r29 = r44
            r10 = r41
            r23 = r45
            r0 = r29
            if (r5 >= r0) goto L_0x0091
            int r2 = r5 + 1
            r3 = r42
            byte r12 = r42[r5]
            r4 = r40
            if (r12 >= 0) goto L_0x0028
            int r2 = A09(r4, r3, r12, r2)
            int r12 = r4.A00
        L_0x0028:
            int r15 = r12 >>> 3
            r5 = r12 & 7
            r0 = 3
            if (r15 <= r1) goto L_0x02c3
            int r9 = r9 / r0
            int r0 = r6.A00
            if (r15 < r0) goto L_0x02c0
            int r0 = r6.A01
            if (r15 > r0) goto L_0x02c0
            int[] r14 = r6.A0B
            int r0 = r14.length
            int r0 = r0 / 3
            int r8 = r0 + -1
        L_0x003f:
            if (r9 > r8) goto L_0x02c0
            int r0 = r8 + r9
            int r7 = r0 >>> 1
            int r1 = r7 * 3
            r0 = r14[r1]
            if (r15 != r0) goto L_0x02b6
            r9 = r1
        L_0x004c:
            r20 = 0
            r0 = -1
            if (r9 == r0) goto L_0x02c0
            int[] r1 = r6.A0B
            int r0 = r9 + 1
            r19 = r1[r0]
            int r14 = X.AnonymousClass6C8.A07(r19)
            long r7 = X.AnonymousClass6C9.A0K(r19)
            r0 = 17
            if (r14 > r0) goto L_0x01cc
            int r0 = r9 + 2
            r18 = r1[r0]
            int r0 = r18 >>> 20
            r17 = 1
            int r16 = r17 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r18 = r18 & r1
            r0 = r18
            if (r0 == r13) goto L_0x01c8
            if (r13 == r1) goto L_0x007e
            long r0 = (long) r13
            r13 = r22
            r11.putInt(r10, r0, r13)
        L_0x007e:
            r0 = r18
            long r0 = (long) r0
            int r22 = r11.getInt(r10, r0)
        L_0x0085:
            switch(r14) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00f1;
                case 2: goto L_0x0102;
                case 3: goto L_0x0102;
                case 4: goto L_0x010c;
                case 5: goto L_0x0116;
                case 6: goto L_0x012b;
                case 7: goto L_0x0139;
                case 8: goto L_0x014e;
                case 9: goto L_0x0163;
                case 10: goto L_0x02ac;
                case 11: goto L_0x010c;
                case 12: goto L_0x0172;
                case 13: goto L_0x012b;
                case 14: goto L_0x0116;
                case 15: goto L_0x019e;
                case 16: goto L_0x01af;
                case 17: goto L_0x027d;
                default: goto L_0x0088;
            }
        L_0x0088:
            r13 = r18
        L_0x008a:
            r0 = r23
            if (r12 != r0) goto L_0x00c7
            if (r45 == 0) goto L_0x00c7
            r5 = r2
        L_0x0091:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r0) goto L_0x009c
            long r0 = (long) r13
            r2 = r22
            r11.putInt(r10, r0, r2)
        L_0x009c:
            int r3 = r6.A02
        L_0x009e:
            int r0 = r6.A03
            if (r3 >= r0) goto L_0x02c9
            int[] r0 = r6.A0C
            r2 = r0[r3]
            int[] r0 = r6.A0B
            long r0 = X.AnonymousClass6C8.A0T(r0, r2)
            java.lang.Object r0 = X.C162367ro.A03(r10, r0)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object[] r1 = r6.A0D
            int r0 = r2 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            if (r0 == 0) goto L_0x00c4
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x009e
        L_0x00c7:
            X.7o4 r17 = A0E(r10)
            r16 = r4
            r18 = r3
            r19 = r12
            r20 = r2
            r21 = r29
            int r5 = A03(r16, r17, r18, r19, r20, r21)
            goto L_0x02a9
        L_0x00db:
            r0 = r17
            if (r5 != r0) goto L_0x0088
            long r0 = X.AnonymousClass6C7.A0N(r3, r2)
            double r27 = java.lang.Double.longBitsToDouble(r0)
            X.7bl r23 = X.C162367ro.A01
            r24 = r10
            r25 = r7
            r23.A07(r24, r25, r27)
            goto L_0x0127
        L_0x00f1:
            r0 = 5
            if (r5 != r0) goto L_0x0088
            int r0 = X.AnonymousClass6C7.A0B(r3, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.7bl r0 = X.C162367ro.A01
            r0.A08(r10, r7, r1)
            goto L_0x0135
        L_0x0102:
            if (r5 != 0) goto L_0x0088
            int r5 = A05(r4, r3, r2)
            long r0 = r4.A01
            goto L_0x01bb
        L_0x010c:
            if (r5 != 0) goto L_0x0088
            int r5 = A04(r4, r3, r2)
            int r2 = r4.A00
            goto L_0x01aa
        L_0x0116:
            r0 = r17
            if (r5 != r0) goto L_0x0088
            long r27 = X.AnonymousClass6C7.A0N(r3, r2)
            r24 = r10
            r23 = r11
            r25 = r7
            r23.putLong(r24, r25, r27)
        L_0x0127:
            int r5 = r2 + 8
            goto L_0x02a5
        L_0x012b:
            r0 = 5
            if (r5 != r0) goto L_0x0088
            int r0 = X.AnonymousClass6C7.A0B(r3, r2)
            r11.putInt(r10, r7, r0)
        L_0x0135:
            int r5 = r2 + 4
            goto L_0x02a5
        L_0x0139:
            if (r5 != 0) goto L_0x0088
            int r5 = A05(r4, r3, r2)
            long r0 = r4.A01
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r2)
            X.7bl r0 = X.C162367ro.A01
            r0.A0B(r10, r7, r1)
            goto L_0x02a5
        L_0x014e:
            r0 = 2
            if (r5 != r0) goto L_0x0088
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r19
            if (r0 != 0) goto L_0x015d
            int r5 = A06(r4, r3, r2)
            goto L_0x02b3
        L_0x015d:
            int r5 = A07(r4, r3, r2)
            goto L_0x02b3
        L_0x0163:
            r0 = 2
            if (r5 != r0) goto L_0x0088
            X.8v1 r1 = r6.A0P(r9)
            r0 = r29
            int r5 = A01(r4, r1, r3, r2, r0)
            goto L_0x0294
        L_0x0172:
            if (r5 != 0) goto L_0x0088
            int r5 = A04(r4, r3, r2)
            int r2 = r4.A00
            java.lang.Object[] r1 = r6.A0D
            int r0 = r9 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r0 = r1[r0]
            X.8m2 r0 = (X.C181038m2) r0
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r0.BtM(r2)
            if (r0 != 0) goto L_0x01aa
            X.7o4 r1 = A0E(r10)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r1.A01(r12, r0)
            r1 = r15
            r13 = r18
            goto L_0x000c
        L_0x019e:
            if (r5 != 0) goto L_0x0088
            int r5 = A04(r4, r3, r2)
            int r0 = r4.A00
            int r2 = X.AnonymousClass6C8.A08(r0)
        L_0x01aa:
            r11.putInt(r10, r7, r2)
            goto L_0x02a5
        L_0x01af:
            if (r5 != 0) goto L_0x0088
            int r5 = A05(r4, r3, r2)
            long r0 = r4.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
        L_0x01bb:
            r24 = r10
            r23 = r11
            r25 = r7
            r27 = r0
            r23.putLong(r24, r25, r27)
            goto L_0x02a5
        L_0x01c8:
            r18 = r13
            goto L_0x0085
        L_0x01cc:
            r0 = 27
            if (r14 != r0) goto L_0x0207
            r0 = 2
            if (r5 != r0) goto L_0x008a
            java.lang.Object r1 = r11.getObject(r10, r7)
            X.8yZ r1 = (X.C188238yZ) r1
            r0 = r1
            X.8T4 r0 = (X.AnonymousClass8T4) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01eb
            int r0 = X.AnonymousClass6C9.A0E(r1)
            X.8yZ r1 = r1.BtF(r0)
            r11.putObject(r10, r7, r1)
        L_0x01eb:
            X.8v1 r6 = r6.A0P(r9)
        L_0x01ef:
            r0 = r29
            int r5 = A01(r4, r6, r3, r2, r0)
            java.lang.Object r0 = r4.A02
            r1.add(r0)
            r0 = r29
            if (r5 >= r0) goto L_0x02a9
            int r2 = A04(r4, r3, r5)
            int r0 = r4.A00
            if (r12 != r0) goto L_0x02a9
            goto L_0x01ef
        L_0x0207:
            r0 = 49
            if (r14 > r0) goto L_0x022f
            r0 = r19
            long r0 = (long) r0
            r25 = r4
            r26 = r10
            r27 = r3
            r31 = r15
            r32 = r5
            r33 = r9
            r34 = r14
            r35 = r0
            r37 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            int r5 = r24.A0O(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
        L_0x022a:
            if (r5 != r2) goto L_0x02a9
            r2 = r5
            goto L_0x008a
        L_0x022f:
            r0 = 50
            if (r14 != r0) goto L_0x0260
            r0 = 2
            if (r5 != r0) goto L_0x008a
            java.lang.Object r4 = r11.getObject(r10, r7)
            X.8m3 r3 = r6.A06
            r0 = r4
            X.8Tp r0 = (X.C174268Tp) r0
            boolean r0 = r0.zza
            if (r0 != 0) goto L_0x0256
            X.8Tp r2 = X.C174268Tp.A00
            boolean r1 = r2.isEmpty()
            X.8Tp r0 = new X.8Tp
            if (r1 == 0) goto L_0x025c
            r0.<init>()
        L_0x0250:
            r3.BtI(r0, r4)
            r11.putObject(r10, r7, r0)
        L_0x0256:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x025c:
            r0.<init>(r2)
            goto L_0x0250
        L_0x0260:
            r25 = r4
            r26 = r10
            r27 = r3
            r31 = r15
            r32 = r5
            r33 = r19
            r34 = r14
            r35 = r9
            r36 = r7
            r24 = r6
            r28 = r2
            r30 = r12
            int r5 = r24.A0N(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x022a
        L_0x027d:
            r0 = 3
            if (r5 != r0) goto L_0x0088
            int r0 = r15 << 3
            r28 = r0 | 4
            X.8v1 r24 = r6.A0P(r9)
            r23 = r4
            r25 = r3
            r26 = r2
            r27 = r29
            int r5 = A02(r23, r24, r25, r26, r27, r28)
        L_0x0294:
            r0 = r22 & r16
            if (r0 == 0) goto L_0x02b3
            java.lang.Object r1 = r11.getObject(r10, r7)
            java.lang.Object r0 = r4.A02
            java.lang.Object r0 = X.C155597fA.A00(r1, r0)
        L_0x02a2:
            r11.putObject(r10, r7, r0)
        L_0x02a5:
            r22 = r22 | r16
            r13 = r18
        L_0x02a9:
            r1 = r15
            goto L_0x000c
        L_0x02ac:
            r0 = 2
            if (r5 != r0) goto L_0x0088
            int r5 = A08(r4, r3, r2)
        L_0x02b3:
            java.lang.Object r0 = r4.A02
            goto L_0x02a2
        L_0x02b6:
            if (r15 >= r0) goto L_0x02bc
            int r8 = r7 + -1
            goto L_0x003f
        L_0x02bc:
            int r9 = r7 + 1
            goto L_0x003f
        L_0x02c0:
            r9 = 0
            goto L_0x008a
        L_0x02c3:
            int r9 = r6.A0L(r15)
            goto L_0x004c
        L_0x02c9:
            r0 = r29
            if (r45 != 0) goto L_0x02d0
            if (r5 != r0) goto L_0x02d7
            return r5
        L_0x02d0:
            if (r5 > r0) goto L_0x02d7
            r0 = r23
            if (r12 != r0) goto L_0x02d7
            return r5
        L_0x02d7:
            java.lang.String r1 = "Failed to parse the message."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.A0M(X.7gu, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.putObject(r8, r0, r4);
        r7 = r25 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        r6.putObject(r8, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        r6.putInt(r8, r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017f, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0N(X.C156607gu r22, java.lang.Object r23, byte[] r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33) {
        /*
            r21 = this;
            r7 = r25
            sun.misc.Unsafe r6 = A0E
            r9 = r21
            int[] r0 = r9.A0B
            r12 = r32
            long r2 = X.AnonymousClass6C7.A0O(r0, r12)
            r5 = 5
            r4 = 2
            r11 = r22
            r10 = r24
            r17 = r26
            r15 = r27
            r14 = r28
            r13 = r29
            r0 = r33
            r8 = r23
            switch(r31) {
                case 51: goto L_0x0024;
                case 52: goto L_0x0034;
                case 53: goto L_0x0043;
                case 54: goto L_0x0043;
                case 55: goto L_0x0051;
                case 56: goto L_0x005f;
                case 57: goto L_0x0071;
                case 58: goto L_0x0082;
                case 59: goto L_0x0098;
                case 60: goto L_0x00cd;
                case 61: goto L_0x00f3;
                case 62: goto L_0x0051;
                case 63: goto L_0x00ff;
                case 64: goto L_0x0071;
                case 65: goto L_0x005f;
                case 66: goto L_0x012f;
                case 67: goto L_0x0140;
                case 68: goto L_0x0151;
                default: goto L_0x0023;
            }
        L_0x0023:
            return r7
        L_0x0024:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.AnonymousClass6C7.A0N(r10, r7)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x006a
        L_0x0034:
            if (r13 != r5) goto L_0x0023
            int r4 = X.AnonymousClass6C7.A0B(r10, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x007b
        L_0x0043:
            if (r29 != 0) goto L_0x0023
            int r7 = A05(r11, r10, r7)
            long r4 = r11.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0179
        L_0x0051:
            if (r29 != 0) goto L_0x0023
            int r7 = A04(r11, r10, r7)
            int r4 = r11.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0179
        L_0x005f:
            r4 = 1
            if (r13 != r4) goto L_0x0023
            long r4 = X.AnonymousClass6C7.A0N(r10, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x006a:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 8
            goto L_0x017c
        L_0x0071:
            if (r13 != r5) goto L_0x0023
            int r4 = X.AnonymousClass6C7.A0B(r10, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x007b:
            r6.putObject(r8, r0, r4)
            int r7 = r25 + 4
            goto L_0x017c
        L_0x0082:
            if (r29 != 0) goto L_0x0023
            int r7 = A05(r11, r10, r7)
            long r4 = r11.A01
            r10 = 0
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1S(r9)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0179
        L_0x0098:
            if (r13 != r4) goto L_0x0023
            int r7 = A04(r11, r10, r7)
            int r9 = r11.A00
            if (r9 != 0) goto L_0x00a9
            java.lang.String r4 = ""
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00a9:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r30 & r4
            if (r30 == 0) goto L_0x00c1
            int r5 = r7 + r9
            X.7XU r4 = X.C154937dz.A00
            int r4 = r4.A01(r10, r7, r5)
            if (r4 == 0) goto L_0x00c1
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        L_0x00c1:
            java.nio.charset.Charset r4 = X.C155597fA.A02
            java.lang.String r4 = X.AnonymousClass6CA.A0W(r4, r10, r7, r9)
            r6.putObject(r8, r0, r4)
            int r7 = r7 + r9
            goto L_0x017c
        L_0x00cd:
            if (r13 != r4) goto L_0x0023
            X.8v1 r5 = r9.A0P(r12)
            r4 = r17
            int r7 = A01(r11, r5, r10, r7, r4)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x00f0
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r4 = r11.A02
            java.lang.Object r4 = X.C155597fA.A00(r5, r4)
        L_0x00eb:
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00f0:
            java.lang.Object r4 = r11.A02
            goto L_0x00eb
        L_0x00f3:
            if (r13 != r4) goto L_0x0023
            int r7 = A08(r11, r10, r7)
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x00ff:
            if (r29 != 0) goto L_0x0023
            int r7 = A04(r11, r10, r7)
            int r5 = r11.A00
            java.lang.Object[] r9 = r9.A0D
            int r4 = r32 / 3
            int r4 = r4 << 1
            int r4 = r4 + 1
            r4 = r9[r4]
            X.8m2 r4 = (X.C181038m2) r4
            if (r4 == 0) goto L_0x0127
            boolean r4 = r4.BtM(r5)
            if (r4 != 0) goto L_0x0127
            X.7o4 r1 = A0E(r8)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r5)
            r1.A01(r15, r0)
            return r7
        L_0x0127:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        L_0x012f:
            if (r29 != 0) goto L_0x0023
            int r7 = A04(r11, r10, r7)
            int r4 = r11.A00
            int r4 = X.AnonymousClass6C8.A08(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0179
        L_0x0140:
            if (r29 != 0) goto L_0x0023
            int r7 = A05(r11, r10, r7)
            long r4 = r11.A01
            long r4 = X.AnonymousClass6C7.A0G(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0179
        L_0x0151:
            r4 = 3
            if (r13 != r4) goto L_0x0023
            r4 = r27 & -8
            r20 = r4 | 4
            X.8v1 r16 = r9.A0P(r12)
            r19 = r17
            r17 = r10
            r18 = r7
            r15 = r11
            int r7 = A02(r15, r16, r17, r18, r19, r20)
            int r4 = r6.getInt(r8, r2)
            if (r4 != r14) goto L_0x0180
            java.lang.Object r5 = r6.getObject(r8, r0)
            if (r5 == 0) goto L_0x0180
            java.lang.Object r4 = r11.A02
            java.lang.Object r4 = X.C155597fA.A00(r5, r4)
        L_0x0179:
            r6.putObject(r8, r0, r4)
        L_0x017c:
            r6.putInt(r8, r2, r14)
            return r7
        L_0x0180:
            java.lang.Object r4 = r11.A02
            r6.putObject(r8, r0, r4)
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.A0N(X.7gu, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0279, code lost:
        throw new X.C140576ty("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0370, code lost:
        if (r6 != r3) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0372, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x037a, code lost:
        throw new X.C140576ty("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03e1, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03e2, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0O(X.C156607gu r20, java.lang.Object r21, byte[] r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30, long r32) {
        /*
            r19 = this;
            r7 = r21
            r5 = r23
            sun.misc.Unsafe r8 = A0E
            r0 = r32
            java.lang.Object r2 = r8.getObject(r7, r0)
            X.8yZ r2 = (X.C188238yZ) r2
            r3 = r2
            X.8T4 r3 = (X.AnonymousClass8T4) r3
            boolean r3 = r3.A00
            r6 = 1
            if (r3 != 0) goto L_0x0027
            int r4 = r2.size()
            int r3 = r4 << r6
            if (r4 != 0) goto L_0x0020
            r3 = 10
        L_0x0020:
            X.8yZ r2 = r2.BtF(r3)
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
                case 18: goto L_0x0355;
                case 19: goto L_0x031e;
                case 20: goto L_0x02eb;
                case 21: goto L_0x02eb;
                case 22: goto L_0x0397;
                case 23: goto L_0x003c;
                case 24: goto L_0x02bc;
                case 25: goto L_0x027a;
                case 26: goto L_0x0211;
                case 27: goto L_0x01f3;
                case 28: goto L_0x01b5;
                case 29: goto L_0x0397;
                case 30: goto L_0x006b;
                case 31: goto L_0x02bc;
                case 32: goto L_0x003c;
                case 33: goto L_0x017a;
                case 34: goto L_0x013f;
                case 35: goto L_0x0355;
                case 36: goto L_0x031e;
                case 37: goto L_0x02eb;
                case 38: goto L_0x02eb;
                case 39: goto L_0x0397;
                case 40: goto L_0x003c;
                case 41: goto L_0x02bc;
                case 42: goto L_0x027a;
                case 43: goto L_0x0397;
                case 44: goto L_0x006b;
                case 45: goto L_0x02bc;
                case 46: goto L_0x003c;
                case 47: goto L_0x017a;
                case 48: goto L_0x013f;
                case 49: goto L_0x011c;
                default: goto L_0x003c;
            }
        L_0x003c:
            if (r9 != r1) goto L_0x0053
            X.6Xp r2 = (X.C128826Xp) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x0047:
            if (r6 >= r3) goto L_0x0370
            long r0 = X.AnonymousClass6C7.A0N(r15, r6)
            r2.A03(r0)
            int r6 = r6 + 8
            goto L_0x0047
        L_0x0053:
            if (r9 != r6) goto L_0x03e2
            X.6Xp r2 = (X.C128826Xp) r2
        L_0x0057:
            long r0 = X.AnonymousClass6C7.A0N(r15, r5)
            r2.A03(r0)
            int r6 = r5 + 8
            if (r6 >= r4) goto L_0x03e1
            int r5 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x0057
        L_0x006b:
            if (r9 != r1) goto L_0x008d
            r4 = r2
            X.6Xo r4 = (X.C128816Xo) r4
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x0077:
            if (r6 >= r3) goto L_0x0083
            int r6 = A04(r13, r15, r6)
            int r1 = r13.A00
            r4.A02(r1)
            goto L_0x0077
        L_0x0083:
            if (r6 == r3) goto L_0x00a6
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        L_0x008d:
            if (r27 != 0) goto L_0x03e2
            r8 = r2
            X.6Xo r8 = (X.C128816Xo) r8
        L_0x0092:
            int r6 = A04(r13, r15, r5)
            int r1 = r13.A00
            r8.A02(r1)
            if (r6 >= r4) goto L_0x00a6
            int r5 = A04(r13, r15, r6)
            int r1 = r13.A00
            if (r3 != r1) goto L_0x00a6
            goto L_0x0092
        L_0x00a6:
            X.6Xj r7 = (X.C128766Xj) r7
            X.7o4 r5 = r7.zzb
            X.7o4 r1 = X.C160657o4.A05
            if (r5 != r1) goto L_0x00af
            r5 = 0
        L_0x00af:
            java.lang.Object[] r1 = r0.A0D
            int r0 = r28 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            r8 = r1[r0]
            X.8m2 r8 = (X.C181038m2) r8
            if (r8 == 0) goto L_0x03dd
            boolean r0 = r2 instanceof java.util.RandomAccess
            if (r0 == 0) goto L_0x00f3
            int r10 = r2.size()
            r9 = 0
            r4 = 0
        L_0x00c7:
            if (r9 >= r10) goto L_0x03d4
            int r1 = X.AnonymousClass000.A09(r2, r9)
            boolean r0 = r8.BtM(r1)
            if (r0 == 0) goto L_0x00e1
            if (r9 == r4) goto L_0x00dc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.set(r4, r0)
        L_0x00dc:
            int r4 = r4 + 1
        L_0x00de:
            int r9 = r9 + 1
            goto L_0x00c7
        L_0x00e1:
            if (r5 != 0) goto L_0x00e8
            X.7o4 r5 = new X.7o4
            r5.<init>()
        L_0x00e8:
            long r0 = (long) r1
            int r3 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01(r3, r0)
            goto L_0x00de
        L_0x00f3:
            java.util.Iterator r4 = r2.iterator()
        L_0x00f7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03dd
            int r1 = X.C18280x3.A05(r4)
            boolean r0 = r8.BtM(r1)
            if (r0 != 0) goto L_0x00f7
            if (r5 != 0) goto L_0x010e
            X.7o4 r5 = new X.7o4
            r5.<init>()
        L_0x010e:
            long r2 = (long) r1
            int r1 = r26 << 3
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A01(r1, r0)
            r4.remove()
            goto L_0x00f7
        L_0x011c:
            r1 = 3
            if (r9 != r1) goto L_0x03e2
            X.8v1 r14 = r0.A0P(r10)
            r0 = r25 & -8
            r18 = r0 | 4
            r16 = r5
        L_0x0129:
            r17 = r4
            int r5 = A02(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r13.A02
            r2.add(r0)
            if (r5 >= r4) goto L_0x03e2
            int r16 = A04(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            goto L_0x0129
        L_0x013f:
            if (r9 != r1) goto L_0x015a
            X.6Xp r2 = (X.C128826Xp) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x014a:
            if (r6 >= r3) goto L_0x0370
            int r6 = A05(r13, r15, r6)
            long r0 = r13.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r2.A03(r0)
            goto L_0x014a
        L_0x015a:
            if (r27 != 0) goto L_0x03e2
            X.6Xp r2 = (X.C128826Xp) r2
            int r6 = A05(r13, r15, r5)
        L_0x0162:
            long r0 = r13.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r2.A03(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A05(r13, r15, r1)
            goto L_0x0162
        L_0x017a:
            if (r9 != r1) goto L_0x0195
            X.6Xo r2 = (X.C128816Xo) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x0185:
            if (r6 >= r3) goto L_0x0370
            int r6 = A04(r13, r15, r6)
            int r0 = r13.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r2.A02(r0)
            goto L_0x0185
        L_0x0195:
            if (r27 != 0) goto L_0x03e2
            X.6Xo r2 = (X.C128816Xo) r2
            int r6 = A04(r13, r15, r5)
        L_0x019d:
            int r0 = r13.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r2.A02(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A04(r13, r15, r1)
            goto L_0x019d
        L_0x01b5:
            if (r9 != r1) goto L_0x03e2
            int r6 = A04(r13, r15, r5)
            int r7 = r13.A00
            if (r7 < 0) goto L_0x0272
            int r5 = r15.length
        L_0x01c0:
            int r0 = r5 - r6
            if (r7 > r0) goto L_0x0373
            if (r7 != 0) goto L_0x01de
            X.8Lp r0 = X.C172538Lp.A00
            r2.add(r0)
        L_0x01cb:
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A04(r13, r15, r1)
            int r7 = r13.A00
            if (r7 < 0) goto L_0x0272
            goto L_0x01c0
        L_0x01de:
            int r0 = r6 + r7
            X.C172538Lp.A00(r6, r0, r5)
            X.8m1 r0 = X.C172538Lp.A01
            byte[] r1 = r0.BtP(r15, r6, r7)
            X.6Xu r0 = new X.6Xu
            r0.<init>(r1)
            r2.add(r0)
            int r6 = r6 + r7
            goto L_0x01cb
        L_0x01f3:
            if (r9 != r1) goto L_0x03e2
            X.8v1 r7 = r0.A0P(r10)
            int r6 = A01(r13, r7, r15, r5, r4)
        L_0x01fd:
            java.lang.Object r0 = r13.A02
            r2.add(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A01(r13, r7, r15, r1, r4)
            goto L_0x01fd
        L_0x0211:
            if (r9 != r1) goto L_0x03e2
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r30 = r30 & r0
            java.lang.String r7 = ""
            int r0 = (r30 > r11 ? 1 : (r30 == r11 ? 0 : -1))
            int r5 = A04(r13, r15, r5)
            if (r0 != 0) goto L_0x0241
        L_0x0222:
            int r1 = r13.A00
            if (r1 < 0) goto L_0x0272
            if (r1 != 0) goto L_0x023a
            r2.add(r7)
        L_0x022b:
            if (r5 >= r4) goto L_0x03e2
            int r1 = A04(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = A04(r13, r15, r1)
            goto L_0x0222
        L_0x023a:
            java.nio.charset.Charset r0 = X.C155597fA.A02
            X.AnonymousClass6C9.A1E(r0, r2, r15, r5, r1)
            int r5 = r5 + r1
            goto L_0x022b
        L_0x0241:
            int r6 = r13.A00
            if (r6 < 0) goto L_0x0272
            if (r6 != 0) goto L_0x0259
            r2.add(r7)
        L_0x024a:
            if (r5 >= r4) goto L_0x03e2
            int r1 = A04(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = A04(r13, r15, r1)
            goto L_0x0241
        L_0x0259:
            int r1 = r5 + r6
            X.7XU r0 = X.C154937dz.A00
            int r0 = r0.A01(r15, r5, r1)
            if (r0 != 0) goto L_0x026a
            java.nio.charset.Charset r0 = X.C155597fA.A02
            X.AnonymousClass6C9.A1E(r0, r2, r15, r5, r6)
            r5 = r1
            goto L_0x024a
        L_0x026a:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.6ty r1 = new X.6ty
            r1.<init>(r0)
            throw r1
        L_0x0272:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.6ty r1 = new X.6ty
            r1.<init>(r0)
            throw r1
        L_0x027a:
            if (r9 != r1) goto L_0x029a
            X.6Xl r2 = (X.C128786Xl) r2
            int r6 = A04(r13, r15, r5)
            int r1 = r13.A00
            int r1 = r1 + r6
        L_0x0285:
            if (r6 >= r1) goto L_0x0297
            int r6 = A05(r13, r15, r6)
            long r3 = r13.A01
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r2.A02(r0)
            goto L_0x0285
        L_0x0297:
            if (r6 != r1) goto L_0x0373
            return r6
        L_0x029a:
            if (r27 != 0) goto L_0x03e2
            X.6Xl r2 = (X.C128786Xl) r2
            int r5 = A05(r13, r15, r5)
        L_0x02a2:
            long r0 = r13.A01
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r6)
            r2.A02(r0)
            if (r5 >= r4) goto L_0x03e2
            int r1 = A04(r13, r15, r5)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e2
            int r5 = A05(r13, r15, r1)
            goto L_0x02a2
        L_0x02bc:
            if (r9 != r1) goto L_0x02d3
            X.6Xo r2 = (X.C128816Xo) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x02c7:
            if (r6 >= r3) goto L_0x0370
            int r0 = X.AnonymousClass6C7.A0B(r15, r6)
            r2.A02(r0)
            int r6 = r6 + 4
            goto L_0x02c7
        L_0x02d3:
            if (r9 != r8) goto L_0x03e2
            X.6Xo r2 = (X.C128816Xo) r2
        L_0x02d7:
            int r0 = X.AnonymousClass6C7.A0B(r15, r5)
            r2.A02(r0)
            int r6 = r5 + 4
            if (r6 >= r4) goto L_0x03e1
            int r5 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x02d7
        L_0x02eb:
            if (r9 != r1) goto L_0x0302
            X.6Xp r2 = (X.C128826Xp) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x02f6:
            if (r6 >= r3) goto L_0x0370
            int r6 = A05(r13, r15, r6)
            long r0 = r13.A01
            r2.A03(r0)
            goto L_0x02f6
        L_0x0302:
            if (r27 != 0) goto L_0x03e2
            X.6Xp r2 = (X.C128826Xp) r2
            int r6 = A05(r13, r15, r5)
        L_0x030a:
            long r0 = r13.A01
            r2.A03(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A05(r13, r15, r1)
            goto L_0x030a
        L_0x031e:
            if (r9 != r1) goto L_0x0339
            X.6Xn r2 = (X.C128806Xn) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x0329:
            if (r6 >= r3) goto L_0x0370
            int r0 = X.AnonymousClass6C7.A0B(r15, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A02(r0)
            int r6 = r6 + 4
            goto L_0x0329
        L_0x0339:
            if (r9 != r8) goto L_0x03e2
            X.6Xn r2 = (X.C128806Xn) r2
        L_0x033d:
            int r0 = X.AnonymousClass6C7.A0B(r15, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A02(r0)
            int r6 = r5 + 4
            if (r6 >= r4) goto L_0x03e1
            int r5 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x033d
        L_0x0355:
            if (r9 != r1) goto L_0x037b
            X.6Xm r2 = (X.C128796Xm) r2
            int r6 = A04(r13, r15, r5)
            int r3 = r13.A00
            int r3 = r3 + r6
        L_0x0360:
            if (r6 >= r3) goto L_0x0370
            long r0 = X.AnonymousClass6C7.A0N(r15, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A02(r0)
            int r6 = r6 + 8
            goto L_0x0360
        L_0x0370:
            if (r6 != r3) goto L_0x0373
            return r6
        L_0x0373:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6ty r1 = new X.6ty
            r1.<init>(r0)
            throw r1
        L_0x037b:
            if (r9 != r6) goto L_0x03e2
            X.6Xm r2 = (X.C128796Xm) r2
        L_0x037f:
            long r0 = X.AnonymousClass6C7.A0N(r15, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A02(r0)
            int r6 = r5 + 8
            if (r6 >= r4) goto L_0x03e1
            int r5 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            goto L_0x037f
        L_0x0397:
            if (r9 != r1) goto L_0x03b8
            X.6Xo r2 = (X.C128816Xo) r2
            int r6 = A04(r13, r15, r5)
            int r1 = r13.A00
            int r1 = r1 + r6
        L_0x03a2:
            if (r6 >= r1) goto L_0x03ae
            int r6 = A04(r13, r15, r6)
            int r0 = r13.A00
            r2.A02(r0)
            goto L_0x03a2
        L_0x03ae:
            if (r6 == r1) goto L_0x03e1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        L_0x03b8:
            if (r27 != 0) goto L_0x03e2
            X.6Xo r2 = (X.C128816Xo) r2
            int r6 = A04(r13, r15, r5)
        L_0x03c0:
            int r0 = r13.A00
            r2.A02(r0)
            if (r6 >= r4) goto L_0x03e1
            int r1 = A04(r13, r15, r6)
            int r0 = r13.A00
            if (r3 != r0) goto L_0x03e1
            int r6 = A04(r13, r15, r1)
            goto L_0x03c0
        L_0x03d4:
            if (r4 == r10) goto L_0x03dd
            java.util.List r0 = r2.subList(r4, r10)
            r0.clear()
        L_0x03dd:
            if (r5 == 0) goto L_0x03e1
            r7.zzb = r5
        L_0x03e1:
            return r6
        L_0x03e2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.A0O(X.7gu, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    public final C186268v1 A0P(int i) {
        int i2 = (i / 3) << 1;
        Object[] objArr = this.A0D;
        C186268v1 r0 = (C186268v1) objArr[i2];
        if (r0 != null) {
            return r0;
        }
        C186268v1 A002 = C157377iC.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public final boolean A0Q(int i, Object obj) {
        int[] iArr = this.A0B;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch (AnonymousClass6C8.A07(i3)) {
                case 0:
                    if (C162367ro.A01.A02(obj, j2) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C162367ro.A01.A03(obj, j2) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C162367ro.A01.A05(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C162367ro.A01.A04(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C162367ro.A01.A0C(obj, j2);
                case 8:
                    Object A032 = C162367ro.A03(obj, j2);
                    if (A032 instanceof String) {
                        if (!((String) A032).isEmpty()) {
                            return true;
                        }
                    } else if (!(A032 instanceof C172538Lp)) {
                        throw AnonymousClass6CA.A0N();
                    } else if (!C172538Lp.A00.equals(A032)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C162367ro.A03(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!C172538Lp.A00.equals(C162367ro.A03(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw AnonymousClass6CA.A0N();
            }
        } else {
            if ((C162367ro.A01.A04(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0R(Object obj, int i, int i2) {
        return AnonymousClass000.A1U(C162367ro.A01.A04(obj, AnonymousClass6C7.A0O(this.A0B, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r6 = r6 * 53;
        r0 = X.C162367ro.A03(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C162367ro.A03(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass001.A0K(X.C162367ro.A03(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass6C8.A0B(A0C(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        r0 = X.AnonymousClass6C9.A05(r0 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BtE(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A0B
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0147
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = X.AnonymousClass6C8.A07(r7)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x0134;
                case 1: goto L_0x0127;
                case 2: goto L_0x011a;
                case 3: goto L_0x011a;
                case 4: goto L_0x0111;
                case 5: goto L_0x011a;
                case 6: goto L_0x0111;
                case 7: goto L_0x0104;
                case 8: goto L_0x0070;
                case 9: goto L_0x00f5;
                case 10: goto L_0x005e;
                case 11: goto L_0x0111;
                case 12: goto L_0x0111;
                case 13: goto L_0x0111;
                case 14: goto L_0x011a;
                case 15: goto L_0x0111;
                case 16: goto L_0x011a;
                case 17: goto L_0x00f5;
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
                case 51: goto L_0x00dc;
                case 52: goto L_0x00c7;
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
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001e:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0025:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x002d:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0034:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x003c:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0043:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x004a:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0051:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0058:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x005e:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x0144
        L_0x006a:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0070:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0144
        L_0x007e:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            goto L_0x010c
        L_0x008f:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a3
        L_0x0096:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x009d:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a3:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            goto L_0x0144
        L_0x00af:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00bc
        L_0x00b6:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00bc:
            int r6 = r6 * 53
            long r0 = A0C(r10, r1)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x0144
        L_0x00c7:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            float r0 = X.AnonymousClass001.A05(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0144
        L_0x00dc:
            boolean r0 = r9.A0R(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            double r0 = X.AnonymousClass6C9.A02(r0)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x0144
        L_0x00f5:
            java.lang.Object r0 = X.C162367ro.A03(r10, r1)
            if (r0 == 0) goto L_0x00ff
            int r7 = r0.hashCode()
        L_0x00ff:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0104:
            int r6 = r6 * 53
            X.7bl r0 = X.C162367ro.A01
            boolean r0 = r0.A0C(r10, r1)
        L_0x010c:
            int r0 = X.AnonymousClass6C9.A05(r0)
            goto L_0x0144
        L_0x0111:
            int r6 = r6 * 53
            X.7bl r0 = X.C162367ro.A01
            int r0 = r0.A04(r10, r1)
            goto L_0x0144
        L_0x011a:
            int r6 = r6 * 53
            X.7bl r0 = X.C162367ro.A01
            long r0 = r0.A05(r10, r1)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x0144
        L_0x0127:
            int r6 = r6 * 53
            X.7bl r0 = X.C162367ro.A01
            float r0 = r0.A03(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0144
        L_0x0134:
            int r6 = r6 * 53
            X.7bl r0 = X.C162367ro.A01
            double r0 = r0.A02(r10, r1)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
        L_0x0144:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0147:
            int r1 = r6 * 53
            X.6Xj r10 = (X.C128766Xj) r10
            X.7o4 r0 = r10.zzb
            int r0 = X.AnonymousClass002.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.BtE(java.lang.Object):int");
    }

    public final Object BtG() {
        return ((C128766Xj) this.A07).A09(4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r3 == r1) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        if (r3 == r0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BtO(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int[] r7 = r10.A0B
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L_0x0005:
            r2 = 1
            if (r5 >= r6) goto L_0x00ad
            int r0 = r5 + 1
            r4 = r7[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r3
            long r1 = (long) r0
            int r0 = X.AnonymousClass6C8.A07(r4)
            switch(r0) {
                case 0: goto L_0x008c;
                case 1: goto L_0x00bc;
                case 2: goto L_0x0077;
                case 3: goto L_0x0077;
                case 4: goto L_0x0062;
                case 5: goto L_0x0077;
                case 6: goto L_0x0062;
                case 7: goto L_0x001c;
                case 8: goto L_0x0045;
                case 9: goto L_0x0045;
                case 10: goto L_0x0045;
                case 11: goto L_0x0062;
                case 12: goto L_0x0062;
                case 13: goto L_0x0062;
                case 14: goto L_0x0077;
                case 15: goto L_0x0062;
                case 16: goto L_0x0077;
                case 17: goto L_0x0045;
                case 18: goto L_0x004f;
                case 19: goto L_0x004f;
                case 20: goto L_0x004f;
                case 21: goto L_0x004f;
                case 22: goto L_0x004f;
                case 23: goto L_0x004f;
                case 24: goto L_0x004f;
                case 25: goto L_0x004f;
                case 26: goto L_0x004f;
                case 27: goto L_0x004f;
                case 28: goto L_0x004f;
                case 29: goto L_0x004f;
                case 30: goto L_0x004f;
                case 31: goto L_0x004f;
                case 32: goto L_0x004f;
                case 33: goto L_0x004f;
                case 34: goto L_0x004f;
                case 35: goto L_0x004f;
                case 36: goto L_0x004f;
                case 37: goto L_0x004f;
                case 38: goto L_0x004f;
                case 39: goto L_0x004f;
                case 40: goto L_0x004f;
                case 41: goto L_0x004f;
                case 42: goto L_0x004f;
                case 43: goto L_0x004f;
                case 44: goto L_0x004f;
                case 45: goto L_0x004f;
                case 46: goto L_0x004f;
                case 47: goto L_0x004f;
                case 48: goto L_0x004f;
                case 49: goto L_0x004f;
                case 50: goto L_0x004f;
                case 51: goto L_0x0032;
                case 52: goto L_0x0032;
                case 53: goto L_0x0032;
                case 54: goto L_0x0032;
                case 55: goto L_0x0032;
                case 56: goto L_0x0032;
                case 57: goto L_0x0032;
                case 58: goto L_0x0032;
                case 59: goto L_0x0032;
                case 60: goto L_0x0032;
                case 61: goto L_0x0032;
                case 62: goto L_0x0032;
                case 63: goto L_0x0032;
                case 64: goto L_0x0032;
                case 65: goto L_0x0032;
                case 66: goto L_0x0032;
                case 67: goto L_0x0032;
                case 68: goto L_0x0032;
                default: goto L_0x0019;
            }
        L_0x0019:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001c:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
            X.7bl r0 = X.C162367ro.A01
            boolean r3 = r0.A0C(r11, r1)
            boolean r0 = r0.A0C(r12, r1)
            goto L_0x00d8
        L_0x0032:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r3
            long r3 = (long) r0
            X.7bl r0 = X.C162367ro.A01
            int r8 = r0.A04(r11, r3)
            int r0 = r0.A04(r12, r3)
            if (r8 != r0) goto L_0x00da
            goto L_0x004f
        L_0x0045:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
        L_0x004f:
            java.lang.Object r3 = X.C162367ro.A03(r11, r1)
            java.lang.Object r0 = X.C162367ro.A03(r12, r1)
            if (r3 == r0) goto L_0x0019
            if (r3 == 0) goto L_0x00da
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00da
            goto L_0x0019
        L_0x0062:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
            X.7bl r0 = X.C162367ro.A01
            int r3 = r0.A04(r11, r1)
            int r0 = r0.A04(r12, r1)
            goto L_0x00d8
        L_0x0077:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
            X.7bl r0 = X.C162367ro.A01
            long r3 = r0.A05(r11, r1)
            long r1 = r0.A05(r12, r1)
            goto L_0x00a8
        L_0x008c:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
            X.7bl r0 = X.C162367ro.A01
            double r3 = r0.A02(r11, r1)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r0 = r0.A02(r12, r1)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00a8:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            return r9
        L_0x00ad:
            X.6Xj r11 = (X.C128766Xj) r11
            X.7o4 r1 = r11.zzb
            X.6Xj r12 = (X.C128766Xj) r12
            X.7o4 r0 = r12.zzb
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            return r2
        L_0x00bc:
            boolean r3 = r10.A0Q(r5, r11)
            boolean r0 = r10.A0Q(r5, r12)
            if (r3 != r0) goto L_0x00da
            X.7bl r4 = X.C162367ro.A01
            float r0 = r4.A03(r11, r1)
            int r3 = java.lang.Float.floatToIntBits(r0)
            float r0 = r4.A03(r12, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x00d8:
            if (r3 == r0) goto L_0x0019
        L_0x00da:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.BtO(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x037b, code lost:
        X.AnonymousClass72Z.A0A(r7, A0C(r6, (long) (r1 & 1048575)), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x041e, code lost:
        ((X.AnonymousClass8B0) r7).A00.A07(r2, X.AnonymousClass001.A0K(X.C162367ro.A03(r6, (long) (r1 & 1048575))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x044f, code lost:
        X.AnonymousClass72Z.A09(r7, A0C(r6, (long) (r1 & 1048575)), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04d7, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x059e, code lost:
        X.AnonymousClass72Z.A08(r7, r2, X.AnonymousClass001.A0K(X.C162367ro.A03(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05b1, code lost:
        X.AnonymousClass72Z.A09(r7, A0C(r6, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05c0, code lost:
        ((X.AnonymousClass8B0) r7).A00.A07(r2, X.AnonymousClass001.A0K(X.C162367ro.A03(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0691, code lost:
        X.C162497sE.A0O(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x069f, code lost:
        X.C162497sE.A0L(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06ad, code lost:
        X.C162497sE.A0Q(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06bb, code lost:
        X.C162497sE.A0R(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06c9, code lost:
        X.C162497sE.A0N(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0726, code lost:
        X.C162497sE.A0P(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0734, code lost:
        X.C162497sE.A0K(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0742, code lost:
        X.C162497sE.A0M(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0750, code lost:
        X.C162497sE.A0I(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x075e, code lost:
        X.C162497sE.A0H(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x076c, code lost:
        X.C162497sE.A0G(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x077a, code lost:
        X.C162497sE.A0F(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtS(X.C186138uo r21, java.lang.Object r22) {
        /*
            r20 = this;
            r6 = r22
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = 1
            r10 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r20
            boolean r0 = r5.A0A
            r7 = r21
            if (r0 == 0) goto L_0x04a4
            int[] r4 = r5.A0B
            int r8 = r4.length
            r3 = 0
        L_0x0015:
            if (r3 >= r8) goto L_0x08ab
            int r0 = r3 + 1
            r1 = r4[r0]
            r2 = r4[r3]
            r0 = r1 & r17
            int r0 = r0 >>> 20
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x003a;
                case 2: goto L_0x004d;
                case 3: goto L_0x0060;
                case 4: goto L_0x0073;
                case 5: goto L_0x008b;
                case 6: goto L_0x009e;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00fe;
                case 12: goto L_0x011c;
                case 13: goto L_0x0135;
                case 14: goto L_0x0149;
                case 15: goto L_0x015d;
                case 16: goto L_0x0171;
                case 17: goto L_0x0193;
                case 18: goto L_0x01a6;
                case 19: goto L_0x01b1;
                case 20: goto L_0x01bc;
                case 21: goto L_0x01c7;
                case 22: goto L_0x01d2;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01e8;
                case 25: goto L_0x01f3;
                case 26: goto L_0x01fe;
                case 27: goto L_0x0209;
                case 28: goto L_0x022f;
                case 29: goto L_0x023a;
                case 30: goto L_0x0245;
                case 31: goto L_0x0250;
                case 32: goto L_0x025b;
                case 33: goto L_0x0266;
                case 34: goto L_0x0271;
                case 35: goto L_0x027c;
                case 36: goto L_0x0287;
                case 37: goto L_0x0292;
                case 38: goto L_0x029d;
                case 39: goto L_0x02a8;
                case 40: goto L_0x02b3;
                case 41: goto L_0x02be;
                case 42: goto L_0x02c9;
                case 43: goto L_0x02d4;
                case 44: goto L_0x02df;
                case 45: goto L_0x02ea;
                case 46: goto L_0x02f5;
                case 47: goto L_0x0300;
                case 48: goto L_0x030b;
                case 49: goto L_0x0316;
                case 50: goto L_0x033c;
                case 51: goto L_0x0348;
                case 52: goto L_0x035b;
                case 53: goto L_0x036e;
                case 54: goto L_0x0375;
                case 55: goto L_0x0387;
                case 56: goto L_0x038f;
                case 57: goto L_0x0397;
                case 58: goto L_0x03ad;
                case 59: goto L_0x03c0;
                case 60: goto L_0x03cf;
                case 61: goto L_0x03e2;
                case 62: goto L_0x03f8;
                case 63: goto L_0x0418;
                case 64: goto L_0x0433;
                case 65: goto L_0x0449;
                case 66: goto L_0x045b;
                case 67: goto L_0x0471;
                case 68: goto L_0x0491;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r3 = r3 + 3
            goto L_0x0015
        L_0x0027:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            double r0 = r11.A02(r6, r0)
            r7.BtJ(r2, r0)
            goto L_0x0024
        L_0x003a:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            float r0 = r11.A03(r6, r0)
            r7.BtK(r2, r0)
            goto L_0x0024
        L_0x004d:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            long r0 = r11.A05(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x0024
        L_0x0060:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            long r0 = r11.A05(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x0024
        L_0x0073:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r1 = r11.A04(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x0024
        L_0x008b:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            long r0 = r11.A05(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x0024
        L_0x009e:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r0 = r11.A04(r6, r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x0024
        L_0x00b2:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            boolean r0 = r11.A0C(r6, r0)
            A0K(r7, r2, r0)
            goto L_0x0024
        L_0x00c6:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0F(r6, r1)
            A0I(r7, r0, r2)
            goto L_0x0024
        L_0x00d5:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8v1 r0 = r5.A0P(r3)
            r7.BtR(r0, r1, r2)
            goto L_0x0024
        L_0x00e8:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8Lp r1 = (X.C172538Lp) r1
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x0024
        L_0x00fe:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r11 = r11.A04(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r1 = r0.A00
            int r0 = r2 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x011c:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r1 = r11.A04(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x0024
        L_0x0135:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r0 = r11.A04(r6, r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x0024
        L_0x0149:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            long r0 = r11.A05(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x0024
        L_0x015d:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            int r0 = r11.A04(r6, r0)
            A0J(r7, r0, r2)
            goto L_0x0024
        L_0x0171:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            X.7bl r11 = X.C162367ro.A01
            long r12 = r11.A05(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r11 = r0.A00
            long r0 = X.AnonymousClass6C7.A0F(r12)
            int r2 = r2 << 3
            r11.A05(r2)
            r11.A09(r0)
            goto L_0x0024
        L_0x0193:
            boolean r0 = r5.A0Q(r3, r6)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8v1 r0 = r5.A0P(r3)
            r7.Bti(r0, r1, r2)
            goto L_0x0024
        L_0x01a6:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0F(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01b1:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0G(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01bc:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0H(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01c7:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0I(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01d2:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0M(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01dd:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0K(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01e8:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0P(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01f3:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0S(r7, r0, r2, r10)
            goto L_0x0024
        L_0x01fe:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0D(r7, r0, r2)
            goto L_0x0024
        L_0x0209:
            r12 = r4[r3]
            java.util.List r13 = A0H(r1, r6)
            X.8v1 r11 = r5.A0P(r3)
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r2 = r7
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            r1 = 0
        L_0x021f:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r2.BtR(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x021f
        L_0x022f:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0E(r7, r0, r2)
            goto L_0x0024
        L_0x023a:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0N(r7, r0, r2, r10)
            goto L_0x0024
        L_0x0245:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0R(r7, r0, r2, r10)
            goto L_0x0024
        L_0x0250:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0Q(r7, r0, r2, r10)
            goto L_0x0024
        L_0x025b:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0L(r7, r0, r2, r10)
            goto L_0x0024
        L_0x0266:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0O(r7, r0, r2, r10)
            goto L_0x0024
        L_0x0271:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0J(r7, r0, r2, r10)
            goto L_0x0024
        L_0x027c:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0F(r7, r0, r2, r9)
            goto L_0x0024
        L_0x0287:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0G(r7, r0, r2, r9)
            goto L_0x0024
        L_0x0292:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0H(r7, r0, r2, r9)
            goto L_0x0024
        L_0x029d:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0I(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02a8:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0M(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02b3:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0K(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02be:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0P(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02c9:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0S(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02d4:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0N(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02df:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0R(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02ea:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0Q(r7, r0, r2, r9)
            goto L_0x0024
        L_0x02f5:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0L(r7, r0, r2, r9)
            goto L_0x0024
        L_0x0300:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0O(r7, r0, r2, r9)
            goto L_0x0024
        L_0x030b:
            r2 = r4[r3]
            java.util.List r0 = A0H(r1, r6)
            X.C162497sE.A0J(r7, r0, r2, r9)
            goto L_0x0024
        L_0x0316:
            r12 = r4[r3]
            java.util.List r13 = A0H(r1, r6)
            X.8v1 r11 = r5.A0P(r3)
            if (r13 == 0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0024
            r2 = r7
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            r1 = 0
        L_0x032c:
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0024
            java.lang.Object r0 = r13.get(r1)
            r2.Bti(r11, r0, r12)
            int r1 = r1 + 1
            goto L_0x032c
        L_0x033c:
            java.lang.Object r0 = A0F(r6, r1)
            if (r0 == 0) goto L_0x0024
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0348:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0F(r6, r1)
            double r0 = X.AnonymousClass6C9.A02(r0)
            r7.BtJ(r2, r0)
            goto L_0x0024
        L_0x035b:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0F(r6, r1)
            float r0 = X.AnonymousClass001.A05(r0)
            r7.BtK(r2, r0)
            goto L_0x0024
        L_0x036e:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            goto L_0x037b
        L_0x0375:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
        L_0x037b:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0C(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x0024
        L_0x0387:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            goto L_0x041e
        L_0x038f:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            goto L_0x044f
        L_0x0397:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x0024
        L_0x03ad:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0F(r6, r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            A0K(r7, r2, r0)
            goto L_0x0024
        L_0x03c0:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = A0F(r6, r1)
            A0I(r7, r0, r2)
            goto L_0x0024
        L_0x03cf:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8v1 r0 = r5.A0P(r3)
            r7.BtR(r0, r1, r2)
            goto L_0x0024
        L_0x03e2:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8Lp r1 = (X.C172538Lp) r1
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x0024
        L_0x03f8:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r11 = X.AnonymousClass001.A0K(r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r1 = r0.A00
            int r0 = r2 << 3
            r1.A05(r0)
            r1.A05(r11)
            goto L_0x0024
        L_0x0418:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
        L_0x041e:
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x0024
        L_0x0433:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x0024
        L_0x0449:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
        L_0x044f:
            r1 = r1 & r16
            long r0 = (long) r1
            long r0 = A0C(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x0024
        L_0x045b:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            A0J(r7, r0, r2)
            goto L_0x0024
        L_0x0471:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            r1 = r1 & r16
            long r0 = (long) r1
            long r12 = A0C(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r11 = r0.A00
            long r0 = X.AnonymousClass6C7.A0F(r12)
            int r2 = r2 << 3
            r11.A05(r2)
            r11.A09(r0)
            goto L_0x0024
        L_0x0491:
            boolean r0 = r5.A0R(r6, r2, r3)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = A0F(r6, r1)
            X.8v1 r0 = r5.A0P(r3)
            r7.Bti(r0, r1, r2)
            goto L_0x0024
        L_0x04a4:
            int[] r8 = r5.A0B
            int r12 = r8.length
            sun.misc.Unsafe r4 = A0E
            r3 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r19 = 0
        L_0x04af:
            if (r3 >= r12) goto L_0x08ab
            int r0 = r3 + 1
            r15 = r8[r0]
            r2 = r8[r3]
            r0 = r15 & r17
            int r13 = r0 >>> 20
            r0 = 17
            if (r13 > r0) goto L_0x08a8
            int r0 = r3 + 2
            r18 = r8[r0]
            r14 = r18 & r16
            if (r14 == r11) goto L_0x04cd
            long r0 = (long) r14
            int r19 = r4.getInt(r6, r0)
            r11 = r14
        L_0x04cd:
            int r0 = r18 >>> 20
            int r14 = r9 << r0
        L_0x04d1:
            r15 = r15 & r16
            long r0 = (long) r15
            switch(r13) {
                case 0: goto L_0x0899;
                case 1: goto L_0x088a;
                case 2: goto L_0x087d;
                case 3: goto L_0x0870;
                case 4: goto L_0x085e;
                case 5: goto L_0x0851;
                case 6: goto L_0x0844;
                case 7: goto L_0x0835;
                case 8: goto L_0x0828;
                case 9: goto L_0x0817;
                case 10: goto L_0x0803;
                case 11: goto L_0x07ec;
                case 12: goto L_0x07da;
                case 13: goto L_0x07cd;
                case 14: goto L_0x07c0;
                case 15: goto L_0x07b3;
                case 16: goto L_0x0798;
                case 17: goto L_0x0787;
                case 18: goto L_0x0779;
                case 19: goto L_0x076b;
                case 20: goto L_0x075d;
                case 21: goto L_0x074f;
                case 22: goto L_0x0741;
                case 23: goto L_0x0733;
                case 24: goto L_0x0725;
                case 25: goto L_0x0718;
                case 26: goto L_0x070b;
                case 27: goto L_0x06e3;
                case 28: goto L_0x06d6;
                case 29: goto L_0x06c8;
                case 30: goto L_0x06ba;
                case 31: goto L_0x06ac;
                case 32: goto L_0x069e;
                case 33: goto L_0x0690;
                case 34: goto L_0x0683;
                case 35: goto L_0x0680;
                case 36: goto L_0x067d;
                case 37: goto L_0x067a;
                case 38: goto L_0x0677;
                case 39: goto L_0x0674;
                case 40: goto L_0x0671;
                case 41: goto L_0x066e;
                case 42: goto L_0x0661;
                case 43: goto L_0x065f;
                case 44: goto L_0x065d;
                case 45: goto L_0x065b;
                case 46: goto L_0x0659;
                case 47: goto L_0x0657;
                case 48: goto L_0x064a;
                case 49: goto L_0x0622;
                case 50: goto L_0x0616;
                case 51: goto L_0x0603;
                case 52: goto L_0x05f0;
                case 53: goto L_0x05e1;
                case 54: goto L_0x05d2;
                case 55: goto L_0x05ba;
                case 56: goto L_0x05ab;
                case 57: goto L_0x0598;
                case 58: goto L_0x0585;
                case 59: goto L_0x0576;
                case 60: goto L_0x0563;
                case 61: goto L_0x054d;
                case 62: goto L_0x0531;
                case 63: goto L_0x0529;
                case 64: goto L_0x0522;
                case 65: goto L_0x051a;
                case 66: goto L_0x0508;
                case 67: goto L_0x04ec;
                case 68: goto L_0x04da;
                default: goto L_0x04d7;
            }
        L_0x04d7:
            int r3 = r3 + 3
            goto L_0x04af
        L_0x04da:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8v1 r0 = r5.A0P(r3)
            r7.Bti(r0, r1, r2)
            goto L_0x04d7
        L_0x04ec:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            long r14 = A0C(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r13 = r0.A00
            long r0 = X.AnonymousClass6C7.A0F(r14)
            int r2 = r2 << 3
            r13.A05(r2)
            r13.A09(r0)
            goto L_0x04d7
        L_0x0508:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            A0J(r7, r0, r2)
            goto L_0x04d7
        L_0x051a:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            goto L_0x05b1
        L_0x0522:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            goto L_0x059e
        L_0x0529:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            goto L_0x05c0
        L_0x0531:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r13 = X.AnonymousClass001.A0K(r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r1 = r0.A00
            int r0 = r2 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04d7
        L_0x054d:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8Lp r1 = (X.C172538Lp) r1
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d7
        L_0x0563:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8v1 r0 = r5.A0P(r3)
            r7.BtR(r0, r1, r2)
            goto L_0x04d7
        L_0x0576:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = r4.getObject(r6, r0)
            A0I(r7, r0, r2)
            goto L_0x04d7
        L_0x0585:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            A0K(r7, r2, r0)
            goto L_0x04d7
        L_0x0598:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
        L_0x059e:
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x04d7
        L_0x05ab:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
        L_0x05b1:
            long r0 = A0C(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x04d7
        L_0x05ba:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
        L_0x05c0:
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x04d7
        L_0x05d2:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            long r0 = A0C(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x04d7
        L_0x05e1:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            long r0 = A0C(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x04d7
        L_0x05f0:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            float r0 = X.AnonymousClass001.A05(r0)
            r7.BtK(r2, r0)
            goto L_0x04d7
        L_0x0603:
            boolean r13 = r5.A0R(r6, r2, r3)
            if (r13 == 0) goto L_0x04d7
            java.lang.Object r0 = X.C162367ro.A03(r6, r0)
            double r0 = X.AnonymousClass6C9.A02(r0)
            r7.BtJ(r2, r0)
            goto L_0x04d7
        L_0x0616:
            java.lang.Object r0 = r4.getObject(r6, r0)
            if (r0 == 0) goto L_0x04d7
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0622:
            r13 = r8[r3]
            java.lang.Object r15 = r4.getObject(r6, r0)
            java.util.List r15 = (java.util.List) r15
            X.8v1 r14 = r5.A0P(r3)
            if (r15 == 0) goto L_0x04d7
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04d7
            r2 = r7
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            r1 = 0
        L_0x063a:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04d7
            java.lang.Object r0 = r15.get(r1)
            r2.Bti(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x063a
        L_0x064a:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0J(r7, r0, r2, r9)
            goto L_0x04d7
        L_0x0657:
            r13 = 1
            goto L_0x0691
        L_0x0659:
            r13 = 1
            goto L_0x069f
        L_0x065b:
            r13 = 1
            goto L_0x06ad
        L_0x065d:
            r13 = 1
            goto L_0x06bb
        L_0x065f:
            r13 = 1
            goto L_0x06c9
        L_0x0661:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0S(r7, r0, r2, r9)
            goto L_0x04d7
        L_0x066e:
            r13 = 1
            goto L_0x0726
        L_0x0671:
            r13 = 1
            goto L_0x0734
        L_0x0674:
            r13 = 1
            goto L_0x0742
        L_0x0677:
            r13 = 1
            goto L_0x0750
        L_0x067a:
            r13 = 1
            goto L_0x075e
        L_0x067d:
            r13 = 1
            goto L_0x076c
        L_0x0680:
            r13 = 1
            goto L_0x077a
        L_0x0683:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0J(r7, r0, r2, r10)
            goto L_0x04d7
        L_0x0690:
            r13 = 0
        L_0x0691:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0O(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x069e:
            r13 = 0
        L_0x069f:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0L(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x06ac:
            r13 = 0
        L_0x06ad:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0Q(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x06ba:
            r13 = 0
        L_0x06bb:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0R(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x06c8:
            r13 = 0
        L_0x06c9:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0N(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x06d6:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0E(r7, r0, r2)
            goto L_0x04d7
        L_0x06e3:
            r13 = r8[r3]
            java.lang.Object r15 = r4.getObject(r6, r0)
            java.util.List r15 = (java.util.List) r15
            X.8v1 r14 = r5.A0P(r3)
            if (r15 == 0) goto L_0x04d7
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x04d7
            r2 = r7
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            r1 = 0
        L_0x06fb:
            int r0 = r15.size()
            if (r1 >= r0) goto L_0x04d7
            java.lang.Object r0 = r15.get(r1)
            r2.BtR(r14, r0, r13)
            int r1 = r1 + 1
            goto L_0x06fb
        L_0x070b:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0D(r7, r0, r2)
            goto L_0x04d7
        L_0x0718:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0S(r7, r0, r2, r10)
            goto L_0x04d7
        L_0x0725:
            r13 = 0
        L_0x0726:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0P(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x0733:
            r13 = 0
        L_0x0734:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0K(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x0741:
            r13 = 0
        L_0x0742:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0M(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x074f:
            r13 = 0
        L_0x0750:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0I(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x075d:
            r13 = 0
        L_0x075e:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0H(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x076b:
            r13 = 0
        L_0x076c:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0G(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x0779:
            r13 = 0
        L_0x077a:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162497sE.A0F(r7, r0, r2, r13)
            goto L_0x04d7
        L_0x0787:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8v1 r0 = r5.A0P(r3)
            r7.Bti(r0, r1, r2)
            goto L_0x04d7
        L_0x0798:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            long r14 = r4.getLong(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r13 = r0.A00
            long r0 = X.AnonymousClass6C7.A0F(r14)
            int r2 = r2 << 3
            r13.A05(r2)
            r13.A09(r0)
            goto L_0x04d7
        L_0x07b3:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r0 = r4.getInt(r6, r0)
            A0J(r7, r0, r2)
            goto L_0x04d7
        L_0x07c0:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            long r0 = r4.getLong(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x04d7
        L_0x07cd:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r0 = r4.getInt(r6, r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x04d7
        L_0x07da:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r1 = r4.getInt(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x04d7
        L_0x07ec:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r13 = r4.getInt(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r1 = r0.A00
            int r0 = r2 << 3
            r1.A05(r0)
            r1.A05(r13)
            goto L_0x04d7
        L_0x0803:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8Lp r1 = (X.C172538Lp) r1
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A0B(r1, r2)
            goto L_0x04d7
        L_0x0817:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8v1 r0 = r5.A0P(r3)
            r7.BtR(r0, r1, r2)
            goto L_0x04d7
        L_0x0828:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            java.lang.Object r0 = r4.getObject(r6, r0)
            A0I(r7, r0, r2)
            goto L_0x04d7
        L_0x0835:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            X.7bl r13 = X.C162367ro.A01
            boolean r0 = r13.A0C(r6, r0)
            A0K(r7, r2, r0)
            goto L_0x04d7
        L_0x0844:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r0 = r4.getInt(r6, r0)
            X.AnonymousClass72Z.A08(r7, r2, r0)
            goto L_0x04d7
        L_0x0851:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            long r0 = r4.getLong(r6, r0)
            X.AnonymousClass72Z.A09(r7, r0, r2)
            goto L_0x04d7
        L_0x085e:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            int r1 = r4.getInt(r6, r0)
            r0 = r7
            X.8B0 r0 = (X.AnonymousClass8B0) r0
            X.6Xs r0 = r0.A00
            r0.A07(r2, r1)
            goto L_0x04d7
        L_0x0870:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            long r0 = r4.getLong(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x04d7
        L_0x087d:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            long r0 = r4.getLong(r6, r0)
            X.AnonymousClass72Z.A0A(r7, r0, r2)
            goto L_0x04d7
        L_0x088a:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            X.7bl r13 = X.C162367ro.A01
            float r0 = r13.A03(r6, r0)
            r7.BtK(r2, r0)
            goto L_0x04d7
        L_0x0899:
            r14 = r14 & r19
            if (r14 == 0) goto L_0x04d7
            X.7bl r13 = X.C162367ro.A01
            double r0 = r13.A02(r6, r0)
            r7.BtJ(r2, r0)
            goto L_0x04d7
        L_0x08a8:
            r14 = 0
            goto L_0x04d1
        L_0x08ab:
            X.6Xj r6 = (X.C128766Xj) r6
            X.7o4 r0 = r6.zzb
            r0.A02(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.BtS(X.8uo, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        r7 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
        r7 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r9.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016b, code lost:
        r9.putInt(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017b, code lost:
        r9.putLong(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        r20 = r20 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BtT(X.C156607gu r38, java.lang.Object r39, byte[] r40, int r41, int r42) {
        /*
            r37 = this;
            r7 = r41
            r14 = r37
            boolean r0 = r14.A0A
            r6 = r38
            r8 = r39
            r5 = r40
            r36 = r42
            if (r0 == 0) goto L_0x025c
            sun.misc.Unsafe r9 = A0E
            r11 = -1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = -1
            r10 = 0
            r20 = 0
            r19 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r0 = r36
            if (r7 >= r0) goto L_0x0246
            int r4 = r7 + 1
            byte r12 = r40[r7]
            if (r12 >= 0) goto L_0x002d
            int r4 = A09(r6, r5, r12, r4)
            int r12 = r6.A00
        L_0x002d:
            int r18 = r12 >>> 3
            r7 = r12 & 7
            r0 = r18
            if (r0 <= r2) goto L_0x005c
            int r15 = r10 / 3
            int r2 = r14.A00
            if (r0 < r2) goto L_0x0243
            int r2 = r14.A01
            if (r0 > r2) goto L_0x0243
            int[] r13 = r14.A0B
            int r0 = r13.length
            int r0 = r0 / 3
            int r3 = r0 + -1
        L_0x0046:
            if (r15 > r3) goto L_0x0243
            int r0 = r3 + r15
            int r16 = r0 >>> 1
            int r10 = r16 * 3
            r2 = r13[r10]
            r0 = r18
            if (r0 == r2) goto L_0x0060
            if (r0 >= r2) goto L_0x0059
            int r3 = r16 + -1
            goto L_0x0046
        L_0x0059:
            int r15 = r16 + 1
            goto L_0x0046
        L_0x005c:
            int r10 = r14.A0L(r0)
        L_0x0060:
            if (r10 == r11) goto L_0x0243
            int[] r0 = r14.A0B
            r15 = r0
            int r0 = r10 + 1
            r13 = r15[r0]
            int r17 = X.AnonymousClass6C8.A07(r13)
            r0 = r13 & r1
            long r2 = (long) r0
            r0 = 17
            r11 = r0
            r0 = r17
            if (r0 > r11) goto L_0x018a
            int r0 = r10 + 2
            r11 = r15[r0]
            int r0 = r11 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r11 = r11 & r1
            r0 = r19
            if (r11 == r0) goto L_0x009a
            if (r0 == r1) goto L_0x008e
            long r0 = (long) r0
            r15 = r20
            r9.putInt(r8, r0, r15)
        L_0x008e:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 == r0) goto L_0x0098
            long r0 = (long) r11
            int r20 = r9.getInt(r8, r0)
        L_0x0098:
            r19 = r11
        L_0x009a:
            r0 = 5
            switch(r17) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00cd;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00dd;
                case 4: goto L_0x00e7;
                case 5: goto L_0x00f0;
                case 6: goto L_0x0104;
                case 7: goto L_0x0110;
                case 8: goto L_0x0126;
                case 9: goto L_0x0138;
                case 10: goto L_0x0152;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00e7;
                case 13: goto L_0x0104;
                case 14: goto L_0x00f0;
                case 15: goto L_0x015f;
                case 16: goto L_0x016f;
                default: goto L_0x009e;
            }
        L_0x009e:
            X.7o4 r22 = A0E(r8)
            r21 = r6
            r23 = r5
            r24 = r12
            r25 = r4
            r26 = r36
            int r7 = A03(r21, r22, r23, r24, r25, r26)
        L_0x00b0:
            r2 = r18
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r11 = -1
            goto L_0x001d
        L_0x00b8:
            r0 = 1
            if (r7 != r0) goto L_0x009e
            long r0 = X.AnonymousClass6C7.A0N(r5, r4)
            double r25 = java.lang.Double.longBitsToDouble(r0)
            X.7bl r21 = X.C162367ro.A01
            r22 = r8
            r23 = r2
            r21.A07(r22, r23, r25)
            goto L_0x0100
        L_0x00cd:
            if (r7 != r0) goto L_0x009e
            int r0 = X.AnonymousClass6C7.A0B(r5, r4)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.7bl r0 = X.C162367ro.A01
            r0.A08(r8, r2, r1)
            goto L_0x010d
        L_0x00dd:
            if (r7 != 0) goto L_0x009e
            int r7 = A05(r6, r5, r4)
            long r0 = r6.A01
            goto L_0x017b
        L_0x00e7:
            if (r7 != 0) goto L_0x009e
            int r7 = A04(r6, r5, r4)
            int r0 = r6.A00
            goto L_0x016b
        L_0x00f0:
            r0 = 1
            if (r7 != r0) goto L_0x009e
            long r25 = X.AnonymousClass6C7.A0N(r5, r4)
            r21 = r9
            r22 = r8
            r23 = r2
            r21.putLong(r22, r23, r25)
        L_0x0100:
            int r7 = r4 + 8
            goto L_0x0186
        L_0x0104:
            if (r7 != r0) goto L_0x009e
            int r0 = X.AnonymousClass6C7.A0B(r5, r4)
            r9.putInt(r8, r2, r0)
        L_0x010d:
            int r7 = r4 + 4
            goto L_0x0186
        L_0x0110:
            if (r7 != 0) goto L_0x009e
            int r7 = A05(r6, r5, r4)
            long r0 = r6.A01
            r11 = 0
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r4)
            X.7bl r0 = X.C162367ro.A01
            r0.A0B(r8, r2, r1)
            goto L_0x0186
        L_0x0126:
            r0 = 2
            if (r7 != r0) goto L_0x009e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r13 = r13 & r0
            if (r13 != 0) goto L_0x0133
            int r7 = A06(r6, r5, r4)
            goto L_0x0159
        L_0x0133:
            int r7 = A07(r6, r5, r4)
            goto L_0x0159
        L_0x0138:
            r0 = 2
            if (r7 != r0) goto L_0x009e
            X.8v1 r1 = r14.A0P(r10)
            r0 = r36
            int r7 = A01(r6, r1, r5, r4, r0)
            java.lang.Object r1 = r9.getObject(r8, r2)
            if (r1 == 0) goto L_0x0159
            java.lang.Object r0 = r6.A02
            java.lang.Object r0 = X.C155597fA.A00(r1, r0)
            goto L_0x015b
        L_0x0152:
            r0 = 2
            if (r7 != r0) goto L_0x009e
            int r7 = A08(r6, r5, r4)
        L_0x0159:
            java.lang.Object r0 = r6.A02
        L_0x015b:
            r9.putObject(r8, r2, r0)
            goto L_0x0186
        L_0x015f:
            if (r7 != 0) goto L_0x009e
            int r7 = A04(r6, r5, r4)
            int r0 = r6.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
        L_0x016b:
            r9.putInt(r8, r2, r0)
            goto L_0x0186
        L_0x016f:
            if (r7 != 0) goto L_0x009e
            int r7 = A05(r6, r5, r4)
            long r0 = r6.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
        L_0x017b:
            r21 = r9
            r22 = r8
            r23 = r2
            r25 = r0
            r21.putLong(r22, r23, r25)
        L_0x0186:
            r20 = r20 | r16
            goto L_0x00b0
        L_0x018a:
            r1 = 27
            if (r0 != r1) goto L_0x01cb
            r0 = 2
            if (r7 != r0) goto L_0x009e
            java.lang.Object r1 = r9.getObject(r8, r2)
            X.8yZ r1 = (X.C188238yZ) r1
            r0 = r1
            X.8T4 r0 = (X.AnonymousClass8T4) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01a9
            int r0 = X.AnonymousClass6C9.A0E(r1)
            X.8yZ r1 = r1.BtF(r0)
            r9.putObject(r8, r2, r1)
        L_0x01a9:
            X.8v1 r3 = r14.A0P(r10)
            r0 = r36
            int r7 = A01(r6, r3, r5, r4, r0)
        L_0x01b3:
            java.lang.Object r0 = r6.A02
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x00b0
            int r2 = A04(r6, r5, r7)
            int r0 = r6.A00
            if (r12 != r0) goto L_0x00b0
            r0 = r36
            int r7 = A01(r6, r3, r5, r2, r0)
            goto L_0x01b3
        L_0x01cb:
            r1 = 49
            if (r0 > r1) goto L_0x01f3
            long r0 = (long) r13
            r28 = r18
            r29 = r7
            r30 = r10
            r31 = r17
            r32 = r0
            r34 = r2
            r22 = r6
            r23 = r8
            r24 = r5
            r25 = r4
            r26 = r36
            r27 = r12
            r21 = r14
            int r7 = r21.A0O(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
        L_0x01ee:
            if (r7 != r4) goto L_0x00b0
            r4 = r7
            goto L_0x009e
        L_0x01f3:
            r1 = 50
            if (r0 != r1) goto L_0x0224
            r0 = 2
            if (r7 != r0) goto L_0x009e
            java.lang.Object r6 = r9.getObject(r8, r2)
            X.8m3 r5 = r14.A06
            r0 = r6
            X.8Tp r0 = (X.C174268Tp) r0
            boolean r0 = r0.zza
            if (r0 != 0) goto L_0x021a
            X.8Tp r4 = X.C174268Tp.A00
            boolean r1 = r4.isEmpty()
            X.8Tp r0 = new X.8Tp
            if (r1 == 0) goto L_0x0220
            r0.<init>()
        L_0x0214:
            r5.BtI(r0, r6)
            r9.putObject(r8, r2, r0)
        L_0x021a:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0220:
            r0.<init>(r4)
            goto L_0x0214
        L_0x0224:
            r28 = r18
            r29 = r7
            r30 = r13
            r31 = r0
            r32 = r10
            r33 = r2
            r22 = r6
            r23 = r8
            r24 = r5
            r25 = r4
            r26 = r36
            r27 = r12
            r21 = r14
            int r7 = r21.A0N(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x01ee
        L_0x0243:
            r10 = 0
            goto L_0x009e
        L_0x0246:
            r0 = r19
            if (r0 == r1) goto L_0x0250
            long r1 = (long) r0
            r0 = r20
            r9.putInt(r8, r1, r0)
        L_0x0250:
            r0 = r36
            if (r7 == r0) goto L_0x0267
            java.lang.String r1 = "Failed to parse the message."
            X.6ty r0 = new X.6ty
            r0.<init>(r1)
            throw r0
        L_0x025c:
            r15 = 0
            r9 = r14
            r10 = r6
            r11 = r8
            r12 = r5
            r13 = r7
            r14 = r36
            r9.A0M(r10, r11, r12, r13, r14, r15)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.BtT(X.7gu, java.lang.Object, byte[], int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ec, code lost:
        r12 = (r12 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0469, code lost:
        if (r0 >= 0) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04f1, code lost:
        if (r0 >= 0) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04f3, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04f7, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04f9, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05fa, code lost:
        if (r0 >= 0) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0689, code lost:
        if (r0 >= 0) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x069a, code lost:
        r13 = X.AnonymousClass72Z.A06(X.AnonymousClass72Z.A04(r7), A0C(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0814, code lost:
        r13 = (r13 + r0) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09cc, code lost:
        if (r0 >= 0) goto L_0x09ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09ce, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0a46, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0a48, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a8, code lost:
        if (r0 >= 0) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0237, code lost:
        if (r0 >= 0) goto L_0x04f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0248, code lost:
        r12 = X.AnonymousClass72Z.A06(X.AnonymousClass72Z.A04(r6), A0C(r5, r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int BtX(java.lang.Object r18) {
        /*
            r17 = this;
            r5 = r18
            r4 = r17
            boolean r0 = r4.A0A
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 1
            r3 = 0
            sun.misc.Unsafe r2 = A0E
            if (r0 == 0) goto L_0x054c
            r13 = 0
        L_0x0012:
            int[] r6 = r4.A0B
            int r0 = r6.length
            if (r3 >= r0) goto L_0x0542
            int r0 = r3 + 1
            r1 = r6[r0]
            r0 = r1 & r7
            int r7 = r0 >>> 20
            r6 = r6[r3]
            r1 = r1 & r16
            long r0 = (long) r1
            switch(r7) {
                case 0: goto L_0x0533;
                case 1: goto L_0x0526;
                case 2: goto L_0x0511;
                case 3: goto L_0x04fc;
                case 4: goto L_0x04e1;
                case 5: goto L_0x04d4;
                case 6: goto L_0x04c7;
                case 7: goto L_0x04ba;
                case 8: goto L_0x04aa;
                case 9: goto L_0x0496;
                case 10: goto L_0x0484;
                case 11: goto L_0x046d;
                case 12: goto L_0x0459;
                case 13: goto L_0x044b;
                case 14: goto L_0x043d;
                case 15: goto L_0x0427;
                case 16: goto L_0x040d;
                case 17: goto L_0x03f0;
                case 18: goto L_0x0123;
                case 19: goto L_0x0119;
                case 20: goto L_0x0101;
                case 21: goto L_0x00ed;
                case 22: goto L_0x00d9;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00c5;
                case 25: goto L_0x00b2;
                case 26: goto L_0x00a8;
                case 27: goto L_0x009a;
                case 28: goto L_0x0090;
                case 29: goto L_0x007c;
                case 30: goto L_0x0068;
                case 31: goto L_0x005e;
                case 32: goto L_0x0054;
                case 33: goto L_0x0040;
                case 34: goto L_0x002c;
                case 35: goto L_0x03d8;
                case 36: goto L_0x03c3;
                case 37: goto L_0x03ae;
                case 38: goto L_0x0399;
                case 39: goto L_0x0384;
                case 40: goto L_0x036f;
                case 41: goto L_0x035a;
                case 42: goto L_0x0346;
                case 43: goto L_0x0330;
                case 44: goto L_0x031a;
                case 45: goto L_0x0304;
                case 46: goto L_0x02ee;
                case 47: goto L_0x02d8;
                case 48: goto L_0x02c2;
                case 49: goto L_0x0298;
                case 50: goto L_0x0272;
                case 51: goto L_0x0264;
                case 52: goto L_0x0256;
                case 53: goto L_0x0242;
                case 54: goto L_0x023b;
                case 55: goto L_0x0225;
                case 56: goto L_0x0217;
                case 57: goto L_0x0209;
                case 58: goto L_0x01fb;
                case 59: goto L_0x01eb;
                case 60: goto L_0x01d7;
                case 61: goto L_0x01c5;
                case 62: goto L_0x01ac;
                case 63: goto L_0x0196;
                case 64: goto L_0x0188;
                case 65: goto L_0x017a;
                case 66: goto L_0x0162;
                case 67: goto L_0x014a;
                case 68: goto L_0x012d;
                default: goto L_0x0027;
            }
        L_0x0027:
            int r3 = r3 + 3
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0012
        L_0x002c:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A04(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x0040:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A08(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x0054:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0C(r0, r6)
            goto L_0x053f
        L_0x005e:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0B(r0, r6)
            goto L_0x053f
        L_0x0068:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A05(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x007c:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A07(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x0090:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0A(r0, r6)
            goto L_0x053f
        L_0x009a:
            java.util.List r1 = X.AnonymousClass6CA.A0b(r5, r0)
            X.8v1 r0 = r4.A0P(r3)
            int r12 = X.C162497sE.A01(r0, r1, r6)
            goto L_0x053f
        L_0x00a8:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A09(r0, r6)
            goto L_0x053f
        L_0x00b2:
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r12 = A0A(r0)
            if (r12 == 0) goto L_0x02a8
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x053f
        L_0x00c5:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0B(r0, r6)
            goto L_0x053f
        L_0x00cf:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0C(r0, r6)
            goto L_0x053f
        L_0x00d9:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A06(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x00ed:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x02a8
            int r0 = X.C162497sE.A03(r0)
            int r12 = A00(r6, r1, r0)
            goto L_0x053f
        L_0x0101:
            java.util.List r7 = X.AnonymousClass6CA.A0b(r5, r0)
            int r0 = r7.size()
            if (r0 == 0) goto L_0x02a8
            int r1 = X.C162497sE.A02(r7)
            int r0 = r7.size()
            int r12 = A00(r6, r0, r1)
            goto L_0x053f
        L_0x0119:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0B(r0, r6)
            goto L_0x053f
        L_0x0123:
            java.util.List r0 = X.AnonymousClass6CA.A0b(r5, r0)
            int r12 = X.C162497sE.A0C(r0, r6)
            goto L_0x053f
        L_0x012d:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r7 = X.C162367ro.A03(r5, r0)
            X.8xu r7 = (X.C187848xu) r7
            X.8v1 r1 = r4.A0P(r3)
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 << 1
            int r0 = X.C128766Xj.A00(r1, r7)
            int r12 = r12 + r0
            goto L_0x053f
        L_0x014a:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            long r0 = A0C(r5, r0)
            int r6 = X.AnonymousClass72Z.A04(r6)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r12 = X.AnonymousClass72Z.A06(r6, r0)
            goto L_0x053f
        L_0x0162:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = X.AnonymousClass72Z.A05(r1, r0)
            goto L_0x053f
        L_0x017a:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
            goto L_0x053f
        L_0x0188:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x0196:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            if (r0 < 0) goto L_0x04f9
            goto L_0x04f3
        L_0x01ac:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r12 = r12 + r0
            goto L_0x053f
        L_0x01c5:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            X.8Lp r0 = (X.C172538Lp) r0
            int r12 = X.C128856Xs.A03(r0, r6)
            goto L_0x053f
        L_0x01d7:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r1 = X.C162367ro.A03(r5, r0)
            X.8v1 r0 = r4.A0P(r3)
            int r12 = X.C162497sE.A00(r0, r1, r6)
            goto L_0x053f
        L_0x01eb:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r12 = A0B(r0, r6)
            goto L_0x053f
        L_0x01fb:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 1
            goto L_0x053f
        L_0x0209:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x0217:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
            goto L_0x053f
        L_0x0225:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            if (r0 < 0) goto L_0x04f9
            goto L_0x04f3
        L_0x023b:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
            goto L_0x0248
        L_0x0242:
            boolean r7 = r4.A0R(r5, r6, r3)
            if (r7 == 0) goto L_0x0027
        L_0x0248:
            long r0 = A0C(r5, r0)
            int r6 = X.AnonymousClass72Z.A04(r6)
            int r12 = X.AnonymousClass72Z.A06(r6, r0)
            goto L_0x053f
        L_0x0256:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x0264:
            boolean r0 = r4.A0R(r5, r6, r3)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
            goto L_0x053f
        L_0x0272:
            java.lang.Object r1 = X.C162367ro.A03(r5, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02a8
            java.util.Iterator r1 = X.AnonymousClass001.A0u(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0298:
            java.util.List r11 = X.AnonymousClass6CA.A0b(r5, r0)
            X.8v1 r10 = r4.A0P(r3)
            int r9 = r11.size()
            r8 = 0
            r12 = 0
            if (r9 != 0) goto L_0x02ab
        L_0x02a8:
            r12 = 0
            goto L_0x053f
        L_0x02ab:
            if (r8 >= r9) goto L_0x053f
            java.lang.Object r7 = r11.get(r8)
            X.8xu r7 = (X.C187848xu) r7
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r1 = r0 << 1
            int r0 = X.C128766Xj.A00(r10, r7)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r8 = r8 + 1
            goto L_0x02ab
        L_0x02c2:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A04(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x02d8:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A08(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x02ee:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x0304:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x031a:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A05(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x0330:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A07(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x0346:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r1 = A0A(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x035a:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x036f:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x0384:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A06(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x0399:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A03(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x03ae:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A02(r0)
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x03c3:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x03ec
        L_0x03d8:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x0027
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r1)
        L_0x03ec:
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x053f
        L_0x03f0:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r7 = X.C162367ro.A03(r5, r0)
            X.8xu r7 = (X.C187848xu) r7
            X.8v1 r1 = r4.A0P(r3)
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 << 1
            int r0 = X.C128766Xj.A00(r1, r7)
            int r12 = r12 + r0
            goto L_0x053f
        L_0x040d:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            long r0 = r7.A05(r5, r0)
            int r6 = X.AnonymousClass72Z.A04(r6)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r12 = X.AnonymousClass72Z.A06(r6, r0)
            goto L_0x053f
        L_0x0427:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            int r1 = r7.A04(r5, r0)
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = X.AnonymousClass72Z.A05(r1, r0)
            goto L_0x053f
        L_0x043d:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
            goto L_0x053f
        L_0x044b:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x0459:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            int r0 = r7.A04(r5, r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            if (r0 < 0) goto L_0x04f9
            goto L_0x04f3
        L_0x046d:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            int r0 = r7.A04(r5, r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r12 = r12 + r0
            goto L_0x053f
        L_0x0484:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            X.8Lp r0 = (X.C172538Lp) r0
            int r12 = X.C128856Xs.A03(r0, r6)
            goto L_0x053f
        L_0x0496:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r1 = X.C162367ro.A03(r5, r0)
            X.8v1 r0 = r4.A0P(r3)
            int r12 = X.C162497sE.A00(r0, r1, r6)
            goto L_0x053f
        L_0x04aa:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r12 = A0B(r0, r6)
            goto L_0x053f
        L_0x04ba:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 1
            goto L_0x053f
        L_0x04c7:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x04d4:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
            goto L_0x053f
        L_0x04e1:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            int r0 = r7.A04(r5, r0)
            int r12 = X.AnonymousClass72Z.A04(r6)
            if (r0 < 0) goto L_0x04f9
        L_0x04f3:
            int r0 = X.AnonymousClass6C7.A00(r0)
        L_0x04f7:
            int r12 = r12 + r0
            goto L_0x053f
        L_0x04f9:
            r0 = 10
            goto L_0x04f7
        L_0x04fc:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            long r0 = r7.A05(r5, r0)
            int r6 = X.AnonymousClass72Z.A04(r6)
            int r12 = X.AnonymousClass72Z.A06(r6, r0)
            goto L_0x053f
        L_0x0511:
            boolean r7 = r4.A0Q(r3, r5)
            if (r7 == 0) goto L_0x0027
            X.7bl r7 = X.C162367ro.A01
            long r0 = r7.A05(r5, r0)
            int r6 = X.AnonymousClass72Z.A04(r6)
            int r12 = X.AnonymousClass72Z.A06(r6, r0)
            goto L_0x053f
        L_0x0526:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 4
            goto L_0x053f
        L_0x0533:
            boolean r0 = r4.A0Q(r3, r5)
            if (r0 == 0) goto L_0x0027
            int r0 = X.AnonymousClass72Z.A04(r6)
            int r12 = r0 + 8
        L_0x053f:
            int r13 = r13 + r12
            goto L_0x0027
        L_0x0542:
            X.6Xj r5 = (X.C128766Xj) r5
            X.7o4 r0 = r5.zzb
            int r0 = r0.A00()
            int r13 = r13 + r0
            return r13
        L_0x054c:
            r15 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x0551:
            int[] r1 = r4.A0B
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0a86
            int r0 = r3 + 1
            r10 = r1[r0]
            r7 = r1[r3]
            int r9 = X.AnonymousClass6C8.A07(r10)
            r0 = 17
            if (r9 > r0) goto L_0x0a83
            int r0 = r3 + 2
            r0 = r1[r0]
            r8 = r0 & r16
            int r0 = r0 >>> 20
            int r11 = r11 << r0
            if (r8 == r6) goto L_0x0575
            long r0 = (long) r8
            int r14 = r2.getInt(r5, r0)
            r6 = r8
        L_0x0575:
            r10 = r10 & r16
            long r0 = (long) r10
            switch(r9) {
                case 0: goto L_0x0a6b;
                case 1: goto L_0x0a76;
                case 2: goto L_0x0a5b;
                case 3: goto L_0x0a4b;
                case 4: goto L_0x0a35;
                case 5: goto L_0x0a2a;
                case 6: goto L_0x0a1f;
                case 7: goto L_0x0a14;
                case 8: goto L_0x0a07;
                case 9: goto L_0x09f6;
                case 10: goto L_0x09e6;
                case 11: goto L_0x09d3;
                case 12: goto L_0x09c0;
                case 13: goto L_0x09b4;
                case 14: goto L_0x09a8;
                case 15: goto L_0x0996;
                case 16: goto L_0x0980;
                case 17: goto L_0x0965;
                case 18: goto L_0x0959;
                case 19: goto L_0x094d;
                case 20: goto L_0x0907;
                case 21: goto L_0x08f1;
                case 22: goto L_0x08db;
                case 23: goto L_0x08cf;
                case 24: goto L_0x08c3;
                case 25: goto L_0x08b0;
                case 26: goto L_0x08a4;
                case 27: goto L_0x0894;
                case 28: goto L_0x0888;
                case 29: goto L_0x0872;
                case 30: goto L_0x085c;
                case 31: goto L_0x0850;
                case 32: goto L_0x0844;
                case 33: goto L_0x082e;
                case 34: goto L_0x0818;
                case 35: goto L_0x0800;
                case 36: goto L_0x07eb;
                case 37: goto L_0x07d6;
                case 38: goto L_0x07c1;
                case 39: goto L_0x07ac;
                case 40: goto L_0x0797;
                case 41: goto L_0x0782;
                case 42: goto L_0x076e;
                case 43: goto L_0x0758;
                case 44: goto L_0x0742;
                case 45: goto L_0x072c;
                case 46: goto L_0x0716;
                case 47: goto L_0x0700;
                case 48: goto L_0x06ea;
                case 49: goto L_0x0921;
                case 50: goto L_0x06c4;
                case 51: goto L_0x06b6;
                case 52: goto L_0x06a8;
                case 53: goto L_0x0694;
                case 54: goto L_0x068d;
                case 55: goto L_0x0677;
                case 56: goto L_0x0669;
                case 57: goto L_0x065b;
                case 58: goto L_0x064d;
                case 59: goto L_0x063d;
                case 60: goto L_0x0629;
                case 61: goto L_0x0617;
                case 62: goto L_0x05fe;
                case 63: goto L_0x05e8;
                case 64: goto L_0x05da;
                case 65: goto L_0x05cc;
                case 66: goto L_0x05b4;
                case 67: goto L_0x059c;
                case 68: goto L_0x057f;
                default: goto L_0x057b;
            }
        L_0x057b:
            int r3 = r3 + 3
            r11 = 1
            goto L_0x0551
        L_0x057f:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r8 = r2.getObject(r5, r0)
            X.8xu r8 = (X.C187848xu) r8
            X.8v1 r1 = r4.A0P(r3)
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 << 1
            int r0 = X.C128766Xj.A00(r1, r8)
            int r13 = r13 + r0
            goto L_0x0a80
        L_0x059c:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            long r0 = A0C(r5, r0)
            int r7 = X.AnonymousClass72Z.A04(r7)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r13 = X.AnonymousClass72Z.A06(r7, r0)
            goto L_0x0a80
        L_0x05b4:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = X.AnonymousClass72Z.A05(r1, r0)
            goto L_0x0a80
        L_0x05cc:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x05da:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
            goto L_0x0a80
        L_0x05e8:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            if (r0 < 0) goto L_0x0a48
            goto L_0x09ce
        L_0x05fe:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r13 = r13 + r0
            goto L_0x0a80
        L_0x0617:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = r2.getObject(r5, r0)
            X.8Lp r0 = (X.C172538Lp) r0
            int r13 = X.C128856Xs.A03(r0, r7)
            goto L_0x0a80
        L_0x0629:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r1 = r2.getObject(r5, r0)
            X.8v1 r0 = r4.A0P(r3)
            int r13 = X.C162497sE.A00(r0, r1, r7)
            goto L_0x0a80
        L_0x063d:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r13 = A0B(r0, r7)
            goto L_0x0a80
        L_0x064d:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 1
            goto L_0x0a80
        L_0x065b:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
            goto L_0x0a80
        L_0x0669:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x0677:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = X.C162367ro.A03(r5, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            if (r0 < 0) goto L_0x0a48
            goto L_0x09ce
        L_0x068d:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
            goto L_0x069a
        L_0x0694:
            boolean r8 = r4.A0R(r5, r7, r3)
            if (r8 == 0) goto L_0x057b
        L_0x069a:
            long r0 = A0C(r5, r0)
            int r7 = X.AnonymousClass72Z.A04(r7)
            int r13 = X.AnonymousClass72Z.A06(r7, r0)
            goto L_0x0a80
        L_0x06a8:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
            goto L_0x0a80
        L_0x06b6:
            boolean r0 = r4.A0R(r5, r7, r3)
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x06c4:
            java.lang.Object r1 = r2.getObject(r5, r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0933
            java.util.Iterator r1 = X.AnonymousClass001.A0u(r1)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0933
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r1)
            r0.getKey()
            r0.getValue()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x06ea:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A04(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0700:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A08(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0716:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x072c:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0742:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A05(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0758:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A07(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x076e:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r1 = A0A(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0782:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0797:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x07ac:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A06(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x07c1:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A03(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x07d6:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162497sE.A02(r0)
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x07eb:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 2
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            goto L_0x0814
        L_0x0800:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r0 = A0A(r0)
            int r1 = r0 << 3
            if (r1 <= 0) goto L_0x057b
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
        L_0x0814:
            int r13 = r13 + r0
            int r13 = r13 + r1
            goto L_0x0a80
        L_0x0818:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A04(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x082e:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A08(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x0844:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0C(r0, r7)
            goto L_0x0a80
        L_0x0850:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0B(r0, r7)
            goto L_0x0a80
        L_0x085c:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A05(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x0872:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A07(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x0888:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0A(r0, r7)
            goto L_0x0a80
        L_0x0894:
            java.lang.Object r1 = r2.getObject(r5, r0)
            java.util.List r1 = (java.util.List) r1
            X.8v1 r0 = r4.A0P(r3)
            int r13 = X.C162497sE.A01(r0, r1, r7)
            goto L_0x0a80
        L_0x08a4:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A09(r0, r7)
            goto L_0x0a80
        L_0x08b0:
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r13 = A0A(r0)
            if (r13 == 0) goto L_0x0933
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r0 = r0 + 1
            int r13 = r13 * r0
            goto L_0x0a80
        L_0x08c3:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0B(r0, r7)
            goto L_0x0a80
        L_0x08cf:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0C(r0, r7)
            goto L_0x0a80
        L_0x08db:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A06(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x08f1:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x0933
            int r0 = X.C162497sE.A03(r0)
            int r13 = A00(r7, r1, r0)
            goto L_0x0a80
        L_0x0907:
            java.lang.Object r8 = r2.getObject(r5, r0)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r0 == 0) goto L_0x0933
            int r1 = X.C162497sE.A02(r8)
            int r0 = r8.size()
            int r13 = A00(r7, r0, r1)
            goto L_0x0a80
        L_0x0921:
            java.lang.Object r12 = r2.getObject(r5, r0)
            java.util.List r12 = (java.util.List) r12
            X.8v1 r11 = r4.A0P(r3)
            int r10 = r12.size()
            r9 = 0
            r13 = 0
            if (r10 != 0) goto L_0x0936
        L_0x0933:
            r13 = 0
            goto L_0x0a80
        L_0x0936:
            if (r9 >= r10) goto L_0x0a80
            java.lang.Object r8 = r12.get(r9)
            X.8xu r8 = (X.C187848xu) r8
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r1 = r0 << 1
            int r0 = X.C128766Xj.A00(r11, r8)
            int r1 = r1 + r0
            int r13 = r13 + r1
            int r9 = r9 + 1
            goto L_0x0936
        L_0x094d:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0B(r0, r7)
            goto L_0x0a80
        L_0x0959:
            java.lang.Object r0 = r2.getObject(r5, r0)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162497sE.A0C(r0, r7)
            goto L_0x0a80
        L_0x0965:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            java.lang.Object r8 = r2.getObject(r5, r0)
            X.8xu r8 = (X.C187848xu) r8
            X.8v1 r1 = r4.A0P(r3)
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 << 1
            int r0 = X.C128766Xj.A00(r1, r8)
            int r13 = r13 + r0
            goto L_0x0a80
        L_0x0980:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            long r0 = r2.getLong(r5, r0)
            int r7 = X.AnonymousClass72Z.A04(r7)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r13 = X.AnonymousClass72Z.A06(r7, r0)
            goto L_0x0a80
        L_0x0996:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            int r1 = r2.getInt(r5, r0)
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = X.AnonymousClass72Z.A05(r1, r0)
            goto L_0x0a80
        L_0x09a8:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x09b4:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
            goto L_0x0a80
        L_0x09c0:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            int r0 = r2.getInt(r5, r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            if (r0 < 0) goto L_0x0a48
        L_0x09ce:
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0a46
        L_0x09d3:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            int r0 = r2.getInt(r5, r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r0)
            int r13 = r13 + r0
            goto L_0x0a80
        L_0x09e6:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = r2.getObject(r5, r0)
            X.8Lp r0 = (X.C172538Lp) r0
            int r13 = X.C128856Xs.A03(r0, r7)
            goto L_0x0a80
        L_0x09f6:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            java.lang.Object r1 = r2.getObject(r5, r0)
            X.8v1 r0 = r4.A0P(r3)
            int r13 = X.C162497sE.A00(r0, r1, r7)
            goto L_0x0a80
        L_0x0a07:
            r8 = r14 & r11
            if (r8 == 0) goto L_0x057b
            java.lang.Object r0 = r2.getObject(r5, r0)
            int r13 = A0B(r0, r7)
            goto L_0x0a80
        L_0x0a14:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 1
            goto L_0x0a80
        L_0x0a1f:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
            goto L_0x0a80
        L_0x0a2a:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x0a35:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x057b
            int r0 = r2.getInt(r5, r0)
            int r13 = X.AnonymousClass72Z.A04(r7)
            if (r0 < 0) goto L_0x0a48
            int r0 = X.AnonymousClass6C7.A00(r0)
        L_0x0a46:
            int r13 = r13 + r0
            goto L_0x0a80
        L_0x0a48:
            r0 = 10
            goto L_0x0a46
        L_0x0a4b:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x057b
            long r0 = r2.getLong(r5, r0)
            int r7 = X.AnonymousClass72Z.A04(r7)
            int r13 = X.AnonymousClass72Z.A06(r7, r0)
            goto L_0x0a80
        L_0x0a5b:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x057b
            long r0 = r2.getLong(r5, r0)
            int r7 = X.AnonymousClass72Z.A04(r7)
            int r13 = X.AnonymousClass72Z.A06(r7, r0)
            goto L_0x0a80
        L_0x0a6b:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 8
            goto L_0x0a80
        L_0x0a76:
            r0 = r14 & r11
            if (r0 == 0) goto L_0x057b
            int r0 = X.AnonymousClass72Z.A04(r7)
            int r13 = r0 + 4
        L_0x0a80:
            int r15 = r15 + r13
            goto L_0x057b
        L_0x0a83:
            r11 = 0
            goto L_0x0575
        L_0x0a86:
            X.6Xj r5 = (X.C128766Xj) r5
            X.7o4 r0 = r5.zzb
            int r0 = r0.A00()
            int r15 = r15 + r0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.BtX(java.lang.Object):int");
    }

    public final void Btp(Object obj) {
        int i;
        Object unmodifiableList;
        AnonymousClass8T4 r3;
        int i2 = this.A02;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long A0T = AnonymousClass6C8.A0T(this.A0B, this.A0C[i2]);
            Object A032 = C162367ro.A03(obj, A0T);
            if (A032 != null) {
                ((C174268Tp) A032).zza = false;
                C162367ro.A07(obj, A0T, A032);
            }
            i2++;
        }
        int[] iArr = this.A0C;
        int length = iArr.length;
        while (i < length) {
            C157887j3 r32 = this.A05;
            long j = (long) iArr[i];
            if (r32 instanceof AnonymousClass6YC) {
                r3 = (AnonymousClass8T4) ((C188238yZ) C162367ro.A03(obj, j));
            } else {
                List A0b = AnonymousClass6CA.A0b(obj, j);
                if (A0b instanceof C188198yV) {
                    unmodifiableList = ((C188198yV) A0b).Bu0();
                } else {
                    if (!AnonymousClass6C9.A1N(AnonymousClass6YD.A00, A0b)) {
                        if (!(A0b instanceof C178638hr) || !(A0b instanceof C188238yZ)) {
                            unmodifiableList = Collections.unmodifiableList(A0b);
                        } else {
                            r3 = (AnonymousClass8T4) ((C188238yZ) A0b);
                            if (!r3.A00) {
                            }
                        }
                    }
                    i++;
                }
                C162367ro.A07(obj, j, unmodifiableList);
                i++;
            }
            r3.A00 = false;
            i++;
        }
        ((C128766Xj) obj).zzb.A02 = false;
    }

    public C169868Ay(C1445572a r1, C157887j3 r2, C181048m3 r3, C187848xu r4, C178628hq r5, C1445772c r6, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A0B = iArr;
        this.A0D = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0A = z;
        this.A0C = iArr2;
        this.A02 = i3;
        this.A03 = i4;
        this.A08 = r5;
        this.A05 = r2;
        this.A09 = r6;
        this.A04 = r1;
        this.A07 = r4;
        this.A06 = r3;
    }

    public static int A06(C156607gu r3, byte[] bArr, int i) {
        int A042 = A04(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw new C140576ty("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i2 == 0) {
            r3.A02 = "";
            return A042;
        } else {
            r3.A02 = AnonymousClass6CA.A0W(C155597fA.A02, bArr, A042, i2);
            return A042 + i2;
        }
    }

    public static int A08(C156607gu r4, byte[] bArr, int i) {
        int A042 = A04(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A042) {
                throw new C140576ty("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                r4.A02 = C172538Lp.A00;
                return A042;
            } else {
                C172538Lp.A00(A042, A042 + i2, length);
                r4.A02 = new C128876Xu(C172538Lp.A01.BtP(bArr, A042, i2));
                return A042 + i2;
            }
        } else {
            throw new C140576ty("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static long A0C(Object obj, long j) {
        return ((Number) C162367ro.A03(obj, j)).longValue();
    }

    public static Object A0F(Object obj, int i) {
        return C162367ro.A03(obj, (long) (i & 1048575));
    }

    public static Field A0G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A0q = AnonymousClass6C7.A0q(arrays, AnonymousClass6C7.A06(str) + 40 + name.length());
            AnonymousClass6C9.A19(A0q, str);
            A0q.append(name);
            throw AnonymousClass002.A0E(AnonymousClass000.A0V(" not found. Known fields are ", arrays, A0q));
        }
    }

    public static List A0H(int i, Object obj) {
        return (List) C162367ro.A03(obj, (long) (i & 1048575));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        r6 = r3[r2 + 2];
        r0 = (long) (1048575 & r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        if (r0 == 1048575) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
        r4 = X.C162367ro.A01;
        r4.A09(r13, r0, (1 << (r6 >>> 20)) | r4.A04(r13, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d3, code lost:
        X.C162367ro.A07(r13, r8, X.C162367ro.A03(r14, r8));
        X.C162367ro.A01.A09(r13, X.AnonymousClass6C7.A0O(r3, r2), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Btg(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r14.getClass()
            r2 = 0
        L_0x0004:
            int[] r3 = r12.A0B
            int r0 = r3.length
            r7 = r13
            if (r2 >= r0) goto L_0x01e5
            int r0 = r2 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r8 = (long) r0
            r4 = r3[r2]
            int r0 = X.AnonymousClass6C8.A07(r1)
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0089;
                case 2: goto L_0x0099;
                case 3: goto L_0x0099;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0099;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00c9;
                case 9: goto L_0x001f;
                case 10: goto L_0x00c9;
                case 11: goto L_0x00a9;
                case 12: goto L_0x00a9;
                case 13: goto L_0x00a9;
                case 14: goto L_0x0099;
                case 15: goto L_0x00a9;
                case 16: goto L_0x0099;
                case 17: goto L_0x001f;
                case 18: goto L_0x00f6;
                case 19: goto L_0x00f6;
                case 20: goto L_0x00f6;
                case 21: goto L_0x00f6;
                case 22: goto L_0x00f6;
                case 23: goto L_0x00f6;
                case 24: goto L_0x00f6;
                case 25: goto L_0x00f6;
                case 26: goto L_0x00f6;
                case 27: goto L_0x00f6;
                case 28: goto L_0x00f6;
                case 29: goto L_0x00f6;
                case 30: goto L_0x00f6;
                case 31: goto L_0x00f6;
                case 32: goto L_0x00f6;
                case 33: goto L_0x00f6;
                case 34: goto L_0x00f6;
                case 35: goto L_0x00f6;
                case 36: goto L_0x00f6;
                case 37: goto L_0x00f6;
                case 38: goto L_0x00f6;
                case 39: goto L_0x00f6;
                case 40: goto L_0x00f6;
                case 41: goto L_0x00f6;
                case 42: goto L_0x00f6;
                case 43: goto L_0x00f6;
                case 44: goto L_0x00f6;
                case 45: goto L_0x00f6;
                case 46: goto L_0x00f6;
                case 47: goto L_0x00f6;
                case 48: goto L_0x00f6;
                case 49: goto L_0x00f6;
                case 50: goto L_0x01b3;
                case 51: goto L_0x01c6;
                case 52: goto L_0x01c6;
                case 53: goto L_0x01c6;
                case 54: goto L_0x01c6;
                case 55: goto L_0x01c6;
                case 56: goto L_0x01c6;
                case 57: goto L_0x01c6;
                case 58: goto L_0x01c6;
                case 59: goto L_0x01c6;
                case 60: goto L_0x0041;
                case 61: goto L_0x01cd;
                case 62: goto L_0x01cd;
                case 63: goto L_0x01cd;
                case 64: goto L_0x01cd;
                case 65: goto L_0x01cd;
                case 66: goto L_0x01cd;
                case 67: goto L_0x01cd;
                case 68: goto L_0x0041;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r2 = r2 + 3
            goto L_0x0004
        L_0x001f:
            long r0 = X.AnonymousClass6C8.A0T(r3, r2)
            boolean r4 = r12.A0Q(r2, r14)
            if (r4 == 0) goto L_0x001c
            java.lang.Object r5 = X.C162367ro.A03(r13, r0)
            java.lang.Object r4 = X.C162367ro.A03(r14, r0)
            if (r5 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = X.C155597fA.A00(r5, r4)
        L_0x0039:
            X.C162367ro.A07(r13, r0, r4)
            goto L_0x00d6
        L_0x003e:
            if (r4 == 0) goto L_0x001c
            goto L_0x0039
        L_0x0041:
            int r0 = r2 + 1
            r0 = r3[r0]
            r6 = r3[r2]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            boolean r4 = r12.A0R(r14, r6, r2)
            if (r4 == 0) goto L_0x001c
            boolean r4 = r12.A0R(r13, r6, r2)
            if (r4 == 0) goto L_0x0077
            java.lang.Object r5 = X.C162367ro.A03(r13, r0)
        L_0x005b:
            java.lang.Object r4 = X.C162367ro.A03(r14, r0)
            if (r5 == 0) goto L_0x0074
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = X.C155597fA.A00(r5, r4)
        L_0x0067:
            X.C162367ro.A07(r13, r0, r4)
            long r0 = X.AnonymousClass6C7.A0O(r3, r2)
            X.7bl r3 = X.C162367ro.A01
            r3.A09(r13, r0, r6)
            goto L_0x001c
        L_0x0074:
            if (r4 == 0) goto L_0x001c
            goto L_0x0067
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bl r6 = X.C162367ro.A01
            double r10 = r6.A02(r14, r8)
            r6.A07(r7, r8, r10)
            goto L_0x00d6
        L_0x0089:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bl r1 = X.C162367ro.A01
            float r0 = r1.A03(r14, r8)
            r1.A08(r13, r8, r0)
            goto L_0x00d6
        L_0x0099:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bl r6 = X.C162367ro.A01
            long r10 = r6.A05(r14, r8)
            r6.A0A(r7, r8, r10)
            goto L_0x00d6
        L_0x00a9:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bl r1 = X.C162367ro.A01
            int r0 = r1.A04(r14, r8)
            r1.A09(r13, r8, r0)
            goto L_0x00d6
        L_0x00b9:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            X.7bl r1 = X.C162367ro.A01
            boolean r0 = r1.A0C(r14, r8)
            r1.A0B(r13, r8, r0)
            goto L_0x00d6
        L_0x00c9:
            boolean r0 = r12.A0Q(r2, r14)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = X.C162367ro.A03(r14, r8)
            X.C162367ro.A07(r13, r8, r0)
        L_0x00d6:
            int r0 = r2 + 2
            r6 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r6
            long r0 = (long) r0
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x001c
            int r3 = r6 >>> 20
            r5 = 1
            int r5 = r5 << r3
            X.7bl r4 = X.C162367ro.A01
            int r3 = r4.A04(r13, r0)
            r5 = r5 | r3
            r4.A09(r13, r0, r5)
            goto L_0x001c
        L_0x00f6:
            X.7j3 r0 = r12.A05
            boolean r0 = r0 instanceof X.AnonymousClass6YC
            if (r0 == 0) goto L_0x0127
            java.lang.Object r5 = X.C162367ro.A03(r13, r8)
            X.8yZ r5 = (X.C188238yZ) r5
            java.util.List r4 = X.AnonymousClass6CA.A0b(r14, r8)
            int r3 = r5.size()
            int r1 = r4.size()
            if (r3 <= 0) goto L_0x0122
            if (r1 <= 0) goto L_0x0121
            r0 = r5
            X.8T4 r0 = (X.AnonymousClass8T4) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x011e
            int r1 = r1 + r3
            X.8yZ r5 = r5.BtF(r1)
        L_0x011e:
            r5.addAll(r4)
        L_0x0121:
            r4 = r5
        L_0x0122:
            X.C162367ro.A07(r13, r8, r4)
            goto L_0x001c
        L_0x0127:
            java.util.List r3 = X.AnonymousClass6CA.A0b(r14, r8)
            int r5 = r3.size()
            java.util.List r4 = X.AnonymousClass6CA.A0b(r13, r8)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0172
            boolean r0 = r4 instanceof X.C188198yV
            if (r0 == 0) goto L_0x015e
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r5)
            X.6Xq r4 = new X.6Xq
            r4.<init>(r0)
        L_0x0146:
            X.C162367ro.A07(r13, r8, r4)
        L_0x0149:
            int r1 = r4.size()
            int r0 = r3.size()
            if (r1 <= 0) goto L_0x0159
            if (r0 <= 0) goto L_0x0158
            r4.addAll(r3)
        L_0x0158:
            r3 = r4
        L_0x0159:
            X.C162367ro.A07(r13, r8, r3)
            goto L_0x001c
        L_0x015e:
            boolean r0 = r4 instanceof X.C178638hr
            if (r0 == 0) goto L_0x016d
            boolean r0 = r4 instanceof X.C188238yZ
            if (r0 == 0) goto L_0x016d
            X.8yZ r4 = (X.C188238yZ) r4
            X.8yZ r4 = r4.BtF(r5)
            goto L_0x0146
        L_0x016d:
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r5)
            goto L_0x0146
        L_0x0172:
            java.lang.Class r0 = X.AnonymousClass6YD.A00
            boolean r0 = X.AnonymousClass6C9.A1N(r0, r4)
            if (r0 == 0) goto L_0x0186
            java.util.ArrayList r1 = X.AnonymousClass6C8.A0i(r4, r5)
        L_0x017e:
            r1.addAll(r4)
            X.C162367ro.A07(r13, r8, r1)
            r4 = r1
            goto L_0x0149
        L_0x0186:
            boolean r0 = r4 instanceof X.AnonymousClass8T5
            if (r0 == 0) goto L_0x0194
            java.util.ArrayList r0 = X.AnonymousClass6C8.A0i(r4, r5)
            X.6Xq r1 = new X.6Xq
            r1.<init>(r0)
            goto L_0x017e
        L_0x0194:
            boolean r0 = r4 instanceof X.C178638hr
            if (r0 == 0) goto L_0x0149
            boolean r0 = r4 instanceof X.C188238yZ
            if (r0 == 0) goto L_0x0149
            r1 = r4
            X.8yZ r1 = (X.C188238yZ) r1
            r0 = r1
            X.8T4 r0 = (X.AnonymousClass8T4) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0149
            int r0 = r4.size()
            int r0 = r0 + r5
            X.8yZ r4 = r1.BtF(r0)
            X.C162367ro.A07(r13, r8, r4)
            goto L_0x0149
        L_0x01b3:
            X.8m3 r3 = r12.A06
            java.lang.Object r1 = X.C162367ro.A03(r13, r8)
            java.lang.Object r0 = X.C162367ro.A03(r14, r8)
            java.lang.Object r0 = r3.BtI(r1, r0)
            X.C162367ro.A07(r13, r8, r0)
            goto L_0x001c
        L_0x01c6:
            boolean r0 = r12.A0R(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
            goto L_0x01d3
        L_0x01cd:
            boolean r0 = r12.A0R(r14, r4, r2)
            if (r0 == 0) goto L_0x001c
        L_0x01d3:
            java.lang.Object r0 = X.C162367ro.A03(r14, r8)
            X.C162367ro.A07(r13, r8, r0)
            long r0 = X.AnonymousClass6C7.A0O(r3, r2)
            X.7bl r3 = X.C162367ro.A01
            r3.A09(r13, r0, r4)
            goto L_0x001c
        L_0x01e5:
            X.C162497sE.A0T(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169868Ay.Btg(java.lang.Object, java.lang.Object):void");
    }

    public final boolean Bty(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A02) {
            int i4 = this.A0C[i3];
            int[] iArr = this.A0B;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0E.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0Q(i4, obj)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        z = A0R(obj, i5, i4);
                    } else if (i10 != 49) {
                        if (i10 == 50 && !((AbstractMap) A0F(obj, i6)).isEmpty()) {
                            throw new NoSuchMethodError();
                        }
                        i3++;
                        i = i8;
                    }
                }
                List A0H = A0H(i6, obj);
                if (!A0H.isEmpty()) {
                    C186268v1 A0P = A0P(i4);
                    for (int i11 = 0; i11 < A0H.size(); i11++) {
                        if (!A0P.Bty(A0H.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i3++;
                i = i8;
            } else if (i8 == 1048575) {
                z = A0Q(i4, obj);
            } else {
                z = i2 & i9;
            }
            if (z && !A0P(i4).Bty(A0F(obj, i6))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }
}
