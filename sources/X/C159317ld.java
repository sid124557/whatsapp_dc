package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.7ld  reason: invalid class name and case insensitive filesystem */
public final class C159317ld {
    public static String A00(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean A01(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2 || !AnonymousClass6C8.A1T(str, xmlPullParser)) {
            return false;
        }
        return true;
    }
}
