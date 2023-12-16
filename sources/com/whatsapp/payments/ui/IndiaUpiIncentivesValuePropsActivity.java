package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass5Yj;
import X.AnonymousClass97T;
import X.AnonymousClass9Ba;
import X.AnonymousClass9U4;
import X.C106715a2;
import X.C107695bk;
import X.C116985rC;
import X.C134246ig;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C192699Lf;
import X.C194659Tz;
import X.C194869Uu;
import X.C199279gK;
import X.C204019og;
import X.C204249p3;
import X.C204409pJ;
import X.C64333Db;
import X.C86624Kv;
import X.C86654Ky;
import X.C88834as;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class IndiaUpiIncentivesValuePropsActivity extends AnonymousClass9Ba {
    public C106715a2 A00;
    public boolean A01;

    public void A7W() {
        this.A03 = 1;
        super.A7W();
    }

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A01 = AnonymousClass97T.A0Z(r1);
            this.A00 = C116985rC.A02(new C192699Lf());
            this.A00 = C1899593h.A0V(r1);
        }
    }

    public IndiaUpiIncentivesValuePropsActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 63);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        int i;
        View.OnClickListener A002;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        A7L(R.string.f11nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved), R.id.payments_value_props_title_and_description_section);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        C194869Uu A02 = this.A0T.A02();
        if (A02 == null || (str = A02.A0F) == null || (str2 = A02.A0B) == null) {
            Log.e("PAY: IndiaUpiIncentivesValuePropsActivity/PaymentIncentiveOfferInfo is null or has null items in it");
            finish();
            return;
        }
        TextView A0L = C18310x6.A0L(this, R.id.incentives_value_props_title);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.incentives_value_props_desc);
        A0L.setText(str);
        String str3 = A02.A0C;
        if (!TextUtils.isEmpty(str3)) {
            String[] strArr = new String[1];
            AnonymousClass0x7.A1E(this.A03.A00(str3), strArr, 0);
            SpannableString A04 = this.A00.A04(textEmojiLabel.getContext(), AnonymousClass0x2.A0X(this, str2, 1, R.string.f11nameremoved), new Runnable[]{new C199279gK(this)}, new String[]{"incentive-blurb-cashback-terms"}, strArr);
            AnonymousClass0x2.A12(textEmojiLabel, this.A08);
            AnonymousClass0x2.A14(this.A0D, textEmojiLabel);
            textEmojiLabel.setText(A04);
        } else {
            textEmojiLabel.setText(str2);
        }
        View findViewById = findViewById(R.id.incentive_security_blurb_view);
        View findViewById2 = findViewById(R.id.payment_processor_logo);
        TextView A0L2 = C18310x6.A0L(this, R.id.incentives_value_props_continue);
        C194659Tz BAx = AnonymousClass9U4.A07(this.A0P).BAx();
        if (BAx == null || !BAx.A07.A0X(979)) {
            if (AnonymousClass97T.A12(this)) {
                C86624Kv.A12(findViewById, findViewById2);
                A0L2.setText(R.string.f11nameremoved);
                i = 51;
            } else {
                findViewById.setVisibility(0);
                C1899593h.A0i(this, C86654Ky.A0M(this, R.id.incentive_security_icon_view), R.color.f5nameremoved);
                findViewById2.setVisibility(0);
                A0L2.setText(R.string.f11nameremoved);
                i = 52;
            }
            A002 = C204249p3.A00(this, i);
        } else {
            A002 = new C204409pJ((Object) BAx, 11, (Object) this);
        }
        A0L2.setOnClickListener(A002);
        C134246ig A05 = this.A0S.A05(0, (Integer) null, "incentive_value_prop", this.A02);
        A05.A01 = Boolean.valueOf(AnonymousClass97T.A12(this));
        AnonymousClass97T.A0t(A05, this);
        this.A0P.A0B();
    }

    public IndiaUpiIncentivesValuePropsActivity() {
        this(0);
    }
}
