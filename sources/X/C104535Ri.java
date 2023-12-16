package X;

/* renamed from: X.5Ri  reason: invalid class name and case insensitive filesystem */
public final class C104535Ri {
    public final int A00;
    public final C30481mW A01;

    public C104535Ri(C30481mW r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104535Ri) {
                C104535Ri r5 = (C104535Ri) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
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
        A0o.append("PluginCarouselItem(message=");
        A0o.append(this.A01);
        A0o.append(", carouselCount=");
        return C18260x0.A09(A0o, this.A00);
    }
}
