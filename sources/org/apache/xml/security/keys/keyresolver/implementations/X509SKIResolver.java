package org.apache.xml.security.keys.keyresolver.implementations;

import X.AnonymousClass6C7;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.keyresolver.KeyResolverSpi;

public class X509SKIResolver extends KeyResolverSpi {
    public static Log c;
    public static Class d;

    static {
        Class a = a("org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver");
        d = a;
        c = LogFactory.getLog(a.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
