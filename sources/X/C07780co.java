package X;

import java.util.Arrays;

/* renamed from: X.0co  reason: invalid class name and case insensitive filesystem */
public class C07780co implements C17070uW {
    public int A00 = 16;
    public int A01 = -1;
    public int A02 = 0;
    public float[] A03 = new float[16];
    public int[] A04 = new int[16];
    public int[] A05 = new int[16];
    public int[] A06 = new int[16];
    public int[] A07 = new int[16];
    public int[] A08 = new int[16];
    public final C07790cp A09;
    public final AnonymousClass0M1 A0A;

    public int A00(C04700Qh r6) {
        if (this.A02 != 0) {
            int i = r6.A02;
            int i2 = this.A04[i % 16];
            if (i2 != -1) {
                int[] iArr = this.A08;
                if (iArr[i2] == i) {
                    return i2;
                }
                while (true) {
                    i2 = this.A06[i2];
                    if (i2 == -1) {
                        break;
                    }
                    int i3 = iArr[i2];
                    if (i3 == i) {
                        if (i2 == -1 || i3 != i) {
                            return -1;
                        }
                        return i2;
                    }
                }
            }
        }
        return -1;
    }

    public final void A01(C04700Qh r3, float f, int i) {
        this.A08[i] = r3.A02;
        this.A03[i] = f;
        this.A07[i] = -1;
        this.A05[i] = -1;
        r3.A02(this.A09);
        r3.A05++;
        this.A02++;
    }

    public void B22(float f) {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] / f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public int B6a() {
        return this.A02;
    }

    public C04700Qh BEC(int i) {
        int i2 = this.A02;
        if (i2 != 0) {
            int i3 = this.A01;
            int i4 = 0;
            while (i4 < i2) {
                if (i4 != i || i3 == -1) {
                    i3 = this.A05[i3];
                    if (i3 == -1) {
                        break;
                    }
                    i4++;
                } else {
                    return this.A0A.A03[this.A08[i3]];
                }
            }
        }
        return null;
    }

    public float BED(int i) {
        int i2 = this.A02;
        int i3 = this.A01;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.A03[i3];
            }
            i3 = this.A05[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void BGi() {
        int i = this.A02;
        int i2 = this.A01;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.A03;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.A05[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    public float Bs9(C07790cp r9, boolean z) {
        C04700Qh r0 = r9.A02;
        float B3n = B3n(r0);
        Bj2(r0, z);
        C07780co r6 = (C07780co) r9.A01;
        int i = r6.A02;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = r6.A08[i3];
            if (i4 != -1) {
                AwI(this.A0A.A03[i4], r6.A03[i3] * B3n, z);
                i2++;
            }
            i3++;
        }
        return B3n;
    }

    public void clear() {
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            C04700Qh BEC = BEC(i2);
            if (BEC != null) {
                BEC.A03(this.A09);
            }
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            this.A08[i3] = -1;
            this.A06[i3] = -1;
        }
        int i4 = 0;
        do {
            this.A04[i4] = -1;
            i4++;
        } while (i4 < 16);
        this.A02 = 0;
        this.A01 = -1;
    }

    public C07780co(C07790cp r4, AnonymousClass0M1 r5) {
        this.A09 = r4;
        this.A0A = r5;
        clear();
    }

    public void AwI(C04700Qh r7, float f, boolean z) {
        float f2 = -0.001f;
        if (f <= f2 || f >= 0.001f) {
            int A002 = A00(r7);
            if (A002 == -1) {
                Bhm(r7, f);
                return;
            }
            float[] fArr = this.A03;
            float f3 = fArr[A002] + f;
            fArr[A002] = f3;
            if (f3 > f2 && f3 < 0.001f) {
                fArr[A002] = 0.0f;
                Bj2(r7, z);
            }
        }
    }

    public boolean Azb(C04700Qh r3) {
        return AnonymousClass001.A1X(A00(r3), -1);
    }

    public float B3n(C04700Qh r3) {
        int A002 = A00(r3);
        if (A002 != -1) {
            return this.A03[A002];
        }
        return 0.0f;
    }

    public void Bhm(C04700Qh r9, float f) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        if (f <= (-0.001f) || f >= 0.001f) {
            int i = this.A02;
            int i2 = 0;
            if (i == 0) {
                A01(r9, f, 0);
                int i3 = r9.A02 % 16;
                int[] iArr4 = this.A04;
                int i4 = iArr4[i3];
                if (i4 == -1) {
                    iArr4[i3] = 0;
                } else {
                    while (true) {
                        iArr3 = this.A06;
                        int i5 = iArr3[i4];
                        if (i5 == -1) {
                            break;
                        }
                        i4 = i5;
                    }
                    iArr3[i4] = 0;
                }
                this.A06[0] = -1;
                this.A01 = 0;
                return;
            }
            int A002 = A00(r9);
            if (A002 != -1) {
                this.A03[A002] = f;
                return;
            }
            int i6 = i + 1;
            int i7 = this.A00;
            if (i6 >= i7) {
                i7 *= 2;
                this.A08 = Arrays.copyOf(this.A08, i7);
                this.A03 = Arrays.copyOf(this.A03, i7);
                this.A07 = Arrays.copyOf(this.A07, i7);
                this.A05 = Arrays.copyOf(this.A05, i7);
                int[] copyOf = Arrays.copyOf(this.A06, i7);
                this.A06 = copyOf;
                for (int i8 = this.A00; i8 < i7; i8++) {
                    this.A08[i8] = -1;
                    copyOf[i8] = -1;
                }
                this.A00 = i7;
            }
            int i9 = this.A02;
            int i10 = this.A01;
            int i11 = -1;
            while (i2 < i9) {
                int i12 = this.A08[i10];
                int i13 = r9.A02;
                if (i12 != i13) {
                    if (i12 < i13) {
                        i11 = i10;
                    }
                    i10 = this.A05[i10];
                    if (i10 == -1) {
                        break;
                    }
                    i2++;
                } else {
                    this.A03[i10] = f;
                    return;
                }
            }
            int i14 = 0;
            while (true) {
                if (i14 < i7) {
                    if (this.A08[i14] == -1) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = -1;
                    break;
                }
            }
            A01(r9, f, i14);
            int[] iArr5 = this.A07;
            if (i11 != -1) {
                iArr5[i14] = i11;
                iArr = this.A05;
                iArr[i14] = iArr[i11];
                iArr[i11] = i14;
            } else {
                iArr5[i14] = -1;
                int i15 = this.A02;
                iArr = this.A05;
                if (i15 > 0) {
                    iArr[i14] = this.A01;
                    this.A01 = i14;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i16 = iArr[i14];
            if (i16 != -1) {
                iArr5[i16] = i14;
            }
            int i17 = r9.A02 % 16;
            int[] iArr6 = this.A04;
            int i18 = iArr6[i17];
            if (i18 == -1) {
                iArr6[i17] = i14;
            } else {
                while (true) {
                    iArr2 = this.A06;
                    int i19 = iArr2[i18];
                    if (i19 == -1) {
                        break;
                    }
                    i18 = i19;
                }
                iArr2[i18] = i14;
            }
            this.A06[i14] = -1;
            return;
        }
        Bj2(r9, true);
    }

    public float Bj2(C04700Qh r10, boolean z) {
        int A002 = A00(r10);
        if (A002 == -1) {
            return 0.0f;
        }
        int i = r10.A02;
        int i2 = i % 16;
        int[] iArr = this.A04;
        int i3 = iArr[i2];
        if (i3 != -1) {
            int[] iArr2 = this.A08;
            if (iArr2[i3] == i) {
                int[] iArr3 = this.A06;
                iArr[i2] = iArr3[i3];
                iArr3[i3] = -1;
            } else {
                while (true) {
                    int[] iArr4 = this.A06;
                    int i4 = iArr4[i3];
                    if (i4 == -1) {
                        break;
                    }
                    int i5 = iArr2[i4];
                    if (i5 != i) {
                        i3 = i4;
                    } else if (i4 != -1 && i5 == i) {
                        iArr4[i3] = iArr4[i4];
                        iArr4[i4] = -1;
                    }
                }
            }
        }
        float f = this.A03[A002];
        if (this.A01 == A002) {
            this.A01 = this.A05[A002];
        }
        this.A08[A002] = -1;
        int[] iArr5 = this.A07;
        int i6 = iArr5[A002];
        if (i6 != -1) {
            int[] iArr6 = this.A05;
            iArr6[i6] = iArr6[A002];
        }
        int i7 = this.A05[A002];
        if (i7 != -1) {
            iArr5[i7] = iArr5[A002];
        }
        this.A02--;
        r10.A05--;
        if (z) {
            r10.A03(this.A09);
        }
        return f;
    }

    public String toString() {
        String A0T;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(hashCode());
        String A0X = AnonymousClass000.A0X(" { ", A0o);
        int i = this.A02;
        for (int i2 = 0; i2 < i; i2++) {
            C04700Qh BEC = BEC(i2);
            if (BEC != null) {
                StringBuilder A0k = AnonymousClass000.A0k(BEC, A0X);
                A0k.append(" = ");
                A0k.append(BED(i2));
                String A0X2 = AnonymousClass000.A0X(" ", A0k);
                int A002 = A00(BEC);
                String A0X3 = AnonymousClass000.A0X("[p: ", AnonymousClass000.A0l(A0X2));
                int i3 = this.A07[A002];
                StringBuilder A0o2 = AnonymousClass001.A0o();
                if (i3 != -1) {
                    A0o2.append(A0X3);
                    A0o2.append(this.A0A.A03[this.A08[i3]]);
                } else {
                    A0o2.append(A0X3);
                    A0o2.append("none");
                }
                String A0X4 = AnonymousClass000.A0X(", n: ", AnonymousClass000.A0l(A0o2.toString()));
                int i4 = this.A05[A002];
                if (i4 != -1) {
                    A0T = AnonymousClass000.A0R(this.A0A.A03[this.A08[i4]], AnonymousClass000.A0l(A0X4));
                } else {
                    A0T = AnonymousClass000.A0T(A0X4, "none");
                }
                A0X = AnonymousClass000.A0W(A0T, AnonymousClass001.A0o());
            }
        }
        return AnonymousClass000.A0X(" }", AnonymousClass000.A0l(A0X));
    }
}
