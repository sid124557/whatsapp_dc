package X;

import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: X.07f  reason: invalid class name and case insensitive filesystem */
public class C009207f extends AnonymousClass0FE {
    public C009207f(InputStream inputStream) {
        super(inputStream, ByteOrder.BIG_ENDIAN);
        if (inputStream.markSupported()) {
            this.A03.mark(Integer.MAX_VALUE);
            return;
        }
        throw AnonymousClass001.A0c("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }

    public void A01(long j) {
        long j2 = (long) this.A00;
        if (j2 > j) {
            this.A00 = 0;
            this.A03.reset();
        } else {
            j -= j2;
        }
        A00((int) j);
    }

    public C009207f(byte[] bArr) {
        super(bArr);
        this.A03.mark(Integer.MAX_VALUE);
    }
}
