package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass09N;
import X.AnonymousClass0R8;
import X.AnonymousClass0UY;
import X.AnonymousClass1VX;
import X.AnonymousClass2UT;
import X.AnonymousClass30V;
import X.AnonymousClass39E;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4Tu;
import X.AnonymousClass4XL;
import X.AnonymousClass4XR;
import X.AnonymousClass5CS;
import X.AnonymousClass5UW;
import X.AnonymousClass5V0;
import X.AnonymousClass6C6;
import X.AnonymousClass7KG;
import X.AnonymousClass7SV;
import X.AnonymousClass800;
import X.AnonymousClass93K;
import X.C100385As;
import X.C101195Dv;
import X.C103115Lp;
import X.C104205Qb;
import X.C104975Tb;
import X.C105145Tt;
import X.C105255Ue;
import X.C106875aJ;
import X.C107695bk;
import X.C110655go;
import X.C113905mB;
import X.C1231767k;
import X.C151257Ua;
import X.C152967aS;
import X.C154197cm;
import X.C181728nE;
import X.C181798nL;
import X.C18320x8;
import X.C189028zs;
import X.C19340zH;
import X.C29201iR;
import X.C56972sr;
import X.C620433g;
import X.C620733j;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C87604Ty;
import X.C88694ab;
import X.C88834as;
import X.C89644eZ;
import X.C989453v;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public class ProductListActivity extends C89644eZ {
    public View A00;
    public AnonymousClass043 A01;
    public AnonymousClass043 A02;
    public RecyclerView A03;
    public C88694ab A04;
    public C101195Dv A05;
    public C620433g A06;
    public C29201iR A07;
    public AnonymousClass5UW A08;
    public C154197cm A09;
    public C181728nE A0A;
    public C87604Ty A0B;
    public AnonymousClass7KG A0C;
    public C105145Tt A0D;
    public C104205Qb A0E;
    public C151257Ua A0F;
    public C181798nL A0G;
    public AnonymousClass4XL A0H;
    public AnonymousClass4Tu A0I;
    public C104975Tb A0J;
    public C113905mB A0K;
    public UserJid A0L;
    public C103115Lp A0M;
    public C105255Ue A0N;
    public AnonymousClass7SV A0O;
    public AnonymousClass30V A0P;
    public WDSButton A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public final AnonymousClass2UT A0W;

    public void A5r() {
        if (!this.A0S) {
            this.A0S = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            this.A0N = C86644Kx.A0a(r1);
            this.A08 = (AnonymousClass5UW) r1.A4T.get();
            this.A07 = (C29201iR) r1.A4U.get();
            this.A0M = (C103115Lp) r3.A8P.get();
            this.A0K = C86644Kx.A0T(r1);
            this.A0F = (C151257Ua) r3.A2I.get();
            this.A0E = (C104205Qb) r1.ARe.get();
            this.A0D = C86644Kx.A0P(r1);
            this.A0A = (C181728nE) A2W.A1C.get();
            this.A0O = (AnonymousClass7SV) r3.A2J.get();
            this.A09 = new C154197cm();
            this.A05 = (C101195Dv) A2W.A1u.get();
            this.A06 = C86624Kv.A0K(r1);
            this.A0J = r1.AhS();
            this.A0G = (C181798nL) A2W.A1N.get();
            this.A0P = C86604Kt.A0f(r1);
        }
    }

    public void A66() {
        if (this.A0D.A0X(6715)) {
            this.A0P.A03(this.A0L, 60);
        }
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public final void A74() {
        View findViewById;
        int A012;
        if (this.A0T) {
            findViewById = findViewById(R.id.shadow_bottom);
            A012 = 8;
        } else {
            boolean canScrollVertically = this.A03.canScrollVertically(1);
            findViewById = findViewById(R.id.shadow_bottom);
            A012 = C86634Kw.A01(canScrollVertically ? 1 : 0);
        }
        findViewById.setVisibility(A012);
    }

    public final void A75() {
        WDSButton wDSButton = this.A0Q;
        Object[] A0L2 = AnonymousClass002.A0L();
        A0L2[0] = this.A0R;
        AnonymousClass001.A0y(this, wDSButton, A0L2, R.string.f11nameremoved);
        if (this.A0T || !this.A0H.B5J()) {
            this.A0Q.setVisibility(8);
        } else {
            this.A0Q.setVisibility(0);
        }
    }

    public void onResume() {
        this.A0I.A0D();
        this.A0I.A06.A00();
        super.onResume();
    }

    public ProductListActivity(int i) {
        this.A0S = false;
        C86604Kt.A1K(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0N.A02(774777097, "plm_details_view_tag", "ProductListActivity");
        setContentView((int) R.layout.f8nameremoved);
        String stringExtra = getIntent().getStringExtra("message_title");
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(stringExtra);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0i(false);
        A002.A0T(R.string.f11nameremoved);
        C86614Ku.A1O(A002, this, 15, R.string.f11nameremoved);
        this.A01 = A002.create();
        C19340zH A003 = AnonymousClass5V0.A00(this);
        A003.A0i(false);
        A003.A0T(R.string.f11nameremoved);
        C86614Ku.A1O(A003, this, 16, R.string.f11nameremoved);
        this.A02 = A003.create();
        this.A07.A06(this.A0W);
        AnonymousClass39E r6 = (AnonymousClass39E) getIntent().getParcelableExtra("message_content");
        UserJid userJid = r6.A00;
        this.A0L = userJid;
        AnonymousClass4Tu r1 = (AnonymousClass4Tu) AnonymousClass4L0.A0F(new C110655go(this.A05, this.A0G.Azv(userJid), userJid, this.A0M, r6), this).A01(AnonymousClass4Tu.class);
        this.A0I = r1;
        AnonymousClass6C6.A01(this, r1.A06.A03, 18);
        this.A0B = (C87604Ty) C86604Kt.A0L(this, this.A0A, this.A0L);
        this.A00 = findViewById(R.id.no_internet_container);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f6nameremoved);
        this.A00.setPadding(dimensionPixelOffset, getResources().getDimensionPixelOffset(R.dimen.f6nameremoved), dimensionPixelOffset, 0);
        C18320x8.A15(findViewById(R.id.no_internet_retry_button), this, 35);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0Q = wDSButton;
        C18320x8.A15(wDSButton, this, 36);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.product_list);
        this.A03 = recyclerView;
        AnonymousClass0UY r2 = recyclerView.A0R;
        if (r2 instanceof AnonymousClass09N) {
            ((AnonymousClass09N) r2).A00 = false;
        }
        recyclerView.A0o(new AnonymousClass4XR());
        AnonymousClass1VX r10 = this.A0D;
        C56972sr r5 = this.A01;
        C620733j r9 = this.A00;
        C106875aJ r8 = new C106875aJ(this, 1);
        UserJid userJid2 = this.A0L;
        AnonymousClass4XL r4 = new AnonymousClass4XL(r5, new C152967aS(this.A0F, this.A0O), this.A0J, r8, r9, r10, userJid2);
        this.A0H = r4;
        this.A03.setAdapter(r4);
        this.A03.A0W = new AnonymousClass93K(1);
        C86604Kt.A1M(this, this.A0I.A01, 26);
        AnonymousClass6C6.A01(this, this.A0I.A00, 19);
        C1231767k.A00(this.A03, this, 1);
        AnonymousClass5CS.A00(this.A03, this, 0);
        this.A0U = false;
        this.A0K.A03(new AnonymousClass800(0), this.A0L);
        this.A0C = this.A0D.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        menu.findItem(R.id.menu_share).setVisible(false);
        findItem.setVisible(false);
        MenuItem findItem2 = menu.findItem(R.id.menu_cart);
        findItem2.setVisible(false);
        C989453v.A00(AnonymousClass4SG.A2Q(findItem2), this, 17);
        TextView A092 = AnonymousClass002.A09(findItem2.getActionView(), R.id.cart_total_quantity);
        String str = this.A0R;
        if (str != null) {
            A092.setText(str);
        }
        C100385As.A00(this, this.A0B.A00, findItem2, 1);
        this.A0B.A0E();
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.A07(this.A0W);
        this.A0N.A06("plm_details_view_tag", false);
    }

    public void onStop() {
        super.onStop();
        this.A0U = false;
    }

    public ProductListActivity() {
        this(0);
        this.A0T = true;
        this.A0W = new C189028zs(this, 1);
    }
}
