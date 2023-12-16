package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.0F9  reason: invalid class name */
public final class AnonymousClass0F9 extends ByteArrayOutputStream {
    public byte[] A00() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return toByteArray();
    }

    public AnonymousClass0F9(int i) {
        super(i);
    }
}
