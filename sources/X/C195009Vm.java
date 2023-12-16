package X;

import android.text.TextUtils;

/* renamed from: X.9Vm  reason: invalid class name and case insensitive filesystem */
public class C195009Vm {
    public static void A04(StringBuilder sb, StringBuilder sb2) {
        sb.append("");
        sb2.append(A00(sb.toString()));
    }

    public static String A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[data localized ");
        A0o.append(str.getBytes().length);
        return AnonymousClass000.A0X(" bytes]", A0o);
    }

    public static String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = (str.length() + 1) / 2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[");
        A0o.append(length);
        A0o.append(" char]");
        return AnonymousClass000.A0X(str.substring(length), A0o);
    }

    public static String A02(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("@")) {
            return "";
        }
        return "SCRUBBED-VPA";
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(A00(str));
    }
}
