package com.whatsapp.webview.ui;

import X.AnonymousClass15N;
import X.AnonymousClass15O;
import X.AnonymousClass28D;
import X.AnonymousClass2PM;
import X.AnonymousClass4FT;
import X.AnonymousClass4GJ;
import X.C06560Yg;
import X.C111685iW;
import X.C116855qy;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18540xr;
import X.C18570xu;
import X.C19100yl;
import X.C54292oU;
import X.C58772vn;
import X.C64333Db;
import X.C69263Wi;
import X.C88864av;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class WebViewWrapperView extends FrameLayout implements AnonymousClass4GJ {
    public ViewStub A00;
    public ProgressBar A01;
    public C19100yl A02;
    public C69263Wi A03;
    public C54292oU A04;
    public AnonymousClass2PM A05;
    public C116855qy A06;
    public boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass15N r2;
        C162457s7.A0J(context, 1);
        if (!this.A07) {
            this.A07 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A04 = C64333Db.A2q(r1);
            this.A03 = C64333Db.A04(r1);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, false);
        C162457s7.A0K(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        addView(inflate);
        View rootView = getRootView();
        C162457s7.A0D(rootView);
        Resources resources = rootView.getResources();
        C162457s7.A0D(resources);
        try {
            r2 = new AnonymousClass15N(new C18540xr(C18290x4.A0F(rootView), A00(resources)), this);
            r2.setId(R.id.main_webview);
            r2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((ViewGroup) C06560Yg.A02(rootView, R.id.webview_container)).addView(r2, 0);
        } catch (Exception e) {
            Log.e("WebViewWrapperView/createAndInsertWebView() can't create webview", e);
            r2 = null;
        }
        this.A02 = r2;
        this.A01 = (ProgressBar) C06560Yg.A02(inflate, R.id.progress_bar_page_progress);
        this.A00 = (ViewStub) C18280x3.A0E(inflate, R.id.webview_error_container_stub);
    }

    public final void setGlobalUI(C69263Wi r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContext(C54292oU r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWebViewDelegate(AnonymousClass4FT r7) {
        AnonymousClass15N r0;
        C162457s7.A0J(r7, 0);
        C19100yl r4 = this.A02;
        if (r4 != null) {
            AnonymousClass2PM Bhh = r7.Bhh();
            this.A05 = Bhh;
            if (Build.VERSION.SDK_INT >= 27) {
                WebView.startSafeBrowsing(getWaContext().A00, new AnonymousClass28D(2));
            }
            r4.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            r4.getSettings().setGeolocationEnabled(false);
            r4.getSettings().setSupportMultipleWindows(false);
            r4.getSettings().setSaveFormData(false);
            r4.clearCache(true);
            CookieManager.getInstance().setAcceptCookie(false);
            r4.A02(new AnonymousClass15O(this.A00, getGlobalUI(), r7));
            r4.A03(new C58772vn(this.A01, Bhh, r7));
            if ((r4 instanceof AnonymousClass15N) && (r0 = (AnonymousClass15N) r4) != null) {
                r0.A00 = r7;
            }
            if (Bhh.A02) {
                r4.getSettings().setSupportMultipleWindows(true);
            }
            if (Bhh.A00 == 1) {
                CookieManager instance = CookieManager.getInstance();
                instance.removeAllCookies((ValueCallback) null);
                WebStorage.getInstance().deleteAllData();
                r4.getSettings().setDomStorageEnabled(true);
                instance.setAcceptCookie(true);
            }
        }
    }

    public final Resources A00(Resources resources) {
        if (!(resources instanceof C18570xu)) {
            return resources;
        }
        Resources resources2 = ((C18570xu) resources).A00;
        C162457s7.A0D(resources2);
        return A00(resources2);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public final C69263Wi getGlobalUI() {
        C69263Wi r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final C54292oU getWaContext() {
        C54292oU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waContext");
    }

    public void onDetachedFromWindow() {
        AnonymousClass2PM r0 = this.A05;
        boolean z = false;
        if (r0 != null && 1 == r0.A00) {
            z = true;
        }
        if (z) {
            CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            WebStorage.getInstance().deleteAllData();
        }
        C19100yl r1 = this.A02;
        if (r1 != null) {
            r1.onPause();
            r1.loadUrl("about:blank");
            r1.clearHistory();
            r1.clearCache(true);
            r1.removeAllViews();
            r1.destroyDrawingCache();
        }
        C19100yl r02 = this.A02;
        if (r02 != null) {
            r02.destroy();
        }
        this.A02 = null;
        super.onDetachedFromWindow();
    }

    public final C19100yl getWebView() {
        return this.A02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewWrapperView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
