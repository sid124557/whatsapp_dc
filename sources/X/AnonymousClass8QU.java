package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.8QU  reason: invalid class name */
public class AnonymousClass8QU implements C185978uY {
    public int A00;
    public int A01;
    public C185768uD A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;
    public byte[] A08;

    public final byte[] A00(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = length;
        int i2 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                byte b = bArr[i] & 255;
                AnonymousClass6C8.A0u(i2, bArr2, b << 1, i);
                i2 = (b >>> 7) & 1;
            } else {
                byte b2 = (-i2) & 255;
                int i3 = length - 3;
                byte b3 = bArr2[i3];
                byte[] bArr3 = this.A08;
                AnonymousClass6CA.A0e(b3, bArr2, bArr3[1] & b2, i3);
                int i4 = length - 2;
                AnonymousClass6CA.A0e(bArr3[2] & b2, bArr2, bArr2[i4], i4);
                int i5 = length - 1;
                AnonymousClass6CA.A0e(b2 & bArr3[3], bArr2, bArr2[i5], i5);
                return bArr2;
            }
        }
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A06;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.A00 = 0;
                this.A02.reset();
                return;
            }
        }
    }

    public int B24(byte[] bArr, int i) {
        byte[] bArr2;
        C185768uD r6 = this.A02;
        int B4g = r6.B4g();
        int i2 = this.A00;
        if (i2 == B4g) {
            bArr2 = this.A03;
        } else {
            new C173448Qf().Awh(this.A06, i2);
            bArr2 = this.A04;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.A07;
            int length = bArr3.length;
            byte[] bArr4 = this.A06;
            if (i3 < length) {
                AnonymousClass6C8.A1J(bArr4, bArr2, i3);
                i3++;
            } else {
                r6.Bha(bArr4, bArr3, 0, 0);
                int i4 = this.A01;
                System.arraycopy(bArr3, 0, bArr, i, i4);
                reset();
                return i4;
            }
        }
    }

    public int B9H() {
        return this.A01;
    }

    public void BFu(C834748n r5) {
        if (r5 == null || (r5 instanceof AnonymousClass8QN)) {
            C185768uD r3 = this.A02;
            r3.BFw(r5, true);
            byte[] bArr = this.A05;
            byte[] bArr2 = new byte[bArr.length];
            r3.Bha(bArr, bArr2, 0, 0);
            byte[] A002 = A00(bArr2);
            this.A03 = A002;
            this.A04 = A00(A002);
            reset();
            return;
        }
        throw AnonymousClass001.A0c("CMac mode only permits key to be set.");
    }

    public void BrT(byte b) {
        int i = this.A00;
        byte[] bArr = this.A06;
        if (i == bArr.length) {
            this.A02.Bha(bArr, this.A07, 0, 0);
            this.A00 = 0;
            i = 0;
        }
        this.A00 = i + 1;
        bArr[i] = b;
    }

    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            C185768uD r5 = this.A02;
            int B4g = r5.B4g();
            int i3 = this.A00;
            int i4 = B4g - i3;
            if (i2 > i4) {
                byte[] bArr2 = this.A06;
                System.arraycopy(bArr, i, bArr2, i3, i4);
                byte[] bArr3 = this.A07;
                r5.Bha(bArr2, bArr3, 0, 0);
                this.A00 = 0;
                i2 -= i4;
                i += i4;
                while (i2 > B4g) {
                    r5.Bha(bArr, bArr3, i, 0);
                    i2 -= B4g;
                    i += B4g;
                }
            }
            System.arraycopy(bArr, i, this.A06, this.A00, i2);
            this.A00 += i2;
            return;
        }
        throw AnonymousClass001.A0c("Can't have a negative input length!");
    }

    public AnonymousClass8QU(C185768uD r6) {
        int B4g = r6.B4g();
        int i = B4g * 8;
        if (i % 8 != 0) {
            throw AnonymousClass001.A0c("MAC size must be multiple of 8");
        } else if (i <= i) {
            this.A02 = new AnonymousClass8QA(r6);
            this.A01 = i / 8;
            int i2 = 135;
            switch (i) {
                case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                case 320:
                    i2 = 27;
                    break;
                case 128:
                case 192:
                    break;
                case 160:
                    i2 = 45;
                    break;
                case 224:
                    i2 = 777;
                    break;
                case 256:
                    i2 = 1061;
                    break;
                case 384:
                    i2 = 4109;
                    break;
                case 448:
                    i2 = 2129;
                    break;
                case 512:
                    i2 = 293;
                    break;
                case 768:
                    i2 = 655377;
                    break;
                case EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH:
                    i2 = 524355;
                    break;
                case EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH:
                    i2 = 548865;
                    break;
                default:
                    throw AnonymousClass000.A0G("Unknown block size for CMAC: ", AnonymousClass001.A0o(), i);
            }
            byte[] bArr = new byte[4];
            C161817qb.A02(bArr, i2, 0);
            this.A08 = bArr;
            this.A07 = new byte[B4g];
            this.A06 = new byte[B4g];
            this.A05 = new byte[B4g];
            this.A00 = 0;
        } else {
            throw AnonymousClass000.A0G("MAC size must be less or equal to ", AnonymousClass001.A0o(), i);
        }
    }
}
