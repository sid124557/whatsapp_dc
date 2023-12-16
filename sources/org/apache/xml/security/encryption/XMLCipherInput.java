package org.apache.xml.security.encryption;

import X.AnonymousClass6C7;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class XMLCipherInput {
    public static Class a;
    public static Log b;

    static {
        Class a2 = a("org.apache.xml.security.encryption.XMLCipher");
        a = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
