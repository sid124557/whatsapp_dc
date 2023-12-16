package X;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.4Pi  reason: invalid class name and case insensitive filesystem */
public abstract class C87354Pi extends FrameLayout implements AnonymousClass4GJ {
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

    public C87354Pi(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C94054pm r2 = (C94054pm) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A0H = C64333Db.A4B(r1);
            r2.A0I = C86614Ku.A0o(r1);
            r2.A0G = C64333Db.A2o(r1);
        }
    }
}
