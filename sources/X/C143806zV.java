package X;

import javax.net.ssl.SSLException;

/* renamed from: X.6zV  reason: invalid class name and case insensitive filesystem */
public class C143806zV extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C143806zV(SSLException sSLException, byte b, boolean z) {
        this.description = b;
        this.ex = sSLException;
    }

    public static C143806zV A00(String str) {
        return new C143806zV(new SSLException(str), (byte) 80);
    }

    public static C143806zV A01(String str, byte b) {
        return new C143806zV(new SSLException(str), b);
    }

    public static C143806zV A02(String str, Throwable th, byte b) {
        return new C143806zV(new SSLException(str, th), b);
    }

    public static C143806zV A03(Throwable th) {
        return new C143806zV(new SSLException(th), (byte) 80);
    }

    public static C143806zV A04(Throwable th) {
        return new C143806zV(new SSLException(th), (byte) 80);
    }

    public C143806zV(SSLException sSLException, byte b) {
        this.description = b;
        this.ex = sSLException;
    }
}
