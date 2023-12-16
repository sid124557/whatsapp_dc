package com.whatsapp.community.deactivate;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass31C;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass480;
import X.AnonymousClass4HY;
import X.AnonymousClass5ZU;
import X.C107695bk;
import X.C114015mM;
import X.C18270x1;
import X.C27991fJ;
import X.C64333Db;
import X.C64653Ej;
import X.C64773Ex;
import X.C85884Hz;
import X.C89644eZ;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class DeactivateCommunityDisclaimerActivity extends C89644eZ implements AnonymousClass480 {
    public View A00;
    public C64653Ej A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C114015mM A04;
    public AnonymousClass3ZH A05;
    public C27991fJ A06;
    public AnonymousClass31C A07;
    public boolean A08;

    public final void A74() {
        if (!this.A07.A0F()) {
            A6Y(new C85884Hz(this, 4), 0, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
            return;
        }
        C27991fJ r3 = this.A06;
        if (r3 == null) {
            throw C18270x1.A0S("parentGroupJid");
        }
        DeactivateCommunityConfirmationFragment deactivateCommunityConfirmationFragment = new DeactivateCommunityConfirmationFragment();
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, r3, "parent_group_jid");
        deactivateCommunityConfirmationFragment.A0u(A082);
        Bon(deactivateCommunityConfirmationFragment, "DeactivateCommunityDisclaimerActivity");
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = C64333Db.A29(A002);
            this.A07 = C64333Db.A5u(A002);
            this.A02 = C64333Db.A26(A002);
            this.A03 = C64333Db.A28(A002);
            this.A01 = (C64653Ej) A002.A5c.get();
        }
    }

    public DeactivateCommunityDisclaimerActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 40);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r0 = 2131624017(0x7f0e0051, float:1.8875202E38)
            r7.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r1 = X.AnonymousClass1Hf.A28(r7)
            r0 = 2131888427(0x7f12092b, float:1.941149E38)
            r1.setTitle((int) r0)
            r7.setSupportActionBar(r1)
            boolean r6 = X.AnonymousClass1Hf.A2I(r7)
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "parent_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.1fJ r1 = X.AnonymousClass34R.A05(r0)
            r7.A06 = r1
            X.3Ex r0 = r7.A02
            if (r0 == 0) goto L_0x00bf
            X.3ZH r0 = r0.A0A(r1)
            r7.A05 = r0
            r0 = 2131429302(0x7f0b07b6, float:1.8480273E38)
            android.view.View r0 = X.C18290x4.A0L(r7, r0)
            r7.A00 = r0
            r0 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r3 = X.C18290x4.A0L(r7, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166164(0x7f0703d4, float:1.7946566E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.5mM r1 = r7.A04
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "deactivate-community-disclaimer"
            X.5Uq r1 = r1.A06(r7, r0)
            X.3ZH r0 = r7.A05
            java.lang.String r5 = "parentGroupContact"
            if (r0 != 0) goto L_0x0068
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0068:
            r1.A09(r3, r0, r2, r6)
            r0 = 2131428857(0x7f0b05f9, float:1.847937E38)
            android.view.View r1 = X.C005205m.A00(r7, r0)
            r0 = 38
            X.AnonymousClass0x2.A0z(r1, r7, r0)
            r0 = 2131429301(0x7f0b07b5, float:1.848027E38)
            android.view.View r4 = X.C005205m.A00(r7, r0)
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            r3 = 2131888439(0x7f120937, float:1.9411513E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            X.5ZU r1 = r7.A03
            if (r1 == 0) goto L_0x00b0
            X.3ZH r0 = r7.A05
            if (r0 != 0) goto L_0x0092
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r5)
            throw r0
        L_0x0092:
            X.C18290x4.A1K(r1, r0, r2)
            java.lang.String r0 = r7.getString(r3, r2)
            r4.A0I(r0)
            r0 = 2131429300(0x7f0b07b4, float:1.8480269E38)
            android.view.View r1 = X.C18290x4.A0L(r7, r0)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0 = 2131428858(0x7f0b05fa, float:1.8479372E38)
            android.view.View r0 = X.C18290x4.A0L(r7, r0)
            X.C57652tz.A00(r0, r1)
            return
        L_0x00b0:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00b8:
            java.lang.String r0 = "contactPhotos"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x00bf:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity.onCreate(android.os.Bundle):void");
    }

    public DeactivateCommunityDisclaimerActivity() {
        this(0);
    }
}
