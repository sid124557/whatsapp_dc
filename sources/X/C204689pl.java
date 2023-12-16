package X;

import android.content.Intent;

/* renamed from: X.9pl  reason: invalid class name and case insensitive filesystem */
public class C204689pl implements AnonymousClass64L {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C204689pl(C89644eZ r1, AnonymousClass49I r2, C196139aM r3, Object obj, int i) {
        this.A04 = i;
        this.A00 = r3;
        this.A02 = obj;
        this.A01 = r2;
        this.A03 = r1;
    }

    public boolean BM3(Intent intent, int i, int i2) {
        C69263Wi r3;
        Runnable r2;
        int i3 = this.A04;
        C196139aM r1 = (C196139aM) this.A00;
        if (i3 != 0) {
            if (i != 1002) {
                return false;
            }
            r3 = r1.A00;
            r2 = new C200189hv((AnonymousClass49I) this.A01, this.A02);
        } else if (i != 1001) {
            return false;
        } else {
            r3 = r1.A00;
            r2 = new C200149hr((AnonymousClass49I) this.A01, this.A02);
        }
        r3.BkS(r2);
        ((C89644eZ) this.A03).A6x(this);
        return true;
    }
}
