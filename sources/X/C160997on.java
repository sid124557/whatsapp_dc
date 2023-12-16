package X;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.7on  reason: invalid class name and case insensitive filesystem */
public class C160997on {
    public static C176618dI A00(Object obj) {
        if (obj instanceof X509Certificate) {
            return A01((X509Certificate) obj);
        }
        throw AnonymousClass001.A0g("getIssuer");
    }

    public static C176618dI A01(X509Certificate x509Certificate) {
        if (x509Certificate instanceof C180108kV) {
            C176618dI r0 = ((C174008Sp) ((C180108kV) x509Certificate)).c.A03.A05;
            if (r0 != null) {
                return r0;
            }
            throw AnonymousClass6CA.A0O();
        } else if (x509Certificate != null) {
            return A03(x509Certificate.getIssuerX500Principal());
        } else {
            throw AnonymousClass6CA.A0O();
        }
    }

    public static C176618dI A02(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof C180108kV)) {
            return A03(x509Certificate.getSubjectX500Principal());
        }
        C176618dI r0 = ((C174008Sp) ((C180108kV) x509Certificate)).c.A03.A06;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass6CA.A0O();
    }

    public static C176618dI A03(X500Principal x500Principal) {
        if (x500Principal != null) {
            byte[] encoded = x500Principal.getEncoded();
            if (encoded != null) {
                C176618dI A0B = C176618dI.A0B(encoded);
                if (A0B != null) {
                    return A0B;
                }
                throw AnonymousClass6CA.A0O();
            }
            throw AnonymousClass6CA.A0O();
        }
        throw AnonymousClass6CA.A0O();
    }
}
