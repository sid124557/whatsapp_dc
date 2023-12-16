package X;

/* renamed from: X.5Sq  reason: invalid class name and case insensitive filesystem */
public final class C104865Sq {
    public final AnonymousClass7Y0 A00;
    public final C150477Qw A01;
    public final C150477Qw A02;
    public final C150477Qw A03;
    public final String A04;
    public final boolean A05;

    public C104865Sq(AnonymousClass7Y0 r2, C150477Qw r3, C150477Qw r4, C150477Qw r5, String str, boolean z) {
        C162457s7.A0J(str, 1);
        this.A04 = str;
        this.A05 = z;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104865Sq) {
                C104865Sq r5 = (C104865Sq) obj;
                if (!C162457s7.A0P(this.A04, r5.A04) || this.A05 != r5.A05 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A00, AnonymousClass0x2.A01((C18310x6.A09(this.A04) + 1237) * 31, this.A05)))));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PostcodeChangeBottomSheetUiState(postcode=");
        A0o.append(this.A04);
        A0o.append(", selectAllText=");
        A0o.append(false);
        A0o.append(", hasError=");
        A0o.append(this.A05);
        A0o.append(", privacyMessage=");
        A0o.append(this.A00);
        A0o.append(", headerText=");
        A0o.append(this.A02);
        A0o.append(", messageText=");
        A0o.append(this.A03);
        A0o.append(", errorText=");
        return C18260x0.A04(this.A01, A0o);
    }
}
