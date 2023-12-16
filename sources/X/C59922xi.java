package X;

import android.net.Uri;
import java.math.BigInteger;
import java.net.URI;
import java.security.SecureRandom;

/* renamed from: X.2xi  reason: invalid class name and case insensitive filesystem */
public class C59922xi {
    public final String A00;
    public final String A01 = new BigInteger(130, new SecureRandom()).toString(32);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59922xi)) {
            return false;
        }
        C59922xi r4 = (C59922xi) obj;
        return r4.A00.equals(this.A00) && r4.A01.equals(this.A01);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C59922xi(String str) {
        this.A00 = A00(str);
    }

    public static String A00(String str) {
        try {
            URI create = URI.create(str);
            Uri A0H = AnonymousClass0x2.A0H(create);
            C624635d.A02(A0H, create, false);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A0H.getScheme());
            A0o.append("://");
            A0o.append(A0H.getAuthority());
            return A0o.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
