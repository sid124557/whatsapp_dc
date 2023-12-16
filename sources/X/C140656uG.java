package X;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: X.6uG  reason: invalid class name and case insensitive filesystem */
public class C140656uG extends InputStream {
    public final /* synthetic */ C55982rE A00;
    public final /* synthetic */ RandomAccessFile A01;

    public C140656uG(C55982rE r1, RandomAccessFile randomAccessFile) {
        this.A00 = r1;
        this.A01 = randomAccessFile;
    }

    public int read(byte[] bArr, int i, int i2) {
        return this.A01.read(bArr, i, i2);
    }

    public int read() {
        return this.A01.read();
    }

    public int read(byte[] bArr) {
        return this.A01.read(bArr);
    }
}
