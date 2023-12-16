package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4PY  reason: invalid class name */
public abstract class AnonymousClass4PY extends FrameLayout implements AnonymousClass4GJ {
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

    public AnonymousClass4PY(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C97594yo r2 = (C97594yo) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A01 = C64333Db.A2t(r1);
            r2.A00 = C86624Kv.A0Q(r1);
        }
    }
}
