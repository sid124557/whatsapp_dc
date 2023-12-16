package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: X.8Ck  reason: invalid class name and case insensitive filesystem */
public final class C170238Ck implements C186358vA {
    public static final Unsafe A0F = UnsafeUtil.A02();
    public static final int[] A0G = new int[0];
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass731 A04;
    public final C158277ji A05;
    public final C159367li A06;
    public final C187928y2 A07;
    public final AnonymousClass733 A08;
    public final C151437Ut A09;
    public final boolean A0A;
    public final boolean A0B;
    public final int[] A0C;
    public final int[] A0D;
    public final Object[] A0E;

    public static int A03(C156627gw r1, C186358vA r2, Object obj, byte[] bArr, int i, int i2, int i3) {
        Object obj2 = obj;
        int A0T = ((C170238Ck) r2).A0T(r1, obj2, bArr, i, i2, i3);
        r1.A02 = obj2;
        return A0T;
    }

    public static int A04(C156627gw r4, C186358vA r5, byte[] bArr, int i, int i2, int i3) {
        C186358vA r2 = r5;
        Object BLT = r5.BLT();
        C156627gw r1 = r4;
        int A032 = A03(r1, r2, BLT, bArr, i, i2, i3);
        r2.BKT(BLT);
        r1.A02 = BLT;
        return A032;
    }

    public static int A05(C156627gw r8, C160677o7 r9, byte[] bArr, int i, int i2, int i3) {
        C172548Lq A022;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C156627gw r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A0A2 = A0A(r8, bArr, i2);
                r9.A02(i, Long.valueOf(r8.A01));
                return A0A2;
            } else if (i5 == 1) {
                r9.A02(i, Long.valueOf(AnonymousClass6C7.A0N(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A092 = A09(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 < 0) {
                    throw AnonymousClass6u5.A01();
                } else if (i6 <= bArr.length - A092) {
                    if (i6 == 0) {
                        A022 = C172548Lq.A01;
                    } else {
                        A022 = C172548Lq.A02(bArr, A092, i6);
                    }
                    r9.A02(i, A022);
                    return A092 + i6;
                } else {
                    throw AnonymousClass6u5.A00();
                }
            } else if (i5 == 3) {
                C160677o7 r4 = new C160677o7();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A09(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A05(r3, r4, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw AnonymousClass6u5.A02("Failed to parse the message.");
                }
                r9.A02(i, r4);
                return i4;
            } else if (i5 == 5) {
                r9.A02(i, Integer.valueOf(AnonymousClass6C7.A0B(bArr, i2)));
                return i2 + 4;
            }
        }
        throw AnonymousClass6u5.A02("Protocol message contained an invalid tag (zero).");
    }

    public static int A00(int i, int i2, int i3) {
        return i3 + (i2 * CodedOutputStream.A01(i << 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C156627gw r6, X.C186358vA r7, java.lang.Object r8, byte[] r9, int r10, int r11) {
        /*
            int r4 = r10 + 1
            r3 = r9
            byte r5 = r9[r10]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0B(r6, r9, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x001c
        L_0x0010:
            int r11 = r11 - r4
            if (r5 > r11) goto L_0x001c
            int r5 = r5 + r4
            r0 = r7
            r2 = r8
            r0.BLB(r1, r2, r3, r4, r5)
            r6.A02 = r8
            return r5
        L_0x001c:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A02(X.7gw, X.8vA, java.lang.Object, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r6.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        return r10 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A06(X.C156627gw r6, X.C142676xa r7, java.lang.Class r8, byte[] r9, int r10, int r11) {
        /*
            int[] r0 = X.AnonymousClass77F.A00
            int r0 = X.AnonymousClass6CA.A04(r7, r0)
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0057;
                case 3: goto L_0x0022;
                case 4: goto L_0x0010;
                case 5: goto L_0x0010;
                case 6: goto L_0x0019;
                case 7: goto L_0x0019;
                case 8: goto L_0x0033;
                case 9: goto L_0x005c;
                case 10: goto L_0x005c;
                case 11: goto L_0x005c;
                case 12: goto L_0x0067;
                case 13: goto L_0x0067;
                case 14: goto L_0x0097;
                case 15: goto L_0x0072;
                case 16: goto L_0x0081;
                case 17: goto L_0x0092;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "unsupported field type."
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0010:
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003f
        L_0x0019:
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x002e
        L_0x0022:
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x002e:
            r6.A02 = r0
            int r5 = r10 + 8
            return r5
        L_0x0033:
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x003f:
            r6.A02 = r0
            int r5 = r10 + 4
            return r5
        L_0x0044:
            int r5 = A0A(r6, r9, r10)
            long r3 = r6.A01
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x008f
        L_0x0057:
            int r5 = A07(r6, r9, r10)
            return r5
        L_0x005c:
            int r5 = A09(r6, r9, r10)
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008f
        L_0x0067:
            int r5 = A0A(r6, r9, r10)
            long r0 = r6.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x008f
        L_0x0072:
            int r5 = A09(r6, r9, r10)
            int r0 = r6.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008f
        L_0x0081:
            int r5 = A0A(r6, r9, r10)
            long r0 = r6.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x008f:
            r6.A02 = r0
            return r5
        L_0x0092:
            int r5 = A08(r6, r9, r10)
            return r5
        L_0x0097:
            X.7iD r0 = X.C157387iD.A02
            X.8vA r7 = r0.A00(r8)
            java.lang.Object r8 = r7.BLT()
            int r5 = A02(r6, r7, r8, r9, r10, r11)
            r7.BKT(r8)
            r6.A02 = r8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A06(X.7gw, X.6xa, java.lang.Class, byte[], int, int):int");
    }

    public static int A09(C156627gw r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0B(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A0A(C156627gw r8, byte[] bArr, int i) {
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

    public static int A0B(C156627gw r4, byte[] bArr, int i, int i2) {
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

    public static int A0C(C156627gw r2, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return A0A(r2, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return A09(r2, bArr, i2) + r2.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = A09(r2, bArr, i2);
                    i6 = r2.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A0C(r2, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw AnonymousClass6u5.A02("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw AnonymousClass6u5.A02("Protocol message contained an invalid tag (zero).");
    }

    public static int A0D(Object obj) {
        return ((List) obj).size();
    }

    public static C181368me A0H(C170238Ck r1, int i) {
        return (C181368me) r1.A0E[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c7, code lost:
        if (r38 == false) goto L_0x01c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C170238Ck A0I(X.AnonymousClass731 r39, X.C158277ji r40, X.C159367li r41, X.AnonymousClass733 r42, X.AnonymousClass7MO r43, X.C151437Ut r44) {
        /*
            r8 = r43
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x002c
            X.6ub r2 = X.C140836ub.PROTO2
        L_0x000b:
            X.6ub r1 = X.C140836ub.PROTO3
            r0 = 0
            boolean r38 = X.AnonymousClass000.A1Y(r2, r1)
            java.lang.String r13 = r8.A02
            int r26 = r13.length()
            char r0 = r13.charAt(r0)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r5) goto L_0x002f
            r0 = 1
        L_0x0022:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0030
            r0 = r1
            goto L_0x0022
        L_0x002c:
            X.6ub r2 = X.C140836ub.PROTO3
            goto L_0x000b
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r12 = r1 + 1
            char r3 = r13.charAt(r1)
            if (r3 < r5) goto L_0x004f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003c:
            int r1 = r12 + 1
            char r0 = r13.charAt(r12)
            if (r0 < r5) goto L_0x004c
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r12 = r1
            goto L_0x003c
        L_0x004c:
            int r0 = r0 << r2
            r3 = r3 | r0
            r12 = r1
        L_0x004f:
            if (r3 != 0) goto L_0x024b
            int[] r16 = A0G
            r3 = 0
            r2 = 0
            r1 = 0
            r7 = 0
            r6 = 0
            r0 = 0
            r14 = 0
        L_0x005a:
            sun.misc.Unsafe r25 = A0F
            java.lang.Object[] r11 = r8.A03
            X.8y2 r4 = r8.A01
            r28 = r4
            java.lang.Class r24 = r28.getClass()
            int r4 = r7 * 3
            int[] r4 = new int[r4]
            r23 = r4
            int r4 = r7 * 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            int r37 = r0 + r6
            r22 = r0
            r21 = r37
            r20 = 0
            r19 = 0
        L_0x007a:
            r4 = r26
            if (r12 >= r4) goto L_0x034f
            int r4 = r12 + 1
            char r9 = r13.charAt(r12)
            if (r9 < r5) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x008a:
            int r6 = r4 + 1
            char r4 = r13.charAt(r4)
            if (r4 < r5) goto L_0x009a
            int r9 = X.AnonymousClass6C9.A09(r4, r7, r9)
            int r7 = r7 + 13
            r4 = r6
            goto L_0x008a
        L_0x009a:
            int r4 = r4 << r7
            r9 = r9 | r4
            goto L_0x009e
        L_0x009d:
            r6 = r4
        L_0x009e:
            int r4 = r6 + 1
            char r8 = r13.charAt(r6)
            if (r8 < r5) goto L_0x00c0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x00aa:
            int r5 = r4 + 1
            char r6 = r13.charAt(r4)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r4) goto L_0x00bd
            int r8 = X.AnonymousClass6C9.A09(r6, r7, r8)
            int r7 = r7 + 13
            r4 = r5
            goto L_0x00aa
        L_0x00bd:
            int r6 = r6 << r7
            r8 = r8 | r6
            goto L_0x00c1
        L_0x00c0:
            r5 = r4
        L_0x00c1:
            r7 = r8 & 255(0xff, float:3.57E-43)
            r4 = r8 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x00cd
            int r4 = r20 + 1
            r16[r20] = r19
            r20 = r4
        L_0x00cd:
            r4 = 51
            if (r7 < r4) goto L_0x014d
            int r12 = r5 + 1
            char r6 = r13.charAt(r5)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r5) goto L_0x00f3
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L_0x00e0:
            int r15 = r12 + 1
            char r12 = r13.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            int r6 = X.AnonymousClass6C9.A09(r12, r4, r6)
            int r4 = r4 + 13
            r12 = r15
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r4
            r6 = r6 | r12
            r12 = r15
        L_0x00f3:
            int r5 = r7 + -51
            r4 = 9
            if (r5 == r4) goto L_0x0103
            r4 = 17
            if (r5 == r4) goto L_0x0103
            r4 = 12
            if (r5 != r4) goto L_0x0110
            if (r38 != 0) goto L_0x0110
        L_0x0103:
            int r4 = r19 / 3
            int r4 = r4 * 2
            int r15 = r4 + 1
            int r5 = r14 + 1
            r4 = r11[r14]
            r10[r15] = r4
            r14 = r5
        L_0x0110:
            int r15 = r6 * 2
            r5 = r11[r15]
            boolean r4 = r5 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x0142
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x011a:
            r4 = r25
            long r4 = r4.objectFieldOffset(r5)
            int r6 = (int) r4
            r18 = r6
            int r6 = r15 + 1
            r5 = r11[r6]
            boolean r4 = r5 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x0137
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x012d:
            r4 = r25
            long r5 = r4.objectFieldOffset(r5)
            int r4 = (int) r5
            r5 = 0
            goto L_0x0218
        L_0x0137:
            java.lang.String r5 = (java.lang.String) r5
            r4 = r24
            java.lang.reflect.Field r5 = A0L(r4, r5)
            r11[r6] = r5
            goto L_0x012d
        L_0x0142:
            java.lang.String r5 = (java.lang.String) r5
            r4 = r24
            java.lang.reflect.Field r5 = A0L(r4, r5)
            r11[r15] = r5
            goto L_0x011a
        L_0x014d:
            int r17 = r14 + 1
            r6 = r11[r14]
            java.lang.String r6 = (java.lang.String) r6
            r4 = r24
            java.lang.reflect.Field r6 = A0L(r4, r6)
            r4 = 9
            if (r7 == r4) goto L_0x01db
            r4 = 17
            if (r7 == r4) goto L_0x01db
            r4 = 27
            if (r7 == r4) goto L_0x01c9
            r4 = 49
            if (r7 == r4) goto L_0x01c9
            r4 = 12
            if (r7 == r4) goto L_0x01c7
            r4 = 30
            if (r7 == r4) goto L_0x01c7
            r4 = 44
            if (r7 == r4) goto L_0x01c7
            r4 = 50
            if (r7 != r4) goto L_0x0195
            int r14 = r22 + 1
            r16[r22] = r19
            int r4 = r19 / 3
            int r12 = r4 * 2
            int r15 = r17 + 1
            r4 = r11[r17]
            r10[r12] = r4
            r4 = r8 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x01d6
            int r12 = r12 + 1
            int r17 = r15 + 1
            r4 = r11[r15]
            r10[r12] = r4
            r22 = r14
        L_0x0195:
            r4 = r25
            long r14 = r4.objectFieldOffset(r6)
            int r4 = (int) r14
            r18 = r4
            r6 = r8 & 4096(0x1000, float:5.74E-42)
            r4 = 4096(0x1000, float:5.74E-42)
            if (r6 != r4) goto L_0x01eb
            r4 = 17
            if (r7 > r4) goto L_0x01eb
            int r4 = r5 + 1
            char r6 = r13.charAt(r5)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x01ff
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = 13
        L_0x01b7:
            int r12 = r4 + 1
            char r4 = r13.charAt(r4)
            if (r4 < r14) goto L_0x01e8
            int r6 = X.AnonymousClass6C9.A09(r4, r5, r6)
            int r5 = r5 + 13
            r4 = r12
            goto L_0x01b7
        L_0x01c7:
            if (r38 != 0) goto L_0x0195
        L_0x01c9:
            int r4 = r19 / 3
            int r4 = r4 * 2
            int r12 = r4 + 1
            int r15 = r17 + 1
            r4 = r11[r17]
            r10[r12] = r4
            goto L_0x01d8
        L_0x01d6:
            r22 = r14
        L_0x01d8:
            r17 = r15
            goto L_0x0195
        L_0x01db:
            int r4 = r19 / 3
            int r4 = r4 * 2
            int r12 = r4 + 1
            java.lang.Class r4 = r6.getType()
            r10[r12] = r4
            goto L_0x0195
        L_0x01e8:
            int r4 = r4 << r5
            r6 = r6 | r4
            goto L_0x0200
        L_0x01eb:
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r5
            r5 = 0
            r6 = 18
            if (r7 < r6) goto L_0x0216
            r6 = 49
            if (r7 > r6) goto L_0x0216
            int r6 = r21 + 1
            r16[r21] = r18
            r21 = r6
            goto L_0x0216
        L_0x01ff:
            r12 = r4
        L_0x0200:
            int r14 = r3 * 2
            int r4 = r6 / 32
            int r14 = r14 + r4
            r5 = r11[r14]
            boolean r4 = r5 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x0240
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
        L_0x020d:
            r4 = r25
            long r14 = r4.objectFieldOffset(r5)
            int r4 = (int) r14
            int r5 = r6 % 32
        L_0x0216:
            r14 = r17
        L_0x0218:
            int r17 = r19 + 1
            r23[r19] = r9
            int r15 = r17 + 1
            r6 = r8 & 512(0x200, float:7.175E-43)
            r9 = 0
            if (r6 == 0) goto L_0x0225
            r9 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0225:
            r6 = r8 & 256(0x100, float:3.59E-43)
            r8 = 0
            if (r6 == 0) goto L_0x022c
            r8 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x022c:
            r8 = r8 | r9
            int r6 = r7 << 20
            r8 = r8 | r6
            r8 = r8 | r18
            r23[r17] = r8
            int r19 = r15 + 1
            int r5 = r5 << 20
            r5 = r5 | r4
            r23[r15] = r5
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x007a
        L_0x0240:
            java.lang.String r5 = (java.lang.String) r5
            r4 = r24
            java.lang.reflect.Field r5 = A0L(r4, r5)
            r11[r14] = r5
            goto L_0x020d
        L_0x024b:
            int r0 = r12 + 1
            char r3 = r13.charAt(r12)
            if (r3 < r5) goto L_0x026a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0257:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0267
            int r3 = X.AnonymousClass6C9.A09(r0, r2, r3)
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0257
        L_0x0267:
            int r0 = r0 << r2
            r3 = r3 | r0
            r0 = r1
        L_0x026a:
            int r4 = r0 + 1
            char r9 = r13.charAt(r0)
            if (r9 < r5) goto L_0x0289
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0276:
            int r1 = r4 + 1
            char r0 = r13.charAt(r4)
            if (r0 < r5) goto L_0x0286
            int r9 = X.AnonymousClass6C9.A09(r0, r2, r9)
            int r2 = r2 + 13
            r4 = r1
            goto L_0x0276
        L_0x0286:
            int r0 = r0 << r2
            r9 = r9 | r0
            r4 = r1
        L_0x0289:
            int r0 = r4 + 1
            char r2 = r13.charAt(r4)
            if (r2 < r5) goto L_0x02a8
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = 13
        L_0x0295:
            int r1 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x02a5
            int r2 = X.AnonymousClass6C9.A09(r0, r4, r2)
            int r4 = r4 + 13
            r0 = r1
            goto L_0x0295
        L_0x02a5:
            int r0 = r0 << r4
            r2 = r2 | r0
            r0 = r1
        L_0x02a8:
            int r7 = r0 + 1
            char r1 = r13.charAt(r0)
            if (r1 < r5) goto L_0x02c7
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02b4:
            int r4 = r7 + 1
            char r0 = r13.charAt(r7)
            if (r0 < r5) goto L_0x02c4
            int r1 = X.AnonymousClass6C9.A09(r0, r6, r1)
            int r6 = r6 + 13
            r7 = r4
            goto L_0x02b4
        L_0x02c4:
            int r0 = r0 << r6
            r1 = r1 | r0
            r7 = r4
        L_0x02c7:
            int r0 = r7 + 1
            char r7 = r13.charAt(r7)
            if (r7 < r5) goto L_0x02e6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02d3:
            int r4 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x02e3
            int r7 = X.AnonymousClass6C9.A09(r0, r6, r7)
            int r6 = r6 + 13
            r0 = r4
            goto L_0x02d3
        L_0x02e3:
            int r0 = r0 << r6
            r7 = r7 | r0
            r0 = r4
        L_0x02e6:
            int r11 = r0 + 1
            char r6 = r13.charAt(r0)
            if (r6 < r5) goto L_0x0305
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x02f2:
            int r4 = r11 + 1
            char r0 = r13.charAt(r11)
            if (r0 < r5) goto L_0x0302
            int r6 = X.AnonymousClass6C9.A09(r0, r10, r6)
            int r10 = r10 + 13
            r11 = r4
            goto L_0x02f2
        L_0x0302:
            int r0 = r0 << r10
            r6 = r6 | r0
            r11 = r4
        L_0x0305:
            int r0 = r11 + 1
            char r11 = r13.charAt(r11)
            if (r11 < r5) goto L_0x0324
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0311:
            int r4 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0321
            int r11 = X.AnonymousClass6C9.A09(r0, r10, r11)
            int r10 = r10 + 13
            r0 = r4
            goto L_0x0311
        L_0x0321:
            int r0 = r0 << r10
            r11 = r11 | r0
            r0 = r4
        L_0x0324:
            int r12 = r0 + 1
            char r0 = r13.charAt(r0)
            if (r0 < r5) goto L_0x0343
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0330:
            int r10 = r12 + 1
            char r4 = r13.charAt(r12)
            if (r4 < r5) goto L_0x0340
            int r0 = X.AnonymousClass6C9.A09(r4, r14, r0)
            int r14 = r14 + 13
            r12 = r10
            goto L_0x0330
        L_0x0340:
            int r4 = r4 << r14
            r0 = r0 | r4
            r12 = r10
        L_0x0343:
            int r4 = r0 + r6
            int r4 = r4 + r11
            int[] r4 = new int[r4]
            r16 = r4
            int r14 = r3 * 2
            int r14 = r14 + r9
            goto L_0x005a
        L_0x034f:
            X.8Ck r24 = new X.8Ck
            r25 = r39
            r26 = r40
            r27 = r41
            r29 = r42
            r30 = r44
            r31 = r23
            r32 = r16
            r33 = r10
            r34 = r2
            r35 = r1
            r36 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0I(X.731, X.7ji, X.7li, X.733, X.7MO, X.7Ut):X.8Ck");
    }

    public static C160677o7 A0J(Object obj) {
        C130786cX r2 = (C130786cX) obj;
        C160677o7 r1 = r2.unknownFields;
        if (r1 != C160677o7.A04) {
            return r1;
        }
        C160677o7 r0 = new C160677o7();
        r2.unknownFields = r0;
        return r0;
    }

    public static List A0N(C170238Ck r2, Object obj, int i) {
        return r2.A05.A01(obj, (long) (i & 1048575));
    }

    public static List A0O(Object obj, long j) {
        return (List) UnsafeUtil.A01.A07(obj, j);
    }

    public static final void A0P(AnonymousClass7VF r1, Object obj, int i) {
        if (obj instanceof String) {
            CodedOutputStream codedOutputStream = r1.A00;
            AnonymousClass730.A06(codedOutputStream, i);
            codedOutputStream.A0J((String) obj);
            return;
        }
        CodedOutputStream codedOutputStream2 = r1.A00;
        AnonymousClass730.A06(codedOutputStream2, i);
        codedOutputStream2.A0G((C172548Lq) obj);
    }

    public static boolean A0R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C130786cX) {
            return ((C130786cX) obj).A0L();
        }
        return true;
    }

    public final int A0S(int i) {
        if (i >= this.A02 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A0C;
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        r7 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        r7 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0184, code lost:
        r13.putObject(r8, r9, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r13.putInt(r8, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c6, code lost:
        r13.putLong(r8, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r15 = r15 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d3, code lost:
        r9 = r19;
        r14 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0T(X.C156627gw r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r8 = r39
            r7 = r41
            A0Q(r8)
            sun.misc.Unsafe r13 = A0F
            r9 = -1
            r3 = 0
            r11 = 0
            r15 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0010:
            r2 = r7
            r4 = r37
            r36 = r42
            r0 = r36
            r20 = r43
            if (r7 >= r0) goto L_0x0094
            int r2 = r7 + 1
            r5 = r40
            byte r11 = r40[r7]
            r6 = r38
            if (r11 >= 0) goto L_0x002b
            int r2 = A0B(r6, r5, r11, r2)
            int r11 = r6.A00
        L_0x002b:
            int r19 = r11 >>> 3
            r7 = r11 & 7
            r1 = 3
            r0 = r19
            if (r0 <= r9) goto L_0x02ca
            int r3 = r3 / r1
            int r1 = r4.A02
            if (r0 < r1) goto L_0x02c7
            int r1 = r4.A01
            if (r0 > r1) goto L_0x02c7
            int[] r10 = r4.A0C
            int r0 = r10.length
            int r0 = r0 / 3
            int r9 = r0 + -1
        L_0x0044:
            if (r3 > r9) goto L_0x02c7
            int r0 = r9 + r3
            int r16 = r0 >>> 1
            int r12 = r16 * 3
            r1 = r10[r12]
            r0 = r19
            if (r0 != r1) goto L_0x02bd
            r3 = r12
        L_0x0053:
            r0 = -1
            if (r3 == r0) goto L_0x02c7
            int[] r1 = r4.A0C
            int r0 = r3 + 1
            r18 = r1[r0]
            int r12 = X.AnonymousClass6C8.A07(r18)
            long r9 = X.AnonymousClass6C9.A0K(r18)
            r0 = 17
            if (r12 > r0) goto L_0x01dd
            int r0 = r3 + 2
            r17 = r1[r0]
            int r0 = r17 >>> 20
            r16 = 1
            int r16 = r16 << r0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r17 & r1
            r0 = r17
            if (r0 == r14) goto L_0x01d9
            if (r14 == r1) goto L_0x0081
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x0081:
            r0 = r17
            long r0 = (long) r0
            int r15 = r13.getInt(r8, r0)
        L_0x0088:
            r0 = 5
            switch(r12) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00f7;
                case 5: goto L_0x0101;
                case 6: goto L_0x0115;
                case 7: goto L_0x0122;
                case 8: goto L_0x0139;
                case 9: goto L_0x0160;
                case 10: goto L_0x017d;
                case 11: goto L_0x00f7;
                case 12: goto L_0x018a;
                case 13: goto L_0x0115;
                case 14: goto L_0x0101;
                case 15: goto L_0x01aa;
                case 16: goto L_0x01ba;
                case 17: goto L_0x0295;
                default: goto L_0x008c;
            }
        L_0x008c:
            r14 = r17
        L_0x008e:
            r0 = r20
            if (r11 != r0) goto L_0x00b4
            if (r43 == 0) goto L_0x00b4
        L_0x0094:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == r0) goto L_0x009d
            long r0 = (long) r14
            r13.putInt(r8, r0, r15)
        L_0x009d:
            int r3 = r4.A00
            r1 = 0
        L_0x00a0:
            int r0 = r4.A03
            if (r3 >= r0) goto L_0x02d0
            int[] r0 = r4.A0D
            r9 = r0[r3]
            X.7Ut r0 = r4.A09
            r5 = r0
            r6 = r8
            r7 = r1
            java.lang.Object r1 = r4.A0Y(r5, r6, r7, r8, r9)
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00b4:
            X.7o7 r21 = A0J(r8)
            r20 = r6
            r22 = r5
            r25 = r36
            r23 = r11
            r24 = r2
            int r7 = A05(r20, r21, r22, r23, r24, r25)
            goto L_0x02b9
        L_0x00c8:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r0 = X.AnonymousClass6C7.A0N(r5, r2)
            double r24 = java.lang.Double.longBitsToDouble(r0)
            X.7bz r20 = com.google.protobuf.UnsafeUtil.A01
            r21 = r8
            r22 = r9
            r20.A0A(r21, r22, r24)
            goto L_0x0111
        L_0x00dd:
            if (r7 != r0) goto L_0x008c
            int r0 = X.AnonymousClass6C7.A0B(r5, r2)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            r0.A0B(r8, r9, r1)
            goto L_0x011e
        L_0x00ed:
            if (r7 != 0) goto L_0x008c
            int r7 = A0A(r6, r5, r2)
            long r0 = r6.A01
            goto L_0x01c6
        L_0x00f7:
            if (r7 != 0) goto L_0x008c
            int r7 = A09(r6, r5, r2)
            int r2 = r6.A00
            goto L_0x01b6
        L_0x0101:
            r0 = 1
            if (r7 != r0) goto L_0x008c
            long r24 = X.AnonymousClass6C7.A0N(r5, r2)
            r20 = r13
            r21 = r8
            r22 = r9
            r20.putLong(r21, r22, r24)
        L_0x0111:
            int r7 = r2 + 8
            goto L_0x01d1
        L_0x0115:
            if (r7 != r0) goto L_0x008c
            int r0 = X.AnonymousClass6C7.A0B(r5, r2)
            r13.putInt(r8, r9, r0)
        L_0x011e:
            int r7 = r2 + 4
            goto L_0x01d1
        L_0x0122:
            if (r7 != 0) goto L_0x008c
            int r7 = A0A(r6, r5, r2)
            long r0 = r6.A01
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1S(r2)
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            r0.A0F(r8, r9, r1)
            goto L_0x01d1
        L_0x0139:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r18
            if (r0 != 0) goto L_0x015b
            int r7 = A09(r6, r5, r2)
            int r1 = r6.A00
            if (r1 < 0) goto L_0x02ed
            if (r1 != 0) goto L_0x0151
            java.lang.String r0 = ""
            r6.A02 = r0
            goto L_0x0184
        L_0x0151:
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r0 = X.AnonymousClass6CA.A0W(r0, r5, r7, r1)
            r6.A02 = r0
            int r7 = r7 + r1
            goto L_0x0184
        L_0x015b:
            int r7 = A08(r6, r5, r2)
            goto L_0x0184
        L_0x0160:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            java.lang.Object r0 = r4.A0Z(r8, r3)
            X.8vA r21 = r4.A0X(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r0
            r24 = r2
            int r7 = A02(r20, r21, r22, r23, r24, r25)
            r4.A0e(r8, r3, r0)
            goto L_0x01d1
        L_0x017d:
            r0 = 2
            if (r7 != r0) goto L_0x008c
            int r7 = A07(r6, r5, r2)
        L_0x0184:
            java.lang.Object r0 = r6.A02
            r13.putObject(r8, r9, r0)
            goto L_0x01d1
        L_0x018a:
            if (r7 != 0) goto L_0x008c
            int r7 = A09(r6, r5, r2)
            int r2 = r6.A00
            X.8me r0 = A0H(r4, r3)
            if (r0 == 0) goto L_0x01b6
            boolean r0 = r0.BHj(r2)
            if (r0 != 0) goto L_0x01b6
            X.7o7 r1 = A0J(r8)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r1.A02(r11, r0)
            goto L_0x01d3
        L_0x01aa:
            if (r7 != 0) goto L_0x008c
            int r7 = A09(r6, r5, r2)
            int r0 = r6.A00
            int r2 = X.AnonymousClass6C8.A08(r0)
        L_0x01b6:
            r13.putInt(r8, r9, r2)
            goto L_0x01d1
        L_0x01ba:
            if (r7 != 0) goto L_0x008c
            int r7 = A0A(r6, r5, r2)
            long r0 = r6.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
        L_0x01c6:
            r20 = r13
            r21 = r8
            r22 = r9
            r24 = r0
            r20.putLong(r21, r22, r24)
        L_0x01d1:
            r15 = r15 | r16
        L_0x01d3:
            r9 = r19
            r14 = r17
            goto L_0x0010
        L_0x01d9:
            r17 = r14
            goto L_0x0088
        L_0x01dd:
            r0 = 27
            if (r12 != r0) goto L_0x0230
            r0 = 2
            if (r7 != r0) goto L_0x008e
            java.lang.Object r1 = r13.getObject(r8, r9)
            X.8ya r1 = (X.C188248ya) r1
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0202
            int r7 = r1.size()
            int r0 = r7 * 2
            if (r7 != 0) goto L_0x01fb
            r0 = 10
        L_0x01fb:
            X.8ya r1 = r1.BLN(r0)
            r13.putObject(r8, r9, r1)
        L_0x0202:
            X.8vA r4 = r4.A0X(r3)
        L_0x0206:
            java.lang.Object r0 = r4.BLT()
            r20 = r6
            r23 = r5
            r25 = r36
            r21 = r4
            r22 = r0
            r24 = r2
            int r7 = A02(r20, r21, r22, r23, r24, r25)
            r4.BKT(r0)
            r6.A02 = r0
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x02b9
            int r2 = A09(r6, r5, r7)
            int r0 = r6.A00
            if (r11 == r0) goto L_0x0206
            goto L_0x02b9
        L_0x0230:
            r0 = 49
            if (r12 > r0) goto L_0x025a
            r0 = r18
            long r0 = (long) r0
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r3
            r31 = r12
            r32 = r0
            r34 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A0V(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
        L_0x0255:
            if (r7 != r2) goto L_0x02b9
            r2 = r7
            goto L_0x008e
        L_0x025a:
            r0 = 50
            if (r12 != r0) goto L_0x0276
            r0 = 2
            if (r7 != r0) goto L_0x008e
            r22 = r6
            r24 = r5
            r26 = r36
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r3
            r28 = r9
            int r7 = r21.A0W(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0255
        L_0x0276:
            r24 = r5
            r26 = r36
            r22 = r6
            r29 = r7
            r30 = r18
            r31 = r12
            r32 = r3
            r33 = r9
            r21 = r4
            r23 = r8
            r25 = r2
            r27 = r11
            r28 = r19
            int r7 = r21.A0U(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0255
        L_0x0295:
            r0 = 3
            if (r7 != r0) goto L_0x008c
            java.lang.Object r1 = r4.A0Z(r8, r3)
            int r0 = r19 << 3
            r26 = r0 | 4
            X.8vA r21 = r4.A0X(r3)
            r20 = r6
            r23 = r5
            r25 = r36
            r22 = r1
            r24 = r2
            int r7 = A03(r20, r21, r22, r23, r24, r25, r26)
            r4.A0e(r8, r3, r1)
            r15 = r15 | r16
            r14 = r17
        L_0x02b9:
            r9 = r19
            goto L_0x0010
        L_0x02bd:
            if (r0 >= r1) goto L_0x02c3
            int r9 = r16 + -1
            goto L_0x0044
        L_0x02c3:
            int r3 = r16 + 1
            goto L_0x0044
        L_0x02c7:
            r3 = 0
            goto L_0x008e
        L_0x02ca:
            int r3 = r4.A0S(r0)
            goto L_0x0053
        L_0x02d0:
            if (r1 == 0) goto L_0x02d8
            X.7o7 r1 = (X.C160677o7) r1
            X.6cX r8 = (X.C130786cX) r8
            r8.unknownFields = r1
        L_0x02d8:
            r0 = r36
            if (r43 != 0) goto L_0x02df
            if (r2 != r0) goto L_0x02e6
            return r2
        L_0x02df:
            if (r2 > r0) goto L_0x02e6
            r0 = r20
            if (r11 != r0) goto L_0x02e6
            return r2
        L_0x02e6:
            java.lang.String r0 = "Failed to parse the message."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x02ed:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0T(X.7gw, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b4, code lost:
        r5.putObject(r8, X.AnonymousClass6C8.A0T(r2, r1), r3);
        com.google.protobuf.UnsafeUtil.A04(r8, X.AnonymousClass6C9.A0K(r2[r17]), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c4, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        r5.putObject(r8, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0173, code lost:
        r5.putInt(r8, r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0177, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0U(X.C156627gw r26, java.lang.Object r27, byte[] r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, long r37) {
        /*
            r25 = this;
            r7 = r29
            sun.misc.Unsafe r5 = A0F
            r12 = r25
            int[] r2 = r12.A0C
            r1 = r36
            int r17 = r36 + 2
            r0 = r2[r17]
            long r15 = X.AnonymousClass6C9.A0K(r0)
            r11 = 5
            r0 = 2
            r10 = r26
            r8 = r27
            r9 = r28
            r23 = r30
            r14 = r31
            r6 = r32
            r13 = r33
            r3 = r37
            switch(r35) {
                case 51: goto L_0x015f;
                case 52: goto L_0x014b;
                case 53: goto L_0x013b;
                case 54: goto L_0x013b;
                case 55: goto L_0x012e;
                case 56: goto L_0x011d;
                case 57: goto L_0x010d;
                case 58: goto L_0x00f8;
                case 59: goto L_0x00c5;
                case 60: goto L_0x009e;
                case 61: goto L_0x0091;
                case 62: goto L_0x012e;
                case 63: goto L_0x0068;
                case 64: goto L_0x010d;
                case 65: goto L_0x011d;
                case 66: goto L_0x0056;
                case 67: goto L_0x0044;
                case 68: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            return r7
        L_0x0028:
            r0 = 3
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0a(r8, r6, r1)
            r0 = r31 & -8
            r24 = r0 | 4
            X.8vA r19 = r12.A0X(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A03(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00b4
        L_0x0044:
            if (r33 != 0) goto L_0x0027
            int r7 = A0A(r10, r9, r7)
            long r0 = r10.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0147
        L_0x0056:
            if (r33 != 0) goto L_0x0027
            int r7 = A09(r10, r9, r7)
            int r0 = r10.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0147
        L_0x0068:
            if (r33 != 0) goto L_0x0027
            int r7 = A09(r10, r9, r7)
            int r2 = r10.A00
            X.8me r0 = A0H(r12, r1)
            if (r0 == 0) goto L_0x0088
            boolean r0 = r0.BHj(r2)
            if (r0 != 0) goto L_0x0088
            X.7o7 r1 = A0J(r8)
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r2)
            r1.A02(r14, r0)
            return r7
        L_0x0088:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.putObject(r8, r3, r0)
            goto L_0x0173
        L_0x0091:
            if (r13 != r0) goto L_0x0027
            int r7 = A07(r10, r9, r7)
            java.lang.Object r0 = r10.A02
            r5.putObject(r8, r3, r0)
            goto L_0x0173
        L_0x009e:
            if (r13 != r0) goto L_0x0027
            java.lang.Object r3 = r12.A0a(r8, r6, r1)
            X.8vA r19 = r12.A0X(r1)
            r20 = r3
            r21 = r9
            r22 = r7
            r18 = r10
            int r7 = A02(r18, r19, r20, r21, r22, r23)
        L_0x00b4:
            long r0 = X.AnonymousClass6C8.A0T(r2, r1)
            r5.putObject(r8, r0, r3)
            r0 = r2[r17]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            com.google.protobuf.UnsafeUtil.A04(r8, r0, r6)
            return r7
        L_0x00c5:
            if (r13 != r0) goto L_0x0027
            int r7 = A09(r10, r9, r7)
            int r2 = r10.A00
            if (r2 != 0) goto L_0x00d6
            java.lang.String r0 = ""
            r5.putObject(r8, r3, r0)
            goto L_0x0173
        L_0x00d6:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r34 = r34 & r0
            if (r34 == 0) goto L_0x00ed
            int r1 = r7 + r2
            X.7XY r0 = X.C159717mL.A00
            int r0 = r0.A01(r9, r7, r1)
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x00ed:
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r0 = X.AnonymousClass6CA.A0W(r0, r9, r7, r2)
            r5.putObject(r8, r3, r0)
            int r7 = r7 + r2
            goto L_0x0173
        L_0x00f8:
            if (r33 != 0) goto L_0x0027
            int r7 = A0A(r10, r9, r7)
            long r0 = r10.A01
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0147
        L_0x010d:
            if (r13 != r11) goto L_0x0027
            int r0 = X.AnonymousClass6C7.A0B(r9, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x0173
        L_0x011d:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.AnonymousClass6C7.A0N(r9, r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
            goto L_0x0173
        L_0x012e:
            if (r33 != 0) goto L_0x0027
            int r7 = A09(r10, r9, r7)
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0147
        L_0x013b:
            if (r33 != 0) goto L_0x0027
            int r7 = A0A(r10, r9, r7)
            long r0 = r10.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0147:
            r5.putObject(r8, r3, r0)
            goto L_0x0173
        L_0x014b:
            if (r13 != r11) goto L_0x0027
            int r0 = X.AnonymousClass6C7.A0B(r9, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 4
            goto L_0x0173
        L_0x015f:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            long r0 = X.AnonymousClass6C7.A0N(r9, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.putObject(r8, r3, r0)
            int r7 = r29 + 8
        L_0x0173:
            r0 = r15
            r5.putInt(r8, r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0U(X.7gw, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03d8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03d9, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0V(X.C156627gw r23, java.lang.Object r24, byte[] r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, long r33, long r35) {
        /*
            r22 = this;
            r10 = r26
            sun.misc.Unsafe r5 = A0F
            r13 = r24
            r0 = r35
            java.lang.Object r15 = r5.getObject(r13, r0)
            X.8ya r15 = (X.C188248ya) r15
            r2 = r15
            X.8T6 r2 = (X.AnonymousClass8T6) r2
            boolean r2 = r2.A00
            r4 = 2
            if (r2 != 0) goto L_0x0027
            int r3 = r15.size()
            int r2 = r3 * 2
            if (r3 != 0) goto L_0x0020
            r2 = 10
        L_0x0020:
            X.8ya r15 = r15.BLN(r2)
            r5.putObject(r13, r0, r15)
        L_0x0027:
            r6 = 5
            r0 = 1
            r3 = r22
            r7 = r23
            r9 = r25
            r11 = r27
            r2 = r28
            r1 = r30
            r5 = r31
            switch(r32) {
                case 18: goto L_0x0079;
                case 19: goto L_0x00c4;
                case 20: goto L_0x010f;
                case 21: goto L_0x010f;
                case 22: goto L_0x0149;
                case 23: goto L_0x003a;
                case 24: goto L_0x0183;
                case 25: goto L_0x01c2;
                case 26: goto L_0x020e;
                case 27: goto L_0x03ac;
                case 28: goto L_0x0284;
                case 29: goto L_0x0149;
                case 30: goto L_0x02c0;
                case 31: goto L_0x0183;
                case 32: goto L_0x003a;
                case 33: goto L_0x0309;
                case 34: goto L_0x034b;
                case 35: goto L_0x0079;
                case 36: goto L_0x00c4;
                case 37: goto L_0x010f;
                case 38: goto L_0x010f;
                case 39: goto L_0x0149;
                case 40: goto L_0x003a;
                case 41: goto L_0x0183;
                case 42: goto L_0x01c2;
                case 43: goto L_0x0149;
                case 44: goto L_0x02c0;
                case 45: goto L_0x0183;
                case 46: goto L_0x003a;
                case 47: goto L_0x0309;
                case 48: goto L_0x034b;
                case 49: goto L_0x038d;
                default: goto L_0x003a;
            }
        L_0x003a:
            if (r1 != r4) goto L_0x0058
            X.6bb r15 = (X.C130216bb) r15
            int r10 = A09(r7, r9, r10)
            int r2 = r7.A00
            int r2 = r2 + r10
        L_0x0045:
            if (r10 >= r2) goto L_0x0051
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            r15.A02(r0)
            int r10 = r10 + 8
            goto L_0x0045
        L_0x0051:
            if (r10 == r2) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x0058:
            if (r1 != r0) goto L_0x03d9
            X.6bb r15 = (X.C130216bb) r15
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            r15.A02(r0)
            int r10 = r26 + 8
        L_0x0065:
            if (r10 >= r11) goto L_0x03d9
            int r3 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            long r0 = X.AnonymousClass6C7.A0N(r9, r3)
            r15.A02(r0)
            int r10 = r3 + 8
            goto L_0x0065
        L_0x0079:
            if (r1 != r4) goto L_0x009b
            X.6bZ r15 = (X.C130196bZ) r15
            int r10 = A09(r7, r9, r10)
            int r2 = r7.A00
            int r2 = r2 + r10
        L_0x0084:
            if (r10 >= r2) goto L_0x0094
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r15.A01(r0)
            int r10 = r10 + 8
            goto L_0x0084
        L_0x0094:
            if (r10 == r2) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x009b:
            if (r1 != r0) goto L_0x03d9
            X.6bZ r15 = (X.C130196bZ) r15
            long r0 = X.AnonymousClass6C7.A0N(r9, r10)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r15.A01(r0)
            int r10 = r26 + 8
        L_0x00ac:
            if (r10 >= r11) goto L_0x03d9
            int r3 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            long r0 = X.AnonymousClass6C7.A0N(r9, r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            r15.A01(r0)
            int r10 = r3 + 8
            goto L_0x00ac
        L_0x00c4:
            if (r1 != r4) goto L_0x00e6
            X.6ba r15 = (X.C130206ba) r15
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x00cf:
            if (r10 >= r1) goto L_0x00df
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r15.A01(r0)
            int r10 = r10 + 4
            goto L_0x00cf
        L_0x00df:
            if (r10 == r1) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x00e6:
            if (r1 != r6) goto L_0x03d9
            X.6ba r15 = (X.C130206ba) r15
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r15.A01(r0)
            int r10 = r26 + 4
        L_0x00f7:
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r0 = X.AnonymousClass6C7.A0B(r9, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r15.A01(r0)
            int r10 = r1 + 4
            goto L_0x00f7
        L_0x010f:
            if (r1 != r4) goto L_0x012d
            X.6bb r15 = (X.C130216bb) r15
            int r10 = A09(r7, r9, r10)
            int r2 = r7.A00
            int r2 = r2 + r10
        L_0x011a:
            if (r10 >= r2) goto L_0x0126
            int r10 = A0A(r7, r9, r10)
            long r0 = r7.A01
            r15.A02(r0)
            goto L_0x011a
        L_0x0126:
            if (r10 == r2) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x012d:
            if (r30 != 0) goto L_0x03d9
            X.6bb r15 = (X.C130216bb) r15
            int r10 = A0A(r7, r9, r10)
        L_0x0135:
            long r0 = r7.A01
            r15.A02(r0)
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A0A(r7, r9, r1)
            goto L_0x0135
        L_0x0149:
            if (r1 != r4) goto L_0x0167
            X.6bX r15 = (X.C130176bX) r15
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x0154:
            if (r10 >= r1) goto L_0x0160
            int r10 = A09(r7, r9, r10)
            int r0 = r7.A00
            r15.AwT(r0)
            goto L_0x0154
        L_0x0160:
            if (r10 == r1) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x0167:
            if (r30 != 0) goto L_0x03d9
            X.6bX r15 = (X.C130176bX) r15
            int r10 = A09(r7, r9, r10)
        L_0x016f:
            int r0 = r7.A00
            r15.AwT(r0)
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A09(r7, r9, r1)
            goto L_0x016f
        L_0x0183:
            if (r1 != r4) goto L_0x01a1
            X.6bX r15 = (X.C130176bX) r15
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x018e:
            if (r10 >= r1) goto L_0x019a
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            r15.AwT(r0)
            int r10 = r10 + 4
            goto L_0x018e
        L_0x019a:
            if (r10 == r1) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x01a1:
            if (r1 != r6) goto L_0x03d9
            X.6bX r15 = (X.C130176bX) r15
            int r0 = X.AnonymousClass6C7.A0B(r9, r10)
            r15.AwT(r0)
            int r10 = r26 + 4
        L_0x01ae:
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r0 = X.AnonymousClass6C7.A0B(r9, r1)
            r15.AwT(r0)
            int r10 = r1 + 4
            goto L_0x01ae
        L_0x01c2:
            if (r1 != r4) goto L_0x01e8
            X.6bY r15 = (X.C130186bY) r15
            int r10 = A09(r7, r9, r10)
            int r5 = r7.A00
            int r5 = r5 + r10
        L_0x01cd:
            if (r10 >= r5) goto L_0x01e1
            int r10 = A0A(r7, r9, r10)
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r15.A02(r0)
            goto L_0x01cd
        L_0x01e1:
            if (r10 == r5) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x01e8:
            if (r30 != 0) goto L_0x03d9
            X.6bY r15 = (X.C130186bY) r15
            int r10 = A0A(r7, r9, r10)
            long r0 = r7.A01
            r4 = 0
        L_0x01f4:
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1S(r3)
            r15.A02(r0)
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A0A(r7, r9, r1)
            long r0 = r7.A01
            goto L_0x01f4
        L_0x020e:
            if (r1 != r4) goto L_0x03d9
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r33 = r33 & r0
            r3 = 0
            int r0 = (r33 > r3 ? 1 : (r33 == r3 ? 0 : -1))
            int r10 = A09(r7, r9, r10)
            if (r0 != 0) goto L_0x0249
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0244
            java.lang.String r3 = ""
        L_0x0225:
            if (r1 != 0) goto L_0x023d
            r15.add(r3)
        L_0x022a:
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A09(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x0244
            goto L_0x0225
        L_0x023d:
            java.nio.charset.Charset r0 = X.C155647fF.A04
            X.AnonymousClass6C9.A1E(r0, r15, r9, r10, r1)
            int r10 = r10 + r1
            goto L_0x022a
        L_0x0244:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        L_0x0249:
            int r4 = r7.A00
            if (r4 < 0) goto L_0x027f
            java.lang.String r3 = ""
        L_0x024f:
            if (r4 != 0) goto L_0x0267
            r15.add(r3)
        L_0x0254:
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A09(r7, r9, r1)
            int r4 = r7.A00
            if (r4 < 0) goto L_0x027f
            goto L_0x024f
        L_0x0267:
            int r1 = r10 + r4
            X.7XY r0 = X.C159717mL.A00
            int r0 = r0.A01(r9, r10, r1)
            if (r0 != 0) goto L_0x0278
            java.nio.charset.Charset r0 = X.C155647fF.A04
            X.AnonymousClass6C9.A1E(r0, r15, r9, r10, r4)
            r10 = r1
            goto L_0x0254
        L_0x0278:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x027f:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        L_0x0284:
            if (r1 != r4) goto L_0x03d9
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x02bb
            int r3 = r9.length
        L_0x028f:
            int r0 = r3 - r10
            if (r1 > r0) goto L_0x02b6
            if (r1 != 0) goto L_0x02ad
            X.8Lq r0 = X.C172548Lq.A01
            r15.add(r0)
        L_0x029a:
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A09(r7, r9, r1)
            int r1 = r7.A00
            if (r1 < 0) goto L_0x02bb
            goto L_0x028f
        L_0x02ad:
            X.8Lq r0 = X.C172548Lq.A02(r9, r10, r1)
            r15.add(r0)
            int r10 = r10 + r1
            goto L_0x029a
        L_0x02b6:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x02bb:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        L_0x02c0:
            if (r1 != r4) goto L_0x02df
            r2 = r15
            X.6bX r2 = (X.C130176bX) r2
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x02cc:
            if (r10 >= r1) goto L_0x02d8
            int r10 = A09(r7, r9, r10)
            int r0 = r7.A00
            r2.AwT(r0)
            goto L_0x02cc
        L_0x02d8:
            if (r10 == r1) goto L_0x02fc
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x02df:
            if (r30 != 0) goto L_0x03d9
            r4 = r15
            X.6bX r4 = (X.C130176bX) r4
            int r10 = A09(r7, r9, r10)
        L_0x02e8:
            int r0 = r7.A00
            r4.AwT(r0)
            if (r10 >= r11) goto L_0x02fc
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x02fc
            int r10 = A09(r7, r9, r1)
            goto L_0x02e8
        L_0x02fc:
            X.8me r11 = A0H(r3, r5)
            r14 = 0
            X.7Ut r12 = r3.A09
            r16 = r29
            X.C162507sF.A0B(r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0309:
            if (r1 != r4) goto L_0x032b
            X.6bX r15 = (X.C130176bX) r15
            int r10 = A09(r7, r9, r10)
            int r1 = r7.A00
            int r1 = r1 + r10
        L_0x0314:
            if (r10 >= r1) goto L_0x0324
            int r10 = A09(r7, r9, r10)
            int r0 = r7.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r15.AwT(r0)
            goto L_0x0314
        L_0x0324:
            if (r10 == r1) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x032b:
            if (r30 != 0) goto L_0x03d9
            X.6bX r15 = (X.C130176bX) r15
            int r10 = A09(r7, r9, r10)
        L_0x0333:
            int r0 = r7.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            r15.AwT(r0)
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A09(r7, r9, r1)
            goto L_0x0333
        L_0x034b:
            if (r1 != r4) goto L_0x036d
            X.6bb r15 = (X.C130216bb) r15
            int r10 = A09(r7, r9, r10)
            int r2 = r7.A00
            int r2 = r2 + r10
        L_0x0356:
            if (r10 >= r2) goto L_0x0366
            int r10 = A0A(r7, r9, r10)
            long r0 = r7.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r15.A02(r0)
            goto L_0x0356
        L_0x0366:
            if (r10 == r2) goto L_0x03d9
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x036d:
            if (r30 != 0) goto L_0x03d9
            X.6bb r15 = (X.C130216bb) r15
            int r10 = A0A(r7, r9, r10)
        L_0x0375:
            long r0 = r7.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            r15.A02(r0)
            if (r10 >= r11) goto L_0x03d9
            int r1 = A09(r7, r9, r10)
            int r0 = r7.A00
            if (r2 != r0) goto L_0x03d9
            int r10 = A0A(r7, r9, r1)
            goto L_0x0375
        L_0x038d:
            r0 = 3
            if (r1 != r0) goto L_0x03d9
            X.8vA r8 = r3.A0X(r5)
            r0 = r28 & -8
            r12 = r0 | 4
        L_0x0398:
            int r3 = A04(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r7.A02
            r15.add(r0)
            if (r3 >= r11) goto L_0x03d8
            int r10 = A09(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x0398
            return r3
        L_0x03ac:
            if (r1 != r4) goto L_0x03d9
            X.8vA r1 = r3.A0X(r5)
        L_0x03b2:
            java.lang.Object r0 = r1.BLT()
            r16 = r7
            r17 = r1
            r18 = r0
            r19 = r9
            r20 = r10
            r21 = r11
            int r3 = A02(r16, r17, r18, r19, r20, r21)
            r1.BKT(r0)
            r7.A02 = r0
            r15.add(r0)
            if (r3 >= r11) goto L_0x03d8
            int r10 = A09(r7, r9, r3)
            int r0 = r7.A00
            if (r2 == r0) goto L_0x03b2
        L_0x03d8:
            return r3
        L_0x03d9:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0V(X.7gw, java.lang.Object, byte[], int, int, int, int, int, int, int, long, long):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0W(X.C156627gw r17, java.lang.Object r18, byte[] r19, int r20, int r21, int r22, long r23) {
        /*
            r16 = this;
            sun.misc.Unsafe r4 = A0F
            r0 = r16
            java.lang.Object[] r1 = r0.A0E
            int r0 = r22 / 3
            int r0 = r0 * 2
            r3 = r1[r0]
            r5 = r18
            r1 = r23
            java.lang.Object r6 = r4.getObject(r5, r1)
            r0 = r6
            X.8Tq r0 = (X.C174278Tq) r0
            boolean r0 = r0.isMutable
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002a
            X.8Tq r0 = X.C174278Tq.A00
            X.8Tq r0 = r0.A01()
            X.C159367li.A01(r0, r6)
            r4.putObject(r5, r1, r0)
            r6 = r0
        L_0x002a:
            X.7K4 r3 = (X.AnonymousClass7K4) r3
            X.7MN r5 = r3.A00
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            r10 = r17
            r13 = r19
            r0 = r20
            int r8 = A09(r10, r13, r0)
            int r1 = r10.A00
            if (r1 < 0) goto L_0x0094
            r15 = r21
            int r0 = r21 - r8
            if (r1 > r0) goto L_0x0094
            int r4 = r8 + r1
            java.lang.String r7 = ""
            java.lang.Object r3 = r5.A03
            r2 = r3
        L_0x004b:
            if (r8 >= r4) goto L_0x0087
            int r14 = r8 + 1
            byte r8 = r19[r8]
            if (r8 >= 0) goto L_0x0059
            int r14 = A0B(r10, r13, r8, r14)
            int r8 = r10.A00
        L_0x0059:
            int r9 = r8 >>> 3
            r1 = r8 & 7
            r0 = 1
            if (r9 == r0) goto L_0x0074
            r0 = 2
            if (r9 != r0) goto L_0x0082
            X.6xa r11 = r5.A01
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0082
            java.lang.Class r12 = r3.getClass()
            int r8 = A06(r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r10.A02
            goto L_0x004b
        L_0x0074:
            X.6xa r11 = r5.A00
            int r0 = r11.wireType
            if (r1 != r0) goto L_0x0082
            r12 = 0
            int r8 = A06(r10, r11, r12, r13, r14, r15)
            java.lang.Object r7 = r10.A02
            goto L_0x004b
        L_0x0082:
            int r8 = A0C(r10, r13, r8, r14, r15)
            goto L_0x004b
        L_0x0087:
            if (r8 != r4) goto L_0x008d
            r6.put(r7, r2)
            return r4
        L_0x008d:
            java.lang.String r0 = "Failed to parse the message."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x0094:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0W(X.7gw, java.lang.Object, byte[], int, int, int, long):int");
    }

    public final C186358vA A0X(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A0E;
        C186358vA r0 = (C186358vA) objArr[i2];
        if (r0 != null) {
            return r0;
        }
        C186358vA A002 = C157387iD.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = A002;
        return A002;
    }

    public final Object A0Y(C151437Ut r13, Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = this.A0C;
        int i2 = iArr[i];
        Object A0K = A0K(iArr[i + 1], obj);
        if (A0K != null) {
            Object[] objArr = this.A0E;
            int i3 = (i / 3) * 2;
            C181368me r5 = (C181368me) objArr[i3 + 1];
            if (r5 != null) {
                AnonymousClass7MN r4 = ((AnonymousClass7K4) objArr[i3]).A00;
                Iterator A0u = AnonymousClass001.A0u((AbstractMap) A0K);
                while (A0u.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                    if (!r5.BHj(AnonymousClass0x2.A08(A0w))) {
                        if (obj2 == null) {
                            obj2 = r13.A00(obj3);
                        }
                        Object key = A0w.getKey();
                        Object value = A0w.getValue();
                        C142676xa r8 = r4.A00;
                        int A002 = C161737qL.A00(r8, key, 1);
                        C142676xa r6 = r4.A01;
                        int A003 = A002 + C161737qL.A00(r6, value, 2);
                        byte[] bArr = new byte[A003];
                        C130296bj r2 = new C130296bj(bArr, A003);
                        try {
                            Object key2 = A0w.getKey();
                            Object value2 = A0w.getValue();
                            C161737qL.A01(r2, r8, key2, 1);
                            C161737qL.A01(r2, r6, value2, 2);
                            r2.A04();
                            ((C160677o7) obj2).A02((i2 << 3) | 2, new C130256bf(bArr));
                            A0u.remove();
                        } catch (IOException e) {
                            throw C18330xA.A09(e);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public final void A0b(C160837oO r5, Object obj, int i) {
        long A0K;
        Object A0H;
        if ((536870912 & i) != 0) {
            A0K = AnonymousClass6C9.A0K(i);
            A0H = C160837oO.A04(r5).A0J();
        } else {
            boolean z = this.A0A;
            A0K = AnonymousClass6C9.A0K(i);
            C153797c2 A042 = C160837oO.A04(r5);
            if (z) {
                A0H = A042.A0I();
            } else {
                A0H = A042.A0H();
            }
        }
        UnsafeUtil.A05(obj, A0K, A0H);
    }

    public final void A0c(AnonymousClass7VF r11, Object obj, int i, int i2) {
        if (obj != null) {
            AnonymousClass7MN r6 = ((AnonymousClass7K4) this.A0E[(i2 / 3) * 2]).A00;
            CodedOutputStream codedOutputStream = r11.A00;
            Iterator A0u = AnonymousClass001.A0u((AbstractMap) obj);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                AnonymousClass730.A06(codedOutputStream, i);
                Object key = A0w.getKey();
                Object value = A0w.getValue();
                C142676xa r4 = r6.A00;
                int A002 = C161737qL.A00(r4, key, 1);
                C142676xa r2 = r6.A01;
                codedOutputStream.A07(A002 + C161737qL.A00(r2, value, 2));
                Object key2 = A0w.getKey();
                Object value2 = A0w.getValue();
                C161737qL.A01(codedOutputStream, r4, key2, 1);
                C161737qL.A01(codedOutputStream, r2, value2, 2);
            }
        }
    }

    public final void A0d(Object obj, int i) {
        int i2 = this.A0C[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            UnsafeUtil.A04(obj, j, (1 << (i2 >>> 20)) | UnsafeUtil.A01.A05(obj, j));
        }
    }

    public final void A0e(Object obj, int i, Object obj2) {
        A0F.putObject(obj, AnonymousClass6C8.A0T(this.A0C, i), obj2);
        A0d(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0f(int r10, java.lang.Object r11) {
        /*
            r9 = this;
            int[] r8 = r9.A0C
            int r0 = r10 + 2
            r4 = r8[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r4
            long r1 = (long) r0
            r6 = 1048575(0xfffff, double:5.18065E-318)
            r5 = 0
            r3 = 1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            int r0 = r10 + 1
            r0 = r8[r0]
            long r1 = X.AnonymousClass6C9.A0K(r0)
            int r0 = X.AnonymousClass6C8.A07(r0)
            r3 = 0
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0074;
                case 2: goto L_0x0069;
                case 3: goto L_0x0069;
                case 4: goto L_0x0060;
                case 5: goto L_0x0069;
                case 6: goto L_0x0060;
                case 7: goto L_0x0059;
                case 8: goto L_0x0038;
                case 9: goto L_0x002a;
                case 10: goto L_0x0031;
                case 11: goto L_0x0060;
                case 12: goto L_0x0060;
                case 13: goto L_0x0060;
                case 14: goto L_0x0069;
                case 15: goto L_0x0060;
                case 16: goto L_0x0069;
                case 17: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x002a:
            java.lang.Object r0 = X.C153777bz.A00(r11, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0031:
            X.8Lq r0 = X.C172548Lq.A01
            java.lang.Object r1 = X.C153777bz.A00(r11, r1)
            goto L_0x004f
        L_0x0038:
            java.lang.Object r1 = X.C153777bz.A00(r11, r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
        L_0x0046:
            r0 = r0 ^ 1
            return r0
        L_0x0049:
            boolean r0 = r1 instanceof X.C172548Lq
            if (r0 == 0) goto L_0x0054
            X.8Lq r0 = X.C172548Lq.A01
        L_0x004f:
            boolean r0 = r0.equals(r1)
            goto L_0x0046
        L_0x0054:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6CA.A0N()
            throw r0
        L_0x0059:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            boolean r0 = r0.A0J(r11, r1)
            return r0
        L_0x0060:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r0.A05(r11, r1)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0069:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            long r1 = r0.A06(r11, r1)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0074:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r0.A03(r11, r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x0081:
            int r0 = r4 >>> 20
            int r3 = r3 << r0
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r0.A05(r11, r1)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x009d
            goto L_0x009c
        L_0x008e:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            double r0 = r0.A02(r11, r1)
            long r1 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.A0f(int, java.lang.Object):boolean");
    }

    public final boolean A0g(Object obj, int i, int i2) {
        return AnonymousClass000.A1U(UnsafeUtil.A01.A05(obj, AnonymousClass6C7.A0O(this.A0C, i2)), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r8 != r1) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r4 != r0) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean B2c(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r7 = r11.A0C
            int r6 = r7.length
            r10 = 0
            r5 = 0
        L_0x0005:
            if (r5 >= r6) goto L_0x00ca
            int r0 = r5 + 1
            r0 = r7[r0]
            long r2 = X.AnonymousClass6C9.A0K(r0)
            int r0 = X.AnonymousClass6C8.A07(r0)
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0036;
                case 2: goto L_0x0053;
                case 3: goto L_0x0053;
                case 4: goto L_0x006c;
                case 5: goto L_0x0053;
                case 6: goto L_0x006c;
                case 7: goto L_0x0081;
                case 8: goto L_0x0099;
                case 9: goto L_0x0099;
                case 10: goto L_0x0099;
                case 11: goto L_0x006c;
                case 12: goto L_0x006c;
                case 13: goto L_0x006c;
                case 14: goto L_0x0053;
                case 15: goto L_0x006c;
                case 16: goto L_0x0053;
                case 17: goto L_0x0099;
                case 18: goto L_0x00b4;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00b4;
                case 21: goto L_0x00b4;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00b4;
                case 24: goto L_0x00b4;
                case 25: goto L_0x00b4;
                case 26: goto L_0x00b4;
                case 27: goto L_0x00b4;
                case 28: goto L_0x00b4;
                case 29: goto L_0x00b4;
                case 30: goto L_0x00b4;
                case 31: goto L_0x00b4;
                case 32: goto L_0x00b4;
                case 33: goto L_0x00b4;
                case 34: goto L_0x00b4;
                case 35: goto L_0x00b4;
                case 36: goto L_0x00b4;
                case 37: goto L_0x00b4;
                case 38: goto L_0x00b4;
                case 39: goto L_0x00b4;
                case 40: goto L_0x00b4;
                case 41: goto L_0x00b4;
                case 42: goto L_0x00b4;
                case 43: goto L_0x00b4;
                case 44: goto L_0x00b4;
                case 45: goto L_0x00b4;
                case 46: goto L_0x00b4;
                case 47: goto L_0x00b4;
                case 48: goto L_0x00b4;
                case 49: goto L_0x00b4;
                case 50: goto L_0x00b4;
                case 51: goto L_0x00a4;
                case 52: goto L_0x00a4;
                case 53: goto L_0x00a4;
                case 54: goto L_0x00a4;
                case 55: goto L_0x00a4;
                case 56: goto L_0x00a4;
                case 57: goto L_0x00a4;
                case 58: goto L_0x00a4;
                case 59: goto L_0x00a4;
                case 60: goto L_0x00a4;
                case 61: goto L_0x00a4;
                case 62: goto L_0x00a4;
                case 63: goto L_0x00a4;
                case 64: goto L_0x00a4;
                case 65: goto L_0x00a4;
                case 66: goto L_0x00a4;
                case 67: goto L_0x00a4;
                case 68: goto L_0x00a4;
                default: goto L_0x0016;
            }
        L_0x0016:
            int r5 = r5 + 3
            goto L_0x0005
        L_0x0019:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            X.7bz r4 = com.google.protobuf.UnsafeUtil.A01
            double r0 = r4.A02(r12, r2)
            long r8 = java.lang.Double.doubleToLongBits(r0)
            double r0 = r4.A02(r13, r2)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x0067
        L_0x0036:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            X.7bz r1 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r1.A03(r12, r2)
            int r4 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.A03(r13, r2)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0095
        L_0x0053:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            long r8 = r0.A06(r12, r2)
            long r1 = r0.A06(r13, r2)
        L_0x0067:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00da
            goto L_0x0016
        L_0x006c:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            int r4 = r0.A05(r12, r2)
            int r0 = r0.A05(r13, r2)
            goto L_0x0095
        L_0x0081:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            boolean r4 = r0.A0J(r12, r2)
            boolean r0 = r0.A0J(r13, r2)
        L_0x0095:
            if (r4 != r0) goto L_0x00da
            goto L_0x0016
        L_0x0099:
            boolean r1 = r11.A0f(r5, r12)
            boolean r0 = r11.A0f(r5, r13)
            if (r1 != r0) goto L_0x00da
            goto L_0x00b4
        L_0x00a4:
            long r0 = X.AnonymousClass6C7.A0O(r7, r5)
            X.7bz r8 = com.google.protobuf.UnsafeUtil.A01
            int r4 = r8.A05(r12, r0)
            int r0 = r8.A05(r13, r0)
            if (r4 != r0) goto L_0x00da
        L_0x00b4:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            java.lang.Object r1 = r0.A07(r12, r2)
            java.lang.Object r0 = r0.A07(r13, r2)
            if (r1 == r0) goto L_0x0016
            if (r1 == 0) goto L_0x00da
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            goto L_0x0016
        L_0x00ca:
            X.6cX r12 = (X.C130786cX) r12
            X.7o7 r1 = r12.unknownFields
            X.6cX r13 = (X.C130786cX) r13
            X.7o7 r0 = r13.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            r0 = 1
            return r0
        L_0x00da:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.B2c(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x030a, code lost:
        if (r0 >= 0) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0312, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0314, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0320, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0322, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x032e, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0330, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033c, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x033e, code lost:
        r1 = X.C153777bz.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0344, code lost:
        if ((r1 instanceof X.C172548Lq) == false) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0346, code lost:
        r12 = X.AnonymousClass730.A04(r7);
        r1 = ((X.C172548Lq) r1).A03();
        r12 = r12 + (X.AnonymousClass6C7.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0358, code lost:
        r12 = X.AnonymousClass730.A04(r7);
        r0 = com.google.protobuf.CodedOutputStream.A03((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0368, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036a, code lost:
        r12 = X.C162507sF.A00(A0X(r3), X.C153777bz.A00(r6, r0), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037c, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037e, code lost:
        r12 = X.AnonymousClass730.A04(r7);
        r1 = ((X.C172548Lq) X.C153777bz.A00(r6, r0)).A03();
        r12 = r12 + (X.AnonymousClass6C7.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03be, code lost:
        if (r0 >= 0) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03c0, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03c5, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03cc, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03ce, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03d9, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03db, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0418, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x041a, code lost:
        r1 = A0X(r3);
        r12 = X.AnonymousClass730.A04(r7) * 2;
        r0 = ((X.C170198Cg) ((X.C187928y2) X.C153777bz.A00(r6, r0))).A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0430, code lost:
        r12 = r12 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0431, code lost:
        r16 = r16 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04c4, code lost:
        if (r0 >= 0) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x051e, code lost:
        if (r0 >= 0) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05db, code lost:
        if (r2 <= 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05dd, code lost:
        r1 = (X.AnonymousClass730.A04(r8) + X.AnonymousClass6C7.A00(r2)) + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06fa, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0718, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x071a, code lost:
        r1 = A0X(r3);
        r13 = X.AnonymousClass730.A04(r8) * 2;
        r0 = ((X.C170198Cg) ((X.C187928y2) r4.getObject(r6, r1))).A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x075c, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x075e, code lost:
        r13 = X.AnonymousClass730.A04(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0768, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x076a, code lost:
        r1 = X.AnonymousClass730.A04(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0770, code lost:
        r16 = r16 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0780, code lost:
        if (r0 >= 0) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0798, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x079a, code lost:
        r13 = X.AnonymousClass730.A04(r8);
        r1 = ((X.C172548Lq) r4.getObject(r6, r1)).A03();
        r13 = r13 + (X.AnonymousClass6C7.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07b2, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07b4, code lost:
        r13 = X.C162507sF.A00(A0X(r3), r4.getObject(r6, r1), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07c4, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07c6, code lost:
        r1 = r4.getObject(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x07cc, code lost:
        if ((r1 instanceof X.C172548Lq) == false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07ce, code lost:
        r13 = X.AnonymousClass730.A04(r8);
        r1 = ((X.C172548Lq) r1).A03();
        r13 = r13 + (X.AnonymousClass6C7.A00(r1) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x07df, code lost:
        r13 = X.AnonymousClass730.A04(r8);
        r0 = com.google.protobuf.CodedOutputStream.A03((java.lang.String) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x07ec, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07ee, code lost:
        r13 = X.AnonymousClass730.A04(r8) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0802, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0804, code lost:
        r13 = X.AnonymousClass730.A04(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0817, code lost:
        if (r0 >= 0) goto L_0x0819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0819, code lost:
        r0 = X.AnonymousClass6C7.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x081e, code lost:
        r0 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0842, code lost:
        r13 = r13 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0846, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0848, code lost:
        r13 = X.AnonymousClass730.A04(r8) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0851, code lost:
        if (r0 == false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0853, code lost:
        r13 = X.AnonymousClass730.A04(r8) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013b, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019f, code lost:
        if (r0 >= 0) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ed, code lost:
        if (r0 >= 0) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029e, code lost:
        if (r1 <= 0) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a0, code lost:
        r12 = (X.AnonymousClass730.A04(r7) + X.AnonymousClass6C7.A00(r1)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b0, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b2, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02be, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c0, code lost:
        r12 = X.AnonymousClass730.A04(r7) + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BCq(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r18
            r5 = r17
            boolean r0 = r5.A0B
            sun.misc.Unsafe r4 = A0F
            if (r0 == 0) goto L_0x0435
            r3 = 0
            r16 = 0
        L_0x000d:
            int[] r1 = r5.A0C
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0860
            int r0 = r3 + 1
            r0 = r1[r0]
            int r2 = X.AnonymousClass6C8.A07(r0)
            r7 = r1[r3]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            switch(r2) {
                case 0: goto L_0x0157;
                case 1: goto L_0x015d;
                case 2: goto L_0x0163;
                case 3: goto L_0x0179;
                case 4: goto L_0x018f;
                case 5: goto L_0x01a3;
                case 6: goto L_0x01a9;
                case 7: goto L_0x01af;
                case 8: goto L_0x01b5;
                case 9: goto L_0x01bb;
                case 10: goto L_0x01c1;
                case 11: goto L_0x01c7;
                case 12: goto L_0x01dd;
                case 13: goto L_0x01f1;
                case 14: goto L_0x01f7;
                case 15: goto L_0x01fd;
                case 16: goto L_0x0213;
                case 17: goto L_0x022d;
                case 18: goto L_0x0038;
                case 19: goto L_0x004b;
                case 20: goto L_0x005e;
                case 21: goto L_0x0076;
                case 22: goto L_0x008a;
                case 23: goto L_0x0038;
                case 24: goto L_0x004b;
                case 25: goto L_0x009e;
                case 26: goto L_0x00b1;
                case 27: goto L_0x00bd;
                case 28: goto L_0x00cd;
                case 29: goto L_0x00d9;
                case 30: goto L_0x00ed;
                case 31: goto L_0x004b;
                case 32: goto L_0x0038;
                case 33: goto L_0x0101;
                case 34: goto L_0x0115;
                case 35: goto L_0x0233;
                case 36: goto L_0x023e;
                case 37: goto L_0x0249;
                case 38: goto L_0x0254;
                case 39: goto L_0x025f;
                case 40: goto L_0x0233;
                case 41: goto L_0x023e;
                case 42: goto L_0x026a;
                case 43: goto L_0x0273;
                case 44: goto L_0x027e;
                case 45: goto L_0x023e;
                case 46: goto L_0x0233;
                case 47: goto L_0x0289;
                case 48: goto L_0x0294;
                case 49: goto L_0x0129;
                case 50: goto L_0x0026;
                case 51: goto L_0x02ac;
                case 52: goto L_0x02ba;
                case 53: goto L_0x02c8;
                case 54: goto L_0x02e0;
                case 55: goto L_0x02f8;
                case 56: goto L_0x030e;
                case 57: goto L_0x031c;
                case 58: goto L_0x032a;
                case 59: goto L_0x0338;
                case 60: goto L_0x0364;
                case 61: goto L_0x0378;
                case 62: goto L_0x0394;
                case 63: goto L_0x03ac;
                case 64: goto L_0x03c8;
                case 65: goto L_0x03d5;
                case 66: goto L_0x03e2;
                case 67: goto L_0x03f9;
                case 68: goto L_0x0414;
                default: goto L_0x0023;
            }
        L_0x0023:
            int r3 = r3 + 3
            goto L_0x000d
        L_0x0026:
            java.lang.Object r2 = X.C153777bz.A00(r6, r0)
            java.lang.Object[] r1 = r5.A0E
            int r0 = r3 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r12 = X.C159367li.A00(r2, r0, r7)
            goto L_0x0431
        L_0x0038:
            java.util.List r0 = A0O(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x013b
            int r0 = X.AnonymousClass730.A04(r7)
            int r0 = r0 + 8
            int r12 = r12 * r0
            goto L_0x0431
        L_0x004b:
            java.util.List r0 = A0O(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x013b
            int r0 = X.AnonymousClass730.A04(r7)
            int r0 = r0 + 4
            int r12 = r12 * r0
            goto L_0x0431
        L_0x005e:
            java.util.List r2 = A0O(r6, r0)
            int r0 = r2.size()
            if (r0 == 0) goto L_0x013b
            int r1 = X.C162507sF.A04(r2)
            int r0 = r2.size()
            int r12 = A00(r7, r0, r1)
            goto L_0x0431
        L_0x0076:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A08(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x008a:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A03(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x009e:
            java.util.List r0 = A0O(r6, r0)
            int r12 = r0.size()
            if (r12 == 0) goto L_0x013b
            int r0 = X.AnonymousClass730.A04(r7)
            int r0 = r0 + 1
            int r12 = r12 * r0
            goto L_0x0431
        L_0x00b1:
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C162507sF.A0A(r0, r7)
            goto L_0x0431
        L_0x00bd:
            java.lang.Object r1 = X.C153777bz.A00(r6, r0)
            java.util.List r1 = (java.util.List) r1
            X.8vA r0 = r5.A0X(r3)
            int r12 = X.C162507sF.A01(r0, r1, r7)
            goto L_0x0431
        L_0x00cd:
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r12 = X.C162507sF.A09(r0, r7)
            goto L_0x0431
        L_0x00d9:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A07(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x00ed:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A02(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x0101:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A05(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x0115:
            java.util.List r0 = A0O(r6, r0)
            int r1 = r0.size()
            if (r1 == 0) goto L_0x013b
            int r0 = X.C162507sF.A06(r0)
            int r12 = A00(r7, r1, r0)
            goto L_0x0431
        L_0x0129:
            java.lang.Object r11 = X.C153777bz.A00(r6, r0)
            java.util.List r11 = (java.util.List) r11
            X.8vA r10 = r5.A0X(r3)
            int r9 = r11.size()
            r8 = 0
            r12 = 0
            if (r9 != 0) goto L_0x013e
        L_0x013b:
            r12 = 0
            goto L_0x0431
        L_0x013e:
            if (r8 >= r9) goto L_0x0431
            java.lang.Object r2 = r11.get(r8)
            X.8y2 r2 = (X.C187928y2) r2
            int r0 = X.AnonymousClass730.A04(r7)
            int r1 = r0 * 2
            X.8Cg r2 = (X.C170198Cg) r2
            int r0 = r2.A0D(r10)
            int r1 = r1 + r0
            int r12 = r12 + r1
            int r8 = r8 + 1
            goto L_0x013e
        L_0x0157:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x02b0
        L_0x015d:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x02be
        L_0x0163:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r2.A06(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x0179:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r2.A06(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x018f:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r2.A05(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            if (r0 < 0) goto L_0x03c5
            goto L_0x03c0
        L_0x01a3:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x0312
        L_0x01a9:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x0320
        L_0x01af:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x032e
        L_0x01b5:
            boolean r2 = r5.A0f(r3, r6)
            goto L_0x033c
        L_0x01bb:
            boolean r2 = r5.A0f(r3, r6)
            goto L_0x0368
        L_0x01c1:
            boolean r2 = r5.A0f(r3, r6)
            goto L_0x037c
        L_0x01c7:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r2.A05(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0430
        L_0x01dd:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r2.A05(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            if (r0 < 0) goto L_0x03c5
            goto L_0x03c0
        L_0x01f1:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x03cc
        L_0x01f7:
            boolean r0 = r5.A0f(r3, r6)
            goto L_0x03d9
        L_0x01fd:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r2.A05(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = X.AnonymousClass730.A05(r0)
            goto L_0x0430
        L_0x0213:
            boolean r2 = r5.A0f(r3, r6)
            if (r2 == 0) goto L_0x0023
            X.7bz r2 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r2.A06(r6, r0)
            int r12 = X.AnonymousClass730.A04(r7)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x022d:
            boolean r2 = r5.A0f(r3, r6)
            goto L_0x0418
        L_0x0233:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 * 8
            goto L_0x029e
        L_0x023e:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r0 = A0D(r0)
            int r1 = r0 * 4
            goto L_0x029e
        L_0x0249:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A04(r0)
            goto L_0x029e
        L_0x0254:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A08(r0)
            goto L_0x029e
        L_0x025f:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A03(r0)
            goto L_0x029e
        L_0x026a:
            java.lang.Object r0 = r4.getObject(r6, r0)
            int r1 = A0D(r0)
            goto L_0x029e
        L_0x0273:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A07(r0)
            goto L_0x029e
        L_0x027e:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A02(r0)
            goto L_0x029e
        L_0x0289:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A05(r0)
            goto L_0x029e
        L_0x0294:
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C162507sF.A06(r0)
        L_0x029e:
            if (r1 <= 0) goto L_0x0023
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r12 = r12 + r0
            int r12 = r12 + r1
            goto L_0x0431
        L_0x02ac:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x02b0:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 8
            goto L_0x0431
        L_0x02ba:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x02be:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 4
            goto L_0x0431
        L_0x02c8:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x02e0:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x02f8:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            if (r0 < 0) goto L_0x03c5
            goto L_0x03c0
        L_0x030e:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x0312:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 8
            goto L_0x0431
        L_0x031c:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x0320:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 4
            goto L_0x0431
        L_0x032a:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x032e:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 1
            goto L_0x0431
        L_0x0338:
            boolean r2 = r5.A0g(r6, r7, r3)
        L_0x033c:
            if (r2 == 0) goto L_0x0023
            java.lang.Object r1 = X.C153777bz.A00(r6, r0)
            boolean r0 = r1 instanceof X.C172548Lq
            if (r0 == 0) goto L_0x0358
            X.8Lq r1 = (X.C172548Lq) r1
            int r12 = X.AnonymousClass730.A04(r7)
            int r1 = r1.A03()
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x0431
        L_0x0358:
            java.lang.String r1 = (java.lang.String) r1
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r1)
            goto L_0x0430
        L_0x0364:
            boolean r2 = r5.A0g(r6, r7, r3)
        L_0x0368:
            if (r2 == 0) goto L_0x0023
            java.lang.Object r1 = X.C153777bz.A00(r6, r0)
            X.8vA r0 = r5.A0X(r3)
            int r12 = X.C162507sF.A00(r0, r1, r7)
            goto L_0x0431
        L_0x0378:
            boolean r2 = r5.A0g(r6, r7, r3)
        L_0x037c:
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            X.8Lq r0 = (X.C172548Lq) r0
            int r12 = X.AnonymousClass730.A04(r7)
            int r1 = r0.A03()
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r12 = r12 + r0
            goto L_0x0431
        L_0x0394:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0430
        L_0x03ac:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            if (r0 < 0) goto L_0x03c5
        L_0x03c0:
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0430
        L_0x03c5:
            r0 = 10
            goto L_0x0430
        L_0x03c8:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x03cc:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 4
            goto L_0x0431
        L_0x03d5:
            boolean r0 = r5.A0g(r6, r7, r3)
        L_0x03d9:
            if (r0 == 0) goto L_0x0023
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 + 8
            goto L_0x0431
        L_0x03e2:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            int r0 = X.AnonymousClass730.A05(r0)
            goto L_0x0430
        L_0x03f9:
            boolean r2 = r5.A0g(r6, r7, r3)
            if (r2 == 0) goto L_0x0023
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            int r12 = X.AnonymousClass730.A04(r7)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0430
        L_0x0414:
            boolean r2 = r5.A0g(r6, r7, r3)
        L_0x0418:
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = X.C153777bz.A00(r6, r0)
            X.8y2 r2 = (X.C187928y2) r2
            X.8vA r1 = r5.A0X(r3)
            int r0 = X.AnonymousClass730.A04(r7)
            int r12 = r0 * 2
            X.8Cg r2 = (X.C170198Cg) r2
            int r0 = r2.A0D(r1)
        L_0x0430:
            int r12 = r12 + r0
        L_0x0431:
            int r16 = r16 + r12
            goto L_0x0023
        L_0x0435:
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r16 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r14 = 0
        L_0x043f:
            int[] r1 = r5.A0C
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0860
            int r0 = r3 + 1
            r11 = r1[r0]
            r8 = r1[r3]
            int r10 = X.AnonymousClass6C8.A07(r11)
            r0 = 17
            r9 = 1
            if (r10 > r0) goto L_0x085d
            int r0 = r3 + 2
            r0 = r1[r0]
            r2 = r0 & r15
            int r0 = r0 >>> 20
            int r9 = r9 << r0
            if (r2 == r7) goto L_0x0464
            long r0 = (long) r2
            int r14 = r4.getInt(r6, r0)
            r7 = r2
        L_0x0464:
            r11 = r11 & r15
            long r1 = (long) r11
            switch(r10) {
                case 0: goto L_0x084f;
                case 1: goto L_0x0844;
                case 2: goto L_0x0832;
                case 3: goto L_0x0821;
                case 4: goto L_0x080b;
                case 5: goto L_0x0800;
                case 6: goto L_0x07f5;
                case 7: goto L_0x07ea;
                case 8: goto L_0x07c2;
                case 9: goto L_0x07b0;
                case 10: goto L_0x0796;
                case 11: goto L_0x0784;
                case 12: goto L_0x0774;
                case 13: goto L_0x0766;
                case 14: goto L_0x075a;
                case 15: goto L_0x0748;
                case 16: goto L_0x0732;
                case 17: goto L_0x0716;
                case 18: goto L_0x06d5;
                case 19: goto L_0x06c2;
                case 20: goto L_0x06a8;
                case 21: goto L_0x0692;
                case 22: goto L_0x067c;
                case 23: goto L_0x06d5;
                case 24: goto L_0x06c2;
                case 25: goto L_0x0669;
                case 26: goto L_0x065d;
                case 27: goto L_0x064d;
                case 28: goto L_0x0641;
                case 29: goto L_0x062b;
                case 30: goto L_0x0615;
                case 31: goto L_0x06c2;
                case 32: goto L_0x06d5;
                case 33: goto L_0x05ff;
                case 34: goto L_0x05e9;
                case 35: goto L_0x05d1;
                case 36: goto L_0x05c6;
                case 37: goto L_0x05bb;
                case 38: goto L_0x05b0;
                case 39: goto L_0x05a5;
                case 40: goto L_0x05d1;
                case 41: goto L_0x05c6;
                case 42: goto L_0x059c;
                case 43: goto L_0x0591;
                case 44: goto L_0x0586;
                case 45: goto L_0x05c6;
                case 46: goto L_0x05d1;
                case 47: goto L_0x057b;
                case 48: goto L_0x0570;
                case 49: goto L_0x06e8;
                case 50: goto L_0x055e;
                case 51: goto L_0x0558;
                case 52: goto L_0x0552;
                case 53: goto L_0x053a;
                case 54: goto L_0x0522;
                case 55: goto L_0x050c;
                case 56: goto L_0x0506;
                case 57: goto L_0x04f8;
                case 58: goto L_0x04f2;
                case 59: goto L_0x04ec;
                case 60: goto L_0x04e6;
                case 61: goto L_0x04e0;
                case 62: goto L_0x04c8;
                case 63: goto L_0x04b2;
                case 64: goto L_0x04ac;
                case 65: goto L_0x04a6;
                case 66: goto L_0x048e;
                case 67: goto L_0x0472;
                case 68: goto L_0x046c;
                default: goto L_0x0469;
            }
        L_0x0469:
            int r3 = r3 + 3
            goto L_0x043f
        L_0x046c:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0718
        L_0x0472:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            long r0 = X.C18310x6.A0B(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0842
        L_0x048e:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = X.AnonymousClass730.A05(r0)
            goto L_0x0842
        L_0x04a6:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x075c
        L_0x04ac:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0768
        L_0x04b2:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            if (r0 < 0) goto L_0x081e
            goto L_0x0819
        L_0x04c8:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0842
        L_0x04e0:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0798
        L_0x04e6:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x07b2
        L_0x04ec:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x07c4
        L_0x04f2:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x07ec
        L_0x04f8:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r1 = r0 + 4
            goto L_0x0770
        L_0x0506:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0802
        L_0x050c:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            if (r0 < 0) goto L_0x081e
            goto L_0x0819
        L_0x0522:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            long r0 = X.C18310x6.A0B(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0842
        L_0x053a:
            boolean r0 = r5.A0g(r6, r8, r3)
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = X.C153777bz.A00(r6, r1)
            long r0 = X.C18310x6.A0B(r0)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0842
        L_0x0552:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0846
        L_0x0558:
            boolean r0 = r5.A0g(r6, r8, r3)
            goto L_0x0851
        L_0x055e:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.lang.Object[] r1 = r5.A0E
            int r0 = r3 / 3
            int r0 = r0 * 2
            r0 = r1[r0]
            int r13 = X.C159367li.A00(r2, r0, r8)
            goto L_0x0859
        L_0x0570:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A06(r0)
            goto L_0x05db
        L_0x057b:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A05(r0)
            goto L_0x05db
        L_0x0586:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A02(r0)
            goto L_0x05db
        L_0x0591:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A07(r0)
            goto L_0x05db
        L_0x059c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r2 = A0D(r0)
            goto L_0x05db
        L_0x05a5:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A03(r0)
            goto L_0x05db
        L_0x05b0:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A08(r0)
            goto L_0x05db
        L_0x05bb:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r2 = X.C162507sF.A04(r0)
            goto L_0x05db
        L_0x05c6:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0D(r0)
            int r2 = r0 * 4
            goto L_0x05db
        L_0x05d1:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r0 = A0D(r0)
            int r2 = r0 * 8
        L_0x05db:
            if (r2 <= 0) goto L_0x0469
            int r1 = X.AnonymousClass730.A04(r8)
            int r0 = X.AnonymousClass6C7.A00(r2)
            int r1 = r1 + r0
            int r1 = r1 + r2
            goto L_0x0770
        L_0x05e9:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A06(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x05ff:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A05(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x0615:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A02(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x062b:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A07(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x0641:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162507sF.A09(r0, r8)
            goto L_0x0859
        L_0x064d:
            java.lang.Object r1 = r4.getObject(r6, r1)
            java.util.List r1 = (java.util.List) r1
            X.8vA r0 = r5.A0X(r3)
            int r13 = X.C162507sF.A01(r0, r1, r8)
            goto L_0x0859
        L_0x065d:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r13 = X.C162507sF.A0A(r0, r8)
            goto L_0x0859
        L_0x0669:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r13 = A0D(r0)
            if (r13 == 0) goto L_0x06fa
            int r0 = X.AnonymousClass730.A04(r8)
            int r0 = r0 + 1
            int r13 = r13 * r0
            goto L_0x0859
        L_0x067c:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A03(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x0692:
            java.lang.Object r0 = r4.getObject(r6, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r1 == 0) goto L_0x06fa
            int r0 = X.C162507sF.A08(r0)
            int r13 = A00(r8, r1, r0)
            goto L_0x0859
        L_0x06a8:
            java.lang.Object r2 = r4.getObject(r6, r1)
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            if (r0 == 0) goto L_0x06fa
            int r1 = X.C162507sF.A04(r2)
            int r0 = r2.size()
            int r13 = A00(r8, r0, r1)
            goto L_0x0859
        L_0x06c2:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r13 = A0D(r0)
            if (r13 == 0) goto L_0x06fa
            int r0 = X.AnonymousClass730.A04(r8)
            int r0 = r0 + 4
            int r13 = r13 * r0
            goto L_0x0859
        L_0x06d5:
            java.lang.Object r0 = r4.getObject(r6, r1)
            int r13 = A0D(r0)
            if (r13 == 0) goto L_0x06fa
            int r0 = X.AnonymousClass730.A04(r8)
            int r0 = r0 + 8
            int r13 = r13 * r0
            goto L_0x0859
        L_0x06e8:
            java.lang.Object r12 = r4.getObject(r6, r1)
            java.util.List r12 = (java.util.List) r12
            X.8vA r11 = r5.A0X(r3)
            int r10 = r12.size()
            r9 = 0
            r13 = 0
            if (r10 != 0) goto L_0x06fd
        L_0x06fa:
            r13 = 0
            goto L_0x0859
        L_0x06fd:
            if (r9 >= r10) goto L_0x0859
            java.lang.Object r2 = r12.get(r9)
            X.8y2 r2 = (X.C187928y2) r2
            int r0 = X.AnonymousClass730.A04(r8)
            int r1 = r0 * 2
            X.8Cg r2 = (X.C170198Cg) r2
            int r0 = r2.A0D(r11)
            int r1 = r1 + r0
            int r13 = r13 + r1
            int r9 = r9 + 1
            goto L_0x06fd
        L_0x0716:
            r0 = r14 & r9
        L_0x0718:
            if (r0 == 0) goto L_0x0469
            java.lang.Object r2 = r4.getObject(r6, r1)
            X.8y2 r2 = (X.C187928y2) r2
            X.8vA r1 = r5.A0X(r3)
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 * 2
            X.8Cg r2 = (X.C170198Cg) r2
            int r0 = r2.A0D(r1)
            goto L_0x0842
        L_0x0732:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            long r0 = r4.getLong(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            long r0 = X.AnonymousClass6C7.A0F(r0)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0842
        L_0x0748:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            int r0 = r4.getInt(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = X.AnonymousClass730.A05(r0)
            goto L_0x0842
        L_0x075a:
            r0 = r14 & r9
        L_0x075c:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 8
            goto L_0x0859
        L_0x0766:
            r0 = r14 & r9
        L_0x0768:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r1 = r0 + 4
        L_0x0770:
            int r16 = r16 + r1
            goto L_0x0469
        L_0x0774:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            int r0 = r4.getInt(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            if (r0 < 0) goto L_0x081e
            goto L_0x0819
        L_0x0784:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            int r0 = r4.getInt(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0842
        L_0x0796:
            r0 = r14 & r9
        L_0x0798:
            if (r0 == 0) goto L_0x0469
            java.lang.Object r0 = r4.getObject(r6, r1)
            X.8Lq r0 = (X.C172548Lq) r0
            int r13 = X.AnonymousClass730.A04(r8)
            int r1 = r0.A03()
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0859
        L_0x07b0:
            r0 = r14 & r9
        L_0x07b2:
            if (r0 == 0) goto L_0x0469
            java.lang.Object r1 = r4.getObject(r6, r1)
            X.8vA r0 = r5.A0X(r3)
            int r13 = X.C162507sF.A00(r0, r1, r8)
            goto L_0x0859
        L_0x07c2:
            r0 = r14 & r9
        L_0x07c4:
            if (r0 == 0) goto L_0x0469
            java.lang.Object r1 = r4.getObject(r6, r1)
            boolean r0 = r1 instanceof X.C172548Lq
            if (r0 == 0) goto L_0x07df
            X.8Lq r1 = (X.C172548Lq) r1
            int r13 = X.AnonymousClass730.A04(r8)
            int r1 = r1.A03()
            int r0 = X.AnonymousClass6C7.A00(r1)
            int r0 = r0 + r1
            int r13 = r13 + r0
            goto L_0x0859
        L_0x07df:
            java.lang.String r1 = (java.lang.String) r1
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A03(r1)
            goto L_0x0842
        L_0x07ea:
            r0 = r14 & r9
        L_0x07ec:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 1
            goto L_0x0859
        L_0x07f5:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 4
            goto L_0x0859
        L_0x0800:
            r0 = r14 & r9
        L_0x0802:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 8
            goto L_0x0859
        L_0x080b:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            int r0 = r4.getInt(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            if (r0 < 0) goto L_0x081e
        L_0x0819:
            int r0 = X.AnonymousClass6C7.A00(r0)
            goto L_0x0842
        L_0x081e:
            r0 = 10
            goto L_0x0842
        L_0x0821:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            long r0 = r4.getLong(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
            goto L_0x0842
        L_0x0832:
            r0 = r14 & r9
            if (r0 == 0) goto L_0x0469
            long r0 = r4.getLong(r6, r1)
            int r13 = X.AnonymousClass730.A04(r8)
            int r0 = com.google.protobuf.CodedOutputStream.A02(r0)
        L_0x0842:
            int r13 = r13 + r0
            goto L_0x0859
        L_0x0844:
            r0 = r14 & r9
        L_0x0846:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 4
            goto L_0x0859
        L_0x084f:
            r0 = r14 & r9
        L_0x0851:
            if (r0 == 0) goto L_0x0469
            int r0 = X.AnonymousClass730.A04(r8)
            int r13 = r0 + 8
        L_0x0859:
            int r16 = r16 + r13
            goto L_0x0469
        L_0x085d:
            r9 = 0
            goto L_0x0464
        L_0x0860:
            X.6cX r6 = (X.C130786cX) r6
            X.7o7 r0 = r6.unknownFields
            int r0 = r0.A00()
            int r16 = r16 + r0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.BCq(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.C153777bz.A00(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        r0 = X.AnonymousClass6C9.A05(r0 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e9, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r6 = r6 * 53;
        r0 = X.C153777bz.A00(r10, r1).hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BFY(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A0C
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x00fb
            int r0 = r3 + 1
            r0 = r5[r0]
            r8 = r5[r3]
            long r1 = X.AnonymousClass6C9.A0K(r0)
            int r0 = X.AnonymousClass6C8.A07(r0)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00a9;
                case 8: goto L_0x0035;
                case 9: goto L_0x00ec;
                case 10: goto L_0x0023;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00bf;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00bf;
                case 17: goto L_0x00ec;
                case 18: goto L_0x0023;
                case 19: goto L_0x0023;
                case 20: goto L_0x0023;
                case 21: goto L_0x0023;
                case 22: goto L_0x0023;
                case 23: goto L_0x0023;
                case 24: goto L_0x0023;
                case 25: goto L_0x0023;
                case 26: goto L_0x0023;
                case 27: goto L_0x0023;
                case 28: goto L_0x0023;
                case 29: goto L_0x0023;
                case 30: goto L_0x0023;
                case 31: goto L_0x0023;
                case 32: goto L_0x0023;
                case 33: goto L_0x0023;
                case 34: goto L_0x0023;
                case 35: goto L_0x0023;
                case 36: goto L_0x0023;
                case 37: goto L_0x0023;
                case 38: goto L_0x0023;
                case 39: goto L_0x0023;
                case 40: goto L_0x0023;
                case 41: goto L_0x0023;
                case 42: goto L_0x0023;
                case 43: goto L_0x0023;
                case 44: goto L_0x0023;
                case 45: goto L_0x0023;
                case 46: goto L_0x0023;
                case 47: goto L_0x0023;
                case 48: goto L_0x0023;
                case 49: goto L_0x0023;
                case 50: goto L_0x0023;
                case 51: goto L_0x0090;
                case 52: goto L_0x007b;
                case 53: goto L_0x0066;
                case 54: goto L_0x0066;
                case 55: goto L_0x0054;
                case 56: goto L_0x0066;
                case 57: goto L_0x0054;
                case 58: goto L_0x0043;
                case 59: goto L_0x002f;
                case 60: goto L_0x001d;
                case 61: goto L_0x001d;
                case 62: goto L_0x0054;
                case 63: goto L_0x0054;
                case 64: goto L_0x0054;
                case 65: goto L_0x0066;
                case 66: goto L_0x0054;
                case 67: goto L_0x0066;
                case 68: goto L_0x001d;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001d:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0023:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            int r0 = r0.hashCode()
            goto L_0x00e9
        L_0x002f:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
        L_0x0035:
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x00e9
        L_0x0043:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            goto L_0x00b1
        L_0x0054:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            int r0 = X.AnonymousClass001.A0K(r0)
            goto L_0x00e9
        L_0x0066:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            long r0 = X.C18310x6.A0B(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x00e9
        L_0x007b:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            float r0 = X.AnonymousClass001.A05(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00e9
        L_0x0090:
            boolean r0 = r9.A0g(r10, r8, r3)
            if (r0 == 0) goto L_0x001a
            int r6 = r6 * 53
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            double r0 = X.AnonymousClass6C9.A02(r0)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x00e9
        L_0x00a9:
            int r6 = r6 * 53
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            boolean r0 = r0.A0J(r10, r1)
        L_0x00b1:
            int r0 = X.AnonymousClass6C9.A05(r0)
            goto L_0x00e9
        L_0x00b6:
            int r6 = r6 * 53
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r0.A05(r10, r1)
            goto L_0x00e9
        L_0x00bf:
            int r6 = r6 * 53
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r0.A06(r10, r1)
            int r0 = X.AnonymousClass6C8.A0B(r0)
            goto L_0x00e9
        L_0x00cc:
            int r6 = r6 * 53
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r0.A03(r10, r1)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00e9
        L_0x00d9:
            int r6 = r6 * 53
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            double r0 = r0.A02(r10, r1)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            int r0 = X.AnonymousClass6C8.A0B(r0)
        L_0x00e9:
            int r6 = r6 + r0
            goto L_0x001a
        L_0x00ec:
            java.lang.Object r0 = X.C153777bz.A00(r10, r1)
            if (r0 == 0) goto L_0x00f6
            int r7 = r0.hashCode()
        L_0x00f6:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001a
        L_0x00fb:
            int r1 = r6 * 53
            X.6cX r10 = (X.C130786cX) r10
            X.7o7 r0 = r10.unknownFields
            int r0 = X.AnonymousClass002.A02(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.BFY(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        r5 = r8.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
        if (A0R(r5) != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
        r4 = r6.BLT();
        r6.BL9(r4, r5);
        r8.putObject(r10, r0, r4);
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0188, code lost:
        r6.BL9(r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(java.lang.Object r16, java.lang.Object r17) {
        /*
            r15 = this;
            r10 = r16
            A0Q(r10)
            r2 = r17
            r2.getClass()
            r3 = 0
        L_0x000b:
            int[] r4 = r15.A0C
            int r0 = r4.length
            if (r3 >= r0) goto L_0x01b7
            int r1 = r3 + 1
            r0 = r4[r1]
            long r11 = X.AnonymousClass6C9.A0K(r0)
            r5 = r4[r3]
            int r0 = X.AnonymousClass6C8.A07(r0)
            switch(r0) {
                case 0: goto L_0x0024;
                case 1: goto L_0x0035;
                case 2: goto L_0x0046;
                case 3: goto L_0x0046;
                case 4: goto L_0x0057;
                case 5: goto L_0x0046;
                case 6: goto L_0x0057;
                case 7: goto L_0x0068;
                case 8: goto L_0x0079;
                case 9: goto L_0x0101;
                case 10: goto L_0x0079;
                case 11: goto L_0x0057;
                case 12: goto L_0x0057;
                case 13: goto L_0x0057;
                case 14: goto L_0x0046;
                case 15: goto L_0x0057;
                case 16: goto L_0x0046;
                case 17: goto L_0x0101;
                case 18: goto L_0x0088;
                case 19: goto L_0x0088;
                case 20: goto L_0x0088;
                case 21: goto L_0x0088;
                case 22: goto L_0x0088;
                case 23: goto L_0x0088;
                case 24: goto L_0x0088;
                case 25: goto L_0x0088;
                case 26: goto L_0x0088;
                case 27: goto L_0x0088;
                case 28: goto L_0x0088;
                case 29: goto L_0x0088;
                case 30: goto L_0x0088;
                case 31: goto L_0x0088;
                case 32: goto L_0x0088;
                case 33: goto L_0x0088;
                case 34: goto L_0x0088;
                case 35: goto L_0x0088;
                case 36: goto L_0x0088;
                case 37: goto L_0x0088;
                case 38: goto L_0x0088;
                case 39: goto L_0x0088;
                case 40: goto L_0x0088;
                case 41: goto L_0x0088;
                case 42: goto L_0x0088;
                case 43: goto L_0x0088;
                case 44: goto L_0x0088;
                case 45: goto L_0x0088;
                case 46: goto L_0x0088;
                case 47: goto L_0x0088;
                case 48: goto L_0x0088;
                case 49: goto L_0x0088;
                case 50: goto L_0x00e0;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00f3;
                case 53: goto L_0x00f3;
                case 54: goto L_0x00f3;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00f3;
                case 57: goto L_0x00f3;
                case 58: goto L_0x00f3;
                case 59: goto L_0x00f3;
                case 60: goto L_0x0138;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00f3;
                case 63: goto L_0x00f3;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00f3;
                case 66: goto L_0x00f3;
                case 67: goto L_0x00f3;
                case 68: goto L_0x0138;
                default: goto L_0x0021;
            }
        L_0x0021:
            int r3 = r3 + 3
            goto L_0x000b
        L_0x0024:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.7bz r9 = com.google.protobuf.UnsafeUtil.A01
            double r13 = r9.A02(r2, r11)
            r9.A0A(r10, r11, r13)
            goto L_0x0128
        L_0x0035:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.7bz r1 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r1.A03(r2, r11)
            r1.A0B(r10, r11, r0)
            goto L_0x0128
        L_0x0046:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.7bz r9 = com.google.protobuf.UnsafeUtil.A01
            long r13 = r9.A06(r2, r11)
            r9.A0D(r10, r11, r13)
            goto L_0x0128
        L_0x0057:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            int r0 = r0.A05(r2, r11)
            com.google.protobuf.UnsafeUtil.A04(r10, r11, r0)
            goto L_0x0128
        L_0x0068:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            X.7bz r1 = com.google.protobuf.UnsafeUtil.A01
            boolean r0 = r1.A0J(r2, r11)
            r1.A0F(r10, r11, r0)
            goto L_0x0128
        L_0x0079:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = X.C153777bz.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x0128
        L_0x0088:
            X.7ji r0 = r15.A05
            boolean r0 = r0 instanceof X.C130806cZ
            if (r0 == 0) goto L_0x00bd
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            java.lang.Object r6 = r0.A07(r10, r11)
            X.8ya r6 = (X.C188248ya) r6
            java.lang.Object r5 = r0.A07(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r4 = r6.size()
            int r1 = r5.size()
            if (r4 <= 0) goto L_0x00b8
            if (r1 <= 0) goto L_0x00b7
            r0 = r6
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00b4
            int r1 = r1 + r4
            X.8ya r6 = r6.BLN(r1)
        L_0x00b4:
            r6.addAll(r5)
        L_0x00b7:
            r5 = r6
        L_0x00b8:
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r5)
            goto L_0x0021
        L_0x00bd:
            java.lang.Object r5 = X.C153777bz.A00(r2, r11)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r4 = X.C130816ca.A00(r10, r0, r11)
            int r1 = r4.size()
            int r0 = r5.size()
            if (r1 <= 0) goto L_0x00db
            if (r0 <= 0) goto L_0x00da
            r4.addAll(r5)
        L_0x00da:
            r5 = r4
        L_0x00db:
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r5)
            goto L_0x0021
        L_0x00e0:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            java.lang.Object r1 = r0.A07(r10, r11)
            java.lang.Object r0 = r0.A07(r2, r11)
            X.8Tq r0 = X.C159367li.A01(r1, r0)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x0021
        L_0x00f3:
            boolean r0 = r15.A0g(r2, r5, r3)
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = X.C153777bz.A00(r2, r11)
            com.google.protobuf.UnsafeUtil.A05(r10, r11, r0)
            goto L_0x015f
        L_0x0101:
            boolean r0 = r15.A0f(r3, r2)
            if (r0 == 0) goto L_0x0021
            r0 = r4[r1]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x018d
            X.8vA r6 = r15.A0X(r3)
            boolean r4 = r15.A0f(r3, r10)
            if (r4 != 0) goto L_0x0173
            boolean r4 = A0R(r7)
            if (r4 != 0) goto L_0x012d
            r8.putObject(r10, r0, r7)
        L_0x0128:
            r15.A0d(r10, r3)
            goto L_0x0021
        L_0x012d:
            java.lang.Object r4 = r6.BLT()
            r6.BL9(r4, r7)
            r8.putObject(r10, r0, r4)
            goto L_0x0128
        L_0x0138:
            boolean r0 = r15.A0g(r2, r5, r3)
            if (r0 == 0) goto L_0x0021
            r0 = r4[r1]
            long r0 = X.AnonymousClass6C9.A0K(r0)
            sun.misc.Unsafe r8 = A0F
            java.lang.Object r7 = r8.getObject(r2, r0)
            if (r7 == 0) goto L_0x01a2
            X.8vA r6 = r15.A0X(r3)
            boolean r9 = r15.A0g(r10, r5, r3)
            if (r9 != 0) goto L_0x0173
            boolean r9 = A0R(r7)
            if (r9 != 0) goto L_0x0168
            r8.putObject(r10, r0, r7)
        L_0x015f:
            long r0 = X.AnonymousClass6C7.A0O(r4, r3)
            com.google.protobuf.UnsafeUtil.A04(r10, r0, r5)
            goto L_0x0021
        L_0x0168:
            java.lang.Object r9 = r6.BLT()
            r6.BL9(r9, r7)
            r8.putObject(r10, r0, r9)
            goto L_0x015f
        L_0x0173:
            java.lang.Object r5 = r8.getObject(r10, r0)
            boolean r4 = A0R(r5)
            if (r4 != 0) goto L_0x0188
            java.lang.Object r4 = r6.BLT()
            r6.BL9(r4, r5)
            r8.putObject(r10, r0, r4)
            r5 = r4
        L_0x0188:
            r6.BL9(r5, r7)
            goto L_0x0021
        L_0x018d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r2, r0, r1)
            throw r0
        L_0x01a2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Source subfield "
            r1.append(r0)
            r0 = r4[r3]
            r1.append(r0)
            java.lang.String r0 = " is present but null: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r2, r0, r1)
            throw r0
        L_0x01b7:
            X.C162507sF.A0S(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.BL9(java.lang.Object, java.lang.Object):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void BLA(X.C160837oO r23, X.C161277pL r24, java.lang.Object r25) {
        /*
            r22 = this;
            r6 = r24
            r14 = r25
            r6.getClass()
            A0Q(r14)
            r12 = r22
            X.7Ut r13 = r12.A09
            r15 = 0
        L_0x000f:
            r0 = r23
            int r4 = r0.A07()     // Catch:{ all -> 0x0675 }
            int r3 = r12.A0S(r4)     // Catch:{ all -> 0x0675 }
            if (r3 >= 0) goto L_0x0041
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L_0x0033
            int r1 = r12.A00
        L_0x0022:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066c
            int[] r0 = r12.A0D
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Y(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0033:
            if (r15 != 0) goto L_0x0039
            X.7o7 r15 = r13.A00(r14)     // Catch:{ all -> 0x0675 }
        L_0x0039:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0675 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0633
        L_0x0041:
            int[] r5 = r12.A0C     // Catch:{ all -> 0x0675 }
            int r9 = r3 + 1
            r7 = r5[r9]     // Catch:{ all -> 0x0675 }
            int r1 = X.AnonymousClass6C8.A07(r7)
            switch(r1) {
                case 0: goto L_0x005c;
                case 1: goto L_0x006f;
                case 2: goto L_0x0080;
                case 3: goto L_0x0093;
                case 4: goto L_0x00a6;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00d7;
                case 8: goto L_0x027e;
                case 9: goto L_0x0283;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00f9;
                case 12: goto L_0x0533;
                case 13: goto L_0x0108;
                case 14: goto L_0x0117;
                case 15: goto L_0x012a;
                case 16: goto L_0x0295;
                case 17: goto L_0x02a8;
                case 18: goto L_0x02be;
                case 19: goto L_0x02c7;
                case 20: goto L_0x02d0;
                case 21: goto L_0x02d9;
                case 22: goto L_0x02e2;
                case 23: goto L_0x02eb;
                case 24: goto L_0x02f4;
                case 25: goto L_0x02fd;
                case 26: goto L_0x0569;
                case 27: goto L_0x0306;
                case 28: goto L_0x0345;
                case 29: goto L_0x0372;
                case 30: goto L_0x037b;
                case 31: goto L_0x0396;
                case 32: goto L_0x039f;
                case 33: goto L_0x03a8;
                case 34: goto L_0x03b1;
                case 35: goto L_0x03ba;
                case 36: goto L_0x03c3;
                case 37: goto L_0x03cc;
                case 38: goto L_0x03d5;
                case 39: goto L_0x03de;
                case 40: goto L_0x03e7;
                case 41: goto L_0x03f0;
                case 42: goto L_0x03f9;
                case 43: goto L_0x0402;
                case 44: goto L_0x040b;
                case 45: goto L_0x0426;
                case 46: goto L_0x042f;
                case 47: goto L_0x0438;
                case 48: goto L_0x0441;
                case 49: goto L_0x0139;
                case 50: goto L_0x0480;
                case 51: goto L_0x0176;
                case 52: goto L_0x0189;
                case 53: goto L_0x019c;
                case 54: goto L_0x01af;
                case 55: goto L_0x01c2;
                case 56: goto L_0x01d5;
                case 57: goto L_0x01e8;
                case 58: goto L_0x01fb;
                case 59: goto L_0x044a;
                case 60: goto L_0x044f;
                case 61: goto L_0x020e;
                case 62: goto L_0x021f;
                case 63: goto L_0x05e7;
                case 64: goto L_0x0232;
                case 65: goto L_0x0245;
                case 66: goto L_0x0258;
                case 67: goto L_0x046d;
                case 68: goto L_0x026b;
                default: goto L_0x004e;
            }
        L_0x004e:
            if (r15 != 0) goto L_0x0054
            X.7o7 r15 = r13.A00(r14)     // Catch:{ 6cY -> 0x0626 }
        L_0x0054:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ 6cY -> 0x0626 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0646
        L_0x005c:
            long r18 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            double r20 = r1.A01()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0A(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x006f:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            float r5 = r4.A02()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r4 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r4.A0B(r14, r1, r5)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0080:
            long r18 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r20 = r1.A0D()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0D(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0093:
            long r18 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r20 = r1.A0G()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0D(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00a6:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r4 = r4.A06()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00b5:
            long r18 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r20 = r1.A0C()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0D(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00c8:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r4 = r4.A05()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00d7:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            boolean r5 = r4.A0N()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r4 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r4.A0F(r14, r1, r5)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00e8:
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            X.8Lq r4 = r4.A0H()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x00f9:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r4 = r4.A0A()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0108:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r4 = r4.A07()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0117:
            long r18 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r20 = r1.A0E()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0D(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x012a:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r4 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r4 = r4.A08()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0139:
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            X.8vA r4 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            X.7ji r3 = r12.A05     // Catch:{ 6cY -> 0x0626 }
            java.util.List r5 = r3.A01(r14, r1)     // Catch:{ 6cY -> 0x0626 }
            int r3 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            r2 = r3 & 7
            r1 = 3
            if (r2 == r1) goto L_0x0155
            X.6cY r1 = new X.6cY     // Catch:{ 6cY -> 0x0626 }
            r1.<init>()     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0582
        L_0x0155:
            java.lang.Object r1 = r4.BLT()     // Catch:{ 6cY -> 0x0626 }
            r0.A0B(r6, r4, r1)     // Catch:{ 6cY -> 0x0626 }
            r4.BKT(r1)     // Catch:{ 6cY -> 0x0626 }
            r5.add(r1)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r2 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r1 = r0.A01     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r1 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            if (r1 == r3) goto L_0x0155
            goto L_0x0341
        L_0x0176:
            long r1 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            double r7 = r7.A01()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x0189:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            float r7 = r7.A02()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x019c:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r7 = r7.A0D()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x01af:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r7 = r7.A0G()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x01c2:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r7 = r7.A06()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x01d5:
            long r1 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r7 = r7.A0C()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x01e8:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r7 = r7.A05()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x01fb:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            boolean r7 = r7.A0N()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x020e:
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            X.8Lq r7 = r7.A0H()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x021f:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r7 = r7.A0A()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x0232:
            long r1 = A0G(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r7 = r7.A07()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x0245:
            long r1 = A0F(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r7 = r7.A0E()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x0258:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r7 = r7.A08()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x026b:
            java.lang.Object r8 = r12.A0a(r14, r4, r3)     // Catch:{ 6cY -> 0x0626 }
            X.8y2 r8 = (X.C187928y2) r8     // Catch:{ 6cY -> 0x0626 }
            X.8vA r2 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            r1 = 3
            r0.A0A(r1)     // Catch:{ 6cY -> 0x0626 }
            r0.A0B(r6, r2, r8)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0460
        L_0x027e:
            r12.A0b(r0, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x0283:
            java.lang.Object r4 = r12.A0Z(r14, r3)     // Catch:{ 6cY -> 0x0626 }
            X.8y2 r4 = (X.C187928y2) r4     // Catch:{ 6cY -> 0x0626 }
            X.8vA r2 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            r1 = 2
            r0.A0A(r1)     // Catch:{ 6cY -> 0x0626 }
            r0.A0C(r6, r2, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x02b9
        L_0x0295:
            long r18 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r1 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r20 = r1.A0F()     // Catch:{ 6cY -> 0x0626 }
            X.7bz r16 = com.google.protobuf.UnsafeUtil.A01     // Catch:{ 6cY -> 0x0626 }
            r17 = r14
            r16.A0D(r17, r18, r20)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0564
        L_0x02a8:
            java.lang.Object r4 = r12.A0Z(r14, r3)     // Catch:{ 6cY -> 0x0626 }
            X.8y2 r4 = (X.C187928y2) r4     // Catch:{ 6cY -> 0x0626 }
            X.8vA r2 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            r1 = 3
            r0.A0A(r1)     // Catch:{ 6cY -> 0x0626 }
            r0.A0B(r6, r2, r4)     // Catch:{ 6cY -> 0x0626 }
        L_0x02b9:
            r12.A0e(r14, r3, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02be:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0E(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02c7:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0I(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02d0:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0K(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02d9:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0Q(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02e2:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0J(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02eb:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0H(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02f4:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0G(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x02fd:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0D(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0306:
            X.8vA r3 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            X.7ji r4 = r12.A05     // Catch:{ 6cY -> 0x0626 }
            java.util.List r5 = r4.A01(r14, r1)     // Catch:{ 6cY -> 0x0626 }
            int r4 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            r2 = r4 & 7
            r1 = 2
            if (r2 == r1) goto L_0x0322
            X.6cY r1 = new X.6cY     // Catch:{ 6cY -> 0x0626 }
            r1.<init>()     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0582
        L_0x0322:
            java.lang.Object r1 = r3.BLT()     // Catch:{ 6cY -> 0x0626 }
            r0.A0C(r6, r3, r1)     // Catch:{ 6cY -> 0x0626 }
            r3.BKT(r1)     // Catch:{ 6cY -> 0x0626 }
            r5.add(r1)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r2 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r1 = r0.A01     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r1 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            if (r1 == r4) goto L_0x0322
        L_0x0341:
            r0.A01 = r1     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0345:
            java.util.List r3 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x0357
            X.6cY r1 = new X.6cY     // Catch:{ 6cY -> 0x0626 }
            r1.<init>()     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0582
        L_0x0357:
            X.7c2 r2 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            X.8Lq r1 = r2.A0H()     // Catch:{ 6cY -> 0x0626 }
            r3.add(r1)     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            if (r2 == r1) goto L_0x0357
            goto L_0x05e3
        L_0x0372:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0P(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x037b:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0F(r1)     // Catch:{ 6cY -> 0x0626 }
            X.8me r16 = A0H(r12, r3)     // Catch:{ 6cY -> 0x0626 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C162507sF.A0B(r16, r17, r18, r19, r20, r21)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0396:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0L(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x039f:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0M(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03a8:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0N(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03b1:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0O(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03ba:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0E(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03c3:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0I(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03cc:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0K(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03d5:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0Q(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03de:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0J(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03e7:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0H(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03f0:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0G(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x03f9:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0D(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0402:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0P(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x040b:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0F(r1)     // Catch:{ 6cY -> 0x0626 }
            X.8me r16 = A0H(r12, r3)     // Catch:{ 6cY -> 0x0626 }
            r17 = r13
            r18 = r14
            r19 = r15
            r20 = r1
            r21 = r4
            java.lang.Object r15 = X.C162507sF.A0B(r16, r17, r18, r19, r20, r21)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0426:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0L(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x042f:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0M(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0438:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0N(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0441:
            java.util.List r1 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            r0.A0O(r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x044a:
            r12.A0b(r0, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x044f:
            java.lang.Object r8 = r12.A0a(r14, r4, r3)     // Catch:{ 6cY -> 0x0626 }
            X.8y2 r8 = (X.C187928y2) r8     // Catch:{ 6cY -> 0x0626 }
            X.8vA r2 = r12.A0X(r3)     // Catch:{ 6cY -> 0x0626 }
            r1 = 2
            r0.A0A(r1)     // Catch:{ 6cY -> 0x0626 }
            r0.A0C(r6, r2, r8)     // Catch:{ 6cY -> 0x0626 }
        L_0x0460:
            sun.misc.Unsafe r7 = A0F     // Catch:{ 6cY -> 0x0626 }
            r1 = r5[r9]     // Catch:{ 6cY -> 0x0626 }
            long r1 = X.AnonymousClass6C9.A0K(r1)     // Catch:{ 6cY -> 0x0626 }
            r7.putObject(r14, r1, r8)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x046d:
            long r1 = A0E(r0, r7)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            long r7 = r7.A0F()     // Catch:{ 6cY -> 0x0626 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x061d
        L_0x0480:
            java.lang.Object[] r2 = r12.A0E     // Catch:{ 6cY -> 0x0626 }
            int r1 = r3 / 3
            int r1 = r1 * 2
            r4 = r2[r1]     // Catch:{ 6cY -> 0x0626 }
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            java.lang.Object r8 = X.C153777bz.A00(r14, r1)     // Catch:{ 6cY -> 0x0626 }
            if (r8 != 0) goto L_0x04b6
            X.8Tq r3 = X.C174278Tq.A00     // Catch:{ 6cY -> 0x0626 }
            X.8Tq r8 = r3.A01()     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r8)     // Catch:{ 6cY -> 0x0626 }
        L_0x049b:
            X.8Tq r8 = (X.C174278Tq) r8     // Catch:{ 6cY -> 0x0626 }
            X.7K4 r4 = (X.AnonymousClass7K4) r4     // Catch:{ 6cY -> 0x0626 }
            X.7MN r10 = r4.A00     // Catch:{ 6cY -> 0x0626 }
            r9 = 2
            r0.A0A(r9)     // Catch:{ 6cY -> 0x0626 }
            X.7c2 r7 = r0.A03     // Catch:{ 6cY -> 0x0626 }
            int r1 = r7.A0A()     // Catch:{ 6cY -> 0x0626 }
            int r5 = r7.A0B(r1)     // Catch:{ 6cY -> 0x0626 }
            java.lang.String r4 = ""
            java.lang.Object r3 = r10.A03     // Catch:{ 6cY -> 0x0626 }
            r16 = r3
            goto L_0x04cd
        L_0x04b6:
            r3 = r8
            X.8Tq r3 = (X.C174278Tq) r3     // Catch:{ 6cY -> 0x0626 }
            boolean r3 = r3.isMutable     // Catch:{ 6cY -> 0x0626 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x049b
            X.8Tq r3 = X.C174278Tq.A00     // Catch:{ 6cY -> 0x0626 }
            X.8Tq r3 = r3.A01()     // Catch:{ 6cY -> 0x0626 }
            X.C159367li.A01(r3, r8)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r3)     // Catch:{ 6cY -> 0x0626 }
            r8 = r3
            goto L_0x049b
        L_0x04cd:
            int r2 = r0.A07()     // Catch:{ all -> 0x052e }
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r1) goto L_0x0526
            boolean r1 = r7.A0M()     // Catch:{ all -> 0x052e }
            if (r1 != 0) goto L_0x0526
            r1 = 1
            java.lang.String r11 = "Unable to parse map entry."
            if (r2 == r1) goto L_0x0506
            if (r2 == r9) goto L_0x04fb
            boolean r1 = r7.A0M()     // Catch:{ 6cY -> 0x050e }
            if (r1 != 0) goto L_0x04f6
            int r2 = r0.A02     // Catch:{ 6cY -> 0x050e }
            int r1 = r0.A00     // Catch:{ 6cY -> 0x050e }
            if (r2 == r1) goto L_0x04f6
            boolean r1 = r7.A0O(r2)     // Catch:{ 6cY -> 0x050e }
            if (r1 == 0) goto L_0x04f6
            goto L_0x04cd
        L_0x04f6:
            X.6u5 r1 = X.AnonymousClass6u5.A02(r11)     // Catch:{ 6cY -> 0x050e }
            throw r1     // Catch:{ 6cY -> 0x050e }
        L_0x04fb:
            X.6xa r2 = r10.A01     // Catch:{ 6cY -> 0x050e }
            java.lang.Class r1 = r16.getClass()     // Catch:{ 6cY -> 0x050e }
            java.lang.Object r3 = r0.A08(r6, r2, r1)     // Catch:{ 6cY -> 0x050e }
            goto L_0x04cd
        L_0x0506:
            X.6xa r2 = r10.A00     // Catch:{ 6cY -> 0x050e }
            r1 = 0
            java.lang.Object r4 = r0.A08(r1, r2, r1)     // Catch:{ 6cY -> 0x050e }
            goto L_0x04cd
        L_0x050e:
            boolean r1 = r7.A0M()     // Catch:{ all -> 0x052e }
            if (r1 != 0) goto L_0x0521
            int r2 = r0.A02     // Catch:{ all -> 0x052e }
            int r1 = r0.A00     // Catch:{ all -> 0x052e }
            if (r2 == r1) goto L_0x0521
            boolean r1 = r7.A0O(r2)     // Catch:{ all -> 0x052e }
            if (r1 == 0) goto L_0x0521
            goto L_0x04cd
        L_0x0521:
            X.6u5 r1 = X.AnonymousClass6u5.A02(r11)     // Catch:{ all -> 0x052e }
            throw r1     // Catch:{ all -> 0x052e }
        L_0x0526:
            r8.put(r4, r3)     // Catch:{ all -> 0x052e }
            r7.A0L(r5)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x052e:
            r1 = move-exception
            r7.A0L(r5)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0582
        L_0x0533:
            X.7c2 r1 = X.C160837oO.A03(r0)     // Catch:{ 6cY -> 0x0626 }
            int r5 = r1.A04()     // Catch:{ 6cY -> 0x0626 }
            X.8me r1 = A0H(r12, r3)     // Catch:{ 6cY -> 0x0626 }
            if (r1 == 0) goto L_0x055d
            boolean r1 = r1.BHj(r5)     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x055d
            r7 = r15
            if (r15 != 0) goto L_0x054e
            X.7o7 r7 = r13.A00(r14)     // Catch:{ 6cY -> 0x0626 }
        L_0x054e:
            long r1 = (long) r5     // Catch:{ 6cY -> 0x0626 }
            r5 = r7
            X.7o7 r5 = (X.C160677o7) r5     // Catch:{ 6cY -> 0x0626 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 6cY -> 0x0626 }
            r5.A02(r3, r1)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x060f
        L_0x055d:
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r5)     // Catch:{ 6cY -> 0x0626 }
        L_0x0564:
            r12.A0d(r14, r3)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0569:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r7
            boolean r1 = X.AnonymousClass000.A1S(r1)
            java.util.List r3 = A0N(r12, r14, r7)     // Catch:{ 6cY -> 0x0626 }
            if (r1 == 0) goto L_0x0583
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            r2 = r1 & 7
            r1 = 2
            if (r2 == r1) goto L_0x05ca
            X.6cY r1 = new X.6cY     // Catch:{ 6cY -> 0x0626 }
            r1.<init>()     // Catch:{ 6cY -> 0x0626 }
        L_0x0582:
            throw r1     // Catch:{ 6cY -> 0x0626 }
        L_0x0583:
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            r2 = r1 & 7
            r1 = 2
            if (r2 != r1) goto L_0x05aa
            boolean r1 = r3 instanceof X.C188208yW     // Catch:{ 6cY -> 0x0626 }
            if (r1 == 0) goto L_0x05b0
            X.8yW r3 = (X.C188208yW) r3     // Catch:{ 6cY -> 0x0626 }
        L_0x0590:
            X.7c2 r2 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            X.8Lq r1 = r2.A0H()     // Catch:{ 6cY -> 0x0626 }
            r3.AwJ(r1)     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            if (r2 == r1) goto L_0x0590
            goto L_0x05e3
        L_0x05aa:
            X.6cY r1 = new X.6cY     // Catch:{ 6cY -> 0x0626 }
            r1.<init>()     // Catch:{ 6cY -> 0x0626 }
            goto L_0x0582
        L_0x05b0:
            X.7c2 r2 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            java.lang.String r1 = r2.A0I()     // Catch:{ 6cY -> 0x0626 }
            r3.add(r1)     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            if (r2 == r1) goto L_0x05b0
            goto L_0x05e3
        L_0x05ca:
            X.7c2 r2 = X.C160837oO.A04(r0)     // Catch:{ 6cY -> 0x0626 }
            java.lang.String r1 = r2.A0J()     // Catch:{ 6cY -> 0x0626 }
            r3.add(r1)     // Catch:{ 6cY -> 0x0626 }
            boolean r1 = r2.A0M()     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x000f
            int r2 = r2.A09()     // Catch:{ 6cY -> 0x0626 }
            int r1 = r0.A02     // Catch:{ 6cY -> 0x0626 }
            if (r2 == r1) goto L_0x05ca
        L_0x05e3:
            r0.A01 = r2     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x05e7:
            X.7c2 r1 = X.C160837oO.A03(r0)     // Catch:{ 6cY -> 0x0626 }
            int r8 = r1.A04()     // Catch:{ 6cY -> 0x0626 }
            X.8me r1 = A0H(r12, r3)     // Catch:{ 6cY -> 0x0626 }
            if (r1 == 0) goto L_0x0612
            boolean r1 = r1.BHj(r8)     // Catch:{ 6cY -> 0x0626 }
            if (r1 != 0) goto L_0x0612
            r7 = r15
            if (r15 != 0) goto L_0x0602
            X.7o7 r7 = r13.A00(r14)     // Catch:{ 6cY -> 0x0626 }
        L_0x0602:
            long r1 = (long) r8     // Catch:{ 6cY -> 0x0626 }
            r5 = r7
            X.7o7 r5 = (X.C160677o7) r5     // Catch:{ 6cY -> 0x0626 }
            int r3 = r4 << 3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 6cY -> 0x0626 }
            r5.A02(r3, r1)     // Catch:{ 6cY -> 0x0626 }
        L_0x060f:
            r15 = r7
            goto L_0x000f
        L_0x0612:
            long r1 = X.AnonymousClass6C9.A0K(r7)     // Catch:{ 6cY -> 0x0626 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A05(r14, r1, r7)     // Catch:{ 6cY -> 0x0626 }
        L_0x061d:
            long r1 = X.AnonymousClass6C7.A0O(r5, r3)     // Catch:{ 6cY -> 0x0626 }
            com.google.protobuf.UnsafeUtil.A04(r14, r1, r4)     // Catch:{ 6cY -> 0x0626 }
            goto L_0x000f
        L_0x0626:
            if (r15 != 0) goto L_0x062c
            X.7o7 r15 = r13.A00(r14)     // Catch:{ all -> 0x0675 }
        L_0x062c:
            boolean r0 = r13.A01(r0, r15)     // Catch:{ all -> 0x0675 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0659
        L_0x0633:
            int r1 = r12.A00
        L_0x0635:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066c
            int[] r0 = r12.A0D
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Y(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0635
        L_0x0646:
            int r1 = r12.A00
        L_0x0648:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066c
            int[] r0 = r12.A0D
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Y(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0648
        L_0x0659:
            int r1 = r12.A00
        L_0x065b:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x066c
            int[] r0 = r12.A0D
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Y(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x065b
        L_0x066c:
            if (r15 == 0) goto L_0x0674
            X.7o7 r15 = (X.C160677o7) r15
            X.6cX r14 = (X.C130786cX) r14
            r14.unknownFields = r15
        L_0x0674:
            return
        L_0x0675:
            r2 = move-exception
            int r1 = r12.A00
        L_0x0678:
            int r0 = r12.A03
            if (r1 >= r0) goto L_0x0689
            int[] r0 = r12.A0D
            r17 = r0[r1]
            r16 = r14
            java.lang.Object r15 = r12.A0Y(r13, r14, r15, r16, r17)
            int r1 = r1 + 1
            goto L_0x0678
        L_0x0689:
            if (r15 == 0) goto L_0x0691
            X.7o7 r15 = (X.C160677o7) r15
            X.6cX r14 = (X.C130786cX) r14
            r14.unknownFields = r15
        L_0x0691:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.BLA(X.7oO, X.7pL, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010a, code lost:
        r14.putObject(r9, r2, r5.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r14.putInt(r9, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0167, code lost:
        r14.putLong(r9, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0183, code lost:
        r7 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        r7 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019d, code lost:
        r20 = r20 | r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLB(X.C156627gw r38, java.lang.Object r39, byte[] r40, int r41, int r42) {
        /*
            r37 = this;
            r7 = r41
            r12 = r37
            boolean r0 = r12.A0B
            r5 = r38
            r9 = r39
            r4 = r40
            r36 = r42
            if (r0 == 0) goto L_0x0277
            A0Q(r9)
            sun.misc.Unsafe r14 = A0F
            r3 = -1
            r1 = -1
            r8 = 0
            r20 = 0
            r15 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r0 = r36
            if (r7 >= r0) goto L_0x0261
            int r6 = r7 + 1
            byte r11 = r40[r7]
            if (r11 >= 0) goto L_0x002d
            int r6 = A0B(r5, r4, r11, r6)
            int r11 = r5.A00
        L_0x002d:
            int r19 = r11 >>> 3
            r7 = r11 & 7
            r0 = r19
            if (r0 <= r1) goto L_0x005c
            int r13 = r8 / 3
            int r1 = r12.A02
            if (r0 < r1) goto L_0x0259
            int r1 = r12.A01
            if (r0 > r1) goto L_0x0259
            int[] r10 = r12.A0C
            int r0 = r10.length
            int r0 = r0 / 3
            int r2 = r0 + -1
        L_0x0046:
            if (r13 > r2) goto L_0x0259
            int r0 = r2 + r13
            int r16 = r0 >>> 1
            int r8 = r16 * 3
            r1 = r10[r8]
            r0 = r19
            if (r0 == r1) goto L_0x0060
            if (r0 >= r1) goto L_0x0059
            int r2 = r16 + -1
            goto L_0x0046
        L_0x0059:
            int r13 = r16 + 1
            goto L_0x0046
        L_0x005c:
            int r8 = r12.A0S(r0)
        L_0x0060:
            if (r8 == r3) goto L_0x0259
            int[] r1 = r12.A0C
            int r0 = r8 + 1
            r17 = r1[r0]
            int r13 = X.AnonymousClass6C8.A07(r17)
            long r2 = X.AnonymousClass6C9.A0K(r17)
            r0 = 17
            if (r13 > r0) goto L_0x01a1
            int r0 = r8 + 2
            r10 = r1[r0]
            int r0 = r10 >>> 20
            r16 = 1
            int r18 = r16 << r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            if (r10 == r15) goto L_0x0097
            if (r15 == r0) goto L_0x008f
            long r0 = (long) r15
            r15 = r20
            r14.putInt(r9, r0, r15)
            r0 = 1048575(0xfffff, float:1.469367E-39)
        L_0x008f:
            if (r10 == r0) goto L_0x0096
            long r0 = (long) r10
            int r20 = r14.getInt(r9, r0)
        L_0x0096:
            r15 = r10
        L_0x0097:
            switch(r13) {
                case 0: goto L_0x0186;
                case 1: goto L_0x0173;
                case 2: goto L_0x015f;
                case 3: goto L_0x015f;
                case 4: goto L_0x0153;
                case 5: goto L_0x0141;
                case 6: goto L_0x0136;
                case 7: goto L_0x0120;
                case 8: goto L_0x00f3;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00cd;
                case 11: goto L_0x0153;
                case 12: goto L_0x0153;
                case 13: goto L_0x0136;
                case 14: goto L_0x0141;
                case 15: goto L_0x00bf;
                case 16: goto L_0x00b1;
                default: goto L_0x009a;
            }
        L_0x009a:
            X.7o7 r22 = A0J(r9)
            r21 = r5
            r23 = r4
            r24 = r11
            r25 = r6
            r26 = r36
            int r7 = A05(r21, r22, r23, r24, r25, r26)
        L_0x00ac:
            r1 = r19
            r3 = -1
            goto L_0x001d
        L_0x00b1:
            if (r7 != 0) goto L_0x009a
            int r7 = A0A(r5, r4, r6)
            long r0 = r5.A01
            long r0 = X.AnonymousClass6C7.A0G(r0)
            goto L_0x0167
        L_0x00bf:
            if (r7 != 0) goto L_0x009a
            int r7 = A09(r5, r4, r6)
            int r0 = r5.A00
            int r0 = X.AnonymousClass6C8.A08(r0)
            goto L_0x015b
        L_0x00cd:
            r0 = 2
            if (r7 != r0) goto L_0x009a
            int r7 = A07(r5, r4, r6)
            goto L_0x010a
        L_0x00d5:
            r0 = 2
            if (r7 != r0) goto L_0x009a
            java.lang.Object r0 = r12.A0Z(r9, r8)
            X.8vA r22 = r12.A0X(r8)
            r21 = r5
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r36
            int r7 = A02(r21, r22, r23, r24, r25, r26)
            r12.A0e(r9, r8, r0)
            goto L_0x019d
        L_0x00f3:
            r0 = 2
            if (r7 != r0) goto L_0x009a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r17
            if (r0 != 0) goto L_0x011b
            int r7 = A09(r5, r4, r6)
            int r1 = r5.A00
            if (r1 < 0) goto L_0x025c
            if (r1 != 0) goto L_0x0111
            java.lang.String r0 = ""
            r5.A02 = r0
        L_0x010a:
            java.lang.Object r0 = r5.A02
            r14.putObject(r9, r2, r0)
            goto L_0x019d
        L_0x0111:
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r0 = X.AnonymousClass6CA.A0W(r0, r4, r7, r1)
            r5.A02 = r0
            int r7 = r7 + r1
            goto L_0x010a
        L_0x011b:
            int r7 = A08(r5, r4, r6)
            goto L_0x010a
        L_0x0120:
            r10 = 1
            if (r7 != 0) goto L_0x009a
            int r7 = A0A(r5, r4, r6)
            long r0 = r5.A01
            r16 = 0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x0130
            r10 = 0
        L_0x0130:
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            r0.A0F(r9, r2, r10)
            goto L_0x019d
        L_0x0136:
            r0 = 5
            if (r7 != r0) goto L_0x009a
            int r0 = X.AnonymousClass6C7.A0B(r4, r6)
            r14.putInt(r9, r2, r0)
            goto L_0x0183
        L_0x0141:
            r0 = r16
            if (r7 != r0) goto L_0x009a
            long r25 = X.AnonymousClass6C7.A0N(r4, r6)
            r21 = r14
            r22 = r9
            r23 = r2
            r21.putLong(r22, r23, r25)
            goto L_0x019b
        L_0x0153:
            if (r7 != 0) goto L_0x009a
            int r7 = A09(r5, r4, r6)
            int r0 = r5.A00
        L_0x015b:
            r14.putInt(r9, r2, r0)
            goto L_0x019d
        L_0x015f:
            if (r7 != 0) goto L_0x009a
            int r7 = A0A(r5, r4, r6)
            long r0 = r5.A01
        L_0x0167:
            r21 = r14
            r22 = r9
            r23 = r2
            r25 = r0
            r21.putLong(r22, r23, r25)
            goto L_0x019d
        L_0x0173:
            r0 = 5
            if (r7 != r0) goto L_0x009a
            int r0 = X.AnonymousClass6C7.A0B(r4, r6)
            float r1 = java.lang.Float.intBitsToFloat(r0)
            X.7bz r0 = com.google.protobuf.UnsafeUtil.A01
            r0.A0B(r9, r2, r1)
        L_0x0183:
            int r7 = r6 + 4
            goto L_0x019d
        L_0x0186:
            r0 = r16
            if (r7 != r0) goto L_0x009a
            long r0 = X.AnonymousClass6C7.A0N(r4, r6)
            double r25 = java.lang.Double.longBitsToDouble(r0)
            X.7bz r21 = com.google.protobuf.UnsafeUtil.A01
            r22 = r9
            r23 = r2
            r21.A0A(r22, r23, r25)
        L_0x019b:
            int r7 = r6 + 8
        L_0x019d:
            r20 = r20 | r18
            goto L_0x00ac
        L_0x01a1:
            r0 = 27
            if (r13 != r0) goto L_0x01f4
            r0 = 2
            if (r7 != r0) goto L_0x009a
            java.lang.Object r1 = r14.getObject(r9, r2)
            X.8ya r1 = (X.C188248ya) r1
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01c6
            int r7 = r1.size()
            int r0 = r7 * 2
            if (r7 != 0) goto L_0x01bf
            r0 = 10
        L_0x01bf:
            X.8ya r1 = r1.BLN(r0)
            r14.putObject(r9, r2, r1)
        L_0x01c6:
            X.8vA r2 = r12.A0X(r8)
        L_0x01ca:
            java.lang.Object r0 = r2.BLT()
            r21 = r5
            r22 = r2
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r36
            int r7 = A02(r21, r22, r23, r24, r25, r26)
            r2.BKT(r0)
            r5.A02 = r0
            r1.add(r0)
            r0 = r36
            if (r7 >= r0) goto L_0x00ac
            int r6 = A09(r5, r4, r7)
            int r0 = r5.A00
            if (r11 == r0) goto L_0x01ca
            goto L_0x00ac
        L_0x01f4:
            r0 = 49
            if (r13 > r0) goto L_0x021e
            r0 = r17
            long r0 = (long) r0
            r28 = r19
            r29 = r7
            r30 = r8
            r31 = r13
            r32 = r0
            r34 = r2
            r21 = r12
            r22 = r5
            r23 = r9
            r24 = r4
            r25 = r6
            r26 = r36
            r27 = r11
            int r7 = r21.A0V(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
        L_0x0219:
            if (r7 != r6) goto L_0x00ac
            r6 = r7
            goto L_0x009a
        L_0x021e:
            r0 = 50
            if (r13 != r0) goto L_0x023a
            r0 = 2
            if (r7 != r0) goto L_0x009a
            r21 = r12
            r22 = r5
            r23 = r9
            r24 = r4
            r25 = r6
            r26 = r36
            r27 = r8
            r28 = r2
            int r7 = r21.A0W(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0219
        L_0x023a:
            r28 = r19
            r29 = r7
            r30 = r17
            r31 = r13
            r32 = r8
            r33 = r2
            r21 = r12
            r22 = r5
            r23 = r9
            r24 = r4
            r25 = r6
            r26 = r36
            r27 = r11
            int r7 = r21.A0U(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0219
        L_0x0259:
            r8 = 0
            goto L_0x009a
        L_0x025c:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        L_0x0261:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 == r0) goto L_0x026c
            long r1 = (long) r15
            r0 = r20
            r14.putInt(r9, r1, r0)
        L_0x026c:
            r0 = r36
            if (r7 == r0) goto L_0x0282
            java.lang.String r0 = "Failed to parse the message."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x0277:
            r6 = 0
            r0 = r12
            r1 = r5
            r2 = r9
            r3 = r4
            r4 = r7
            r5 = r36
            r0.A0T(r1, r2, r3, r4, r5, r6)
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.BLB(X.7gw, java.lang.Object, byte[], int, int):void");
    }

    public Object BLT() {
        return ((C130786cX) this.A07).A0I();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04e8, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0618, code lost:
        r7.A00.A08(r2, X.AnonymousClass001.A0K(X.C153777bz.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0642, code lost:
        r7.A00.A09(r2, X.AnonymousClass001.A0K(X.C153777bz.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x065e, code lost:
        r7.A00.A0C(r2, X.C18310x6.A0B(X.C153777bz.A00(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x076e, code lost:
        X.C162507sF.A0I(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x077c, code lost:
        X.C162507sF.A0K(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x078a, code lost:
        X.C162507sF.A0R(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0798, code lost:
        X.C162507sF.A0L(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x07a6, code lost:
        X.C162507sF.A0J(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07b4, code lost:
        X.C162507sF.A0F(r7, (java.util.List) r4.getObject(r6, r0), r8[r3], r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07c2, code lost:
        if (r11 == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07c4, code lost:
        r7.A00(A0X(r3), r4.getObject(r6, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x082f, code lost:
        if (r11 == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0831, code lost:
        r0 = r7.A00;
        X.AnonymousClass730.A06(r0, r2);
        r0.A0G((X.C172548Lq) r4.getObject(r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0842, code lost:
        if (r11 == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0844, code lost:
        r11 = r4.getObject(r6, r0);
        r7.A00.A0H((X.C187928y2) r11, A0X(r3), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0856, code lost:
        if (r11 == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0858, code lost:
        A0P(r7, r4.getObject(r6, r0), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029e, code lost:
        r7.A00.A08(r2, X.AnonymousClass001.A0K(X.C153777bz.A00(r6, X.AnonymousClass6C9.A0K(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d0, code lost:
        r7.A00.A09(r2, X.AnonymousClass001.A0K(X.C153777bz.A00(r6, X.AnonymousClass6C9.A0K(r0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02f0, code lost:
        r7.A00.A0C(r2, X.C18310x6.A0B(X.C153777bz.A00(r6, X.AnonymousClass6C9.A0K(r0))));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bsk(X.AnonymousClass7VF r18, java.lang.Object r19) {
        /*
            r17 = this;
            r6 = r19
            r5 = r17
            boolean r0 = r5.A0B
            r7 = r18
            if (r0 == 0) goto L_0x04b3
            int[] r4 = r5.A0C
            int r9 = r4.length
            r8 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r9) goto L_0x08e2
            int r0 = r3 + 1
            r0 = r4[r0]
            r2 = r4[r3]
            int r1 = X.AnonymousClass6C8.A07(r0)
            r10 = 1
            switch(r1) {
                case 0: goto L_0x0498;
                case 1: goto L_0x047d;
                case 2: goto L_0x0466;
                case 3: goto L_0x044f;
                case 4: goto L_0x043e;
                case 5: goto L_0x0427;
                case 6: goto L_0x0416;
                case 7: goto L_0x03ff;
                case 8: goto L_0x03f0;
                case 9: goto L_0x03d9;
                case 10: goto L_0x03c3;
                case 11: goto L_0x03b2;
                case 12: goto L_0x03a1;
                case 13: goto L_0x0390;
                case 14: goto L_0x0379;
                case 15: goto L_0x0363;
                case 16: goto L_0x0348;
                case 17: goto L_0x0335;
                case 18: goto L_0x01ab;
                case 19: goto L_0x01a0;
                case 20: goto L_0x0195;
                case 21: goto L_0x018a;
                case 22: goto L_0x017f;
                case 23: goto L_0x0174;
                case 24: goto L_0x0169;
                case 25: goto L_0x015e;
                case 26: goto L_0x0153;
                case 27: goto L_0x012c;
                case 28: goto L_0x0121;
                case 29: goto L_0x0116;
                case 30: goto L_0x010b;
                case 31: goto L_0x0100;
                case 32: goto L_0x00f5;
                case 33: goto L_0x00ea;
                case 34: goto L_0x00df;
                case 35: goto L_0x00d4;
                case 36: goto L_0x00c9;
                case 37: goto L_0x00be;
                case 38: goto L_0x00b3;
                case 39: goto L_0x00a8;
                case 40: goto L_0x009d;
                case 41: goto L_0x0093;
                case 42: goto L_0x0089;
                case 43: goto L_0x007f;
                case 44: goto L_0x0075;
                case 45: goto L_0x006b;
                case 46: goto L_0x0061;
                case 47: goto L_0x0057;
                case 48: goto L_0x004d;
                case 49: goto L_0x002a;
                case 50: goto L_0x0022;
                case 51: goto L_0x031c;
                case 52: goto L_0x0303;
                case 53: goto L_0x02ea;
                case 54: goto L_0x02e3;
                case 55: goto L_0x02ca;
                case 56: goto L_0x02b1;
                case 57: goto L_0x0298;
                case 58: goto L_0x0283;
                case 59: goto L_0x0274;
                case 60: goto L_0x025d;
                case 61: goto L_0x0247;
                case 62: goto L_0x022e;
                case 63: goto L_0x0226;
                case 64: goto L_0x021f;
                case 65: goto L_0x0206;
                case 66: goto L_0x01e8;
                case 67: goto L_0x01c9;
                case 68: goto L_0x01b6;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r3 = r3 + 3
            goto L_0x000f
        L_0x0022:
            java.lang.Object r0 = A0K(r0, r6)
            r5.A0c(r7, r0, r2, r3)
            goto L_0x001f
        L_0x002a:
            r11 = r4[r3]
            java.util.List r10 = A0M(r0, r6)
            X.8vA r2 = r5.A0X(r3)
            if (r10 == 0) goto L_0x001f
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x001f
            r1 = 0
        L_0x003d:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x001f
            java.lang.Object r0 = r10.get(r1)
            r7.A00(r2, r0, r11)
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004d:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0P(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0057:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0O(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0061:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0N(r7, r0, r1, r10)
            goto L_0x001f
        L_0x006b:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0M(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0075:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0G(r7, r0, r1, r10)
            goto L_0x001f
        L_0x007f:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0Q(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0089:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0E(r7, r0, r1, r10)
            goto L_0x001f
        L_0x0093:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0H(r7, r0, r1, r10)
            goto L_0x001f
        L_0x009d:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0I(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00a8:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0K(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00b3:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0R(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00be:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0L(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00c9:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0J(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00d4:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0F(r7, r0, r1, r10)
            goto L_0x001f
        L_0x00df:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0P(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00ea:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0O(r7, r0, r1, r8)
            goto L_0x001f
        L_0x00f5:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0N(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0100:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0M(r7, r0, r1, r8)
            goto L_0x001f
        L_0x010b:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0G(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0116:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0Q(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0121:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0C(r7, r0, r1)
            goto L_0x001f
        L_0x012c:
            r12 = r4[r3]
            java.util.List r11 = A0M(r0, r6)
            X.8vA r10 = r5.A0X(r3)
            if (r11 == 0) goto L_0x001f
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x001f
            r2 = 0
        L_0x013f:
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x001f
            java.lang.Object r1 = r11.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.8y2 r1 = (X.C187928y2) r1
            r0.A0H(r1, r10, r12)
            int r2 = r2 + 1
            goto L_0x013f
        L_0x0153:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0D(r7, r0, r1)
            goto L_0x001f
        L_0x015e:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0E(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0169:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0H(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0174:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0I(r7, r0, r1, r8)
            goto L_0x001f
        L_0x017f:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0K(r7, r0, r1, r8)
            goto L_0x001f
        L_0x018a:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0R(r7, r0, r1, r8)
            goto L_0x001f
        L_0x0195:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0L(r7, r0, r1, r8)
            goto L_0x001f
        L_0x01a0:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0J(r7, r0, r1, r8)
            goto L_0x001f
        L_0x01ab:
            r1 = r4[r3]
            java.util.List r0 = A0M(r0, r6)
            X.C162507sF.A0F(r7, r0, r1, r8)
            goto L_0x001f
        L_0x01b6:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0K(r0, r6)
            X.8vA r0 = r5.A0X(r3)
            r7.A00(r0, r1, r2)
            goto L_0x001f
        L_0x01c9:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r13 = r7.A00
            long r11 = r0 << r10
            r10 = 63
            long r0 = r0 >> r10
            long r0 = r0 ^ r11
            r13.A0C(r2, r0)
            goto L_0x001f
        L_0x01e8:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r10.A0A(r2, r0)
            goto L_0x001f
        L_0x0206:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x021f:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            goto L_0x029e
        L_0x0226:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            goto L_0x02d0
        L_0x022e:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x0247:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0K(r0, r6)
            X.8Lq r1 = (X.C172548Lq) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.AnonymousClass730.A06(r0, r2)
            r0.A0G(r1)
            goto L_0x001f
        L_0x025d:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r10 = A0K(r0, r6)
            X.8vA r1 = r5.A0X(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.8y2 r10 = (X.C187928y2) r10
            r0.A0H(r10, r1, r2)
            goto L_0x001f
        L_0x0274:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0K(r0, r6)
            A0P(r7, r0, r2)
            goto L_0x001f
        L_0x0283:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0K(r0, r6)
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0D(r2, r1)
            goto L_0x001f
        L_0x0298:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
        L_0x029e:
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x02b1:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x02ca:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
        L_0x02d0:
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x02e3:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            goto L_0x02f0
        L_0x02ea:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
        L_0x02f0:
            long r0 = X.AnonymousClass6C9.A0K(r0)
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0303:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0K(r0, r6)
            float r0 = X.AnonymousClass001.A05(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x001f
        L_0x031c:
            boolean r1 = r5.A0g(r6, r2, r3)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0K(r0, r6)
            double r0 = X.AnonymousClass6C9.A02(r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x0335:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0K(r0, r6)
            X.8vA r0 = r5.A0X(r3)
            r7.A00(r0, r1, r2)
            goto L_0x001f
        L_0x0348:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r10.A06(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = X.AnonymousClass6C7.A0F(r0)
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0363:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r0 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r10.A0A(r2, r0)
            goto L_0x001f
        L_0x0379:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r10.A06(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x0390:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r1 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x03a1:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r1 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x03b2:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r1 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x001f
        L_0x03c3:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = A0K(r0, r6)
            X.8Lq r1 = (X.C172548Lq) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.AnonymousClass730.A06(r0, r2)
            r0.A0G(r1)
            goto L_0x001f
        L_0x03d9:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r10 = A0K(r0, r6)
            X.8vA r1 = r5.A0X(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.8y2 r10 = (X.C187928y2) r10
            r0.A0H(r10, r1, r2)
            goto L_0x001f
        L_0x03f0:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = A0K(r0, r6)
            A0P(r7, r0, r2)
            goto L_0x001f
        L_0x03ff:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            boolean r1 = r10.A0J(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0D(r2, r1)
            goto L_0x001f
        L_0x0416:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r1 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x001f
        L_0x0427:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r10.A06(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x043e:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            int r1 = A01(r0, r6)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x001f
        L_0x044f:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r10.A06(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x0466:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            long r0 = r10.A06(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            r10.A0C(r2, r0)
            goto L_0x001f
        L_0x047d:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r10.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x001f
        L_0x0498:
            boolean r1 = r5.A0f(r3, r6)
            if (r1 == 0) goto L_0x001f
            long r0 = X.AnonymousClass6C9.A0K(r0)
            X.7bz r10 = com.google.protobuf.UnsafeUtil.A01
            double r0 = r10.A02(r6, r0)
            com.google.protobuf.CodedOutputStream r10 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r10.A0B(r2, r0)
            goto L_0x001f
        L_0x04b3:
            int[] r8 = r5.A0C
            int r10 = r8.length
            sun.misc.Unsafe r4 = A0F
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 0
        L_0x04c0:
            if (r3 >= r10) goto L_0x08e2
            int r0 = r3 + 1
            r13 = r8[r0]
            r2 = r8[r3]
            int r12 = X.AnonymousClass6C8.A07(r13)
            r0 = 17
            if (r12 > r0) goto L_0x08df
            int r0 = r3 + 2
            r14 = r8[r0]
            r11 = r14 & r16
            if (r11 == r9) goto L_0x04de
            long r0 = (long) r11
            int r15 = r4.getInt(r6, r0)
            r9 = r11
        L_0x04de:
            int r0 = r14 >>> 20
            r11 = 1
            int r11 = r11 << r0
        L_0x04e2:
            r13 = r13 & r16
            long r0 = (long) r13
            switch(r12) {
                case 0: goto L_0x08cb;
                case 1: goto L_0x08b7;
                case 2: goto L_0x08a9;
                case 3: goto L_0x089b;
                case 4: goto L_0x088d;
                case 5: goto L_0x087f;
                case 6: goto L_0x0871;
                case 7: goto L_0x0861;
                case 8: goto L_0x0855;
                case 9: goto L_0x0841;
                case 10: goto L_0x082e;
                case 11: goto L_0x0820;
                case 12: goto L_0x0812;
                case 13: goto L_0x0804;
                case 14: goto L_0x07f6;
                case 15: goto L_0x07e3;
                case 16: goto L_0x07d1;
                case 17: goto L_0x07c1;
                case 18: goto L_0x07b3;
                case 19: goto L_0x07a5;
                case 20: goto L_0x0797;
                case 21: goto L_0x0789;
                case 22: goto L_0x077b;
                case 23: goto L_0x076d;
                case 24: goto L_0x075f;
                case 25: goto L_0x056c;
                case 26: goto L_0x055f;
                case 27: goto L_0x0536;
                case 28: goto L_0x052a;
                case 29: goto L_0x0751;
                case 30: goto L_0x0743;
                case 31: goto L_0x0735;
                case 32: goto L_0x0727;
                case 33: goto L_0x0719;
                case 34: goto L_0x051d;
                case 35: goto L_0x0716;
                case 36: goto L_0x0713;
                case 37: goto L_0x0710;
                case 38: goto L_0x070e;
                case 39: goto L_0x070c;
                case 40: goto L_0x070a;
                case 41: goto L_0x06fc;
                case 42: goto L_0x06ee;
                case 43: goto L_0x06e0;
                case 44: goto L_0x06d2;
                case 45: goto L_0x06c4;
                case 46: goto L_0x06b6;
                case 47: goto L_0x06a8;
                case 48: goto L_0x0510;
                case 49: goto L_0x04eb;
                case 50: goto L_0x069f;
                case 51: goto L_0x0686;
                case 52: goto L_0x066d;
                case 53: goto L_0x0658;
                case 54: goto L_0x0651;
                case 55: goto L_0x063c;
                case 56: goto L_0x0627;
                case 57: goto L_0x0612;
                case 58: goto L_0x05fd;
                case 59: goto L_0x05f7;
                case 60: goto L_0x05f1;
                case 61: goto L_0x05eb;
                case 62: goto L_0x05d6;
                case 63: goto L_0x05cf;
                case 64: goto L_0x05c8;
                case 65: goto L_0x05b3;
                case 66: goto L_0x0599;
                case 67: goto L_0x0580;
                case 68: goto L_0x057a;
                default: goto L_0x04e8;
            }
        L_0x04e8:
            int r3 = r3 + 3
            goto L_0x04c0
        L_0x04eb:
            r11 = r8[r3]
            java.lang.Object r12 = r4.getObject(r6, r0)
            java.util.List r12 = (java.util.List) r12
            X.8vA r2 = r5.A0X(r3)
            if (r12 == 0) goto L_0x04e8
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x04e8
            r1 = 0
        L_0x0500:
            int r0 = r12.size()
            if (r1 >= r0) goto L_0x04e8
            java.lang.Object r0 = r12.get(r1)
            r7.A00(r2, r0, r11)
            int r1 = r1 + 1
            goto L_0x0500
        L_0x0510:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.C162507sF.A0P(r7, r1, r2, r0)
            goto L_0x04e8
        L_0x051d:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C162507sF.A0P(r7, r1, r2, r0)
            goto L_0x04e8
        L_0x052a:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0C(r7, r0, r2)
            goto L_0x04e8
        L_0x0536:
            r11 = r8[r3]
            java.lang.Object r13 = r4.getObject(r6, r0)
            java.util.List r13 = (java.util.List) r13
            X.8vA r12 = r5.A0X(r3)
            if (r13 == 0) goto L_0x04e8
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x04e8
            r2 = 0
        L_0x054b:
            int r0 = r13.size()
            if (r2 >= r0) goto L_0x04e8
            java.lang.Object r1 = r13.get(r2)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.8y2 r1 = (X.C187928y2) r1
            r0.A0H(r1, r12, r11)
            int r2 = r2 + 1
            goto L_0x054b
        L_0x055f:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0D(r7, r0, r2)
            goto L_0x04e8
        L_0x056c:
            r2 = r8[r3]
            java.lang.Object r1 = r4.getObject(r6, r0)
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            X.C162507sF.A0E(r7, r1, r2, r0)
            goto L_0x04e8
        L_0x057a:
            boolean r11 = r5.A0g(r6, r2, r3)
            goto L_0x07c2
        L_0x0580:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.AnonymousClass6C7.A0F(r0)
            r11.A0C(r2, r0)
            goto L_0x04e8
        L_0x0599:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r0 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0A(r2, r0)
            goto L_0x04e8
        L_0x05b3:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x05c8:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            goto L_0x0618
        L_0x05cf:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            goto L_0x0642
        L_0x05d6:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04e8
        L_0x05eb:
            boolean r11 = r5.A0g(r6, r2, r3)
            goto L_0x082f
        L_0x05f1:
            boolean r11 = r5.A0g(r6, r2, r3)
            goto L_0x0842
        L_0x05f7:
            boolean r11 = r5.A0g(r6, r2, r3)
            goto L_0x0856
        L_0x05fd:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0D(r2, r1)
            goto L_0x04e8
        L_0x0612:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
        L_0x0618:
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x04e8
        L_0x0627:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x063c:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
        L_0x0642:
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            int r1 = X.AnonymousClass001.A0K(r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04e8
        L_0x0651:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            goto L_0x065e
        L_0x0658:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
        L_0x065e:
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            long r0 = X.C18310x6.A0B(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04e8
        L_0x066d:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            float r0 = X.AnonymousClass001.A05(r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x04e8
        L_0x0686:
            boolean r11 = r5.A0g(r6, r2, r3)
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = X.C153777bz.A00(r6, r0)
            double r0 = X.AnonymousClass6C9.A02(r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x069f:
            java.lang.Object r0 = r4.getObject(r6, r0)
            r5.A0c(r7, r0, r2, r3)
            goto L_0x04e8
        L_0x06a8:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0O(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06b6:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0N(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06c4:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0M(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06d2:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0G(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06e0:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0Q(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06ee:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0E(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x06fc:
            r11 = 1
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0H(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x070a:
            r11 = 1
            goto L_0x076e
        L_0x070c:
            r11 = 1
            goto L_0x077c
        L_0x070e:
            r11 = 1
            goto L_0x078a
        L_0x0710:
            r11 = 1
            goto L_0x0798
        L_0x0713:
            r11 = 1
            goto L_0x07a6
        L_0x0716:
            r11 = 1
            goto L_0x07b4
        L_0x0719:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0O(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0727:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0N(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0735:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0M(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0743:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0G(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0751:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0Q(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x075f:
            r11 = 0
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0H(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x076d:
            r11 = 0
        L_0x076e:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0I(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x077b:
            r11 = 0
        L_0x077c:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0K(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0789:
            r11 = 0
        L_0x078a:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0R(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x0797:
            r11 = 0
        L_0x0798:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0L(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x07a5:
            r11 = 0
        L_0x07a6:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0J(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x07b3:
            r11 = 0
        L_0x07b4:
            r2 = r8[r3]
            java.lang.Object r0 = r4.getObject(r6, r0)
            java.util.List r0 = (java.util.List) r0
            X.C162507sF.A0F(r7, r0, r2, r11)
            goto L_0x04e8
        L_0x07c1:
            r11 = r11 & r15
        L_0x07c2:
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8vA r0 = r5.A0X(r3)
            r7.A00(r0, r1, r2)
            goto L_0x04e8
        L_0x07d1:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = X.AnonymousClass6C7.A0F(r0)
            r11.A0C(r2, r0)
            goto L_0x04e8
        L_0x07e3:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r0 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            r11.A0A(r2, r0)
            goto L_0x04e8
        L_0x07f6:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x0804:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x04e8
        L_0x0812:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04e8
        L_0x0820:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0A(r2, r1)
            goto L_0x04e8
        L_0x082e:
            r11 = r11 & r15
        L_0x082f:
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r1 = r4.getObject(r6, r0)
            X.8Lq r1 = (X.C172548Lq) r1
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.AnonymousClass730.A06(r0, r2)
            r0.A0G(r1)
            goto L_0x04e8
        L_0x0841:
            r11 = r11 & r15
        L_0x0842:
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r11 = r4.getObject(r6, r0)
            X.8vA r1 = r5.A0X(r3)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            X.8y2 r11 = (X.C187928y2) r11
            r0.A0H(r11, r1, r2)
            goto L_0x04e8
        L_0x0855:
            r11 = r11 & r15
        L_0x0856:
            if (r11 == 0) goto L_0x04e8
            java.lang.Object r0 = r4.getObject(r6, r0)
            A0P(r7, r0, r2)
            goto L_0x04e8
        L_0x0861:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            X.7bz r11 = com.google.protobuf.UnsafeUtil.A01
            boolean r1 = r11.A0J(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A0D(r2, r1)
            goto L_0x04e8
        L_0x0871:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A08(r2, r1)
            goto L_0x04e8
        L_0x087f:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x088d:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            int r1 = r4.getInt(r6, r0)
            com.google.protobuf.CodedOutputStream r0 = r7.A00
            r0.A09(r2, r1)
            goto L_0x04e8
        L_0x089b:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04e8
        L_0x08a9:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            long r0 = r4.getLong(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            r11.A0C(r2, r0)
            goto L_0x04e8
        L_0x08b7:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            X.7bz r11 = com.google.protobuf.UnsafeUtil.A01
            float r0 = r11.A03(r6, r0)
            com.google.protobuf.CodedOutputStream r1 = r7.A00
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1.A08(r2, r0)
            goto L_0x04e8
        L_0x08cb:
            r11 = r11 & r15
            if (r11 == 0) goto L_0x04e8
            X.7bz r11 = com.google.protobuf.UnsafeUtil.A01
            double r0 = r11.A02(r6, r0)
            com.google.protobuf.CodedOutputStream r11 = r7.A00
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11.A0B(r2, r0)
            goto L_0x04e8
        L_0x08df:
            r11 = 0
            goto L_0x04e2
        L_0x08e2:
            X.6cX r6 = (X.C130786cX) r6
            X.7o7 r0 = r6.unknownFields
            r0.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170238Ck.Bsk(X.7VF, java.lang.Object):void");
    }

    public C170238Ck(AnonymousClass731 r2, C158277ji r3, C159367li r4, C187928y2 r5, AnonymousClass733 r6, C151437Ut r7, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A0C = iArr;
        this.A0E = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0A = r5 instanceof C130786cX;
        this.A0B = z;
        this.A0D = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A08 = r6;
        this.A05 = r3;
        this.A09 = r7;
        this.A04 = r2;
        this.A07 = r5;
        this.A06 = r4;
    }

    public static int A01(int i, Object obj) {
        return UnsafeUtil.A01.A05(obj, (long) (i & 1048575));
    }

    public static int A07(C156627gw r3, byte[] bArr, int i) {
        int A092 = A09(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw AnonymousClass6u5.A01();
        } else if (i2 > bArr.length - A092) {
            throw AnonymousClass6u5.A00();
        } else if (i2 == 0) {
            r3.A02 = C172548Lq.A01;
            return A092;
        } else {
            r3.A02 = C172548Lq.A02(bArr, A092, i2);
            return A092 + i2;
        }
    }

    public static int A08(C156627gw r3, byte[] bArr, int i) {
        int A092 = A09(r3, bArr, i);
        int i2 = r3.A00;
        if (i2 < 0) {
            throw AnonymousClass6u5.A01();
        } else if (i2 == 0) {
            r3.A02 = "";
            return A092;
        } else {
            r3.A02 = C159717mL.A00.A02(bArr, A092, i2);
            return A092 + i2;
        }
    }

    public static long A0E(C160837oO r3, int i) {
        long j = (long) (i & 1048575);
        r3.A0A(0);
        return j;
    }

    public static long A0F(C160837oO r3, int i) {
        long j = (long) (i & 1048575);
        r3.A0A(1);
        return j;
    }

    public static long A0G(C160837oO r3, int i) {
        long j = (long) (i & 1048575);
        r3.A0A(5);
        return j;
    }

    public static Object A0K(int i, Object obj) {
        return UnsafeUtil.A01.A07(obj, (long) (i & 1048575));
    }

    public static Field A0L(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass6C9.A19(A0o, str);
            AnonymousClass6C9.A0y(cls, A0o);
            A0o.append(" not found. Known fields are ");
            C18320x8.A1P(A0o, declaredFields);
            throw AnonymousClass6C7.A0e(A0o);
        }
    }

    public static List A0M(int i, Object obj) {
        return (List) UnsafeUtil.A01.A07(obj, (long) (i & 1048575));
    }

    public static void A0Q(Object obj) {
        if (!A0R(obj)) {
            throw AnonymousClass000.A0E(obj, "Mutating immutable message: ", AnonymousClass001.A0o());
        }
    }

    public final Object A0Z(Object obj, int i) {
        C186358vA A0X = A0X(i);
        long A0T = AnonymousClass6C8.A0T(this.A0C, i);
        if (!A0f(i, obj)) {
            return A0X.BLT();
        }
        Object object = A0F.getObject(obj, A0T);
        if (A0R(object)) {
            return object;
        }
        Object BLT = A0X.BLT();
        if (object != null) {
            A0X.BL9(BLT, object);
        }
        return BLT;
    }

    public final Object A0a(Object obj, int i, int i2) {
        C186358vA A0X = A0X(i2);
        if (!A0g(obj, i, i2)) {
            return A0X.BLT();
        }
        Object object = A0F.getObject(obj, AnonymousClass6C8.A0T(this.A0C, i2));
        if (A0R(object)) {
            return object;
        }
        Object BLT = A0X.BLT();
        if (object != null) {
            A0X.BL9(BLT, object);
        }
        return BLT;
    }

    public final boolean BHl(Object obj) {
        boolean z;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A0D[i3];
            int[] iArr = this.A0C;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0F.getInt(obj, (long) i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0f(i4, obj)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int A072 = AnonymousClass6C8.A07(i6);
            if (A072 != 9 && A072 != 17) {
                if (A072 != 27) {
                    if (A072 == 60 || A072 == 68) {
                        z = A0g(obj, i5, i4);
                    } else if (A072 != 49) {
                        if (A072 == 50) {
                            AbstractMap abstractMap = (AbstractMap) C153777bz.A00(obj, (long) (i6 & 1048575));
                            if (!abstractMap.isEmpty() && ((AnonymousClass7K4) this.A0E[(i4 / 3) * 2]).A00.A01.javaType == C142596xS.A08) {
                                Iterator A0v = AnonymousClass001.A0v(abstractMap);
                                C186358vA r1 = null;
                                while (A0v.hasNext()) {
                                    Object next = A0v.next();
                                    if (r1 == null) {
                                        r1 = AnonymousClass6C7.A0R(next);
                                    }
                                    if (!r1.BHl(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) C153777bz.A00(obj, (long) (i6 & 1048575));
                if (!list.isEmpty()) {
                    C186358vA A0X = A0X(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0X.BHl(list.get(i10))) {
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
                z = A0f(i4, obj);
            } else {
                z = i2 & i9;
            }
            if (z && !A0X(i4).BHl(C153777bz.A00(obj, (long) (i6 & 1048575)))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    public void BKT(Object obj) {
        Object unmodifiableList;
        AnonymousClass8T6 r1;
        if (A0R(obj)) {
            if (obj instanceof C130786cX) {
                C130786cX r3 = (C130786cX) obj;
                int i = Integer.MAX_VALUE | (r3.memoizedSerializedSize & Integer.MIN_VALUE);
                r3.memoizedSerializedSize = i;
                r3.memoizedHashCode = 0;
                r3.memoizedSerializedSize = i & Integer.MAX_VALUE;
            }
            int[] iArr = this.A0C;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int i3 = iArr[i2 + 1];
                long A0K = AnonymousClass6C9.A0K(i3);
                int A072 = AnonymousClass6C8.A07(i3);
                if (A072 != 9) {
                    switch (A072) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            boolean z = this.A05 instanceof C130806cZ;
                            Object A002 = C153777bz.A00(obj, A0K);
                            if (!z) {
                                List list = (List) A002;
                                if (!(list instanceof C188208yW)) {
                                    if (!AnonymousClass6C9.A1N(C130816ca.A00, list)) {
                                        if ((list instanceof C178988iQ) && (list instanceof C188248ya)) {
                                            r1 = (AnonymousClass8T6) ((C188248ya) list);
                                            if (!r1.A00) {
                                                break;
                                            }
                                        } else {
                                            unmodifiableList = Collections.unmodifiableList(list);
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    unmodifiableList = ((C188208yW) list).BE3();
                                }
                                UnsafeUtil.A05(obj, A0K, unmodifiableList);
                                break;
                            } else {
                                r1 = (AnonymousClass8T6) ((C188248ya) A002);
                            }
                            r1.A00 = false;
                            continue;
                        case 50:
                            Unsafe unsafe = A0F;
                            Object object = unsafe.getObject(obj, A0K);
                            if (object != null) {
                                ((C174278Tq) object).isMutable = false;
                                unsafe.putObject(obj, A0K, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (A0f(i2, obj)) {
                    A0X(i2).BKT(A0F.getObject(obj, A0K));
                }
            }
            ((C130786cX) obj).unknownFields.A01 = false;
        }
    }
}
