package X;

/* renamed from: X.31q  reason: invalid class name and case insensitive filesystem */
public class C616431q {
    public static AnonymousClass3ZK A01(byte[] bArr) {
        byte b = bArr[0] & 255;
        if (b == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new AnonymousClass3ZK(bArr2);
        }
        throw new AnonymousClass24R(AnonymousClass000.A0Y("Bad key type: ", AnonymousClass001.A0o(), b));
    }

    public static AnonymousClass3ZK A00(C172548Lq r0) {
        return A01(r0.A07());
    }

    public static C42012Ml A02() {
        C185988uZ r0 = C158317jm.A00().A00;
        byte[] B3i = r0.B3i();
        return new C42012Ml(new AnonymousClass2JA(B3i), new AnonymousClass3ZK(r0.generatePublicKey(B3i)));
    }

    public static byte[] A03(AnonymousClass2JA r3, AnonymousClass3ZK r4) {
        return C158317jm.A00().A02(r4.A00, r3.A00);
    }
}
