package X;

/* renamed from: X.7jC  reason: invalid class name and case insensitive filesystem */
public final class C157957jC {
    public static final C157957jC A01 = new C157957jC(false);
    public final boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C157957jC.class == obj.getClass() && this.A00 == ((C157957jC) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        return this.A00 ^ true ? 1 : 0;
    }

    public C157957jC(boolean z) {
        this.A00 = z;
    }
}
