package X;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: X.6tW  reason: invalid class name and case insensitive filesystem */
public class C140306tW extends FilterInputStream {
    public int A00;
    public int A01;
    public final byte[] A02;

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.A00 = this.A01;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            read = 0;
            if (i2 != 0) {
                while (read < i2) {
                    int i3 = this.A01;
                    byte[] bArr2 = this.A02;
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    this.A01 = i3 + 1;
                    byte b = bArr2[i3] & 255;
                    if (b == -1) {
                        break;
                    }
                    read = AnonymousClass6CA.A0D(bArr, b, i + read, read);
                }
                if (read > 0) {
                    return read;
                }
                return -1;
            }
        }
        return read;
    }

    public void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.A01 = this.A00;
            return;
        }
        throw AnonymousClass002.A0C("mark is not supported");
    }

    public C140306tW(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.A02 = bArr;
    }

    public int read() {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        int i = this.A01;
        byte[] bArr = this.A02;
        if (i >= bArr.length) {
            return -1;
        }
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public int read(byte[] bArr) {
        return AnonymousClass6CA.A03(this, bArr, bArr.length);
    }
}
