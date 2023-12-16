package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;
import com.whatsapp.support.faq.FaqItemActivity;

/* renamed from: X.0yp  reason: invalid class name and case insensitive filesystem */
public class C19140yp extends WebViewClient {
    public final /* synthetic */ FaqItemActivity A00;

    public C19140yp(FaqItemActivity faqItemActivity) {
        this.A00 = faqItemActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        AnonymousClass5Q6 r0 = this.A00.A05;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final boolean A00(Uri uri) {
        if (uri.toString().startsWith("tel:")) {
            this.A00.startActivity(new Intent("android.intent.action.DIAL", uri));
            return true;
        }
        FaqItemActivity faqItemActivity = this.A00;
        if (!AnonymousClass0x9.A1O(uri, "ombudsman")) {
            return false;
        }
        if (faqItemActivity.A0D.A0Y(C58422vE.A02, 2341)) {
            Class B5p = faqItemActivity.A04.A0G().B5p();
            if (B5p == null) {
                return true;
            }
            faqItemActivity.startActivity(AnonymousClass0x9.A08(faqItemActivity, B5p));
            return true;
        }
        C19340zH A002 = AnonymousClass5V0.A00(faqItemActivity);
        A002.A0T(R.string.f11nameremoved);
        C19340zH.A02(faqItemActivity, A002);
        A002.A0S();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A00(webResourceRequest.getUrl());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(Uri.parse(str));
    }
}
