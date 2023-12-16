package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass7W0;
import X.AnonymousClass8QT;
import X.AnonymousClass8QV;
import X.AnonymousClass8ST;
import X.AnonymousClass8U2;
import X.AnonymousClass8U3;
import X.C177378eW;
import X.C177488fx;

public class SHA384 {

    public class Digest extends AnonymousClass8ST implements Cloneable {
        public Digest() {
            super(new C177378eW());
        }

        public Object clone() {
            AnonymousClass8ST r2 = (AnonymousClass8ST) super.clone();
            r2.A01 = new C177378eW((C177378eW) this.A01);
            return r2;
        }
    }

    public class HashMac extends AnonymousClass8U3 {
        public HashMac() {
            super(new AnonymousClass8QV(new C177378eW()));
        }
    }

    public class KeyGenerator extends AnonymousClass8U2 {
        public KeyGenerator() {
            super("HMACSHA384", new AnonymousClass7W0(), 384);
        }
    }

    public class Mappings extends C177488fx {
        public static final String A00 = SHA384.class.getName();
    }

    public class OldSHA384 extends AnonymousClass8U3 {
        public OldSHA384() {
            super(new AnonymousClass8QT(new C177378eW()));
        }
    }
}
