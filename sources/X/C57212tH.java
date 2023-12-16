package X;

import android.text.TextUtils;

/* renamed from: X.2tH  reason: invalid class name and case insensitive filesystem */
public class C57212tH {
    public static String A01(String str, String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(".");
            String str2 = strArr[i];
            A0l.append(str2);
            strArr2[i] = AnonymousClass000.A0V(" AS ", str2, A0l);
        }
        return TextUtils.join(", ", strArr2);
    }

    public static String A00(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1A("(", A0o, i);
        return AnonymousClass000.A0e(A0o);
    }

    public static void A02(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(A00(i));
    }

    public static void A03(String str, StringBuilder sb, String[] strArr) {
        sb.append(A01(str, strArr));
    }
}
