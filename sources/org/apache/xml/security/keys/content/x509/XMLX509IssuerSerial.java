package org.apache.xml.security.keys.content.x509;

import X.AnonymousClass0x7;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6CA;
import java.math.BigInteger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.RFC2253Parser;
import org.apache.xml.security.utils.SignatureElementProxy;

public class XMLX509IssuerSerial extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String b() {
        return RFC2253Parser.a(b("X509IssuerName", "http://www.w3.org/2000/09/xmldsig#"));
    }

    public String e() {
        return "X509IssuerSerial";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XMLX509IssuerSerial)) {
            return false;
        }
        XMLX509IssuerSerial xMLX509IssuerSerial = (XMLX509IssuerSerial) obj;
        if (!a().equals(xMLX509IssuerSerial.a()) || !b().equals(xMLX509IssuerSerial.b())) {
            return false;
        }
        return true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(b(), AnonymousClass6C8.A04(a().hashCode()));
    }

    public BigInteger a() {
        String b2 = b("X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#");
        if (a.isDebugEnabled()) {
            AnonymousClass6C7.A1H("X509SerialNumber text: ", b2, AnonymousClass6CA.A0X(), a);
        }
        return new BigInteger(b2);
    }
}
