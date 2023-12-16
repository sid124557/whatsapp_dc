package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7c2  reason: invalid class name and case insensitive filesystem */
public abstract class C153797c2 {
    public int A00;
    public C160837oO A01;

    public static long A00(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public double A01() {
        long A0R;
        if (this instanceof C130286bi) {
            A0R = ((C130286bi) this).A0R();
        } else {
            A0R = ((C130276bh) this).A0R();
        }
        return Double.longBitsToDouble(A0R);
    }

    public float A02() {
        int A0P;
        if (this instanceof C130286bi) {
            A0P = ((C130286bi) this).A0P();
        } else {
            A0P = ((C130276bh) this).A0P();
        }
        return Float.intBitsToFloat(A0P);
    }

    public int A03() {
        if (this instanceof C130286bi) {
            C130286bi r0 = (C130286bi) this;
            return r0.A05 + r0.A04;
        }
        C130276bh r02 = (C130276bh) this;
        return r02.A04 - r02.A05;
    }

    public int A04() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0Q();
        }
        return ((C130276bh) this).A0Q();
    }

    public int A05() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0P();
        }
        return ((C130276bh) this).A0P();
    }

    public int A06() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0Q();
        }
        return ((C130276bh) this).A0Q();
    }

    public int A07() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0P();
        }
        return ((C130276bh) this).A0P();
    }

    public int A08() {
        if (this instanceof C130286bi) {
            return AnonymousClass6C8.A08(((C130286bi) this).A0Q());
        }
        return AnonymousClass6C8.A08(((C130276bh) this).A0Q());
    }

    public int A09() {
        if (this instanceof C130286bi) {
            C130286bi r1 = (C130286bi) this;
            if (r1.A0M()) {
                r1.A03 = 0;
                return 0;
            }
            int A0Q = r1.A0Q();
            r1.A03 = A0Q;
            if ((A0Q >>> 3) != 0) {
                return A0Q;
            }
            throw AnonymousClass6u5.A02("Protocol message contained an invalid tag (zero).");
        }
        C130276bh r12 = (C130276bh) this;
        if (r12.A0M()) {
            r12.A02 = 0;
            return 0;
        }
        int A0Q2 = r12.A0Q();
        r12.A02 = A0Q2;
        if ((A0Q2 >>> 3) != 0) {
            return A0Q2;
        }
        throw AnonymousClass6u5.A02("Protocol message contained an invalid tag (zero).");
    }

    public int A0A() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0Q();
        }
        return ((C130276bh) this).A0Q();
    }

    public int A0B(int i) {
        if (this instanceof C130286bi) {
            C130286bi r2 = (C130286bi) this;
            if (i >= 0) {
                int i2 = i + r2.A05 + r2.A04;
                int i3 = r2.A02;
                if (i2 <= i3) {
                    r2.A02 = i2;
                    r2.A0V();
                    return i3;
                }
                throw AnonymousClass6u5.A00();
            }
            throw AnonymousClass6u5.A01();
        }
        C130276bh r22 = (C130276bh) this;
        if (i >= 0) {
            int i4 = i + (r22.A04 - r22.A05);
            if (i4 >= 0) {
                int i5 = r22.A01;
                if (i4 <= i5) {
                    r22.A01 = i4;
                    r22.A0U();
                    return i5;
                }
                throw AnonymousClass6u5.A00();
            }
            throw AnonymousClass6u5.A02("Failed to parse the message.");
        }
        throw AnonymousClass6u5.A01();
    }

    public long A0C() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0R();
        }
        return ((C130276bh) this).A0R();
    }

    public long A0D() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0S();
        }
        return ((C130276bh) this).A0S();
    }

    public long A0E() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0R();
        }
        return ((C130276bh) this).A0R();
    }

    public long A0F() {
        if (this instanceof C130286bi) {
            return AnonymousClass6C7.A0G(((C130286bi) this).A0S());
        }
        return AnonymousClass6C7.A0G(((C130276bh) this).A0S());
    }

    public long A0G() {
        if (this instanceof C130286bi) {
            return ((C130286bi) this).A0S();
        }
        return ((C130276bh) this).A0S();
    }

    public C172548Lq A0H() {
        if (this instanceof C130286bi) {
            C130286bi r6 = (C130286bi) this;
            int A0Q = r6.A0Q();
            int i = r6.A00;
            int i2 = r6.A04;
            if (A0Q <= i - i2 && A0Q > 0) {
                C172548Lq A02 = C172548Lq.A02(r6.A07, i2, A0Q);
                r6.A04 += A0Q;
                return A02;
            } else if (A0Q != 0) {
                byte[] A0a = r6.A0a(A0Q);
                if (A0a != null) {
                    return C172548Lq.A02(A0a, 0, A0a.length);
                }
                int i3 = r6.A04;
                int i4 = r6.A00;
                int i5 = i4 - i3;
                r6.A05 += i4;
                r6.A04 = 0;
                r6.A00 = 0;
                List<byte[]> A0U = r6.A0U(A0Q - i5);
                byte[] bArr = new byte[A0Q];
                System.arraycopy(r6.A07, i3, bArr, 0, i5);
                for (byte[] bArr2 : A0U) {
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i5, length);
                    i5 += length;
                }
                return new C130256bf(bArr);
            }
        } else {
            C130276bh r3 = (C130276bh) this;
            int A0Q2 = r3.A0Q();
            if (A0Q2 > 0) {
                int i6 = r3.A03;
                int i7 = r3.A04;
                int i8 = i6 - i7;
                if (A0Q2 <= i8) {
                    C172548Lq A022 = C172548Lq.A02(r3.A06, i7, A0Q2);
                    r3.A04 += A0Q2;
                    return A022;
                } else if (A0Q2 <= i8) {
                    int i9 = A0Q2 + i7;
                    r3.A04 = i9;
                    return new C130256bf(Arrays.copyOfRange(r3.A06, i7, i9));
                } else {
                    throw AnonymousClass6u5.A00();
                }
            } else if (A0Q2 != 0) {
                throw AnonymousClass6u5.A01();
            }
        }
        return C172548Lq.A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0I() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C130286bi
            if (r0 == 0) goto L_0x0045
            r4 = r5
            X.6bi r4 = (X.C130286bi) r4
            int r3 = r4.A0Q()
            if (r3 <= 0) goto L_0x0022
            int r0 = r4.A00
            int r2 = r4.A04
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0027
            byte[] r1 = r4.A07
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r2 = X.AnonymousClass6CA.A0W(r0, r1, r2, r3)
        L_0x001c:
            int r0 = r4.A04
            int r0 = r0 + r3
            r4.A04 = r0
            return r2
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            java.lang.String r2 = ""
            return r2
        L_0x0027:
            int r0 = r4.A00
            if (r3 > r0) goto L_0x0039
            r4.A0X(r3)
            byte[] r2 = r4.A07
            int r1 = r4.A04
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r2 = X.AnonymousClass6CA.A0W(r0, r2, r1, r3)
            goto L_0x001c
        L_0x0039:
            byte[] r1 = r4.A0Z(r3)
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1, r0)
            return r2
        L_0x0045:
            r4 = r5
            X.6bh r4 = (X.C130276bh) r4
            int r3 = r4.A0Q()
            if (r3 <= 0) goto L_0x0068
            int r0 = r4.A03
            int r2 = r4.A04
            int r0 = r0 - r2
            if (r3 > r0) goto L_0x0063
            byte[] r1 = r4.A06
            java.nio.charset.Charset r0 = X.C155647fF.A04
            java.lang.String r1 = X.AnonymousClass6CA.A0W(r0, r1, r2, r3)
            int r0 = r4.A04
            int r0 = r0 + r3
            r4.A04 = r0
            return r1
        L_0x0063:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x0068:
            if (r3 != 0) goto L_0x006d
            java.lang.String r1 = ""
            return r1
        L_0x006d:
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153797c2.A0I():java.lang.String");
    }

    public String A0J() {
        byte[] A0Z;
        if (this instanceof C130286bi) {
            C130286bi r4 = (C130286bi) this;
            int A0Q = r4.A0Q();
            int i = r4.A04;
            int i2 = r4.A00;
            if (A0Q <= i2 - i && A0Q > 0) {
                A0Z = r4.A07;
                r4.A04 = i + A0Q;
            } else if (A0Q == 0) {
                return "";
            } else {
                i = 0;
                if (A0Q <= i2) {
                    r4.A0X(A0Q);
                    A0Z = r4.A07;
                    r4.A04 = A0Q;
                } else {
                    A0Z = r4.A0Z(A0Q);
                }
            }
            return C159717mL.A00.A02(A0Z, i, A0Q);
        }
        C130276bh r42 = (C130276bh) this;
        int A0Q2 = r42.A0Q();
        if (A0Q2 > 0) {
            int i3 = r42.A03;
            int i4 = r42.A04;
            if (A0Q2 <= i3 - i4) {
                String A02 = C159717mL.A00.A02(r42.A06, i4, A0Q2);
                r42.A04 += A0Q2;
                return A02;
            }
            throw AnonymousClass6u5.A00();
        } else if (A0Q2 == 0) {
            return "";
        } else {
            throw AnonymousClass6u5.A01();
        }
    }

    public void A0K(int i) {
        if (this instanceof C130286bi) {
            if (((C130286bi) this).A03 != i) {
                throw AnonymousClass6u5.A02("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((C130276bh) this).A02 != i) {
            throw AnonymousClass6u5.A02("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0L(int i) {
        if (this instanceof C130286bi) {
            C130286bi r0 = (C130286bi) this;
            r0.A02 = i;
            r0.A0V();
            return;
        }
        C130276bh r02 = (C130276bh) this;
        r02.A01 = i;
        r02.A0U();
    }

    public boolean A0M() {
        if (this instanceof C130286bi) {
            C130286bi r2 = (C130286bi) this;
            if (r2.A04 != r2.A00 || r2.A0Y(1)) {
                return false;
            }
            return true;
        }
        C130276bh r0 = (C130276bh) this;
        return AnonymousClass000.A1U(r0.A04, r0.A03);
    }

    public boolean A0N() {
        if (this instanceof C130286bi) {
            return AnonymousClass000.A1S((((C130286bi) this).A0S() > 0 ? 1 : (((C130286bi) this).A0S() == 0 ? 0 : -1)));
        }
        return AnonymousClass000.A1S((((C130276bh) this).A0S() > 0 ? 1 : (((C130276bh) this).A0S() == 0 ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(int r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C130286bi
            if (r0 == 0) goto L_0x007d
            r5 = r7
            X.6bi r5 = (X.C130286bi) r5
            r2 = r8 & 7
            r6 = 1
            if (r2 == 0) goto L_0x003f
            r0 = 8
            if (r2 == r6) goto L_0x003b
            r0 = 2
            if (r2 == r0) goto L_0x0037
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x0021
            if (r2 == r1) goto L_0x0116
            r0 = 5
            if (r2 != r0) goto L_0x0105
            r5.A0W(r1)
        L_0x001f:
            r0 = 1
            return r0
        L_0x0021:
            int r0 = r5.A09()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r5.A0O(r0)
            if (r0 != 0) goto L_0x0021
        L_0x002d:
            int r0 = r8 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r5.A0K(r0)
            goto L_0x001f
        L_0x0037:
            int r0 = r5.A0Q()
        L_0x003b:
            r5.A0W(r0)
            goto L_0x001f
        L_0x003f:
            int r0 = r5.A00
            int r4 = r5.A04
            int r0 = r0 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x005f
        L_0x0049:
            byte[] r1 = r5.A07
            r0 = r4
            int r4 = r4 + 1
            r5.A04 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x001f
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0049
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x005f:
            int r0 = r5.A00
            if (r4 != r0) goto L_0x0066
            r5.A0X(r6)
        L_0x0066:
            byte[] r1 = r5.A07
            int r0 = r5.A04
            int r4 = r0 + 1
            r5.A04 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x001f
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x005f
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x007d:
            r6 = r7
            X.6bh r6 = (X.C130276bh) r6
            r1 = r8 & 7
            r0 = 1
            if (r1 == 0) goto L_0x00cc
            if (r1 == r0) goto L_0x00aa
            r0 = 2
            if (r1 == r0) goto L_0x009f
            r0 = 3
            r2 = 4
            if (r1 == r0) goto L_0x00b5
            if (r1 == r2) goto L_0x0116
            r0 = 5
            if (r1 != r0) goto L_0x0110
            int r1 = r6.A03
            int r0 = r6.A04
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x010b
            int r0 = r0 + 4
        L_0x009c:
            r6.A04 = r0
            goto L_0x001f
        L_0x009f:
            int r2 = r6.A0Q()
            if (r2 >= 0) goto L_0x00ac
            X.6u5 r0 = X.AnonymousClass6u5.A01()
            throw r0
        L_0x00aa:
            r2 = 8
        L_0x00ac:
            int r1 = r6.A03
            int r0 = r6.A04
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x0118
            int r0 = r0 + r2
            goto L_0x009c
        L_0x00b5:
            int r0 = r6.A09()
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r6.A0O(r0)
            if (r0 != 0) goto L_0x00b5
        L_0x00c1:
            int r0 = r8 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r6.A0K(r0)
            goto L_0x001f
        L_0x00cc:
            int r5 = r6.A03
            int r4 = r6.A04
            int r0 = r5 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x00ed
        L_0x00d7:
            byte[] r1 = r6.A06
            r0 = r4
            int r4 = r4 + 1
            r6.A04 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x001f
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00d7
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x00ed:
            r1 = r4
            if (r4 == r5) goto L_0x011d
            byte[] r0 = r6.A06
            int r4 = r4 + 1
            r6.A04 = r4
            byte r0 = r0[r1]
            if (r0 >= 0) goto L_0x001f
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00ed
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.6u5 r0 = X.AnonymousClass6u5.A02(r0)
            throw r0
        L_0x0105:
            X.6cY r0 = new X.6cY
            r0.<init>()
            throw r0
        L_0x010b:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x0110:
            X.6cY r0 = new X.6cY
            r0.<init>()
            throw r0
        L_0x0116:
            r0 = 0
            return r0
        L_0x0118:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        L_0x011d:
            X.6u5 r0 = X.AnonymousClass6u5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153797c2.A0O(int):boolean");
    }
}
