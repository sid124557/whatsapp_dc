package X;

/* renamed from: X.7YJ  reason: invalid class name */
public final class AnonymousClass7YJ {
    public final AnonymousClass3ZH A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YJ) {
                AnonymousClass7YJ r5 = (AnonymousClass7YJ) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A00) * 31) + AnonymousClass0x7.A07(this.A01);
    }

    public AnonymousClass7YJ(AnonymousClass3ZH r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReactionSender(contact=");
        A0o.append(this.A00);
        A0o.append(", profilePicUrl=");
        return C18260x0.A07(this.A01, A0o);
    }
}
