package X;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0X5  reason: invalid class name */
public class AnonymousClass0X5 {
    public static final AnonymousClass0T2 A00 = AnonymousClass0T2.A00("x", "y");

    public static float A00(C10470hz r3) {
        AnonymousClass0G4 A0C = r3.A0C();
        int ordinal = A0C.ordinal();
        if (ordinal == 6) {
            return C10470hz.A03(r3);
        }
        if (ordinal == 0) {
            r3.A0G();
            float A03 = C10470hz.A03(r3);
            while (r3.A0N()) {
                r3.A0L();
            }
            r3.A0I();
            return A03;
        }
        throw AnonymousClass000.A0E(A0C, "Unknown value for token of type ", AnonymousClass001.A0o());
    }

    public static int A01(C10470hz r8) {
        r8.A0G();
        int A08 = (int) (r8.A08() * 255.0d);
        int A082 = (int) (r8.A08() * 255.0d);
        int A083 = (int) (r8.A08() * 255.0d);
        while (r8.A0N()) {
            r8.A0L();
        }
        r8.A0I();
        return Color.argb(255, A08, A082, A083);
    }

    public static PointF A02(C10470hz r4, float f) {
        float f2;
        float f3;
        int ordinal = r4.A0C().ordinal();
        if (ordinal != 6) {
            if (ordinal == 0) {
                r4.A0G();
                f2 = C10470hz.A03(r4);
                f3 = C10470hz.A03(r4);
                while (r4.A0C() != AnonymousClass0G4.END_ARRAY) {
                    r4.A0L();
                }
                r4.A0I();
            } else if (ordinal == 2) {
                r4.A0H();
                f2 = 0.0f;
                f3 = 0.0f;
                while (r4.A0N()) {
                    int A0A = r4.A0A(A00);
                    if (A0A == 0) {
                        f2 = A00(r4);
                    } else if (A0A != 1) {
                        r4.A0K();
                        r4.A0L();
                    } else {
                        f3 = A00(r4);
                    }
                }
                r4.A0J();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C10470hz.A05(r4, "Unknown point starts with ", A0o);
                throw AnonymousClass001.A0c(A0o.toString());
            }
            return new PointF(f2 * f, f3 * f);
        }
        float A03 = C10470hz.A03(r4);
        float A032 = C10470hz.A03(r4);
        while (r4.A0N()) {
            r4.A0L();
        }
        return new PointF(A03 * f, A032 * f);
    }

    public static List A03(C10470hz r3, float f) {
        ArrayList A0s = AnonymousClass001.A0s();
        r3.A0G();
        while (r3.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
            r3.A0G();
            A0s.add(A02(r3, f));
            r3.A0I();
        }
        r3.A0I();
        return A0s;
    }
}
