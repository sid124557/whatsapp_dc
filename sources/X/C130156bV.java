package X;

import java.nio.ByteBuffer;

/* renamed from: X.6bV  reason: invalid class name and case insensitive filesystem */
public final class C130156bV extends C151597Vk {
    public C130166bW A04(int i) {
        C130166bW r2 = new C130166bW();
        int A02 = A02(26);
        if (A02 == 0) {
            return null;
        }
        int A00 = C151597Vk.A00(this, A02) + 4 + (i * 4);
        int i2 = A00 + this.A01.getInt(A00);
        ByteBuffer byteBuffer = this.A01;
        r2.A00 = i2;
        r2.A01 = byteBuffer;
        return r2;
    }
}
