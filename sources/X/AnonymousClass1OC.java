package X;

/* renamed from: X.1OC  reason: invalid class name */
public final class AnonymousClass1OC extends AnonymousClass25O {
    public final int A00;
    public final int A01;
    public final C370320r A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1OC) {
                AnonymousClass1OC r5 = (AnonymousClass1OC) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public AnonymousClass1OC(C370320r r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CommunityAlmostFull(requestedCount=");
        A0o.append(this.A01);
        A0o.append(", actualCount=");
        A0o.append(this.A00);
        A0o.append(", attemptedAction=");
        return C18260x0.A04(this.A02, A0o);
    }
}
