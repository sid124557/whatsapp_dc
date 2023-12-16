package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C18310x6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.signature.NodeFilter;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.transforms.TransformSpi;
import org.apache.xml.security.transforms.TransformationException;
import org.apache.xml.security.transforms.params.XPath2FilterContainer;
import org.apache.xml.security.utils.CachedXPathAPIHolder;
import org.apache.xml.security.utils.CachedXPathFuncHereAPI;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TransformXPath2Filter extends TransformSpi {
    public XMLSignatureInput a(XMLSignatureInput xMLSignatureInput, Transform transform) {
        Document document;
        Transform transform2 = transform;
        CachedXPathAPIHolder.a(transform2.k.getOwnerDocument());
        try {
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            ArrayList A0s3 = AnonymousClass001.A0s();
            CachedXPathFuncHereAPI cachedXPathFuncHereAPI = new CachedXPathFuncHereAPI(CachedXPathAPIHolder.a());
            int length = XMLUtils.a(transform2.k.getFirstChild(), "http://www.w3.org/2002/06/xmldsig-filter2", "XPath").length;
            int i = 0;
            if (length != 0) {
                XMLSignatureInput xMLSignatureInput2 = xMLSignatureInput;
                Node node = xMLSignatureInput2.d;
                if (node != null) {
                    document = XMLUtils.b(node);
                } else {
                    document = XMLUtils.a(xMLSignatureInput2.b(false));
                }
                do {
                    XPath2FilterContainer xPath2FilterContainer = new XPath2FilterContainer(XMLUtils.a(transform2.k.getFirstChild(), "http://www.w3.org/2002/06/xmldsig-filter2", "XPath", i), xMLSignatureInput2.n);
                    NodeList a = cachedXPathFuncHereAPI.a((Node) document, xPath2FilterContainer.f(), CachedXPathFuncHereAPI.a(xPath2FilterContainer.f()), (Node) xPath2FilterContainer.k);
                    if (xPath2FilterContainer.a()) {
                        A0s3.add(a);
                    } else if (xPath2FilterContainer.b()) {
                        A0s2.add(a);
                    } else if (xPath2FilterContainer.c()) {
                        A0s.add(a);
                    }
                    i++;
                } while (i < length);
                xMLSignatureInput2.a((NodeFilter) new XPath2NodeFilter(a(A0s), a(A0s2), a(A0s3)));
                xMLSignatureInput2.g = true;
                return xMLSignatureInput;
            }
            Object[] A1b = C18310x6.A1b("http://www.w3.org/2002/06/xmldsig-filter2", 0);
            A1b[1] = "XPath";
            throw new TransformationException("xml.WrongContent", A1b);
        } catch (TransformerException e) {
            throw new TransformationException("empty", (Exception) e);
        } catch (DOMException e2) {
            throw new TransformationException("empty", (Exception) e2);
        } catch (CanonicalizationException e3) {
            throw new TransformationException("empty", (Exception) e3);
        } catch (InvalidCanonicalizerException e4) {
            throw new TransformationException("empty", (Exception) e4);
        } catch (XMLSecurityException e5) {
            throw new TransformationException("empty", (Exception) e5);
        } catch (SAXException e6) {
            throw new TransformationException("empty", (Exception) e6);
        } catch (IOException e7) {
            throw new TransformationException("empty", (Exception) e7);
        } catch (ParserConfigurationException e8) {
            throw new TransformationException("empty", (Exception) e8);
        }
    }

    public static Set a(List list) {
        HashSet A0K = AnonymousClass002.A0K();
        for (int i = 0; i < list.size(); i++) {
            NodeList nodeList = (NodeList) list.get(i);
            int length = nodeList.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                A0K.add(nodeList.item(i2));
            }
        }
        return A0K;
    }
}
