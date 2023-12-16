package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.6tM  reason: invalid class name and case insensitive filesystem */
public class C140226tM extends ByteArrayOutputStream {
    public byte[] toByteArray() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return super.toByteArray();
    }

    public C140226tM(int i) {
        super(i);
    }
}
