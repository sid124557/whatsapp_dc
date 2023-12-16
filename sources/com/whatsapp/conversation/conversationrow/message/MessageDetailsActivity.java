package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0x9;
import X.AnonymousClass1fS;
import X.AnonymousClass2R8;
import X.AnonymousClass2z0;
import X.AnonymousClass36M;
import X.AnonymousClass4FW;
import X.AnonymousClass4L0;
import X.AnonymousClass4Li;
import X.AnonymousClass4OX;
import X.AnonymousClass4SG;
import X.AnonymousClass5RW;
import X.AnonymousClass5TZ;
import X.AnonymousClass5Ul;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass677;
import X.AnonymousClass681;
import X.AnonymousClass687;
import X.AnonymousClass68W;
import X.AnonymousClass6BG;
import X.C103175Lv;
import X.C104545Rj;
import X.C105165Tv;
import X.C105365Uq;
import X.C106405Yw;
import X.C107175ap;
import X.C107395bF;
import X.C107565bW;
import X.C107695bk;
import X.C108845de;
import X.C110195fq;
import X.C113895mA;
import X.C114015mM;
import X.C116985rC;
import X.C117085rM;
import X.C117615sD;
import X.C117805sW;
import X.C1233167y;
import X.C124166Bf;
import X.C135166kE;
import X.C18260x0;
import X.C25661as;
import X.C28011fL;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C29431io;
import X.C30551md;
import X.C30721mu;
import X.C47122ck;
import X.C54012o2;
import X.C54232oO;
import X.C54292oU;
import X.C55702qm;
import X.C55832qz;
import X.C56602sG;
import X.C56722sS;
import X.C60722z3;
import X.C621033m;
import X.C623834u;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C627636p;
import X.C64333Db;
import X.C64773Ex;
import X.C66543Lv;
import X.C835648x;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C87144Oe;
import X.C88734ai;
import X.C88744aj;
import X.C88834as;
import X.C89644eZ;
import X.C93154nz;
import X.C93314oJ;
import X.C93554ol;
import X.C93564om;
import X.C95814uZ;
import X.C95894up;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessageDetailsActivity extends C89644eZ implements C835648x {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public C116985rC A03;
    public C116985rC A04;
    public C116985rC A05;
    public C116985rC A06;
    public C103175Lv A07;
    public AnonymousClass5Ul A08;
    public AnonymousClass64J A09;
    public C621033m A0A;
    public C29301ib A0B;
    public C64773Ex A0C;
    public C29421in A0D;
    public AnonymousClass5ZU A0E;
    public C105365Uq A0F;
    public C114015mM A0G;
    public C93314oJ A0H;
    public C105165Tv A0I;
    public C113895mA A0J;
    public C54292oU A0K;
    public C66543Lv A0L;
    public C29431io A0M;
    public C54012o2 A0N;
    public AnonymousClass2R8 A0O;
    public C29241iV A0P;
    public C624134x A0Q;
    public C623834u A0R;
    public AnonymousClass5TZ A0S;
    public C55832qz A0T;
    public AnonymousClass5RW A0U;
    public boolean A0V;
    public final C54232oO A0W;
    public final C56602sG A0X;
    public final AnonymousClass4FW A0Y;
    public final C55702qm A0Z;
    public final Runnable A0a;
    public final ArrayList A0b;

    public void onActivityResult(int i, int i2, Intent intent) {
        C108845de r5;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C116985rC r1 = this.A03;
                if (r1.A07()) {
                    r1.A04();
                    throw AnonymousClass001.A0g("handleAdvertiseForwardClick");
                }
                return;
            }
            List A0r = C86604Kt.A0r(intent);
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            String stringExtra = intent.getStringExtra("appended_message");
            if (AnonymousClass000.A1W(C627336j.A03(A0r))) {
                C626936e.A06(intent);
                r5 = this.A0S.A00(intent.getExtras());
            } else {
                r5 = null;
            }
            this.A0A.A09(this.A08, r5, stringExtra, Collections.singletonList(this.A0Q), A0r, booleanExtra);
            if (A0r.size() != 1 || (A0r.get(0) instanceof C135166kE)) {
                Bqv(A0r);
                return;
            }
            this.A00.A0B(this, C86604Kt.A08(this, this.A0C, C86664Kz.A1B(), A0r));
        }
    }

    public void A5r() {
        if (!this.A0V) {
            this.A0V = true;
            C88834as A2X = AnonymousClass4SG.A2X(this);
            C64333Db r2 = A2X.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r3, this, AnonymousClass4SG.A2t(r2, r3, this));
            this.A0K = C64333Db.A2q(r2);
            this.A08 = C86644Kx.A0L(r2);
            this.A0A = C64333Db.A08(r2);
            this.A0G = C64333Db.A29(r2);
            this.A0C = C64333Db.A26(r2);
            this.A0N = (C54012o2) r2.ATM.get();
            this.A0E = C64333Db.A28(r2);
            this.A0D = C86614Ku.A0S(r2);
            this.A0L = C86614Ku.A0Z(r2);
            this.A0T = C64333Db.A8F(r2);
            this.A0M = C64333Db.A3K(r2);
            this.A0R = (C623834u) r3.AC9.get();
            C88744aj r1 = C88744aj.A00;
            this.A05 = r1;
            this.A0B = C86624Kv.A0N(r2);
            this.A0O = (AnonymousClass2R8) r2.AWC.get();
            this.A04 = C88734ai.A00(r2.A3B);
            this.A0S = C107695bk.A5D(r3);
            this.A0P = C86624Kv.A0T(r2);
            this.A0J = C86604Kt.A0U(r2);
            this.A06 = r1;
            this.A07 = (C103175Lv) A2X.A0j.get();
            this.A0U = (AnonymousClass5RW) r3.A47.get();
            this.A03 = r1;
            this.A09 = C86614Ku.A0N(r2);
        }
    }

    public final CharSequence A74(long j) {
        return C107565bW.A00(this.A06, this.A00, j);
    }

    public final void A75() {
        C30551md r1;
        UserJid A0o;
        C60722z3 r13;
        ArrayList arrayList = this.A0b;
        arrayList.clear();
        this.A00 = Long.MAX_VALUE;
        ConcurrentHashMap concurrentHashMap = this.A0N.A00(this.A0Q).A00;
        if (concurrentHashMap.size() == 0) {
            C624134x r12 = this.A0Q;
            C95814uZ r4 = r12.A1J.A00;
            if (r4 instanceof UserJid) {
                if (!C627636p.A0T(this.A01, r12)) {
                    r13 = new C60722z3(0, 0, 0);
                } else {
                    C624134x r14 = this.A0Q;
                    boolean z = r14 instanceof C30721mu;
                    long j = r14.A0K;
                    if (z) {
                        r13 = new C60722z3(j, 0, j);
                    } else {
                        r13 = new C60722z3(j, j, 0);
                    }
                }
                concurrentHashMap.put(r4, r13);
            }
        }
        C624134x r42 = this.A0Q;
        if (1 == r42.A0j() && (r1 = r42.A1S) != null) {
            if (r1.A1J.A02) {
                A0o = AnonymousClass4SG.A2m(this);
            } else {
                A0o = r1.A0o();
            }
            arrayList.add(new C93554ol(A0o, this.A0Q.A1S.A02));
        }
        Iterator A0u = AnonymousClass001.A0u(concurrentHashMap);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            C60722z3 r10 = (C60722z3) A0w.getValue();
            arrayList.add(new C104545Rj(r10, (UserJid) A0w.getKey()));
            long A012 = r10.A01(5);
            long A013 = r10.A01(13);
            long A014 = r10.A01(8);
            if (A012 != 0) {
                this.A00 = Math.min(this.A00, A012);
                i2++;
            }
            if (A013 != 0) {
                this.A00 = Math.min(this.A00, A013);
                i3++;
            }
            if (A014 != 0) {
                this.A00 = Math.min(this.A00, A014);
                i++;
            }
        }
        C95814uZ r15 = this.A0Q.A1J.A00;
        if (C627336j.A0K(r15) || (r15 instanceof AnonymousClass1fS) || A76()) {
            C624134x r16 = this.A0Q;
            if (i < r16.A0B && C627636p.A0X(r16)) {
                arrayList.add(new C93564om(this.A0Q.A0B - i, 8));
            }
            int i4 = this.A0Q.A0B;
            if (i3 < i4) {
                arrayList.add(new C93564om(i4 - i3, 13));
            }
            if (i2 < i4) {
                arrayList.add(new C93564om(i4 - i2, 5));
            }
        }
        Collections.sort(arrayList, new C117805sW(this));
        BaseAdapter baseAdapter = this.A01;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
        ListView listView = this.A02;
        Runnable runnable = this.A0a;
        listView.removeCallbacks(runnable);
        long j2 = this.A00;
        if (j2 != Long.MAX_VALUE) {
            this.A02.postDelayed(runnable, C107175ap.A01(j2));
        }
    }

    public final boolean A76() {
        C116985rC r1 = this.A04;
        if (!r1.A07() || !((C56722sS) r1.A04()).A04(this.A0Q)) {
            return false;
        }
        return true;
    }

    public C105365Uq getContactPhotosLoader() {
        return this.A0I.A01(this);
    }

    public void onCreate(Bundle bundle) {
        BaseAdapter r1;
        String str;
        A5j(9);
        requestWindowFeature(9);
        super.onCreate(bundle);
        A61("on_create");
        this.A0I = this.A07.A00(getSupportFragmentManager(), C95894up.A00(this.A04));
        A61("get_message_key_from_intent");
        AnonymousClass2z0 A022 = C107395bF.A02(getIntent());
        if (A022 != null) {
            this.A0Q = this.A0T.A05(A022);
        }
        A60("get_message_key_from_intent");
        setTitle(R.string.f11nameremoved);
        getSupportActionBar().A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(C86634Kw.A03(this));
        supportActionBar.A0D(colorDrawable);
        supportActionBar.A0P(false);
        Intent intent = getIntent();
        if (intent == null) {
            str = "intent_is_null";
        } else {
            this.A0F = this.A0G.A06(this, "message-details-activity");
            if (this.A0Q == null) {
                A61("get_message_creating_message_key");
                this.A0Q = this.A0T.A05(new AnonymousClass2z0(C106405Yw.A01(intent, "key_remote_jid"), intent.getStringExtra("key_id"), true));
                A60("get_message_creating_message_key");
            }
            C624134x r3 = this.A0Q;
            if (r3 == null) {
                str = "message_is_null";
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0o(C624134x.A08(r3, "MessageDetailsActivity/key: ", A0o), A0o);
                this.A02 = (ListView) findViewById(16908298);
                A61("refresh_receipts");
                A75();
                A60("refresh_receipts");
                C93314oJ A032 = this.A0I.A03(this, (AnonymousClass677) null, this.A0Q);
                this.A0H = A032;
                A032.setOnLongClickListener((View.OnLongClickListener) null);
                C93314oJ r32 = this.A0H;
                r32.A2I = new C117615sD((Object) this, 6);
                r32.A2J = new C117615sD((Object) this, 7);
                ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
                ViewGroup A0J2 = C86644Kx.A0J(viewGroup, R.id.conversation_row_center);
                A0J2.addView(this.A0H, -1, -2);
                Point A072 = AnonymousClass4L0.A07();
                C86604Kt.A0x(this, A072);
                AnonymousClass001.A19(A0J2, -2, 0, C86664Kz.A05(A072.x));
                int i = A072.y / 2;
                boolean z = false;
                if (A0J2.getMeasuredHeight() > i) {
                    z = true;
                    AnonymousClass6BG.A00(this.A02.getViewTreeObserver(), this, 17);
                }
                this.A02.addHeaderView(viewGroup, (Object) null, false);
                ImageView imageView = new ImageView(this);
                imageView.setImageResource(R.drawable.edge_bottom);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A02.addHeaderView(imageView, (Object) null, false);
                View view = new View(this);
                view.setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.f6nameremoved)));
                this.A02.addFooterView(view, (Object) null, false);
                C95814uZ r4 = this.A0Q.A1J.A00;
                if (C627336j.A0K(r4) || (r4 instanceof AnonymousClass1fS) || A76()) {
                    r1 = new C87144Oe(this);
                } else {
                    r1 = new AnonymousClass4OX(this);
                }
                this.A01 = r1;
                this.A02.setAdapter(r1);
                Drawable A042 = this.A0R.A04(this.A0R.A08(this, r4));
                if (A042 != null) {
                    viewGroup.setBackground(new AnonymousClass4Li(A042, viewGroup, this));
                } else {
                    AnonymousClass5Yj.A0A(this, viewGroup, R.attr.f3nameremoved, R.color.f5nameremoved);
                }
                this.A02.setOnScrollListener(new C110195fq(colorDrawable, A0J2, this, i, z));
                this.A0J.A06();
                this.A0D.A06(this.A0X);
                this.A0M.A06(this.A0Y);
                this.A0B.A06(this.A0W);
                this.A0P.A06(this.A0Z);
                AnonymousClass0x9.A0H(this).A01(MessageDetailsViewModel.class);
                A60("on_create");
                return;
            }
        }
        BKj(str);
        A60("on_create");
        BKe(3);
        finish();
    }

    public MessageDetailsActivity(int i) {
        this.A0V = false;
        AnonymousClass68W.A00(this, 44);
    }

    public C47122ck A5u() {
        C47122ck A5u = super.A5u();
        A5u.A05 = true;
        A5u.A00 = 8;
        A5u.A01 = null;
        A5u.A06 = true;
        return A5u;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00();
        C105165Tv r1 = this.A0I;
        C105365Uq r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
        }
        r1.A0J.A03();
        r1.A0N.A08();
        this.A0J.A06();
        this.A0D.A07(this.A0X);
        this.A0M.A07(this.A0Y);
        this.A0B.A07(this.A0W);
        this.A0P.A07(this.A0Z);
        this.A02.removeCallbacks(this.A0a);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A0U.A01();
        if (this.A0J.A0B()) {
            this.A0J.A03();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0J.A0B()) {
            this.A0J.A05();
        }
        C93314oJ r2 = this.A0H;
        if (r2 instanceof C93154nz) {
            r2.A0X.A0S(C117085rM.A00(r2, 38));
        }
    }

    public void onStart() {
        super.onStart();
        C25661as r6 = this.A00.A01.A01;
        C624134x r1 = this.A0Q;
        C95814uZ r0 = r1.A1J.A00;
        int i = r1.A0B;
        if (r6 != null && (r0 instanceof C28011fL) && i > 0) {
            long j = (long) i;
            if (j <= 32) {
                j = 32;
            }
            r6.A07 = Long.valueOf(j);
            r6.A03 = Integer.valueOf(AnonymousClass36M.A00(i));
        }
        BZs();
    }

    public int A5t() {
        return 154478781;
    }

    public MessageDetailsActivity() {
        this(0);
        this.A0b = AnonymousClass001.A0s();
        this.A0Y = new C124166Bf(this, 7);
        this.A0X = AnonymousClass681.A00(this, 20);
        this.A0W = new C1233167y(this, 8);
        this.A0Z = new AnonymousClass687(this, 9);
        this.A0a = new C117615sD((Object) this, 5);
    }
}
