package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.71g  reason: invalid class name and case insensitive filesystem */
public class C1443671g {
    public static void A00(C180538lE r3, C157277i2 r4, File file) {
        ArrayList A0v = C18300x5.A0v(r4.A01);
        if (!A0v.isEmpty()) {
            Iterator it = A0v.iterator();
            while (it.hasNext()) {
                C150297Qb r1 = (C150297Qb) it.next();
                C180528lD Azh = r3.Azh(r1);
                if (Azh != null) {
                    Azh.BXh(r4, r1, file);
                }
            }
        }
    }
}
