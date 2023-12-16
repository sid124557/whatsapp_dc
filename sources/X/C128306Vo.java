package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Vo  reason: invalid class name and case insensitive filesystem */
public final class C128306Vo extends C128326Vq {
    public int A00;
    public final ByteBuffer A01;

    public C128306Vo(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.A01 = byteBuffer;
        this.A00 = byteBuffer.position();
    }
}
