package com.whatsapp.contact.picker;

import X.AnonymousClass2CN;
import X.AnonymousClass2ML;
import X.AnonymousClass4SG;
import X.C107695bk;
import X.C48852fa;
import X.C55302q8;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88744aj;
import X.C88834as;

public class PhoneContactsSelectorBottomSheet extends PhoneContactsSelector {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            AnonymousClass4SG.A3i(this);
            this.A0Q = C64333Db.A2q(r1);
            this.A07 = C88744aj.A00;
            this.A0A = (C48852fa) r3.ABc.get();
            this.A0I = C64333Db.A29(r1);
            this.A0D = C86614Ku.A0R(r1);
            this.A0E = C64333Db.A26(r1);
            this.A0F = C64333Db.A28(r1);
            this.A0S = C64333Db.A2t(r1);
            this.A08 = C86604Kt.A0N(r1);
            this.A0C = C86614Ku.A0P(r1);
            this.A0R = C64333Db.A2r(r1);
            this.A0X = AnonymousClass4SG.A2s(r3);
            this.A0B = C86624Kv.A0K(r1);
            this.A0W = (AnonymousClass2ML) r1.AIy.get();
            this.A0O = C107695bk.A17(r3);
            this.A0P = C86604Kt.A0U(r1);
            this.A0Y = C72343dZ.A00(r3.A8T);
            this.A0Z = C72343dZ.A00(r3.AAW);
            this.A0N = C107695bk.A15(r3);
            this.A09 = (AnonymousClass2CN) A2X.A3n.get();
            this.A0T = (C55302q8) r1.AaE.get();
        }
    }

    public PhoneContactsSelectorBottomSheet(int i) {
        this.A00 = false;
        C86604Kt.A1K(this, 35);
    }

    public PhoneContactsSelectorBottomSheet() {
        this(0);
    }
}
