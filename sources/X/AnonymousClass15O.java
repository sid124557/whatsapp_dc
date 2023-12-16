package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.15O  reason: invalid class name */
public final class AnonymousClass15O extends C56462s1 {
    public View A00;
    public String A01;
    public final ViewStub A02;
    public final C69263Wi A03;
    public final AnonymousClass4FT A04;

    public AnonymousClass15O(ViewStub viewStub, C69263Wi r3, AnonymousClass4FT r4) {
        C162457s7.A0J(viewStub, 3);
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = viewStub;
    }

    public void A00(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        Uri url;
        CharSequence description;
        if (webResourceError != null) {
            webResourceError.getErrorCode();
        }
        String str2 = null;
        if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
            str = null;
        } else {
            str = description.toString();
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            str2 = url.toString();
        }
        A05(webView, str, str2);
    }

    public void A06(WebView webView, String str, boolean z) {
        this.A04.B26(str);
        super.A06(webView, str, z);
    }

    public void A03(WebView webView, String str) {
        String str2;
        String title;
        super.A03(webView, str);
        AnonymousClass4FT r2 = this.A04;
        r2.BVg(false, str);
        r2.Bs4(str);
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!"about:blank".equals(str2) && webView != null && (title = webView.getTitle()) != null) {
            r2.Bs3(title);
        }
    }

    public void A04(WebView webView, String str, Bitmap bitmap) {
        super.A04(webView, str, bitmap);
        C18270x1.A0p(this.A00);
        this.A01 = str;
        this.A04.BVg(true, str);
    }
}
