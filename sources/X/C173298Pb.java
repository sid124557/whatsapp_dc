package X;

import java.io.IOException;

/* renamed from: X.8Pb  reason: invalid class name and case insensitive filesystem */
public class C173298Pb implements C183598qI {
    public void B2i(Appendable appendable, String str) {
        try {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == 12) {
                    appendable.append("\\f");
                } else if (charAt == 13) {
                    appendable.append("\\r");
                } else if (charAt == '\"') {
                    appendable.append("\\\"");
                } else if (charAt == '/') {
                    appendable.append("\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            appendable.append("\\b");
                            break;
                        case 9:
                            appendable.append("\\t");
                            break;
                        case 10:
                            appendable.append("\\n");
                            break;
                        default:
                            if (charAt >= 0 && (charAt <= 31 || (charAt >= 127 && (charAt <= 159 || (charAt >= 8192 && charAt <= 8447))))) {
                                appendable.append("\\u");
                                AnonymousClass6C8.A14(appendable, charAt >> 12);
                                AnonymousClass6C8.A14(appendable, charAt >> 8);
                                AnonymousClass6C8.A14(appendable, charAt >> 4);
                                AnonymousClass6C8.A14(appendable, charAt >> 0);
                                break;
                            } else {
                                appendable.append(charAt);
                                break;
                            }
                            break;
                    }
                } else {
                    appendable.append("\\\\");
                }
            }
        } catch (IOException unused) {
            throw AnonymousClass002.A0E("Impossible Error");
        }
    }
}
