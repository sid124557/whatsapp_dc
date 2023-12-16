package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0X0;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1NR;
import X.AnonymousClass1VX;
import X.AnonymousClass1fI;
import X.AnonymousClass27Y;
import X.AnonymousClass2V2;
import X.AnonymousClass33A;
import X.AnonymousClass33p;
import X.AnonymousClass36P;
import X.AnonymousClass3ZH;
import X.AnonymousClass487;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4OP;
import X.AnonymousClass4SG;
import X.AnonymousClass54D;
import X.AnonymousClass5IY;
import X.AnonymousClass5J3;
import X.AnonymousClass5MG;
import X.AnonymousClass5V0;
import X.AnonymousClass5WX;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass68W;
import X.AnonymousClass696;
import X.AnonymousClass6BG;
import X.AnonymousClass6C6;
import X.C06560Yg;
import X.C101435Et;
import X.C104355Qq;
import X.C105055Tk;
import X.C105365Uq;
import X.C105895Wv;
import X.C106165Xw;
import X.C107045ab;
import X.C107275b2;
import X.C107295b4;
import X.C107345b9;
import X.C107365bC;
import X.C107565bW;
import X.C107695bk;
import X.C109315eQ;
import X.C114015mM;
import X.C116985rC;
import X.C117875sd;
import X.C1233167y;
import X.C1235268t;
import X.C1235969a;
import X.C1236369e;
import X.C124086Ax;
import X.C124166Bf;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C27821ej;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C29431io;
import X.C48952fk;
import X.C54232oO;
import X.C55412qJ;
import X.C55622qe;
import X.C55682qk;
import X.C55702qm;
import X.C56602sG;
import X.C56612sH;
import X.C56892sj;
import X.C60152y5;
import X.C615531h;
import X.C620633i;
import X.C620733j;
import X.C621433s;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64223Cq;
import X.C64333Db;
import X.C66663Mh;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88744aj;
import X.C88834as;
import X.C89014bL;
import X.C89364cO;
import X.C91484k4;
import X.C91504kC;
import X.C91514kI;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.group.view.custom.GroupDetailsCard;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListChatInfoActivity extends C91484k4 {
    public View A00;
    public ListView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C116985rC A05;
    public C116985rC A06;
    public C116985rC A07;
    public C116985rC A08;
    public AnonymousClass2V2 A09;
    public C101435Et A0A;
    public AnonymousClass64J A0B;
    public C29301ib A0C;
    public AnonymousClass4OP A0D;
    public AnonymousClass1NR A0E;
    public C91504kC A0F;
    public C91514kI A0G;
    public C29421in A0H;
    public AnonymousClass5ZU A0I;
    public C48952fk A0J;
    public C105365Uq A0K;
    public C114015mM A0L;
    public C64223Cq A0M;
    public C620733j A0N;
    public C55412qJ A0O;
    public C29431io A0P;
    public C55622qe A0Q;
    public AnonymousClass3ZH A0R;
    public AnonymousClass3ZH A0S;
    public AnonymousClass5IY A0T;
    public C27821ej A0U;
    public EmojiSearchProvider A0V;
    public AnonymousClass33A A0W;
    public C29241iV A0X;
    public GroupDetailsCard A0Y;
    public C60152y5 A0Z;
    public AnonymousClass5WX A0a;
    public C105055Tk A0b;
    public C106165Xw A0c;
    public C104355Qq A0d;
    public boolean A0e;
    public final C54232oO A0f;
    public final C56602sG A0g;
    public final AnonymousClass4FW A0h;
    public final C55702qm A0i;
    public final ArrayList A0j;

    public void onCreate(Bundle bundle) {
        View findViewById;
        UserJid A0l;
        A5j(5);
        super.onCreate(bundle);
        this.A0K = this.A0L.A06(this, "list-chat-info");
        A5U();
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        this.A0F = (C91504kC) findViewById(R.id.content);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        A28.setTitle((CharSequence) "");
        A28.A07();
        setSupportActionBar(A28);
        getSupportActionBar().A0N(true);
        C86604Kt.A11(this, A28, this.A0N, R.drawable.ic_back_shadow);
        this.A01 = getListView();
        this.A0F.A0A(R.layout.f8nameremoved);
        this.A00 = findViewById(R.id.header);
        this.A0Y = (GroupDetailsCard) findViewById(R.id.group_details_card);
        this.A0F.A06();
        this.A0F.setColor(C86634Kw.A03(this));
        this.A0F.A0B(getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C18320x8.A00(this, R.dimen.f6nameremoved));
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, this.A01, false);
        this.A01.addFooterView(inflate, (Object) null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(this, A072);
        linearLayout.setPadding(0, 0, 0, A072.y);
        this.A01.addFooterView(linearLayout, (Object) null, false);
        AnonymousClass1fI A002 = AnonymousClass27Y.A00(getIntent().getStringExtra("gid"));
        if (A002 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        this.A0R = this.A0I.A0A(A002);
        ArrayList arrayList = this.A0j;
        this.A0D = new AnonymousClass4OP(this, this, arrayList);
        this.A00 = findViewById(R.id.header);
        this.A01.setOnScrollListener(new C107045ab(this, 2));
        AnonymousClass6BG.A00(this.A01.getViewTreeObserver(), this, 6);
        AnonymousClass696.A00(this.A01, this, 3);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("list_chat_info/");
        C18260x0.A1J(A0o, this.A0R.toString());
        View findViewById2 = findViewById(R.id.add_participant_layout);
        View findViewById3 = findViewById(R.id.add_participant_button);
        AnonymousClass002.A09(findViewById3, R.id.add_participant_text).setText(R.string.f11nameremoved);
        findViewById2.findViewById(R.id.invite_via_link_button).setVisibility(8);
        findViewById2.setVisibility(0);
        C109315eQ.A01(findViewById3, this, 45);
        A7I();
        this.A02 = C18310x6.A0L(this, R.id.conversation_contact_status);
        A78();
        C101435Et r1 = this.A0A;
        AnonymousClass1fI A7G = A7G();
        C626936e.A06(A7G);
        C162457s7.A0J(r1, 0);
        C162457s7.A0J(A7G, 1);
        C91514kI r0 = (C91514kI) C124086Ax.A00(this, A7G, r1, 1).A01(C91514kI.class);
        this.A0G = r0;
        A7B(r0);
        AnonymousClass6C6.A01(this, this.A0G.A00, 87);
        this.A0X.setTopShadowVisibility(8);
        this.A01.setAdapter(this.A0D);
        registerForContextMenu(this.A01);
        C18260x0.A1J(AnonymousClass000.A0l("list_chat_info/"), this.A0R.toString());
        TextView A0L2 = C18310x6.A0L(this, R.id.participants_title);
        this.A04 = A0L2;
        Resources resources = getResources();
        int size = arrayList.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1P(objArr, arrayList.size(), 0);
        C86614Ku.A16(resources, A0L2, objArr, R.plurals.f9nameremoved, size);
        this.A03 = C18310x6.A0L(this, R.id.participants_info);
        A7O();
        A7D(Integer.valueOf(R.drawable.avatar_broadcast));
        A7E(getString(R.string.f11nameremoved), R.drawable.ic_action_delete);
        C86604Kt.A1B(this.A00, R.id.report_group_btn);
        View findViewById4 = findViewById(R.id.exit_group_btn);
        C109315eQ.A01(findViewById4, this, 46);
        C107295b4.A02(findViewById4);
        HashSet A15 = AnonymousClass0x9.A15(C56892sj.A01(this.A0O, A7G()).A02());
        A15.remove(AnonymousClass4SG.A2m(this));
        A15.remove(this.A01.A0H());
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C86614Ku.A1T(this.A0I.A0A(C18300x5.A0P(it)), arrayList);
        }
        A7M();
        A7L();
        A7N();
        A7J();
        C116985rC r12 = this.A07;
        if (r12.A07()) {
            r12.A04();
            A7G();
            throw AnonymousClass001.A0g("initSmbLabelScroller");
        }
        A7C(new AnonymousClass54D(this, 19));
        this.A0H.A06(this.A0g);
        this.A0P.A06(this.A0h);
        this.A0C.A06(this.A0f);
        this.A0X.A06(this.A0i);
        if (!(bundle == null || (A0l = C86634Kw.A0l(bundle, "selected_jid")) == null)) {
            this.A0S = this.A0I.A0A(A0l);
        }
        AnonymousClass5MG r2 = new AnonymousClass5MG(this);
        if (getIntent().getBooleanExtra("circular_transition", false)) {
            findViewById = this.A00;
        } else {
            findViewById = findViewById(R.id.picture);
        }
        findViewById.setTransitionName(r2.A03(R.string.f11nameremoved));
        this.A0F.A0D(inflate, linearLayout, this.A0D);
    }

    public Dialog onCreateDialog(int i) {
        C19340zH A002;
        int i2;
        int i3;
        AnonymousClass3ZH r3;
        int i4 = i;
        if (i4 == 2) {
            if (TextUtils.isEmpty(this.A0I.A0H(this.A0R))) {
                getString(R.string.f11nameremoved);
            } else {
                Object[] objArr = new Object[1];
                C18300x5.A1E(this.A0I, this.A0R, objArr, 0);
                getString(R.string.f11nameremoved, objArr);
            }
            return this.A0d.A00(this, new C1236369e(new C1235969a(this, 0), 2), 1, 1, 0, false).create();
        } else if (i4 != 3) {
            if (i4 == 4) {
                Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
                A002 = AnonymousClass5V0.A00(this);
                A002.A0T(R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 18;
            } else if (i4 != 6 || (r3 = this.A0S) == null) {
                return super.onCreateDialog(i4);
            } else {
                Object[] objArr2 = new Object[1];
                C18300x5.A1E(this.A0I, r3, objArr2, 0);
                String string = getString(R.string.f11nameremoved, objArr2);
                A002 = AnonymousClass5V0.A00(this);
                A002.A0g(C107345b9.A05(this, this.A0C, string));
                A002.A0i(true);
                C1235268t.A04(A002, this, 16, R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 17;
            }
            C1235268t.A03(A002, this, i3, i2);
            return A002.create();
        } else {
            C107365bC r7 = new C107365bC(this, 0);
            C56612sH r18 = this.A06;
            AnonymousClass1VX r17 = this.A0D;
            C69263Wi r16 = this.A05;
            C105895Wv r15 = this.A0B;
            C55682qk r12 = this.A03;
            AnonymousClass5Y0 r11 = this.A0C;
            C27821ej r10 = this.A0U;
            C620633i r6 = this.A08;
            C620733j r5 = this.A0N;
            AnonymousClass5IY r4 = this.A0T;
            EmojiSearchProvider emojiSearchProvider = this.A0V;
            AnonymousClass33p r2 = this.A09;
            C60152y5 r1 = this.A0Z;
            AnonymousClass487 r0 = this.A0B;
            AnonymousClass3ZH A092 = this.A0I.A09(A7G());
            C626936e.A06(A092);
            AnonymousClass1VX r27 = r17;
            C105895Wv r29 = r15;
            return new C89014bL(this, r12, r16, r6, r18, r2, r5, r7, r0, r4, r10, r11, emojiSearchProvider, r27, r1, r29, A092.A0J(), 3, R.string.f11nameremoved, Math.max(0, this.A06.A03(C66663Mh.A1v)), 0, 0, 16385);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C86654Ky.A12(menu.add(0, 1, 0, R.string.f11nameremoved), R.drawable.ic_action_add_person_shadow, 0);
        C18290x4.A1E(menu, 3, R.string.f11nameremoved);
        return super.onCreateOptionsMenu(menu);
    }

    public static /* synthetic */ void A0C(ListChatInfoActivity listChatInfoActivity) {
        Log.d("list_chat_info/onContactsChanged");
        ArrayList arrayList = listChatInfoActivity.A0j;
        arrayList.clear();
        HashSet A15 = AnonymousClass0x9.A15(C56892sj.A01(listChatInfoActivity.A0O, listChatInfoActivity.A7G()).A02());
        A15.remove(AnonymousClass4SG.A2m(listChatInfoActivity));
        A15.remove(listChatInfoActivity.A01.A0H());
        Iterator it = A15.iterator();
        while (it.hasNext()) {
            C86614Ku.A1T(listChatInfoActivity.A0I.A0A(C18300x5.A0P(it)), arrayList);
        }
        listChatInfoActivity.A7J();
        listChatInfoActivity.A7N();
    }

    public void A5r() {
        if (!this.A0e) {
            this.A0e = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r1 = A2X.A4Z;
            AnonymousClass4SG.A3X(r1, this, AnonymousClass4SG.A32(r1, this));
            AnonymousClass4SG.A3Y(r1, this, C86604Kt.A0V(r1));
            AnonymousClass4SG.A3Z(r1, this);
            AnonymousClass4SG.A3S(r1, r1.A00, this);
            AnonymousClass4SG.A3K(A2X, r1, this);
            AnonymousClass4SG.A3L(A2X, r1, this);
            C88744aj r3 = C88744aj.A00;
            this.A08 = r3;
            this.A0U = C86604Kt.A0X(r1);
            this.A06 = r3;
            this.A0L = C86604Kt.A0S(r1);
            this.A0O = (C55412qJ) r1.AGM.get();
            this.A0N = C86604Kt.A0W(r1);
            this.A0I = C86604Kt.A0R(r1);
            this.A0H = C86604Kt.A0Q(r1);
            this.A0J = (C48952fk) r1.A3e.get();
            this.A0W = (AnonymousClass33A) r1.A3X.get();
            this.A0d = C107695bk.A5a(r1);
            this.A0P = C86634Kw.A0g(r1);
            this.A07 = r3;
            this.A0b = C86614Ku.A0k(r1);
            this.A0c = C86614Ku.A0l(r1);
            this.A0C = C86634Kw.A0Y(r1);
            this.A0M = C86604Kt.A0T(r1);
            this.A0V = AnonymousClass4SG.A2k(r1);
            this.A0T = AnonymousClass4SG.A2j(r1);
            this.A0Q = (C55622qe) r1.AWO.get();
            this.A05 = r3;
            this.A0Z = C86614Ku.A0g(r1);
            this.A09 = (AnonymousClass2V2) A2X.A3N.get();
            this.A0X = (C29241iV) r1.AGn.get();
            this.A0a = (AnonymousClass5WX) r1.A00.A9K.get();
            this.A0A = (C101435Et) A2X.A3m.get();
            this.A0B = C86644Kx.A0N(r1);
        }
    }

    public AnonymousClass1fI A7G() {
        Class<AnonymousClass1fI> cls = AnonymousClass1fI.class;
        Jid A0I2 = this.A0R.A0I(cls);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("jid is not broadcast jid: ");
        C626936e.A07(A0I2, AnonymousClass000.A0R(this.A0R.A0I(cls), A0o));
        return (AnonymousClass1fI) A0I2;
    }

    public final void A7I() {
        C86624Kv.A0z(this.A00, R.id.starred_messages_separator, 8);
        C86604Kt.A1E(this.A00, R.id.participants_search, 8);
        C86604Kt.A1E(this.A00, R.id.mute_layout, 8);
        C86604Kt.A1E(this.A00, R.id.notifications_layout, 8);
        C86624Kv.A0z(this.A00, R.id.notifications_separator, 8);
        C86604Kt.A1E(this.A00, R.id.media_visibility_layout, 8);
        C86624Kv.A0z(this.A00, R.id.media_visibility_separator, 8);
    }

    public final void A7J() {
        C89364cO r1 = (C89364cO) C06560Yg.A02(this.A00, R.id.encryption_info_view);
        C89364cO.A02(this, r1, R.string.f11nameremoved);
        C18320x8.A13(r1, this, 20);
        r1.setVisibility(0);
    }

    public final void A7K() {
        int i;
        View A0G2 = C86644Kx.A0G(this.A01);
        if (A0G2 == null) {
            return;
        }
        if (this.A01.getWidth() > this.A01.getHeight()) {
            if (this.A01.getFirstVisiblePosition() == 0) {
                i = A0G2.getTop();
            } else {
                i = (-this.A00.getHeight()) + 1;
            }
            View view = this.A00;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (this.A00.getTop() != 0) {
            View view2 = this.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }

    public final void A7L() {
        TextView textView;
        long A042 = C615531h.A04(this.A0R.A0V, Long.MIN_VALUE);
        if (A042 != Long.MIN_VALUE || (textView = this.A02) == null) {
            String A0H2 = C107565bW.A0H(this.A0N, new Object[0], R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, A042, true);
            C626936e.A04(this.A0Y);
            this.A0Y.setSecondSubtitleText(A0H2);
        } else {
            textView.setVisibility(8);
        }
        boolean A1a = C86644Kx.A1a(this.A0E);
        this.A0G.A0E();
        A5n(A1a);
        AnonymousClass1NR A002 = this.A09.A00(this.A0G, A7G());
        this.A0E = A002;
        AnonymousClass0x7.A1B(A002, this.A04);
    }

    public final void A7M() {
        String A0J2;
        int i;
        if (AnonymousClass3ZH.A0E(this.A0R)) {
            A0J2 = getString(R.string.f11nameremoved);
            i = R.color.f5nameremoved;
        } else {
            A0J2 = this.A0R.A0J();
            i = R.color.f5nameremoved;
        }
        int A042 = AnonymousClass0Y8.A04(this, i);
        this.A0F.setTitleText(A0J2);
        C626936e.A04(this.A0Y);
        this.A0Y.A07(A0J2, false);
        this.A0Y.setTitleColor(A042);
        GroupDetailsCard groupDetailsCard = this.A0Y;
        Resources resources = getResources();
        ArrayList arrayList = this.A0j;
        int size = arrayList.size();
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1P(A0L2, arrayList.size(), 0);
        groupDetailsCard.setSubtitleText(resources.getQuantityString(R.plurals.f9nameremoved, size, A0L2));
    }

    public final void A7N() {
        TextView textView = this.A04;
        Resources resources = getResources();
        ArrayList arrayList = this.A0j;
        int size = arrayList.size();
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L2, arrayList.size());
        C86614Ku.A16(resources, textView, A0L2, R.plurals.f9nameremoved, size);
        A7O();
        Collections.sort(arrayList, new C117875sd(this.A01, this.A0I, 1));
        this.A0D.notifyDataSetChanged();
        A7M();
    }

    public final void A7O() {
        int A032 = this.A06.A03(C66663Mh.A15);
        ArrayList arrayList = this.A0j;
        if (arrayList.size() <= (A032 * 9) / 10 || A032 == 0) {
            this.A03.setVisibility(8);
            return;
        }
        this.A03.setVisibility(0);
        TextView textView = this.A03;
        Object[] A0M2 = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M2, arrayList.size(), 0);
        AnonymousClass000.A1P(A0M2, A032, 1);
        AnonymousClass001.A0y(this, textView, A0M2, R.string.f11nameremoved);
    }

    public final void A7P(boolean z) {
        String str;
        boolean z2;
        AnonymousClass3ZH r1 = this.A0S;
        if (r1 == null) {
            this.A05.A0H(R.string.f11nameremoved, 0);
            return;
        }
        C106165Xw r3 = this.A0c;
        String A022 = AnonymousClass36P.A02(r1);
        if (r1.A0R()) {
            str = r1.A0L();
            z2 = true;
        } else {
            str = null;
            z2 = false;
        }
        try {
            startActivityForResult(r3.A03(A022, str, z, z2), 10);
            this.A0b.A03(z, 9);
        } catch (ActivityNotFoundException unused) {
            C621433s.A01(this, 4);
        }
    }

    public void finishAfterTransition() {
        if (C107275b2.A00) {
            this.A00.setTransitionName((String) null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A00);
            transitionSet.addTransition(slide);
            AnonymousClass4SG.A38(this, new Slide(80), transitionSet, this.A01);
        }
        super.finishAfterTransition();
    }

    public ListChatInfoActivity(int i) {
        this.A0e = false;
        AnonymousClass68W.A00(this, 22);
    }

    public void A76() {
        super.A76();
        AnonymousClass1NR r1 = this.A0E;
        if (r1 != null) {
            r1.A0D(true);
            this.A0E = null;
        }
    }

    public void A79(long j) {
        super.A79(j);
        findViewById(R.id.actions_card).setVisibility(C86664Kz.A03((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        A7I();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r4.isEmpty() != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A7F(java.util.List r4) {
        /*
            r3 = this;
            super.A7F(r4)
            r0 = 2131430547(0x7f0b0c93, float:1.8482798E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x0016
            boolean r1 = r4.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setVisibility(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ListChatInfoActivity.A7F(java.util.List):void");
    }

    public final void A7H() {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A0j.iterator();
        while (it.hasNext()) {
            A0s.add(AnonymousClass3ZH.A06(it));
        }
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.conversation.EditBroadcastRecipientsSelector");
        A072.putExtra("selected", C627336j.A0A(A0s));
        startActivityForResult(A072, 12);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10:
            case 11:
                this.A0M.A08();
                this.A0b.A00();
                return;
            case 12:
                if (i2 == -1) {
                    Class<UserJid> cls = UserJid.class;
                    List A12 = C86634Kw.A12(intent, cls, "contacts");
                    ArrayList A0s = AnonymousClass001.A0s();
                    ArrayList A0s2 = AnonymousClass001.A0s();
                    HashSet A0K2 = AnonymousClass002.A0K();
                    ArrayList arrayList = this.A0j;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A0K2.add(C18310x6.A0R(it).A0I(cls));
                    }
                    for (Object next : A12) {
                        if (!A0K2.contains(next)) {
                            A0s.add(next);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Jid A0I2 = C18310x6.A0R(it2).A0I(cls);
                        if (!A12.contains(A0I2)) {
                            A0s2.add(A0I2);
                        }
                    }
                    if (!A0s.isEmpty()) {
                        AnonymousClass33A r9 = this.A0W;
                        AnonymousClass1fI A7G = A7G();
                        List list = A0s;
                        C162457s7.A0J(A7G, 0);
                        AnonymousClass3ZH A092 = r9.A02.A09(A7G);
                        if (A092 == null || (str = A092.A0M) == null) {
                            str = "pn";
                        }
                        boolean A0P2 = C162457s7.A0P(str, "lid");
                        boolean A012 = AnonymousClass33A.A01(A0s);
                        boolean A0X2 = r9.A0B.A0X(4509);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("BroadcastListManager/addListParticipants adding to list: ");
                        A0o.append(A7G);
                        A0o.append("; isCurrentAddressingModeLid=");
                        A0o.append(A0P2);
                        A0o.append("; addingLidParticipant=");
                        A0o.append(A012);
                        A0o.append("; lidAbPropEnabled=");
                        A0o.append(A0X2);
                        C18260x0.A1R(A0o, ";  participants=", A0s);
                        if (A0P2) {
                            if (A0X2) {
                                list = r9.A03(A0s);
                            } else {
                                r9.A04(A7G, "pn");
                                list = AnonymousClass33A.A00(A0s);
                            }
                        } else if (A012) {
                            if (A0X2) {
                                r9.A04(A7G, "lid");
                                list = r9.A03(A0s);
                            } else {
                                list = AnonymousClass33A.A00(A0s);
                            }
                        }
                        r9.A0C.A0P(A7G, C86624Kv.A0d(list));
                        Iterator it3 = A0s.iterator();
                        while (it3.hasNext()) {
                            C86614Ku.A1P(this.A0I, C18300x5.A0P(it3), arrayList);
                        }
                    }
                    if (!A0s2.isEmpty()) {
                        AnonymousClass33A r2 = this.A0W;
                        AnonymousClass1fI A7G2 = A7G();
                        C162457s7.A0J(A7G2, 0);
                        r2.A0C.A0Q(A7G2, A0s2);
                        Iterator it4 = A0s2.iterator();
                        while (it4.hasNext()) {
                            arrayList.remove(this.A0I.A0A(C18300x5.A0P(it4)));
                        }
                    }
                    A7N();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        Intent intent;
        AnonymousClass3ZH r3 = ((AnonymousClass5J3) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0S = r3;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                Intent A0N2 = C627736r.A0N(this, r3);
                A0N2.putExtra("entry_point_conversion_source", "broadcast_list_context_menu");
                A0N2.putExtra("entry_point_conversion_app", SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
                this.A00.A0B(this, A0N2);
                return true;
            } else if (itemId == 2) {
                A7P(true);
                return true;
            } else if (itemId == 3) {
                A7P(false);
                return true;
            } else if (itemId == 5) {
                C621433s.A01(this, 6);
                return true;
            } else if (itemId != 6) {
                return false;
            } else {
                intent = C627736r.A0j(this, AnonymousClass3ZH.A07(this.A0S));
            }
        } else if (r3.A0F == null) {
            return true;
        } else {
            intent = C86664Kz.A1B().A1M(this, r3, AnonymousClass0x7.A0g());
        }
        startActivity(intent);
        return true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AnonymousClass3ZH r3 = ((AnonymousClass5J3) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (r3 != null) {
            String A0h2 = C18300x5.A0h(this.A0I, r3);
            contextMenu.add(0, 1, 0, C107345b9.A05(this, this.A0C, AnonymousClass002.A0F(this, A0h2, new Object[1], 0, R.string.f11nameremoved)));
            if (r3.A0F == null) {
                contextMenu.add(0, 2, 0, R.string.f11nameremoved);
                contextMenu.add(0, 3, 0, R.string.f11nameremoved);
            } else {
                contextMenu.add(0, 0, 0, C107345b9.A05(this, this.A0C, AnonymousClass0x2.A0X(this, A0h2, 1, R.string.f11nameremoved)));
            }
            if (this.A0j.size() > 2) {
                contextMenu.add(0, 5, 0, C107345b9.A05(this, this.A0C, AnonymousClass0x2.A0X(this, A0h2, 1, R.string.f11nameremoved)));
            }
            contextMenu.add(0, 6, 0, R.string.f11nameremoved);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0K.A00();
        this.A0H.A07(this.A0g);
        this.A0P.A07(this.A0h);
        this.A0C.A07(this.A0f);
        this.A0X.A07(this.A0i);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                C116985rC r1 = this.A05;
                if (r1.A07()) {
                    r1.A04();
                    A7G();
                    this.A08.A04();
                    throw AnonymousClass001.A0g("getLabelBroadcastList");
                }
            } else if (itemId == 3) {
                C621433s.A01(this, 3);
            } else if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            } else {
                AnonymousClass0X0.A00(this);
                return true;
            }
            return true;
        }
        A7H();
        return true;
    }

    public void onResume() {
        super.onResume();
        C86624Kv.A1M(this.A04, this, A7G(), 6);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass3ZH r0 = this.A0S;
        if (r0 != null) {
            bundle.putString("selected_jid", C627336j.A07(r0.A0H));
        }
    }

    public ListChatInfoActivity() {
        this(0);
        this.A0j = AnonymousClass001.A0s();
        this.A0g = AnonymousClass681.A00(this, 11);
        this.A0f = new C1233167y(this, 3);
        this.A0i = new AnonymousClass687(this, 3);
        this.A0h = new C124166Bf(this, 4);
    }
}
