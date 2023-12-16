package X;

/* renamed from: X.7Yu  reason: invalid class name and case insensitive filesystem */
public final class C152417Yu {
    public final int A00;
    public final int A01;
    public final C633638y A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152417Yu) {
                C152417Yu r5 = (C152417Yu) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C162457s7.A0P(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C152417Yu(C633638y r1, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Args(disclosureId=");
        A0o.append(this.A00);
        A0o.append(", promptIndex=");
        A0o.append(this.A01);
        A0o.append(", prompt=");
        return C18260x0.A04(this.A02, A0o);
    }
}
