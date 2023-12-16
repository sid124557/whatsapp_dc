package org.apache.xml.security.transforms.params;

import X.AnonymousClass000;
import X.AnonymousClass0x9;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.transforms.TransformParam;
import org.apache.xml.security.utils.ElementProxy;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XPath2FilterContainer extends ElementProxy implements TransformParam {
    public static XPath2FilterContainer a(Element element, String str) {
        return new XPath2FilterContainer(element, str);
    }

    public boolean b() {
        return this.k.getAttributeNS((String) null, "Filter").equals("subtract");
    }

    public boolean c() {
        return this.k.getAttributeNS((String) null, "Filter").equals("union");
    }

    public final String d() {
        return "http://www.w3.org/2002/06/xmldsig-filter2";
    }

    public final String e() {
        return "XPath";
    }

    public Node f() {
        NodeList childNodes = this.k.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            if (childNodes.item(i).getNodeType() == 3) {
                return childNodes.item(i);
            }
        }
        return null;
    }

    public XPath2FilterContainer(Element element, String str) {
        super(element, str);
        String attributeNS = this.k.getAttributeNS((String) null, "Filter");
        if (!attributeNS.equals("intersect") && !attributeNS.equals("subtract") && !attributeNS.equals("union")) {
            Object[] A1X = AnonymousClass0x9.A1X();
            AnonymousClass000.A16("Filter", attributeNS, A1X);
            A1X[2] = "intersect, subtract or union";
            throw new XMLSecurityException("attributeValueIllegal", A1X);
        }
    }

    public XPath2FilterContainer() {
    }

    public boolean a() {
        return this.k.getAttributeNS((String) null, "Filter").equals("intersect");
    }
}
