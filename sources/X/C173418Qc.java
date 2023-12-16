package X;

import java.util.Arrays;

/* renamed from: X.8Qc  reason: invalid class name and case insensitive filesystem */
public class C173418Qc implements C188618zD {
    public int A00;
    public int A01;
    public int A02;
    public C185978uY A03;
    public C177308eP A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;

    public final void A00() {
        byte[] bArr = new byte[this.A00];
        int i = 0;
        this.A03.B24(bArr, 0);
        while (true) {
            byte[] bArr2 = this.A0A;
            if (i < bArr2.length) {
                AnonymousClass6CA.A0e(this.A0B[i] ^ this.A07[i], bArr2, bArr[i], i);
                i++;
            } else {
                return;
            }
        }
    }

    public final void A01() {
        if (!this.A05) {
            this.A05 = true;
            C185978uY r5 = this.A03;
            r5.B24(this.A07, 0);
            int i = this.A00;
            byte[] bArr = new byte[i];
            bArr[i - 1] = 2;
            r5.update(bArr, 0, i);
        }
    }

    public final void A02(boolean z) {
        this.A04.reset();
        C185978uY r5 = this.A03;
        r5.reset();
        this.A01 = 0;
        Arrays.fill(this.A08, (byte) 0);
        if (z) {
            Arrays.fill(this.A0A, (byte) 0);
        }
        int i = this.A00;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        r5.update(bArr, 0, i);
        this.A05 = false;
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            BhZ(bArr2, 0, bArr2.length);
        }
    }

    public byte[] B9G() {
        int i = this.A02;
        byte[] bArr = new byte[i];
        System.arraycopy(this.A0A, 0, bArr, 0, i);
        return bArr;
    }

    public int BAJ(int i) {
        int i2 = i + this.A01;
        boolean z = this.A06;
        int i3 = this.A02;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public C185768uD BE1() {
        return this.A04.A00;
    }

    public int BE4(int i) {
        int i2 = i + this.A01;
        if (!this.A06) {
            int i3 = this.A02;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % this.A00);
    }

    public void BFw(C834748n r8, boolean z) {
        byte[] bArr;
        int B9H;
        C834748n r1;
        this.A06 = z;
        if (r8 instanceof AnonymousClass8QK) {
            AnonymousClass8QK r82 = (AnonymousClass8QK) r8;
            bArr = C161007oo.A02(r82.A03);
            this.A09 = C161007oo.A02(r82.A02);
            B9H = r82.A00 / 8;
            this.A02 = B9H;
            r1 = r82.A01;
        } else if (r8 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r83 = (AnonymousClass8QP) r8;
            bArr = r83.A01;
            this.A09 = null;
            B9H = this.A03.B9H() / 2;
            this.A02 = B9H;
            r1 = r83.A00;
        } else {
            throw AnonymousClass001.A0c("invalid parameters passed to EAX");
        }
        int i = this.A00;
        int i2 = i;
        if (!z) {
            i += B9H;
        }
        this.A08 = new byte[i];
        byte[] bArr2 = new byte[i2];
        C185978uY r2 = this.A03;
        r2.BFu(r1);
        bArr2[i2 - 1] = 0;
        r2.update(bArr2, 0, i2);
        r2.update(bArr, 0, bArr.length);
        byte[] bArr3 = this.A0B;
        r2.B24(bArr3, 0);
        this.A04.BFw(new AnonymousClass8QP((C834748n) null, bArr3), true);
        A02(true);
    }

    public void BhZ(byte[] bArr, int i, int i2) {
        if (!this.A05) {
            this.A03.update(bArr, i, i2);
            return;
        }
        throw AnonymousClass001.A0e("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    public C173418Qc(C185768uD r3) {
        int B4g = r3.B4g();
        this.A00 = B4g;
        AnonymousClass8QU r1 = new AnonymousClass8QU(r3);
        this.A03 = r1;
        this.A0A = new byte[B4g];
        int i = r1.A01;
        this.A07 = new byte[i];
        this.A0B = new byte[i];
        this.A04 = new C177308eP(r3);
    }

    public int B24(byte[] bArr, int i) {
        A01();
        int i2 = this.A01;
        byte[] bArr2 = this.A08;
        byte[] bArr3 = new byte[bArr2.length];
        this.A01 = 0;
        if (this.A06) {
            int i3 = i + i2;
            if (bArr.length >= this.A02 + i3) {
                this.A04.Bha(bArr2, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                this.A03.update(bArr3, 0, i2);
                A00();
                System.arraycopy(this.A0A, 0, bArr, i3, this.A02);
                A02(false);
                return i2 + this.A02;
            }
            throw new C177198eE("Output buffer too short");
        }
        int i4 = this.A02;
        if (i2 < i4) {
            throw new C177188eD("data too short");
        } else if (bArr.length >= (i + i2) - i4) {
            if (i2 > i4) {
                this.A03.update(bArr2, 0, i2 - i4);
                this.A04.Bha(this.A08, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2 - this.A02);
            }
            A00();
            byte[] bArr4 = this.A08;
            int i5 = this.A02;
            int i6 = i2 - i5;
            byte b = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                b |= this.A0A[i7] ^ bArr4[i6 + i7];
            }
            if (b == 0) {
                A02(false);
                return i2 - this.A02;
            }
            throw new C177188eD("mac check in EAX failed");
        } else {
            throw new C177198eE("Output buffer too short");
        }
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A04.A00);
        return AnonymousClass000.A0X("/EAX", A0o);
    }

    public int Bhb(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        A01();
        if (bArr.length >= i + i2) {
            int i5 = 0;
            for (int i6 = 0; i6 != i2; i6++) {
                byte b = bArr[i + i6];
                int i7 = i3 + i5;
                byte[] bArr3 = this.A08;
                int i8 = this.A01;
                int i9 = i8 + 1;
                this.A01 = i9;
                bArr3[i8] = b;
                if (i9 == bArr3.length) {
                    int length = bArr2.length;
                    int i10 = this.A00;
                    if (length >= i7 + i10) {
                        if (this.A06) {
                            i4 = this.A04.Bha(bArr3, bArr2, 0, i7);
                            this.A03.update(bArr2, i7, i10);
                        } else {
                            this.A03.update(bArr3, 0, i10);
                            i4 = this.A04.Bha(this.A08, bArr2, 0, i7);
                        }
                        this.A01 = 0;
                        if (!this.A06) {
                            byte[] bArr4 = this.A08;
                            System.arraycopy(bArr4, i10, bArr4, 0, this.A02);
                            this.A01 = this.A02;
                        }
                    } else {
                        throw new C177198eE("Output buffer is too short");
                    }
                } else {
                    i4 = 0;
                }
                i5 += i4;
            }
            return i5;
        }
        throw new C177248eJ("Input buffer too short");
    }
}
