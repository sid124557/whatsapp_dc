package org.apache.xml.security.algorithms;

import java.security.Key;
import org.w3c.dom.Element;

public abstract class SignatureAlgorithmSpi {
    public abstract String a();

    public abstract void a(byte b);

    public abstract void a(Key key);

    public abstract void a(byte[] bArr);

    public abstract void a(byte[] bArr, int i, int i2);

    public abstract String b();

    public abstract boolean b(byte[] bArr);

    public void a(Element element) {
    }

    public void c() {
    }
}
