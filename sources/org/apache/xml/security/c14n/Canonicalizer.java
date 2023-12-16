package org.apache.xml.security.c14n;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass6C9;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.xml.security.c14n.implementations.CanonicalizerBase;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.w3c.dom.Node;

public class Canonicalizer {
    public static boolean a;
    public static Map b;
    public CanonicalizerSpi c = null;

    public static Class b(String str) {
        return (Class) b.get(str);
    }

    public Canonicalizer(String str) {
        try {
            CanonicalizerSpi canonicalizerSpi = (CanonicalizerSpi) b(str).newInstance();
            this.c = canonicalizerSpi;
            canonicalizerSpi.a = true;
        } catch (Exception unused) {
            throw new InvalidCanonicalizerException("signature.Canonicalizer.UnknownCanonicalizer", AnonymousClass6C9.A1Z(str, 1));
        }
    }

    public static void a(String str, String str2) {
        Class b2 = b(str);
        if (b2 == null) {
            try {
                b.put(str, Class.forName(str2));
            } catch (ClassNotFoundException unused) {
                throw AnonymousClass002.A0E("c14n class not found");
            }
        } else {
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(str, b2, A0M);
            throw new AlgorithmAlreadyRegisteredException("algorithm.alreadyRegistered", A0M);
        }
    }

    public static void a() {
        if (!a) {
            b = new HashMap(10);
            a = true;
        }
    }

    public byte[] a(Node node) {
        return this.c.a(node);
    }

    public byte[] a(Node node, String str) {
        return this.c.a(node, str);
    }

    public static final Canonicalizer a(String str) {
        return new Canonicalizer(str);
    }

    public void a(OutputStream outputStream) {
        ((CanonicalizerBase) this.c).n = outputStream;
    }
}
