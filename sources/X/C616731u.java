package X;

import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: X.31u  reason: invalid class name and case insensitive filesystem */
public class C616731u {
    public static final Charset A00 = C58152un.A0D;

    public static String A00(C55682qk r5, C50652iY r6, String str) {
        byte[] bArr;
        try {
            C46402bZ A002 = C57182tE.A00(str);
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = r6.A01(A002, C58172up.A0T);
            }
            if (bArr != null) {
                return new String(bArr, A00);
            }
            r5.A0A("BusinessDirectoryStorageUtil/decryptStringData", true, "Failed to decrypt string data");
            throw new Exception("Failed to decrypt string data");
        } catch (JSONException e) {
            C55682qk.A05(r5, "BusinessDirectoryStorageUtil/decryptSearchLocation", e);
            throw e;
        }
    }

    public static String A01(C55682qk r3, C50652iY r4, String str) {
        String A002;
        C46402bZ A003 = r4.A00(C58172up.A0T, str.getBytes(A00));
        if (A003 != null && (A002 = A003.A00()) != null && str.equals(A00(r3, r4, A002))) {
            return A002;
        }
        r3.A0A("BusinessDirectoryStorageUtil/encryptStringData", true, "Failed to encrypt string data");
        throw new Exception("Failed to encrypt string data");
    }
}
