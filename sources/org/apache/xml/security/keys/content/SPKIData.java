package org.apache.xml.security.keys.content;

import org.apache.xml.security.utils.SignatureElementProxy;

public class SPKIData extends SignatureElementProxy implements KeyInfoContent {
    public String e() {
        return "SPKIData";
    }
}
