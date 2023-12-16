package com.whatsapp.calling.psa.view;

import X.AnonymousClass0IT;
import X.AnonymousClass0IV;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass66R;
import X.C18330xA;
import X.C616131n;
import X.C64333Db;
import X.C77213t2;
import X.C77223t3;
import X.C80143xl;
import X.C84814Du;
import X.C85494Gl;
import X.C89654ea;
import android.os.Bundle;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1;

public final class GroupCallPsaActivity extends C89654ea {
    public boolean A00;
    public final AnonymousClass66R A01;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            AnonymousClass1Hf.A2F(A002, this);
        }
    }

    public GroupCallPsaActivity(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        C616131n.A02((C85494Gl) null, new GroupCallPsaActivity$onCreate$1(this, (C84814Du) null), AnonymousClass0IT.A00(this), (AnonymousClass20D) null, 3);
        GroupCallPsaViewModel groupCallPsaViewModel = (GroupCallPsaViewModel) this.A01.getValue();
        C616131n.A02((C85494Gl) null, new GroupCallPsaViewModel$fetchSuggestions$1(groupCallPsaViewModel, (C84814Du) null), AnonymousClass0IV.A00(groupCallPsaViewModel), (AnonymousClass20D) null, 3);
    }

    public GroupCallPsaActivity() {
        this(0);
        this.A01 = C18330xA.A02(new C77223t3(this), new C77213t2(this), new C80143xl(this), AnonymousClass0x9.A1E(GroupCallPsaViewModel.class));
    }
}
