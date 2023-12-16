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

public abstract class SignatureECDSA extends SignatureAlgorithmSpi {
    public static Log a;
    public static Class b;
    public static Class c;
    public Signature d = null;

    public class SignatureECDSASHA1 extends SignatureECDSA {
        public String d() {
            return "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1";
        }
    }

    public static byte[] c(byte[] bArr) {
        int length = bArr.length;
        if (length >= 48) {
            int i = length / 2;
            int i2 = i;
            while (i2 > 0 && bArr[i - i2] == 0) {
                i2--;
            }
            int i3 = i - i2;
            int i4 = i2;
            if (bArr[i3] < 0) {
                i4 = i2 + 1;
            }
            int i5 = i;
            while (i5 > 0 && bArr[(i * 2) - i5] == 0) {
                i5--;
            }
            int i6 = (i * 2) - i5;
            int i7 = i5;
            if (bArr[i6] < 0) {
                i7 = i5 + 1;
            }
            int i8 = i4 + 6 + i7;
            byte[] bArr2 = new byte[i8];
            bArr2[0] = 48;
            int i9 = i4 + 4;
            bArr2[1] = (byte) (i9 + i7);
            bArr2[2] = 2;
            bArr2[3] = (byte) i4;
            System.arraycopy(bArr, i3, bArr2, i9 - i2, i2);
            bArr2[i9] = 2;
            bArr2[i4 + 5] = (byte) i7;
            System.arraycopy(bArr, i6, bArr2, i8 - i5, i5);
            return bArr2;
        }
        throw AnonymousClass002.A0C("Invalid XMLDSIG format of ECDSA signature");
    }

    public abstract String d();

    static {
        Class a2 = a("org.apache.xml.security.algorithms.implementations.SignatureECDSA");
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
            byte[] c2 = c(bArr);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append("Called ECDSA.verify() on ");
                AnonymousClass6C7.A1K(Base64.b(bArr), A0X, log);
            }
            return this.d.verify(c2);
        } catch (SignatureException e) {
            throw new XMLSignatureException("empty", (Exception) e);
        } catch (IOException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        }
    }

    public SignatureECDSA() {
        Signature signature;
        String a2 = JCEMapper.a("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");
        if (a.isDebugEnabled()) {
            AnonymousClass6C7.A1H("Created SignatureECDSA using ", a2, AnonymousClass6CA.A0X(), a);
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
