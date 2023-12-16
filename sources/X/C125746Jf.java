package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Jf  reason: invalid class name and case insensitive filesystem */
public final class C125746Jf extends C1673580t {
    public final AnonymousClass81X A00;

    public C125746Jf(AnonymousClass81X r1) {
        this.A00 = r1;
    }

    public void Bi4(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            AnonymousClass81X r4 = this.A00;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            ByteBuffer allocate = ByteBuffer.allocate(asReadOnlyBuffer.limit() - asReadOnlyBuffer.position());
            allocate.put(asReadOnlyBuffer);
            allocate.flip();
            r4.A01.A0o.BWz(allocate.array());
            ByteBuffer A002 = A00(remaining);
            A002.put(byteBuffer);
            A002.flip();
        }
    }
}
