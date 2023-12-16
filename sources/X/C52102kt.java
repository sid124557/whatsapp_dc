package X;

/* renamed from: X.2kt  reason: invalid class name and case insensitive filesystem */
public final class C52102kt {
    public final int A00;
    public final C108895dj A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52102kt) {
                C52102kt r5 = (C52102kt) obj;
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

    public C52102kt(C108895dj r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("XFamilyCrosspostEligibilityCheckPayload(enforcedEncryptedUniqueId=");
        A0o.append(this.A01);
        A0o.append(", expTimeSec=");
        return C18260x0.A09(A0o, this.A00);
    }
}
