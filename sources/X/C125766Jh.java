package X;

import com.facebook.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.6Jh  reason: invalid class name and case insensitive filesystem */
public final class C125766Jh extends C1673580t {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A09;

    public ByteBuffer BAF() {
        int i;
        if (super.BHW() && (i = this.A00) > 0) {
            ByteBuffer A002 = A00(i);
            A002.put(this.A06, 0, this.A00);
            A002.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = this.A05;
        this.A05 = C187048wM.A00;
        return byteBuffer;
    }

    public boolean BHW() {
        if (!super.BHW() || this.A00 != 0) {
            return false;
        }
        return true;
    }

    public void Bi4(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A002 = A00(length);
                int A0D = AnonymousClass001.A0D(length, this.A00, 0);
                A002.put(this.A06, 0, A0D);
                int A0D2 = AnonymousClass001.A0D(length - A0D, i3, 0);
                byteBuffer.limit(byteBuffer.position() + A0D2);
                A002.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - A0D2;
                int i5 = this.A00 - A0D;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, A0D, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A002.flip();
            }
        }
    }
}
