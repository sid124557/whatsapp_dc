package org.apache.xml.security.keys.storage.implementations;

import X.AnonymousClass002;
import X.AnonymousClass6CA;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.Iterator;
import org.apache.xml.security.keys.storage.StorageResolverSpi;

public class KeyStoreResolver extends StorageResolverSpi {
    public KeyStore a;

    public class KeyStoreIterator implements Iterator {
        public KeyStore a;
        public Enumeration b = null;
        public Certificate c = null;

        private Certificate a() {
            while (this.b.hasMoreElements()) {
                try {
                    Certificate certificate = this.a.getCertificate((String) this.b.nextElement());
                    if (certificate != null) {
                        return certificate;
                    }
                } catch (KeyStoreException unused) {
                }
            }
            return null;
        }

        public boolean hasNext() {
            if (this.c == null) {
                Certificate a2 = a();
                this.c = a2;
                if (a2 != null) {
                    return true;
                }
                return false;
            }
            return true;
        }

        public Object next() {
            Certificate certificate = this.c;
            if (certificate == null) {
                certificate = a();
                this.c = certificate;
                if (certificate == null) {
                    throw AnonymousClass6CA.A0c();
                }
            }
            this.c = null;
            return certificate;
        }

        public void remove() {
            throw AnonymousClass002.A0G("Can't remove keys from KeyStore");
        }

        public KeyStoreIterator(KeyStore keyStore) {
            try {
                this.a = keyStore;
                this.b = keyStore.aliases();
            } catch (KeyStoreException unused) {
                this.b = new Enumeration(this) {
                    public final KeyStoreIterator a;

                    {
                        this.a = r1;
                    }

                    public boolean hasMoreElements() {
                        return false;
                    }

                    public Object nextElement() {
                        return null;
                    }
                };
            }
        }
    }

    public Iterator a() {
        return new KeyStoreIterator(this.a);
    }
}
