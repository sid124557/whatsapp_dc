package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Jg  reason: invalid class name and case insensitive filesystem */
public final class C125756Jg extends C1673580t {
    public int[] A00;
    public int[] A01;

    public void Bi4(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A002 = A00(((limit - position) / this.A00.A00) * this.A01.A00);
        while (position < limit) {
            for (int i : iArr) {
                A002.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A002.flip();
    }
}
