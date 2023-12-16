package com.google.protobuf;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6u9;
import X.AnonymousClass730;
import X.AnonymousClass7VF;
import X.C130256bf;
import X.C130296bj;
import X.C130306bk;
import X.C143986zo;
import X.C155647fF;
import X.C159717mL;
import X.C170198Cg;
import X.C172548Lq;
import X.C186358vA;
import X.C187928y2;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends AnonymousClass730 {
    public static final Logger A01 = AnonymousClass6C8.A0m(CodedOutputStream.class);
    public static final boolean A02 = UnsafeUtil.A04;
    public AnonymousClass7VF A00;

    public final void A04() {
        C130296bj r0 = (C130296bj) this;
        if (r0.A01 - r0.A00 != 0) {
            throw AnonymousClass001.A0e("Did not write as much data as expected.");
        }
    }

    public static int A02(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            return i + 1;
        }
        return i;
    }

    public void A05(byte b) {
        if (this instanceof C130306bk) {
            C130306bk r3 = (C130306bk) this;
            if (r3.A00 == r3.A02) {
                r3.A0L();
            }
            byte[] bArr = r3.A04;
            int i = r3.A00;
            r3.A00 = i + 1;
            bArr[i] = b;
            r3.A01++;
            return;
        }
        C130296bj r32 = (C130296bj) this;
        try {
            byte[] bArr2 = r32.A02;
            int i2 = r32.A00;
            r32.A00 = i2 + 1;
            bArr2[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, r32.A00);
            throw new AnonymousClass6u9(AnonymousClass6C7.A0g(r32.A01, A1X), e);
        }
    }

    public void A06(int i) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(4);
            r1.A0M(i);
            return;
        }
        C130296bj r4 = (C130296bj) this;
        try {
            byte[] bArr = r4.A02;
            int i2 = r4.A00;
            int i3 = i2 + 1;
            AnonymousClass6C9.A1G(bArr, i, i2);
            int i4 = i3 + 1;
            AnonymousClass6C9.A1G(bArr, i >> 8, i3);
            int i5 = i4 + 1;
            AnonymousClass6C9.A1G(bArr, i >> 16, i4);
            r4.A00 = i5 + 1;
            AnonymousClass6C9.A1G(bArr, i >> 24, i5);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, r4.A00);
            throw new AnonymousClass6u9(AnonymousClass6C7.A0g(r4.A01, A1X), e);
        }
    }

    public void A07(int i) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(5);
            r1.A0N(i);
            return;
        }
        C130296bj r3 = (C130296bj) this;
        while ((i & -128) != 0) {
            try {
                byte[] bArr = r3.A02;
                int i2 = r3.A00;
                r3.A00 = i2 + 1;
                AnonymousClass6C9.A1H(bArr, i, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1X = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X, r3.A00);
                throw new AnonymousClass6u9(AnonymousClass6C7.A0g(r3.A01, A1X), e);
            }
        }
        byte[] bArr2 = r3.A02;
        int i3 = r3.A00;
        r3.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public void A08(int i, int i2) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(14);
            r1.A0N((i << 3) | 5);
            r1.A0M(i2);
            return;
        }
        A07((i << 3) | 5);
        A06(i2);
    }

    public void A09(int i, int i2) {
        if (this instanceof C130306bk) {
            C130306bk r2 = (C130306bk) this;
            r2.A0O(20);
            r2.A0N(i << 3);
            if (i2 >= 0) {
                r2.A0N(i2);
            } else {
                r2.A0Q((long) i2);
            }
        } else {
            A07(i << 3);
            if (i2 >= 0) {
                A07(i2);
            } else {
                A0F((long) i2);
            }
        }
    }

    public void A0A(int i, int i2) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(20);
            r1.A0N(i << 3);
            r1.A0N(i2);
            return;
        }
        A07(i << 3);
        A07(i2);
    }

    public void A0B(int i, long j) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(18);
            r1.A0N((i << 3) | 1);
            r1.A0P(j);
            return;
        }
        A07((i << 3) | 1);
        A0E(j);
    }

    public void A0C(int i, long j) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(20);
            r1.A0N(i << 3);
            r1.A0Q(j);
            return;
        }
        A07(i << 3);
        A0F(j);
    }

    public void A0D(int i, boolean z) {
        if (this instanceof C130306bk) {
            C130306bk r4 = (C130306bk) this;
            r4.A0O(11);
            r4.A0N(i << 3);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = r4.A04;
            int i2 = r4.A00;
            r4.A00 = i2 + 1;
            bArr[i2] = b;
            r4.A01++;
            return;
        }
        A07(i << 3);
        A05(z ? (byte) 1 : 0);
    }

    public void A0E(long j) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(8);
            r1.A0P(j);
            return;
        }
        C130296bj r3 = (C130296bj) this;
        try {
            byte[] bArr = r3.A02;
            int i = r3.A00;
            int i2 = i + 1;
            AnonymousClass6C9.A1G(bArr, (int) j, i);
            int i3 = i2 + 1;
            C130306bk.A00(j, bArr, 8, i2);
            int i4 = i3 + 1;
            C130306bk.A00(j, bArr, 16, i3);
            int i5 = i4 + 1;
            C130306bk.A00(j, bArr, 24, i4);
            int i6 = i5 + 1;
            C130306bk.A00(j, bArr, 32, i5);
            int i7 = i6 + 1;
            C130306bk.A00(j, bArr, 40, i6);
            int i8 = i7 + 1;
            C130306bk.A00(j, bArr, 48, i7);
            r3.A00 = i8 + 1;
            C130306bk.A00(j, bArr, 56, i8);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A1L(A1X, r3.A00);
            throw new AnonymousClass6u9(AnonymousClass6C7.A0g(r3.A01, A1X), e);
        }
    }

    public void A0F(long j) {
        if (this instanceof C130306bk) {
            C130306bk r1 = (C130306bk) this;
            r1.A0O(10);
            r1.A0Q(j);
            return;
        }
        C130296bj r3 = (C130296bj) this;
        if (!A02 || r3.A01 - r3.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = r3.A02;
                    int i = r3.A00;
                    r3.A00 = i + 1;
                    AnonymousClass6C9.A1H(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1X = AnonymousClass0x9.A1X();
                    AnonymousClass000.A1L(A1X, r3.A00);
                    throw new AnonymousClass6u9(AnonymousClass6C7.A0g(r3.A01, A1X), e);
                }
            }
            byte[] bArr2 = r3.A02;
            int i2 = r3.A00;
            r3.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = r3.A02;
            int i4 = r3.A00;
            r3.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                UnsafeUtil.A07(bArr3, (byte) i5, j2);
                return;
            } else {
                UnsafeUtil.A07(bArr3, (byte) ((i5 & 127) | 128), j2);
                j >>>= 7;
            }
        }
    }

    public final void A0I(C143986zo r4, String str) {
        A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r4);
        byte[] bytes = str.getBytes(C155647fF.A04);
        try {
            int length = bytes.length;
            A07(length);
            A0K(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new AnonymousClass6u9(e);
        }
    }

    public void A0J(String str) {
        int A002;
        int i;
        int i2;
        int i3;
        if (this instanceof C130306bk) {
            C130306bk r4 = (C130306bk) this;
            try {
                int length = str.length();
                int i4 = length * 3;
                int A003 = AnonymousClass6C7.A00(i4);
                int i5 = A003 + i4;
                int i6 = r4.A02;
                if (i5 > i6) {
                    byte[] bArr = new byte[i4];
                    int A004 = C159717mL.A00.A00(str, bArr, 0, i4);
                    r4.A07(A004);
                    r4.A0K(bArr, 0, A004);
                    return;
                }
                if (i5 > i6 - r4.A00) {
                    r4.A0L();
                }
                int A005 = AnonymousClass6C7.A00(length);
                i = r4.A00;
                if (A005 == A003) {
                    int i7 = i + A005;
                    r4.A00 = i7;
                    i3 = C159717mL.A00.A00(str, r4.A04, i7, i6 - i7);
                    r4.A00 = i;
                    i2 = (i3 - i) - A005;
                    r4.A0N(i2);
                } else {
                    i2 = C159717mL.A00(str);
                    r4.A0N(i2);
                    i3 = C159717mL.A00.A00(str, r4.A04, r4.A00, i2);
                }
                r4.A00 = i3;
                r4.A01 += i2;
            } catch (C143986zo e) {
                r4.A01 -= r4.A00 - i;
                r4.A00 = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new AnonymousClass6u9(e2);
            } catch (C143986zo e3) {
                r4.A0I(e3, str);
            }
        } else {
            C130296bj r5 = (C130296bj) this;
            int i8 = r5.A00;
            try {
                int length2 = str.length();
                int A006 = AnonymousClass6C7.A00(length2 * 3);
                int A007 = AnonymousClass6C7.A00(length2);
                if (A007 == A006) {
                    int i9 = i8 + A007;
                    r5.A00 = i9;
                    A002 = C159717mL.A00.A00(str, r5.A02, i9, r5.A01 - i9);
                    r5.A00 = i8;
                    r5.A07((A002 - i8) - A007);
                } else {
                    r5.A07(C159717mL.A00(str));
                    byte[] bArr2 = r5.A02;
                    int i10 = r5.A00;
                    A002 = C159717mL.A00.A00(str, bArr2, i10, r5.A01 - i10);
                }
                r5.A00 = A002;
            } catch (C143986zo e4) {
                r5.A00 = i8;
                r5.A0I(e4, str);
            } catch (IndexOutOfBoundsException e5) {
                throw new AnonymousClass6u9(e5);
            }
        }
    }

    public void A0K(byte[] bArr, int i, int i2) {
        if (this instanceof C130306bk) {
            ((C130306bk) this).A0R(bArr, i, i2);
        } else {
            ((C130296bj) this).A0L(bArr, i, i2);
        }
    }

    public static int A01(int i) {
        return AnonymousClass6C7.A00(i);
    }

    public static int A03(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = C159717mL.A00(str);
            str2 = A002;
            i = A002;
        } catch (C143986zo unused) {
            i = str2.getBytes(C155647fF.A04).length;
        }
        return AnonymousClass6C7.A00(i) + i;
    }

    public void A0G(C172548Lq r4) {
        A07(r4.A03());
        C130256bf r42 = (C130256bf) r4;
        A0K(r42.bytes, r42.A08(), r42.A03());
    }

    public void A0H(C187928y2 r2, C186358vA r3, int i) {
        AnonymousClass730.A06(this, i);
        A07(((C170198Cg) r2).A0D(r3));
        r3.Bsk(this.A00, r2);
    }
}
