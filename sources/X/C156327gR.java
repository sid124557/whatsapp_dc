package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7gR  reason: invalid class name and case insensitive filesystem */
public final class C156327gR {
    public final int A00;
    public final String A01;
    public final List A02;

    public static C156327gR A00(C161467pi r14) {
        List list;
        try {
            int A022 = C161467pi.A02(r14, 21) & 3;
            int A0C = r14.A0C();
            int i = r14.A01;
            int i2 = 0;
            for (int i3 = 0; i3 < A0C; i3++) {
                r14.A0T(1);
                int A0F = r14.A0F();
                for (int i4 = 0; i4 < A0F; i4++) {
                    int A0F2 = r14.A0F();
                    i2 += A0F2 + 4;
                    r14.A0T(A0F2);
                }
            }
            r14.A0S(i);
            byte[] bArr = new byte[i2];
            String str = null;
            int i5 = 0;
            for (int i6 = 0; i6 < A0C; i6++) {
                int A0C2 = r14.A0C() & 127;
                int A0F3 = r14.A0F();
                for (int i7 = 0; i7 < A0F3; i7++) {
                    int A0F4 = r14.A0F();
                    byte[] bArr2 = C161627q8.A02;
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i5, length);
                    int i8 = i5 + length;
                    System.arraycopy(r14.A02, r14.A01, bArr, i8, A0F4);
                    if (A0C2 == 33 && i7 == 0) {
                        str = C155307ee.A00(new C153587bb(bArr, i8, i8 + A0F4));
                    }
                    i5 = i8 + A0F4;
                    r14.A0T(A0F4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C156327gR(list, A022 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AnonymousClass6u7("Error parsing HEVC config", e);
        }
    }

    public C156327gR(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }
}
