package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.1zx  reason: invalid class name and case insensitive filesystem */
public class C36831zx extends InputStream {
    public ByteArrayInputStream A00;
    public boolean A01;
    public final InputStream A02;
    public final Cipher A03;
    public final Mac A04;

    public void close() {
        this.A02.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4.A01 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
            java.io.ByteArrayInputStream r0 = r4.A00
            r3 = -1
            if (r0 == 0) goto L_0x0013
            int r2 = r0.read(r5, r6, r7)
            if (r2 > 0) goto L_0x007d
            r0 = 0
            r4.A00 = r0
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return r3
        L_0x0013:
            java.io.InputStream r0 = r4.A02
            int r2 = r0.read(r5, r6, r7)
            if (r2 != r3) goto L_0x0022
            r0 = 42
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            goto L_0x0039
        L_0x0022:
            if (r2 <= 0) goto L_0x007d
            javax.crypto.Cipher r0 = r4.A03
            byte[] r1 = r0.update(r5, r6, r2)
            r3 = 0
            if (r1 == 0) goto L_0x0012
            javax.crypto.Mac r0 = r4.A04
            r0.update(r1)
            int r2 = r1.length
            if (r2 > r7) goto L_0x0071
            java.lang.System.arraycopy(r1, r3, r5, r6, r2)
            return r2
        L_0x0039:
            javax.crypto.Cipher r0 = r4.A03     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x006b }
            byte[] r1 = r0.doFinal()     // Catch:{ BadPaddingException | IllegalBlockSizeException -> 0x006b }
            r2.put(r1)
            javax.crypto.Mac r0 = r4.A04
            byte[] r1 = r0.doFinal(r1)
            r0 = 10
            byte[] r0 = X.C18320x8.A1Z(r1, r0)
            r2.put(r0)
            r2.flip()
            int r0 = r2.remaining()
            byte[] r0 = new byte[r0]
            r2.get(r0)
            java.io.ByteArrayInputStream r1 = X.AnonymousClass0x9.A0d(r0)
            r4.A00 = r1
            r0 = 1
            r4.A01 = r0
            int r0 = r1.read(r5, r6, r7)
            return r0
        L_0x006b:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0071:
            java.lang.System.arraycopy(r1, r3, r5, r6, r7)
            int r2 = r2 - r7
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1, r7, r2)
            r4.A00 = r0
            return r7
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36831zx.read(byte[], int, int):int");
    }

    public C36831zx(C42162Na r5, InputStream inputStream) {
        this.A02 = inputStream;
        byte[] bArr = r5.A01;
        this.A03 = AnonymousClass31R.A01(bArr, r5.A00, 1);
        this.A04 = AnonymousClass31R.A02(bArr, r5.A02);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
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
}
