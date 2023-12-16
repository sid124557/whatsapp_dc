package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.8Kf  reason: invalid class name and case insensitive filesystem */
public class C172238Kf implements Closeable, C184808sY {
    public ByteBuffer A00;
    public final int A01;

    public synchronized void close() {
        this.A00 = null;
    }

    public synchronized boolean isClosed() {
        return AnonymousClass000.A1X(this.A00);
    }

    public int BD5() {
        return this.A01;
    }

    public C172238Kf(int i) {
        this.A00 = ByteBuffer.allocateDirect(i);
        this.A01 = i;
    }
}
