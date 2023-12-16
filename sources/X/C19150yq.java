package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

/* renamed from: X.0yq  reason: invalid class name and case insensitive filesystem */
public final class C19150yq extends WebViewClient {
    public boolean A00 = false;
    public final C56462s1 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (java.lang.Boolean.valueOf(r3) != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.webkit.WebView r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C19100yl
            r6 = 0
            if (r0 == 0) goto L_0x004b
            X.0yl r8 = (X.C19100yl) r8
            r0 = 1
            r7.A00 = r0
            X.2gN r0 = r8.A01
            if (r10 == 0) goto L_0x0050
            r8.getContext()
            X.20C r1 = r0.A01(r9)
        L_0x0015:
            X.20C r0 = X.AnonymousClass20C.NAVIGATE
            boolean r5 = X.C18300x5.A1W(r1, r0)
            X.2s1 r4 = r7.A01
            boolean r0 = r4 instanceof X.AnonymousClass15O
            if (r0 == 0) goto L_0x004e
            X.15O r4 = (X.AnonymousClass15O) r4
            if (r9 == 0) goto L_0x004c
            X.4FT r0 = r4.A04
            boolean r3 = r0.BoK(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x004c
        L_0x0031:
            android.content.Context r2 = r8.getContext()
            if (r3 != 0) goto L_0x0040
            if (r2 == 0) goto L_0x0040
            X.3Wi r1 = r4.A03
            r0 = 43
            X.C69263Wi.A06(r1, r4, r2, r0)
        L_0x0040:
            if (r5 != 0) goto L_0x0044
            if (r3 == 0) goto L_0x004b
        L_0x0044:
            r7.A00 = r6
            if (r5 != 0) goto L_0x004a
            if (r3 == 0) goto L_0x004b
        L_0x004a:
            r6 = 1
        L_0x004b:
            return r6
        L_0x004c:
            r3 = 0
            goto L_0x0031
        L_0x004e:
            r3 = 0
            goto L_0x0040
        L_0x0050:
            X.20C r1 = r0.A00(r9)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19150yq.A00(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.A01.A06(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.A01.A00.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.A01.A00.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.A01.A02(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.A01.A03(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C19100yl) {
            C19100yl r3 = (C19100yl) webView;
            C43032Qm r1 = r3.A07;
            if (r1.A02 && r1.A03.getSettings().getJavaScriptEnabled()) {
                r1.A01 = false;
                r1.A00 = C59922xi.A00(str);
            }
            if (this.A00) {
                this.A00 = false;
            }
            this.A01.A04(r3, str, bitmap);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.A01.A00.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A00(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.A01.A00.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.A01(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.A01.A00.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        Integer num;
        Context context;
        AnonymousClass15O r2 = (AnonymousClass15O) this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaSecureWebViewClient/onReceivedSslError: SSL Error while loading the page: ");
        String str2 = null;
        if (sslError != null) {
            str = sslError.getUrl();
        } else {
            str = null;
        }
        A0o.append(C57602tu.A00(C624635d.A01(str)));
        A0o.append(": Code ");
        if (sslError != null) {
            num = Integer.valueOf(sslError.getPrimaryError());
        } else {
            num = null;
        }
        C18260x0.A0n(num, A0o);
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        if (webView != null) {
            webView.stopLoading();
        }
        AnonymousClass4FT r22 = r2.A04;
        if (!(webView == null || (context = webView.getContext()) == null)) {
            str2 = context.getString(R.string.f11nameremoved);
        }
        r22.Bfk(str2);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.A07(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        String str;
        Context context;
        AnonymousClass15O r2 = (AnonymousClass15O) this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaSecureWebViewClient/onSafeBrowsingHit: Unsafe page hit: ");
        String str2 = null;
        if (webView != null) {
            str = webView.getUrl();
        } else {
            str = null;
        }
        C18260x0.A1K(A0o, C57602tu.A00(C624635d.A01(str)));
        AnonymousClass4FT r22 = r2.A04;
        if (!(webView == null || (context = webView.getContext()) == null)) {
            str2 = context.getString(R.string.f11nameremoved);
        }
        r22.Bfk(str2);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.A01.A00.onScaleChanged(webView, f, f2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.A01.A00.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        C56462s1 r1 = this.A01;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            str = null;
        } else {
            str = url.toString();
        }
        if (URLUtil.isHttpsUrl(str)) {
            return r1.A00.shouldInterceptRequest(webView, webResourceRequest);
        }
        C18260x0.A0r("WaSecureWebViewClient/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ", str, AnonymousClass001.A0o());
        return new WebResourceResponse("application/octet-stream", C58152un.A0B, AnonymousClass0x9.A0d(AnonymousClass0x2.A1a("")));
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.A01.A00.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public C19150yq(C56462s1 r2) {
        this.A01 = r2;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webView, webResourceRequest.getUrl().toString(), AnonymousClass000.A1S(webResourceRequest.isForMainFrame() ? 1 : 0));
    }

    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A05(webView, str, str2);
    }

    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(webView, str, true);
    }
}
