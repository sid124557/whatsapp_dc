package X;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.6Vs  reason: invalid class name and case insensitive filesystem */
public abstract class C128346Vs extends C150347Qg {
    public static final Logger A01 = AnonymousClass6C8.A0m(C128346Vs.class);
    public static final boolean A02 = C162337rj.A06;
    public C169658Ad A00;

    public static int A01(long j) {
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

    public void A02(byte b) {
        if (this instanceof C128336Vr) {
            C128336Vr r2 = (C128336Vr) this;
            long j = r2.A00;
            long j2 = r2.A02;
            if (j < j2) {
                r2.A00 = 1 + j;
                C162337rj.A02.A07(j, b);
                return;
            }
            Object[] A1X = AnonymousClass0x9.A1X();
            C18280x3.A1S(A1X, j);
            A1X[1] = Long.valueOf(j2);
            AnonymousClass000.A1P(A1X, 1, 2);
            throw new C140606uB(String.format("Pos: %d, limit: %d, len: %d", A1X));
        } else if (this instanceof C128316Vp) {
            try {
                ((C128316Vp) this).A01.put(b);
            } catch (BufferOverflowException e) {
                throw new C140606uB((Throwable) e);
            }
        } else {
            C128326Vq r3 = (C128326Vq) this;
            try {
                byte[] bArr = r3.A03;
                int i = r3.A00;
                r3.A00 = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1X2 = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X2, r3.A00);
                throw new C140606uB(AnonymousClass6C7.A0g(r3.A01, A1X2), e2);
            }
        }
    }

    public void A03(int i) {
        long j;
        if (this instanceof C128336Vr) {
            C128336Vr r2 = (C128336Vr) this;
            if (r2.A00 <= r2.A03) {
                while (true) {
                    int i2 = i & -128;
                    j = r2.A00;
                    if (i2 == 0) {
                        break;
                    }
                    r2.A00 = j + 1;
                    C162337rj.A02.A07(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    j = r2.A00;
                    long j2 = r2.A02;
                    if (j < j2) {
                        if ((i & -128) == 0) {
                            break;
                        }
                        r2.A00 = j + 1;
                        C162337rj.A02.A07(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    } else {
                        Object[] A1X = AnonymousClass0x9.A1X();
                        C18280x3.A1S(A1X, j);
                        A1X[1] = Long.valueOf(j2);
                        AnonymousClass000.A1P(A1X, 1, 2);
                        throw new C140606uB(String.format("Pos: %d, limit: %d, len: %d", A1X));
                    }
                }
            }
            r2.A00 = 1 + j;
            C162337rj.A02.A07(j, (byte) i);
        } else if (this instanceof C128316Vp) {
            C128316Vp r22 = (C128316Vp) this;
            while ((i & -128) != 0) {
                try {
                    r22.A01.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C140606uB((Throwable) e);
                }
            }
            r22.A01.put((byte) i);
        } else {
            C128326Vq r3 = (C128326Vq) this;
            if (!A02 || r3.A01 - r3.A00 < 10) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = r3.A03;
                        int i3 = r3.A00;
                        r3.A00 = i3 + 1;
                        AnonymousClass6C9.A1H(bArr, i, i3);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1X2 = AnonymousClass0x9.A1X();
                        AnonymousClass000.A1L(A1X2, r3.A00);
                        throw new C140606uB(AnonymousClass6C7.A0g(r3.A01, A1X2), e2);
                    }
                }
                byte[] bArr2 = r3.A03;
                int i4 = r3.A00;
                r3.A00 = i4 + 1;
                bArr2[i4] = (byte) i;
                return;
            }
            while (true) {
                int i5 = i & -128;
                byte[] bArr3 = r3.A03;
                int i6 = r3.A00;
                r3.A00 = i6 + 1;
                long j3 = (long) i6;
                if (i5 == 0) {
                    C162337rj.A06(bArr3, (byte) i, j3);
                    return;
                } else {
                    C162337rj.A06(bArr3, (byte) ((i & 127) | 128), j3);
                    i >>>= 7;
                }
            }
        }
    }

    public void A04(int i) {
        if (this instanceof C128336Vr) {
            C128336Vr r5 = (C128336Vr) this;
            r5.A05.putInt((int) (r5.A00 - r5.A01), i);
            r5.A00 += 4;
        } else if (this instanceof C128316Vp) {
            try {
                ((C128316Vp) this).A01.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C140606uB((Throwable) e);
            }
        } else {
            C128326Vq r3 = (C128326Vq) this;
            try {
                byte[] bArr = r3.A03;
                int A0D = AnonymousClass6C7.A0D(bArr, r3.A00, i);
                r3.A00 = A0D + 1;
                bArr[A0D] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1X = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X, r3.A00);
                throw new C140606uB(AnonymousClass6C7.A0g(r3.A01, A1X), e2);
            }
        }
    }

    public void A05(int i, int i2) {
        A03(i << 3);
        if (i2 >= 0) {
            A03(i2);
        } else {
            A09((long) i2);
        }
    }

    public void A06(int i, int i2) {
        A03((i << 3) | 5);
        A04(i2);
    }

    public void A07(int i, long j) {
        A03((i << 3) | 1);
        A0A(j);
    }

    public void A08(int i, String str) {
        int A002;
        C140606uB r1;
        long j;
        long j2;
        if (this instanceof C128336Vr) {
            C128336Vr r7 = (C128336Vr) this;
            C150347Qg.A05(r7, i);
            long j3 = r7.A00;
            try {
                int length = str.length();
                int A003 = AnonymousClass6C7.A00(length * 3);
                int A004 = AnonymousClass6C7.A00(length);
                if (A004 == A003) {
                    int i2 = ((int) (j3 - r7.A01)) + A004;
                    ByteBuffer byteBuffer = r7.A05;
                    byteBuffer.position(i2);
                    C161077ox.A01(str, byteBuffer);
                    int position = byteBuffer.position() - i2;
                    r7.A03(position);
                    j = r7.A00;
                    j2 = (long) position;
                } else {
                    int A005 = C161077ox.A00(str);
                    r7.A03(A005);
                    long j4 = r7.A00;
                    ByteBuffer byteBuffer2 = r7.A05;
                    byteBuffer2.position((int) (j4 - r7.A01));
                    C161077ox.A01(str, byteBuffer2);
                    j = r7.A00;
                    j2 = (long) A005;
                }
                r7.A00 = j + j2;
            } catch (C143966zm e) {
                r7.A00 = j3;
                r7.A05.position((int) (j3 - r7.A01));
                r7.A0D(e, str);
            } catch (IllegalArgumentException e2) {
                throw new C140606uB((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C140606uB((Throwable) e3);
            }
        } else if (this instanceof C128316Vp) {
            C128316Vp r3 = (C128316Vp) this;
            C150347Qg.A05(r3, i);
            ByteBuffer byteBuffer3 = r3.A01;
            int position2 = byteBuffer3.position();
            try {
                int length2 = str.length();
                int A006 = AnonymousClass6C7.A00(length2 * 3);
                int A007 = AnonymousClass6C7.A00(length2);
                if (A007 == A006) {
                    int position3 = byteBuffer3.position() + A007;
                    byteBuffer3.position(position3);
                    try {
                        C161077ox.A01(str, byteBuffer3);
                        int position4 = byteBuffer3.position();
                        byteBuffer3.position(position2);
                        r3.A03(position4 - position3);
                        byteBuffer3.position(position4);
                    } catch (IndexOutOfBoundsException e4) {
                        r1 = new C140606uB((Throwable) e4);
                        throw r1;
                    }
                } else {
                    r3.A03(C161077ox.A00(str));
                    try {
                        C161077ox.A01(str, byteBuffer3);
                    } catch (IndexOutOfBoundsException e5) {
                        r1 = new C140606uB((Throwable) e5);
                        throw r1;
                    }
                }
            } catch (C143966zm e6) {
                byteBuffer3.position(position2);
                r3.A0D(e6, str);
            } catch (IllegalArgumentException e7) {
                throw new C140606uB((Throwable) e7);
            }
        } else {
            C128326Vq r4 = (C128326Vq) this;
            C150347Qg.A05(r4, i);
            int i3 = r4.A00;
            try {
                int length3 = str.length();
                int A008 = AnonymousClass6C7.A00(length3 * 3);
                int A009 = AnonymousClass6C7.A00(length3);
                if (A009 == A008) {
                    int i4 = i3 + A009;
                    r4.A00 = i4;
                    A002 = C161077ox.A00.A00(str, r4.A03, i4, r4.A01 - i4);
                    r4.A00 = i3;
                    r4.A03((A002 - i3) - A009);
                } else {
                    r4.A03(C161077ox.A00(str));
                    byte[] bArr = r4.A03;
                    int i5 = r4.A00;
                    A002 = C161077ox.A00.A00(str, bArr, i5, r4.A01 - i5);
                }
                r4.A00 = A002;
            } catch (C143966zm e8) {
                r4.A00 = i3;
                r4.A0D(e8, str);
            } catch (IndexOutOfBoundsException e9) {
                throw new C140606uB((Throwable) e9);
            }
        }
    }

    public void A09(long j) {
        long j2;
        if (this instanceof C128336Vr) {
            C128336Vr r2 = (C128336Vr) this;
            if (r2.A00 <= r2.A03) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = r2.A00;
                    if (i == 0) {
                        break;
                    }
                    r2.A00 = j2 + 1;
                    C162337rj.A02.A07(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = r2.A00;
                    long j3 = r2.A02;
                    if (j2 < j3) {
                        if ((j & -128) == 0) {
                            break;
                        }
                        r2.A00 = j2 + 1;
                        C162337rj.A02.A07(j2, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    } else {
                        Object[] A1X = AnonymousClass0x9.A1X();
                        C18280x3.A1S(A1X, j2);
                        A1X[1] = Long.valueOf(j3);
                        AnonymousClass000.A1P(A1X, 1, 2);
                        throw new C140606uB(String.format("Pos: %d, limit: %d, len: %d", A1X));
                    }
                }
            }
            r2.A00 = 1 + j2;
            C162337rj.A02.A07(j2, (byte) ((int) j));
        } else if (this instanceof C128316Vp) {
            C128316Vp r5 = (C128316Vp) this;
            while ((-128 & j) != 0) {
                try {
                    r5.A01.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C140606uB((Throwable) e);
                }
            }
            r5.A01.put((byte) ((int) j));
        } else {
            C128326Vq r3 = (C128326Vq) this;
            if (!A02 || r3.A01 - r3.A00 < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = r3.A03;
                        int i2 = r3.A00;
                        r3.A00 = i2 + 1;
                        AnonymousClass6C9.A1H(bArr, (int) j, i2);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1X2 = AnonymousClass0x9.A1X();
                        AnonymousClass000.A1L(A1X2, r3.A00);
                        throw new C140606uB(AnonymousClass6C7.A0g(r3.A01, A1X2), e2);
                    }
                }
                byte[] bArr2 = r3.A03;
                int i3 = r3.A00;
                r3.A00 = i3 + 1;
                bArr2[i3] = (byte) ((int) j);
                return;
            }
            while (true) {
                int i4 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                byte[] bArr3 = r3.A03;
                int i5 = r3.A00;
                r3.A00 = i5 + 1;
                long j4 = (long) i5;
                int i6 = (int) j;
                if (i4 == 0) {
                    C162337rj.A06(bArr3, (byte) i6, j4);
                    return;
                } else {
                    C162337rj.A06(bArr3, (byte) ((i6 & 127) | 128), j4);
                    j >>>= 7;
                }
            }
        }
    }

    public void A0A(long j) {
        if (this instanceof C128336Vr) {
            C128336Vr r5 = (C128336Vr) this;
            r5.A05.putLong((int) (r5.A00 - r5.A01), j);
            r5.A00 += 8;
        } else if (this instanceof C128316Vp) {
            try {
                ((C128316Vp) this).A01.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C140606uB((Throwable) e);
            }
        } else {
            C128326Vq r3 = (C128326Vq) this;
            try {
                byte[] bArr = r3.A03;
                int i = r3.A00;
                int i2 = i + 1;
                int A0D = AnonymousClass6CA.A0D(bArr, (int) j, i, i2);
                AnonymousClass6C7.A0x(j, bArr, 8, i2);
                int i3 = A0D + 1;
                AnonymousClass6C7.A0x(j, bArr, 16, A0D);
                int i4 = i3 + 1;
                AnonymousClass6C7.A0x(j, bArr, 24, i3);
                int i5 = i4 + 1;
                AnonymousClass6C7.A0x(j, bArr, 32, i4);
                int i6 = i5 + 1;
                AnonymousClass6C7.A0x(j, bArr, 40, i5);
                int i7 = i6 + 1;
                AnonymousClass6C7.A0x(j, bArr, 48, i6);
                r3.A00 = i7 + 1;
                AnonymousClass6C7.A0x(j, bArr, 56, i7);
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1X = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X, r3.A00);
                throw new C140606uB(AnonymousClass6C7.A0g(r3.A01, A1X), e2);
            }
        }
    }

    public void A0B(C172528Lo r2, int i) {
        if (this instanceof C128336Vr) {
            C150347Qg.A05(this, i);
            A03(r2.A02());
            r2.A03(this);
            return;
        }
        C150347Qg.A05(this, i);
        A03(r2.A02());
        r2.A03(this);
    }

    public void A0C(C187818xr r2, C186258v0 r3, int i) {
        if (this instanceof C128336Vr) {
            C150347Qg.A05(this, i);
            A03(C128166Va.A00(r3, r2));
            r3.BtU(this.A00, r2);
            return;
        }
        C150347Qg.A05(this, i);
        A03(C128166Va.A00(r3, r2));
        r3.BtU(this.A00, r2);
    }

    public final void A0D(C143966zm r7, String str) {
        A01.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r7);
        byte[] bytes = str.getBytes(C155587f9.A03);
        try {
            int length = bytes.length;
            A03(length);
            A0E(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C140606uB((Throwable) e);
        } catch (C140606uB e2) {
            throw e2;
        }
    }

    public void A0E(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        if (this instanceof C128336Vr) {
            C128336Vr r2 = (C128336Vr) this;
            if (bArr != null) {
                if (i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                    long j = (long) i2;
                    long j2 = r2.A00;
                    if (r2.A02 - j >= j2) {
                        C162337rj.A02.A0E(bArr2, (long) i, j2, j);
                        r2.A00 += j;
                        return;
                    }
                }
                Object[] A1X = AnonymousClass0x9.A1X();
                C18280x3.A1S(A1X, r2.A00);
                AnonymousClass001.A1Q(A1X, r2.A02);
                AnonymousClass000.A1P(A1X, i2, 2);
                throw new C140606uB(String.format("Pos: %d, limit: %d, len: %d", A1X));
            }
            throw AnonymousClass001.A0g("value");
        } else if (this instanceof C128316Vp) {
            try {
                ((C128316Vp) this).A01.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C140606uB((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C140606uB((Throwable) e2);
            }
        } else {
            C128326Vq r3 = (C128326Vq) this;
            try {
                System.arraycopy(bArr, i, r3.A03, r3.A00, i2);
                r3.A00 += i2;
            } catch (IndexOutOfBoundsException e3) {
                Object[] A1X2 = AnonymousClass0x9.A1X();
                AnonymousClass000.A1L(A1X2, r3.A00);
                AnonymousClass000.A1M(A1X2, r3.A01);
                AnonymousClass000.A1P(A1X2, i2, 2);
                throw new C140606uB(String.format("Pos: %d, limit: %d, len: %d", A1X2), e3);
            }
        }
    }

    public static int A00(int i) {
        return AnonymousClass6C7.A00(i);
    }
}
