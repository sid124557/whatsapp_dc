package X;

/* renamed from: X.9TG  reason: invalid class name */
public final class AnonymousClass9TG {
    public C166557yt A00;
    public AnonymousClass99D A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9TG) {
                AnonymousClass9TG r5 = (AnonymousClass9TG) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A04 != r5.A04 || this.A05 != r5.A05 || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.A03;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        C166557yt r0 = this.A00;
        if (r0 != null) {
            i5 = r0.hashCode();
        }
        return i7 + i5;
    }

    public AnonymousClass9TG(C166557yt r1, AnonymousClass99D r2, String str, String str2, boolean z, boolean z2) {
        this.A01 = r2;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("IndiaUpiNonWaContactData(indiaUpiContactData=");
        A0o.append(this.A01);
        A0o.append(", isMerchant=");
        A0o.append(this.A04);
        A0o.append(", isVerifiedMerchant=");
        A0o.append(this.A05);
        A0o.append(", transactionType=");
        A0o.append(this.A03);
        A0o.append(", merchantCarrierCode=");
        A0o.append(this.A02);
        A0o.append(", upiNumber=");
        return C18260x0.A04(this.A00, A0o);
    }
}
