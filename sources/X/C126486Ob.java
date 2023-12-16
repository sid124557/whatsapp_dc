package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Ob  reason: invalid class name and case insensitive filesystem */
public final class C126486Ob extends C126496Oc {
    public int A00 = 32;
    public int A01;
    public long A02;

    public C126486Ob() {
        super(2);
    }

    public boolean A02(C126496Oc r5) {
        ByteBuffer byteBuffer;
        C161487pm.A03(!AnonymousClass000.A1U(r5.flags & 1073741824, 1073741824));
        C161487pm.A03(!AnonymousClass000.A1U(r5.flags & 268435456, 268435456));
        C161487pm.A03(!C153567bZ.A00(r5));
        int i = this.A01;
        if (i > 0) {
            if (i >= this.A00 || AnonymousClass000.A1U(r5.flags & Integer.MIN_VALUE, Integer.MIN_VALUE) != AnonymousClass000.A1U(this.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = r5.A01;
            if (!(byteBuffer2 == null || (byteBuffer = this.A01) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 == 0) {
            this.A00 = r5.A00;
            if (AnonymousClass000.A1U(r5.flags & 1, 1)) {
                this.flags = 1;
            }
        }
        if (AnonymousClass000.A1U(r5.flags & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.flags = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = r5.A01;
        if (byteBuffer3 != null) {
            A01(byteBuffer3.remaining());
            this.A01.put(byteBuffer3);
        }
        this.A02 = r5.A00;
        return true;
    }

    public void clear() {
        super.clear();
        this.A01 = 0;
    }
}
