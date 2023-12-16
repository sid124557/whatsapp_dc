package X;

/* renamed from: X.2YS  reason: invalid class name */
public class AnonymousClass2YS {
    public final C56612sH A00;
    public final C55812qx A01;

    public AnonymousClass2YS(C56612sH r1, C55812qx r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00(AnonymousClass5LM r8) {
        if (System.currentTimeMillis() - r8.A04 >= 86400000) {
            r8.A04 = System.currentTimeMillis();
            r8.A01 = 1;
        } else {
            int i = r8.A01;
            if (i >= 15) {
                return false;
            }
            r8.A01 = i + 1;
        }
        this.A01.A03(r8);
        return true;
    }
}
