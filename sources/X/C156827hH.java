package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7hH  reason: invalid class name and case insensitive filesystem */
public final class C156827hH {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List A05;

    public static C156827hH A00(C161467pi r14) {
        int i;
        int i2;
        float f;
        String str;
        try {
            int A022 = (C161467pi.A02(r14, 4) & 3) + 1;
            if (A022 != 3) {
                ArrayList A0s = AnonymousClass001.A0s();
                int A0C = r14.A0C() & 31;
                for (int i3 = 0; i3 < A0C; i3++) {
                    int A0F = r14.A0F();
                    int i4 = r14.A01;
                    r14.A0T(A0F);
                    byte[] bArr = r14.A02;
                    byte[] bArr2 = C155307ee.A00;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[(length + A0F)];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    System.arraycopy(bArr, i4, bArr3, length, A0F);
                    A0s.add(bArr3);
                }
                int A0C2 = r14.A0C();
                for (int i5 = 0; i5 < A0C2; i5++) {
                    int A0F2 = r14.A0F();
                    int i6 = r14.A01;
                    r14.A0T(A0F2);
                    byte[] bArr4 = r14.A02;
                    byte[] bArr5 = C155307ee.A00;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[(length2 + A0F2)];
                    System.arraycopy(bArr5, 0, bArr6, 0, length2);
                    System.arraycopy(bArr4, i6, bArr6, length2, A0F2);
                    A0s.add(bArr6);
                }
                if (A0C > 0) {
                    AnonymousClass7P3 A023 = C161627q8.A02((byte[]) A0s.get(0), A022, ((byte[]) A0s.get(0)).length);
                    i2 = A023.A06;
                    i = A023.A02;
                    f = A023.A00;
                    int i7 = A023.A04;
                    int i8 = A023.A01;
                    int i9 = A023.A03;
                    Object[] A1X = AnonymousClass0x9.A1X();
                    AnonymousClass000.A1P(A1X, i7, 0);
                    AnonymousClass6C7.A1U(A1X, i8, i9);
                    str = String.format("avc1.%02X%02X%02X", A1X);
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C156827hH(str, A0s, f, A022, i2, i);
            }
            throw AnonymousClass6CA.A0O();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new AnonymousClass6u7("Error parsing AVC config", e);
        }
    }

    public C156827hH(String str, List list, float f, int i, int i2, int i3) {
        this.A05 = list;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A04 = str;
    }
}
