package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0VP  reason: invalid class name */
public class AnonymousClass0VP {
    public static AnonymousClass0T2 A00 = AnonymousClass0T2.A00("k");

    public static List A00(AnonymousClass0QL r8, C16250si r9, C10470hz r10, float f, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        C10470hz r5 = r10;
        AnonymousClass0QL r3 = r8;
        if (r10.A0C() == AnonymousClass0G4.STRING) {
            AnonymousClass0QL.A01(r8, "Lottie doesn't support expressions.");
            return A0s;
        }
        r10.A0H();
        while (r10.A0N()) {
            if (r10.A0A(A00) != 0) {
                r10.A0L();
            } else {
                C16250si r4 = r9;
                float f2 = f;
                if (r10.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
                    r10.A0G();
                    if (r10.A0C() == AnonymousClass0G4.NUMBER) {
                        A0s.add(new C06230Wt(r9.BgT(r10, f)));
                    } else {
                        while (r10.A0N()) {
                            A0s.add(C06140Wk.A01(r3, r4, r5, f2, true, z));
                        }
                    }
                    r10.A0I();
                } else {
                    A0s.add(new C06230Wt(r9.BgT(r10, f)));
                }
            }
        }
        r10.A0J();
        A01(A0s);
        return A0s;
    }

    public static void A01(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C06230Wt A0b = AnonymousClass001.A0b(list, i2);
            i2++;
            C06230Wt A0b2 = AnonymousClass001.A0b(list, i2);
            A0b.A08 = Float.valueOf(A0b2.A0A);
            if (A0b.A09 == null && (obj = A0b2.A0F) != null) {
                A0b.A09 = obj;
                if (A0b instanceof C01710Bx) {
                    ((C01710Bx) A0b).A04();
                }
            }
        }
        C06230Wt A0b3 = AnonymousClass001.A0b(list, i);
        if ((A0b3.A0F == null || A0b3.A09 == null) && list.size() > 1) {
            list.remove(A0b3);
        }
    }
}
