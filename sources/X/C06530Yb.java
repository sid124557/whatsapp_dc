package X;

import android.graphics.Matrix;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;

/* renamed from: X.0Yb  reason: invalid class name and case insensitive filesystem */
public class C06530Yb {
    public int A00;
    public C16810u0 A01 = null;
    public AnonymousClass0QT A02 = null;
    public AnonymousClass0G8 A03 = null;
    public StringBuilder A04 = null;
    public StringBuilder A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;

    public static float A00(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    public static float A01(String str, int i) {
        float A002 = new AnonymousClass0TY().A00(str, 0, i);
        if (!Float.isNaN(A002)) {
            return A002;
        }
        throw C14450pi.A00(AnonymousClass000.A0V("Invalid float value: ", str, AnonymousClass001.A0o()));
    }

    public static int A02(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static C01820Ci A07(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int A022;
        long j;
        int i5;
        String str2 = str;
        int i6 = 5;
        if (str2.charAt(0) == '#') {
            int length = str2.length();
            AnonymousClass0T3 r9 = null;
            if (1 < length) {
                long j2 = 0;
                int i7 = 1;
                while (true) {
                    char charAt = str2.charAt(i7);
                    if (charAt >= '0') {
                        if (charAt <= '9') {
                            j2 = (j2 * 16) + ((long) (charAt - '0'));
                        } else if (charAt < 'A') {
                            break;
                        } else {
                            if (charAt > 'F') {
                                if (charAt < 'a' || charAt > 'f') {
                                    break;
                                }
                                j = j2 * 16;
                                i5 = charAt - 'a';
                            } else {
                                j = j2 * 16;
                                i5 = charAt - 'A';
                            }
                            j2 = j + ((long) i5) + 10;
                        }
                        if (j2 <= 4294967295L) {
                            i7++;
                            if (i7 >= length) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i7 != 1) {
                    r9 = new AnonymousClass0T3(j2, i7);
                }
            }
            if (r9 != null) {
                int i8 = r9.A00;
                if (i8 == 4) {
                    int i9 = (int) r9.A01;
                    int i10 = i9 & 3840;
                    int i11 = i9 & 240;
                    int i12 = i9 & 15;
                    return new C01820Ci(i12 | (i10 << 8) | -16777216 | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
                } else if (i8 == 5) {
                    int i13 = (int) r9.A01;
                    int i14 = 61440 & i13;
                    int i15 = i13 & 3840;
                    int i16 = i13 & 240;
                    int i17 = i13 & 15;
                    return new C01820Ci((i17 << 24) | (i17 << 28) | (i14 << 8) | (i14 << 4) | (i15 << 4) | i15 | i16 | (i16 >> 4));
                } else if (i8 == 7) {
                    i4 = (int) r9.A01;
                } else if (i8 == 9) {
                    int i18 = (int) r9.A01;
                    i3 = i18 << 24;
                    i2 = i18 >>> 8;
                    i = i2 | i3;
                    return new C01820Ci(i);
                } else {
                    throw C14450pi.A00(AnonymousClass000.A0T("Bad hex colour value: ", str2));
                }
            } else {
                throw C14450pi.A00(AnonymousClass000.A0T("Bad hex colour value: ", str2));
            }
        } else {
            String lowerCase = str2.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (!startsWith) {
                if (lowerCase.startsWith("rgb(")) {
                    i6 = 4;
                } else {
                    boolean startsWith2 = lowerCase.startsWith("hsla(");
                    if (!startsWith2) {
                        if (lowerCase.startsWith("hsl(")) {
                            i6 = 4;
                        } else {
                            Number number = (Number) C03320Jr.A00.get(lowerCase);
                            if (number != null) {
                                return new C01820Ci(number.intValue());
                            }
                            throw C14450pi.A00(AnonymousClass000.A0V("Invalid colour keyword: ", lowerCase, AnonymousClass001.A0o()));
                        }
                    }
                    C05600Ud r6 = new C05600Ud(str2.substring(i6));
                    r6.A0C();
                    float A023 = r6.A02();
                    float A042 = r6.A04(A023);
                    if (!Float.isNaN(A042)) {
                        r6.A0E('%');
                    }
                    float A043 = r6.A04(A042);
                    boolean isNaN = Float.isNaN(A043);
                    if (!isNaN) {
                        r6.A0E('%');
                    }
                    if (startsWith2) {
                        float A044 = r6.A04(A043);
                        r6.A0C();
                        if (Float.isNaN(A044) || !r6.A0E(')')) {
                            throw C14450pi.A00(AnonymousClass000.A0V("Bad hsla() colour value: ", str2, AnonymousClass001.A0o()));
                        }
                        i2 = A02(A044 * 256.0f) << 24;
                        i3 = A03(A023, A042, A043);
                        i = i2 | i3;
                        return new C01820Ci(i);
                    }
                    r6.A0C();
                    if (isNaN || !r6.A0E(')')) {
                        throw C14450pi.A00(AnonymousClass000.A0V("Bad hsl() colour value: ", str2, AnonymousClass001.A0o()));
                    }
                    i4 = A03(A023, A042, A043);
                }
            }
            C05600Ud r62 = new C05600Ud(str2.substring(i6));
            r62.A0C();
            float A024 = r62.A02();
            if (!Float.isNaN(A024) && r62.A0E('%')) {
                A024 = (A024 * 256.0f) / 100.0f;
            }
            float A045 = r62.A04(A024);
            if (!Float.isNaN(A045) && r62.A0E('%')) {
                A045 = (A045 * 256.0f) / 100.0f;
            }
            float A046 = r62.A04(A045);
            if (!Float.isNaN(A046) && r62.A0E('%')) {
                A046 = (A046 * 256.0f) / 100.0f;
            }
            if (startsWith) {
                float A047 = r62.A04(A046);
                r62.A0C();
                if (Float.isNaN(A047) || !r62.A0E(')')) {
                    throw C14450pi.A00(AnonymousClass000.A0V("Bad rgba() colour value: ", str2, AnonymousClass001.A0o()));
                }
                A022 = (A02(A047 * 256.0f) << 24) | (A02(A024) << 16);
            } else {
                r62.A0C();
                if (Float.isNaN(A046) || !r62.A0E(')')) {
                    throw C14450pi.A00(AnonymousClass000.A0V("Bad rgb() colour value: ", str2, AnonymousClass001.A0o()));
                }
                A022 = (A02(A024) << 16) | -16777216;
            }
            i2 = A022 | (A02(A045) << 8);
            i3 = A02(A046);
            i = i2 | i3;
            return new C01820Ci(i);
        }
        i = i4 | -16777216;
        return new C01820Ci(i);
    }

    public static final void A0J(C17040uT r7, Attributes attributes) {
        String str;
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (A05(attributes, i)) {
                case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER /*52*/:
                    C05600Ud r5 = new C05600Ud(trim);
                    HashSet A0K = AnonymousClass002.A0K();
                    while (!AnonymousClass000.A1U(r5.A01, r5.A00)) {
                        String A0B = r5.A0B(' ', false);
                        if (A0B.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            str = A0B.substring(35);
                        } else {
                            str = "UNSUPPORTED";
                        }
                        A0K.add(str);
                        r5.A0C();
                    }
                    r7.BnD(A0K);
                    break;
                case 53:
                    r7.BnC(trim);
                    break;
                case 54:
                    C05600Ud r52 = new C05600Ud(trim);
                    HashSet A0K2 = AnonymousClass002.A0K();
                    while (!AnonymousClass000.A1U(r52.A01, r52.A00)) {
                        A0K2.add(r52.A0B(' ', false));
                        r52.A0C();
                    }
                    r7.BnF(A0K2);
                    break;
                case 55:
                    List A0G = A0G(trim);
                    if (A0G == null) {
                        hashSet = new HashSet(0);
                    }
                    r7.BnE(hashSet);
                    break;
                case 73:
                    C05600Ud r6 = new C05600Ud(trim);
                    HashSet A0K3 = AnonymousClass002.A0K();
                    while (!AnonymousClass000.A1U(r6.A01, r6.A00)) {
                        String A0B2 = r6.A0B(' ', false);
                        int indexOf = A0B2.indexOf(45);
                        if (indexOf != -1) {
                            A0B2 = A0B2.substring(0, indexOf);
                        }
                        A0K3.add(new Locale(A0B2, "", "").getLanguage());
                        r6.A0C();
                    }
                    r7.BnX(A0K3);
                    break;
            }
        }
    }

    public static final void A0L(C01780Ce r3, Attributes attributes) {
        Boolean bool;
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID) || qName.equals("xml:id")) {
                r3.A03 = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if (CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID.equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw C14450pi.A00(AnonymousClass000.A0V("Invalid value for \"xml:space\" attribute: ", trim, AnonymousClass001.A0o()));
                }
                r3.A02 = bool;
                return;
            } else {
                i++;
            }
        }
    }

    public static final void A0M(C01780Ce r7, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int A052 = A05(attributes, i);
                if (A052 == 72) {
                    C05600Ud r5 = new C05600Ud(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String A0B = r5.A0B(':', false);
                        r5.A0C();
                        if (!r5.A0E(':')) {
                            break;
                        }
                        r5.A0C();
                        String A0B2 = r5.A0B(';', true);
                        if (A0B2 == null) {
                            break;
                        }
                        r5.A0C();
                        if (AnonymousClass000.A1U(r5.A01, r5.A00) || r5.A0E(';')) {
                            C10520i4 r0 = r7.A01;
                            if (r0 == null) {
                                r0 = new C10520i4();
                                r7.A01 = r0;
                            }
                            A0I(r0, A0B, A0B2);
                            r5.A0C();
                        }
                    }
                } else if (A052 != 0) {
                    C10520i4 r2 = r7.A00;
                    if (r2 == null) {
                        r2 = new C10520i4();
                        r7.A00 = r2;
                    }
                    A0I(r2, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C01880Co r3 = new C01880Co(trim);
                    ArrayList arrayList = null;
                    while (!AnonymousClass000.A1U(r3.A01, r3.A00)) {
                        String A0B3 = r3.A0B(' ', false);
                        if (A0B3 != null) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0s();
                            }
                            arrayList.add(A0B3);
                            r3.A0C();
                        }
                    }
                    r7.A04 = arrayList;
                }
            }
        }
    }

    public static final void A0O(AnonymousClass0CN r7, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A052 = A05(attributes, i);
            if (A052 == 48) {
                A0N(r7, trim);
            } else if (A052 == 80) {
                C05600Ud r0 = new C05600Ud(trim);
                r0.A0C();
                float A022 = r0.A02();
                r0.A0D();
                float A023 = r0.A02();
                r0.A0D();
                float A024 = r0.A02();
                r0.A0D();
                float A025 = r0.A02();
                if (Float.isNaN(A022) || Float.isNaN(A023) || Float.isNaN(A024) || Float.isNaN(A025)) {
                    throw C14450pi.A00("Invalid viewBox definition - should have four numbers");
                } else if (A024 < 0.0f) {
                    throw C14450pi.A00("Invalid viewBox. width cannot be negative");
                } else if (A025 >= 0.0f) {
                    r7.A00 = new C05400Te(A022, A023, A024, A025);
                } else {
                    throw C14450pi.A00("Invalid viewBox. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    public static final void A0P(AnonymousClass0CU r4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A052 = A05(attributes, i);
            if (A052 == 82) {
                r4.A02 = A0H(trim);
            } else if (A052 == 83) {
                r4.A03 = A0H(trim);
            } else if (A052 == 9) {
                r4.A00 = A0H(trim);
            } else if (A052 == 10) {
                r4.A01 = A0H(trim);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x001a, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(X.C01750Cb r5, org.xml.sax.Attributes r6) {
        /*
            r4 = this;
            r2 = 0
        L_0x0001:
            int r0 = r6.getLength()
            if (r2 >= r0) goto L_0x007c
            java.lang.String r0 = r6.getValue(r2)
            java.lang.String r3 = r0.trim()
            int r1 = A05(r6, r2)
            r0 = 26
            if (r1 == r0) goto L_0x0043
            switch(r1) {
                case 23: goto L_0x001d;
                case 24: goto L_0x0024;
                case 60: goto L_0x003c;
                default: goto L_0x001a;
            }
        L_0x001a:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x001d:
            android.graphics.Matrix r0 = A06(r3)
            r5.A00 = r0
            goto L_0x001a
        L_0x0024:
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0031
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x002e:
            r5.A02 = r0
            goto L_0x001a
        L_0x0031:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x002e
        L_0x003c:
            X.0Fk r0 = X.C02240Fk.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0065 }
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0065 }
            goto L_0x001a
        L_0x0043:
            java.lang.String r1 = ""
            java.lang.String r0 = r6.getURI(r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.String r1 = "http://www.w3.org/1999/xlink"
            java.lang.String r0 = r6.getURI(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
        L_0x005b:
            r5.A03 = r3
            goto L_0x001a
        L_0x005e:
            java.lang.String r0 = "Invalid value for attribute gradientUnits"
            X.0pi r0 = X.C14450pi.A00(r0)
            throw r0
        L_0x0065:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            X.0pi r0 = X.C14450pi.A00(r0)
            throw r0
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06530Yb.A0S(X.0Cb, org.xml.sax.Attributes):void");
    }

    public final void A0T(C16350ss r4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            AnonymousClass0GG r1 = (AnonymousClass0GG) AnonymousClass0GG.A00.get(attributes.getLocalName(i));
            if (r1 == null) {
                r1 = AnonymousClass0GG.A03;
            }
            if (r1 == AnonymousClass0GG.A1H) {
                r4.Bnf(A06(attributes.getValue(i)));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 <= 0.5f) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L_0x0009
            float r5 = r5 + r1
        L_0x0009:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r6 = 0
        L_0x0017:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0055
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
        L_0x0028:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L_0x002a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A02(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A02(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A02(r3)
            r0 = r0 | r1
            return r0
        L_0x0055:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L_0x002a
        L_0x005b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06530Yb.A03(float, float, float):int");
    }

    public static C10540i6 A08(C05600Ud r1) {
        if (r1.A0F("auto")) {
            return new C10540i6(0.0f);
        }
        return r1.A06();
    }

    public static C10510i3 A0B(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            C10510i3 r3 = null;
            if (indexOf == -1) {
                return new C01800Cg((C10510i3) null, str.substring(4).trim());
            }
            String trim = str.substring(4, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            if (trim2.length() > 0) {
                if (trim2.equals("none")) {
                    r3 = C01820Ci.A02;
                } else if (!trim2.equals("currentColor")) {
                    try {
                        r3 = A07(trim2);
                    } catch (C14450pi unused) {
                    }
                } else {
                    r3 = C01810Ch.A00;
                }
            }
            return new C01800Cg(r3, trim);
        } else if (str.equals("none")) {
            return C01820Ci.A02;
        } else {
            if (str.equals("currentColor")) {
                return C01810Ch.A00;
            }
            try {
                return A07(str);
            } catch (C14450pi unused2) {
                return null;
            }
        }
    }

    public static C14450pi A0C() {
        return new C14450pi("Invalid document. Root element must be <svg>");
    }

    public static String A0F(String str) {
        String substring;
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            substring = str.substring(4, str.length() - 1);
        } else {
            substring = str.substring(4);
        }
        return substring.trim();
    }

    public static List A0G(String str) {
        C05600Ud r3 = new C05600Ud(str);
        ArrayList arrayList = null;
        do {
            String A0A = r3.A0A();
            if (A0A == null && (A0A = r3.A0B(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
            }
            arrayList.add(A0A);
            r3.A0D();
        } while (!AnonymousClass000.A1U(r3.A01, r3.A00));
        return arrayList;
    }

    public static void A0K(C16810u0 r1, C01780Ce r2, C06530Yb r3, Attributes attributes) {
        r2.A01 = r3.A02;
        r2.A00 = r1;
        A0L(r2, attributes);
        A0M(r2, attributes);
    }

    public static void A0N(AnonymousClass0CO r4, String str) {
        C05600Ud r3 = new C05600Ud(str);
        r3.A0C();
        String A0B = r3.A0B(' ', false);
        if ("defer".equals(A0B)) {
            r3.A0C();
            A0B = r3.A0B(' ', false);
        }
        AnonymousClass0G6 r2 = (AnonymousClass0G6) C03310Jq.A00.get(A0B);
        r3.A0C();
        AnonymousClass0FY r1 = null;
        if (!AnonymousClass000.A1U(r3.A01, r3.A00)) {
            String A0B2 = r3.A0B(' ', false);
            if (A0B2.equals("meet")) {
                r1 = AnonymousClass0FY.meet;
            } else if (A0B2.equals("slice")) {
                r1 = AnonymousClass0FY.slice;
            } else {
                throw C14450pi.A00(AnonymousClass000.A0V("Invalid preserveAspectRatio definition: ", str, AnonymousClass001.A0o()));
            }
        }
        r4.A00 = new C05530Tw(r2, r1);
    }

    public final void A0U(String str) {
        AnonymousClass0NJ r2;
        AnonymousClass0CZ r1 = (AnonymousClass0CZ) this.A01;
        int size = r1.A01.size();
        if (size == 0) {
            r2 = null;
        } else {
            r2 = (AnonymousClass0NJ) r1.A01.get(size - 1);
        }
        if (r2 instanceof C01790Cf) {
            C01790Cf r22 = (C01790Cf) r2;
            r22.A00 = AnonymousClass000.A0V(r22.A00, str, AnonymousClass001.A0o());
            return;
        }
        this.A01.AwQ(new C01790Cf(str));
    }

    public static int A04(C13800nl r0, int i) {
        AnonymousClass0GG r02 = (AnonymousClass0GG) AnonymousClass0GG.A00.get(r0.getLocalName(i));
        if (r02 == null) {
            r02 = AnonymousClass0GG.A03;
        }
        return r02.ordinal();
    }

    public static int A05(Attributes attributes, int i) {
        AnonymousClass0GG r0 = (AnonymousClass0GG) AnonymousClass0GG.A00.get(attributes.getLocalName(i));
        if (r0 == null) {
            r0 = AnonymousClass0GG.A03;
        }
        return r0.ordinal();
    }

    public static final Matrix A06(String str) {
        Matrix A052 = AnonymousClass002.A05();
        String str2 = str;
        C05600Ud r4 = new C05600Ud(str2);
        r4.A0C();
        while (!AnonymousClass000.A1U(r4.A01, r4.A00)) {
            int i = r4.A01;
            String str3 = r4.A03;
            int charAt = str3.charAt(i);
            while (true) {
                if (charAt >= 97) {
                    if (charAt <= 122) {
                        charAt = r4.A05();
                    }
                } else if (charAt >= 65 && charAt <= 90) {
                    charAt = r4.A05();
                }
            }
            int i2 = r4.A01;
            while (C05600Ud.A01(charAt)) {
                charAt = r4.A05();
            }
            if (charAt == 40) {
                r4.A01++;
                String substring = str3.substring(i, i2);
                if (substring != null) {
                    char c = 65535;
                    switch (substring.hashCode()) {
                        case -1081239615:
                            if (substring.equals("matrix")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -925180581:
                            if (substring.equals("rotate")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 109250890:
                            if (substring.equals("scale")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 109493390:
                            if (substring.equals("skewX")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 109493391:
                            if (substring.equals("skewY")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1052832078:
                            if (substring.equals("translate")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            r4.A0C();
                            float A022 = r4.A02();
                            r4.A0D();
                            float A023 = r4.A02();
                            r4.A0D();
                            float A024 = r4.A02();
                            r4.A0D();
                            float A025 = r4.A02();
                            r4.A0D();
                            float A026 = r4.A02();
                            r4.A0D();
                            float A027 = r4.A02();
                            r4.A0C();
                            if (!Float.isNaN(A027) && r4.A0E(')')) {
                                Matrix A053 = AnonymousClass002.A05();
                                A053.setValues(new float[]{A022, A024, A026, A023, A025, A027, 0.0f, 0.0f, 1.0f});
                                A052.preConcat(A053);
                                break;
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                            break;
                        case 1:
                            r4.A0C();
                            float A028 = r4.A02();
                            float A032 = r4.A03();
                            float A033 = r4.A03();
                            r4.A0C();
                            if (Float.isNaN(A028) || !r4.A0E(')')) {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            } else if (Float.isNaN(A032)) {
                                A052.preRotate(A028);
                                break;
                            } else if (!Float.isNaN(A033)) {
                                A052.preRotate(A028, A032, A033);
                                break;
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                            break;
                        case 2:
                            r4.A0C();
                            float A029 = r4.A02();
                            float A034 = r4.A03();
                            r4.A0C();
                            if (!Float.isNaN(A029) && r4.A0E(')')) {
                                if (!Float.isNaN(A034)) {
                                    A052.preScale(A029, A034);
                                    break;
                                } else {
                                    A052.preScale(A029, A029);
                                    break;
                                }
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                            break;
                        case 3:
                            r4.A0C();
                            float A0210 = r4.A02();
                            r4.A0C();
                            if (!Float.isNaN(A0210) && r4.A0E(')')) {
                                A052.preSkew((float) Math.tan(Math.toRadians((double) A0210)), 0.0f);
                                break;
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                        case 4:
                            r4.A0C();
                            float A0211 = r4.A02();
                            r4.A0C();
                            if (!Float.isNaN(A0211) && r4.A0E(')')) {
                                A052.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) A0211)));
                                break;
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                        case 5:
                            r4.A0C();
                            float A0212 = r4.A02();
                            float A035 = r4.A03();
                            r4.A0C();
                            if (!Float.isNaN(A0212) && r4.A0E(')')) {
                                if (!Float.isNaN(A035)) {
                                    A052.preTranslate(A0212, A035);
                                    break;
                                } else {
                                    A052.preTranslate(A0212, 0.0f);
                                    break;
                                }
                            } else {
                                throw C14450pi.A00(AnonymousClass000.A0T("Invalid transform list: ", str2));
                            }
                            break;
                        default:
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Invalid transform list fn: ");
                            A0o.append(substring);
                            throw C14450pi.A00(AnonymousClass000.A0e(A0o));
                    }
                    if (AnonymousClass000.A1U(r4.A01, r4.A00)) {
                        return A052;
                    }
                    r4.A0D();
                }
            }
            throw C14450pi.A00(AnonymousClass000.A0V("Bad transform function encountered in transform list: ", str2, AnonymousClass001.A0o()));
        }
        return A052;
    }

    public static C10540i6 A09(String str) {
        int length = str.length();
        if (length != 0) {
            AnonymousClass0G3 r3 = AnonymousClass0G3.px;
            int i = length - 1;
            char charAt = str.charAt(i);
            if (charAt == '%') {
                length = i;
                r3 = AnonymousClass0G3.percent;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i2 = length - 2;
                if (Character.isLetter(str.charAt(i2))) {
                    length = i2;
                    try {
                        r3 = AnonymousClass0G3.valueOf(str.substring(i2).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw C14450pi.A00(AnonymousClass000.A0V("Invalid length unit specifier: ", str, AnonymousClass001.A0o()));
                    }
                }
            }
            try {
                return new C10540i6(r3, A01(str, length));
            } catch (NumberFormatException e) {
                throw new C14450pi(AnonymousClass000.A0V("Invalid length value: ", str, AnonymousClass001.A0o()), e);
            }
        } else {
            throw C14450pi.A00("Invalid length value (empty string)");
        }
    }

    public static C02250Fl A0A(String str) {
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    return C02250Fl.Oblique;
                }
                return null;
            case -1178781136:
                if (str.equals("italic")) {
                    return C02250Fl.Italic;
                }
                return null;
            case -1039745817:
                if (str.equals("normal")) {
                    return C02250Fl.Normal;
                }
                return null;
            default:
                return null;
        }
    }

    public static Float A0D(String str) {
        try {
            int length = str.length();
            if (length != 0) {
                float A012 = A01(str, length);
                if (A012 < 0.0f) {
                    A012 = 0.0f;
                } else if (A012 > 1.0f) {
                    A012 = 1.0f;
                }
                return Float.valueOf(A012);
            }
            throw C14450pi.A00("Invalid float value (empty string)");
        } catch (C14450pi unused) {
            return null;
        }
    }

    public static String A0E(C13800nl r0, int i) {
        return r0.getValue(i).trim();
    }

    public static List A0H(String str) {
        if (str.length() != 0) {
            ArrayList A0I = AnonymousClass002.A0I(1);
            C05600Ud r4 = new C05600Ud(str);
            r4.A0C();
            while (!AnonymousClass000.A1U(r4.A01, r4.A00)) {
                float A022 = r4.A02();
                if (!Float.isNaN(A022)) {
                    AnonymousClass0G3 A072 = r4.A07();
                    if (A072 == null) {
                        A072 = AnonymousClass0G3.px;
                    }
                    A0I.add(new C10540i6(A072, A022));
                    r4.A0D();
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Invalid length list value: ");
                    int i = r4.A01;
                    int i2 = i;
                    while (!AnonymousClass000.A1U(i2, r4.A00) && !C05600Ud.A01(r4.A03.charAt(i2))) {
                        i2 = r4.A01 + 1;
                        r4.A01 = i2;
                    }
                    throw C14450pi.A00(AnonymousClass000.A0X(r4.A03.substring(i, r4.A01), A0o));
                }
            }
            return A0I;
        }
        throw C14450pi.A00("Invalid length list (empty string)");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03fc, code lost:
        r9.A0M = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03fe, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0400, code lost:
        r0 = r9.A00;
        r7 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0410, code lost:
        if (r11.equals(r0) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0412, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x041e, code lost:
        if (r11.equals(r0) == false) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0420, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0506, code lost:
        r9.A00 = r0 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0509, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0523, code lost:
        r9.A00 = r2 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0571, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(X.C10520i4 r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r5 = r11.length()
            if (r5 == 0) goto L_0x0572
            java.lang.String r0 = "inherit"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0572
            java.util.Map r0 = X.AnonymousClass0GG.A00
            java.lang.Object r0 = r0.get(r10)
            X.0GG r0 = (X.AnonymousClass0GG) r0
            if (r0 != 0) goto L_0x001a
            X.0GG r0 = X.AnonymousClass0GG.A03
        L_0x001a:
            int r4 = r0.ordinal()
            java.lang.String r3 = "none"
            java.lang.String r2 = "SVGParser"
            java.lang.String r0 = "currentColor"
            r1 = 124(0x7c, float:1.74E-43)
            switch(r4) {
                case 1: goto L_0x0423;
                case 2: goto L_0x01ef;
                case 4: goto L_0x0480;
                case 5: goto L_0x050a;
                case 8: goto L_0x039c;
                case 14: goto L_0x016c;
                case 15: goto L_0x005c;
                case 16: goto L_0x025b;
                case 17: goto L_0x006a;
                case 18: goto L_0x02d4;
                case 19: goto L_0x0117;
                case 20: goto L_0x002a;
                case 21: goto L_0x04f5;
                case 22: goto L_0x0125;
                case 27: goto L_0x04c0;
                case 28: goto L_0x0134;
                case 29: goto L_0x0145;
                case 30: goto L_0x0152;
                case 31: goto L_0x015f;
                case 35: goto L_0x01fc;
                case 40: goto L_0x010b;
                case 42: goto L_0x03f4;
                case 58: goto L_0x0209;
                case 59: goto L_0x0223;
                case 62: goto L_0x01ca;
                case 63: goto L_0x01e2;
                case 64: goto L_0x0078;
                case 65: goto L_0x0094;
                case 66: goto L_0x0050;
                case 67: goto L_0x027c;
                case 68: goto L_0x02a8;
                case 69: goto L_0x0515;
                case 70: goto L_0x0086;
                case 71: goto L_0x0044;
                case 74: goto L_0x03c0;
                case 75: goto L_0x0354;
                case 78: goto L_0x049f;
                case 88: goto L_0x0232;
                case 89: goto L_0x024c;
                case 90: goto L_0x019b;
                default: goto L_0x0029;
            }
        L_0x0029:
            return
        L_0x002a:
            java.util.Map r0 = X.C03330Js.A00     // Catch:{ 0pi -> 0x0039 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ 0pi -> 0x0039 }
            X.0i6 r0 = (X.C10540i6) r0     // Catch:{ 0pi -> 0x0039 }
            if (r0 != 0) goto L_0x003a
            X.0i6 r0 = A09(r11)     // Catch:{ 0pi -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r9.A03 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 16384(0x4000, double:8.0948E-320)
            goto L_0x0506
        L_0x0044:
            X.0i6 r0 = A09(r11)     // Catch:{ 0pi -> 0x0029 }
            r9.A05 = r0     // Catch:{ 0pi -> 0x0029 }
            long r2 = r9.A00     // Catch:{ 0pi -> 0x0029 }
            r0 = 32
            goto L_0x0523
        L_0x0050:
            X.0i6 r0 = A09(r11)     // Catch:{ 0pi -> 0x0029 }
            r9.A04 = r0     // Catch:{ 0pi -> 0x0029 }
            long r2 = r9.A00     // Catch:{ 0pi -> 0x0029 }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0523
        L_0x005c:
            X.0i3 r0 = A0B(r11)
            r9.A0G = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 1
            goto L_0x0506
        L_0x006a:
            java.lang.Float r0 = A0D(r11)
            r9.A0O = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 4
            goto L_0x0506
        L_0x0078:
            X.0i3 r0 = A0B(r11)
            r9.A0J = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 8
            goto L_0x0506
        L_0x0086:
            java.lang.Float r0 = A0D(r11)
            r9.A0T = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 16
            goto L_0x0506
        L_0x0094:
            boolean r0 = r3.equals(r11)
            r7 = 512(0x200, double:2.53E-321)
            if (r0 == 0) goto L_0x00a3
            r0 = 0
            r9.A0c = r0
        L_0x009f:
            long r0 = r9.A00
            goto L_0x0506
        L_0x00a3:
            X.0Ud r6 = new X.0Ud
            r6.<init>(r11)
            r6.A0C()
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r1 = X.AnonymousClass000.A1U(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0106
            X.0i6 r3 = r6.A06()
            if (r3 == 0) goto L_0x0106
            float r2 = r3.A00
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1V(r1)
            if (r1 != 0) goto L_0x0106
            float r5 = r3.A00
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r4.add(r3)
        L_0x00d0:
            int r2 = r6.A01
            int r1 = r6.A00
            boolean r1 = X.AnonymousClass000.A1U(r2, r1)
            if (r1 != 0) goto L_0x00f5
            r6.A0D()
            X.0i6 r3 = r6.A06()
            if (r3 == 0) goto L_0x0106
            float r2 = r3.A00
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1V(r1)
            if (r1 != 0) goto L_0x0106
            r4.add(r3)
            float r1 = r3.A00
            float r5 = r5 + r1
            goto L_0x00d0
        L_0x00f5:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0106
            int r0 = r4.size()
            X.0i6[] r0 = new X.C10540i6[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.0i6[] r0 = (X.C10540i6[]) r0
        L_0x0106:
            r9.A0c = r0
            if (r0 == 0) goto L_0x0029
            goto L_0x009f
        L_0x010b:
            java.lang.Float r0 = A0D(r11)
            r9.A0P = r0
            long r0 = r9.A00
            r7 = 2048(0x800, double:1.0118E-320)
            goto L_0x0506
        L_0x0117:
            java.util.List r0 = A0G(r11)
            r9.A0b = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 8192(0x2000, double:4.0474E-320)
            goto L_0x0506
        L_0x0125:
            X.0Fl r0 = A0A(r11)
            r9.A08 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0506
        L_0x0134:
            java.lang.String r0 = A0F(r11)
            r9.A0Z = r0
            r9.A0Y = r0
            r9.A0X = r0
            long r0 = r9.A00
            r7 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x0506
        L_0x0145:
            java.lang.String r0 = A0F(r11)
            r9.A0Z = r0
            long r0 = r9.A00
            r7 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x0506
        L_0x0152:
            java.lang.String r0 = A0F(r11)
            r9.A0Y = r0
            long r0 = r9.A00
            r7 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x0506
        L_0x015f:
            java.lang.String r0 = A0F(r11)
            r9.A0X = r0
            long r0 = r9.A00
            r7 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x0506
        L_0x016c:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x0029
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass001.A0j(r0, r1)
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r11.equals(r3)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0L = r0
            long r0 = r9.A00
            r7 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x0506
        L_0x019b:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x0029
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass001.A0j(r0, r1)
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "visible"
            boolean r0 = r11.equals(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0N = r0
            long r0 = r9.A00
            r7 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x0506
        L_0x01ca:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01db
            X.0Ch r0 = X.C01810Ch.A00
            r9.A0I = r0
        L_0x01d4:
            long r0 = r9.A00
            r7 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x0506
        L_0x01db:
            X.0Ci r0 = A07(r11)     // Catch:{ 0pi -> 0x0527 }
            r9.A0I = r0     // Catch:{ 0pi -> 0x0527 }
            goto L_0x01d4
        L_0x01e2:
            java.lang.Float r0 = A0D(r11)
            r9.A0R = r0
            long r0 = r9.A00
            r7 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x0506
        L_0x01ef:
            java.lang.String r0 = A0F(r11)
            r9.A0W = r0
            long r0 = r9.A00
            r7 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x0506
        L_0x01fc:
            java.lang.String r0 = A0F(r11)
            r9.A0a = r0
            long r0 = r9.A00
            r7 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x0506
        L_0x0209:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x021c
            X.0Ch r0 = X.C01810Ch.A00
            r9.A0H = r0
        L_0x0213:
            long r0 = r9.A00
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x0506
        L_0x021c:
            X.0Ci r0 = A07(r11)     // Catch:{ 0pi -> 0x0527 }
            r9.A0H = r0     // Catch:{ 0pi -> 0x0527 }
            goto L_0x0213
        L_0x0223:
            java.lang.Float r0 = A0D(r11)
            r9.A0Q = r0
            long r0 = r9.A00
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x0506
        L_0x0232:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0245
            X.0Ch r0 = X.C01810Ch.A00
            r9.A0K = r0
        L_0x023c:
            long r0 = r9.A00
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0506
        L_0x0245:
            X.0Ci r0 = A07(r11)     // Catch:{ 0pi -> 0x0527 }
            r9.A0K = r0     // Catch:{ 0pi -> 0x0527 }
            goto L_0x023c
        L_0x024c:
            java.lang.Float r0 = A0D(r11)
            r9.A0U = r0
            long r0 = r9.A00
            r7 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x0506
        L_0x025b:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x026f
            X.0FZ r0 = X.AnonymousClass0FZ.NonZero
        L_0x0265:
            r9.A07 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 2
            goto L_0x0506
        L_0x026f:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x027a
            X.0FZ r0 = X.AnonymousClass0FZ.EvenOdd
            goto L_0x0265
        L_0x027a:
            r0 = 0
            goto L_0x0265
        L_0x027c:
            java.lang.String r0 = "butt"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0290
            X.0Fm r0 = X.C02260Fm.Butt
        L_0x0286:
            r9.A09 = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 64
            goto L_0x0506
        L_0x0290:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x029b
            X.0Fm r0 = X.C02260Fm.Round
            goto L_0x0286
        L_0x029b:
            java.lang.String r0 = "square"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02a6
            X.0Fm r0 = X.C02260Fm.Square
            goto L_0x0286
        L_0x02a6:
            r0 = 0
            goto L_0x0286
        L_0x02a8:
            java.lang.String r0 = "miter"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02bc
            X.0Fn r0 = X.C02270Fn.Miter
        L_0x02b2:
            r9.A0A = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 128(0x80, double:6.32E-322)
            goto L_0x0506
        L_0x02bc:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02c7
            X.0Fn r0 = X.C02270Fn.Round
            goto L_0x02b2
        L_0x02c7:
            java.lang.String r0 = "bevel"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02d2
            X.0Fn r0 = X.C02270Fn.Bevel
            goto L_0x02b2
        L_0x02d2:
            r0 = 0
            goto L_0x02b2
        L_0x02d4:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass001.A0j(r0, r1)
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            X.0Ud r5 = new X.0Ud
            r5.<init>(r11)
            r4 = 0
            r2 = r4
            r3 = r4
        L_0x02f2:
            r6 = 47
            r0 = 0
            java.lang.String r1 = r5.A0B(r6, r0)
            r5.A0C()
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0303
            if (r2 == 0) goto L_0x0303
            goto L_0x032d
        L_0x0303:
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02f2
            if (r4 != 0) goto L_0x0318
            java.util.Map r0 = X.C03340Jt.A00
            java.lang.Object r4 = r0.get(r1)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0318
            goto L_0x02f2
        L_0x0318:
            if (r2 != 0) goto L_0x0321
            X.0Fl r2 = A0A(r1)
            if (r2 == 0) goto L_0x0321
            goto L_0x02f2
        L_0x0321:
            if (r3 != 0) goto L_0x032d
            java.lang.String r0 = "small-caps"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x032d
            r3 = r1
            goto L_0x02f2
        L_0x032d:
            java.util.Map r0 = X.C03330Js.A00     // Catch:{ 0pi -> 0x033c }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ 0pi -> 0x033c }
            X.0i6 r3 = (X.C10540i6) r3     // Catch:{ 0pi -> 0x033c }
            if (r3 != 0) goto L_0x033d
            X.0i6 r3 = A09(r1)     // Catch:{ 0pi -> 0x033c }
            goto L_0x033d
        L_0x033c:
            r3 = 0
        L_0x033d:
            boolean r0 = r5.A0E(r6)
            if (r0 == 0) goto L_0x0533
            r5.A0C()
            r1 = 32
            r0 = 0
            java.lang.String r0 = r5.A0B(r1, r0)
            if (r0 == 0) goto L_0x0530
            A09(r0)     // Catch:{ 0pi -> 0x0029 }
            goto L_0x0530
        L_0x0354:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1171789332: goto L_0x0367;
                case -1026963764: goto L_0x0372;
                case 3387192: goto L_0x037d;
                case 93826908: goto L_0x0386;
                case 529818312: goto L_0x0391;
                default: goto L_0x035b;
            }
        L_0x035b:
            r0 = 0
        L_0x035c:
            r9.A0D = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 131072(0x20000, double:6.47582E-319)
            goto L_0x0506
        L_0x0367:
            java.lang.String r0 = "line-through"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x035b
            X.0Fx r0 = X.C02370Fx.LineThrough
            goto L_0x035c
        L_0x0372:
            java.lang.String r0 = "underline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x035b
            X.0Fx r0 = X.C02370Fx.Underline
            goto L_0x035c
        L_0x037d:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x035b
            X.0Fx r0 = X.C02370Fx.None
            goto L_0x035c
        L_0x0386:
            java.lang.String r0 = "blink"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x035b
            X.0Fx r0 = X.C02370Fx.Blink
            goto L_0x035c
        L_0x0391:
            java.lang.String r0 = "overline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x035b
            X.0Fx r0 = X.C02370Fx.Overline
            goto L_0x035c
        L_0x039c:
            java.lang.String r0 = "ltr"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03bd
            java.lang.String r0 = "rtl"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03ba
            r0 = 0
        L_0x03ad:
            r9.A0E = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x0506
        L_0x03ba:
            X.0Fa r0 = X.C02140Fa.RTL
            goto L_0x03ad
        L_0x03bd:
            X.0Fa r0 = X.C02140Fa.LTR
            goto L_0x03ad
        L_0x03c0:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1074341483: goto L_0x03d3;
                case 100571: goto L_0x03de;
                case 109757538: goto L_0x03e9;
                default: goto L_0x03c7;
            }
        L_0x03c7:
            r0 = 0
        L_0x03c8:
            r9.A0C = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 262144(0x40000, double:1.295163E-318)
            goto L_0x0506
        L_0x03d3:
            java.lang.String r0 = "middle"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03c7
            X.0Fp r0 = X.C02290Fp.Middle
            goto L_0x03c8
        L_0x03de:
            java.lang.String r0 = "end"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03c7
            X.0Fp r0 = X.C02290Fp.End
            goto L_0x03c8
        L_0x03e9:
            java.lang.String r0 = "start"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03c7
            X.0Fp r0 = X.C02290Fp.Start
            goto L_0x03c8
        L_0x03f4:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1217487446: goto L_0x0407;
                case -907680051: goto L_0x040a;
                case 3005871: goto L_0x0415;
                case 466743410: goto L_0x0418;
                default: goto L_0x03fb;
            }
        L_0x03fb:
            r0 = 0
        L_0x03fc:
            r9.A0M = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 524288(0x80000, double:2.590327E-318)
            goto L_0x0506
        L_0x0407:
            java.lang.String r0 = "hidden"
            goto L_0x040c
        L_0x040a:
            java.lang.String r0 = "scroll"
        L_0x040c:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03fb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x03fc
        L_0x0415:
            java.lang.String r0 = "auto"
            goto L_0x041a
        L_0x0418:
            java.lang.String r0 = "visible"
        L_0x041a:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03fb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x03fc
        L_0x0423:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r11)
            r7 = 0
            if (r0 != 0) goto L_0x046f
            java.lang.String r0 = "rect("
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x046f
            r0 = 5
            java.lang.String r0 = r11.substring(r0)
            X.0Ud r6 = new X.0Ud
            r6.<init>(r0)
            r6.A0C()
            X.0i6 r5 = A08(r6)
            r6.A0D()
            X.0i6 r4 = A08(r6)
            r6.A0D()
            X.0i6 r3 = A08(r6)
            r6.A0D()
            X.0i6 r2 = A08(r6)
            r6.A0C()
            r0 = 41
            boolean r0 = r6.A0E(r0)
            if (r0 != 0) goto L_0x047a
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 != 0) goto L_0x047a
        L_0x046f:
            r9.A01 = r7
            if (r7 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x0506
        L_0x047a:
            X.0MF r7 = new X.0MF
            r7.<init>(r5, r4, r3, r2)
            goto L_0x046f
        L_0x0480:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0492
            X.0FZ r0 = X.AnonymousClass0FZ.NonZero
        L_0x048a:
            r9.A06 = r0
            long r0 = r9.A00
            r7 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x0506
        L_0x0492:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x049d
            X.0FZ r0 = X.AnonymousClass0FZ.EvenOdd
            goto L_0x048a
        L_0x049d:
            r0 = 0
            goto L_0x048a
        L_0x049f:
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L_0x04bd
            java.lang.String r0 = "non-scaling-stroke"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04ba
            r0 = 0
        L_0x04ae:
            r9.A0F = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x0506
        L_0x04ba:
            X.0Fb r0 = X.C02150Fb.NonScalingStroke
            goto L_0x04ae
        L_0x04bd:
            X.0Fb r0 = X.C02150Fb.None
            goto L_0x04ae
        L_0x04c0:
            int r0 = r11.hashCode()
            switch(r0) {
                case -933002398: goto L_0x04d4;
                case 3005871: goto L_0x04df;
                case 362741610: goto L_0x04ea;
                default: goto L_0x04c7;
            }
        L_0x04c7:
            r0 = 0
        L_0x04c8:
            r9.A0B = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x0506
        L_0x04d4:
            java.lang.String r0 = "optimizeQuality"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x04c7
            X.0Fo r0 = X.C02280Fo.optimizeQuality
            goto L_0x04c8
        L_0x04df:
            java.lang.String r0 = "auto"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x04c7
            X.0Fo r0 = X.C02280Fo.auto
            goto L_0x04c8
        L_0x04ea:
            java.lang.String r0 = "optimizeSpeed"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x04c7
            X.0Fo r0 = X.C02280Fo.optimizeSpeed
            goto L_0x04c8
        L_0x04f5:
            java.util.Map r0 = X.C03340Jt.A00
            java.lang.Object r0 = r0.get(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0V = r0
            if (r0 == 0) goto L_0x0029
            long r0 = r9.A00
            r7 = 32768(0x8000, double:1.61895E-319)
        L_0x0506:
            long r0 = r0 | r7
            r9.A00 = r0
            return
        L_0x050a:
            X.0Ci r0 = A07(r11)     // Catch:{ 0pi -> 0x0029 }
            r9.A02 = r0     // Catch:{ 0pi -> 0x0029 }
            long r2 = r9.A00     // Catch:{ 0pi -> 0x0029 }
            r0 = 4096(0x1000, double:2.0237E-320)
            goto L_0x0523
        L_0x0515:
            float r0 = A01(r11, r5)     // Catch:{ 0pi -> 0x0029 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ 0pi -> 0x0029 }
            r9.A0S = r0     // Catch:{ 0pi -> 0x0029 }
            long r2 = r9.A00     // Catch:{ 0pi -> 0x0029 }
            r0 = 256(0x100, double:1.265E-321)
        L_0x0523:
            long r2 = r2 | r0
            r9.A00 = r2     // Catch:{ 0pi -> 0x0029 }
            goto L_0x0571
        L_0x0527:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r2, r0)
            return
        L_0x0530:
            r5.A0C()
        L_0x0533:
            int r1 = r5.A01
            int r0 = r5.A00
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            if (r0 == 0) goto L_0x0564
            r0 = 0
        L_0x053e:
            java.util.List r0 = A0G(r0)
            r9.A0b = r0
            r9.A03 = r3
            if (r4 != 0) goto L_0x055f
            r0 = 400(0x190, float:5.6E-43)
        L_0x054a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0V = r0
            if (r2 != 0) goto L_0x0554
            X.0Fl r2 = X.C02250Fl.Normal
        L_0x0554:
            r9.A08 = r2
            long r2 = r9.A00
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r2 = r2 | r0
            r9.A00 = r2
            return
        L_0x055f:
            int r0 = r4.intValue()
            goto L_0x054a
        L_0x0564:
            int r1 = r5.A01
            int r0 = r5.A00
            r5.A01 = r0
            java.lang.String r0 = r5.A03
            java.lang.String r0 = r0.substring(r1)
            goto L_0x053e
        L_0x0571:
            return
        L_0x0572:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06530Yb.A0I(X.0i4, java.lang.String, java.lang.String):void");
    }

    public static boolean A0Q(C13800nl r0, String str, int i) {
        return str.equals(r0.getURI(i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.0CQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.0CD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.0CB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.0C8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.0CA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: X.0CX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.0CL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: X.0C4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: X.0C5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: X.0CF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.0CM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v64, resolved type: X.0CH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v179, resolved type: X.0CR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v210, resolved type: X.0CQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v212, resolved type: X.0CE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: X.0CD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.0C7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: X.0C8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v80, resolved type: X.0C8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.0CG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v213, resolved type: X.0CQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v214, resolved type: X.0CC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v215, resolved type: X.0CJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v81, resolved type: X.0CD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: X.0C4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: X.0C4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: X.0C4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v82, resolved type: X.0CD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: X.0CD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v218, resolved type: X.0CQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v219, resolved type: X.0CQ} */
    /* JADX WARNING: type inference failed for: r1v177, types: [X.0Ce, X.0NJ, X.0CK] */
    /* JADX WARNING: type inference failed for: r1v185, types: [X.0Ce, X.0Cc] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cf, code lost:
        r10.A06 = true;
        r10.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0663, code lost:
        r10.A01.AwQ(r4);
        r10.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0726, code lost:
        A0J(r1, r11);
        A0O(r1, r11);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0929, code lost:
        r10.A01.AwQ(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x09fe, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a03, code lost:
        if (r4 >= r11.getLength()) goto L_0x0aa7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0a05, code lost:
        r1 = (X.AnonymousClass0GG) X.AnonymousClass0GG.A00.get(r11.getLocalName(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0a11, code lost:
        if (r1 != null) goto L_0x0a15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0a13, code lost:
        r1 = X.AnonymousClass0GG.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0a17, code lost:
        if (r1 != X.AnonymousClass0GG.A0o) goto L_0x0a83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0a19, code lost:
        r3 = new X.C05600Ud(r11.getValue(r4));
        r1 = X.AnonymousClass001.A0s();
        r3.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0a31, code lost:
        if (X.AnonymousClass000.A1U(r3.A01, r3.A00) != false) goto L_0x0a5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0a33, code lost:
        r12 = r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0a3d, code lost:
        if (java.lang.Float.isNaN(r12) != false) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0a3f, code lost:
        r3.A0D();
        r2 = r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0a4a, code lost:
        if (java.lang.Float.isNaN(r2) != false) goto L_0x0a87;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0a4c, code lost:
        r3.A0D();
        r1.add(java.lang.Float.valueOf(r12));
        r1.add(java.lang.Float.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0a5e, code lost:
        r5.A00 = new float[r1.size()];
        r7 = r1.iterator();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0a6f, code lost:
        if (r7.hasNext() == false) goto L_0x0a83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0a71, code lost:
        r5.A00[r3] = ((java.lang.Float) r7.next()).floatValue();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0a83, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0a87, code lost:
        r1 = X.C14450pi.A00(X.AnonymousClass000.A0X("> points attribute. There should be an even number of coordinates.", X.AnonymousClass000.A0m("Invalid <", r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0a97, code lost:
        r1 = X.C14450pi.A00(X.AnonymousClass000.A0X("> points attribute. Non-coordinate content found in list.", X.AnonymousClass000.A0m("Invalid <", r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0aa7, code lost:
        r10.A01.AwQ(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0baf, code lost:
        r13 = r2;
        r12 = r1;
        r6.Bhz(r4, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0bf9, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0c8b, code lost:
        r4 = r4 + r13;
        r3 = r3 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0c8d, code lost:
        r6.B1B(r1, r14, r4, r3, r2, r32);
        r13 = r2;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0ca4, code lost:
        r7.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0caf, code lost:
        if (X.AnonymousClass000.A1U(r7.A01, r7.A00) != false) goto L_0x0b31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0cb1, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0cb5, code lost:
        if (r1 == r7.A00) goto L_0x0ccf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0cb7, code lost:
        r1 = r7.A03.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0cbf, code lost:
        if (r1 < 'a') goto L_0x0cc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0cc4, code lost:
        if (r1 < 'A') goto L_0x0ccf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0cc8, code lost:
        if (r1 > 'Z') goto L_0x0ccf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0ccd, code lost:
        if (r1 <= 'z') goto L_0x0cd3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0cd3, code lost:
        r5 = r7.A09().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0d8a, code lost:
        r10.A01.AwQ(r2);
        r10.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0db6, code lost:
        A0K(r0, r1, r10, r11);
        A0T(r1, r11);
        A0J(r1, r11);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0dbf, code lost:
        r10.A01.AwQ(r1);
        r10.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0164, code lost:
        r0.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x05ec, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x0aa7, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0QT A0R(java.io.InputStream r36) {
        /*
            r35 = this;
            r34 = r36
            java.lang.String r16 = "Exception thrown closing input stream"
            java.lang.String r17 = "SVGParser"
            boolean r0 = r34.markSupported()
            if (r0 != 0) goto L_0x0015
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r0 = r34
            r1.<init>(r0)
            r34 = r1
        L_0x0015:
            r1 = 3
            r0 = r34
            r0.mark(r1)     // Catch:{ IOException -> 0x003c }
            int r1 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r34.reset()     // Catch:{ IOException -> 0x003c }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x003c
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x003c }
            r0 = r34
            r1.<init>(r0)     // Catch:{ IOException -> 0x003c }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x003c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003c }
            r34 = r0
        L_0x003c:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r34
            r0.mark(r1)     // Catch:{ all -> 0x0f1d }
            org.xmlpull.v1.XmlPullParser r18 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0nl r11 = new X.0nl     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10 = r35
            r0 = r18
            r11.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r9 = 0
            r0.setFeature(r1, r9)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r8 = 1
            r0.setFeature(r1, r8)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = 0
            r1 = r0
            r0 = r34
            r1.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r2 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0067:
            if (r2 == r8) goto L_0x0efd
            if (r2 == 0) goto L_0x0ea0
            r0 = 8
            if (r2 == r0) goto L_0x0e5f
            r0 = 10
            if (r2 == r0) goto L_0x0eca
            r4 = 58
            r1 = 2
            if (r2 == r1) goto L_0x0173
            r0 = 3
            if (r2 == r0) goto L_0x00c0
            r0 = 4
            if (r2 == r0) goto L_0x0ea8
            r0 = 5
            if (r2 != r0) goto L_0x0eca
            java.lang.String r2 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0eca
            boolean r0 = r10.A07     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x00a1
            java.lang.StringBuilder r1 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 != 0) goto L_0x009c
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A04 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x009c:
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x00a1:
            boolean r0 = r10.A08     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x00b5
            java.lang.StringBuilder r1 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 != 0) goto L_0x009c
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A05 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x009c
        L_0x00b5:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r0 instanceof X.AnonymousClass0CP     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0eca
            r10.A0U(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x00c0:
            java.lang.String r2 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x00dc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r2 = X.AnonymousClass000.A0X(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x00dc:
            java.lang.String r3 = r18.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x00f3
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r0 - r8
            r10.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x00f3
            r10.A06 = r9     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x00f3:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0105
            goto L_0x0eca
        L_0x0105:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 > 0) goto L_0x010c
            r1 = r2
        L_0x010c:
            java.util.Map r0 = X.AnonymousClass0G8.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0G8 r0 = (X.AnonymousClass0G8) r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0118
            X.0G8 r0 = X.AnonymousClass0G8.A03     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0118:
            int r1 = r0.ordinal()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == r9) goto L_0x0169
            r0 = 7
            if (r1 == r0) goto L_0x0169
            r0 = 4
            if (r1 == r0) goto L_0x0169
            r0 = 29
            if (r1 == r0) goto L_0x0169
            r0 = 24
            if (r1 == r0) goto L_0x0169
            r0 = 28
            if (r1 == r0) goto L_0x0169
            switch(r1) {
                case 3: goto L_0x0169;
                case 4: goto L_0x0133;
                case 5: goto L_0x0135;
                case 6: goto L_0x0133;
                case 7: goto L_0x0133;
                case 8: goto L_0x0169;
                case 9: goto L_0x0133;
                case 10: goto L_0x0169;
                case 11: goto L_0x0169;
                case 12: goto L_0x0169;
                case 13: goto L_0x0133;
                case 14: goto L_0x0169;
                case 15: goto L_0x0133;
                case 16: goto L_0x0133;
                case 17: goto L_0x0169;
                case 18: goto L_0x0133;
                case 19: goto L_0x0169;
                case 20: goto L_0x0169;
                case 21: goto L_0x013c;
                case 22: goto L_0x0169;
                case 23: goto L_0x0169;
                case 24: goto L_0x0133;
                case 25: goto L_0x0169;
                case 26: goto L_0x0135;
                case 27: goto L_0x0133;
                case 28: goto L_0x0133;
                case 29: goto L_0x0133;
                case 30: goto L_0x0169;
                default: goto L_0x0133;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0133:
            goto L_0x0eca
        L_0x0135:
            r10.A07 = r9     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.StringBuilder r0 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0eca
            goto L_0x0164
        L_0x013c:
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0eca
            r10.A08 = r9     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r3 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0G5 r2 = X.AnonymousClass0G5.screen     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0FX r0 = X.AnonymousClass0FX.Document     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0YE r1 = new X.0YE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0QT r2 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0Co r0 = new X.0Co     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0PA r1 = r1.A06(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0PA r0 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.A01(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0164:
            r0.setLength(r9)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0169:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0NJ r0 = (X.AnonymousClass0NJ) r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0173:
            java.lang.String r3 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x018f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r3 = X.AnonymousClass000.A0X(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x018f:
            java.lang.String r2 = r18.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x01a3
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x01a3:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x01b5
            goto L_0x0eca
        L_0x01b5:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 > 0) goto L_0x01bc
            r1 = r3
        L_0x01bc:
            java.util.Map r0 = X.AnonymousClass0G8.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0G8 r1 = (X.AnonymousClass0G8) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 != 0) goto L_0x01c8
            X.0G8 r1 = X.AnonymousClass0G8.A03     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x01c8:
            int r0 = r1.ordinal()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 0: goto L_0x0dcd;
                case 1: goto L_0x0dad;
                case 2: goto L_0x08da;
                case 3: goto L_0x04e7;
                case 4: goto L_0x0d98;
                case 5: goto L_0x0239;
                case 6: goto L_0x0866;
                case 7: goto L_0x0dad;
                case 8: goto L_0x0314;
                case 9: goto L_0x081d;
                case 10: goto L_0x0623;
                case 11: goto L_0x0672;
                case 12: goto L_0x023f;
                case 13: goto L_0x0ab4;
                case 14: goto L_0x03ac;
                case 15: goto L_0x0801;
                case 16: goto L_0x09ea;
                case 17: goto L_0x05bb;
                case 18: goto L_0x0936;
                case 19: goto L_0x0225;
                case 20: goto L_0x0534;
                case 21: goto L_0x01d5;
                case 22: goto L_0x0734;
                case 23: goto L_0x071a;
                case 24: goto L_0x07e4;
                case 25: goto L_0x0485;
                case 26: goto L_0x0239;
                case 27: goto L_0x0745;
                case 28: goto L_0x07a6;
                case 29: goto L_0x0d00;
                case 30: goto L_0x02fa;
                default: goto L_0x01cf;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x01cf:
            r10.A06 = r8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A00 = r8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x01d5:
            r5 = 0
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0dec
            java.lang.String r4 = "all"
            r3 = 1
        L_0x01dd:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r5 >= r0) goto L_0x01ff
            java.lang.String r2 = A0E(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 77
            if (r1 == r0) goto L_0x01f0
            goto L_0x01f7
        L_0x01f0:
            java.lang.String r0 = "text/css"
            boolean r3 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x01fc
        L_0x01f7:
            r0 = 38
            if (r1 != r0) goto L_0x01fc
            r4 = r2
        L_0x01fc:
            int r5 = r5 + 1
            goto L_0x01dd
        L_0x01ff:
            if (r3 == 0) goto L_0x01cf
            X.0G5 r3 = X.AnonymousClass0G5.screen     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0Co r0 = new X.0Co     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.List r0 = X.AnonymousClass0YE.A01(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0213:
            boolean r0 = r2.hasNext()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x01cf
            java.lang.Object r1 = r2.next()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0G5 r0 = X.AnonymousClass0G5.all     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == r0) goto L_0x0de8
            if (r1 != r3) goto L_0x0213
            goto L_0x0de8
        L_0x0225:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0233
            X.0Cc r1 = new X.0Cc     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0dbf
        L_0x0233:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0239:
            r10.A07 = r8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A03 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x023f:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x02f4
            X.0CR r1 = new X.0CR     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x024f:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0dbf
            java.lang.String r5 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r6 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r6 == r0) goto L_0x02da
            r0 = 83
            if (r6 == r0) goto L_0x02d3
            r0 = 81
            if (r6 == r0) goto L_0x02ba
            r0 = 25
            if (r6 == r0) goto L_0x02a1
            r0 = 37
            java.lang.String r4 = "userSpaceOnUse"
            java.lang.String r2 = "objectBoundingBox"
            if (r6 == r0) goto L_0x028d
            r0 = 36
            if (r6 != r0) goto L_0x02e0
            boolean r0 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0284
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0281:
            r1.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x02e0
        L_0x0284:
            boolean r0 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x02e4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0281
        L_0x028d:
            boolean r0 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0298
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0295:
            r1.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x02e0
        L_0x0298:
            boolean r0 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x02ec
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0295
        L_0x02a1:
            X.0i6 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x02ba:
            X.0i6 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x02d3:
            X.0i6 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x02e0
        L_0x02da:
            X.0i6 r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x02e0:
            int r3 = r3 + 1
            goto L_0x024f
        L_0x02e4:
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x02ec:
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x02f4:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x02fa:
            X.0u0 r2 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 == 0) goto L_0x030e
            X.0CK r1 = new X.0CK     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0QT r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.A00 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0L(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0726
        L_0x030e:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0314:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x03a6
            X.0CH r2 = new X.0CH     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0327:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0d8a
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r4 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r4 == r0) goto L_0x039d
            r0 = 83
            if (r4 == r0) goto L_0x0396
            r0 = 81
            if (r4 == r0) goto L_0x037d
            r0 = 25
            if (r4 == r0) goto L_0x0364
            r0 = 26
            if (r4 == r0) goto L_0x0351
            r0 = 48
            if (r4 != r0) goto L_0x03a3
            A0N(r2, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x03a3
        L_0x0351:
            java.lang.String r0 = ""
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0361
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x03a3
        L_0x0361:
            r2.A05 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x03a3
        L_0x0364:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x03a3
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x037d:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x03a3
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0396:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x03a3
        L_0x039d:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x03a3:
            int r3 = r3 + 1
            goto L_0x0327
        L_0x03a6:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x03ac:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x047f
            X.0CM r2 = new X.0CM     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x03bf:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0d8a
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r5 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r5 == r0) goto L_0x0465
            r0 = 83
            if (r5 == r0) goto L_0x045e
            r0 = 81
            if (r5 == r0) goto L_0x0445
            r0 = 25
            if (r5 == r0) goto L_0x042c
            r0 = 26
            if (r5 == r0) goto L_0x0419
            java.lang.String r1 = "userSpaceOnUse"
            java.lang.String r0 = "objectBoundingBox"
            switch(r5) {
                case 44: goto L_0x03f1;
                case 45: goto L_0x03ea;
                case 46: goto L_0x0405;
                default: goto L_0x03e8;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x03e8:
            goto L_0x046b
        L_0x03ea:
            android.graphics.Matrix r0 = A06(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x046b
        L_0x03f1:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x03fc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x03f9:
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x046b
        L_0x03fc:
            boolean r0 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x046f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x03f9
        L_0x0405:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0410
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x040d:
            r2.A06 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x046b
        L_0x0410:
            boolean r0 = r1.equals(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0477
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x040d
        L_0x0419:
            java.lang.String r0 = ""
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0429
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x046b
        L_0x0429:
            r2.A07 = r4     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x046b
        L_0x042c:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "Invalid <pattern> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0445:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "Invalid <pattern> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x045e:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x046b
        L_0x0465:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x046b:
            int r3 = r3 + 1
            goto L_0x03bf
        L_0x046f:
            java.lang.String r0 = "Invalid value for attribute patternContentUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0477:
            java.lang.String r0 = "Invalid value for attribute patternUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x047f:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0485:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x04e1
            X.0CW r2 = new X.0CW     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4 = 0
        L_0x0495:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r4 >= r0) goto L_0x04c7
            java.lang.String r3 = A0E(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 26
            if (r1 == r0) goto L_0x04b2
            r0 = 61
            if (r1 != r0) goto L_0x04c4
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x04c4
        L_0x04b2:
            java.lang.String r0 = ""
            boolean r0 = A0Q(r11, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x04c2
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0Q(r11, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x04c4
        L_0x04c2:
            r2.A02 = r3     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x0495
        L_0x04c7:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r1 instanceof X.AnonymousClass0CX     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x04da
            X.0CX r1 = (X.AnonymousClass0CX) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x04d6:
            r2.A01 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x04da:
            X.0st r1 = (X.C16360st) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0CX r1 = r1.BDa()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x04d6
        L_0x04e1:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x04e7:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x052e
            X.0CF r4 = new X.0CF     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r4, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r4, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r4, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x04fa:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0663
            java.lang.String r2 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 3
            if (r1 != r0) goto L_0x0523
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0518
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0515:
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0523
        L_0x0518:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0526
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0515
        L_0x0523:
            int r3 = r3 + 1
            goto L_0x04fa
        L_0x0526:
            java.lang.String r0 = "Invalid value for attribute clipPathUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x052e:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0534:
            X.0u0 r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == 0) goto L_0x05b5
            boolean r0 = r1 instanceof X.C01750Cb     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x05ad
            X.0Cd r4 = new X.0Cd     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r1, r4, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5 = 0
        L_0x0545:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r5 >= r0) goto L_0x05a4
            java.lang.String r3 = A0E(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 39
            if (r1 != r0) goto L_0x0587
            int r2 = r3.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 == 0) goto L_0x059c
            r6 = 1
            int r0 = r2 - r8
            char r1 = r3.charAt(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 37
            if (r1 != r0) goto L_0x056b
            int r2 = r2 + -1
            goto L_0x056c
        L_0x056b:
            r6 = 0
        L_0x056c:
            float r2 = A01(r3, r2)     // Catch:{ NumberFormatException -> 0x058a }
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L_0x0575
            float r2 = r2 / r1
        L_0x0575:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x057c
            r1 = 0
            goto L_0x0581
        L_0x057c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0581
            r1 = r2
        L_0x0581:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ NumberFormatException -> 0x058a }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0587:
            int r5 = r5 + 1
            goto L_0x0545
        L_0x058a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = "Invalid offset value in <stop>: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0pi r1 = new X.0pi     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x059c:
            java.lang.String r0 = "Invalid offset value in <stop> (empty string)"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x05a4:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r4     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x05ad:
            java.lang.String r0 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x05b5:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x05bb:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x061d
            X.0C5 r4 = new X.0C5     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r4, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0S(r4, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = 0
        L_0x05cb:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 >= r0) goto L_0x0663
            java.lang.String r3 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 11
            if (r1 == r0) goto L_0x05de
            goto L_0x05e5
        L_0x05de:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x05ec
        L_0x05e5:
            r0 = 12
            if (r1 == r0) goto L_0x0616
            switch(r1) {
                case 6: goto L_0x05ef;
                case 7: goto L_0x05f6;
                case 49: goto L_0x05fd;
                default: goto L_0x05ec;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x05ec:
            int r2 = r2 + 1
            goto L_0x05cb
        L_0x05ef:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x05ec
        L_0x05f6:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x05ec
        L_0x05fd:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x05ec
            java.lang.String r0 = "Invalid <radialGradient> element. r cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0616:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x05ec
        L_0x061d:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0623:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x066c
            X.0C4 r4 = new X.0C4     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r4, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0S(r4, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = 0
        L_0x0633:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 >= r0) goto L_0x0663
            java.lang.String r1 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 84: goto L_0x0645;
                case 85: goto L_0x064c;
                case 86: goto L_0x0653;
                case 87: goto L_0x065a;
                default: goto L_0x0644;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0644:
            goto L_0x0660
        L_0x0645:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0660
        L_0x064c:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0660
        L_0x0653:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0660
        L_0x065a:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0660:
            int r2 = r2 + 1
            goto L_0x0633
        L_0x0663:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r4     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x066c:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0672:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0714
            X.0CL r2 = new X.0CL     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0685:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0d8a
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 32: goto L_0x06be;
                case 33: goto L_0x06d7;
                case 34: goto L_0x06a5;
                case 41: goto L_0x06ed;
                case 50: goto L_0x0697;
                case 51: goto L_0x069e;
                default: goto L_0x0696;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0696:
            goto L_0x0708
        L_0x0697:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0708
        L_0x069e:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0708
        L_0x06a5:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0708
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x06be:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0708
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x06d7:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x06e2
            r2.A05 = r9     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0708
        L_0x06e2:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x070c
            r2.A05 = r8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0708
        L_0x06ed:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x06f8
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0702
        L_0x06f8:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0eef
            float r0 = A01(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0702:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0708:
            int r3 = r3 + 1
            goto L_0x0685
        L_0x070c:
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0714:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x071a:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x072e
            X.0CJ r1 = new X.0CJ     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0726:
            A0J(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0O(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0dbf
        L_0x072e:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0734:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x073f
            X.0CC r1 = new X.0CC     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0db6
        L_0x073f:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0745:
            X.0u0 r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == 0) goto L_0x07a0
            boolean r0 = r1 instanceof X.AnonymousClass0CP     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0798
            X.0CV r2 = new X.0CV     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r1, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4 = 0
        L_0x0759:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r4 >= r0) goto L_0x0780
            java.lang.String r3 = A0E(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 26
            if (r1 != r0) goto L_0x077d
            java.lang.String r0 = ""
            boolean r0 = A0Q(r11, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x077b
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0Q(r11, r0, r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x077d
        L_0x077b:
            r2.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x077d:
            int r4 = r4 + 1
            goto L_0x0759
        L_0x0780:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r1 instanceof X.AnonymousClass0CX     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0791
            X.0CX r1 = (X.AnonymousClass0CX) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x078d:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0791:
            X.0st r1 = (X.C16360st) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0CX r1 = r1.BDa()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x078d
        L_0x0798:
            java.lang.String r0 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x07a0:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x07a6:
            X.0u0 r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == 0) goto L_0x07de
            boolean r0 = r1 instanceof X.AnonymousClass0CP     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x07d6
            X.0CY r2 = new X.0CY     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r1, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0P(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r1 instanceof X.AnonymousClass0CX     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x07cf
            X.0CX r1 = (X.AnonymousClass0CX) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x07cb:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x07cf:
            X.0st r1 = (X.C16360st) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0CX r1 = r1.BDa()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x07cb
        L_0x07d6:
            java.lang.String r0 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x07de:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x07e4:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x07fb
            X.0CX r1 = new X.0CX     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0P(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0dbf
        L_0x07fb:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0801:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0817
            X.0CG r5 = new X.0CG     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r6 = "polygon"
            goto L_0x09fe
        L_0x0817:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x081d:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0860
            X.0CA r2 = new X.0CA     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0830:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0929
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 84: goto L_0x0842;
                case 85: goto L_0x0849;
                case 86: goto L_0x0850;
                case 87: goto L_0x0857;
                default: goto L_0x0841;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0841:
            goto L_0x085d
        L_0x0842:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x085d
        L_0x0849:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x085d
        L_0x0850:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x085d
        L_0x0857:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x085d:
            int r3 = r3 + 1
            goto L_0x0830
        L_0x0860:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0866:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x08d4
            X.0C9 r2 = new X.0C9     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0879:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x08cd
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 6: goto L_0x08bd;
                case 7: goto L_0x08c4;
                case 56: goto L_0x088b;
                case 57: goto L_0x08a4;
                default: goto L_0x088a;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x088a:
            goto L_0x08ca
        L_0x088b:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x08ca
            java.lang.String r0 = "Invalid <ellipse> element. rx cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x08a4:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x08ca
            java.lang.String r0 = "Invalid <ellipse> element. ry cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x08bd:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x08ca
        L_0x08c4:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x08ca:
            int r3 = r3 + 1
            goto L_0x0879
        L_0x08cd:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x08d4:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x08da:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0930
            X.0C8 r2 = new X.0C8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x08ed:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0929
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            switch(r0) {
                case 6: goto L_0x08ff;
                case 7: goto L_0x0906;
                case 49: goto L_0x090d;
                default: goto L_0x08fe;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x08fe:
            goto L_0x0926
        L_0x08ff:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0926
        L_0x0906:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0926
        L_0x090d:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0926
            java.lang.String r0 = "Invalid <circle> element. r cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0926:
            int r3 = r3 + 1
            goto L_0x08ed
        L_0x0929:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0930:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0936:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x09e4
            X.0CB r5 = new X.0CB     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = 0
        L_0x0949:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 >= r0) goto L_0x0aa7
            java.lang.String r3 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r1 == r0) goto L_0x09da
            r0 = 83
            if (r1 == r0) goto L_0x09d3
            r0 = 81
            if (r1 == r0) goto L_0x09ba
            r0 = 25
            if (r1 == r0) goto L_0x09a1
            r0 = 56
            if (r1 == r0) goto L_0x0988
            r0 = 57
            if (r1 != r0) goto L_0x09e0
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x09e0
            java.lang.String r0 = "Invalid <rect> element. ry cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0988:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x09e0
            java.lang.String r0 = "Invalid <rect> element. rx cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x09a1:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x09e0
            java.lang.String r0 = "Invalid <rect> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x09ba:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x09e0
            java.lang.String r0 = "Invalid <rect> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x09d3:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x09e0
        L_0x09da:
            X.0i6 r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x09e0:
            int r2 = r2 + 1
            goto L_0x0949
        L_0x09e4:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x09ea:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0aae
            X.0C7 r5 = new X.0C7     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r6 = "polyline"
        L_0x09fe:
            r4 = 0
        L_0x09ff:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r4 >= r0) goto L_0x0aa7
            java.lang.String r1 = r11.getLocalName(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.Map r0 = X.AnonymousClass0GG.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0GG r1 = (X.AnonymousClass0GG) r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 != 0) goto L_0x0a15
            X.0GG r1 = X.AnonymousClass0GG.A03     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0a15:
            X.0GG r0 = X.AnonymousClass0GG.A0o     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 != r0) goto L_0x0a83
            java.lang.String r0 = r11.getValue((int) r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0Ud r3 = new X.0Ud     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0a29:
            int r2 = r3.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r3.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = X.AnonymousClass000.A1U(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0a5e
            float r12 = r3.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r12)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r7 = "Invalid <"
            if (r0 != 0) goto L_0x0a97
            r3.A0D()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r3.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0a87
            r3.A0D()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Float r0 = java.lang.Float.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.add(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.add(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0a29
        L_0x0a5e:
            int r0 = r1.size()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float[] r0 = new float[r0]     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0a6b:
            boolean r0 = r7.hasNext()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0a83
            java.lang.Object r0 = r7.next()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r0.floatValue()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float[] r1 = r5.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r3 + 1
            r1[r3] = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = r0
            goto L_0x0a6b
        L_0x0a83:
            int r4 = r4 + 1
            goto L_0x09ff
        L_0x0a87:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r7, r6)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = "> points attribute. There should be an even number of coordinates."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0a97:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r7, r6)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = "> points attribute. Non-coordinate content found in list."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0aa7:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r5)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0aae:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0ab4:
            X.0u0 r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == 0) goto L_0x0cfa
            X.0C6 r25 = new X.0C6     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r25.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = r25
            A0K(r1, r0, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r0, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r0, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r15 = 0
        L_0x0ac9:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r15 >= r0) goto L_0x0cf1
            java.lang.String r2 = A0E(r11, r15)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r15)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 13
            if (r1 == r0) goto L_0x0af6
            r0 = 43
            if (r1 != r0) goto L_0x0ced
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0ef6
            float r1 = A01(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0ced
            java.lang.String r0 = "Invalid <path> element. pathLength cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0af6:
            X.0Ud r7 = new X.0Ud     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r7.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0gl r6 = new X.0gl     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0b31
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 77
            r1 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x0b1b
            if (r5 == r1) goto L_0x0b1b
            goto L_0x0b31
        L_0x0b1b:
            r13 = 0
            r4 = 0
            r12 = 0
            r3 = 0
            r24 = 0
            r23 = 0
        L_0x0b23:
            r7.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 108(0x6c, float:1.51E-43)
            r14 = 1073741824(0x40000000, float:2.0)
            java.lang.String r22 = " path segment"
            java.lang.String r21 = "Bad path coords for "
            switch(r5) {
                case 65: goto L_0x0c0d;
                case 67: goto L_0x0c64;
                case 72: goto L_0x0bfc;
                case 76: goto L_0x0bdc;
                case 77: goto L_0x0bb6;
                case 81: goto L_0x0b91;
                case 83: goto L_0x0b6d;
                case 84: goto L_0x0b51;
                case 86: goto L_0x0b3c;
                case 90: goto L_0x0b37;
                case 97: goto L_0x0c0d;
                case 99: goto L_0x0c64;
                case 104: goto L_0x0bfc;
                case 108: goto L_0x0bdc;
                case 109: goto L_0x0bb6;
                case 113: goto L_0x0b91;
                case 115: goto L_0x0b6d;
                case 116: goto L_0x0b51;
                case 118: goto L_0x0b3c;
                case 122: goto L_0x0b37;
                default: goto L_0x0b31;
            }     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0b31:
            r0 = r25
            r0.A00 = r6     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0ced
        L_0x0b37:
            r6.close()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0bf4
        L_0x0b3c:
            float r1 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 118(0x76, float:1.65E-43)
            if (r5 != r0) goto L_0x0b4b
            float r1 = r1 + r12
        L_0x0b4b:
            r12 = r1
            r6.BJh(r13, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0bf9
        L_0x0b51:
            float r0 = r13 * r14
            float r4 = r0 - r4
            float r14 = r14 * r12
            float r3 = r14 - r3
            float r2 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 116(0x74, float:1.63E-43)
            if (r5 != r0) goto L_0x0baf
            float r2 = r2 + r13
            float r1 = r1 + r12
            goto L_0x0baf
        L_0x0b6d:
            float r1 = r13 * r14
            float r1 = r1 - r4
            float r14 = r14 * r12
            float r14 = r14 - r3
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r32 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 115(0x73, float:1.61E-43)
            if (r5 != r0) goto L_0x0c8d
            float r2 = r2 + r13
            float r32 = r32 + r12
            goto L_0x0c8b
        L_0x0b91:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 113(0x71, float:1.58E-43)
            if (r5 != r0) goto L_0x0baf
            float r2 = r2 + r13
            float r1 = r1 + r12
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0baf:
            r13 = r2
            r12 = r1
            r6.Bhz(r4, r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0ca4
        L_0x0bb6:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r2 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 != 0) goto L_0x0cdc
            if (r5 != r1) goto L_0x0bcc
            int r2 = r6.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 == 0) goto L_0x0bcc
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0bcc:
            r13 = r4
            r12 = r3
            r6.BLL(r4, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r5 == r1) goto L_0x0bd5
            r0 = 76
        L_0x0bd5:
            r24 = r4
            r23 = r3
            r5 = r0
            goto L_0x0ca4
        L_0x0bdc:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r2 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 != 0) goto L_0x0cdc
            if (r5 != r0) goto L_0x0bee
            float r4 = r4 + r13
            float r1 = r1 + r12
        L_0x0bee:
            r13 = r4
            r12 = r1
            r6.BJh(r4, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0bf9
        L_0x0bf4:
            r13 = r24
            r4 = r13
            r12 = r23
        L_0x0bf9:
            r3 = r12
            goto L_0x0ca4
        L_0x0bfc:
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 104(0x68, float:1.46E-43)
            if (r5 != r0) goto L_0x0ca0
            float r4 = r4 + r13
            goto L_0x0ca0
        L_0x0c0d:
            float r1 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r0 = r7.A04(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r29 = r7.A04(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Float r2 = java.lang.Float.valueOf(r29)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.Boolean r20 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = r20
            java.lang.Boolean r19 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r19 != 0) goto L_0x0c2c
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0c33
        L_0x0c2c:
            r7.A0D()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r4 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0c33:
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r2 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r2 != 0) goto L_0x0cdc
            r14 = 0
            int r2 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0cdc
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0cdc
            r2 = 97
            if (r5 != r2) goto L_0x0c4c
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0c4c:
            boolean r32 = r20.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r33 = r19.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r26 = r6
            r27 = r1
            r28 = r0
            r30 = r4
            r31 = r3
            r26.AxI(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r13 = r4
            r12 = r3
            goto L_0x0ca4
        L_0x0c64:
            float r1 = r7.A02()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r14 = r7.A04(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r4 = r7.A04(r14)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r3 = r7.A04(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r2 = r7.A04(r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r32 = r7.A04(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0cdc
            r0 = 99
            if (r5 != r0) goto L_0x0c8d
            float r2 = r2 + r13
            float r32 = r32 + r12
            float r1 = r1 + r13
            float r14 = r14 + r12
        L_0x0c8b:
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0c8d:
            r26 = r6
            r27 = r1
            r28 = r14
            r29 = r4
            r30 = r3
            r31 = r2
            r26.B1B(r27, r28, r29, r30, r31, r32)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r13 = r2
            r12 = r32
            goto L_0x0ca4
        L_0x0ca0:
            r13 = r4
            r6.BJh(r4, r12)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0ca4:
            r7.A0D()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0b31
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == r0) goto L_0x0ccf
            java.lang.String r0 = r7.A03     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            char r1 = r0.charAt(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 97
            if (r1 < r0) goto L_0x0cc2
            goto L_0x0ccb
        L_0x0cc2:
            r0 = 65
            if (r1 < r0) goto L_0x0ccf
            r0 = 90
            if (r1 > r0) goto L_0x0ccf
            goto L_0x0cd3
        L_0x0ccb:
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L_0x0cd3
        L_0x0ccf:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0b23
        L_0x0cd3:
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0ccf
        L_0x0cdc:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r21)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            char r0 = (char) r5     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.append(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1 = r22
            r0 = r17
            X.AnonymousClass000.A1D(r1, r0, r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0b31
        L_0x0ced:
            int r15 = r15 + 1
            goto L_0x0ac9
        L_0x0cf1:
            X.0u0 r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = r25
            r1.AwQ(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0cfa:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0d00:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0d93
            X.0CD r2 = new X.0CD     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
        L_0x0d13:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0d8a
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r4 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r4 == r0) goto L_0x0d81
            r0 = 83
            if (r4 == r0) goto L_0x0d7a
            r0 = 81
            if (r4 == r0) goto L_0x0d61
            r0 = 25
            if (r4 == r0) goto L_0x0d48
            r0 = 26
            if (r4 != r0) goto L_0x0d87
            java.lang.String r0 = ""
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0d45
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = A0Q(r11, r0, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0d87
        L_0x0d45:
            r2.A04 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0d87
        L_0x0d48:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0d87
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0d61:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0d87
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0d7a:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0d87
        L_0x0d81:
            X.0i6 r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0d87:
            int r3 = r3 + 1
            goto L_0x0d13
        L_0x0d8a:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0d93:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0d98:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0da8
            X.0CE r1 = new X.0CE     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0dbf
        L_0x0da8:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0dad:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0dc8
            X.0CQ r1 = new X.0CQ     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0db6:
            A0K(r0, r1, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0T(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r1, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0dbf:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.AwQ(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A01 = r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0dc8:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0dcd:
            X.0CI r2 = new X.0CI     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0QT r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0M(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3 = 0
            goto L_0x0e0b
        L_0x0de8:
            r10.A08 = r8     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0dec:
            X.0pi r1 = A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0df1:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0e09
            java.lang.String r0 = "Invalid <svg> element. height cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0e08:
            throw r1     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0e09:
            int r3 = r3 + 1
        L_0x0e0b:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r3 >= r0) goto L_0x0e50
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 82
            if (r1 == r0) goto L_0x0e49
            r0 = 83
            if (r1 == r0) goto L_0x0e42
            r0 = 81
            if (r1 == r0) goto L_0x0e2a
            r0 = 25
            if (r1 != r0) goto L_0x0e09
            goto L_0x0df1
        L_0x0e2a:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            float r1 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0e09
            java.lang.String r0 = "Invalid <svg> element. width cannot be negative"
            X.0pi r1 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e08
        L_0x0e42:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e09
        L_0x0e49:
            X.0i6 r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e09
        L_0x0e50:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0e5b
            X.0QT r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0e58:
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0e5b:
            r0.AwQ(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e58
        L_0x0e5f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = "PROC INSTR: "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = r17
            android.util.Log.d(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            X.0Ud r4 = new X.0Ud     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = 32
            r4.A0B(r0, r9)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = 61
        L_0x0e8c:
            java.lang.String r1 = r4.A0B(r2, r9)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r1 == 0) goto L_0x0eca
            r4.A0E(r2)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            java.lang.String r0 = r4.A0A()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r3.put(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r4.A0C()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0e8c
        L_0x0ea0:
            X.0QT r0 = new X.0QT     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0ea8:
            int[] r1 = new int[r1]     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0 = r18
            char[] r3 = r0.getTextCharacters(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r2 = r1[r9]     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r1 = r1[r8]     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0eca
            boolean r0 = r10.A07     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0ed0
            java.lang.StringBuilder r0 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0ec7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0ec7:
            r0.append(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0eca:
            int r2 = r18.nextToken()     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0067
        L_0x0ed0:
            boolean r0 = r10.A08     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0ee0
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 != 0) goto L_0x0ec7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0ec7
        L_0x0ee0:
            X.0u0 r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            boolean r0 = r0 instanceof X.AnonymousClass0CP     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            if (r0 == 0) goto L_0x0eca
            java.lang.String r0 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r0.<init>(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            r10.A0U(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            goto L_0x0eca
        L_0x0eef:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.0pi r0 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0ef6:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.0pi r0 = X.C14450pi.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f0b, IOException -> 0x0f14 }
        L_0x0efd:
            r34.close()     // Catch:{ IOException -> 0x0f01 }
            goto L_0x0f08
        L_0x0f01:
            r1 = r17
            r0 = r16
            android.util.Log.e(r1, r0)
        L_0x0f08:
            X.0QT r0 = r10.A02
            return r0
        L_0x0f0b:
            r1 = move-exception
            java.lang.String r0 = "XML parser problem"
            X.0pi r2 = new X.0pi     // Catch:{ all -> 0x0f1d }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f1d }
            goto L_0x0f1c
        L_0x0f14:
            r1 = move-exception
            java.lang.String r0 = "Stream error"
            X.0pi r2 = new X.0pi     // Catch:{ all -> 0x0f1d }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f1d }
        L_0x0f1c:
            throw r2     // Catch:{ all -> 0x0f1d }
        L_0x0f1d:
            r2 = move-exception
            r34.close()     // Catch:{ IOException -> 0x0f22 }
            throw r2
        L_0x0f22:
            r1 = r17
            r0 = r16
            android.util.Log.e(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06530Yb.A0R(java.io.InputStream):X.0QT");
    }
}
