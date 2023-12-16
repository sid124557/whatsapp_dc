package org.apache.xml.security.keys;

import X.AnonymousClass001;
import X.AnonymousClass6C7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.utils.SignatureElementProxy;
import org.w3c.dom.Element;

public class KeyInfo extends SignatureElementProxy {
    public static Log a;
    public static final List d;
    public static boolean g = false;
    public static Class h;
    public List b = null;
    public List c = null;
    public List e = null;
    public List f = d;

    static {
        Class a2 = a("org.apache.xml.security.keys.KeyInfo");
        h = a2;
        a = LogFactory.getLog(a2.getName());
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add((Object) null);
        d = Collections.unmodifiableList(A0s);
    }

    public String e() {
        return "KeyInfo";
    }

    public KeyInfo(Element element, String str) {
        super(element, str);
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public static void a() {
        if (!g) {
            if (a == null) {
                Class cls = h;
                if (cls == null) {
                    cls = a("org.apache.xml.security.keys.KeyInfo");
                    h = cls;
                }
                Log log = LogFactory.getLog(cls.getName());
                a = log;
                log.error("Had to assign log in the init() function");
            }
            g = true;
        }
    }
}
