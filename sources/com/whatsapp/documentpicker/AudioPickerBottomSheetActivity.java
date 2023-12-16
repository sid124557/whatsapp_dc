package com.whatsapp.documentpicker;

import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import com.whatsapp.audiopicker.AudioPickerActivity;

public final class AudioPickerBottomSheetActivity extends AudioPickerActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A0A = C86624Kv.A0M(A2Y);
            this.A0L = C86614Ku.A0j(A2Y);
            this.A0E = C64333Db.A29(A2Y);
            this.A0B = C64333Db.A26(A2Y);
            this.A0C = C64333Db.A28(A2Y);
            this.A0M = AnonymousClass4SG.A2s(r1);
            this.A0G = C107695bk.A17(r1);
            this.A0H = C86604Kt.A0U(A2Y);
            this.A0N = C72343dZ.A00(r1.A8T);
            this.A0O = C72343dZ.A00(r1.AAW);
            this.A0F = C107695bk.A15(r1);
        }
    }

    public AudioPickerBottomSheetActivity(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 52);
    }

    public AudioPickerBottomSheetActivity() {
        this(0);
    }
}
