package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass314;
import X.AnonymousClass33A;
import X.AnonymousClass3ZH;
import X.AnonymousClass4SG;
import X.AnonymousClass5QN;
import X.AnonymousClass68W;
import X.C06560Yg;
import X.C107695bk;
import X.C116985rC;
import X.C48952fk;
import X.C64333Db;
import X.C86654Ky;
import X.C86664Kz;
import X.C88744aj;
import X.C88834as;
import X.C89634eX;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class ListMembersSelector extends C89634eX {
    public C116985rC A00;
    public C116985rC A01;
    public C116985rC A02;
    public C48952fk A03;
    public AnonymousClass314 A04;
    public AnonymousClass33A A05;
    public boolean A06;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2X, r2, this, r2.A6O.get());
            C88744aj r12 = C88744aj.A00;
            this.A02 = r12;
            this.A03 = C86664Kz.A17(r2);
            this.A05 = (AnonymousClass33A) r2.A3X.get();
            this.A04 = (AnonymousClass314) r2.A6v.get();
            this.A01 = r12;
            this.A00 = r12;
        }
    }

    public void A7O(AnonymousClass5QN r3, AnonymousClass3ZH r4) {
        if (this.A03.A00(AnonymousClass3ZH.A07(r4))) {
            if (r4.A0y) {
                super.Ayk(r4);
            }
            C86654Ky.A1F(r3.A02);
            r3.A00("You can't add this business to a Broadcast list.", false);
            return;
        }
        super.A7O(r3, r4);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    public ListMembersSelector(int i) {
        this.A06 = false;
        AnonymousClass68W.A00(this, 38);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        supportActionBar.A0N(true);
        supportActionBar.A0B(R.string.f11nameremoved);
        if (bundle == null && !AnonymousClass4SG.A44(this) && !this.A0A.A00()) {
            RequestPermissionActivity.A0d(this, R.string.f11nameremoved, R.string.f11nameremoved, false);
        }
        C116985rC r1 = this.A00;
        if (r1.A07()) {
            r1.A04();
            C06560Yg.A02(this.A00, R.id.banner_container);
            throw AnonymousClass001.A0g("update");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C116985rC r1 = this.A01;
        if (r1.A07()) {
            r1.A04();
            this.A0f.size();
            throw AnonymousClass001.A0g("logCreationCancelAction");
        }
    }

    public ListMembersSelector() {
        this(0);
    }
}
