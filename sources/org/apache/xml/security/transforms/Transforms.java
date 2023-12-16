package org.apache.xml.security.transforms;

import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Transforms extends SignatureElementProxy {
    public static Log a;
    public static Class c;
    public Element[] b;

    static {
        Class b2 = b("org.apache.xml.security.transforms.Transforms");
        c = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, OutputStream outputStream) {
        try {
            int a2 = a() - 1;
            for (int i = 0; i < a2; i++) {
                Transform a3 = a(i);
                if (a.isDebugEnabled()) {
                    Log log = a;
                    StringBuffer A0X = AnonymousClass6CA.A0X();
                    A0X.append("Perform the (");
                    A0X.append(i);
                    A0X.append(")th ");
                    A0X.append(a3.b());
                    AnonymousClass6C7.A1K(" transform", A0X, log);
                }
                xMLSignatureInput = a3.a(xMLSignatureInput);
            }
            if (a2 >= 0) {
                return a(a2).a(xMLSignatureInput, outputStream);
            }
            return xMLSignatureInput;
        } catch (IOException e) {
            throw new TransformationException("empty", (Exception) e);
        } catch (CanonicalizationException e2) {
            throw new TransformationException("empty", (Exception) e2);
        } catch (InvalidCanonicalizerException e3) {
            throw new TransformationException("empty", (Exception) e3);
        }
    }

    public String e() {
        return "Transforms";
    }

    public Transforms(Element element, String str) {
        super(element, str);
        if (a() == 0) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = "Transform";
            A0M[1] = "Transforms";
            throw new TransformationException("xml.WrongContent", A0M);
        }
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public Transforms() {
    }

    public int a() {
        Element[] elementArr = this.b;
        if (elementArr == null) {
            elementArr = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Transform");
            this.b = elementArr;
        }
        return elementArr.length;
    }

    public Transforms(Document document) {
        super(document);
        XMLUtils.b(this.k);
    }

    private void a(Transform transform) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append("Transforms.addTransform(");
            A0X.append(transform.b());
            AnonymousClass6C7.A1K(")", A0X, log);
        }
        this.k.appendChild(transform.k);
        XMLUtils.b(this.k);
    }

    public Transform a(int i) {
        try {
            Element[] elementArr = this.b;
            if (elementArr == null) {
                elementArr = XMLUtils.a(this.k.getFirstChild(), "http://www.w3.org/2000/09/xmldsig#", "Transform");
                this.b = elementArr;
            }
            return new Transform(elementArr[i], this.l);
        } catch (XMLSecurityException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }

    public void a(String str) {
        try {
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append("Transforms.addTransform(");
                A0X.append(str);
                AnonymousClass6C7.A1K(")", A0X, log);
            }
            a(Transform.a(this.m, str));
        } catch (InvalidTransformException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }
}
