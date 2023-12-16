package X;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: X.4Ry  reason: invalid class name */
public abstract class AnonymousClass4Ry extends RelativeLayout implements AnonymousClass4GJ {
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

    public AnonymousClass4Ry(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C94074po r2 = (C94074po) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A05 = C64333Db.A4B(r1);
            r2.A03 = C64333Db.A2o(r1);
            r2.A04 = C64333Db.A2t(r1);
        }
    }
}
