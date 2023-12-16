package X;

import android.os.Bundle;

/* renamed from: X.0Gj  reason: invalid class name and case insensitive filesystem */
public class C02470Gj implements C16050sO {
    public Object A00;
    public final int A01;

    public C02470Gj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Bundle Bkk() {
        switch (this.A01) {
            case 0:
                return C004805c.A0M((C004805c) this.A00);
            case 1:
                Bundle A08 = AnonymousClass002.A08();
                ((C009707r) this.A00).A5e();
                return A08;
            case 2:
                return C003203q.A0B((C003203q) this.A00);
            case 3:
                return ((C08270df) this.A00).A08();
            default:
                return AnonymousClass0XV.A00((AnonymousClass0XV) this.A00);
        }
    }
}
