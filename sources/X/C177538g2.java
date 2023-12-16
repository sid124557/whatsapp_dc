package X;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: X.8g2  reason: invalid class name and case insensitive filesystem */
public class C177538g2 extends DefaultHandler {
    public static AnonymousClass7LR A00;
    public static C148367Ic A01;
    public static String A02;
    public static List A03 = AnonymousClass001.A0s();
    public static List A04 = AnonymousClass001.A0s();

    public void finalize() {
        System.out.println("KeyParser Destroyed");
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3.equals("key")) {
            AnonymousClass7LR r1 = new AnonymousClass7LR();
            A00 = r1;
            r1.A00 = attributes.getValue("ki");
            A00.A01 = attributes.getValue("code");
        } else if (str3.equals("param")) {
            C148367Ic r12 = new C148367Ic();
            A01 = r12;
            r12.A00 = attributes.getValue("code");
            attributes.getValue("owner");
        }
        A02 = "";
    }

    public C177538g2(String str) {
        A04 = AnonymousClass001.A0s();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new C143866zb(C140936ul.A02);
        }
    }

    public void characters(char[] cArr, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A02);
        A02 = AnonymousClass000.A0X(String.copyValueOf(cArr, i, i2).trim(), A0o);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r1.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endElement(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            int r0 = r5.hashCode()
            switch(r0) {
                case 106079: goto L_0x0037;
                case 106436749: goto L_0x002a;
                case 444324068: goto L_0x001b;
                case 492250706: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = ""
            A02 = r0
            return
        L_0x000c:
            java.lang.String r0 = "keyValue"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7LR r1 = A00
            java.lang.String r0 = A02
            r1.A02 = r0
            goto L_0x0007
        L_0x001b:
            java.lang.String r0 = "paramValue"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            X.7Ic r1 = A01
            java.lang.String r0 = A02
            r1.A01 = r0
            goto L_0x0007
        L_0x002a:
            java.lang.String r0 = "param"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.util.List r1 = A04
            X.7Ic r0 = A01
            goto L_0x0043
        L_0x0037:
            java.lang.String r0 = "key"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.util.List r1 = A03
            X.7LR r0 = A00
        L_0x0043:
            r1.add(r0)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177538g2.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C177538g2() {
    }
}
