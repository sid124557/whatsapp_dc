package X;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0g6  reason: invalid class name and case insensitive filesystem */
public class C09380g6 implements C16890uC {
    public final List A00;

    public C04850Qx B0O() {
        List list = this.A00;
        if (AnonymousClass001.A0b(list, 0).A03()) {
            return new C01550Bh(list);
        }
        return new C01510Bd(list);
    }

    public List B8y() {
        return this.A00;
    }

    public boolean BJ2() {
        List list = this.A00;
        if (list.size() != 1 || !AnonymousClass001.A0b(list, 0).A03()) {
            return false;
        }
        return true;
    }

    public C09380g6(List list) {
        this.A00 = list;
    }

    public C09380g6() {
        this.A00 = Collections.singletonList(new C06230Wt(new PointF(0.0f, 0.0f)));
    }
}
