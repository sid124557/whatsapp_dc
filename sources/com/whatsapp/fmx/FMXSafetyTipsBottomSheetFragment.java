package com.whatsapp.fmx;

import X.AnonymousClass32Y;
import X.AnonymousClass340;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C06560Yg;
import X.C104285Qj;
import X.C111095hX;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C56962sq;
import X.C635339p;
import X.C64773Ex;
import X.C66433Lk;
import X.C80643yZ;
import X.C86604Kt;
import X.C86624Kv;
import X.C89644eZ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;

public final class FMXSafetyTipsBottomSheetFragment extends Hilt_FMXSafetyTipsBottomSheetFragment {
    public C111095hX A00;
    public C56962sq A01;
    public C64773Ex A02;
    public C104285Qj A03;
    public C66433Lk A04;
    public final AnonymousClass66R A05 = C154517dI.A00(AnonymousClass58H.NONE, new C80643yZ(this));
    public final AnonymousClass66R A06 = AnonymousClass340.A01(this, "argContactId");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass66R r4 = this.A05;
        if (r4.getValue() == null) {
            A1L();
            return;
        }
        View A0E = C18280x3.A0E(view, R.id.block_contact_container);
        C56962sq r1 = this.A01;
        if (r1 != null) {
            C86624Kv.A11(A0E, r1.A0P(AnonymousClass32Y.A05((Jid) r4.getValue())) ? 1 : 0, 8, 0);
            C003203q A0Q = A0Q();
            if ((A0Q instanceof C89644eZ) && A0Q != null) {
                C635339p.A00(C06560Yg.A02(view, R.id.safety_tips_close_button), this, 29);
                C104285Qj r0 = this.A03;
                if (r0 != null) {
                    if (r0.A07) {
                        C86604Kt.A1E(view, R.id.fmx_block_contact_subtitle, 8);
                        C86604Kt.A1E(view, R.id.fmx_report_spam_subtitle, 8);
                        C86604Kt.A1E(view, R.id.fmx_block_contact_arrow, 8);
                        C86604Kt.A1E(view, R.id.fmx_report_spam_arrow, 8);
                    }
                    C18310x6.A19(C06560Yg.A02(view, R.id.safety_tips_learn_more), this, A0Q, 5);
                    C18310x6.A19(C18280x3.A0E(view, R.id.block_contact_container), this, A0Q, 6);
                    C18310x6.A19(C18280x3.A0E(view, R.id.report_spam_container), this, A0Q, 7);
                    return;
                }
                throw C18270x1.A0S("fmxManager");
            }
            return;
        }
        throw C18270x1.A0S("blockListManager");
    }
}
