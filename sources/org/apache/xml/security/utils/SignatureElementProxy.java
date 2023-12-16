package org.apache.xml.security.utils;

import X.AnonymousClass002;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public abstract class SignatureElementProxy extends ElementProxy {
    public String d() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public SignatureElementProxy(Element element, String str) {
        super(element, str);
    }

    public SignatureElementProxy() {
    }

    public SignatureElementProxy(Document document) {
        if (document != null) {
            this.m = document;
            this.k = XMLUtils.a(document, e());
            return;
        }
        throw AnonymousClass002.A0E("Document is null");
    }
}
