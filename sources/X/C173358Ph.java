package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* renamed from: X.8Ph  reason: invalid class name and case insensitive filesystem */
public final class C173358Ph implements C188078yH {
    public final InputStream A00;
    public final AnonymousClass7Qz A01;

    public long BiH(C172278Kj r6, long j) {
        String message;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                if (!Thread.interrupted()) {
                    C158837kd A07 = r6.A07(1);
                    int i2 = A07.A00;
                    int read = this.A00.read(A07.A06, i2, AnonymousClass6CA.A02(j, (long) (8192 - i2)));
                    if (read == -1) {
                        return -1;
                    }
                    A07.A00 += read;
                    long j2 = (long) read;
                    r6.A00 += j2;
                    return j2;
                }
                C18300x5.A11();
                throw new InterruptedIOException("interrupted");
            } catch (AssertionError e) {
                if (e.getCause() == null || (message = e.getMessage()) == null || !C175728Zm.A0S(message, "getsockname failed", false)) {
                    throw e;
                }
                throw new IOException(e);
            }
        } else {
            throw AnonymousClass6C7.A0V("byteCount < 0: ", AnonymousClass001.A0o(), j);
        }
    }

    public void close() {
        this.A00.close();
    }

    public C173358Ph(InputStream inputStream, AnonymousClass7Qz r2) {
        this.A00 = inputStream;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("source(");
        return C18260x0.A04(this.A00, A0o);
    }
}
