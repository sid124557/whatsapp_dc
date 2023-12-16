package X;

import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/* renamed from: X.2tw  reason: invalid class name and case insensitive filesystem */
public class C57622tw {
    public static String A00(Map map) {
        C36821zw r0 = new C36821zw(map);
        try {
            MessageDigest A0t = AnonymousClass0x7.A0t();
            do {
            } while (new DigestInputStream(r0, A0t).read() != -1);
            return C627236i.A07(A0t.digest());
        } catch (IOException | NoSuchAlgorithmException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
