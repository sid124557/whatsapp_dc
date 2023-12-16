package com.whatsapp.community;

import X.C18260x0;
import X.C27991fJ;
import X.C56942so;
import X.C56972sr;
import X.C56982ss;
import X.C616131n;
import X.C64773Ex;
import X.C72063d7;
import X.C73853gB;
import X.C84384Cd;
import X.C84434Ci;
import X.C84814Du;

public final class DirectoryContactsLoader implements C84434Ci {
    public final C56972sr A00;
    public final C56942so A01;
    public final C84384Cd A02;
    public final C64773Ex A03;
    public final C56982ss A04;

    public String B8w() {
        return "com.whatsapp.community.DirectoryContactsLoader";
    }

    public Object BJp(C27991fJ r3, C84814Du r4, C73853gB r5) {
        if (r3 == null) {
            return C72063d7.A00;
        }
        return C616131n.A00(r4, r5, new DirectoryContactsLoader$loadContacts$2(this, r3, (C84814Du) null));
    }

    public DirectoryContactsLoader(C56972sr r1, C56942so r2, C84384Cd r3, C64773Ex r4, C56982ss r5) {
        C18260x0.A0f(r1, r5, r4, r3, r2);
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
