package X;

import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: X.8QZ  reason: invalid class name */
public class AnonymousClass8QZ implements C185538tq {
    public SecureRandom A00;
    public AnonymousClass8QA A01;
    public AnonymousClass8QP A02;
    public boolean A03;

    public byte[] BrR(byte[] bArr, int i, int i2) {
        boolean z;
        byte[] bArr2;
        int i3;
        if (!this.A03) {
            AnonymousClass8QA r3 = this.A01;
            int B4g = r3.A01.B4g();
            if (i2 >= B4g * 2) {
                byte[] bArr3 = new byte[i2];
                byte[] bArr4 = new byte[B4g];
                boolean z2 = false;
                System.arraycopy(bArr, 0, bArr3, 0, i2);
                System.arraycopy(bArr, 0, bArr4, 0, B4g);
                r3.BFw(new AnonymousClass8QP(this.A02.A00, bArr4), false);
                for (int i4 = B4g; i4 < i2; i4 += B4g) {
                    r3.Bha(bArr3, bArr3, i4, i4);
                }
                System.arraycopy(bArr3, i2 - B4g, bArr4, 0, B4g);
                r3.BFw(new AnonymousClass8QP(this.A02.A00, bArr4), false);
                r3.Bha(bArr3, bArr3, 0, 0);
                r3.BFw(this.A02, false);
                for (int i5 = 0; i5 < i2; i5 += B4g) {
                    r3.Bha(bArr3, bArr3, i5, i5);
                }
                int i6 = bArr3[0] & 255;
                int i7 = i2 - 4;
                if (i6 > i7) {
                    z = true;
                    bArr2 = new byte[i7];
                } else {
                    z = false;
                    bArr2 = new byte[i6];
                }
                System.arraycopy(bArr3, 4, bArr2, 0, bArr2.length);
                int i8 = 0;
                byte b = 0;
                do {
                    i3 = i8 + 1;
                    b |= bArr3[i8 + 4] ^ ((byte) (~bArr3[i3]));
                    i8 = i3;
                } while (i3 != 3);
                Arrays.fill(bArr3, (byte) 0);
                if (b != 0) {
                    z2 = true;
                }
                if (!z && !z2) {
                    return bArr2;
                }
                throw new C177188eD("wrapped key corrupted");
            }
            throw new C177188eD("input too short");
        }
        throw AnonymousClass001.A0e("not set for unwrapping");
    }

    public byte[] BsY(byte[] bArr, int i, int i2) {
        if (!this.A03) {
            throw AnonymousClass001.A0e("not set for wrapping");
        } else if (i2 > 255 || i2 < 0) {
            throw AnonymousClass001.A0c("input must be from 0 to 255 bytes");
        } else {
            AnonymousClass8QA r3 = this.A01;
            r3.BFw(this.A02, true);
            int B4g = r3.A01.B4g();
            int i3 = i2 + 4;
            int i4 = B4g * 2;
            if (i3 >= i4) {
                if (i3 % B4g == 0) {
                    i4 = i3;
                } else {
                    i4 = ((i3 / B4g) + 1) * B4g;
                }
            }
            byte[] bArr2 = new byte[i4];
            bArr2[0] = (byte) i2;
            System.arraycopy(bArr, 0, bArr2, 4, i2);
            int i5 = i4 - i3;
            byte[] bArr3 = new byte[i5];
            this.A00.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i3, i5);
            bArr2[1] = (byte) (~bArr2[4]);
            bArr2[2] = (byte) (~bArr2[5]);
            bArr2[3] = (byte) (~bArr2[6]);
            for (int i6 = 0; i6 < i4; i6 += B4g) {
                r3.Bha(bArr2, bArr2, i6, i6);
            }
            for (int i7 = 0; i7 < i4; i7 += B4g) {
                r3.Bha(bArr2, bArr2, i7, i7);
            }
            return bArr2;
        }
    }

    public void BFw(C834748n r4, boolean z) {
        this.A03 = z;
        if (r4 instanceof AnonymousClass8QJ) {
            AnonymousClass8QJ r42 = (AnonymousClass8QJ) r4;
            this.A00 = r42.A00;
            C834748n r1 = r42.A01;
            if (r1 instanceof AnonymousClass8QP) {
                this.A02 = (AnonymousClass8QP) r1;
                return;
            }
            throw AnonymousClass001.A0c("RFC3211Wrap requires an IV");
        }
        if (z) {
            this.A00 = C161657qB.A00();
        }
        if (r4 instanceof AnonymousClass8QP) {
            this.A02 = (AnonymousClass8QP) r4;
            return;
        }
        throw AnonymousClass001.A0c("RFC3211Wrap requires an IV");
    }

    public AnonymousClass8QZ(C185768uD r2) {
        this.A01 = new AnonymousClass8QA(r2);
    }

    public String B4N() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass6C9.A1A(A0o, this.A01.A01);
        return AnonymousClass000.A0X("/RFC3211Wrap", A0o);
    }
}
