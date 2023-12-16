package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.7Vk  reason: invalid class name and case insensitive filesystem */
public class C151597Vk {
    public int A00;
    public ByteBuffer A01;

    public static int A00(C151597Vk r1, int i) {
        int i2 = i + r1.A00;
        return i2 + r1.A01.getInt(i2);
    }

    public int A02(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }

    public String A03(int i) {
        int i2 = i + this.A01.getInt(i);
        boolean hasArray = this.A01.hasArray();
        ByteBuffer byteBuffer = this.A01;
        if (hasArray) {
            return AnonymousClass6CA.A0W(AnonymousClass77B.A00, byteBuffer.array(), this.A01.arrayOffset() + i2 + 4, this.A01.getInt(i2));
        }
        ByteBuffer order = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        byte[] bArr = new byte[i3];
        order.position(i2 + 4);
        order.get(bArr);
        return AnonymousClass6CA.A0W(AnonymousClass77B.A00, bArr, 0, i3);
    }

    public static C130166bW A01(C130166bW r2, C151597Vk r3, int i) {
        int A02 = r3.A02(i);
        if (A02 == 0) {
            return null;
        }
        int i2 = A02 + r3.A00;
        int i3 = i2 + r3.A01.getInt(i2);
        ByteBuffer byteBuffer = r3.A01;
        r2.A00 = i3;
        r2.A01 = byteBuffer;
        return r2;
    }
}
