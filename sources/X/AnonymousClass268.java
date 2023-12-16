package X;

import java.util.Locale;

/* renamed from: X.268  reason: invalid class name */
public class AnonymousClass268 {
    public static String A00(String str) {
        String str2;
        String substring;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String str3 = " ";
        if (lowerCase.startsWith("select") || lowerCase.startsWith("delete")) {
            str2 = " from ";
        } else if (lowerCase.startsWith("insert")) {
            str2 = " into ";
            str3 = "(";
        } else if (!lowerCase.startsWith("update")) {
            return null;
        } else {
            str2 = "update ";
        }
        int indexOf = lowerCase.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        int length = str2.length() + indexOf;
        int indexOf2 = lowerCase.indexOf(str3, length);
        if (indexOf2 == -1) {
            substring = lowerCase.substring(length);
        } else {
            substring = lowerCase.substring(length, indexOf2);
        }
        return substring.trim();
    }
}
