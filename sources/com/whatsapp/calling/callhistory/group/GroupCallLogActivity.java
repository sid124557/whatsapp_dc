package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass002;
import X.AnonymousClass30V;
import X.AnonymousClass3ZF;
import X.AnonymousClass4SG;
import X.AnonymousClass4XB;
import X.AnonymousClass5TW;
import X.AnonymousClass5Z0;
import X.AnonymousClass5ZU;
import X.AnonymousClass64J;
import X.AnonymousClass681;
import X.C06400Xn;
import X.C105365Uq;
import X.C106645Zu;
import X.C107305b5;
import X.C107335b8;
import X.C107695bk;
import X.C112515jr;
import X.C114015mM;
import X.C1230066r;
import X.C171058Fo;
import X.C18310x6;
import X.C184288rY;
import X.C187958y5;
import X.C29421in;
import X.C50382i5;
import X.C56602sG;
import X.C56762sW;
import X.C57162tC;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C89644eZ;
import X.C95814uZ;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Collections;

public class GroupCallLogActivity extends C89644eZ {
    public AnonymousClass64J A00;
    public C50382i5 A01;
    public AnonymousClass4XB A02;
    public C1230066r A03;
    public C112515jr A04;
    public AnonymousClass5Z0 A05;
    public AnonymousClass5TW A06;
    public C64773Ex A07;
    public C29421in A08;
    public AnonymousClass5ZU A09;
    public C105365Uq A0A;
    public C105365Uq A0B;
    public C114015mM A0C;
    public C57162tC A0D;
    public C56762sW A0E;
    public AnonymousClass30V A0F;
    public C187958y5 A0G;
    public AnonymousClass3ZF A0H;
    public boolean A0I;
    public final C56602sG A0J;
    public final C184288rY A0K;

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A01 = (C50382i5) A2Y.AZG.get();
            this.A03 = C86644Kx.A0Q(A2Y);
            this.A0C = C64333Db.A29(A2Y);
            this.A06 = (AnonymousClass5TW) A2Y.ASQ.get();
            this.A09 = C64333Db.A28(A2Y);
            this.A07 = C64333Db.A26(A2Y);
            this.A0G = C86614Ku.A0o(A2Y);
            this.A08 = C86614Ku.A0S(A2Y);
            this.A0E = (C56762sW) A2Y.A4R.get();
            this.A04 = A2Y.Ai5();
            this.A05 = r2.AJu();
            this.A0D = C86624Kv.A0R(A2Y);
            this.A0F = C86604Kt.A0f(A2Y);
            this.A00 = C86614Ku.A0N(A2Y);
        }
    }

    public void A66() {
        this.A0F.A03((C95814uZ) null, 15);
        super.A66();
    }

    public GroupCallLogActivity(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 27);
    }

    public static /* synthetic */ void A0C(GroupCallLogActivity groupCallLogActivity, String str, boolean z) {
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        String A0F2 = AnonymousClass002.A0F(groupCallLogActivity, C107305b5.A05(str, z), AnonymousClass002.A0L(), 0, i);
        if (Build.VERSION.SDK_INT < 22) {
            AnonymousClass5Z0 r2 = groupCallLogActivity.A05;
            r2.A01.BhD(C107305b5.A02((String) null, 2, 2, z));
        }
        groupCallLogActivity.startActivity(C107305b5.A00(groupCallLogActivity, A0F2, groupCallLogActivity.getString(R.string.f11nameremoved), 2, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x019f, code lost:
        if (r0 == false) goto L_0x01a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            boolean r8 = X.AnonymousClass1Hf.A2I(r10)
            r0 = 2131887239(0x7f120487, float:1.940908E38)
            r10.setTitle(r0)
            r0 = 2131625019(0x7f0e043b, float:1.8877234E38)
            r10.setContentView((int) r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "call_log_key"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            X.39J r0 = (X.AnonymousClass39J) r0
            if (r0 == 0) goto L_0x0041
            X.2sW r5 = r10.A0E
            com.whatsapp.jid.UserJid r4 = r0.A01
            boolean r3 = r0.A03
            java.lang.String r2 = r0.A02
            int r1 = r0.A00
            X.39J r0 = new X.39J
            r0.<init>(r1, r4, r2, r3)
            X.3ZF r0 = r5.A02(r0)
        L_0x0034:
            r10.A0H = r0
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "call log missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.finish()
            return
        L_0x0041:
            r0 = 0
            goto L_0x0034
        L_0x0043:
            X.5mM r1 = r10.A0C
            java.lang.String r0 = "group-call-log-activity"
            X.5Uq r0 = r1.A06(r10, r0)
            r10.A0B = r0
            X.5mM r3 = r10.A0C
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131166658(0x7f0705c2, float:1.7947568E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 0
            java.lang.String r0 = "group-call-log-multi-contact"
            X.5Uq r0 = r3.A07(r0, r1, r2)
            r10.A0A = r0
            r0 = 2131432081(0x7f0b1291, float:1.848591E38)
            android.view.View r1 = r10.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r3 = 0
            X.C18320x8.A19(r1, r8)
            r9 = 0
            X.4XB r0 = new X.4XB
            r0.<init>(r10)
            r10.A02 = r0
            r1.setAdapter(r0)
            X.3ZF r0 = r10.A0H
            java.util.List r2 = r0.A08()
            X.3ZF r0 = r10.A0H
            X.39J r0 = r0.A0E
            com.whatsapp.jid.UserJid r7 = r0.A01
            java.util.Iterator r6 = r2.iterator()
            r5 = r9
        L_0x008c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r4 = r6.next()
            X.3ZE r4 = (X.AnonymousClass3ZE) r4
            com.whatsapp.jid.UserJid r1 = r4.A02
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x00a2
            r5 = r4
            goto L_0x008c
        L_0x00a2:
            boolean r0 = X.AnonymousClass4SG.A46(r10, r1)
            if (r0 == 0) goto L_0x008c
            r9 = r4
            goto L_0x008c
        L_0x00aa:
            if (r9 == 0) goto L_0x00af
            r2.remove(r9)
        L_0x00af:
            if (r5 == 0) goto L_0x00b7
            r2.remove(r5)
            r2.add(r3, r5)
        L_0x00b7:
            X.3ZF r0 = r10.A0H
            X.39J r0 = r0.A0E
            boolean r0 = r0.A03
            r8 = r8 ^ r0
            int r0 = r2.size()
            java.util.List r5 = r2.subList(r8, r0)
            X.3Ex r4 = r10.A07
            X.5ZU r1 = r10.A09
            X.3co r0 = new X.3co
            r0.<init>(r4, r1)
            java.util.Collections.sort(r5, r0)
            X.4XB r1 = r10.A02
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r2)
            r1.A00 = r0
            r1.A05()
            X.3ZF r7 = r10.A0H
            r0 = 2131428464(0x7f0b0470, float:1.8478573E38)
            android.widget.TextView r6 = X.C18310x6.A0L(r10, r0)
            r0 = 2131428462(0x7f0b046e, float:1.847857E38)
            android.widget.ImageView r4 = X.C86654Ky.A0M(r10, r0)
            X.2l8 r0 = r7.A0I
            if (r0 == 0) goto L_0x016e
            X.1VX r1 = r10.A0D
            X.2sr r0 = r10.A01
            java.util.List r8 = X.C106255Yf.A01(r0, r1, r7)
            X.3Ex r5 = r10.A07
            X.5ZU r1 = r10.A09
            r0 = 3
            X.7Qw r0 = X.C107305b5.A04(r5, r1, r8, r0, r3)
            X.C626936e.A06(r0)
            java.lang.CharSequence r0 = r0.A00(r10)
            r5 = 2131234190(0x7f080d8e, float:1.8084539E38)
        L_0x010c:
            r6.setText(r0)
            r4.setImageResource(r5)
            int r0 = X.C107215at.A01(r7)
            int r0 = X.AnonymousClass0Y8.A04(r10, r0)
            X.C107335b8.A0E(r4, r0)
            r0 = 2131428408(0x7f0b0438, float:1.847846E38)
            android.widget.TextView r5 = X.C18310x6.A0L(r10, r0)
            X.33j r4 = r10.A00
            int r0 = r7.A01
            long r0 = (long) r0
            X.C107565bW.A0I(r5, r4, r0)
            r0 = 2131428399(0x7f0b042f, float:1.8478441E38)
            android.widget.TextView r5 = X.C18310x6.A0L(r10, r0)
            X.33j r4 = r10.A00
            long r0 = r7.A03
            java.lang.String r0 = X.AnonymousClass35V.A05(r4, r0)
            r5.setText(r0)
            r0 = 2131428402(0x7f0b0432, float:1.8478447E38)
            android.widget.TextView r6 = X.C18310x6.A0L(r10, r0)
            X.2sH r5 = r10.A06
            X.33j r4 = r10.A00
            long r0 = r7.A0B
            java.lang.CharSequence r0 = X.C107565bW.A00(r5, r4, r0)
            r6.setText(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r2.iterator()
        L_0x015a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r2.next()
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            X.3Ex r1 = r10.A07
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.C86614Ku.A1P(r1, r0, r4)
            goto L_0x015a
        L_0x016e:
            X.39J r0 = r7.A0E
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x017f
            r5 = 2131233930(0x7f080c8a, float:1.8084011E38)
            r1 = 2131891562(0x7f12156a, float:1.9417848E38)
        L_0x017a:
            java.lang.String r0 = r10.getString(r1)
            goto L_0x010c
        L_0x017f:
            int r1 = r7.A00
            r0 = 5
            if (r1 != r0) goto L_0x018b
            r5 = 2131233926(0x7f080c86, float:1.8084003E38)
            r1 = 2131890159(0x7f120fef, float:1.9415002E38)
            goto L_0x017a
        L_0x018b:
            boolean r0 = r7.A0N()
            if (r0 == 0) goto L_0x01a1
            X.1VX r1 = r10.A0D
            r0 = 1972(0x7b4, float:2.763E-42)
            boolean r0 = r1.A0X(r0)
            r5 = 2131233926(0x7f080c86, float:1.8084003E38)
            r1 = 2131887388(0x7f12051c, float:1.9409382E38)
            if (r0 != 0) goto L_0x017a
        L_0x01a1:
            r5 = 2131233926(0x7f080c86, float:1.8084003E38)
            r1 = 2131890802(0x7f121272, float:1.9416306E38)
            goto L_0x017a
        L_0x01a8:
            r0 = 2131431615(0x7f0b10bf, float:1.8484964E38)
            android.view.View r2 = r10.findViewById(r0)
            com.whatsapp.calling.views.MultiContactThumbnail r2 = (com.whatsapp.calling.views.MultiContactThumbnail) r2
            X.5Uq r1 = r10.A0A
            X.8rY r0 = r10.A0K
            r2.A00(r0, r1, r4)
            X.3ZF r0 = r10.A0H
            X.2l8 r0 = r0.A0I
            if (r0 == 0) goto L_0x0224
            X.3ZF r0 = r10.A0H
            X.2l8 r6 = r0.A0I
            X.3ZF r0 = r10.A0H
            boolean r4 = r0.A0L
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            X.C86604Kt.A1L(r10, r0)
            r0 = 2131428424(0x7f0b0448, float:1.8478492E38)
            X.C18280x3.A0r(r10, r0, r3)
            r0 = 2131428425(0x7f0b0449, float:1.8478494E38)
            android.widget.TextView r5 = X.C18310x6.A0L(r10, r0)
            r0 = 2131430858(0x7f0b0dca, float:1.8483429E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r10, r0)
            r0 = 2131231929(0x7f0804b9, float:1.8079953E38)
            if (r4 == 0) goto L_0x01e8
            r0 = 2131231931(0x7f0804bb, float:1.8079957E38)
        L_0x01e8:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r10, r0)
            if (r0 == 0) goto L_0x0203
            android.graphics.drawable.Drawable r2 = X.C06130Wj.A01(r0)
            r1 = 2130970365(0x7f0406fd, float:1.7549438E38)
            r0 = 2131102207(0x7f0609ff, float:1.7816845E38)
            int r0 = X.C18300x5.A03(r10, r1, r0)
            X.AnonymousClass0YG.A06(r2, r0)
            r0 = 0
            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r0, r0, r0)
        L_0x0203:
            java.lang.String r1 = r6.A02
            java.lang.String r0 = X.C107305b5.A05(r1, r4)
            r5.setText(r0)
            X.5ed r0 = new X.5ed
            r0.<init>(r10, r1, r4)
            r5.setOnClickListener(r0)
            X.7zS r0 = new X.7zS
            r0.<init>(r10, r1, r4)
            r5.setOnLongClickListener(r0)
            X.5ed r0 = new X.5ed
            r0.<init>(r10, r1, r4)
            r3.setOnClickListener(r0)
        L_0x0224:
            X.1in r1 = r10.A08
            X.2sG r0 = r10.A0J
            r1.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.group.GroupCallLogActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f11nameremoved).setIcon(R.drawable.ic_action_delete);
        if (this.A0D.A0X(3321)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Drawable A0G2 = C18310x6.A0G(this, R.drawable.vec_ic_settings_bug_report);
            C107335b8.A0B(A0G2, C06400Xn.A00((Resources.Theme) null, getResources(), R.color.f5nameremoved));
            menu.add(0, R.id.menuitem_call_log_bugnub, 0, R.string.f11nameremoved).setIcon(A0G2).setShowAsAction(1);
        }
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A08.A07(this.A0J);
        C105365Uq r0 = this.A0B;
        if (r0 != null) {
            r0.A00();
        }
        C105365Uq r02 = this.A0A;
        if (r02 != null) {
            r02.A00();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_clear_call_log) {
            Log.i("calllog/delete");
            this.A0E.A0B(Collections.singletonList(this.A0H));
        } else if (menuItem.getItemId() != 16908332) {
            if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                return false;
            }
            startActivity(C627736r.A0I(this, (Uri) null, getIntent().getParcelableExtra("call_log_key"), true));
            return true;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A06.A02()) {
            C106645Zu.A00(this.A04, "show_voip_activity");
        }
    }

    public GroupCallLogActivity() {
        this(0);
        this.A0J = AnonymousClass681.A00(this, 6);
        this.A0K = new C171058Fo(this);
    }
}
