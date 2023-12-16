package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass002;
import X.C18310x6;
import javax.xml.transform.TransformerException;
import org.apache.xml.security.exceptions.XMLSecurityRuntimeException;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.utils.CachedXPathAPIHolder;
import org.apache.xml.security.utils.CachedXPathFuncHereAPI;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.utils.PrefixResolver;
import org.apache.xml.utils.PrefixResolverDefault;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class TransformXPath extends TransformSpi {

    public class XPathNodeFilter implements NodeFilter {
        public PrefixResolverDefault a;
        public CachedXPathFuncHereAPI b = new CachedXPathFuncHereAPI(CachedXPathAPIHolder.a());
        public Node c;
        public String d;

        public XPathNodeFilter(Element element, Node node, String str) {
            this.c = node;
            this.d = str;
            this.a = new PrefixResolverDefault(element);
        }

        public int a(Node node, int i) {
            return a(node);
        }

        public int a(Node node) {
            try {
                if (this.b.a(node, this.c, this.d, (PrefixResolver) this.a).bool()) {
                    return 1;
                }
                return 0;
            } catch (TransformerException e) {
                throw new XMLSecurityRuntimeException("signature.Transform.node", new Object[]{node}, e);
            } catch (Exception e2) {
                Object[] A1b = C18310x6.A1b(node, 0);
                A1b[1] = new Short(node.getNodeType());
                throw new XMLSecurityRuntimeException("signature.Transform.nodeAndType", A1b, e2);
            }
        }
    }

    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Throwable th;
        try {
            CachedXPathAPIHolder.a(transform.k.getOwnerDocument());
            Element a = XMLUtils.a(transform.k.getFirstChild(), "XPath", 0);
            if (a != null) {
                Node item = a.getChildNodes().item(0);
                String a2 = CachedXPathFuncHereAPI.a(item);
                xMLSignatureInput.j = a(a2);
                if (item != null) {
                    xMLSignatureInput.a((NodeFilter) new XPathNodeFilter(a, item, a2));
                    xMLSignatureInput.g = true;
                    return xMLSignatureInput;
                }
                th = new DOMException(3, "Text must be in ds:Xpath");
            } else {
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = "ds:XPath";
                A0M[1] = "Transform";
                th = new TransformationException("xml.WrongContent", A0M);
            }
            throw th;
        } catch (DOMException e) {
            throw new TransformationException("empty", (Exception) e);
        }
    }

    private boolean a(String str) {
        if (str.indexOf("namespace") == -1 && str.indexOf("name()") == -1) {
            return false;
        }
        return true;
    }
}
