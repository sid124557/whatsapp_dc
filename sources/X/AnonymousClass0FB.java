package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: X.0FB  reason: invalid class name */
public class AnonymousClass0FB extends FilterOutputStream {
    public ByteOrder A00;
    public final OutputStream A01;

    public void A00(int i) {
        OutputStream outputStream;
        int i2;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((i >>> 0) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            i2 = i >>> 24;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((i >>> 24) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 8) & 255);
            i2 = i >>> 0;
        } else {
            return;
        }
        outputStream.write(i2 & 255);
    }

    public void A01(short s) {
        OutputStream outputStream;
        int i;
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((s >>> 0) & 255);
            i = s >>> 8;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream = this.A01;
            outputStream.write((s >>> 8) & 255);
            i = s >>> 0;
        } else {
            return;
        }
        outputStream.write(i & 255);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }

    public AnonymousClass0FB(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.A01 = outputStream;
        this.A00 = byteOrder;
    }

    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }
}
