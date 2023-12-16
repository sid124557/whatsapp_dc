package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.0yn  reason: invalid class name and case insensitive filesystem */
public final class C19120yn extends WebViewClient {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C58772vn A01;

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        C162457s7.A0J(webResourceRequest, 1);
        String A0o = C18290x4.A0o(webResourceRequest.getUrl());
        Uri A012 = C624635d.A01(A0o);
        if (webResourceRequest.isForMainFrame() && ((URLUtil.isHttpsUrl(A0o) || ((scheme = A012.getScheme()) != null && AnonymousClass0x9.A1Q(Boolean.valueOf(this.A01.A03.BHO(scheme))))) && !this.A01.A03.BoK(A0o))) {
            this.A00.startActivity(new Intent("android.intent.action.VIEW", C624635d.A01(A0o)));
        }
        return true;
    }

    public C19120yn(Context context, C58772vn r2) {
        this.A01 = r2;
        this.A00 = context;
    }
}
