package X;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2xq  reason: invalid class name and case insensitive filesystem */
public class C60002xq {
    public static final List A02 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBAN", "FBAV", "FBLC", "FBSV"}));
    public static final List A03 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBBR", "FBBD", "FBBV", "FBCA", "FBPN", "FBDM"}));
    public String A00;
    public final Map A01;

    public C60002xq(boolean z) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A01 = A0t;
        if (z) {
            A0t.put("FBBR", Build.BOARD);
            A0t.put("FBBD", Build.BRAND);
            A0t.put("FBDM", Resources.getSystem().getDisplayMetrics().toString());
            A0t.put("FBSV", Build.VERSION.RELEASE);
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = Build.CPU_ABI;
            A0M[1] = Build.CPU_ABI2;
            A0t.put("FBCA", String.format((Locale) null, "%s:%s", A0M));
        }
    }

    public String A00() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(" [");
        for (Object next : A02) {
            A0o.append(String.format((Locale) null, "%s/%s;", new Object[]{next, A01(C18310x6.A0o(next, this.A01))}));
        }
        for (Object next2 : A03) {
            A0o.append(String.format((Locale) null, "%s/%s;", new Object[]{next2, A01(C18310x6.A0o(next2, this.A01))}));
        }
        return AnonymousClass000.A0f(A0o);
    }

    public String A01(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str == null) {
            return "null";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt < ' ' || charAt > '~') {
                sb.append("&#");
                sb.append(Integer.toString(charAt));
                str2 = ";";
            } else {
                sb.append(charAt);
            }
            sb.append(str2);
        }
        return sb.toString().replace("/", "-").replace(";", "-");
    }
}
