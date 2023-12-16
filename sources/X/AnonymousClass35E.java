package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.35E  reason: invalid class name */
public class AnonymousClass35E {
    public static final C72983ec A00 = new C72983ec();

    public static byte[] A01(String str, int i) {
        try {
            return A00.A00(str, 1, i);
        } catch (Exception e) {
            throw new C377924a(AnonymousClass000.A0a("exception decoding Hex string: ", AnonymousClass001.A0o(), e), e);
        }
    }

    public static byte[] A00(String str) {
        try {
            return A00.A00(str, 0, str.length());
        } catch (Exception e) {
            throw new C377924a(AnonymousClass000.A0a("exception decoding Hex string: ", AnonymousClass001.A0o(), e), e);
        }
    }

    public static byte[] A02(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
        try {
            A00.B2P(A0e, bArr, i, i2);
            return A0e.toByteArray();
        } catch (Exception e) {
            throw new C378024b(AnonymousClass000.A0a("exception encoding Hex string: ", AnonymousClass001.A0o(), e), e);
        }
    }
}
