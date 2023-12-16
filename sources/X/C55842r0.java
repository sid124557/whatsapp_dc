package X;

/* renamed from: X.2r0  reason: invalid class name and case insensitive filesystem */
public final class C55842r0 {
    public Boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C41512Kn A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C55842r0) {
                C55842r0 r5 = (C55842r0) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A01 == r5.A01 && C162457s7.A0P(this.A04, r5.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int i = this.A02;
        if (i == 80) {
            return 3;
        }
        if (i == 443) {
            return 2;
        }
        if (i != 5222) {
            return 4;
        }
        return 1;
    }

    public final Integer A01() {
        C41512Kn r0 = this.A04;
        if (r0 == null) {
            return null;
        }
        int i = r0.A00;
        int i2 = 1;
        if (Integer.valueOf(i) == null) {
            return null;
        }
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (!(i == 3 || i == 4)) {
                        return null;
                    }
                }
            }
            return Integer.valueOf(i3);
        }
        return Integer.valueOf(i2);
    }

    public int hashCode() {
        return (((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + AnonymousClass000.A07(this.A04);
    }

    public C55842r0(C41512Kn r1, int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = r1;
    }

    public final void A02(boolean z) {
        this.A00 = Boolean.valueOf(z);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConnectionMetadata(sessionId=");
        A0o.append(this.A03);
        A0o.append(", port=");
        A0o.append(this.A02);
        A0o.append(", connectionSequenceState=");
        A0o.append(this.A01);
        A0o.append(", dnsResolverInfo=");
        return C18260x0.A04(this.A04, A0o);
    }
}
