package com.whatsapp.payments.ui.bottomsheet;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass5Vo;
import X.AnonymousClass7PH;
import X.AnonymousClass8s1;
import X.C06560Yg;
import X.C08310eF;
import X.C139786sc;
import X.C162457s7;
import X.C18270x1;
import X.C1891290c;
import X.C626936e;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public final class PaymentMayBeInProgressBottomSheet extends Hilt_PaymentMayBeInProgressBottomSheet {
    public AnonymousClass8s1 A00;
    public String A01;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextView A0I = AnonymousClass0x2.A0I(view, R.id.payment_may_in_progress_body);
        Object[] A0L = AnonymousClass002.A0L();
        String str = this.A01;
        if (str == null) {
            throw C18270x1.A0S("receiverName");
        }
        A0L[0] = str;
        A0I.setText(C08310eF.A09(this).getString(R.string.f11nameremoved, A0L));
        C1891290c.A00(C06560Yg.A02(view, R.id.payment_may_in_progress_button_continue), this, 21);
        C1891290c.A00(C06560Yg.A02(view, R.id.payment_may_in_progress_button_back), this, 22);
    }

    public void A1W(AnonymousClass5Vo r4) {
        C162457s7.A0J(r4, 0);
        C139786sc r1 = C139786sc.A00;
        AnonymousClass7PH r0 = r4.A00;
        r0.A04 = r1;
        r0.A06 = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        AnonymousClass8s1 r0 = this.A00;
        if (r0 != null) {
            r0.BOO();
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("arg_receiver_name");
        C626936e.A06(string);
        C162457s7.A0D(string);
        this.A01 = string;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
