package X;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: X.8SM  reason: invalid class name */
public class AnonymousClass8SM extends URLConnection {
    public byte[] A00;

    public void connect() {
    }

    public InputStream getInputStream() {
        return AnonymousClass0x9.A0d(this.A00);
    }

    public AnonymousClass8SM(URL url, byte[] bArr) {
        super(url);
        this.A00 = bArr;
    }
}
