package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0yl  reason: invalid class name and case insensitive filesystem */
public class C19100yl extends WebView {
    public C834948q A00;
    public C49342gN A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C43032Qm A07 = new C43032Qm(this);

    public static void A00(WebSettings webSettings) {
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A01(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public void loadUrl(String str) {
        loadUrl(str, (Map) null);
    }

    public final void setCookieStringsSecure(String str, AnonymousClass2UQ r3, Collection collection) {
        setCookieStrings(str, r3, collection, (ValueCallback) null);
    }

    public final void A02(C56462s1 r5) {
        C834948q r3;
        if (this.A05 && (r3 = this.A00) != null) {
            r3.Bja("webview.SecureWebView", "WebViewClient has been set already", (Throwable) null);
        }
        this.A05 = true;
        super.setWebViewClient(new C19150yq(r5));
    }

    public final void A03(C58772vn r5) {
        C834948q r3;
        if (this.A04 && (r3 = this.A00) != null) {
            r3.Bja("webview.SecureWebView", "WebChromeClient has been set already", (Throwable) null);
        }
        this.A04 = true;
        super.setWebChromeClient(new C19070yi(r5));
    }

    public final boolean A05(String str) {
        C59922xi r0;
        C43032Qm r3 = this.A07;
        String url = getUrl();
        if (!r3.A02) {
            return true;
        }
        String A002 = C59922xi.A00(url);
        HashMap hashMap = r3.A04;
        if (!hashMap.containsKey(A002) || (r0 = (C59922xi) hashMap.get(A002)) == null) {
            return false;
        }
        return str.equals(r0.A01);
    }

    public final void setCookieStrings(String str, AnonymousClass2UQ r7, Collection collection, ValueCallback valueCallback) {
        if (collection != null) {
            try {
                if (!r7.A00(C624635d.A01(str))) {
                    C162477s9.A0E(this.A02, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", str);
                    return;
                }
                try {
                    CookieManager instance = CookieManager.getInstance();
                    instance.flush();
                    instance.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        if (valueCallback != null) {
                            instance.setCookie(str, A0m, valueCallback);
                        } else {
                            instance.setCookie(str, A0m);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                C162477s9.A0C(this.A02, "Parse url run triggers the exception on url: \n%s\n", e, str);
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection collection) {
        setCookieStrings(str, AnonymousClass2AY.A00, collection, (ValueCallback) null);
    }

    public final void setReporter(C834948q r1) {
        this.A00 = r1;
    }

    public C19100yl(Context context) {
        super(context);
        C48332ej r4 = new C48332ej();
        List list = r4.A00;
        C50722if r2 = new C50722if();
        r2.A02("http", "https");
        list.add(r2.A00());
        this.A01 = r4.A00();
        this.A02 = "SecureWebView";
        this.A06 = context;
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        A00(settings);
        A01(settings);
        AnonymousClass3Av r1 = new AnonymousClass3Av();
        this.A03 = AnonymousClass001.A0s();
        this.A00 = r1;
        this.A05 = false;
        this.A04 = false;
    }

    public final C43032Qm getSecureJsBridgeAuth() {
        return this.A07;
    }

    public AnonymousClass2CF getSecureSettings() {
        return new AnonymousClass2CF(getSettings());
    }

    public final C49342gN getUriHandler() {
        return this.A01;
    }

    public void A04(String str) {
        super.loadUrl(str);
    }

    public void loadUrl(String str, Map map) {
        C49342gN r0 = this.A01;
        getContext();
        if (r0.A01(str).ordinal() == 0) {
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                getContext();
                throw AnonymousClass001.A0g("execute");
            }
            super.loadUrl(str, map);
        }
    }
}
