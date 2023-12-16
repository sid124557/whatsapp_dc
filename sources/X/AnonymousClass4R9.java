package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.4R9  reason: invalid class name */
public final class AnonymousClass4R9 extends LinearLayout implements AnonymousClass4GJ {
    public C111095hX A00;
    public AnonymousClass1VX A01;
    public C27991fJ A02;
    public C116855qy A03;
    public boolean A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final AnonymousClass5UY A08;

    public final void setAbProps$community_consumerBeta(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setActivityUtils$community_consumerBeta(C111095hX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A03;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A03 = r0;
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

    public final void setUpClickListeners(C109665ez r2, C109665ez r3) {
        this.A05.setOnClickListener(r2);
        this.A06.setOnClickListener(r3);
    }

    public AnonymousClass4R9(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A00 = C64333Db.A00(A002);
            this.A01 = C64333Db.A4B(A002);
        }
        Activity A003 = C111095hX.A00(context);
        View inflate = View.inflate(getContext(), R.layout.f8nameremoved, this);
        C162457s7.A0D(inflate);
        this.A07 = inflate;
        this.A05 = C18280x3.A0E(inflate, R.id.edit_community_info_btn);
        this.A06 = C18280x3.A0E(inflate, R.id.manage_groups_btn);
        this.A08 = C18290x4.A0X(this, R.id.community_settings_button);
        setUpClickListeners(new AnonymousClass543(this, 36, A003), new AnonymousClass543(this, 37, context));
    }
}
