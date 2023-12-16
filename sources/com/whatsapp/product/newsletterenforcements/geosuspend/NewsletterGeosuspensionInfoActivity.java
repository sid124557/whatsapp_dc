package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0IV;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass3DZ;
import X.AnonymousClass432;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C08240dc;
import X.C08310eF;
import X.C106675Zy;
import X.C106715a2;
import X.C107695bk;
import X.C114015mM;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18330xA;
import X.C53602nM;
import X.C616131n;
import X.C620733j;
import X.C64333Db;
import X.C64773Ex;
import X.C71263bp;
import X.C79223wH;
import X.C79233wI;
import X.C79243wJ;
import X.C79253wK;
import X.C79263wL;
import X.C79273wM;
import X.C80573yS;
import X.C81023zD;
import X.C81033zE;
import X.C824743s;
import X.C84814Du;
import X.C85494Gl;
import X.C89644eZ;
import X.C95804uY;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class NewsletterGeosuspensionInfoActivity extends C89644eZ {
    public C64773Ex A00;
    public C114015mM A01;
    public C53602nM A02;
    public C106675Zy A03;
    public C106715a2 A04;
    public boolean A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        C106675Zy r2 = this.A03;
        if (r2 != null) {
            C620733j r1 = this.A00;
            AnonymousClass66R r3 = this.A07;
            Object A022 = r2.A02(r1, AnonymousClass0x9.A13(r3));
            if (A022 == null) {
                A022 = r3.getValue();
            }
            C162457s7.A0H(A022);
            AnonymousClass001.A0y(this, AnonymousClass002.A09(this.A00, R.id.header_title), new Object[]{A022}, R.string.f11nameremoved);
            ((ImageView) findViewById(R.id.channel_badge)).setImageResource(R.drawable.ic_opaque_warning_triangle);
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            A0J.A09((C08310eF) this.A0B.getValue(), R.id.newsletter_guidelines_fragment);
            A0J.A01();
            TextView A0L = C18310x6.A0L(this, R.id.header_description);
            A0L.setVisibility(0);
            C106715a2 r6 = this.A04;
            if (r6 != null) {
                A0L.setText(r6.A06(this, C71263bp.A00(this, 43), AnonymousClass002.A0F(this, "clickable-span", new Object[1], 0, R.string.f11nameremoved), "clickable-span", C18290x4.A00(this)));
                C18270x1.A0q(A0L, this.A0D);
                AnonymousClass66R r4 = this.A0C;
                AnonymousClass4K2.A00(this, ((NewsletterGeosuspensionInfoViewModel) r4.getValue()).A00, new C824743s((WaImageView) this.A00.findViewById(R.id.channel_icon), this), 167);
                AnonymousClass4K2.A00(this, ((NewsletterGeosuspensionInfoViewModel) r4.getValue()).A01, new AnonymousClass432(this), 168);
                NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel = (NewsletterGeosuspensionInfoViewModel) r4.getValue();
                C95804uY r42 = (C95804uY) this.A09.getValue();
                String A13 = AnonymousClass0x9.A13(r3);
                C18260x0.A0O(r42, A13);
                C616131n.A02((C85494Gl) null, new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(r42, newsletterGeosuspensionInfoViewModel, A13, (C84814Du) null), AnonymousClass0IV.A00(newsletterGeosuspensionInfoViewModel), (AnonymousClass20D) null, 3);
                return;
            }
            throw C18270x1.A0S("linkifier");
        }
        throw C18270x1.A0S("countryUtils");
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A04 = C18280x3.A0Q(r1);
            this.A03 = (C106675Zy) A002.A73.get();
            this.A01 = C64333Db.A29(A002);
            this.A00 = C64333Db.A26(A002);
            this.A02 = C18280x3.A0L(r1);
        }
    }

    public NewsletterGeosuspensionInfoActivity(int i) {
        this.A05 = false;
        AnonymousClass4HY.A00(this, 92);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel = (NewsletterGeosuspensionInfoViewModel) this.A0C.getValue();
        C95804uY r4 = (C95804uY) this.A09.getValue();
        String A13 = AnonymousClass0x9.A13(this.A07);
        C18260x0.A0O(r4, A13);
        C616131n.A02((C85494Gl) null, new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(r4, newsletterGeosuspensionInfoViewModel, A13, (C84814Du) null), AnonymousClass0IV.A00(newsletterGeosuspensionInfoViewModel), (AnonymousClass20D) null, 3);
    }

    public NewsletterGeosuspensionInfoActivity() {
        this(0);
        AnonymousClass58H r2 = AnonymousClass58H.NONE;
        this.A09 = C154517dI.A00(r2, new C81023zD(this));
        this.A07 = C154517dI.A00(r2, new C80573yS(this, "country_code"));
        this.A0C = C18330xA.A02(new C79273wM(this), new C79263wL(this), new C81033zE(this), AnonymousClass0x9.A1E(NewsletterGeosuspensionInfoViewModel.class));
        this.A08 = C154517dI.A01(new C79233wI(this));
        this.A06 = C154517dI.A01(new C79223wH(this));
        this.A0A = C154517dI.A01(new C79243wJ(this));
        this.A0B = C154517dI.A01(new C79253wK(this));
    }
}
