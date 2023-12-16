package com.whatsapp.contact.picker;

import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;

public class ContactsAttachmentSelectorBottomSheet extends ContactsAttachmentSelector {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A03 = C64333Db.A2q(r2);
            this.A04 = C107695bk.A5c(r1);
            this.A01 = C86604Kt.A0N(r2);
            this.A05 = AnonymousClass4SG.A2s(r1);
        }
    }

    public ContactsAttachmentSelectorBottomSheet(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 37);
    }

    public ContactsAttachmentSelectorBottomSheet() {
        this(0);
    }
}
