package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass11H;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass2FJ;
import X.AnonymousClass31C;
import X.AnonymousClass3ZH;
import X.AnonymousClass4HY;
import X.AnonymousClass5UX;
import X.AnonymousClass5Yj;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.C005205m;
import X.C106715a2;
import X.C107295b4;
import X.C107695bk;
import X.C114015mM;
import X.C18280x3;
import X.C18290x4;
import X.C27991fJ;
import X.C29441ip;
import X.C39542Cj;
import X.C53602nM;
import X.C54182oJ;
import X.C56072rN;
import X.C56892sj;
import X.C56942so;
import X.C56952sp;
import X.C56982ss;
import X.C58422vE;
import X.C59032wE;
import X.C59862xc;
import X.C620533h;
import X.C64333Db;
import X.C64653Ej;
import X.C64773Ex;
import X.C71313bu;
import X.C71643cR;
import X.C87784Wc;
import X.C88834as;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class ManageGroupsInCommunityActivity extends C89644eZ {
    public int A00;
    public long A01;
    public Spinner A02;
    public AnonymousClass0R8 A03;
    public RecyclerView A04;
    public C59032wE A05;
    public C39542Cj A06;
    public AnonymousClass64J A07;
    public C56942so A08;
    public C64653Ej A09;
    public C87784Wc A0A;
    public AnonymousClass11H A0B;
    public AnonymousClass5UX A0C;
    public C64773Ex A0D;
    public AnonymousClass5ZU A0E;
    public C114015mM A0F;
    public C53602nM A0G;
    public C56982ss A0H;
    public C56892sj A0I;
    public C620533h A0J;
    public C59862xc A0K;
    public C27991fJ A0L;
    public AnonymousClass31C A0M;
    public C54182oJ A0N;
    public C56072rN A0O;
    public C106715a2 A0P;
    public boolean A0Q;
    public boolean A0R;
    public final AnonymousClass2FJ A0S;

    public void A5r() {
        if (!this.A0Q) {
            this.A0Q = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r2 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r3 = r2.A00;
            AnonymousClass1Ha.A23(r2, r3, r3, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A0P = C18280x3.A0Q(r3);
            this.A0H = C64333Db.A39(r2);
            this.A0F = C64333Db.A29(r2);
            this.A0M = C64333Db.A5u(r2);
            this.A0C = (AnonymousClass5UX) r2.A6K.get();
            this.A0D = C64333Db.A26(r2);
            this.A0E = C64333Db.A28(r2);
            this.A0O = C64333Db.A8w(r2);
            this.A0N = r2.ArS();
            this.A0K = (C59862xc) r2.APF.get();
            this.A08 = C64333Db.A1k(r2);
            this.A0G = C18280x3.A0L(r3);
            this.A0I = C64333Db.A3G(r2);
            this.A0J = (C620533h) r2.APC.get();
            this.A06 = (C39542Cj) A0I2.A3V.get();
            this.A09 = (C64653Ej) r2.A5c.get();
            this.A07 = (AnonymousClass64J) r2.AEN.get();
            this.A05 = (C59032wE) A0I2.A0c.get();
        }
    }

    public final void A74() {
        C106715a2 r4;
        int i;
        String string;
        String str;
        int A002;
        int i2;
        AnonymousClass1VX r1 = this.A0D;
        C58422vE r3 = C58422vE.A02;
        if (r1.A0Y(r3, 3829)) {
            WaTextView waTextView = (WaTextView) C005205m.A00(this, R.id.members_can_add_subgroup_disclaimer_text);
            boolean z = this.A0R;
            Context context = waTextView.getContext();
            if (z) {
                boolean A0Y = this.A0D.A0Y(r3, 5077);
                r4 = this.A0P;
                boolean z2 = ((AnonymousClass3ZH) this.A0B.A0F.A07()).A0d;
                if (A0Y) {
                    int i3 = R.string.f11nameremoved;
                    if (z2) {
                        i3 = R.string.f11nameremoved;
                    }
                    string = getString(i3);
                    str = "community_settings_link";
                    A002 = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
                    i2 = 14;
                } else {
                    int i4 = R.string.f11nameremoved;
                    if (z2) {
                        i4 = R.string.f11nameremoved;
                    }
                    string = getString(i4);
                    str = "community_settings_link";
                    A002 = AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved);
                    i2 = 15;
                }
            } else {
                boolean z3 = ((AnonymousClass3ZH) this.A0B.A0F.A07()).A0d;
                r4 = this.A0P;
                if (z3) {
                    i = R.string.f11nameremoved;
                } else {
                    i = R.string.f11nameremoved;
                }
                string = getString(i);
                str = "learn-more";
                A002 = C18290x4.A00(this);
                i2 = 13;
            }
            waTextView.setText(r4.A06(context, C71313bu.A00(this, i2), string, str, A002));
            C107295b4.A07(waTextView, this.A08, this.A0D);
            waTextView.setVisibility(0);
        }
    }

    public final boolean A75() {
        if (AnonymousClass001.A0K(this.A0B.A0x.A07()) < this.A08.A0F.A0O(C58422vE.A02, 1238) + 1) {
            return false;
        }
        String format = this.A00.A0M().format(C56952sp.A06(this.A08.A0F, 1238));
        Toast.makeText(this, this.A00.A0J(format, new Object[]{format}, R.plurals.f9nameremoved), 0).show();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            if (intent != null && intent.getExtras() != null) {
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                boolean z = intent.getExtras().getBoolean("is_suggest_mode", false);
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    if (!this.A07.A0F()) {
                        this.A05.A0E(C29441ip.A00(getApplicationContext()));
                        return;
                    }
                    this.A01 = SystemClock.uptimeMillis();
                    int i3 = R.string.f11nameremoved;
                    if (z) {
                        i3 = R.string.f11nameremoved;
                    }
                    BpA(i3, R.string.f11nameremoved);
                    AnonymousClass11H r2 = this.A0B;
                    r2.A12.execute(new C71643cR(r2, this.A0L, stringArrayList, 8, z));
                    return;
                }
            } else {
                return;
            }
        } else if (i2 != -10) {
            return;
        }
        this.A05.A0E(R.string.f11nameremoved);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0103, code lost:
        if (r9.A0R == false) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r9 = r24
            r0 = r25
            super.onCreate(r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "parent_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1fJ r1 = X.AnonymousClass34R.A04(r0)
            X.C626936e.A06(r1)
            r9.A0L = r1
            X.2sj r0 = r9.A0I
            boolean r0 = r0.A0D(r1)
            r9.A0R = r0
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r1 = "group_create_entry_point"
            r0 = 3
            int r0 = r2.getIntExtra(r1, r0)
            r9.A00 = r0
            r0 = 2131624080(0x7f0e0090, float:1.887533E38)
            r9.setContentView((int) r0)
            r0 = 2131428854(0x7f0b05f6, float:1.8479364E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r2 = 8
            r0.setVisibility(r2)
            r0 = 2131434334(0x7f0b1b5e, float:1.849048E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r9.setSupportActionBar(r0)
            X.0R8 r0 = r9.getSupportActionBar()
            X.C626936e.A06(r0)
            r9.A03 = r0
            r1 = 1
            r0.A0Q(r1)
            X.0R8 r0 = r9.A03
            r0.A0N(r1)
            X.0R8 r3 = r9.A03
            boolean r1 = r9.A0R
            r0 = 2131886350(0x7f12010e, float:1.9407276E38)
            if (r1 == 0) goto L_0x006c
            r0 = 2131890581(0x7f121195, float:1.9415858E38)
        L_0x006c:
            r3.A0B(r0)
            r0 = 2131427565(0x7f0b00ed, float:1.847675E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 38
            X.C18320x8.A13(r1, r9, r0)
            r0 = 2131427564(0x7f0b00ec, float:1.8476748E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 39
            X.C18320x8.A13(r1, r9, r0)
            X.5mM r1 = r9.A0F
            java.lang.String r0 = "add-groups-to-community"
            X.5Uq r16 = r1.A06(r9, r0)
            X.2Cj r4 = r9.A06
            X.1fJ r1 = r9.A0L
            r7 = 1
            r3 = 0
            X.5Xc r0 = new X.5Xc
            r19 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r17 = r0
            r18 = r7
            r20 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.11H r0 = X.AnonymousClass11H.A00(r9, r4, r0, r1)
            r9.A0B = r0
            r0 = 2131427609(0x7f0b0119, float:1.847684E38)
            android.view.View r8 = X.C005205m.A00(r9, r0)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r9.A04 = r8
            int r6 = r8.getPaddingLeft()
            androidx.recyclerview.widget.RecyclerView r0 = r9.A04
            int r5 = r0.getPaddingTop()
            androidx.recyclerview.widget.RecyclerView r0 = r9.A04
            int r4 = r0.getPaddingRight()
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131168280(0x7f070c18, float:1.7950857E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.setPadding(r6, r5, r4, r0)
            r0 = 2131427566(0x7f0b00ee, float:1.8476752E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r9.A02 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r9.A04
            X.C18320x8.A19(r0, r7)
            X.1VX r5 = r9.A0D
            X.2sr r10 = r9.A01
            X.2ss r4 = r9.A0H
            X.5UX r13 = r9.A0C
            X.3Ex r14 = r9.A0D
            X.5ZU r15 = r9.A0E
            X.2sj r1 = r9.A0I
            X.64J r11 = r9.A07
            X.2rN r0 = r9.A0O
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0105
            boolean r0 = r9.A0R
            r20 = 1
            if (r0 != 0) goto L_0x0107
        L_0x0105:
            r20 = 0
        L_0x0107:
            X.2FJ r12 = r9.A0S
            X.4Wc r8 = new X.4Wc
            r18 = r1
            r19 = r5
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.A0A = r8
            androidx.recyclerview.widget.RecyclerView r0 = r9.A04
            r0.setAdapter(r8)
            r9.A74()
            android.widget.Spinner r0 = r9.A02
            r0.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r9.A04
            r0.setVisibility(r2)
            X.11H r0 = r9.A0B
            X.107 r1 = r0.A0y
            r0 = 36
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.11H r0 = r9.A0B
            X.107 r1 = r0.A0x
            r0 = 37
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.11H r0 = r9.A0B
            X.08M r1 = r0.A0G
            r0 = 38
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.11H r0 = r9.A0B
            X.08M r1 = r0.A0F
            r0 = 39
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.11H r0 = r9.A0B
            X.08M r1 = r0.A0H
            r0 = 40
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            X.11H r0 = r9.A0B
            X.08M r1 = r0.A0I
            r0 = 35
            X.AnonymousClass1Ha.A21(r9, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.ManageGroupsInCommunityActivity.onCreate(android.os.Bundle):void");
    }

    public ManageGroupsInCommunityActivity(int i) {
        this.A0Q = false;
        AnonymousClass4HY.A00(this, 37);
    }

    public ManageGroupsInCommunityActivity() {
        this(0);
        this.A0S = new AnonymousClass2FJ(this);
    }
}
