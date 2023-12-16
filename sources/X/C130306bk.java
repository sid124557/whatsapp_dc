package X;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UnsafeUtil;
import java.io.OutputStream;

/* renamed from: X.6bk  reason: invalid class name and case insensitive filesystem */
public final class C130306bk extends CodedOutputStream {
    public int A00;
    public int A01;
    public final int A02;
    public final OutputStream A03;
    public final byte[] A04;

    public static void A00(long j, byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (((int) (j >> i)) & 255);
    }

    public final void A0L() {
        this.A03.write(this.A04, 0, this.A00);
        this.A00 = 0;
    }

    public final void A0M(int i) {
        byte[] bArr = this.A04;
        int i2 = this.A00;
        int i3 = i2 + 1;
        AnonymousClass6C9.A1G(bArr, i, i2);
        int i4 = i3 + 1;
        AnonymousClass6C9.A1G(bArr, i >> 8, i3);
        int i5 = i4 + 1;
        AnonymousClass6C9.A1G(bArr, i >> 16, i4);
        this.A00 = i5 + 1;
        AnonymousClass6C9.A1G(bArr, i >> 24, i5);
        this.A01 += 4;
    }

    public final void A0N(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (CodedOutputStream.A02) {
            long j2 = (long) this.A00;
            while (true) {
                int i4 = i & -128;
                bArr2 = this.A04;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = (long) i5;
                if (i4 == 0) {
                    break;
                }
                UnsafeUtil.A07(bArr2, (byte) ((i & 127) | 128), j);
                i >>>= 7;
            }
            UnsafeUtil.A07(bArr2, (byte) i, j);
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = i & -128;
                bArr = this.A04;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                AnonymousClass6C9.A1H(bArr, i, i2);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0O(int i) {
        if (this.A02 - this.A00 < i) {
            A0L();
        }
    }

    public final void A0P(long j) {
        byte[] bArr = this.A04;
        int i = this.A00;
        int i2 = i + 1;
        int A0D = AnonymousClass6CA.A0D(bArr, (int) (j & 255), i, i2);
        int A0D2 = AnonymousClass6CA.A0D(bArr, (int) ((j >> 8) & 255), i2, A0D);
        int A0D3 = AnonymousClass6CA.A0D(bArr, (int) ((j >> 16) & 255), A0D, A0D2);
        int A0D4 = AnonymousClass6CA.A0D(bArr, (int) (255 & (j >> 24)), A0D2, A0D3);
        A00(j, bArr, 32, A0D3);
        int i3 = A0D4 + 1;
        A00(j, bArr, 40, A0D4);
        int i4 = i3 + 1;
        A00(j, bArr, 48, i3);
        this.A00 = i4 + 1;
        A00(j, bArr, 56, i4);
        this.A01 += 8;
    }

    public final void A0Q(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        int i4;
        if (CodedOutputStream.A02) {
            long j2 = (long) this.A00;
            while (true) {
                int i5 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr2 = this.A04;
                i4 = this.A00;
                this.A00 = i4 + 1;
                if (i5 == 0) {
                    break;
                }
                UnsafeUtil.A07(bArr2, (byte) ((((int) j) & 127) | 128), (long) i4);
                j >>>= 7;
            }
            UnsafeUtil.A07(bArr2, (byte) ((int) j), (long) i4);
            i3 = this.A01 + ((int) (((long) this.A00) - j2));
        } else {
            while (true) {
                int i6 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                bArr = this.A04;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (i6 == 0) {
                    break;
                }
                AnonymousClass6C9.A1H(bArr, i2, i);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public void A0R(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.A04, i4, i2);
            this.A00 += i2;
        } else {
            byte[] bArr2 = this.A04;
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            this.A00 = i3;
            this.A01 += i5;
            A0L();
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                this.A00 = i2;
            } else {
                this.A03.write(bArr, i6, i2);
            }
        }
        this.A01 += i2;
    }

    public C130306bk(OutputStream outputStream, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A04 = new byte[max];
            this.A02 = max;
            if (outputStream != null) {
                this.A03 = outputStream;
                return;
            }
            throw AnonymousClass001.A0g("out");
        }
        throw AnonymousClass001.A0c("bufferSize must be >= 0");
    }
}
