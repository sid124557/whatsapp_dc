package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.866  reason: invalid class name */
public final class AnonymousClass866 implements C187058wN {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public C157507iQ A04;
    public C157507iQ A05;
    public C157507iQ A06;
    public C157507iQ A07;
    public C153357b6 A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public boolean A0D;

    public C157507iQ AzP(C157507iQ r5) {
        if (r5.A02 == 2) {
            int i = r5.A03;
            this.A06 = r5;
            C157507iQ r1 = new C157507iQ(i, r5.A01, 2);
            this.A07 = r1;
            this.A0D = true;
            return r1;
        }
        throw new C143166yR(r5);
    }

    public ByteBuffer BAF() {
        int i;
        C153357b6 r7 = this.A08;
        if (r7 != null && (i = r7.A05 * r7.A0G * 2) > 0) {
            if (this.A09.capacity() < i) {
                ByteBuffer A0s = AnonymousClass6C7.A0s(i);
                this.A09 = A0s;
                this.A0B = A0s.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            ShortBuffer shortBuffer = this.A0B;
            int remaining = shortBuffer.remaining();
            int i2 = r7.A0G;
            int min = Math.min(remaining / i2, r7.A05);
            shortBuffer.put(r7.A0B, 0, i2 * min);
            int i3 = r7.A05 - min;
            r7.A05 = i3;
            short[] sArr = r7.A0B;
            System.arraycopy(sArr, min * i2, sArr, 0, i3 * i2);
            this.A03 += (long) i;
            this.A09.limit(i);
            this.A0A = this.A09;
        }
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = C187058wN.A00;
        return byteBuffer;
    }

    public boolean BGz() {
        int i = this.A07.A03;
        if (i == -1) {
            return false;
        }
        if (AnonymousClass002.A00(this.A01, 1.0f) >= 1.0E-4f || AnonymousClass002.A00(this.A00, 1.0f) >= 1.0E-4f || i != this.A06.A03) {
            return true;
        }
        return false;
    }

    public boolean BHW() {
        if (!this.A0C) {
            return false;
        }
        C153357b6 r0 = this.A08;
        if (r0 == null || r0.A05 * r0.A0G * 2 == 0) {
            return true;
        }
        return false;
    }

    public void Bi3() {
        C153357b6 r7 = this.A08;
        if (r7 != null) {
            int i = r7.A00;
            float f = r7.A0F;
            float f2 = r7.A0D;
            int i2 = r7.A05 + ((int) ((((((float) i) / (f / f2)) + ((float) r7.A06)) / (r7.A0E * f2)) + 0.5f));
            short[] sArr = r7.A0A;
            int i3 = r7.A0J * 2;
            short[] A042 = r7.A04(sArr, i, i3 + i);
            r7.A0A = A042;
            int i4 = 0;
            while (true) {
                int i5 = r7.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                A042[(i5 * i) + i4] = 0;
                i4++;
            }
            r7.A00 += i3;
            r7.A01();
            if (r7.A05 > i2) {
                r7.A05 = i2;
            }
            r7.A00 = 0;
            r7.A09 = 0;
            r7.A06 = 0;
        }
        this.A0C = true;
    }

    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        C157507iQ r0 = C157507iQ.A04;
        this.A06 = r0;
        this.A07 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C187058wN.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A0D = false;
        this.A08 = null;
        this.A02 = 0;
        this.A03 = 0;
        this.A0C = false;
    }

    public AnonymousClass866() {
        C157507iQ r0 = C157507iQ.A04;
        this.A06 = r0;
        this.A07 = r0;
        this.A04 = r0;
        this.A05 = r0;
        ByteBuffer byteBuffer = C187058wN.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
    }

    public void Bi4(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C153357b6 r5 = this.A08;
            r5.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = r5.A0G;
            int i2 = remaining2 / i;
            short[] A042 = r5.A04(r5.A0A, r5.A00, i2);
            r5.A0A = A042;
            asShortBuffer.get(A042, r5.A00 * i, ((i * i2) * 2) / 2);
            r5.A00 += i2;
            r5.A01();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public void flush() {
        if (BGz()) {
            C157507iQ r2 = this.A06;
            this.A04 = r2;
            C157507iQ r1 = this.A07;
            this.A05 = r1;
            if (this.A0D) {
                this.A08 = new C153357b6(this.A01, this.A00, r2.A03, r2.A01, r1.A03);
            } else {
                C153357b6 r12 = this.A08;
                if (r12 != null) {
                    r12.A00 = 0;
                    r12.A05 = 0;
                    r12.A06 = 0;
                    r12.A04 = 0;
                    r12.A03 = 0;
                    r12.A09 = 0;
                    r12.A08 = 0;
                    r12.A07 = 0;
                    r12.A02 = 0;
                    r12.A01 = 0;
                }
            }
        }
        this.A0A = C187058wN.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0C = false;
    }
}
