package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass7W0;
import X.AnonymousClass8QV;
import X.AnonymousClass8ST;
import X.AnonymousClass8U2;
import X.AnonymousClass8U3;
import X.C177368eV;
import X.C177468fe;
import X.C177488fx;

public class SHA256 {

    public class Digest extends AnonymousClass8ST implements Cloneable {
        public Digest() {
            super(new C177368eV());
        }

        public Object clone() {
            AnonymousClass8ST r2 = (AnonymousClass8ST) super.clone();
            r2.A01 = new C177368eV((C177368eV) this.A01);
            return r2;
        }
    }

    public class HashMac extends AnonymousClass8U3 {
        public HashMac() {
            super(new AnonymousClass8QV(new C177368eV()));
        }
    }

    public class KeyGenerator extends AnonymousClass8U2 {
        public KeyGenerator() {
            super("HMACSHA256", new AnonymousClass7W0(), 256);
        }
    }

    public class Mappings extends C177488fx {
        public static final String A00 = SHA256.class.getName();
    }

    public class PBEWithMacKeyFactory extends C177468fe {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", 2, 4, 256, 0, false);
        }
    }
}
