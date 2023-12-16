package org.apache.xml.security.signature;

import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import X.C18310x6;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class Manifest extends SignatureElementProxy {
    public static Log a;
    public static Class f;
    public List b;
    public Element[] c;
    public HashMap d = null;
    public List e = null;
    public boolean[] g = null;

    static {
        Class a2 = a("org.apache.xml.security.signature.Manifest");
        f = a2;
        a = LogFactory.getLog(a2.getName());
    }

    private void a(int i, boolean z) {
        boolean[] zArr = this.g;
        if (zArr == null) {
            zArr = new boolean[this.b.size()];
            this.g = zArr;
        }
        zArr[i] = z;
    }

    public String e() {
        return "Manifest";
    }

    public Manifest(Element element, String str) {
        super(element, str);
        Element[] a2 = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Reference");
        this.c = a2;
        int length = a2.length;
        int i = 0;
        if (length != 0) {
            this.b = AnonymousClass002.A0I(length);
            do {
                this.b.add((Object) null);
                i++;
            } while (i < length);
            return;
        }
        Object[] A1b = C18310x6.A1b("Reference", 0);
        A1b[1] = "Manifest";
        throw new DOMException(4, I18n.b("xml.WrongContent", A1b));
    }

    public int a() {
        return this.b.size();
    }

    public boolean a(boolean z) {
        ReferenceNotInitializedException referenceNotInitializedException;
        String str;
        if (this.c == null) {
            this.c = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Reference");
        }
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append("verify ");
            A0X.append(this.c.length);
            AnonymousClass6C7.A1K(" References", A0X, log);
            Log log2 = a;
            StringBuffer A0X2 = AnonymousClass6CA.A0X();
            A0X2.append("I am ");
            if (z) {
                str = "";
            } else {
                str = "not";
            }
            A0X2.append(str);
            AnonymousClass6C7.A1K(" requested to follow nested Manifests", A0X2, log2);
        }
        int length = this.c.length;
        if (length != 0) {
            this.g = new boolean[length];
            int i = 0;
            boolean z2 = true;
            while (true) {
                Element[] elementArr = this.c;
                if (i >= elementArr.length) {
                    return z2;
                }
                Reference reference = new Reference(elementArr[i], this.l, this);
                this.b.set(i, reference);
                try {
                    boolean j = reference.j();
                    a(i, j);
                    if (!j) {
                        z2 = false;
                    }
                    if (a.isDebugEnabled()) {
                        Log log3 = a;
                        StringBuffer A0X3 = AnonymousClass6CA.A0X();
                        A0X3.append("The Reference has Type ");
                        AnonymousClass6C7.A1K(reference.c(), A0X3, log3);
                    }
                    if (z2 && z && reference.f()) {
                        a.debug("We have to follow a nested Manifest");
                        try {
                            XMLSignatureInput a2 = reference.a((OutputStream) null);
                            for (Node node : a2.b(false)) {
                                if (node.getNodeType() == 1) {
                                    Element element = (Element) node;
                                    if (element.getNamespaceURI().equals("http://www.w3.org/2000/09/xmldsig#") && element.getLocalName().equals("Manifest")) {
                                        try {
                                            Manifest manifest = new Manifest(element, a2.n);
                                            manifest.e = this.e;
                                            manifest.d = this.d;
                                            if (!manifest.a(z)) {
                                                a.warn("The nested Manifest was invalid (bad)");
                                                z2 = false;
                                            } else {
                                                a.debug("The nested Manifest was valid (good)");
                                            }
                                        } catch (XMLSecurityException unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            throw new MissingResourceFailureException("empty", reference);
                        } catch (IOException e2) {
                            referenceNotInitializedException = new ReferenceNotInitializedException("empty", (Exception) e2);
                            throw referenceNotInitializedException;
                        } catch (ParserConfigurationException e3) {
                            referenceNotInitializedException = new ReferenceNotInitializedException("empty", (Exception) e3);
                            throw referenceNotInitializedException;
                        } catch (SAXException e4) {
                            referenceNotInitializedException = new ReferenceNotInitializedException("empty", (Exception) e4);
                            throw referenceNotInitializedException;
                        }
                    }
                    i++;
                } catch (ReferenceNotInitializedException e5) {
                    throw new MissingResourceFailureException("signature.Verification.Reference.NoInput", new Object[]{reference.b()}, e5, reference);
                }
            }
        } else {
            throw new XMLSecurityException("empty");
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }
}
