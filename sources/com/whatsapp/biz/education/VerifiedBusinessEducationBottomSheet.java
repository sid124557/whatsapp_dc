package com.whatsapp.biz.education;

import X.AnonymousClass1VX;
import X.AnonymousClass7SX;
import X.C111095hX;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18320x8;
import X.C58422vE;
import X.C66433Lk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class VerifiedBusinessEducationBottomSheet extends Hilt_VerifiedBusinessEducationBottomSheet {
    public C111095hX A00;
    public AnonymousClass1VX A01;
    public AnonymousClass7SX A02;
    public C66433Lk A03;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, true);
        WaTextView waTextView = (WaTextView) inflate.findViewById(R.id.description);
        boolean A0Y = waTextView.getAbProps().A0Y(C58422vE.A02, 6127);
        int i = R.string.f11nameremoved;
        if (A0Y) {
            i = R.string.f11nameremoved;
        }
        waTextView.setText(i);
        C18320x8.A15(inflate.findViewById(R.id.learn_more_button), this, 44);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass7SX r3 = this.A02;
        if (r3 != null) {
            String string = A0H().getString("biz_owner_jid");
            if (string != null) {
                r3.A00(2, string, 2, 2);
                return;
            }
            throw C18300x5.A0X();
        }
        throw C18270x1.A0S("metaVerifiedInteractionLogger");
    }
}
