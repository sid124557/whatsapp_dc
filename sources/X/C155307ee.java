package X;

import java.util.Locale;

/* renamed from: X.7ee  reason: invalid class name and case insensitive filesystem */
public final class C155307ee {
    public static final byte[] A00 = {0, 0, 0, 1};
    public static final String[] A01 = {"", "A", "B", "C"};

    public static String A00(C153587bb r13) {
        r13.A04(24);
        int A012 = r13.A01(2);
        boolean A05 = r13.A05();
        int A013 = r13.A01(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (r13.A05()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = r13.A01(8);
        }
        int A014 = r13.A01(8);
        Object[] objArr = new Object[5];
        objArr[0] = A01[A012];
        C86604Kt.A1X(objArr, A013, 1, i, 2);
        char c = 'L';
        if (A05) {
            c = 'H';
        }
        objArr[3] = Character.valueOf(c);
        AnonymousClass000.A1P(objArr, A014, 4);
        StringBuilder A0A = C18330xA.A0A(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        while (true) {
            if (iArr[i3 - 1] != 0) {
                int i5 = 0;
                do {
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1P(objArr2, iArr[i5], 0);
                    A0A.append(String.format(".%02X", objArr2));
                    i5++;
                } while (i5 < i3);
                break;
            }
            i3--;
            if (i3 <= 0) {
                break;
            }
        }
        return A0A.toString();
    }
}
