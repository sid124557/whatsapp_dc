package org.apache.xml.security.algorithms;

import X.AnonymousClass6C7;
import X.AnonymousClass6CA;
import X.C18310x6;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.XMLUtils;
import org.w3c.dom.Element;

public class JCEMapper {
    public static Log a;
    public static Class b;
    public static Map c;
    public static Map d;
    public static String e = null;

    public class Algorithm {
        public String a;
        public String b;
        public String c;

        public Algorithm(Element element) {
            this.a = element.getAttribute("AlgorithmClass");
            this.b = element.getAttribute("KeyLength");
            this.c = element.getAttribute("RequiredKey");
        }
    }

    static {
        Class b2 = b("org.apache.xml.security.algorithms.JCEMapper");
        b = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static String a(String str) {
        if (a.isDebugEnabled()) {
            AnonymousClass6C7.A1H("Request for URI ", str, AnonymousClass6CA.A0X(), a);
        }
        return C18310x6.A0o(str, c);
    }

    public static void b(Element element) {
        int i = r5 * 2;
        c = new HashMap(i);
        d = new HashMap(i);
        for (Element element2 : XMLUtils.a(element.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "Algorithm")) {
            String attribute = element2.getAttribute("URI");
            c.put(attribute, element2.getAttribute("JCEName"));
            d.put(attribute, new Algorithm(element2));
        }
    }

    public static String a() {
        return e;
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public static void a(Element element) {
        b((Element) element.getElementsByTagName("Algorithms").item(0));
    }
}
