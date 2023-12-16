package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.community.CommunityMembersViewModel;

/* renamed from: X.4Rw  reason: invalid class name */
public final class AnonymousClass4Rw extends RelativeLayout implements AnonymousClass4GJ {
    public C1223163x A00;
    public CommunityMembersViewModel A01;
    public C27991fJ A02;
    public C27991fJ A03;
    public AnonymousClass4FS A04;
    public C116855qy A05;
    public boolean A06;
    public final View A07;
    public final AnonymousClass66R A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Rw(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        if (!this.A06) {
            this.A06 = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A04 = C64333Db.A8y(r1.A0K);
            this.A00 = (C1223163x) r1.A0I.A3T.get();
        }
        this.A08 = C154517dI.A01(new C119215wc(context));
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        this.A07 = inflate;
    }

    public final void setCommunityMembersViewModelFactory$community_consumerBeta(C1223163x r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setWaWorkers$community_consumerBeta(AnonymousClass4FS r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C89654ea getActivity() {
        return (C89654ea) this.A08.getValue();
    }

    public final C1223163x getCommunityMembersViewModelFactory$community_consumerBeta() {
        C1223163x r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("communityMembersViewModelFactory");
    }

    public final AnonymousClass4FS getWaWorkers$community_consumerBeta() {
        AnonymousClass4FS r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("waWorkers");
    }
}
