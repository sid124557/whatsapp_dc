package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6C7;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public class CertsInFilesystemDirectoryResolver extends StorageResolverSpi {
    public static Log a;
    public static Class b;
    public List c;

    public class FilesystemIterator implements Iterator {
        public List a;
        public int b = 0;

        public boolean hasNext() {
            return AnonymousClass001.A1Y(this.b, this.a.size());
        }

        public Object next() {
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        public void remove() {
            throw AnonymousClass002.A0G("Can't remove keys from KeyStore");
        }

        public FilesystemIterator(List list) {
            this.a = list;
        }
    }

    static {
        Class a2 = a("org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public Iterator a() {
        return new FilesystemIterator(this.c);
    }
}
