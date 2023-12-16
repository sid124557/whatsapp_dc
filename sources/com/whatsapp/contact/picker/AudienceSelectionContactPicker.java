package com.whatsapp.contact.picker;

import X.AnonymousClass0R2;
import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C16910uE;
import X.C379724t;
import X.C64333Db;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;

public final class AudienceSelectionContactPicker extends ContactPicker {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            C379724t.A00(this, r1.ALf());
            this.A03 = C86644Kx.A0L(A2Y);
            this.A0B = C86634Kw.A0m(A2Y);
            this.A02 = AnonymousClass4SG.A2d(A2Y);
            this.A0A = C64333Db.A4H(A2Y);
            this.A04 = C64333Db.A08(A2Y);
            this.A0C = C86614Ku.A0d(A2Y);
            this.A05 = C86614Ku.A0P(A2Y);
            this.A0D = C86614Ku.A0i(A2Y);
            this.A09 = C64333Db.A2r(A2Y);
        }
    }

    public AudienceSelectionContactPicker(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 34);
    }

    public AnonymousClass0R2 Bpz(C16910uE r2) {
        return null;
    }

    public AudienceSelectionContactPicker() {
        this(0);
    }
}
