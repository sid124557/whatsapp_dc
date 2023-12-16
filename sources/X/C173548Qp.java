package X;

import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

/* renamed from: X.8Qp  reason: invalid class name and case insensitive filesystem */
public class C173548Qp implements C186318v6 {
    public C158947kq A00;

    public int B24(byte[] bArr, int i) {
        C177168eB r2;
        int i2;
        C177168eB r22;
        Throwable th;
        byte[] bArr2;
        int i3;
        try {
            C158947kq r23 = this.A00;
            if (r23 instanceof C177168eB) {
                C177168eB r24 = (C177168eB) r23;
                C185768uD r4 = r24.A01;
                int B4g = r4.B4g();
                boolean z = r24.A02;
                int i4 = r24.A00;
                if (z) {
                    if (i4 != B4g) {
                        i3 = 0;
                    } else if ((B4g * 2) + i <= bArr.length) {
                        i3 = r4.Bha(r24.A05, bArr, 0, i);
                        r24.A00 = 0;
                        i4 = 0;
                    } else {
                        r24.A01();
                        th = C177198eE.A00();
                        throw th;
                    }
                    r24.A00.Awh(r24.A05, i4);
                    i2 = i3 + r24.A01.Bha(r24.A05, bArr, 0, i + i3);
                    r22 = r24;
                } else if (i4 == B4g) {
                    byte[] bArr3 = r24.A05;
                    int Bha = r4.Bha(bArr3, bArr3, 0, 0);
                    r24.A00 = 0;
                    try {
                        r2 = r24;
                        i2 = Bha - r24.A00.BgR(r24.A05);
                        System.arraycopy(r24.A05, 0, bArr, i, i2);
                        r2 = r24;
                        r22 = r24;
                    } catch (Throwable th2) {
                        th = th2;
                        r2.A01();
                    }
                } else {
                    r24.A01();
                    th = new C177248eJ("last block incomplete in decryption");
                    throw th;
                }
            } else if (r23 instanceof C177158eA) {
                int i5 = r23.A00;
                if (i5 + i <= bArr.length) {
                    C185768uD r3 = r23.A01;
                    int B4g2 = r3.B4g();
                    int i6 = i5 - B4g2;
                    byte[] bArr4 = new byte[B4g2];
                    if (r23.A02) {
                        if (i5 >= B4g2) {
                            r3.Bha(r23.A05, bArr4, 0, 0);
                            int i7 = r23.A00;
                            int i8 = i7;
                            if (i7 > B4g2) {
                                while (true) {
                                    bArr2 = r23.A05;
                                    if (i7 == bArr2.length) {
                                        break;
                                    }
                                    AnonymousClass6CA.A0g(bArr4, bArr2, i7 - B4g2, i7);
                                    i7++;
                                }
                                for (int i9 = B4g2; i9 != i8; i9++) {
                                    AnonymousClass6C7.A1T(bArr4, bArr2, i9 - B4g2, bArr2[i9], i9);
                                }
                                C185768uD r1 = r23.A01;
                                if (r1 instanceof AnonymousClass8QA) {
                                    ((AnonymousClass8QA) r1).A01.Bha(bArr2, bArr, B4g2, i);
                                } else {
                                    r1.Bha(bArr2, bArr, B4g2, i);
                                }
                                System.arraycopy(bArr4, 0, bArr, i + B4g2, i6);
                                i2 = r23.A00;
                                r22 = r23;
                            }
                        } else {
                            th = new C177248eJ("need at least one block of input for CTS");
                        }
                    } else if (i5 >= B4g2) {
                        byte[] bArr5 = new byte[B4g2];
                        if (i5 > B4g2) {
                            if (r3 instanceof AnonymousClass8QA) {
                                r3 = ((AnonymousClass8QA) r3).A01;
                            }
                            r3.Bha(r23.A05, bArr4, 0, 0);
                            for (int i10 = B4g2; i10 != r23.A00; i10++) {
                                int i11 = i10 - B4g2;
                                AnonymousClass6C7.A1T(r23.A05, bArr5, i10, bArr4[i11], i11);
                            }
                            System.arraycopy(r23.A05, B4g2, bArr4, 0, i6);
                            r23.A01.Bha(bArr4, bArr, 0, i);
                            System.arraycopy(bArr5, 0, bArr, i + B4g2, i6);
                            i2 = r23.A00;
                            r22 = r23;
                        } else {
                            r3.Bha(r23.A05, bArr4, 0, 0);
                        }
                    } else {
                        th = new C177248eJ("need at least one block of input for CTS");
                    }
                    System.arraycopy(bArr4, 0, bArr, i, B4g2);
                    i2 = r23.A00;
                    r22 = r23;
                } else {
                    th = new C177198eE("output buffer to small in doFinal");
                }
                throw th;
            } else {
                r2 = r23;
                int i12 = r23.A00;
                if (i + i12 <= bArr.length) {
                    i2 = 0;
                    r22 = r23;
                    if (i12 != 0) {
                        if (r23.A03) {
                            C185768uD r12 = r23.A01;
                            byte[] bArr6 = r23.A05;
                            r12.Bha(bArr6, bArr6, 0, 0);
                            int i13 = r23.A00;
                            r23.A00 = 0;
                            System.arraycopy(r23.A05, 0, bArr, i, i13);
                            i2 = i13;
                            r22 = r23;
                        } else {
                            th = new C177248eJ("data not block size aligned");
                        }
                    }
                } else {
                    r2 = r23;
                    th = new C177198eE("output buffer too short for doFinal()");
                }
                throw th;
            }
            r22.A01();
            return i2;
        } catch (C177188eD e) {
            throw new BadPaddingException(e.getMessage());
        }
    }

    public String B4N() {
        return this.A00.A01.B4N();
    }

    public int BAJ(int i) {
        C158947kq r2 = this.A00;
        boolean z = r2 instanceof C177168eB;
        int i2 = i + r2.A00;
        if (!z) {
            return i2;
        }
        int length = r2.A05.length;
        int i3 = i2 % length;
        if (i3 != 0) {
            i2 -= i3;
        } else if (!r2.A02) {
            return i2;
        }
        return i2 + length;
    }

    public C185768uD BE1() {
        return this.A00.A01;
    }

    public int BE4(int i) {
        return this.A00.A00(i);
    }

    public void BFw(C834748n r4, boolean z) {
        C177168eB r2;
        C185768uD r0;
        C158947kq r22 = this.A00;
        if (r22 instanceof C177168eB) {
            C177168eB r23 = (C177168eB) r22;
            r23.A02 = z;
            r23.A01();
            if (r4 instanceof AnonymousClass8QJ) {
                AnonymousClass8QJ r42 = (AnonymousClass8QJ) r4;
                r23.A00.BFt(r42.A00);
                r0 = r23.A01;
                r4 = r42.A01;
            } else {
                r23.A00.BFt((SecureRandom) null);
                r2 = r23;
                r0 = r2.A01;
            }
        } else {
            r22.A02 = z;
            r22.A01();
            r2 = r22;
            r0 = r2.A01;
        }
        r0.BFw(r4, z);
    }

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] bArr3;
        int i5;
        C158947kq r4 = this.A00;
        if (r4 instanceof C177168eB) {
            if (i2 >= 0) {
                int B4g = r4.A01.B4g();
                int A002 = r4.A00(i2);
                if (A002 <= 0 || A002 + i3 <= bArr2.length) {
                    bArr3 = r4.A05;
                    int length = bArr3.length;
                    int i6 = r4.A00;
                    int i7 = length - i6;
                    i4 = 0;
                    if (i2 > i7) {
                        System.arraycopy(bArr, i, bArr3, i6, i7);
                        int Bha = r4.A01.Bha(r4.A05, bArr2, 0, i3);
                        r4.A00 = 0;
                        i2 -= i7;
                        i += i7;
                        i4 = Bha;
                        while (true) {
                            bArr3 = r4.A05;
                            if (i2 <= bArr3.length) {
                                break;
                            }
                            i4 += r4.A01.Bha(bArr, bArr2, i, i3 + i4);
                            i2 -= B4g;
                            i += B4g;
                        }
                    }
                } else {
                    throw C177198eE.A00();
                }
            } else {
                throw AnonymousClass001.A0c("Can't have a negative input length!");
            }
        } else if (r4 instanceof C177158eA) {
            if (i2 >= 0) {
                int B4g2 = r4.A01.B4g();
                int A003 = r4.A00(i2);
                if (A003 <= 0 || A003 + i3 <= bArr2.length) {
                    byte[] bArr4 = r4.A05;
                    int length2 = bArr4.length;
                    int i8 = r4.A00;
                    int i9 = length2 - i8;
                    int i10 = 0;
                    if (i2 > i9) {
                        System.arraycopy(bArr, i, bArr4, i8, i9);
                        int Bha2 = r4.A01.Bha(r4.A05, bArr2, 0, i3);
                        byte[] bArr5 = r4.A05;
                        System.arraycopy(bArr5, B4g2, bArr5, 0, B4g2);
                        r4.A00 = B4g2;
                        r10 = i2 - i9;
                        r9 = i + i9;
                        while (i2 > B4g2) {
                            System.arraycopy(bArr, i, r4.A05, r4.A00, B4g2);
                            Bha2 += r4.A01.Bha(r4.A05, bArr2, 0, i3 + Bha2);
                            byte[] bArr6 = r4.A05;
                            System.arraycopy(bArr6, B4g2, bArr6, 0, B4g2);
                            r10 = i2 - B4g2;
                            r9 = i + B4g2;
                        }
                        i10 = Bha2;
                    }
                    bArr3 = r4.A05;
                } else {
                    throw C177198eE.A00();
                }
            } else {
                throw AnonymousClass001.A0c("Can't have a negative input length!");
            }
        } else if (i2 >= 0) {
            int B4g3 = r4.A01.B4g();
            int A004 = r4.A00(i2);
            if (A004 <= 0 || A004 + i3 <= bArr2.length) {
                byte[] bArr7 = r4.A05;
                int length3 = bArr7.length;
                int i11 = r4.A00;
                int i12 = length3 - i11;
                if (i2 > i12) {
                    System.arraycopy(bArr, i, bArr7, i11, i12);
                    i5 = r4.A01.Bha(r4.A05, bArr2, 0, i3);
                    r4.A00 = 0;
                    r10 = i2 - i12;
                    r9 = i + i12;
                    while (true) {
                        bArr7 = r4.A05;
                        if (i2 <= bArr7.length) {
                            break;
                        }
                        i5 += r4.A01.Bha(bArr, bArr2, i, i3 + i5);
                        r10 = i2 - B4g3;
                        r9 = i + B4g3;
                    }
                } else {
                    i5 = 0;
                }
                System.arraycopy(bArr, i, bArr7, r4.A00, i2);
                int i13 = r4.A00 + i2;
                r4.A00 = i13;
                byte[] bArr8 = r4.A05;
                if (i13 == bArr8.length) {
                    int Bha3 = i4 + r4.A01.Bha(bArr8, bArr2, 0, i3 + i4);
                    r4.A00 = 0;
                    return Bha3;
                }
                return i4;
            }
            throw C177198eE.A00();
        } else {
            throw AnonymousClass001.A0c("Can't have a negative input length!");
        }
        System.arraycopy(bArr, i, bArr3, r4.A00, i2);
        r4.A00 += i2;
        return i4;
    }

    public void BrY(byte[] bArr, int i, int i2) {
        throw AnonymousClass002.A0G("AAD is not supported in the current mode.");
    }

    public boolean BsZ() {
        return !(this.A00 instanceof C177158eA);
    }

    public C173548Qp(C185768uD r2, C185188tE r3) {
        this.A00 = new C177168eB(r2, r3);
    }

    public C173548Qp(C185768uD r3) {
        this.A00 = new C177168eB(r3, new C173458Qg());
    }

    public C173548Qp(C158947kq r1) {
        this.A00 = r1;
    }
}
