package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7al  reason: invalid class name and case insensitive filesystem */
public abstract class C153157al {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C187028wK A06;
    public C185598tw A07;
    public C184888si A08;
    public AnonymousClass7G1 A09 = new AnonymousClass7G1();
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass7TM A0C = new AnonymousClass7TM();

    public void A00(boolean z) {
        int i;
        if (z) {
            this.A09 = new AnonymousClass7G1();
            this.A04 = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.A01 = i;
        this.A05 = -1;
        this.A02 = 0;
    }

    public boolean A01(AnonymousClass7G1 r7, C161467pi r8, long j) {
        if (this instanceof C126646Ot) {
            C126646Ot r5 = (C126646Ot) this;
            boolean z = true;
            if (!r5.A00) {
                byte[] copyOf = Arrays.copyOf(r8.A02, r8.A00);
                List A002 = AnonymousClass728.A00(copyOf);
                C157057he A003 = C157057he.A00();
                A003.A0R = "audio/opus";
                A003.A04 = copyOf[9] & 255;
                A003.A0D = 48000;
                A003.A0S = A002;
                r7.A00 = C166527yp.A00(A003);
                r5.A00 = true;
                return true;
            }
            r7.A00.getClass();
            if (r8.A07() != 1332770163) {
                z = false;
            }
            r8.A0S(0);
            return z;
        }
        C126626Or r3 = (C126626Or) this;
        byte[] bArr = r8.A02;
        C161727qK r4 = r3.A00;
        if (r4 == null) {
            C161727qK r2 = new C161727qK(bArr, 17);
            r3.A00 = r2;
            r7.A00 = r2.A03((C166547ys) null, Arrays.copyOfRange(bArr, 9, r8.A00));
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            C147827Fw A004 = AnonymousClass729.A00(r8);
            C161727qK A042 = r4.A04(A004);
            r3.A00 = A042;
            r3.A01 = new AnonymousClass872(A004, A042);
            return true;
        } else if (b != -1) {
            return true;
        } else {
            AnonymousClass872 r0 = r3.A01;
            if (r0 != null) {
                r0.A00 = j;
                r7.A01 = r0;
            }
            r7.A00.getClass();
            return false;
        }
    }
}
