package com.whatsapp.blocklist;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1Ha;
import X.AnonymousClass20K;
import X.AnonymousClass31G;
import X.AnonymousClass32Y;
import X.AnonymousClass3LP;
import X.AnonymousClass3ZH;
import X.AnonymousClass49C;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4OO;
import X.AnonymousClass4SG;
import X.AnonymousClass5PH;
import X.AnonymousClass5QT;
import X.AnonymousClass5UX;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass64P;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass68W;
import X.AnonymousClass696;
import X.AnonymousClass6BU;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.C105365Uq;
import X.C106715a2;
import X.C107335b8;
import X.C107695bk;
import X.C112105jC;
import X.C112125jE;
import X.C114015mM;
import X.C117115rP;
import X.C1233167y;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C1906899l;
import X.C1907099n;
import X.C194619Tt;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C29441ip;
import X.C40532Gt;
import X.C46112b6;
import X.C49562gj;
import X.C54232oO;
import X.C55702qm;
import X.C55952rB;
import X.C56152rV;
import X.C56602sG;
import X.C56962sq;
import X.C620733j;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C87044Mw;
import X.C88834as;
import X.C89164br;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class BlockList extends C89164br {
    public AnonymousClass64J A00;
    public AnonymousClass4OO A01;
    public C56962sq A02;
    public C29301ib A03;
    public AnonymousClass5UX A04;
    public C64773Ex A05;
    public C29421in A06;
    public AnonymousClass5ZU A07;
    public C105365Uq A08;
    public C114015mM A09;
    public C56152rV A0A;
    public AnonymousClass3LP A0B;
    public AnonymousClass4FV A0C;
    public C29241iV A0D;
    public C49562gj A0E;
    public C40532Gt A0F;
    public C194619Tt A0G;
    public C1906899l A0H;
    public AnonymousClass9U5 A0I;
    public C1907099n A0J;
    public AnonymousClass9U4 A0K;
    public C55952rB A0L;
    public C106715a2 A0M;
    public boolean A0N;
    public final C54232oO A0O;
    public final C56602sG A0P;
    public final C55702qm A0Q;
    public final Object A0R;
    public final ArrayList A0S;
    public final ArrayList A0T;
    public final Set A0U;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Ha.A1z(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A08 = this.A09.A06(this, "block-list-activity");
        if (this.A0J.A02() && this.A0H.A0E()) {
            C194619Tt B64 = this.A0K.A0G().B64();
            this.A0G = B64;
            if (B64 != null && B64.A06()) {
                this.A0G.A04(new AnonymousClass6BU(this, 1), this.A0I);
            }
        }
        A75();
        AnonymousClass3LP r9 = this.A0B;
        AnonymousClass5UX r6 = this.A04;
        C620733j r8 = this.A00;
        AnonymousClass4OO r3 = new AnonymousClass4OO(this, this.A00, r6, this.A08, r8, r9, this.A0S);
        this.A01 = r3;
        A74(r3);
        getListView().setEmptyView(findViewById(R.id.block_list_empty));
        getListView().setDivider((Drawable) null);
        getListView().setClipToPadding(false);
        registerForContextMenu(getListView());
        AnonymousClass696.A00(getListView(), this, 1);
        this.A06.A06(this.A0P);
        this.A03.A06(this.A0O);
        this.A0D.A06(this.A0Q);
        this.A02.A0K((C46112b6) null);
        C117115rP.A01(this.A04, this, 49);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String A0H2;
        AnonymousClass64P r2 = (AnonymousClass64P) getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        int B8l = r2.B8l();
        if (B8l != 0) {
            if (B8l == 1) {
                A0H2 = ((C112125jE) r2).A00;
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        A0H2 = this.A07.A0H(((C112105jC) r2).A00);
        contextMenu.add(0, 0, 0, AnonymousClass002.A0F(this, A0H2, new Object[1], 0, R.string.f11nameremoved));
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void A5r() {
        if (!this.A0N) {
            this.A0N = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            this.A00 = new AnonymousClass5QT();
            this.A0C = C86604Kt.A0Z(r1);
            this.A0B = r1.Akp();
            this.A09 = C86604Kt.A0S(r1);
            this.A04 = C86614Ku.A0Q(r1);
            this.A05 = C86604Kt.A0P(r1);
            this.A07 = C86604Kt.A0R(r1);
            this.A0K = C86614Ku.A0f(r1);
            this.A02 = (C56962sq) r1.A2b.get();
            this.A0A = (C56152rV) r1.AIn.get();
            this.A0E = A2X.ACa();
            this.A03 = C86634Kw.A0Y(r1);
            this.A0H = (C1906899l) r1.APJ.get();
            this.A0J = C86614Ku.A0e(r1);
            this.A0I = (AnonymousClass9U5) r1.AQ5.get();
            this.A0D = (C29241iV) r1.AGn.get();
            this.A00 = C86644Kx.A0N(r1);
            this.A0L = (C55952rB) r1.ARK.get();
            this.A0F = (C40532Gt) r1.AIJ.get();
            this.A0M = C107695bk.A5b(r1);
            this.A06 = C86604Kt.A0Q(r1);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (i != 10) {
            super.onActivityResult(i, i2, intent2);
        } else if (i2 == -1) {
            UserJid A0U2 = C86624Kv.A0U(intent2.getStringExtra("contact"));
            AnonymousClass3ZH A0A2 = this.A05.A0A(A0U2);
            if (!A0A2.A0R() || !this.A0D.A0X(3369)) {
                C49562gj r0 = this.A0E;
                boolean A1U = C18270x1.A1U("block_list", A0U2);
                r0.A00(A0U2, "block_list", A1U ? 1 : 0);
                this.A02.A0B(this, (AnonymousClass49C) null, (AnonymousClass20K) null, A0A2, (Integer) null, (String) null, (String) null, "block_list", A1U, A1U);
                return;
            }
            startActivity(C627736r.A0m(getApplicationContext(), AnonymousClass32Y.A05(A0A2.A0H), "biz_block_list", true, false, false, false, false));
        } else {
            this.A0E.A00((UserJid) null, "block_list", 2);
        }
    }

    public BlockList(int i) {
        this.A0N = false;
        AnonymousClass68W.A00(this, 10);
    }

    public final void A75() {
        TextView A0L2 = C18310x6.A0L(this, R.id.block_list_primary_text);
        TextView A0L3 = C18310x6.A0L(this, R.id.block_list_help);
        TextView A0L4 = C18310x6.A0L(this, R.id.block_list_info);
        if (this.A02.A0M()) {
            A0L3.setVisibility(0);
            A0L4.setVisibility(0);
            Drawable A0G2 = C18310x6.A0G(this, R.drawable.ic_add_person_tip);
            A0L2.setText(R.string.f11nameremoved);
            C87044Mw.A05(C107335b8.A0B(A0G2, AnonymousClass5Yj.A03(A0L3.getContext(), this, R.attr.f3nameremoved, R.color.f5nameremoved)), A0L3, getString(R.string.f11nameremoved));
            A0L4.setText(R.string.f11nameremoved);
            return;
        }
        C86624Kv.A12(A0L3, A0L4);
        boolean A022 = C29441ip.A02(this);
        int i = R.string.f11nameremoved;
        if (A022) {
            i = R.string.f11nameremoved;
        }
        A0L2.setText(i);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C194619Tt r3;
        AnonymousClass64P r2 = (AnonymousClass64P) getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        int B8l = r2.B8l();
        if (B8l != 0) {
            if (B8l == 1 && (r3 = this.A0G) != null) {
                r3.A02(this, new AnonymousClass6BU(this, 0), this.A0I, ((C112125jE) r2).A00, false);
            }
            return true;
        }
        AnonymousClass3ZH r32 = ((C112105jC) r2).A00;
        C56962sq r22 = this.A02;
        C626936e.A06(r32);
        r22.A0F(this, r32, "block_list", true);
        AnonymousClass3LP r5 = this.A0B;
        AnonymousClass4FS r8 = this.A04;
        AnonymousClass31G.A01(this.A0A, r5, this.A0C, AnonymousClass3ZH.A01(r32), r8, C18290x4.A0c(), (Integer) null, 2);
        return true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C86624Kv.A0q(menu.add(0, R.id.menuitem_settings_add_blocked_contact, 0, R.string.f11nameremoved), R.drawable.ic_action_add_person);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.A00();
        this.A06.A07(this.A0P);
        this.A03.A07(this.A0O);
        this.A0D.A07(this.A0Q);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_settings_add_blocked_contact) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = this.A0T.iterator();
            while (it.hasNext()) {
                A0s.add(AnonymousClass3ZH.A08(C18310x6.A0R(it)));
            }
            this.A0E.A00((UserJid) null, "block_list", 0);
            AnonymousClass5PH r1 = new AnonymousClass5PH(this);
            r1.A03 = true;
            r1.A0Y = A0s;
            r1.A03 = Boolean.TRUE;
            startActivityForResult(AnonymousClass5PH.A01(r1), 10);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    public BlockList() {
        this(0);
        this.A0R = AnonymousClass002.A0D();
        this.A0T = AnonymousClass001.A0s();
        this.A0S = AnonymousClass001.A0s();
        this.A0U = AnonymousClass002.A0K();
        this.A0P = AnonymousClass681.A00(this, 3);
        this.A0O = new C1233167y(this, 0);
        this.A0Q = new AnonymousClass687(this, 0);
    }
}
