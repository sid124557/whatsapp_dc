package org.apache.xml.security.utils.resolver.implementations;

import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.IdResolver;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ResolverFragment extends ResourceResolverSpi {
    public static Log d;
    public static Class e;

    public boolean b(Attr attr, String str) {
        if (attr == null) {
            d.debug("Quick fail for null uri");
        } else {
            String nodeValue = attr.getNodeValue();
            if (nodeValue.equals("") || (nodeValue.charAt(0) == '#' && (nodeValue.charAt(1) != 'x' || !nodeValue.startsWith("#xpointer(")))) {
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer A0X = AnonymousClass6CA.A0X();
                    A0X.append("State I can resolve reference: \"");
                    AnonymousClass6C7.A1H(nodeValue, "\"", A0X, log);
                }
                return true;
            } else if (d.isDebugEnabled()) {
                Log log2 = d;
                StringBuffer A0X2 = AnonymousClass6CA.A0X();
                A0X2.append("Do not seem to be able to resolve reference: \"");
                AnonymousClass6C7.A1H(nodeValue, "\"", A0X2, log2);
                return false;
            }
        }
        return false;
    }

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverFragment");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public XMLSignatureInput a(Attr attr, String str) {
        Node node;
        String nodeValue = attr.getNodeValue();
        Document ownerDocument = attr.getOwnerElement().getOwnerDocument();
        if (nodeValue.equals("")) {
            d.debug("ResolverFragment with empty URI (means complete document)");
            node = ownerDocument;
        } else {
            String substring = nodeValue.substring(1);
            Node a = IdResolver.a(ownerDocument, substring);
            if (a != null) {
                node = a;
                if (d.isDebugEnabled()) {
                    Log log = d;
                    StringBuffer A0X = AnonymousClass6CA.A0X();
                    A0X.append("Try to catch an Element with ID ");
                    A0X.append(substring);
                    AnonymousClass6C7.A1B(a, " and Element was ", A0X, log);
                    node = a;
                }
            } else {
                throw new ResourceResolverException("signature.Verification.MissingID", AnonymousClass6C9.A1Z(substring, 1), attr, str);
            }
        }
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(node);
        xMLSignatureInput.f = true;
        xMLSignatureInput.m = "text/xml";
        String nodeValue2 = attr.getNodeValue();
        if (str != null) {
            nodeValue2 = str.concat(nodeValue2);
        }
        xMLSignatureInput.n = nodeValue2;
        return xMLSignatureInput;
    }

    public boolean a() {
        return true;
    }
}
