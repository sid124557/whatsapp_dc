package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: X.8dW  reason: invalid class name and case insensitive filesystem */
public class C176758dW extends C177088e3 {
    public byte[] A00;

    public boolean A0X() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A00;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public static final String A0A(int i) {
        if (i < 10) {
            return AnonymousClass000.A0Y("0", AnonymousClass001.A0o(), i);
        }
        return Integer.toString(i);
    }

    public static final String A0B(String str) {
        StringBuilder A0p;
        String str2;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (r1 = substring.charAt(i)) && r1 <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            A0p = AnonymousClass001.A0o();
            str2 = substring.substring(0, 4);
        } else if (i2 == 1) {
            A0p = AnonymousClass6C7.A0p(i, substring);
            str2 = "00";
        } else if (i2 != 2) {
            return str;
        } else {
            A0p = AnonymousClass6C7.A0p(i, substring);
            str2 = "0";
        }
        A0p.append(str2);
        return AnonymousClass000.A0V(str.substring(0, 14), AnonymousClass000.A0X(substring.substring(i), A0p), AnonymousClass001.A0o());
    }

    public static C176758dW A0C(Object obj) {
        if (obj == null || (obj instanceof C176758dW)) {
            return (C176758dW) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C176758dW) C177088e3.A0I((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18270x1.A1H(A0o, "encoding error in getInstance: ", e);
                throw C18310x6.A0d(A0o);
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C18260x0.A1T(A0o2, "illegal object in getInstance: ", obj);
            throw C18310x6.A0d(A0o2);
        }
    }

    public C177088e3 A0O() {
        return new C176098cS(this.A00);
    }

    public String A0U() {
        StringBuilder sb;
        String str;
        StringBuilder A0l;
        String str2;
        String A0X;
        String A02 = C162077rB.A02(this.A00);
        int length = A02.length();
        int i = length - 1;
        if (A02.charAt(i) == 'Z') {
            A0l = AnonymousClass6C7.A0p(i, A02);
            A0X = "GMT+00:00";
        } else {
            int i2 = length - 6;
            char charAt = A02.charAt(i2);
            if ((charAt == '-' || charAt == '+') && A02.indexOf("GMT") == i2 - 3) {
                return A02;
            }
            int i3 = length - 5;
            char charAt2 = A02.charAt(i3);
            if (charAt2 == '-' || charAt2 == '+') {
                sb = AnonymousClass6C7.A0p(i3, A02);
                sb.append("GMT");
                int i4 = i3 + 3;
                C18290x4.A1R(sb, A02.substring(i3, i4));
                str = A02.substring(i4);
            } else {
                int i5 = length - 3;
                char charAt3 = A02.charAt(i5);
                if (charAt3 == '-' || charAt3 == '+') {
                    sb = AnonymousClass6C7.A0p(i5, A02);
                    sb.append("GMT");
                    sb.append(A02.substring(i5));
                    str = ":00";
                } else {
                    A0l = AnonymousClass000.A0l(A02);
                    TimeZone timeZone = TimeZone.getDefault();
                    int rawOffset = timeZone.getRawOffset();
                    if (rawOffset < 0) {
                        rawOffset = -rawOffset;
                        str2 = "-";
                    } else {
                        str2 = "+";
                    }
                    int i6 = rawOffset / 3600000;
                    int i7 = (rawOffset - (((i6 * 60) * 60) * 1000)) / 60000;
                    try {
                        if (timeZone.useDaylightTime()) {
                            if (A0X()) {
                                A02 = A0B(A02);
                            }
                            SimpleDateFormat A0V = A0V();
                            StringBuilder A0o = AnonymousClass001.A0o();
                            AnonymousClass001.A1K(A02, "GMT", str2, A0o);
                            A0o.append(A0A(i6));
                            A0o.append(":");
                            if (timeZone.inDaylightTime(A0V.parse(AnonymousClass000.A0X(A0A(i7), A0o)))) {
                                int i8 = -1;
                                if (str2.equals("+")) {
                                    i8 = 1;
                                }
                                i6 += i8;
                            }
                        }
                    } catch (ParseException unused) {
                    }
                    StringBuilder A0m = AnonymousClass000.A0m("GMT", str2);
                    A0m.append(A0A(i6));
                    A0m.append(":");
                    A0X = AnonymousClass000.A0X(A0A(i7), A0m);
                }
            }
            return AnonymousClass000.A0X(str, sb);
        }
        return AnonymousClass000.A0X(A0X, A0l);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date A0W() {
        /*
            r5 = this;
            byte[] r0 = r5.A00
            java.lang.String r2 = X.C162077rB.A02(r0)
            java.lang.String r4 = "Z"
            boolean r0 = r2.endsWith(r4)
            r3 = 0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "yyyyMMddHHmmss.SSS'Z'"
        L_0x0017:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
        L_0x001c:
            java.util.SimpleTimeZone r0 = new java.util.SimpleTimeZone
            r0.<init>(r3, r4)
            r1.setTimeZone(r0)
        L_0x0024:
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = A0B(r2)
        L_0x002e:
            java.util.Date r0 = r1.parse(r2)
            java.util.Date r0 = X.C155497f0.A00(r0)
            return r0
        L_0x0037:
            boolean r0 = r5.A0Z()
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "yyyyMMddHHmmss'Z'"
            goto L_0x0017
        L_0x0040:
            boolean r0 = r5.A0Y()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "yyyyMMddHHmm'Z'"
            goto L_0x0017
        L_0x0049:
            java.lang.String r0 = "yyyyMMddHH'Z'"
            goto L_0x0017
        L_0x004c:
            r0 = 45
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            r0 = 43
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "yyyyMMddHHmmss.SSS"
        L_0x0064:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r0.getID()
            goto L_0x001c
        L_0x0072:
            boolean r0 = r5.A0Z()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "yyyyMMddHHmmss"
            goto L_0x0064
        L_0x007b:
            boolean r0 = r5.A0Y()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "yyyyMMddHHmm"
            goto L_0x0064
        L_0x0084:
            java.lang.String r0 = "yyyyMMddHH"
            goto L_0x0064
        L_0x0087:
            java.lang.String r2 = r5.A0U()
            java.text.SimpleDateFormat r1 = r5.A0V()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176758dW.A0W():java.util.Date");
    }

    public boolean A0Y() {
        if (!A0a(10) || !A0a(11)) {
            return false;
        }
        return true;
    }

    public boolean A0Z() {
        if (!A0a(12) || !A0a(13)) {
            return false;
        }
        return true;
    }

    public final boolean A0a(int i) {
        byte b;
        byte[] bArr = this.A00;
        if (bArr.length <= i || (b = bArr[i]) < 48 || b > 57) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C161007oo.A00(this.A00);
    }

    public C176758dW(byte[] bArr) {
        if (bArr.length >= 4) {
            this.A00 = bArr;
            if (!A0a(0) || !A0a(1) || !A0a(2) || !A0a(3)) {
                throw AnonymousClass001.A0c("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw AnonymousClass001.A0c("GeneralizedTime string too short");
    }

    public final SimpleDateFormat A0V() {
        String str;
        if (A0X()) {
            str = "yyyyMMddHHmmss.SSSz";
        } else if (A0Z()) {
            str = "yyyyMMddHHmmssz";
        } else if (A0Y()) {
            str = "yyyyMMddHHmmz";
        } else {
            str = "yyyyMMddHHz";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public C176758dW(String str) {
        this.A00 = C162077rB.A03(str);
        try {
            A0W();
        } catch (ParseException e) {
            throw AnonymousClass001.A0c(AnonymousClass000.A0a("invalid date string: ", AnonymousClass001.A0o(), e));
        }
    }
}
