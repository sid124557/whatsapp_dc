package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: X.8AI  reason: invalid class name */
public final class AnonymousClass8AI implements C185828uJ {
    public static final Unsafe A0E = C162327ri.A00();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass72Q A04;
    public final C157867j1 A05;
    public final C154027cS A06;
    public final C187798xp A07;
    public final AnonymousClass72R A08;
    public final AnonymousClass72T A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final Object[] A0D;

    public static int A01(C156597gt r8, C160547nq r9, byte[] bArr, int i, int i2, int i3) {
        Object r0;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C156597gt r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A062 = A06(r8, bArr, i2);
                r9.A01(i, Long.valueOf(r8.A01));
                return A062;
            } else if (i5 == 1) {
                r9.A01(i, Long.valueOf(AnonymousClass6C7.A0N(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A052 = A05(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A052) {
                        if (i6 == 0) {
                            r0 = AnonymousClass8Ln.A00;
                        } else {
                            AnonymousClass8Ln.A00(A052, A052 + i6, length);
                            byte[] bArr3 = new byte[i6];
                            System.arraycopy(bArr, A052, bArr3, 0, i6);
                            r0 = new AnonymousClass6VD(bArr3);
                        }
                        r9.A01(i, r0);
                        return A052 + i6;
                    }
                    throw new AnonymousClass6u4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new AnonymousClass6u4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                C160547nq A002 = C160547nq.A00();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A05(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A01(r3, A002, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new AnonymousClass6u4("Failed to parse the message.");
                }
                r9.A01(i, A002);
                return i4;
            } else if (i5 == 5) {
                r9.A01(i, Integer.valueOf(AnonymousClass6C7.A0B(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new AnonymousClass6u4("Protocol message contained an invalid tag (zero).");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C156597gt r6, X.C185828uJ r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A07(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.Btu()
            int r5 = r5 + r4
            r0.Bu8(r1, r2, r3, r4, r5)
            r7.Bu3(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6u4 r0 = new X.6u4
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.A00(X.7gt, X.8uJ, byte[], int, int):int");
    }

    public static int A04(C156597gt r14, byte[] bArr, int i) {
        int i2;
        int i3;
        byte b;
        int A052 = A05(r14, bArr, i);
        int i4 = r14.A00;
        if (i4 < 0) {
            throw new AnonymousClass6u4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i4 == 0) {
            r14.A02 = "";
            return A052;
        } else {
            int i5 = A052;
            int length = bArr.length;
            if ((A052 | i4 | ((length - A052) - i4)) >= 0) {
                int i6 = A052 + i4;
                char[] cArr = new char[i4];
                int i7 = 0;
                while (i2 < i6) {
                    byte b2 = bArr[i2];
                    if (b2 < 0) {
                        break;
                    }
                    i5 = i2 + 1;
                    cArr[i3] = (char) b2;
                    i7 = i3 + 1;
                }
                while (i2 < i6) {
                    int i8 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (b3 >= 0) {
                        int i9 = i3 + 1;
                        cArr[i3] = (char) b3;
                        i2 = i8;
                        while (true) {
                            i3 = i9;
                            if (i2 >= i6 || (b = bArr[i2]) < 0) {
                                break;
                            }
                            i2++;
                            i9++;
                            cArr[i3] = (char) b;
                        }
                    } else {
                        if (b3 < -32) {
                            if (i8 < i6) {
                                i2 = i8 + 1;
                                int i10 = i3 + 1;
                                byte b4 = bArr[i8];
                                if (b3 < -62 || b4 > -65) {
                                    throw new AnonymousClass6u4("Protocol message had invalid UTF-8.");
                                }
                                cArr[i3] = (char) (((b3 & 31) << 6) | (b4 & 63));
                                i3 = i10;
                            }
                        } else if (b3 < -16) {
                            if (i8 < i6 - 1) {
                                int i11 = i8 + 1;
                                i2 = i11 + 1;
                                int i12 = i3 + 1;
                                byte b5 = bArr[i8];
                                byte b6 = bArr[i11];
                                if (b5 <= -65) {
                                    if (b3 == -32) {
                                        if (b5 >= -96) {
                                            b3 = -32;
                                        }
                                    } else if (b3 == -19) {
                                        if (b5 < -96) {
                                            b3 = -19;
                                        }
                                    }
                                    if (b6 <= -65) {
                                        cArr[i3] = (char) (((b3 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                        i3 = i12;
                                    }
                                }
                                throw new AnonymousClass6u4("Protocol message had invalid UTF-8.");
                            }
                        } else if (i8 < i6 - 2) {
                            int i13 = i8 + 1;
                            int i14 = i13 + 1;
                            i2 = i14 + 1;
                            byte b7 = bArr[i8];
                            byte b8 = bArr[i13];
                            byte b9 = bArr[i14];
                            if (b7 > -65 || AnonymousClass6C9.A08(b3, b7) != 0 || b8 > -65 || b9 > -65) {
                                throw new AnonymousClass6u4("Protocol message had invalid UTF-8.");
                            }
                            cArr[i3 + 1] = (char) ((AnonymousClass6C9.A0H(cArr, b8, ((b3 & 7) << 18) | ((b7 & 63) << 12), b9, i3) & 1023) + 56320);
                            i3 += 2;
                        }
                        throw new AnonymousClass6u4("Protocol message had invalid UTF-8.");
                    }
                }
                r14.A02 = new String(cArr, 0, i3);
                return A052 + i4;
            }
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1P(A1X, length, 0);
            AnonymousClass000.A1M(A1X, A052);
            AnonymousClass000.A1N(A1X, i4);
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", A1X));
        }
    }

    public static int A05(C156597gt r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A07(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A06(C156597gt r8, byte[] bArr, int i) {
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

    public static int A07(C156597gt r4, byte[] bArr, int i, int i2) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016c, code lost:
        if (r39 == false) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass8AI A08(X.AnonymousClass72Q r40, X.C157867j1 r41, X.C154027cS r42, X.C178488hc r43, X.AnonymousClass72R r44, X.AnonymousClass72T r45) {
        /*
            r8 = r43
            boolean r0 = r8 instanceof X.AnonymousClass8AB
            if (r0 == 0) goto L_0x036a
            X.8AB r8 = (X.AnonymousClass8AB) r8
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            r2 = 2
            if (r0 != r1) goto L_0x0011
            r2 = 1
        L_0x0011:
            r1 = 2
            r0 = 0
            boolean r39 = X.AnonymousClass000.A1U(r2, r1)
            java.lang.String r13 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            int r27 = r13.length()
            char r0 = r13.charAt(r0)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r5) goto L_0x0031
            r0 = 1
        L_0x0027:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0032
            r0 = r1
            goto L_0x0027
        L_0x0031:
            r1 = 1
        L_0x0032:
            int r12 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r5) goto L_0x0051
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003e:
            int r1 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r5) goto L_0x004e
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r12 = r1
            goto L_0x003e
        L_0x004e:
            int r0 = r0 << r2
            r3 = r3 | r0
            r12 = r1
        L_0x0051:
            if (r3 != 0) goto L_0x0249
            int[] r17 = A0F
            r3 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r1 = 0
            r0 = 0
            r16 = 0
        L_0x005d:
            sun.misc.Unsafe r26 = A0E
            java.lang.Object[] r11 = r8.A02
            X.8xp r4 = r8.A01
            r29 = r4
            java.lang.Class r25 = r29.getClass()
            int r4 = r7 * 3
            int[] r4 = new int[r4]
            r24 = r4
            int r7 = r7 + r7
            java.lang.Object[] r10 = new java.lang.Object[r7]
            int r38 = r0 + r6
            r23 = r0
            r22 = r38
            r21 = 0
            r20 = 0
        L_0x007c:
            r4 = r27
            if (r12 >= r4) goto L_0x034e
            int r4 = r12 + 1
            char r9 = r13.charAt(r12)
            if (r9 < r5) goto L_0x009f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x008c:
            int r7 = r4 + 1
            char r4 = r13.charAt(r4)
            if (r4 < r5) goto L_0x009c
            int r9 = X.AnonymousClass6C9.A09(r4, r6, r9)
            int r6 = r6 + 13
            r4 = r7
            goto L_0x008c
        L_0x009c:
            int r4 = r4 << r6
            r9 = r9 | r4
            r4 = r7
        L_0x009f:
            int r12 = r4 + 1
            char r8 = r13.charAt(r4)
            if (r8 < r5) goto L_0x00c1
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x00ab:
            int r7 = r12 + 1
            char r6 = r13.charAt(r12)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r4) goto L_0x00be
            int r8 = X.AnonymousClass6C9.A09(r6, r5, r8)
            int r5 = r5 + 13
            r12 = r7
            goto L_0x00ab
        L_0x00be:
            int r6 = r6 << r5
            r8 = r8 | r6
            r12 = r7
        L_0x00c1:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r4 = r8 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x00cd
            int r4 = r20 + 1
            r17[r20] = r21
            r20 = r4
        L_0x00cd:
            r4 = 51
            if (r7 < r4) goto L_0x00f3
            int r4 = r12 + 1
            char r5 = r13.charAt(r12)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x01c9
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00e0:
            int r14 = r4 + 1
            char r12 = r13.charAt(r4)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r4) goto L_0x01c6
            int r5 = X.AnonymousClass6C9.A09(r12, r6, r5)
            int r6 = r6 + 13
            r4 = r14
            goto L_0x00e0
        L_0x00f3:
            int r18 = r16 + 1
            r5 = r11[r16]
            java.lang.String r5 = (java.lang.String) r5
            r4 = r25
            java.lang.reflect.Field r5 = A09(r4, r5)
            r4 = 9
            if (r7 == r4) goto L_0x017f
            r4 = 17
            if (r7 == r4) goto L_0x017f
            r4 = 27
            if (r7 == r4) goto L_0x016e
            r4 = 49
            if (r7 == r4) goto L_0x016e
            r4 = 12
            if (r7 == r4) goto L_0x016c
            r4 = 30
            if (r7 == r4) goto L_0x016c
            r4 = 44
            if (r7 == r4) goto L_0x016c
            r4 = 50
            if (r7 != r4) goto L_0x013a
            int r14 = r23 + 1
            r17[r23] = r21
            int r6 = r21 / 3
            int r6 = r6 + r6
            int r15 = r18 + 1
            r4 = r11[r18]
            r10[r6] = r4
            r4 = r8 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x017a
            int r18 = r15 + 1
            int r6 = r6 + 1
            r4 = r11[r15]
            r10[r6] = r4
            r23 = r14
        L_0x013a:
            r4 = r26
            long r4 = r4.objectFieldOffset(r5)
            int r6 = (int) r4
            r19 = r6
            r5 = r8 & 4096(0x1000, float:5.74E-42)
            r4 = 4096(0x1000, float:5.74E-42)
            if (r5 != r4) goto L_0x018d
            r4 = 17
            if (r7 > r4) goto L_0x018d
            int r4 = r12 + 1
            char r6 = r13.charAt(r12)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x018b
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x015c:
            int r12 = r4 + 1
            char r4 = r13.charAt(r4)
            if (r4 < r14) goto L_0x01a0
            int r6 = X.AnonymousClass6C9.A09(r4, r5, r6)
            int r5 = r5 + 13
            r4 = r12
            goto L_0x015c
        L_0x016c:
            if (r39 != 0) goto L_0x013a
        L_0x016e:
            int r4 = r21 / 3
            int r15 = r18 + 1
            int r4 = r4 + r4
            int r6 = r4 + 1
            r4 = r11[r18]
            r10[r6] = r4
            goto L_0x017c
        L_0x017a:
            r23 = r14
        L_0x017c:
            r18 = r15
            goto L_0x013a
        L_0x017f:
            int r4 = r21 / 3
            int r4 = r4 + r4
            int r6 = r4 + 1
            java.lang.Class r4 = r5.getType()
            r10[r6] = r4
            goto L_0x013a
        L_0x018b:
            r12 = r4
            goto L_0x01a2
        L_0x018d:
            r5 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 18
            if (r7 < r6) goto L_0x01b8
            r6 = 49
            if (r7 > r6) goto L_0x01b8
            int r6 = r22 + 1
            r17[r22] = r19
            r22 = r6
            goto L_0x01b8
        L_0x01a0:
            int r4 = r4 << r5
            r6 = r6 | r4
        L_0x01a2:
            int r14 = r3 + r3
            int r4 = r6 / 32
            int r14 = r14 + r4
            r5 = r11[r14]
            boolean r4 = r5 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x01bb
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x01af:
            r4 = r26
            long r14 = r4.objectFieldOffset(r5)
            int r4 = (int) r14
            int r5 = r6 % 32
        L_0x01b8:
            r16 = r18
            goto L_0x020b
        L_0x01bb:
            java.lang.String r5 = (java.lang.String) r5
            r4 = r25
            java.lang.reflect.Field r5 = A09(r4, r5)
            r11[r14] = r5
            goto L_0x01af
        L_0x01c6:
            int r12 = r12 << r6
            r5 = r5 | r12
            r4 = r14
        L_0x01c9:
            int r6 = r7 + -51
            r12 = r4
            r4 = 9
            if (r6 == r4) goto L_0x01da
            r4 = 17
            if (r6 == r4) goto L_0x01da
            r4 = 12
            if (r6 != r4) goto L_0x01e7
            if (r39 != 0) goto L_0x01e7
        L_0x01da:
            int r4 = r21 / 3
            int r14 = r16 + 1
            int r4 = r4 + r4
            int r6 = r4 + 1
            r4 = r11[r16]
            r10[r6] = r4
            r16 = r14
        L_0x01e7:
            int r5 = r5 + r5
            r6 = r11[r5]
            boolean r4 = r6 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x023e
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
        L_0x01f0:
            r4 = r26
            long r14 = r4.objectFieldOffset(r6)
            int r4 = (int) r14
            r19 = r4
            int r6 = r5 + 1
            r5 = r11[r6]
            boolean r4 = r5 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x0233
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x0203:
            r4 = r26
            long r5 = r4.objectFieldOffset(r5)
            int r4 = (int) r5
            r5 = 0
        L_0x020b:
            int r15 = r21 + 1
            r24[r21] = r9
            int r14 = r15 + 1
            r6 = r8 & 512(0x200, float:7.175E-43)
            r9 = 0
            if (r6 == 0) goto L_0x0218
            r9 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0218:
            r6 = r8 & 256(0x100, float:3.59E-43)
            r8 = 0
            if (r6 == 0) goto L_0x021f
            r8 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x021f:
            r8 = r8 | r9
            int r6 = r7 << 20
            r8 = r8 | r6
            r8 = r8 | r19
            r24[r15] = r8
            int r21 = r14 + 1
            int r5 = r5 << 20
            r5 = r5 | r4
            r24[r14] = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x007c
        L_0x0233:
            java.lang.String r5 = (java.lang.String) r5
            r4 = r25
            java.lang.reflect.Field r5 = A09(r4, r5)
            r11[r6] = r5
            goto L_0x0203
        L_0x023e:
            java.lang.String r6 = (java.lang.String) r6
            r4 = r25
            java.lang.reflect.Field r6 = A09(r4, r6)
            r11[r5] = r6
            goto L_0x01f0
        L_0x0249:
            int r0 = r12 + 1
            char r3 = r13.charAt(r12)
            if (r3 < r5) goto L_0x0268
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0255:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0265
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0255
        L_0x0265:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x0268:
            int r4 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r5) goto L_0x0287
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0274:
            int r1 = r4 + 1
            char r0 = r13.charAt(r4)
            if (r0 < r5) goto L_0x0284
            int r9 = X.AnonymousClass6C9.A09(r0, r2, r9)
            int r2 = r2 + 13
            r4 = r1
            goto L_0x0274
        L_0x0284:
            int r0 = r0 << r2
            r9 = r9 | r0
            r4 = r1
        L_0x0287:
            int r0 = r4 + 1
            char r2 = r13.charAt(r4)
            if (r2 < r5) goto L_0x02a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L_0x0293:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x02a3
            int r2 = X.AnonymousClass6C9.A09(r0, r4, r2)
            int r4 = r4 + 13
            r0 = r1
            goto L_0x0293
        L_0x02a3:
            int r0 = r0 << r4
            r2 = r2 | r0
            r0 = r1
        L_0x02a6:
            int r7 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r5) goto L_0x02c5
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02b2:
            int r4 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r5) goto L_0x02c2
            int r1 = X.AnonymousClass6C9.A09(r0, r6, r1)
            int r6 = r6 + 13
            r7 = r4
            goto L_0x02b2
        L_0x02c2:
            int r0 = r0 << r6
            r1 = r1 | r0
            r7 = r4
        L_0x02c5:
            int r0 = r7 + 1
            char r7 = r13.charAt(r7)
            if (r7 < r5) goto L_0x02e4
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02d1:
            int r4 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x02e1
            int r7 = X.AnonymousClass6C9.A09(r0, r6, r7)
            int r6 = r6 + 13
            r0 = r4
            goto L_0x02d1
        L_0x02e1:
            int r0 = r0 << r6
            r7 = r7 | r0
            r0 = r4
        L_0x02e4:
            int r11 = r0 + 1
            char r6 = r13.charAt(r0)
            if (r6 < r5) goto L_0x0303
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x02f0:
            int r4 = r11 + 1
            char r0 = r13.charAt(r11)
            if (r0 < r5) goto L_0x0300
            int r6 = X.AnonymousClass6C9.A09(r0, r10, r6)
            int r10 = r10 + 13
            r11 = r4
            goto L_0x02f0
        L_0x0300:
            int r0 = r0 << r10
            r6 = r6 | r0
            r11 = r4
        L_0x0303:
            int r0 = r11 + 1
            char r11 = r13.charAt(r11)
            if (r11 < r5) goto L_0x0322
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x030f:
            int r4 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x031f
            int r11 = X.AnonymousClass6C9.A09(r0, r10, r11)
            int r10 = r10 + 13
            r0 = r4
            goto L_0x030f
        L_0x031f:
            int r0 = r0 << r10
            r11 = r11 | r0
            r0 = r4
        L_0x0322:
            int r12 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0341
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x032e:
            int r10 = r12 + 1
            char r4 = r13.charAt(r12)
            if (r4 < r5) goto L_0x033e
            int r0 = X.AnonymousClass6C9.A09(r4, r14, r0)
            int r14 = r14 + 13
            r12 = r10
            goto L_0x032e
        L_0x033e:
            int r4 = r4 << r14
            r0 = r0 | r4
            r12 = r10
        L_0x0341:
            int r4 = r0 + r6
            int r4 = r4 + r11
            int[] r4 = new int[r4]
            r17 = r4
            int r16 = r3 + r3
            int r16 = r16 + r9
            goto L_0x005d
        L_0x034e:
            X.8AI r25 = new X.8AI
            r26 = r40
            r27 = r41
            r28 = r42
            r30 = r44
            r31 = r45
            r32 = r24
            r33 = r17
            r34 = r10
            r35 = r2
            r36 = r1
            r37 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r25
        L_0x036a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.A08(X.72Q, X.7j1, X.7cS, X.8hc, X.72R, X.72T):X.8AI");
    }

    public final int A0A(int i) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        if ((r21 & r16) == 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r2 = X.C155637fE.A00(r6.getObject(r7, r0), r10.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        r6.putObject(r7, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        r21 = r21 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0117, code lost:
        r8 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0123, code lost:
        r8 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0169, code lost:
        r2 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0179, code lost:
        r6.putInt(r7, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018a, code lost:
        r6.putLong(r7, r0, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0B(X.C156597gt r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r8 = r41
            sun.misc.Unsafe r6 = A0E
            r13 = 0
            r3 = -1
            r5 = 0
            r21 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            r11 = r37
            r7 = r39
            r14 = r42
            r22 = r43
            if (r8 >= r14) goto L_0x026e
            int r4 = r8 + 1
            r9 = r40
            byte r13 = r40[r8]
            r10 = r38
            if (r13 >= 0) goto L_0x0026
            int r4 = A07(r10, r9, r13, r4)
            int r13 = r10.A00
        L_0x0026:
            int r20 = r13 >>> 3
            r8 = r13 & 7
            r1 = 3
            r0 = r20
            if (r0 <= r3) goto L_0x025d
            int r5 = r5 / r1
            int r1 = r11.A00
            if (r0 < r1) goto L_0x025b
            int r1 = r11.A01
            if (r0 > r1) goto L_0x025b
            int[] r12 = r11.A0B
            int r0 = r12.length
            int r0 = r0 / 3
            int r3 = r0 + -1
        L_0x003f:
            if (r5 > r3) goto L_0x025b
            int r0 = r3 + r5
            int r16 = r0 >>> 1
            int r15 = r16 * 3
            r1 = r12[r15]
            r0 = r20
            if (r0 != r1) goto L_0x0251
            r5 = r15
        L_0x004e:
            r0 = -1
            if (r5 == r0) goto L_0x025b
            int[] r0 = r11.A0B
            r16 = r0
            int r0 = r5 + 1
            r19 = r16[r0]
            int r0 = r19 >>> 20
            r12 = r0 & 255(0xff, float:3.57E-43)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r19 & r15
            long r0 = (long) r0
            r3 = 17
            if (r12 > r3) goto L_0x019b
            int r3 = r5 + 2
            r18 = r16[r3]
            int r3 = r18 >>> 20
            r17 = 1
            int r16 = r17 << r3
            r18 = r18 & r15
            r3 = r18
            if (r3 == r2) goto L_0x0197
            if (r2 == r15) goto L_0x007f
            long r2 = (long) r2
            r15 = r21
            r6.putInt(r7, r2, r15)
        L_0x007f:
            r2 = r18
            long r2 = (long) r2
            int r21 = r6.getInt(r7, r2)
        L_0x0086:
            r2 = 5
            switch(r12) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f8;
                case 4: goto L_0x0102;
                case 5: goto L_0x010b;
                case 6: goto L_0x011a;
                case 7: goto L_0x0126;
                case 8: goto L_0x0142;
                case 9: goto L_0x0155;
                case 10: goto L_0x0162;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x011a;
                case 14: goto L_0x010b;
                case 15: goto L_0x016d;
                case 16: goto L_0x017e;
                default: goto L_0x008a;
            }
        L_0x008a:
            r2 = 3
            if (r8 != r2) goto L_0x0265
            X.8uJ r3 = r11.A0E(r5)
            int r2 = r20 << 3
            r28 = r2 | 4
            X.8AI r3 = (X.AnonymousClass8AI) r3
            X.6VG r2 = new X.6VG
            r2.<init>()
            r23 = r10
            r25 = r9
            r27 = r14
            r22 = r3
            r24 = r2
            r26 = r4
            int r8 = r22.A0B(r23, r24, r25, r26, r27, r28)
            r3.Bu3(r2)
            r10.A02 = r2
        L_0x00b1:
            r2 = r21 & r16
            if (r2 == 0) goto L_0x0169
            java.lang.Object r3 = r6.getObject(r7, r0)
            java.lang.Object r2 = r10.A02
            java.lang.Object r2 = X.C155637fE.A00(r3, r2)
        L_0x00bf:
            r6.putObject(r7, r0, r2)
        L_0x00c2:
            r21 = r21 | r16
        L_0x00c4:
            r3 = r20
            r2 = r18
            goto L_0x000c
        L_0x00ca:
            r2 = r17
            if (r8 != r2) goto L_0x0265
            long r2 = X.AnonymousClass6C7.A0N(r9, r4)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            X.7ba r22 = X.C162327ri.A00
            long r26 = java.lang.Double.doubleToLongBits(r2)
            r23 = r7
            r24 = r0
            r22.A06(r23, r24, r26)
            goto L_0x0117
        L_0x00e4:
            if (r8 != r2) goto L_0x0265
            int r2 = X.AnonymousClass6C7.A0B(r9, r4)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            X.7ba r3 = X.C162327ri.A00
            int r2 = java.lang.Float.floatToIntBits(r2)
            r3.A05(r7, r0, r2)
            goto L_0x0123
        L_0x00f8:
            if (r8 != 0) goto L_0x0265
            int r8 = A06(r10, r9, r4)
            long r2 = r10.A01
            goto L_0x018a
        L_0x0102:
            if (r8 != 0) goto L_0x0265
            int r8 = A05(r10, r9, r4)
            int r2 = r10.A00
            goto L_0x0179
        L_0x010b:
            r2 = r17
            if (r8 != r2) goto L_0x0265
            long r10 = X.AnonymousClass6C7.A0N(r9, r4)
            r8 = r0
            r6.putLong(r7, r8, r10)
        L_0x0117:
            int r8 = r4 + 8
            goto L_0x00c2
        L_0x011a:
            if (r8 != r2) goto L_0x0265
            int r2 = X.AnonymousClass6C7.A0B(r9, r4)
            r6.putInt(r7, r0, r2)
        L_0x0123:
            int r8 = r4 + 4
            goto L_0x00c2
        L_0x0126:
            if (r8 != 0) goto L_0x0265
            int r8 = A06(r10, r9, r4)
            long r2 = r10.A01
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1S(r4)
            boolean r2 = X.C162327ri.A03
            if (r2 == 0) goto L_0x013e
            X.C162327ri.A04(r7, r0, r3)
            goto L_0x00c2
        L_0x013e:
            X.C162327ri.A05(r7, r0, r3)
            goto L_0x00c2
        L_0x0142:
            r2 = 2
            if (r8 != r2) goto L_0x0265
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r19
            if (r2 != 0) goto L_0x0150
            int r8 = A03(r10, r9, r4)
            goto L_0x0169
        L_0x0150:
            int r8 = A04(r10, r9, r4)
            goto L_0x0169
        L_0x0155:
            r2 = 2
            if (r8 != r2) goto L_0x0265
            X.8uJ r2 = r11.A0E(r5)
            int r8 = A00(r10, r2, r9, r4, r14)
            goto L_0x00b1
        L_0x0162:
            r2 = 2
            if (r8 != r2) goto L_0x0265
            int r8 = A02(r10, r9, r4)
        L_0x0169:
            java.lang.Object r2 = r10.A02
            goto L_0x00bf
        L_0x016d:
            if (r8 != 0) goto L_0x0265
            int r8 = A05(r10, r9, r4)
            int r2 = r10.A00
            int r2 = X.AnonymousClass6C8.A08(r2)
        L_0x0179:
            r6.putInt(r7, r0, r2)
            goto L_0x00c2
        L_0x017e:
            if (r8 != 0) goto L_0x0265
            int r8 = A06(r10, r9, r4)
            long r2 = r10.A01
            long r2 = X.AnonymousClass6C7.A0G(r2)
        L_0x018a:
            r23 = r7
            r22 = r6
            r24 = r0
            r26 = r2
            r22.putLong(r23, r24, r26)
            goto L_0x00c2
        L_0x0197:
            r18 = r2
            goto L_0x0086
        L_0x019b:
            r3 = 27
            if (r12 != r3) goto L_0x01de
            r3 = 2
            if (r8 != r3) goto L_0x0263
            java.lang.Object r3 = r6.getObject(r7, r0)
            X.8yX r3 = (X.C188218yX) r3
            r8 = r3
            X.8T0 r8 = (X.AnonymousClass8T0) r8
            boolean r8 = r8.A00
            if (r8 != 0) goto L_0x01c0
            int r12 = r3.size()
            int r8 = r12 + r12
            if (r12 != 0) goto L_0x01b9
            r8 = 10
        L_0x01b9:
            X.8yX r3 = r3.Btt(r8)
            r6.putObject(r7, r0, r3)
        L_0x01c0:
            X.8uJ r7 = r11.A0E(r5)
            r18 = r2
            int r8 = A00(r10, r7, r9, r4, r14)
        L_0x01ca:
            java.lang.Object r0 = r10.A02
            r3.add(r0)
            if (r8 >= r14) goto L_0x00c4
            int r1 = A05(r10, r9, r8)
            int r0 = r10.A00
            if (r13 != r0) goto L_0x00c4
            int r8 = A00(r10, r7, r9, r1, r14)
            goto L_0x01ca
        L_0x01de:
            r18 = r2
            r2 = 49
            if (r12 > r2) goto L_0x0207
            r2 = r19
            long r2 = (long) r2
            r24 = r10
            r25 = r7
            r26 = r9
            r28 = r14
            r23 = r11
            r27 = r4
            r29 = r13
            r30 = r8
            r31 = r5
            r32 = r12
            r33 = r2
            r35 = r0
            int r8 = r23.A0D(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x0203:
            if (r8 != r4) goto L_0x00c4
            r4 = r8
            goto L_0x0265
        L_0x0207:
            r2 = 50
            if (r12 != r2) goto L_0x0232
            r2 = 2
            if (r8 != r2) goto L_0x0265
            java.lang.Object r5 = r6.getObject(r7, r0)
            r2 = r5
            X.8Tn r2 = (X.C174248Tn) r2
            boolean r2 = r2.zzb
            if (r2 != 0) goto L_0x022c
            X.8Tn r4 = X.C174248Tn.A00
            boolean r3 = r4.isEmpty()
            X.8Tn r2 = new X.8Tn
            if (r3 == 0) goto L_0x022e
            r2.<init>()
        L_0x0226:
            X.C154027cS.A00(r2, r5)
            r6.putObject(r7, r0, r2)
        L_0x022c:
            r0 = 0
            throw r0
        L_0x022e:
            r2.<init>(r4)
            goto L_0x0226
        L_0x0232:
            r24 = r10
            r25 = r7
            r26 = r9
            r28 = r14
            r31 = r8
            r32 = r19
            r33 = r12
            r34 = r5
            r35 = r0
            r23 = r11
            r27 = r4
            r29 = r13
            r30 = r20
            int r8 = r23.A0C(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0203
        L_0x0251:
            if (r0 >= r1) goto L_0x0257
            int r3 = r16 + -1
            goto L_0x003f
        L_0x0257:
            int r5 = r16 + 1
            goto L_0x003f
        L_0x025b:
            r5 = 0
            goto L_0x0267
        L_0x025d:
            int r5 = r11.A0A(r0)
            goto L_0x004e
        L_0x0263:
            r18 = r2
        L_0x0265:
            r2 = r18
        L_0x0267:
            r0 = r22
            if (r13 != r0) goto L_0x0293
            if (r43 == 0) goto L_0x0293
            r8 = r4
        L_0x026e:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r2 == r3) goto L_0x0279
            long r0 = (long) r2
            r2 = r21
            r6.putInt(r7, r0, r2)
        L_0x0279:
            int r4 = r11.A02
        L_0x027b:
            int r0 = r11.A03
            if (r4 >= r0) goto L_0x02af
            int[] r0 = r11.A0C
            r0 = r0[r4]
            int[] r1 = r11.A0B
            int r0 = r0 + 1
            r0 = r1[r0]
            r0 = r0 & r3
            long r0 = (long) r0
            X.7ba r2 = X.C162327ri.A00
            r2.A02(r7, r0)
            int r4 = r4 + 1
            goto L_0x027b
        L_0x0293:
            r3 = r7
            X.6V4 r3 = (X.AnonymousClass6V4) r3
            X.7nq r1 = r3.zzc
            X.7nq r0 = X.C160547nq.A04
            if (r1 != r0) goto L_0x02a2
            X.7nq r1 = X.C160547nq.A00()
            r3.zzc = r1
        L_0x02a2:
            r7 = r10
            r12 = r14
            r8 = r1
            r10 = r13
            r11 = r4
            int r8 = A01(r7, r8, r9, r10, r11, r12)
            r3 = r20
            goto L_0x000c
        L_0x02af:
            if (r43 != 0) goto L_0x02b4
            if (r8 != r14) goto L_0x02bb
            return r8
        L_0x02b4:
            if (r8 > r14) goto L_0x02bb
            r0 = r22
            if (r13 != r0) goto L_0x02bb
            return r8
        L_0x02bb:
            java.lang.String r1 = "Failed to parse the message."
            X.6u4 r0 = new X.6u4
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.A0B(X.7gt, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0092, code lost:
        if (r5.getInt(r9, r2) != r6) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        r8 = r5.getObject(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
        if (r8 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        r4 = X.C155637fE.A00(r8, r10.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        r5.putObject(r9, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r5.putInt(r9, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        r5.putObject(r9, r0, r4);
        r5.putInt(r9, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0125, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r5.putObject(r9, r0, r4);
        r5.putInt(r9, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        return r22 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014c, code lost:
        r5.putObject(r9, r0, r4);
        r5.putInt(r9, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0154, code lost:
        return r22 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0C(X.C156597gt r19, java.lang.Object r20, byte[] r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30) {
        /*
            r18 = this;
            r7 = r22
            sun.misc.Unsafe r5 = A0E
            r13 = r18
            int[] r0 = r13.A0B
            r14 = r29
            long r2 = X.AnonymousClass6C7.A0O(r0, r14)
            r11 = 5
            r4 = 2
            r10 = r19
            r8 = r21
            r15 = r23
            r6 = r25
            r12 = r26
            r0 = r30
            r9 = r20
            switch(r28) {
                case 51: goto L_0x013d;
                case 52: goto L_0x0126;
                case 53: goto L_0x00fe;
                case 54: goto L_0x00fe;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00da;
                case 58: goto L_0x010b;
                case 59: goto L_0x00a4;
                case 60: goto L_0x0084;
                case 61: goto L_0x0078;
                case 62: goto L_0x00f1;
                case 63: goto L_0x0068;
                case 64: goto L_0x00da;
                case 65: goto L_0x00e5;
                case 66: goto L_0x0056;
                case 67: goto L_0x0044;
                case 68: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            return r7
        L_0x0022:
            r4 = 3
            if (r12 != r4) goto L_0x0021
            X.8uJ r11 = r13.A0E(r14)
            r4 = r24 & -8
            r17 = r4 | 4
            X.8AI r11 = (X.AnonymousClass8AI) r11
            X.6VG r4 = new X.6VG
            r4.<init>()
            r16 = r15
            r14 = r8
            r15 = r7
            r12 = r10
            r13 = r4
            int r7 = r11.A0B(r12, r13, r14, r15, r16, r17)
            r11.Bu3(r4)
            r10.A02 = r4
            goto L_0x008e
        L_0x0044:
            if (r26 != 0) goto L_0x0021
            int r12 = A06(r10, r8, r7)
            long r7 = r10.A01
            long r7 = X.AnonymousClass6C7.A0G(r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            goto L_0x011f
        L_0x0056:
            if (r26 != 0) goto L_0x0021
            int r12 = A05(r10, r8, r7)
            int r4 = r10.A00
            int r4 = X.AnonymousClass6C8.A08(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x011f
        L_0x0068:
            if (r26 != 0) goto L_0x0021
            int r7 = A05(r10, r8, r7)
            int r4 = r10.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.putObject(r9, r0, r4)
            goto L_0x00b3
        L_0x0078:
            if (r12 != r4) goto L_0x0021
            int r7 = A02(r10, r8, r7)
            java.lang.Object r4 = r10.A02
            r5.putObject(r9, r0, r4)
            goto L_0x00b3
        L_0x0084:
            if (r12 != r4) goto L_0x0021
            X.8uJ r4 = r13.A0E(r14)
            int r7 = A00(r10, r4, r8, r7, r15)
        L_0x008e:
            int r4 = r5.getInt(r9, r2)
            if (r4 != r6) goto L_0x00a1
            java.lang.Object r8 = r5.getObject(r9, r0)
            if (r8 == 0) goto L_0x00a1
            java.lang.Object r4 = r10.A02
            java.lang.Object r4 = X.C155637fE.A00(r8, r4)
            goto L_0x00b0
        L_0x00a1:
            java.lang.Object r4 = r10.A02
            goto L_0x00b0
        L_0x00a4:
            if (r12 != r4) goto L_0x0021
            int r7 = A05(r10, r8, r7)
            int r11 = r10.A00
            if (r11 != 0) goto L_0x00b7
            java.lang.String r4 = ""
        L_0x00b0:
            r5.putObject(r9, r0, r4)
        L_0x00b3:
            r5.putInt(r9, r2, r6)
            return r7
        L_0x00b7:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r27 = r27 & r4
            if (r27 == 0) goto L_0x00cf
            int r10 = r7 + r11
            X.7Qf r4 = X.C1456376r.A00
            boolean r4 = r4.A00(r8, r7, r10)
            if (r4 != 0) goto L_0x00cf
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.6u4 r0 = new X.6u4
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00cf:
            java.nio.charset.Charset r4 = X.C155637fE.A03
            java.lang.String r4 = X.AnonymousClass6CA.A0W(r4, r8, r7, r11)
            r5.putObject(r9, r0, r4)
            int r7 = r7 + r11
            goto L_0x00b3
        L_0x00da:
            if (r12 != r11) goto L_0x0021
            int r4 = X.AnonymousClass6C7.A0B(r8, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0134
        L_0x00e5:
            r4 = 1
            if (r12 != r4) goto L_0x0021
            long r10 = X.AnonymousClass6C7.A0N(r8, r7)
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            goto L_0x014c
        L_0x00f1:
            if (r26 != 0) goto L_0x0021
            int r12 = A05(r10, r8, r7)
            int r4 = r10.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x011f
        L_0x00fe:
            if (r26 != 0) goto L_0x0021
            int r12 = A06(r10, r8, r7)
            long r7 = r10.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            goto L_0x011f
        L_0x010b:
            if (r26 != 0) goto L_0x0021
            int r12 = A06(r10, r8, r7)
            long r7 = r10.A01
            r10 = 0
            int r4 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1S(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x011f:
            r5.putObject(r9, r0, r4)
            r5.putInt(r9, r2, r6)
            return r12
        L_0x0126:
            if (r12 != r11) goto L_0x0021
            int r4 = X.AnonymousClass6C7.A0B(r8, r7)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x0134:
            r5.putObject(r9, r0, r4)
            r5.putInt(r9, r2, r6)
            int r0 = r22 + 4
            return r0
        L_0x013d:
            r4 = 1
            if (r12 != r4) goto L_0x0021
            long r10 = X.AnonymousClass6C7.A0N(r8, r7)
            double r10 = java.lang.Double.longBitsToDouble(r10)
            java.lang.Double r4 = java.lang.Double.valueOf(r10)
        L_0x014c:
            r5.putObject(r9, r0, r4)
            r5.putInt(r9, r2, r6)
            int r0 = r22 + 8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.A0C(X.7gt, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    public final C185828uJ A0E(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.A0D;
        C185828uJ r0 = (C185828uJ) objArr[i3];
        if (r0 != null) {
            return r0;
        }
        C185828uJ A002 = C157357iA.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    public final boolean A0F(int i, Object obj) {
        int[] iArr = this.A0B;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(Double.longBitsToDouble(C162327ri.A00.A01(obj, j2))) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(Float.intBitsToFloat(C162327ri.A00.A00(obj, j2))) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C162327ri.A00.A01(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C162327ri.A00.A00(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C162327ri.A07(obj, j2);
                case 8:
                    Object A022 = C162327ri.A00.A02(obj, j2);
                    if (A022 instanceof String) {
                        if (!((String) A022).isEmpty()) {
                            return true;
                        }
                    } else if (!(A022 instanceof AnonymousClass8Ln)) {
                        throw AnonymousClass6CA.A0N();
                    } else if (!AnonymousClass8Ln.A00.equals(A022)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (C162327ri.A00.A02(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!AnonymousClass8Ln.A00.equals(C162327ri.A00.A02(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw AnonymousClass6CA.A0N();
            }
        } else if ((C162327ri.A00.A00(obj, j) & (1 << (i2 >>> 20))) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A0G(Object obj, int i, int i2) {
        return AnonymousClass000.A1U(C162327ri.A00.A00(obj, AnonymousClass6C7.A0O(this.A0B, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r6 = r6 * 53;
        r0 = X.C162327ri.A00.A02(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C162327ri.A00.A02(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass001.A0K(X.C162327ri.A00.A02(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass6C8.A0B(X.C18310x6.A0B(X.C162327ri.A00.A02(r10, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        r0 = X.AnonymousClass6C9.A05(r0 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014d, code lost:
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
            if (r3 >= r4) goto L_0x0161
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = r7 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x0139;
                case 1: goto L_0x0128;
                case 2: goto L_0x011b;
                case 3: goto L_0x011b;
                case 4: goto L_0x0112;
                case 5: goto L_0x011b;
                case 6: goto L_0x0112;
                case 7: goto L_0x0107;
                case 8: goto L_0x0072;
                case 9: goto L_0x0150;
                case 10: goto L_0x005e;
                case 11: goto L_0x0112;
                case 12: goto L_0x0112;
                case 13: goto L_0x0112;
                case 14: goto L_0x011b;
                case 15: goto L_0x0112;
                case 16: goto L_0x011b;
                case 17: goto L_0x0150;
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
                case 51: goto L_0x00ec;
                case 52: goto L_0x00d5;
                case 53: goto L_0x00be;
                case 54: goto L_0x00b7;
                case 55: goto L_0x00a3;
                case 56: goto L_0x009c;
                case 57: goto L_0x0095;
                case 58: goto L_0x0082;
                case 59: goto L_0x006c;
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
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0025:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00c4
        L_0x002d:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a9
        L_0x0034:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00c4
        L_0x003c:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a9
        L_0x0043:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a9
        L_0x004a:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a9
        L_0x0051:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0058:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x005e:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x014d
        L_0x006c:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0072:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x014d
        L_0x0082:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            goto L_0x010d
        L_0x0095:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00c4
        L_0x00a3:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00a9:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            goto L_0x014d
        L_0x00b7:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x00c4
        L_0x00be:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00c4:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            long r0 = X.C18310x6.A0B(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x014d
        L_0x00d5:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            float r0 = X.AnonymousClass001.A05(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x014d
        L_0x00ec:
            boolean r0 = r9.A0G(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            double r0 = X.AnonymousClass6C9.A02(r0)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x014d
        L_0x0107:
            int r6 = r6 * 53
            boolean r0 = X.C162327ri.A07(r10, r1)
        L_0x010d:
            int r0 = X.AnonymousClass6C9.A05(r0)
            goto L_0x014d
        L_0x0112:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            int r0 = r0.A00(r10, r1)
            goto L_0x014d
        L_0x011b:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            long r0 = r0.A01(r10, r1)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x014d
        L_0x0128:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            int r0 = r0.A00(r10, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x014d
        L_0x0139:
            int r6 = r6 * 53
            X.7ba r0 = X.C162327ri.A00
            long r0 = r0.A01(r10, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
        L_0x014d:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0150:
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            if (r0 == 0) goto L_0x015c
            int r7 = r0.hashCode()
        L_0x015c:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0161:
            int r1 = r6 * 53
            X.6V4 r10 = (X.AnonymousClass6V4) r10
            X.7nq r0 = r10.zzc
            int r0 = X.AnonymousClass002.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.BtE(java.lang.Object):int");
    }

    public final Object Btu() {
        return new AnonymousClass6VG();
    }

    public final void Bu3(Object obj) {
        int i;
        Object unmodifiableList;
        AnonymousClass8T0 r3;
        int i2 = this.A02;
        while (true) {
            i = this.A03;
            if (i2 >= i) {
                break;
            }
            long A0T = AnonymousClass6C8.A0T(this.A0B, this.A0C[i2]);
            Object A022 = C162327ri.A00.A02(obj, A0T);
            if (A022 != null) {
                ((C174248Tn) A022).zzb = false;
                C162327ri.A03(obj, A0T, A022);
            }
            i2++;
        }
        int[] iArr = this.A0C;
        int length = iArr.length;
        while (i < length) {
            C157867j1 r32 = this.A05;
            long j = (long) iArr[i];
            boolean z = r32 instanceof AnonymousClass6VH;
            Object A023 = C162327ri.A00.A02(obj, j);
            if (z) {
                r3 = (AnonymousClass8T0) ((C188218yX) A023);
            } else {
                List list = (List) A023;
                if (list instanceof C188178yT) {
                    unmodifiableList = ((C188178yT) list).Btz();
                } else {
                    if (!AnonymousClass6C9.A1N(AnonymousClass6VI.A00, list)) {
                        if (!(list instanceof C178498hd) || !(list instanceof C188218yX)) {
                            unmodifiableList = Collections.unmodifiableList(list);
                        } else {
                            r3 = (AnonymousClass8T0) ((C188218yX) list);
                            if (!r3.A00) {
                            }
                        }
                    }
                    i++;
                }
                C162327ri.A03(obj, j, unmodifiableList);
                i++;
            }
            r3.A00 = false;
            i++;
        }
        ((AnonymousClass6V4) obj).zzc.A01 = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r9.putObject(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0157, code lost:
        r9.putInt(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0163, code lost:
        r9.putLong(r8, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0182, code lost:
        r7 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019d, code lost:
        r7 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
        r20 = r20 | r16;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bu8(X.C156597gt r37, java.lang.Object r38, byte[] r39, int r40, int r41) {
        /*
            r36 = this;
            r7 = r40
            r14 = r36
            boolean r0 = r14.A0A
            r5 = r37
            r8 = r38
            r4 = r39
            r35 = r41
            if (r0 == 0) goto L_0x0275
            sun.misc.Unsafe r9 = A0E
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r11 = -1
            r2 = -1
            r10 = 0
            r20 = 0
            r19 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r0 = r35
            if (r7 >= r0) goto L_0x025f
            int r6 = r7 + 1
            byte r12 = r39[r7]
            if (r12 >= 0) goto L_0x002d
            int r6 = A07(r5, r4, r12, r6)
            int r12 = r5.A00
        L_0x002d:
            int r18 = r12 >>> 3
            r7 = r12 & 7
            r0 = r18
            if (r0 <= r2) goto L_0x005c
            int r15 = r10 / 3
            int r2 = r14.A00
            if (r0 < r2) goto L_0x025c
            int r2 = r14.A01
            if (r0 > r2) goto L_0x025c
            int[] r13 = r14.A0B
            int r0 = r13.length
            int r0 = r0 / 3
            int r3 = r0 + -1
        L_0x0046:
            if (r15 > r3) goto L_0x025c
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
            int r10 = r14.A0A(r0)
        L_0x0060:
            if (r10 == r11) goto L_0x025c
            int[] r0 = r14.A0B
            r11 = r0
            int r0 = r10 + 1
            r17 = r11[r0]
            int r0 = r17 >>> 20
            r13 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17 & r1
            long r2 = (long) r0
            r0 = 17
            if (r13 > r0) goto L_0x01a3
            int r0 = r10 + 2
            r11 = r11[r0]
            int r0 = r11 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r11 = r11 & r1
            r0 = r19
            if (r11 == r0) goto L_0x0097
            if (r0 == r1) goto L_0x008b
            long r0 = (long) r0
            r15 = r20
            r9.putInt(r8, r0, r15)
        L_0x008b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r11 == r0) goto L_0x0095
            long r0 = (long) r11
            int r20 = r9.getInt(r8, r0)
        L_0x0095:
            r19 = r11
        L_0x0097:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x0185;
                case 1: goto L_0x016f;
                case 2: goto L_0x015b;
                case 3: goto L_0x015b;
                case 4: goto L_0x014f;
                case 5: goto L_0x013e;
                case 6: goto L_0x0134;
                case 7: goto L_0x0118;
                case 8: goto L_0x00ff;
                case 9: goto L_0x00e5;
                case 10: goto L_0x00dd;
                case 11: goto L_0x014f;
                case 12: goto L_0x014f;
                case 13: goto L_0x0134;
                case 14: goto L_0x013e;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00c2;
                default: goto L_0x009b;
            }
        L_0x009b:
            r2 = r8
            X.6V4 r2 = (X.AnonymousClass6V4) r2
            X.7nq r1 = r2.zzc
            X.7nq r0 = X.C160547nq.A04
            if (r1 != r0) goto L_0x00aa
            X.7nq r1 = X.C160547nq.A00()
            r2.zzc = r1
        L_0x00aa:
            r21 = r5
            r22 = r1
            r23 = r4
            r24 = r12
            r25 = r6
            r26 = r35
            int r7 = A01(r21, r22, r23, r24, r25, r26)
        L_0x00ba:
            r2 = r18
            r11 = -1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001d
        L_0x00c2:
            if (r7 != 0) goto L_0x009b
            int r7 = A06(r5, r4, r6)
            long r0 = r5.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            goto L_0x0163
        L_0x00d0:
            if (r7 != 0) goto L_0x009b
            int r7 = A05(r5, r4, r6)
            int r0 = r5.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            goto L_0x0157
        L_0x00dd:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            int r7 = A02(r5, r4, r6)
            goto L_0x010c
        L_0x00e5:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            X.8uJ r1 = r14.A0E(r10)
            r0 = r35
            int r7 = A00(r5, r1, r4, r6, r0)
            java.lang.Object r1 = r9.getObject(r8, r2)
            if (r1 == 0) goto L_0x010c
            java.lang.Object r0 = r5.A02
            java.lang.Object r0 = X.C155637fE.A00(r1, r0)
            goto L_0x010e
        L_0x00ff:
            r0 = 2
            if (r7 != r0) goto L_0x009b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r17
            if (r0 != 0) goto L_0x0113
            int r7 = A03(r5, r4, r6)
        L_0x010c:
            java.lang.Object r0 = r5.A02
        L_0x010e:
            r9.putObject(r8, r2, r0)
            goto L_0x019f
        L_0x0113:
            int r7 = A04(r5, r4, r6)
            goto L_0x010c
        L_0x0118:
            if (r7 != 0) goto L_0x009b
            int r7 = A06(r5, r4, r6)
            long r0 = r5.A01
            r11 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r6)
            boolean r0 = X.C162327ri.A03
            if (r0 == 0) goto L_0x0130
            X.C162327ri.A04(r8, r2, r1)
            goto L_0x019f
        L_0x0130:
            X.C162327ri.A05(r8, r2, r1)
            goto L_0x019f
        L_0x0134:
            if (r7 != r0) goto L_0x009b
            int r0 = X.AnonymousClass6C7.A0B(r4, r6)
            r9.putInt(r8, r2, r0)
            goto L_0x0182
        L_0x013e:
            r0 = 1
            if (r7 != r0) goto L_0x009b
            long r25 = X.AnonymousClass6C7.A0N(r4, r6)
            r21 = r9
            r22 = r8
            r23 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x019d
        L_0x014f:
            if (r7 != 0) goto L_0x009b
            int r7 = A05(r5, r4, r6)
            int r0 = r5.A00
        L_0x0157:
            r9.putInt(r8, r2, r0)
            goto L_0x019f
        L_0x015b:
            if (r7 != 0) goto L_0x009b
            int r7 = A06(r5, r4, r6)
            long r0 = r5.A01
        L_0x0163:
            r21 = r9
            r22 = r8
            r23 = r2
            r25 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x019f
        L_0x016f:
            if (r7 != r0) goto L_0x009b
            int r0 = X.AnonymousClass6C7.A0B(r4, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            X.7ba r1 = X.C162327ri.A00
            int r0 = java.lang.Float.floatToIntBits(r0)
            r1.A05(r8, r2, r0)
        L_0x0182:
            int r7 = r6 + 4
            goto L_0x019f
        L_0x0185:
            r0 = 1
            if (r7 != r0) goto L_0x009b
            long r0 = X.AnonymousClass6C7.A0N(r4, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            X.7ba r21 = X.C162327ri.A00
            long r25 = java.lang.Double.doubleToLongBits(r0)
            r22 = r8
            r23 = r2
            r21.A06(r22, r23, r25)
        L_0x019d:
            int r7 = r6 + 8
        L_0x019f:
            r20 = r20 | r16
            goto L_0x00ba
        L_0x01a3:
            r0 = 27
            if (r13 != r0) goto L_0x01ea
            r0 = 2
            if (r7 != r0) goto L_0x009b
            java.lang.Object r1 = r9.getObject(r8, r2)
            X.8yX r1 = (X.C188218yX) r1
            r0 = r1
            X.8T0 r0 = (X.AnonymousClass8T0) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01c8
            int r7 = r1.size()
            int r0 = r7 + r7
            if (r7 != 0) goto L_0x01c1
            r0 = 10
        L_0x01c1:
            X.8yX r1 = r1.Btt(r0)
            r9.putObject(r8, r2, r1)
        L_0x01c8:
            X.8uJ r3 = r14.A0E(r10)
            r0 = r35
            int r7 = A00(r5, r3, r4, r6, r0)
        L_0x01d2:
            java.lang.Object r0 = r5.A02
            r1.add(r0)
            r0 = r35
            if (r7 >= r0) goto L_0x00ba
            int r2 = A05(r5, r4, r7)
            int r0 = r5.A00
            if (r12 != r0) goto L_0x00ba
            r0 = r35
            int r7 = A00(r5, r3, r4, r2, r0)
            goto L_0x01d2
        L_0x01ea:
            r0 = 49
            if (r13 > r0) goto L_0x0212
            r0 = r17
            long r0 = (long) r0
            r28 = r7
            r29 = r10
            r30 = r13
            r31 = r0
            r33 = r2
            r22 = r5
            r23 = r8
            r24 = r4
            r25 = r6
            r26 = r35
            r27 = r12
            r21 = r14
            int r7 = r21.A0D(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
        L_0x020d:
            if (r7 != r6) goto L_0x00ba
            r6 = r7
            goto L_0x009b
        L_0x0212:
            r0 = 50
            if (r13 != r0) goto L_0x023d
            r0 = 2
            if (r7 != r0) goto L_0x009b
            java.lang.Object r5 = r9.getObject(r8, r2)
            r0 = r5
            X.8Tn r0 = (X.C174248Tn) r0
            boolean r0 = r0.zzb
            if (r0 != 0) goto L_0x0237
            X.8Tn r4 = X.C174248Tn.A00
            boolean r1 = r4.isEmpty()
            X.8Tn r0 = new X.8Tn
            if (r1 == 0) goto L_0x0239
            r0.<init>()
        L_0x0231:
            X.C154027cS.A00(r0, r5)
            r9.putObject(r8, r2, r0)
        L_0x0237:
            r1 = 0
            throw r1
        L_0x0239:
            r0.<init>(r4)
            goto L_0x0231
        L_0x023d:
            r28 = r18
            r29 = r7
            r30 = r17
            r31 = r13
            r32 = r10
            r33 = r2
            r22 = r5
            r23 = r8
            r24 = r4
            r25 = r6
            r26 = r35
            r27 = r12
            r21 = r14
            int r7 = r21.A0C(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x020d
        L_0x025c:
            r10 = 0
            goto L_0x009b
        L_0x025f:
            r0 = r19
            if (r0 == r1) goto L_0x0269
            long r1 = (long) r0
            r0 = r20
            r9.putInt(r8, r1, r0)
        L_0x0269:
            r0 = r35
            if (r7 == r0) goto L_0x0280
            java.lang.String r0 = "Failed to parse the message."
            X.6u4 r1 = new X.6u4
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0275:
            r6 = 0
            r0 = r14
            r1 = r5
            r2 = r8
            r3 = r4
            r4 = r7
            r5 = r35
            r0.A0B(r1, r2, r3, r4, r5, r6)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.Bu8(X.7gt, java.lang.Object, byte[], int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r1 != r0) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d8, code lost:
        if (r8 != r1) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BuB(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A0B
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00dc
            int r0 = r5 + 1
            r4 = r7[r0]
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r4 & r1
            long r2 = (long) r0
            int r0 = r4 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x008a;
                case 2: goto L_0x0075;
                case 3: goto L_0x0075;
                case 4: goto L_0x0060;
                case 5: goto L_0x0075;
                case 6: goto L_0x0060;
                case 7: goto L_0x004d;
                case 8: goto L_0x002e;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x0060;
                case 12: goto L_0x0060;
                case 13: goto L_0x0060;
                case 14: goto L_0x0075;
                case 15: goto L_0x0060;
                case 16: goto L_0x0075;
                case 17: goto L_0x002e;
                case 18: goto L_0x0038;
                case 19: goto L_0x0038;
                case 20: goto L_0x0038;
                case 21: goto L_0x0038;
                case 22: goto L_0x0038;
                case 23: goto L_0x0038;
                case 24: goto L_0x0038;
                case 25: goto L_0x0038;
                case 26: goto L_0x0038;
                case 27: goto L_0x0038;
                case 28: goto L_0x0038;
                case 29: goto L_0x0038;
                case 30: goto L_0x0038;
                case 31: goto L_0x0038;
                case 32: goto L_0x0038;
                case 33: goto L_0x0038;
                case 34: goto L_0x0038;
                case 35: goto L_0x0038;
                case 36: goto L_0x0038;
                case 37: goto L_0x0038;
                case 38: goto L_0x0038;
                case 39: goto L_0x0038;
                case 40: goto L_0x0038;
                case 41: goto L_0x0038;
                case 42: goto L_0x0038;
                case 43: goto L_0x0038;
                case 44: goto L_0x0038;
                case 45: goto L_0x0038;
                case 46: goto L_0x0038;
                case 47: goto L_0x0038;
                case 48: goto L_0x0038;
                case 49: goto L_0x0038;
                case 50: goto L_0x0038;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x001b:
            int r0 = r5 + 2
            r0 = r7[r0]
            r0 = r0 & r1
            long r0 = (long) r0
            X.7ba r8 = X.C162327ri.A00
            int r4 = r8.A00(r12, r0)
            int r0 = r8.A00(r13, r0)
            if (r4 != r0) goto L_0x00ec
            goto L_0x0038
        L_0x002e:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
        L_0x0038:
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r1 = r0.A02(r12, r2)
            java.lang.Object r0 = r0.A02(r13, r2)
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x00ec
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ec
            goto L_0x0018
        L_0x004d:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
            boolean r1 = X.C162327ri.A07(r12, r2)
            boolean r0 = X.C162327ri.A07(r13, r2)
            goto L_0x00ae
        L_0x0060:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
            X.7ba r0 = X.C162327ri.A00
            int r1 = r0.A00(r12, r2)
            int r0 = r0.A00(r13, r2)
            goto L_0x00ae
        L_0x0075:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
            X.7ba r0 = X.C162327ri.A00
            long r8 = r0.A01(r12, r2)
            long r1 = r0.A01(r13, r2)
            goto L_0x00d6
        L_0x008a:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
            X.7ba r4 = X.C162327ri.A00
            int r0 = r4.A00(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = java.lang.Float.floatToIntBits(r0)
            int r0 = r4.A00(r13, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x00ae:
            if (r1 != r0) goto L_0x00ec
            goto L_0x0018
        L_0x00b2:
            boolean r1 = r11.A0F(r5, r12)
            boolean r0 = r11.A0F(r5, r13)
            if (r1 != r0) goto L_0x00ec
            X.7ba r4 = X.C162327ri.A00
            long r0 = r4.A01(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            long r0 = r4.A01(r13, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        L_0x00d6:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ec
            goto L_0x0018
        L_0x00dc:
            X.6V4 r12 = (X.AnonymousClass6V4) r12
            X.7nq r1 = r12.zzc
            X.6V4 r13 = (X.AnonymousClass6V4) r13
            X.7nq r0 = r13.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ec
            r0 = 1
            return r0
        L_0x00ec:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.BuB(java.lang.Object, java.lang.Object):boolean");
    }

    public AnonymousClass8AI(AnonymousClass72Q r1, C157867j1 r2, C154027cS r3, C187798xp r4, AnonymousClass72R r5, AnonymousClass72T r6, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
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

    public static int A02(C156597gt r4, byte[] bArr, int i) {
        int A052 = A05(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A052) {
                throw new AnonymousClass6u4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                r4.A02 = AnonymousClass8Ln.A00;
                return A052;
            } else {
                AnonymousClass8Ln.A00(A052, A052 + i2, length);
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, A052, bArr2, 0, i2);
                r4.A02 = new AnonymousClass6VD(bArr2);
                return A052 + i2;
            }
        } else {
            throw new AnonymousClass6u4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static int A03(C156597gt r3, byte[] bArr, int i) {
        int A052 = A05(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw new AnonymousClass6u4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i2 == 0) {
            r3.A02 = "";
            return A052;
        } else {
            r3.A02 = AnonymousClass6CA.A0W(C155637fE.A03, bArr, A052, i2);
            return A052 + i2;
        }
    }

    public static Field A09(Class cls, String str) {
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
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass6C9.A19(A0o, str);
            A0o.append(name);
            throw AnonymousClass002.A0E(AnonymousClass000.A0V(" not found. Known fields are ", arrays, A0o));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f5, code lost:
        r2 = X.C162327ri.A00;
        X.C162327ri.A03(r14, r9, r2.A02(r15, r9));
        r2.A05(r14, X.AnonymousClass6C7.A0O(r3, r6), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b3, code lost:
        r7.A06(r8, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r1.A05(r14, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r7 = r3[r6 + 2];
        r1 = (long) (1048575 & r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fa, code lost:
        if (r1 == 1048575) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
        r5 = X.C162327ri.A00;
        r5.A05(r14, r1, (1 << (r7 >>> 20)) | r5.A00(r14, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bu4(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r15.getClass()
            r6 = 0
        L_0x0004:
            int[] r3 = r13.A0B
            int r0 = r3.length
            r8 = r14
            if (r6 >= r0) goto L_0x0207
            int r0 = r6 + 1
            r1 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r9 = (long) r0
            r4 = r3[r6]
            int r0 = r1 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x0092;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a7;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00c7;
                case 8: goto L_0x00dd;
                case 9: goto L_0x001f;
                case 10: goto L_0x00dd;
                case 11: goto L_0x00b7;
                case 12: goto L_0x00b7;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00a7;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00a7;
                case 17: goto L_0x001f;
                case 18: goto L_0x010c;
                case 19: goto L_0x010c;
                case 20: goto L_0x010c;
                case 21: goto L_0x010c;
                case 22: goto L_0x010c;
                case 23: goto L_0x010c;
                case 24: goto L_0x010c;
                case 25: goto L_0x010c;
                case 26: goto L_0x010c;
                case 27: goto L_0x010c;
                case 28: goto L_0x010c;
                case 29: goto L_0x010c;
                case 30: goto L_0x010c;
                case 31: goto L_0x010c;
                case 32: goto L_0x010c;
                case 33: goto L_0x010c;
                case 34: goto L_0x010c;
                case 35: goto L_0x010c;
                case 36: goto L_0x010c;
                case 37: goto L_0x010c;
                case 38: goto L_0x010c;
                case 39: goto L_0x010c;
                case 40: goto L_0x010c;
                case 41: goto L_0x010c;
                case 42: goto L_0x010c;
                case 43: goto L_0x010c;
                case 44: goto L_0x010c;
                case 45: goto L_0x010c;
                case 46: goto L_0x010c;
                case 47: goto L_0x010c;
                case 48: goto L_0x010c;
                case 49: goto L_0x010c;
                case 50: goto L_0x01d5;
                case 51: goto L_0x01e8;
                case 52: goto L_0x01e8;
                case 53: goto L_0x01e8;
                case 54: goto L_0x01e8;
                case 55: goto L_0x01e8;
                case 56: goto L_0x01e8;
                case 57: goto L_0x01e8;
                case 58: goto L_0x01e8;
                case 59: goto L_0x01e8;
                case 60: goto L_0x0043;
                case 61: goto L_0x01ef;
                case 62: goto L_0x01ef;
                case 63: goto L_0x01ef;
                case 64: goto L_0x01ef;
                case 65: goto L_0x01ef;
                case 66: goto L_0x01ef;
                case 67: goto L_0x01ef;
                case 68: goto L_0x0043;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r6 = r6 + 3
            goto L_0x0004
        L_0x001f:
            long r0 = X.AnonymousClass6C8.A0T(r3, r6)
            boolean r2 = r13.A0F(r6, r15)
            if (r2 == 0) goto L_0x001c
            X.7ba r2 = X.C162327ri.A00
            java.lang.Object r4 = r2.A02(r14, r0)
            java.lang.Object r2 = r2.A02(r15, r0)
            if (r4 == 0) goto L_0x0040
            if (r2 == 0) goto L_0x001c
            java.lang.Object r2 = X.C155637fE.A00(r4, r2)
        L_0x003b:
            X.C162327ri.A03(r14, r0, r2)
            goto L_0x00ec
        L_0x0040:
            if (r2 == 0) goto L_0x001c
            goto L_0x003b
        L_0x0043:
            int r0 = r6 + 1
            r0 = r3[r0]
            r7 = r3[r6]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            boolean r2 = r13.A0G(r15, r7, r6)
            if (r2 == 0) goto L_0x001c
            boolean r2 = r13.A0G(r14, r7, r6)
            if (r2 == 0) goto L_0x007b
            X.7ba r2 = X.C162327ri.A00
            java.lang.Object r5 = r2.A02(r14, r0)
        L_0x005f:
            X.7ba r4 = X.C162327ri.A00
            java.lang.Object r2 = r4.A02(r15, r0)
            if (r5 == 0) goto L_0x0078
            if (r2 == 0) goto L_0x001c
            java.lang.Object r2 = X.C155637fE.A00(r5, r2)
        L_0x006d:
            X.C162327ri.A03(r14, r0, r2)
            long r0 = X.AnonymousClass6C7.A0O(r3, r6)
            r4.A05(r14, r0, r7)
            goto L_0x001c
        L_0x0078:
            if (r2 == 0) goto L_0x001c
            goto L_0x006d
        L_0x007b:
            r5 = 0
            goto L_0x005f
        L_0x007d:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            X.7ba r7 = X.C162327ri.A00
            long r0 = r7.A01(r15, r9)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r11 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x00b3
        L_0x0092:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            X.7ba r1 = X.C162327ri.A00
            int r0 = r1.A00(r15, r9)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00c3
        L_0x00a7:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            X.7ba r7 = X.C162327ri.A00
            long r11 = r7.A01(r15, r9)
        L_0x00b3:
            r7.A06(r8, r9, r11)
            goto L_0x00ec
        L_0x00b7:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            X.7ba r1 = X.C162327ri.A00
            int r0 = r1.A00(r15, r9)
        L_0x00c3:
            r1.A05(r14, r9, r0)
            goto L_0x00ec
        L_0x00c7:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            boolean r1 = X.C162327ri.A07(r15, r9)
            boolean r0 = X.C162327ri.A03
            if (r0 == 0) goto L_0x00d9
            X.C162327ri.A04(r14, r9, r1)
            goto L_0x00ec
        L_0x00d9:
            X.C162327ri.A05(r14, r9, r1)
            goto L_0x00ec
        L_0x00dd:
            boolean r0 = r13.A0F(r6, r15)
            if (r0 == 0) goto L_0x001c
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r0 = r0.A02(r15, r9)
            X.C162327ri.A03(r14, r9, r0)
        L_0x00ec:
            int r0 = r6 + 2
            r7 = r3[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001c
            X.7ba r5 = X.C162327ri.A00
            int r4 = r5.A00(r14, r1)
            int r3 = r7 >>> 20
            r0 = 1
            int r0 = r0 << r3
            r0 = r0 | r4
            r5.A05(r14, r1, r0)
            goto L_0x001c
        L_0x010c:
            X.7j1 r0 = r13.A05
            boolean r1 = r0 instanceof X.AnonymousClass6VH
            X.7ba r0 = X.C162327ri.A00
            if (r1 == 0) goto L_0x0141
            java.lang.Object r4 = r0.A02(r14, r9)
            X.8yX r4 = (X.C188218yX) r4
            java.lang.Object r3 = r0.A02(r15, r9)
            java.util.List r3 = (java.util.List) r3
            int r2 = r4.size()
            int r1 = r3.size()
            if (r2 <= 0) goto L_0x013c
            if (r1 <= 0) goto L_0x013b
            r0 = r4
            X.8T0 r0 = (X.AnonymousClass8T0) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0138
            int r1 = r1 + r2
            X.8yX r4 = r4.Btt(r1)
        L_0x0138:
            r4.addAll(r3)
        L_0x013b:
            r3 = r4
        L_0x013c:
            X.C162327ri.A03(r14, r9, r3)
            goto L_0x001c
        L_0x0141:
            java.lang.Object r3 = r0.A02(r15, r9)
            java.util.List r3 = (java.util.List) r3
            int r4 = r3.size()
            java.lang.Object r2 = r0.A02(r14, r9)
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x018c
            boolean r0 = r2 instanceof X.C188178yT
            if (r0 == 0) goto L_0x0178
            X.6VA r2 = new X.6VA
            r2.<init>((int) r4)
        L_0x0160:
            X.C162327ri.A03(r14, r9, r2)
        L_0x0163:
            int r1 = r2.size()
            int r0 = r3.size()
            if (r1 <= 0) goto L_0x0173
            if (r0 <= 0) goto L_0x0172
            r2.addAll(r3)
        L_0x0172:
            r3 = r2
        L_0x0173:
            X.C162327ri.A03(r14, r9, r3)
            goto L_0x001c
        L_0x0178:
            boolean r0 = r2 instanceof X.C178498hd
            if (r0 == 0) goto L_0x0187
            boolean r0 = r2 instanceof X.C188218yX
            if (r0 == 0) goto L_0x0187
            X.8yX r2 = (X.C188218yX) r2
            X.8yX r2 = r2.Btt(r4)
            goto L_0x0160
        L_0x0187:
            java.util.ArrayList r2 = X.AnonymousClass002.A0I(r4)
            goto L_0x0160
        L_0x018c:
            java.lang.Class r0 = X.AnonymousClass6VI.A00
            boolean r0 = X.AnonymousClass6C9.A1N(r0, r2)
            if (r0 == 0) goto L_0x01a0
            java.util.ArrayList r1 = X.AnonymousClass6C8.A0i(r2, r4)
            r1.addAll(r2)
        L_0x019b:
            X.C162327ri.A03(r14, r9, r1)
            r2 = r1
            goto L_0x0163
        L_0x01a0:
            boolean r0 = r2 instanceof X.AnonymousClass8T1
            if (r0 == 0) goto L_0x01b6
            int r0 = r2.size()
            int r0 = r0 + r4
            X.6VA r1 = new X.6VA
            r1.<init>((int) r0)
            int r0 = r1.size()
            r1.addAll(r0, r2)
            goto L_0x019b
        L_0x01b6:
            boolean r0 = r2 instanceof X.C178498hd
            if (r0 == 0) goto L_0x0163
            boolean r0 = r2 instanceof X.C188218yX
            if (r0 == 0) goto L_0x0163
            r1 = r2
            X.8yX r1 = (X.C188218yX) r1
            r0 = r1
            X.8T0 r0 = (X.AnonymousClass8T0) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0163
            int r0 = r2.size()
            int r0 = r0 + r4
            X.8yX r2 = r1.Btt(r0)
            X.C162327ri.A03(r14, r9, r2)
            goto L_0x0163
        L_0x01d5:
            X.7ba r0 = X.C162327ri.A00
            java.lang.Object r1 = r0.A02(r14, r9)
            java.lang.Object r0 = r0.A02(r15, r9)
            java.lang.Object r0 = X.C154027cS.A00(r1, r0)
            X.C162327ri.A03(r14, r9, r0)
            goto L_0x001c
        L_0x01e8:
            boolean r0 = r13.A0G(r15, r4, r6)
            if (r0 == 0) goto L_0x001c
            goto L_0x01f5
        L_0x01ef:
            boolean r0 = r13.A0G(r15, r4, r6)
            if (r0 == 0) goto L_0x001c
        L_0x01f5:
            X.7ba r2 = X.C162327ri.A00
            java.lang.Object r0 = r2.A02(r15, r9)
            X.C162327ri.A03(r14, r9, r0)
            long r0 = X.AnonymousClass6C7.A0O(r3, r6)
            r2.A05(r14, r0, r4)
            goto L_0x001c
        L_0x0207:
            X.C159897me.A00(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.Bu4(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026b, code lost:
        throw new X.AnonymousClass6u4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02c2, code lost:
        if (r4 != r3) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02c4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0369, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0374, code lost:
        throw new X.AnonymousClass6u4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0375, code lost:
        return r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0D(X.C156597gt r18, java.lang.Object r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, long r27, long r29) {
        /*
            r17 = this;
            r5 = r19
            r14 = r21
            sun.misc.Unsafe r6 = A0E
            r0 = r29
            java.lang.Object r2 = r6.getObject(r5, r0)
            X.8yX r2 = (X.C188218yX) r2
            r3 = r2
            X.8T0 r3 = (X.AnonymousClass8T0) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x0026
            int r4 = r2.size()
            int r3 = r4 + r4
            if (r4 != 0) goto L_0x001f
            r3 = 10
        L_0x001f:
            X.8yX r2 = r2.Btt(r3)
            r6.putObject(r5, r0, r2)
        L_0x0026:
            r8 = 5
            r9 = 0
            r4 = 1
            r0 = 2
            r1 = r17
            r11 = r18
            r13 = r20
            r15 = r22
            r3 = r23
            r7 = r24
            r6 = r25
            switch(r26) {
                case 18: goto L_0x00a5;
                case 19: goto L_0x00c0;
                case 20: goto L_0x00f7;
                case 21: goto L_0x00f7;
                case 22: goto L_0x012a;
                case 23: goto L_0x0167;
                case 24: goto L_0x0196;
                case 25: goto L_0x0066;
                case 26: goto L_0x01c5;
                case 27: goto L_0x0330;
                case 28: goto L_0x0226;
                case 29: goto L_0x012a;
                case 30: goto L_0x02e5;
                case 31: goto L_0x0196;
                case 32: goto L_0x0167;
                case 33: goto L_0x026c;
                case 34: goto L_0x02a7;
                case 35: goto L_0x00a5;
                case 36: goto L_0x00c0;
                case 37: goto L_0x00f7;
                case 38: goto L_0x00f7;
                case 39: goto L_0x012a;
                case 40: goto L_0x0167;
                case 41: goto L_0x0196;
                case 42: goto L_0x0066;
                case 43: goto L_0x012a;
                case 44: goto L_0x02e5;
                case 45: goto L_0x0196;
                case 46: goto L_0x0167;
                case 47: goto L_0x026c;
                case 48: goto L_0x02a7;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 3
            if (r7 != r0) goto L_0x0375
            X.8uJ r1 = r1.A0E(r6)
            r0 = r23 & -8
            r16 = r0 | 4
        L_0x0047:
            r10 = r1
            X.8AI r10 = (X.AnonymousClass8AI) r10
            X.6VG r12 = new X.6VG
            r12.<init>()
            int r5 = r10.A0B(r11, r12, r13, r14, r15, r16)
            r10.Bu3(r12)
            r11.A02 = r12
            r2.add(r12)
            if (r5 >= r15) goto L_0x0065
            int r14 = A05(r11, r13, r5)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x0047
        L_0x0065:
            return r5
        L_0x0066:
            if (r7 != r0) goto L_0x0083
            X.6V5 r2 = (X.AnonymousClass6V5) r2
            int r4 = A05(r11, r13, r14)
            int r1 = r11.A00
            int r1 = r1 + r4
        L_0x0071:
            if (r4 >= r1) goto L_0x036a
            int r4 = A06(r11, r13, r4)
            long r5 = r11.A01
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r2.A03(r0)
            goto L_0x0071
        L_0x0083:
            if (r24 != 0) goto L_0x0375
            X.6V5 r2 = (X.AnonymousClass6V5) r2
            int r5 = A06(r11, r13, r14)
        L_0x008b:
            long r0 = r11.A01
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r4)
            r2.A03(r0)
            if (r5 >= r15) goto L_0x0065
            int r1 = A05(r11, r13, r5)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0065
            int r5 = A06(r11, r13, r1)
            goto L_0x008b
        L_0x00a5:
            if (r7 != r0) goto L_0x034e
            X.6V6 r2 = (X.AnonymousClass6V6) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00b0:
            if (r4 >= r3) goto L_0x02c2
            long r0 = X.AnonymousClass6C7.A0N(r13, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A03(r0)
            int r4 = r4 + 8
            goto L_0x00b0
        L_0x00c0:
            if (r7 != r0) goto L_0x00db
            X.6V7 r2 = (X.AnonymousClass6V7) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x00cb:
            if (r4 >= r3) goto L_0x02c2
            int r0 = X.AnonymousClass6C7.A0B(r13, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A03(r0)
            int r4 = r4 + 4
            goto L_0x00cb
        L_0x00db:
            if (r7 != r8) goto L_0x0375
            X.6V7 r2 = (X.AnonymousClass6V7) r2
        L_0x00df:
            int r0 = X.AnonymousClass6C7.A0B(r13, r14)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2.A03(r0)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x0369
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x00df
            return r4
        L_0x00f7:
            if (r7 != r0) goto L_0x010e
            X.6V9 r2 = (X.AnonymousClass6V9) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0102:
            if (r4 >= r3) goto L_0x02c2
            int r4 = A06(r11, r13, r4)
            long r0 = r11.A01
            r2.A03(r0)
            goto L_0x0102
        L_0x010e:
            if (r24 != 0) goto L_0x0375
            X.6V9 r2 = (X.AnonymousClass6V9) r2
            int r4 = A06(r11, r13, r14)
        L_0x0116:
            long r0 = r11.A01
            r2.A03(r0)
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A06(r11, r13, r1)
            goto L_0x0116
        L_0x012a:
            if (r7 != r0) goto L_0x014b
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
            int r1 = r11.A00
            int r1 = r1 + r4
        L_0x0135:
            if (r4 >= r1) goto L_0x0141
            int r4 = A05(r11, r13, r4)
            int r0 = r11.A00
            r2.A03(r0)
            goto L_0x0135
        L_0x0141:
            if (r4 == r1) goto L_0x0369
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6u4 r0 = new X.6u4
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x014b:
            if (r24 != 0) goto L_0x0375
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
        L_0x0153:
            int r0 = r11.A00
            r2.A03(r0)
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A05(r11, r13, r1)
            goto L_0x0153
        L_0x0167:
            if (r7 != r0) goto L_0x017e
            X.6V9 r2 = (X.AnonymousClass6V9) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0172:
            if (r4 >= r3) goto L_0x02c2
            long r0 = X.AnonymousClass6C7.A0N(r13, r4)
            r2.A03(r0)
            int r4 = r4 + 8
            goto L_0x0172
        L_0x017e:
            if (r7 != r4) goto L_0x0375
            X.6V9 r2 = (X.AnonymousClass6V9) r2
        L_0x0182:
            long r0 = X.AnonymousClass6C7.A0N(r13, r14)
            r2.A03(r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x0369
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x0182
            return r4
        L_0x0196:
            if (r7 != r0) goto L_0x01ad
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x01a1:
            if (r4 >= r3) goto L_0x02c2
            int r0 = X.AnonymousClass6C7.A0B(r13, r4)
            r2.A03(r0)
            int r4 = r4 + 4
            goto L_0x01a1
        L_0x01ad:
            if (r7 != r8) goto L_0x0375
            X.6V8 r2 = (X.AnonymousClass6V8) r2
        L_0x01b1:
            int r0 = X.AnonymousClass6C7.A0B(r13, r14)
            r2.A03(r0)
            int r4 = r14 + 4
            if (r4 >= r15) goto L_0x0369
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x01b1
            return r4
        L_0x01c5:
            if (r7 != r0) goto L_0x0375
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r27 = r27 & r0
            java.lang.String r5 = ""
            int r0 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            int r14 = A05(r11, r13, r14)
            if (r0 != 0) goto L_0x01f5
        L_0x01d6:
            int r1 = r11.A00
            if (r1 < 0) goto L_0x0264
            if (r1 != 0) goto L_0x01ee
            r2.add(r5)
        L_0x01df:
            if (r14 >= r15) goto L_0x0375
            int r1 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0375
            int r14 = A05(r11, r13, r1)
            goto L_0x01d6
        L_0x01ee:
            java.nio.charset.Charset r0 = X.C155637fE.A03
            X.AnonymousClass6C9.A1E(r0, r2, r13, r14, r1)
            int r14 = r14 + r1
            goto L_0x01df
        L_0x01f5:
            int r4 = r11.A00
            if (r4 < 0) goto L_0x0264
            if (r4 != 0) goto L_0x020d
            r2.add(r5)
        L_0x01fe:
            if (r14 >= r15) goto L_0x0375
            int r1 = A05(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0375
            int r14 = A05(r11, r13, r1)
            goto L_0x01f5
        L_0x020d:
            int r1 = r14 + r4
            X.7Qf r0 = X.C1456376r.A00
            boolean r0 = r0.A00(r13, r14, r1)
            if (r0 == 0) goto L_0x021e
            java.nio.charset.Charset r0 = X.C155637fE.A03
            X.AnonymousClass6C9.A1E(r0, r2, r13, r14, r4)
            r14 = r1
            goto L_0x01fe
        L_0x021e:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.6u4 r1 = new X.6u4
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0226:
            if (r7 != r0) goto L_0x0375
            int r4 = A05(r11, r13, r14)
            int r6 = r11.A00
            if (r6 < 0) goto L_0x0264
            int r5 = r13.length
        L_0x0231:
            int r0 = r5 - r4
            if (r6 > r0) goto L_0x036d
            if (r6 != 0) goto L_0x024f
            X.8Ln r0 = X.AnonymousClass8Ln.A00
            r2.add(r0)
        L_0x023c:
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A05(r11, r13, r1)
            int r6 = r11.A00
            if (r6 < 0) goto L_0x0264
            goto L_0x0231
        L_0x024f:
            int r0 = r4 + r6
            X.AnonymousClass8Ln.A00(r4, r0, r5)
            byte[] r1 = new byte[r6]
            r0 = 0
            java.lang.System.arraycopy(r13, r4, r1, r0, r6)
            X.6VD r0 = new X.6VD
            r0.<init>(r1)
            r2.add(r0)
            int r4 = r4 + r6
            goto L_0x023c
        L_0x0264:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.6u4 r1 = new X.6u4
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x026c:
            if (r7 != r0) goto L_0x0287
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x0277:
            if (r4 >= r3) goto L_0x02c2
            int r4 = A05(r11, r13, r4)
            int r0 = r11.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r2.A03(r0)
            goto L_0x0277
        L_0x0287:
            if (r24 != 0) goto L_0x0375
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
        L_0x028f:
            int r0 = r11.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r2.A03(r0)
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A05(r11, r13, r1)
            goto L_0x028f
        L_0x02a7:
            if (r7 != r0) goto L_0x02c5
            X.6V9 r2 = (X.AnonymousClass6V9) r2
            int r4 = A05(r11, r13, r14)
            int r3 = r11.A00
            int r3 = r3 + r4
        L_0x02b2:
            if (r4 >= r3) goto L_0x02c2
            int r4 = A06(r11, r13, r4)
            long r0 = r11.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r2.A03(r0)
            goto L_0x02b2
        L_0x02c2:
            if (r4 != r3) goto L_0x036d
            return r4
        L_0x02c5:
            if (r24 != 0) goto L_0x0375
            X.6V9 r2 = (X.AnonymousClass6V9) r2
            int r4 = A06(r11, r13, r14)
        L_0x02cd:
            long r0 = r11.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r2.A03(r0)
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A06(r11, r13, r1)
            goto L_0x02cd
        L_0x02e5:
            if (r7 != r0) goto L_0x0306
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
            int r1 = r11.A00
            int r1 = r1 + r4
        L_0x02f0:
            if (r4 >= r1) goto L_0x02fc
            int r4 = A05(r11, r13, r4)
            int r0 = r11.A00
            r2.A03(r0)
            goto L_0x02f0
        L_0x02fc:
            if (r4 == r1) goto L_0x0322
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6u4 r0 = new X.6u4
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0306:
            if (r24 != 0) goto L_0x0375
            X.6V8 r2 = (X.AnonymousClass6V8) r2
            int r4 = A05(r11, r13, r14)
        L_0x030e:
            int r0 = r11.A00
            r2.A03(r0)
            if (r4 >= r15) goto L_0x0322
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0322
            int r4 = A05(r11, r13, r1)
            goto L_0x030e
        L_0x0322:
            X.6V4 r5 = (X.AnonymousClass6V4) r5
            X.7nq r1 = r5.zzc
            X.7nq r0 = X.C160547nq.A04
            if (r1 != r0) goto L_0x032b
            r1 = 0
        L_0x032b:
            if (r1 == 0) goto L_0x0369
            r5.zzc = r1
            return r4
        L_0x0330:
            if (r7 != r0) goto L_0x0375
            X.8uJ r5 = r1.A0E(r6)
            int r4 = A00(r11, r5, r13, r14, r15)
        L_0x033a:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r4 >= r15) goto L_0x0369
            int r1 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0369
            int r4 = A00(r11, r5, r13, r1, r15)
            goto L_0x033a
        L_0x034e:
            if (r7 != r4) goto L_0x0375
            X.6V6 r2 = (X.AnonymousClass6V6) r2
        L_0x0352:
            long r0 = X.AnonymousClass6C7.A0N(r13, r14)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r2.A03(r0)
            int r4 = r14 + 8
            if (r4 >= r15) goto L_0x0369
            int r14 = A05(r11, r13, r4)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x0352
        L_0x0369:
            return r4
        L_0x036a:
            if (r4 != r1) goto L_0x036d
            return r4
        L_0x036d:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.6u4 r1 = new X.6u4
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0375:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AI.A0D(X.7gt, java.lang.Object, byte[], int, int, int, int, int, int, long, long):int");
    }
}
