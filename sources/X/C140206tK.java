package X;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: X.6tK  reason: invalid class name and case insensitive filesystem */
public final class C140206tK extends BufferedOutputStream {
    public boolean A00;

    public void close() {
        this.A00 = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
            if (th == null) {
                return;
            }
        } catch (Throwable th2) {
            if (th == null) {
                throw th2;
            }
        }
        throw th;
    }

    public void A00(OutputStream outputStream) {
        C159197lM.A02(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    public C140206tK(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
