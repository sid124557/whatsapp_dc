package X;

/* renamed from: X.4j1  reason: invalid class name and case insensitive filesystem */
public final class C91164j1 extends AnonymousClass5AG {
    public final C118255tF A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C91164j1) {
                C91164j1 r5 = (C91164j1) obj;
                if (!(C162457s7.A0P(this.A00, r5.A00) && this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass000.A07(this.A00) * 31, this.A02), this.A01);
    }

    public C91164j1(C118255tF r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Disabled(error=");
        A0o.append(this.A00);
        A0o.append(", shouldSkipErrorHandling=");
        A0o.append(this.A02);
        A0o.append(", shouldClearLoadingState=");
        return C18260x0.A0A(A0o, this.A01);
    }

    public C91164j1() {
        this((C118255tF) null, false, false);
    }
}
