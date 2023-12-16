package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.8KP  reason: invalid class name */
public final class AnonymousClass8KP implements Closeable {
    public final InputStream[] A00;
    public final /* synthetic */ C172228Ke A01;

    public AnonymousClass8KP(C172228Ke r1, InputStream[] inputStreamArr) {
        this.A01 = r1;
        this.A00 = inputStreamArr;
    }

    public void close() {
        for (InputStream A03 : this.A00) {
            C172228Ke.A03(A03);
        }
    }
}
