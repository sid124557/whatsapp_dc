package com.whatsapp.group;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0YY;
import X.AnonymousClass0x9;
import X.AnonymousClass3ZH;
import X.AnonymousClass4AQ;
import X.AnonymousClass4SG;
import X.AnonymousClass4WR;
import X.AnonymousClass552;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass681;
import X.AnonymousClass6DB;
import X.AnonymousClass901;
import X.C05630Ug;
import X.C105365Uq;
import X.C107155an;
import X.C107335b8;
import X.C107695bk;
import X.C114015mM;
import X.C159487lv;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C189058zv;
import X.C1892290m;
import X.C27991fJ;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C42892Px;
import X.C50932j0;
import X.C54232oO;
import X.C55702qm;
import X.C56602sG;
import X.C56892sj;
import X.C56972sr;
import X.C60842zG;
import X.C620733j;
import X.C620833k;
import X.C626936e;
import X.C635339p;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88584aE;
import X.C89644eZ;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

public class GroupAdminPickerActivity extends C89644eZ {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public SearchView A05;
    public BottomSheetBehavior A06;
    public AnonymousClass64J A07;
    public C29301ib A08;
    public C64773Ex A09;
    public C29421in A0A;
    public AnonymousClass5ZU A0B;
    public C105365Uq A0C;
    public C114015mM A0D;
    public C620733j A0E;
    public C56892sj A0F;
    public C42892Px A0G;
    public AnonymousClass552 A0H;
    public AnonymousClass4WR A0I;
    public C50932j0 A0J;
    public C29241iV A0K;
    public C27991fJ A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public List A0Q;
    public boolean A0R;
    public final View.OnClickListener A0S;
    public final C54232oO A0T;
    public final C56602sG A0U;
    public final AnonymousClass4AQ A0V;
    public final C55702qm A0W;

    public final void A77(String str) {
        this.A0M = str;
        C18290x4.A1L(this.A0H);
        AnonymousClass552 r1 = new AnonymousClass552(this.A0B, this.A0E, this, str, this.A0Q);
        this.A0H = r1;
        C18270x1.A0w(r1, this.A04);
    }

    public final boolean A78(UserJid userJid) {
        if (userJid != null) {
            Iterator it = this.A0Q.iterator();
            while (it.hasNext()) {
                if (userJid.equals(AnonymousClass3ZH.A06(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A5r() {
        if (!this.A0R) {
            this.A0R = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A0D = C64333Db.A29(A2Y);
            this.A09 = C64333Db.A26(A2Y);
            this.A0B = C64333Db.A28(A2Y);
            this.A0E = C64333Db.A2t(A2Y);
            this.A0A = C86614Ku.A0S(A2Y);
            this.A08 = C86624Kv.A0N(A2Y);
            this.A0G = (C42892Px) A2Y.AXK.get();
            this.A0J = C86664Kz.A1A(A2Y);
            this.A0F = C64333Db.A3G(A2Y);
            this.A0K = C86624Kv.A0T(A2Y);
            this.A07 = C86614Ku.A0N(A2Y);
        }
    }

    public final void A75() {
        this.A02.setPadding(0, 0, 0, 0);
        AnonymousClass001.A0W(this.A02).A01((C05630Ug) null);
        this.A00.setColor(C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A05.A09();
        this.A04.setVisibility(8);
        this.A03.setVisibility(0);
    }

    public final void A76() {
        C620833k A012;
        if (this.A0P == null || this.A0N == null) {
            C56892sj r1 = this.A0F;
            C27991fJ r0 = this.A0L;
            C626936e.A06(r0);
            A012 = C56892sj.A01(r1, r0);
        } else {
            C42892Px r02 = this.A0G;
            A012 = (C620833k) r02.A03.get(this.A0L);
        }
        this.A0Q = C18290x4.A0z(A012.A09);
        Iterator it = A012.A0D().iterator();
        while (it.hasNext()) {
            C56972sr r03 = this.A01;
            UserJid userJid = ((C60842zG) it.next()).A03;
            if (!r03.A0a(userJid)) {
                this.A0Q.add(this.A09.A0A(userJid));
            }
        }
    }

    public void onBackPressed() {
        if (this.A03.getVisibility() == 0) {
            A74();
        } else {
            this.A06.A0S(4);
        }
    }

    public GroupAdminPickerActivity(int i) {
        this.A0R = false;
        C86604Kt.A1K(this, 44);
    }

    public final void A74() {
        this.A02.setPadding(0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
        AnonymousClass001.A0W(this.A02).A01(this.A06);
        this.A00.setColor(2130706432);
        this.A04.setVisibility(0);
        this.A03.setVisibility(8);
        A77((String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass4SG.A37(this);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A02 = findViewById;
        this.A06 = BottomSheetBehavior.A01(findViewById);
        C86614Ku.A1J(this.A02.getViewTreeObserver(), this, 7);
        this.A01 = findViewById(R.id.background);
        PointF pointF = new PointF();
        C18310x6.A19(this.A01, this, pointF, 11);
        C86654Ky.A19(this.A01, pointF, 9);
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        AnonymousClass0YY.A04(colorDrawable, this.A01);
        AlphaAnimation A0H2 = C86604Kt.A0H();
        A0H2.setDuration((long) getResources().getInteger(17694720));
        this.A01.startAnimation(A0H2);
        this.A06.A0a(new C88584aE(this, C86634Kw.A03(this)));
        this.A04 = findViewById(R.id.title_holder);
        View A2R = AnonymousClass4SG.A2R(this);
        this.A03 = A2R;
        A2R.setBackgroundResource(R.drawable.search_background);
        SearchView searchView = (SearchView) this.A03.findViewById(R.id.search_view);
        this.A05 = searchView;
        AnonymousClass5Yj.A0B(this, AnonymousClass002.A09(searchView, R.id.search_src_text), R.attr.f3nameremoved, R.color.f5nameremoved);
        this.A05.setIconifiedByDefault(false);
        this.A05.setQueryHint(getString(R.string.f11nameremoved));
        AnonymousClass0x9.A0F(this.A05, R.id.search_mag_icon).setImageDrawable(new AnonymousClass6DB(AnonymousClass0RP.A00(this, R.drawable.ic_back), this));
        this.A05.A0B = new C159487lv(this, 2);
        ImageView A0F2 = AnonymousClass0x9.A0F(this.A03, R.id.search_back);
        C86614Ku.A1B(C107335b8.A04(this, R.drawable.ic_back, R.color.f5nameremoved), A0F2, this.A0E);
        C18310x6.A18(A0F2, this, 26);
        C635339p.A00(findViewById(R.id.search_btn), this, 42);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        C18270x1.A0u(recyclerView);
        this.A0C = this.A0D.A06(this, "group-admin-picker-activity");
        C27991fJ A0k = C86634Kw.A0k(getIntent(), "gid");
        C626936e.A06(A0k);
        this.A0L = A0k;
        this.A0P = getIntent().getStringExtra("subgroup_subject");
        this.A0O = getIntent().getStringExtra("subgroup_request_message");
        this.A0N = getIntent().getStringExtra("parent_group_jid");
        A76();
        AnonymousClass4WR r1 = new AnonymousClass4WR(this);
        this.A0I = r1;
        r1.A01 = this.A0Q;
        r1.A00 = C107155an.A03(r1.A02.A0E, (String) null);
        r1.A05();
        recyclerView.setAdapter(this.A0I);
        this.A0A.A06(this.A0U);
        this.A08.A06(this.A0T);
        this.A0J.A00(this.A0V);
        this.A0K.A06(this.A0W);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A07(this.A0U);
        this.A08.A07(this.A0T);
        this.A0J.A01(this.A0V);
        this.A0K.A07(this.A0W);
        this.A0C.A00();
        C42892Px r0 = this.A0G;
        r0.A03.remove(this.A0L);
        C18290x4.A1L(this.A0H);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A75();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", C86604Kt.A1Y(this.A03));
    }

    public GroupAdminPickerActivity() {
        this(0);
        this.A0U = AnonymousClass681.A00(this, 25);
        this.A0T = new C189058zv(this, 3);
        this.A0W = new AnonymousClass901(this, 6);
        this.A0V = new C1892290m(this, 0);
        this.A0S = new C635339p((Object) this, 43);
    }
}
