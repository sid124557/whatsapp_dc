package com.whatsapp.payments.ui;

import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x7;
import X.AnonymousClass2AB;
import X.AnonymousClass2PM;
import X.AnonymousClass5Yj;
import X.AnonymousClass9J8;
import X.C107405bG;
import X.C131666dx;
import X.C162457s7;
import X.C175728Zm;
import X.C175738Zn;
import X.C18260x0;
import X.C18300x5;
import X.C18320x8;
import X.C56952sp;
import X.C58342v6;
import X.C73833g9;
import X.C85814Hs;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.Set;

public class PaymentWebViewActivity extends AnonymousClass9J8 {
    public int A00 = -1;
    public String A01;
    public Set A02 = C73833g9.A06("android-app", "app");

    public void A79(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C162457s7.A0J(appBarLayout, 0);
        C18260x0.A0a(toolbar, textView, textView2, 1);
        textView.setGravity(17);
        textView2.setGravity(17);
        appBarLayout.setBackgroundColor(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        C107405bG.A07(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        toolbar.setBackground(AnonymousClass0RP.A00(this, R.drawable.wds_bottom_sheet_background));
        C131666dx A0J = AnonymousClass0x7.A0J(this, this.A00, R.drawable.ic_close);
        A0J.setColorFilter(new PorterDuffColorFilter(AnonymousClass0Y8.A04(this, R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP));
        toolbar.setNavigationIcon((Drawable) A0J);
        toolbar.setNavigationOnClickListener(new C85814Hs(this, 4));
    }

    public boolean BHO(String str) {
        C162457s7.A0J(str, 0);
        int i = this.A00;
        if (i == 0) {
            return this.A02.contains(str);
        }
        if (i == 1) {
            for (String A002 : AnonymousClass0x7.A1b(AnonymousClass2AB.A02(C56952sp.A08(this.A0D, 4642), ","))) {
                if (str.equals(AnonymousClass2AB.A00(A002))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A75() {
        super.A75();
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        WebStorage.getInstance().deleteAllData();
    }

    public boolean A7C(String str) {
        String str2;
        String str3;
        boolean A7C = super.A7C(str);
        if (A7C || str == null || !(!C175738Zn.A0V(str)) || (str2 = this.A01) == null || !(!C175738Zn.A0V(str2)) || (str3 = this.A01) == null || !C175728Zm.A0S(str, str3, false)) {
            return A7C;
        }
        Intent A07 = C18320x8.A07();
        A07.putExtra("webview_callback", str);
        A76(0, A07);
        return true;
    }

    public AnonymousClass2PM Bhh() {
        AnonymousClass2PM r1 = new C58342v6(super.Bhh()).A00;
        r1.A00 = 1;
        return r1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = getIntent().getStringExtra("webview_cancel_callback");
        this.A00 = getIntent().getIntExtra("deep_link_type_support", -1);
    }

    public void navigationOnClick(View view) {
        A75();
    }
}
