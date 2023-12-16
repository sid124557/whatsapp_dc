package X;

import java.io.InputStream;

/* renamed from: X.6uF  reason: invalid class name and case insensitive filesystem */
public abstract class C140646uF extends InputStream {
    public int A00;
    public final InputStream A01;

    public void A01() {
        InputStream inputStream = this.A01;
        if (inputStream instanceof C177098e4) {
            C177098e4 r1 = (C177098e4) inputStream;
            r1.A02 = true;
            r1.A02();
        }
    }

    public C140646uF(InputStream inputStream, int i) {
        this.A01 = inputStream;
        this.A00 = i;
    }
}
