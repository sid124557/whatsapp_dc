package X;

import java.io.InputStream;

/* renamed from: X.6uK  reason: invalid class name and case insensitive filesystem */
public class C140696uK extends InputStream {
    public C140726uO A00 = new C140726uO();
    public C179538jJ A01;

    public synchronized void mark(int i) {
        this.A00.mark(i);
    }

    public synchronized void reset() {
        this.A00.reset();
    }

    public int available() {
        return this.A00.available();
    }

    public void close() {
        this.A00.close();
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        r8.A0C(new javax.net.ssl.SSLException(X.AnonymousClass6C8.A0h(r0)), (byte) 2, (byte) 80, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0123, code lost:
        r8.A0C(r0.ex, (byte) 2, r0.description, r0.errorTransient);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r12 = r19
            r10 = r21
            r11 = r20
            if (r19 == 0) goto L_0x0170
            r9 = 0
            if (r21 == 0) goto L_0x016f
            int r1 = r20 + r21
            int r0 = r12.length
            if (r1 <= r0) goto L_0x0017
            java.lang.String r0 = "Not enough space in destination buffer."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0017:
            r1 = r18
            X.6uO r13 = r1.A00
            int r0 = r13.available()
            if (r0 <= 0) goto L_0x0037
            int r3 = java.lang.Math.min(r10, r0)
            int r2 = r13.read(r12, r11, r3)
            if (r2 > r3) goto L_0x014e
            int r11 = r11 + r3
            int r10 = r10 - r3
            int r9 = r9 + r3
        L_0x002e:
            int r0 = r13.available()
            if (r0 == 0) goto L_0x016f
            if (r9 < r10) goto L_0x0017
            return r9
        L_0x0037:
            X.8jJ r8 = r1.A01
            X.8U6 r8 = (X.AnonymousClass8U6) r8
            boolean r0 = r8.A0E
            r7 = 80
            r6 = 0
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x00f8
            X.8Hn r1 = r8.A04
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x00f8
            java.util.List r0 = r1.A0R
            if (r0 == 0) goto L_0x00f8
            java.util.List r0 = r1.A0S
            if (r0 == 0) goto L_0x00f8
            r1.A0Y = r6     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.7Rf r2 = r8.A08     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.6ms r0 = new X.6ms     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r2.A00(r0)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r8.A06()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.8Hn r1 = r8.A04     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            boolean r0 = r1.A0f     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r16 = 0
            if (r0 != 0) goto L_0x00a1
            java.util.List r0 = r1.A0R     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r2 = 0
        L_0x0077:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.7T8 r14 = (X.AnonymousClass7T8) r14     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            long r2 = r2 + r0
            X.7Rf r1 = r8.A08     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.6mm r0 = new X.6mm     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r1.A00(r0)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            goto L_0x0077
        L_0x0092:
            X.6wR r14 = X.C141976wR.DEBUG     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.lang.String r0 = "Replayed early data len = "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.C155097eH.A00(r14, r0)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
        L_0x00a1:
            X.8Hn r0 = r8.A04     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.util.List r0 = r0.A0S     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r2 = 0
        L_0x00ab:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.7T8 r14 = (X.AnonymousClass7T8) r14     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            long r2 = r2 + r0
            X.7Rf r1 = r8.A08     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.6mm r0 = new X.6mm     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            r1.A00(r0)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            goto L_0x00ab
        L_0x00c6:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            X.6wR r14 = X.C141976wR.DEBUG     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            java.lang.String r0 = "Spillover early data len = "
            java.lang.String r0 = X.AnonymousClass000.A0Z(r0, r1, r2)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            X.C155097eH.A00(r14, r0)     // Catch:{ IOException -> 0x0165, 6zV -> 0x00e8, Exception -> 0x00da }
            goto L_0x00f2
        L_0x00da:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass6C8.A0h(r0)     // Catch:{ all -> 0x0167 }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0167 }
            r0.<init>(r1)     // Catch:{ all -> 0x0167 }
            r8.A0C(r0, r5, r7, r6)     // Catch:{ all -> 0x0167 }
            goto L_0x00f2
        L_0x00e8:
            r0 = move-exception
            byte r2 = r0.description     // Catch:{ all -> 0x0167 }
            boolean r1 = r0.errorTransient     // Catch:{ all -> 0x0167 }
            javax.net.ssl.SSLException r0 = r0.ex     // Catch:{ all -> 0x0167 }
            r8.A0C(r0, r5, r2, r1)     // Catch:{ all -> 0x0167 }
        L_0x00f2:
            X.8Hn r0 = r8.A04
            r0.A0R = r4
            r0.A0S = r4
        L_0x00f8:
            X.8Hn r0 = r8.A04     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            X.7aO r2 = r0.A0A     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            monitor-enter(r2)     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            X.7EH r1 = r2.A01()     // Catch:{ all -> 0x0111 }
            monitor-exit(r2)     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            r4 = r1
            boolean r0 = r1 instanceof X.C136606mw     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            if (r0 != 0) goto L_0x012c
            boolean r0 = r1 instanceof X.C136486mk     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            if (r0 != 0) goto L_0x0142
            X.7Rf r0 = r8.A08     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            r0.A00(r1)     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            goto L_0x012c
        L_0x0111:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
            throw r0     // Catch:{ 6zV -> 0x0122, Exception -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            java.lang.Throwable r1 = X.AnonymousClass6C8.A0h(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            r8.A0C(r0, r5, r7, r6)
            goto L_0x012c
        L_0x0122:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            r8.A0C(r0, r5, r2, r1)
        L_0x012c:
            X.7N5 r0 = X.C1462579j.A00
            java.lang.Class r1 = r0.getClass()
            X.7Rf r0 = r8.A08
            X.7L9 r0 = r0.A00
            X.7N5 r0 = r0.A00
            boolean r0 = r1.isInstance(r0)
            if (r0 == 0) goto L_0x0142
            boolean r0 = r4 instanceof X.C136496ml
            if (r0 == 0) goto L_0x00f8
        L_0x0142:
            boolean r0 = r4 instanceof X.C136486mk
            if (r0 == 0) goto L_0x002e
            r8.A0B(r4)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()
            throw r0
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Read returned more than requested bytes. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " > "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x0165:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r1 = move-exception
            X.8Hn r0 = r8.A04
            r0.A0R = r4
            r0.A0S = r4
            throw r1
        L_0x016f:
            return r9
        L_0x0170:
            java.lang.String r0 = "Buffer is null"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140696uK.read(byte[], int, int):int");
    }

    public long skip(long j) {
        return this.A00.skip(j);
    }

    public C140696uK(C179538jJ r2) {
        this.A01 = r2;
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw AnonymousClass002.A0C("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw AnonymousClass002.A0C("Buffer is null.");
    }
}
