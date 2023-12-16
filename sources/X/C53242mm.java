package X;

import android.net.Uri;

/* renamed from: X.2mm  reason: invalid class name and case insensitive filesystem */
public final class C53242mm {
    public final Uri A00;
    public final C27981fH A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53242mm) {
                C53242mm r5 = (C53242mm) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && C162457s7.A0P(this.A00, r5.A00) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)), this.A03), this.A02), this.A04);
    }

    public C53242mm(Uri uri, C27981fH r2, boolean z, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A00 = uri;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PhoneNumberRequestData(jid=");
        A0o.append(this.A01);
        A0o.append(", learnMoreUri=");
        A0o.append(this.A00);
        A0o.append(", isPhoneNumberKnown=");
        A0o.append(this.A03);
        A0o.append(", isMyPhoneNumberShared=");
        A0o.append(this.A02);
        A0o.append(", wasPhoneNumberRequested=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
