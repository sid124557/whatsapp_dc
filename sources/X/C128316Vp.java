package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.6Vp  reason: invalid class name and case insensitive filesystem */
public final class C128316Vp extends C128346Vs {
    public final ByteBuffer A00;
    public final ByteBuffer A01;

    public C128316Vp(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
        this.A01 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    }
}
