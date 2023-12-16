package com.whatsapp.inappsupport.ui;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5Q6;
import X.C005205m;
import X.C107695bk;
import X.C18260x0;
import X.C18300x5;
import X.C19110ym;
import X.C58152un;
import X.C635439q;
import X.C64333Db;
import X.C85914Ic;
import X.C89644eZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.Objects;

public class FaqItemActivityV2 extends C89644eZ {
    public AnonymousClass5Q6 A00;
    public String A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public FaqItemActivityV2(int i) {
        this.A02 = false;
        AnonymousClass4HY.A00(this, 69);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass5Q6 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getString(R.string.f11nameremoved);
        setTitle(string);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.toolbar);
        C18260x0.A0E(this, getResources(), toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) string);
        toolbar.setNavigationOnClickListener(new C635439q((Object) this, 37));
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) findViewById(R.id.faq_item_web_view);
        Objects.requireNonNull(stringExtra);
        webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", C58152un.A0B, (String) null);
        View findViewById = findViewById(R.id.not_helpful_button_container);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new C85914Ic(findViewById, 0, this));
        this.A00 = new AnonymousClass5Q6(webView, findViewById, AnonymousClass1Ha.A1i(this));
        webView.setWebViewClient(new C19110ym(this));
        C635439q.A00(this.A00.A01, this, 38);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url"))) {
            return super.onCreateOptionsMenu(menu);
        }
        this.A01 = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        menu.add(0, R.id.menuitem_open_in_browser, 0, getString(R.string.f11nameremoved)).setShowAsAction(0);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.menuitem_open_in_browser) {
            return false;
        } else {
            String str = this.A01;
            Objects.requireNonNull(str);
            startActivity(C18300x5.A08(str));
            return true;
        }
    }

    public FaqItemActivityV2() {
        this(0);
    }
}
