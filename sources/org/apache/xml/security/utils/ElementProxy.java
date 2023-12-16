package org.apache.xml.security.utils;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import X.C18260x0;
import java.util.HashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ElementProxy {
    public static Log j;
    public static HashMap n = AnonymousClass001.A0t();
    public static HashMap o = AnonymousClass001.A0t();
    public static Class p;
    public Element k = null;
    public String l = null;
    public Document m = null;

    public abstract String d();

    public abstract String e();

    static {
        Class c = c("org.apache.xml.security.utils.ElementProxy");
        p = c;
        j = LogFactory.getLog(c.getName());
    }

    public static void d(String str, String str2) {
        if (n.containsValue(str2)) {
            Object obj = n.get(str);
            if (!obj.equals(str2)) {
                Object[] A1X = AnonymousClass0x9.A1X();
                C18260x0.A0i(str2, str, obj, A1X);
                throw new XMLSecurityException("prefix.AlreadyAssigned", A1X);
            }
        }
        if ("http://www.w3.org/2000/09/xmldsig#".equals(str)) {
            XMLUtils.a = str2;
        }
        if ("http://www.w3.org/2001/04/xmlenc#".equals(str)) {
            XMLUtils.b = str2;
        }
        n.put(str, str2.intern());
        if (str2.length() == 0) {
            o.put(str, "xmlns");
        } else {
            o.put(str, AnonymousClass6C7.A0l("xmlns:", str2, AnonymousClass6CA.A0X()).intern());
        }
    }

    public String b(String str, String str2) {
        return ((CharacterData) XMLUtils.a(this.k.getFirstChild(), str2, str, 0).getFirstChild()).getData();
    }

    public int c(String str, String str2) {
        int i = 0;
        for (Node firstChild = this.k.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (str2.equals(firstChild.getLocalName()) && str.equals(firstChild.getNamespaceURI())) {
                i++;
            }
        }
        return i;
    }

    public final Element k() {
        return this.k;
    }

    public String l() {
        return this.l;
    }

    public byte[] n() {
        return Base64.a(XMLUtils.a(this.k));
    }

    public String o() {
        return XMLUtils.a(this.k);
    }

    public ElementProxy(Element element, String str) {
        if (element != null) {
            if (j.isDebugEnabled()) {
                Log log = j;
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append("setElement(\"");
                A0X.append(element.getTagName());
                A0X.append("\", \"");
                A0X.append(str);
                AnonymousClass6C7.A1K("\")", A0X, log);
            }
            this.m = element.getOwnerDocument();
            this.k = element;
            this.l = str;
            m();
            return;
        }
        throw new XMLSecurityException("ElementProxy.nullElement");
    }

    public void m() {
        String e = e();
        String d = d();
        String localName = this.k.getLocalName();
        String namespaceURI = this.k.getNamespaceURI();
        if (!d.equals(namespaceURI) && !e.equals(localName)) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = AnonymousClass6C7.A0l(":", localName, AnonymousClass6C9.A0i(namespaceURI));
            A0M[1] = AnonymousClass6C7.A0l(":", e, AnonymousClass6C9.A0i(d));
            throw new XMLSecurityException("xml.WrongElement", A0M);
        }
    }

    public ElementProxy() {
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
