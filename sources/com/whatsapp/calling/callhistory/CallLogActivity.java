package com.whatsapp.calling.callhistory;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R2;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x7;
import X.AnonymousClass1Hf;
import X.AnonymousClass30V;
import X.AnonymousClass32V;
import X.AnonymousClass32Y;
import X.AnonymousClass36T;
import X.AnonymousClass39J;
import X.AnonymousClass3ZF;
import X.AnonymousClass3ZH;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass542;
import X.AnonymousClass54G;
import X.AnonymousClass5MG;
import X.AnonymousClass5UK;
import X.AnonymousClass5UX;
import X.AnonymousClass5V0;
import X.AnonymousClass5YB;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass64Q;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass68W;
import X.AnonymousClass6BG;
import X.C005205m;
import X.C06400Xn;
import X.C103835Op;
import X.C105055Tk;
import X.C106165Xw;
import X.C106405Yw;
import X.C106905aM;
import X.C106995aW;
import X.C107045ab;
import X.C107215at;
import X.C107265az;
import X.C107335b8;
import X.C107405bG;
import X.C107445bK;
import X.C107505bQ;
import X.C107695bk;
import X.C117715sN;
import X.C1225064q;
import X.C1230066r;
import X.C1233167y;
import X.C1235268t;
import X.C1238369y;
import X.C16910uE;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C187958y5;
import X.C19340zH;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C33261si;
import X.C50392i6;
import X.C52472lX;
import X.C54232oO;
import X.C55422qK;
import X.C55702qm;
import X.C56602sG;
import X.C56762sW;
import X.C56892sj;
import X.C56962sq;
import X.C56982ss;
import X.C57162tC;
import X.C613330g;
import X.C620733j;
import X.C621433s;
import X.C623234o;
import X.C626936e;
import X.C627436k;
import X.C627736r;
import X.C64223Cq;
import X.C64333Db;
import X.C64773Ex;
import X.C66473Lo;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87104Oa;
import X.C88834as;
import X.C89644eZ;
import X.C91584kP;
import X.C95814uZ;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CallLogActivity extends C89644eZ {
    public Parcelable A00;
    public View A01;
    public ImageButton A02;
    public ImageButton A03;
    public ImageView A04;
    public ListView A05;
    public TextView A06;
    public AnonymousClass0R2 A07;
    public AnonymousClass64J A08;
    public AnonymousClass5YB A09;
    public C56962sq A0A;
    public AnonymousClass64Q A0B;
    public C33261si A0C;
    public C1230066r A0D;
    public C623234o A0E;
    public C29301ib A0F;
    public C106995aW A0G;
    public AnonymousClass5UK A0H;
    public AnonymousClass5UX A0I;
    public C64773Ex A0J;
    public C29421in A0K;
    public AnonymousClass5ZU A0L;
    public C613330g A0M;
    public C64223Cq A0N;
    public C57162tC A0O;
    public C56762sW A0P;
    public C56982ss A0Q;
    public C66473Lo A0R;
    public C56892sj A0S;
    public C50392i6 A0T;
    public C55422qK A0U;
    public AnonymousClass3ZH A0V;
    public C29241iV A0W;
    public C52472lX A0X;
    public C95814uZ A0Y;
    public AnonymousClass30V A0Z;
    public C105055Tk A0a;
    public C106165Xw A0b;
    public C187958y5 A0c;
    public ArrayList A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public final C16910uE A0h;
    public final C87104Oa A0i;
    public final C54232oO A0j;
    public final C1225064q A0k;
    public final C56602sG A0l;
    public final C55702qm A0m;
    public final HashSet A0n;

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        if (i == 1) {
            Log.i("calllog/dialog-add-contact");
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            C1235268t.A03(r2, this, 12, R.string.f11nameremoved);
            r2.A0X(C1235268t.A00(this, 13), R.string.f11nameremoved);
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            Log.w("calllog/add to contacts: activity not found, probably tablet");
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            C1235268t.A03(r2, this, 14, R.string.f11nameremoved);
        }
        return r2.create();
    }

    public static /* synthetic */ void A0C(Bundle bundle, CallLogActivity callLogActivity, String str) {
        if (str.equals("request_bottom_sheet_fragment")) {
            if (bundle.getBoolean("is_contact_saved")) {
                callLogActivity.A0N.A08();
            }
            callLogActivity.A0a.A00();
        }
        callLogActivity.getSupportFragmentManager().A0l("request_bottom_sheet_fragment");
    }

    public void A5r() {
        if (!this.A0e) {
            this.A0e = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A0Q = C64333Db.A39(r2);
            this.A0D = C86644Kx.A0Q(r2);
            this.A0I = C86614Ku.A0R(r2);
            this.A0J = C64333Db.A26(r2);
            this.A0L = C64333Db.A28(r2);
            this.A0H = (AnonymousClass5UK) r2.A4p.get();
            this.A0c = C86614Ku.A0o(r2);
            this.A0G = C86654Ky.A0V(r2);
            this.A0A = C86654Ky.A0T(r2);
            this.A0K = C86614Ku.A0S(r2);
            this.A0X = C86644Kx.A0W(r2);
            this.A0a = C86614Ku.A0k(r2);
            this.A0P = (C56762sW) r2.A4R.get();
            this.A0b = C86614Ku.A0l(r2);
            this.A0E = (C623234o) r2.A4O.get();
            this.A0F = C86624Kv.A0N(r2);
            this.A0N = C86604Kt.A0T(r2);
            this.A0U = (C55422qK) r2.AUG.get();
            this.A0S = C64333Db.A3G(r2);
            this.A0M = C86624Kv.A0P(r2);
            this.A0R = C86634Kw.A0f(r2);
            this.A0W = C86624Kv.A0T(r2);
            this.A0O = C86624Kv.A0R(r2);
            this.A0Z = C86604Kt.A0f(r2);
            this.A08 = C86614Ku.A0N(r2);
            this.A0B = (AnonymousClass64Q) A2W.A31.get();
        }
    }

    public boolean A64() {
        return true;
    }

    public void A66() {
        this.A0Z.A03((C95814uZ) null, 15);
        super.A66();
    }

    public final void A74() {
        Log.i("calllog/new_conversation");
        this.A00.A0B(this, C86664Kz.A1B().A1L(this, this.A0V));
        finish();
    }

    public final void A75() {
        GroupJid A002;
        Log.i("calllog/update");
        AnonymousClass3ZH A012 = this.A0R.A01(this.A0Y);
        this.A0V = A012;
        this.A0I.A07(this.A04, A012);
        this.A09.A08(this.A0V);
        String str = this.A0V.A0X;
        if (str == null || str.isEmpty()) {
            this.A06.setVisibility(8);
        } else {
            this.A06.setVisibility(0);
            this.A06.setText(this.A0V.A0X);
        }
        C33261si r1 = this.A0C;
        if (r1 != null) {
            r1.A0D(true);
        }
        C33261si r12 = new C33261si(this, this);
        this.A0C = r12;
        C18270x1.A0w(r12, this.A04);
        boolean z = !this.A0X.A01(this.A0V);
        C107215at.A05(this.A02, z);
        AnonymousClass3ZH r0 = this.A0V;
        if (!(r0 == null || (A002 = AnonymousClass32V.A00(r0.A0H)) == null)) {
            int A0H2 = C86664Kz.A0H(this.A0S, A002);
            if (C627436k.A0C(this.A01, this.A0D, A0H2)) {
                this.A02.setImageResource(R.drawable.vec_ic_action_voicechat);
                C107215at.A05(this.A02, z);
                ImageButton imageButton = this.A02;
                float f = 0.4f;
                if (C627436k.A0B(this.A01, this.A0D, A0H2)) {
                    f = 1.0f;
                }
                imageButton.setAlpha(f);
            }
            if (!AnonymousClass36T.A07(this.A06, this.A0Q, this.A0S, this.A0V, A002)) {
                this.A03.setVisibility(8);
                return;
            }
        }
        C107215at.A05(this.A03, z);
    }

    public final void A76() {
        int i;
        View A0G2 = C86644Kx.A0G(this.A05);
        if (A0G2 == null) {
            return;
        }
        if (this.A05.getWidth() > this.A05.getHeight()) {
            if (this.A05.getFirstVisiblePosition() == 0) {
                i = A0G2.getTop();
            } else {
                i = (-this.A01.getHeight()) + 1;
            }
            View view = this.A01;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (this.A01.getTop() != 0) {
            View view2 = this.A01;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public final void A77(Menu menu) {
        if (this.A0D.A0X(3321)) {
            Drawable A0G2 = C18310x6.A0G(this, R.drawable.vec_ic_settings_bug_report);
            C107335b8.A0B(A0G2, C06400Xn.A00((Resources.Theme) null, getResources(), R.color.f5nameremoved));
            menu.add(0, R.id.menuitem_call_log_bugnub, 0, R.string.f11nameremoved).setIcon(A0G2).setShowAsAction(1);
        }
    }

    public final void A78(AnonymousClass3ZF r3) {
        HashSet hashSet = this.A0n;
        if (hashSet.contains(r3)) {
            hashSet.remove(r3);
        } else {
            hashSet.add(r3);
        }
        this.A0i.notifyDataSetChanged();
        boolean A1W = AnonymousClass001.A1W(hashSet.size());
        AnonymousClass0R2 r0 = this.A07;
        if (!A1W) {
            if (r0 != null) {
                r0.A05();
            }
        } else if (r0 == null) {
            this.A07 = Bpz(this.A0h);
        } else {
            r0.A06();
        }
    }

    public final void A79(boolean z) {
        C95814uZ A0a2 = C86604Kt.A0a(this.A0V);
        if (!z || !C106165Xw.A01(this.A0b)) {
            try {
                Intent A022 = this.A0b.A02(this.A0V, A0a2, z);
                int i = 11;
                if (z) {
                    i = 10;
                }
                startActivityForResult(A022, i);
            } catch (ActivityNotFoundException | SecurityException e) {
                Log.w("calllog/opt system contact list could not found", e);
                C621433s.A01(this, 2);
                return;
            }
        } else {
            this.A0b.A06(getSupportFragmentManager(), this.A0V, A0a2);
            getSupportFragmentManager().A0j(new C107445bK(this, 0), this, "request_bottom_sheet_fragment");
        }
        this.A0a.A03(z, 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11 || i == 10) {
            if (i2 == -1) {
                this.A0N.A08();
            }
            this.A0a.A00();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean A1a = C86604Kt.A1a(this.A0A, this.A0V);
        MenuItem findItem = menu.findItem(R.id.menuitem_unblock_contact);
        if (findItem != null) {
            findItem.setVisible(A1a);
        }
        MenuItem findItem2 = menu.findItem(R.id.menuitem_block_contact);
        if (findItem2 != null) {
            findItem2.setVisible(!A1a);
        }
        return true;
    }

    public CallLogActivity(int i) {
        this.A0e = false;
        AnonymousClass68W.A00(this, 15);
    }

    public void Bdh(AnonymousClass0R2 r1) {
        super.Bdh(r1);
        C107405bG.A04(this);
    }

    public void Bdi(AnonymousClass0R2 r1) {
        super.Bdi(r1);
        AnonymousClass4SG.A34(this);
    }

    public AnonymousClass0R2 Bpz(C16910uE r4) {
        AnonymousClass0R2 Bpz = super.Bpz(r4);
        View findViewById = findViewById(R.id.action_mode_close_button);
        if (findViewById instanceof ImageView) {
            ((ImageView) findViewById).setImageResource(R.drawable.abc_ic_ab_back_material);
        }
        return Bpz;
    }

    public void onCreate(Bundle bundle) {
        String formatDateTime;
        super.onCreate(bundle);
        boolean A2I = AnonymousClass1Hf.A2I(this);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        C95814uZ A002 = C106405Yw.A00(this);
        C626936e.A06(A002);
        this.A0Y = A002;
        this.A0f = getIntent().getBooleanExtra("is_voice_chat", false);
        this.A05 = (ListView) findViewById(16908298);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, this.A05, false);
        AnonymousClass0YY.A06(inflate, 2);
        this.A05.addHeaderView(inflate, (Object) null, false);
        View findViewById = findViewById(R.id.header);
        this.A01 = findViewById;
        findViewById.setClickable(A2I);
        findViewById(R.id.contact_info_container).setFocusable(A2I);
        AnonymousClass5YB Azt = this.A08.Azt(this, C86664Kz.A0z(this, R.id.conversation_contact_name));
        this.A09 = Azt;
        C106905aM.A04(Azt.A02);
        this.A06 = C18310x6.A0L(this, R.id.conversation_contact_status);
        View findViewById2 = findViewById(R.id.divider);
        C620733j r1 = this.A00;
        C626936e.A06(this);
        findViewById2.setBackground(AnonymousClass0x7.A0J(this, r1, R.drawable.list_header_divider));
        this.A05.setOnScrollListener(new C107045ab(this, A2I ? 1 : 0));
        AnonymousClass6BG.A00(this.A05.getViewTreeObserver(), this, 4);
        this.A04 = C86654Ky.A0M(this, R.id.photo_btn);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass5MG.A01(this));
        String A0X2 = AnonymousClass000.A0X("-avatar", A0o);
        AnonymousClass0YZ.A0F(this.A04, A0X2);
        this.A04.setOnClickListener(new AnonymousClass54G(A2I, A0X2, this));
        this.A02 = (ImageButton) C005205m.A00(this, R.id.call_btn);
        this.A03 = (ImageButton) C005205m.A00(this, R.id.video_call_btn);
        this.A02.setOnClickListener(new AnonymousClass542(A2I, this, false));
        this.A03.setOnClickListener(new AnonymousClass542(A2I, this, A2I));
        ListView listView = this.A05;
        C87104Oa r4 = this.A0i;
        listView.setAdapter(r4);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
        if (parcelableArrayListExtra == null) {
            this.A00 = null;
        } else {
            this.A0d = AnonymousClass001.A0s();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                AnonymousClass39J r9 = (AnonymousClass39J) ((Parcelable) it.next());
                C56762sW r8 = this.A0P;
                UserJid userJid = r9.A01;
                boolean z = r9.A03;
                AnonymousClass3ZF A022 = r8.A02(new AnonymousClass39J(r9.A00, userJid, r9.A02, z));
                if (A022 != null) {
                    this.A0d.add(A022);
                }
                if (this.A00 == null) {
                    this.A00 = r9;
                }
            }
            int size = parcelableArrayListExtra.size();
            ArrayList arrayList = this.A0d;
            if (size != arrayList.size()) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C18260x0.A19("CallLogActivity/onCreate:missingKeys: ", A0o2, arrayList);
                C18260x0.A19(" out of ", A0o2, parcelableArrayListExtra);
                C18260x0.A1K(A0o2, " fetched");
            }
            r4.A01 = this.A0d;
            r4.notifyDataSetChanged();
            ArrayList arrayList2 = this.A0d;
            if (!arrayList2.isEmpty()) {
                AnonymousClass3ZF A0P2 = AnonymousClass4L0.A0P(arrayList2, 0);
                long A0I2 = this.A06.A0I(A0P2.A0B);
                TextView A0L2 = C18310x6.A0L(this, R.id.calls_title);
                if (DateUtils.isToday(A0I2)) {
                    C620733j r2 = this.A00;
                    formatDateTime = C107505bQ.A07(C620733j.A02(r2), r2.A0A(272));
                } else if (DateUtils.isToday(86400000 + A0I2)) {
                    formatDateTime = C107505bQ.A00(this.A00);
                } else {
                    formatDateTime = DateUtils.formatDateTime(this, A0I2, 16);
                }
                A0L2.setText(formatDateTime);
                if (!(A0P2.A0J == null || A0P2.A05 == null || !C627436k.A0I(this.A0D))) {
                    this.A04.BkP(new C117715sN(this, A0P2, A0P2.A0J.A00, 25));
                }
            } else {
                finish();
            }
        }
        A75();
        this.A0K.A06(this.A0l);
        this.A0F.A06(this.A0j);
        this.A0W.A06(this.A0m);
        AnonymousClass4SG.A3d(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_new_conversation, 0, R.string.f11nameremoved).setIcon(R.drawable.vec_ic_chat_filled).setAlphabeticShortcut('n').setShowAsAction(2);
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_delete);
        if (!(this.A0Y instanceof GroupJid)) {
            if (!this.A0V.A0Q() && (!AnonymousClass4SG.A45(this))) {
                menu.add(0, R.id.menuitem_add_to_contacts, 0, R.string.f11nameremoved);
            }
            menu.add(0, R.id.menuitem_unblock_contact, 0, R.string.f11nameremoved);
            menu.add(0, R.id.menuitem_block_contact, 0, R.string.f11nameremoved);
        }
        A77(menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0K.A07(this.A0l);
        this.A0F.A07(this.A0j);
        this.A0W.A07(this.A0m);
        if (this.A0g) {
            this.A0g = false;
            this.A0G.A01 = false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent A0I2;
        if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
                Log.i("calllog/delete");
                ArrayList arrayList = this.A0d;
                if (arrayList != null) {
                    this.A0P.A0B(arrayList);
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_new_conversation) {
                C95814uZ r4 = this.A0V.A0H;
                if (r4 != null) {
                    C106995aW r1 = this.A0G;
                    if (r1.A0J && r1.A0I(r4)) {
                        this.A0G.A08(this, new C91584kP(r4, true), this.A0k, 5);
                        return true;
                    }
                }
                A74();
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_add_to_contacts) {
                C621433s.A01(this, 1);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_unblock_contact) {
                this.A0A.A0F(this, this.A0V, "call_log_block", true);
                return true;
            } else {
                boolean z = false;
                if (menuItem.getItemId() == R.id.menuitem_block_contact) {
                    AnonymousClass3ZH r0 = this.A0V;
                    if (r0 != null && r0.A0R()) {
                        z = true;
                    }
                    UserJid A042 = AnonymousClass32Y.A04(this.A0Y);
                    if (z) {
                        A0I2 = C627736r.A0m(this, A042, "biz_call_log_block", true, false, false, false, false);
                    } else {
                        C103835Op Azw = this.A0B.Azw(A042, "call_log_block");
                        Azw.A05 = true;
                        boolean A0X2 = this.A0D.A0X(4351);
                        Azw.A04 = A0X2;
                        UserJid userJid = Azw.A07;
                        boolean z2 = Azw.A02;
                        boolean z3 = Azw.A05;
                        int i = Azw.A01;
                        Boo(BlockConfirmationDialogFragment.A00(userJid, Azw.A08, Azw.A00, i, z2, Azw.A03, A0X2, z3));
                        return true;
                    }
                } else if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                    return false;
                } else {
                    A0I2 = C627736r.A0I(this, (Uri) null, this.A00, true);
                }
                startActivity(A0I2);
                return true;
            }
        }
        finish();
        return true;
    }

    public int A5t() {
        return 78318969;
    }

    public CallLogActivity() {
        this(0);
        this.A07 = null;
        this.A0n = AnonymousClass002.A0K();
        this.A0i = new C87104Oa(this);
        this.A0h = new C1238369y(this, 0);
        this.A0l = AnonymousClass681.A00(this, 5);
        this.A0j = new C1233167y(this, 1);
        this.A0m = new AnonymousClass687(this, 1);
        this.A0k = new C107265az(this, 0);
    }
}
