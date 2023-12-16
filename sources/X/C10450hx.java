package X;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: X.0hx  reason: invalid class name and case insensitive filesystem */
public class C10450hx implements Closeable {
    public final HttpURLConnection A00;

    public void close() {
        this.A00.disconnect();
    }

    public C10450hx(HttpURLConnection httpURLConnection) {
        this.A00 = httpURLConnection;
    }
}
