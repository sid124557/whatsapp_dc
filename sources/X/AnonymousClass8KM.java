package X;

import java.io.Closeable;

/* renamed from: X.8KM  reason: invalid class name */
public final class AnonymousClass8KM implements Closeable {
    public int A00;
    public final C172258Kh A01;

    public void close() {
        this.A01.close();
    }

    public AnonymousClass8KM(C172258Kh r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
