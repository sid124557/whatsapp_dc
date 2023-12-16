package X;

import android.content.Intent;

/* renamed from: X.9pm  reason: invalid class name and case insensitive filesystem */
public class C204699pm implements AnonymousClass64L {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C204699pm(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public boolean BM3(Intent intent, int i, int i2) {
        AnonymousClass9JJ r0;
        int i3 = this.A03;
        C89644eZ r02 = (C89644eZ) this.A02;
        if (i3 != 0) {
            r02.A6x(this);
            if (i != 1) {
                return false;
            }
            AnonymousClass7SE r1 = (AnonymousClass7SE) this.A01;
            if (i2 == -1) {
                r0 = AnonymousClass9JJ.OK;
            } else if (i2 != 0) {
                r0 = AnonymousClass9JJ.ERROR;
            } else {
                r0 = AnonymousClass9JJ.CANCELLED;
            }
            r1.A00(r0);
        } else {
            r02.A6x(this);
            boolean z = false;
            if (i != 30) {
                return false;
            }
            AnonymousClass49H r12 = (AnonymousClass49H) this.A01;
            if (i2 == -1) {
                z = true;
            }
            r12.BaR(z);
        }
        return true;
    }
}
