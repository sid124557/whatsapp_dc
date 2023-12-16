package X;

import android.os.Bundle;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment;
import java.util.HashMap;

/* renamed from: X.2w9  reason: invalid class name and case insensitive filesystem */
public final class C58992w9 {
    public FcsWebViewFragment A00(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap, int i, boolean z) {
        C162457s7.A0J(str, 0);
        C18260x0.A0X(str7, str8, str9);
        FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = new FcsExtensionsWebViewFragment();
        Bundle A0F = AnonymousClass0x7.A0F("url", str);
        A0F.putString("success_url", str2);
        A0F.putString("failure_url", str3);
        A0F.putString("post_data", str4);
        A0F.putBoolean("use_post_request", z);
        A0F.putString("fds_observer_id", str5);
        A0F.putString("fds_manager_id", str6);
        A0F.putInt("callback_index", i);
        A0F.putString("current_screen", str7);
        A0F.putString("next_action", str8);
        A0F.putString("next_screen", str9);
        A0F.putString("error_message", str10);
        A0F.putSerializable("callback_url_payload", hashMap);
        fcsExtensionsWebViewFragment.A0u(A0F);
        return fcsExtensionsWebViewFragment;
    }
}
