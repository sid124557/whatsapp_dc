package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass0Y9;
import X.C106905aM;
import X.C107295b4;
import X.C162457s7;
import X.C18310x6;
import X.C86644Kx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class PnhWithBulletsBottomSheet extends WDSBottomSheetDialogFragment implements View.OnClickListener {
    public ListItemWithLeftIcon A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public WaTextView A03;
    public WaTextView A04;
    public WDSButton A05;
    public WDSButton A06;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        this.A04 = C86644Kx.A0O(view, R.id.pnh_title);
        this.A05 = (WDSButton) view.findViewById(R.id.pnh_primary_button);
        this.A06 = (WDSButton) view.findViewById(R.id.pnh_secondary_button);
        this.A00 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_1);
        this.A01 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_2);
        this.A02 = (ListItemWithLeftIcon) view.findViewById(R.id.pnh_point_3);
        WaTextView A0O = C86644Kx.A0O(view, R.id.pnh_own_number);
        A0O.setTextDirection(3);
        if (this instanceof CreatorPrivacyNewsletterBottomSheet) {
            C106905aM.A04(A0O);
            A0O.setTextSize(14.0f);
        } else {
            AnonymousClass0Y9.A07(A0O, 8, 24, 2, 2);
        }
        this.A03 = A0O;
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            wDSButton.setOnClickListener(this);
        }
        WDSButton wDSButton2 = this.A05;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener(this);
        }
        WaTextView waTextView = this.A04;
        C162457s7.A0K(waTextView, "null cannot be cast to non-null type android.view.View");
        C107295b4.A06(waTextView, true);
    }

    public void A0c() {
        super.A0c();
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton2 = this.A05;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
        this.A04 = null;
        this.A06 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
