package com.whatsapp.acceptinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1VX;
import X.AnonymousClass28Z;
import X.AnonymousClass318;
import X.AnonymousClass31C;
import X.AnonymousClass34R;
import X.AnonymousClass3DZ;
import X.AnonymousClass3P4;
import X.AnonymousClass4FI;
import X.AnonymousClass4FV;
import X.AnonymousClass4HY;
import X.AnonymousClass4IC;
import X.AnonymousClass4JQ;
import X.AnonymousClass5RG;
import X.AnonymousClass5ZU;
import X.C005205m;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C18260x0;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C27991fJ;
import X.C28891hw;
import X.C33631tR;
import X.C42892Px;
import X.C53602nM;
import X.C55682qk;
import X.C56072rN;
import X.C56612sH;
import X.C56892sj;
import X.C56942so;
import X.C56982ss;
import X.C59862xc;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C68193Sf;
import X.C89644eZ;
import X.C989453v;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.concurrent.atomic.AtomicReference;

public class AcceptInviteLinkActivity extends C89644eZ {
    public int A00;
    public C56942so A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C105365Uq A04;
    public C114015mM A05;
    public C53602nM A06;
    public C620733j A07;
    public C56982ss A08;
    public C28891hw A09;
    public C56892sj A0A;
    public C42892Px A0B;
    public AnonymousClass318 A0C;
    public C59862xc A0D;
    public AnonymousClass4FV A0E;
    public C66493Lq A0F;
    public C66503Lr A0G;
    public AnonymousClass5RG A0H;
    public AnonymousClass31C A0I;
    public C56072rN A0J;
    public Runnable A0K;
    public boolean A0L;
    public final AnonymousClass4FI A0M;
    public final AtomicReference A0N;

    public void A5r() {
        if (!this.A0L) {
            this.A0L = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r2 = A002.A00;
            AnonymousClass1Ha.A23(A002, r2, r2, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A08 = C64333Db.A39(A002);
            this.A0E = C64333Db.A4H(A002);
            this.A05 = C64333Db.A29(A002);
            this.A0I = C64333Db.A5u(A002);
            this.A02 = C64333Db.A26(A002);
            this.A03 = C64333Db.A28(A002);
            this.A07 = C64333Db.A2t(A002);
            this.A0J = C64333Db.A8w(A002);
            this.A0F = C64333Db.A5A(A002);
            this.A0G = (C66503Lr) A002.AGs.get();
            this.A0C = (AnonymousClass318) A002.AZQ.get();
            this.A0D = (C59862xc) A002.APF.get();
            this.A0B = (C42892Px) A002.AXK.get();
            this.A01 = C64333Db.A1k(A002);
            this.A06 = C18280x3.A0L(r2);
            this.A09 = C64333Db.A3C(A002);
            this.A0A = C64333Db.A3G(A002);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        View findViewById = findViewById(R.id.invite_container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4JQ(findViewById, findViewById(R.id.background), this, 0));
        this.A04 = this.A05.A06(this, "accept-invite-link-activity");
        C18280x3.A0p(findViewById(R.id.filler), this, 25);
        this.A00 = getIntent().getIntExtra("display_type", 0);
        TextView A012 = C005205m.A01(this, R.id.progress_text);
        int i = this.A00;
        if (i == 0) {
            A012.setText(R.string.f11nameremoved);
            String stringExtra = getIntent().getStringExtra("code");
            if (TextUtils.isEmpty(stringExtra)) {
                this.A05.A0H(R.string.f11nameremoved, 1);
                finish();
            } else {
                C18260x0.A0s("acceptlink/processcode/", stringExtra, AnonymousClass001.A0o());
                AnonymousClass0x7.A1B(new C33631tR(this, this.A06, this.A0F, this.A0G, this.A0I, stringExtra), this.A04);
            }
        } else if (i == 1) {
            A012.setText(R.string.f11nameremoved);
            String stringExtra2 = getIntent().getStringExtra("subgroup_jid");
            String stringExtra3 = getIntent().getStringExtra("parent_group_jid");
            AnonymousClass34R r1 = C27991fJ.A01;
            C27991fJ A072 = r1.A07(stringExtra2);
            C27991fJ A073 = r1.A07(stringExtra3);
            if (A072 == null || A073 == null) {
                C55682qk r5 = this.A03;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("subgroup jid is null = ");
                boolean z = true;
                A0o.append(AnonymousClass000.A1X(A072));
                A0o.append("parent group jid is null = ");
                if (A073 != null) {
                    z = false;
                }
                r5.A0A("parent-group-error", false, C18300x5.A0m(A0o, z));
            } else {
                this.A0N.set(A072);
                C55682qk r3 = this.A03;
                AnonymousClass31C r9 = this.A0I;
                C56942so r12 = this.A01;
                AnonymousClass3P4 r2 = new AnonymousClass3P4(this, A073);
                String A032 = r9.A03();
                r9.A0D(new C68193Sf(r3, r2), AnonymousClass28Z.A00(A072, r12.A00(A073), A073, A032), A032, 298, 32000);
            }
        }
        C56612sH r13 = this.A06;
        AnonymousClass1VX r32 = this.A0D;
        C56982ss r15 = this.A08;
        C64773Ex r10 = this.A02;
        AnonymousClass5ZU r11 = this.A03;
        C620733j r14 = this.A07;
        C56072rN r22 = this.A0J;
        AnonymousClass5RG r7 = new AnonymousClass5RG(this, (ViewGroup) findViewById(R.id.invite_root), r10, r11, this.A04, r13, r14, r15, r32, r22);
        this.A0H = r7;
        r7.A00 = true;
        this.A09.A06(this.A0M);
        AnonymousClass1Ha.A1t(this);
    }

    public AcceptInviteLinkActivity(int i) {
        this.A0L = false;
        AnonymousClass4HY.A00(this, 5);
    }

    public final void A74() {
        C18280x3.A0p(findViewById(R.id.invite_ignore), this, 24);
        AnonymousClass1Ha.A20(this, R.id.progress);
        findViewById(R.id.group_info).setVisibility(0);
    }

    public final void A75(int i) {
        findViewById(R.id.progress).setVisibility(4);
        C18280x3.A0r(this, R.id.group_info, 4);
        findViewById(R.id.error).setVisibility(0);
        C18280x3.A0r(this, R.id.learn_more, 4);
        C18310x6.A0L(this, R.id.error_text).setText(i);
        findViewById(R.id.ok).setOnClickListener(new C989453v(this, 5));
    }

    public void onDestroy() {
        super.onDestroy();
        this.A09.A07(this.A0M);
        Runnable runnable = this.A0K;
        if (runnable != null) {
            this.A05.A0R(runnable);
        }
        this.A04.A00();
    }

    public AcceptInviteLinkActivity() {
        this(0);
        this.A0N = new AtomicReference((Object) null);
        this.A0M = new AnonymousClass4IC(this, 0);
    }
}
