package X;

import java.util.Arrays;

/* renamed from: X.05I  reason: invalid class name */
public class AnonymousClass05I extends C07790cp {
    public int A00 = 0;
    public AnonymousClass0M1 A01;
    public C10580iA A02 = new C10580iA(this, this);
    public C04700Qh[] A03 = new C04700Qh[128];
    public C04700Qh[] A04 = new C04700Qh[128];

    public final void A08(C04700Qh r7) {
        int i = 0;
        while (true) {
            int i2 = this.A00;
            if (i < i2) {
                C04700Qh[] r2 = this.A03;
                if (r2[i] != r7) {
                    i++;
                } else {
                    while (true) {
                        int i3 = i2 - 1;
                        if (i < i3) {
                            int i4 = i + 1;
                            r2[i] = r2[i4];
                            i = i4;
                        } else {
                            this.A00 = i3;
                            r7.A07 = false;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public C04700Qh BBM(C05620Uf r10, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            C04700Qh[] r1 = this.A03;
            C04700Qh r8 = r1[i2];
            if (!zArr[r8.A02]) {
                this.A02.A01 = r8;
                if (i == -1) {
                    int i3 = 8;
                    while (true) {
                        float f = r8.A09[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                break;
                            }
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    C04700Qh r4 = r1[i];
                    int i4 = 8;
                    while (true) {
                        float f2 = r4.A09[i4];
                        float f3 = r8.A09[i4];
                        if (f3 == f2) {
                            i4--;
                            if (i4 < 0) {
                                break;
                            }
                        } else if (f3 >= f2) {
                        }
                    }
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.A03[i];
    }

    public void A03(C07790cp r18, boolean z) {
        C07790cp r9 = r18;
        C04700Qh r8 = r9.A02;
        if (r8 != null) {
            C17070uW r7 = r9.A01;
            int B6a = r7.B6a();
            int i = 0;
            while (true) {
                if (i < B6a) {
                    C04700Qh BEC = r7.BEC(i);
                    float BED = r7.BED(i);
                    C10580iA r12 = this.A02;
                    r12.A01 = BEC;
                    boolean z2 = true;
                    int i2 = 0;
                    if (BEC.A07) {
                        do {
                            float[] fArr = BEC.A09;
                            float A012 = AnonymousClass002.A01(r8.A09, BED, fArr[i2], i2);
                            fArr[i2] = A012;
                            if (Math.abs(A012) < 1.0E-4f) {
                                fArr[i2] = 0.0f;
                            } else {
                                z2 = false;
                            }
                            i2++;
                        } while (i2 < 9);
                        if (z2) {
                            r12.A02.A08(BEC);
                        }
                    } else {
                        do {
                            float f = r8.A09[i2];
                            if (f != 0.0f) {
                                float f2 = f * BED;
                                if (Math.abs(f2) < 1.0E-4f) {
                                    f2 = 0.0f;
                                }
                                BEC.A09[i2] = f2;
                            } else {
                                BEC.A09[i2] = 0.0f;
                            }
                            i2++;
                        } while (i2 < 9);
                        A07(BEC);
                    }
                    this.A00 += r9.A00 * BED;
                    i++;
                } else {
                    A08(r8);
                    return;
                }
            }
        }
    }

    public final void A07(C04700Qh r8) {
        C04700Qh[] r1;
        int i = this.A00 + 1;
        C04700Qh[] r12 = this.A03;
        int length = r12.length;
        if (i > length) {
            C04700Qh[] r13 = (C04700Qh[]) Arrays.copyOf(r12, length * 2);
            this.A03 = r13;
            this.A04 = (C04700Qh[]) Arrays.copyOf(r13, r13.length * 2);
        }
        C04700Qh[] r6 = this.A03;
        int i2 = this.A00;
        r6[i2] = r8;
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 > 1 && r6[i3 - 1].A02 > r8.A02) {
            int i4 = 0;
            do {
                r1 = this.A04;
                r1[i4] = r6[i4];
                i4++;
            } while (i4 < i3);
            Arrays.sort(r1, 0, i3, new C17930wT(this, 0));
            for (int i5 = 0; i5 < this.A00; i5++) {
                this.A03[i5] = this.A04[i5];
            }
        }
        r8.A07 = true;
        r8.A02(this);
    }

    public AnonymousClass05I(AnonymousClass0M1 r3) {
        super(r3);
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("");
        A0o.append(" goal -> (");
        A0o.append(this.A00);
        String A0X = AnonymousClass000.A0X(") : ", A0o);
        for (int i = 0; i < this.A00; i++) {
            C04700Qh r1 = this.A03[i];
            C10580iA r0 = this.A02;
            r0.A01 = r1;
            A0X = AnonymousClass000.A0X(" ", AnonymousClass000.A0k(r0, A0X));
        }
        return A0X;
    }
}
