package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

/* renamed from: X.4ND  reason: invalid class name */
public abstract class AnonymousClass4ND extends SurfaceView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public AnonymousClass4ND(Context context) {
        super(context, (AttributeSet) null, 0);
        A06();
    }

    public void A06() {
        if (!this.A01) {
            this.A01 = true;
            C132906gD r2 = (C132906gD) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            C160957oj.A00(r2, C64333Db.A2o(r1));
            C160957oj.A02(r2, (C49632gq) r1.A00.A2E.get());
            C160957oj.A03(r2, C64333Db.A74(r1));
            C160957oj.A01(r2, C64333Db.A2r(r1));
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
