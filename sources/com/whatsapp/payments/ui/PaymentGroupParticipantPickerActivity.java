package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass303;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass947;
import X.AnonymousClass9GO;
import X.AnonymousClass9GW;
import X.AnonymousClass9ON;
import X.AnonymousClass9U4;
import X.AnonymousClass9UH;
import X.AnonymousClass9Wg;
import X.AnonymousClass9Y6;
import X.C105225Ub;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C18270x1;
import X.C1899593h;
import X.C1901794j;
import X.C1907099n;
import X.C203499no;
import X.C203859oQ;
import X.C204019og;
import X.C29421in;
import X.C54292oU;
import X.C56602sG;
import X.C56892sj;
import X.C56962sq;
import X.C626936e;
import X.C627136h;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86654Ky;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class PaymentGroupParticipantPickerActivity extends C89644eZ {
    public ListView A00;
    public AnonymousClass64J A01;
    public C56962sq A02;
    public C64773Ex A03;
    public C29421in A04;
    public AnonymousClass5ZU A05;
    public C105365Uq A06;
    public C114015mM A07;
    public C54292oU A08;
    public C56892sj A09;
    public GroupJid A0A;
    public C1907099n A0B;
    public AnonymousClass9U4 A0C;
    public AnonymousClass9GW A0D;
    public AnonymousClass947 A0E;
    public AnonymousClass9GO A0F;
    public C1901794j A0G;
    public C105225Ub A0H;
    public String A0I;
    public ArrayList A0J;
    public boolean A0K;
    public final C56602sG A0L;
    public final ArrayList A0M;

    public void onCreate(Bundle bundle) {
        C1899593h.A0h(this);
        super.onCreate(bundle);
        this.A0G = (C1901794j) new AnonymousClass0XL(this).A01(C1901794j.class);
        this.A06 = this.A07.A06(this, "payment-group-participant-picker");
        setContentView((int) R.layout.f8nameremoved);
        this.A0A = GroupJid.Companion.A03(getIntent().getStringExtra("extra_jid"));
        Intent intent = getIntent();
        if (intent != null) {
            this.A0I = intent.getStringExtra("referral_screen");
        }
        this.A0E = new AnonymousClass947(this, this, this.A0M);
        ListView listView = (ListView) findViewById(R.id.group_participant_picker_list);
        this.A00 = listView;
        listView.setAdapter(this.A0E);
        this.A00.setOnItemClickListener(new AnonymousClass9Y6(intent, this));
        registerForContextMenu(this.A00);
        this.A04.A06(this.A0L);
        Toolbar A072 = C1899593h.A07(this);
        setSupportActionBar(A072);
        this.A0H = new C105225Ub(this, findViewById(R.id.search_holder), new AnonymousClass9UH(this, 2), A072, this.A00);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0B(R.string.f11nameremoved);
            supportActionBar.A0N(true);
        }
        AnonymousClass9GW r1 = this.A0D;
        if (r1 != null) {
            r1.A0D(true);
            this.A0D = null;
        }
        AnonymousClass9GO r12 = new AnonymousClass9GO(this);
        this.A0F = r12;
        C18270x1.A0w(r12, this.A04);
        Bp9(R.string.f11nameremoved);
        C203499no A062 = AnonymousClass9U4.A06(this.A0C);
        if (A062 != null) {
            AnonymousClass9Wg.A03((AnonymousClass303) null, A062, "payment_contact_picker", this.A0I);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AnonymousClass3ZH r1 = ((AnonymousClass9ON) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position)).A00;
        if (C86604Kt.A1a(this.A02, r1)) {
            contextMenu.add(0, 0, 0, AnonymousClass002.A0F(this, this.A05.A0H(r1), AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A08 = C64333Db.A2q(A002);
            this.A07 = C86604Kt.A0S(A002);
            this.A03 = C64333Db.A26(A002);
            this.A05 = C86604Kt.A0R(A002);
            this.A0C = C1899593h.A0I(A002);
            this.A02 = C86654Ky.A0T(A002);
            this.A04 = C86604Kt.A0Q(A002);
            this.A0B = C1899593h.A0H(A002);
            this.A09 = (C56892sj) A002.AGm.get();
            this.A01 = (AnonymousClass64J) A002.AEN.get();
        }
    }

    public final void A74(Intent intent, UserJid userJid) {
        Intent A082 = AnonymousClass0x9.A08(this.A08.A00, this.A0C.A0G().BCl());
        if (intent != null) {
            A082.putExtras(intent);
        }
        A082.putExtra("extra_jid", this.A0A.getRawString());
        A082.putExtra("extra_receiver_jid", C627336j.A07(userJid));
        A082.putExtra("extra_referral_screen", "payment_contact_picker");
        finish();
        startActivity(A082);
    }

    public void onBackPressed() {
        if (this.A0H.A03()) {
            this.A0H.A01(true);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onSearchRequested() {
        this.A0H.A02(false);
        return false;
    }

    public PaymentGroupParticipantPickerActivity(int i) {
        this.A0K = false;
        C204019og.A00(this, C627136h.A03);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AnonymousClass9ON r0 = (AnonymousClass9ON) this.A00.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (r0 != null) {
            AnonymousClass3ZH r2 = r0.A00;
            if (menuItem.getItemId() == 0) {
                C56962sq r1 = this.A02;
                Jid A0I2 = r2.A0I(UserJid.class);
                C626936e.A06(A0I2);
                r1.A0G(this, (UserJid) A0I2);
                return true;
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_search, 0, getString(R.string.f11nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.A00();
        this.A04.A07(this.A0L);
        AnonymousClass9GW r0 = this.A0D;
        if (r0 != null) {
            r0.A0D(true);
            this.A0D = null;
        }
        AnonymousClass9GO r02 = this.A0F;
        if (r02 != null) {
            r02.A0D(true);
            this.A0F = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public PaymentGroupParticipantPickerActivity() {
        this(0);
        this.A0M = AnonymousClass001.A0s();
        this.A0L = new C203859oQ(this, 2);
    }
}
