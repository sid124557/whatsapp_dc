package X;

/* renamed from: X.2aH  reason: invalid class name and case insensitive filesystem */
public class C45602aH {
    public final C51102jH A00 = new C51102jH();
    public final C51102jH A01 = new C51102jH();
    public final C51102jH A02 = new C51102jH();

    public boolean A00(C95814uZ r3, int i) {
        if ((i & 1) != 0 && this.A01.A02(r3)) {
            return true;
        }
        if ((i & 2) == 0 || !this.A02.A02(r3)) {
            return false;
        }
        return true;
    }
}
