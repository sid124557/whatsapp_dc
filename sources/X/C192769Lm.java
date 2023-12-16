package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9Lm  reason: invalid class name and case insensitive filesystem */
public final class C192769Lm {
    public static final Intent A00(Activity activity, AnonymousClass1VX r9, UserJid userJid, String str) {
        Intent A08;
        C162457s7.A0J(str, 1);
        C162457s7.A0J(r9, 3);
        String A0Q = r9.A0Q(4609);
        C162457s7.A0D(A0Q);
        String str2 = null;
        List A0F = C73723fy.A0F(C175728Zm.A0P(A0Q, new String[]{","}, 0));
        String A0Q2 = r9.A0Q(4375);
        C162457s7.A0D(A0Q2);
        List A0F2 = C73723fy.A0F(C175728Zm.A0P(A0Q2, new String[]{","}, 0));
        if (A0F2.contains("*") || C73723fy.A0U(A0F2, Uri.parse(str).getHost())) {
            if (userJid != null) {
                str2 = userJid.user;
            }
            if (!C73723fy.A0U(A0F, str2)) {
                Intent A07 = C18320x8.A07();
                A07.setClassName(activity.getPackageName(), "com.whatsapp.payments.ui.CheckoutLiteWebViewActivity");
                C626936e.A06(str);
                A07.putExtra("webview_url", str);
                A07.putExtra("webview_javascript_enabled", true);
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A07.putExtra("webview_callback", (String) null);
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    A07.putExtra("webview_cancel_callback", (String) null);
                }
                A07.putExtra("webview_should_ask_before_close", false);
                A07.putExtra("webview_hide_url", false);
                A07.putExtra("webview_open_new_tab_in_external_browser", true);
                A07.putExtra("deep_link_type_support", 1);
                A07.putExtra("webview_deeplink_enabled", true);
                A07.putExtra("webview_title_show_domain_only", true);
                A07.putExtra("webview_toolbar_v2", true);
                A07.putExtra("webview_can_navigate_back", true);
                A08 = A07.putExtra("message_cta_type", "checkout_lite");
                C162457s7.A0H(A08);
                return A08;
            }
        }
        A08 = C18300x5.A08(str);
        C162457s7.A0H(A08);
        return A08;
    }
}
