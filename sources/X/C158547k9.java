package X;

/* renamed from: X.7k9  reason: invalid class name and case insensitive filesystem */
public final class C158547k9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158547k9) {
                C158547k9 r5 = (C158547k9) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public C158547k9(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Margins(left=");
        A0o.append(this.A01);
        A0o.append(", top=");
        A0o.append(this.A03);
        A0o.append(", right=");
        A0o.append(this.A02);
        A0o.append(", bottom=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C158547k9() {
        this(0, 0, 0, 0);
    }
}
