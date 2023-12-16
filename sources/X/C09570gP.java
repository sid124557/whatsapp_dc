package X;

import android.graphics.PointF;

/* renamed from: X.0gP  reason: invalid class name and case insensitive filesystem */
public class C09570gP implements C16250si {
    public static final C09570gP A00 = new C09570gP();

    public /* bridge */ /* synthetic */ Object BgT(C10470hz r4, float f) {
        AnonymousClass0G4 A0C = r4.A0C();
        if (A0C == AnonymousClass0G4.BEGIN_ARRAY || A0C == AnonymousClass0G4.BEGIN_OBJECT) {
            return AnonymousClass0X5.A02(r4, f);
        }
        if (A0C == AnonymousClass0G4.NUMBER) {
            PointF pointF = new PointF(C10470hz.A03(r4) * f, C10470hz.A03(r4) * f);
            while (r4.A0N()) {
                r4.A0L();
            }
            return pointF;
        }
        throw AnonymousClass000.A0E(A0C, "Cannot convert json to point. Next token is ", AnonymousClass001.A0o());
    }
}
