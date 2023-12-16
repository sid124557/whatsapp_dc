package org.apache.xml.security.keys.storage;

import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StorageResolver {
    public static Log a;
    public static Class d;
    public List b = null;
    public Iterator c = null;

    public class StorageResolverIterator implements Iterator {
        public Iterator a;
        public Iterator b;

        private Iterator a() {
            while (this.a.hasNext()) {
                Iterator a2 = ((StorageResolverSpi) this.a.next()).a();
                if (a2.hasNext()) {
                    return a2;
                }
            }
            return null;
        }

        public boolean hasNext() {
            Iterator it = this.b;
            if (it == null) {
                return false;
            }
            if (it.hasNext()) {
                return true;
            }
            Iterator a2 = a();
            this.b = a2;
            if (a2 != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw AnonymousClass002.A0G("Can't remove keys from KeyStore");
        }

        public Object next() {
            if (hasNext()) {
                return this.b.next();
            }
            throw AnonymousClass6CA.A0c();
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.keys.storage.StorageResolver");
        d = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
