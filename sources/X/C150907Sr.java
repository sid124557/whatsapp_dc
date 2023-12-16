package X;

import java.lang.reflect.Array;

/* renamed from: X.7Sr  reason: invalid class name and case insensitive filesystem */
public final class C150907Sr {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public String toString() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        StringBuilder A0Y = AnonymousClass6CA.A0Y((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.A02[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    str = " 0";
                } else if (b != 1) {
                    str = "  ";
                } else {
                    str = " 1";
                }
                A0Y.append(str);
            }
            A0Y.append(10);
        }
        return A0Y.toString();
    }

    public C150907Sr(int i, int i2) {
        int[] A1Z = C86664Kz.A1Z();
        A1Z[1] = i;
        A1Z[0] = i2;
        this.A02 = (byte[][]) Array.newInstance(Byte.TYPE, A1Z);
        this.A01 = i;
        this.A00 = i2;
    }
}
