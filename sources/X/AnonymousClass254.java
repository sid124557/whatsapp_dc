package X;

import android.util.Base64;

/* renamed from: X.254  reason: invalid class name */
public class AnonymousClass254 {
    public static String A00(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AesKey=");
        A0o.append(Base64.encodeToString(bArr2, 2));
        A0o.append(";IV=");
        A0o.append(Base64.encodeToString(bArr3, 2));
        A0o.append(";Data=");
        return AnonymousClass000.A0X(Base64.encodeToString(bArr, 2), A0o);
    }
}
