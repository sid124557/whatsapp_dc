package org.apache.xml.security.utils;

import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import X.AnonymousClass6CA;
import java.io.IOException;
import java.io.StringReader;

public class RFC2253Parser {
    public static boolean a = true;
    public static int b;

    public static String c(String str) {
        String e;
        int indexOf = str.indexOf("=");
        if (indexOf == -1 || (indexOf > 0 && str.charAt(indexOf - 1) == '\\')) {
            return str;
        }
        String d = d(str.substring(0, indexOf));
        if (d.charAt(0) < '0' || d.charAt(0) > '9') {
            e = e(AnonymousClass6C9.A0c(indexOf, str));
        } else {
            e = AnonymousClass6C9.A0c(indexOf, str);
        }
        return AnonymousClass6C7.A0l("=", e, AnonymousClass6C9.A0i(d));
    }

    public static String f(String str) {
        return a(str, ";", ",");
    }

    public static String a(String str, String str2, String str3) {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                return AnonymousClass6C9.A0f(g(str.substring(i2)), A0X);
            }
            i3 += a(str, i, indexOf);
            if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                A0X.append(AnonymousClass6C7.A0l(g(str.substring(i2, indexOf)), str3, AnonymousClass6CA.A0X()));
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String b(String str) {
        StringBuffer A0X = AnonymousClass6CA.A0X();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf("+", i);
            if (indexOf < 0) {
                return AnonymousClass6C9.A0f(c(g(str.substring(i2))), A0X);
            }
            i3 += a(str, i, indexOf);
            if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                A0X.append(AnonymousClass6C7.A0l(c(g(str.substring(i2, indexOf))), "+", AnonymousClass6CA.A0X()));
                i2 = indexOf + 1;
                i3 = 0;
            }
            i = indexOf + 1;
        }
    }

    public static String d(String str) {
        String trim = str.toUpperCase().trim();
        if (trim.startsWith("OID")) {
            return trim.substring(3);
        }
        return trim;
    }

    public static String e(String str) {
        String g = g(str);
        if (g.startsWith("\"")) {
            StringBuffer A0X = AnonymousClass6CA.A0X();
            StringReader stringReader = new StringReader(g.substring(1, g.length() - 1));
            while (true) {
                int read = stringReader.read();
                if (read <= -1) {
                    break;
                }
                char c = (char) read;
                if (c == ',' || c == '=' || c == '+' || c == '<' || c == '>' || c == '#' || c == ';') {
                    A0X.append('\\');
                }
                A0X.append(c);
            }
            g = g(A0X.toString());
        }
        if (a) {
            if (!g.startsWith("#")) {
                return g;
            }
            StringBuffer A0X2 = AnonymousClass6CA.A0X();
            A0X2.append('\\');
            return AnonymousClass6C9.A0f(g, A0X2);
        } else if (g.startsWith("\\#")) {
            return g.substring(1);
        } else {
            return g;
        }
    }

    public static String g(String str) {
        String trim = str.trim();
        int indexOf = str.indexOf(trim) + trim.length();
        if (str.length() <= indexOf || !trim.endsWith("\\") || trim.endsWith("\\\\") || str.charAt(indexOf) != ' ') {
            return trim;
        }
        return AnonymousClass6C9.A0f(" ", AnonymousClass6C9.A0i(trim));
    }

    public static int a(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            if (str.charAt(i) == '\"') {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static String a(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        try {
            String f = f(str);
            StringBuffer A0X = AnonymousClass6CA.A0X();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = f.indexOf(",", i);
                if (indexOf >= 0) {
                    i3 += a(f, i, indexOf);
                    if (!(indexOf <= 0 || f.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                        A0X.append(AnonymousClass6C7.A0l(b(f.substring(i2, indexOf).trim()), ",", AnonymousClass6CA.A0X()));
                        i2 = indexOf + 1;
                        i3 = 0;
                    }
                    i = indexOf + 1;
                } else {
                    A0X.append(b(g(f.substring(i2))));
                    return A0X.toString();
                }
            }
        } catch (IOException unused) {
            return str;
        }
    }
}
