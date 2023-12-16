package X;

/* renamed from: X.305  reason: invalid class name */
public final class AnonymousClass305 {
    public final C50772ik A00;
    public final C53392n1 A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass305) {
                AnonymousClass305 r5 = (AnonymousClass305) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A01, AnonymousClass0x2.A07(this.A03, C18310x6.A09(this.A02)))) + 1231;
    }

    public AnonymousClass305(C50772ik r1, C53392n1 r2, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MaskEffect(identifier=");
        A0o.append("1001");
        A0o.append(", name=");
        A0o.append(this.A03);
        A0o.append(", bestInstance=");
        A0o.append(this.A01);
        A0o.append(", thumbnail=");
        A0o.append(this.A00);
        A0o.append(", isPersonalizedAvatar=");
        return C18260x0.A0A(A0o, true);
    }
}
