package X;

import java.nio.ByteBuffer;

/* renamed from: X.6OU  reason: invalid class name */
public final class AnonymousClass6OU extends AnonymousClass867 {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public void Bi4(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.A00.A02;
        if (i2 == 536870912) {
            byteBuffer2 = A00((i / 3) * 4);
            while (position < limit) {
                int A08 = AnonymousClass6C7.A08(byteBuffer, position + 2, (AnonymousClass6CA.A08(byteBuffer, position) << 8) | (AnonymousClass6CA.A08(byteBuffer, position + 1) << 16));
                if (A08 == A00) {
                    A08 = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(A08);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = A00(i);
            while (position < limit) {
                int A082 = AnonymousClass6C7.A08(byteBuffer, position + 3, AnonymousClass6CA.A08(byteBuffer, position) | (AnonymousClass6CA.A08(byteBuffer, position + 1) << 8) | (AnonymousClass6CA.A08(byteBuffer, position + 2) << 16));
                if (A082 == A00) {
                    A082 = Float.floatToIntBits(0.0f);
                }
                byteBuffer2.putInt(A082);
                position += 4;
            }
        } else {
            throw AnonymousClass6CA.A0O();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
}
