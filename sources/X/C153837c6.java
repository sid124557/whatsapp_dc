package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.7c6  reason: invalid class name and case insensitive filesystem */
public final class C153837c6 {
    public static boolean A00(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 3 || !AnonymousClass6C8.A1T(str, xmlPullParser)) {
            return false;
        }
        return true;
    }

    public static boolean A01(String str, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2 || !AnonymousClass6C8.A1T(str, xmlPullParser)) {
            return false;
        }
        return true;
    }
}
