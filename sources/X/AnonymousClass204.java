package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* renamed from: X.204  reason: invalid class name */
public class AnonymousClass204 extends RandomAccessFile {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02 = AnonymousClass0x7.A0t();

    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        A01(getFilePointer() - ((long) read), bArr, i, read);
        return read;
    }

    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        A01(getFilePointer() - ((long) i2), bArr, i, i2);
    }

    public String A00() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            seek(this.A00);
            do {
            } while (read(new byte[DefaultCrypto.BUFFER_SIZE], 0, DefaultCrypto.BUFFER_SIZE) != -1);
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return C18290x4.A0t(bArr);
    }

    public final void A01(long j, byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            long j2 = this.A00;
            if (j2 >= j && j2 < ((long) i2) + j) {
                this.A01 = null;
                int i3 = ((int) (j - j2)) + i2;
                this.A02.update(bArr, (i + i2) - i3, i3);
                this.A00 += (long) i3;
                long length = length();
                long j3 = this.A00;
                if (j3 > length) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ShaPosition crossed EOF. (This may be a write sync timing issue) shaUpdatedTillPosition=");
                    A0o.append(j3);
                    C18260x0.A10(" lengthOfFile=", A0o, length);
                }
            }
        }
    }

    public AnonymousClass204(File file, String str) {
        super(file, str);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
