package X;

import java.io.InputStream;

/* renamed from: X.6uM  reason: invalid class name and case insensitive filesystem */
public final class C140716uM extends InputStream {
    public long A00;
    public InputStream A01;
    public byte[] A02 = new byte[1];

    public int available() {
        return this.A01.available();
    }

    public void close() {
        this.A01.close();
    }

    public void mark(int i) {
        throw AnonymousClass001.A0e("Can't mark");
    }

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        this.A00 += (long) read;
        return read;
    }

    public void reset() {
        throw AnonymousClass001.A0e("Can't reset");
    }

    public long skip(long j) {
        long skip = this.A01.skip(j);
        this.A00 += skip;
        return skip;
    }

    public C140716uM(InputStream inputStream, long j) {
        this.A01 = inputStream;
        this.A00 = j;
    }

    public int read() {
        byte[] bArr = this.A02;
        int read = read(bArr, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return bArr[0] & 255;
        }
        throw C86604Kt.A0h("OIS unexpected return value: ", AnonymousClass001.A0o(), read);
    }

    public int read(byte[] bArr) {
        return AnonymousClass6CA.A03(this, bArr, bArr.length);
    }
}
