package X;

import java.nio.ByteBuffer;

/* renamed from: X.6Oc  reason: invalid class name and case insensitive filesystem */
public class C126496Oc extends C153567bZ {
    public long A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public boolean A03;
    public final int A04;
    public final AnonymousClass7PP A05 = new AnonymousClass7PP();

    public void clear() {
        this.flags = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A03 = false;
    }

    public final void A00() {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void A01(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i2 = this.A04;
            if (i2 == 1) {
                allocateDirect = ByteBuffer.allocate(i);
            } else if (i2 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i);
            } else {
                throw new C144026zt(0, i);
            }
        } else {
            int capacity2 = byteBuffer.capacity();
            int position = byteBuffer.position();
            int i3 = i + position;
            if (capacity2 >= i3) {
                this.A01 = byteBuffer;
                return;
            }
            int i4 = this.A04;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A01;
                if (byteBuffer2 == null) {
                    capacity = 0;
                } else {
                    capacity = byteBuffer2.capacity();
                }
                throw new C144026zt(capacity, i3);
            }
            allocateDirect.order(byteBuffer.order());
            if (position > 0) {
                byteBuffer.flip();
                allocateDirect.put(byteBuffer);
            }
        }
        this.A01 = allocateDirect;
    }

    public C126496Oc(int i) {
        this.A04 = i;
    }
}
