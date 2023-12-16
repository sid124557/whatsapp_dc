package com.whatsapp.location;

import X.AnonymousClass4SG;
import X.C107695bk;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C86664Kz;

public class LocationPickerBottomSheet extends LocationPicker {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0G = C64333Db.A2q(A2Y);
            this.A0I = C64333Db.A39(A2Y);
            this.A09 = C64333Db.A07(A2Y);
            this.A0M = C64333Db.A4H(A2Y);
            this.A0A = C64333Db.A08(A2Y);
            this.A0N = C86654Ky.A0Y(A2Y);
            this.A0K = C86604Kt.A0X(A2Y);
            this.A0J = C107695bk.A1m(r1);
            this.A0R = C86614Ku.A0b(A2Y);
            this.A0B = C86614Ku.A0R(A2Y);
            this.A0V = C86604Kt.A0e(A2Y);
            this.A0U = C64333Db.A8F(A2Y);
            this.A0D = C86664Kz.A17(A2Y);
            this.A0S = C86614Ku.A0d(A2Y);
            this.A0L = C107695bk.A1n(r1);
            this.A0C = C86614Ku.A0T(A2Y);
            this.A0H = C64333Db.A2r(A2Y);
            this.A08 = AnonymousClass4SG.A2Z(A2Y);
            this.A0W = AnonymousClass4SG.A2s(r1);
            this.A0Q = C86664Kz.A1D(A2Y);
            this.A0T = C64333Db.A74(A2Y);
            this.A0E = C86624Kv.A0P(A2Y);
            this.A0F = C107695bk.A15(r1);
        }
    }

    public LocationPickerBottomSheet(int i) {
        this.A00 = false;
        C86604Kt.A1K(this, 60);
    }

    public LocationPickerBottomSheet() {
        this(0);
    }
}
