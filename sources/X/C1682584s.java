package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.84s  reason: invalid class name and case insensitive filesystem */
public class C1682584s implements C188158yR {
    public File A00;
    public FileInputStream A01;
    public FileChannel A02;

    public int BiE(ByteBuffer byteBuffer, long j) {
        return this.A02.read(byteBuffer, j);
    }

    public void close() {
        this.A01.close();
    }

    public boolean isOpen() {
        return this.A02.isOpen();
    }

    public int read(ByteBuffer byteBuffer) {
        return this.A02.read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) {
        return this.A02.write(byteBuffer);
    }

    public C1682584s(File file) {
        this.A00 = file;
        FileInputStream A0g = AnonymousClass0x9.A0g(file);
        this.A01 = A0g;
        this.A02 = A0g.getChannel();
    }
}
