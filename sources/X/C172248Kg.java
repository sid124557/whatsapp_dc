package X;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.8Kg  reason: invalid class name and case insensitive filesystem */
public class C172248Kg implements Closeable, C184808sY {
    public SharedMemory A00;
    public ByteBuffer A01;

    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory sharedMemory = this.A00;
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            ByteBuffer byteBuffer = this.A01;
            if (byteBuffer != null) {
                SharedMemory.unmap(byteBuffer);
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A00 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            android.os.SharedMemory r1 = r2.A00     // Catch:{ all -> 0x000d }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172248Kg.isClosed():boolean");
    }

    public int BD5() {
        this.A00.getClass();
        return this.A00.getSize();
    }

    public C172248Kg(int i) {
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.A00 = create;
            this.A01 = create.mapReadWrite();
        } catch (ErrnoException e) {
            throw AnonymousClass6CA.A0Q("Fail to create AshmemMemory", e);
        }
    }

    public C172248Kg() {
        this.A00 = null;
        this.A01 = null;
    }
}
