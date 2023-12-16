package com.whatsapp.webview.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass043;
import X.AnonymousClass0O1;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Fp;
import X.AnonymousClass1Hf;
import X.AnonymousClass2BJ;
import X.AnonymousClass2MJ;
import X.AnonymousClass2P6;
import X.AnonymousClass2PM;
import X.AnonymousClass306;
import X.AnonymousClass36Y;
import X.AnonymousClass4FT;
import X.AnonymousClass4I5;
import X.AnonymousClass4K6;
import X.AnonymousClass4KP;
import X.AnonymousClass5V0;
import X.AnonymousClass5Yj;
import X.C003403v;
import X.C106905aM;
import X.C107335b8;
import X.C109405eZ;
import X.C131666dx;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C19100yl;
import X.C19340zH;
import X.C57602tu;
import X.C58342v6;
import X.C621433s;
import X.C624134x;
import X.C624635d;
import X.C626936e;
import X.C66433Lk;
import X.C70153a2;
import X.C833848e;
import X.C85244Fm;
import X.C88694ab;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

public class WaInAppBrowsingActivity extends AnonymousClass1Fp implements AnonymousClass4FT, C833848e {
    public int A00 = 1;
    public ValueCallback A01;
    public AnonymousClass043 A02;
    public C19100yl A03;
    public C85244Fm A04;
    public AnonymousClass36Y A05;
    public C66433Lk A06;
    public AnonymousClass306 A07;
    public String A08;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public final AnonymousClass0O1 A0G = Bid(new AnonymousClass4KP(this, 10), new C003403v());

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A08 = getIntent().getStringExtra("webview_callback");
        this.A0D = getIntent().getBooleanExtra("webview_open_new_tab_in_external_browser", false);
        this.A0E = getIntent().getBooleanExtra("webview_title_show_domain_only", false);
        this.A09 = getIntent().getBooleanExtra("allow_image_file_upload", false);
        this.A00 = getIntent().getIntExtra("max_images_allowed_for_upload", this.A00);
        this.A0F = getIntent().getBooleanExtra("webview_toolbar_v2", false);
        this.A0C = getIntent().getBooleanExtra("webview_should_ask_before_close", false);
        this.A0A = getIntent().getBooleanExtra("webview_can_navigate_back", false);
        this.A0B = getIntent().getBooleanExtra("webview_javascript_enabled", false);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        setSupportActionBar(A28);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
            WaImageView waImageView = (WaImageView) findViewById(R.id.icon_lock);
            TextView A0L = C18310x6.A0L(this, R.id.website_title);
            TextView A0L2 = C18310x6.A0L(this, R.id.website_url);
            if (this.A0F) {
                A28.setOverflowIcon(C107335b8.A04(this, R.drawable.vec_ic_more, R.color.f5nameremoved));
                waImageView.setVisibility(8);
                C18320x8.A14(findViewById(R.id.website_info_container), this, 23);
            }
            A79(A0L, A0L2, A28, appBarLayout, waImageView);
        }
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) findViewById(R.id.webview_wrapper_view);
        webViewWrapperView.setWebViewDelegate(this);
        C19100yl r0 = webViewWrapperView.A02;
        this.A03 = r0;
        if (r0 == null) {
            A7A(getString(R.string.f11nameremoved), true);
            return;
        }
        r0.getSettings().setJavaScriptEnabled(this.A0B);
        if (A7B()) {
            getWindow().setFlags(DefaultCrypto.BUFFER_SIZE, DefaultCrypto.BUFFER_SIZE);
        }
        A77(this.A03);
    }

    public static String A0L(Uri uri) {
        AnonymousClass2P6 r1;
        String query;
        String str;
        AnonymousClass2MJ r4 = AnonymousClass2BJ.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            r1 = new AnonymousClass2P6();
            r1.A01 = uri.getPath();
            r1.A02 = scheme;
            r1.A00 = authority;
            query = uri.getQuery();
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            query = C57602tu.A01(uri, r4);
            r1 = new AnonymousClass2P6();
            r1.A02 = scheme;
            r1.A00 = authority;
            r1.A01 = str;
        }
        String str2 = r1.A02;
        String str3 = r1.A00;
        String str4 = r1.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!TextUtils.isEmpty(str2)) {
            A0o.append(str2);
            A0o.append(':');
        }
        if (!TextUtils.isEmpty(str3)) {
            A0o.append("//");
            A0o.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            A0o.append(str4);
        }
        if (!TextUtils.isEmpty(query)) {
            A0o.append('?');
            A0o.append(query);
        }
        return A0o.toString();
    }

    public void A75() {
        if (this.A0C) {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            C19340zH.A04(this, A002, 206, R.string.f11nameremoved);
            A002.A0c(this, new AnonymousClass4K6(5), R.string.f11nameremoved);
            C18280x3.A0q(A002);
            return;
        }
        A76(0, A74());
    }

    public void A7A(String str, boolean z) {
        if (this.A02 == null && !C621433s.A03(this)) {
            C19340zH A002 = C19340zH.A00(this, str);
            A002.A0i(false);
            A002.A0Y(new AnonymousClass4I5(3, this, z), R.string.f11nameremoved);
            this.A02 = A002.A0S();
        }
    }

    public /* synthetic */ void B26(String str) {
    }

    public /* synthetic */ boolean BHO(String str) {
        return false;
    }

    public void BVg(boolean z, String str) {
        if (!z) {
            A78(this.A03, str);
        }
    }

    public boolean BbY(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.A09) {
            ValueCallback valueCallback2 = this.A01;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue((Object) null);
            }
            this.A01 = valueCallback;
            try {
                int i = this.A00;
                AnonymousClass0O1 r7 = this.A0G;
                Intent A072 = C18320x8.A07();
                A072.setClassName(getPackageName(), "com.whatsapp.gallerypicker.GalleryPicker");
                A072.putExtra("max_items", i);
                A072.putExtra("skip_max_items_new_limit", true);
                A072.putExtra("preview", true);
                A072.putExtra("origin", 37);
                A072.putExtra("send", false);
                A072.putExtra("include_media", 1);
                r7.A01(A072);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("WaInappBrowsingActivity/onShowFileChooser: Could not launch galler picker for image upload in web view", e);
                this.A01 = null;
            }
        }
        return false;
    }

    public AnonymousClass2PM Bhh() {
        C58342v6 r0 = new C58342v6();
        boolean z = this.A0D;
        AnonymousClass2PM r02 = r0.A00;
        r02.A02 = z;
        return r02;
    }

    public void onBackPressed() {
        if (!this.A0A || !this.A03.canGoBack()) {
            A75();
            return;
        }
        Bs3(getString(R.string.f11nameremoved));
        Bs4("");
        this.A03.goBack();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0F) {
            C18290x4.A1E(menu, R.id.menuitem_webview_refresh, R.string.f11nameremoved);
            C18290x4.A1E(menu, R.id.menuitem_webview_open_in_browser, R.string.f11nameremoved);
            C18290x4.A1E(menu, R.id.menuitem_webview_copy_link, R.string.f11nameremoved);
            C18290x4.A1E(menu, R.id.menuitem_webview_share_link, R.string.f11nameremoved);
            C18290x4.A1E(menu, R.id.menuitem_webview_learn_more, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final Intent A74() {
        Intent A072 = C18320x8.A07();
        String stringExtra = getIntent().getStringExtra("webview_callback");
        if (stringExtra != null) {
            A072.putExtra("webview_callback", stringExtra);
        }
        return A072;
    }

    public void A76(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    public void A77(WebView webView) {
        Bs3(getString(R.string.f11nameremoved));
        String stringExtra = getIntent().getStringExtra("webview_url");
        if (A7C(stringExtra)) {
            return;
        }
        if (AnonymousClass0x9.A1N(getIntent(), "webview_post_on_initial_request")) {
            String stringExtra2 = getIntent().getStringExtra("webview_initial_body_params");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.A03.postUrl(stringExtra, stringExtra2.getBytes());
            return;
        }
        this.A03.loadUrl(stringExtra);
    }

    public void A79(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        appBarLayout.setBackgroundColor(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        C131666dx A0J = AnonymousClass0x7.A0J(this, this.A00, R.drawable.ic_back);
        A0J.setColorFilter(getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon((Drawable) A0J);
        toolbar.setNavigationOnClickListener(new C109405eZ(this, 22));
    }

    public boolean A7B() {
        return true;
    }

    public boolean A7C(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.A08) || !str.contains(this.A08)) {
            return false;
        }
        Intent A072 = C18320x8.A07();
        A072.putExtra("webview_callback", str);
        A76(-1, A072);
        return true;
    }

    public void Bfk(String str) {
        if (TextUtils.isEmpty(str)) {
            A76(0, A74());
        } else {
            A7A(str, true);
        }
    }

    public boolean BoK(String str) {
        if (!A7C(str)) {
            if (getIntent().getBooleanExtra("webview_deeplink_enabled", false)) {
                Uri A012 = C624635d.A01(str);
                int A0B2 = this.A05.A0B(A012, (Uri) null);
                if (BHO(A012.getScheme()) || (!(A0B2 == 1 || A0B2 == 10) || ("https".equals(A012.getScheme()) && AnonymousClass0x9.A1O(A012, "angeloneapp.page.link")))) {
                    this.A04.BkW(this.A03.getContext(), A012, (C624134x) null);
                }
            }
            try {
                String url = this.A03.getUrl();
                boolean booleanExtra = getIntent().getBooleanExtra("webview_avoid_external", false);
                Resources resources = getResources();
                if (URLUtil.isHttpsUrl(str)) {
                    Uri A013 = C624635d.A01(url);
                    Uri A014 = C624635d.A01(str);
                    if (A013 == null || !booleanExtra) {
                        return false;
                    }
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SecuredWebViewUtil/checkUrl: Tried to open external link when blocked: ");
                    C18260x0.A1K(A0o, A0L(Uri.parse(str)));
                    C626936e.A0F(AnonymousClass0x9.A1O(A014, A013.getHost()), resources.getString(R.string.f11nameremoved));
                    return false;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("SecuredWebViewUtil/checkUrl: Tried to open non-HTTPS content on ");
                C18260x0.A1K(A0o2, A0L(Uri.parse(str)));
                throw AnonymousClass001.A0c(resources.getString(R.string.f11nameremoved));
            } catch (IllegalArgumentException | IllegalStateException e) {
                runOnUiThread(new C70153a2(this, 44, e));
                return true;
            }
        }
        return true;
    }

    public void Bs3(String str) {
        if (getSupportActionBar() != null) {
            String stringExtra = getIntent().getStringExtra("webview_title");
            WaTextView waTextView = (WaTextView) findViewById(R.id.website_title);
            if (!TextUtils.isEmpty(stringExtra)) {
                waTextView.setText(stringExtra);
            } else if (!TextUtils.isEmpty(str)) {
                waTextView.setText(str);
            }
            if (this.A0E) {
                AnonymousClass0x2.A0q(this, waTextView, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
                waTextView.A0A();
            }
        }
    }

    public void Bs4(String str) {
        if (getSupportActionBar() != null && str != null && !"about:blank".equals(str) && !getIntent().getBooleanExtra("webview_hide_url", false)) {
            TextView A0L = C18310x6.A0L(this, R.id.website_url);
            WaTextView waTextView = (WaTextView) findViewById(R.id.website_title);
            if (TextUtils.isEmpty(str)) {
                AnonymousClass0x2.A0q(this, waTextView, R.color.f5nameremoved);
                waTextView.A0A();
                A0L.setVisibility(8);
                A0L.setText("");
                return;
            }
            AnonymousClass0x2.A0q(this, waTextView, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
            waTextView.getContext();
            waTextView.setTypeface(C106905aM.A00());
            Uri A012 = C624635d.A01(str);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A012.getScheme());
            A0o.append("://");
            A0L.setText(AnonymousClass000.A0X(A012.getHost(), A0o));
            A0L.setVisibility(0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C19100yl r1 = this.A03;
        if (r1 != null) {
            r1.onPause();
            r1.loadUrl("about:blank");
            r1.clearHistory();
            r1.clearCache(true);
            r1.removeAllViews();
            r1.destroyDrawingCache();
            this.A03.destroy();
            this.A03 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri A032;
        Intent createChooser;
        if (menuItem.getItemId() == R.id.menuitem_webview_refresh) {
            Bs3(getString(R.string.f11nameremoved));
            Bs4("");
            this.A03.reload();
        } else {
            if (menuItem.getItemId() == R.id.menuitem_webview_open_in_browser) {
                A032 = C624635d.A01(this.A03.getUrl());
            } else if (menuItem.getItemId() == R.id.menuitem_webview_copy_link) {
                ClipboardManager A0C2 = this.A08.A0C();
                if (A0C2 != null) {
                    try {
                        A0C2.setPrimaryClip(ClipData.newPlainText("url", this.A03.getUrl()));
                        C88694ab.A00(this.A03, R.string.f11nameremoved, -1).A05();
                    } catch (NullPointerException | SecurityException e) {
                        Log.e("WaInAppBrowsingActivity/onOptionsItemSelected", e);
                    }
                }
            } else if (menuItem.getItemId() == R.id.menuitem_webview_share_link) {
                Intent A092 = AnonymousClass0x9.A09("android.intent.action.SEND");
                A092.setType("text/plain");
                A092.putExtra("android.intent.extra.TEXT", this.A03.getUrl());
                createChooser = Intent.createChooser(A092, (CharSequence) null);
                startActivity(createChooser);
            } else if (menuItem.getItemId() == R.id.menuitem_webview_learn_more) {
                A032 = this.A06.A03("182446338158487");
            }
            createChooser = new Intent("android.intent.action.VIEW", A032);
            startActivity(createChooser);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public /* synthetic */ void Bfl(int i, int i2, int i3, int i4) {
    }

    public void A78(WebView webView, String str) {
    }
}
