package X;

import java.io.InputStream;

/* renamed from: X.2wW  reason: invalid class name and case insensitive filesystem */
public class C59202wW {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public final void A00(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int read = this.A00.read(bArr, i, length);
            if (read != -1) {
                i += read;
                length -= read;
            } else {
                throw AnonymousClass002.A0C("Closed before read completed!");
            }
        }
    }

    public C59202wW(InputStream inputStream) {
        this.A00 = inputStream;
    }
}
