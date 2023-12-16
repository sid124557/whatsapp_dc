package org.apache.xml.security.transforms.implementations;

import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import org.apache.xml.dtm.DTMManager;
import org.apache.xml.security.utils.I18n;
import org.apache.xpath.XPathContext;
import org.w3c.dom.Node;

public class FuncHereContext extends XPathContext {
    public FuncHereContext(Node node, DTMManager dTMManager) {
        super(node);
        try {
            this.m_dtmManager = dTMManager;
        } catch (IllegalAccessError e) {
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append(I18n.b("endorsed.jdk1.4.0"));
            A0X.append(" Original message was \"");
            A0X.append(e.getMessage());
            throw new IllegalAccessError(AnonymousClass6C9.A0f("\"", A0X));
        }
    }

    public FuncHereContext() {
    }
}
