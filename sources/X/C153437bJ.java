package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.7bJ  reason: invalid class name and case insensitive filesystem */
public final class C153437bJ {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[65536];
    public final long A04;
    public final C185788uF A05;
    public final byte[] A06 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];

    public void A01(int i) {
        int min = Math.min(this.A00, i);
        A02(min);
        while (min < i) {
            if (min != -1) {
                byte[] bArr = this.A06;
                min = A00(bArr, -min, Math.min(i, bArr.length + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
    }

    public void A03(byte[] bArr, int i, int i2) {
        if (A04(i2, false)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    public boolean A04(int i, boolean z) {
        int i2 = i;
        int i3 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i3 > length) {
            this.A03 = Arrays.copyOf(bArr, AnonymousClass001.A0D(length * 2, i3 + 524288, 65536 + i3));
        }
        int i4 = this.A00;
        int i5 = this.A01;
        int i6 = i4 - i5;
        while (i6 < i) {
            i6 = A00(this.A03, i5, i2, i6, z);
            if (i6 == -1) {
                return false;
            }
            i5 = this.A01;
            this.A00 = i5 + i6;
        }
        this.A01 = i5 + i;
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.A00;
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.A03, 0, bArr, i, i3);
            A02(i3);
        }
        while (true) {
            if (i3 < i2) {
                if (i3 == -1) {
                    break;
                }
                i3 = A00(bArr2, i5, i6, i3, z);
            } else if (i3 != -1) {
                this.A02 += (long) i3;
                if (i3 == -1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void A02(int i) {
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        byte[] bArr2 = bArr;
        if (i2 < bArr.length - 524288) {
            bArr2 = new byte[(65536 + i2)];
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.A03 = bArr2;
    }

    public C153437bJ(C185788uF r2, long j, long j2) {
        this.A05 = r2;
        this.A02 = j;
        this.A04 = j2;
    }

    public final int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw AnonymousClass6CA.A0M();
        }
        throw new InterruptedIOException();
    }
}
