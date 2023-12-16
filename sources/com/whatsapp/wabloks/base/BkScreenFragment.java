package com.whatsapp.wabloks.base;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass39C;
import X.AnonymousClass7UQ;
import X.C009707r;
import X.C155137eL;
import X.C1899593h;
import X.C1899693i;
import X.C205049qL;
import X.C44122Ut;
import X.C47382dA;
import X.C48412er;
import X.C59842xa;
import X.C84704Dj;
import X.C86604Kt;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class BkScreenFragment extends Hilt_BkScreenFragment implements C84704Dj {
    public FrameLayout A00;
    public FrameLayout A01;
    public C44122Ut A02;
    public C48412er A03;
    public C59842xa A04;
    public AnonymousClass7UQ A05;
    public Map A06;
    public boolean A07 = false;

    public static BkScreenFragment A01(AnonymousClass39C r3, String str, String str2) {
        BkScreenFragment bkScreenFragment = new BkScreenFragment();
        bkScreenFragment.A1Q(str);
        C1899593h.A1P(bkScreenFragment, r3, (Serializable) null, str2);
        bkScreenFragment.A07 = true;
        return bkScreenFragment;
    }

    public void A1O(Integer num, Integer num2, String str, String str2) {
        C48412er r1 = this.A03;
        if (r1 != null) {
            r1.A01(str2, num2.intValue());
        }
    }

    public void A1S() {
        C86604Kt.A1A(this.A01);
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public void A1T() {
        C86604Kt.A1A(this.A00);
        boolean equals = "com.bloks.www.whatsapp.galaxy.flow.v2".equals(A0H().getString("screen_name", (String) null));
        FrameLayout frameLayout = this.A01;
        if ((equals ^ true) && AnonymousClass000.A1W(frameLayout)) {
            if (!this.A07) {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            this.A01.setVisibility(0);
        }
    }

    public C47382dA BEP() {
        C44122Ut r3 = this.A02;
        return C1899693i.A09((C009707r) A0Q(), A0U(), r3, this.A06);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0c() {
        super.A0c();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A06;
        genericBkLayoutViewModel.A0D();
        genericBkLayoutViewModel.A01.A0A(A0V());
        this.A01 = null;
        this.A00 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        try {
            C155137eL.A00(A0R().getApplicationContext());
        } catch (IOException unused) {
        }
    }

    public void A0w(Bundle bundle, View view) {
        this.A01 = C86654Ky.A0L(view, R.id.bloks_dialogfragment_progressbar);
        this.A00 = C86654Ky.A0L(view, R.id.bloks_dialogfragment);
        A1T();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A06;
        genericBkLayoutViewModel.A0D();
        C205049qL.A03(A0V(), genericBkLayoutViewModel.A01, this, 71);
        super.A0w(bundle, view);
    }

    public void A1J() {
        A1S();
        Bundle bundle = this.A06;
        if (bundle != null) {
            this.A04.A01(bundle.getString("qpl_params"));
        }
    }

    public int A1H() {
        return R.id.bloks_container;
    }

    public Class A1I() {
        return GenericBkLayoutViewModel.class;
    }

    public AnonymousClass7UQ B4k() {
        return this.A05;
    }

    public void A1N(Exception exc) {
        A1S();
    }
}
