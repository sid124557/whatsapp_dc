package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass3DZ;
import X.AnonymousClass4DI;
import X.AnonymousClass5Yj;
import X.AnonymousClass9Bz;
import X.AnonymousClass9EW;
import X.AnonymousClass9UF;
import X.C05570Ua;
import X.C107695bk;
import X.C160757oG;
import X.C18290x4;
import X.C1899593h;
import X.C191309Ek;
import X.C191379Er;
import X.C197109ca;
import X.C199649gv;
import X.C204019og;
import X.C205049qL;
import X.C29271iY;
import X.C64333Db;
import X.C86604Kt;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;

public class IndiaUpiMandateHistoryActivity extends AnonymousClass9Bz {
    public AnonymousClass4DI A00;
    public C29271iY A01;
    public C197109ca A02;
    public IndiaUpiMandateHistoryViewModel A03;
    public boolean A04;
    public final C160757oG A05;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A02 = C1899593h.A0L(A002);
            this.A01 = (C29271iY) A002.AQ0.get();
        }
    }

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            A0R.setBackgroundColor(C18290x4.A0G(A0R).getColor(AnonymousClass5Yj.A01(A0R.getContext())));
            return new AnonymousClass9EW(A0R);
        } else if (i == 1003) {
            return new C191379Er(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        } else {
            if (i != 1007) {
                return super.A74(viewGroup, i);
            }
            return new C191309Ek(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
    }

    public void onDestroy() {
        this.A01.A07(this.A00);
        super.onDestroy();
    }

    public IndiaUpiMandateHistoryActivity(int i) {
        this.A04 = false;
        C204019og.A00(this, 66);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A03.A05.BKC(1, 1, "mandate_payment_screen", "payment_home", true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0o(supportActionBar, getString(R.string.f11nameremoved));
        }
        this.A05.A06("onCreate");
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = (IndiaUpiMandateHistoryViewModel) new AnonymousClass0XL(this).A01(IndiaUpiMandateHistoryViewModel.class);
        this.A03 = indiaUpiMandateHistoryViewModel;
        indiaUpiMandateHistoryViewModel.A06.BkM(new C199649gv(indiaUpiMandateHistoryViewModel));
        indiaUpiMandateHistoryViewModel.A05.BKC(C18290x4.A0Z(), (Integer) null, "mandate_payment_screen", "payment_home", true);
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel2 = this.A03;
        indiaUpiMandateHistoryViewModel2.A00.A0B(this, C205049qL.A00(this, 25));
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel3 = this.A03;
        indiaUpiMandateHistoryViewModel3.A02.A0B(this, C205049qL.A00(this, 26));
        AnonymousClass9UF r1 = new AnonymousClass9UF(this, 2);
        this.A00 = r1;
        this.A01.A06(r1);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A03.A05.BKC(1, 1, "mandate_payment_screen", "payment_home", true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMandateHistoryActivity() {
        this(0);
        this.A05 = C160757oG.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");
    }
}
