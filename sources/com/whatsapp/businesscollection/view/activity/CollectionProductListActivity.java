package com.whatsapp.businesscollection.view.activity;

import X.AnonymousClass0R8;
import X.AnonymousClass1Hf;
import X.AnonymousClass30V;
import X.AnonymousClass4SG;
import X.AnonymousClass5QB;
import X.AnonymousClass5UW;
import X.AnonymousClass5Y9;
import X.C08310eF;
import X.C103115Lp;
import X.C104975Tb;
import X.C105405Uu;
import X.C107695bk;
import X.C150937Su;
import X.C154197cm;
import X.C154297cw;
import X.C181728nE;
import X.C181798nL;
import X.C181818nN;
import X.C1894391h;
import X.C29201iR;
import X.C29221iT;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C90604hu;
import android.os.Bundle;
import android.view.Menu;
import com.whatsapp.R;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

public class CollectionProductListActivity extends C90604hu implements C181818nN {
    public C150937Su A00;
    public C104975Tb A01;
    public C154297cw A02;
    public AnonymousClass30V A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            this.A07 = A2W.ABU();
            this.A0P = C86644Kx.A0a(r1);
            this.A05 = (AnonymousClass5UW) r1.A4T.get();
            this.A04 = (C29201iR) r1.A4U.get();
            this.A0E = (AnonymousClass5Y9) r1.A4Y.get();
            this.A0J = C64333Db.A26(r1);
            this.A0O = (C103115Lp) r3.A8P.get();
            this.A0L = C64333Db.A28(r1);
            this.A0M = C86654Ky.A0Z(r1);
            this.A0B = (C105405Uu) r1.A4W.get();
            this.A0K = C86614Ku.A0T(r1);
            this.A0D = C86644Kx.A0P(r1);
            this.A08 = (C181728nE) A2W.A1C.get();
            this.A0F = A2W.ABV();
            this.A0A = (C29221iT) r1.ARg.get();
            this.A0C = (AnonymousClass5QB) r3.A2H.get();
            this.A03 = C86624Kv.A0K(r1);
            this.A06 = new C154197cm();
            this.A0G = (C181798nL) A2W.A1N.get();
            this.A00 = A2W.ABW();
            this.A02 = new C154297cw();
            this.A01 = r1.AhS();
            this.A03 = C86604Kt.A0f(r1);
        }
    }

    public void A66() {
        if (this.A0D.A0X(6715)) {
            this.A03.A03(this.A0N, 60);
        }
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public void BOa() {
        this.A0H.A05.A00();
    }

    public CollectionProductListActivity(int i) {
        this.A04 = false;
        C86604Kt.A1K(this, 21);
    }

    public void onBackPressed() {
        C08310eF A0D = getSupportFragmentManager().A0D("CatalogSearchFragmentTag");
        if (A0D == null || !(A0D instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0D).A1O()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86664Kz.A0o(this, R.id.stub_toolbar_search).inflate();
        setSupportActionBar(AnonymousClass1Hf.A28(this));
        String str = this.A0U;
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            if (str != null) {
                supportActionBar.A0J(str);
            }
        }
        this.A00.A00(new C1894391h(this, 1), this.A0N);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public CollectionProductListActivity() {
        this(0);
    }
}
