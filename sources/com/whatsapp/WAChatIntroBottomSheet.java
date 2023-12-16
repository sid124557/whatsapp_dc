package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass1RT;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C18300x5;
import X.C989453v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WAChatIntroBottomSheet extends RoundedBottomSheetDialogFragment implements AnonymousClass64B {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        C989453v r1 = new C989453v(this, 4);
        C06560Yg.A02(A0R, R.id.close_button).setOnClickListener(r1);
        C06560Yg.A02(A0R, R.id.continue_button).setOnClickListener(r1);
        C18300x5.A0G(A0R, R.id.header).setText(AnonymousClass1RT.A00(A1D(), R.string.f11nameremoved));
        C18300x5.A0G(A0R, R.id.bodyLineItemText2).setText(AnonymousClass1RT.A00(A1D(), R.string.f11nameremoved));
        return A0R;
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
