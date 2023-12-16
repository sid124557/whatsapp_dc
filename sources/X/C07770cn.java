package X;

import java.util.Arrays;

/* renamed from: X.0cn  reason: invalid class name and case insensitive filesystem */
public class C07770cn implements C17070uW {
    public int A00 = 8;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = -1;
    public boolean A04 = false;
    public float[] A05 = new float[8];
    public int[] A06 = new int[8];
    public int[] A07 = new int[8];
    public final C07790cp A08;
    public final AnonymousClass0M1 A09;

    public static void A01(C07770cn r3, int i) {
        int i2 = r3.A00 * 2;
        r3.A00 = i2;
        r3.A04 = false;
        r3.A03 = i - 1;
        r3.A05 = Arrays.copyOf(r3.A05, i2);
        r3.A06 = Arrays.copyOf(r3.A06, r3.A00);
        r3.A07 = Arrays.copyOf(r3.A07, r3.A00);
    }

    public final void Bhm(C04700Qh r9, float f) {
        int length;
        if (f == 0.0f) {
            Bj2(r9, true);
            return;
        }
        int i = this.A02;
        int i2 = 0;
        if (i == -1) {
            this.A02 = 0;
            this.A05[0] = f;
            this.A06[0] = r9.A02;
            this.A07[0] = -1;
            this.A01 = A00(this, r9);
            if (!this.A04) {
                int i3 = this.A03 + 1;
                this.A03 = i3;
                length = this.A06.length;
                if (i3 < length) {
                    return;
                }
            } else {
                return;
            }
        } else {
            int i4 = -1;
            while (i != -1 && i2 < this.A01) {
                int i5 = this.A06[i];
                int i6 = r9.A02;
                if (i5 == i6) {
                    this.A05[i] = f;
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.A07[i];
                i2++;
            }
            int i7 = this.A03;
            int i8 = i7 + 1;
            if (this.A04) {
                int[] iArr = this.A06;
                if (iArr[i7] != -1) {
                    i7 = iArr.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr2 = this.A06;
            int length2 = iArr2.length;
            if (i7 >= length2 && this.A01 < length2) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    } else if (iArr2[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            if (i7 >= length2) {
                i7 = length2;
                A01(this, length2);
            }
            this.A06[i7] = r9.A02;
            this.A05[i7] = f;
            int[] iArr3 = this.A07;
            if (i4 != -1) {
                iArr3[i7] = iArr3[i4];
                iArr3[i4] = i7;
            } else {
                iArr3[i7] = this.A02;
                this.A02 = i7;
            }
            int A002 = A00(this, r9);
            this.A01 = A002;
            if (!this.A04) {
                this.A03++;
            }
            length = this.A06.length;
            if (A002 >= length) {
                this.A04 = true;
            }
            if (this.A03 < length) {
                return;
            }
        }
        this.A04 = true;
        this.A03 = length - 1;
    }

    public static int A00(C07770cn r1, C04700Qh r2) {
        r2.A05++;
        r2.A02(r1.A08);
        return r1.A01 + 1;
    }

    public boolean Azb(C04700Qh r7) {
        int i = this.A02;
        if (i != -1) {
            int i2 = 0;
            while (i != -1 && i2 < this.A01) {
                if (this.A06[i] == r7.A02) {
                    return true;
                }
                i = this.A07[i];
                i2++;
            }
        }
        return false;
    }

    public void B22(float f) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] / f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float B3n(C04700Qh r5) {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            if (this.A06[i] == r5.A02) {
                return this.A05[i];
            }
            i = this.A07[i];
            i2++;
        }
        return 0.0f;
    }

    public int B6a() {
        return this.A01;
    }

    public C04700Qh BEC(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            if (i3 == i) {
                return this.A09.A03[this.A06[i2]];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return null;
    }

    public float BED(int i) {
        int i2 = this.A02;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A01) {
            if (i3 == i) {
                return this.A05[i2];
            }
            i2 = this.A07[i2];
            i3++;
        }
        return 0.0f;
    }

    public void BGi() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            float[] fArr = this.A05;
            fArr[i] = fArr[i] * -1.0f;
            i = this.A07[i];
            i2++;
        }
    }

    public final float Bj2(C04700Qh r11, boolean z) {
        int i = this.A02;
        int i2 = i;
        if (i != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i != -1) {
                int i5 = this.A01;
                if (i3 >= i5) {
                    break;
                }
                int[] iArr = this.A06;
                if (iArr[i] == r11.A02) {
                    int[] iArr2 = this.A07;
                    int i6 = iArr2[i];
                    if (i == i2) {
                        this.A02 = i6;
                    } else {
                        iArr2[i4] = i6;
                    }
                    if (z) {
                        r11.A03(this.A08);
                    }
                    r11.A05--;
                    this.A01 = i5 - 1;
                    iArr[i] = -1;
                    if (this.A04) {
                        this.A03 = i;
                    }
                    return this.A05[i];
                }
                i3++;
                i4 = i;
                i = this.A07[i];
            }
        }
        return 0.0f;
    }

    public float Bs9(C07790cp r7, boolean z) {
        C04700Qh r0 = r7.A02;
        float B3n = B3n(r0);
        Bj2(r0, z);
        C17070uW r4 = r7.A01;
        int B6a = r4.B6a();
        for (int i = 0; i < B6a; i++) {
            C04700Qh BEC = r4.BEC(i);
            AwI(BEC, r4.B3n(BEC) * B3n, z);
        }
        return B3n;
    }

    public final void clear() {
        int i = this.A02;
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            C04700Qh r1 = this.A09.A03[this.A06[i]];
            if (r1 != null) {
                r1.A03(this.A08);
            }
            i = this.A07[i];
            i2++;
        }
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = false;
        this.A01 = 0;
    }

    public String toString() {
        int i = this.A02;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.A01) {
            StringBuilder A0l = AnonymousClass000.A0l(AnonymousClass000.A0X(" -> ", AnonymousClass000.A0l(str)));
            A0l.append(this.A05[i]);
            str = AnonymousClass000.A0R(this.A09.A03[this.A06[i]], AnonymousClass000.A0l(AnonymousClass000.A0X(" : ", A0l)));
            i = this.A07[i];
            i2++;
        }
        return str;
    }

    public C07770cn(C07790cp r4, AnonymousClass0M1 r5) {
        this.A08 = r4;
        this.A09 = r5;
    }

    public void AwI(C04700Qh r12, float f, boolean z) {
        int i;
        float f2 = -0.001f;
        if (f <= f2 || f >= 0.001f) {
            int i2 = this.A02;
            int i3 = i2;
            if (i2 == -1) {
                this.A02 = 0;
                this.A05[0] = f;
                this.A06[0] = r12.A02;
                this.A07[0] = -1;
                this.A01 = A00(this, r12);
                if (!this.A04) {
                    i = this.A03 + 1;
                    this.A03 = i;
                } else {
                    return;
                }
            } else {
                int i4 = 0;
                int i5 = -1;
                while (i2 != -1) {
                    int i6 = this.A01;
                    if (i4 >= i6) {
                        break;
                    }
                    int i7 = this.A06[i2];
                    int i8 = r12.A02;
                    if (i7 == i8) {
                        float[] fArr = this.A05;
                        float f3 = fArr[i2] + f;
                        if (f3 > f2 && f3 < 0.001f) {
                            f3 = 0.0f;
                        }
                        fArr[i2] = f3;
                        if (f3 == 0.0f) {
                            int[] iArr = this.A07;
                            int i9 = iArr[i2];
                            if (i2 == i3) {
                                this.A02 = i9;
                            } else {
                                iArr[i5] = i9;
                            }
                            if (z) {
                                r12.A03(this.A08);
                            }
                            if (this.A04) {
                                this.A03 = i2;
                            }
                            r12.A05--;
                            this.A01 = i6 - 1;
                            return;
                        }
                        return;
                    }
                    if (i7 < i8) {
                        i5 = i2;
                    }
                    i2 = this.A07[i2];
                    i4++;
                }
                int i10 = this.A03;
                int i11 = i10 + 1;
                if (this.A04) {
                    int[] iArr2 = this.A06;
                    if (iArr2[i10] != -1) {
                        i10 = iArr2.length;
                    }
                } else {
                    i10 = i11;
                }
                int[] iArr3 = this.A06;
                int length = iArr3.length;
                if (i10 >= length && this.A01 < length) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            break;
                        } else if (iArr3[i12] == -1) {
                            i10 = i12;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (i10 >= length) {
                    i10 = length;
                    A01(this, length);
                }
                this.A06[i10] = r12.A02;
                this.A05[i10] = f;
                int[] iArr4 = this.A07;
                if (i5 != -1) {
                    iArr4[i10] = iArr4[i5];
                    iArr4[i5] = i10;
                } else {
                    iArr4[i10] = this.A02;
                    this.A02 = i10;
                }
                this.A01 = A00(this, r12);
                if (!this.A04) {
                    this.A03++;
                }
                i = this.A03;
            }
            int length2 = this.A06.length;
            if (i >= length2) {
                this.A04 = true;
                this.A03 = length2 - 1;
            }
        }
    }
}
