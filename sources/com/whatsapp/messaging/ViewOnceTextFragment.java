package com.whatsapp.messaging;

import X.AnonymousClass001;
import X.C30481mW;
import X.C86644Kx;
import X.C93304oI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ViewOnceTextFragment extends Hilt_ViewOnceTextFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        A13(true);
        return A0R;
    }

    public void A0w(Bundle bundle, View view) {
        ViewGroup A0I = C86644Kx.A0I(view, R.id.text_bubble_container);
        C93304oI r1 = new C93304oI(A0R(), this, (C30481mW) this.A02);
        r1.A1s(true);
        r1.setEnabled(false);
        r1.setClickable(false);
        r1.setLongClickable(false);
        r1.A2Q = false;
        A0I.removeAllViews();
        A0I.addView(r1);
    }
}
