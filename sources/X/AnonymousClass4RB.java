package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.4RB  reason: invalid class name */
public abstract class AnonymousClass4RB extends LinearLayout implements AnonymousClass4GJ {
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

    public AnonymousClass4RB(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            C93364oQ r2 = (C93364oQ) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A05 = C64333Db.A4B(r1);
            r2.A04 = C64333Db.A2t(r1);
            r2.A06 = (AnonymousClass5QQ) r1.A00.A85.get();
        }
    }
}
