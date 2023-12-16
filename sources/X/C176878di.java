package X;

import java.io.IOException;

/* renamed from: X.8di  reason: invalid class name and case insensitive filesystem */
public class C176878di extends C177088e3 implements C183628qM {
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] A00;

    public String BDM() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] A0L = A0L();
            for (int i = 0; i != A0L.length; i++) {
                char[] cArr = A01;
                stringBuffer.append(cArr[(A0L[i] >>> 4) & 15]);
                stringBuffer.append(cArr[A0L[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new C144066zx("internal error encoding UniversalString");
        }
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public C176878di(byte[] bArr) {
        this.A00 = C161007oo.A02(bArr);
    }

    public String toString() {
        return BDM();
    }
}
