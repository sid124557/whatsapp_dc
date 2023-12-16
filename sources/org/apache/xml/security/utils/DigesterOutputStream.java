package org.apache.xml.security.utils;

import X.AnonymousClass6C7;
import java.io.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;

public class DigesterOutputStream extends ByteArrayOutputStream {
    public static Log b;
    public static Class c;
    public final MessageDigestAlgorithm a;

    static {
        Class a2 = a("org.apache.xml.security.utils.DigesterOutputStream");
        c = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public void write(byte[] bArr, int i, int i2) {
        if (b.isDebugEnabled()) {
            b.debug("Pre-digested input:");
            StringBuffer stringBuffer = new StringBuffer(i2);
            for (int i3 = i; i3 < i + i2; i3++) {
                stringBuffer.append((char) bArr[i3]);
            }
            b.debug(stringBuffer.toString());
        }
        this.a.a(bArr, i, i2);
    }

    public DigesterOutputStream(MessageDigestAlgorithm messageDigestAlgorithm) {
        this.a = messageDigestAlgorithm;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }

    public byte[] a() {
        return this.a.a.digest();
    }

    public void write(int i) {
        this.a.a((byte) i);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
