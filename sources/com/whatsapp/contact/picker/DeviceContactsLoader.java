package com.whatsapp.contact.picker;

import X.C162457s7;
import X.C27991fJ;
import X.C616131n;
import X.C64773Ex;
import X.C73853gB;
import X.C84434Ci;
import X.C84814Du;

public final class DeviceContactsLoader implements C84434Ci {
    public final C64773Ex A00;

    public DeviceContactsLoader(C64773Ex r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public Object BJp(C27991fJ r3, C84814Du r4, C73853gB r5) {
        return C616131n.A00(r4, r5, new DeviceContactsLoader$loadContacts$2(this, (C84814Du) null));
    }

    public String B8w() {
        return "com.whatsapp.contact.picker.DeviceContactsLoader";
    }
}
