package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.94E  reason: invalid class name */
public abstract class AnonymousClass94E extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public AnonymousClass94E(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass9G2 r2 = (AnonymousClass9G2) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A00 = C64333Db.A2o(r1);
            r2.A02 = C1899593h.A0V(r1.A00);
            r2.A01 = C64333Db.A4B(r1);
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
}
