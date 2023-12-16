package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Je  reason: invalid class name and case insensitive filesystem */
public class C125736Je extends C1673580t {
    public boolean A00;

    public void Bi4(ByteBuffer byteBuffer) {
        int i;
        C158557kA r1;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = this.A00.A00;
        ByteBuffer A002 = A00(((limit - position) / i2) * i2);
        while (position < limit) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = this.A00.A01;
                if (i4 >= i) {
                    break;
                }
                i5 += byteBuffer.getShort((i4 * 2) + position);
                i4++;
            }
            short s = (short) (i5 / i);
            while (true) {
                r1 = this.A00;
                if (i3 >= r1.A01) {
                    break;
                }
                A002.putShort(s);
                i3++;
            }
            position += r1.A00;
        }
        byteBuffer.position(limit);
        A002.flip();
    }
}
