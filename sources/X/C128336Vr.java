package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.6Vr  reason: invalid class name and case insensitive filesystem */
public final class C128336Vr extends C128346Vs {
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final ByteBuffer A04;
    public final ByteBuffer A05;

    public C128336Vr(ByteBuffer byteBuffer) {
        this.A04 = byteBuffer;
        this.A05 = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        long A052 = C162337rj.A02.A05(byteBuffer, C162337rj.A01);
        this.A01 = A052;
        long position = ((long) byteBuffer.position()) + A052;
        long limit = A052 + ((long) byteBuffer.limit());
        this.A02 = limit;
        this.A03 = limit - 10;
        this.A00 = position;
    }
}
