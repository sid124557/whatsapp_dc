package X;

/* renamed from: X.4JH  reason: invalid class name */
public class AnonymousClass4JH implements C837949u {
    public final int A00;

    public AnonymousClass4JH(int i) {
        this.A00 = i;
    }

    public final boolean B23(String str) {
        switch (this.A00) {
            case 1:
                return true;
            case 3:
                return C58582vU.A00(AnonymousClass35M.A00(str));
            case 4:
                if (C58582vU.A00(AnonymousClass35M.A00(str)) || "star".equals(AnonymousClass35M.A00(str))) {
                    return true;
                }
                return false;
            default:
                return !C58582vU.A00(AnonymousClass35M.A00(str));
        }
    }
}
