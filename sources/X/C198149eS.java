package X;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.9eS  reason: invalid class name and case insensitive filesystem */
public class C198149eS implements Closeable {
    public static final ByteOrder A04 = ByteOrder.BIG_ENDIAN;
    public static final ByteOrder A05 = ByteOrder.LITTLE_ENDIAN;
    public int A00;
    public DataInputStream A01;
    public ByteOrder A02 = ByteOrder.BIG_ENDIAN;
    public final int A03;

    public byte A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i <= this.A03) {
            int read = this.A01.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public int A01() {
        int i = this.A00 + 4;
        this.A00 = i;
        if (i <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == A04) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw AnonymousClass002.A0C(AnonymousClass000.A0P(byteOrder, "Invalid byte order: ", AnonymousClass001.A0o()));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public int A02() {
        int i = this.A00 + 2;
        this.A00 = i;
        if (i <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == A04) {
                    return (read << 8) + read2;
                }
                throw AnonymousClass002.A0C(AnonymousClass000.A0P(byteOrder, "Invalid byte order: ", AnonymousClass001.A0o()));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public int A03(int i) {
        int min = Math.min(i, this.A03 - this.A00);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.A01.skipBytes(min - i2);
        }
        this.A00 += i2;
        return i2;
    }

    public short A04() {
        int i = this.A00 + 2;
        this.A00 = i;
        if (i <= this.A03) {
            DataInputStream dataInputStream = this.A01;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.A02;
                if (byteOrder == A05) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == A04) {
                    return (short) ((read << 8) + read2);
                }
                throw AnonymousClass002.A0C(AnonymousClass000.A0P(byteOrder, "Invalid byte order: ", AnonymousClass001.A0o()));
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public void A05(long j) {
        long j2 = (long) this.A00;
        if (j2 > j) {
            this.A00 = 0;
            DataInputStream dataInputStream = this.A01;
            dataInputStream.reset();
            dataInputStream.mark(this.A03);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (A03(i) != i) {
            throw AnonymousClass002.A0C("Couldn't seek up to the byteCount");
        }
    }

    public void A06(byte[] bArr) {
        int i = this.A00;
        int length = bArr.length;
        int i2 = i + length;
        this.A00 = i2;
        if (i2 > this.A03) {
            throw new EOFException();
        } else if (this.A01.read(bArr, 0, length) != length) {
            throw AnonymousClass002.A0C("Couldn't read up to the length of buffer");
        }
    }

    public void close() {
        this.A01.close();
    }

    public C198149eS(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A01 = dataInputStream;
        int available = dataInputStream.available();
        this.A03 = available;
        this.A00 = 0;
        this.A01.mark(available);
    }
}
