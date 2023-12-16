package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.86X  reason: invalid class name */
public final class AnonymousClass86X implements C185328tT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C187028wK A05;
    public C161727qK A06;
    public C185598tw A07;
    public C126526Oh A08;
    public C166547ys A09;
    public final AnonymousClass7BF A0A;
    public final C161467pi A0B;
    public final byte[] A0C;

    public void Bkz(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.A03 = 0;
        } else {
            C126526Oh r0 = this.A08;
            if (r0 != null) {
                r0.A01(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.A04 = j3;
        this.A00 = 0;
        this.A0B.A0Q(0);
    }

    public final void A00() {
        this.A07.Bkh((AnonymousClass7WZ) null, 1, this.A00, 0, (this.A04 * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A06.A07));
    }

    public void BFs(C187028wK r3) {
        this.A05 = r3;
        this.A07 = r3.Br0(0, 1);
        r3.B2W();
    }

    public int BiD(C187648xa r30, AnonymousClass7BG r31) {
        int i;
        boolean A0D;
        C166547ys r14;
        C184868sg A002;
        boolean z;
        boolean z2;
        long j;
        int BgZ;
        int i2 = this.A03;
        C187648xa r5 = r30;
        if (i2 != 0) {
            if (i2 == 1) {
                byte[] bArr = this.A0C;
                r5.Bgd(bArr, 0, bArr.length);
                r5.Bjy();
                i = 2;
            } else if (i2 == 2) {
                C161467pi A052 = C161467pi.A05(4);
                r5.readFully(A052.A02, 0, 4);
                if (A052.A0I() == 1716281667) {
                    i = 3;
                } else {
                    throw AnonymousClass6u7.A01("Failed to read FLAC stream marker.");
                }
            } else if (i2 == 3) {
                C161727qK r6 = this.A06;
                do {
                    r5.Bjy();
                    C160807oL r7 = new C160807oL(new byte[4], 4);
                    r5.Bgd(r7.A03, 0, 4);
                    A0D = r7.A0D();
                    int A042 = r7.A04(7);
                    int A043 = r7.A04(24) + 4;
                    if (A042 == 0) {
                        byte[] bArr2 = new byte[38];
                        r5.readFully(bArr2, 0, 38);
                        r6 = new C161727qK(bArr2, 4);
                    } else if (r6 == null) {
                        throw AnonymousClass6CA.A0N();
                    } else if (A042 == 3) {
                        C161467pi A053 = C161467pi.A05(A043);
                        r5.readFully(A053.A02, 0, A043);
                        r6 = r6.A04(AnonymousClass729.A00(A053));
                    } else {
                        if (A042 == 4) {
                            C161467pi A054 = C161467pi.A05(A043);
                            r5.readFully(A054.A02, 0, A043);
                            A054.A0T(4);
                            A054.A0O((int) A054.A0G());
                            long A0G = A054.A0G();
                            String[] strArr = new String[((int) A0G)];
                            for (int i3 = 0; ((long) i3) < A0G; i3++) {
                                strArr[i3] = A054.A0O((int) A054.A0G());
                            }
                            r14 = C161727qK.A01(Arrays.asList(new AnonymousClass7BH(strArr).A00), Collections.emptyList());
                        } else if (A042 == 6) {
                            C161467pi A055 = C161467pi.A05(A043);
                            r5.readFully(A055.A02, 0, A043);
                            A055.A0T(4);
                            int A072 = A055.A07();
                            int A073 = A055.A07();
                            String A0W = AnonymousClass6CA.A0W(AnonymousClass79T.A01, A055.A02, A055.A01, A073);
                            A055.A01 += A073;
                            String A0O = A055.A0O(A055.A07());
                            int A074 = A055.A07();
                            int A075 = A055.A07();
                            int A076 = A055.A07();
                            int A077 = A055.A07();
                            int A078 = A055.A07();
                            byte[] bArr3 = new byte[A078];
                            A055.A0V(bArr3, 0, A078);
                            r14 = C161727qK.A01(Collections.emptyList(), Collections.singletonList(new C1689187g(A0W, A0O, bArr3, A072, A074, A075, A076, A077)));
                        } else {
                            r5.BpP(A043);
                        }
                        C166547ys r2 = r6.A0B;
                        if (r2 != null) {
                            r14 = r2.A00(r14);
                        }
                        r6 = new C161727qK(r6.A0A, r14, r6.A05, r6.A03, r6.A06, r6.A04, r6.A07, r6.A02, r6.A00, r6.A09);
                    }
                    this.A06 = r6;
                } while (!A0D);
                this.A02 = Math.max(r6.A06, 6);
                this.A07.B3T(r6.A03(this.A09, this.A0C));
                this.A03 = 4;
                return 0;
            } else if (i2 != 4) {
                this.A07.getClass();
                this.A06.getClass();
                C126526Oh r3 = this.A08;
                if (r3 != null && r3.A00 != null) {
                    return r3.A00(r5, r31);
                }
                if (this.A04 == -1) {
                    C161727qK r9 = this.A06;
                    r5.Bjy();
                    boolean z3 = true;
                    r5.Awu(1);
                    byte[] bArr4 = new byte[1];
                    r5.Bgd(bArr4, 0, 1);
                    if ((bArr4[0] & 1) != 1) {
                        z3 = false;
                    }
                    r5.Awu(2);
                    int i4 = 6;
                    if (z3) {
                        i4 = 7;
                    }
                    C161467pi A056 = C161467pi.A05(i4);
                    byte[] bArr5 = A056.A02;
                    int i5 = 0;
                    do {
                        BgZ = r5.BgZ(bArr5, i5, i4 - i5);
                        if (BgZ == -1 || (i5 = i5 + BgZ) >= i4) {
                            A056.A0R(i5);
                            r5.Bjy();
                        }
                        BgZ = r5.BgZ(bArr5, i5, i4 - i5);
                        break;
                    } while ((i5 = i5 + BgZ) >= i4);
                    A056.A0R(i5);
                    r5.Bjy();
                    try {
                        long A0K = A056.A0K();
                        if (!z3) {
                            A0K *= (long) r9.A03;
                        }
                        this.A04 = A0K;
                        return 0;
                    } catch (NumberFormatException unused) {
                        throw new AnonymousClass6u7();
                    }
                } else {
                    C161467pi r62 = this.A0B;
                    int i6 = r62.A00;
                    if (i6 < 32768) {
                        int read = r5.read(r62.A02, i6, 32768 - i6);
                        if (read == -1) {
                            z = true;
                            if (C161467pi.A00(r62) == 0) {
                                A00();
                                return -1;
                            }
                        } else {
                            z = false;
                            r62.A0R(i6 + read);
                        }
                    } else {
                        z = false;
                    }
                    int i7 = r62.A01;
                    int i8 = this.A00;
                    int i9 = this.A02;
                    if (i8 < i9) {
                        r62.A0T(AnonymousClass6C9.A0A(r62.A00, i7, i9 - i8));
                    }
                    this.A06.getClass();
                    int i10 = r62.A01;
                    while (true) {
                        int i11 = r62.A00;
                        if (i10 <= i11 - 16) {
                            r62.A0S(i10);
                            C161727qK r4 = this.A06;
                            int i12 = this.A01;
                            AnonymousClass7BF r32 = this.A0A;
                            if (C153997cP.A01(r32, r4, r62, i12)) {
                                r62.A0S(i10);
                                j = r32.A00;
                                break;
                            }
                            i10++;
                        } else {
                            if (!z) {
                                r62.A0S(i10);
                            } else {
                                while (i10 <= i11 - this.A02) {
                                    r62.A0S(i10);
                                    try {
                                        z2 = C153997cP.A01(this.A0A, this.A06, r62, this.A01);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        z2 = false;
                                    }
                                    int i13 = r62.A01;
                                    i11 = r62.A00;
                                    if (i13 <= i11 && z2) {
                                        r62.A0S(i10);
                                        j = this.A0A.A00;
                                        break;
                                    }
                                    i10++;
                                }
                                r62.A0S(i11);
                            }
                            j = -1;
                        }
                    }
                    int i14 = r62.A01 - i7;
                    r62.A0S(i7);
                    this.A07.Bkc(r62, i14);
                    this.A00 += i14;
                    if (j != -1) {
                        A00();
                        this.A00 = 0;
                        this.A04 = j;
                    }
                    int i15 = r62.A00;
                    int i16 = r62.A01;
                    int i17 = i15 - i16;
                    if (i17 >= 16) {
                        return 0;
                    }
                    byte[] bArr6 = r62.A02;
                    System.arraycopy(bArr6, i16, bArr6, 0, i17);
                    r62.A0S(0);
                    r62.A0R(i17);
                    return 0;
                }
            } else {
                r5.Bjy();
                C161467pi A057 = C161467pi.A05(2);
                C161467pi.A06(r5, A057, 2);
                int A0F = A057.A0F();
                if ((A0F >> 2) == 16382) {
                    r5.Bjy();
                    this.A01 = A0F;
                    C187028wK r63 = this.A05;
                    long BBW = r5.BBW();
                    long length = r5.getLength();
                    this.A06.getClass();
                    C161727qK r92 = this.A06;
                    if (r92.A0A != null) {
                        A002 = new C1686886j(r92, BBW);
                    } else if (length == -1 || r92.A09 <= 0) {
                        A002 = C1686986k.A00(r92.A02());
                    } else {
                        C126526Oh r8 = new C126526Oh(r92, this.A01, BBW, length);
                        this.A08 = r8;
                        A002 = r8.A02;
                    }
                    r63.Bl0(A002);
                    i = 5;
                } else {
                    r5.Bjy();
                    throw AnonymousClass6u7.A01("First frame does not start with sync code.");
                }
            }
            this.A03 = i;
            return 0;
        }
        r5.Bjy();
        long BBF = r5.BBF();
        C166547ys r64 = null;
        C166547ys A003 = new AnonymousClass7RJ().A00(r5, (C180708lV) null);
        if (!(A003 == null || A003.A00.length == 0)) {
            r64 = A003;
        }
        r5.BpP((int) (r5.BBF() - BBF));
        this.A09 = r64;
        this.A03 = 1;
        return 0;
    }

    public boolean BpS(C187648xa r7) {
        new AnonymousClass7RJ().A00(r7, AnonymousClass6P1.A01);
        C161467pi A052 = C161467pi.A05(4);
        r7.Bgd(A052.A02, 0, 4);
        if (A052.A0I() == 1716281667) {
            return true;
        }
        return false;
    }

    public AnonymousClass86X(int i) {
        this.A0C = new byte[42];
        this.A0B = new C161467pi(new byte[32768], 0);
        this.A0A = new AnonymousClass7BF();
        this.A03 = 0;
    }

    public AnonymousClass86X() {
        this(0);
    }
}
