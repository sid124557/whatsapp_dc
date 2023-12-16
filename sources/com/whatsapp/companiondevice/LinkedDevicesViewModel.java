package com.whatsapp.companiondevice;

import X.AnonymousClass001;
import X.AnonymousClass08N;
import X.AnonymousClass0x9;
import X.AnonymousClass33G;
import X.AnonymousClass49V;
import X.AnonymousClass4FS;
import X.AnonymousClass4IP;
import X.AnonymousClass4UC;
import X.C116985rC;
import X.C18270x1;
import X.C29041iB;
import X.C33411sx;
import X.C615631i;
import X.C627336j;
import X.C66653Mg;
import X.C69263Wi;
import android.app.Application;
import java.util.List;

public class LinkedDevicesViewModel extends AnonymousClass08N {
    public List A00 = AnonymousClass001.A0s();
    public final C116985rC A01;
    public final C69263Wi A02;
    public final AnonymousClass49V A03 = new AnonymousClass4IP(this, 0);
    public final C29041iB A04;
    public final C66653Mg A05;
    public final AnonymousClass4UC A06 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A07 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A08 = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A09 = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0A;

    public int A0D() {
        int i = 0;
        for (AnonymousClass33G r1 : this.A00) {
            if (!r1.A02() && !C627336j.A0L(r1.A07)) {
                i++;
            }
        }
        return i;
    }

    public LinkedDevicesViewModel(Application application, C116985rC r4, C69263Wi r5, C29041iB r6, C66653Mg r7, AnonymousClass4FS r8) {
        super(application);
        this.A02 = r5;
        this.A0A = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A01 = r4;
    }

    public void A0E() {
        if (C615631i.A02()) {
            C18270x1.A0w(new C33411sx(this.A01, this.A03, this.A04), this.A0A);
            return;
        }
        C69263Wi.A03(this.A02, this, 48);
    }
}
