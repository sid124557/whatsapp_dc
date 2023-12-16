package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4PS  reason: invalid class name */
public abstract class AnonymousClass4PS extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A00() {
        if (this instanceof C94034pk) {
            C94034pk r2 = (C94034pk) this;
            if (!r2.A03) {
                r2.A03 = true;
                C64333Db A002 = C88864av.A00(r2.generatedComponent());
                r2.A04 = C86614Ku.A0o(A002);
                r2.A00 = C64333Db.A2t(A002);
                return;
            }
            return;
        }
        C94044pl r22 = (C94044pl) this;
        if (!r22.A06) {
            r22.A06 = true;
            C64333Db A003 = C88864av.A00(r22.generatedComponent());
            r22.A04 = C86614Ku.A0o(A003);
            r22.A04 = C64333Db.A2q(A003);
            r22.A01 = C64333Db.A06(A003);
            r22.A02 = C64333Db.A26(A003);
            r22.A03 = C64333Db.A2o(A003);
            r22.A00 = C86604Kt.A0N(A003);
            r22.A05 = C64333Db.A2t(A003);
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

    public AnonymousClass4PS(Context context) {
        super(context);
        A00();
    }
}
