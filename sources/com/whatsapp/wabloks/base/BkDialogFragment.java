package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass39C;
import X.C08240dc;
import X.C08270df;
import X.C626936e;
import X.C86664Kz;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1;
import java.io.Serializable;

public abstract class BkDialogFragment extends Hilt_BkDialogFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        View findViewById = A0R.findViewById(R.id.wa_bloks_dialog_fragment_container);
        C08270df A0T = A0T();
        if (A0T.A0D("FRAGMENT_CONTENT") == null) {
            C08240dc r6 = new C08240dc(A0T);
            int id = findViewById.getId();
            WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 = (WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1) this;
            String str = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A02;
            String str2 = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A01;
            BkScreenFragment bkScreenFragment = new BkScreenFragment();
            bkScreenFragment.A1Q(str);
            bkScreenFragment.A1P(str2);
            bkScreenFragment.A1M((AnonymousClass39C) null);
            bkScreenFragment.A1K();
            bkScreenFragment.A0H().putSerializable("qpl_params", (Serializable) null);
            bkScreenFragment.A07 = false;
            r6.A0D(bkScreenFragment, "FRAGMENT_CONTENT", id);
            r6.A01();
        }
        return A0R;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 2) {
            C626936e.A06(this);
            C626936e.A06(this.A03.getWindow());
            this.A03.getWindow().setLayout((int) (((double) C86664Kz.A0f(A0R()).getWidth()) * 0.8d), -2);
        } else if (i == 1) {
            C626936e.A06(this.A03);
            C626936e.A06(this.A03.getWindow());
            this.A03.getWindow().setLayout(-2, (int) (((double) C86664Kz.A0f(A0R()).getHeight()) * 0.85d));
        }
    }
}
