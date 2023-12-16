package X;

/* renamed from: X.2uZ  reason: invalid class name and case insensitive filesystem */
public class C58012uZ {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A00(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append("(byte)0x");
            char[] cArr = A00;
            stringBuffer.append(cArr[(b >> 4) & 15]);
            stringBuffer.append(cArr[b & 15]);
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }
}
