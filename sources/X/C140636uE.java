package X;

import java.io.InputStream;

/* renamed from: X.6uE  reason: invalid class name and case insensitive filesystem */
public class C140636uE extends InputStream {
    public int A00;
    public InputStream A01;

    public int read() {
        int i = this.A00;
        if (i <= 0) {
            return -1;
        }
        this.A00 = i - 1;
        return this.A01.read();
    }

    public C140636uE(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }
}
