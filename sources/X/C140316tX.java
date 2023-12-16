package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.6tX  reason: invalid class name and case insensitive filesystem */
public final class C140316tX extends FilterInputStream {
    public long A00;
    public long A01 = -1;

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.A01 = this.A00;
    }

    public final synchronized void reset() {
        IOException iOException;
        if (!this.in.markSupported()) {
            iOException = AnonymousClass002.A0C("Mark not supported");
        } else if (this.A01 != -1) {
            this.in.reset();
            this.A00 = this.A01;
        } else {
            iOException = AnonymousClass002.A0C("Mark not set");
        }
        throw iOException;
    }

    public final int available() {
        return AnonymousClass6CA.A02((long) this.in.available(), this.A00);
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, AnonymousClass6CA.A02((long) i2, j));
        if (read != -1) {
            this.A00 -= (long) read;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.A00));
        this.A00 -= skip;
        return skip;
    }

    public C140316tX(InputStream inputStream) {
        super(inputStream);
        inputStream.getClass();
        this.A00 = 1048577;
    }

    public final int read() {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.A00--;
        }
        return read;
    }
}
