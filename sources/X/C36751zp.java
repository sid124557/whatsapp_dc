package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: X.1zp  reason: invalid class name and case insensitive filesystem */
public final class C36751zp extends FilterOutputStream {
    public boolean A00;
    public final ByteBuffer A01;

    public synchronized void close() {
        try {
            flush();
            AnonymousClass0x7.A1C(this.out, "0\r\n\r\n", C58152un.A0B);
            th = null;
        } catch (UnsupportedCharsetException e) {
            throw new Error(e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            super.close();
            if (th != null) {
                Thread.currentThread().stop(th);
            }
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
    }

    public synchronized void flush() {
        if (!this.A00) {
            AnonymousClass0x7.A1C(this.out, "POST /chat HTTP/1.1\r\nHost: c.whatsapp.net\r\nUser-Agent: Mozilla/5.0 (compatible; WAChat/1.2; +http://www.whatsapp.com/contact)\r\nTransfer-Encoding: chunked\r\n\r\n", C58152un.A0B);
            this.A00 = true;
        }
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer.position() > 0) {
            AnonymousClass0x7.A1C(this.out, Integer.toHexString(byteBuffer.position()), C58152un.A0B);
            this.out.write(13);
            this.out.write(10);
            this.out.write(byteBuffer.array(), 0, byteBuffer.position());
            this.out.write(13);
            this.out.write(10);
            byteBuffer.clear();
        }
        super.flush();
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        while (true) {
            ByteBuffer byteBuffer = this.A01;
            if (i2 > byteBuffer.remaining()) {
                int remaining = byteBuffer.remaining();
                byteBuffer.put(bArr, i, remaining);
                flush();
                i += remaining;
                i2 -= remaining;
            } else {
                byteBuffer.put(bArr, i, i2);
            }
        }
    }

    public C36751zp(OutputStream outputStream) {
        super(outputStream);
        if (outputStream != null) {
            this.A01 = ByteBuffer.allocate(DefaultCrypto.BUFFER_SIZE);
            return;
        }
        throw AnonymousClass001.A0g("out may not be null");
    }

    public synchronized void write(int i) {
        ByteBuffer byteBuffer = this.A01;
        if (!byteBuffer.hasRemaining()) {
            flush();
        }
        byteBuffer.put((byte) i);
    }
}
