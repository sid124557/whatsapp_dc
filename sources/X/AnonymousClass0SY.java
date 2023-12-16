package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* renamed from: X.0SY  reason: invalid class name */
public class AnonymousClass0SY {
    public static final Object A00 = AnonymousClass002.A0D();
    public static volatile ArrayList A01;

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlResourceParser.getAttributeValue((String) null, str);
        }
        return attributeValue;
    }
}
