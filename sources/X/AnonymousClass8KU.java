package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.8KU  reason: invalid class name */
public class AnonymousClass8KU implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C172208Kc A05;

    public AnonymousClass8KU(C172208Kc r3, InputStream inputStream, Charset charset) {
        this.A05 = r3;
        if (charset == null) {
            throw null;
        } else if (charset.equals(C172208Kc.A0F)) {
            this.A03 = inputStream;
            this.A04 = charset;
            this.A02 = new byte[DefaultCrypto.BUFFER_SIZE];
        } else {
            throw AnonymousClass001.A0c("Unsupported encoding");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3[r2] == 13) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r8 = this;
            java.io.InputStream r5 = r8.A03
            monitor-enter(r5)
            byte[] r2 = r8.A02     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x008c
            int r6 = r8.A01     // Catch:{ all -> 0x0098 }
            int r1 = r8.A00     // Catch:{ all -> 0x0098 }
            if (r6 < r1) goto L_0x001a
            int r0 = r2.length     // Catch:{ all -> 0x0098 }
            r6 = 0
            int r1 = r5.read(r2, r6, r0)     // Catch:{ all -> 0x0098 }
            r0 = -1
            if (r1 == r0) goto L_0x0093
            r8.A01 = r6     // Catch:{ all -> 0x0098 }
            r8.A00 = r1     // Catch:{ all -> 0x0098 }
        L_0x001a:
            r4 = r6
        L_0x001b:
            r7 = 10
            if (r4 == r1) goto L_0x0048
            byte[] r3 = r8.A02     // Catch:{ all -> 0x0098 }
            byte r0 = r3[r4]     // Catch:{ all -> 0x0098 }
            if (r0 != r7) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0029:
            if (r4 == r6) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = r4
            goto L_0x0036
        L_0x002e:
            int r2 = r4 + -1
            byte r1 = r3[r2]     // Catch:{ all -> 0x0098 }
            r0 = 13
            if (r1 != r0) goto L_0x002c
        L_0x0036:
            int r2 = r2 - r6
            java.nio.charset.Charset r0 = r8.A04     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0098 }
            r1.<init>(r3, r6, r2, r0)     // Catch:{ all -> 0x0098 }
            int r0 = r4 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            return r1
        L_0x0048:
            int r1 = r1 - r6
            int r0 = r1 + 80
            X.6tN r6 = new X.6tN     // Catch:{ all -> 0x0098 }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x0098 }
        L_0x0050:
            byte[] r2 = r8.A02     // Catch:{ all -> 0x0098 }
            int r1 = r8.A01     // Catch:{ all -> 0x0098 }
            int r0 = r8.A00     // Catch:{ all -> 0x0098 }
            int r0 = r0 - r1
            r6.write(r2, r1, r0)     // Catch:{ all -> 0x0098 }
            r2 = -1
            r8.A00 = r2     // Catch:{ all -> 0x0098 }
            byte[] r1 = r8.A02     // Catch:{ all -> 0x0098 }
            int r0 = r1.length     // Catch:{ all -> 0x0098 }
            r4 = 0
            int r3 = r5.read(r1, r4, r0)     // Catch:{ all -> 0x0098 }
            if (r3 == r2) goto L_0x0087
            r8.A01 = r4     // Catch:{ all -> 0x0098 }
            r8.A00 = r3     // Catch:{ all -> 0x0098 }
            r2 = 0
        L_0x006c:
            if (r2 == r3) goto L_0x0050
            byte[] r1 = r8.A02     // Catch:{ all -> 0x0098 }
            byte r0 = r1[r2]     // Catch:{ all -> 0x0098 }
            if (r0 != r7) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0078:
            if (r2 == r4) goto L_0x007d
            r6.write(r1, r4, r2)     // Catch:{ all -> 0x0098 }
        L_0x007d:
            int r0 = r2 + 1
            r8.A01 = r0     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            return r0
        L_0x0087:
            java.io.EOFException r0 = X.AnonymousClass6CA.A0M()     // Catch:{ all -> 0x0098 }
            goto L_0x0097
        L_0x008c:
            java.lang.String r0 = "LineReader is closed"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x0098 }
            goto L_0x0097
        L_0x0093:
            java.io.EOFException r0 = X.AnonymousClass6CA.A0M()     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KU.A00():java.lang.String");
    }

    public void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
