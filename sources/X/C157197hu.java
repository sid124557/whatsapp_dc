package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.7hu  reason: invalid class name and case insensitive filesystem */
public class C157197hu {
    public final AnonymousClass7LX[] A00;

    public C157197hu(String str) {
        this.A00 = new AnonymousClass7LX[]{new AnonymousClass7LX(str, this), new AnonymousClass7LX(AnonymousClass000.A0V("X509 ", str, AnonymousClass001.A0o()), this), new AnonymousClass7LX("PKCS7", this)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r0 > 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.io.InputStream r5) {
        /*
            java.lang.StringBuffer r4 = X.AnonymousClass6CA.A0X()
        L_0x0004:
            int r3 = r5.read()
            r2 = 10
            r1 = 13
            if (r3 == r1) goto L_0x001f
            if (r3 == r2) goto L_0x001f
            if (r3 < 0) goto L_0x0017
            char r0 = (char) r3
            r4.append(r0)
            goto L_0x0004
        L_0x0017:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0037
            r0 = 0
            return r0
        L_0x001f:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0004
            if (r3 != r1) goto L_0x0037
            r1 = 1
            r5.mark(r1)
            int r0 = r5.read()
            if (r0 != r2) goto L_0x003c
            r5.mark(r1)
        L_0x0034:
            r5.reset()
        L_0x0037:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x003c:
            if (r0 <= 0) goto L_0x0037
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157197hu.A00(java.io.InputStream):java.lang.String");
    }

    public C176958dq A01(InputStream inputStream) {
        String A002;
        AnonymousClass7LX[] r7;
        int length;
        AnonymousClass7LX r5;
        String A003;
        StringBuffer A0X = AnonymousClass6CA.A0X();
        loop0:
        while (true) {
            A002 = A00(inputStream);
            if (A002 != null) {
                int i = 0;
                while (true) {
                    r7 = this.A00;
                    length = r7.length;
                    if (i != length) {
                        r5 = r7[i];
                        if (!A002.startsWith(r5.A01) && !A002.startsWith(r5.A00)) {
                            i++;
                        }
                    }
                }
            } else {
                throw AnonymousClass002.A0C("malformed PEM data: no header found");
            }
        }
        if (!A002.startsWith(r5.A01)) {
            throw AnonymousClass002.A0C("malformed PEM data: found footer where header was expected");
        }
        loop2:
        while (true) {
            A003 = A00(inputStream);
            if (A003 != null) {
                int i2 = 0;
                while (i2 != length) {
                    AnonymousClass7LX r1 = r7[i2];
                    if (!A003.startsWith(r1.A01) && !A003.startsWith(r1.A00)) {
                        i2++;
                    }
                }
                A0X.append(A003);
            } else {
                throw AnonymousClass002.A0C("malformed PEM data: no footer found");
            }
        }
        if (!A003.startsWith(r5.A00)) {
            throw AnonymousClass002.A0C("malformed PEM data: header/footer mismatch");
        } else if (A0X.length() == 0) {
            return null;
        } else {
            try {
                String obj = A0X.toString();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((obj.length() / 4) * 3);
                C39302Bl.A00.B1H(byteArrayOutputStream, obj);
                return C176958dq.A0C(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                throw new C377924a(AnonymousClass000.A0a("unable to decode base64 string: ", AnonymousClass001.A0o(), e), e);
            } catch (Exception unused) {
                throw AnonymousClass002.A0C("malformed PEM data encountered");
            }
        }
    }
}
