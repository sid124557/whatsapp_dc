package com.whatsapp.gallery.dialogs;

import X.AnonymousClass4GP;
import X.AnonymousClass5Vo;
import X.C06560Yg;
import X.C162457s7;
import X.C635339p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class GalleryPartialPermissionBottomSheetFragment extends Hilt_GalleryPartialPermissionBottomSheetFragment {
    public AnonymousClass4GP A00;
    public AnonymousClass4GP A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C635339p.A00(C06560Yg.A02(view, R.id.select_more_photos_container), this, 36);
        C635339p.A00(C06560Yg.A02(view, R.id.go_to_settings_container), this, 37);
    }

    public void A1W(AnonymousClass5Vo r3) {
        C162457s7.A0J(r3, 0);
        r3.A00.A01 = -1;
    }
}
