package org.apache.xml.security.utils.resolver.implementations;

import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.resolver.ResourceResolverException;
import org.apache.xml.security.utils.resolver.ResourceResolverSpi;
import org.apache.xml.utils.URI;
import org.w3c.dom.Attr;

public class ResolverLocalFilesystem extends ResourceResolverSpi {
    public static Log d = null;
    public static Class e = null;
    public static int f = 6;

    static {
        Class c = c("org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem");
        e = c;
        d = LogFactory.getLog(c.getName());
    }

    public static String d(String str) {
        String substring = str.substring(f);
        if (substring.indexOf("%20") > -1) {
            StringBuffer stringBuffer = new StringBuffer(substring.length());
            int i = 0;
            while (true) {
                int indexOf = substring.indexOf("%20", i);
                if (indexOf != -1) {
                    stringBuffer.append(substring.substring(i, indexOf));
                    stringBuffer.append(' ');
                    i = indexOf + 3;
                    if (indexOf == -1) {
                        break;
                    }
                } else {
                    stringBuffer.append(substring.substring(i));
                    break;
                }
            }
            substring = stringBuffer.toString();
        }
        if (substring.charAt(1) != ':') {
            return AnonymousClass6C7.A0l("/", substring, AnonymousClass6CA.A0X());
        }
        return substring;
    }

    public boolean b(Attr attr, String str) {
        if (attr != null) {
            String nodeValue = attr.getNodeValue();
            if (!nodeValue.equals("") && nodeValue.charAt(0) != '#' && !nodeValue.startsWith("http:")) {
                try {
                    if (d.isDebugEnabled()) {
                        AnonymousClass6C7.A1H("I was asked whether I can resolve ", nodeValue, AnonymousClass6CA.A0X(), d);
                    }
                    if (nodeValue.startsWith("file:") || str.startsWith("file:")) {
                        if (!d.isDebugEnabled()) {
                            return true;
                        }
                        AnonymousClass6C7.A1H("I state that I can resolve ", nodeValue, AnonymousClass6CA.A0X(), d);
                        return true;
                    }
                } catch (Exception unused) {
                }
                d.debug("But I can't");
            }
        }
        return false;
    }

    public static Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public XMLSignatureInput a(Attr attr, String str) {
        try {
            URI a = a(attr.getNodeValue(), str);
            URI uri = new URI(a);
            uri.setFragment((String) null);
            XMLSignatureInput xMLSignatureInput = new XMLSignatureInput((InputStream) new FileInputStream(d(uri.toString())));
            xMLSignatureInput.n = a.toString();
            return xMLSignatureInput;
        } catch (Exception e2) {
            throw new ResourceResolverException("generic.EmptyMessage", e2, attr, str);
        }
    }

    public boolean a() {
        return true;
    }

    public static URI a(String str, String str2) {
        if (str2 == null || "".equals(str2)) {
            return new URI(str);
        }
        return new URI(new URI(str2), str);
    }
}
