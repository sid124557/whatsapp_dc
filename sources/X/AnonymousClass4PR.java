package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4PR  reason: invalid class name */
public abstract class AnonymousClass4PR extends FrameLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A01() {
        if (this instanceof C93404oV) {
            C93404oV r2 = (C93404oV) this;
            if (!r2.A00) {
                r2.A00 = true;
                C93384oT r22 = (C93384oT) r2;
                C64333Db r1 = ((C88864av) ((C111685iW) r2.generatedComponent())).A0K;
                r22.A00 = C64333Db.A05(r1);
                r22.A00 = (C64393Dh) r1.AS1.get();
                r22.A01 = C86654Ky.A0e(r1);
                r22.A03 = C69723Yd.A00();
                return;
            }
            return;
        }
        C93394oU r23 = (C93394oU) this;
        if (!r23.A00) {
            r23.A00 = true;
            C93374oS r24 = (C93374oS) r23;
            C64333Db r12 = ((C88864av) ((C111685iW) r23.generatedComponent())).A0K;
            r24.A00 = C64333Db.A05(r12);
            r24.A00 = C64333Db.A4B(r12);
            r24.A01 = C86634Kw.A0m(r12);
            r24.A02 = C86654Ky.A0e(r12);
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

    public AnonymousClass4PR(Context context) {
        super(context);
        A01();
    }
}
