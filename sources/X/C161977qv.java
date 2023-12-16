package X;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7qv  reason: invalid class name and case insensitive filesystem */
public class C161977qv {
    public static final Map A00;
    public static final C176688dP A01 = C176108cT.A00;

    public static void A02(String str, StringBuffer stringBuffer, byte[] bArr) {
        byte[] A02;
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length > 20) {
            stringBuffer.append(AnonymousClass6C9.A0g(bArr, 20));
            stringBuffer.append(str);
            int i = 20;
            do {
                int i2 = length - 20;
                stringBuffer.append("                       ");
                if (i < i2) {
                    A02 = AnonymousClass35E.A02(bArr, i, 20);
                } else {
                    A02 = AnonymousClass35E.A02(bArr, i, length - i);
                }
                stringBuffer.append(C162077rB.A02(A02));
                stringBuffer.append(str);
                i += 20;
            } while (i < length);
            return;
        }
        stringBuffer.append(AnonymousClass6C9.A0g(bArr, length));
        stringBuffer.append(str);
    }

    public static String A00(C176768dX r4) {
        String A0o = C18310x6.A0o(r4, AnonymousClass78B.A00);
        if (A0o == null) {
            A0o = r4.A01;
        }
        int indexOf = A0o.indexOf(45);
        if (indexOf <= 0 || A0o.startsWith("SHA3")) {
            return A0o;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(AnonymousClass0x7.A0r(A0o, indexOf));
        return AnonymousClass000.A0X(AnonymousClass6C9.A0c(indexOf, A0o), A0o2);
    }

    public static String A01(C176528d9 r6) {
        C176688dP r1;
        StringBuilder A0o;
        String str;
        C176468d3 r2;
        C183618qL r22 = r6.A00;
        if (!(r22 == null || (r1 = A01) == r22 || r1.A0S(r22.Bqk()))) {
            C176768dX r12 = r6.A01;
            if (r12.A0T(C186938wB.A0I)) {
                if (r22 instanceof C176468d3) {
                    r2 = (C176468d3) r22;
                } else {
                    r2 = new C176468d3(C176958dq.A0C(r22));
                }
                A0o = AnonymousClass001.A0o();
                A0o.append(A00(r2.A02.A01));
                str = "withRSAandMGF1";
            } else if (r12.A0T(C186928wA.A0Y)) {
                C176958dq A0C = C176958dq.A0C(r22);
                A0o = AnonymousClass001.A0o();
                A0o.append(A00((C176768dX) C176958dq.A0A(A0C)));
                str = "withECDSA";
            }
            return AnonymousClass000.A0X(str, A0o);
        }
        Map map = A00;
        C176768dX r62 = r6.A01;
        String A0o2 = C18310x6.A0o(r62, map);
        if (A0o2 != null) {
            return A0o2;
        }
        Provider provider = Security.getProvider("SC");
        if (provider != null) {
            String property = provider.getProperty(AnonymousClass000.A0P(r62, "Alg.Alias.Signature.", AnonymousClass001.A0o()));
            if (property != null) {
                return property;
            }
            String property2 = provider.getProperty(AnonymousClass000.A0P(r62, "Alg.Alias.Signature.OID.", AnonymousClass001.A0o()));
            if (property2 != null) {
                return property2;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            if (provider != provider2) {
                String property3 = provider2.getProperty(AnonymousClass000.A0P(r62, "Alg.Alias.Signature.", AnonymousClass001.A0o()));
                if (property3 != null) {
                    return property3;
                }
                String property4 = provider2.getProperty(AnonymousClass000.A0P(r62, "Alg.Alias.Signature.OID.", AnonymousClass001.A0o()));
                if (property4 != null) {
                    return property4;
                }
            }
        }
        return r62.A01;
    }

    public static void A03(Signature signature, C183618qL r4) {
        C176688dP r1;
        if (r4 != null && (r1 = A01) != r4 && !r1.A0S(r4.Bqk())) {
            AlgorithmParameters instance = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
            try {
                instance.init(r4.Bqk().A0L());
                if (signature.getAlgorithm().endsWith("MGF1")) {
                    try {
                        signature.setParameter(instance.getParameterSpec(PSSParameterSpec.class));
                    } catch (GeneralSecurityException e) {
                        throw new SignatureException(AnonymousClass000.A0a("Exception extracting parameters: ", AnonymousClass001.A0o(), e));
                    }
                }
            } catch (IOException e2) {
                throw new SignatureException(AnonymousClass000.A0a("IOException decoding parameters: ", AnonymousClass001.A0o(), e2));
            }
        }
    }

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A00 = A0t;
        A0t.put(C186748vs.A00, "Ed25519");
        A0t.put(C186748vs.A01, "Ed448");
        A0t.put(C186788vw.A05, "SHA1withDSA");
        A0t.put(C186928wA.A0g, "SHA1withDSA");
    }
}
