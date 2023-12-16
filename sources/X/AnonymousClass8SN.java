package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: X.8SN  reason: invalid class name */
public class AnonymousClass8SN extends URLStreamHandler {
    public byte[] A00;

    public URLConnection openConnection(URL url) {
        return new AnonymousClass8SM(url, this.A00);
    }

    public AnonymousClass8SN(byte[] bArr) {
        this.A00 = bArr;
    }
}
