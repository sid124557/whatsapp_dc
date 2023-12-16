package org.apache.xml.security.algorithms;

import X.AnonymousClass001;
import X.AnonymousClass4L0;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.signature.XMLSignatureException;
import org.w3c.dom.Element;

public class SignatureAlgorithm extends Algorithm {
    public static Log a;
    public static boolean b = false;
    public static HashMap c = null;
    public static ThreadLocal d = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0t();
        }
    };
    public static ThreadLocal e = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0t();
        }
    };
    public static ThreadLocal f = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0t();
        }
    };
    public static ThreadLocal g = new ThreadLocal() {
        public Object initialValue() {
            return AnonymousClass001.A0t();
        }
    };
    public static Class i;
    public SignatureAlgorithmSpi h = null;
    public String q = g();

    static {
        Class b2 = b("org.apache.xml.security.algorithms.SignatureAlgorithm");
        i = b2;
        a = LogFactory.getLog(b2.getName());
    }

    public static SignatureAlgorithmSpi d(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) d.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) d.get()).put(str, f2);
        return f2;
    }

    public static SignatureAlgorithmSpi e(String str) {
        SignatureAlgorithmSpi signatureAlgorithmSpi = (SignatureAlgorithmSpi) ((Map) e.get()).get(str);
        if (signatureAlgorithmSpi != null) {
            signatureAlgorithmSpi.c();
            return signatureAlgorithmSpi;
        }
        SignatureAlgorithmSpi f2 = f(str);
        ((Map) e.get()).put(str, f2);
        return f2;
    }

    public static SignatureAlgorithmSpi f(String str) {
        try {
            Class g2 = g(str);
            if (a.isDebugEnabled()) {
                Log log = a;
                StringBuffer A0X = AnonymousClass6CA.A0X();
                A0X.append("Create URI \"");
                A0X.append(str);
                A0X.append("\" class \"");
                A0X.append(g2);
                AnonymousClass6C7.A1K("\"", A0X, log);
            }
            return (SignatureAlgorithmSpi) g2.newInstance();
        } catch (IllegalAccessException e2) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            AnonymousClass6C9.A1C(e2, objArr, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr, e2);
        } catch (InstantiationException e3) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            AnonymousClass6C9.A1C(e3, objArr2, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr2, e3);
        } catch (NullPointerException e4) {
            Object[] objArr3 = new Object[2];
            objArr3[0] = str;
            AnonymousClass6C9.A1C(e4, objArr3, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr3, e4);
        }
    }

    public static Class g(String str) {
        HashMap hashMap = c;
        if (hashMap == null) {
            return null;
        }
        return (Class) hashMap.get(str);
    }

    public static void h() {
        Log log = a;
        if (log == null) {
            Class cls = i;
            if (cls == null) {
                cls = b("org.apache.xml.security.algorithms.SignatureAlgorithm");
                i = cls;
            }
            log = LogFactory.getLog(cls.getName());
            a = log;
        }
        log.debug("Init() called");
        if (!b) {
            c = new HashMap(10);
            b = true;
        }
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.h.a(bArr, i2, i3);
    }

    public String c() {
        try {
            return e(this.q).b();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    public SignatureAlgorithm(Element element, String str) {
        super(element, str);
    }

    public static Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw AnonymousClass6C7.A0r(e2);
        }
    }

    public String b() {
        try {
            return e(this.q).a();
        } catch (XMLSignatureException unused) {
            return null;
        }
    }

    public String d() {
        return "http://www.w3.org/2000/09/xmldsig#";
    }

    public String e() {
        return "SignatureMethod";
    }

    public void f() {
        ((Map) g.get()).clear();
        ((Map) e.get()).clear();
    }

    public final String g() {
        return this.k.getAttributeNS((String) null, "Algorithm");
    }

    public static void a(String str, String str2) {
        if (a.isDebugEnabled()) {
            Log log = a;
            StringBuffer A0X = AnonymousClass6CA.A0X();
            A0X.append("Try to register ");
            A0X.append(str);
            AnonymousClass6C7.A1H(" ", str2, A0X, log);
        }
        Class g2 = g(str);
        if (g2 != null) {
            String name = g2.getName();
            if (name.length() != 0) {
                throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", AnonymousClass4L0.A0V(str, name, 2));
            }
        }
        try {
            c.put(str, Class.forName(str2));
        } catch (ClassNotFoundException e2) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            AnonymousClass6C9.A1C(e2, objArr, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr, e2);
        } catch (NullPointerException e3) {
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            AnonymousClass6C9.A1C(e3, objArr2, 1);
            throw new XMLSignatureException("algorithms.NoSuchAlgorithm", objArr2, e3);
        }
    }

    public void a(byte b2) {
        this.h.a(b2);
    }

    public boolean b(byte[] bArr) {
        return this.h.b(bArr);
    }

    public void a(byte[] bArr) {
        this.h.a(bArr);
    }

    private void a(boolean z) {
        SignatureAlgorithmSpi e2;
        String str = this.q;
        if (z) {
            e2 = d(str);
        } else {
            e2 = e(str);
        }
        this.h = e2;
        e2.a(this.k);
    }

    public void a(Key key) {
        a(false);
        Map map = (Map) g.get();
        if (map.get(this.q) != key) {
            map.put(this.q, key);
            this.h.a(key);
        }
    }
}
