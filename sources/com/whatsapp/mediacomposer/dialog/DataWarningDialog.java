package com.whatsapp.mediacomposer.dialog;

import X.AnonymousClass0WH;
import X.AnonymousClass4GP;
import X.AnonymousClass4L0;
import X.AnonymousClass67S;
import X.C06560Yg;
import X.C08310eF;
import X.C162457s7;
import X.C175728Zm;
import X.C18300x5;
import X.C18310x6;
import X.C1891190b;
import X.C19340zH;
import X.C86654Ky;
import X.C86664Kz;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class DataWarningDialog extends WaDialogFragment {
    public final AnonymousClass4GP A00;
    public final AnonymousClass4GP A01;
    public final AnonymousClass4GP A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public DataWarningDialog(AnonymousClass4GP r1, AnonymousClass4GP r2, AnonymousClass4GP r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        View inflate = LayoutInflater.from(A0Q()).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        C162457s7.A0H(inflate);
        String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        C162457s7.A0D(string);
        AnonymousClass67S r6 = new AnonymousClass67S(this, 1);
        String A0m = C18310x6.A0m(this, string, R.string.f11nameremoved);
        C162457s7.A0D(A0m);
        int A0G = C175728Zm.A0G(A0m, string, 0, false);
        SpannableString A0A = AnonymousClass4L0.A0A(A0m);
        A0A.setSpan(r6, A0G, C86664Kz.A0L(string, A0G), 33);
        TextView A0G2 = C18300x5.A0G(inflate, R.id.messageTextView);
        AnonymousClass0WH A03 = C06560Yg.A03(A0G2);
        if (A03 == null) {
            A03 = new AnonymousClass0WH();
        }
        C06560Yg.A0O(A0G2, A03);
        A0G2.setHighlightColor(0);
        A0G2.setText(A0A);
        A0G2.setContentDescription(A0m);
        C86654Ky.A1E(A0G2);
        A0M.setView(inflate);
        A0M.A0R(false);
        A0M.A0I(new C1891190b(this, 41), C08310eF.A09(this).getString(R.string.f11nameremoved));
        A0M.A0G(new C1891190b(this, 42), C08310eF.A09(this).getString(R.string.f11nameremoved));
        return C18300x5.A0H(A0M);
    }
}
