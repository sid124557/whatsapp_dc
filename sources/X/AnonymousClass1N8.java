package X;

/* renamed from: X.1N8  reason: invalid class name */
public final class AnonymousClass1N8 extends AnonymousClass25F {
    public final AnonymousClass3ZH A00;
    public final Integer A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass1N8(AnonymousClass3ZH r2, Integer num, String str, boolean z, boolean z2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A04 = z;
        this.A01 = num;
        this.A00 = r2;
        this.A03 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1N8) {
                AnonymousClass1N8 r5 = (AnonymousClass1N8) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || this.A04 != r5.A04 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A00, (AnonymousClass0x2.A01(C18310x6.A09(this.A02), this.A04) + AnonymousClass000.A07(this.A01)) * 31), this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Participant(name=");
        A0o.append(this.A02);
        A0o.append(", joined=");
        A0o.append(this.A04);
        A0o.append(", initiatorStringRes=");
        A0o.append(this.A01);
        A0o.append(", contact=");
        A0o.append(this.A00);
        A0o.append(", isMe=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
