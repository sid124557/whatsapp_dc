package X;

/* renamed from: X.7iE  reason: invalid class name and case insensitive filesystem */
public class C157397iE {
    public static final C157397iE A02 = new C157397iE(C141436vZ.AUTO, 1.0E21f);
    public final float A00;
    public final C141436vZ A01;

    public String toString() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            return Float.toString(this.A00);
        }
        if (ordinal != 1) {
            return "auto";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        return AnonymousClass000.A0X("%", A0o);
    }

    public C157397iE(C141436vZ r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
