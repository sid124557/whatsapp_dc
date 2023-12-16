package com.whatsapp.identity;

import X.AnonymousClass0Y9;
import X.C162457s7;
import X.C18280x3;
import X.C18310x6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class CompareNumberBottomSheet extends Hilt_CompareNumberBottomSheet {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return C18310x6.A0I(layoutInflater, viewGroup, R.layout.f8nameremoved, false);
    }

    public void A0w(Bundle bundle, View view) {
        String str;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextView A0F = C18280x3.A0F(view, R.id.identity_verification_number);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("number");
        } else {
            str = null;
        }
        A0F.setText(str);
        AnonymousClass0Y9.A03(A0F, 1);
        A0F.setTextDirection(3);
    }
}
