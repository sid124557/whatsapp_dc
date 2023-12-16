package X;

import java.io.OutputStream;

/* renamed from: X.6uQ  reason: invalid class name and case insensitive filesystem */
public class C140746uQ extends OutputStream {
    public long A00;
    public final int A01;
    public final OutputStream A02;

    public void write(int i) {
        if (this.A00 < ((long) this.A01)) {
            this.A02.write(i);
            this.A00++;
        }
    }

    public C140746uQ(OutputStream outputStream, int i) {
        this.A02 = outputStream;
        this.A01 = i;
    }
}
