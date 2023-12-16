package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Yc  reason: invalid class name and case insensitive filesystem */
public class C106225Yc {
    public static String A01(String str) {
        if (!str.startsWith("whatsapp:user-notice")) {
            return "open-link";
        }
        String queryParameter = Uri.parse(AnonymousClass000.A0V("h://", str, AnonymousClass001.A0o())).getQueryParameter("action");
        if (queryParameter == null) {
            return "";
        }
        return queryParameter;
    }

    public static SpannableString A00(Context context, C183268pl r16, String str) {
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString A0A = AnonymousClass4L0.A0A(obj);
        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                C183268pl r11 = r16;
                if (r16 != null) {
                    String url = uRLSpan.getURL();
                    obj2 = new C137996pb(context, r11, url, A01(url), A02(url));
                }
            }
            A0A.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return A0A;
    }

    public static Map A02(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        if (!str.startsWith("whatsapp:user-notice")) {
            A0t.put("link", str);
        } else {
            Uri parse = Uri.parse(AnonymousClass000.A0V("h://", str, AnonymousClass001.A0o()));
            Iterator<String> it = parse.getQueryParameterNames().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (!"action".equals(A0m)) {
                    A0t.put(A0m, parse.getQueryParameter(A0m));
                }
            }
        }
        return A0t;
    }
}
