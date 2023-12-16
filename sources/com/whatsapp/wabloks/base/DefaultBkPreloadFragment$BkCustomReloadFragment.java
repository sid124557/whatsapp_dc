package com.whatsapp.wabloks.base;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.C162457s7;
import X.C18270x1;
import X.C18310x6;
import X.C29441ip;
import X.C85814Hs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class DefaultBkPreloadFragment$BkCustomReloadFragment extends Hilt_DefaultBkPreloadFragment_BkCustomReloadFragment {
    public C29441ip A00;
    public GenericBkLayoutViewModelWithReload A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        int i2;
        C162457s7.A0J(view, 0);
        GenericBkLayoutViewModelWithReload genericBkLayoutViewModelWithReload = (GenericBkLayoutViewModelWithReload) AnonymousClass0x9.A0H(A0N()).A01(GenericBkLayoutViewModelWithReload.class);
        C162457s7.A0J(genericBkLayoutViewModelWithReload, 0);
        this.A01 = genericBkLayoutViewModelWithReload;
        TextView A09 = AnonymousClass002.A09(view, R.id.error_message);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || (i2 = bundle2.getInt("layout_error_status")) == 1 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            C29441ip r0 = this.A00;
            if (r0 != null) {
                boolean A0F = r0.A0F();
                i = R.string.f11nameremoved;
                if (A0F) {
                    i = R.string.f11nameremoved;
                }
            } else {
                throw C18270x1.A0S("connectivityStateProvider");
            }
        } else {
            i = R.string.f11nameremoved;
        }
        A09.setText(i);
        C85814Hs.A00(view.findViewById(R.id.retry_button), this, 7);
    }
}
