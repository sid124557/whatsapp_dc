package X;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

/* renamed from: X.2s1  reason: invalid class name and case insensitive filesystem */
public abstract class C56462s1 {
    public final WebViewClient A00 = new WebViewClient();

    public abstract void A00(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    @Deprecated
    public void A05(WebView webView, String str, String str2) {
        AnonymousClass15O r3 = (AnonymousClass15O) this;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaSecureWebViewClient/onReceivedError: Error loading the page ");
        A0o.append(C57602tu.A00(C624635d.A01(str2)));
        C18260x0.A0r(": ", str, A0o);
        if (str2 == null || str2.equals(r3.A01)) {
            if (r3.A00 == null) {
                View inflate = r3.A02.inflate();
                r3.A00 = inflate;
                C06560Yg.A02(inflate, R.id.webview_error_action).setOnClickListener(new C109495ei(r3, 35, webView));
            }
            AnonymousClass0x2.A0x(r3.A00);
        }
    }

    public void A01(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A00.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void A02(WebView webView, String str) {
        this.A00.onPageCommitVisible(webView, str);
    }

    public void A03(WebView webView, String str) {
        this.A00.onPageFinished(webView, str);
    }

    public void A04(WebView webView, String str, Bitmap bitmap) {
        this.A00.onPageStarted(webView, str, bitmap);
    }

    public void A06(WebView webView, String str, boolean z) {
        this.A00.doUpdateVisitedHistory(webView, str, z);
    }

    public boolean A07(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A00.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
