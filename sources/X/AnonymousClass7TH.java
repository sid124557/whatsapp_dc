package X;

import java.util.Arrays;

/* renamed from: X.7TH  reason: invalid class name */
public final class AnonymousClass7TH {
    public int A00 = -1;
    public boolean A01;
    public final C152577Zk A02 = new C152577Zk();
    public final C161457ph A03 = new C161457ph(new byte[65025], 0);

    public boolean A00(C153437bJ r10) {
        C152577Zk r6;
        int i;
        int i2;
        if (this.A01) {
            this.A01 = false;
            this.A03.A0F(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                C152577Zk r7 = this.A02;
                if (!r7.A01(r10, true)) {
                    return false;
                }
                int i4 = r7.A01;
                if ((r7.A03 & 1) == 1 && this.A03.A00 == 0) {
                    int i5 = 0;
                    i3 = 0;
                    do {
                        int i6 = i3;
                        if (i3 >= r7.A02) {
                            break;
                        }
                        i3++;
                        i2 = r7.A06[i6];
                        i5 += i2;
                    } while (i2 == 255);
                    i4 += i5;
                } else {
                    i3 = 0;
                }
                r10.A01(i4);
                this.A00 = i3;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8;
                int i10 = i3 + i8;
                r6 = this.A02;
                if (i10 >= r6.A02) {
                    break;
                }
                i8++;
                i = r6.A06[i9 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                C161457ph r72 = this.A03;
                byte[] bArr = r72.A02;
                int length = bArr.length;
                int i12 = r72.A00 + i7;
                if (length < i12) {
                    bArr = Arrays.copyOf(bArr, i12);
                    r72.A02 = bArr;
                }
                r10.A05(bArr, r72.A00, i7, false);
                r72.A0G(r72.A00 + i7);
                this.A01 = AnonymousClass001.A1X(r6.A06[i11 - 1], 255);
            }
            if (i11 == r6.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }
}
