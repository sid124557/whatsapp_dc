package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;

/* renamed from: X.7rB  reason: invalid class name and case insensitive filesystem */
public final class C162077rB {
    public static String A00;

    public static String A02(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    static {
        try {
            A00 = (String) AccessController.doPrivileged(new C172798Mw());
        } catch (Exception unused) {
            try {
                A00 = String.format("%n", AnonymousClass4L0.A0U());
            } catch (Exception unused2) {
                A00 = "\n";
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A05(java.lang.String r6) {
        /*
            r5 = 46
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r2 = 1
        L_0x0008:
            r3 = 0
            if (r2 == 0) goto L_0x0022
            int r1 = r6.indexOf(r5)
            if (r1 <= 0) goto L_0x001d
            java.lang.String r0 = r6.substring(r3, r1)
            r4.addElement(r0)
            java.lang.String r6 = X.AnonymousClass6C9.A0c(r1, r6)
            goto L_0x0008
        L_0x001d:
            r4.addElement(r6)
            r2 = 0
            goto L_0x0008
        L_0x0022:
            int r2 = r4.size()
            java.lang.String[] r1 = new java.lang.String[r2]
        L_0x0028:
            if (r3 == r2) goto L_0x0033
            java.lang.Object r0 = r4.elementAt(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162077rB.A05(java.lang.String):java.lang.String[]");
    }

    public static String A00(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }

    public static String A01(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        if (z) {
            return new String(charArray);
        }
        return str;
    }

    public static byte[] A03(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        int i = 0;
        while (i != length) {
            i = AnonymousClass6CA.A0A(bArr, str.charAt(i), i);
        }
        return bArr;
    }

    public static byte[] A04(char[] cArr) {
        char c;
        int i;
        int i2;
        IllegalStateException A0e;
        ByteArrayOutputStream A0e2 = AnonymousClass0x9.A0e();
        int i3 = 0;
        while (true) {
            try {
                int length = cArr.length;
                if (i3 >= length) {
                    return A0e2.toByteArray();
                }
                char c2 = cArr[i3];
                if (c2 >= 128) {
                    int i4 = (c2 >> 6) | 192;
                    char c3 = c2;
                    if (c2 >= 2048) {
                        if (c2 >= 55296 && c2 <= 57343) {
                            i3++;
                            if (i3 >= length) {
                                A0e = AnonymousClass001.A0e("invalid UTF-16 codepoint");
                                break;
                            }
                            char c4 = cArr[i3];
                            if (c2 > 56319) {
                                A0e = AnonymousClass001.A0e("invalid UTF-16 codepoint");
                                break;
                            }
                            i = (((c2 & 1023) << 10) | (c4 & 1023)) + 0;
                            A0e2.write((i >> 18) | 240);
                            i2 = ((i >> 12) & 63) | 128;
                        } else {
                            i2 = (c2 >> 12) | 224;
                            i = c2;
                        }
                        A0e2.write(i2);
                        i4 = ((i >> 6) & 63) | 128;
                        c3 = i;
                    }
                    A0e2.write(i4);
                    c = (c3 & true) | true;
                } else {
                    c = c2;
                }
                A0e2.write(c);
                i3++;
            } catch (IOException unused) {
                throw AnonymousClass001.A0e("cannot encode string to byte array!");
            }
        }
        throw A0e;
    }
}
