package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass7W0;
import X.AnonymousClass8QV;
import X.AnonymousClass8ST;
import X.AnonymousClass8U2;
import X.AnonymousClass8U3;
import X.C177348eT;
import X.C177488fx;

public class MD5 {

    public class Digest extends AnonymousClass8ST implements Cloneable {
        public Digest() {
            super(new C177348eT());
        }

        public Object clone() {
            AnonymousClass8ST r2 = (AnonymousClass8ST) super.clone();
            r2.A01 = new C177348eT((C177348eT) this.A01);
            return r2;
        }
    }

    public class HashMac extends AnonymousClass8U3 {
        public HashMac() {
            super(new AnonymousClass8QV(new C177348eT()));
        }
    }

    public class KeyGenerator extends AnonymousClass8U2 {
        public KeyGenerator() {
            super("HMACMD5", new AnonymousClass7W0(), 128);
        }
    }

    public class Mappings extends C177488fx {
        public static final String A00 = MD5.class.getName();
    }
}
