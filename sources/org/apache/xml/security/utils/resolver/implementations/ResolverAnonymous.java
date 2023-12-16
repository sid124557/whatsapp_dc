package org.apache.xml.security.utils.resolver.implementations;

import X.AnonymousClass000;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.w3c.dom.Attr;

public class ResolverAnonymous extends ResourceResolverSpi {
    public XMLSignatureInput d;

    public XMLSignatureInput a(Attr attr, String str) {
        return this.d;
    }

    public boolean b(Attr attr, String str) {
        return AnonymousClass000.A1X(attr);
    }
}
