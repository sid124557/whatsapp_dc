package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass6C7;
import X.AnonymousClass7R3;
import X.AnonymousClass8SP;
import X.AnonymousClass8U4;
import X.C143066yH;
import X.C158467k1;
import X.C160987om;
import X.C173258Ox;
import X.C173268Oy;
import X.C176458d2;
import X.C176958dq;
import X.C177088e3;
import X.C18270x1;
import X.C186878w5;
import X.C186908w8;
import X.C186918w9;
import X.C186938wB;
import X.C834748n;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class PBEPBKDF2 {
    public static final Map A00;

    public class AlgParams extends AnonymousClass8SP {
        public C176458d2 A00;

        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass8SP.A00(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass8SP.A00(str)) {
                engineInit(bArr);
                return;
            }
            throw AnonymousClass002.A0C("Unknown parameters format in PBKDF2 parameters object");
        }

        public byte[] engineGetEncoded() {
            try {
                return this.A00.A0M("DER");
            } catch (IOException e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "Oooops! ", e);
                throw AnonymousClass6C7.A0e(A0o);
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.A00 = new C176458d2(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) {
            C176458d2 r0;
            C177088e3 A0I = C177088e3.A0I(bArr);
            if (A0I != null) {
                r0 = new C176458d2(C176958dq.A0C(A0I));
            } else {
                r0 = null;
            }
            this.A00 = r0;
        }
    }

    public class BasePBKDF2 extends AnonymousClass8U4 {
        public int A00;
        public int A01;

        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            C143066yH r1;
            KeySpec keySpec2 = keySpec;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec2;
                if (pBEKeySpec.getSalt() == null) {
                    char[] password = pBEKeySpec.getPassword();
                    if (this.A01 == 1) {
                        r1 = C143066yH.A01;
                    } else {
                        r1 = C143066yH.A02;
                    }
                    return new C173258Ox(r1, password);
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("positive iteration count required: ");
                    throw new InvalidKeySpecException(AnonymousClass000.A0h(A0o, pBEKeySpec.getIterationCount()));
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("positive key length required: ");
                    throw new InvalidKeySpecException(AnonymousClass000.A0h(A0o2, pBEKeySpec.getKeyLength()));
                } else if (pBEKeySpec.getPassword().length != 0) {
                    int i = this.A00;
                    int keyLength = pBEKeySpec.getKeyLength();
                    int i2 = this.A01;
                    C158467k1 A012 = C160987om.A01(i2, i);
                    byte[] A02 = C160987om.A02(pBEKeySpec, i2);
                    byte[] salt = pBEKeySpec.getSalt();
                    int iterationCount = pBEKeySpec.getIterationCount();
                    A012.A01 = A02;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    C834748n A013 = A012.A01(keyLength);
                    for (int i3 = 0; i3 != A02.length; i3++) {
                        A02[i3] = 0;
                    }
                    return new C173268Oy(this.A00, pBEKeySpec, this.A01, A013, i2, i, keyLength, -1);
                } else {
                    throw AnonymousClass001.A0c("password empty");
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public BasePBKDF2(int i, int i2) {
            super("PBKDF2", C186938wB.A0G);
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public class Mappings extends AnonymousClass7R3 {
        public static final String A00 = PBEPBKDF2.class.getName();
    }

    public class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(1, 1);
        }
    }

    public class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(5, 6);
        }
    }

    public class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(5, 7);
        }
    }

    public class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(5, 4);
        }
    }

    public class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(5, 8);
        }
    }

    public class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(5, 10);
        }
    }

    public class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(5, 11);
        }
    }

    public class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(5, 12);
        }
    }

    public class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(5, 13);
        }
    }

    public class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(5, 9);
        }
    }

    public class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super(5, 14);
        }
    }

    public class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(5, 1);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        AnonymousClass0x2.A1I(C186878w5.A0J, A0t, 6);
        AnonymousClass0x2.A1I(C186938wB.A1E, A0t, 1);
        AnonymousClass0x2.A1I(C186938wB.A1G, A0t, 4);
        AnonymousClass0x2.A1I(C186938wB.A1F, A0t, 7);
        AnonymousClass0x2.A1I(C186938wB.A1H, A0t, 8);
        AnonymousClass0x2.A1I(C186938wB.A1I, A0t, 9);
        AnonymousClass0x2.A1I(C186918w9.A0g, A0t, 11);
        AnonymousClass0x2.A1I(C186918w9.A0f, A0t, 10);
        AnonymousClass0x2.A1I(C186918w9.A0h, A0t, 12);
        AnonymousClass0x2.A1I(C186918w9.A0i, A0t, 13);
        AnonymousClass0x2.A1I(C186908w8.A00, A0t, 14);
    }
}
