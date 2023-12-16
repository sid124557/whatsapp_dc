package X;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.87D  reason: invalid class name */
public final class AnonymousClass87D implements C185608tx {
    public static final byte[] A0L = {73, 68, 51};
    public int A00 = 0;
    public int A01;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = 256;
    public int A05;
    public int A06 = 0;
    public long A07;
    public long A08 = -9223372036854775807L;
    public long A09;
    public C185598tw A0A;
    public C185598tw A0B;
    public C185598tw A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C160807oL A0H = new C160807oL(new byte[7], 7);
    public final C161467pi A0I = new C161467pi(Arrays.copyOf(A0L, 10));
    public final String A0J;
    public final boolean A0K;

    public void Bky() {
        this.A0E = false;
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }

    public void AzY(C161467pi r15) {
        this.A0C.getClass();
        while (true) {
            int i = r15.A00;
            int i2 = r15.A01;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.A06;
                if (i4 != 0) {
                    if (i4 == 1) {
                        C160807oL r3 = this.A0H;
                        r3.A03[0] = r15.A02[i2];
                        r3.A08(2);
                        int A042 = r3.A04(4);
                        int i5 = this.A02;
                        if (i5 == -1 || A042 == i5) {
                            if (!this.A0E) {
                                this.A0E = true;
                                this.A03 = this.A01;
                                this.A02 = A042;
                            }
                            this.A06 = 3;
                            this.A00 = 0;
                        } else {
                            this.A0E = false;
                            this.A06 = 0;
                            this.A00 = 0;
                        }
                    } else if (i4 == 2) {
                        C161467pi r6 = this.A0I;
                        byte[] bArr = r6.A02;
                        int i6 = this.A00;
                        int A0A2 = AnonymousClass6C9.A0A(10, i6, i3);
                        r15.A0V(bArr, i6, A0A2);
                        int i7 = this.A00 + A0A2;
                        this.A00 = i7;
                        if (i7 == 10) {
                            this.A0B.Bkc(r6, 10);
                            r6.A0S(6);
                            C185598tw r4 = this.A0B;
                            this.A06 = 4;
                            this.A00 = 10;
                            this.A0A = r4;
                            this.A07 = 0;
                            this.A05 = r6.A0B() + 10;
                        }
                    } else if (i4 != 3) {
                        int A0A3 = AnonymousClass6C9.A0A(this.A05, this.A00, i3);
                        this.A0A.Bkc(r15, A0A3);
                        int i8 = this.A00 + A0A3;
                        this.A00 = i8;
                        int i9 = this.A05;
                        if (i8 == i9) {
                            this.A0A.Bkh((AnonymousClass7WZ) null, 1, i9, 0, this.A09);
                            this.A09 += this.A07;
                            this.A06 = 0;
                            this.A00 = 0;
                        }
                    } else {
                        int i10 = 5;
                        if (this.A0F) {
                            i10 = 7;
                        }
                        C160807oL r5 = this.A0H;
                        byte[] bArr2 = r5.A03;
                        int i11 = this.A00;
                        int A0A4 = AnonymousClass6C9.A0A(i10, i11, i3);
                        r15.A0V(bArr2, i11, A0A4);
                        int i12 = this.A00 + A0A4;
                        this.A00 = i12;
                        if (i12 == i10) {
                            r5.A08(0);
                            if (!this.A0G) {
                                int A043 = r5.A04(2) + 1;
                                if (A043 != 2) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Detected audio object type: ");
                                    A0o.append(A043);
                                    Log.w("AdtsReader", AnonymousClass000.A0X(", but assuming AAC LC.", A0o));
                                }
                                r5.A09(5);
                                int A044 = r5.A04(3);
                                int i13 = this.A02;
                                byte[] bArr3 = new byte[2];
                                bArr3[0] = (byte) (16 | ((i13 >> 1) & 7));
                                AnonymousClass6C8.A0u((i13 << 7) & 128, bArr3, (A044 << 3) & 120, 1);
                                AnonymousClass7JX A002 = C159817mV.A00(new C160807oL(bArr3, 2), false);
                                C157057he A003 = C157057he.A00();
                                A003.A0O = this.A0D;
                                A003.A0R = "audio/mp4a-latm";
                                A003.A0M = A002.A02;
                                A003.A04 = A002.A00;
                                A003.A0D = A002.A01;
                                A003.A0S = Collections.singletonList(bArr3);
                                A003.A0Q = this.A0J;
                                C166527yp A004 = C166527yp.A00(A003);
                                this.A08 = 1024000000 / ((long) A004.A0F);
                                this.A0C.B3T(A004);
                                this.A0G = true;
                            } else {
                                r5.A09(10);
                            }
                            r5.A09(4);
                            int A045 = (r5.A04(13) - 2) - 5;
                            if (this.A0F) {
                                A045 -= 2;
                            }
                            C185598tw r42 = this.A0C;
                            long j = this.A08;
                            this.A06 = 4;
                            this.A00 = 0;
                            this.A0A = r42;
                            this.A07 = j;
                            this.A05 = A045;
                        }
                    }
                    this.A04 = 256;
                } else {
                    byte[] bArr4 = r15.A02;
                    while (i2 < i) {
                        int i14 = i2 + 1;
                        byte b = bArr4[i2] & 255;
                        if (this.A04 == 512 && ((65280 | (((byte) b) & 255)) & 65526) == 65520) {
                            if (!this.A0E) {
                                int i15 = i14 - 2;
                                r15.A0S(i15 + 1);
                                C160807oL r7 = this.A0H;
                                byte[] bArr5 = r7.A03;
                                if (C161467pi.A00(r15) >= 1) {
                                    r15.A0V(bArr5, 0, 1);
                                    r7.A08(4);
                                    int A046 = r7.A04(1);
                                    int i16 = this.A03;
                                    if (i16 == -1 || A046 == i16) {
                                        if (this.A02 != -1) {
                                            byte[] bArr6 = r7.A03;
                                            if (C161467pi.A00(r15) >= 1) {
                                                r15.A0V(bArr6, 0, 1);
                                                r7.A08(2);
                                                if (r7.A04(4) == this.A02) {
                                                    r15.A0S(i15 + 2);
                                                }
                                            }
                                        }
                                        byte[] bArr7 = r7.A03;
                                        if (C161467pi.A00(r15) >= 4) {
                                            r15.A0V(bArr7, 0, 4);
                                            r7.A08(14);
                                            int A047 = r7.A04(13);
                                            if (A047 >= 7) {
                                                byte[] bArr8 = r15.A02;
                                                int i17 = r15.A00;
                                                int i18 = i15 + A047;
                                                if (i18 < i17) {
                                                    byte b2 = bArr8[i18];
                                                    if (b2 == -1) {
                                                        int i19 = i18 + 1;
                                                        if (i19 != i17) {
                                                            byte b3 = bArr8[i19];
                                                            if (((65280 | (b3 & 255)) & 65526) == 65520 && ((b3 & 8) >> 3) == A046) {
                                                            }
                                                        }
                                                    } else if (b2 == 73) {
                                                        int i20 = i18 + 1;
                                                        if (i20 != i17) {
                                                            if (bArr8[i20] == 68) {
                                                                int i21 = i18 + 2;
                                                                if (i21 != i17) {
                                                                    if (bArr8[i21] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.A01 = (b & 8) >> 3;
                            boolean z = true;
                            if ((b & 1) != 0) {
                                z = false;
                            }
                            this.A0F = z;
                            int i22 = 3;
                            if (!this.A0E) {
                                i22 = 1;
                            }
                            this.A06 = i22;
                            this.A00 = 0;
                            r15.A0S(i14);
                            break;
                        }
                        int i23 = this.A04;
                        byte b4 = b | i23;
                        int i24 = 768;
                        if (b4 != 329) {
                            if (b4 != 511) {
                                i24 = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                                if (b4 != 836) {
                                    if (b4 == 1075) {
                                        this.A06 = 2;
                                        this.A00 = A0L.length;
                                        this.A05 = 0;
                                        this.A0I.A0S(0);
                                        r15.A0S(i14);
                                        break;
                                        break;
                                    } else if (i23 != 256) {
                                        this.A04 = 256;
                                        i14--;
                                    }
                                }
                            } else {
                                this.A04 = 512;
                            }
                            i2 = i14;
                        }
                        this.A04 = i24;
                        i2 = i14;
                    }
                    r15.A0S(i2);
                }
            } else {
                return;
            }
        }
    }

    public void BgP() {
    }

    public AnonymousClass87D(boolean z, String str) {
        this.A0K = z;
        this.A0J = str;
    }

    public void B19(C187028wK r4, C151897Ws r5) {
        this.A0D = C151897Ws.A01(r5);
        C185598tw A002 = C151897Ws.A00(r4, r5);
        this.A0C = A002;
        this.A0A = A002;
        if (this.A0K) {
            r5.A02();
            r5.A03();
            C185598tw Br0 = r4.Br0(r5.A00, 5);
            this.A0B = Br0;
            C157057he A003 = C157057he.A00();
            r5.A03();
            A003.A0O = r5.A01;
            A003.A0R = "application/id3";
            C166527yp.A01(A003, Br0);
            return;
        }
        this.A0B = new C1687786s();
    }

    public void BgQ(long j, int i) {
        this.A09 = j;
    }
}
