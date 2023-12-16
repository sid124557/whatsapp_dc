package com.whatsapp.payments.ui;

import X.AnonymousClass1Ha;
import X.AnonymousClass3Z6;
import X.AnonymousClass4G9;
import X.AnonymousClass9Dd;
import X.C159127lA;
import X.C161447pg;
import X.C171658Hx;
import X.C18270x1;
import X.C44522Wj;
import X.C56952sp;
import X.C57062t0;
import X.C73813g7;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Map;

public final class P2mLiteWebViewActivity extends AnonymousClass9Dd {
    public C171658Hx A00;
    public C44522Wj A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;

    public void A76(int i, Intent intent) {
        C159127lA r1;
        C44522Wj r12 = this.A01;
        if (r12 != null) {
            String str = this.A03;
            AnonymousClass4G9 r3 = null;
            if (str == null) {
                throw C18270x1.A0S("fdsManagerId");
            }
            C161447pg A002 = r12.A00(str);
            if (!(A002 == null || (r1 = A002.A00) == null)) {
                r3 = (AnonymousClass4G9) r1.A00("native_p2m_lite_hpp_checkout");
            }
            AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[3];
            AnonymousClass3Z6.A04("result_code", Integer.valueOf(i), r2);
            AnonymousClass3Z6.A09("result_data", intent, r2, 1);
            AnonymousClass3Z6.A06("last_screen", "in_app_browser_checkout", r2);
            Map A0F = C73813g7.A0F(r2);
            if (r3 != null) {
                r3.B3J(A0F);
            }
            finish();
            return;
        }
        throw C18270x1.A0S("phoenixManagerRegistry");
    }

    public void navigationOnClick(View view) {
        this.A06 = true;
        onBackPressed();
    }

    public boolean A7B() {
        return C56952sp.A0J(this.A0D, 2718);
    }

    public void onBackPressed() {
        super.onBackPressed();
        int i = 1;
        if (this.A06) {
            i = 3;
        }
        C171658Hx r1 = this.A00;
        if (r1 != null) {
            r1.A01(C57062t0.A00(), Integer.valueOf(i), "in_app_browser_checkout", this.A05, this.A04, this.A02, 1, true);
            return;
        }
        throw C18270x1.A0S("p2mLiteEventLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = getIntent().getStringExtra("referral_screen");
        String A1r = AnonymousClass1Ha.A1r(this);
        if (A1r == null) {
            A1r = "";
        }
        this.A03 = A1r;
        this.A04 = getIntent().getStringExtra("order_type");
        this.A02 = getIntent().getStringExtra("config_id");
    }
}
