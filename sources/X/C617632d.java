package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: X.32d  reason: invalid class name and case insensitive filesystem */
public class C617632d {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public static C617632d A01(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                int length2 = strArr[i].getBytes(C58152un.A0B).length;
                if (length2 <= 63) {
                    i2 += length2 + 1;
                    i++;
                } else {
                    throw AnonymousClass001.A0e("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return new C617632d(strArr, i2 + 1, 0);
    }

    public static C617632d A00(byte[] bArr, int i) {
        int i2;
        short s;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 1) {
                ArrayList A0s = AnonymousClass001.A0s();
                StringBuilder A0o = AnonymousClass001.A0o();
                int i3 = i;
                while (true) {
                    byte b = bArr[i3];
                    if (b == 0) {
                        i2 = i3 + 1;
                        s = 0;
                        break;
                    }
                    byte b2 = b & 192;
                    byte b3 = b & 63;
                    if (b2 != 0) {
                        s = (short) (((((byte) b3) << 8) & 65280) | (bArr[i3 + 1] & 255));
                        i2 = i3 + 2;
                        break;
                    }
                    byte b4 = (byte) b3;
                    int i4 = i3 + 1;
                    i3 = i4 + b4;
                    if (length >= i3 + 1) {
                        A0o.setLength(0);
                        for (byte b5 = 0; b5 < b4; b5 = (byte) (b5 + 1)) {
                            A0o.append((char) bArr[i4 + b5]);
                        }
                        AnonymousClass0x7.A1D(A0o, A0s);
                    } else {
                        throw new C118215tB("bytes is incomplete");
                    }
                }
                return new C617632d(C18300x5.A1b(A0s), i2 - i, s);
            }
            throw new C118215tB("insufficient data");
        }
        throw AnonymousClass001.A0g("bytes may not be null");
    }

    public void A02(OutputStream outputStream) {
        String[] strArr = this.A02;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            byte[] bytes = strArr[i].getBytes(C58152un.A0B);
            int length2 = bytes.length;
            if (length2 <= 63) {
                outputStream.write(length2);
                outputStream.write(bytes);
                i++;
            } else {
                throw AnonymousClass001.A0e("token may not be longer than 63 bytes");
            }
        }
        short s = this.A01;
        if (s != 0) {
            outputStream.write(((s >>> 8) & 63) | 192);
            outputStream.write(s & 255);
            return;
        }
        outputStream.write(0);
    }

    public C617632d(String[] strArr, int i, short s) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }
}
