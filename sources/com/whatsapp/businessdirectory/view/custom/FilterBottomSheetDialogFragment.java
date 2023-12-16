package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass002;
import X.AnonymousClass0XL;
import X.AnonymousClass0XV;
import X.AnonymousClass103;
import X.AnonymousClass4CX;
import X.AnonymousClass4K2;
import X.C06560Yg;
import X.C109665ez;
import X.C15940sD;
import X.C17190ui;
import X.C18290x4;
import X.C18300x5;
import X.C19430zz;
import X.C195611r;
import X.C39562Cl;
import X.C989453v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public class FilterBottomSheetDialogFragment extends Hilt_FilterBottomSheetDialogFragment {
    public C39562Cl A00;
    public C195611r A01;
    public AnonymousClass4CX A02 = null;
    public AnonymousClass103 A03;
    public final C109665ez A04 = new C989453v(this, 35);

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A03 = (AnonymousClass103) new AnonymousClass0XL((C17190ui) new C19430zz(bundle, this, this.A00, A0H().getParcelableArrayList("arg-categories"), A0H().getParcelableArrayList("arg-selected-categories")), (C15940sD) this).A01(AnonymousClass103.class);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        View A022 = C06560Yg.A02(inflate, R.id.view_handle);
        if (A1Y()) {
            i = 8;
        }
        A022.setVisibility(i);
        C18290x4.A1H(C06560Yg.A02(inflate, R.id.iv_close), this, 37);
        C18300x5.A0G(inflate, R.id.tv_title).setText(R.string.f11nameremoved);
        this.A01 = new C195611r(this);
        ((RecyclerView) inflate.findViewById(R.id.rv_categories)).setAdapter(this.A01);
        AnonymousClass4K2.A00(A0V(), this.A03.A01, this, 13);
        View A023 = C06560Yg.A02(inflate, R.id.btn_clear);
        C109665ez r1 = this.A04;
        A023.setOnClickListener(r1);
        C06560Yg.A02(inflate, R.id.btn_apply).setOnClickListener(r1);
        return inflate;
    }

    public void A0q(Bundle bundle) {
        super.A0q(bundle);
        AnonymousClass103 r3 = this.A03;
        AnonymousClass0XV r2 = r3.A02;
        r2.A06("saved_all_categories", r3.A00);
        r2.A06("saved_selected_categories", AnonymousClass002.A0J(r3.A03));
    }
}
