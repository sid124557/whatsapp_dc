package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0Wg  reason: invalid class name and case insensitive filesystem */
public class C06100Wg {
    public static PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!AnonymousClass001.A1U(i ^ i2) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(C17360vP r3, AnonymousClass0WB r4, AnonymousClass0WB r5, List list, int i) {
        String name = r3.getName();
        if (r4.A01(name, i)) {
            AnonymousClass0WB r1 = new AnonymousClass0WB(r5);
            r1.A01.add(name);
            AnonymousClass0WB r0 = new AnonymousClass0WB(r1);
            r0.A00 = r3;
            list.add(r0);
        }
    }
}
