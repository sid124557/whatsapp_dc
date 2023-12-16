package org.apache.xml.security.keys.content;

import X.AnonymousClass6C7;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;

public class X509Data extends SignatureElementProxy implements KeyInfoContent {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.keys.content.X509Data");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public String e() {
        return "X509Data";
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
