package X;

/* renamed from: X.7i7  reason: invalid class name and case insensitive filesystem */
public class C157327i7 {
    public final int A00;
    public final String A01;

    public boolean A00(int i) {
        boolean z = this instanceof C137816pJ;
        int i2 = this.A00;
        if (!z) {
            return AnonymousClass000.A1U(i, i2);
        }
        if (i < i2 || i >= i2 + 4) {
            return false;
        }
        return true;
    }

    public C157327i7(AnonymousClass8J3 r2, int i) {
        this.A00 = i;
        this.A01 = r2.getId();
    }

    public C157327i7(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
