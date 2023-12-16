package com.whatsapp.status.advertise;

import X.AnonymousClass001;
import X.AnonymousClass0XV;
import X.AnonymousClass33p;
import X.AnonymousClass588;
import X.AnonymousClass5Z6;
import X.C05550Ty;
import X.C116985rC;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C986752u;
import X.C997157s;

public final class UpdatesAdvertiseViewModel extends C05550Ty {
    public final AnonymousClass0XV A00;
    public final C116985rC A01;
    public final AnonymousClass33p A02;
    public final AnonymousClass5Z6 A03;

    public final void A0D(C986752u r4) {
        if (r4.A00 == C997157s.Banner) {
            C18270x1.A0l(C18270x1.A03(this.A02), "pref_advertise_banner_status_main_shown", true);
            this.A03.A02(AnonymousClass588.ADVERTISE);
        }
        C116985rC r1 = this.A01;
        if (r1.A07()) {
            r1.A04();
            throw AnonymousClass001.A0g("logStatusEntryPointImpression");
        }
    }

    public UpdatesAdvertiseViewModel(AnonymousClass0XV r2, C116985rC r3, AnonymousClass33p r4, AnonymousClass5Z6 r5) {
        C18260x0.A0Q(r4, r2);
        C162457s7.A0J(r5, 4);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
