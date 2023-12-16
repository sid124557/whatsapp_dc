package com.whatsapp.accountlinking.webauthutil;

import X.AnonymousClass002;
import X.AnonymousClass1M0;
import X.AnonymousClass2JJ;
import X.AnonymousClass49I;
import X.AnonymousClass4GJ;
import X.AnonymousClass4HY;
import X.AnonymousClass5VY;
import X.AnonymousClass8DJ;
import X.C009707r;
import X.C116865qz;
import X.C131266dJ;
import X.C152057Xj;
import X.C157157hp;
import X.C162457s7;
import X.C17190ui;
import X.C18270x1;
import X.C18320x8;
import X.C34261un;
import X.C55742qq;
import X.C626936e;
import X.C835248t;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

public final class FxWebAuthLauncherActivity extends C009707r implements AnonymousClass4GJ {
    public AnonymousClass49I A00;
    public C55742qq A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final Object A05;
    public volatile C116865qz A06;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("activityLaunched", this.A03);
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C116865qz(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public FxWebAuthLauncherActivity(int i) {
        this.A05 = AnonymousClass002.A0D();
        this.A04 = false;
        AnonymousClass4HY.A00(this, 10);
    }

    public C17190ui B6u() {
        return AnonymousClass5VY.A00(this, super.B6u());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        Uri uri;
        String str2;
        super.onActivityResult(i, i2, intent);
        if (i == 2884) {
            C835248t r5 = null;
            if (intent != null) {
                str = intent.getStringExtra("webview_callback");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            Object obj = this.A02;
            AnonymousClass49I r0 = this.A00;
            if (r0 != null) {
                r5 = r0.B3r();
            }
            C131266dJ A032 = AnonymousClass8DJ.A03(obj);
            C152057Xj r2 = new C152057Xj();
            if (i2 != -1 || uri == null) {
                str2 = null;
            } else {
                str2 = uri.toString();
            }
            r2.A05(str2, 0);
            C157157hp.A00(A032, r2.A03(), r5);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.A03 = bundle.getBoolean("activityLaunched");
        }
        C55742qq r2 = this.A01;
        if (r2 != null) {
            this.A02 = r2.A01(new C34261un("environment"), "webAuth");
            C55742qq r22 = this.A01;
            if (r22 != null) {
                AnonymousClass49I r1 = (AnonymousClass49I) r22.A01(new C34261un("callback"), "webAuth");
                this.A00 = r1;
                if (this.A03 || this.A02 == null || r1 == null) {
                    finish();
                    return;
                }
                this.A03 = true;
                AnonymousClass2JJ r4 = new AnonymousClass2JJ();
                r4.A01 = getIntent().getStringExtra("initialUrl");
                r4.A00 = getIntent().getStringExtra("callbackUrlScheme");
                C162457s7.A0F(AnonymousClass1M0.A01);
                Intent className = C18320x8.A07().setClassName(getPackageName(), "com.whatsapp.accountlinking.FxWaInAppBrowserActivity");
                C162457s7.A0D(className);
                String str = r4.A01;
                C626936e.A06(str);
                className.putExtra("webview_url", str);
                className.putExtra("webview_callback", r4.A00);
                className.putExtra("webview_avoid_external", true);
                className.putExtra("webview_hide_url", true);
                className.putExtra("webview_javascript_enabled", true);
                startActivityForResult(className, 2884);
                return;
            }
            throw C18270x1.A0S("bkCache");
        }
        throw C18270x1.A0S("bkCache");
    }

    public void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            C55742qq r2 = this.A01;
            if (r2 != null) {
                r2.A04(new C34261un("environment"), "webAuth");
                C55742qq r22 = this.A01;
                if (r22 != null) {
                    r22.A04(new C34261un("callback"), "webAuth");
                    return;
                }
                throw C18270x1.A0S("bkCache");
            }
            throw C18270x1.A0S("bkCache");
        }
    }

    public FxWebAuthLauncherActivity() {
        this(0);
    }
}
