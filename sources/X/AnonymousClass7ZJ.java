package X;

/* renamed from: X.7ZJ  reason: invalid class name */
public final class AnonymousClass7ZJ {
    public final AnonymousClass7YJ A00;
    public final C624134x A01;
    public final String A02;
    public final String A03;

    public AnonymousClass7ZJ(AnonymousClass7YJ r2, C624134x r3, String str, String str2) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZJ) {
                AnonymousClass7ZJ r5 = (AnonymousClass7ZJ) obj;
                if (!C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A01, AnonymousClass0x2.A07(this.A03, C18310x6.A09(this.A02))) + AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ContactReactionItem(key=");
        A0o.append(this.A02);
        A0o.append(", reaction=");
        A0o.append(this.A03);
        A0o.append(", message=");
        A0o.append(this.A01);
        A0o.append(", reactionSender=");
        return C18260x0.A04(this.A00, A0o);
    }
}
