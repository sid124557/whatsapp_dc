package X;

/* renamed from: X.4zH  reason: invalid class name and case insensitive filesystem */
public final class C97804zH extends C156137g5 {
    public final int A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97804zH) {
                C97804zH r5 = (C97804zH) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A01) * 31) + this.A00;
    }

    public C97804zH(Object obj, int i) {
        super(obj, i);
        this.A01 = obj;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchItem(value=");
        A0o.append(this.A01);
        A0o.append(", viewType=");
        return C18260x0.A09(A0o, this.A00);
    }
}
