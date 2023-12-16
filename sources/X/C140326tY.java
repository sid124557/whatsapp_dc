package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* renamed from: X.6tY  reason: invalid class name and case insensitive filesystem */
public class C140326tY extends FilterInputStream {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02;
    public final byte[] A03 = new byte[DefaultCrypto.BUFFER_SIZE];

    public String A00() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return C18290x4.A0t(bArr);
    }

    public long skip(long j) {
        byte[] bArr = this.A03;
        return (long) AnonymousClass6CA.A03(this, bArr, AnonymousClass6CA.A02((long) bArr.length, j));
    }

    public C140326tY(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream);
        this.A02 = messageDigest;
    }

    public void close() {
        super.close();
    }

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.A01 = null;
            this.A02.update(bArr, i, read);
            this.A00 += (long) read;
        }
        return read;
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
