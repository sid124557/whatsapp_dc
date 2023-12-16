package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public class C13800nl implements Attributes {
    public XmlPullParser A00;
    public final /* synthetic */ C06530Yb A01;

    public C13800nl(C06530Yb r1, XmlPullParser xmlPullParser) {
        this.A01 = r1;
        this.A00 = xmlPullParser;
    }

    public int getLength() {
        return this.A00.getAttributeCount();
    }

    public String getLocalName(int i) {
        return this.A00.getAttributeName(i);
    }

    public String getQName(int i) {
        XmlPullParser xmlPullParser = this.A00;
        String attributeName = xmlPullParser.getAttributeName(i);
        if (xmlPullParser.getAttributePrefix(i) == null) {
            return attributeName;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(xmlPullParser.getAttributePrefix(i));
        A0o.append(':');
        return AnonymousClass000.A0X(attributeName, A0o);
    }

    public String getURI(int i) {
        return this.A00.getAttributeNamespace(i);
    }

    public int getIndex(String str, String str2) {
        return -1;
    }

    public String getType(String str, String str2) {
        return null;
    }

    public String getValue(String str, String str2) {
        return null;
    }

    public int getIndex(String str) {
        return -1;
    }

    public String getType(int i) {
        return null;
    }

    public String getValue(int i) {
        return this.A00.getAttributeValue(i);
    }

    public String getType(String str) {
        return null;
    }

    public String getValue(String str) {
        return null;
    }
}
