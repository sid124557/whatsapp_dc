package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass03x;
import X.AnonymousClass0O1;
import X.AnonymousClass0x9;
import X.AnonymousClass33p;
import X.AnonymousClass6C6;
import X.AnonymousClass93C;
import X.C003403v;
import X.C06560Yg;
import X.C103415Mu;
import X.C111525iE;
import X.C112345ja;
import X.C86604Kt;
import X.C86654Ky;
import X.C95224sp;
import X.C96254w4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;

public class LocationOptionPickerFragment extends Hilt_LocationOptionPickerFragment {
    public RecyclerView A00;
    public C96254w4 A01;
    public C103415Mu A02;
    public C112345ja A03;
    public LocationOptionPickerViewModel A04;
    public AnonymousClass33p A05;
    public final AnonymousClass0O1 A06 = Bid(new AnonymousClass93C(this, 3), new C003403v());
    public final AnonymousClass0O1 A07 = Bid(new AnonymousClass93C(this, 1), new C003403v());
    public final AnonymousClass0O1 A08 = Bid(new AnonymousClass93C(this, 2), new AnonymousClass03x());

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        RecyclerView A0P = C86654Ky.A0P(inflate, R.id.rv_location_options);
        this.A00 = A0P;
        A0P.setAdapter(this.A01);
        View A022 = C06560Yg.A02(inflate, R.id.view_handle);
        if (A1Y()) {
            i = 8;
        }
        A022.setVisibility(i);
        C86604Kt.A1M(this, this.A04.A00, 102);
        AnonymousClass6C6.A01(this, this.A04.A07, 44);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            LocationOptionPickerViewModel locationOptionPickerViewModel = this.A04;
            int i2 = bundle2.getInt("source", -1);
            C111525iE r4 = locationOptionPickerViewModel.A01;
            Integer valueOf = Integer.valueOf(i2);
            Integer A032 = locationOptionPickerViewModel.A03.A03();
            C95224sp r1 = new C95224sp();
            C95224sp.A01(r1, 35);
            r1.A0H = valueOf;
            r1.A09 = A032;
            r4.A04(r1);
        }
        return inflate;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A04 = (LocationOptionPickerViewModel) AnonymousClass0x9.A0H(this).A01(LocationOptionPickerViewModel.class);
    }
}
