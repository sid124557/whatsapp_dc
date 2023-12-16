package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1zn  reason: invalid class name and case insensitive filesystem */
public class C36731zn extends ByteArrayOutputStream {
    public final ByteBuffer A00() {
        ByteBuffer wrap = ByteBuffer.wrap(this.buf, 0, size());
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.asReadOnlyBuffer();
    }

    public final byte[] A01() {
        return this.buf;
    }
}
