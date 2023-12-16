package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.0yw  reason: invalid class name and case insensitive filesystem */
public final class C19190yw extends FrameLayout implements AnonymousClass4GJ {
    public C111095hX A00;
    public AnonymousClass1VX A01;
    public C66433Lk A02;
    public C106715a2 A03;
    public C116855qy A04;
    public boolean A05;

    public C19190yw(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A01 = C64333Db.A4B(r1);
            this.A03 = C18280x3.A0Q(r1.A00);
            this.A00 = C64333Db.A00(r1);
            this.A02 = C64333Db.A8X(r1);
        }
        TextView A0F = C18280x3.A0F(View.inflate(context, R.layout.f8nameremoved, this), R.id.cag_info_tab_footer_text_view);
        A0F.setText(getLinkifier$community_consumerBeta().A05(A0F.getContext(), C71313bu.A00(this, 22), AnonymousClass002.A0F(context, "learn-more", new Object[1], 0, R.string.f11nameremoved), "learn-more"));
        C18270x1.A0q(A0F, getAbProps$community_consumerBeta());
    }

    public final void setAbProps$community_consumerBeta(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setActivityUtils$community_consumerBeta(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory$community_consumerBeta(C66433Lk r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier$community_consumerBeta(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps$community_consumerBeta() {
        AnonymousClass1VX r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C111095hX getActivityUtils$community_consumerBeta() {
        C111095hX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("activityUtils");
    }

    public final C66433Lk getFaqLinkFactory$community_consumerBeta() {
        C66433Lk r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("faqLinkFactory");
    }

    public final C106715a2 getLinkifier$community_consumerBeta() {
        C106715a2 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }
}
