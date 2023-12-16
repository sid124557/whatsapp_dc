package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.8KQ  reason: invalid class name */
public final class AnonymousClass8KQ implements Closeable {
    public final long[] A00;
    public final InputStream[] A01;
    public final /* synthetic */ C172208Kc A02;

    public AnonymousClass8KQ(C172208Kc r1, long[] jArr, InputStream[] inputStreamArr) {
        this.A02 = r1;
        this.A01 = inputStreamArr;
        this.A00 = jArr;
    }

    public void close() {
        for (InputStream A012 : this.A01) {
            C172208Kc.A01(A012);
        }
    }
}
