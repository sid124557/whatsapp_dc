package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass08N;
import X.AnonymousClass3QD;
import X.AnonymousClass4UC;
import X.AnonymousClass90F;
import X.AnonymousClass9AM;
import X.C153527bU;
import X.C162457s7;
import X.C166557yt;
import X.C18260x0;
import X.C18290x4;
import X.C196629bS;
import X.C56972sr;
import android.app.Application;
import com.whatsapp.Me;
import com.whatsapp.R;

public final class IndiaUpiMapperLinkViewModel extends AnonymousClass08N {
    public C56972sr A00;
    public C196629bS A01;
    public final Application A02;
    public final AnonymousClass9AM A03;
    public final C153527bU A04;
    public final AnonymousClass4UC A05 = new AnonymousClass4UC();
    public final String A06;
    public final String A07;
    public final String A08;

    public final void A0D(boolean z) {
        String str;
        String str2;
        AnonymousClass9AM r4 = this.A03;
        C196629bS r0 = this.A01;
        String A0C = r0.A0C();
        if (A0C == null) {
            A0C = "";
        }
        C166557yt A042 = r0.A04();
        AnonymousClass3QD A002 = AnonymousClass3QD.A00();
        C56972sr r02 = this.A00;
        r02.A0P();
        Me me = r02.A00;
        if (me != null) {
            str = me.number;
        } else {
            str = null;
        }
        C166557yt r6 = new C166557yt(A002, String.class, str, "upiAlias");
        if (z) {
            str2 = "port";
        } else {
            str2 = "add";
        }
        r4.A01(A042, r6, new AnonymousClass90F(this, 0), A0C, "mobile_number", str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndiaUpiMapperLinkViewModel(Application application, C56972sr r3, C196629bS r4, AnonymousClass9AM r5, C153527bU r6) {
        super(application);
        C18260x0.A0V(application, r4, r3);
        C162457s7.A0J(r6, 5);
        this.A02 = application;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = C18290x4.A0l(application, R.string.f11nameremoved);
        this.A06 = C18290x4.A0l(application, R.string.f11nameremoved);
        this.A08 = C18290x4.A0l(application, R.string.f11nameremoved);
    }
}
