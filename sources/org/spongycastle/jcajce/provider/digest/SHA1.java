package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass7W0;
import X.AnonymousClass8QV;
import X.AnonymousClass8ST;
import X.AnonymousClass8U2;
import X.AnonymousClass8U3;
import X.C177338eS;
import X.C177468fe;
import X.C177488fx;

public class SHA1 {

    public class Digest extends AnonymousClass8ST implements Cloneable {
        public Digest() {
            super(new C177338eS());
        }

        public Object clone() {
            AnonymousClass8ST r2 = (AnonymousClass8ST) super.clone();
            r2.A01 = new C177338eS((C177338eS) this.A01);
            return r2;
        }
    }

    public class HashMac extends AnonymousClass8U3 {
        public HashMac() {
            super(new AnonymousClass8QV(new C177338eS()));
        }
    }

    public class KeyGenerator extends AnonymousClass8U2 {
        public KeyGenerator() {
            super("HMACSHA1", new AnonymousClass7W0(), 160);
        }
    }

    public class Mappings extends C177488fx {
        public static final String A00 = SHA1.class.getName();
    }

    public class PBEWithMacKeyFactory extends C177468fe {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", 2, 1, 160, 0, false);
        }
    }

    public class SHA1Mac extends AnonymousClass8U3 {
        public SHA1Mac() {
            super(new AnonymousClass8QV(new C177338eS()));
        }
    }
}
