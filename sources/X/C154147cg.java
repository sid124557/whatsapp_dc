package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.7cg  reason: invalid class name and case insensitive filesystem */
public class C154147cg {
    public static Object A00(C185628tz r3) {
        C142156wj Bgg = r3.Bgg();
        C142156wj r1 = C142156wj.START_OBJECT;
        if (Bgg == r1) {
            if (r3.Bgg() != r1) {
                return null;
            }
            HashMap A0t = AnonymousClass001.A0t();
            while (r3.BLY() != C142156wj.END_OBJECT) {
                String Bgf = r3.Bgf();
                r3.BLY();
                A0t.put(Bgf, A00(r3));
            }
            return A0t;
        } else if (Bgg == C142156wj.START_ARRAY) {
            ArrayList A0s = AnonymousClass001.A0s();
            while (r3.BLY() != C142156wj.END_ARRAY) {
                A0s.add(A00(r3));
            }
            return A0s;
        } else if (Bgg == C142156wj.NULL) {
            return null;
        } else {
            if (Bgg == C142156wj.BOOLEAN) {
                return Boolean.valueOf(r3.Bgh().Ay6());
            }
            if (Bgg == C142156wj.NUMBER) {
                Number BLl = r3.Bgh().BLl();
                if (BLl instanceof Long) {
                    return Long.valueOf(BLl.longValue());
                }
                return Double.valueOf(BLl.doubleValue());
            } else if (Bgg == C142156wj.STRING) {
                return r3.Bgh().BqG();
            } else {
                throw AnonymousClass000.A0H(Bgg, "unsupported token type ", AnonymousClass001.A0o());
            }
        }
    }
}
