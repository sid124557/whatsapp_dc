package X;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public class C57842uI {
    public static final byte[][] A00;

    static {
        byte[][] bArr = new byte[3][];
        A00 = bArr;
        bArr[0] = new byte[]{87, 65, 77, 3};
        bArr[1] = new byte[]{87, 65, 77, 4};
        bArr[2] = new byte[]{87, 65, 77, 5};
    }

    public static byte[] A00(int i) {
        if (i >= 0) {
            byte[][] bArr = A00;
            if (i <= bArr.length - 1) {
                return bArr[i];
            }
        }
        throw AnonymousClass002.A0E(AnonymousClass000.A0Y("Invalid version: ", AnonymousClass001.A0o(), i));
    }
}
