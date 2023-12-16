package org.apache.xml.security.signature;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.Base64;
import org.apache.xml.security.utils.DigesterOutputStream;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.UnsyncBufferedOutputStream;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class Reference extends SignatureElementProxy {
    public static Log a;
    public static Class d;
    public static boolean e = AnonymousClass001.A1Z(AccessController.doPrivileged(new PrivilegedAction() {
        public Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.apache.xml.security.useC14N11"));
        }
    }));
    public Manifest b = null;
    public XMLSignatureInput c;
    public Transforms f;
    public Element g;
    public Element h;

    static {
        Class a2 = a("org.apache.xml.security.signature.Reference");
        d = a2;
        a = LogFactory.getLog(a2.getName());
    }

    private XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            Transforms transforms = this.f;
            if (transforms == null) {
                return xMLSignatureInput;
            }
            XMLSignatureInput a2 = transforms.a(xMLSignatureInput, outputStream);
            this.c = a2;
            return a2;
        } catch (ResourceResolverException e2) {
            throw new XMLSignatureException("empty", (Exception) e2);
        } catch (CanonicalizationException e3) {
            throw new XMLSignatureException("empty", (Exception) e3);
        } catch (InvalidCanonicalizerException e4) {
            throw new XMLSignatureException("empty", (Exception) e4);
        } catch (TransformationException e5) {
            throw new XMLSignatureException("empty", (Exception) e5);
        } catch (XMLSecurityException e6) {
            throw new XMLSignatureException("empty", (Exception) e6);
        }
    }

    public String b() {
        return this.k.getAttributeNS((String) null, "URI");
    }

    public String c() {
        return this.k.getAttributeNS((String) null, "Type");
    }

    public String e() {
        return "Reference";
    }

    public boolean f() {
        return AnonymousClass000.A1S("http://www.w3.org/2000/09/xmldsig#Manifest".equals(c()) ? 1 : 0);
    }

    public XMLSignatureInput g() {
        try {
            Attr attributeNodeNS = this.k.getAttributeNodeNS((String) null, "URI");
            if (attributeNodeNS != null) {
                attributeNodeNS.getNodeValue();
            }
            ResourceResolver a2 = ResourceResolver.a(attributeNodeNS, this.l, this.b.e);
            a2.a((Map) this.b.d);
            return a2.e.a(attributeNodeNS, this.l);
        } catch (ResourceResolverException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        } catch (XMLSecurityException e3) {
            throw new ReferenceNotInitializedException("empty", (Exception) e3);
        }
    }

    public Transforms h() {
        return this.f;
    }

    public byte[] i() {
        Element element = this.h;
        if (element != null) {
            return Base64.a(element);
        }
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = "DigestValue";
        A0M[1] = "http://www.w3.org/2000/09/xmldsig#";
        throw new XMLSecurityException("signature.Verification.NoSignatureElement", A0M);
    }

    public Reference(Element element, String str, Manifest manifest) {
        super(element, str);
        this.l = str;
        Element a2 = XMLUtils.a(element.getFirstChild());
        if ("Transforms".equals(a2.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(a2.getNamespaceURI())) {
            this.f = new Transforms(a2, this.l);
            a2 = XMLUtils.a(a2.getNextSibling());
        }
        this.g = a2;
        this.h = XMLUtils.a(a2.getNextSibling());
        this.b = manifest;
    }

    public boolean j() {
        byte[] i = i();
        byte[] a2 = a(true);
        boolean isEqual = MessageDigest.isEqual(i, a2);
        Log log = a;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        if (!isEqual) {
            A0X.append("Verification failed for URI \"");
            log.warn(AnonymousClass6C7.A0l(b(), "\"", A0X));
            Log log2 = a;
            StringBuffer A0X2 = AnonymousClass6CA.A0X();
            A0X2.append("Expected Digest: ");
            log2.warn(AnonymousClass6C9.A0f(Base64.b(i), A0X2));
            Log log3 = a;
            StringBuffer A0X3 = AnonymousClass6CA.A0X();
            A0X3.append("Actual Digest: ");
            log3.warn(AnonymousClass6C9.A0f(Base64.b(a2), A0X3));
            return isEqual;
        }
        A0X.append("Verification successful for URI \"");
        AnonymousClass6C7.A1H(b(), "\"", A0X, log);
        return isEqual;
    }

    public MessageDigestAlgorithm a() {
        String attributeNS;
        Element element = this.g;
        if (element == null || (attributeNS = element.getAttributeNS((String) null, "Algorithm")) == null) {
            return null;
        }
        return MessageDigestAlgorithm.a(this.m, attributeNS);
    }

    public XMLSignatureInput a(OutputStream outputStream) {
        try {
            XMLSignatureInput a2 = a(g(), outputStream);
            this.c = a2;
            return a2;
        } catch (XMLSecurityException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    private byte[] a(boolean z) {
        boolean z2;
        try {
            MessageDigestAlgorithm a2 = a();
            a2.c();
            DigesterOutputStream digesterOutputStream = new DigesterOutputStream(a2);
            UnsyncBufferedOutputStream unsyncBufferedOutputStream = new UnsyncBufferedOutputStream(digesterOutputStream);
            XMLSignatureInput a3 = a((OutputStream) unsyncBufferedOutputStream);
            if (!e || z || AnonymousClass000.A1W(a3.k) || a3.h()) {
                z2 = false;
            } else {
                if (this.f == null) {
                    Transforms transforms = new Transforms(this.m);
                    this.f = transforms;
                    this.k.insertBefore(transforms.k, this.g);
                }
                this.f.a("http://www.w3.org/2006/12/xml-c14n11");
                z2 = true;
            }
            a3.a(unsyncBufferedOutputStream, z2);
            unsyncBufferedOutputStream.flush();
            return digesterOutputStream.a();
        } catch (XMLSecurityException e2) {
            throw new ReferenceNotInitializedException("empty", (Exception) e2);
        } catch (IOException e3) {
            throw new ReferenceNotInitializedException("empty", (Exception) e3);
        }
    }
}
