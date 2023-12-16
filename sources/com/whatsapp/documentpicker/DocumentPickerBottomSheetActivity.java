package com.whatsapp.documentpicker;

import X.AnonymousClass4SG;
import X.AnonymousClass5MZ;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C113965mH;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86664Kz;

public final class DocumentPickerBottomSheetActivity extends DocumentPickerActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A0C = C64333Db.A29(A2Y);
            this.A08 = C64333Db.A26(A2Y);
            this.A0A = C64333Db.A28(A2Y);
            this.A0I = C64333Db.A2t(A2Y);
            this.A0K = (C113965mH) r1.A3h.get();
            this.A0G = C86664Kz.A18(A2Y);
            this.A09 = C86614Ku.A0T(A2Y);
            this.A0N = AnonymousClass4SG.A2s(r1);
            this.A0H = C64333Db.A2r(A2Y);
            this.A0L = (AnonymousClass5MZ) r1.A7L.get();
            this.A0E = C107695bk.A17(r1);
            this.A0F = C86604Kt.A0U(A2Y);
            this.A0P = C72343dZ.A00(r1.A8T);
            this.A0Q = C72343dZ.A00(r1.AAW);
            this.A0D = C107695bk.A15(r1);
        }
    }

    public DocumentPickerBottomSheetActivity(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 54);
    }

    public DocumentPickerBottomSheetActivity() {
        this(0);
    }
}
