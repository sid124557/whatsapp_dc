package X;

/* renamed from: X.25p  reason: invalid class name and case insensitive filesystem */
public class C381025p {
    public static int A00(int i) {
        int i2 = 1;
        int i3 = 0;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw AnonymousClass000.A0G("unrecognized SignalMessageType; value=", AnonymousClass001.A0o(), i);
                    }
                }
            }
            return i2;
        }
        return i3;
    }

    public static C45442a1 A01(C54562ov r1, C621133n r2, byte[] bArr) {
        AnonymousClass2NY A06 = r2.A06(r1, bArr);
        return new C45442a1(A06.A02, 2, A00(A06.A00));
    }
}
