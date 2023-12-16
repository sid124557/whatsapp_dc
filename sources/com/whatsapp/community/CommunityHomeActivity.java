package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass10x;
import X.AnonymousClass11H;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass30V;
import X.AnonymousClass33S;
import X.AnonymousClass3AE;
import X.AnonymousClass3ZH;
import X.AnonymousClass48D;
import X.AnonymousClass49S;
import X.AnonymousClass4AQ;
import X.AnonymousClass4FI;
import X.AnonymousClass4SG;
import X.AnonymousClass4Ul;
import X.AnonymousClass4VM;
import X.AnonymousClass4ZY;
import X.AnonymousClass5AV;
import X.AnonymousClass5TS;
import X.AnonymousClass5UY;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass688;
import X.AnonymousClass68W;
import X.AnonymousClass697;
import X.AnonymousClass6C6;
import X.AnonymousClass6FB;
import X.C005205m;
import X.C05930Vn;
import X.C06560Yg;
import X.C08240dc;
import X.C08310eF;
import X.C100385As;
import X.C101445Eu;
import X.C101455Ev;
import X.C101465Ew;
import X.C104265Qh;
import X.C104335Qo;
import X.C105365Uq;
import X.C105965Xc;
import X.C106545Zk;
import X.C106715a2;
import X.C107385bE;
import X.C107405bG;
import X.C107445bK;
import X.C107695bk;
import X.C111085hW;
import X.C111095hX;
import X.C114015mM;
import X.C1223163x;
import X.C1237669r;
import X.C124086Ax;
import X.C133316h8;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C27991fJ;
import X.C28891hw;
import X.C29331ie;
import X.C39542Cj;
import X.C44272Vj;
import X.C46942cS;
import X.C47102ci;
import X.C47122ck;
import X.C50932j0;
import X.C52882mC;
import X.C54182oJ;
import X.C54292oU;
import X.C56072rN;
import X.C56252rg;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C620633i;
import X.C620733j;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64333Db;
import X.C64633Eh;
import X.C64653Ej;
import X.C64773Ex;
import X.C66433Lk;
import X.C66493Lq;
import X.C66503Lr;
import X.C66663Mh;
import X.C69263Wi;
import X.C71553cI;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.communityInfo.CAGInfoFragment;
import com.whatsapp.community.communityInfo.CommunityHomeFragment;
import com.whatsapp.contact.view.custom.ContactDetailsActionIcon;
import com.whatsapp.wds.components.actiontile.WDSActionTile;
import java.util.List;

public class CommunityHomeActivity extends C89644eZ {
    public int A00;
    public long A01;
    public Menu A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public ImageView A0A;
    public Space A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public SearchView A0F;
    public ViewPager2 A0G;
    public AppBarLayout A0H;
    public C101445Eu A0I;
    public C101455Ev A0J;
    public C101465Ew A0K;
    public C39542Cj A0L;
    public TextEmojiLabel A0M;
    public TextEmojiLabel A0N;
    public C133316h8 A0O;
    public C44272Vj A0P;
    public AnonymousClass49S A0Q;
    public C56942so A0R;
    public AnonymousClass4VM A0S;
    public C46942cS A0T;
    public C1223163x A0U;
    public CommunityMembersViewModel A0V;
    public C64653Ej A0W;
    public AnonymousClass11H A0X;
    public C64773Ex A0Y;
    public AnonymousClass5ZU A0Z;
    public C105365Uq A0a;
    public C114015mM A0b;
    public C47102ci A0c;
    public C56982ss A0d;
    public C28891hw A0e;
    public C56892sj A0f;
    public AnonymousClass3ZH A0g;
    public AnonymousClass48D A0h;
    public AnonymousClass10x A0i;
    public AnonymousClass5TS A0j;
    public C66493Lq A0k;
    public C50932j0 A0l;
    public C66503Lr A0m;
    public C29331ie A0n;
    public C27991fJ A0o;
    public C27991fJ A0p;
    public AnonymousClass33S A0q;
    public AnonymousClass1R1 A0r;
    public C66433Lk A0s;
    public AnonymousClass30V A0t;
    public C54182oJ A0u;
    public C56072rN A0v;
    public C106715a2 A0w;
    public AnonymousClass5UY A0x;
    public AnonymousClass5UY A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public final AnonymousClass4FI A14;
    public final AnonymousClass4AQ A15;
    public final C56252rg A16;

    public void onStop() {
        this.A0z = true;
        AnonymousClass11H r0 = this.A0X;
        if (r0 != null) {
            r0.A0D();
        }
        super.onStop();
    }

    public void A5r() {
        if (!this.A10) {
            this.A10 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r3 = A2W.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r2 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r2, this, AnonymousClass4SG.A2t(r3, r2, this));
            this.A0w = C18280x3.A0Q(r2);
            this.A0d = C64333Db.A39(r3);
            this.A0q = (AnonymousClass33S) r3.AUY.get();
            this.A0b = C64333Db.A29(r3);
            this.A0Y = C64333Db.A26(r3);
            this.A0s = C86604Kt.A0e(r3);
            this.A0Z = C64333Db.A28(r3);
            this.A0v = C64333Db.A8w(r3);
            this.A0k = C64333Db.A5A(r3);
            this.A0m = (C66503Lr) r3.AGs.get();
            this.A0u = r3.ArS();
            this.A0r = C86634Kw.A0p(r3);
            this.A0W = C86654Ky.A0X(r3);
            this.A0R = C64333Db.A1k(r3);
            this.A0n = (C29331ie) r3.AP8.get();
            this.A0e = C86614Ku.A0Y(r3);
            this.A0P = (C44272Vj) r3.A5U.get();
            this.A0l = C86664Kz.A1A(r3);
            this.A0f = C64333Db.A3G(r3);
            this.A0I = (C101445Eu) A2W.A3Q.get();
            this.A0t = C86604Kt.A0f(r3);
            this.A0c = (C47102ci) r2.A2Z.get();
            this.A0J = (C101455Ev) A2W.A3R.get();
            this.A0K = (C101465Ew) A2W.A3S.get();
            this.A0U = (C1223163x) A2W.A3T.get();
            this.A0L = (C39542Cj) A2W.A3V.get();
            this.A0h = (AnonymousClass48D) A2W.A3X.get();
            this.A0Q = (AnonymousClass49S) A2W.A0V.get();
        }
    }

    public void A66() {
        this.A0t.A03(this.A0p, 2);
        super.A66();
    }

    public final void A74() {
        boolean z;
        AnonymousClass5UY r0;
        if (!this.A0D.A0X(3267) || (!this.A0f.A0D(this.A0p) && !this.A0T.A00())) {
            z = false;
        } else {
            z = true;
        }
        View view = this.A05;
        if (z) {
            view.setVisibility(0);
            this.A0B.setVisibility(8);
            boolean A0D2 = this.A0f.A0D(this.A0p);
            View view2 = this.A09;
            if (!A0D2) {
                view2.setVisibility(8);
                if (!this.A0R.A0F(this.A0p)) {
                    this.A03.setVisibility(8);
                }
                this.A03.setVisibility(0);
            } else {
                view2.setVisibility(0);
                this.A03.setVisibility(0);
            }
            this.A07.setLayoutParams(new AnonymousClass6FB(-1, -2));
            if (this.A0P.A00()) {
                this.A0x.A06(0);
                this.A0y.A06(8);
                r0 = this.A0x;
            } else {
                return;
            }
        } else {
            view.setVisibility(8);
            this.A0B.setVisibility(0);
            this.A07.setLayoutParams(new AnonymousClass6FB(-1, -2));
            if (this.A0P.A00()) {
                this.A0x.A06(8);
                this.A0y.A06(0);
                r0 = this.A0y;
            } else {
                return;
            }
        }
        this.A06 = r0.A04();
    }

    public final void A75(int i) {
        this.A00 = i;
        if (this.A12) {
            this.A0D.setText(R.string.f11nameremoved);
            this.A0C.setText(R.string.f11nameremoved);
            return;
        }
        TextView textView = this.A0D;
        Resources resources = getResources();
        Integer valueOf = Integer.valueOf(i);
        C86614Ku.A16(resources, textView, new Object[]{valueOf}, R.plurals.f9nameremoved, i);
        TextView textView2 = this.A0C;
        C86614Ku.A16(getResources(), textView2, new Object[]{valueOf}, R.plurals.f9nameremoved, i);
    }

    public final void A76(String str) {
        if (!(!this.A0E) && !this.A13) {
            Intent A022 = C627736r.A02(this);
            A022.putExtra("snackbar_message", str);
            A022.setFlags(67108864);
            startActivity(A022);
            this.A13 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r5 != 4660) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 16
            if (r5 == r0) goto L_0x0054
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 == r0) goto L_0x0010
            r0 = 4660(0x1234, float:6.53E-42)
            if (r5 == r0) goto L_0x0065
        L_0x000c:
            super.onActivityResult(r5, r6, r7)
        L_0x000f:
            return
        L_0x0010:
            if (r7 == 0) goto L_0x000f
            r0 = -1
            if (r6 != r0) goto L_0x000f
            X.5TS r1 = r4.A0j
            r0 = 1
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x000f
            X.3ZH r0 = r4.A0g
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "extra_community_name"
            java.lang.String r2 = r7.getStringExtra(r0)
            if (r2 == 0) goto L_0x0039
            X.5TS r0 = r4.A0j
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0039
            X.11H r1 = r4.A0X
            X.1fJ r0 = r4.A0p
            r1.A0H(r0, r2)
        L_0x0039:
            java.lang.String r0 = "extra_community_description"
            java.lang.String r0 = r7.getStringExtra(r0)
            if (r0 == 0) goto L_0x000f
            X.11H r3 = r4.A0X
            X.3ZH r2 = r4.A0g
            r3.A06 = r0
            X.107 r0 = r3.A0z
            X.AnonymousClass0x7.A18(r0)
            X.4FS r1 = r3.A17
            r0 = 44
            X.C86624Kv.A1M(r1, r3, r2, r0)
            return
        L_0x0054:
            X.0XL r1 = X.AnonymousClass0x9.A0H(r4)
            java.lang.Class<X.4UD> r0 = X.AnonymousClass4UD.class
            X.0Ty r0 = r1.A01(r0)
            X.4UD r0 = (X.AnonymousClass4UD) r0
            X.4UC r0 = r0.A00
            X.AnonymousClass0x7.A18(r0)
        L_0x0065:
            X.0XL r1 = X.AnonymousClass0x9.A0H(r4)
            java.lang.Class<com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel> r0 = com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel.class
            X.0Ty r0 = r1.A01(r0)
            com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel r0 = (com.whatsapp.community.communityInfo.viewModels.CAGInfoChatLockViewModel) r0
            X.08J r0 = r0.A02
            X.AnonymousClass0x7.A18(r0)
            X.1fJ r1 = r4.A0o
            if (r1 == 0) goto L_0x000c
            X.2ss r0 = r4.A0d
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x000c
            X.1R1 r1 = r4.A0r
            X.1fJ r0 = r4.A0o
            boolean r0 = r1.A0i(r0)
            if (r0 == 0) goto L_0x000c
            X.4FS r2 = r4.A04
            r1 = 28
            X.3cI r0 = new X.3cI
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.BkM(r0)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityHomeActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        if (C86604Kt.A1Z(this.A0X.A02.A03)) {
            C64633Eh r2 = this.A0X.A02;
            C18320x8.A18(r2.A03, false);
            r2.A01.AwB(Integer.valueOf(r2.A00));
            r2.A04.run();
        } else if (this.A0z) {
            C111095hX r22 = this.A0W.A01;
            Intent A022 = C627736r.A02(this);
            A022.setFlags(67108864);
            r22.A0A(this, A022);
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r4.A0f.A0D(r4.A0p) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            r4.A02 = r5
            boolean r0 = r4.A12
            r3 = 1
            if (r0 != 0) goto L_0x0044
            X.2Vj r0 = r4.A0P
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0044
            X.2rN r0 = r4.A0v
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0022
            X.2sj r1 = r4.A0f
            X.1fJ r0 = r4.A0p
            boolean r1 = r1.A0D(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            android.view.MenuInflater r1 = r4.getMenuInflater()
            if (r0 == 0) goto L_0x0045
            r0 = 2131820550(0x7f110006, float:1.9273818E38)
            r1.inflate(r0, r5)
            r0 = 2131431386(0x7f0b0fda, float:1.84845E38)
            android.view.MenuItem r2 = r5.findItem(r0)
            X.1VX r1 = r4.A0D
            r0 = 3267(0xcc3, float:4.578E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            r2.setVisible(r0)
        L_0x0044:
            return r3
        L_0x0045:
            r0 = 2131820551(0x7f110007, float:1.927382E38)
            r1.inflate(r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityHomeActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        C105365Uq r0 = this.A0a;
        if (r0 != null) {
            r0.A00();
        }
        C50932j0 r1 = this.A0l;
        if (r1 != null) {
            r1.A01(this.A15);
        }
        C29331ie r12 = this.A0n;
        if (r12 != null) {
            r12.A07(this.A16);
        }
        C28891hw r13 = this.A0e;
        if (r13 != null) {
            r13.A07(this.A14);
        }
        super.onDestroy();
    }

    public CommunityHomeActivity(int i) {
        this.A10 = false;
        AnonymousClass68W.A00(this, 26);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        A5u.A00 = 9;
        A5u.A01 = null;
        A5u.A06 = true;
        return A5u;
    }

    public void onCreate(Bundle bundle) {
        Drawable navigationIcon;
        this.A01 = SystemClock.uptimeMillis();
        super.onCreate(bundle);
        A61("render_community_home");
        this.A11 = C106545Zk.A01(this.A0D);
        C27991fJ A0k2 = C86634Kw.A0k(getIntent(), "parent_group_jid");
        C626936e.A06(A0k2);
        this.A0p = A0k2;
        C52882mC A002 = this.A0R.A0H.A00(A0k2);
        if (A002 != null) {
            this.A0o = (C27991fJ) A002.A02;
        }
        this.A0a = this.A0b.A06(this, "community-home");
        if (this.A0P.A00()) {
            setContentView((int) R.layout.f8nameremoved);
            TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            this.A0G = (ViewPager2) findViewById(R.id.pager);
            AnonymousClass4ZY r4 = new AnonymousClass4ZY(this);
            C27991fJ r7 = this.A0p;
            C162457s7.A0J(r7, 0);
            CommunityHomeFragment communityHomeFragment = new CommunityHomeFragment();
            C86604Kt.A18(AnonymousClass002.A08(), communityHomeFragment, r7, "parentJid");
            String string = getString(R.string.f11nameremoved);
            List list = r4.A00;
            list.add(communityHomeFragment);
            List list2 = r4.A01;
            list2.add(string);
            C27991fJ r72 = this.A0o;
            if (r72 != null) {
                CAGInfoFragment cAGInfoFragment = new CAGInfoFragment();
                C86604Kt.A18(AnonymousClass002.A08(), cAGInfoFragment, r72, "cagJid");
                String string2 = getString(R.string.f11nameremoved);
                list.add(cAGInfoFragment);
                list2.add(string2);
            }
            int intExtra = getIntent().getIntExtra("tab_start_position", 0);
            this.A0G.setAdapter(r4);
            this.A0G.setCurrentItem(intExtra);
            this.A0G.setUserInputEnabled(false);
            new C104265Qh(this.A0G, tabLayout, new C111085hW(r4, this)).A00();
        } else {
            setContentView((int) R.layout.f8nameremoved);
            if (bundle == null) {
                Bundle A082 = AnonymousClass002.A08();
                A082.putString("parentJid", this.A0p.getRawString());
                C08240dc A0J2 = AnonymousClass0x2.A0J(this);
                A0J2.A0H = true;
                Class<CommunityHomeFragment> cls = CommunityHomeFragment.class;
                C05930Vn r1 = A0J2.A0I;
                if (r1 == null) {
                    throw AnonymousClass001.A0e("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                } else if (A0J2.A0K != null) {
                    C08310eF A003 = r1.A00(cls.getName());
                    A003.A0u(A082);
                    A0J2.A09(A003, R.id.community_home_fragment);
                    A0J2.A01();
                } else {
                    throw AnonymousClass001.A0e("The FragmentManager must be attached to itshost to create a Fragment");
                }
            }
        }
        this.A04.BkM(new C71553cI((Object) this, 32));
        AnonymousClass3ZH A072 = this.A0Y.A07(this.A0p);
        this.A0g = A072;
        if (A072 == null || this.A0d.A0Q(this.A0p)) {
            A76(getString(R.string.f11nameremoved));
            return;
        }
        this.A0n.A06(this.A16);
        this.A0A = C86664Kz.A0u(this, R.id.communityPhoto);
        this.A0N = (TextEmojiLabel) C005205m.A00(this, R.id.communityName);
        this.A0M = (TextEmojiLabel) C005205m.A00(this, R.id.collapsedCommunityName);
        this.A0C = C005205m.A01(this, R.id.collapsedCommunityStatus);
        this.A0D = C005205m.A01(this, R.id.communityStatus);
        this.A08 = C005205m.A00(this, R.id.change_subject_and_desription_progress);
        this.A07 = C005205m.A00(this, R.id.headerView);
        Toolbar A2T = AnonymousClass4SG.A2T(this);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, A2T);
        A2S.A0N(true);
        A2S.A0Q(false);
        if (!C107405bG.A0D(this) && (navigationIcon = A2T.getNavigationIcon()) != null) {
            navigationIcon.setColorFilter(getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_ATOP);
            A2T.setNavigationIcon(navigationIcon);
        }
        if (C107385bE.A01()) {
            for (int i = 0; i < A2T.getChildCount(); i++) {
                View childAt = A2T.getChildAt(i);
                if (childAt != null) {
                    childAt.setAccessibilityTraversalBefore(R.id.communityPhoto);
                }
            }
            this.A0M.setAccessibilityTraversalAfter(R.id.communityPhoto);
            this.A0C.setAccessibilityTraversalAfter(R.id.communityPhoto);
        }
        this.A0H = (AppBarLayout) C005205m.A00(this, R.id.app_bar);
        C86634Kw.A15(this, A2S);
        A2S.A0O(true);
        C626936e.A04(A2S.A03());
        SearchView searchView = (SearchView) C005205m.A00(this, R.id.search_view);
        this.A0F = searchView;
        TextView A0G2 = C18300x5.A0G(searchView, R.id.search_src_text);
        this.A0E = A0G2;
        AnonymousClass5Yj.A0B(this, A0G2, R.attr.f3nameremoved, R.color.f5nameremoved);
        View findViewById = findViewById(R.id.search_edit_frame);
        if (findViewById != null) {
            removeSearchEditFrameExtraMargin(findViewById);
        }
        this.A0F.setQueryHint(getString(R.string.f11nameremoved));
        this.A0F.setIconifiedByDefault(false);
        this.A0F.A0B = new AnonymousClass3AE(this);
        if (this.A0P.A00()) {
            this.A0x = AnonymousClass5UY.A01(this, R.id.community_home_header_bottom_divider_admin);
            this.A0y = AnonymousClass5UY.A01(this, R.id.community_home_header_bottom_divider_non_admin);
        }
        ViewStub viewStub = (ViewStub) C005205m.A00(this, R.id.community_home_header_actions);
        if (this.A11) {
            viewStub.setLayoutResource(R.layout.f8nameremoved);
        }
        this.A05 = viewStub.inflate();
        this.A0B = (Space) C005205m.A00(this, R.id.community_home_header_bottom_space);
        View A022 = C06560Yg.A02(this.A05, R.id.action_share_link);
        this.A09 = A022;
        if (!this.A11) {
            ((ContactDetailsActionIcon) A022).setActionTitleWidth(90);
        }
        C18320x8.A13(this.A09, this, 26);
        View A023 = C06560Yg.A02(this.A05, R.id.action_add_group);
        this.A03 = A023;
        if (!this.A11) {
            ((ContactDetailsActionIcon) A023).setActionTitleWidth(90);
        }
        C18320x8.A13(this.A03, this, 27);
        this.A04 = C06560Yg.A02(this.A05, R.id.action_add_members);
        C101465Ew r12 = this.A0K;
        C27991fJ r3 = this.A0o;
        C27991fJ r2 = this.A0p;
        C69263Wi A042 = C64333Db.A04(r12.A00.A03);
        C64333Db r13 = r12.A00.A03;
        C54292oU A2q = C64333Db.A2q(r13);
        this.A0T = new C46942cS(A042, (C44272Vj) r13.A5U.get(), C64333Db.A28(r13), A2q, C64333Db.A3G(r13), r3, r2);
        if (!this.A11) {
            ((ContactDetailsActionIcon) this.A04).setActionTitleWidth(90);
        }
        if (this.A0P.A00()) {
            boolean z = this.A11;
            View view = this.A04;
            if (z) {
                ((WDSActionTile) view).setText((int) R.string.f11nameremoved);
            } else {
                ((ContactDetailsActionIcon) view).setTitle(R.string.f11nameremoved);
            }
        }
        C18320x8.A13(this.A04, this, 28);
        A74();
        C44272Vj r32 = this.A0P;
        C105965Xc r22 = new C105965Xc();
        r22.A00 = 10;
        r22.A0C = true;
        if (r32.A00()) {
            r22.A06 = true;
            r22.A09 = true;
            r22.A0B = true;
            r22.A08 = false;
        }
        this.A0X = AnonymousClass11H.A00(this, this.A0L, r22, this.A0p);
        this.A0S = (AnonymousClass4VM) C124086Ax.A00(this, this.A0p, this.A0J, 3).A01(AnonymousClass4VM.class);
        AnonymousClass6C6.A01(this, this.A0X.A0x, 104);
        AnonymousClass6C6.A01(this, this.A0X.A0F, 94);
        AnonymousClass6C6.A01(this, this.A0X.A0D, 100);
        getSupportFragmentManager().A0j(new C107445bK(this, 5), this, "NewCommunityAdminBottomSheetFragment");
        AnonymousClass4Ul r23 = (AnonymousClass4Ul) C124086Ax.A00(this, this.A0I, this.A0g, 7).A01(AnonymousClass4Ul.class);
        if (bundle != null) {
            this.A12 = C86614Ku.A1W(r23.A05, Boolean.TRUE);
        }
        AnonymousClass6C6.A01(this, r23.A05, 95);
        this.A0l.A00(this.A15);
        this.A0e.A06(this.A14);
        AnonymousClass6C6.A01(this, this.A0X.A16, 96);
        AnonymousClass6C6.A01(this, this.A0X.A15, 97);
        AnonymousClass6C6.A01(this, this.A0X.A14, 98);
        AnonymousClass6C6.A01(this, this.A0X.A0C, 99);
        AnonymousClass6C6.A01(this, this.A0X.A0E, 101);
        AnonymousClass6C6.A01(this, this.A0X.A0B, 102);
        AnonymousClass6C6.A01(this, this.A0X.A02.A03, 103);
        this.A0V = AnonymousClass5AV.A00(this, this.A0U, this.A0p);
        AnonymousClass0x2.A0z(this.A0A, this, 22);
        AnonymousClass1VX r73 = this.A0D;
        C27991fJ r6 = this.A0p;
        C69263Wi r11 = this.A05;
        AnonymousClass33S r5 = this.A0q;
        C66663Mh r122 = this.A06;
        C620733j r42 = this.A00;
        AnonymousClass5ZU r15 = this.A0Z;
        C64773Ex r14 = this.A0Y;
        C66493Lq r33 = this.A0k;
        C66503Lr r24 = this.A0m;
        C620733j r16 = r42;
        this.A0j = new AnonymousClass5TS((View) null, this, r11, r122, this.A07, r14, r15, r16, this.A0e, this.A0f, r73, r33, r24, r6, r5);
        C27991fJ r25 = this.A0o;
        if (r25 != null) {
            this.A0i = (AnonymousClass10x) C86624Kv.A0D(this, this.A00, this.A0h, r25);
        }
        AnonymousClass1VX r152 = this.A0D;
        C106715a2 r17 = this.A0w;
        C111095hX r9 = this.A00;
        C64773Ex r123 = this.A0Y;
        C66433Lk r0 = this.A0s;
        C620633i r142 = this.A08;
        AnonymousClass5ZU r132 = this.A0Z;
        CommunityMembersViewModel communityMembersViewModel = this.A0V;
        C100385As.A00(this, communityMembersViewModel.A03, new C104335Qo(r9, this, communityMembersViewModel, r123, r132, r142, r152, r0, r17), 8);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_manage_groups) {
            startActivity(C627736r.A0T(this, this.A0p));
            return true;
        } else if (menuItem.getItemId() == R.id.menu_edit_community) {
            C27991fJ r3 = this.A0p;
            Intent A072 = C18320x8.A07();
            A072.setClassName(getPackageName(), "com.whatsapp.community.EditCommunityActivity");
            C627336j.A0D(A072, r3, "extra_community_jid");
            startActivityForResult(A072, 123);
            return true;
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == R.id.menu_view_members) {
            this.A00.A0C(this, C627736r.A0Y(this, this.A0p, false), "communityHome");
            return true;
        } else {
            super.onOptionsItemSelected(menuItem);
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0d.A0Q(this.A0p)) {
            A76(getString(R.string.f11nameremoved));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A01 > 0) {
            A60("render_community_home");
            BKe(2);
            this.A0u.A00(9, SystemClock.uptimeMillis() - this.A01);
            this.A01 = 0;
        }
    }

    public final void removeSearchEditFrameExtraMargin(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.setMarginStart(0);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        C626936e.A0D(false, "Unexpected LayoutParams for search edit frame. Margins not updated.");
    }

    public int A5t() {
        return 579544921;
    }

    public CommunityHomeActivity() {
        this(0);
        this.A15 = new AnonymousClass697(this, 0);
        this.A16 = new AnonymousClass688(this, 0);
        this.A14 = new C1237669r(this, 1);
    }
}
