package X;

import java.nio.ByteBuffer;

/* renamed from: X.6OT  reason: invalid class name */
public final class AnonymousClass6OT extends AnonymousClass867 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;

    public AnonymousClass6OT() {
        byte[] bArr = C162387ry.A0A;
        this.A07 = bArr;
        this.A08 = bArr;
    }

    public final void A01(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        int i2 = this.A02;
        int min = Math.min(remaining, i2);
        int i3 = i2 - min;
        System.arraycopy(bArr, i - i3, this.A08, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.A08, i3, min);
    }

    public final void A02(byte[] bArr, int i) {
        ByteBuffer A002 = A00(i);
        A002.put(bArr, 0, i);
        A002.flip();
        if (i > 0) {
            this.A06 = true;
        }
    }

    public void Bi4(ByteBuffer byteBuffer) {
        int position;
        int limit;
        long j;
        int i;
        int limit2;
        while (byteBuffer.hasRemaining() && !this.A05.hasRemaining()) {
            int i2 = this.A03;
            if (i2 == 0) {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.A07.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit4)) > 1024) {
                            int i3 = this.A00;
                            position = ((limit4 / i3) * i3) + i3;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.A03 = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    ByteBuffer A002 = A00(remaining);
                    A002.put(byteBuffer);
                    A002.flip();
                    if (remaining > 0) {
                        this.A06 = true;
                    }
                }
                byteBuffer.limit(limit3);
            } else if (i2 != 1) {
                int limit5 = byteBuffer.limit();
                int position2 = byteBuffer.position();
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit2 = byteBuffer.limit();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(position2)) > 1024) {
                        int i4 = this.A00;
                        limit2 = i4 * (position2 / i4);
                        break;
                    } else {
                        position2 += 2;
                    }
                }
                byteBuffer.limit(limit2);
                this.A04 += (long) (byteBuffer.remaining() / this.A00);
                A01(byteBuffer, this.A08, this.A02);
                if (limit2 < limit5) {
                    A02(this.A08, this.A02);
                    this.A03 = 0;
                    byteBuffer.limit(limit5);
                }
            } else {
                int limit6 = byteBuffer.limit();
                int position3 = byteBuffer.position();
                while (true) {
                    if (position3 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(position3)) > 1024) {
                        int i5 = this.A00;
                        limit = i5 * (position3 / i5);
                        break;
                    } else {
                        position3 += 2;
                    }
                }
                int position4 = limit - byteBuffer.position();
                byte[] bArr = this.A07;
                int length = bArr.length;
                int i6 = this.A01;
                int i7 = length - i6;
                if (limit >= limit6 || position4 >= i7) {
                    int min = Math.min(position4, i7);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.A07, this.A01, min);
                    int i8 = this.A01 + min;
                    this.A01 = i8;
                    byte[] bArr2 = this.A07;
                    if (i8 == bArr2.length) {
                        if (this.A06) {
                            A02(bArr2, this.A02);
                            j = this.A04;
                            i8 = this.A01;
                            i = this.A02 * 2;
                        } else {
                            j = this.A04;
                            i = this.A02;
                        }
                        this.A04 = j + ((long) ((i8 - i) / this.A00));
                        A01(byteBuffer, this.A07, i8);
                        this.A01 = 0;
                        this.A03 = 2;
                    }
                    byteBuffer.limit(limit6);
                } else {
                    A02(bArr, i6);
                    this.A01 = 0;
                    this.A03 = 0;
                }
            }
        }
    }
}
