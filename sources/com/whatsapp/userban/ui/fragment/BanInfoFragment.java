package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.C06560Yg;
import X.C08310eF;
import X.C109395eY;
import X.C18260x0;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanInfoFragment extends Hilt_BanInfoFragment {
    public Button A00;
    public BanAppealViewModel A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A13(true);
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        if (!this.A01.A07()) {
            C18290x4.A1E(menu, 1, R.string.f11nameremoved);
        }
        super.A0y(menu, menuInflater);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        this.A01 = C18280x3.A0P(this);
        BanAppealViewModel.A00(A0R(), false);
        AnonymousClass0x9.A0E(view, R.id.ban_icon).setImageDrawable(C08310eF.A09(this).getDrawable(R.drawable.icon_banned));
        TextView A0G = C18300x5.A0G(view, R.id.heading);
        int i = AnonymousClass0x2.A0F(this.A01.A09.A04).getInt("support_ban_appeal_violation_type", 0);
        C18260x0.A0y("BanAppealRepository/getBanViolationType ", AnonymousClass001.A0o(), i);
        int i2 = R.string.f11nameremoved;
        if (i == 15) {
            i2 = R.string.f11nameremoved;
        }
        A0G.setText(i2);
        C18300x5.A0G(view, R.id.sub_heading).setText(R.string.f11nameremoved);
        this.A00 = (Button) C06560Yg.A02(view, R.id.action_button);
        boolean equals = this.A01.A09.A00().equals("IN_REVIEW");
        Button button = this.A00;
        int i3 = R.string.f11nameremoved;
        if (equals) {
            i3 = R.string.f11nameremoved;
        }
        button.setText(i3);
        this.A00.setOnClickListener(new C109395eY(this, 27));
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.A1B(menuItem);
        }
        this.A01.A0G(A0R(), false);
        return true;
    }
}
