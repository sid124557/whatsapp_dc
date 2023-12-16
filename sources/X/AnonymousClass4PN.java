package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.community.CommunityStackView;

/* renamed from: X.4PN  reason: invalid class name */
public abstract class AnonymousClass4PN extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4PN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            CommunityStackView communityStackView = (CommunityStackView) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            communityStackView.A02 = C86604Kt.A0W(r1);
            communityStackView.A01 = C86614Ku.A0Q(r1);
        }
    }
}
