package X;

/* renamed from: X.7Y9  reason: invalid class name */
public final class AnonymousClass7Y9 {
    public final int A00;
    public final C998558l A01;

    public AnonymousClass7Y9(C998558l r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Y9) {
                AnonymousClass7Y9 r5 = (AnonymousClass7Y9) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserProblem(userProblemReason=");
        A0o.append(this.A01);
        A0o.append(", strResourceId=");
        return C18260x0.A09(A0o, this.A00);
    }
}
