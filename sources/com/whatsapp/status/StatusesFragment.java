package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass08M;
import X.AnonymousClass0GC;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass1fY;
import X.AnonymousClass2MD;
import X.AnonymousClass2W5;
import X.AnonymousClass2X0;
import X.AnonymousClass30V;
import X.AnonymousClass33p;
import X.AnonymousClass4BK;
import X.AnonymousClass4FS;
import X.AnonymousClass4FU;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass54U;
import X.AnonymousClass58A;
import X.AnonymousClass5AR;
import X.AnonymousClass5B7;
import X.AnonymousClass5F9;
import X.AnonymousClass5ME;
import X.AnonymousClass5O5;
import X.AnonymousClass5PU;
import X.AnonymousClass5S1;
import X.AnonymousClass5U2;
import X.AnonymousClass5X9;
import X.AnonymousClass5YA;
import X.AnonymousClass5YU;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass5b0;
import X.AnonymousClass640;
import X.AnonymousClass673;
import X.AnonymousClass67F;
import X.AnonymousClass681;
import X.AnonymousClass68J;
import X.AnonymousClass69P;
import X.AnonymousClass6C6;
import X.AnonymousClass8JP;
import X.AnonymousClass8s5;
import X.C003203q;
import X.C05110Rz;
import X.C06560Yg;
import X.C08310eF;
import X.C1001059l;
import X.C100385As;
import X.C102185Hu;
import X.C102195Hv;
import X.C102335Il;
import X.C102875Kp;
import X.C102975Kz;
import X.C103635Nt;
import X.C103825Oo;
import X.C104715Sb;
import X.C104745Se;
import X.C105045Tj;
import X.C105105Tp;
import X.C105125Tr;
import X.C105365Uq;
import X.C105765Wh;
import X.C105795Wl;
import X.C107175ap;
import X.C107335b8;
import X.C107575bX;
import X.C107765br;
import X.C107895c5;
import X.C110065fd;
import X.C110395gA;
import X.C111095hX;
import X.C113995mK;
import X.C114015mM;
import X.C115155oD;
import X.C115805pG;
import X.C116745qn;
import X.C116985rC;
import X.C117715sN;
import X.C1226065a;
import X.C1226165b;
import X.C1226265c;
import X.C1226665g;
import X.C1228966g;
import X.C1229666n;
import X.C1229966q;
import X.C124176Bg;
import X.C135166kE;
import X.C15910sA;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C183538qC;
import X.C187958y5;
import X.C29081iF;
import X.C29141iL;
import X.C29421in;
import X.C29431io;
import X.C380625j;
import X.C44772Xk;
import X.C45512a8;
import X.C48102eL;
import X.C48852fa;
import X.C54292oU;
import X.C55152pt;
import X.C55262q4;
import X.C56082rO;
import X.C56512s6;
import X.C56602sG;
import X.C56612sH;
import X.C56952sp;
import X.C56972sr;
import X.C57052sz;
import X.C58422vE;
import X.C61072zf;
import X.C613930n;
import X.C620233e;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C623534r;
import X.C627736r;
import X.C634139d;
import X.C64773Ex;
import X.C65173Gm;
import X.C66493Lq;
import X.C66543Lv;
import X.C66663Mh;
import X.C69263Wi;
import X.C71293bs;
import X.C84334By;
import X.C85014Ep;
import X.C85324Fu;
import X.C85334Fv;
import X.C85344Fw;
import X.C86164Jb;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87044Mw;
import X.C87184Oi;
import X.C88694ab;
import X.C95124sf;
import X.C95814uZ;
import X.C989753y;
import X.C994155q;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public class StatusesFragment extends Hilt_StatusesFragment implements C15910sA, C1229966q, C1228966g, C1229666n, C1226665g, AnonymousClass640, C85324Fu, C85334Fv, C85344Fw {
    public AnimatorSet A00;
    public AnimatorSet A01;
    public View A02;
    public View A03;
    public C116985rC A04;
    public C116985rC A05;
    public C116985rC A06;
    public C116985rC A07;
    public C116985rC A08;
    public C116985rC A09;
    public C107895c5 A0A;
    public C111095hX A0B;
    public AnonymousClass5ME A0C;
    public AnonymousClass5F9 A0D;
    public C69263Wi A0E;
    public C56972sr A0F;
    public C66663Mh A0G;
    public C48852fa A0H;
    public C621033m A0I;
    public WfalManager A0J;
    public AnonymousClass5O5 A0K;
    public C44772Xk A0L;
    public C64773Ex A0M;
    public C29421in A0N;
    public AnonymousClass5ZU A0O;
    public C105365Uq A0P;
    public C114015mM A0Q;
    public C105045Tj A0R;
    public C55262q4 A0S;
    public C56512s6 A0T;
    public C620633i A0U;
    public C380625j A0V;
    public C56612sH A0W;
    public C54292oU A0X;
    public AnonymousClass5ZR A0Y;
    public AnonymousClass33p A0Z;
    public C620733j A0a;
    public C61072zf A0b;
    public C66543Lv A0c;
    public C29431io A0d;
    public C55152pt A0e;
    public AnonymousClass2W5 A0f;
    public C620233e A0g;
    public AnonymousClass1VX A0h;
    public AnonymousClass4FV A0i;
    public C48102eL A0j;
    public C66493Lq A0k;
    public AnonymousClass1R1 A0l;
    public C110065fd A0m;
    public AnonymousClass5PU A0n;
    public StatusExpirationLifecycleOwner A0o;
    public C29081iF A0p;
    public C87184Oi A0q;
    public C105795Wl A0r;
    public C102335Il A0s;
    public C45512a8 A0t;
    public C102185Hu A0u;
    public AnonymousClass2MD A0v;
    public C102195Hv A0w;
    public C103825Oo A0x;
    public C65173Gm A0y;
    public C105105Tp A0z;
    public C105765Wh A10 = new C105765Wh();
    public AnonymousClass2X0 A11;
    public C115155oD A12;
    public C113995mK A13;
    public AnonymousClass5X9 A14;
    public C103635Nt A15;
    public C613930n A16;
    public AnonymousClass54U A17;
    public C994155q A18;
    public AnonymousClass30V A19;
    public C187958y5 A1A;
    public AnonymousClass4FS A1B;
    public C29141iL A1C;
    public C104745Se A1D;
    public C183538qC A1E;
    public C183538qC A1F;
    public C183538qC A1G;
    public C183538qC A1H;
    public CharSequence A1I;
    public List A1J;
    public List A1K = AnonymousClass001.A0s();
    public List A1L = AnonymousClass001.A0s();
    public boolean A1M;
    public boolean A1N = true;
    public boolean A1O;
    public boolean A1P = false;
    public boolean A1Q;
    public final C56602sG A1R = AnonymousClass681.A00(this, 42);
    public final C85014Ep A1S = new AnonymousClass5b0(this, 2);
    public final AnonymousClass4FW A1T = new C86164Jb(this, 10);
    public final C1226065a A1U = new C124176Bg(this, 0);
    public final C84334By A1V = new C116745qn(this);
    public final Runnable A1W = new C71293bs(this, 37);
    public final List A1X = AnonymousClass001.A0s();
    public final List A1Y = AnonymousClass001.A0s();
    public final List A1Z = AnonymousClass001.A0s();
    public final List A1a = AnonymousClass001.A0s();
    public final Set A1b = AnonymousClass002.A0K();

    public void A1L() {
        C18290x4.A1L(this.A18);
        C620233e r5 = this.A0g;
        C104745Se r10 = this.A1D;
        AnonymousClass1R1 r7 = this.A0l;
        WfalManager wfalManager = this.A0J;
        C55152pt r3 = this.A0e;
        C113995mK r9 = this.A13;
        C994155q r1 = new C994155q(wfalManager, r3, this.A0f, r5, this.A0j, r7, this, r9, r10, this.A1F, this.A1H);
        this.A18 = r1;
        C18270x1.A0w(r1, this.A1B);
    }

    public final void A1U(List list, boolean z) {
        AnonymousClass4BK r3;
        C102975Kz r0;
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null) {
            this.A1M = z;
            C105105Tp r02 = this.A0z;
            if (z) {
                r3 = r02.A03;
            } else {
                r3 = r02.A04;
            }
            if (!r02.A03(A0Q2, this, r3, "status_fragment", list) && !this.A0z.A01.A0E() && (r0 = this.A13.A00) != null) {
                r0.A01 = 4;
            }
        }
    }

    public C110065fd BD8(int i, int i2, boolean z) {
        View findViewById = A0R().findViewById(R.id.pager_holder);
        ArrayList A0s2 = AnonymousClass001.A0s();
        C86654Ky.A0t(A0R(), A0s2, R.id.fab);
        C86654Ky.A0t(A0R(), A0s2, R.id.fab_second);
        C110065fd r2 = new C110065fd(this, C88694ab.A00(findViewById, i, i2), this.A0U, A0s2, z);
        this.A0m = r2;
        r2.A05(new C71293bs(this, 34));
        return this.A0m;
    }

    public void BcY(C105765Wh r9) {
        this.A18 = null;
        this.A10 = r9;
        C113995mK r0 = this.A13;
        Map map = r9.A04;
        Map map2 = r0.A0G;
        map2.clear();
        map2.putAll(map);
        if (r9.A01.size() == 0) {
            this.A1N = true;
        }
        C87184Oi.A00(this);
        Iterator it = this.A10.A02.iterator();
        long j = 0;
        int i = 0;
        while (it.hasNext()) {
            C623534r A192 = C86664Kz.A19(it);
            i++;
            if (A192.A04() > j) {
                j = A192.A04();
            }
        }
        C003203q A0Q2 = A0Q();
        if (A0Q2 instanceof AnonymousClass673) {
            ((AnonymousClass673) A0Q2).Bs0(j, i);
        }
        C113995mK r2 = this.A13;
        C102975Kz r1 = r2.A00;
        if (r1 != null && !r1.A04 && r1.A08) {
            r2.A0B(r9.A05, this.A10.A02.size());
        }
        A1M();
        A1Q();
        this.A0o.A00();
        C18290x4.A1L(this.A17);
        AnonymousClass54U r12 = new AnonymousClass54U(this.A0e, this);
        this.A17 = r12;
        C18270x1.A0w(r12, this.A1B);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C115155oD r1 = this.A12;
        r1.A01.A07("StatusesFragment_onCreateView");
        r1.A02.A0A.markerPoint(453128091, 1, "CREATE_VIEW_START");
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        ObservableListView observableListView = (ObservableListView) C06560Yg.A02(inflate, 16908298);
        C115155oD r12 = this.A12;
        C162457s7.A0J(observableListView, 0);
        observableListView.A0B.A02(r12);
        observableListView.A0A.A02(r12);
        AnonymousClass5YU.A00(inflate, this);
        C115155oD r13 = this.A12;
        r13.A01.A06("StatusesFragment_onCreateView");
        r13.A02.A0A.markerPoint(453128091, 1, "CREATE_VIEW_END");
        return inflate;
    }

    public void A0a() {
        Log.i("statusesFragment/onDestroy");
        super.A0a();
        this.A16.A02();
        C103825Oo r2 = this.A0x;
        if (!r2.A06.A00()) {
            r2.A07.get();
            C1226265c r1 = r2.A01;
            if (r1 != null) {
                r2.A03.A01.A07(r1);
            }
        }
        AnonymousClass5YA r3 = (AnonymousClass5YA) this.A1G.get();
        C105125Tr r22 = (C105125Tr) r3.A08.get();
        r22.A00 = null;
        r22.A03 = false;
        r22.A07.A07(r22.A05);
        ((C102875Kp) r3.A09.get()).A01 = null;
        this.A0P.A00();
        this.A0N.A07(this.A1R);
        this.A0d.A07(this.A1T);
        this.A0p.A07(this.A1U);
        this.A1C.A07(this.A1V);
        this.A0E.A0R(this.A1W);
        this.A1E.get();
        C18290x4.A1L(this.A18);
        C18290x4.A1L(this.A17);
        List list = this.A1a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0X.A00.revokeUriPermission(C86664Kz.A0c(it), 1);
        }
        list.clear();
    }

    public void A0e() {
        Log.i("statusesFragment/onPause");
        this.A0z.A05.A0A(this);
        C110065fd r0 = this.A0m;
        if (r0 != null) {
            r0.A00();
        }
        super.A0e();
    }

    public void A0f() {
        this.A12.A01.A07("StatusesFragment_onResume");
        Log.i("statusesFragment/onResume");
        super.A0f();
        AnonymousClass6C6.A01(this, this.A0z.A05, 347);
        this.A0R.A01(this);
        this.A12.A01.A06("StatusesFragment_onResume");
    }

    public void A0g() {
        Log.i("statusesFragment/onStart");
        super.A0g();
        if (this.A0A.A02) {
            A1N();
        }
        if (C56952sp.A0J(this.A0s.A02, 6215)) {
            this.A0t.A00(C56972sr.A05(this.A0F));
        }
        this.A0n.A00(this);
        ((C105125Tr) ((AnonymousClass5YA) this.A1G.get()).A08.get()).A01();
        A1Q();
    }

    public void A0h() {
        Log.i("statusesFragment/onStop");
        super.A0h();
        this.A0n.A01(this);
    }

    public void A0k(int i, int i2, Intent intent) {
        C102975Kz r0;
        if (i != 33) {
            if (i == 35) {
                if (this.A1M) {
                    C103825Oo r2 = this.A0x;
                    r2.A03.A00();
                    C104715Sb r1 = r2.A02;
                    r1.A00 = true;
                    r1.A01 = false;
                    r2.A00();
                }
                this.A13.A05();
                if (this.A1M) {
                    this.A0z.A00(intent);
                }
            } else if (i != 151) {
            } else {
                if (i2 == -1) {
                    A1U(C18300x5.A0v(this.A0x.A03.A03), this.A1M);
                } else if (i2 == 0 && (r0 = this.A13.A00) != null) {
                    r0.A01 = 4;
                }
            }
        } else if (i2 == -1) {
            A1O();
        }
    }

    public void A0o(Bundle bundle) {
        boolean z;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        this.A12.A02.A0A.markerPoint(453128091, 1, "CREATE_ACTIVITY_START");
        this.A0X = true;
        A13(true);
        A1H();
        ListView listView = this.A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new AnonymousClass68J(this.A0W, this, 1));
        listView.setOnItemLongClickListener(new AnonymousClass69P(this, 2));
        if (!AnonymousClass0x2.A0F(this.A0Z).getBoolean("show_statuses_education", true) || this.A0F.A0Y()) {
            A1S(listView);
        } else {
            C56082rO r9 = this.A0g.A04;
            AnonymousClass08M A012 = AnonymousClass08M.A01();
            synchronized (r9.A04) {
                Map map = r9.A05;
                if (map.containsKey("status_distribution")) {
                    str = C18310x6.A0o("status_distribution", map);
                    z = true;
                } else {
                    z = false;
                    str = null;
                }
            }
            if (z) {
                A012.A0G(str);
            } else {
                r9.A03.BkM(new C117715sN(A012, r9));
            }
            C100385As.A01(A0V(), C05110Rz.A00(new C110395gA(), A012), listView, this, 28);
        }
        C86604Kt.A1F(A0J(), R.id.init_statuses_progress, 0);
        C87184Oi r0 = new C87184Oi(this);
        this.A0q = r0;
        A1I(r0);
        this.A0N.A06(this.A1R);
        this.A0d.A06(this.A1T);
        this.A0p.A06(this.A1U);
        this.A1C.A06(this.A1V);
        C105125Tr r1 = (C105125Tr) ((AnonymousClass5YA) this.A1G.get()).A08.get();
        if (r1.A01 == null) {
            r1.A01 = new AnonymousClass5S1(false, false);
        }
        if (r1.A02 == null) {
            r1.A02 = new AnonymousClass5S1(false, false);
        }
        A1L();
        AnonymousClass8JP r2 = this.A12.A02.A0A;
        r2.markerPoint(453128091, 1, "CREATE_ACTIVITY_END");
        r2.markerEnd(453128091, 1, 2);
    }

    public void A0p(Bundle bundle) {
        Log.i("statusesFragment/onCreate");
        this.A12.A00();
        this.A0P = this.A0Q.A06(A1D(), "status-fragment");
        this.A16.A01();
        super.A0p(bundle);
        C69263Wi r5 = this.A0E;
        AnonymousClass4FS r8 = this.A1B;
        this.A0o = new StatusExpirationLifecycleOwner(this, r5, this.A0e, this.A0g, r8);
        ArrayList A0s2 = AnonymousClass001.A0s();
        C86654Ky.A0t(A0R(), A0s2, R.id.fab);
        C86654Ky.A0t(A0R(), A0s2, R.id.fab_second);
        boolean z = true;
        View view = (View) A0s2.get(1);
        if (view != null && (view instanceof ImageView) && this.A0h.A0Y(C58422vE.A01, 1874)) {
            this.A0r = new C105795Wl((ImageView) view, this.A0E, this.A0V, this.A0Z, this.A1B);
        }
        this.A1Q = true;
        if (bundle == null || !bundle.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false)) {
            z = false;
        }
        C103825Oo A002 = this.A0C.A00(AnonymousClass58A.STATUS_FRAGMENT, z);
        this.A0x = A002;
        if (!A002.A06.A00()) {
            A002.A07.get();
            C1226265c r1 = A002.A01;
            if (r1 != null) {
                A002.A03.A01.A06(r1);
            }
        }
        if (bundle != null) {
            this.A1M = bundle.getBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", false);
        }
        if (this.A1D.A00()) {
            ((C102875Kp) ((AnonymousClass5YA) this.A1G.get()).A09.get()).A01 = new AnonymousClass5AR(this, 0);
        } else {
            this.A1E.get();
        }
    }

    public void A0q(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A1M);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A0x.A02.A01);
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        if (!this.A0F.A0Y()) {
            AnonymousClass5B7.A01(menu.add(2, R.id.menuitem_status_privacy, 0, R.string.f11nameremoved), this, R.drawable.privacy_checkup_lock_person);
        }
    }

    public final String A1K() {
        C105765Wh r0 = this.A10;
        if (r0 == null || r0.A05.isEmpty()) {
            return null;
        }
        return C107575bX.A09(",", (String[]) this.A10.A05.keySet().toArray(new String[0]));
    }

    public final void A1M() {
        int i;
        int i2;
        View view = this.A0B;
        if (view != null) {
            if (this.A10.A00()) {
                if (this.A18 != null) {
                    C86604Kt.A1F(view, R.id.init_statuses_progress, 0);
                    C86604Kt.A1F(view, R.id.search_no_matches, 8);
                } else if (this.A0M.A0k()) {
                    C86604Kt.A1F(view, R.id.init_statuses_progress, 8);
                    C86604Kt.A1F(view, R.id.search_no_matches, 8);
                    C86604Kt.A1F(view, R.id.welcome_statuses_message, 0);
                    C86604Kt.A1F(view, R.id.statuses_empty_no_contacts, 8);
                    C86604Kt.A1F(view, R.id.contacts_empty_permission_denied, 8);
                    TextView A092 = AnonymousClass002.A09(view, R.id.welcome_statuses_message);
                    Context context = A092.getContext();
                    C87044Mw.A05(C107335b8.A07(context, C18310x6.A0G(context, R.drawable.ic_new_status_tip), R.color.f5nameremoved), A092, C08310eF.A09(this).getString(R.string.f11nameremoved));
                    return;
                } else {
                    if (this.A0L.A00()) {
                        ViewGroup A0I2 = C86644Kx.A0I(view, R.id.statuses_empty_no_contacts);
                        if (A0I2.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A1D());
                            A0I2.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new C634139d(this, 45));
                        }
                        A0I2.setVisibility(0);
                        i2 = R.id.contacts_empty_permission_denied;
                    } else {
                        ViewGroup A0J2 = C86644Kx.A0J(view, R.id.contacts_empty_permission_denied);
                        if (A0J2.getChildCount() == 0) {
                            C86634Kw.A0K(this).inflate(R.layout.f8nameremoved, A0J2, true);
                            C989753y.A00(A0J2.findViewById(R.id.button_open_permission_settings), this, 2);
                        }
                        A0J2.setVisibility(0);
                        i2 = R.id.statuses_empty_no_contacts;
                    }
                    C86604Kt.A1F(view, i2, 8);
                    C86604Kt.A1F(view, R.id.init_statuses_progress, 8);
                    C86604Kt.A1F(view, R.id.search_no_matches, 8);
                    i = R.id.welcome_statuses_message;
                    C86604Kt.A1F(view, i, 8);
                }
            } else if (!TextUtils.isEmpty(this.A1I)) {
                C86604Kt.A1F(view, R.id.init_statuses_progress, 8);
                C86604Kt.A1F(view, R.id.search_no_matches, 0);
                AnonymousClass002.A09(view, R.id.search_no_matches).setText(AnonymousClass0x7.A0n(this, this.A1I, new Object[1], 0, R.string.f11nameremoved));
            } else {
                return;
            }
            C86604Kt.A1F(view, R.id.welcome_statuses_message, 8);
            C86604Kt.A1F(view, R.id.statuses_empty_no_contacts, 8);
            i = R.id.contacts_empty_permission_denied;
            C86604Kt.A1F(view, i, 8);
        }
    }

    public final void A1N() {
        if (this.A1P) {
            this.A13.A09(Boolean.TRUE);
            if (this.A18 == null) {
                this.A13.A0B(this.A10.A05, this.A10.A02.size());
                this.A13.A06(new C95124sf(), this.A10, false, false);
            }
        }
    }

    public final void A1O() {
        if (!this.A0F.A0Y() || (C18280x3.A1W(this.A0S.A01(), "post_status_in_companion") && this.A0h.A0X(4905))) {
            this.A13.A03();
            AnonymousClass1VX r2 = this.A0h;
            Intent A0L2 = RequestPermissionActivity.A0L(A1D(), this.A0Y, r2, 33);
            if (A0L2 == null) {
                AnonymousClass5O5 r3 = this.A0K;
                C003203q A0O2 = C86654Ky.A0O(this);
                if (r3.A00(A0O2, (AnonymousClass4FU) A0O2, this.A1S, 33)) {
                    if (this.A03 != null) {
                        this.A0Z.A0z();
                        this.A03.setVisibility(8);
                    }
                    A0m(C627736r.A0u(A1D(), C135166kE.A00.getRawString(), 4));
                    return;
                }
                return;
            }
            startActivityForResult(A0L2, 33);
            return;
        }
        C57052sz.A01(new StatusCompanionModeUnavailableDialogFragment(), this);
    }

    public final void A1P() {
        if (!this.A0F.A0Y() || (C18280x3.A1W(this.A0S.A01(), "post_status_in_companion") && this.A0h.A0X(4905))) {
            this.A13.A04();
            A0m(C627736r.A0q(A0G(), C18290x4.A0c()));
            return;
        }
        C57052sz.A01(new StatusCompanionModeUnavailableDialogFragment(), this);
    }

    public final void A1Q() {
        Long l;
        C69263Wi r0 = this.A0E;
        Runnable runnable = this.A1W;
        r0.A0R(runnable);
        if (!this.A10.A00() && A0Q() != null) {
            C105765Wh r3 = this.A10;
            Iterator it = r3.A02.iterator();
            Long l2 = null;
            if (it.hasNext()) {
                l2 = C86624Kv.A0Z(it);
                while (it.hasNext()) {
                    Long A0Z2 = C86624Kv.A0Z(it);
                    if (l2.compareTo(A0Z2) < 0) {
                        l2 = A0Z2;
                    }
                }
            }
            long j = 0;
            if (l2 != null) {
                long longValue = l2.longValue();
                if (longValue < 0) {
                    longValue = 0;
                }
                j = longValue;
            }
            Iterator it2 = r3.A03.iterator();
            if (it2.hasNext()) {
                Long A0Z3 = C86624Kv.A0Z(it2);
                while (it2.hasNext()) {
                    Long A0Z4 = C86624Kv.A0Z(it2);
                    if (A0Z3.compareTo(A0Z4) < 0) {
                        A0Z3 = A0Z4;
                    }
                }
                if (A0Z3 != null) {
                    long longValue2 = A0Z3.longValue();
                    if (longValue2 < j) {
                        longValue2 = j;
                    }
                    j = longValue2;
                }
            }
            Iterator it3 = r3.A01.iterator();
            if (it3.hasNext()) {
                Long A0Z5 = C86624Kv.A0Z(it3);
                loop2:
                while (true) {
                    l = A0Z5;
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop2;
                        }
                        A0Z5 = C86624Kv.A0Z(it3);
                        if (l.compareTo(A0Z5) < 0) {
                        }
                    }
                }
                if (l != null) {
                    long longValue3 = l.longValue();
                    if (longValue3 < j) {
                        longValue3 = j;
                    }
                    j = longValue3;
                }
            }
            C623534r r02 = r3.A00;
            if (r02 != null) {
                long A052 = r02.A05();
                if (A052 < j) {
                    A052 = j;
                }
                j = A052;
            }
            this.A0E.A0T(runnable, C107175ap.A01(j));
        }
    }

    public final void A1S(ListView listView) {
        if (this.A02 == null) {
            this.A02 = new Space(A1D());
            boolean A0Y2 = this.A0h.A0Y(C58422vE.A01, 3289);
            Resources A092 = C08310eF.A09(this);
            int i = R.dimen.f6nameremoved;
            if (A0Y2) {
                i = R.dimen.f6nameremoved;
            }
            this.A02.setLayoutParams(new AbsListView.LayoutParams(-1, A092.getDimensionPixelSize(i)));
        }
        listView.removeHeaderView(this.A02);
        listView.addHeaderView(this.A02);
    }

    public /* synthetic */ boolean Awt() {
        return false;
    }

    public void AxH(AnonymousClass5U2 r2) {
        this.A1I = r2.A01;
        C87184Oi.A00(this);
    }

    public /* synthetic */ boolean B3Y() {
        return false;
    }

    public AnonymousClass0GC B6S() {
        return this.A0L.A02;
    }

    public String B8C() {
        return "status_fragment";
    }

    public String B9K() {
        return null;
    }

    public int BDV() {
        return 300;
    }

    public String BDl() {
        return null;
    }

    public void BR7(DialogFragment dialogFragment, boolean z) {
    }

    public /* synthetic */ void BTn() {
    }

    public /* synthetic */ boolean BTo() {
        return false;
    }

    public void BnI(boolean z) {
        this.A1O = z;
        C87184Oi.A00(this);
    }

    public void BnJ(boolean z) {
        this.A1P = z;
        if (z) {
            AnonymousClass33p r1 = this.A0Z;
            C18270x1.A0i(C18270x1.A03(r1), "status_tab_last_opened_time", this.A0W.A0H());
            this.A19.A02((C95814uZ) null, 17);
            A1N();
            if (this.A0h.A0X(249)) {
                this.A1B.BkM(new C71293bs(this, 36));
            }
            C105795Wl r0 = this.A0r;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C103825Oo r3 = this.A0x;
        C104715Sb r2 = r3.A02;
        if (r2.A01) {
            r3.A03.A00();
            C102975Kz r02 = r3.A05.A00;
            if (r02 != null) {
                r02.A00 = 1;
            }
            r2.A00 = false;
            r2.A01 = false;
            r3.A00();
        }
        this.A13.A05();
        if (this.A1Q) {
            this.A1N = true;
            C87184Oi.A00(this);
        }
        this.A1B.BkM(new C71293bs(this, 35));
        if (this.A1D.A00()) {
            C105125Tr r22 = (C105125Tr) ((AnonymousClass5YA) this.A1G.get()).A08.get();
            r22.A08.A04("EXIT_STATUS_VIEW");
            r22.A09.A04("EXIT_STATUS_VIEW");
            r22.A06.A01();
            return;
        }
        this.A1E.get();
    }

    public boolean BqR() {
        return true;
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }

    public void A0w(Bundle bundle, View view) {
        A1H();
        C105045Tj r1 = this.A0R;
        A1H();
        r1.A00(this.A04, this);
        AnonymousClass5YU.A01(view, this, C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved));
    }

    public void A15(boolean z) {
        super.A15(z);
        if (this.A04 >= 7 && z) {
            this.A0R.A01(this);
        }
    }

    public boolean A1B(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_status) {
            A1O();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A0m(C627736r.A07(A1D()));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_text_status) {
            A1P();
            return true;
        } else if (!this.A06.A07()) {
            return false;
        } else {
            menuItem.getItemId();
            this.A08.A04();
            throw AnonymousClass001.A0g("getMenuItemBusinessToolsId");
        }
    }

    public final void A1R(Animator.AnimatorListener animatorListener, boolean z) {
        View view;
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i = 0; i < this.A0q.getCount(); i++) {
            if (this.A0q.getItemViewType(i) == 0) {
                C115805pG r4 = (C115805pG) ((C1226165b) this.A0q.A03.A1K.get(i));
                AnonymousClass1R1 r2 = this.A0l;
                UserJid userJid = r4.A01.A0A;
                if (r2.A0j(userJid) && !AnonymousClass000.A1Y(userJid, AnonymousClass1fY.A00) && (view = r4.A00) != null) {
                    if (z) {
                        view.measure(0, 0);
                    }
                    int measuredHeight = view.getMeasuredHeight();
                    int[] A1Z2 = C86664Kz.A1Z();
                    if (z) {
                        A1Z2[0] = 0;
                        A1Z2[1] = measuredHeight;
                    } else {
                        A1Z2[0] = measuredHeight;
                        A1Z2[1] = 0;
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1Z2);
                    ofInt.addListener(new AnonymousClass67F(view, measuredHeight, 2));
                    ofInt.addUpdateListener(new C107765br(view, z));
                    A0s2.add(ofInt);
                }
            }
        }
        AnimatorSet A0O2 = C86664Kz.A0O();
        this.A00 = A0O2;
        C86614Ku.A0y(A0O2);
        this.A00.setDuration(250);
        this.A00.addListener(animatorListener);
        this.A00.playTogether(A0s2);
        this.A00.start();
    }

    public final void A1T(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A15.A00(this.A0e.A00(C86664Kz.A19(it).A0A));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator it3 = this.A0e.A01(C86664Kz.A19(it2).A0A).iterator();
            while (it3.hasNext()) {
                this.A15.A00(C18300x5.A0T(it3));
            }
        }
    }

    public /* synthetic */ void Awb(AnonymousClass8s5 r1) {
        r1.BMG();
    }

    public String B9I() {
        return C08310eF.A09(this).getString(R.string.f11nameremoved);
    }

    public Drawable B9J() {
        Context A0G2 = A0G();
        boolean z = C1001059l.A04;
        int i = R.drawable.ic_camera;
        if (z) {
            i = R.drawable.ic_camera_filled_wds;
        }
        return C107335b8.A04(A0G2, i, R.color.f5nameremoved);
    }

    public String BCY() {
        return C08310eF.A09(this).getString(R.string.f11nameremoved);
    }

    public Drawable BCZ() {
        Context A0G2 = A0G();
        boolean z = C1001059l.A04;
        int i = R.drawable.ic_text_status_compose;
        if (z) {
            i = R.drawable.ic_text_status_compose_filled_wds;
        }
        return C107335b8.A04(A0G2, i, AnonymousClass5Yj.A02(A1D(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public void BVy() {
        A1O();
    }

    public void Bb1() {
        A1P();
    }
}
