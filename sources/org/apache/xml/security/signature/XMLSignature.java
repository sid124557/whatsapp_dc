package org.apache.xml.security.signature;

import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Key;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.keys.KeyInfo;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.SignerOutputStream;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public final class XMLSignature extends SignatureElementProxy {
    public static Log a;
    public static Class b;
    public SignedInfo c = null;
    public KeyInfo d = null;
    public boolean e = false;
    public Element f;
    public int g = 0;

    static {
        Class a2 = a("org.apache.xml.security.signature.XMLSignature");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public boolean a(Key key) {
        SignedInfo signedInfo;
        SignatureAlgorithm signatureAlgorithm;
        byte[] bArr;
        if (key != null) {
            try {
                signedInfo = this.c;
                signatureAlgorithm = signedInfo.g;
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer A0X = AnonymousClass6CA.A0X();
                    A0X.append("SignatureMethodURI = ");
                    AnonymousClass6C7.A1K(signatureAlgorithm.a(), A0X, log);
                    Log log2 = a;
                    StringBuffer A0X2 = AnonymousClass6CA.A0X();
                    A0X2.append("jceSigAlgorithm    = ");
                    AnonymousClass6C7.A1K(signatureAlgorithm.b(), A0X2, log2);
                    Log log3 = a;
                    StringBuffer A0X3 = AnonymousClass6CA.A0X();
                    A0X3.append("jceSigProvider     = ");
                    AnonymousClass6C7.A1K(signatureAlgorithm.c(), A0X3, log3);
                    AnonymousClass6C7.A1B(key, "PublicKey = ", AnonymousClass6CA.A0X(), a);
                }
                signatureAlgorithm.a(key);
                UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(new SignerOutputStream(signatureAlgorithm));
                signedInfo.a((OutputStream) unsyncBufferedOutputStream);
                unsyncBufferedOutputStream.close();
                bArr = b();
            } catch (IOException unused) {
                signatureAlgorithm.f();
                bArr = null;
            } catch (XMLSecurityException e2) {
                signatureAlgorithm.f();
                throw e2;
            } catch (XMLSignatureException e3) {
                throw e3;
            } catch (XMLSecurityException e4) {
                throw new XMLSignatureException("empty", (Exception) e4);
            }
            if (signatureAlgorithm.h.b(bArr)) {
                return signedInfo.b(this.e);
            }
            a.warn("Signature verification failed.");
            return false;
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = "Didn't get a key";
        throw new XMLSignatureException("empty", A0L);
    }

    public byte[] b() {
        try {
            return Base64.a(this.f);
        } catch (Base64DecodingException e2) {
            throw AnonymousClass6C9.A0o(e2);
        }
    }

    public String e() {
        return "Signature";
    }

    public XMLSignature(Element element, String str) {
        super(element, str);
        Element a2 = XMLUtils.a(element.getFirstChild());
        if (a2 != null) {
            this.c = new SignedInfo(a2, str);
            Element a3 = XMLUtils.a(XMLUtils.a(element.getFirstChild()).getNextSibling());
            this.f = a3;
            if (a3 != null) {
                Element a4 = XMLUtils.a(a3.getNextSibling());
                if (a4 != null && a4.getNamespaceURI().equals("http://www.w3.org/2000/09/xmldsig#") && a4.getLocalName().equals("KeyInfo")) {
                    this.d = new KeyInfo(a4, str);
                }
                this.g = 1;
                return;
            }
            throw new XMLSignatureException("xml.WrongContent", new Object[]{"SignatureValue", "Signature"});
        }
        throw new XMLSignatureException("xml.WrongContent", new Object[]{"SignedInfo", "Signature"});
    }

    public SignedInfo a() {
        return this.c;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }
}
