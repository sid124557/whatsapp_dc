package com.whatsapp.phonematching;

import X.AnonymousClass4FN;
import X.C111095hX;
import X.C18810yI;
import X.C44572Wo;
import X.C56972sr;
import X.C626936e;
import X.C89644eZ;
import android.content.Context;
import android.os.Bundle;

public class MatchPhoneNumberFragment extends Hilt_MatchPhoneNumberFragment {
    public C56972sr A00;
    public C89644eZ A01;
    public C18810yI A02;
    public final C44572Wo A03 = new C44572Wo(this);

    public void A0a() {
        C18810yI r0 = this.A02;
        r0.A00.BrP(this.A03);
        this.A02.removeMessages(4);
        this.A0D = null;
        super.A0a();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C18810yI r0 = this.A02;
        r0.A00.Big(this.A03);
        this.A0D = this;
    }

    public void A1G(Context context) {
        super.A1G(context);
        C89644eZ r0 = (C89644eZ) C111095hX.A03(context, C89644eZ.class);
        this.A01 = r0;
        C626936e.A0D(r0 instanceof AnonymousClass4FN, "activity needs to implement PhoneNumberMatchingCallback");
        C89644eZ r2 = this.A01;
        AnonymousClass4FN r1 = (AnonymousClass4FN) r2;
        if (this.A02 == null) {
            this.A02 = new C18810yI(r2, r1);
        }
    }
}
