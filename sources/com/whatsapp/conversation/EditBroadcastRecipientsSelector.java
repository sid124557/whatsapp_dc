package com.whatsapp.conversation;

import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass5QN;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C48952fk;
import X.C64333Db;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89634eX;

public class EditBroadcastRecipientsSelector extends C89634eX {
    public C48952fk A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A00 = C86664Kz.A17(r2);
        }
    }

    public void A7O(AnonymousClass5QN r3, AnonymousClass3ZH r4) {
        if (this.A00.A00(AnonymousClass3ZH.A07(r4))) {
            if (r4.A0y) {
                super.Ayk(r4);
            }
            C86654Ky.A1F(r3.A02);
            r3.A00("You can't add this business to a Broadcast list.", false);
            return;
        }
        super.A7O(r3, r4);
    }

    public EditBroadcastRecipientsSelector(int i) {
        this.A01 = false;
        AnonymousClass68W.A00(this, 39);
    }

    public EditBroadcastRecipientsSelector() {
        this(0);
    }
}
