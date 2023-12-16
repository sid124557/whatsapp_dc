package X;

/* renamed from: X.7kF  reason: invalid class name and case insensitive filesystem */
public final class C158597kF {
    public final AnonymousClass34V A00;
    public final AnonymousClass34V A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158597kF) {
                C158597kF r5 = (C158597kF) obj;
                if (!(this.A04 == r5.A04 && this.A02 == r5.A02 && C162457s7.A0P(this.A01, r5.A01) && C162457s7.A0P(this.A00, r5.A00) && this.A05 == r5.A05 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01((((AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A04), this.A02) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A00)) * 31, this.A05), this.A03);
    }

    public C158597kF(AnonymousClass34V r1, AnonymousClass34V r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A02 = z2;
        this.A01 = r1;
        this.A00 = r2;
        this.A05 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ViewState(isUpdateInProgress=");
        A0o.append(this.A04);
        A0o.append(", isDeregisterInProgress=");
        A0o.append(this.A02);
        A0o.append(", updateApiError=");
        A0o.append(this.A01);
        A0o.append(", deregisterApiError=");
        A0o.append(this.A00);
        A0o.append(", isUpdateSuccessful=");
        A0o.append(this.A05);
        A0o.append(", isDeregisterSuccessful=");
        return C18260x0.A0A(A0o, this.A03);
    }

    public C158597kF() {
        this((AnonymousClass34V) null, (AnonymousClass34V) null, false, false, false, false);
    }
}
