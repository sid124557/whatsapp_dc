package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: X.86d  reason: invalid class name and case insensitive filesystem */
public final class C1686286d implements C187648xa {
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03 = new byte[65536];
    public final long A04;
    public final C180768lb A05;
    public final byte[] A06 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];

    public boolean A03(int i, boolean z) {
        int i2 = i;
        A01(i);
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        while (i5 < i) {
            i5 = A00(this.A03, i4, i2, i5, z);
            if (i5 == -1) {
                return false;
            }
            i4 = this.A01;
            this.A00 = i4 + i5;
        }
        this.A01 = i4 + i;
        return true;
    }

    public void Awu(int i) {
        A03(i, false);
    }

    public int BgZ(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        A01(i2);
        int i5 = this.A00;
        int i6 = this.A01;
        int i7 = i5 - i6;
        if (i7 == 0) {
            i3 = A00(this.A03, i6, i4, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.A00 += i3;
        } else {
            i3 = Math.min(i2, i7);
        }
        System.arraycopy(this.A03, this.A01, bArr, i, i3);
        this.A01 += i3;
        return i3;
    }

    public void Bgd(byte[] bArr, int i, int i2) {
        Bge(bArr, i, i2, false);
    }

    public boolean BiM(byte[] bArr, int i, int i2, boolean z) {
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

    public void Bjy() {
        this.A01 = 0;
    }

    public int BpM(int i) {
        int min = Math.min(this.A00, 1);
        A02(min);
        if (min == 0) {
            byte[] bArr = this.A06;
            min = A00(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.A02 += (long) min;
        }
        return min;
    }

    public void BpP(int i) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r4 == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            r5 = r11
            int r0 = r11.A00
            r9 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L_0x0017
            int r4 = java.lang.Math.min(r0, r14)
            byte[] r0 = r11.A03
            java.lang.System.arraycopy(r0, r9, r12, r13, r4)
            r11.A02(r4)
            if (r4 != 0) goto L_0x001c
        L_0x0017:
            r10 = 1
            int r4 = r5.A00(r6, r7, r8, r9, r10)
        L_0x001c:
            r0 = -1
            if (r4 == r0) goto L_0x0025
            long r2 = r11.A02
            long r0 = (long) r4
            long r2 = r2 + r0
            r11.A02 = r2
        L_0x0025:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686286d.read(byte[], int, int):int");
    }

    public void readFully(byte[] bArr, int i, int i2) {
        BiM(bArr, i, i2, false);
    }

    public final void A01(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, AnonymousClass001.A0D(length * 2, i2 + 524288, 65536 + i2));
        }
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

    public long BBF() {
        return this.A02 + ((long) this.A01);
    }

    public long BBW() {
        return this.A02;
    }

    public long getLength() {
        return this.A04;
    }

    public C1686286d(C180768lb r2, long j, long j2) {
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

    public boolean Bge(byte[] bArr, int i, int i2, boolean z) {
        if (!A03(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }
}
