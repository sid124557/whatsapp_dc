package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.HashMap;

/* renamed from: X.0yi  reason: invalid class name and case insensitive filesystem */
public final class C19070yi extends WebChromeClient {
    public final C58772vn A00;

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C162457s7.A0J(consoleMessage, 0);
        return true;
    }

    public Bitmap getDefaultVideoPoster() {
        return this.A00.A00.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        return this.A00.A00.getVideoLoadingProgressView();
    }

    public void getVisitedHistory(ValueCallback valueCallback) {
        this.A00.A00.getVisitedHistory(valueCallback);
    }

    public void onCloseWindow(WebView webView) {
        this.A00.A00.onCloseWindow(webView);
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport;
        C58772vn r3 = this.A00;
        C18270x1.A12(webView, message);
        if (!z2 || !r3.A02.A02) {
            return false;
        }
        Context context = webView.getContext();
        C19100yl r2 = new C19100yl(context);
        r2.setWebViewClient(new C19120yn(context, r3));
        Object obj = message.obj;
        if (!(obj instanceof WebView.WebViewTransport) || (webViewTransport = (WebView.WebViewTransport) obj) == null) {
            return false;
        }
        webViewTransport.setWebView(r2);
        message.sendToTarget();
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.A00.A00.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.A00.A00.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onHideCustomView() {
        this.A00.A00.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.A00.A00.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequest(permissionRequest);
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.A00.A00.onPermissionRequestCanceled(permissionRequest);
    }

    public void onProgressChanged(WebView webView, int i) {
        String str;
        String str2;
        if ((webView instanceof C19100yl) && i >= 20) {
            C43032Qm r4 = ((C19100yl) webView).A07;
            if (r4.A02) {
                C19100yl r5 = r4.A03;
                if (r5.getSettings().getJavaScriptEnabled() && (str = r4.A00) != null && !r4.A01) {
                    HashMap hashMap = r4.A04;
                    boolean containsKey = hashMap.containsKey(str);
                    String str3 = r4.A00;
                    if (!containsKey) {
                        C59922xi r1 = new C59922xi(str3);
                        str2 = r1.A01;
                        hashMap.put(r4.A00, r1);
                    } else {
                        C59922xi r0 = (C59922xi) hashMap.get(str3);
                        if (r0 != null) {
                            str2 = r0.A01;
                        } else {
                            str2 = "";
                        }
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("javascript:var __fbAndroidBridgeAuthToken = '");
                    A0o.append(str2);
                    r5.A04(AnonymousClass000.A0X("';window.dispatchEvent(new Event('__fbAndroidBridgeAuthTokenInjected'));", A0o));
                    r4.A01 = true;
                }
            }
        }
        C58772vn r02 = this.A00;
        ProgressBar progressBar = r02.A01;
        if (progressBar != null) {
            int i2 = 0;
            if (!r02.A02.A01 || i == 100) {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            progressBar.setProgress(i);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.A00.A00.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        C58772vn r0 = this.A00;
        C18260x0.A0O(webView, str);
        AnonymousClass4FT r1 = r0.A03;
        r1.Bs4(webView.getUrl());
        if (!C107575bX.A0F(str) && !"about:blank".equals(str)) {
            r1.Bs3(str);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.A00.A00.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onRequestFocus(WebView webView) {
        this.A00.A00.onRequestFocus(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.A00.A00.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C58772vn r0 = this.A00;
        C18260x0.A0Q(valueCallback, fileChooserParams);
        return r0.A03.BbY(valueCallback, fileChooserParams);
    }

    public C19070yi(C58772vn r1) {
        this.A00 = r1;
    }
}
