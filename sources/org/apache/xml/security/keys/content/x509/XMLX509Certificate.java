package org.apache.xml.security.keys.content.x509;

import java.util.Arrays;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.SignatureElementProxy;

public class XMLX509Certificate extends SignatureElementProxy implements XMLX509DataContent {
    public String e() {
        return "X509Certificate";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XMLX509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(((ElementProxy) obj).n(), n());
        } catch (XMLSecurityException unused) {
            return false;
        }
    }

    public int hashCode() {
        int i = 17;
        try {
            for (byte b : n()) {
                i = b + (i * 31);
            }
        } catch (XMLSecurityException unused) {
        }
        return i;
    }

    public byte[] a() {
        return n();
    }
}
