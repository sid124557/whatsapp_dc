package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: X.1zo  reason: invalid class name and case insensitive filesystem */
public class C36741zo extends FilterOutputStream {
    public void write(byte[] bArr, int i, int i2) {
        if (i2 < 16777216) {
            this.out.write(AnonymousClass36A.A02(i2));
            this.out.write(bArr, i, i2);
            this.out.flush();
            return;
        }
        throw new C36771zr(AnonymousClass000.A0Y("data too large to write; length=", AnonymousClass001.A0o(), i2), i2);
    }

    public C36741zo(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
