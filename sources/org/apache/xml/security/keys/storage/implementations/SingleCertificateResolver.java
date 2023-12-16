package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass002;
import X.AnonymousClass6CA;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public class SingleCertificateResolver extends StorageResolverSpi {
    public X509Certificate a;

    public class InternalIterator implements Iterator {
        public boolean a = false;
        public X509Certificate b;

        public boolean hasNext() {
            return !this.a;
        }

        public Object next() {
            if (!this.a) {
                this.a = true;
                return this.b;
            }
            throw AnonymousClass6CA.A0c();
        }

        public void remove() {
            throw AnonymousClass002.A0G("Can't remove keys from KeyStore");
        }

        public InternalIterator(X509Certificate x509Certificate) {
            this.b = x509Certificate;
        }
    }

    public Iterator a() {
        return new InternalIterator(this.a);
    }
}
