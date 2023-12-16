package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass6C7;
import X.AnonymousClass9VH;
import X.AnonymousClass9W6;
import X.C06560Yg;
import X.C08310eF;
import X.C107635bd;
import X.C111095hX;
import X.C166587yw;
import X.C18300x5;
import X.C18320x8;
import X.C195229Ws;
import X.C197109ca;
import X.C203349nY;
import X.C204249p3;
import X.C620633i;
import X.C69263Wi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiForgotPinDialogFragment extends Hilt_IndiaUpiForgotPinDialogFragment {
    public C111095hX A00;
    public C69263Wi A01;
    public C620633i A02;
    public AnonymousClass1VX A03;
    public AnonymousClass9VH A04;
    public AnonymousClass9W6 A05;
    public C197109ca A06;
    public C203349nY A07;

    public void A0w(Bundle bundle, View view) {
        Bundle bundle2 = this.A06;
        View view2 = view;
        if (bundle2 != null) {
            C166587yw r8 = (C166587yw) bundle2.getParcelable("extra_bank_account");
            if (!(r8 == null || r8.A08 == null)) {
                C18300x5.A0G(view2, R.id.desc).setText(C18320x8.A0b(C08310eF.A09(this), this.A05.A04(r8), new Object[1], 0, R.string.f11nameremoved));
            }
            Context context = view2.getContext();
            AnonymousClass1VX r12 = this.A03;
            C69263Wi r9 = this.A01;
            C111095hX r82 = this.A00;
            C620633i r11 = this.A02;
            C107635bd.A0E(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r82, r9, AnonymousClass0x7.A0K(view2, R.id.note), r11, r12, C08310eF.A09(this).getString(R.string.f11nameremoved, new Object[]{"learn-more"}), "learn-more");
        }
        C204249p3.A02(C06560Yg.A02(view2, R.id.continue_button), this, 47);
        C204249p3.A02(C06560Yg.A02(view2, R.id.close), this, 48);
        C204249p3.A02(C06560Yg.A02(view2, R.id.forgot_pin_button), this, 49);
        this.A06.BKB(0, (Integer) null, "forgot_pin_prompt", (String) null);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass6C7.A0y(A0R());
        this.A04.A01(new C195229Ws(this, 2));
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0d() {
        super.A0d();
        this.A07 = null;
    }
}
