package com.whatsapp.calling.schedulecall.upcomingcalls.view;

import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass4HY;
import X.C06560Yg;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C1230066r;
import X.C18270x1;
import X.C18280x3;
import X.C195311n;
import X.C55422qK;
import X.C56892sj;
import X.C64333Db;
import X.C64773Ex;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;
import com.whatsapp.util.Log;

public class UpcomingScheduledCallsActivity extends C89644eZ {
    public RecyclerView A00;
    public C1230066r A01;
    public C195311n A02;
    public UpcomingActivityViewModel A03;
    public C64773Ex A04;
    public C105365Uq A05;
    public C114015mM A06;
    public C56892sj A07;
    public C55422qK A08;
    public boolean A09;
    public boolean A0A;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A02 = A0I.ABl();
            this.A01 = (C1230066r) r1.A4Q.get();
            this.A04 = C64333Db.A26(r1);
            this.A06 = C64333Db.A29(r1);
            this.A07 = C64333Db.A3G(r1);
            this.A08 = (C55422qK) r1.AUG.get();
        }
    }

    public void A65() {
        Log.d("UpcomingScheduledCallsActivity/onActivityCreateAsync");
        this.A03.A0D();
    }

    public UpcomingScheduledCallsActivity(int i) {
        this.A09 = false;
        AnonymousClass4HY.A00(this, 26);
    }

    public boolean A6B() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1Ha.A1m(this, R.layout.f8nameremoved).A0B(R.string.f11nameremoved);
        this.A05 = this.A06.A06(this, "upcoming-activity-single");
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(this.A00, R.id.upcoming_recyclyerView);
        this.A00 = recyclerView;
        C18270x1.A0u(recyclerView);
        C195311n r1 = this.A02;
        r1.A00 = this.A05;
        this.A00.setAdapter(r1);
        UpcomingActivityViewModel upcomingActivityViewModel = (UpcomingActivityViewModel) AnonymousClass0x9.A0H(this).A01(UpcomingActivityViewModel.class);
        this.A03 = upcomingActivityViewModel;
        AnonymousClass1Ha.A21(this, upcomingActivityViewModel.A0A, 18);
    }

    public void onDestroy() {
        super.onDestroy();
        C105365Uq r0 = this.A05;
        if (r0 != null) {
            r0.A00();
            this.A02.A00 = null;
        }
    }

    public UpcomingScheduledCallsActivity() {
        this(0);
        this.A0A = true;
    }
}
