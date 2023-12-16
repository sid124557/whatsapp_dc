package X;

import java.io.EOFException;

/* renamed from: X.7RJ  reason: invalid class name */
public final class AnonymousClass7RJ {
    public final C161467pi A00 = C161467pi.A05(10);

    public C166547ys A00(C187648xa r10, C180708lV r11) {
        C166547ys r8 = null;
        int i = 0;
        while (true) {
            try {
                C161467pi r5 = this.A00;
                r10.Bgd(r5.A02, 0, 10);
                r5.A0S(0);
                if (r5.A0D() != 4801587) {
                    break;
                }
                r5.A0T(3);
                int A0B = r5.A0B();
                int i2 = A0B + 10;
                if (r8 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(r5.A02, 0, bArr, 0, 10);
                    r10.Bgd(bArr, 10, A0B);
                    r8 = new AnonymousClass6P1(r11).A07(bArr, i2);
                } else {
                    r10.Awu(A0B);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        r10.Bjy();
        r10.Awu(i);
        return r8;
    }
}
