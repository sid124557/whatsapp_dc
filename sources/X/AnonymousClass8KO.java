package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.8KO  reason: invalid class name */
public class AnonymousClass8KO implements Closeable {
    public final C147667Fe A00;
    public final InputStream A01;

    public void close() {
        this.A01.close();
    }

    public AnonymousClass8KO(C147667Fe r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }
}
