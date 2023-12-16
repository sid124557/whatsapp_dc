package org.apache.xml.security.keys.content.x509;

import X.AnonymousClass6C7;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.SignatureElementProxy;

public class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.x509.XMLX509SKI");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String e() {
        return "X509SKI";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XMLX509SKI)) {
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
            for (byte b2 : n()) {
                i = b2 + (i * 31);
            }
        } catch (XMLSecurityException unused) {
        }
        return i;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public byte[] a() {
        return n();
    }
}
