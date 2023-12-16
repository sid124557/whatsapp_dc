package com.whatsapp.polls;

import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C101085Dk;
import X.C101095Dl;
import X.C107695bk;
import X.C617532c;
import X.C64333Db;
import X.C88834as;

public class PollCreatorBottomSheetActivity extends PollCreatorActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A0E = (C617532c) r1.A9D.get();
            this.A0F = AnonymousClass4SG.A2s(r1);
            this.A08 = (C101085Dk) A2W.A1h.get();
            this.A09 = (C101095Dl) A2W.A1i.get();
            this.A0A = C107695bk.A15(r1);
        }
    }

    public PollCreatorBottomSheetActivity(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 69);
    }

    public PollCreatorBottomSheetActivity() {
        this(0);
    }
}
