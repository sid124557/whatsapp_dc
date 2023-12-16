package X;

import android.graphics.Color;

/* renamed from: X.0gL  reason: invalid class name and case insensitive filesystem */
public class C09530gL implements C16250si {
    public static final C09530gL A00 = new C09530gL();

    public /* bridge */ /* synthetic */ Object BgT(C10470hz r15, float f) {
        double d;
        boolean z = false;
        if (r15.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
            z = true;
            r15.A0G();
        }
        double A08 = r15.A08();
        double A082 = r15.A08();
        double A083 = r15.A08();
        if (r15.A0C() == AnonymousClass0G4.NUMBER) {
            d = r15.A08();
        } else {
            d = 1.0d;
        }
        if (z) {
            r15.A0I();
        }
        if (A08 <= 1.0d && A082 <= 1.0d && A083 <= 1.0d) {
            A08 *= 255.0d;
            A082 *= 255.0d;
            A083 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) A08, (int) A082, (int) A083));
    }
}
