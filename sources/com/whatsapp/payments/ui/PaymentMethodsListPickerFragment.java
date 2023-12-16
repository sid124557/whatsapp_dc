package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass948;
import X.AnonymousClass9U4;
import X.AnonymousClass9Y7;
import X.C158777kX;
import X.C166587yw;
import X.C18300x5;
import X.C1899593h;
import X.C195169Wk;
import X.C202729mU;
import X.C203509nr;
import X.C203739oE;
import X.C203879oS;
import X.C204249p3;
import X.C29251iW;
import X.C43942Ub;
import X.C620733j;
import X.C626936e;
import X.C69263Wi;
import X.C86644Kx;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodsListPickerFragment extends Hilt_PaymentMethodsListPickerFragment implements C203739oE {
    public C69263Wi A00;
    public C620733j A01;
    public C29251iW A02;
    public AnonymousClass9U4 A03;
    public C202729mU A04;
    public C158777kX A05;
    public AnonymousClass948 A06;
    public C203509nr A07;
    public final C43942Ub A08 = new C203879oS(this, 4);

    public static PaymentMethodsListPickerFragment A00(List list) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = new PaymentMethodsListPickerFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelableArrayList("arg_methods", AnonymousClass002.A0J(list));
        paymentMethodsListPickerFragment.A0u(A082);
        return paymentMethodsListPickerFragment;
    }

    public int B9g(C166587yw r2) {
        C203509nr r0 = this.A07;
        if (r0 != null) {
            return r0.B9g(r2);
        }
        return 0;
    }

    public String B9i(C166587yw r2) {
        String B9i;
        C203509nr r0 = this.A07;
        if (r0 == null || (B9i = r0.B9i(r2)) == null) {
            return C195169Wk.A03(A0G(), r2);
        }
        return B9i;
    }

    public String B9j(C166587yw r2) {
        C203509nr r0 = this.A07;
        if (r0 != null) {
            return r0.B9j(r2);
        }
        return null;
    }

    public boolean BoB(C166587yw r3) {
        C203509nr r0 = this.A07;
        if (r0 == null || r0.BoB(r3)) {
            return true;
        }
        return false;
    }

    public boolean BoR() {
        C203509nr r0 = this.A07;
        if (r0 == null || !r0.BoR()) {
            return false;
        }
        return true;
    }

    public void Boj(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        C203509nr r0 = this.A07;
        if (r0 != null) {
            r0.Boj(r2, paymentMethodRow);
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0a() {
        super.A0a();
        this.A02.A07(this.A08);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A02.A06(this.A08);
    }

    public void A0w(Bundle bundle, View view) {
        View view2;
        View B4C;
        ArrayList parcelableArrayList = A0H().getParcelableArrayList("arg_methods");
        C626936e.A06(parcelableArrayList);
        ListView listView = (ListView) view.findViewById(R.id.methods_list);
        C203509nr r1 = this.A07;
        if (r1 != null) {
            r1.BB1(A0I(), (ViewGroup) null);
        }
        AnonymousClass948 r0 = new AnonymousClass948(view.getContext(), this.A05, this);
        this.A06 = r0;
        r0.A00 = parcelableArrayList;
        r0.notifyDataSetChanged();
        listView.setAdapter(this.A06);
        C203509nr r02 = this.A07;
        if (r02 == null || !r02.BoP()) {
            view2 = null;
        } else {
            view2 = A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
            C1899593h.A0m(view2, R.id.add_new_account_icon, AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved));
            C18300x5.A0G(view2, R.id.add_new_account_text).setText(R.string.f11nameremoved);
            listView.addFooterView(view2);
        }
        ViewGroup A0I = C86644Kx.A0I(view, R.id.additional_bottom_row);
        C203509nr r12 = this.A07;
        if (!(r12 == null || (B4C = r12.B4C(A0I(), (ViewGroup) null)) == null)) {
            A0I.addView(B4C);
            C204249p3.A02(A0I, this, 104);
        }
        if (this.A07 != null) {
            FrameLayout A0L = C86654Ky.A0L(view, R.id.footer_view);
            View B7m = this.A07.B7m(A0I(), A0L);
            if (B7m != null) {
                A0L.setVisibility(0);
                A0L.addView(B7m);
            } else {
                A0L.setVisibility(8);
            }
        }
        listView.setOnItemClickListener(new AnonymousClass9Y7(view2, listView, this));
        View findViewById = view.findViewById(R.id.back);
        findViewById.setVisibility(0);
        C204249p3.A02(findViewById, this, 105);
        View findViewById2 = view.findViewById(R.id.icon_lock);
        C203509nr r03 = this.A07;
        if (r03 == null || r03.BoY()) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(4);
        }
    }

    public boolean BoN() {
        return true;
    }
}
