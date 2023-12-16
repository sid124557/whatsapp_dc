package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass10L;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass48O;
import X.AnonymousClass4HY;
import X.AnonymousClass58H;
import X.AnonymousClass5R7;
import X.AnonymousClass66R;
import X.C103175Lv;
import X.C106675Zy;
import X.C106715a2;
import X.C107695bk;
import X.C114015mM;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18330xA;
import X.C53602nM;
import X.C64333Db;
import X.C64773Ex;
import X.C71263bp;
import X.C79133w8;
import X.C79143w9;
import X.C79153wA;
import X.C79163wB;
import X.C79173wC;
import X.C79183wD;
import X.C79193wE;
import X.C80993zA;
import X.C81003zB;
import X.C88834as;
import X.C89644eZ;
import com.whatsapp.WaTextView;

public final class NewsletterAppealsOutcomeActivity extends C89644eZ {
    public C103175Lv A00;
    public C64773Ex A01;
    public C114015mM A02;
    public C53602nM A03;
    public AnonymousClass5R7 A04;
    public AnonymousClass48O A05;
    public C106675Zy A06;
    public C106715a2 A07;
    public boolean A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;
    public final AnonymousClass66R A0D;
    public final AnonymousClass66R A0E;
    public final AnonymousClass66R A0F;

    public final void A74(WaTextView waTextView, String str) {
        C106715a2 r1 = this.A07;
        if (r1 != null) {
            waTextView.setText(r1.A06(this, C71263bp.A00(this, 41), str, "clickable-span", AnonymousClass0x2.A05(waTextView)));
            C18270x1.A0q(waTextView, waTextView.getAbProps());
            return;
        }
        throw C18270x1.A0S("linkifier");
    }

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass1Ha.A23(r2, r1, r1, this);
            AnonymousClass1Ha.A24(r2, this);
            this.A07 = C18280x3.A0Q(r1);
            this.A06 = (C106675Zy) r2.A73.get();
            this.A02 = C64333Db.A29(r2);
            this.A01 = C64333Db.A26(r2);
            this.A03 = C18280x3.A0L(r1);
            this.A05 = (AnonymousClass48O) A0I.A1p.get();
            this.A00 = (C103175Lv) A0I.A0j.get();
            this.A04 = (AnonymousClass5R7) r1.A2p.get();
        }
    }

    public NewsletterAppealsOutcomeActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 91);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r0 = 2131887614(0x7f1205fe, float:1.940984E38)
            r9.setTitle(r0)
            r9.A6N()
            X.AnonymousClass1Hf.A2E(r9)
            r0 = 2131624047(0x7f0e006f, float:1.8875263E38)
            r9.setContentView((int) r0)
            X.66R r2 = r9.A0B
            java.lang.Object r3 = r2.getValue()
            X.38T r3 = (X.AnonymousClass38T) r3
            boolean r0 = r3 instanceof X.C28521hF
            if (r0 == 0) goto L_0x0132
            X.1hF r3 = (X.C28521hF) r3
            X.5Zy r4 = r9.A06
            if (r4 == 0) goto L_0x0246
            X.33j r1 = r9.A00
            java.lang.String r0 = r3.A03
            java.lang.String r8 = r4.A02(r1, r0)
            if (r8 != 0) goto L_0x0032
            r8 = r0
        L_0x0032:
            X.C162457s7.A0H(r8)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A01
            int r1 = r0.ordinal()
            java.lang.String r7 = "clickable-span"
            r3 = 2
            r5 = 0
            r4 = 1
            if (r1 == r4) goto L_0x0224
            r0 = 3
            if (r1 == r0) goto L_0x0120
            if (r1 != r3) goto L_0x0063
            X.66R r0 = r9.A0E
            android.widget.TextView r3 = X.C18280x3.A0G(r0)
            r1 = 2131890992(0x7f121330, float:1.9416691E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r8
            X.AnonymousClass001.A0y(r9, r3, r0, r1)
        L_0x0057:
            X.66R r0 = r9.A0A
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890991(0x7f12132f, float:1.941669E38)
            r1.setText(r0)
        L_0x0063:
            android.view.View r1 = r9.A00
            r0 = 2131431719(0x7f0b1127, float:1.8485175E38)
            android.widget.TextView r5 = X.AnonymousClass002.A09(r1, r0)
            X.C162457s7.A0H(r5)
            java.lang.Object r0 = r2.getValue()
            X.38T r0 = (X.AnonymousClass38T) r0
            java.lang.String r0 = r0.A01()
            X.C106895aL.A02(r5, r0)
            java.lang.Object r0 = r2.getValue()
            X.38T r0 = (X.AnonymousClass38T) r0
            java.lang.String r0 = r0.A01()
            if (r0 == 0) goto L_0x00a2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.Long.parseLong(r0)
            long r3 = r3.toMillis(r0)
            X.33j r0 = r9.A00
            java.lang.String r0 = X.C107505bQ.A05(r0, r3)
            r1 = 2131890999(0x7f121337, float:1.9416706E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            X.AnonymousClass001.A0y(r9, r5, r0, r1)
        L_0x00a2:
            X.66R r0 = r9.A09
            java.lang.Object r4 = X.C18300x5.A0d(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.Object r0 = r2.getValue()
            X.38T r0 = (X.AnonymousClass38T) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r0.A00()
            int r3 = r0.ordinal()
            r0 = 1
            if (r3 == r0) goto L_0x011c
            r0 = 4
            if (r3 == r0) goto L_0x011c
            r0 = 3
            r1 = 2131232477(0x7f0806dd, float:1.8081064E38)
            if (r3 == r0) goto L_0x00cb
            r0 = 2
            r1 = 2131232480(0x7f0806e0, float:1.808107E38)
            if (r3 == r0) goto L_0x00cb
            r1 = 0
        L_0x00cb:
            r4.setImageResource(r1)
            java.lang.Object r0 = r2.getValue()
            X.38T r0 = (X.AnonymousClass38T) r0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r1 = r0.A00()
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState.REJECT
            if (r1 != r0) goto L_0x00f1
            X.0dc r2 = X.AnonymousClass0x2.A0J(r9)
            r1 = 2131431742(0x7f0b113e, float:1.8485222E38)
            X.66R r0 = r9.A0C
            java.lang.Object r0 = r0.getValue()
            X.0eF r0 = (X.C08310eF) r0
            r2.A09(r0, r1)
            r2.A01()
        L_0x00f1:
            X.66R r3 = r9.A0F
            java.lang.Object r0 = r3.getValue()
            X.10L r0 = (X.AnonymousClass10L) r0
            X.08M r2 = r0.A00
            X.430 r1 = new X.430
            r1.<init>(r9)
            r0 = 166(0xa6, float:2.33E-43)
            X.AnonymousClass4K2.A00(r9, r2, r1, r0)
            java.lang.Object r0 = r3.getValue()
            X.10L r0 = (X.AnonymousClass10L) r0
            X.4C6 r4 = X.AnonymousClass0IV.A00(r0)
            X.3gB r3 = r0.A05
            r2 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1 r1 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchNewsletterContact$1
            r1.<init>(r0, r2)
            r0 = 2
            X.C616131n.A02(r3, r1, r4, r2, r0)
            return
        L_0x011c:
            r1 = 2131232478(0x7f0806de, float:1.8081066E38)
            goto L_0x00cb
        L_0x0120:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890987(0x7f12132b, float:1.9416681E38)
            com.whatsapp.WaTextView r6 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r1 = 2131890997(0x7f121335, float:1.9416702E38)
            goto L_0x0234
        L_0x0132:
            boolean r0 = r3 instanceof X.C28531hG
            if (r0 == 0) goto L_0x01d8
            X.1hG r3 = (X.C28531hG) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A01
            int r1 = r0.ordinal()
            java.lang.String r5 = "clickable-span"
            r4 = 1
            if (r1 == r4) goto L_0x01bd
            r0 = 4
            if (r1 == r0) goto L_0x01a7
            r0 = 3
            if (r1 == r0) goto L_0x0196
            r0 = 2
            if (r1 != r0) goto L_0x0164
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890993(0x7f121331, float:1.9416693E38)
            r1.setText(r0)
            X.66R r0 = r9.A0A
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890995(0x7f121333, float:1.9416698E38)
        L_0x0161:
            r1.setText(r0)
        L_0x0164:
            X.66R r5 = r9.A0F
            java.lang.Object r0 = r5.getValue()
            X.10L r0 = (X.AnonymousClass10L) r0
            X.08M r4 = r0.A01
            X.42z r1 = new X.42z
            r1.<init>(r9)
            r0 = 165(0xa5, float:2.31E-43)
            X.AnonymousClass4K2.A00(r9, r4, r1, r0)
            java.lang.Object r8 = r5.getValue()
            X.10L r8 = (X.AnonymousClass10L) r8
            java.lang.String r0 = r3.A04
            long r4 = java.lang.Long.parseLong(r0)
            X.4C6 r7 = X.AnonymousClass0IV.A00(r8)
            X.3gB r6 = r8.A05
            r3 = 0
            com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 r1 = new com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1
            r1.<init>(r8, r3, r4)
            r0 = 2
            X.C616131n.A02(r6, r1, r7, r3, r0)
            goto L_0x0063
        L_0x0196:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890988(0x7f12132c, float:1.9416683E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r0 = 2131890996(0x7f121334, float:1.94167E38)
            goto L_0x01cd
        L_0x01a7:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890988(0x7f12132c, float:1.9416683E38)
            r1.setText(r0)
            X.66R r0 = r9.A0A
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890990(0x7f12132e, float:1.9416687E38)
            goto L_0x0161
        L_0x01bd:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890988(0x7f12132c, float:1.9416683E38)
            com.whatsapp.WaTextView r1 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r0 = 2131891000(0x7f121338, float:1.9416708E38)
        L_0x01cd:
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r9, r5, r4, r0)
            X.C162457s7.A0D(r0)
            r9.A74(r1, r0)
            goto L_0x0164
        L_0x01d8:
            boolean r0 = r3 instanceof X.C28511hE
            if (r0 == 0) goto L_0x0063
            X.1hE r3 = (X.C28511hE) r3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState r0 = r3.A01
            int r1 = r0.ordinal()
            java.lang.String r5 = "clickable-span"
            r4 = 0
            r3 = 1
            if (r1 == r3) goto L_0x020f
            r0 = 3
            if (r1 == r0) goto L_0x01fe
            r0 = 2
            if (r1 != r0) goto L_0x0063
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890994(0x7f121332, float:1.9416696E38)
            r1.setText(r0)
            goto L_0x0057
        L_0x01fe:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890989(0x7f12132d, float:1.9416685E38)
            com.whatsapp.WaTextView r6 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r1 = 2131890998(0x7f121336, float:1.9416704E38)
            goto L_0x021f
        L_0x020f:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890989(0x7f12132d, float:1.9416685E38)
            com.whatsapp.WaTextView r6 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r1 = 2131891002(0x7f12133a, float:1.9416712E38)
        L_0x021f:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r5
            goto L_0x023a
        L_0x0224:
            X.66R r0 = r9.A0E
            android.widget.TextView r1 = X.C18280x3.A0G(r0)
            r0 = 2131890987(0x7f12132b, float:1.9416681E38)
            com.whatsapp.WaTextView r6 = X.AnonymousClass1Ha.A1n(r1, r9, r0)
            r1 = 2131891001(0x7f121339, float:1.941671E38)
        L_0x0234:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r8
            r0[r4] = r7
        L_0x023a:
            java.lang.String r0 = r9.getString(r1, r0)
            X.C162457s7.A0D(r0)
            r9.A74(r6, r0)
            goto L_0x0063
        L_0x0246:
            java.lang.String r0 = "countryUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity.onCreate(android.os.Bundle):void");
    }

    public NewsletterAppealsOutcomeActivity() {
        this(0);
        this.A0D = C154517dI.A00(AnonymousClass58H.NONE, new C80993zA(this));
        this.A0B = C154517dI.A01(new C79153wA(this));
        this.A0F = C18330xA.A02(new C79173wC(this), new C79193wE(this), new C81003zB(this), AnonymousClass0x9.A1E(AnonymousClass10L.class));
        this.A09 = C154517dI.A01(new C79133w8(this));
        this.A0E = C154517dI.A01(new C79183wD(this));
        this.A0A = C154517dI.A01(new C79143w9(this));
        this.A0C = C154517dI.A01(new C79163wB(this));
    }
}
