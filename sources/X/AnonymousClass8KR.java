package X;

import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

/* renamed from: X.8KR  reason: invalid class name */
public final class AnonymousClass8KR implements Closeable {
    public Task A00;
    public final URL A01;
    public volatile InputStream A02;

    public final void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    C154897dv.A00.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw AnonymousClass0x9.A0i(e2);
                }
            }
        }
    }

    public AnonymousClass8KR(URL url) {
        this.A01 = url;
    }
}
