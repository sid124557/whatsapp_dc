package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.exoplayer2.util.Util;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.8g3  reason: invalid class name and case insensitive filesystem */
public class C177548g3 extends DefaultHandler {
    public static final Pattern A06 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A07 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A08 = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern A09 = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public long A00;
    public C147607Ey A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;

    public C177548g3(String str, int i, boolean z, boolean z2) {
        this.A01 = null;
        this.A00 = 0;
        this.A03 = str == null ? "null" : str;
        this.A05 = z;
        if (z2) {
            C147607Ey r0 = C147607Ey.A01;
            if (r0 == null) {
                synchronized (C147607Ey.class) {
                    r0 = C147607Ey.A01;
                    if (r0 == null) {
                        r0 = new C147607Ey(i);
                        C147607Ey.A01 = r0;
                    }
                }
            }
            this.A01 = r0;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw AnonymousClass6CA.A0Q("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = A08.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        float f2 = (float) parseInt;
        if (!TextUtils.isEmpty(group)) {
            return f2 / ((float) Integer.parseInt(group));
        }
        return f2;
    }

    public static int A01(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    public static int A02(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    public static long A03(String str, XmlPullParser xmlPullParser, long j) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Util.A08.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = 0.0d;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j2 = (long) ((d10 + d6) * 1000.0d);
        if (isEmpty) {
            return -j2;
        }
        return j2;
    }

    public static long A04(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r7[r4] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r5[r4] = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7TI A06(X.AnonymousClass7TI r11, java.lang.String r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r0 = 0
            java.lang.String r6 = r13.getAttributeValue(r0, r12)
            if (r6 == 0) goto L_0x00e2
            r0 = 5
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 4
            int[] r7 = new int[r0]
            java.lang.String[] r5 = new java.lang.String[r0]
            r9 = 0
            java.lang.String r13 = ""
            r8[r9] = r13
            r3 = 0
            r4 = 0
        L_0x0016:
            int r12 = r6.length()
            if (r3 >= r12) goto L_0x00dc
            java.lang.String r11 = "$"
            int r10 = r6.indexOf(r11, r3)
            r2 = -1
            if (r10 != r2) goto L_0x003a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r8[r4]
            r1.append(r0)
            java.lang.String r0 = r6.substring(r3)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r8[r4] = r0
            r3 = r12
            goto L_0x0016
        L_0x003a:
            if (r10 == r3) goto L_0x0051
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r8[r4]
            r1.append(r0)
            java.lang.String r0 = r6.substring(r3, r10)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r8[r4] = r0
            r3 = r10
            goto L_0x0016
        L_0x0051:
            java.lang.String r0 = "$$"
            boolean r0 = r6.startsWith(r0, r3)
            if (r0 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r8[r4]
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r11, r1)
            r8[r4] = r0
            int r3 = r3 + 2
            goto L_0x0016
        L_0x0068:
            int r0 = r3 + 1
            int r3 = r6.indexOf(r11, r0)
            java.lang.String r10 = r6.substring(r0, r3)
            java.lang.String r0 = "RepresentationID"
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0084
            r7[r4] = r0
        L_0x007d:
            int r4 = r4 + 1
            r8[r4] = r13
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0084:
            java.lang.String r0 = "%0"
            int r11 = r10.indexOf(r0)
            if (r11 == r2) goto L_0x00d9
            java.lang.String r2 = r10.substring(r11)
            java.lang.String r1 = "d"
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009c
            java.lang.String r2 = X.AnonymousClass000.A0T(r2, r1)
        L_0x009c:
            java.lang.String r10 = r10.substring(r9, r11)
        L_0x00a0:
            int r0 = r10.hashCode()
            r1 = 2
            switch(r0) {
                case -1950496919: goto L_0x00cc;
                case 2606829: goto L_0x00c0;
                case 38199441: goto L_0x00b6;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid template: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r6, r1)
            throw r0
        L_0x00b6:
            java.lang.String r0 = "Bandwidth"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 3
            goto L_0x00c9
        L_0x00c0:
            java.lang.String r0 = "Time"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 4
        L_0x00c9:
            r7[r4] = r0
            goto L_0x00d6
        L_0x00cc:
            java.lang.String r0 = "Number"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a8
            r7[r4] = r1
        L_0x00d6:
            r5[r4] = r2
            goto L_0x007d
        L_0x00d9:
            java.lang.String r2 = "%01d"
            goto L_0x00a0
        L_0x00dc:
            X.7TI r0 = new X.7TI
            r0.<init>(r7, r8, r5, r4)
            return r0
        L_0x00e2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177548g3.A06(X.7TI, java.lang.String, org.xmlpull.v1.XmlPullParser):X.7TI");
    }

    public static void A07(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            Matcher matcher = Util.A07.matcher(attributeValue);
            if (matcher.matches()) {
                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                    Integer.parseInt(matcher.group(12));
                    Integer.parseInt(matcher.group(13));
                    matcher.group(11);
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.clear();
                gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                if (!TextUtils.isEmpty(matcher.group(8))) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("0.");
                    gregorianCalendar.set(14, new BigDecimal(AnonymousClass000.A0X(matcher.group(8), A0o)).movePointRight(3).intValue());
                }
                gregorianCalendar.getTimeInMillis();
                return;
            }
            throw new C140626uD(AnonymousClass000.A0V("Invalid date/time format: ", attributeValue, AnonymousClass001.A0o()), (Throwable) null, true);
        }
    }

    public AnonymousClass7Z3 A0B(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            j2 = -1;
        } else {
            j = 0;
            j2 = -1;
        }
        return new AnonymousClass7Z3(j, attributeValue, j2);
    }

    public static AnonymousClass7W5 A05(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str2 = attributeValue;
        }
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str3 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!C153837c6.A00(str, xmlPullParser));
        return new AnonymousClass7W5(str2, str4, str3);
    }

    public int A09(XmlPullParser xmlPullParser) {
        String A002;
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str = attributeValue;
        }
        int i = -1;
        if (!"urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(str)) {
            if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(str) && (A002 = C1447272s.A00(xmlPullParser.getAttributeValue((String) null, "value"))) != null) {
                switch (A002.hashCode()) {
                    case 1596796:
                        if (A002.equals("4000")) {
                            i = 1;
                            break;
                        }
                        break;
                    case 2937391:
                        if (A002.equals("a000")) {
                            i = 2;
                            break;
                        }
                        break;
                    case 3094035:
                        if (A002.equals("f801")) {
                            i = 6;
                            break;
                        }
                        break;
                    case 3133436:
                        if (A002.equals("fa01")) {
                            i = 8;
                            break;
                        }
                        break;
                }
            }
        } else {
            i = A01("value", xmlPullParser, -1);
        }
        do {
            xmlPullParser.next();
        } while (!C153837c6.A00("AudioChannelConfiguration", xmlPullParser));
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d2, code lost:
        r9 = null;
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0A(org.xmlpull.v1.XmlPullParser r12) {
        /*
            r11 = this;
            java.lang.String r0 = "schemeIdUri"
            r8 = 0
            java.lang.String r0 = r12.getAttributeValue(r8, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = X.C1447272s.A00(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1980789791: goto L_0x01c8;
                case 489446379: goto L_0x01bd;
                case 755418770: goto L_0x01b2;
                case 1812765994: goto L_0x010a;
                default: goto L_0x0015;
            }
        L_0x0015:
            r9 = r8
            r6 = r8
        L_0x0017:
            r4 = r8
        L_0x0018:
            r3 = r8
        L_0x0019:
            r12.next()
            java.lang.String r0 = "clearkey:Laurl"
            boolean r0 = X.C153837c6.A01(r0, r12)
            r1 = 4
            if (r0 == 0) goto L_0x0043
            int r0 = r12.next()
            if (r0 != r1) goto L_0x0043
            java.lang.String r3 = r12.getText()
        L_0x002f:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = X.C153837c6.A00(r0, r12)
            if (r0 == 0) goto L_0x0019
            if (r6 == 0) goto L_0x003e
            X.7yl r8 = new X.7yl
            r8.<init>(r3, r6, r4)
        L_0x003e:
            android.util.Pair r0 = android.util.Pair.create(r9, r8)
            return r0
        L_0x0043:
            java.lang.String r0 = "ms:laurl"
            boolean r0 = X.C153837c6.A01(r0, r12)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "licenseUrl"
            java.lang.String r3 = r12.getAttributeValue(r8, r0)
            goto L_0x002f
        L_0x0052:
            if (r4 != 0) goto L_0x00e9
            java.lang.String r10 = "pssh"
            int r2 = r12.getEventType()
            r0 = 2
            if (r2 != r0) goto L_0x0095
            java.lang.String r5 = r12.getName()
            r0 = 58
            int r2 = r5.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x006e
            java.lang.String r5 = X.AnonymousClass6C9.A0c(r2, r5)
        L_0x006e:
            boolean r0 = r5.equals(r10)
            if (r0 == 0) goto L_0x0095
            int r0 = r12.next()
            if (r0 != r1) goto L_0x0095
            java.lang.String r0 = r12.getText()
            byte[] r4 = android.util.Base64.decode(r0, r7)
            X.7It r0 = X.AnonymousClass70z.A00(r4)
            if (r0 != 0) goto L_0x0092
            r6 = 0
            java.lang.String r1 = "MpdParser"
            java.lang.String r0 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r0)
            r4 = r8
            goto L_0x002f
        L_0x0092:
            java.util.UUID r6 = r0.A01
            goto L_0x002f
        L_0x0095:
            java.util.UUID r5 = X.C155567f7.A02
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "mspr:pro"
            boolean r0 = X.C153837c6.A01(r0, r12)
            if (r0 == 0) goto L_0x00e9
            int r0 = r12.next()
            if (r0 != r1) goto L_0x00e9
            java.lang.String r0 = r12.getText()
            byte[] r4 = android.util.Base64.decode(r0, r7)
            if (r4 == 0) goto L_0x00e7
            int r0 = r4.length
        L_0x00b6:
            int r0 = r0 + 32
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r2.putInt(r0)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r2.putInt(r0)
            r2.putInt(r7)
            long r0 = r5.getMostSignificantBits()
            r2.putLong(r0)
            long r0 = r5.getLeastSignificantBits()
            r2.putLong(r0)
            if (r4 == 0) goto L_0x00e1
            int r0 = r4.length
            if (r0 == 0) goto L_0x00e1
            r2.putInt(r0)
            r2.put(r4)
        L_0x00e1:
            byte[] r4 = r2.array()
            goto L_0x002f
        L_0x00e7:
            r0 = 0
            goto L_0x00b6
        L_0x00e9:
            int r1 = r12.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x002f
            r2 = 1
        L_0x00f1:
            r12.next()
            int r1 = r12.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x0100
            int r2 = r2 + 1
        L_0x00fd:
            if (r2 == 0) goto L_0x002f
            goto L_0x00f1
        L_0x0100:
            int r1 = r12.getEventType()
            r0 = 3
            if (r1 != r0) goto L_0x00f1
            int r2 = r2 + -1
            goto L_0x00fd
        L_0x010a:
            java.lang.String r0 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "value"
            java.lang.String r9 = r12.getAttributeValue(r8, r0)
            java.lang.String r5 = "default_KID"
            int r4 = r12.getAttributeCount()
            r3 = 0
        L_0x011f:
            if (r3 >= r4) goto L_0x0164
            java.lang.String r2 = r12.getAttributeName(r3)
            r0 = 58
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0132
            java.lang.String r2 = X.AnonymousClass6C9.A0c(r1, r2)
        L_0x0132:
            boolean r0 = r2.equals(r5)
            if (r0 == 0) goto L_0x0161
            java.lang.String r1 = r12.getAttributeValue(r3)
        L_0x013c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r1.split(r0)
            int r5 = r2.length
            java.util.UUID[] r4 = new java.util.UUID[r5]
            r1 = 0
        L_0x0154:
            if (r1 >= r5) goto L_0x0166
            r0 = r2[r1]
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x0154
        L_0x0161:
            int r3 = r3 + 1
            goto L_0x011f
        L_0x0164:
            r1 = 0
            goto L_0x013c
        L_0x0166:
            java.util.UUID r6 = X.C155567f7.A01
            r3 = 0
            r1 = 32
            int r0 = r5 * 16
            int r0 = r0 + 4
            int r1 = r1 + r0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            r2.putInt(r1)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r2.putInt(r0)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2.putInt(r0)
            long r0 = r6.getMostSignificantBits()
            r2.putLong(r0)
            long r0 = r6.getLeastSignificantBits()
            r2.putLong(r0)
            r2.putInt(r5)
        L_0x0193:
            if (r3 >= r5) goto L_0x01a8
            r10 = r4[r3]
            long r0 = r10.getMostSignificantBits()
            r2.putLong(r0)
            long r0 = r10.getLeastSignificantBits()
            r2.putLong(r0)
            int r3 = r3 + 1
            goto L_0x0193
        L_0x01a8:
            byte[] r4 = r2.array()
            r3 = r8
            goto L_0x0019
        L_0x01af:
            r6 = r8
            goto L_0x0017
        L_0x01b2:
            java.lang.String r0 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r6 = X.C155567f7.A04
            goto L_0x01d2
        L_0x01bd:
            java.lang.String r0 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r6 = X.C155567f7.A02
            goto L_0x01d2
        L_0x01c8:
            java.lang.String r0 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r6 = X.C155567f7.A00
        L_0x01d2:
            r9 = r8
            r4 = r8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177548g3.A0A(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r8 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r8 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r8.add(A0B("media", "mediaRange", r4));
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6K9 A0C(X.AnonymousClass6K9 r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            r20 = this;
            r2 = 1
            r5 = r21
            if (r21 == 0) goto L_0x00a9
            long r6 = r5.A01
        L_0x0008:
            java.lang.String r0 = "timescale"
            r4 = r22
            long r10 = A04(r0, r4, r6)
            if (r21 == 0) goto L_0x00a5
            long r0 = r5.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r12 = A04(r6, r4, r0)
            if (r21 == 0) goto L_0x009e
            long r0 = r5.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r16 = A04(r6, r4, r0)
            if (r21 == 0) goto L_0x0028
            long r2 = r5.A03
        L_0x0028:
            java.lang.String r0 = "startNumber"
            long r14 = A04(r0, r4, r2)
            r8 = 0
            r6 = r8
            r0 = r8
        L_0x0031:
            r4.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = X.C153837c6.A01(r1, r4)
            r3 = r20
            if (r1 == 0) goto L_0x0077
            java.lang.String r2 = "sourceURL"
            java.lang.String r1 = "range"
            X.7Z3 r6 = r3.A0B(r2, r1, r4)
        L_0x0046:
            java.lang.String r1 = "SegmentList"
            boolean r1 = X.C153837c6.A00(r1, r4)
            if (r1 == 0) goto L_0x0031
            if (r21 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0054
            X.7Z3 r6 = r5.A02
        L_0x0054:
            if (r0 == 0) goto L_0x005a
            java.util.List r1 = r0.A02
            if (r1 != 0) goto L_0x0065
        L_0x005a:
            java.util.List r4 = r5.A04
            int r3 = r5.A00
            long r1 = r5.A02
            X.7Ix r0 = new X.7Ix
            r0.<init>(r4, r3, r1)
        L_0x0065:
            if (r8 != 0) goto L_0x0069
            java.util.List r8 = r5.A00
        L_0x0069:
            java.util.List r7 = r0.A02
            int r9 = r0.A00
            long r0 = r0.A01
            X.6K9 r5 = new X.6K9
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r16, r18)
            return r5
        L_0x0077:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = X.C153837c6.A01(r1, r4)
            if (r1 == 0) goto L_0x0084
            X.7Ix r0 = r3.A0E(r4)
            goto L_0x0046
        L_0x0084:
            java.lang.String r1 = "SegmentURL"
            boolean r1 = X.C153837c6.A01(r1, r4)
            if (r1 == 0) goto L_0x0046
            if (r8 != 0) goto L_0x0092
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
        L_0x0092:
            java.lang.String r2 = "media"
            java.lang.String r1 = "mediaRange"
            X.7Z3 r1 = r3.A0B(r2, r1, r4)
            r8.add(r1)
            goto L_0x0046
        L_0x009e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00a5:
            r0 = 0
            goto L_0x0014
        L_0x00a9:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177548g3.A0C(X.6K9, org.xmlpull.v1.XmlPullParser):X.6K9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r4 != -1) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6KA A0D(X.AnonymousClass6KA r22, org.xmlpull.v1.XmlPullParser r23, boolean r24) {
        /*
            r21 = this;
            r4 = 1
            r1 = r22
            if (r22 == 0) goto L_0x00c6
            long r6 = r1.A01
        L_0x0008:
            java.lang.String r2 = "timescale"
            r0 = r23
            long r12 = A04(r2, r0, r6)
            if (r22 == 0) goto L_0x00c2
            long r2 = r1.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r14 = A04(r6, r0, r2)
            if (r22 == 0) goto L_0x00bb
            long r2 = r1.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r18 = A04(r6, r0, r2)
            if (r22 == 0) goto L_0x0028
            long r4 = r1.A03
        L_0x0028:
            java.lang.String r2 = "startNumber"
            long r16 = A04(r2, r0, r4)
            r8 = 0
            if (r22 == 0) goto L_0x00b8
            X.7TI r3 = r1.A02
        L_0x0033:
            java.lang.String r2 = "media"
            X.7TI r11 = A06(r3, r2, r0)
            if (r22 == 0) goto L_0x00b6
            X.7TI r3 = r1.A01
        L_0x003d:
            java.lang.String r2 = "initialization"
            X.7TI r10 = A06(r3, r2, r0)
            r9 = r8
            r7 = r8
        L_0x0045:
            r0.next()
            java.lang.String r2 = "Initialization"
            boolean r2 = X.C153837c6.A01(r2, r0)
            r6 = r21
            if (r2 == 0) goto L_0x0081
            java.lang.String r3 = "sourceURL"
            java.lang.String r2 = "range"
            X.7Z3 r8 = r6.A0B(r3, r2, r0)
        L_0x005a:
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = X.C153837c6.A00(r2, r0)
            if (r2 == 0) goto L_0x0045
            if (r22 == 0) goto L_0x0079
            if (r8 != 0) goto L_0x0068
            X.7Z3 r8 = r1.A02
        L_0x0068:
            if (r9 == 0) goto L_0x006e
            java.util.List r0 = r9.A02
            if (r0 != 0) goto L_0x0079
        L_0x006e:
            java.util.List r3 = r1.A04
            int r2 = r1.A00
            long r0 = r1.A02
            X.7Ix r9 = new X.7Ix
            r9.<init>(r3, r2, r0)
        L_0x0079:
            X.6KA r6 = new X.6KA
            r20 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r18, r20)
            return r6
        L_0x0081:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = X.C153837c6.A01(r2, r0)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "FBPredictedMedia"
            r7 = 0
            X.7TI r3 = A06(r7, r2, r0)
            java.lang.String r4 = "FBPredictedMediaEndNumber"
            r2 = -1
            int r4 = A01(r4, r0, r2)
            java.lang.String r5 = "FBPredictedMediaStartNumber"
            A01(r5, r0, r2)
            java.lang.String r5 = "FBAverageDuration"
            A01(r5, r0, r2)
            if (r3 == 0) goto L_0x00a6
            r5 = 0
            if (r4 == r2) goto L_0x00a7
        L_0x00a6:
            r5 = 1
        L_0x00a7:
            X.C159197lM.A02(r5)
            if (r3 == 0) goto L_0x00b1
            X.7FB r7 = new X.7FB
            r7.<init>(r3, r4)
        L_0x00b1:
            X.7Ix r9 = r6.A0E(r0)
            goto L_0x005a
        L_0x00b6:
            r3 = r8
            goto L_0x003d
        L_0x00b8:
            r3 = r8
            goto L_0x0033
        L_0x00bb:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00c2:
            r2 = 0
            goto L_0x0014
        L_0x00c6:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177548g3.A0D(X.6KA, org.xmlpull.v1.XmlPullParser, boolean):X.6KA");
    }

    public AnonymousClass6KC A0F(AnonymousClass6KC r18, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        AnonymousClass6KC r2 = r18;
        if (r18 != null) {
            j = r2.A01;
        } else {
            j = 1;
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A042 = A04("timescale", xmlPullParser2, j);
        long j4 = 0;
        if (r18 != null) {
            j2 = r2.A00;
        } else {
            j2 = 0;
        }
        long A043 = A04("presentationTimeOffset", xmlPullParser2, j2);
        if (r18 != null) {
            j3 = r2.A01;
            j4 = r2.A00;
        } else {
            j3 = 0;
        }
        AnonymousClass7Z3 r8 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        if (r18 != null) {
            r8 = r2.A02;
        }
        do {
            xmlPullParser2.next();
            if (C153837c6.A01("Initialization", xmlPullParser2)) {
                r8 = A0B("sourceURL", "range", xmlPullParser2);
            }
        } while (!C153837c6.A00("SegmentBase", xmlPullParser2));
        return new AnonymousClass6KC(r8, A042, A043, j3, j4);
    }

    public final String A0G(StringBuilder sb, List list) {
        String str = "";
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoId: ");
        A0o.append(this.A03);
        StringBuilder sb2 = sb;
        C18270x1.A1C("\n", A0o, sb2);
        sb2.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb2.append("Is MCM: ");
        List list2 = list;
        sb2.append(A0H(list2));
        sb2.append("\n");
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            int i = 0;
            for (AnonymousClass7PZ r1 : ((C150777Se) it.next()).A01) {
                if (r1 != null && r1.A00 == 2) {
                    C18270x1.A19("Adaptation set ", "\n", sb2, i);
                    i++;
                    int i2 = 0;
                    for (C152937aP r12 : r1.A05) {
                        sb2.append("  [");
                        sb2.append(i2);
                        sb2.append("]");
                        C166637z1 r13 = r12.A00;
                        String str2 = r13.A0S;
                        sb2.append(str2);
                        sb2.append(",");
                        sb2.append(r13.A0I);
                        sb2.append("x");
                        sb2.append(r13.A09);
                        sb2.append(",aoai: ");
                        C165907xp r14 = r13.A0K;
                        sb2.append(r14.A07);
                        sb2.append(",");
                        sb2.append(r14.A05);
                        sb2.append(",");
                        sb2.append(r13.A04);
                        sb2.append("bps\n");
                        i2++;
                        Number num = new Integer(0);
                        if (A0t.containsKey(str2) && (num = AnonymousClass0x9.A0p(str2, A0t)) == null) {
                            num = new Integer(0);
                        }
                        AnonymousClass0x2.A1I(str2, A0t, num.intValue() + 1);
                    }
                }
            }
        }
        sb2.append("----------------------------------------\n");
        if (A0t.isEmpty()) {
            return str;
        }
        Iterator A0u = AnonymousClass001.A0u(A0t);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            str = AnonymousClass000.A0X("+", AnonymousClass000.A0l(AnonymousClass000.A0X(String.format(Locale.US, "%d%s", new Object[]{A0w.getValue(), A0w.getKey()}), AnonymousClass000.A0l(str))));
        }
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 1);
        }
        return str;
    }

    public static boolean A08(String str) {
        if (C162097rD.A06(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str)) {
            return true;
        }
        return false;
    }

    public C148577Ix A0E(XmlPullParser xmlPullParser) {
        ArrayList A0s = AnonymousClass001.A0s();
        long j = 0;
        long j2 = 0;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C153837c6.A01("S", xmlPullParser)) {
                long A042 = A04("t", xmlPullParser, j);
                long A043 = A04("d", xmlPullParser, -9223372036854775807L);
                int A012 = A01("r", xmlPullParser, 0) + 1;
                int A013 = A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, xmlPullParser, 0);
                j2 = Math.max(j2, A043);
                A0s.add(new AnonymousClass7U0(A012, i, A013, A042, A043, false));
                j = A042 + (((long) A012) * A043);
                i += A012;
            }
        } while (!C153837c6.A00("SegmentTimeline", xmlPullParser));
        A0s.isEmpty();
        return new C148577Ix(A0s, i, j2);
    }

    public final boolean A0H(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C150777Se r0 = (C150777Se) it.next();
            if (r0 != null) {
                int i = 0;
                for (AnonymousClass7PZ r02 : r0.A01) {
                    if (r02 != null && r02.A00 == 2 && (i = i + 1) > 1) {
                        return true;
                    }
                }
                continue;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C150777Se r03 = (C150777Se) it2.next();
            if (r03 != null) {
                for (AnonymousClass7PZ r2 : r03.A01) {
                    if (r2 != null && r2.A00 == 2) {
                        String str2 = "";
                        for (C152937aP r04 : r2.A05) {
                            if (!(r04 == null || (str = r04.A00.A0S) == null || TextUtils.isEmpty(str))) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public C177548g3() {
        this((String) null, 0, false, false);
    }
}
