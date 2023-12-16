package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.0z9  reason: invalid class name and case insensitive filesystem */
public abstract class C19290z9 extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public C19290z9(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1NN r2 = (AnonymousClass1NN) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A01 = C64333Db.A2p(r1);
            r2.A00 = C64333Db.A04(r1);
            r2.A05 = (C45942ap) r1.A00.A44.get();
            r2.A03 = C64333Db.A3o(r1);
            r2.A04 = (C54922pV) r1.A9G.get();
            r2.A02 = C64333Db.A2t(r1);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
