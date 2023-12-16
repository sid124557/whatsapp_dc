package X;

import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

/* renamed from: X.8SR  reason: invalid class name */
public final class AnonymousClass8SR extends DigestOutputStream {
    public boolean A00;

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            super.close();
        }
    }

    public AnonymousClass8SR(OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
    }
}
