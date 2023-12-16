package com.whatsapp.support.faq;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass2BI;
import X.AnonymousClass4HY;
import X.AnonymousClass5Q6;
import X.AnonymousClass9U4;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C19010yc;
import X.C19140yp;
import X.C50102hd;
import X.C58152un;
import X.C66663Mh;
import X.C71373c0;
import X.C88834as;
import X.C89644eZ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.R;

public class FaqItemActivity extends C89644eZ {
    public long A00;
    public long A01;
    public long A02;
    public C50102hd A03;
    public AnonymousClass9U4 A04;
    public AnonymousClass5Q6 A05;
    public boolean A06;
    public final WebViewClient A07;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            ((C88834as) AnonymousClass0x9.A0K(this)).ADq(this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Ha.A1l(this, R.string.f11nameremoved).A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        getSupportActionBar().A0J(getIntent().getStringExtra("title"));
        String stringExtra = getIntent().getStringExtra("content");
        String stringExtra2 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.setWebViewClient(this.A07);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", C58152un.A0B, (String) null);
        this.A00 = getIntent().getLongExtra("article_id", -1);
        this.A02 = 0;
        String stringExtra3 = getIntent().getStringExtra("contact_us_context");
        if (!getIntent().getBooleanExtra("show_contact_support_button", false)) {
            return;
        }
        if (!AnonymousClass2BI.A00(stringExtra3) || !this.A06.A08(C66663Mh.A0d)) {
            String stringExtra4 = getIntent().getStringExtra("contact_us_context");
            View findViewById = findViewById(R.id.bottom_button_container);
            C71373c0 r2 = new C71373c0(13, stringExtra4, this);
            AnonymousClass5Q6 r10 = new AnonymousClass5Q6(webView, findViewById, AnonymousClass1Ha.A1i(this));
            this.A05 = r10;
            r10.A01(this, new C19010yc(this, r2), C18310x6.A0L(this, R.id.does_not_match_button), getString(R.string.f11nameremoved), R.style.f12nameremoved);
            C18280x3.A0o(this.A05.A01, r2, 23);
            findViewById.setVisibility(0);
        }
    }

    public FaqItemActivity(int i) {
        this.A06 = false;
        AnonymousClass4HY.A00(this, 123);
    }

    public void onBackPressed() {
        long currentTimeMillis = this.A02 + (System.currentTimeMillis() - this.A01);
        this.A02 = currentTimeMillis;
        this.A01 = System.currentTimeMillis();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("faq-item/back-pressed has been called with ");
        A0o.append(C18290x4.A0B(currentTimeMillis));
        C18260x0.A1J(A0o, " seconds.");
        setResult(-1, C18320x8.A07().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A02));
        super.onBackPressed();
        overridePendingTransition(R.anim.f0nameremoved, R.anim.f0nameremoved);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass5Q6 r0 = this.A05;
        if (r0 != null) {
            r0.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        overridePendingTransition(R.anim.f0nameremoved, R.anim.f0nameremoved);
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A02 += System.currentTimeMillis() - this.A01;
        this.A01 = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.A01 = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        long currentTimeMillis = this.A02 + (System.currentTimeMillis() - this.A01);
        this.A02 = currentTimeMillis;
        this.A01 = System.currentTimeMillis();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("faq-item/stop has been called with ");
        A0o.append(C18290x4.A0B(currentTimeMillis));
        C18260x0.A1J(A0o, " seconds.");
        setResult(-1, C18320x8.A07().putExtra("article_id", this.A00).putExtra("total_time_spent", this.A02));
    }

    public FaqItemActivity() {
        this(0);
        this.A07 = new C19140yp(this);
    }
}
