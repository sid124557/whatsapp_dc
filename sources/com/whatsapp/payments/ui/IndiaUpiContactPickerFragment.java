package com.whatsapp.payments.ui;

import X.AnonymousClass0x9;
import X.AnonymousClass5Yj;
import X.AnonymousClass9U4;
import X.AnonymousClass9UW;
import X.C003203q;
import X.C153607bd;
import X.C193999Re;
import X.C194389Sr;
import X.C196629bS;
import X.C197109ca;
import X.C203339nX;
import X.C204249p3;
import X.C620933l;
import X.C66663Mh;
import X.C89654ea;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IndiaUpiContactPickerFragment extends Hilt_IndiaUpiContactPickerFragment {
    public C196629bS A00;
    public C620933l A01;
    public C193999Re A02;
    public C194389Sr A03;
    public C197109ca A04;

    public void A1T() {
        boolean A002 = AnonymousClass9UW.A00(this.A1x, this.A00.A07());
        int i = R.string.f11nameremoved;
        if (A002) {
            i = R.string.f11nameremoved;
        }
        View A1L = A1L(C204249p3.A00(this, 42), R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, i);
        View A1L2 = A1L(C204249p3.A00(this, 43), R.drawable.ic_scan_qr, AnonymousClass5Yj.A02(A0Q(), R.attr.f3nameremoved, R.color.f5nameremoved), R.drawable.green_circle, R.string.f11nameremoved);
        ListView listView = (ListView) this.A0F.findViewById(16908298);
        this.A0L = listView;
        listView.addHeaderView(A1L, (Object) null, true);
        this.A0L.addHeaderView(A1L2, (Object) null, true);
        super.A1T();
    }

    public void A2M(UserJid userJid) {
        this.A03.A00(A1D(), userJid, (C153607bd) null, (C203339nX) null, this.A01.A05());
        C003203q A0Q = A0Q();
        if (A0Q instanceof C89654ea) {
            Intent A08 = AnonymousClass0x9.A08(A0Q, AnonymousClass9U4.A07(this.A2H).BCl());
            A08.putExtra("extra_jid", userJid.getRawString());
            A08.putExtra("extra_is_pay_money_only", !this.A2H.A0B.A00.A08(C66663Mh.A0h));
            A08.putExtra("referral_screen", "payment_contact_picker");
            super.A2L(userJid);
            ((C89654ea) A0Q).A6T(A08, true);
            return;
        }
        Log.e("India Payments' contact picker activity is null");
    }

    public boolean A2C() {
        return true;
    }
}
