package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0O1;
import X.AnonymousClass0R8;
import X.AnonymousClass0RP;
import X.AnonymousClass0XL;
import X.AnonymousClass0Y8;
import X.AnonymousClass303;
import X.AnonymousClass5V0;
import X.AnonymousClass6C9;
import X.AnonymousClass8YT;
import X.AnonymousClass93C;
import X.AnonymousClass97e;
import X.C003403v;
import X.C107335b8;
import X.C134246ig;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C1897492m;
import X.C19340zH;
import X.C203499no;
import X.C71323bv;
import X.C86604Kt;
import X.C86614Ku;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.BrazilPixKeySettingViewModel;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.Locale;

public final class BrazilPixKeySettingActivity extends AnonymousClass97e {
    public int A00;
    public AnonymousClass0O1 A01;
    public C203499no A02;
    public BrazilPixKeySettingViewModel A03;
    public PaymentMethodRow A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final void A74() {
        A75((Integer) null, "remove_custom_payment_method_prompt", "custom_payment_method_settings", 0);
        C19340zH A012 = AnonymousClass5V0.A01(this, R.style.f12nameremoved);
        A012.A0U(R.string.f11nameremoved);
        A012.A0T(R.string.f11nameremoved);
        String A0l = C18290x4.A0l(this, R.string.f11nameremoved);
        Locale locale = Locale.ROOT;
        String upperCase = A0l.toUpperCase(locale);
        C162457s7.A0D(upperCase);
        A012.A0f(this, new C1897492m(this, 301), upperCase);
        String upperCase2 = C18290x4.A0l(this, R.string.f11nameremoved).toUpperCase(locale);
        C162457s7.A0D(upperCase2);
        A012.A0e(this, new C1897492m(this, 302), upperCase2);
        C18280x3.A0q(A012);
    }

    public final void A75(Integer num, String str, String str2, int i) {
        C203499no r0 = this.A02;
        if (r0 != null) {
            C134246ig B0d = r0.B0d();
            B0d.A08 = Integer.valueOf(i);
            B0d.A07 = num;
            B0d.A0b = str;
            B0d.A0Y = str2;
            B0d.A0a = this.A08;
            AnonymousClass303 A0W = AnonymousClass6C9.A0W();
            A0W.A03("payment_method", "pix");
            B0d.A0Z = A0W.toString();
            C203499no r02 = this.A02;
            if (r02 != null) {
                r02.BKA(B0d);
                return;
            }
            throw C18270x1.A0S("paymentFieldStatsLogger");
        }
        throw C18270x1.A0S("paymentFieldStatsLogger");
    }

    public final boolean A76() {
        String str;
        String str2;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = this.A03;
        if (brazilPixKeySettingViewModel == null) {
            throw C18270x1.A0S("brazilPixKeySettingViewModel");
        } else if (!brazilPixKeySettingViewModel.A02.A0D().A02.A0X(5861) || 1 != this.A00 || (str = this.A07) == null || str.length() == 0 || (str2 = this.A06) == null || str2.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        String string;
        String str;
        int i;
        String str2;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setSupportActionBar((Toolbar) findViewById(R.id.pay_service_toolbar));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
            int A042 = AnonymousClass0Y8.A04(this, R.color.f5nameremoved);
            Drawable A002 = AnonymousClass0RP.A00(this, R.drawable.ic_close);
            if (A002 != null) {
                supportActionBar.A0E(C107335b8.A0B(A002, A042));
            }
        }
        PaymentMethodRow paymentMethodRow = (PaymentMethodRow) C18290x4.A0N(this, R.id.payment_method_row);
        this.A04 = paymentMethodRow;
        String str3 = null;
        if (paymentMethodRow == null) {
            throw C18270x1.A0S("paymentMethodRow");
        }
        paymentMethodRow.A04(R.drawable.pix_logo_blue_background);
        PaymentMethodRow paymentMethodRow2 = this.A04;
        if (paymentMethodRow2 == null) {
            throw C18270x1.A0S("paymentMethodRow");
        }
        paymentMethodRow2.A06((String) null);
        PaymentMethodRow paymentMethodRow3 = this.A04;
        if (paymentMethodRow3 == null) {
            throw C18270x1.A0S("paymentMethodRow");
        }
        paymentMethodRow3.A09(true);
        Bundle A0D = C86614Ku.A0D(this);
        if (A0D == null || (string = A0D.getString("credential_id")) == null) {
            throw AnonymousClass001.A0c("Missing credential_id on intent extra param!");
        }
        this.A05 = string;
        Bundle A0D2 = C86614Ku.A0D(this);
        if (A0D2 != null) {
            str = A0D2.getString("extra_provider");
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle A0D3 = C86614Ku.A0D(this);
        if (A0D3 != null) {
            str3 = A0D3.getString("extra_provider_type");
        }
        this.A07 = str3;
        Bundle A0D4 = C86614Ku.A0D(this);
        if (A0D4 != null) {
            i = A0D4.getInt("extra_onboarding_provider");
        } else {
            i = 0;
        }
        this.A00 = i;
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel = (BrazilPixKeySettingViewModel) new AnonymousClass0XL(this).A01(BrazilPixKeySettingViewModel.class);
        this.A03 = brazilPixKeySettingViewModel;
        if (brazilPixKeySettingViewModel == null) {
            throw C18270x1.A0S("brazilPixKeySettingViewModel");
        }
        C86604Kt.A1N(this, brazilPixKeySettingViewModel.A00, new AnonymousClass8YT(this), 300);
        BrazilPixKeySettingViewModel brazilPixKeySettingViewModel2 = this.A03;
        if (brazilPixKeySettingViewModel2 == null) {
            throw C18270x1.A0S("brazilPixKeySettingViewModel");
        }
        String str4 = this.A05;
        if (str4 == null) {
            throw C18270x1.A0S("credentialId");
        }
        brazilPixKeySettingViewModel2.A06.BkM(new C71323bv(47, str4, brazilPixKeySettingViewModel2));
        this.A01 = Bid(new AnonymousClass93C(this, 6), new C003403v());
        Bundle A0D5 = C86614Ku.A0D(this);
        if (A0D5 != null) {
            str2 = A0D5.getString("referral_screen");
        } else {
            str2 = null;
        }
        this.A08 = str2;
        A75((Integer) null, "custom_payment_method_settings", "orders_home", 0);
    }
}
