package X;

/* renamed from: X.4zM  reason: invalid class name and case insensitive filesystem */
public final class C97854zM extends C156137g5 {
    public final AnonymousClass5ZO A00;
    public final AnonymousClass4GP A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97854zM) {
                C97854zM r5 = (C97854zM) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A02 != r5.A02 || this.A03 != r5.A03 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C97854zM(AnonymousClass5ZO r2, AnonymousClass4GP r3, boolean z, boolean z2) {
        super(r2, 31);
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A00), this.A02), this.A03));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BusinessSearchLocationHeaderItem(data=");
        A0o.append(this.A00);
        A0o.append(", isInternalOnly=");
        A0o.append(this.A02);
        A0o.append(", showMyLocationButton=");
        A0o.append(this.A03);
        A0o.append(", myLocationButtonClick=");
        return C18260x0.A04(this.A01, A0o);
    }
}
