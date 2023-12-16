package org.apache.xml.security.algorithms.implementations;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6C8;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.SignatureAlgorithmSpi;
import org.apache.xml.security.signature.XMLSignatureException;
import org.apache.xml.security.utils.Base64;

public class SignatureDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[LOOP:1: B:10:0x001d->B:13:0x0025, LOOP_START, PHI: r8 
      PHI: (r8v1 int) = (r8v0 int), (r8v3 int) binds: [B:25:0x001d, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0009 A[LOOP:0: B:3:0x0009->B:6:0x0011, LOOP_START, PHI: r10 
      PHI: (r10v1 int) = (r10v0 int), (r10v3 int) binds: [B:2:0x0005, B:6:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(byte[] r12) {
        /*
            int r1 = r12.length
            r0 = 40
            if (r1 != r0) goto L_0x005b
            r8 = 20
            r10 = 20
        L_0x0009:
            int r0 = 20 - r10
            byte r0 = r12[r0]
            if (r0 != 0) goto L_0x0014
            int r10 = r10 + -1
            if (r10 <= 0) goto L_0x0014
            goto L_0x0009
        L_0x0014:
            int r9 = 20 - r10
            byte r0 = r12[r9]
            r7 = r10
            if (r0 >= 0) goto L_0x001d
            int r7 = r10 + 1
        L_0x001d:
            int r0 = 40 - r8
            byte r0 = r12[r0]
            if (r0 != 0) goto L_0x0028
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            int r6 = 40 - r8
            byte r0 = r12[r6]
            r5 = r8
            if (r0 >= 0) goto L_0x0031
            int r5 = r8 + 1
        L_0x0031:
            int r4 = r7 + 6
            int r4 = r4 + r5
            byte[] r3 = new byte[r4]
            r1 = 0
            r0 = 48
            r3[r1] = r0
            int r11 = r7 + 4
            int r0 = r11 + r5
            byte r1 = (byte) r0
            r0 = 1
            r3[r0] = r1
            r2 = 2
            r3[r2] = r2
            r1 = 3
            byte r0 = (byte) r7
            r3[r1] = r0
            int r0 = r11 - r10
            java.lang.System.arraycopy(r12, r9, r3, r0, r10)
            r3[r11] = r2
            int r1 = r7 + 5
            byte r0 = (byte) r5
            r3[r1] = r0
            int r4 = r4 - r8
            java.lang.System.arraycopy(r12, r6, r3, r4, r8)
            return r3
        L_0x005b:
            java.lang.String r0 = "Invalid XMLDSIG format of DSA signature"
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xml.security.algorithms.implementations.SignatureDSA.c(byte[]):byte[]");
    }

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureDSA");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public void a(byte[] bArr, int i, int i2) {
        try {
            this.d.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw AnonymousClass6C9.A0o(e);
        }
    }

    public boolean b(byte[] bArr) {
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append("Called DSA.verify() on ");
                AnonymousClass6C7.A1K(Base64.b(bArr), A0X, log);
            }
            return this.d.verify(c(bArr));
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", (Exception) e);
        } catch (IOException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        }
    }

    public SignatureDSA() {
        Signature signature;
        String a2 = JCEMapper.a("http://www.w3.org/2000/09/xmldsig#dsa-sha1");
        if (a.isDebugEnabled()) {
            AnonymousClass6C7.A1H("Created SignatureDSA using ", a2, AnonymousClass6CA.A0X(), a);
        }
        String str = JCEMapper.e;
        if (str == null) {
            try {
                signature = Signature.getInstance(a2);
            } catch (NoSuchAlgorithmException e) {
                Object[] objArr = new Object[2];
                objArr[0] = a2;
                throw AnonymousClass6C8.A0p(e, objArr);
            } catch (NoSuchProviderException e2) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = a2;
                throw AnonymousClass6C8.A0p(e2, objArr2);
            }
        } else {
            signature = Signature.getInstance(a2, str);
        }
        this.d = signature;
    }

    public String a() {
        return this.d.getAlgorithm();
    }

    public String b() {
        return this.d.getProvider().getName();
    }

    public void a(byte[] bArr) {
        try {
            this.d.update(bArr);
        } catch (SignatureException e) {
            throw AnonymousClass6C9.A0o(e);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public void a(byte b2) {
        try {
            this.d.update(b2);
        } catch (SignatureException e) {
            throw AnonymousClass6C9.A0o(e);
        }
    }

    public void a(Key key) {
        if (!(key instanceof PublicKey)) {
            String A0O = AnonymousClass000.A0O(key);
            Class cls = c;
            if (cls == null) {
                cls = a("java.security.PublicKey");
                c = cls;
            }
            String name = cls.getName();
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(A0O, name, A0M);
            throw new XMLSignatureException("algorithms.WrongKeyForThisOperation", A0M);
        }
        try {
            this.d.initVerify((PublicKey) key);
        } catch (InvalidKeyException e) {
            Signature signature = this.d;
            try {
                this.d = Signature.getInstance(signature.getAlgorithm());
            } catch (Exception e2) {
                if (a.isDebugEnabled()) {
                    AnonymousClass6C7.A1B(e2, "Exception when reinstantiating Signature:", AnonymousClass6CA.A0X(), a);
                }
                this.d = signature;
            }
            throw AnonymousClass6C9.A0o(e);
        }
    }
}
