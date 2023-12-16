package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0VX;
import X.AnonymousClass5Yj;
import X.AnonymousClass97T;
import X.AnonymousClass9Ba;
import X.C001702c;
import X.C107695bk;
import X.C116985rC;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C192699Lf;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C86654Ky;
import X.C88834as;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiPaymentsValuePropsActivity extends AnonymousClass9Ba {
    public TextSwitcher A00;
    public boolean A01;

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
        }
    }

    public IndiaUpiPaymentsValuePropsActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 80);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C001702c r2 = (C001702c) this.A00.getLayoutParams();
        r2.A0Y = (int) getResources().getDimension(R.dimen.f6nameremoved);
        this.A00.setLayoutParams(r2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        A7L(R.string.f11nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved), R.id.payments_value_props_title_and_description_section);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
        }
        TextView A0L = C18310x6.A0L(this, R.id.payments_value_props_title);
        C86654Ky.A0M(this, R.id.payments_value_props_image_section).setImageDrawable(AnonymousClass0VX.A01(this, R.drawable.vec_ic_payments_vector_value_props));
        boolean A0X = this.A0D.A0X(1568);
        int i = R.string.f11nameremoved;
        if (A0X) {
            i = R.string.f11nameremoved;
        }
        A0L.setText(i);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.payments_value_props_desc);
        this.A00 = textSwitcher;
        A7Y(textSwitcher);
        C204249p3.A02(findViewById(R.id.payments_value_props_continue), this, 80);
        this.A0P.A0B();
    }

    public IndiaUpiPaymentsValuePropsActivity() {
        this(0);
    }
}
