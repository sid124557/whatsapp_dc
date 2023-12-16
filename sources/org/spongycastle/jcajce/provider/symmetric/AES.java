package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6CA;
import X.AnonymousClass7R3;
import X.AnonymousClass7W0;
import X.AnonymousClass8N4;
import X.AnonymousClass8QD;
import X.AnonymousClass8QR;
import X.AnonymousClass8QU;
import X.AnonymousClass8QW;
import X.AnonymousClass8QY;
import X.AnonymousClass8QZ;
import X.AnonymousClass8SO;
import X.AnonymousClass8SP;
import X.AnonymousClass8U1;
import X.AnonymousClass8U2;
import X.AnonymousClass8U3;
import X.AnonymousClass8U4;
import X.AnonymousClass8U5;
import X.C158947kq;
import X.C159887md;
import X.C161007oo;
import X.C161657qB;
import X.C173398Qa;
import X.C173408Qb;
import X.C173438Qe;
import X.C173558Qq;
import X.C176428cz;
import X.C176438d0;
import X.C176648dL;
import X.C176768dX;
import X.C176778dY;
import X.C176958dq;
import X.C177088e3;
import X.C177178eC;
import X.C177188eD;
import X.C177268eL;
import X.C177278eM;
import X.C177398eY;
import X.C177468fe;
import X.C177478fj;
import X.C18260x0;
import X.C18270x1;
import X.C185198tF;
import X.C185768uD;
import X.C185978uY;
import X.C186898w7;
import X.C186918w9;
import X.C188618zD;
import X.C834748n;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;

public final class AES {
    public static final Map A00;

    public class AESCCMMAC extends AnonymousClass8U3 {

        public class CCMMac implements C185978uY {
            public int A00 = 8;
            public final C173408Qb A01 = new C173408Qb(new AnonymousClass8QD());

            public int B24(byte[] bArr, int i) {
                try {
                    return this.A01.B24(bArr, 0);
                } catch (C177188eD e) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18270x1.A1H(A0o, "exception on doFinal(): ", e);
                    throw AnonymousClass001.A0e(A0o.toString());
                }
            }

            public int B9H() {
                return this.A00;
            }

            public void BFu(C834748n r3) {
                C173408Qb r1 = this.A01;
                r1.BFw(r3, true);
                this.A00 = r1.B9G().length;
            }

            public void BrT(byte b) {
                this.A01.A04.write(b);
            }

            public void reset() {
                C173408Qb r1 = this.A01;
                r1.A02.reset();
                r1.A04.reset();
                r1.A05.reset();
            }

            public void update(byte[] bArr, int i, int i2) {
                this.A01.BhZ(bArr, i, i2);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public class AESCMAC extends AnonymousClass8U3 {
        public AESCMAC() {
            super(new AnonymousClass8QU(new AnonymousClass8QD()));
        }
    }

    public class AESGMAC extends AnonymousClass8U3 {
        public AESGMAC() {
            super(new AnonymousClass8QR(new C173438Qe(new AnonymousClass8QD())));
        }
    }

    public class AlgParamGen extends AnonymousClass8SO {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = C161657qB.A00();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("AES", ((C173558Qq) this.A01).A00);
                instance.init(new IvParameterSpec(bArr));
                return instance;
            } catch (Exception e) {
                throw AnonymousClass002.A0E(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass6CA.A0Z("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenCCM extends AnonymousClass8SO {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("CCM", ((C173558Qq) this.A01).A00);
                instance.init(new C176428cz(bArr, 12).A0L());
                return instance;
            } catch (Exception e) {
                throw AnonymousClass002.A0E(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass6CA.A0Z("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenGCM extends AnonymousClass8SO {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("GCM", ((C173558Qq) this.A01).A00);
                instance.init(new C176438d0(bArr, 16).A0L());
                return instance;
            } catch (Exception e) {
                throw AnonymousClass002.A0E(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass6CA.A0Z("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParams extends AnonymousClass8SP {
        public byte[] A00;

        public String engineToString() {
            return "AES IV";
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass8SP.A00(str)) {
                return new C176648dL(engineGetEncoded("RAW")).A0L();
            }
            if (str.equals("RAW")) {
                return C161007oo.A02(this.A00);
            }
            return null;
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass8SP.A00(str)) {
                try {
                    engineInit(((C176778dY) C177088e3.A0I(bArr)).A00);
                } catch (Exception e) {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0P(e, "Exception decoding: ", AnonymousClass001.A0o()));
                }
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw AnonymousClass002.A0C("Unknown parameters format in IV parameters object");
            }
        }

        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public void engineInit(byte[] bArr) {
            int length = bArr.length;
            if (length % 8 != 0 && bArr[0] == 4 && bArr[1] == length - 2) {
                bArr = ((C176778dY) C177088e3.A0I(bArr)).A00;
            }
            this.A00 = C161007oo.A02(bArr);
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.A00 = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
    }

    public class AlgParamsCCM extends AnonymousClass8SP {
        public C176428cz A00;

        public String engineToString() {
            return "CCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass8SP.A00(str)) {
                return this.A00.A0L();
            }
            throw AnonymousClass002.A0C("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            C176428cz r2;
            if (AnonymousClass8SP.A00(str)) {
                if (bArr instanceof C176428cz) {
                    r2 = (C176428cz) bArr;
                } else if (bArr != null) {
                    r2 = new C176428cz(C176958dq.A0C(bArr));
                } else {
                    r2 = null;
                }
                this.A00 = r2;
                return;
            }
            throw AnonymousClass002.A0C("unknown format specified");
        }

        public byte[] engineGetEncoded() {
            return this.A00.A0L();
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C176428cz r2;
            Class cls = C159887md.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    C176438d0 r0 = (C176438d0) AccessController.doPrivileged(new AnonymousClass8N4(algorithmParameterSpec));
                    if (r0 != null) {
                        r2 = new C176428cz(C176958dq.A0C(r0));
                    } else {
                        r2 = null;
                    }
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof AnonymousClass8U5) {
                AnonymousClass8U5 r4 = (AnonymousClass8U5) algorithmParameterSpec;
                r2 = new C176428cz(r4.getIV(), r4.A00 / 8);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "AlgorithmParameterSpec class not recognized: ", algorithmParameterSpec);
                throw new InvalidParameterSpecException(A0o.toString());
            }
            this.A00 = r2;
        }

        public void engineInit(byte[] bArr) {
            C176428cz r2;
            if (bArr instanceof C176428cz) {
                r2 = (C176428cz) bArr;
            } else if (bArr != null) {
                r2 = new C176428cz(C176958dq.A0C(bArr));
            } else {
                r2 = null;
            }
            this.A00 = r2;
        }
    }

    public class AlgParamsGCM extends AnonymousClass8SP {
        public C176438d0 A00;

        public String engineToString() {
            return "GCM";
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass8SP.A00(str)) {
                return this.A00.A0L();
            }
            throw AnonymousClass002.A0C("unknown format specified");
        }

        public void engineInit(byte[] bArr, String str) {
            C176438d0 r2;
            if (AnonymousClass8SP.A00(str)) {
                if (bArr instanceof C176438d0) {
                    r2 = (C176438d0) bArr;
                } else if (bArr != null) {
                    r2 = new C176438d0(C176958dq.A0C(bArr));
                } else {
                    r2 = null;
                }
                this.A00 = r2;
                return;
            }
            throw AnonymousClass002.A0C("unknown format specified");
        }

        public byte[] engineGetEncoded() {
            return this.A00.A0L();
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            C176438d0 r2;
            Class cls = C159887md.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    r2 = (C176438d0) AccessController.doPrivileged(new AnonymousClass8N4(algorithmParameterSpec));
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof AnonymousClass8U5) {
                AnonymousClass8U5 r4 = (AnonymousClass8U5) algorithmParameterSpec;
                r2 = new C176438d0(r4.getIV(), r4.A00 / 8);
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1T(A0o, "AlgorithmParameterSpec class not recognized: ", algorithmParameterSpec);
                throw new InvalidParameterSpecException(A0o.toString());
            }
            this.A00 = r2;
        }

        public void engineInit(byte[] bArr) {
            C176438d0 r2;
            if (bArr instanceof C176438d0) {
                r2 = (C176438d0) bArr;
            } else if (bArr != null) {
                r2 = new C176438d0(C176958dq.A0C(bArr));
            } else {
                r2 = null;
            }
            this.A00 = r2;
        }
    }

    public class CCM extends C177478fj {
        public CCM() {
            super((C188618zD) new C173408Qb(new AnonymousClass8QD()), 12, false);
        }
    }

    public class CFB extends C177478fj {
        public CFB() {
            super(new C158947kq(new C177278eM(new AnonymousClass8QD(), 128)));
        }
    }

    public class ECB extends C177478fj {
        public ECB() {
            super(new Object() {
            });
        }
    }

    public class GCM extends C177478fj {
        public GCM() {
            super((C188618zD) new C173438Qe(new AnonymousClass8QD()));
        }
    }

    public class KeyFactory extends AnonymousClass8U4 {
        public KeyFactory() {
            super("AES", (C176768dX) null);
        }
    }

    public class KeyGen extends AnonymousClass8U2 {
        public KeyGen(int i) {
            super("AES", new AnonymousClass7W0(), i);
        }

        public KeyGen() {
            this(192);
        }
    }

    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public class OFB extends C177478fj {
        public OFB() {
            super(new C158947kq(new C177268eL(new AnonymousClass8QD(), 128)));
        }
    }

    public class PBEWithMD5And128BitAESCBCOpenSSL extends C177468fe {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", 3, 0, 128, 128, true);
        }
    }

    public class PBEWithMD5And192BitAESCBCOpenSSL extends C177468fe {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", 3, 0, 192, 128, true);
        }
    }

    public class PBEWithMD5And256BitAESCBCOpenSSL extends C177468fe {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", 3, 0, 256, 128, true);
        }
    }

    public class PBEWithSHA256And128BitAESBC extends C177468fe {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", 2, 4, 128, 128, true);
        }
    }

    public class PBEWithSHA256And192BitAESBC extends C177468fe {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", 2, 4, 192, 128, true);
        }
    }

    public class PBEWithSHA256And256BitAESBC extends C177468fe {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", 2, 4, 256, 128, true);
        }
    }

    public class PBEWithSHAAnd128BitAESBC extends C177468fe {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", 2, 1, 128, 128, true);
        }
    }

    public class PBEWithSHAAnd192BitAESBC extends C177468fe {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", 2, 1, 192, 128, true);
        }
    }

    public class PBEWithSHAAnd256BitAESBC extends C177468fe {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", 2, 1, 256, 128, true);
        }
    }

    public class Poly1305 extends AnonymousClass8U3 {
        public Poly1305() {
            super(new AnonymousClass8QW(new AnonymousClass8QD()));
        }
    }

    public class Poly1305KeyGen extends AnonymousClass8U2 {
        public Poly1305KeyGen() {
            super("Poly1305-AES", new C177178eC(), 256);
        }
    }

    public class RFC3211Wrap extends AnonymousClass8U1 {
        public RFC3211Wrap() {
            super(new AnonymousClass8QZ(new AnonymousClass8QD()), 16);
        }
    }

    public class RFC5649Wrap extends AnonymousClass8U1 {
        public RFC5649Wrap() {
            super(new C173398Qa(new AnonymousClass8QD()), 0);
        }
    }

    public class Wrap extends AnonymousClass8U1 {
        public Wrap() {
            super(new AnonymousClass8QY(), 0);
        }
    }

    public class WrapPad extends AnonymousClass8U1 {
        public WrapPad() {
            super(new C177398eY(), 0);
        }
    }

    public class CBC extends C177478fj {
        public CBC() {
            super(AnonymousClass8U1.A00(), 128);
        }
    }

    public class Mappings extends AnonymousClass7R3 {
        public static final String A00 = AES.class.getName();

        public void A07(C185198tF r37) {
            StringBuilder A0o = AnonymousClass001.A0o();
            String str = A00;
            A0o.append(str);
            C185198tF r11 = r37;
            r11.AwK("AlgorithmParameters.AES", AnonymousClass000.A0X("$AlgParams", A0o));
            r11.AwK("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            r11.AwK("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            StringBuilder A02 = AnonymousClass7R3.A02("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES", r11);
            A02.append("Alg.Alias.AlgorithmParameters.");
            C176768dX r35 = C186918w9.A08;
            StringBuilder A002 = AnonymousClass7R3.A00(r35, "AES", "Alg.Alias.AlgorithmParameters.", A02, r11);
            C176768dX r34 = C186918w9.A0G;
            StringBuilder A003 = AnonymousClass7R3.A00(r34, "AES", "Alg.Alias.AlgorithmParameters.", A002, r11);
            C176768dX r33 = C186918w9.A0O;
            StringBuilder A01 = AnonymousClass7R3.A01("AlgorithmParameters.GCM", AnonymousClass000.A0X("$AlgParamsGCM", AnonymousClass7R3.A00(r33, "AES", str, A003, r11)), "Alg.Alias.AlgorithmParameters.", r11);
            C176768dX r32 = C186918w9.A0C;
            StringBuilder A012 = AnonymousClass7R3.A01(AnonymousClass000.A0R(r32, A01), "GCM", "Alg.Alias.AlgorithmParameters.", r11);
            C176768dX r31 = C186918w9.A0K;
            StringBuilder A004 = AnonymousClass7R3.A00(r31, "GCM", "Alg.Alias.AlgorithmParameters.", A012, r11);
            C176768dX r4 = C186918w9.A0S;
            StringBuilder A013 = AnonymousClass7R3.A01("AlgorithmParameters.CCM", AnonymousClass000.A0X("$AlgParamsCCM", AnonymousClass7R3.A00(r4, "GCM", str, A004, r11)), "Alg.Alias.AlgorithmParameters.", r11);
            C176768dX r3 = C186918w9.A09;
            StringBuilder A014 = AnonymousClass7R3.A01(AnonymousClass000.A0R(r3, A013), "CCM", "Alg.Alias.AlgorithmParameters.", r11);
            C176768dX r2 = C186918w9.A0H;
            StringBuilder A005 = AnonymousClass7R3.A00(r2, "CCM", "Alg.Alias.AlgorithmParameters.", A014, r11);
            C176768dX r1 = C186918w9.A0P;
            r11.AwK("AlgorithmParameterGenerator.AES", AnonymousClass000.A0X("$AlgParamGen", AnonymousClass7R3.A00(r1, "CCM", str, A005, r11)));
            r11.AwK("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            r11.AwK("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            StringBuilder A022 = AnonymousClass7R3.A02("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES", r11);
            A022.append("Alg.Alias.AlgorithmParameterGenerator.");
            r11.AwK(AnonymousClass000.A0R(r33, AnonymousClass7R3.A00(r34, "AES", "Alg.Alias.AlgorithmParameterGenerator.", AnonymousClass7R3.A00(r35, "AES", "Alg.Alias.AlgorithmParameterGenerator.", A022, r11), r11)), "AES");
            Map map = AES.A00;
            r11.AwM("Cipher.AES", map);
            r11.AwK("Cipher.AES", AnonymousClass000.A0X("$ECB", AnonymousClass000.A0l(str)));
            r11.AwK("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            r11.AwK("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            r11.AwK("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            C176768dX r30 = C186918w9.A0B;
            r11.AwL("Cipher", AnonymousClass000.A0T(str, "$ECB"), r30);
            C176768dX r29 = C186918w9.A0J;
            AnonymousClass7R3.A03(str, "$ECB", "Cipher", r29, r11);
            C176768dX r28 = C186918w9.A0R;
            AnonymousClass7R3.A03(str, "$ECB", "Cipher", r28, r11);
            r11.AwL("Cipher", AnonymousClass000.A0X("$CBC", AnonymousClass000.A0l(str)), r35);
            AnonymousClass7R3.A03(str, "$CBC", "Cipher", r34, r11);
            AnonymousClass7R3.A03(str, "$CBC", "Cipher", r33, r11);
            C176768dX r27 = C186918w9.A0D;
            r11.AwL("Cipher", AnonymousClass000.A0X("$OFB", AnonymousClass000.A0l(str)), r27);
            C176768dX r26 = C186918w9.A0L;
            AnonymousClass7R3.A03(str, "$OFB", "Cipher", r26, r11);
            C176768dX r25 = C186918w9.A0T;
            AnonymousClass7R3.A03(str, "$OFB", "Cipher", r25, r11);
            C176768dX r24 = C186918w9.A0A;
            r11.AwL("Cipher", AnonymousClass000.A0X("$CFB", AnonymousClass000.A0l(str)), r24);
            C176768dX r23 = C186918w9.A0I;
            AnonymousClass7R3.A03(str, "$CFB", "Cipher", r23, r11);
            C176768dX r22 = C186918w9.A0Q;
            AnonymousClass7R3.A03(str, "$CFB", "Cipher", r22, r11);
            r11.AwM("Cipher.AESWRAP", map);
            r11.AwK("Cipher.AESWRAP", AnonymousClass000.A0X("$Wrap", AnonymousClass000.A0l(str)));
            C176768dX r21 = C186918w9.A0E;
            r11.AwL("Alg.Alias.Cipher", "AESWRAP", r21);
            C176768dX r20 = C186918w9.A0M;
            r11.AwL("Alg.Alias.Cipher", "AESWRAP", r20);
            C176768dX r19 = C186918w9.A0U;
            r11.AwL("Alg.Alias.Cipher", "AESWRAP", r19);
            r11.AwK("Alg.Alias.Cipher.AESKW", "AESWRAP");
            r11.AwM("Cipher.AESWRAPPAD", map);
            r11.AwK("Cipher.AESWRAPPAD", AnonymousClass000.A0X("$WrapPad", AnonymousClass000.A0l(str)));
            C176768dX r18 = C186918w9.A0F;
            r11.AwL("Alg.Alias.Cipher", "AESWRAPPAD", r18);
            C176768dX r17 = C186918w9.A0N;
            r11.AwL("Alg.Alias.Cipher", "AESWRAPPAD", r17);
            C176768dX r16 = C186918w9.A0V;
            r11.AwL("Alg.Alias.Cipher", "AESWRAPPAD", r16);
            r11.AwK(AnonymousClass000.A0R(r1, AnonymousClass7R3.A00(r2, "CCM", "Alg.Alias.AlgorithmParameterGenerator.", AnonymousClass7R3.A00(r3, "CCM", "Alg.Alias.AlgorithmParameterGenerator.", AnonymousClass7R3.A01("AlgorithmParameterGenerator.CCM", AnonymousClass000.A0X("$AlgParamGenCCM", AnonymousClass7R3.A01("Cipher.AESRFC5649WRAP", AnonymousClass000.A0X("$RFC5649Wrap", AnonymousClass7R3.A01("Cipher.AESRFC3211WRAP", AnonymousClass000.A0X("$RFC3211Wrap", AnonymousClass7R3.A01("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", str, r11)), str, r11)), str, r11)), "Alg.Alias.AlgorithmParameterGenerator.", r11), r11), r11)), "CCM");
            r11.AwM("Cipher.CCM", map);
            r11.AwK("Cipher.CCM", AnonymousClass000.A0X("$CCM", AnonymousClass000.A0l(str)));
            r11.AwL("Alg.Alias.Cipher", "CCM", r3);
            r11.AwL("Alg.Alias.Cipher", "CCM", r2);
            r11.AwL("Alg.Alias.Cipher", "CCM", r1);
            r11.AwK(AnonymousClass000.A0R(r4, AnonymousClass7R3.A00(r31, "GCM", "Alg.Alias.AlgorithmParameterGenerator.", AnonymousClass7R3.A00(r32, "GCM", "Alg.Alias.AlgorithmParameterGenerator.", AnonymousClass7R3.A01("AlgorithmParameterGenerator.GCM", AnonymousClass000.A0X("$AlgParamGenGCM", AnonymousClass000.A0l(str)), "Alg.Alias.AlgorithmParameterGenerator.", r11), r11), r11)), "GCM");
            r11.AwM("Cipher.GCM", map);
            r11.AwK("Cipher.GCM", AnonymousClass000.A0X("$GCM", AnonymousClass000.A0l(str)));
            r11.AwL("Alg.Alias.Cipher", "GCM", r32);
            r11.AwL("Alg.Alias.Cipher", "GCM", r31);
            r11.AwL("Alg.Alias.Cipher", "GCM", r4);
            r11.AwK("KeyGenerator.2.16.840.1.101.3.4.42", AnonymousClass000.A0X("$KeyGen256", AnonymousClass7R3.A01("KeyGenerator.2.16.840.1.101.3.4.22", AnonymousClass000.A0X("$KeyGen192", AnonymousClass7R3.A01("KeyGenerator.2.16.840.1.101.3.4.2", AnonymousClass000.A0X("$KeyGen128", AnonymousClass7R3.A01("KeyGenerator.AES", AnonymousClass000.A0X("$KeyGen", AnonymousClass000.A0l(str)), str, r11)), str, r11)), str, r11)));
            r11.AwL("KeyGenerator", AnonymousClass000.A0T(str, "$KeyGen128"), r30);
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r35, r11);
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r27, r11);
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r24, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r29, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r34, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r26, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r23, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r28, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r33, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r25, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r22, r11);
            r11.AwK("KeyGenerator.AESWRAP", AnonymousClass000.A0T(str, "$KeyGen"));
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r21, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r20, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r19, r11);
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r32, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r31, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r4, r11);
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r3, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r2, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r1, r11);
            r11.AwK("KeyGenerator.AESWRAPPAD", AnonymousClass000.A0T(str, "$KeyGen"));
            AnonymousClass7R3.A03(str, "$KeyGen128", "KeyGenerator", r18, r11);
            AnonymousClass7R3.A03(str, "$KeyGen192", "KeyGenerator", r17, r11);
            AnonymousClass7R3.A03(str, "$KeyGen256", "KeyGenerator", r16, r11);
            StringBuilder A023 = AnonymousClass7R3.A02("Mac.AESCCMMAC", AnonymousClass000.A0X("$AESCCMMAC", AnonymousClass7R3.A01("Mac.AESCMAC", AnonymousClass000.A0X("$AESCMAC", AnonymousClass000.A0l(str)), str, r11)), r11);
            A023.append("Alg.Alias.Mac.");
            r11.AwK(AnonymousClass000.A0X(r3.A01, A023), "AESCCMMAC");
            AnonymousClass7R3.A04("Alg.Alias.Mac.", "AESCCMMAC", r2, r11);
            AnonymousClass7R3.A04("Alg.Alias.Mac.", "AESCCMMAC", r1, r11);
            C176768dX r212 = C186898w7.A06;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            C176768dX r202 = C186898w7.A07;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            C176768dX r192 = C186898w7.A08;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            C176768dX r182 = C186898w7.A0D;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            C176768dX r172 = C186898w7.A0E;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            C176768dX r210 = C186898w7.A0F;
            r11.AwL("Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            r11.AwK("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256AESCBC256", AnonymousClass7R3.A01("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256AESCBC192", AnonymousClass7R3.A01("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256AESCBC128", AnonymousClass7R3.A01("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA1AESCBC256", AnonymousClass7R3.A01("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA1AESCBC192", AnonymousClass7R3.A01("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA1AESCBC128", AnonymousClass000.A0l(str)), str, r11)), str, r11)), str, r11)), str, r11)), str, r11)));
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.AwK("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", AnonymousClass000.A0X("$PBEWithAESCBC", AnonymousClass7R3.A01("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC", str, r11)));
            r11.AwK("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", AnonymousClass000.A0T(str, "$PBEWithAESCBC"));
            r11.AwK("SecretKeyFactory.AES", AnonymousClass000.A0X("$KeyFactory", AnonymousClass7R3.A01("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", AnonymousClass000.A0T(str, "$PBEWithAESCBC"), str, r11)));
            r11.AwL("SecretKeyFactory", AnonymousClass000.A0T(str, "$KeyFactory"), C186918w9.A00);
            r11.AwK("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256And256BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256And192BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHA256And128BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHAAnd256BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHAAnd192BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", AnonymousClass000.A0X("$PBEWithSHAAnd128BitAESBC", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", AnonymousClass000.A0X("$PBEWithMD5And256BitAESCBCOpenSSL", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", AnonymousClass000.A0X("$PBEWithMD5And192BitAESCBCOpenSSL", AnonymousClass7R3.A01("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", AnonymousClass000.A0X("$PBEWithMD5And128BitAESCBCOpenSSL", AnonymousClass000.A0l(str)), str, r11)), str, r11)), str, r11)), str, r11)), str, r11)), str, r11)), str, r11)), str, r11)));
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.AwK("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND128BITAES-CBC-BC", r212);
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND192BITAES-CBC-BC", r202);
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHAAND256BITAES-CBC-BC", r192);
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND128BITAES-CBC-BC", r182);
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND192BITAES-CBC-BC", r172);
            r11.AwL("Alg.Alias.SecretKeyFactory", "PBEWITHSHA256AND256BITAES-CBC-BC", r210);
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.AwK("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r212, r11);
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r202, r11);
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r192, r11);
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r182, r11);
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r172, r11);
            AnonymousClass7R3.A04("Alg.Alias.AlgorithmParameters.", "PKCS12PBE", r210, r11);
            String A0X = AnonymousClass000.A0X("$AESGMAC", AnonymousClass000.A0l(str));
            String A0T = AnonymousClass000.A0T(str, "$KeyGen128");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Mac.");
            A0o2.append("AES");
            r11.AwK(AnonymousClass000.A0X("-GMAC", A0o2), A0X);
            String A0X2 = AnonymousClass000.A0X("$Poly1305", AnonymousClass7R3.A01(AnonymousClass000.A0U("Alg.Alias.KeyGenerator.", "AES", "GMAC", AnonymousClass7R3.A02(AnonymousClass000.A0U("KeyGenerator.", "AES", "-GMAC", AnonymousClass7R3.A02(AnonymousClass000.A0X("GMAC", AnonymousClass000.A0m("Alg.Alias.Mac.", "AES")), AnonymousClass000.A0T("AES", "-GMAC"), r11)), A0T, r11)), AnonymousClass000.A0T("AES", "-GMAC"), str, r11));
            r11.AwK(AnonymousClass000.A0V("Alg.Alias.KeyGenerator.POLY1305", "AES", AnonymousClass7R3.A02(AnonymousClass000.A0V("KeyGenerator.POLY1305-", "AES", AnonymousClass7R3.A02(AnonymousClass000.A0V("Alg.Alias.Mac.POLY1305", "AES", AnonymousClass7R3.A02(AnonymousClass000.A0V("Mac.POLY1305-", "AES", AnonymousClass001.A0o()), A0X2, r11)), AnonymousClass000.A0V("POLY1305-", "AES", AnonymousClass001.A0o()), r11)), AnonymousClass000.A0X("$Poly1305KeyGen", AnonymousClass000.A0l(str)), r11)), AnonymousClass000.A0T("POLY1305-", "AES"));
        }
    }

    public class PBEWithAESCBC extends C177478fj {
        public PBEWithAESCBC() {
            super((C185768uD) AnonymousClass8U1.A00());
        }
    }

    public class PBEWithSHA1AESCBC128 extends C177478fj {
        public PBEWithSHA1AESCBC128() {
            super((C185768uD) AnonymousClass8U1.A00(), 1, 128);
        }
    }

    public class PBEWithSHA1AESCBC192 extends C177478fj {
        public PBEWithSHA1AESCBC192() {
            super((C185768uD) AnonymousClass8U1.A00(), 1, 192);
        }
    }

    public class PBEWithSHA1AESCBC256 extends C177478fj {
        public PBEWithSHA1AESCBC256() {
            super((C185768uD) AnonymousClass8U1.A00(), 1, 256);
        }
    }

    public class PBEWithSHA256AESCBC128 extends C177478fj {
        public PBEWithSHA256AESCBC128() {
            super((C185768uD) AnonymousClass8U1.A00(), 4, 128);
        }
    }

    public class PBEWithSHA256AESCBC192 extends C177478fj {
        public PBEWithSHA256AESCBC192() {
            super((C185768uD) AnonymousClass8U1.A00(), 4, 192);
        }
    }

    public class PBEWithSHA256AESCBC256 extends C177478fj {
        public PBEWithSHA256AESCBC256() {
            super((C185768uD) AnonymousClass8U1.A00(), 4, 256);
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        A0t.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        A0t.put("SupportedKeyFormats", "RAW");
    }
}
