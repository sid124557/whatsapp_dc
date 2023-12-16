package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08J;
import X.AnonymousClass0O5;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass4U1;
import X.AnonymousClass5N9;
import X.AnonymousClass6C6;
import X.C06270Wx;
import X.C101495Ez;
import X.C105895Wv;
import X.C1231767k;
import X.C136036lk;
import X.C86604Kt;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C87544Ti;
import X.C96244w3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import java.util.ArrayList;

public class BusinessApiHomeFragment extends Hilt_BusinessApiHomeFragment {
    public RecyclerView A00;
    public C101495Ez A01;
    public C96244w3 A02;
    public AnonymousClass4U1 A03;
    public AnonymousClass1VX A04;
    public AnonymousClass5N9 A05;
    public C105895Wv A06;
    public final AnonymousClass0O5 A07 = new C1231767k(this, 2);

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        int i = A0H().getInt("arg_home_view_state");
        AnonymousClass4U1 r0 = (AnonymousClass4U1) AnonymousClass4L0.A0F(new C87544Ti(bundle, this, this.A01, A0H().getString("entrypoint_type"), i), this).A01(AnonymousClass4U1.class);
        this.A03 = r0;
        AnonymousClass6C6.A01(this, r0.A0I, 31);
        AnonymousClass6C6.A01(this, this.A03.A06, 32);
    }

    public void A0r(Bundle bundle) {
        this.A0X = true;
        A1I().A03 = this;
    }

    public void A0q(Bundle bundle) {
        AnonymousClass4U1 r0 = this.A03;
        r0.A07.A06("arg_home_view_state", Integer.valueOf(r0.A00));
    }

    public void A1J() {
        AnonymousClass4U1 r5 = this.A03;
        if (r5.A00 == 0) {
            r5.A00 = 1;
            AnonymousClass08J r4 = r5.A05;
            if (r4.A07() != null) {
                ArrayList A0J = AnonymousClass002.A0J(C86664Kz.A1P(r4));
                if (A0J.isEmpty() || !(A0J.get(0) instanceof C136036lk)) {
                    A0J.add(0, new C136036lk(r5.A01));
                }
                C06270Wx.A03(r5.A0I, 3);
                r4.A0H(A0J);
                return;
            }
            return;
        }
        C06270Wx.A04(r5.A0I, 4);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        RecyclerView A0P = C86654Ky.A0P(inflate, R.id.home_list);
        this.A00 = A0P;
        C86634Kw.A1B(this.A00, A0P, A0P.getPaddingLeft(), 0, this.A00.getPaddingRight());
        A1D();
        this.A00.setLayoutManager(new LinearLayoutManager(1));
        if (A0H().getInt("arg_home_view_state") == 1) {
            this.A00.A0q(this.A07);
        }
        this.A00.setAdapter(this.A02);
        C86604Kt.A1N(A0V(), this.A03.A05, this, 68);
        AnonymousClass6C6.A02(A0V(), this.A03.A0C.A01, this, 30);
        return inflate;
    }

    public void A0a() {
        super.A0a();
        A1I().A03 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I().A03 = this;
    }

    public BusinessApiSearchActivity A1I() {
        if (A0R() instanceof BusinessApiSearchActivity) {
            return (BusinessApiSearchActivity) A0R();
        }
        throw AnonymousClass001.A0e("BusinessApiHomeFragment should be attached to BusinessApiSearchActivity");
    }
}
