package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.community.SubgroupPileView;

/* renamed from: X.4Qn  reason: invalid class name and case insensitive filesystem */
public abstract class C87374Qn extends LinearLayout implements AnonymousClass4GJ {
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

    public C87374Qn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            SubgroupPileView subgroupPileView = (SubgroupPileView) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            subgroupPileView.A03 = C86604Kt.A0W(r1);
            subgroupPileView.A02 = C86614Ku.A0Q(r1);
        }
    }
}
