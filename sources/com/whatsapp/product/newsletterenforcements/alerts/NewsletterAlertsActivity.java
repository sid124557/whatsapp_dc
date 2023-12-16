package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass0IV;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass20D;
import X.AnonymousClass48N;
import X.AnonymousClass4HY;
import X.AnonymousClass4K2;
import X.AnonymousClass5UY;
import X.AnonymousClass66R;
import X.C106415Yx;
import X.C106715a2;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18330xA;
import X.C196211x;
import X.C39462Cb;
import X.C53602nM;
import X.C56982ss;
import X.C616131n;
import X.C64333Db;
import X.C79113w6;
import X.C79123w7;
import X.C80973z8;
import X.C822742y;
import X.C84814Du;
import X.C85494Gl;
import X.C88834as;
import X.C89644eZ;
import X.C95804uY;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class NewsletterAlertsActivity extends C89644eZ {
    public RecyclerView A00;
    public C39462Cb A01;
    public C53602nM A02;
    public C56982ss A03;
    public C196211x A04;
    public AnonymousClass48N A05;
    public C106715a2 A06;
    public AnonymousClass5UY A07;
    public AnonymousClass5UY A08;
    public boolean A09;
    public final AnonymousClass66R A0A;

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r0 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r0, this);
            C107695bk r1 = r0.A00;
            AnonymousClass1Ha.A23(r0, r1, r1, this);
            AnonymousClass1Ha.A24(r0, this);
            this.A03 = C64333Db.A39(r0);
            this.A01 = (C39462Cb) A0I.A1n.get();
            this.A05 = (AnonymousClass48N) A0I.A1o.get();
            this.A06 = C18280x3.A0Q(r1);
            this.A02 = C18280x3.A0L(r1);
        }
    }

    public NewsletterAlertsActivity(int i) {
        this.A09 = false;
        AnonymousClass4HY.A00(this, 90);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        A6N();
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A00 = (RecyclerView) C18290x4.A0N(this, R.id.channel_alert_item);
        this.A08 = AnonymousClass1Ha.A1p(this, R.id.alerts_list_loading_indicator_container);
        this.A07 = AnonymousClass1Ha.A1p(this, R.id.alerts_list_empty_results_container);
        C39462Cb r1 = this.A01;
        if (r1 != null) {
            C95804uY A002 = C106415Yx.A00(AnonymousClass0x7.A0l(this));
            C64333Db r0 = r1.A00.A03;
            C196211x r2 = new C196211x(C64333Db.A00(r0), C64333Db.A2t(r0), A002);
            this.A04 = r2;
            RecyclerView recyclerView = this.A00;
            if (recyclerView == null) {
                throw C18270x1.A0S("recyclerView");
            }
            recyclerView.setAdapter(r2);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 == null) {
                throw C18270x1.A0S("recyclerView");
            }
            C18270x1.A0u(recyclerView2);
            AnonymousClass5UY r02 = this.A08;
            if (r02 == null) {
                throw C18270x1.A0S("loadingIndicator");
            }
            View A042 = r02.A04();
            C162457s7.A0D(A042);
            A042.setVisibility(0);
            AnonymousClass66R r3 = this.A0A;
            AnonymousClass4K2.A00(this, ((NewsletterAlertsViewModel) r3.getValue()).A00, new C822742y(this), 164);
            NewsletterAlertsViewModel newsletterAlertsViewModel = (NewsletterAlertsViewModel) r3.getValue();
            C616131n.A02((C85494Gl) null, new NewsletterAlertsViewModel$refreshAlerts$1(newsletterAlertsViewModel, (C84814Du) null), AnonymousClass0IV.A00(newsletterAlertsViewModel), (AnonymousClass20D) null, 3);
            return;
        }
        throw C18270x1.A0S("newsletterAlertsAdapterFactory");
    }

    public NewsletterAlertsActivity() {
        this(0);
        this.A0A = C18330xA.A02(new C79113w6(this), new C79123w7(this), new C80973z8(this), AnonymousClass0x9.A1E(NewsletterAlertsViewModel.class));
    }
}
