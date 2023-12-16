package com.whatsapp.invites;

import X.AnonymousClass0x7;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1fG;
import X.AnonymousClass2QT;
import X.AnonymousClass31C;
import X.AnonymousClass3DZ;
import X.AnonymousClass4FI;
import X.AnonymousClass4FS;
import X.AnonymousClass4HY;
import X.AnonymousClass4IC;
import X.AnonymousClass5RG;
import X.AnonymousClass5ZU;
import X.C105365Uq;
import X.C107695bk;
import X.C114015mM;
import X.C27991fJ;
import X.C28891hw;
import X.C30391mN;
import X.C54292oU;
import X.C55832qz;
import X.C56072rN;
import X.C56612sH;
import X.C56892sj;
import X.C56982ss;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C64773Ex;
import X.C66493Lq;
import X.C66503Lr;
import X.C66543Lv;
import X.C69263Wi;
import X.C83864Ac;
import X.C89644eZ;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicReference;

public class ViewGroupInviteActivity extends C89644eZ implements C83864Ac {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public C64773Ex A08;
    public AnonymousClass5ZU A09;
    public C105365Uq A0A;
    public C114015mM A0B;
    public C54292oU A0C;
    public C620733j A0D;
    public C56982ss A0E;
    public C28891hw A0F;
    public C66543Lv A0G;
    public C56892sj A0H;
    public C66493Lq A0I;
    public C66503Lr A0J;
    public AnonymousClass5RG A0K;
    public UserJid A0L;
    public AnonymousClass31C A0M;
    public AnonymousClass2QT A0N;
    public C30391mN A0O;
    public C55832qz A0P;
    public C56072rN A0Q;
    public Runnable A0R;
    public boolean A0S;
    public boolean A0T;
    public final AnonymousClass4FI A0U;
    public final AtomicReference A0V;

    public void Bad(UserJid userJid) {
        this.A07.setText(R.string.f11nameremoved);
        this.A04.setVisibility(0);
        this.A03.setVisibility(4);
        AnonymousClass4FS r1 = this.A04;
        C56612sH r4 = this.A06;
        C69263Wi r3 = this.A05;
        C66503Lr r5 = this.A0J;
        Object obj = this.A0V.get();
        C626936e.A06(obj);
        AnonymousClass0x7.A1B(new AnonymousClass1fG(r3, r4, r5, this, (C27991fJ) obj, userJid), r1);
    }

    public void A5r() {
        if (!this.A0T) {
            this.A0T = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A0C = C64333Db.A2q(A002);
            this.A0E = C64333Db.A39(A002);
            this.A0B = C64333Db.A29(A002);
            this.A0M = C64333Db.A5u(A002);
            this.A08 = C64333Db.A26(A002);
            this.A09 = C64333Db.A28(A002);
            this.A0D = C64333Db.A2t(A002);
            this.A0Q = C64333Db.A8w(A002);
            this.A0I = C64333Db.A5A(A002);
            this.A0G = C64333Db.A3D(A002);
            this.A0P = C64333Db.A8F(A002);
            this.A0J = (C66503Lr) A002.AGs.get();
            this.A0F = C64333Db.A3C(A002);
            this.A0H = C64333Db.A3G(A002);
        }
    }

    public final void A74(int i) {
        this.A06.setText(i);
        this.A04.setVisibility(4);
        this.A02.setVisibility(0);
        this.A03.setVisibility(4);
        this.A01.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0075, code lost:
        if (r1 == false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r12 = r22
            r0 = r23
            super.onCreate(r0)
            android.content.Intent r5 = r12.getIntent()
            java.lang.String r2 = "from_me"
            boolean r0 = r5.hasExtra(r2)
            r4 = 0
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = "key_remote_jid"
            boolean r0 = r5.hasExtra(r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r3 = "key_id"
            boolean r0 = r5.hasExtra(r3)
            if (r0 == 0) goto L_0x007d
            boolean r0 = r5.getBooleanExtra(r2, r4)
            r12.A0S = r0
            java.lang.String r0 = r5.getStringExtra(r1)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A08(r0)
            r12.A0L = r0
            java.lang.String r0 = "group_type"
            int r0 = r5.getIntExtra(r0, r4)
            r12.A00 = r0
            com.whatsapp.jid.UserJid r2 = r12.A0L
            if (r2 == 0) goto L_0x007d
            boolean r1 = r12.A0S
            java.lang.String r0 = r5.getStringExtra(r3)
            X.2z0 r1 = X.AnonymousClass2z0.A05(r2, r0, r1)
            X.2qz r0 = r12.A0P
            X.34x r2 = r0.A05(r1)
            boolean r0 = r2 instanceof X.C30391mN
            if (r0 == 0) goto L_0x007d
            X.1mN r2 = (X.C30391mN) r2
            r12.A0O = r2
            java.util.concurrent.atomic.AtomicReference r1 = r12.A0V
            X.1fJ r0 = r2.A02
            r1.set(r0)
            java.lang.Object r0 = r1.get()
            r2 = 1
            if (r0 != 0) goto L_0x0081
            X.3Wi r3 = r12.A05
            X.2rN r1 = r12.A0Q
            X.1mN r0 = r12.A0O
            int r0 = r0.A00
            boolean r1 = r1.A03(r0)
            r0 = 2131889295(0x7f120c8f, float:1.941325E38)
            if (r1 != 0) goto L_0x007a
        L_0x0077:
            r0 = 2131889294(0x7f120c8e, float:1.9413248E38)
        L_0x007a:
            r3.A0H(r0, r2)
        L_0x007d:
            r12.finish()
            return
        L_0x0081:
            X.1mN r1 = r12.A0O
            X.2z0 r0 = r1.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r7 = X.AnonymousClass32Y.A05(r0)
            X.1fJ r6 = r1.A02
            if (r6 == 0) goto L_0x00a3
            java.lang.String r8 = r1.A06
            if (r8 == 0) goto L_0x00a3
            if (r7 == 0) goto L_0x00a3
            long r9 = r1.A01
            X.2QT r5 = new X.2QT
            r5.<init>(r6, r7, r8, r9)
        L_0x009c:
            r12.A0N = r5
            if (r5 != 0) goto L_0x00a5
            X.3Wi r3 = r12.A05
            goto L_0x0077
        L_0x00a3:
            r5 = 0
            goto L_0x009c
        L_0x00a5:
            r0 = 2131895665(0x7f122571, float:1.942617E38)
            r12.setTitle(r0)
            r0 = 2131626260(0x7f0e0914, float:1.8879751E38)
            r12.setContentView((int) r0)
            r0 = 2131430811(0x7f0b0d9b, float:1.8483334E38)
            android.view.View r6 = r12.findViewById(r0)
            r1 = 2131427866(0x7f0b021a, float:1.847736E38)
            android.view.View r5 = r12.findViewById(r1)
            android.view.ViewTreeObserver r3 = r6.getViewTreeObserver()
            X.4JQ r1 = new X.4JQ
            r1.<init>(r6, r5, r12, r2)
            r3.addOnGlobalLayoutListener(r1)
            X.5mM r2 = r12.A0B
            java.lang.String r1 = "view-group-invite-activity"
            X.5Uq r1 = r2.A06(r12, r1)
            r12.A0A = r1
            r1 = 2131432721(0x7f0b1511, float:1.8487207E38)
            android.view.View r1 = r12.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12.A04 = r1
            r1 = 2131430465(0x7f0b0c41, float:1.8482632E38)
            android.view.View r1 = r12.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12.A03 = r1
            r1 = 2131429875(0x7f0b09f3, float:1.8481435E38)
            android.view.View r1 = r12.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12.A02 = r1
            r1 = 2131432734(0x7f0b151e, float:1.8487234E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r12, r1)
            r12.A07 = r1
            r1 = 2131429888(0x7f0b0a00, float:1.8481461E38)
            android.widget.TextView r1 = X.C18310x6.A0L(r12, r1)
            r12.A06 = r1
            r1 = 2131430480(0x7f0b0c50, float:1.8482662E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r12.A05 = r1
            r1 = 2131430481(0x7f0b0c51, float:1.8482664E38)
            android.view.View r1 = r12.findViewById(r1)
            r12.A01 = r1
            X.2sH r8 = r12.A06
            X.1VX r7 = r12.A0D
            X.2ss r6 = r12.A0E
            X.3Ex r14 = r12.A08
            X.5ZU r15 = r12.A09
            X.33j r5 = r12.A0D
            X.2rN r3 = r12.A0Q
            X.5Uq r2 = r12.A0A
            r1 = 2131430824(0x7f0b0da8, float:1.848336E38)
            android.view.View r13 = r12.findViewById(r1)
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            X.5RG r11 = new X.5RG
            r16 = r2
            r17 = r8
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A0K = r11
            r11.A00 = r4
            r1 = 2131430816(0x7f0b0da0, float:1.8483344E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 2
            X.C18290x4.A1F(r2, r12, r1)
            r1 = 2131430802(0x7f0b0d92, float:1.8483315E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r12, r1)
            r1 = 46
            X.C18310x6.A18(r3, r12, r1)
            boolean r1 = r12.A0S
            if (r1 == 0) goto L_0x01c6
            r2 = 2131893213(0x7f121bdd, float:1.9421196E38)
        L_0x0169:
            r3.setText(r2)
            r1 = 2131431928(0x7f0b11f8, float:1.84856E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 3
            X.C18290x4.A1F(r2, r12, r1)
            X.1hw r2 = r12.A0F
            X.4FI r1 = r12.A0U
            r2.A06(r1)
            r1 = 2131430124(0x7f0b0aec, float:1.848194E38)
            android.view.View r2 = r12.findViewById(r1)
            r1 = 4
            X.C18290x4.A1F(r2, r12, r1)
            X.4FS r1 = r12.A04
            X.2sH r6 = r12.A06
            X.1VX r10 = r12.A0D
            X.2sr r3 = r12.A01
            X.2oU r7 = r12.A0C
            X.2ss r8 = r12.A0E
            X.31C r13 = r12.A0M
            X.3Ex r4 = r12.A08
            X.5ZU r5 = r12.A09
            X.3Lr r11 = r12.A0J
            X.2sj r9 = r12.A0H
            X.1mN r15 = r12.A0O
            X.2QT r14 = r12.A0N
            X.C626936e.A06(r14)
            X.1tt r2 = new X.1tt
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass0x7.A1B(r2, r1)
            X.AnonymousClass1Ha.A1t(r12)
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r2, r1)
            r1 = 150(0x96, double:7.4E-322)
            r3.setDuration(r1)
            android.view.View r0 = r12.findViewById(r0)
            r0.startAnimation(r3)
            return
        L_0x01c6:
            X.2rN r2 = r12.A0Q
            X.1mN r1 = r12.A0O
            int r1 = r1.A00
            boolean r1 = r2.A03(r1)
            r2 = 2131890330(0x7f12109a, float:1.9415349E38)
            if (r1 == 0) goto L_0x0169
            r2 = 2131890334(0x7f12109e, float:1.9415357E38)
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.invites.ViewGroupInviteActivity.onCreate(android.os.Bundle):void");
    }

    public ViewGroupInviteActivity(int i) {
        this.A0T = false;
        AnonymousClass4HY.A00(this, 76);
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A05.A0R(runnable);
            this.A0R = null;
        }
        this.A0F.A07(this.A0U);
        this.A0A.A00();
    }

    public ViewGroupInviteActivity() {
        this(0);
        this.A0V = new AtomicReference((Object) null);
        this.A0U = new AnonymousClass4IC(this, 11);
    }
}
