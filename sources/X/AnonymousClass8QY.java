package X;

/* renamed from: X.8QY  reason: invalid class name */
public class AnonymousClass8QY implements C185538tq {
    public C185768uD A00;
    public AnonymousClass8QN A01;
    public boolean A02;
    public byte[] A03 = {-90, -90, -90, -90, -90, -90, -90, -90};

    public byte[] BsY(byte[] bArr, int i, int i2) {
        if (this.A02) {
            int i3 = i2;
            int i4 = i2 / 8;
            if (i4 * 8 == i3) {
                byte[] bArr2 = this.A03;
                int length = bArr2.length;
                byte[] bArr3 = new byte[(length + i2)];
                byte[] bArr4 = new byte[(length + 8)];
                System.arraycopy(bArr2, 0, bArr3, 0, length);
                System.arraycopy(bArr, 0, bArr3, this.A03.length, i3);
                C185768uD r12 = this.A00;
                r12.BFw(this.A01, true);
                int i5 = 0;
                do {
                    for (int i6 = 1; i6 <= i4; i6++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        int i7 = i6 * 8;
                        System.arraycopy(bArr3, i7, bArr4, this.A03.length, 8);
                        r12.Bha(bArr4, bArr4, 0, 0);
                        int i8 = (i4 * i5) + i6;
                        int i9 = 1;
                        while (i8 != 0) {
                            int length2 = this.A03.length - i9;
                            AnonymousClass6CA.A0e((byte) i8, bArr4, bArr4[length2], length2);
                            i8 >>>= 8;
                            i9++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i7, 8);
                    }
                    i5++;
                } while (i5 != 6);
                return bArr3;
            }
            throw new C177248eJ("wrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass001.A0e("not set for wrapping");
    }

    public AnonymousClass8QY() {
        AnonymousClass8QD r1 = new AnonymousClass8QD();
        this.A00 = r1;
    }

    public String B4N() {
        return this.A00.B4N();
    }

    public void BFw(C834748n r3, boolean z) {
        this.A02 = z;
        if (r3 instanceof AnonymousClass8QJ) {
            r3 = ((AnonymousClass8QJ) r3).A01;
        }
        if (r3 instanceof AnonymousClass8QN) {
            this.A01 = (AnonymousClass8QN) r3;
        } else if (r3 instanceof AnonymousClass8QP) {
            AnonymousClass8QP r32 = (AnonymousClass8QP) r3;
            byte[] bArr = r32.A01;
            this.A03 = bArr;
            this.A01 = (AnonymousClass8QN) r32.A00;
            if (bArr.length != 8) {
                throw AnonymousClass001.A0c("IV not equal to 8");
            }
        }
    }

    public byte[] BrR(byte[] bArr, int i, int i2) {
        int i3 = i2;
        if (!this.A02) {
            int i4 = i2 / 8;
            if (i4 * 8 == i3) {
                int length = this.A03.length;
                byte[] bArr2 = new byte[(i2 - length)];
                byte[] bArr3 = new byte[length];
                byte[] bArr4 = new byte[(length + 8)];
                byte[] bArr5 = bArr;
                System.arraycopy(bArr5, 0, bArr3, 0, length);
                int length2 = this.A03.length;
                System.arraycopy(bArr5, 0 + length2, bArr2, 0, i2 - length2);
                C185768uD r7 = this.A00;
                r7.BFw(this.A01, false);
                int i5 = i4 - 1;
                int i6 = 5;
                do {
                    for (int i7 = i5; i7 >= 1; i7--) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.A03.length);
                        int i8 = (i7 - 1) * 8;
                        System.arraycopy(bArr2, i8, bArr4, this.A03.length, 8);
                        int i9 = (i5 * i6) + i7;
                        int i10 = 1;
                        while (i9 != 0) {
                            int length3 = this.A03.length - i10;
                            AnonymousClass6CA.A0e((byte) i9, bArr4, bArr4[length3], length3);
                            i9 >>>= 8;
                            i10++;
                        }
                        r7.Bha(bArr4, bArr4, 0, 0);
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr2, i8, 8);
                    }
                    i6--;
                } while (i6 >= 0);
                if (C161007oo.A01(bArr3, this.A03)) {
                    return bArr2;
                }
                throw new C177188eD("checksum failed");
            }
            throw new C177188eD("unwrap data must be a multiple of 8 bytes");
        }
        throw AnonymousClass001.A0e("not set for unwrapping");
    }
}
