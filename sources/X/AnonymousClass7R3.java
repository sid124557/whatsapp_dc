package X;

import org.spongycastle.jcajce.provider.digest.MD5;
import org.spongycastle.jcajce.provider.digest.SHA1;
import org.spongycastle.jcajce.provider.digest.SHA256;
import org.spongycastle.jcajce.provider.digest.SHA384;
import org.spongycastle.jcajce.provider.symmetric.PBEPBKDF2;

/* renamed from: X.7R3  reason: invalid class name */
public abstract class AnonymousClass7R3 {
    public static void A03(String str, String str2, String str3, C176768dX r4, C185198tF r5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        r5.AwL(str3, sb.toString(), r4);
    }

    public static void A04(String str, String str2, C176768dX r4, C185198tF r5) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(r4.A01);
        r5.AwK(sb.toString(), str2);
    }

    public void A07(C185198tF r6) {
        String A0X;
        String str;
        if (this instanceof PBEPBKDF2.Mappings) {
            StringBuilder A0o = AnonymousClass001.A0o();
            String str2 = PBEPBKDF2.Mappings.A00;
            A0o.append(str2);
            StringBuilder A02 = A02("AlgorithmParameters.PBKDF2", AnonymousClass000.A0X("$AlgParams", A0o), r6);
            A02.append("Alg.Alias.AlgorithmParameters.");
            C176768dX r4 = C186938wB.A0G;
            r6.AwK("SecretKeyFactory.PBKDF2", AnonymousClass000.A0X("$PBKDF2withUTF8", A01(AnonymousClass000.A0R(r4, A02), "PBKDF2", str2, r6)));
            r6.AwK("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
            StringBuilder A022 = A02("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2", r6);
            A022.append("Alg.Alias.SecretKeyFactory.");
            r6.AwK("SecretKeyFactory.PBKDF2WITHASCII", AnonymousClass000.A0X("$PBKDF2with8BIT", A00(r4, "PBKDF2", str2, A022, r6)));
            r6.AwK("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
            A0X = AnonymousClass000.A0X("$PBKDF2withSM3", A01("SecretKeyFactory.PBKDF2WITHHMACGOST3411", AnonymousClass000.A0X("$PBKDF2withGOST3411", A01("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", AnonymousClass000.A0X("$PBKDF2withSHA3_512", A01("SecretKeyFactory.PBKDF2WITHHMACSHA3-384", AnonymousClass000.A0X("$PBKDF2withSHA3_384", A01("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", AnonymousClass000.A0X("$PBKDF2withSHA3_256", A01("SecretKeyFactory.PBKDF2WITHHMACSHA3-224", AnonymousClass000.A0X("$PBKDF2withSHA3_224", A01("SecretKeyFactory.PBKDF2WITHHMACSHA512", AnonymousClass000.A0X("$PBKDF2withSHA512", A01("SecretKeyFactory.PBKDF2WITHHMACSHA384", AnonymousClass000.A0X("$PBKDF2withSHA384", A01("SecretKeyFactory.PBKDF2WITHHMACSHA256", AnonymousClass000.A0X("$PBKDF2withSHA256", A01("SecretKeyFactory.PBKDF2WITHHMACSHA224", AnonymousClass000.A0X("$PBKDF2withSHA224", A01("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII", str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6)), str2, r6));
            str = "SecretKeyFactory.PBKDF2WITHHMACSM3";
        } else if (this instanceof SHA384.Mappings) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            String str3 = SHA384.Mappings.A00;
            A0o2.append(str3);
            r6.AwK("MessageDigest.SHA-384", AnonymousClass000.A0X("$Digest", A0o2));
            StringBuilder A023 = A02("Alg.Alias.MessageDigest.SHA384", "SHA-384", r6);
            A023.append("Alg.Alias.MessageDigest.");
            r6.AwK("Mac.PBEWITHHMACSHA384", AnonymousClass000.A0X("$HashMac", A01("Mac.OLDHMACSHA384", AnonymousClass000.A0X("$OldSHA384", A00(C186918w9.A0p, "SHA-384", str3, A023, r6)), str3, r6)));
            C177488fx.A05("SHA384", AnonymousClass000.A0T(str3, "$HashMac"), AnonymousClass000.A0X("$KeyGenerator", AnonymousClass000.A0l(str3)), r6);
            C177488fx.A06("SHA384", C186938wB.A1H, r6);
            return;
        } else if (this instanceof SHA256.Mappings) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            String str4 = SHA256.Mappings.A00;
            A0o3.append(str4);
            r6.AwK("MessageDigest.SHA-256", AnonymousClass000.A0X("$Digest", A0o3));
            StringBuilder A024 = A02("Alg.Alias.MessageDigest.SHA256", "SHA-256", r6);
            A024.append("Alg.Alias.MessageDigest.");
            C176768dX r3 = C186918w9.A0o;
            r6.AwK("SecretKeyFactory.PBEWITHHMACSHA256", AnonymousClass000.A0X("$PBEWithMacKeyFactory", A00(r3, "SHA-256", str4, A024, r6)));
            StringBuilder A025 = A02("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256", r6);
            A025.append("Alg.Alias.SecretKeyFactory.");
            r6.AwK("Mac.PBEWITHHMACSHA256", AnonymousClass000.A0X("$HashMac", A00(r3, "PBEWITHHMACSHA256", str4, A025, r6)));
            C177488fx.A05("SHA256", AnonymousClass000.A0T(str4, "$HashMac"), AnonymousClass000.A0X("$KeyGenerator", AnonymousClass000.A0l(str4)), r6);
            C177488fx.A06("SHA256", C186938wB.A1G, r6);
            C177488fx.A06("SHA256", r3, r6);
            return;
        } else {
            boolean z = this instanceof SHA1.Mappings;
            StringBuilder A0o4 = AnonymousClass001.A0o();
            if (z) {
                String str5 = SHA1.Mappings.A00;
                A0o4.append(str5);
                r6.AwK("MessageDigest.SHA-1", AnonymousClass000.A0X("$Digest", A0o4));
                r6.AwK("Alg.Alias.MessageDigest.SHA1", "SHA-1");
                StringBuilder A026 = A02("Alg.Alias.MessageDigest.SHA", "SHA-1", r6);
                A026.append("Alg.Alias.MessageDigest.");
                C176768dX r42 = C186788vw.A07;
                C177488fx.A05("SHA1", AnonymousClass000.A0X("$HashMac", A00(r42, "SHA-1", str5, A026, r6)), AnonymousClass000.A0X("$KeyGenerator", AnonymousClass000.A0l(str5)), r6);
                C177488fx.A06("SHA1", C186938wB.A1E, r6);
                C177488fx.A06("SHA1", C186798vx.A06, r6);
                r6.AwK("Mac.PBEWITHHMACSHA", AnonymousClass000.A0X("$SHA1Mac", AnonymousClass000.A0l(str5)));
                r6.AwK("Mac.PBEWITHHMACSHA1", AnonymousClass000.A0T(str5, "$SHA1Mac"));
                A0X = AnonymousClass000.A0X("$PBEWithMacKeyFactory", A01(AnonymousClass000.A0P(r42, "Alg.Alias.Mac.", A02(AnonymousClass000.A0P(r42, "Alg.Alias.SecretKeyFactory.", A02("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1", r6)), "PBEWITHHMACSHA1", r6)), "PBEWITHHMACSHA", str5, r6));
                str = "SecretKeyFactory.PBEWITHHMACSHA1";
            } else {
                String str6 = MD5.Mappings.A00;
                A0o4.append(str6);
                StringBuilder A027 = A02("MessageDigest.MD5", AnonymousClass000.A0X("$Digest", A0o4), r6);
                A027.append("Alg.Alias.MessageDigest.");
                C177488fx.A05("MD5", AnonymousClass000.A0X("$HashMac", A01(AnonymousClass000.A0R(C186938wB.A1U, A027), "MD5", str6, r6)), AnonymousClass000.A0X("$KeyGenerator", AnonymousClass000.A0l(str6)), r6);
                C177488fx.A06("MD5", C186798vx.A04, r6);
                return;
            }
        }
        r6.AwK(str, A0X);
    }

    public static StringBuilder A00(Object obj, String str, String str2, StringBuilder sb, C185198tF r4) {
        sb.append(obj);
        r4.AwK(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder A01(String str, String str2, String str3, C185198tF r3) {
        r3.AwK(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static StringBuilder A02(String str, String str2, C185198tF r2) {
        r2.AwK(str, str2);
        return new StringBuilder();
    }
}
