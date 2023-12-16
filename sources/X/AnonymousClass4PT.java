package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4PT  reason: invalid class name */
public abstract class AnonymousClass4PT extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public void A01() {
        if (this instanceof C995055z) {
            C995055z r2 = (C995055z) this;
            if (!r2.A03) {
                r2.A03 = true;
                C64333Db A002 = C88864av.A00(r2.generatedComponent());
                r2.A0J = C86644Kx.A0b(A002);
                r2.A01 = (C1229766o) A002.A3A.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((AnonymousClass560) this).A0J = C86644Kx.A0b(((C88864av) ((C111685iW) generatedComponent())).A0K);
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

    public AnonymousClass4PT(Context context) {
        super(context);
        A01();
    }
}
