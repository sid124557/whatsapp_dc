package X;

/* renamed from: X.8Ls  reason: invalid class name */
public class AnonymousClass8Ls implements Iterable, C834348j {
    public final int A00;
    public final int A01;
    public final int A02;

    /* renamed from: A00 */
    public C72013d2 iterator() {
        return new C72013d2(this.A00, this.A01, this.A02);
    }

    public boolean A01() {
        if (this instanceof C175698Zj) {
            return C86624Kv.A1W(this.A00, this.A01);
        }
        int i = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        if (i > 0) {
            if (i2 > i3) {
                return true;
            }
            return false;
        } else if (i2 < i3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8Ls)) {
            return false;
        }
        if (A01() && ((AnonymousClass8Ls) obj).A01()) {
            return true;
        }
        AnonymousClass8Ls r3 = (AnonymousClass8Ls) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01 && this.A02 == r3.A02) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        int i2 = this.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        int i3 = this.A00;
        if (i2 > 0) {
            A0o.append(i3);
            A0o.append("..");
            A0o.append(this.A01);
            A0o.append(" step ");
            i = 1;
        } else {
            A0o.append(i3);
            A0o.append(" downTo ");
            A0o.append(this.A01);
            A0o.append(" step ");
            i = -i2;
        }
        return AnonymousClass000.A0h(A0o, i);
    }

    public AnonymousClass8Ls(int i, int i2, int i3) {
        this.A00 = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + 1 : i4) - (i5 < 0 ? i5 + 1 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + 1 : i6;
            }
        } else if (i > i2) {
            int i7 = -i3;
            int i8 = i % i7;
            int i9 = i2 % i7;
            int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
            i2 += i10 < 0 ? i10 + i7 : i10;
        }
        this.A01 = i2;
        this.A02 = i3;
    }

    public int hashCode() {
        if (A01()) {
            return -1;
        }
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }
}
