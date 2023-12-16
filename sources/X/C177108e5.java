package X;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.8e5  reason: invalid class name and case insensitive filesystem */
public class C177108e5 extends C140646uF {
    public static final byte[] A02 = new byte[0];
    public int A00;
    public final int A01;

    public static StringBuilder A00(C177108e5 r2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DEF length ");
        sb.append(r2.A01);
        return sb;
    }

    public byte[] A02() {
        int i = this.A00;
        if (i == 0) {
            return A02;
        }
        int i2 = this.A00;
        if (i < i2) {
            byte[] bArr = new byte[i];
            InputStream inputStream = this.A01;
            int i3 = 0;
            while (i3 < i) {
                int read = inputStream.read(bArr, i3, i - i3);
                if (read < 0) {
                    break;
                }
                i3 += read;
            }
            int i4 = i - i3;
            this.A00 = i4;
            if (i4 == 0) {
                A01();
                return bArr;
            }
            throw new EOFException(AnonymousClass000.A0Y(" object truncated by ", A00(this), i4));
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("corrupted stream - out of bounds length found: ");
        A0o.append(i);
        throw AnonymousClass002.A0C(AnonymousClass000.A0Y(" >= ", A0o, i2));
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return -1;
        }
        int read = this.A01.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.A00 - read;
            this.A00 = i4;
            if (i4 != 0) {
                return read;
            }
            A01();
            return read;
        }
        StringBuilder A002 = A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(AnonymousClass000.A0h(A002, this.A00));
    }

    public C177108e5(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        this.A01 = i;
        this.A00 = i;
        if (i == 0) {
            A01();
        }
    }

    public int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A01.read();
        if (read >= 0) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i != 0) {
                return read;
            }
            A01();
            return read;
        }
        StringBuilder A002 = A00(this);
        A002.append(" object truncated by ");
        throw new EOFException(AnonymousClass000.A0h(A002, this.A00));
    }
}
