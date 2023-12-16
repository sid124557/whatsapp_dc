package X;

/* renamed from: X.0d8  reason: invalid class name and case insensitive filesystem */
public abstract class C07980d8 implements C15770ru {
    public final C15780rv A00;

    public abstract boolean A00();

    public boolean BIl(CharSequence charSequence, int i, int i2) {
        if (i2 < 0 || charSequence.length() - i2 < 0) {
            throw new IllegalArgumentException();
        }
        C15780rv r0 = this.A00;
        if (r0 != null) {
            int Aym = r0.Aym(charSequence, 0, i2);
            if (Aym == 0) {
                return true;
            }
            if (Aym == 1) {
                return false;
            }
        }
        return A00();
    }

    public C07980d8(C15780rv r1) {
        this.A00 = r1;
    }
}
