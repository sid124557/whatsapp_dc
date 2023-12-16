package X;

import java.io.OutputStream;

/* renamed from: X.7l2  reason: invalid class name and case insensitive filesystem */
public class C159057l2 {
    public OutputStream A00;

    public final void A00(int i) {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            OutputStream outputStream = this.A00;
            outputStream.write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                outputStream.write((byte) (i >> i4));
            }
            return;
        }
        this.A00.write((byte) i);
    }

    public final void A01(int i, int i2, boolean z) {
        if (!z) {
            return;
        }
        if (i2 < 31) {
            this.A00.write(i | i2);
            return;
        }
        OutputStream outputStream = this.A00;
        outputStream.write(31 | i);
        if (i2 < 128) {
            outputStream.write(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            AnonymousClass6C8.A0u(i2 & 127, bArr, 128, i3);
        } while (i2 > 127);
        outputStream.write(bArr, i3, 5 - i3);
    }

    public void A02(C177088e3 r2, boolean z) {
        C177088e3 A0O;
        if (this instanceof C176668dN) {
            A0O = r2.A0P();
        } else if (this instanceof C176678dO) {
            A0O = r2.A0O();
        } else {
            r2.A0Q(this, z);
            return;
        }
        A0O.A0Q(this, z);
    }

    public final void A03(byte[] bArr, int i, boolean z) {
        if (z) {
            this.A00.write(i);
        }
        int length = bArr.length;
        A00(length);
        this.A00.write(bArr, 0, length);
    }

    public final void A04(C183618qL[] r6, int i, boolean z) {
        if (z) {
            this.A00.write(i);
        }
        OutputStream outputStream = this.A00;
        outputStream.write(128);
        for (C183618qL Bqk : r6) {
            A02(Bqk.Bqk(), true);
        }
        outputStream.write(0);
        outputStream.write(0);
    }

    public C159057l2(OutputStream outputStream) {
        this.A00 = outputStream;
    }
}
