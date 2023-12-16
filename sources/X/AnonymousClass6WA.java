package X;

import java.util.Arrays;

/* renamed from: X.6WA  reason: invalid class name */
public final class AnonymousClass6WA extends AnonymousClass6WD implements Cloneable {
    public byte[] A00 = AnonymousClass79M.A00;
    public byte[][] A01 = AnonymousClass79M.A04;

    public final boolean equals(Object obj) {
        int length;
        int length2;
        if (obj != this) {
            if (obj instanceof AnonymousClass6WA) {
                AnonymousClass6WA r11 = (AnonymousClass6WA) obj;
                if (Arrays.equals(this.A00, r11.A00)) {
                    byte[][] bArr = this.A01;
                    byte[][] bArr2 = r11.A01;
                    if (bArr == null) {
                        length = 0;
                    } else {
                        length = bArr.length;
                    }
                    if (bArr2 == null) {
                        length2 = 0;
                    } else {
                        length2 = bArr2.length;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= length || bArr[i] != null) {
                            while (i2 < length2 && bArr2[i2] == null) {
                                i2++;
                            }
                            boolean A1U = C18280x3.A1U(i, length);
                            boolean A1U2 = C18280x3.A1U(i2, length2);
                            if (!A1U) {
                                if (A1U != A1U2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                                    break;
                                }
                                i++;
                                i2++;
                            } else if (A1U2) {
                                AnonymousClass8LR r1 = this.A00;
                                if (r1 != null && r1.A00 != 0) {
                                    return r1.equals(r11.A00);
                                }
                                AnonymousClass8LR r0 = r11.A00;
                                if (r0 == null || r0.A00 == 0) {
                                    return true;
                                }
                            }
                        } else {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void A04(C161777qQ r4) {
        byte[] bArr = this.A00;
        if (!Arrays.equals(bArr, AnonymousClass79M.A00)) {
            r4.A06(1, bArr);
        }
        byte[][] bArr2 = this.A01;
        if (bArr2 != null && bArr2.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr3 = this.A01;
                if (i >= bArr3.length) {
                    break;
                }
                byte[] bArr4 = bArr3[i];
                if (bArr4 != null) {
                    r4.A06(2, bArr4);
                }
                i++;
            }
        }
        super.A04(r4);
    }

    public final int hashCode() {
        int length;
        int i = 0;
        int A09 = AnonymousClass6CA.A09(this.A00, (AnonymousClass6WA.class.getName().hashCode() + 527) * 31) * 31 * 31;
        byte[][] bArr = this.A01;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte[] bArr2 = bArr[i3];
            if (bArr2 != null) {
                i2 = AnonymousClass6CA.A09(bArr2, i2 * 31);
            }
        }
        int i4 = (((A09 + i2) * 31) + 1237) * 31;
        AnonymousClass8LR r1 = this.A00;
        if (!(r1 == null || r1.A00 == 0)) {
            i = r1.hashCode();
        }
        return i4 + i;
    }

    public AnonymousClass6WA() {
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A02() {
        int length;
        int A02 = super.A02();
        byte[] bArr = this.A00;
        if (!Arrays.equals(bArr, AnonymousClass79M.A00)) {
            int length2 = bArr.length;
            A02 += 1 + AnonymousClass6C7.A00(length2) + length2;
        }
        byte[][] bArr2 = this.A01;
        if (bArr2 == null || (length = bArr2.length) <= 0) {
            return A02;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        do {
            byte[] bArr3 = bArr2[i];
            if (bArr3 != null) {
                i3++;
                int length3 = bArr3.length;
                i2 += AnonymousClass6C7.A00(length3) + length3;
            }
            i++;
        } while (i < length);
        return A02 + i2 + i3;
    }

    public final /* synthetic */ Object clone() {
        try {
            AnonymousClass6WA r2 = (AnonymousClass6WA) super.A05();
            byte[][] bArr = this.A01;
            if (bArr != null && bArr.length > 0) {
                r2.A01 = (byte[][]) bArr.clone();
            }
            return r2;
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
