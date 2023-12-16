package com.whatsapp.status;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass3ZH;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C08310eF;
import X.C113995mK;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C46162bB;
import X.C50252hs;
import X.C58422vE;
import X.C626936e;
import X.C64773Ex;
import X.C70973bM;
import X.C71423c5;
import X.C85334Fv;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class StatusConfirmMuteDialogFragment extends Hilt_StatusConfirmMuteDialogFragment {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C85334Fv A02;
    public C50252hs A03;
    public C113995mK A04;

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C85334Fv r0 = this.A02;
        if (r0 != null) {
            r0.BR7(this, false);
        }
    }

    public Dialog A1J(Bundle bundle) {
        C85334Fv r0 = this.A02;
        if (r0 != null) {
            r0.BR7(this, true);
        }
        UserJid A0E = UserJid.Companion.A0E(A0H().getString("jid"));
        C626936e.A06(A0E);
        C64773Ex r02 = this.A00;
        if (r02 != null) {
            AnonymousClass3ZH A0A = r02.A0A(A0E);
            C19340zH A0K = C18280x3.A0K(this);
            Object[] objArr = new Object[1];
            AnonymousClass5ZU r03 = this.A01;
            if (r03 != null) {
                A0K.A0h(AnonymousClass0x7.A0n(this, C18300x5.A0h(r03, A0A), objArr, 0, R.string.f11nameremoved));
                Object[] objArr2 = new Object[1];
                AnonymousClass5ZU r04 = this.A01;
                if (r04 != null) {
                    C18300x5.A1E(r04, A0A, objArr2, 0);
                    A0K.A0g(C08310eF.A09(this).getString(R.string.f11nameremoved, objArr2));
                    C19340zH.A07(A0K, this, 95, R.string.f11nameremoved);
                    C19340zH.A09(A0K, this, A0E, 20, R.string.f11nameremoved);
                    return C18300x5.A0H(A0K);
                }
                throw C18270x1.A0S("waContactNames");
            }
            throw C18270x1.A0S("waContactNames");
        }
        throw C18270x1.A0S("contactManager");
    }

    public static final void A00(UserJid userJid, StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("statusesfragment/mute status for ");
        UserJid userJid2 = userJid;
        C18260x0.A0o(userJid, A0o);
        StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment2 = statusConfirmMuteDialogFragment;
        C50252hs r0 = statusConfirmMuteDialogFragment.A03;
        if (r0 != null) {
            C18280x3.A12(userJid);
            C46162bB r4 = r0.A07;
            r4.A03.BkM(new C71423c5(r4, userJid2, 5, true, r4.A01.A0Y(C58422vE.A02, 2070)));
            Bundle A0H = statusConfirmMuteDialogFragment.A0H();
            C113995mK r6 = statusConfirmMuteDialogFragment.A04;
            if (r6 != null) {
                String string = A0H.getString("message_id");
                Long valueOf = Long.valueOf(A0H.getLong("status_item_index"));
                String string2 = A0H.getString("psa_campaign_id");
                r6.A0E.BkM(new C70973bM(userJid2, r6, valueOf, A0H.getString("psa_campaign_ids"), string2, string, 1, A0H.getBoolean("is_message_sampled")));
                statusConfirmMuteDialogFragment2.A1K();
                return;
            }
            throw C18270x1.A0S("statusesStatsManager");
        }
        throw C18270x1.A0S("statusManager");
    }

    public void A0a() {
        super.A0a();
        this.A02 = null;
    }

    public void A0p(Bundle bundle) {
        C85334Fv r1;
        super.A0p(bundle);
        try {
            C003203q A0Q = A0Q();
            if (!(A0Q instanceof C85334Fv) || (r1 = (C85334Fv) A0Q) == null) {
                C08310eF A0N = A0N();
                C162457s7.A0K(A0N, "null cannot be cast to non-null type com.whatsapp.status.StatusConfirmMuteDialogFragment.Host");
                r1 = (C85334Fv) A0N;
            }
            this.A02 = r1;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
