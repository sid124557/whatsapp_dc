package com.whatsapp.payments.ui;

import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass303;
import X.AnonymousClass3DZ;
import X.AnonymousClass4L0;
import X.AnonymousClass5Yj;
import X.AnonymousClass9QK;
import X.AnonymousClass9U4;
import X.AnonymousClass9WE;
import X.AnonymousClass9Wg;
import X.C106715a2;
import X.C107695bk;
import X.C1899593h;
import X.C1901894k;
import X.C204019og;
import X.C204749pr;
import X.C205049qL;
import X.C64333Db;
import X.C86604Kt;
import X.C89644eZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;

public class IncentiveValuePropsActivity extends C89644eZ {
    public View A00;
    public View A01;
    public Button A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public WaTextView A05;
    public C1901894k A06;
    public AnonymousClass9QK A07;
    public C106715a2 A08;
    public boolean A09;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A08 = C1899593h.A0V(r1);
            this.A07 = (AnonymousClass9QK) r1.A8p.get();
        }
    }

    public IncentiveValuePropsActivity(int i) {
        this.A09 = false;
        C204019og.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A072 = C1899593h.A07(this);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.f8nameremoved, A072, false);
        AnonymousClass5Yj.A0B(this, textView, R.attr.f3nameremoved, R.color.f5nameremoved);
        textView.setText(R.string.f11nameremoved);
        A072.addView(textView);
        setSupportActionBar(A072);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
            C86604Kt.A0z(this, A072, AnonymousClass5Yj.A01(this));
            C1899593h.A0j(this, supportActionBar, AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            supportActionBar.A0Q(false);
        }
        this.A05 = (WaTextView) findViewById(R.id.incentives_value_props_title);
        this.A03 = (TextEmojiLabel) findViewById(R.id.incentives_value_props_desc);
        this.A00 = findViewById(R.id.incentive_security_blurb_view);
        this.A01 = findViewById(R.id.payment_processor_logo);
        this.A02 = (Button) findViewById(R.id.incentives_value_props_continue);
        WaImageView waImageView = (WaImageView) findViewById(R.id.incentive_security_icon_view);
        this.A04 = waImageView;
        C1899593h.A0i(this, waImageView, R.color.f5nameremoved);
        PaymentIncentiveViewModel A0P = C1899593h.A0P(this);
        AnonymousClass08M r1 = A0P.A01;
        r1.A0G(AnonymousClass9WE.A01(A0P.A06.A00()));
        C205049qL.A02(this, r1, 21);
        C1901894k r0 = (C1901894k) AnonymousClass4L0.A0F(new C204749pr(this.A07, 2), this).A01(C1901894k.class);
        this.A06 = r0;
        C205049qL.A02(this, r0.A00, 22);
        C1901894k r4 = this.A06;
        String A0Z = C1899593h.A0Z(this);
        AnonymousClass303 A0K = C1899593h.A0K();
        A0K.A04("is_payment_account_setup", r4.A01.A0C());
        AnonymousClass9Wg.A03(A0K, AnonymousClass9U4.A06(r4.A02), "incentive_value_prop", A0Z);
    }

    public IncentiveValuePropsActivity() {
        this(0);
    }
}
