package org.apache.xml.security.keys.keyresolver;

import X.AnonymousClass002;
import X.AnonymousClass6C7;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolver;

public class KeyResolver {
    public static Log a;
    public static boolean b = false;
    public static List c = null;
    public static Class f;
    public KeyResolverSpi d = null;
    public StorageResolver e = null;

    public class ResolverIterator implements Iterator {
        public Iterator a;
        public int b;

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public Object next() {
            this.b++;
            KeyResolver keyResolver = (KeyResolver) this.a.next();
            if (keyResolver != null) {
                return keyResolver.d;
            }
            throw AnonymousClass002.A0E("utils.resolver.noClass");
        }

        public void remove() {
            throw AnonymousClass002.A0G("Can't remove resolvers using the iterator");
        }
    }

    static {
        Class b2 = b("org.apache.xml.security.keys.keyresolver.KeyResolver");
        f = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static void a(String str) {
        c.add(new KeyResolver(str));
    }

    public KeyResolver(String str) {
        KeyResolverSpi keyResolverSpi = (KeyResolverSpi) Class.forName(str).newInstance();
        this.d = keyResolverSpi;
        keyResolverSpi.b = true;
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public static void a() {
        if (!b) {
            c = AnonymousClass002.A0I(10);
            b = true;
        }
    }
}
