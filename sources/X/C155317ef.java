package X;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7ef  reason: invalid class name and case insensitive filesystem */
public final class C155317ef {
    public static final Pattern A00 = Pattern.compile("\\\\.");
    public static final Pattern A01 = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = A01.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = AnonymousClass6CA.A0X();
            }
            char A002 = AnonymousClass6C9.A00(matcher.group());
            if (A002 == 12) {
                str2 = "\\\\f";
            } else if (A002 == 13) {
                str2 = "\\\\r";
            } else if (A002 == '\"') {
                str2 = "\\\\\\\"";
            } else if (A002 == '/') {
                str2 = "\\\\/";
            } else if (A002 != '\\') {
                switch (A002) {
                    case 8:
                        str2 = "\\\\b";
                        break;
                    case 9:
                        str2 = "\\\\t";
                        break;
                    case 10:
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
