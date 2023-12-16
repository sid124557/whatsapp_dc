package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass30V;
import X.AnonymousClass33p;
import X.AnonymousClass3ZH;
import X.AnonymousClass4CK;
import X.AnonymousClass4SG;
import X.AnonymousClass4V2;
import X.AnonymousClass5UW;
import X.AnonymousClass5V0;
import X.AnonymousClass5X1;
import X.AnonymousClass5Y9;
import X.AnonymousClass5ZU;
import X.AnonymousClass6C6;
import X.AnonymousClass7SU;
import X.AnonymousClass7SV;
import X.AnonymousClass800;
import X.AnonymousClass930;
import X.C08310eF;
import X.C101015Dd;
import X.C101075Dj;
import X.C101125Do;
import X.C103115Lp;
import X.C104095Pq;
import X.C105035Th;
import X.C105405Uu;
import X.C107295b4;
import X.C107695bk;
import X.C108985dt;
import X.C113905mB;
import X.C116985rC;
import X.C117165rU;
import X.C124086Ax;
import X.C132386fC;
import X.C150937Su;
import X.C150947Sv;
import X.C151257Ua;
import X.C154297cw;
import X.C181728nE;
import X.C181798nL;
import X.C181818nN;
import X.C181838nQ;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C184078rD;
import X.C1891190b;
import X.C1893490y;
import X.C1894391h;
import X.C19340zH;
import X.C29201iR;
import X.C29211iS;
import X.C29221iT;
import X.C55752qr;
import X.C56962sq;
import X.C620433g;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C87614Tz;
import X.C88744aj;
import X.C88834as;
import X.C90264gz;
import X.C90504hW;
import X.C989453v;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public class CatalogListActivity extends C90504hW implements C181818nN, C184078rD, C181838nQ {
    public C116985rC A00;
    public C116985rC A01;
    public C101075Dj A02;
    public C101125Do A03;
    public WaTextView A04;
    public WaTextView A05;
    public C105035Th A06;
    public C104095Pq A07;
    public AnonymousClass4V2 A08;
    public C150937Su A09;
    public PostcodeChangeBottomSheet A0A;
    public C150947Sv A0B;
    public AnonymousClass5X1 A0C;
    public C56962sq A0D;
    public C55752qr A0E;
    public C154297cw A0F;
    public C64773Ex A0G;
    public AnonymousClass5ZU A0H;
    public C113905mB A0I;
    public C103115Lp A0J;
    public AnonymousClass30V A0K;
    public WDSButton A0L;
    public boolean A0M;
    public final AnonymousClass4CK A0N;

    public void BYX() {
        this.A0A = null;
    }

    public void A5r() {
        if (!this.A0M) {
            this.A0M = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r3 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r3, this, AnonymousClass4SG.A2t(r1, r3, this));
            this.A0N = C86644Kx.A0a(r1);
            this.A05 = (AnonymousClass5UW) r1.A4T.get();
            this.A04 = (C29201iR) r1.A4U.get();
            this.A0D = (AnonymousClass5Y9) r1.A4Y.get();
            this.A0E = (C151257Ua) r3.A2I.get();
            this.A08 = (C29211iS) r1.A4c.get();
            this.A0K = C86614Ku.A0S(r1);
            this.A09 = (C29221iT) r1.ARg.get();
            this.A0A = (C105405Uu) r1.A4W.get();
            this.A01 = (C101015Dd) A2X.A1Y.get();
            this.A06 = (C181728nE) A2X.A1C.get();
            this.A03 = C86654Ky.A0S(r1);
            this.A0L = C86644Kx.A0R(r1);
            this.A0O = (AnonymousClass7SU) r1.A4d.get();
            this.A0P = (AnonymousClass7SV) r3.A2J.get();
            this.A02 = C86624Kv.A0K(r1);
            this.A0C = C86644Kx.A0P(r1);
            this.A0G = (C181798nL) A2X.A1N.get();
            this.A07 = A2X.ABU();
            this.A01 = C88744aj.A00;
            this.A00 = C86634Kw.A0S(r1);
            this.A0G = C64333Db.A26(r1);
            this.A0J = (C103115Lp) r3.A8P.get();
            this.A0H = C64333Db.A28(r1);
            this.A0D = C86654Ky.A0T(r1);
            this.A02 = (C101075Dj) A2X.A1j.get();
            this.A0I = C86644Kx.A0T(r1);
            this.A0E = (C55752qr) r3.A2K.get();
            this.A09 = A2X.ABW();
            this.A0F = new C154297cw();
            this.A03 = (C101125Do) A2X.A47.get();
            this.A06 = (C105035Th) r1.A3s.get();
            this.A0C = (AnonymousClass5X1) r1.A3p.get();
            this.A0K = C86604Kt.A0f(r1);
        }
    }

    public void A66() {
        if (this.A0D.A0X(6715)) {
            this.A0K.A03(this.A0M, 59);
        }
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public final void A76() {
        if (this.A0H.A00.size() > 0) {
            this.A0H.A00.clear();
            this.A0H.A05();
            this.A0H.A0Q();
        }
        C90264gz r3 = this.A0H;
        int i = 0;
        do {
            List list = r3.A00;
            list.add(new C132386fC());
            r3.A07(AnonymousClass002.A03(list));
            i++;
        } while (i < 3);
        C87614Tz r32 = this.A0I;
        UserJid userJid = this.A0M;
        C620433g r1 = r32.A0G;
        if ((r1.A05.A00() & 128) > 0) {
            r1.A05(r32, userJid);
        } else {
            r32.BXC((C108985dt) null);
        }
        this.A0I.A0O.A00();
    }

    public final void A78() {
        if (this.A0H.A08.isEmpty() || !this.A0H.B5J()) {
            this.A0L.setVisibility(8);
            return;
        }
        this.A0L.setVisibility(0);
        C87614Tz r3 = this.A0I;
        C117165rU.A00(r3.A0X, r3, this.A0M, 48);
    }

    public final void A79(boolean z) {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = new PostcodeChangeBottomSheet(this, z);
        this.A0A = postcodeChangeBottomSheet;
        postcodeChangeBottomSheet.A0E = (String) this.A08.A04.A07();
        postcodeChangeBottomSheet.A0F = (String) this.A08.A01.A07();
        postcodeChangeBottomSheet.A1d();
        PostcodeChangeBottomSheet postcodeChangeBottomSheet2 = this.A0A;
        postcodeChangeBottomSheet2.A0C = this.A0M;
        C86644Kx.A1C(postcodeChangeBottomSheet2, this);
    }

    public void BOa() {
        this.A0I.A0O.A00();
    }

    public Dialog onCreateDialog(int i) {
        if (i != 106) {
            return super.onCreateDialog(i);
        }
        AnonymousClass3ZH A0A2 = this.A0G.A0A(this.A0M);
        C19340zH A002 = AnonymousClass5V0.A00(this);
        Object[] A0L2 = AnonymousClass002.A0L();
        C18290x4.A1K(this.A0H, A0A2, A0L2);
        C86624Kv.A0i(this, A002, A0L2, R.string.f11nameremoved);
        A002.A0Y(new C1893490y(this, 0, A0A2), R.string.f11nameremoved);
        A002.A0W(new C1891190b(this, 14), R.string.f11nameremoved);
        return A002.create();
    }

    public void onDestroy() {
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.A0A;
        if (postcodeChangeBottomSheet != null) {
            postcodeChangeBottomSheet.A1K();
        }
        this.A03.A07(this.A0N);
        super.onDestroy();
    }

    public CatalogListActivity(int i) {
        this.A0M = false;
        C86604Kt.A1K(this, 13);
    }

    public void A75(List list) {
        super.A75(list);
        A78();
        A77();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3.A00.canScrollVertically(1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A77() {
        /*
            r3 = this;
            r0 = 2131433683(0x7f0b18d3, float:1.8489159E38)
            android.view.View r2 = r3.findViewById(r0)
            X.4gz r0 = r3.A0H
            java.util.List r0 = r0.A08
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r0 = 8
        L_0x001d:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.catalog.view.activity.CatalogListActivity.A77():void");
    }

    public void BYY(String str) {
        Bp9(R.string.f11nameremoved);
        this.A08.A0E(str);
    }

    public void onBackPressed() {
        C08310eF A0D2 = getSupportFragmentManager().A0D("CatalogSearchFragmentTag");
        if (A0D2 == null || !(A0D2 instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0D2).A1O()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C150947Sv r0;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2 && (r0 = this.A0B) != null) {
            r0.A00();
            this.A0B = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WDSButton wDSButton = (WDSButton) findViewById(R.id.view_cart);
        this.A0L = wDSButton;
        C18320x8.A15(wDSButton, this, 34);
        this.A0I.A03(new AnonymousClass800(0), this.A0M);
        C101125Do r1 = this.A03;
        UserJid userJid = this.A0M;
        C18270x1.A14(r1, userJid);
        AnonymousClass4V2 r0 = (AnonymousClass4V2) C124086Ax.A00(this, r1, userJid, 0).A01(AnonymousClass4V2.class);
        this.A08 = r0;
        AnonymousClass6C6.A01(this, r0.A04, 17);
        C86604Kt.A1M(this, this.A08.A03, 20);
        AnonymousClass6C6.A01(this, this.A08.A02, 12);
        AnonymousClass6C6.A01(this, this.A0I.A0W, 13);
        C86604Kt.A1M(this, this.A0I.A08, 21);
        AnonymousClass6C6.A01(this, this.A0I.A07, 14);
        AnonymousClass6C6.A01(this, this.A0I.A0A, 15);
        C86604Kt.A1M(this, this.A0I.A06, 22);
        C86604Kt.A1M(this, this.A0I.A0C, 23);
        AnonymousClass6C6.A01(this, this.A07.A00, 16);
        this.A03.A06(this.A0N);
        this.A09.A00(new C1894391h(this, 0), this.A0M);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_edit);
        MenuItem findItem2 = menu.findItem(R.id.menu_share);
        C18300x5.A13(this, C86644Kx.A0F(findItem2, R.layout.f8nameremoved), R.string.f11nameremoved);
        findItem2.setVisible(this.A0R);
        C107295b4.A02(findItem2.getActionView());
        C989453v.A00(findItem2.getActionView(), this, 15);
        findItem.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            onBackPressed();
            return true;
        }
        if (R.id.menu_edit == itemId) {
            C116985rC r1 = this.A00;
            if (r1.A07()) {
                r1.A04();
                throw AnonymousClass001.A0g("getCatalogListActivity");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        AnonymousClass4V2 r5 = this.A08;
        if (r5.A0B.A03(r5.A00, "postcode", true)) {
            Object A072 = r5.A04.A07();
            AnonymousClass33p r4 = r5.A0C;
            UserJid userJid = r5.A0D;
            String A0c = r4.A0c(userJid.getRawString());
            if (A072 != null && A0c != null && !A072.equals(A0c)) {
                r5.A07.A0H(A0c);
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r4), AnonymousClass000.A0V("dc_location_name_", userJid.getRawString(), AnonymousClass001.A0o()));
                if (A0Z != null) {
                    r5.A06.A0H(A0Z);
                }
                if (this.A0A.A0I(this.A0M)) {
                    this.A0A.A0F(this.A0M);
                }
                this.A0E.A04(this.A0M);
                A76();
            }
        }
    }

    public void setPostcodeAndLocationViews(View view) {
        this.A05 = AnonymousClass0x7.A0L(view, R.id.postcode_item_text);
        this.A04 = AnonymousClass0x7.A0L(view, R.id.postcode_item_location_name);
    }

    public CatalogListActivity() {
        this(0);
        this.A0N = new AnonymousClass930(this, 1);
    }
}
