package X;

import java.util.ArrayList;

/* renamed from: X.0VN  reason: invalid class name */
public class AnonymousClass0VN {
    public static final AnonymousClass0T2 A00 = AnonymousClass0T2.A00("k", "x", "y");

    public static C09380g6 A00(AnonymousClass0QL r9, C10470hz r10) {
        ArrayList A0s = AnonymousClass001.A0s();
        C10470hz r5 = r10;
        if (r10.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
            r10.A0G();
            while (r10.A0N()) {
                boolean A1Y = AnonymousClass000.A1Y(r10.A0C(), AnonymousClass0G4.BEGIN_OBJECT);
                AnonymousClass0QL r3 = r9;
                A0s.add(new C01710Bx(r9, C06140Wk.A01(r3, C09560gO.A00, r5, AnonymousClass0Y0.A00(), A1Y, false)));
            }
            r10.A0I();
            AnonymousClass0VP.A01(A0s);
        } else {
            A0s.add(new C06230Wt(AnonymousClass0X5.A02(r10, AnonymousClass0Y0.A00())));
        }
        return new C09380g6(A0s);
    }

    public static C16890uC A01(AnonymousClass0QL r7, C10470hz r8) {
        r8.A0H();
        C09380g6 r6 = null;
        C01610Bn r4 = null;
        C01610Bn r3 = null;
        boolean z = false;
        while (r8.A0C() != AnonymousClass0G4.END_OBJECT) {
            int A0A = r8.A0A(A00);
            if (A0A != 0) {
                if (A0A != 1) {
                    if (A0A != 2) {
                        r8.A0K();
                        r8.A0L();
                    } else if (r8.A0C() != AnonymousClass0G4.STRING) {
                        r3 = AnonymousClass0VA.A01(r7, r8, true);
                    }
                } else if (r8.A0C() != AnonymousClass0G4.STRING) {
                    r4 = AnonymousClass0VA.A01(r7, r8, true);
                }
                r8.A0L();
                z = true;
            } else {
                r6 = A00(r7, r8);
            }
        }
        r8.A0J();
        if (z) {
            AnonymousClass0QL.A01(r7, "Lottie doesn't support expressions.");
        }
        if (r6 != null) {
            return r6;
        }
        return new C09370g5(r4, r3);
    }
}
