package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.7kd  reason: invalid class name and case insensitive filesystem */
public final class C158837kd {
    public int A00;
    public int A01;
    public C158837kd A02;
    public C158837kd A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public C158837kd(byte[] bArr, int i, int i2) {
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = true;
        this.A04 = false;
    }

    public final C158837kd A02() {
        this.A05 = true;
        return new C158837kd(this.A06, this.A01, this.A00);
    }

    public final void A04(C158837kd r7, int i) {
        if (r7.A04) {
            int i2 = r7.A00;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!r7.A05) {
                    int i4 = r7.A01;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = r7.A06;
                        C162457s7.A0I(bArr, 0);
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        i2 = r7.A00 - r7.A01;
                        r7.A00 = i2;
                        r7.A01 = 0;
                    } else {
                        throw AnonymousClass6CA.A0N();
                    }
                } else {
                    throw AnonymousClass6CA.A0N();
                }
            }
            byte[] bArr2 = this.A06;
            int i5 = this.A01;
            byte[] bArr3 = r7.A06;
            C162457s7.A0I(bArr2, 0);
            System.arraycopy(bArr2, i5, bArr3, i2, i);
            r7.A00 += i;
            this.A01 += i;
            return;
        }
        throw AnonymousClass001.A0e("only owner can write");
    }

    public final C158837kd A01() {
        C158837kd r3 = this.A02;
        C158837kd r0 = r3;
        if (r3 == this) {
            r3 = null;
        }
        C158837kd r1 = this.A03;
        if (r1 == null) {
            throw C162457s7.A05();
        }
        r1.A02 = r0;
        C158837kd r02 = this.A02;
        if (r02 == null) {
            throw C162457s7.A05();
        }
        r02.A03 = r1;
        this.A02 = null;
        this.A03 = null;
        return r3;
    }

    public final void A03(C158837kd r2) {
        r2.A03 = this;
        r2.A02 = this.A02;
        C158837kd r0 = this.A02;
        if (r0 == null) {
            throw C162457s7.A05();
        }
        r0.A03 = r2;
        this.A02 = r2;
    }

    public static void A00(C172278Kj r1, C158837kd r2) {
        r1.A01 = r2.A01();
        C161197pC.A01(r2);
    }

    public C158837kd() {
        this.A06 = new byte[DefaultCrypto.BUFFER_SIZE];
        this.A04 = true;
        this.A05 = false;
    }
}
