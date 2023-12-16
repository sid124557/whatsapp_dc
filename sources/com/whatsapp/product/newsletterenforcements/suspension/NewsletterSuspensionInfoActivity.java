package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass28I;
import X.AnonymousClass3DZ;
import X.AnonymousClass433;
import X.AnonymousClass434;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C08240dc;
import X.C08310eF;
import X.C106715a2;
import X.C107695bk;
import X.C114015mM;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18330xA;
import X.C28511hE;
import X.C53602nM;
import X.C64333Db;
import X.C64773Ex;
import X.C71263bp;
import X.C79323wR;
import X.C79333wS;
import X.C79343wT;
import X.C79353wU;
import X.C79363wV;
import X.C79373wW;
import X.C79383wX;
import X.C79393wY;
import X.C81043zF;
import X.C81053zG;
import X.C824843t;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class NewsletterSuspensionInfoActivity extends C89644eZ {
    public C64773Ex A00;
    public C114015mM A01;
    public C53602nM A02;
    public C106715a2 A03;
    public boolean A04;
    public final AnonymousClass66R A05;
    public final AnonymousClass66R A06;
    public final AnonymousClass66R A07;
    public final AnonymousClass66R A08;
    public final AnonymousClass66R A09;
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C;

    public final void A74(C28511hE r13) {
        int i;
        AnonymousClass66R r5 = this.A0B;
        ((View) r5.getValue()).setVisibility(0);
        if (r13 != null) {
            i = AnonymousClass28I.A00(r13.A02);
        } else {
            i = R.string.f11nameremoved;
        }
        TextView textView = (TextView) r5.getValue();
        C106715a2 r6 = this.A03;
        if (r6 != null) {
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = "clickable-span";
            textView.setText(r6.A06(this, C71263bp.A00(this, 48), AnonymousClass002.A0F(this, getString(i), A0M, 1, R.string.f11nameremoved), "clickable-span", C18290x4.A00(this)));
            C18270x1.A0q((TextView) r5.getValue(), this.A0D);
            return;
        }
        throw C18270x1.A0S("linkifier");
    }

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r1 = A002.A00;
            AnonymousClass1Ha.A23(A002, r1, r1, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = C18280x3.A0Q(r1);
            this.A01 = C64333Db.A29(A002);
            this.A00 = C64333Db.A26(A002);
            this.A02 = C18280x3.A0L(r1);
        }
    }

    public NewsletterSuspensionInfoActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 93);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass002.A09(this.A00, R.id.header_title).setText(R.string.f11nameremoved);
        ((ImageView) findViewById(R.id.channel_badge)).setImageResource(R.drawable.ic_opaque_warning_triangle);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A09((C08310eF) this.A09.getValue(), R.id.newsletter_guidelines_fragment);
        A0J.A01();
        AnonymousClass66R r3 = this.A0C;
        AnonymousClass4K2.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A00, new C824843t((WaImageView) this.A00.findViewById(R.id.channel_icon), this), 170);
        AnonymousClass4K2.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A01, new AnonymousClass434(this), 169);
        AnonymousClass4K2.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A02, new AnonymousClass433(this), 171);
        AnonymousClass1Ha.A25(this, r3);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AnonymousClass1Ha.A25(this, this.A0C);
    }

    public NewsletterSuspensionInfoActivity() {
        this(0);
        this.A07 = C154517dI.A00(AnonymousClass58H.NONE, new C81043zF(this));
        this.A0C = C18330xA.A02(new C79383wX(this), new C79373wW(this), new C81053zG(this), AnonymousClass0x9.A1E(NewsletterSuspensionInfoViewModel.class));
        this.A0A = C154517dI.A01(new C79363wV(this));
        this.A0B = C154517dI.A01(new C79393wY(this));
        this.A08 = C154517dI.A01(new C79343wT(this));
        this.A05 = C154517dI.A01(new C79323wR(this));
        this.A06 = C154517dI.A01(new C79333wS(this));
        this.A09 = C154517dI.A01(new C79353wU(this));
    }
}
