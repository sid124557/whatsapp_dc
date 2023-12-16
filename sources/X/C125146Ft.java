package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: X.6Ft  reason: invalid class name and case insensitive filesystem */
public abstract class C125146Ft extends RelativeLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass4vO) this).A00 = (AnonymousClass5Y0) ((C88864av) ((C111685iW) generatedComponent())).A0K.A8o.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C125146Ft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
