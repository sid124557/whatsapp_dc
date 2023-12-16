package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;

/* renamed from: X.4Pe  reason: invalid class name */
public final class AnonymousClass4Pe extends FrameLayout implements AnonymousClass4GJ {
    public C29041iB A00;
    public AnonymousClass1VX A01;
    public C95084sb A02;
    public C27991fJ A03;
    public C116855qy A04;
    public boolean A05;
    public final View A06;
    public final ListItemWithLeftIcon A07;
    public final AnonymousClass66R A08;

    public AnonymousClass4Pe(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = C64333Db.A4B(A002);
            this.A00 = C64333Db.A3S(A002);
        }
        this.A08 = C154517dI.A01(new C119315wm(context));
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        this.A06 = inflate;
        this.A07 = (ListItemWithLeftIcon) C18290x4.A0M(inflate, R.id.report_cag_button);
    }

    public final void setAbProps$community_consumerBeta(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setCompanionDeviceManager$community_consumerBeta(C29041iB r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
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

    public final C89654ea getActivity() {
        return (C89654ea) this.A08.getValue();
    }

    public final C29041iB getCompanionDeviceManager$community_consumerBeta() {
        C29041iB r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("companionDeviceManager");
    }
}
