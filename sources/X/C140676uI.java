package X;

import java.io.InputStream;

/* renamed from: X.6uI  reason: invalid class name and case insensitive filesystem */
public class C140676uI extends InputStream {
    public boolean A00 = false;
    public final InputStream A01;
    public final AnonymousClass8QX A02;
    public final AnonymousClass8QW A03;

    public void close() {
        this.A01.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A00) {
            return -1;
        }
        byte[] bArr2 = bArr;
        int i3 = i;
        int read = this.A01.read(bArr, i, i2);
        if (read == -1) {
            this.A03.B24(bArr, i);
            this.A00 = true;
            return 16;
        }
        if (read > 0) {
            this.A02.A03(bArr2, bArr, i3, read, i);
            this.A03.update(bArr, i, read);
        }
        return read;
    }

    public C140676uI(InputStream inputStream, byte[] bArr, byte[] bArr2) {
        AnonymousClass8QW r1 = new AnonymousClass8QW();
        this.A03 = r1;
        this.A01 = inputStream;
        AnonymousClass8QX A002 = C159457lr.A00(bArr, bArr2);
        this.A02 = A002;
        byte[] bArr3 = new byte[32];
        A002.A03(bArr3, bArr3, 0, 32, 0);
        r1.BFu(new AnonymousClass8QN(bArr3));
    }

    public int read() {
        byte[] bArr = new byte[1];
        while (true) {
            int read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
            if (read != 0) {
                return bArr[0];
            }
            Thread.yield();
        }
    }

    public int read(byte[] bArr) {
        return AnonymousClass6CA.A03(this, bArr, bArr.length);
    }
}
