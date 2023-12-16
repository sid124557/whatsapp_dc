package X;

import java.io.InputStream;

/* renamed from: X.8e4  reason: invalid class name and case insensitive filesystem */
public class C177098e4 extends C140646uF {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public boolean A03 = false;

    public final boolean A02() {
        if (!this.A03 && this.A02 && this.A00 == 0 && this.A01 == 0) {
            this.A03 = true;
            A01();
        }
        return this.A03;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.A02 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.A03) {
            return -1;
        }
        InputStream inputStream = this.A01;
        int read = inputStream.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[AnonymousClass6CA.A0A(bArr, this.A00, i)] = (byte) this.A01;
            this.A00 = inputStream.read();
            int read2 = inputStream.read();
            this.A01 = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw AnonymousClass6CA.A0M();
        }
        throw AnonymousClass6CA.A0M();
    }

    public C177098e4(InputStream inputStream, int i) {
        super(inputStream, i);
        this.A00 = inputStream.read();
        int read = inputStream.read();
        this.A01 = read;
        if (read >= 0) {
            A02();
            return;
        }
        throw AnonymousClass6CA.A0M();
    }

    public int read() {
        if (A02()) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A00;
            this.A00 = this.A01;
            this.A01 = read;
            return i;
        }
        throw AnonymousClass6CA.A0M();
    }
}
