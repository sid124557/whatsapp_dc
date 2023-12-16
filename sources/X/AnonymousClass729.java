package X;

import java.util.Arrays;

/* renamed from: X.729  reason: invalid class name */
public final class AnonymousClass729 {
    public static C147827Fw A00(C161467pi r12) {
        r12.A0T(1);
        int A0D = r12.A0D();
        long j = ((long) r12.A01) + ((long) A0D);
        int i = A0D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0H = r12.A0H();
            if (A0H == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0H;
            jArr2[i2] = r12.A0H();
            r12.A0T(2);
            i2++;
        }
        r12.A0T((int) (j - ((long) r12.A01)));
        return new C147827Fw(jArr, jArr2);
    }
}
