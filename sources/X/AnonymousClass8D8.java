package X;

/* renamed from: X.8D8  reason: invalid class name */
public class AnonymousClass8D8 implements C181458mn {
    public final C181458mn A00;

    public AnonymousClass8D8(C181458mn r1) {
        this.A00 = r1;
    }

    public boolean Bqb(AnonymousClass84O r9) {
        C160317nR A01 = C158977kt.A01();
        int i = r9.A03;
        int[] A002 = A01.A00(i);
        for (int A0R : A002) {
            for (AnonymousClass84O r1 : r9.A0R(A0R)) {
                if (r1 != null && this.A00.Bqb(r1)) {
                    return true;
                }
            }
        }
        int[] A012 = C158977kt.A01().A01(i);
        for (int A0J : A012) {
            AnonymousClass84O A0J2 = r9.A0K(A0J);
            if (A0J2 != null && this.A00.Bqb(A0J2)) {
                return true;
            }
        }
        return false;
    }
}
