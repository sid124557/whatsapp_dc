package X;

/* renamed from: X.8Zj  reason: invalid class name and case insensitive filesystem */
public final class C175698Zj extends AnonymousClass8Ls {
    public static final C175698Zj A00 = new C175698Zj(1, 0);

    public C175698Zj(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C175698Zj)) {
            return false;
        }
        if (A01() && ((AnonymousClass8Ls) obj).A01()) {
            return true;
        }
        AnonymousClass8Ls r3 = (AnonymousClass8Ls) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (A01()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append("..");
        return AnonymousClass000.A0h(A0o, this.A01);
    }
}
