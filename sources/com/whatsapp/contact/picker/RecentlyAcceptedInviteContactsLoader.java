package com.whatsapp.contact.picker;

import X.C18260x0;
import X.C27991fJ;
import X.C59972xn;
import X.C616131n;
import X.C64773Ex;
import X.C73853gB;
import X.C84434Ci;
import X.C84814Du;

public final class RecentlyAcceptedInviteContactsLoader implements C84434Ci {
    public final C64773Ex A00;
    public final C59972xn A01;

    public Object BJp(C27991fJ r3, C84814Du r4, C73853gB r5) {
        return C616131n.A00(r4, r5, new RecentlyAcceptedInviteContactsLoader$loadContacts$2(this, (C84814Du) null));
    }

    public String B8w() {
        return "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader";
    }

    public RecentlyAcceptedInviteContactsLoader(C64773Ex r1, C59972xn r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
