package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.4Qs  reason: invalid class name and case insensitive filesystem */
public abstract class C87404Qs extends LinearLayout implements AnonymousClass4GJ {
    public C116855qy A00;

    public void A01() {
        C93064np r3 = (C93064np) this;
        if (!r3.A07) {
            r3.A07 = true;
            C88864av r1 = (C88864av) ((C111685iW) r3.generatedComponent());
            r3.A01 = new AnonymousClass5QT();
            C88834as r2 = r1.A0I;
            C112975kg r0 = new C112975kg();
            r2.ADd(r0);
            r3.A00 = r0;
            C64333Db r12 = r1.A0K;
            r3.A05 = C64333Db.A4B(r12);
            C113245l7 r02 = new C113245l7();
            r2.ADi(r02);
            r3.A03 = r02;
            r3.A06 = C107695bk.A25(r12.A00);
            r3.A02 = (AnonymousClass5M4) r2.A2A.get();
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

    public C87404Qs(Context context) {
        super(context);
        A01();
    }
}
