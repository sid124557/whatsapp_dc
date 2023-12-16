package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.0yo  reason: invalid class name and case insensitive filesystem */
public class C19130yo extends WebViewClient {
    public final /* synthetic */ C111095hX A00;
    public final /* synthetic */ C34231uR A01;

    public C19130yo(C111095hX r1, C34231uR r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C34231uR r3 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("webview_error_");
        r3.A0g("WebViewClient error", true, AnonymousClass000.A0h(A0o, webResourceError.getErrorCode()));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("y://error")) {
            this.A01.A0g("iFrame api script error", true, "iframe_api_script_error");
        }
        if (str.startsWith("https://")) {
            C18310x6.A0y(webView.getContext(), this.A00, str);
        }
        return true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A0g("WebViewClient error", true, AnonymousClass000.A0Y("webview_error_", AnonymousClass001.A0o(), i));
    }
}
