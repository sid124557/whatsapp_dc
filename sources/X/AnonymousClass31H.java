package X;

/* renamed from: X.31H  reason: invalid class name */
public class AnonymousClass31H {
    public static void A00(AnonymousClass33C r3, C30471mV r4, byte[] bArr) {
        int length = bArr.length;
        if (length == 32) {
            C42162Na B1Z = new AnonymousClass3G7(AnonymousClass36O.A02(r4)).B1Z(bArr);
            r3.A0W = bArr;
            r3.A0S = B1Z.A00;
            r3.A0U = B1Z.A02;
            r3.A0V = B1Z.A01;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaKeysUtil/setMediaKeyForMediaData/media key incorrect length; length=");
        A0o.append(length);
        C624134x.A0Q(r4, "; message.key=", A0o);
        throw AnonymousClass24W.A00(16);
    }

    public static boolean A02(C624134x r4) {
        if (!(r4 instanceof AnonymousClass1nF)) {
            return false;
        }
        AnonymousClass33C r2 = ((C30471mV) r4).A01;
        if (r4.A09 != 7 || r2 == null || r2.A01 <= 0) {
            return false;
        }
        return true;
    }

    public static boolean A01(C624134x r3) {
        if ((!A02(r3) || !AnonymousClass000.A1U(r3.A0A & 1, 1)) && r3.A09 != 3) {
            return false;
        }
        return true;
    }
}
