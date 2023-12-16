package X;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: X.0Hz  reason: invalid class name and case insensitive filesystem */
public final class C02890Hz {
    public static Spanned A00(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C02880Hy.A00(str, 0);
        }
        return Html.fromHtml(str);
    }
}
