package X;

import java.nio.ByteBuffer;

/* renamed from: X.7RP  reason: invalid class name */
public class AnonymousClass7RP {
    public final AnonymousClass7GN A00 = new AnonymousClass7GN();

    public void A00(int i, int i2, ByteBuffer byteBuffer, int i3) {
        if (byteBuffer == null) {
            throw AnonymousClass001.A0c("Null image data supplied.");
        } else if (byteBuffer.capacity() < i * i2) {
            throw AnonymousClass001.A0c("Invalid image data size.");
        } else if (i3 == 16 || i3 == 17 || i3 == 842094169) {
            AnonymousClass7GN r0 = this.A00;
            r0.A00 = byteBuffer;
            C149647Nh r02 = r0.A01;
            r02.A00 = i;
            r02.A01 = i2;
        } else {
            throw AnonymousClass000.A0G("Unsupported image format: ", AnonymousClass6CA.A0Y(37), i3);
        }
    }
}
