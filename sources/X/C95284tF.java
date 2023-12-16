package X;

import android.content.Context;

/* renamed from: X.4tF  reason: invalid class name and case insensitive filesystem */
public abstract class C95284tF extends C95294tG {
    public boolean A00;

    public void A00() {
        if (this instanceof C95274sy) {
            C95274sy r2 = (C95274sy) this;
            if (!r2.A09) {
                r2.A09 = true;
                C64333Db A002 = C88864av.A00(r2.generatedComponent());
                r2.A0A = (C106065Xm) A002.A00.A6m.get();
                r2.A09 = C64333Db.A2t(A002);
            }
        } else if (!this.A00) {
            this.A00 = true;
            AnonymousClass4t2 r22 = (AnonymousClass4t2) this;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r22.A0A = (C106065Xm) r1.A00.A6m.get();
            r22.A09 = C64333Db.A2t(r1);
        }
    }

    public C95284tF(Context context) {
        super(context);
        A00();
    }
}
