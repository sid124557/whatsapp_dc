package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass000;
import X.AnonymousClass1VX;
import X.AnonymousClass2XC;
import X.AnonymousClass356;
import X.C106715a2;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C620633i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public abstract class WfacBanBaseFragment extends WaFragment {
    public C111095hX A00;
    public C620633i A01;
    public AnonymousClass1VX A02;
    public C106715a2 A03;
    public AnonymousClass2XC A04;
    public WfacBanViewModel A05;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A13(true);
        return null;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A05 = (WfacBanViewModel) C18290x4.A0O(this).A01(WfacBanViewModel.class);
    }

    public final AnonymousClass2XC A1I() {
        AnonymousClass2XC r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("wfacLogger");
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        C18270x1.A14(menu, menuInflater);
        AnonymousClass356.A03("WfacBanBaseFragment/onCreateOptionsMenu/add register new number menu item");
        C18290x4.A1E(menu, 101, R.string.f11nameremoved);
    }

    public boolean A1B(MenuItem menuItem) {
        StringBuilder A0X = C18270x1.A0X(menuItem);
        A0X.append("WfacBanBaseFragment/onOptionsItemSelected/option item : ");
        AnonymousClass356.A03(AnonymousClass000.A0h(A0X, menuItem.getItemId()));
        if (menuItem.getItemId() != 101) {
            return false;
        }
        WfacBanViewModel wfacBanViewModel = this.A05;
        if (wfacBanViewModel == null) {
            throw C18270x1.A0S("viewModel");
        }
        wfacBanViewModel.A0E(A0R());
        AnonymousClass2XC A1I = A1I();
        WfacBanViewModel wfacBanViewModel2 = this.A05;
        if (wfacBanViewModel2 == null) {
            throw C18270x1.A0S("viewModel");
        }
        int A0D = wfacBanViewModel2.A0D();
        WfacBanViewModel wfacBanViewModel3 = this.A05;
        if (wfacBanViewModel3 == null) {
            throw C18270x1.A0S("viewModel");
        }
        A1I.A01("reg_new_number_started", A0D, wfacBanViewModel3.A00);
        return true;
    }
}
