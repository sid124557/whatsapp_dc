package X;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: X.8KN  reason: invalid class name */
public final class AnonymousClass8KN implements Closeable {
    public FileOutputStream A00;
    public FileLock A01;

    public void close() {
        try {
            FileLock fileLock = this.A01;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.A00.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8KN(java.io.File r3, boolean r4) {
        /*
            r2 = this;
            r2.<init>()
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r3)
            r2.A00 = r0
            if (r4 == 0) goto L_0x0016
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0014 }
            java.nio.channels.FileLock r1 = r0.tryLock()     // Catch:{ IOException -> 0x0014 }
            goto L_0x001e
        L_0x0014:
            r1 = 0
            goto L_0x0020
        L_0x0016:
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x0028 }
            java.nio.channels.FileLock r1 = r0.lock()     // Catch:{ all -> 0x0028 }
        L_0x001e:
            if (r1 != 0) goto L_0x0025
        L_0x0020:
            java.io.FileOutputStream r0 = r2.A00
            r0.close()
        L_0x0025:
            r2.A01 = r1
            return
        L_0x0028:
            r1 = move-exception
            java.io.FileOutputStream r0 = r2.A00
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KN.<init>(java.io.File, boolean):void");
    }
}
