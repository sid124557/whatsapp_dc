package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* renamed from: X.7om  reason: invalid class name and case insensitive filesystem */
public class C160987om {
    public static C158467k1 A01(int i, int i2) {
        C185968uX r0;
        C185968uX r02;
        int i3;
        C185968uX r03;
        if (i == 0 || i == 4) {
            if (i2 == 0) {
                r0 = new C177348eT();
            } else if (i2 == 1) {
                r0 = new C177338eS();
            } else if (i2 == 5) {
                r0 = new C173578Qt();
            } else {
                throw AnonymousClass001.A0e("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            return new C177218eG(r0);
        } else if (i == 1 || i == 5) {
            switch (i2) {
                case 0:
                    r02 = new C177348eT();
                    break;
                case 1:
                    r02 = new C177338eS();
                    break;
                case 2:
                    r02 = new C177328eR();
                    break;
                case 3:
                    r02 = new C173598Qv();
                    break;
                case 4:
                    r02 = new C177368eV();
                    break;
                case 5:
                    r02 = new C173578Qt();
                    break;
                case 6:
                    r02 = new C173588Qu();
                    break;
                case 7:
                    r02 = new C177358eU();
                    break;
                case 8:
                    r02 = new C177378eW();
                    break;
                case 9:
                    r02 = new C177388eX();
                    break;
                case 10:
                    i3 = 224;
                    break;
                case 11:
                    i3 = 256;
                    break;
                case 12:
                    i3 = 384;
                    break;
                case 13:
                    i3 = 512;
                    break;
                case 14:
                    r02 = new C177318eQ();
                    break;
                default:
                    throw AnonymousClass001.A0e("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
            r02 = new AnonymousClass8QQ(i3);
            return new C177238eI(r02);
        } else if (i != 2) {
            return new C177208eF();
        } else {
            switch (i2) {
                case 0:
                    r03 = new C177348eT();
                    break;
                case 1:
                    r03 = new C177338eS();
                    break;
                case 2:
                    r03 = new C177328eR();
                    break;
                case 3:
                    r03 = new C173598Qv();
                    break;
                case 4:
                    r03 = new C177368eV();
                    break;
                case 5:
                    r03 = new C173578Qt();
                    break;
                case 6:
                    r03 = new C173588Qu();
                    break;
                case 7:
                    r03 = new C177358eU();
                    break;
                case 8:
                    r03 = new C177378eW();
                    break;
                case 9:
                    r03 = new C177388eX();
                    break;
                default:
                    throw AnonymousClass001.A0e("unknown digest scheme for PBE encryption.");
            }
            return new C177228eH(r03);
        }
    }

    public static byte[] A02(PBEKeySpec pBEKeySpec, int i) {
        if (i == 2) {
            return C158467k1.A00(pBEKeySpec.getPassword());
        }
        if (i == 5 || i == 4) {
            char[] password = pBEKeySpec.getPassword();
            if (password != null) {
                return C162077rB.A04(password);
            }
            return new byte[0];
        }
        char[] password2 = pBEKeySpec.getPassword();
        if (password2 == null) {
            return new byte[0];
        }
        int length = password2.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2 = AnonymousClass6CA.A0A(bArr, password2[i2], i2)) {
        }
        return bArr;
    }

    public static C834748n A00(String str, AlgorithmParameterSpec algorithmParameterSpec, C173268Oy r6) {
        C834748n A02;
        if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
            throw AnonymousClass001.A0c("Need a PBEParameter spec with a PBE key.");
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
        C173268Oy.A00(r6);
        int i = r6.type;
        C173268Oy.A00(r6);
        C158467k1 A01 = A01(i, r6.digest);
        byte[] encoded = r6.getEncoded();
        if (r6.tryWrong) {
            encoded = new byte[2];
        }
        byte[] salt = pBEParameterSpec.getSalt();
        int iterationCount = pBEParameterSpec.getIterationCount();
        A01.A01 = encoded;
        A01.A02 = salt;
        A01.A00 = iterationCount;
        C173268Oy.A00(r6);
        int i2 = r6.ivSize;
        C173268Oy.A00(r6);
        if (i2 != 0) {
            int i3 = r6.keySize;
            C173268Oy.A00(r6);
            A02 = A01.A03(i3, r6.ivSize);
        } else {
            A02 = A01.A02(r6.keySize);
        }
        if (str.startsWith("DES")) {
            C834748n r0 = A02;
            if (A02 instanceof AnonymousClass8QP) {
                r0 = ((AnonymousClass8QP) r0).A00;
            }
            C177408eZ.A00(((AnonymousClass8QN) r0).A00);
        }
        return A02;
    }
}
