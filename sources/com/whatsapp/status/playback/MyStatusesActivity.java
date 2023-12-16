package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass0GC;
import X.AnonymousClass0R2;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass223;
import X.AnonymousClass2X0;
import X.AnonymousClass2z0;
import X.AnonymousClass30E;
import X.AnonymousClass314;
import X.AnonymousClass35X;
import X.AnonymousClass4FS;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass4OU;
import X.AnonymousClass4SG;
import X.AnonymousClass54S;
import X.AnonymousClass58A;
import X.AnonymousClass58B;
import X.AnonymousClass5Gn;
import X.AnonymousClass5M7;
import X.AnonymousClass5ME;
import X.AnonymousClass5PU;
import X.AnonymousClass5RO;
import X.AnonymousClass5Ul;
import X.AnonymousClass5V0;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YA;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZM;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass5b0;
import X.AnonymousClass685;
import X.AnonymousClass68J;
import X.AnonymousClass68W;
import X.AnonymousClass69P;
import X.AnonymousClass6AV;
import X.AnonymousClass6C6;
import X.C05430Th;
import X.C08310eF;
import X.C101155Dr;
import X.C102335Il;
import X.C102975Kz;
import X.C103345Mn;
import X.C103825Oo;
import X.C104745Se;
import X.C105105Tp;
import X.C105795Wl;
import X.C106625Zs;
import X.C106685Zz;
import X.C106715a2;
import X.C106955aR;
import X.C107175ap;
import X.C107395bF;
import X.C107405bG;
import X.C107695bk;
import X.C108845de;
import X.C110065fd;
import X.C113995mK;
import X.C115865pM;
import X.C116815qu;
import X.C116985rC;
import X.C117645sG;
import X.C1227865s;
import X.C1228966g;
import X.C1235268t;
import X.C1235568w;
import X.C124166Bf;
import X.C135166kE;
import X.C162457s7;
import X.C16910uE;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C19340zH;
import X.C29161iN;
import X.C29431io;
import X.C33141sV;
import X.C380625j;
import X.C387128v;
import X.C45662aN;
import X.C48102eL;
import X.C54012o2;
import X.C55152pt;
import X.C55832qz;
import X.C56512s6;
import X.C58152un;
import X.C58422vE;
import X.C60152y5;
import X.C620233e;
import X.C620733j;
import X.C621033m;
import X.C621433s;
import X.C624134x;
import X.C626936e;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C69263Wi;
import X.C69273Wj;
import X.C71293bs;
import X.C72343dZ;
import X.C73783g4;
import X.C85014Ep;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C87044Mw;
import X.C88694ab;
import X.C88744aj;
import X.C88834as;
import X.C89164br;
import X.C93674oz;
import X.C93784pI;
import X.C989753y;
import X.C990154c;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MyStatusesActivity extends C89164br implements C1228966g {
    public C16910uE A00;
    public AnonymousClass0R2 A01;
    public C05430Th A02;
    public C116985rC A03;
    public C116985rC A04;
    public C116985rC A05;
    public C101155Dr A06;
    public AnonymousClass5ME A07;
    public AnonymousClass5Ul A08;
    public C621033m A09;
    public WfalManager A0A;
    public C64773Ex A0B;
    public AnonymousClass5ZU A0C;
    public C56512s6 A0D;
    public C380625j A0E;
    public AnonymousClass5ZR A0F;
    public C620733j A0G;
    public C29431io A0H;
    public C54012o2 A0I;
    public C55152pt A0J;
    public C620233e A0K;
    public AnonymousClass4FV A0L;
    public C48102eL A0M;
    public C106685Zz A0N;
    public C60152y5 A0O;
    public C624134x A0P;
    public C110065fd A0Q;
    public AnonymousClass5PU A0R;
    public StatusExpirationLifecycleOwner A0S;
    public C102335Il A0T;
    public C103825Oo A0U;
    public C105105Tp A0V;
    public AnonymousClass2X0 A0W;
    public C113995mK A0X;
    public AnonymousClass54S A0Y;
    public AnonymousClass4OU A0Z;
    public C93784pI A0a;
    public C69273Wj A0b;
    public C55832qz A0c;
    public C106715a2 A0d;
    public C33141sV A0e;
    public C45662aN A0f;
    public AnonymousClass30E A0g;
    public AnonymousClass5YA A0h;
    public C29161iN A0i;
    public C104745Se A0j;
    public C183538qC A0k;
    public C183538qC A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final Handler A0p;
    public final View.OnClickListener A0q;
    public final View.OnClickListener A0r;
    public final C85014Ep A0s;
    public final AnonymousClass4FW A0t;
    public final AnonymousClass5Gn A0u;
    public final C1227865s A0v;
    public final Runnable A0w;
    public final Runnable A0x;
    public final HashMap A0y;
    public final HashMap A0z;
    public final List A10;
    public final Map A11;
    public final Set A12;

    public C110065fd BD8(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0x2 = C86614Ku.A0x(this);
        C110065fd r2 = new C110065fd(this, C88694ab.A00(view, i, i2), this.A08, A0x2, z);
        this.A0Q = r2;
        r2.A05(new C71293bs((Object) this, 48));
        return this.A0Q;
    }

    public static /* synthetic */ void A0C(C624134x r4, MyStatusesActivity myStatusesActivity, boolean z) {
        HashMap hashMap = myStatusesActivity.A0z;
        AnonymousClass2z0 r2 = r4.A1J;
        AnonymousClass5ZM r1 = (AnonymousClass5ZM) hashMap.remove(r2);
        if (r1 != null) {
            if (z) {
                r1.A0D(true);
            } else {
                return;
            }
        }
        C990154c r12 = new C990154c(r4, myStatusesActivity);
        hashMap.put(r2, r12);
        C18270x1.A0w(r12, myStatusesActivity.A04);
    }

    public void A5r() {
        if (!this.A0n) {
            this.A0n = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r3 = A2X.A4Z;
            AnonymousClass4SG.A3W(r3, this);
            C107695bk r1 = r3.A00;
            AnonymousClass4SG.A3Q(r3, r1, this, AnonymousClass4SG.A2t(r3, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A08 = C86644Kx.A0L(r3);
            C88744aj r4 = C88744aj.A00;
            this.A05 = r4;
            this.A0N = C86634Kw.A0m(r3);
            this.A0L = C64333Db.A4H(r3);
            this.A0E = (C380625j) r3.ASN.get();
            this.A0K = C86634Kw.A0h(r3);
            this.A09 = C64333Db.A08(r3);
            this.A0j = C86634Kw.A0s(r3);
            this.A0B = C64333Db.A26(r3);
            this.A0I = (C54012o2) r3.ATM.get();
            this.A0C = C64333Db.A28(r3);
            this.A0G = C64333Db.A2t(r3);
            this.A04 = r4;
            this.A0c = C64333Db.A8F(r3);
            this.A0H = C64333Db.A3K(r3);
            this.A0g = (AnonymousClass30E) r1.A35.get();
            this.A0D = C86664Kz.A18(r3);
            this.A0e = C86654Ky.A0e(r3);
            this.A0A = C86654Ky.A0U(r3);
            this.A0J = (C55152pt) r3.AWi.get();
            this.A0R = (AnonymousClass5PU) r3.Aal.get();
            this.A0F = C64333Db.A2r(r3);
            this.A0V = (C105105Tp) r3.AWp.get();
            this.A0X = C86634Kw.A0q(r3);
            this.A0h = (AnonymousClass5YA) r1.ACM.get();
            this.A0i = (C29161iN) r3.Abk.get();
            this.A0W = r3.Aqw();
            this.A0O = C64333Db.A74(r3);
            this.A03 = r4;
            this.A0M = (C48102eL) r3.A18.get();
            this.A0k = C72343dZ.A00(r3.A7Q);
            this.A0l = C72343dZ.A00(r3.Ac2);
            this.A0a = A2X.ADA();
            this.A07 = (AnonymousClass5ME) r1.A4b.get();
            this.A0T = r1.APZ();
            this.A0f = r1.AQ9();
            this.A06 = (C101155Dr) A2X.A1s.get();
            this.A0d = C18280x3.A0Q(r1);
        }
    }

    public boolean A64() {
        return true;
    }

    public final void A75() {
        if (this.A0W.A00()) {
            this.A0X.A03();
        }
        Intent A0L2 = RequestPermissionActivity.A0L(this, this.A0F, this.A0D, 33);
        if (A0L2 != null) {
            startActivityForResult(A0L2, 33);
        } else if (!this.A0D.A08(this.A0s)) {
        } else {
            if (this.A07.A02() < C86624Kv.A05(this.A0D, 3659)) {
                AnonymousClass35X.A05(this, this, this.A0L, 5);
            } else {
                startActivity(C627736r.A0u(this, C135166kE.A00.getRawString(), 4));
            }
        }
    }

    public final void A76() {
        long j;
        C69263Wi r0 = this.A05;
        Runnable runnable = this.A0x;
        r0.A0R(runnable);
        if (!this.A0Z.isEmpty()) {
            AnonymousClass4OU r1 = this.A0Z;
            if (r1.A00.isEmpty()) {
                j = 0;
            } else {
                j = ((C624134x) C18290x4.A0k(r1.A00)).A0K;
            }
            this.A05.A0T(runnable, C107175ap.A01(j));
        }
    }

    public void A77(View view, C624134x r7) {
        int A052;
        Map map = this.A11;
        AnonymousClass2z0 r4 = r7.A1J;
        if (map.containsKey(r4)) {
            map.remove(r4);
            A052 = 0;
        } else {
            map.put(r4, r7);
            A052 = AnonymousClass5Yj.A05(view);
        }
        view.setBackgroundResource(A052);
        boolean isEmpty = map.isEmpty();
        AnonymousClass0R2 r3 = this.A01;
        if (!isEmpty) {
            if (r3 == null) {
                r3 = Bpz(this.A00);
                this.A01 = r3;
            }
            r3.A0B(this.A0G.A0M().format((long) map.size()));
            this.A01.A06();
        } else if (r3 != null) {
            r3.A05();
        }
        this.A12.add(r4);
        C86644Kx.A0s(this.A0p, this.A0w);
        this.A0Z.notifyDataSetChanged();
    }

    public void A78(AnonymousClass58B r10, Integer num, Integer num2, List list) {
        int i;
        AnonymousClass223 r2;
        AnonymousClass30E r0;
        boolean A032;
        int i2;
        C102975Kz r02;
        this.A0m = AnonymousClass000.A1Y(r10, AnonymousClass58B.FACEBOOK_SHARE);
        int ordinal = r10.ordinal();
        List list2 = list;
        if (ordinal != 0) {
            if (ordinal != 1) {
                C105105Tp r3 = this.A0V;
                A032 = r3.A03(this, (C08310eF) null, r3.A04, "my_status_activity", list2);
                this.A0k.get();
            } else if (this.A0A.A02()) {
                r0 = this.A0g;
                i = num2.intValue();
                r2 = AnonymousClass223.INSTAGRAM;
                r0.A03(this, r2, "my_status_activity", list, i);
                return;
            } else {
                return;
            }
        } else if (this.A0A.A02()) {
            this.A11.clear();
            r0 = this.A0g;
            i = num2.intValue();
            r2 = AnonymousClass223.FACEBOOK;
            r0.A03(this, r2, "my_status_activity", list, i);
            return;
        } else if (this.A0j.A00()) {
            if (list.size() > 30) {
                i2 = 27;
            } else {
                C103345Mn r32 = this.A0h.A06;
                ArrayList A0c2 = C73783g4.A0c(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C624134x.A0Z(A0c2, it);
                }
                if (!r32.A00(A0c2)) {
                    i2 = 26;
                } else {
                    this.A11.clear();
                    AnonymousClass5YA r03 = this.A0h;
                    C116815qu r5 = new C116815qu(this, r03, num, "my_status_activity");
                    ((C106955aR) r03.A07.get()).A00(this, r5, num, "my_status_activity", list2);
                    return;
                }
            }
            C621433s.A01(this, i2);
            return;
        } else {
            C105105Tp r33 = this.A0V;
            A032 = r33.A03(this, (C08310eF) null, r33.A03, "my_status_activity", list2);
        }
        if (!A032 && !this.A0V.A01.A0E() && (r02 = this.A0X.A00) != null) {
            r02.A01 = 4;
        }
    }

    public AnonymousClass0GC B6S() {
        return this.A06.A02;
    }

    public String B8C() {
        return "my_status_activity";
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void onCreate(Bundle bundle) {
        Log.i("myStatusesActivity/onCreate");
        AnonymousClass4SG.A37(this);
        super.onCreate(bundle);
        AnonymousClass1VX r3 = this.A0D;
        C58422vE r1 = C58422vE.A01;
        this.A0o = r3.A0Y(r1, 1875);
        setTitle(R.string.f11nameremoved);
        A6N();
        boolean A2I = AnonymousClass1Hf.A2I(this);
        setContentView((int) R.layout.f8nameremoved);
        findViewById(R.id.root_view).setSystemUiVisibility(1280);
        this.A01.setFitsSystemWindows(A2I);
        C69263Wi r8 = this.A05;
        AnonymousClass4FS r11 = this.A04;
        this.A0S = new StatusExpirationLifecycleOwner(this, r8, this.A0J, this.A0K, r11);
        this.A0U = this.A07.A00(AnonymousClass58A.MY_STATUS_FRAGMENT, false);
        AnonymousClass5Y0 r14 = this.A0C;
        C64773Ex r82 = this.A0B;
        AnonymousClass5ZU r9 = this.A0C;
        C620733j r13 = this.A0G;
        C101155Dr r5 = this.A06;
        this.A00 = new AnonymousClass685(this, r82, r9, new AnonymousClass5RO(), new C93674oz((AnonymousClass5M7) r5.A00.A01.A0T.get(), this, r5.A00.A01.ADA()), this.A0a, r13, r14, this, 5);
        this.A0b = new C69273Wj(this);
        this.A0Z = new AnonymousClass4OU(this);
        ListView listView = getListView();
        listView.setFastScrollEnabled(false);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, listView, false);
        listView.addFooterView(inflate, (Object) null, false);
        addEndToEndEncryptionDialogInFooter(inflate);
        listView.setAdapter(this.A0Z);
        listView.setOnItemClickListener(new AnonymousClass68J(this.A06, this, 2));
        listView.setOnItemLongClickListener(new AnonymousClass69P(this, 3));
        C87044Mw.A05(AnonymousClass0RP.A00(this, R.drawable.ic_new_status_tip), C18310x6.A0L(this, 16908292), getString(R.string.f11nameremoved));
        View findViewById = findViewById(R.id.fab);
        ImageView A0M2 = C86654Ky.A0M(this, R.id.fab_second);
        if (AnonymousClass4SG.A45(this)) {
            C86624Kv.A12(findViewById, A0M2);
        } else {
            C989753y.A00(findViewById, this, 9);
            C989753y.A00(A0M2, this, 10);
            if (this.A0D.A0Y(r1, 1874)) {
                new C105795Wl(A0M2, this.A05, this.A0E, this.A09, this.A04).A00();
            }
        }
        C86654Ky.A0s(this, R.id.progress, 0);
        C18290x4.A1L(this.A0Y);
        AnonymousClass54S r12 = new AnonymousClass54S(this);
        this.A0Y = r12;
        AnonymousClass0x7.A1B(r12, this.A04);
        this.A0H.A06(this.A0t);
        this.A0i.A06(this.A0v);
        this.A0R.A00(this);
        this.A0k.get();
        if (this.A0W.A00() && bundle != null) {
            this.A0X.A09(Boolean.TRUE);
        }
        AnonymousClass4SG.A3d(this);
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass043 create;
        if (i != 13) {
            if (i == 26) {
                if (this.A0j.A00()) {
                    C19340zH A002 = AnonymousClass5V0.A00(this);
                    A002.A0R(true);
                    A002.A0A(R.string.f11nameremoved);
                    C1235268t.A02(A002, this, 138, R.string.f11nameremoved);
                    A002.A0D(new C1235568w(this, 14));
                    create = A002.create();
                }
                this.A0k.get();
                C626936e.A0D(false, "MyStatusActivity/invalid dialog invoke");
                return null;
            } else if (i == 27) {
                if (this.A0j.A00()) {
                    AnonymousClass5YA r1 = this.A0h;
                    C19340zH A003 = AnonymousClass5V0.A00(this);
                    A003.A0R(true);
                    C620733j r4 = r1.A02;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1Q(objArr, 0, 30);
                    A003.A0Q(r4.A0L(objArr, R.plurals.f9nameremoved, 30));
                    C1235268t.A02(A003, this, 139, R.string.f11nameremoved);
                    A003.A0D(new C1235568w(this, 15));
                    create = A003.create();
                }
                this.A0k.get();
                C626936e.A0D(false, "MyStatusActivity/invalid dialog invoke");
                return null;
            }
            C162457s7.A0D(create);
            return create;
        }
        Map map = this.A11;
        if (map.isEmpty()) {
            Log.e("mediagallery/dialog/delete no messages");
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mediagallery/dialog/delete/");
            C18260x0.A1G(A0o2, map.size());
            HashSet A15 = AnonymousClass0x9.A15(map.values());
            this.A0k.get();
            return C387128v.A00(this, this.A05, this.A09, this.A0C, new C115865pM(this, A15), A15);
        }
        return super.onCreateDialog(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0D.A0X(6685)) {
            getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        this.A0k.get();
        this.A0H.A07(this.A0t);
        this.A0i.A07(this.A0v);
        this.A0R.A01(this);
        boolean A1a = C86644Kx.A1a(this.A0Y);
        HashMap hashMap = this.A0z;
        Iterator A102 = C18290x4.A10(hashMap);
        while (A102.hasNext()) {
            ((AnonymousClass5ZM) A102.next()).A0D(A1a);
        }
        List list = this.A10;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            revokeUriPermission(C86664Kz.A0c(it), A1a ? 1 : 0);
        }
        list.clear();
        hashMap.clear();
        this.A05.A0R(this.A0x);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.A0D.A0X(6685) || menuItem.getItemId() != R.id.menu_item_status_privacy) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(C627736r.A07(this));
        return true;
    }

    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        this.A0V.A05.A0A(this);
        super.onPause();
    }

    public void onResume() {
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        AnonymousClass6C6.A01(this, this.A0V.A05, 348);
    }

    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A76();
    }

    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }

    public MyStatusesActivity(int i) {
        this.A0n = false;
        AnonymousClass68W.A00(this, 105);
    }

    public void Bdh(AnonymousClass0R2 r1) {
        super.Bdh(r1);
        C107405bG.A04(this);
    }

    public void Bdi(AnonymousClass0R2 r1) {
        super.Bdi(r1);
        AnonymousClass4SG.A34(this);
    }

    public final void addEndToEndEncryptionDialogInFooter(View view) {
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(view, R.id.e2ee_main_text);
        Object[] A0M2 = AnonymousClass002.A0M();
        A0M2[0] = "%s";
        AnonymousClass000.A1M(A0M2, 24);
        A0K2.setText(C106625Zs.A01(this, new C71293bs((Object) this, 46), getString(R.string.f11nameremoved, A0M2), "%s", AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
        AnonymousClass0x2.A12(A0K2, this.A08);
        C18270x1.A0q(A0K2, this.A0D);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass0R2 r0;
        C102975Kz r02;
        AnonymousClass58B r1;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i != 33) {
                if (i == 35) {
                    if (i2 == -1 && (r0 = this.A01) != null) {
                        r0.A05();
                    }
                    if (this.A0m) {
                        this.A0V.A00(intent);
                    }
                } else if (i != 151) {
                } else {
                    if (i2 == -1) {
                        Map map = this.A11;
                        if (!map.isEmpty()) {
                            ArrayList A0v2 = C18300x5.A0v(map);
                            map.clear();
                            if (this.A0m) {
                                r1 = AnonymousClass58B.FACEBOOK_SHARE;
                            } else {
                                r1 = AnonymousClass58B.THIRD_PARTY_SHARE;
                            }
                            A78(r1, (Integer) null, (Integer) null, A0v2);
                        }
                    } else if (i2 == 0 && (r02 = this.A0X.A00) != null) {
                        r02.A01 = 4;
                    }
                }
            } else if (i2 == -1) {
                A75();
            }
        } else if (i2 == -1 && intent != null) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Map map2 = this.A11;
            if (!map2.isEmpty()) {
                A0s2.addAll(map2.values());
            } else {
                C624134x r03 = this.A0P;
                if (r03 != null) {
                    A0s2.add(r03);
                }
            }
            if (!A0s2.isEmpty()) {
                List A0r2 = C86604Kt.A0r(intent);
                boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                this.A09.A09(this.A08, (C108845de) null, intent.getStringExtra("appended_message"), AnonymousClass314.A00(A0s2), A0r2, booleanExtra);
                if (A0r2.size() != 1 || (A0r2.get(0) instanceof C135166kE)) {
                    Bqv(A0r2);
                } else {
                    this.A00.A0B(this, C86604Kt.A08(this, this.A0B, C86664Kz.A1B(), A0r2));
                }
            } else {
                Log.w("mystatuses/forward/failed");
                this.A05.A0H(R.string.f11nameremoved, 0);
            }
            AnonymousClass0R2 r04 = this.A01;
            if (r04 != null) {
                r04.A05();
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<AnonymousClass2z0> A042 = C107395bF.A04(bundle);
            if (A042 != null) {
                Map map = this.A11;
                map.clear();
                for (AnonymousClass2z0 r1 : A042) {
                    map.put(r1, this.A0c.A05(r1));
                }
                AnonymousClass0R2 r3 = this.A01;
                if (r3 == null) {
                    r3 = Bpz(this.A00);
                    this.A01 = r3;
                }
                r3.A0B(this.A0G.A0M().format((long) map.size()));
                this.A01.A06();
                this.A0Z.notifyDataSetChanged();
            }
            AnonymousClass2z0 A032 = C107395bF.A03(bundle, "");
            if (A032 != null) {
                this.A0P = this.A0c.A05(A032);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Map map = this.A11;
        if (!map.isEmpty()) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator A0v2 = AnonymousClass001.A0v(map);
            while (A0v2.hasNext()) {
                A0s2.add(C86614Ku.A0h(A0v2));
            }
            C107395bF.A09(bundle, A0s2);
        }
        C624134x r0 = this.A0P;
        if (r0 != null) {
            C107395bF.A07(bundle, r0.A1J);
        }
    }

    public int A5t() {
        return 78318969;
    }

    public MyStatusesActivity() {
        this(0);
        this.A11 = C18320x8.A0r();
        HashSet A0K2 = AnonymousClass002.A0K();
        this.A12 = A0K2;
        Objects.requireNonNull(A0K2);
        this.A0w = new C117645sG((Object) A0K2, 8);
        this.A0p = AnonymousClass000.A0A();
        this.A0y = AnonymousClass001.A0t();
        this.A0z = AnonymousClass001.A0t();
        this.A0u = new AnonymousClass5Gn(this);
        this.A0t = new C124166Bf(this, 22);
        this.A0v = new AnonymousClass6AV(this, 0);
        this.A0x = new C71293bs((Object) this, 47);
        this.A10 = AnonymousClass001.A0s();
        this.A0o = false;
        this.A0s = new AnonymousClass5b0(this, 4);
        this.A0r = new C989753y(this, 11);
        this.A0q = new C989753y(this, 8);
    }
}
