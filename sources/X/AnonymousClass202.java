package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.202  reason: invalid class name */
public class AnonymousClass202 extends OutputStream {
    public boolean A00;
    public final File A01;
    public final File A02;
    public final FileOutputStream A03;

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.close();
            File file = this.A01;
            file.delete();
            if (!this.A02.renameTo(file)) {
                throw AnonymousClass002.A0C("File.renameTo failed");
            }
        }
    }

    public void flush() {
        this.A03.flush();
    }

    public void write(byte[] bArr, int i, int i2) {
        this.A03.write(bArr, i, i2);
    }

    public AnonymousClass202(C49692gw r2, File file) {
        File A002 = r2.A00("");
        this.A02 = A002;
        this.A01 = file;
        this.A03 = AnonymousClass0x9.A0h(A002);
    }

    public void write(int i) {
        this.A03.write(i);
    }

    public void write(byte[] bArr) {
        this.A03.write(bArr);
    }
}
