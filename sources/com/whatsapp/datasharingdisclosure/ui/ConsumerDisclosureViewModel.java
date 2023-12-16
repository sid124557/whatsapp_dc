package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass20D;
import X.C05550Ty;
import X.C162457s7;
import X.C18270x1;
import X.C41782Lo;
import X.C46522bm;
import X.C54032o4;
import X.C616131n;
import X.C84814Du;
import X.C85494Gl;
import X.C95814uZ;
import com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1;

public final class ConsumerDisclosureViewModel extends C05550Ty {
    public final C54032o4 A00;

    public ConsumerDisclosureViewModel(C54032o4 r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A0D(C95814uZ r7, Boolean bool) {
        C54032o4 r4 = this.A00;
        C46522bm r5 = (C46522bm) r4.A0B.getValue();
        C41782Lo r3 = r5.A02;
        C18270x1.A0i(C18270x1.A04(r3.A01), "consumer_disclosure", r5.A00.A0H());
        C616131n.A02((C85494Gl) null, new ConsumerCtwaDisclosureRepository$ackConsumerDisclosure$1(r5, (C84814Du) null), r5.A04, (AnonymousClass20D) null, 3);
        if (r7 != null && bool != null) {
            r4.A00(r7, bool.booleanValue());
        }
    }
}
