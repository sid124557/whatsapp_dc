package X;

/* renamed from: X.2m7  reason: invalid class name and case insensitive filesystem */
public final class C52832m7 {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass3ZH A02;
    public final String A03;

    public C52832m7(AnonymousClass3ZH r2, String str, boolean z, boolean z2) {
        C162457s7.A0J(str, 1);
        this.A03 = str;
        this.A01 = z;
        this.A00 = z2;
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52832m7) {
                C52832m7 r5 = (C52832m7) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18310x6.A09(this.A03), this.A01), this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AdhocParticipantItemRow(name=");
        A0o.append(this.A03);
        A0o.append(", isSelected=");
        A0o.append(this.A01);
        A0o.append(", isEnabled=");
        A0o.append(this.A00);
        A0o.append(", contact=");
        return C18260x0.A04(this.A02, A0o);
    }
}
