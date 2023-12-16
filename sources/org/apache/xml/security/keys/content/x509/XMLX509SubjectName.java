package org.apache.xml.security.keys.content.x509;

import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.RFC2253Parser;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.apache.xml.security.utils.XMLUtils;

public class XMLX509SubjectName extends SignatureElementProxy implements XMLX509DataContent {
    public String a() {
        return RFC2253Parser.a(XMLUtils.a(this.k));
    }

    public String e() {
        return "X509SubjectName";
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof XMLX509SubjectName)) {
            return false;
        }
        return RFC2253Parser.a(XMLUtils.a(this.k)).equals(RFC2253Parser.a(XMLUtils.a(((ElementProxy) obj).k)));
    }

    public int hashCode() {
        return 527 + RFC2253Parser.a(XMLUtils.a(this.k)).hashCode();
    }
}
