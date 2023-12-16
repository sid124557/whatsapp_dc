package com.whatsapp.xfamily.crossposting.ui.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass21S;
import X.AnonymousClass66O;
import X.AnonymousClass68K;
import X.C102765Ke;
import X.C106245Ye;
import X.C111135hb;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C56042rK;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class CrosspostingLinkingDisclosureBottomSheetDialogFragment extends Hilt_CrosspostingLinkingDisclosureBottomSheetDialogFragment {
    public static final AnonymousClass21S A07 = AnonymousClass21S.A0A;
    public WDSButton A00;
    public WDSButton A01;
    public AnonymousClass66O A02;
    public C102765Ke A03;
    public C56042rK A04;
    public C111135hb A05;
    public boolean A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, true);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A01 = C86654Ky.A0f(view, R.id.not_now_btn);
        this.A00 = C86654Ky.A0f(view, R.id.continue_to_setup_btn);
        WDSButton wDSButton = this.A01;
        if (wDSButton != null) {
            wDSButton.setOnClickListener(new AnonymousClass68K(this, 5));
        }
        WDSButton wDSButton2 = this.A00;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener(new AnonymousClass68K(this, 6));
        }
        C18290x4.A0M(view, R.id.drag_handle).setVisibility(AnonymousClass001.A08(A1Y() ^ true ? 1 : 0));
        C106245Ye.A00("CrosspostingLinkingDisclosureBottomSheetDialogFragment Opening Linking disclosure fragment");
    }

    public void A0c() {
        super.A0c();
        if (!this.A06) {
            C111135hb r2 = this.A05;
            if (r2 != null) {
                C56042rK r1 = this.A04;
                if (r1 != null) {
                    C111135hb.A00(r1, AnonymousClass21S.A0A, r2);
                    C111135hb r12 = this.A05;
                    if (r12 != null) {
                        r12.A04("EXIT_LINKING_NUX");
                        return;
                    }
                    throw C18270x1.A0S("xFamilyUserFlowLogger");
                }
                throw C18270x1.A0S("fbAccountManager");
            }
            throw C18270x1.A0S("xFamilyUserFlowLogger");
        }
    }
}
