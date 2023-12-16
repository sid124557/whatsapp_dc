package com.whatsapp.camera;

import X.AnonymousClass4SG;
import X.AnonymousClass68W;
import X.C107695bk;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C88834as;

public class LauncherCameraActivity extends CameraActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3E(A2W, r2, r1, C86624Kv.A0M(r2), this);
            this.A0A = C86614Ku.A0d(r2);
            this.A07 = C86614Ku.A0a(r2);
            this.A06 = C64333Db.A2r(r2);
            this.A05 = C107695bk.A15(r1);
            this.A0D = C86604Kt.A0f(r2);
            this.A0E = C72343dZ.A00(A2W.A4C);
        }
    }

    public LauncherCameraActivity(int i) {
        this.A00 = false;
        AnonymousClass68W.A00(this, 19);
    }

    public LauncherCameraActivity() {
        this(0);
    }
}
