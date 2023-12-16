package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* renamed from: X.30f  reason: invalid class name and case insensitive filesystem */
public class C613230f {
    public static final long A07 = new Adler32().getValue();
    public int A00;
    public int A01 = 0;
    public final int A02;
    public final C26071bX A03;
    public final RandomAccessFile A04;
    public final ByteBuffer A05;
    public final Checksum A06;

    public final long A00() {
        Checksum checksum = this.A06;
        ByteBuffer byteBuffer = this.A05;
        checksum.update(byteBuffer.array(), this.A00, byteBuffer.position() - this.A00);
        this.A00 = byteBuffer.position();
        return checksum.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r6.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r6 = this;
            java.io.RandomAccessFile r5 = r6.A04
            if (r5 == 0) goto L_0x0037
            java.nio.ByteBuffer r4 = r6.A05
            int r0 = r4.position()
            int r1 = r6.A01
            if (r0 == r1) goto L_0x0037
            int r0 = r6.A02
            int r0 = r0 + r1
            long r0 = (long) r0
            r6.A04(r0)
            byte[] r3 = r4.array()     // Catch:{ IOException -> 0x0026 }
            int r2 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r4.position()     // Catch:{ IOException -> 0x0026 }
            int r0 = r6.A01     // Catch:{ IOException -> 0x0026 }
            int r1 = r1 - r0
            r5.write(r3, r2, r1)     // Catch:{ IOException -> 0x0026 }
            goto L_0x0031
        L_0x0026:
            r2 = move-exception
            X.1bX r1 = r6.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0H = r0
            r1.A05()
            throw r2
        L_0x0031:
            int r0 = r4.position()
            r6.A01 = r0
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613230f.A01():void");
    }

    public void A02(int i) {
        C26071bX r1;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            A04((long) this.A02);
            try {
                ByteBuffer byteBuffer = this.A05;
                randomAccessFile.readFully(byteBuffer.array(), 0, i);
                byteBuffer.position(i);
                this.A01 = i;
                this.A06.reset();
                this.A00 = 0;
            } catch (EOFException e) {
                e = e;
                r1 = this.A03;
                r1.A04 = Boolean.TRUE;
                r1.A05();
                throw e;
            } catch (IOException e2) {
                e = e2;
                r1 = this.A03;
                r1.A0E = Boolean.TRUE;
                r1.A05();
                throw e;
            }
        } else {
            throw AnonymousClass002.A0C("File not available");
        }
    }

    public final void A03(long j) {
        if (j < 0 || j > 4294967295L) {
            throw AnonymousClass001.A0c("Value is not an unsigned integer");
        }
        this.A05.putInt((int) j);
    }

    public final void A04(long j) {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(j);
            } catch (IOException e) {
                C26071bX r1 = this.A03;
                r1.A09 = Boolean.TRUE;
                r1.A05();
                throw e;
            }
        } else {
            throw AnonymousClass002.A0C("File not available");
        }
    }

    public C613230f(C26071bX r4, RandomAccessFile randomAccessFile, int i, int i2) {
        this.A04 = randomAccessFile;
        this.A02 = i;
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        this.A05 = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A06 = new Adler32();
        this.A00 = 0;
        this.A03 = r4;
    }
}
